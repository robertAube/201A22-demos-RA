public class Cours04 {
    public Cours04() {
//        afficherNbPommmeParPersonne(10,5);
//        afficherNbPommmeParPersonne(10,3);
//
//        testerCalculerNbPommeParPersonne();

        afficherSurfaceRectangle(1, 2);
    }

    private void afficherSurfaceRectangle(int longueur, int largeur) {
        int surface;
        String str;

        surface = calculerSurfaceRectangle(longueur, largeur);

        str = "Un rectangle dont la largeur est " + largeur;
        str += " et la longueur est " + longueur;
        str += " a une surface de " + surface + ".";

        System.out.println(str);
    }

    private int calculerSurfaceRectangle(int longueur, int largeur) {
        int surfaceRectangle;

        surfaceRectangle = longueur * largeur;

        return surfaceRectangle;
    }


    private void testerCalculerNbPommeParPersonne() {
        System.out.println("testerCalculerNbPommeParPersonne()");
        int nbPomme;
        int nbPersonne;
        float nbPommeParPersonne;

        nbPomme = 10;
        nbPersonne = 2;
        nbPommeParPersonne = calculerNbPommeParPersonne(nbPomme, nbPersonne);
        System.out.println(nbPommeParPersonne == 5); // ici, je compare nbPommeParPersonne avec 5 (or regarde si nbPommeParPeronne = 5)

        nbPomme = 1;
        nbPersonne = 1;
        nbPommeParPersonne = calculerNbPommeParPersonne(nbPomme, nbPersonne);
        System.out.println(nbPommeParPersonne == 1); // ici, je compare nbPommeParPersonne avec 5 (or regarde si nbPommeParPeronne = 5)

        nbPomme = 1;
        nbPersonne = 3;
        nbPommeParPersonne = calculerNbPommeParPersonne(nbPomme, nbPersonne);
        System.out.println(nbPommeParPersonne == ((float) 1 / 3)); // ici, je compare nbPommeParPersonne avec 5 (or regarde si nbPommeParPeronne = 5)

        nbPomme = 5;
        nbPersonne = 5;
        nbPommeParPersonne = calculerNbPommeParPersonne(nbPomme, nbPersonne);
        System.out.println(nbPommeParPersonne == 1); // ici, je compare nbPommeParPersonne avec 5 (or regarde si nbPommeParPeronne = 5)
    }

    private void afficherNbPommmeParPersonne(int nbPomme, int nbPersonne) { //void : ne retourne rien
        float floatNbPommeParPersonne;

        floatNbPommeParPersonne = calculerNbPommeParPersonne(nbPomme, nbPersonne); //division réelle

        System.out.println("Avec " + nbPomme + " pommes pour " + nbPersonne + " personnes, chacun aura " + floatNbPommeParPersonne + " pommes.");
    }

    private float calculerNbPommeParPersonne(int nbPomme, int nbPersonne) { //float : retourne un float
        float nbPommmeParPersonne = (float) nbPomme / nbPersonne;

        return nbPommmeParPersonne;
    }

    public static void main(String[] args) {
        new Cours04();
    }
}
