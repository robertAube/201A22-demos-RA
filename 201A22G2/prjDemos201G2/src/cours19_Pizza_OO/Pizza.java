package cours19_Pizza_OO;

public class Pizza {
    //constante : valeur nommée qui ne peut pas être changée. Le nom doit être en majuscule.
    //static : appartient à classe : durée vie infinie!
    //final : la variable est intialisée et ne pourra jamais être changée

    public static final int LIMITE_SUPERIEURE = 100; //défini pour mon x et y;
    public static final int LIMITE_INFERIEURE = 0; //défini pour mon x et y;

    public static final int VITESSE_MIN = 0;
    public static final int VITESSE_MAX = 50;

    // vitesse est entre 0 et 50

    //attributs ou variables d'instance
    //N'existe pas sans instanciation
    private int x;
    private int y;
    private int vitesse;
    private String couleur;

    Pizza(int x, int y, String couleur, int vitesse) {
//        this.x = x; à ne pas faire...
//        this.y = y;
        setXY(x, y);
        this.couleur = couleur;
        setVitesse(vitesse);
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
        return x;
    }

    //accesseur
    public int getY() {
        return y;
    }

    //accesseur
    public int getVitesse() {
        return vitesse;
    }

    //accesseur
    public String getCouleur() {
        return couleur;
    }

    public void setXY(int x, int y) {
        if (estValideXY(x, y)) {
            this.x = x;
            this.y = y; //this = l'instance de l'objet
        } else {
            throw new RuntimeException("X ou Y est invalide : X = " + x + ", Y = " + y);
        }
    }

    public static boolean estValideXY(int x, int y) {
        boolean estV;
        estV = LIMITE_INFERIEURE <= x && x <= LIMITE_SUPERIEURE
                && LIMITE_INFERIEURE <= y && y <= LIMITE_SUPERIEURE;

        return estV;
    }

    public void avancerX() {
        x += vitesse;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "x=" + x +
                ", y=" + y +
                ", vitesse=" + vitesse +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
