public class CoursDebug {
    public CoursDebug() {
        afficherNbPommmeParPersonne(5, 2);
        afficherNbPommmeParPersonne(5, 1);
        afficherNbPommmeParPersonne(5, 3);
        afficherNbPommmeParPersonne(13, 3);
   //     afficherNbPommmeParPersonne(13, 0);

        afficherSurfaceRectangle(3, 1);
        afficherSurfaceRectangle(4, 2);
    }

    private void afficherSurfaceRectangle(int largeur, int longeur) {
        int surface;
        String strInfoRectange;

        surface = largeur * longeur* longeur;

        strInfoRectange = "Un rectangle dont la largeur est " + largeur;
        strInfoRectange += " et la longueur est " + longeur;
        strInfoRectange += " a une surface de " + surface + ".";

        System.out.println(strInfoRectange);
//        Un rectangle dont la largeur est 3 et la longueur est 5 a une surface de 15.
    }

    private void afficherNbPommmeParPersonne(int nbPomme, int nbPersonne) {
        int nbPommeParPersonne;
        float floatNbPommeParPersonne;

        nbPommeParPersonne = nbPomme / nbPersonne; //division entière
        floatNbPommeParPersonne = (float) nbPomme / nbPersonne; //cast pour forcer java à faire l'opération avec float

        System.out.println("Avec " + nbPomme + " pommes pour " + nbPersonne + " personnes, chacun aura " + nbPommeParPersonne + " pommes. (" + floatNbPommeParPersonne + ")");
    }

    public static void main(String[] args) {
        new CoursDebug();
    }
}
