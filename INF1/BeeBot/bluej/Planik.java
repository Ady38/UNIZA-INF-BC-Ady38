import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Planik {

    private String[][] planik;
    private BeeBot robot;
    private String[][] znaky;
    private int x;
    private int y;

    public Planik(String subor) throws IOException {
        File data = new File(subor);
        Scanner skener = new Scanner(data);
        int vyska = skener.nextInt();
        int sirka = skener.nextInt();
        this.planik = new String[vyska][sirka];
        this.x = skener.nextInt();
        this.y = skener.nextInt();
        Smer smer = null;

        switch (skener.next()) {
            case "DOLE":
                smer = Smer.DOLE;
                break;
            case "HORE":
                smer = Smer.HORE;
                break;
            case "VPRAVO":
                smer = Smer.VPRAVO;
                break;
            case "VLAVO":
                smer = Smer.VLAVO;
                break;
        }

        this.robot = new BeeBot(this.x, this.y, smer, this);

        this.znaky = new String[vyska][sirka];

        for (int i = 0; i < vyska; i++) {
            for (int j = 0; j < sirka; j++) {
                this.znaky[i][j] = " ";
            }
        }

        int k = 0;

        String[] riadok = new String[sirka];

        while (skener.hasNextLine()) {
            riadok = skener.nextLine().split("");
            for (int i = 0; i < riadok.length; i++) {
                this.znaky[k][i] = riadok[i];
            }
            k++;
        }
        this.znaky[this.x][this.y] = smer.getZnak();
    }

    public void vykresli() {
        for (String[] riadok : this.znaky) {
            for (String znak : riadok) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }

    public String[][] getZnaky() {
        return this.znaky;
    }
    
    public void aktualizuj(int x, int y, String znak) {
        this.znaky[this.x][this.y] = " ";
        this.znaky[x][y] = znak;
        this.x = x;
        this.y = y;
    }

    public BeeBot getRobot() {
        return this.robot;
    }
}
