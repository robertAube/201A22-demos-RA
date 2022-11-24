package cours24_equals;

/**
 * @author Robert Aubé
 * @version 1.0 (Date de création: 2022-11-20)
 */
public class TestsEquals {
    public TestsEquals() {
        testsEquals1();
    }

    private void testsEquals1() {
        Pizza p1 = new Pizza(1, 1, "rouge", 2);
        Pizza p2 = new Pizza(1, 1, "rouge", 2);
        Pizza p3 = new Pizza(1, 1, "Rouge", 2);
        Object o;

        o = p1;

        System.out.println("1- " + (o == p1)); // true
        System.out.println("2- " + (p1 == p2)); // false : adresse différente ou instance différente
        System.out.println("3- " + (p1.equals(p2))); //false si on utilise celui de Object : adresse différente ou instance différente
        System.out.println("4- " + (p1.equals(p3))); //false si on utilise celui de Object : adresse différente ou instance différente

    }

    public static void main(String[] args) {
        new TestsEquals();
    }
}
