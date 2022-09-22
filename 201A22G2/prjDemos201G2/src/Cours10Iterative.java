public class Cours10Iterative {
    public Cours10Iterative() {
        testerNbFoisLaLettreVWhile();
        testerNbFoisLaLettreVFor();
    }

    private void testerNbFoisLaLettreVWhile() {
        System.out.println(nbXLaLettreWhile("", 'o') == 0);
        System.out.println(nbXLaLettreWhile("Bonjour", 'o') == 2);
        System.out.println(nbXLaLettreWhile("Bonjour", 'b') == 0);
        System.out.println(nbXLaLettreWhile("Allo", 'o') == 1);
    }
    private void testerNbFoisLaLettreVFor() {
        System.out.println(nbXLaLettreFor("", 'o') == 0);
        System.out.println(nbXLaLettreFor("Bonjour", 'o') == 2);
        System.out.println(nbXLaLettreFor("Bonjour", 'b') == 0);
        System.out.println(nbXLaLettreFor("Allo", 'o') == 1);
    }

    private int nbXLaLettreWhile(String str, char car) {
        int cptDeLettre = 0;
        int index;

        index = 0;
        while (index < str.length()) {
            if (str.charAt(index) == car) {
                cptDeLettre++;
            }
            index++;
        }

        return cptDeLettre;
    }


    private int nbXLaLettreFor(String str, char car) {
        int cptDeLettre = 0;
        int index;

        //Boucle for
        //for (initalisation de l'index; condition qui doit être vrai pour entrer dans la boucle et poursuivre; incrémentaiton du compteur)
        //1 - exécuter la première partie du for
        //2 - Vérifie la condition de la 2e partie :
        //    -- Si c'est vrai, on exécute l'intérieur de la boucle
        //    -- Si c'est faux, on sort de la boucle
        //3 - Selon le cas, on exécute l'intérieur
        //4 - On exécute la 3e partie du for, qui normalement modifie la condition de la partie 2
        //5 - on retourne faire la partie 2

        for (index = 0; index < str.length(); index++) {
            if (str.charAt(index) == car) {
                cptDeLettre++;
            }
        }

        return cptDeLettre;
    }

    public static void main(String[] args) {
        new Cours10Iterative();
    }
}
