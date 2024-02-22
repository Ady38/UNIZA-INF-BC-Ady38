import java.util.ArrayList;

public class Skupina {
    private final String cislo;
    private final ArrayList<Student> zoznamStudentov;

    public Skupina(String cislo) {
        this.cislo = cislo;
        this.zoznamStudentov = new ArrayList<Student>();
    }

    public void pridaj(Student student) {
        this.zoznamStudentov.add(student);
    }

    public void vypis() {
        for (Student student : this.zoznamStudentov) {
            System.out.println(student);
        }
    }
}
