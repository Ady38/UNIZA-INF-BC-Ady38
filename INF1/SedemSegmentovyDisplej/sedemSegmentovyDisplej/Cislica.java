
/**
 * Write a description of class Cislica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cislica {
    
    private int cislica;
    private Segment segmentA;
    private Segment segmentB;
    private Segment segmentC;
    private Segment segmentD;
    private Segment segmentE;
    private Segment segmentF;
    private Segment segmentG;
    
    public Cislica(int x, int y, int cislica) {
        this.cislica = cislica;
        this.segmenty(x,y);
        this.zmenHodnotu(cislica);
    }
    
    public void zmenHodnotu(int cislica) {
        switch (cislica){
            case 0:
                this.nula();
                break;
            case 1:
                this.jedna();
                break;
            case 2:
                this.dva();
                break;
            case 3:
                this.tri();
                break;
            case 4:
                this.styri();
                break;
            case 5:
                this.pat();
                break;
            case 6:
                this.sest();
                break;
            case 7:
                this.sedem();
                break;
            case 8:
                this.osem();
                break;
            case 9:
                this.devat();
                break;
        }
    }
    
    private void segmenty(int x,int y) {
        this.segmentA = new Segment(115 + x,15 + y,false);
        this.segmentB = new Segment(215 + x,30 + y,true);
        this.segmentC = new Segment(215 + x,145 + y,true);
        this.segmentD = new Segment(115 + x,245 + y,false);
        this.segmentE = new Segment(100 + x,145 + y,true);
        this.segmentF = new Segment(100 + x,30 + y,true);
        this.segmentG = new Segment(115 + x,130 + y,false);
        
    }
    
    private void nula() {
        this.segmentA.rozsvietSa();
        this.segmentB.rozsvietSa();
        this.segmentC.rozsvietSa();
        this.segmentD.rozsvietSa();
        this.segmentE.rozsvietSa();
        this.segmentF.rozsvietSa();
        this.segmentG.zhasni();
    }
    
    private void jedna() {
        this.segmentA.zhasni();
        this.segmentB.rozsvietSa();
        this.segmentC.rozsvietSa();
        this.segmentD.zhasni();
        this.segmentE.zhasni();
        this.segmentF.zhasni();
        this.segmentG.zhasni();
    }
    
    private void dva() {
        this.segmentA.rozsvietSa();
        this.segmentB.rozsvietSa();
        this.segmentC.zhasni();
        this.segmentD.rozsvietSa();
        this.segmentE.rozsvietSa();
        this.segmentF.zhasni();
        this.segmentG.rozsvietSa();
    }
    
    private void tri() {
        this.segmentA.rozsvietSa();
        this.segmentB.rozsvietSa();
        this.segmentC.rozsvietSa();
        this.segmentD.rozsvietSa();
        this.segmentE.zhasni();
        this.segmentF.zhasni();
        this.segmentG.rozsvietSa();
    }
    
    private void styri() {
        this.segmentA.zhasni();
        this.segmentB.rozsvietSa();
        this.segmentC.rozsvietSa();
        this.segmentD.zhasni();
        this.segmentE.zhasni();
        this.segmentF.rozsvietSa();
        this.segmentG.rozsvietSa();
    }
    
    private void pat() {
        this.segmentA.rozsvietSa();
        this.segmentB.zhasni();
        this.segmentC.rozsvietSa();
        this.segmentD.rozsvietSa();
        this.segmentE.zhasni();
        this.segmentF.rozsvietSa();
        this.segmentG.rozsvietSa();
    }
    
    private void sest() {
        this.segmentA.rozsvietSa();
        this.segmentB.zhasni();
        this.segmentC.rozsvietSa();
        this.segmentD.rozsvietSa();
        this.segmentE.rozsvietSa();
        this.segmentF.rozsvietSa();
        this.segmentG.rozsvietSa();
    }
    
    private void sedem() {
        this.segmentA.rozsvietSa();
        this.segmentB.rozsvietSa();
        this.segmentC.rozsvietSa();
        this.segmentD.zhasni();
        this.segmentE.zhasni();
        this.segmentF.zhasni();
        this.segmentG.zhasni();
    }
    
    private void osem() {
        this.segmentA.rozsvietSa();
        this.segmentB.rozsvietSa();
        this.segmentC.rozsvietSa();
        this.segmentD.rozsvietSa();
        this.segmentE.rozsvietSa();
        this.segmentF.rozsvietSa();
        this.segmentG.rozsvietSa();
    }
    
    private void devat() {
        this.segmentA.rozsvietSa();
        this.segmentB.rozsvietSa();
        this.segmentC.rozsvietSa();
        this.segmentD.rozsvietSa();
        this.segmentE.zhasni();
        this.segmentF.rozsvietSa();
        this.segmentG.rozsvietSa();
    }
}
