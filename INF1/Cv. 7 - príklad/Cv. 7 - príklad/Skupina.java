import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Skupina {
    // Tu by som chcel ZOZNAM osob (napriklad Vasu studijnu skupinu)
    // Vopred ale neviem, kolko Vas je.
    private ArrayList<Osoba> osoby;
    private String nazovSkupiny;
    
    public Skupina(String nazovSkupiny) {
        // Tu by sa mal ten zoznam vytvorit. 
        // Doplnit!
        this.osoby = new ArrayList<Osoba>();
        this.nazovSkupiny = nazovSkupiny;
    }
    
    public void pridajObjektOsoba(Osoba novaOsoba) {
        // Doplnit!
        this.osoby.add(novaOsoba);
    }
    
    public void pridajNovuOsobu(String noveMeno, String novePriezvisko) {
        // Doplnit!
        // Poznamka: Vysvetlit anonymny objekt.
        this.pridajObjektOsoba(new Osoba(noveMeno, novePriezvisko));
    }
    
    public boolean jeClenomSkupiny(Osoba hladanaOsoba) {
        // Doplnit!
        // Poznamka: V metóde nepouzivajte vetvenie (prikaz IF)!
        return this.osoby.contains(hladanaOsoba);
    }
        
    public int getPocetClenovSkupiny() {
        // Doplnit!
        // Na prvy pohlad sa metoda javi ako getter. Potrebujem novy atribut? Preco?  
        // Pri kazdej uprave zoznamu by sa musel aktualizovat, co nie je vhodne.
        return this.osoby.size();
    }
        
    public void vypisClenovSkupiny() {
        // Doplnit!
        // Ukazat vsetky 3 cykly - foreach, while s lokalnou premennou aj for (pristup k prvkom cez get(i)
        
        for (Osoba osoba : this.osoby) {
            osoba.vypis();
        }
        
        int x = 0;
        
        // while (x < osoby.size() - 1) {
            // this.osoby.get(x).vypis();
            // x++;
        // }
        
        // for (int i = 0; i < osoby.size() - 1; i++) {
            // this.osoby.get(i).vypis();
        // }
    }
    
    public void odstranPodlaPoradia(int poradie) {
        // Doplnit!
        this.osoby.remove(poradie);
    }
    
    public void odstranPodlaReferencie(Osoba osoba) {
        // Doplnit!
        if(this.jeClenomSkupiny(osoba)) {
            this.osoby.remove(this.osoby.indexOf(osoba));
        }
    }
    
    public void zrusSkupinu() {
        // Doplnit!
        // Ktory cyklus pouzijete? Foreach? While? Treba vobec cyklus?
        this.osoby.clear();
    }
    
    public void zapisDoSuboru() throws IOException {
        File subor = new File(this.nazovSkupiny + ".txt");
        PrintWriter zapisovac = new PrintWriter(subor);
        
        for (Osoba osoba : this.osoby) {
            zapisovac.format("%s %s%n", osoba.getMeno(),osoba.getPriezvisko());
        }
        
        zapisovac.close();
    }
    
    public void nacitajZoSuboru() throws IOException {
        File subor = new File(this.nazovSkupiny + ".txt");
        Scanner citac = new Scanner(subor);
        
        this.osoby.clear();
        while(citac.hasNext()) {
            String meno = citac.next();
            String priezvisko = citac.next();
            
            this.osoby.add(new Osoba(meno,priezvisko));
        }
        
        citac.close();
    }
}
