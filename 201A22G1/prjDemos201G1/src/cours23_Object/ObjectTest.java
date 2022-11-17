package cours23_Object;

public class ObjectTest {
    public ObjectTest() {
     //   demoObject();
        demoObjectTableau();
    }

    private void demoObjectTableau() {
        Object[] tabObj;
        Coordonnee c = new Coordonnee();

        tabObj = new Object[3];

        tabObj[0] = new Pizza(0, 100, 2, "grise");
        tabObj[1] = new Pizza(200, 10, 1, "jaune");
        tabObj[2] = new Coordonnee(2,4);

        for (int i = 0; i < tabObj.length; i++) {
            System.out.println(tabObj[i]);
        }
    }

    private void demoObject() {
        Pizza p = new Pizza(0, 100, 2, "grise");
        Coordonnee c = new Coordonnee();
        Object o;

        System.out.println(p);
        o = p;
        p.avancerX();
        // o.avancerX(); ne peut pas fonctionner avancerX() n'est pas définit dans Object
        //utilise le toString() de la même instance créé à la ligne 9
        System.out.println(o.toString());
        System.out.println(o);
        System.out.println(p);

        ((Pizza) o).avancerX();

        System.out.println(p);

        o = c;

        ((Pizza) o).avancerX();// provoque ClassCastException parce qu'il n'y pas de méthode avancerX dans une coordonnée.
    }

    public static void main(String[] args) {
        new ObjectTest();
    }
}
