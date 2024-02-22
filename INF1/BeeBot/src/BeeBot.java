import java.util.Objects;

public class BeeBot {

    private final Planik planik;
    private int x;
    private int y;
    private Smer smer;
    private String[][] znaky;

    public BeeBot(int x, int y, Smer otocenie, Planik planik) {
        this.x = x;
        this.y = y;
        this.smer = otocenie;
        this.planik = planik;
    }

    public void vpravo() {
        switch (smer) {
            case DOLE:
                this.smer = Smer.VLAVO;
                this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                break;
            case VLAVO:
                this.smer = Smer.HORE;
                this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                break;
            case HORE:
                this.smer = Smer.VPRAVO;
                this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                break;
            case VPRAVO:
                this.smer = Smer.DOLE;
                this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                break;
        }
    }

    public void vlavo() {
        switch (smer) {
            case DOLE:
                this.smer = Smer.VPRAVO;
                this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                break;
            case VPRAVO:
                this.smer = Smer.HORE;
                this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                break;
            case HORE:
                this.smer = Smer.VLAVO;
                this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                break;
            case VLAVO:
                this.smer = Smer.DOLE;
                this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                break;
        }
    }

    public void krok() {
        switch (smer) {
            case VLAVO:
                this.setznaky();
                if (Objects.equals(this.znaky[this.x][this.y - 1], " ")){
                    this.y -= 1;
                }
                this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                break;
            case HORE:
                this.setznaky();
                if (Objects.equals(this.znaky[this.x - 1][this.y], " ")){
                    this.x -= 1;
                }
                this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                break;
            case VPRAVO:
                this.setznaky();
                if (Objects.equals(this.znaky[this.x][this.y + 1], " ")){
                    this.y += 1;
                }
                this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                break;
            case DOLE:
                this.setznaky();
                if (Objects.equals(this.znaky[this.x + 1][this.y], " ")){
                    this.x += 1;
                }
                this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                break;
        }
    }

    public void setznaky() {
        this.znaky = this.planik.getZnaky();
    }
}
