public class Cours25_ClasseEnveloppe {
    public Cours25_ClasseEnveloppe() {
        tests_classeEnveloppe1();
        tests_classeEnveloppe2();
    }

    private void tests_classeEnveloppe2() {
        Object tabObjets[] = new Object[8];

        tabObjets[0] = 2022;
        tabObjets[1] = 'a';
        tabObjets[2] = 3.6f;
        tabObjets[3] = 3.5; // par défaut (Double)
        tabObjets[4] = true;
        tabObjets[5] = 4220l;
        tabObjets[6] = (long) 200000;
        tabObjets[7] = "Bonjour le monde";

        for (int i = 0; i < tabObjets.length; i++) {
            System.out.println("valeur = " + tabObjets[i].toString() + "; type = " + tabObjets[i].getClass().getName());
        }
    }

    private void tests_classeEnveloppe1() {
        int i = 3;
        Object o;
        Integer iInteger = 3;
        double dd = 4;
        Double dble = dd;
        Character c;

        o = i;
        System.out.println(o.getClass().getName());
        i++;
        System.out.println("o = " + o);
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        new Cours25_ClasseEnveloppe();
    }
}
