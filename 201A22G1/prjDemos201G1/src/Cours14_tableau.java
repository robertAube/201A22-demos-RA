public class Cours14_tableau {
    public Cours14_tableau() {
        //    jouerAvecTableau1();
        jouerAvecTableau2();
        testerInitialiserTableau();

    }

    private void testerInitialiserTableau() {
        int[] tabNb1 = initialiserTableau(6, 4);
        afficherTableau(tabNb1);
    }

    private double calculerMoyenne(int[] tab) {
        int somme = calculerSomme(tab);

        return somme / tab.length;
    }

    private int calculerSomme(int[] tab) {
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        return somme;
    }

    //	Retourner un tableau à partir d’une méthode
    private int[] initialiserTableau(int longueur, int valeurInitialisation) {
        int[] tabRetour;
        tabRetour = new int[longueur];
        for (int i = 0; i < longueur; i++) {
            tabRetour[i] = valeurInitialisation;
        }
        return tabRetour;
    }


    private void jouerAvecTableau2() {
        int[] tabNb = {2, 7, 9, 10};
        int i = 2;

        afficherTableau(tabNb);

        tabNb[1] = 17;
        afficherTableau(tabNb);

        doublerValeurTab(tabNb);

        afficherTableau(tabNb);

        doublerValeur(i);

        System.out.println(i);

        System.out.println("la somme est " + calculerSomme(tabNb));
        System.out.println("la moyenne est " + calculerMoyenne(tabNb));
    }

    private void doublerValeur(int i) {
        i *= 2;
    }

    private void jouerAvecTableau1() {
        //	Déclaration d’un tableau
        int[] tabNb;

        //	Initialisation d’un tableau
        tabNb = new int[3];

        //	Écrire une valeur dans un tableau
        tabNb[0] = 2;
        tabNb[1] = 3;
        tabNb[2] = 5;

        //	Lire une valeur dans un tableau
        System.out.println(tabNb[0] + ", " + tabNb[1] + ", " + tabNb[2]);

        for (int i = 0; i < tabNb.length; i++) {
            System.out.print(tabNb[i] + ", ");
        }
        System.out.println();

        afficherTableau(tabNb);
    }

    //	Recevoir un tableau en argument d’une méthode
    public static void afficherTableau(int[] tabNb) {
        //	Parcourir un tableau
        for (int i = 0; i < tabNb.length; i++) {
            System.out.print((i == 0 ? "" : ", ") + tabNb[i]);
        }
        System.out.println();
    }

    private void doublerValeurTab(int[] tabInt) {
        for (int i = 0; i < tabInt.length; i++) {
            tabInt[i] *= 2;
        }
    }

    public static void main(String[] args) {
        new Cours14_tableau();
    }
}
