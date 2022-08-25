public class DeuxiemeCours {
    public DeuxiemeCours() {// alt-Insert
        afficherTexte();
        faireOperationArithmetique();
        faireDifferenteOperationArithmetique();

        faireUneAddition(3, 5);
        faireUneAddition(3, -3);
        faireUneAddition(2, 1000);

        faireUneSoustraction(3, 1);
        faireUneSoustraction(3, -10);

        faireUneDivision(4, 2);
        faireUneDivision(4, 3);
    }

    private void faireUneDivision(int numerateur, int denominateur) {
        System.out.println("faireUneDivision(int numerateur, int denominateur)");
        double quotien;

        quotien = (double) numerateur / denominateur;  // ici, la division des 2 entiers doit se faire comme des réels, donc on fait un cast

        System.out.println(numerateur + " / " + denominateur + " = " + quotien);
    }

    private void faireUneSoustraction(int nb1, int nb2) {
        System.out.println("faireUneSoustraction(int nb1, int nb2)");
        int diffence = nb1 - nb2;

        System.out.println(nb1 + " - " + nb2 + " = " + diffence);
    }

    private void faireUneAddition(int nb1, int nb2) {
        int somme; //déclaration d'une variable local
        System.out.println("faireUneAddition(int nb1, int nb2)");
        somme = nb1 + nb2;
        System.out.println(nb1 + " + " + nb2 + " = " + somme);
    }

    private void faireDifferenteOperationArithmetique() {
        System.out.println("faireDifferentOperationArithmetique()");
        System.out.println("2 x 4 = " + (2 * 4));
        System.out.println("4 - 1 = " + (4 - 1));
        System.out.println("4 / 2 = " + (4 / 2));
        System.out.println("4 / 3 = " + (4 / 3));  //division entière
        System.out.println("4 / 3 = " + (4.0 / 3.0)); //division de réel
        System.out.println("3 + 2 x 4 = " + (3 + 2 * 4));
        System.out.println("3 + (2 x 4) = " + (3 + (2 * 4)));
    }

    private void faireOperationArithmetique() {
        System.out.println("faireOperationArithmetique()");
        System.out.println("2 + 4 = ");
        System.out.println("2 + 4" + " = "); // on fait la concaténation de 2 chaines de caractères
        System.out.println(2 + 4);
        System.out.println("2 + 4 = " + 2 + 4);  // ici le + est vu comme une concaténation de chaines.
        System.out.println("2 + 4 = " + (2 + 4));  // ici le + est vu comme une addition 2 + 4 est calculé avant.
    }

    private void afficherTexte() {
        System.out.println("Bienvenue dans le 2e cours!");
    }

    public static void main(String[] args) {
        new DeuxiemeCours();
    }
}
