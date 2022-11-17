package cours23_Object;

public class JourDeSemaine {
    public JourDeSemaine() {
        System.out.println(quelJour(1));
        System.out.println(quelJour(2));
        System.out.println(quelJour(3));

        demoEnum();
    }

    private void demoEnum() {
        JourSemaine jds;

        jds = JourSemaine.MERCREDI;

        System.out.println(quelJour(jds));
        jds = JourSemaine.SAMEDI;

        System.out.println(quelJour(jds));
    }

    private String quelJour(JourSemaine jds) {
        String typeJour;

        switch (jds) {
            case LUNDI:
            case MARDI:
            case MERCREDI:
            case JEUDI:
            case VENDREDI:
                typeJour = "Travail";
                break;
            case SAMEDI:
            case DIMANCHE:
                typeJour = "congé";
                break;
            default:
                throw new RuntimeException("");
        }
        return typeJour;
    }

    private String quelJour(int noJour) {
        String strJourSemaine;

        switch (noJour) {
            case 1:
                strJourSemaine = "Dimanche";
                break;
            case 2:
                strJourSemaine = "Lundi";
                break;
            case 3:
                strJourSemaine = "Mardi";
                break;
            case 4:
                strJourSemaine = "Mercredi";
                break;
            case 5:
                strJourSemaine = "Jeudi";
                break;
            case 6:
                strJourSemaine = "Vendredi";
                break;
            case 7:
                strJourSemaine = "Samedi";
                break;
            default:
                throw new IllegalArgumentException("Jour invalide");
        }
        return strJourSemaine;
    }

    public static void main(String[] args) {
        new JourDeSemaine();
    }
}
