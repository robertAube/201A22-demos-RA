package cours18_Pizza_OO;

public class JouerAvecPizza {
    public JouerAvecPizza() {
        test1();

        test2();
    }

    private void test2() {
        Pizza [] tabPiz = new Pizza[5];

        for (int i = 0; i < tabPiz.length; i++) {
            tabPiz[i] = new Pizza(i+10, i * 2, "verte", 2);
        }
        for (int i = 0; i < tabPiz.length; i++) {
            System.out.println(tabPiz[i]);
        }
        for (int i = 0; i < tabPiz.length; i++) {
            tabPiz[i].avancerX();
        }
        for (int i = 0; i < tabPiz.length; i++) {
            System.out.println(tabPiz[i]);
        }
    }

    private void test1() {
        Pizza p = new Pizza(1,1,"rouge", 2);

        System.out.println(p);

        p.avancerX();

        System.out.println(p);
    }

    public static void main(String[] args) {
        new JouerAvecPizza();
    }
}
