public class Main {
    public static void main(String[] args) {
        var student = new Student("Michal", "Duracik","123456");
        Skupina skupina = new Skupina("Stvrtok");
        skupina.pridaj(student);
        skupina.vypis();
    }
}