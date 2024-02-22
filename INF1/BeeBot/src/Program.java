public class Program {

    private final Prikaz[] prikazy;

    public Program(Prikaz[] prikazy) {
        this.prikazy = prikazy;
    }

    public void vykonaj(Planik planik) {
        for (Prikaz prikaz : this.prikazy) {
            switch (prikaz) {
                case VPRAVO:
                    planik.getRobot().vpravo();
                case VLAVO:
                    planik.getRobot().vlavo();
                case KROK:
                    planik.getRobot().krok();
            }
        }
    }
}
