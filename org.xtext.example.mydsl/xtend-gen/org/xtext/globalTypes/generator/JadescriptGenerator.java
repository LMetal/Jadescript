package org.xtext.globalTypes.generator;

import com.google.common.base.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.globalTypes.myDsl.ChoiceL;
import org.xtext.globalTypes.myDsl.CloseRecursionL;
import org.xtext.globalTypes.myDsl.Definition;
import org.xtext.globalTypes.myDsl.EndProtocol;
import org.xtext.globalTypes.myDsl.ForEachL;
import org.xtext.globalTypes.myDsl.LocalProtocol;
import org.xtext.globalTypes.myDsl.MessageL;
import org.xtext.globalTypes.myDsl.MessageNormalL;
import org.xtext.globalTypes.myDsl.MessageQuitL;
import org.xtext.globalTypes.myDsl.MessageType;
import org.xtext.globalTypes.myDsl.ProtocolL;
import org.xtext.globalTypes.myDsl.ReceiverL;
import org.xtext.globalTypes.myDsl.RecursionL;
import org.xtext.globalTypes.myDsl.Role;
import org.xtext.globalTypes.myDsl.RoleOne;
import org.xtext.globalTypes.myDsl.RoleSet;
import org.xtext.globalTypes.myDsl.SenderL;

@SuppressWarnings("all")
public class JadescriptGenerator {
  private Queue<Map.Entry<String, Object>> behQueue;

  private HashMap<String, Integer> recNumAssociation;

  private String agentString;

  private String agentName;

  private PayloadNames payloadNames = new PayloadNames();

  private int behaviourNumber;

  private int recursionNumber;

  public CharSequence project(final LocalProtocol lp, final EList<Definition> definitions) {
    String _string = new String();
    this.agentString = _string;
    LinkedList<Map.Entry<String, Object>> _linkedList = new LinkedList<Map.Entry<String, Object>>();
    this.behQueue = _linkedList;
    HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
    this.recNumAssociation = _hashMap;
    this.payloadNames.init(definitions);
    this.agentString = this.printOntology(lp, definitions).toString();
    this.agentName = lp.getProjectedRole().getName();
    this.behaviourNumber = 0;
    this.recursionNumber = 0;
    CharSequence _createAgent = this.createAgent(lp);
    String _plus = ((this.agentString + "\n\n") + _createAgent);
    this.agentString = _plus;
    while ((this.behQueue.peek() != null)) {
      {
        Map.Entry<String, Object> entry = this.behQueue.poll();
        Object _value = entry.getValue();
        if ((_value instanceof ChoiceL)) {
          Object _value_1 = entry.getValue();
          CharSequence _createBehaviour = this.createBehaviour(entry.getKey(), this.agentName, ((ChoiceL) _value_1));
          String _plus_1 = ((this.agentString + "\n\n\n") + _createBehaviour);
          this.agentString = _plus_1;
        } else {
          Object _value_2 = entry.getValue();
          if ((_value_2 instanceof MessageL)) {
            Object _value_3 = entry.getValue();
            CharSequence _createBehaviour_1 = this.createBehaviour(entry.getKey(), this.agentName, ((MessageL) _value_3));
            String _plus_2 = ((this.agentString + "\n\n\n") + _createBehaviour_1);
            this.agentString = _plus_2;
          } else {
            Object _value_4 = entry.getValue();
            CharSequence _createWaitAgents = this.createWaitAgents(entry.getKey(), ((RoleSet) _value_4));
            String _plus_3 = ((this.agentString + "\n\n\n") + _createWaitAgents);
            this.agentString = _plus_3;
          }
        }
      }
    }
    return this.agentString;
  }

  public CharSequence printOntology(final LocalProtocol lp, final EList<Definition> definitions) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ontology ");
    String _protocolName = lp.getProtocolName();
    _builder.append(_protocolName);
    _builder.newLineIfNotEmpty();
    {
      for(final Definition d : definitions) {
        {
          String _type = d.getType();
          boolean _equals = Objects.equal(_type, "@proposition");
          if (_equals) {
            _builder.append("\t");
            _builder.append("proposition ");
            String _name = d.getName();
            _builder.append(_name, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _type_1 = d.getType();
          boolean _equals_1 = Objects.equal(_type_1, "@predicate");
          if (_equals_1) {
            _builder.append("\t");
            _builder.append("predicate ");
            String _name_1 = d.getName();
            _builder.append(_name_1, "\t");
            _builder.append("(");
            String _payload = this.payloadNames.getPayload(d);
            _builder.append(_payload, "\t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _type_2 = d.getType();
          boolean _equals_2 = Objects.equal(_type_2, "@action");
          if (_equals_2) {
            {
              int _length = ((Object[])Conversions.unwrapArray(d.getTypes(), Object.class)).length;
              boolean _notEquals = (_length != 0);
              if (_notEquals) {
                _builder.append("\t");
                _builder.append("action ");
                String _name_2 = d.getName();
                _builder.append(_name_2, "\t");
                _builder.append("(");
                String _payload_1 = this.payloadNames.getPayload(d);
                _builder.append(_payload_1, "\t");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("action ");
                String _name_3 = d.getName();
                _builder.append(_name_3, "\t");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }

  public CharSequence createAgent(final LocalProtocol lp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("agent ");
    String _name = lp.getProjectedRole().getName();
    _builder.append(_name);
    _builder.append(" uses ontology ");
    String _protocolName = lp.getProtocolName();
    _builder.append(_protocolName);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("property forCounter as integer = 0");
    _builder.newLine();
    _builder.append("\t");
    List<RoleSet> rolesetList = EcoreUtil2.<RoleSet>getAllContentsOfType(lp.getRoles(), RoleSet.class);
    _builder.newLineIfNotEmpty();
    {
      for(final RoleSet r : rolesetList) {
        {
          String _name_1 = r.getRef().getName();
          boolean _equals = Objects.equal(_name_1, this.agentName);
          if (_equals) {
            _builder.append("\t");
            _builder.append("property ");
            String _name_2 = r.getName();
            _builder.append(_name_2, "\t");
            _builder.append("List as list of aid");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    List<RoleOne> roleList = EcoreUtil2.<RoleOne>getAllContentsOfType(lp.getRoles(), RoleOne.class);
    _builder.newLineIfNotEmpty();
    {
      for(final RoleOne r_1 : roleList) {
        {
          String _name_3 = r_1.getName();
          boolean _notEquals = (!Objects.equal(_name_3, this.agentName));
          if (_notEquals) {
            _builder.append("\t");
            _builder.append("property ");
            String _name_4 = r_1.getName();
            _builder.append(_name_4, "\t");
            _builder.append(" as aid");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("on create do");
    _builder.newLine();
    {
      for(final RoleSet r_2 : rolesetList) {
        {
          boolean _equals_1 = lp.getProjectedRole().getName().equals(r_2.getRef().getName());
          if (_equals_1) {
            _builder.append("\t\t");
            _builder.append("activate WaitSubAgents");
            _builder.append(this.behaviourNumber, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            AbstractMap.SimpleEntry<String, Object> _simpleEntry = new AbstractMap.SimpleEntry<String, Object>(("WaitSubAgents" + Integer.valueOf(this.behaviourNumber)), r_2);
            boolean _add = this.behQueue.add(_simpleEntry);
            _builder.append(_add, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      Role _projectedRole = lp.getProjectedRole();
      if ((_projectedRole instanceof RoleSet)) {
        _builder.append("\t\t");
        _builder.append("activate ContactCoordinator");
        _builder.append(this.behaviourNumber, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        Role _projectedRole_1 = lp.getProjectedRole();
        AbstractMap.SimpleEntry<String, Object> _simpleEntry_1 = new AbstractMap.SimpleEntry<String, Object>(("ContactCoordinator" + Integer.valueOf(this.behaviourNumber)), _projectedRole_1);
        boolean _add_1 = this.behQueue.add(_simpleEntry_1);
        _builder.append(_add_1, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    CharSequence _createProtocol = this.createProtocol(lp.getProtocol().getBegin());
    _builder.append(_createProtocol, "\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public CharSequence createWaitAgents(final String name, final RoleSet r) {
    CharSequence _xblockexpression = null;
    {
      this.behaviourNumber++;
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _equals = this.agentName.equals(r.getRef().getName());
        if (_equals) {
          _builder.append("cyclic behaviour ");
          _builder.append(name);
          _builder.append(" for agent ");
          _builder.append(this.agentName);
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("on create do");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("deactivate this after \"PT(/*time*)S\" as duration");
          _builder.newLine();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("on message inform do");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("add sender of message to ");
          String _name = r.getName();
          _builder.append(_name, "\t\t");
          _builder.append("List");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("one shot behaviour ");
          _builder.append(name);
          _builder.append(" for agent ");
          _builder.append(this.agentName);
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("on execute do");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("send message inform broadcast");
          _builder.newLine();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public CharSequence createBehaviour(final String behName, final String agentName, final ChoiceL c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cyclic behaviour ");
    _builder.append(behName);
    _builder.append(" for agent ");
    _builder.append(agentName);
    _builder.newLineIfNotEmpty();
    {
      String _name = c.getRoleMakingChoice().getName();
      boolean _notEquals = (!Objects.equal(_name, agentName));
      if (_notEquals) {
        {
          EList<MessageL> _branches = c.getBranches();
          for(final MessageL branch : _branches) {
            _builder.append("\t");
            CharSequence _createHandler = this.createHandler(branch);
            _builder.append(_createHandler, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("\t");
        _builder.append("on create do");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        CharSequence _createProtocol = this.createProtocol(c);
        _builder.append(_createProtocol, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public CharSequence createBehaviour(final String behName, final String agentName, final MessageL m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cyclic behaviour ");
    _builder.append(behName);
    _builder.append(" for agent ");
    _builder.append(agentName);
    _builder.newLineIfNotEmpty();
    {
      MessageType _sendReceive = m.getSendReceive();
      if ((_sendReceive instanceof SenderL)) {
        _builder.append("\t");
        CharSequence _createHandler = this.createHandler(m);
        _builder.append(_createHandler, "\t");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        _builder.append("on create do");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        CharSequence _createProtocol = this.createProtocol(m);
        _builder.append(_createProtocol, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public CharSequence createHandler(final MessageL message) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((message instanceof MessageNormalL)) {
        _builder.append("on message inform ");
        String _messageType = ((MessageNormalL)message).getMessageType();
        _builder.append(_messageType);
        _builder.append(" do");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _createProtocol = this.createProtocol(((MessageNormalL)message).getProtocol().getBegin());
        _builder.append(_createProtocol, "\t");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("handler quit");
        _builder.newLine();
      }
    }
    return _builder;
  }

  protected CharSequence _createProtocol(final MessageL message) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((message instanceof MessageNormalL)) {
        String _createMessage = this.createMessage(((MessageNormalL)message));
        _builder.append(_createMessage);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public String createMessage(final MessageNormalL message) {
    MessageType _sendReceive = message.getSendReceive();
    if ((_sendReceive instanceof ReceiverL)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("send message inform ");
      String _messageType = message.getMessageType();
      _builder.append(_messageType);
      _builder.append("(/*payload*/) to ");
      String _name = message.getSendReceive().getRole().getName();
      _builder.append(_name);
      _builder.newLineIfNotEmpty();
      Object _createProtocol = this.createProtocol(message.getProtocol().getBegin());
      _builder.append(_createProtocol);
      _builder.newLineIfNotEmpty();
      return _builder.toString();
    } else {
      this.behaviourNumber++;
      AbstractMap.SimpleEntry<String, Object> _simpleEntry = new AbstractMap.SimpleEntry<String, Object>(("Behaviour" + Integer.valueOf(this.behaviourNumber)), message);
      this.behQueue.add(_simpleEntry);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("activate Behaviour");
      _builder_1.append(this.behaviourNumber);
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("deactivate this");
      return _builder_1.toString();
    }
  }

  public String createMessage(final MessageQuitL message) {
    MessageType _sendReceive = message.getSendReceive();
    if ((_sendReceive instanceof ReceiverL)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("send message inform QUIT to ");
      String _name = message.getSendReceive().getRole().getName();
      _builder.append(_name);
      _builder.newLineIfNotEmpty();
      _builder.append("deactivate this");
      _builder.newLine();
      return _builder.toString();
    } else {
      this.behaviourNumber++;
      AbstractMap.SimpleEntry<String, Object> _simpleEntry = new AbstractMap.SimpleEntry<String, Object>(("Behaviour" + Integer.valueOf(this.behaviourNumber)), message);
      this.behQueue.add(_simpleEntry);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("activate Behaviour");
      _builder_1.append(this.behaviourNumber);
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("deactivate this");
      return _builder_1.toString();
    }
  }

  /**
   * se scelta interna, serie di if
   * se scelta esterna, inserisco nella coda di behaviour
   */
  protected CharSequence _createProtocol(final ChoiceL choice) {
    String _name = choice.getRoleMakingChoice().getName();
    boolean _equals = Objects.equal(_name, this.agentName);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<MessageL> _branches = choice.getBranches();
        for(final MessageL branch : _branches) {
          _builder.append("if(/*cond*/) do");
          _builder.newLine();
          _builder.append("\t");
          Object _createProtocol = this.createProtocol(branch);
          _builder.append(_createProtocol, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      return _builder.toString();
    } else {
      this.behaviourNumber++;
      AbstractMap.SimpleEntry<String, Object> _simpleEntry = new AbstractMap.SimpleEntry<String, Object>(("Behaviour" + Integer.valueOf(this.behaviourNumber)), choice);
      this.behQueue.add(_simpleEntry);
      return (("activate Behaviour" + Integer.valueOf(this.behaviourNumber)) + "\ndeactivate this");
    }
  }

  /**
   * «IF forEach.refrole.name.equals(agentName)», alias "sto proiettando sul coordinatore"
   * 		*metodo ad-hoc per gestire il coordinatore
   * 	ELSE -> non sto proiettando sul coordinatore
   * 		IF sto proiettando sui subagents
   * 			*metodo ad-hoc per gestire i subagents
   * 		ELS
   * 			// non ancora implementato
   */
  protected CharSequence _createProtocol(final ForEachL forEach) {
    CharSequence _xifexpression = null;
    boolean _equals = forEach.getRefrole().getName().equals(this.agentName);
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        this.behaviourNumber++;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("for agents in ");
        String _name = forEach.getRoleset().getName();
        _builder.append(_name);
        _builder.append("List do");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("activate Behaviour");
        _builder.append(this.behaviourNumber, "\t");
        _builder.append("(agents)");
        _builder.newLineIfNotEmpty();
        _builder.append("deactivate this");
        _builder.newLine();
        CharSequence _forLoopCoordinator = this.forLoopCoordinator(forEach.getBranch());
        _builder.append(_forLoopCoordinator);
        _builder.newLineIfNotEmpty();
        _xblockexpression = _builder;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }

  public CharSequence forLoopCoordinator(final ProtocolL protocol) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("*behaviour*");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _createProtocol(final RecursionL rec) {
    this.recursionNumber++;
    EObject _begin = rec.getRecProtocol().getBegin();
    AbstractMap.SimpleEntry<String, Object> _simpleEntry = new AbstractMap.SimpleEntry<String, Object>(("RecBehaviour" + Integer.valueOf(this.recursionNumber)), _begin);
    this.behQueue.add(_simpleEntry);
    this.recNumAssociation.put(rec.getName(), Integer.valueOf(this.recursionNumber));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("activate RecBehaviour");
    _builder.append(this.recursionNumber);
    _builder.newLineIfNotEmpty();
    _builder.append("deactivate this");
    return _builder.toString();
  }

  protected CharSequence _createProtocol(final CloseRecursionL closeRec) {
    Integer recNumber = this.recNumAssociation.get(closeRec.getRecursionVariable().getName());
    String _plus = (this.recNumAssociation + " -> ");
    String _name = closeRec.getRecursionVariable().getName();
    String _plus_1 = (_plus + _name);
    System.out.println(_plus_1);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("activate RecBehaviour");
    _builder.append(recNumber);
    _builder.newLineIfNotEmpty();
    _builder.append("deactivate this");
    return _builder.toString();
  }

  protected CharSequence _createProtocol(final EndProtocol end) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("deactivate this");
    _builder.newLine();
    return _builder;
  }

  public CharSequence createProtocol(final EObject choice) {
    if (choice instanceof ChoiceL) {
      return _createProtocol((ChoiceL)choice);
    } else if (choice instanceof CloseRecursionL) {
      return _createProtocol((CloseRecursionL)choice);
    } else if (choice instanceof EndProtocol) {
      return _createProtocol((EndProtocol)choice);
    } else if (choice instanceof ForEachL) {
      return _createProtocol((ForEachL)choice);
    } else if (choice instanceof MessageL) {
      return _createProtocol((MessageL)choice);
    } else if (choice instanceof RecursionL) {
      return _createProtocol((RecursionL)choice);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(choice).toString());
    }
  }
}
