package org.xtext.globalTypes.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.globalTypes.myDsl.Definition;
import org.xtext.globalTypes.myDsl.LocalProtocol;

@SuppressWarnings("all")
public class JadescriptGenerator {
  public CharSequence project(final LocalProtocol lp, final EList<Definition> definitions) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _printOntology = this.printOntology(lp, definitions);
    _builder.append(_printOntology);
    _builder.newLineIfNotEmpty();
    return _builder;
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
            {
              EList<String> _types = d.getTypes();
              boolean _hasElements = false;
              for(final String t : _types) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(", ", "\t");
                }
                _builder.append(t, "\t");
              }
            }
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
                {
                  EList<String> _types_1 = d.getTypes();
                  boolean _hasElements_1 = false;
                  for(final String t_1 : _types_1) {
                    if (!_hasElements_1) {
                      _hasElements_1 = true;
                    } else {
                      _builder.appendImmediate(", ", "\t");
                    }
                    _builder.append(t_1, "\t");
                  }
                }
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
}
