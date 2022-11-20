package cours23_equals;

/**
 * @author Robert Aubé
 * @version 1.0 (Date de création: 2022-11-20)
 */
public class TestsEquals {
    public TestsEquals() {
        testsEquals1();
    }

    private void testsEquals1() {
        Pizza p1 = new Pizza(1,1,"rouge",2);
        Pizza p2 = new Pizza(1,1,"rouge",2);
        Object o;

        o = p1;

        System.out.println(o == p1);
    }

    public static void main(String[] args) {
        new TestsEquals();
    }
}
