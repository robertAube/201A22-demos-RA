public class Cours16_Tableau {
    public Cours16_Tableau() {
        //       jouerAvecTableau1();
        //jouerAvecTableau2();
     //   jouerAvecTableau3();
       // testerInitialiserTableau();
        testerCalculerMoyenne();
    }

    private void testerCalculerMoyenne() {
        int[] tabNb = {1, 3, 3, 1}; //initalisation avec une constante tableau
        double moyenne;

        moyenne = calculerMoyenne(tabNb);

        afficherTableau(tabNb);
        System.out.println(moyenne);

        System.out.println(calculerMoyenne(new int[] {1, 2, 3}));
    }

    private double calculerMoyenne(int[] tabNb) {
        int somme = calculerSomme(tabNb);

        return somme / tabNb.length;
    }

    private int calculerSomme(int[] tabNb) {
        int somme = 0;
        for (int i = 0; i < tabNb.length; i++) {
            somme += tabNb[i];
        }
        return somme;
    }

    private void testerInitialiserTableau() {
        int [] tabNb1 = initialiserTableau(5, 2);

        afficherTableau(tabNb1);
    }

    private int[] initialiserTableau (int longueur, int valeurInit) {
        int [] tabRetour;
        tabRetour = new int[longueur];
        for (int i = 0; i < tabRetour.length; i++) {
            tabRetour[i] = valeurInit;
        }

        return tabRetour;
    }

    private void jouerAvecTableau3() {
        int[] tabNb = {2, 4, 5, 3}; //initalisation avec une constante tableau
        int i = 2;

        System.out.println(i);
        doublerValeur(i);
        System.out.println(i);

        afficherTableau(tabNb);
        doublerValeurTab(tabNb);
        afficherTableau(tabNb);

    }

    private void doublerValeurTab(int[] tabNb) {
        for (int i = 0; i < tabNb.length; i++) {
            tabNb[i] *= 2;
        }
    }

    private void doublerValeur(int a) {
        a *= 2;
    }

    private void jouerAvecTableau2() {
        int[] tabNb = {2, 4, 5, 3}; //initalisation avec une constante tableau

        afficherTableau(tabNb);

        tabNb[0] = 17;

        afficherTableau(tabNb);
    }

    private void jouerAvecTableau1() {

        int[] tabNb; //	Déclaration d’un tableau

        tabNb = new int[3]; //	Initialisation d’un tableau -- instanciation à cause du new

        //	Écrire une valeur dans un tableau
        tabNb[0] = 55;
        tabNb[1] = 16;
        tabNb[2] = 12;
        // tabNb[3] = 17; //java.lang.ArrayIndexOutOfBoundsException

        System.out.println("tabNb[0] = " + tabNb[0]);// Lire une valeur dans un tableau
        System.out.println("tabNb[1] = " + tabNb[1]);// Lire une valeur dans un tableau
        System.out.println("tabNb[2] = " + tabNb[2]);// Lire une valeur dans un tableau

        for (int i = 0; i < tabNb.length; i++) {
            System.out.println("tabNb[" + i + "] = " + tabNb[i]);
        }

        afficherTableau(tabNb);
    }

    public static void afficherTableau(int[] tabNb) {
        System.out.print("{");
        for (int i = 0; i < tabNb.length; i++) {
            System.out.print((i == 0 ? "" : ", ") + tabNb[i]);
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        new Cours16_Tableau();  //instanciation à cause du new
    }
}
