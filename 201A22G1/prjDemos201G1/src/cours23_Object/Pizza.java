package cours23_Object;

public class Pizza {
    //constante: valeur nommée qui ne peut pas changée. Le nom d'une constante est toujours en MAJUSCULE.
    //static : appartient à la classe: durée de vie infinie!
    //final: la variable doit être initialisée et ne pourra jamais être changée.
    public static final int VITESSE_MIN = 0;

    public static final int VITESSE_MAX = 50;
    //attributs ou variables d'instance : Existe seulement si j'ai une instance
    private Coordonnee position;
    private int vitesse;
    private String couleur;

    Pizza(int x, int y, int vitesse, String couleur) {
        position = new Coordonnee();
        setXY(x, y);
        setVitesse(vitesse);
        setCouleur(couleur);
    }

    //get = accesseur (getter)
    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }

    public String getCouleur() {
        return couleur;
    }

    //mutateurs : c'est les sets (setter)
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setVitesse(int vitesse) {
        if (estValideVitesse(vitesse)) {
            this.vitesse = vitesse;
        }
        else {
            throw new IllegalArgumentException("Cette vitesse est invalide : " + vitesse);
        }
    }

    private static boolean estValideVitesse(int vitesse) {
        return VITESSE_MIN <= vitesse && vitesse <= VITESSE_MAX;
    }

    //manque la validation pour faire correctement l'encapsulation
    public void setXY(int x, int y) {
        position.move(x,y);
    }

    //Surcharge : même nom de méthode mais arguments différents en nombre et ou en type
    public void setXY(Coordonnee position) {
        this.position = position;
    }

    public static boolean estValide(int x, int y) {
        return Coordonnee.estValideX(x) && Coordonnee.estValideY(y);
    }

    public void avancerX() {
        position.translate(vitesse, 0);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "x=" + position.getX() +
                ", y=" + position.getY() +
                ", vitesse=" + vitesse +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
