public class Cours13_boucles {
    public Cours13_boucles() {
//        testerEstVoyelle();
        testerCombienDeVoyelle();
    }


    private void testerCombienDeVoyelle() {
        System.out.println(combienDeVoyelle("") == 0);
        System.out.println(combienDeVoyelle("aBcDeFgH") == 2);
        System.out.println(combienDeVoyelle("Allo BATEAU") == 6);
    }

    /*
    Écrivez une méthode combienDeVoyelle
    qui retourne le nombre de voyelle dans une chaine de caractères.
    Les voyelles en français correspondent aux lettres a, e, i, o, u, y
     */
    private int combienDeVoyelle(String str) {
        int nbVoyelle = 0;
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (estUneVoyelle(c))
                nbVoyelle++;
        }
        return nbVoyelle;
    }

    private boolean estUneVoyelle(char lettre) {
        boolean estVoyelle = false;
        String voyelles = "aeiouy";
        char c;

        lettre = Character.toLowerCase(lettre);
        for (int i = 0; i < voyelles.length() && !estVoyelle; i++) {
            c = voyelles.charAt(i);
            if (lettre == c) {
                estVoyelle = true;
            }
        }

        return estVoyelle;
    }

    private void testerEstVoyelle() {
        System.out.println(estUneVoyelle('a') == true);
        System.out.println(estUneVoyelle('A') == true);
        System.out.println(estUneVoyelle('y') == true);
        System.out.println(estUneVoyelle('w') == false);
    }

    private boolean estVoyelleV1(char lettre) {
        boolean estVoy;

        lettre = Character.toLowerCase(lettre);
        estVoy = lettre == 'a' || lettre == 'e' || lettre == 'i' || lettre == 'o';
        estVoy = estVoy || lettre == 'u'|| lettre == 'y';

        return estVoy;
    }


    public static void main(String[] args) {
        new Cours13_boucles();
    }
}
