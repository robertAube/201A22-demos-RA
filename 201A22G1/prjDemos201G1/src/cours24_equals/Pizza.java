package cours24_equals;

public class Pizza {
    //constante : valeur nommée qui ne peut pas être changée. Le nom doit être en majuscule.
    //static : appartient à classe : durée vie infinie!
    //final : la variable est intialisée et ne pourra jamais être changée

    public static final int VITESSE_MIN = 0;
    public static final int VITESSE_MAX = 50;

    // vitesse est entre 0 et 50

    //attributs ou variables d'instance
    //N'existe pas sans instanciation
    private Coordonnee position;

    private int vitesse;
    private String couleur;

    Pizza(int x, int y, String couleur, int vitesse) {
//        this.x = x; à ne pas faire...
//        this.y = y;
        position = new Coordonnee(x, y);
        this.couleur = couleur;
        setVitesse(vitesse);
        String s;
    }

    //mutateur
    public void setVitesse(int vitesse) {
        if (estValideVitesse(vitesse)) {
            this.vitesse = vitesse;
        } else {
            throw new RuntimeException("Vitesse " + vitesse + " est invalide.");
        }
    }

    public static boolean estValideVitesse(int vitesse) {
        return VITESSE_MIN <= vitesse && vitesse <= VITESSE_MAX;
    }

    //accesseur
    public int getX() {
        return position.getX();
    }

    //accesseur
    public int getY() {
        return position.getY();
    }

    //accesseur
    public int getVitesse() {
        return vitesse;
    }

    //accesseur
    public String getCouleur() {
        return couleur;
    }

    //surcharge : 2 méthodes avec le même nom mais des arguments différents. On dira aussi que la signature est différente.
    public void setXY(int x, int y) {
        position.move(x, y);
    }

    public void setXY(Coordonnee newPosition) {
        if (newPosition != null) {
            position = newPosition;
        } else {
            throw new NullPointerException("La coordonnée n'est pas une instance");
        }
    }

    public static boolean estValideXY(int x, int y) {
        boolean estV;
        estV = Coordonnee.estValideX(x) && Coordonnee.estValideY(y);

        return estV;
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

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
