import java.util.Random;

public class Matica {

    private int pocetRiadkov;
    private int pocetStlpcov;
    private double[][] hodnoty;
    private Random nahoda;

    public Matica(int pocetRiadkov, int pocetStlpcov) {
        this.nahoda = new Random();
        this.hodnoty = new double[pocetRiadkov][pocetStlpcov];
        this.pocetRiadkov = pocetRiadkov;
        this.pocetStlpcov = pocetStlpcov;
    }

    public int getPocetRiadkov() {
        return this.pocetRiadkov;
    }

    public int getPocetStlpcov() {
        return this.pocetStlpcov;
    }

    public boolean jeIndexPlatny(int indexRiadku, int indexStlpca) {
        return indexRiadku < this.pocetRiadkov && indexStlpca < this.pocetStlpcov && indexRiadku > -1 && indexStlpca > -1;
    }

    public double getPrvok(int riadok, int stlpec) {
        if (jeIndexPlatny(riadok, stlpec)) {
            return this.hodnoty[riadok][stlpec];
        }
        return Double.NaN;
    }

    public void setPrvok(int riadok, int stlpec, double hodnota) {
        this.hodnoty[riadok][stlpec] = hodnota;
    }

    public void nastavVsadeHodnotu(double hodnota) {
        for (int i = 0; i < this.pocetRiadkov; i++) {
            for (int j = 0; j < this.pocetStlpcov; j++) {
                this.setPrvok(i, j, hodnota);
            }
        }
    }

    public void vypisNaTerminal() {
        for (int i = 0; i < this.pocetRiadkov; i++) {
            boolean prva = true;
            for (int j = 0; j < this.pocetStlpcov; j++) {
                if (prva) {
                    System.out.print("|" + String.format("%.2f", getPrvok(i, j)) + "|");
                    prva = false;
                } else {
                    System.out.print("" + String.format("%.2f", getPrvok(i, j)) + "|");
                }
            }
            System.out.println();
        }
    }

    public void nastavJednotkovuMaticu() {
        if (this.pocetRiadkov != this.pocetStlpcov) {
            System.out.println("Matica neije stvorcova, neviem upravit na jednotkovu");
        } else {
            this.nastavVsadeHodnotu(0);
            if (this.pocetRiadkov > this.pocetStlpcov) {
                for (int i = 0; i < this.getPocetRiadkov(); i++) {
                    this.setPrvok(i, i, 1);
                }
            } else{
                for (int i = 0; i < this.pocetStlpcov; i++) {
                    this.setPrvok(i, i, 1);
                }
            }
        }

    }

    public void nastavNahodneHodnoty(double dolnaHranica, double hornaHranica) {
        for (int i = 0; i < this.pocetRiadkov; i++) {
            for (int j = 0; j < this.pocetStlpcov; j++) {
                this.setPrvok(i, j, nahoda.nextDouble()*(hornaHranica - dolnaHranica)+dolnaHranica);
            }
        }
    }

    public boolean jeRiadkova() {
        for (int i = 0; i < this.pocetRiadkov; i++) {
            for (int j = 0; j < this.pocetStlpcov; j++) {
                if (i != 0) {
                    if (getPrvok(i, j) != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void zmodifikujNaRiadkovu() {
        for (int i = 0; i < this.pocetRiadkov; i++) {
            for (int j = 0; j < this.pocetStlpcov; j++) {
                if (i != 0) {
                    this.setPrvok(i, j,0);
                }
            }
        }
    }
}

