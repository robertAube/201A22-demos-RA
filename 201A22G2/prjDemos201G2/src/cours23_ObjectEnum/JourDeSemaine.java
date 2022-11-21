package cours23_ObjectEnum;

public class JourDeSemaine {
    public JourDeSemaine() {
//        demoSwitch();
        demoEnum();
    }

    private void demoEnum() {
        JourSemaine jourS;

        jourS = JourSemaine.Lundi;

        System.out.println(quelJour(jourS));

        jourS = JourSemaine.Dimanche;

        System.out.println(quelJour(jourS));
    }

    public void demoSwitch() {
        for (int noJour = 1; noJour <= 7; noJour++) {
            System.out.println("Jour " + noJour + " -> " + quelJour(noJour));
        }
    }

    private String quelJour(JourSemaine jourDeSemaine) {
        String strJourSem = "" ;
        switch (jourDeSemaine) {
            case Lundi:
                strJourSem = "lundi";
                break;
            case Mardi:
                strJourSem = "mardi";
                break;
            case Mercredi:
                strJourSem = "mercredi";
                break;
            case Dimanche:
                strJourSem = "dimanche";
                break;
        }
        return  strJourSem;
    }


    private String quelJour(int noJour) {
        String strJourSem = "d";

        switch (noJour) {
            case 1:
                strJourSem = "dimanche";
                break; //sort du switch (ne pas mettre ailleurs que dans des switch();
            case 2:
                strJourSem = "lundi";
                break;
            case 3:
                strJourSem = "mardi";
                break;
            case 4:
            case 5:
                System.out.println(noJour);
            case 6:
                strJourSem = "mardi";
                break;
            default:
                throw new IllegalArgumentException("noJour invalide : " + noJour);
        }
        return strJourSem;
    }

    public static void main(String[] args) {
        new JourDeSemaine();
    }
}
