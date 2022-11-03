package cours19_pizza_oo;

import jdk.jshell.spi.ExecutionControl;

public class Coordonnee {
    //Doit être positif
    public static final int MIN_XY = 0;
    public static final int MAX_XY = Integer.MAX_VALUE;

    public static final int X_DEFAULT = 0;
    public static final int Y_DEFAULT = 0;

    private int x;
    private int y;

    //surcharge du constructeur (surcharge = Deux méthodes qui ont le même nom, mais dont les arguments sont différents.)
    public Coordonnee() {
        this(X_DEFAULT, Y_DEFAULT); //appel du constructeur avec argument.
    }

    public Coordonnee(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void translate(int dx, int dy)  {
        setX(this.x + dx);
        setY(this.y + dy);
    }

    public void move(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        if (estValideX(x)) {
            this.x = x;
        }
        else {
            throw new IllegalArgumentException("X est invalide : " + x);
        }
    }

    public int getY() {
        return y;
    }

    public static boolean estValideX(int x) {
        return MIN_XY <= x && x <= MAX_XY;
    }
    public static boolean estValideY(int y) {
        return MIN_XY <= y && y <= MAX_XY;
    }

    public String toString() {
        return ("(" + this.x + ", " + this.y + ")");
    }

    public void setY(int y) {
        if (estValideY(y)) {
            this.y = y;
        }
        else {
            throw new IllegalArgumentException("Y est invalide : " + y);
        }
    }
}
