public class Cours03_Debug {
    public Cours03_Debug() {
        AfficherNbPommmeParPersonne(5,2);
        AfficherNbPommmeParPersonne(5,1);
     //   AfficherNbPommmeParPersonne(5,0);
        AfficherSurfaceRectangle(5, 3);
    }

    private void AfficherSurfaceRectangle(int longueur, int largeur) {
        int surface;
        surface = longueur * largeur;

        System.out.println("Un rectangle dont la largeur est " + largeur + " et la longueur est "+ longueur+" a une surface de " + surface + ".");
    }

    private void AfficherNbPommmeParPersonne(int nbPomme, int nbPersonne) {
        float nbPommeParPersonne;

        nbPommeParPersonne = (float) nbPomme / nbPersonne;

        System.out.println("Avec " + nbPomme + " pommes pour " + nbPersonne + " personnes, chacun aura " + nbPommeParPersonne + " pommes.");
    }

    public static void main(String[] args) {
        new Cours03_Debug();
    }
}
