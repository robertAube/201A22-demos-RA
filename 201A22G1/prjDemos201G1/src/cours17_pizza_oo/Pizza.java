package cours17_pizza_oo;

public class Pizza {
    //attributs ou variables d'instance
    private int x;
    private int y;
    private int vitesse;
    private String couleur;

    Pizza(int x, int y, int vitesse, String couleur){
        setXY (x, y);
        setVitesse (vitesse);
        setCouleur (couleur);
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    //manque la validation pour faire correctement l'encapsulation
    public void setXY(int x, int y) {
        this.x = x; //this = instance
        this.y = y;
    }

    public void avancerX(){
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
