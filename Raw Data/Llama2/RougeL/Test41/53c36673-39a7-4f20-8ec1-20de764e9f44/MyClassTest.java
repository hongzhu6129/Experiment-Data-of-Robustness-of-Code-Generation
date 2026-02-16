import org.junit.Test;

public class MyClassTest {

    @Test
    public void testGetter() {
        MyClass myClass = new MyClass();
        myClass.setValue(10);
        assertEquals(10, myClass.getValue());
    }

    @Test
    public void testConstructorWithNull() {
        try {
            new MyClass(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }
}
