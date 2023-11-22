 public class Vektor {
    private double[] vektor;
    
    public Vektor(double[] vektor) {
        this.vektor = vektor;
    }
    
    public double skalarnySucin(Vektor vektorB) {
        if (this.getDlzka() == vektorB.getDlzka()) {
            double sucin = 0;
            int index = 0;
            for (double zlozka : this.vektor) {
                sucin += zlozka * vektorB.getPrvok(index);
                index++;
            }
            return sucin;
        }
            return 0;
    }
    
    public double getPrvok(int index) {
        return this.vektor[index];
    }
    
    public int getDlzka() {
        return this.vektor.length;
    }
    
    public void vypisVektor() {
        // osetrit ciarku na konci
        boolean jePrva = true;
        System.out.print("(");
        for (double zlozka : this.vektor) {
            if (!jePrva){
                System.out.println("; ");
            }
            System.out.format("%.2f; ", zlozka);
            jePrva = false;
        }
        System.out.println(")");
    }
}
