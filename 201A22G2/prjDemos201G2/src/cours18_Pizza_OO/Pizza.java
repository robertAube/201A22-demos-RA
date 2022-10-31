package cours18_Pizza_OO;

public class Pizza {
    //attributs ou variables d'instance
    //N'existe pas sans instanciation
    private int x;
    private int y;
    private int vitesse;
    private String couleur;

    Pizza(int x, int y, String couleur, int vitesse) {
        setXY(x, y);
        this.couleur = couleur;
        setVitesse(vitesse);
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y; //this = l'instance de l'objet
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
