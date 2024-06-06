/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globalTypes.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.globalTypes.myDsl.Choice;
import org.xtext.globalTypes.myDsl.CloseRecursion;
import org.xtext.globalTypes.myDsl.ForEach;
import org.xtext.globalTypes.myDsl.GlobalProtocol;
import org.xtext.globalTypes.myDsl.LocalProtocol;
import org.xtext.globalTypes.myDsl.Message;
import org.xtext.globalTypes.myDsl.Model;
import org.xtext.globalTypes.myDsl.Payload;
import org.xtext.globalTypes.myDsl.Protocol;
import org.xtext.globalTypes.myDsl.Recursion;
import org.xtext.globalTypes.myDsl.Role;
import org.xtext.globalTypes.myDsl.RoleOne;
import org.xtext.globalTypes.myDsl.RoleSet;
import org.xtext.globalTypes.myDsl.Roles;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    Model model = ((Model) _head);
    EObject _protocol = model.getProtocol();
    if ((_protocol instanceof GlobalProtocol)) {
      EObject _protocol_1 = model.getProtocol();
      GlobalProtocol globalProtocol = ((GlobalProtocol) _protocol_1);
      EList<Role> _roles = globalProtocol.getRoles().getRoles();
      for (final Role r : _roles) {
        {
          System.out.println("LOCAL");
          String _name = r.getName();
          String _plus = ("../src/local/local_" + _name);
          String _plus_1 = (_plus + ".jglobal");
          fsa.generateFile(_plus_1, this.project(globalProtocol, r));
        }
      }
    } else {
      EObject _protocol_2 = model.getProtocol();
      LocalProtocol localProtocol = ((LocalProtocol) _protocol_2);
      System.out.println("JADE");
      String _projectedRole = localProtocol.getProjectedRole();
      String _plus = ("jade/jade" + _projectedRole);
      String _plus_1 = (_plus + ".txt");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aaa");
      fsa.generateFile(_plus_1, _builder);
    }
  }

  public CharSequence project(final GlobalProtocol p, final Role role) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("local protocol ");
    String _protocolName = p.getProtocolName();
    _builder.append(_protocolName);
    _builder.append(" at ");
    String _name = role.getName();
    _builder.append(_name);
    _builder.append("(");
    CharSequence _projectOn = this.projectOn(p.getRoles(), role);
    _builder.append(_projectOn);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _projectOn_1 = this.projectOn(p.getProtocol(), role);
    _builder.append(_projectOn_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _projectOn(final Protocol protocol, final Role role) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _actions = protocol.getActions();
      for(final EObject a : _actions) {
        Object _projectOn = this.projectOn(a, role);
        _builder.append(_projectOn);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  protected CharSequence _projectOn(final Roles roles, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Role> _roles = roles.getRoles();
      boolean _hasElements = false;
      for(final Role role : _roles) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        Object _projectOn = this.projectOn(role, r);
        _builder.append(_projectOn);
      }
    }
    return _builder;
  }

  protected CharSequence _projectOn(final Role role, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((role instanceof RoleOne)) {
        _builder.append("role ");
        String _name = ((RoleOne)role).getName();
        _builder.append(_name);
      } else {
        _builder.append("roleset ");
        String _name_1 = role.getName();
        _builder.append(_name_1);
        _builder.append(":");
        String _name_2 = ((RoleSet) role).getRef().getName();
        _builder.append(_name_2);
      }
    }
    return _builder;
  }

  protected CharSequence _projectOn(final Message m, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      RoleOne _sender = m.getSender();
      boolean _equals = Objects.equal(_sender, r);
      if (_equals) {
        String _messageType = m.getMessageType();
        _builder.append(_messageType);
        _builder.append("(");
        CharSequence _printPayload = this.printPayload(m.getPayload());
        _builder.append(_printPayload);
        _builder.append(") to ");
        String _name = m.getReceiver().getName();
        _builder.append(_name);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        {
          RoleOne _receiver = m.getReceiver();
          boolean _equals_1 = Objects.equal(_receiver, r);
          if (_equals_1) {
            String _messageType_1 = m.getMessageType();
            _builder.append(_messageType_1);
            _builder.append("(");
            CharSequence _printPayload_1 = this.printPayload(m.getPayload());
            _builder.append(_printPayload_1);
            _builder.append(") from ");
            String _name_1 = m.getSender().getName();
            _builder.append(_name_1);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }

  protected CharSequence _projectOn(final Choice c, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("choice at ");
    String _name = c.getRole().getName();
    _builder.append(_name);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      int _length = ((Object[])Conversions.unwrapArray(c.getBranches(), Object.class)).length;
      int _minus = (_length - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      boolean _hasElements = false;
      for(final int i : _upTo) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" or {", "");
        }
        _builder.append("\t");
        Object _projectOn = this.projectOn(c.getMessage().get(i), r);
        _builder.append(_projectOn, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        Object _projectOn_1 = this.projectOn(c.getBranches().get(i), r);
        _builder.append(_projectOn_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }

  protected CharSequence _projectOn(final Recursion rec, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rec ");
    String _name = rec.getName();
    _builder.append(_name);
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  protected CharSequence _projectOn(final CloseRecursion recEnd, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("loop ");
    String _name = recEnd.getRecursionVariable().getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  protected CharSequence _projectOn(final ForEach each, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      RoleSet _role = each.getRole();
      boolean _equals = Objects.equal(_role, r);
      if (_equals) {
        Object _projectOn = this.projectOn(each.getBranch(), each.getEachRole());
        _builder.append(_projectOn);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      RoleSet _role_1 = each.getRole();
      boolean _tripleNotEquals = (_role_1 != r);
      if (_tripleNotEquals) {
        _builder.append("foreach role ");
        String _name = each.getEachRole().getName();
        _builder.append(_name);
        _builder.append(":");
        String _name_1 = each.getRole().getName();
        _builder.append(_name_1);
        _builder.append("{");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        Object _projectOn_1 = this.projectOn(each.getBranch(), r);
        _builder.append(_projectOn_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    return _builder;
  }

  public CharSequence printPayload(final Payload payload) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((payload != null)) {
        {
          EList<String> _types = payload.getTypes();
          boolean _hasElements = false;
          for(final String type : _types) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            _builder.append(type);
          }
        }
      }
    }
    return _builder;
  }

  public CharSequence projectOn(final EObject c, final Role r) {
    if (c instanceof Choice) {
      return _projectOn((Choice)c, r);
    } else if (c instanceof CloseRecursion) {
      return _projectOn((CloseRecursion)c, r);
    } else if (c instanceof ForEach) {
      return _projectOn((ForEach)c, r);
    } else if (c instanceof Message) {
      return _projectOn((Message)c, r);
    } else if (c instanceof Protocol) {
      return _projectOn((Protocol)c, r);
    } else if (c instanceof Recursion) {
      return _projectOn((Recursion)c, r);
    } else if (c instanceof Role) {
      return _projectOn((Role)c, r);
    } else if (c instanceof Roles) {
      return _projectOn((Roles)c, r);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c, r).toString());
    }
  }
}