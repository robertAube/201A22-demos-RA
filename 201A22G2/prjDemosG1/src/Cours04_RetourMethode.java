public class Cours04_RetourMethode {
    public Cours04_RetourMethode() {
        testerCalculerSurfaceRectangle();

        afficherSurfaceRectangle(2, 3);

        afficherNbPommmeParPersonne(4,2);
    }

    private void afficherNbPommmeParPersonne(int nbPomme, int nbPersonne) {
        float floatNbPommeParPersonne;

        floatNbPommeParPersonne = calculerNBPommeParPersonne(nbPomme, nbPersonne); //Utiliser une méthode à la place

        System.out.println("Avec " + nbPomme + " pommes pour " + nbPersonne + " personnes, chacun aura " + floatNbPommeParPersonne + " pommes.");
    }

    private float calculerNBPommeParPersonne(int nbPomme, int nbPersonne) {
        float nbPommeParPersonne;

        nbPommeParPersonne = nbPomme / nbPersonne;

        return nbPommeParPersonne;
    }

    private void afficherSurfaceRectangle(int largeur, int longeur) {
        int surface;
        String strInfoRectange;

        surface = calculerSurfaceRectangle(largeur, longeur);

        strInfoRectange = "Un rectangle dont la largeur est " + largeur;
        strInfoRectange += " et la longueur est " + longeur;
        strInfoRectange += " a une surface de " + surface + ".";

        System.out.println(strInfoRectange);
//        Un rectangle dont la largeur est 3 et la longueur est 5 a une surface de 15.
    }
    private void testerCalculerSurfaceRectangle() { //void indique que la méthode retourne rien
        System.out.println("testerCalculerSurface()");
        int surface;
        int largeur;
        int longeur;

        largeur = 2;
        longeur = 7;
        surface = calculerSurfaceRectangle(largeur, longeur);
        System.out.println(surface == 14); // ici je compare surface avec 14 (on regarde si surface = 14).
        largeur = 0;
        longeur = 7;
        surface = calculerSurfaceRectangle(largeur, longeur);
        System.out.println(surface == 0); // ici je compare surface avec 14 (on regarde si surface = 14).
        largeur = 2;
        longeur = 1;
        surface = calculerSurfaceRectangle(largeur, longeur);
        System.out.println(surface == 2); // ici je compare surface avec 14 (on regarde si surface = 14).
        largeur = 2;
        longeur = 0;
        surface = calculerSurfaceRectangle(largeur, longeur);
        System.out.println(surface == 0); // ici je compare surface avec 14 (on regarde si surface = 14).
    }

    private int calculerSurfaceRectangle(int largeur, int longueur) { //int est le type de retour
        int surface;

        surface = largeur * longueur;

        return surface;
    }

    public static void main(String[] args) {
        new Cours04_RetourMethode();
    }
}
