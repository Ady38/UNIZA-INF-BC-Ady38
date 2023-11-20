public class Main {

    public void main() {
        Platno.dajPlatno().redraw();      
        Osoba o1 = new Osoba("Miro", "Pripity", 0.41);
        Osoba o2 = new Osoba("Jano", "Nadzengany", 0.0);
        Osoba o3 = new Osoba("Hana", "Nacvongana", 2.42);
        Osoba o4 = new Osoba("Milan", "Obcastriezvy", 1.47);
        Osoba o5 = new Osoba("Dora", "Vnalade", 2.5);
        Osoba o6 = new Osoba("Fero", "Dokelutriezvy", 0.8);
    
        Bar bar = new Bar();
        bar.prichodDoBaru(o1);
        bar.prichodDoBaru(o2);
        bar.prichodDoBaru(o3);
        bar.prichodDoBaru(o4);
        bar.prichodDoBaru(o5);
        bar.prichodDoBaru(o6);
        
        bar.priradCesty();
        bar.vypis();
        
        bar.odchodZBaru();
    }
    
}
