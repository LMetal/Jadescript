package org.xtext.globalTypes.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.globalTypes.myDsl.Choice;
import org.xtext.globalTypes.myDsl.CloseRecursion;
import org.xtext.globalTypes.myDsl.Definition;
import org.xtext.globalTypes.myDsl.EndProtocol;
import org.xtext.globalTypes.myDsl.ForEach;
import org.xtext.globalTypes.myDsl.GlobalProtocol;
import org.xtext.globalTypes.myDsl.Message;
import org.xtext.globalTypes.myDsl.MessageNormal;
import org.xtext.globalTypes.myDsl.Payload;
import org.xtext.globalTypes.myDsl.Protocol;
import org.xtext.globalTypes.myDsl.Recursion;
import org.xtext.globalTypes.myDsl.Role;
import org.xtext.globalTypes.myDsl.RoleOne;
import org.xtext.globalTypes.myDsl.RoleSet;
import org.xtext.globalTypes.myDsl.Roles;

@SuppressWarnings("all")
public class LocalGenerator {
  private final Participants parts = new Participants();

  public CharSequence project(final GlobalProtocol p, final EList<Definition> definitions, final Role role) {
    StringConcatenation _builder = new StringConcatenation();
    this.parts.resetLists();
    _builder.newLineIfNotEmpty();
    this.parts.addRoleOne(p);
    _builder.newLineIfNotEmpty();
    {
      for(final Definition d : definitions) {
        {
          String _type = d.getType();
          boolean _equals = Objects.equal(_type, "@proposition");
          if (_equals) {
            String _type_1 = d.getType();
            _builder.append(_type_1);
            _builder.append(" ");
            String _name = d.getName();
            _builder.append(_name);
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _type_2 = d.getType();
          boolean _equals_1 = Objects.equal(_type_2, "@predicate");
          if (_equals_1) {
            String _type_3 = d.getType();
            _builder.append(_type_3);
            _builder.append(" ");
            String _name_1 = d.getName();
            _builder.append(_name_1);
            _builder.append("(");
            {
              EList<String> _types = d.getTypes();
              boolean _hasElements = false;
              for(final String t : _types) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(", ", "");
                }
                _builder.append(t);
              }
            }
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          String _type_4 = d.getType();
          boolean _equals_2 = Objects.equal(_type_4, "@action");
          if (_equals_2) {
            {
              int _length = ((Object[])Conversions.unwrapArray(d.getTypes(), Object.class)).length;
              boolean _notEquals = (_length != 0);
              if (_notEquals) {
                String _type_5 = d.getType();
                _builder.append(_type_5);
                _builder.append(" ");
                String _name_2 = d.getName();
                _builder.append(_name_2);
                _builder.append("(");
                {
                  EList<String> _types_1 = d.getTypes();
                  boolean _hasElements_1 = false;
                  for(final String t_1 : _types_1) {
                    if (!_hasElements_1) {
                      _hasElements_1 = true;
                    } else {
                      _builder.appendImmediate(", ", "");
                    }
                    _builder.append(t_1);
                  }
                }
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              } else {
                String _type_6 = d.getType();
                _builder.append(_type_6);
                _builder.append(" ");
                String _name_3 = d.getName();
                _builder.append(_name_3);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("local protocol ");
    String _protocolName = p.getProtocolName();
    _builder.append(_protocolName);
    _builder.append(" at ");
    CharSequence _projectOn = this.projectOn(role, role);
    _builder.append(_projectOn);
    _builder.append("(");
    CharSequence _projectOn_1 = this.projectOn(p.getRoles(), role);
    _builder.append(_projectOn_1);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _projectOn_2 = this.projectOn(p.getProtocol(), role);
    _builder.append(_projectOn_2, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _projectOn(final Protocol protocol, final Role role) {
    StringConcatenation _builder = new StringConcatenation();
    Object _projectOn = this.projectOn(protocol.getBegin(), role);
    _builder.append(_projectOn);
    return _builder;
  }

  protected CharSequence _projectOn(final Roles roles, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      final Function1<Role, Boolean> _function = (Role it) -> {
        boolean _equals = it.getName().equals(r.getName());
        return Boolean.valueOf((!_equals));
      };
      Iterable<Role> _filter = IterableExtensions.<Role>filter(roles.getRoles(), _function);
      boolean _hasElements = false;
      for(final Role role : _filter) {
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

  /**
   * projection of a message on a role with differentiation between normal messages
   * and quit messages. In the first case the protocol continues.
   * 
   * m: Message (superclass of MessageNormal and MessageQuit)
   * r: role to project on
   * 
   * 
   * (\ud835\udc65 → q ℓQuit ) ↾\ud835\udf0c q = \ud835\udc65 ? ℓQuit
   * (\ud835\udc65 → q ℓQuit ) ↾\ud835\udf0cR = q!ℓQuit
   * (\ud835\udc65 → q ℓQuit ) ↾\ud835\udf0c p = End
   */
  protected CharSequence _projectOn(final Message m, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((m instanceof MessageNormal)) {
        {
          String _name = ((MessageNormal)m).getSender().getName();
          String _name_1 = r.getName();
          boolean _equals = Objects.equal(_name, _name_1);
          if (_equals) {
            String _name_2 = ((MessageNormal)m).getMessageType().getName();
            _builder.append(_name_2);
            _builder.append("(");
            CharSequence _printPayload = this.printPayload(((MessageNormal)m).getPayload());
            _builder.append(_printPayload);
            _builder.append(") to ");
            String _name_3 = ((MessageNormal)m).getReceiver().getName();
            _builder.append(_name_3);
            _builder.append(".");
            _builder.newLineIfNotEmpty();
          } else {
            {
              String _name_4 = ((MessageNormal)m).getReceiver().getName();
              String _name_5 = r.getName();
              boolean _equals_1 = Objects.equal(_name_4, _name_5);
              if (_equals_1) {
                String _name_6 = ((MessageNormal)m).getMessageType().getName();
                _builder.append(_name_6);
                _builder.append("(");
                CharSequence _printPayload_1 = this.printPayload(((MessageNormal)m).getPayload());
                _builder.append(_printPayload_1);
                _builder.append(") from ");
                String _name_7 = ((MessageNormal)m).getSender().getName();
                _builder.append(_name_7);
                _builder.append(".");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        Object _projectOn = this.projectOn(((MessageNormal)m).getProtocol(), r);
        _builder.append(_projectOn);
        _builder.newLineIfNotEmpty();
      } else {
        {
          String _name_8 = m.getSender().getName();
          String _name_9 = r.getName();
          boolean _equals_2 = Objects.equal(_name_8, _name_9);
          if (_equals_2) {
            _builder.append("QUIT() to ");
            String _name_10 = m.getReceiver().getName();
            _builder.append(_name_10);
            _builder.newLineIfNotEmpty();
          } else {
            {
              String _name_11 = m.getReceiver().getName();
              String _name_12 = r.getName();
              boolean _equals_3 = Objects.equal(_name_11, _name_12);
              if (_equals_3) {
                _builder.append("QUIT() from ");
                String _name_13 = m.getSender().getName();
                _builder.append(_name_13);
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("End");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    return _builder;
  }

  /**
   * p → Q{ ℓ\ud835\udc56⟨S\ud835\udc56⟩.G\ud835\udc56 }\ud835\udc56∈\ud835\udc3c ↾\ud835\udf0c R = Q!{ ℓ\ud835\udc56⟨S\ud835\udc56⟩.G\ud835\udc56 ↾\ud835\udf0c R }\ud835\udc56∈\ud835\udc3c if RoleSet(p, \ud835\udf0c) = R
   * p → Q{ ℓ\ud835\udc56⟨S\ud835\udc56⟩.G\ud835\udc56 }\ud835\udc56∈\ud835\udc3c ↾\ud835\udf0c R = p?{ ℓ\ud835\udc56⟨S\ud835\udc56⟩.G\ud835\udc56 ↾\ud835\udf0c R }\ud835\udc56∈\ud835\udc3c if RoleSet(Q, \ud835\udf0c) = R
   * p → Q{ ℓ\ud835\udc56⟨S\ud835\udc56⟩.G\ud835\udc56 }\ud835\udc56∈\ud835\udc3c ↾\ud835\udf0c R = ⨆︀\ud835\udc56∈\ud835\udc3c G\ud835\udc56 ↾\ud835\udf0c R //merge
   */
  protected CharSequence _projectOn(final Choice c, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _contains = this.parts.partsChoice(c).contains(r);
      if (_contains) {
        {
          if ((Objects.equal(c.getBranches().get(0).getReceiver(), r) || Objects.equal(c.getBranches().get(0).getSender(), r))) {
            _builder.append("choice at ");
            String _name = this.parts.roleSet(c.getRole()).getName();
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
                Object _projectOn = this.projectOn(c.getBranches().get(i), r);
                _builder.append(_projectOn, "\t");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
              }
            }
          } else {
            CharSequence _merge = MergeUtil.merge(c, r);
            _builder.append(_merge);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }

  public CharSequence safeProjectOn(final Choice c, final Role r) {
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
        CharSequence _projectOn = this.projectOn(c.getBranches().get(i), r);
        _builder.append(_projectOn, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }

  protected CharSequence _projectOn(final Recursion rec, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _contains = this.parts.partsRecursion(rec).contains(r);
      boolean _not = (!_contains);
      if (_not) {
        _builder.append("End");
        _builder.newLine();
      } else {
        {
          boolean _isRecVariableInRecursion = Util.isRecVariableInRecursion(rec);
          if (_isRecVariableInRecursion) {
            Object _projectOn = this.projectOn(rec.getRecProtocol(), r);
            _builder.append(_projectOn);
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("rec ");
            String _name = rec.getName();
            _builder.append(_name);
            _builder.append(": {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            Object _projectOn_1 = this.projectOn(rec.getRecProtocol(), r);
            _builder.append(_projectOn_1, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }

  protected CharSequence _projectOn(final CloseRecursion recEnd, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("loop ");
    String _name = recEnd.getRecursionVariable().getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  /**
   * (for \ud835\udc65 : ⟨R, q⟩ G1; G2) ↾\ud835\udf0c R = G2 ↾\ud835\udf0c R 							if R ̸∈ Parts(G1, \ud835\udf0c)
   * (for \ud835\udc65 : ⟨R, q⟩ G1; G2) ↾\ud835\udf0c q = for \ud835\udc65 : ⟨R, q⟩ (G1 ↾\ud835\udf0c[\ud835\udc65↦→R] q); (G2 ↾\ud835\udf0c q )
   * (for \ud835\udc65 : ⟨R, q⟩ G1; G2) ↾\ud835\udf0c R = Seq(G1 ↾\ud835\udf0c[\ud835\udc65↦→R] R‘, G2 ↾\ud835\udf0c R ) 		otherwise
   */
  protected CharSequence _projectOn(final ForEach each, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _contains = this.parts.partsFor(each).contains(r);
      boolean _not = (!_contains);
      if (_not) {
        Object _projectOn = this.projectOn(each.getProtocol(), r);
        _builder.append(_projectOn);
        _builder.newLineIfNotEmpty();
      } else {
        {
          RoleOne _refRole = each.getRefRole();
          boolean _equals = Objects.equal(_refRole, r);
          if (_equals) {
            _builder.append("foreach role ");
            String _name = each.getLoopRole().getName();
            _builder.append(_name);
            _builder.append(":<");
            String _name_1 = each.getRoleset().getName();
            _builder.append(_name_1);
            _builder.append(",");
            String _name_2 = each.getRefRole().getName();
            _builder.append(_name_2);
            _builder.append(">{");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            Object _projectOn_1 = this.projectOn(each.getForBody(), r);
            _builder.append(_projectOn_1, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("};");
            _builder.newLine();
            Object _projectOn_2 = this.projectOn(each.getProtocol(), r);
            _builder.append(_projectOn_2);
            _builder.newLineIfNotEmpty();
          } else {
            {
              RoleSet _roleset = each.getRoleset();
              boolean _equals_1 = Objects.equal(r, _roleset);
              if (_equals_1) {
                CharSequence _seqOn = this.seqOn(each.getForBody(), each.getLoopRole(), each.getProtocol());
                _builder.append(_seqOn);
                _builder.newLineIfNotEmpty();
              } else {
                CharSequence _seqOn_1 = this.seqOn(each.getForBody(), r, each.getProtocol());
                _builder.append(_seqOn_1);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }

  protected CharSequence _projectOn(final EndProtocol end, final Role r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("End");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _seqOn(final Protocol protocol, final Role role, final Protocol p) {
    StringConcatenation _builder = new StringConcatenation();
    Object _seqOn = this.seqOn(protocol.getBegin(), role, p);
    _builder.append(_seqOn);
    return _builder;
  }

  protected CharSequence _seqOn(final Message m, final Role r, final Protocol p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((m instanceof MessageNormal)) {
        {
          String _name = ((MessageNormal)m).getSender().getName();
          String _name_1 = r.getName();
          boolean _equals = Objects.equal(_name, _name_1);
          if (_equals) {
            String _name_2 = ((MessageNormal)m).getMessageType().getName();
            _builder.append(_name_2);
            _builder.append("(");
            CharSequence _printPayload = this.printPayload(((MessageNormal)m).getPayload());
            _builder.append(_printPayload);
            _builder.append(") to ");
            String _name_3 = ((MessageNormal)m).getReceiver().getName();
            _builder.append(_name_3);
            _builder.append(".");
            _builder.newLineIfNotEmpty();
          } else {
            {
              String _name_4 = ((MessageNormal)m).getReceiver().getName();
              String _name_5 = r.getName();
              boolean _equals_1 = Objects.equal(_name_4, _name_5);
              if (_equals_1) {
                String _name_6 = ((MessageNormal)m).getMessageType().getName();
                _builder.append(_name_6);
                _builder.append("(");
                CharSequence _printPayload_1 = this.printPayload(((MessageNormal)m).getPayload());
                _builder.append(_printPayload_1);
                _builder.append(") from ");
                String _name_7 = ((MessageNormal)m).getSender().getName();
                _builder.append(_name_7);
                _builder.append(".");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        Object _seqOn = this.seqOn(((MessageNormal)m).getProtocol(), r, p);
        _builder.append(_seqOn);
        _builder.newLineIfNotEmpty();
      } else {
        {
          String _name_8 = m.getSender().getName();
          String _name_9 = r.getName();
          boolean _equals_2 = Objects.equal(_name_8, _name_9);
          if (_equals_2) {
            _builder.append("QUIT() to ");
            String _name_10 = m.getReceiver().getName();
            _builder.append(_name_10);
            _builder.newLineIfNotEmpty();
          } else {
            {
              String _name_11 = m.getReceiver().getName();
              String _name_12 = r.getName();
              boolean _equals_3 = Objects.equal(_name_11, _name_12);
              if (_equals_3) {
                _builder.append("QUIT() from ");
                String _name_13 = m.getSender().getName();
                _builder.append(_name_13);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }

  protected CharSequence _seqOn(final Choice c, final Role r, final Protocol p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("choice at ");
    String _name = this.parts.roleSet(c.getRole()).getName();
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
        Object _seqOn = this.seqOn(c.getBranches().get(i), r, p);
        _builder.append(_seqOn, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }

  /**
   * (\ud835\udf07X .G) ↾\ud835\udf0c R = End if R ̸∈ Parts(G, \ud835\udf0c)
   * (\ud835\udf07X .G) ↾\ud835\udf0c R = G↾\ud835\udf0c R if X ̸∈ G
   * (\ud835\udf07X .G) ↾\ud835\udf0c R = \ud835\udf07X .(G↾\ud835\udf0c R ) otherwise
   */
  protected CharSequence _seqOn(final Recursion rec, final Role r, final Protocol p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rec ");
    String _name = rec.getName();
    _builder.append(_name);
    _builder.append(": {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Object _seqOn = this.seqOn(rec.getRecProtocol(), r, p);
    _builder.append(_seqOn, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _seqOn(final ForEach f, final Role r, final Protocol p) {
    StringConcatenation _builder = new StringConcatenation();
    Object _projectOn = this.projectOn(f, this.parts.roleSet(r));
    _builder.append(_projectOn);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  protected CharSequence _seqOn(final CloseRecursion close, final Role r, final Protocol p) {
    StringConcatenation _builder = new StringConcatenation();
    Object _projectOn = this.projectOn(close, r);
    _builder.append(_projectOn);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  protected CharSequence _seqOn(final EndProtocol end, final Role r, final Protocol p) {
    StringConcatenation _builder = new StringConcatenation();
    Object _projectOn = this.projectOn(p, this.parts.roleSet(r));
    _builder.append(_projectOn);
    _builder.newLineIfNotEmpty();
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
    } else if (c instanceof EndProtocol) {
      return _projectOn((EndProtocol)c, r);
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

  public CharSequence seqOn(final EObject c, final Role r, final Protocol p) {
    if (c instanceof Choice) {
      return _seqOn((Choice)c, r, p);
    } else if (c instanceof CloseRecursion) {
      return _seqOn((CloseRecursion)c, r, p);
    } else if (c instanceof EndProtocol) {
      return _seqOn((EndProtocol)c, r, p);
    } else if (c instanceof ForEach) {
      return _seqOn((ForEach)c, r, p);
    } else if (c instanceof Message) {
      return _seqOn((Message)c, r, p);
    } else if (c instanceof Protocol) {
      return _seqOn((Protocol)c, r, p);
    } else if (c instanceof Recursion) {
      return _seqOn((Recursion)c, r, p);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c, r, p).toString());
    }
  }
}
