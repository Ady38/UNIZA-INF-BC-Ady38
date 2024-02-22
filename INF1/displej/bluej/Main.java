public class Main {

    public static void main(String[] args) {
        Displej displej = new Displej(10);
        displej.nastavCislo(1234567890);
        displej.zobraz();
        displej.nastavCislo(987654321);
        displej.zobraz();
    }

}
