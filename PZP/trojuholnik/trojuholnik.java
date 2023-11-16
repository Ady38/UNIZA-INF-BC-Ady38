
/**
 * Write a description of class trojuholnik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class trojuholnik {
    private double a;
    private double b;
    private double c;
    /**
     * Constructor for objects of class trojuholnik
     */
    public trojuholnik(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public String getMozny(){
        if (this.a<this.b+this.c && this.b<this.a+this.c && this.c<this.a+this.b){
            if (this.a == this.b && this.b == this.c && this.a == this.c)
                return "Trojuholnik je mozne zostrojit a je rovnostranny";
            
            else if (this.a == this.b && this.a!=this.c || this.a==this.c && this.a!=this.b || this.b==this.c && this.b!=this.a)
                return "Trojuholnik je mozne zostrojit a je rovnoramenny";
                else
                    return "Trojuholnik je mozne zostrojit a je roznostranny";
            }
        else
            return "Trojuholnik nieje mozne zostrojit";
    }
}
