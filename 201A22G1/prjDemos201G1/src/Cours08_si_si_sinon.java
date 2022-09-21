//Cours : 420-201 – Introduction à la programmation
//Groupe : 1
//Nom : Aubé
//Prénom : Robert
//DA : 1234567
//Date : (2022-09-20)

public class Cours08_si_si_sinon {
    public Cours08_si_si_sinon() {
        testerCalculerRabais();
//        testerAfficherRabais();
    }

    public void testerAfficherRabais() {
        afficherRabais(0);
        afficherRabais(99.99f);
        afficherRabais(100);
        afficherRabais(499.99f);
        afficherRabais(500);
        afficherRabais(1999.99f);
        afficherRabais(2000);
        afficherRabais(2999.99f);
        afficherRabais(3000);
    }

    public void testerCalculerRabais() {
        System.out.println(calculerRabais(0) == 0);
        System.out.println(calculerRabais(99.99f) == 0);
        System.out.println(calculerRabais(100) == 0.02f);
        System.out.println(calculerRabais(499.99f) == 0.02f);
        System.out.println(calculerRabais(500) == 0.03f);
        System.out.println(calculerRabais(999.99f) == 0.03f);
        System.out.println(calculerRabais(1000) == 0.04f);
        System.out.println(calculerRabais(1999.99f) == 0.04f);
        System.out.println(calculerRabais(2000) == 0.05f);
    }

    public void afficherRabais(float montant) {
        String str;

        str = "Pour un montant de $" + montant;
        str += ", vous avez un rabais de " + calculerRabais(montant);
        str += " Donc ca fait un $" + calculerRabais(montant) * montant + " de rabais.";

        System.out.println(str);
    }


    /**
     * Calcule (il fait juste le calculer et ne l’affiche pas) un rabais
     * en fonction d'un montant reçu en argument.
     * o	-infini, 100[ -> 0
     * o	[100, 500[ -> 2%
     * o	[500, 1000[ -> 3%
     * o	[1000, 2000[ -> 4%
     * o	[2000, infini -> 5%
     *
     * @param montant Montant en $ CAN du rabais à calculer.
     * @return rabais Rabais octroyé en % en fonction du montant.
     */
    public float calculerRabais(float montant) {
        float rabais;

        if (montant < 100) {
            rabais = 0;
        } else if (montant < 500) {
            rabais = 0.02f;
        } else if (montant < 1000) {
            rabais = (float) 3 / 100;
        } else if (montant < 2000)
            rabais = 0.04f;
        else
            rabais = 0.05f;

        return rabais;
    }

    public static void main(String[] args) {
        new Cours08_si_si_sinon();
    }
}
