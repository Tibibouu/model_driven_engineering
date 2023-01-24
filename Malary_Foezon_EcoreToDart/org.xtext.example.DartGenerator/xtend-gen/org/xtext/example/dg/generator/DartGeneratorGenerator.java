/**
 * generated by Xtext 2.28.0
 */
package org.xtext.example.dg.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import malary_Foezon_EcoreToDart.BDD;
import malary_Foezon_EcoreToDart.Collection;
import malary_Foezon_EcoreToDart.TypeBDD;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DartGeneratorGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final BDD BDDObject = IterableExtensions.<BDD>head(Iterables.<BDD>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), BDD.class));
    boolean _matched = false;
    if (Objects.equal(BDDObject, TypeBDD.FIREBASE)) {
      _matched=true;
      Iterable<Collection> _filter = Iterables.<Collection>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Collection.class);
      for (final Collection CollectionObjects : _filter) {
        String _titre = CollectionObjects.getTitre();
        String _plus = (_titre + ".dart");
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("import ...");
        _builder.newLine();
        _builder.append("import myApp.");
        String _titre_1 = CollectionObjects.getTitre();
        String _plus_1 = (_builder.toString() + _titre_1);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.newLine();
        _builder_1.append("abstract class ... implements ... {");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("static Serializer<");
        String _plus_2 = (_plus_1 + _builder_1);
        String _titre_2 = CollectionObjects.getTitre();
        String _plus_3 = (_plus_2 + _titre_2);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("> get serializer => _$");
        String _plus_4 = (_plus_3 + _builder_2);
        String _titre_3 = CollectionObjects.getTitre();
        String _plus_5 = (_plus_4 + _titre_3);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("RecordSerializer;");
        _builder_3.newLine();
        _builder_3.append("                      \t\t");
        _builder_3.newLine();
        _builder_3.append("                      \t\t");
        _builder_3.append("@BuiltValueField(wireName: \'display_name\')");
        _builder_3.newLine();
        _builder_3.append("                      \t\t  ");
        _builder_3.append("String? get displayName;");
        _builder_3.newLine();
        _builder_3.append("                      \t\t");
        _builder_3.append("...");
        _builder_3.newLine();
        _builder_3.append("                      \t");
        _builder_3.append("}");
        _builder_3.newLine();
        String _plus_6 = (_plus_5 + _builder_3);
        fsa.generateFile(_plus, _plus_6);
      }
    }
    if (!_matched) {
    }
    boolean _equals = Objects.equal(BDDObject, TypeBDD.FIREBASE);
    if (_equals) {
    }
  }
}
