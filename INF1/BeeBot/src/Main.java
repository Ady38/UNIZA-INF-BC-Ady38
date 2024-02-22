import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Planik planik = new Planik("planik.txt");
        planik.vykresli();
        planik.posun();
        planik.vykresli();

    }
}
