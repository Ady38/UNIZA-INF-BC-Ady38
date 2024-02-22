public enum PracovneZaradenie {
    STUDENT("student"),
    ASISTENT("asistent"),
    DOCENT("docent"),
    PROFESOR("profesor");

    private String reprezentacia;

    private PracovneZaradenie(String reprezentacia) {
        this.reprezentacia = reprezentacia;
    }

    public String getReprezentacia() {
        return this.reprezentacia;
    }
}
