public class Matica {
    private double[][] matica;
    
    public Matica(double[][] matica) {
        this.matica = matica;
    }
    
    public double getPrvok(int indexRiadku, int indexStlpca) {
        return this.matica[indexRiadku][indexStlpca];
    }
    
    public int getPocetRiadkov() {
        return this.matica.length;
    }
    
    public int getPocetStlpcov() {
        return this.matica[0].length;
    }
    
    public void vypisMaticu() {
        for (double[] riadok : this.matica) {
            for (double prvok : riadok) {
                System.out.format("%.2f ", prvok);
            }
            System.out.println();
        }
    }
}
