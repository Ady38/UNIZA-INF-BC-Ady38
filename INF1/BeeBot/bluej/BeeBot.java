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
        switch (this.smer) {
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
        switch (this.smer) {
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
        switch (this.smer) {
            case VLAVO:
                this.setznaky();
                if (this.mimoPlanik()) {
                    this.y -= 1;
                } else if (this.y - 1 == 0 || this.y - 1 == this.znaky[0].length - 1) {
                    this.planik.aktualizuj(this.x, this.y, " ");
                } else if (Objects.equals(this.znaky[this.x][this.y - 1], " ")) {
                    this.y -= 1;
                    this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                }
                break;
            case HORE:
                this.setznaky();
                if (this.mimoPlanik()) {
                    this.x -= 1;
                } else if (this.x - 1 == 0 || this.x - 1 == this.znaky.length - 1) {
                    this.planik.aktualizuj(this.x, this.y, " ");
                } else if (Objects.equals(this.znaky[this.x - 1][this.y], " ") || this.mimoPlanik()) {
                    this.x -= 1;
                    this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                }
                break;
            case VPRAVO:
                this.setznaky();
                if (this.mimoPlanik()) {
                    this.y += 1;
                } else if (this.y + 1 == 0 || this.y + 1 == this.znaky[0].length - 1) {
                    this.planik.aktualizuj(this.x, this.y, " ");
                } else if (Objects.equals(this.znaky[this.x][this.y + 1], " ") || this.mimoPlanik()) {
                    this.y += 1;
                    this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                }
                break;
            case DOLE:
                this.setznaky();
                if (this.mimoPlanik()) {
                    this.x += 1;
                } else if (this.x + 1 == 0 || this.x + 1 == this.znaky[0].length - 1) {
                    this.planik.aktualizuj(this.x, this.y, " ");
                } else if (Objects.equals(this.znaky[this.x + 1][this.y], " ") || this.mimoPlanik()) {
                    this.x += 1;
                    this.planik.aktualizuj(this.x, this.y, this.smer.getZnak());
                }
                break;
        }
    }

    public void setznaky() {
        this.znaky = this.planik.getZnaky();
    }
    
    private boolean mimoPlanik() {
        if (this.x < 0 || this.x > this.znaky.length - 1 || this.y < 0 || this.y > this.znaky[0].length - 1) {
            return true;
        }
        return false;
    }
}
