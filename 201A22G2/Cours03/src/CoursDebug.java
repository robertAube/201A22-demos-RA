public class CoursDebug {
    public CoursDebug() {
        AfficherNbPommmeParPersonne(5,2);
        AfficherNbPommmeParPersonne(5,1);
        AfficherNbPommmeParPersonne(5,3);
        AfficherNbPommmeParPersonne(13,3);
//        AfficherNbPommmeParPersonne(13,0); //Génère une exception en raison de la division par 0.
        AfficherSurfaceRectangle(5, 3);
    }

    private void AfficherSurfaceRectangle(int longueur, int largeur) {
        int surface;
        surface = longueur * largeur;

        System.out.println("Un rectangle dont la largeur est " + largeur + " et la longueur est "+ longueur+" a une surface de " + surface + ".");
    }

    private void AfficherNbPommmeParPersonne(int nbPomme, int nbPersonne) {
        int nbPommeParPersonne;
        float floatNbPommeParPersonne;

        nbPommeParPersonne =  nbPomme / nbPersonne; //division entière
        floatNbPommeParPersonne = (float) nbPomme / nbPersonne; //division réelle

        System.out.println("Avec " + nbPomme + " pommes pour " + nbPersonne + " personnes, chacun aura " + nbPommeParPersonne + " pommes. (" + floatNbPommeParPersonne + ")");
    }

    public static void main(String[] args) {
        new  CoursDebug();
    }
}
