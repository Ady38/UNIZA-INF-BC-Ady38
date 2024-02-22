public enum Segment {

    A(0, 1, 0, 2, 0, 3),
    B(1, 4, 2, 4, 3, 4),
    C(5, 4, 6, 4, 7, 4),
    D(8, 1, 8, 2, 8, 3),
    E(5, 0, 6, 0, 7, 0),
    F(1, 0, 2, 0, 3, 0),
    G(4, 1, 4, 2, 4, 3);

    private final int[] bod1;
    private final int[] bod2;
    private final int[] bod3;

    Segment(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.bod1 = new int[] {x1, y1};
        this.bod2 = new int[] {x2, y2};
        this.bod3 = new int[] {x3, y3};
    }

    public int[] getBod1() {
        return this.bod1;
    }

    public int[] getBod2() {
        return this.bod2;
    }

    public int[] getBod3() {
        return this.bod3;
    }

}
