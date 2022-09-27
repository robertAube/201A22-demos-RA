//Cours : 420-201 – Introduction à la programmation
//Nom : Aubé
//Prénom : Robert
//Date : 2022-09-27

public class Cours10_for {
    public Cours10_for() {
        testerNbXLaLettre();
    }

    private void testerNbXLaLettre() {
        System.out.println(nbXLaLettre_while("", 'o') == 0); //affiche 0
        System.out.println(nbXLaLettre_while("Bonjour", 'o') == 2); //affiche 2
        System.out.println(nbXLaLettre_while("Bonjour", 'b') == 0); //affiche 0


        System.out.println(nbXLaLettre_for("", 'o') == 0); //affiche 0
        System.out.println(nbXLaLettre_for("Bonjour", 'o') == 2); //affiche 2
        System.out.println(nbXLaLettre_for("Bonjour", 'b') == 0); //affiche 0
    }

    private int nbXLaLettre_while(String str, char lettre) {
        int nbXDansStr = 0;
        char c;
        int index;

        index = 0;
        while (index < str.length()) {
            c = str.charAt(index);
            if (c == lettre) {
                nbXDansStr++;
            }
            index++;
        }

        return nbXDansStr;
    }


    private int nbXLaLettre_for(String str, char lettre) {
        int nbXDansStr = 0;
        char c;

        //Boucle for
        //for (initialisation du compteur; condition qui doit être vrai pour entrer et poursuivre la boucle; incrémentation du compteur)
        //1 - exécuter la première partie du for
        //2 - Vérifie la condition de la 2e partie :
        //    -- Si c'est vrai : on exécute l'intérieur de la boucle
        //    -- Si c'est faux : on sort de la boucle
        //3 - Selon cas on exécute l'intérieur
        //4 - On exécute la 3e partie du for, qui normalement modifie la condition de la partie 2
        //5 - On retourne faire le point 2.
        for (int index = 0; index < str.length(); index++) {
            c = str.charAt(index);
            if (c == lettre) {
                nbXDansStr += 1;
            }
        }

        return nbXDansStr;
    }

    public static void main(String[] args) {
        new Cours10_for();
    }
}
