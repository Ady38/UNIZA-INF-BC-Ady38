public enum Smer {
    VLAVO("<"),
    HORE("A"),
    VPRAVO(">"),
    DOLE("V");

    private String znak;

    Smer(String znak) {
        this.znak = znak;
    }

    public String getZnak() {
        return this.znak;
    }
}
