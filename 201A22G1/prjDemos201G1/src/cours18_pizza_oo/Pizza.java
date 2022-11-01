package cours18_pizza_oo;

public class Pizza {
    //constante: valeur nommée qui ne peut pas changée. Le nom d'une constante est toujours en MAJUSCULE.
    //static : appartient à la classe: durée de vie infinie!
    //final: la variable doit être initialisée et ne pourra jamais être changée.

    public static final int LIMITE_SUPERIEURE = 50; //défini pour mon x et mon y
    public static final int LIMITE_INFERIEURE = 0; //défini pour mon x et mon y

    //attributs ou variables d'instance : Existe seulement si j'ai une instance
    private int x;
    private int y;
    private int vitesse;
    private String couleur;

    Pizza(int x, int y, int vitesse, String couleur) {
        setXY(x, y);
        setVitesse(vitesse);
        setCouleur(couleur);
    }

    //get = accesseur (getter)
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getCouleur() {
        return couleur;
    }

    //mutateurs : c'est les sets (setter)
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    //manque la validation pour faire correctement l'encapsulation
    public void setXY(int x, int y) {
        if (estValide(x, y)) {
            this.x = x; //this = instance
            this.y = y;
        } else {
            throw new IllegalArgumentException("x ou y invalide (" + x + ", " + y + ")");
        }
    }

    public static boolean estValide(int x, int y) {
        return LIMITE_INFERIEURE <= x && x <= LIMITE_SUPERIEURE
                && LIMITE_INFERIEURE <= y && y <= LIMITE_SUPERIEURE;
    }

    public void avancerX() {
        this.x += this.vitesse;
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
