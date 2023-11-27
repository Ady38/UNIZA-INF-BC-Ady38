public class Main {

    public static void main(String[] args) {
        Matica matica = new Matica(5,7);
        System.out.println("Pocet riadkov" + matica.getPocetRiadkov());
        System.out.println("Pocet stlpcov" + matica.getPocetRiadkov());
        System.out.println("Kontrola pre index mimo matice: " + matica.jeIndexPlatny(6,6));
        System.out.println("Kontrola pre index v matici: " + matica.jeIndexPlatny(2,2));
        System.out.println("Nastavena hodnota 5.006");
        matica.nastavVsadeHodnotu(5.006);
        matica.vypisNaTerminal();
        matica.setPrvok(0,0,0);
        System.out.println("Nastaveny prvok 0,0 na 0");
        matica.vypisNaTerminal();
        System.out.println("Nastavena jednotkova matica");
        matica.nastavJednotkovuMaticu();
        matica.vypisNaTerminal();
        matica.nastavVsadeHodnotu(5.006);
        System.out.println("Nastavena hodnota 5.006");
        matica.vypisNaTerminal();
        System.out.println("Je riadkova?");
        System.out.println(matica.jeRiadkova());
        matica.zmodifikujNaRiadkovu();
        System.out.println("Upravena na riadkovu");
        matica.vypisNaTerminal();
        System.out.println("Je riadkova?");
        System.out.println(matica.jeRiadkova());

    }
}
