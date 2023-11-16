
/**
 * Write a description of class Kalkulacka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kalkulacka {
    private double cislo1;
    
    /**
     * Ziska prve cislo prikladu
     */
    public Kalkulacka() {
        this.cislo1 = 0;
    }
    
    public void zadajCislo(double cislo1) {
        this.cislo1 = cislo1;
    }
    /**
     * Ziska operaciu v tvare '_' a prve cislo prikladu 
     * Vyrata vysledok prikladu s dvomi cislami, pre zadanie viac cisel je potreba poslať viac sprav za sebou
     */
    public void zaklOperacie(char operacia, double cislo2) {
        double povodne = this.cislo1;
        switch (operacia) {
            case '+':
                this.cislo1 = this.cislo1 + cislo2;
                break;
            case '-':
                this.cislo1 = this.cislo1 - cislo2;
                break;
            case '*':
                this.cislo1 = this.cislo1 * cislo2;
                break;
            case '/':
                if (cislo2 == 0) {
                    System.out.println("DELENIE NULOU - zachovavam posledny vysledok");
                } else {
                    this.cislo1 = this.cislo1 / cislo2;
                }
                break;
            default:
                System.out.println("Nespravny znak, zadat je mozne len +,-,*,/");
        }
        System.out.println(povodne + " " + operacia + " " + cislo2 + " = " + this.cislo1);
            
    }
    
    public void druhaMocnina() {
        double povodne = this.cislo1;
        this.cislo1 = this.cislo1 * this.cislo1;
        System.out.println(povodne + "**2 = " + this.cislo1);
    }
    
    public void mocnina(int n) {
        double povodne = this.cislo1;
        double medzivysledok = 1;
        for (int i = 0;i < n;i++) {
            medzivysledok = this.cislo1 * medzivysledok;
        }
        System.out.println(povodne + "**" + n + "=" + cislo1);
    }
    
    public void faktorial() {
        double povodne = this.cislo1;
        this.cislo1 = 1;
        for (int i = 1;i <= povodne;i++) {
            this.cislo1 = i * this.cislo1;
        }
        System.out.println(povodne + "!=" + cislo1);
    }
    
    public void druhaOdmocnina() {
        double povodne = this.cislo1;
        double x = povodne / 2;
        double x1 = 1;
        do {
            x1 = x;
            x = 0.5 * (x + (povodne / x));
        } while (Math.abs(x1 - x) > 0.001);
        
        this.cislo1 = x;
        System.out.println("Odmocnina" + povodne + "=" + cislo1);
    }
    
    public double getCislo() {
        return this.cislo1;
    }
    
    public void vycisti(double cislo1) {
        this.cislo1 = cislo1;
        System.out.println("-------------------");
    }
}
