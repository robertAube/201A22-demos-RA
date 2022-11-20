package cours20_Pizza_OO;


public class JouerAvecPizza {
    public JouerAvecPizza() {
        testerLaSurchargeDeMethode();
//        testerInstancitation1();
//        testerInstancitations2();
//        testerConstante();
//        testerValidationXY1();
//        testerValidationXY2();
//        testerValidationVitesse();
    }

    private void testerLaSurchargeDeMethode() {
        Pizza p1 = new Pizza(0,0,"Bleu", 2);

        System.out.println(p1);
        p1.setXY(1,1);
        System.out.println(p1);
        p1.setXY(new Coordonnee(3,3));


    }

    private void testerValidationVitesse() {
        Pizza p1;

        for (int vitesse = 0; vitesse <= 60; vitesse++) {
            System.out.println("Instancier avec une vitesse de " + vitesse + ": ");
            p1 = new Pizza(0,0,"verte", vitesse);
            System.out.println(p1);
        }
        // il n'y a qu'une pizza: la dernière...
    }

    private void testerValidationXY2() {
        Pizza p1;
        int x = 222;
        int y = 0;

        if (Pizza.estValideXY(x, y)) {
            p1= new Pizza(x,y,"Bleu", 2);
            System.out.println(p1);
        }
        else {
            System.out.println("x et y invalide : X = " + x + ", Y = " + y);
        }
    }
    private void testerValidationXY1() {
        Pizza p1 = new Pizza(0,0,"Bleu", 2);
        Pizza p2 = new Pizza(222,0,"Bleu", 2);

        System.out.println(p1);
        System.out.println(p2);
        p1.setXY(0, 1000);
        System.out.println(p1);
    }

    private void testerConstante() {
        //accéder une constante ou accéder quelque chose de STATIC;

        System.out.println(Coordonnee.MAX_XY);
        System.out.println(Pizza.VITESSE_MAX);
        System.out.println(Math.PI);
    }

    private void testerInstancitations2() {
        Pizza[] tabPiz = new Pizza[5];

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

    private void testerInstancitation1() {
        Pizza p = new Pizza(1,1,"rouge", 2);

        System.out.println(p);

        p.avancerX();

        System.out.println(p);
    }

    public static void main(String[] args) {
        new JouerAvecPizza();
    }
}
