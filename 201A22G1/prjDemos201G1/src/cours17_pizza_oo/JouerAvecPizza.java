package cours17_pizza_oo;

public class JouerAvecPizza {
    public JouerAvecPizza() {


        // jouer1();
        jouer2();
    }

    private void jouer2() {
        Pizza [] tabPizza;

        tabPizza = new Pizza[5];

        for (int i = 0; i < tabPizza.length; i++) {
            tabPizza[i] = new Pizza(i, i+2, 1, "bleu");
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

        p1 = new Pizza(0,0,2, "jaune"); //création d'une instance de la classe Pizza

        System.out.println(p1);
    }

    public static void main(String[] args) {
        new JouerAvecPizza();
    }
}
