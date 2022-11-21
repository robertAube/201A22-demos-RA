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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true; //si c'Est la même instance, retourner true
//        }
//        if (o == null) {
//            return false; //si o est null, retourner false
//        }
//        if (getClass() != o.getClass()) {
//            return false; //si ce n'est pas la même classe, retourner false (Pizza != Coordonnee)
//        }
//
//        Pizza pizza = (Pizza) o; //Création d'une variable pizza pour éviter de faire des cast pas la suite.
//
//        if (vitesse != pizza.vitesse) return false;
//        if (couleur != null) { //Si la String couleur n'est pas null
//            return couleur.equalsIgnoreCase(pizza.couleur); //retourne true si les chaines sont égales sans vérifier la cast
//        }
//        else {
//            return pizza.couleur == null;
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (vitesse != pizza.vitesse) return false;
        if (position != null ? !position.equals(pizza.position) : pizza.position != null) return false;
        return couleur != null ? couleur.equalsIgnoreCase(pizza.couleur) : pizza.couleur == null;
    }

    @Override
    public int hashCode() {
        int result = position != null ? position.hashCode() : 0;
        result = 31 * result + vitesse;
        result = 31 * result + (couleur != null ? couleur.hashCode() : 0);
        return result;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
