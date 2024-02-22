import fri.shapesge.Manazer;
/**
 * Write a description of class Test1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test1 {
    
    private Manazer manazer;
    private int i;
    
    /**
     * Constructor for objects of class Test1
     */
    public Test1() {
        this.manazer = new Manazer();
        int i = 0;
        this.manazer.spravujObjekt(this);
    }
    
    public void posunHore() {
        this.manazer.spravujObjekt(this);
    }
    
    public void posunDole() {
        this.manazer.prestanSpravovatObjekt(this);
    }
    
    public void tik() {
        System.out.println(i);
        i++;
    }
}
