package org.xtext.globalTypes.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.globalTypes.myDsl.Definition;
import org.xtext.globalTypes.myDsl.LocalProtocol;
import org.xtext.globalTypes.myDsl.RoleSet;

@SuppressWarnings("all")
public class JadescriptGenerator {
  private ArrayList<CharSequence> behList;

  private String agentString;

  private PayloadNames payloadNames = new PayloadNames();

  public CharSequence project(final LocalProtocol lp, final EList<Definition> definitions) {
    String _string = new String();
    this.agentString = _string;
    ArrayList<CharSequence> _arrayList = new ArrayList<CharSequence>();
    this.behList = _arrayList;
    this.payloadNames.init(definitions);
    this.agentString = this.printOntology(lp, definitions).toString();
    this.behList.add("AAA");
    this.behList.add("BBB");
    this.behList.add("CCC");
    CharSequence _createAgent = this.createAgent(lp);
    String _plus = ((this.agentString + "\n\n") + _createAgent);
    this.agentString = _plus;
    for (final CharSequence b : this.behList) {
      String _string_1 = b.toString();
      String _plus_1 = ((this.agentString + "\n\n") + _string_1);
      this.agentString = _plus_1;
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
    String _capitalize = this.capitalize(lp.getProtocolName());
    _builder.append(_capitalize);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    List<RoleSet> rolesetList = EcoreUtil2.<RoleSet>getAllContentsOfType(lp.getRoles(), RoleSet.class);
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = rolesetList.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        {
          for(final RoleSet r : rolesetList) {
            _builder.append("\t");
            _builder.append("property ");
            String _name_1 = r.getName();
            _builder.append(_name_1, "\t");
            _builder.append("List as list of aid");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("on create do");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("activate firstBehaviour");
    _builder.newLine();
    return _builder;
  }

  public String capitalize(final String string) {
    return string;
  }
}
