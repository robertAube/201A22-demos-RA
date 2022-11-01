package cours18_pizza_oo;

public class JouerAvecPizza {
    public JouerAvecPizza() {

        //   testerLesConstantes();
        // jouer1();
        // jouer2();
        //    testerSetXYV1();
        testerSetXYV2();
    }

    private void testerSetXYV2() {
        Pizza p1;
        int x = 20;
        int y = 300;

        //   p1 = new Pizza(x,y, 22, "Jaune");
        System.out.println(Pizza.estValide(x, y));

        if (Pizza.estValide(x, y)) {
            p1 = new Pizza(x,y, 22, "Jaune");
        }


    }

    private void testerSetXYV1() {
        Pizza p1 = new Pizza(0, 0, 2, "Verte");
        Pizza p2 = new Pizza(2, 6, 2, "Jaune");

        System.out.println(p1);
        System.out.println(p2);

        p2.setXY(0, 1000);
        System.out.println(p2);


    }

    private void testerLesConstantes() {
        System.out.println(Pizza.LIMITE_INFERIEURE);
        System.out.println(Pizza.LIMITE_SUPERIEURE);
        System.out.println(Math.PI);
    }

    private void jouer2() {
        Pizza[] tabPizza;

        tabPizza = new Pizza[5];

        for (int i = 0; i < tabPizza.length; i++) {
            tabPizza[i] = new Pizza(i, i + 2, 1, "bleu");
        }

        for (int i = 0; i < tabPizza.length; i++) {
            System.out.println(tabPizza[i]);
        }

        for (int i = 0; i < tabPizza.length; i++) {
            tabPizza[i].avancerX();
        }

        for (int i = 0; i < tabPizza.length; i++) {
            System.out.println(tabPizza[i]);
        }
    }

    private void jouer1() {
        Pizza p1;

        p1 = new Pizza(0, 0, 2, "jaune"); //création d'une instance de la classe Pizza

        System.out.println(p1);
    }

    public static void main(String[] args) {
        new JouerAvecPizza();
    }
}
