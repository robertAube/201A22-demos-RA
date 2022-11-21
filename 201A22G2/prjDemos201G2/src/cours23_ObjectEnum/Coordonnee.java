package cours23_ObjectEnum;

public class Coordonnee {
    public static final int MIN_XY = 0;
    public static final int MAX_XY = Integer.MAX_VALUE;

    public static final int X_DEFAULT = 0;
    public static final int Y_DEFAULT = 0;

    private int x;
    private int y;

    //constructeur par défaut
    public Coordonnee() {
        this(X_DEFAULT, Y_DEFAULT); //appelle le constructeur avec argument
    }

    public Coordonnee(int x, int y) {
        move(x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (estValideX(x)) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("X est invalide : " + x);
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (estValideY(y)) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("Y est invalide : " + y);
        }
    }

    public void translate(int dx, int dy) {
        setX(this.x + dx);
        setY(this.y + dy);
    }

    public void move(int x, int y) {
        setX(x);
        setY(y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static boolean estValideX(int x) {
        return MIN_XY <= x && x <= MAX_XY;
    }

    public static boolean estValideY(int y) {
        return MIN_XY <= y && y <= MAX_XY;
    }
}
