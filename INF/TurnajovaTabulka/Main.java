public class Main {
    public static void main(String[] args) {
        Tim tim1 = new Tim("Zilina",Krajina.SLOVENSKO);
        Tim tim2 = new Tim("Ostrava", Krajina.CESKO);
        Tim tim3 = new Tim("Helsinky", Krajina.FINSKO);
        Tim tim4 = new Tim("Detroit", Krajina.USA);

        ZoznamTimov timy = new ZoznamTimov();
        timy.pridajTim(tim1);
        timy.pridajTim(tim2);
        timy.pridajTim(tim3);
        timy.pridajTim(tim4);

        String[] menaTimov = new String[4];
        menaTimov[0] = tim1.getNazovTimu();
        menaTimov[1] = tim2.getNazovTimu();
        menaTimov[2] = tim3.getNazovTimu();
        menaTimov[3] = tim4.getNazovTimu();

        Turnaj turnaj = new Turnaj(menaTimov,timy);
        turnaj.vypisTabulku();
    }
}
