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
import org.xtext.globalTypes.myDsl.CloseRecursion;
import org.xtext.globalTypes.myDsl.CloseRecursionL;
import org.xtext.globalTypes.myDsl.Definition;
import org.xtext.globalTypes.myDsl.EndProtocol;
import org.xtext.globalTypes.myDsl.ForEachL;
import org.xtext.globalTypes.myDsl.LocalProtocol;
import org.xtext.globalTypes.myDsl.MessageL;
import org.xtext.globalTypes.myDsl.MessageNormalL;
import org.xtext.globalTypes.myDsl.MessageQuitL;
import org.xtext.globalTypes.myDsl.MessageType;
import org.xtext.globalTypes.myDsl.ReceiverL;
import org.xtext.globalTypes.myDsl.RecursionL;
import org.xtext.globalTypes.myDsl.Role;
import org.xtext.globalTypes.myDsl.RoleOne;
import org.xtext.globalTypes.myDsl.RoleSet;
import org.xtext.globalTypes.myDsl.SenderL;

@SuppressWarnings("all")
public class JadescriptGenerator {
  private Queue<Map.Entry<String, Map.Entry<Object, Boolean>>> behQueue;

  private HashMap<String, Integer> recNumAssociation;

  private String agentString;

  private String agentName;

  private String buffer;

  private OntologyTypes ontology = new OntologyTypes();

  private PayloadNames payloadNames = new PayloadNames();

  private int behaviourNumber;

  private int recursionNumber;

  private int forNumber;

  private String forVariable;

  private String forRoleset;

  private boolean inCreateAgent = true;

  public CharSequence translate(final LocalProtocol lp, final EList<Definition> definitions) {
    String _string = new String();
    this.agentString = _string;
    LinkedList<Map.Entry<String, Map.Entry<Object, Boolean>>> _linkedList = new LinkedList<Map.Entry<String, Map.Entry<Object, Boolean>>>();
    this.behQueue = _linkedList;
    HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
    this.recNumAssociation = _hashMap;
    this.payloadNames.init(definitions);
    this.ontology.init(definitions);
    this.agentName = lp.getProjectedRole().getName();
    this.behaviourNumber = 0;
    this.recursionNumber = 0;
    this.forNumber = 0;
    this.inCreateAgent = true;
    CharSequence _createAgent = this.createAgent(lp);
    String _plus = ((this.agentString + "\n\n") + _createAgent);
    this.agentString = _plus;
    while ((this.behQueue.peek() != null)) {
      {
        this.inCreateAgent = false;
        Map.Entry<String, Map.Entry<Object, Boolean>> entry = this.behQueue.poll();
        Object firstObj = entry.getValue().getKey();
        String behName = entry.getKey();
        Boolean par = entry.getValue().getValue();
        System.out.println(entry.toString());
        if ((firstObj instanceof ChoiceL)) {
          String _string_1 = entry.toString();
          String _plus_1 = ("*******CHOICEL*******" + _string_1);
          System.out.println(_plus_1);
          String _agentString = this.agentString;
          CharSequence _createBehaviour = this.createBehaviour(behName, this.agentName, ((ChoiceL) firstObj), (par).booleanValue());
          String _plus_2 = ("\n\n\n" + _createBehaviour);
          this.agentString = (_agentString + _plus_2);
        } else {
          if ((firstObj instanceof MessageL)) {
            String _string_2 = entry.toString();
            String _plus_3 = ("*******MESSAGEL*******" + _string_2);
            System.out.println(_plus_3);
            String _agentString_1 = this.agentString;
            CharSequence _createBehaviour_1 = this.createBehaviour(behName, this.agentName, ((MessageL) firstObj), (par).booleanValue());
            String _plus_4 = ("\n\n\n" + _createBehaviour_1);
            this.agentString = (_agentString_1 + _plus_4);
          } else {
            if ((firstObj instanceof RecursionL)) {
              String _string_3 = entry.toString();
              String _plus_5 = ("*******RECURSIONL*******" + _string_3);
              System.out.println(_plus_5);
              String _agentString_2 = this.agentString;
              CharSequence _createBehaviour_2 = this.createBehaviour(behName, this.agentName, ((RecursionL) firstObj), (par).booleanValue());
              String _plus_6 = ("\n\n\n" + _createBehaviour_2);
              this.agentString = (_agentString_2 + _plus_6);
            } else {
              if ((firstObj instanceof LocalProtocol)) {
                String _string_4 = entry.toString();
                String _plus_7 = ("*******LOCALPROTOCOLL*******" + _string_4);
                System.out.println(_plus_7);
                CharSequence _createWaitAgents = this.createWaitAgents(behName, ((LocalProtocol) firstObj));
                String _plus_8 = ((this.agentString + "\n\n\n") + _createWaitAgents);
                this.agentString = _plus_8;
              } else {
                if ((firstObj instanceof RoleSet)) {
                  String _string_5 = entry.toString();
                  String _plus_9 = ("*******ROLESET*******" + _string_5);
                  System.out.println(_plus_9);
                  CharSequence _createWaitAgents_1 = this.createWaitAgents(behName, ((RoleSet) firstObj));
                  String _plus_10 = ((this.agentString + "\n\n\n") + _createWaitAgents_1);
                  this.agentString = _plus_10;
                } else {
                  if ((firstObj instanceof ForEachL)) {
                    String _string_6 = entry.toString();
                    String _plus_11 = ("*******FOREACH???*******" + _string_6);
                    System.out.println(_plus_11);
                    String _agentString_3 = this.agentString;
                    String _createBehaviour_3 = this.createBehaviour(behName, this.agentName, ((ForEachL) firstObj), (par).booleanValue());
                    String _plus_12 = ("\n\n\n" + _createBehaviour_3);
                    this.agentString = (_agentString_3 + _plus_12);
                  } else {
                    if ((firstObj instanceof EndProtocol)) {
                      String _string_7 = entry.toString();
                      String _plus_13 = ("*******END*******" + _string_7);
                      System.out.println(_plus_13);
                      String _agentString_4 = this.agentString;
                      CharSequence _createBehaviour_4 = this.createBehaviour(behName, this.agentName, ((EndProtocol) firstObj), (par).booleanValue());
                      String _plus_14 = ("\n\n\n" + _createBehaviour_4);
                      this.agentString = (_agentString_4 + _plus_14);
                    } else {
                      if ((firstObj instanceof CloseRecursion)) {
                        String _string_8 = entry.toString();
                        String _plus_15 = ("*******LOOP*******" + _string_8);
                        System.out.println(_plus_15);
                        String _agentString_5 = this.agentString;
                        CharSequence _createBehaviour_5 = this.createBehaviour(behName, this.agentName, ((CloseRecursion) firstObj), (par).booleanValue());
                        String _plus_16 = ("\n\n\n" + _createBehaviour_5);
                        this.agentString = (_agentString_5 + _plus_16);
                      }
                    }
                  }
                }
              }
            }
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
    _builder.append("\t");
    int isDone = 0;
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
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
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
            _builder.append(" as aid = \"");
            String _name_5 = r_1.getName();
            _builder.append(_name_5, "\t");
            _builder.append("\"@");
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
            final boolean ignore = this.behQueue.add(this.getEntry("WaitSubAgents", lp, Boolean.valueOf(false), Integer.valueOf(this.behaviourNumber)));
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            final int ignore2 = isDone = 1;
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
        final boolean ignore_1 = this.behQueue.add(this.getEntry("ContactCoordinator", lp.getProjectedRole(), Boolean.valueOf(false), Integer.valueOf(this.behaviourNumber)));
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((isDone == 0)) {
        _builder.append("\t\t");
        CharSequence _createProtocol = this.createProtocol(lp.getProtocol().getBegin(), false);
        _builder.append(_createProtocol, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  protected CharSequence _createWaitAgents(final String name, final LocalProtocol lp) {
    CharSequence _xblockexpression = null;
    {
      this.behaviourNumber++;
      List<RoleSet> rolesetList = EcoreUtil2.<RoleSet>getAllContentsOfType(lp.getRoles(), RoleSet.class);
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final RoleSet r : rolesetList) {
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
              _builder.append("on message inform ");
              String _name = r.getRef().getName();
              _builder.append(_name, "\t");
              _builder.append("Hello do");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("add sender of message to ");
              String _name_1 = r.getName();
              _builder.append(_name_1, "\t\t");
              _builder.append("List");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("on deactivate do");
              _builder.newLine();
              _builder.append("\t\t");
              CharSequence _createProtocol = this.createProtocol(lp.getProtocol().getBegin(), false);
              _builder.append(_createProtocol, "\t\t");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  protected CharSequence _createWaitAgents(final String name, final RoleSet r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("one shot behaviour ");
    _builder.append(name);
    _builder.append(" for agent ");
    _builder.append(this.agentName);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("on execute do");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("send message inform ");
    String _name = r.getRef().getName();
    _builder.append(_name, "\t\t");
    _builder.append("Hello to ");
    String _name_1 = r.getRef().getName();
    _builder.append(_name_1, "\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public CharSequence createBehaviour(final String behName, final String agentName, final ChoiceL c, final boolean par) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cyclic behaviour ");
    _builder.append(behName);
    _builder.append(" for agent ");
    _builder.append(agentName);
    _builder.newLineIfNotEmpty();
    {
      if (par) {
        _builder.append("\t");
        _builder.append("property intAgent as aid");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("on create with intAgent as aid do");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("intAgent of this = intAgent");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    {
      String _name = c.getRoleMakingChoice().getName();
      boolean _notEquals = (!Objects.equal(_name, agentName));
      if (_notEquals) {
        {
          EList<MessageL> _branches = c.getBranches();
          for(final MessageL branch : _branches) {
            _builder.append("\t");
            CharSequence _createHandler = this.createHandler(branch, par);
            _builder.append(_createHandler, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("\t");
        _builder.append("on activate do");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        CharSequence _createProtocol = this.createProtocol(c, par);
        _builder.append(_createProtocol, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public CharSequence createBehaviour(final String behName, final String agentName, final MessageL m, final boolean par) {
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
        CharSequence _createHandler = this.createHandler(m, par);
        _builder.append(_createHandler, "\t");
        _builder.newLineIfNotEmpty();
      } else {
        {
          if (par) {
            _builder.append("\t");
            _builder.append("property intAgent as aid");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("on create with intAgent as aid do");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("intAgent of this = intAgent");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("on activate do");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        CharSequence _createProtocol = this.createProtocol(m, par);
        _builder.append(_createProtocol, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public CharSequence createBehaviour(final String behName, final String agentName, final RecursionL r, final boolean par) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cyclic behaviour ");
    _builder.append(behName);
    _builder.append(" for agent ");
    _builder.append(agentName);
    _builder.newLineIfNotEmpty();
    {
      if (par) {
        _builder.append("\t");
        _builder.append("property intAgent as aid");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("on create with intAgent as aid do");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("intAgent of this = intAgent");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("on activate do");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _createProtocol = this.createProtocol(r.getRecProtocol().getBegin(), par);
    _builder.append(_createProtocol, "\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public String createBehaviour(final String behName, final String agentName, final ForEachL f, final boolean par) {
    this.behaviourNumber++;
    final int forBodyNum = this.behaviourNumber;
    this.behQueue.add(this.getEntry("Behaviour", f.getBranch().getBegin(), Boolean.valueOf(true), Integer.valueOf(this.behaviourNumber)));
    this.behaviourNumber++;
    final int forExitNum = this.behaviourNumber;
    this.behQueue.add(this.getEntry("Behaviour", f.getProtocol().getBegin(), Boolean.valueOf(false), Integer.valueOf(this.behaviourNumber)));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cyclic behaviour ");
    _builder.append(behName);
    _builder.append(" for agent ");
    _builder.append(agentName);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("on activate do");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("forCounter = length of ");
    String _name = f.getRoleset().getName();
    _builder.append(_name, "\t\t");
    _builder.append("List");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("for i in ");
    String _name_1 = f.getRoleset().getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("List do");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("activate Behaviour");
    _builder.append(forBodyNum, "\t\t\t");
    _builder.append("(i)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("on execute do");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if forCounter = 0 do");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("activate Behaviour");
    _builder.append(forExitNum, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("deactivate this");
    _builder.newLine();
    return _builder.toString();
  }

  public CharSequence createBehaviour(final String behName, final String agentName, final EndProtocol r, final boolean par) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("oneshot behaviour ");
    _builder.append(behName);
    _builder.append(" for agent ");
    _builder.append(agentName);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("on activate do");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("log \"reached sub-protocol end\"");
    _builder.newLine();
    return _builder;
  }

  public CharSequence createBehaviour(final String behName, final String agentName, final CloseRecursion r, final boolean par) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("oneshot behaviour ");
    _builder.append(behName);
    _builder.append(" for agent ");
    _builder.append(agentName);
    _builder.newLineIfNotEmpty();
    {
      if (par) {
        _builder.append("\t");
        _builder.append("property intAgent as aid");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("on create with intAgent as aid do");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("intAgent of this = intAgent");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("on activate do");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _createProtocol = this.createProtocol(r, par);
    _builder.append(_createProtocol, "\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public CharSequence createHandler(final MessageL message, final boolean par) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((message instanceof MessageNormalL)) {
        {
          if (par) {
            _builder.append("on message inform(");
            String _messageType = ((MessageNormalL)message).getMessageType();
            _builder.append(_messageType);
            String _messageOntologyHandler = this.messageOntologyHandler(((MessageNormalL)message), true);
            _builder.append(_messageOntologyHandler);
            _builder.append(") when sender of message = intAgent do");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("on message inform(");
            String _messageType_1 = ((MessageNormalL)message).getMessageType();
            _builder.append(_messageType_1);
            String _messageOntologyHandler_1 = this.messageOntologyHandler(((MessageNormalL)message), true);
            _builder.append(_messageOntologyHandler_1);
            _builder.append(") do");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        CharSequence _createProtocol = this.createProtocol(((MessageNormalL)message).getProtocol().getBegin(), par);
        _builder.append(_createProtocol, "\t");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("on message inform QUIT do");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("remove sender of message from ");
        _builder.append(this.forRoleset, "\t");
        _builder.append("List");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("forCounter = forCounter-1");
        _builder.newLine();
      }
    }
    return _builder;
  }

  protected CharSequence _createProtocol(final MessageL message, final boolean p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((message instanceof MessageNormalL)) {
        String _createMessage = this.createMessage(((MessageNormalL)message), p);
        _builder.append(_createMessage);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((message instanceof MessageQuitL)) {
        String _createMessage_1 = this.createMessage(((MessageQuitL)message), p);
        _builder.append(_createMessage_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public String createMessage(final MessageNormalL message, final boolean p) {
    MessageType _sendReceive = message.getSendReceive();
    if ((_sendReceive instanceof ReceiverL)) {
      Role _role = message.getSendReceive().getRole();
      if ((_role instanceof RoleSet)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("send message inform(");
        String _messageType = message.getMessageType();
        _builder.append(_messageType);
        String _messageOntologyHandler = this.messageOntologyHandler(message, false);
        _builder.append(_messageOntologyHandler);
        _builder.append(") to ");
        String _name = message.getSendReceive().getRole().getName();
        _builder.append(_name);
        _builder.append("List");
        _builder.newLineIfNotEmpty();
        Object _createProtocol = this.createProtocol(message.getProtocol().getBegin(), p);
        _builder.append(_createProtocol);
        _builder.newLineIfNotEmpty();
        return _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        {
          String _name_1 = message.getSendReceive().getRole().getName();
          boolean _equals = Objects.equal(_name_1, this.forVariable);
          if (_equals) {
            _builder_1.append("send message inform(");
            String _messageType_1 = message.getMessageType();
            _builder_1.append(_messageType_1);
            String _messageOntologyHandler_1 = this.messageOntologyHandler(message, false);
            _builder_1.append(_messageOntologyHandler_1);
            _builder_1.append(") to intAgent");
            _builder_1.newLineIfNotEmpty();
          } else {
            _builder_1.append("send message inform(");
            String _messageType_2 = message.getMessageType();
            _builder_1.append(_messageType_2);
            String _messageOntologyHandler_2 = this.messageOntologyHandler(message, false);
            _builder_1.append(_messageOntologyHandler_2);
            _builder_1.append(") to ");
            String _name_2 = message.getSendReceive().getRole().getName();
            _builder_1.append(_name_2);
            _builder_1.newLineIfNotEmpty();
          }
        }
        Object _createProtocol_1 = this.createProtocol(message.getProtocol().getBegin(), p);
        _builder_1.append(_createProtocol_1);
        _builder_1.newLineIfNotEmpty();
        return _builder_1.toString();
      }
    } else {
      this.behaviourNumber++;
      if (p) {
        this.behQueue.add(this.getEntry("Behaviour", message, Boolean.valueOf(true), Integer.valueOf(this.behaviourNumber)));
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("activate Behaviour");
        _builder_2.append(this.behaviourNumber);
        _builder_2.append("(intAgent)");
        _builder_2.newLineIfNotEmpty();
        String _deactivate = this.deactivate();
        _builder_2.append(_deactivate);
        return _builder_2.toString();
      } else {
        this.behQueue.add(this.getEntry("Behaviour", message, Boolean.valueOf(false), Integer.valueOf(this.behaviourNumber)));
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("activate Behaviour");
        _builder_3.append(this.behaviourNumber);
        _builder_3.newLineIfNotEmpty();
        String _deactivate_1 = this.deactivate();
        _builder_3.append(_deactivate_1);
        return _builder_3.toString();
      }
    }
  }

  public String messageOntologyHandler(final MessageNormalL message, final boolean decision) {
    String nameOntology = this.ontology.extractOntology(message.getMessageType());
    boolean _equals = nameOntology.equals("@proposition");
    if (_equals) {
      return "";
    } else {
      if (decision) {
        return this.payloadNames.getPayload(message.getMessageType(), false);
      } else {
        return this.payloadNames.getPayload(message.getMessageType(), true);
      }
    }
  }

  public String createMessage(final MessageQuitL message, final boolean p) {
    MessageType _sendReceive = message.getSendReceive();
    if ((_sendReceive instanceof ReceiverL)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("send message inform QUIT to ");
      String _name = message.getSendReceive().getRole().getName();
      _builder.append(_name);
      _builder.newLineIfNotEmpty();
      String _deactivate = this.deactivate();
      _builder.append(_deactivate);
      _builder.newLineIfNotEmpty();
      return _builder.toString();
    } else {
      this.behaviourNumber++;
      if (p) {
        this.behQueue.add(this.getEntry("Behaviour", message, Boolean.valueOf(true), Integer.valueOf(this.behaviourNumber)));
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("activate Behaviour");
        _builder_1.append(this.behaviourNumber);
        _builder_1.append("(intAgent)");
        _builder_1.newLineIfNotEmpty();
        String _deactivate_1 = this.deactivate();
        _builder_1.append(_deactivate_1);
        return _builder_1.toString();
      } else {
        this.behQueue.add(this.getEntry("Behaviour", message, Boolean.valueOf(false), Integer.valueOf(this.behaviourNumber)));
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("activate Behaviour");
        _builder_2.append(this.behaviourNumber);
        _builder_2.newLineIfNotEmpty();
        String _deactivate_2 = this.deactivate();
        _builder_2.append(_deactivate_2);
        return _builder_2.toString();
      }
    }
  }

  /**
   * se scelta interna, serie di if
   * se scelta esterna, inserisco nella coda di behaviour
   */
  protected CharSequence _createProtocol(final ChoiceL choice, final boolean p) {
    this.buffer = "";
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
          Object _createProtocol = this.createProtocol(branch, p);
          _builder.append(_createProtocol, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      return _builder.toString();
    } else {
      if (p) {
        this.behaviourNumber++;
        this.behQueue.add(this.getEntry("Behaviour", choice, Boolean.valueOf(true), Integer.valueOf(this.behaviourNumber)));
        return (("activate Behaviour" + Integer.valueOf(this.behaviourNumber)) + "(intAgent)\ndeactivate this");
      } else {
        this.behaviourNumber++;
        this.behQueue.add(this.getEntry("Behaviour", choice, Boolean.valueOf(false), Integer.valueOf(this.behaviourNumber)));
        return (("activate Behaviour" + Integer.valueOf(this.behaviourNumber)) + "\ndeactivate this");
      }
    }
  }

  protected CharSequence _createProtocol(final ForEachL forEach, final boolean p) {
    this.forNumber++;
    this.behQueue.add(this.getEntry("ForBehaviour", forEach, Boolean.valueOf(true), Integer.valueOf(this.forNumber)));
    this.forVariable = forEach.getEachRole().getName();
    this.forRoleset = forEach.getRoleset().getName();
    return ("activate ForBehaviour" + Integer.valueOf(this.forNumber));
  }

  protected CharSequence _createProtocol(final RecursionL rec, final boolean p) {
    this.recursionNumber++;
    if (p) {
      this.behQueue.add(this.getEntry("RecBehaviour", rec, Boolean.valueOf(true), Integer.valueOf(this.recursionNumber)));
      this.recNumAssociation.put(rec.getName(), Integer.valueOf(this.recursionNumber));
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("activate RecBehaviour");
      _builder.append(this.recursionNumber);
      _builder.append("(intAgent)");
      _builder.newLineIfNotEmpty();
      String _deactivate = this.deactivate();
      _builder.append(_deactivate);
      return _builder.toString();
    } else {
      this.behQueue.add(this.getEntry("RecBehaviour", rec, Boolean.valueOf(false), Integer.valueOf(this.recursionNumber)));
      this.recNumAssociation.put(rec.getName(), Integer.valueOf(this.recursionNumber));
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("activate RecBehaviour");
      _builder_1.append(this.recursionNumber);
      _builder_1.newLineIfNotEmpty();
      String _deactivate_1 = this.deactivate();
      _builder_1.append(_deactivate_1);
      return _builder_1.toString();
    }
  }

  protected CharSequence _createProtocol(final CloseRecursionL closeRec, final boolean p) {
    Integer recNumber = this.recNumAssociation.get(closeRec.getRecursionVariable().getName());
    String _plus = (this.recNumAssociation + " -> ");
    String _name = closeRec.getRecursionVariable().getName();
    String _plus_1 = (_plus + _name);
    System.out.println(_plus_1);
    if (p) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("activate RecBehaviour");
      _builder.append(recNumber);
      _builder.append("(intAgent)");
      _builder.newLineIfNotEmpty();
      _builder.append("forCounter = forCounter-1");
      _builder.newLine();
      String _deactivate = this.deactivate();
      _builder.append(_deactivate);
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("activate RecBehaviour");
      _builder_1.append(recNumber);
      _builder_1.newLineIfNotEmpty();
      String _deactivate_1 = this.deactivate();
      _builder_1.append(_deactivate_1);
      return _builder_1.toString();
    }
  }

  protected CharSequence _createProtocol(final EndProtocol end, final boolean p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (p) {
        _builder.append("forCounter = forCounter-1");
        _builder.newLine();
      }
    }
    String _deactivate = this.deactivate();
    _builder.append(_deactivate);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public Map.Entry<String, Map.Entry<Object, Boolean>> getEntry(final String s, final Object o, final Boolean b, final Integer n) {
    AbstractMap.SimpleEntry<Object, Boolean> _simpleEntry = new AbstractMap.SimpleEntry<Object, Boolean>(o, b);
    return new AbstractMap.SimpleEntry<String, Map.Entry<Object, Boolean>>((s + n), _simpleEntry);
  }

  public String deactivate() {
    if ((!this.inCreateAgent)) {
      return "deactivate this";
    } else {
      return "";
    }
  }

  public CharSequence createWaitAgents(final String name, final EObject r) {
    if (r instanceof RoleSet) {
      return _createWaitAgents(name, (RoleSet)r);
    } else if (r instanceof LocalProtocol) {
      return _createWaitAgents(name, (LocalProtocol)r);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(name, r).toString());
    }
  }

  public CharSequence createProtocol(final EObject choice, final boolean p) {
    if (choice instanceof ChoiceL) {
      return _createProtocol((ChoiceL)choice, p);
    } else if (choice instanceof CloseRecursionL) {
      return _createProtocol((CloseRecursionL)choice, p);
    } else if (choice instanceof EndProtocol) {
      return _createProtocol((EndProtocol)choice, p);
    } else if (choice instanceof ForEachL) {
      return _createProtocol((ForEachL)choice, p);
    } else if (choice instanceof MessageL) {
      return _createProtocol((MessageL)choice, p);
    } else if (choice instanceof RecursionL) {
      return _createProtocol((RecursionL)choice, p);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(choice, p).toString());
    }
  }
}
