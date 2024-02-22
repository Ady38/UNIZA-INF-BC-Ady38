public class Displej {

    private static final int SIRKA = 6;
    private static final int VYSKA = 9;
    private int[] cisla;
    private String[][] disp;
    public Displej(int pocetCislic) {
        this.cisla = new int[pocetCislic];
        this.disp = new String[VYSKA][SIRKA * pocetCislic];
    }

    public void nastavCislo(int cislo) {
        for (int i = this.cisla.length; i > 0; i--) {
            this.cisla[i - 1] = (int)(cislo % Math.pow(10, this.cisla.length - i + 1) / Math.pow(10, this.cisla.length - i));
        }
    }

    public void zobraz() {
        boolean prve = false;
        String[][] body = new String[VYSKA][SIRKA];
        int pocet = 0;

        for (int cislo : this.cisla) {
            if (!prve) {
                if (cislo == 0) {
                    body = new Cislica().zobraz();
                } else {
                    prve = true;
                    body = new Cislica().nastav(cislo);
                }
            } else {
                body = new Cislica().nastav(cislo);
            }

            for (int i = 0; i < VYSKA; i++) {
                for (int j = pocet * SIRKA; j < (pocet + 1) * SIRKA; j++) {
                    this.disp[i][j] = body[i][j % SIRKA];
                }
            }
            pocet++;
        }
        for (int i = 0; i < VYSKA; i++) {
            for (int j = 0; j < this.cisla.length * SIRKA; j++) {
                System.out.print(this.disp[i][j]);
            }
            System.out.println();
        }
    }
}
