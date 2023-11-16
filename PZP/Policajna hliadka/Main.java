public abstract class Main {
    public static void main() {
        Osoba o1 = new Osoba("Jano", "Tulen");
        Osoba o2 = new Osoba("Zuzka", "Mackova");
        Osoba o3 = new Osoba("Fero", "Pes");
        Osoba o4 = new Osoba("Jozo", "Vrabec");
        Osoba o5 = new Osoba("Maria", "Rybova");
        Osoba o6 = new Osoba("Peter", "Hroch");
    
        Auto a1 = new Auto();
        a1.nastupAkoSofer(o1);
        a1.nastupAkoSpolujazdec(o2);        
        
        Auto a2 = new Auto();
        a2.nastupAkoSofer(o3);
        a2.nastupAkoSpolujazdec(o4);
        
        Auto a3 = new Auto();
        a3.nastupAkoSofer(o5);
        a3.nastupAkoSpolujazdec(o6);
        
        Bar bar = new Bar();
        bar.zaparkujAuto(a1);
        bar.zaparkujAuto(a2);
        bar.zaparkujAuto(a3);
        
        bar.simulujPiatok(4);
        
        Policajt policajt = new Policajt();
        policajt.setHladanaOsoba("Jano Tulen");
        
        policajt.zastavAuto(a1);
        policajt.zastavAuto(a2);
        policajt.zastavAuto(a3);
    }  
}