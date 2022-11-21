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
        Object o;

        o = p1;

        System.out.println("1- " + ((o == p1) == true)); //même adresse
        System.out.println("2- " + ((p1 == p2) == false)); //p1 et p2 n'est pas la même instance donc adresses différentes

        System.out.println("3- " + (p1.equals(p1) == true));
        System.out.println("4- " + (p1.equals(p2) == true));
        p2.setCouleur("RougE");
        System.out.println("5- " + (p1.equals(p2) == true));
        p2.setCouleur("Bleu");
        System.out.println("6- " + (p1.equals(p2) == false));
        p2.setCouleur("RougE");
        p2.avancerX();
        System.out.println("7- " + (p1.equals(p2) == false));
    }

    public static void main(String[] args) {
        new TestsEquals();
    }
}
