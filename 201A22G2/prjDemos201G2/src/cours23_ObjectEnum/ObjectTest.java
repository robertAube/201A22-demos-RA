package cours23_ObjectEnum;

public class ObjectTest {
    public ObjectTest() {
       // demoObject();
        demoObjectTableau();
    }

    private void demoObjectTableau() {
        Object [] tabObj;
        tabObj = new Object[4];

        tabObj[0] = new Pizza(0, 2, "grise", 2);
        tabObj[1] = new Coordonnee(2, 4);
        tabObj[2] = "Chat";
        tabObj[3] = new Pizza(11, 21, "jaune", 20);

        for (int i = 0; i < tabObj.length; i++) {
            System.out.println(tabObj[i]);
        }
    }

    private void demoObject() {
        Object o;
        Pizza p = new Pizza(10, 20,"Jaune", 2);
        Coordonnee c = new Coordonnee(2,8);

        System.out.println(p.toString());
        o = p;
        p.avancerX();
        System.out.println(p);
        System.out.println(o.toString()); //à l'exécution il prend le toString de Pizza

//        o.avancerX(); ne peut pas fonctionner car .avancerX(); n'est pas dans la classe Object
        ((Pizza)o).avancerX();

        System.out.println(p);

        o = c;

        ((Pizza)o).avancerX(); //Provoque une ClassCastException parce qu'il n'y a pas de méthode avancerX() dans Coordonnee
    }

    public static void main(String[] args) {
        new ObjectTest();
    }
}
