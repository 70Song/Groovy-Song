package groovy.bugs

/**
 * @author Guillaume Laforge
 */
class Groovy4457GenericTypeDeclarationLeakTest extends GroovyTestCase {

    void testLeak() {
        assertScript """
            class A<String> {}

            class B {
                void foo(String s) {}
            }

            // use the name to check the class, since the error was that String was seen as
            // a symbol resolved to Object, not as the class String, thus a ... == String would
            // not have failed
            assert B.declaredMethods.find { it.name == "foo" }.parameterTypes[0].name.contains("String")
        """
    }

    void testLeakWithInnerClass() {
        assertScript """
            class A<String> {
                static class B {
                    void foo(String s) {}
                }
            }

            assert A.B.declaredMethods.find { it.name == "foo" }.parameterTypes[0].name.contains("String")
        """
    }
}
