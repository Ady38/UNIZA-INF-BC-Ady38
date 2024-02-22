public class Cislica {

    private static final int SIRKA = 6;
    private static final int VYSKA = 9;
    private String[][] body;

    public Cislica() {
        this.body = new String[VYSKA][SIRKA];

        for (int i = 0; i < VYSKA; i++) {
            for (int j = 0; j < SIRKA; j++) {
                this.body[i][j] = " ";
            }
        }
    }

    public String[][] nastav(int cislo) {
        switch (cislo) {
            case 0:
                this.zmenBody(Segment.A);
                this.zmenBody(Segment.B);
                this.zmenBody(Segment.C);
                this.zmenBody(Segment.D);
                this.zmenBody(Segment.E);
                this.zmenBody(Segment.F);
                break;
            case 1:
                this.zmenBody(Segment.B);
                this.zmenBody(Segment.C);
                break;
            case 2:
                this.zmenBody(Segment.A);
                this.zmenBody(Segment.B);
                this.zmenBody(Segment.E);
                this.zmenBody(Segment.D);
                this.zmenBody(Segment.G);
                break;
            case 3:
                this.zmenBody(Segment.A);
                this.zmenBody(Segment.B);
                this.zmenBody(Segment.C);
                this.zmenBody(Segment.D);
                this.zmenBody(Segment.G);
                break;
            case 4:
                this.zmenBody(Segment.B);
                this.zmenBody(Segment.C);
                this.zmenBody(Segment.F);
                this.zmenBody(Segment.G);
                break;
            case 5:
                this.zmenBody(Segment.A);
                this.zmenBody(Segment.C);
                this.zmenBody(Segment.D);
                this.zmenBody(Segment.F);
                this.zmenBody(Segment.G);
                break;
            case 6:
                this.zmenBody(Segment.A);
                this.zmenBody(Segment.C);
                this.zmenBody(Segment.D);
                this.zmenBody(Segment.E);
                this.zmenBody(Segment.F);
                this.zmenBody(Segment.G);
                break;
            case 7:
                this.zmenBody(Segment.A);
                this.zmenBody(Segment.B);
                this.zmenBody(Segment.C);
                break;
            case 8:
                this.zmenBody(Segment.A);
                this.zmenBody(Segment.B);
                this.zmenBody(Segment.C);
                this.zmenBody(Segment.D);
                this.zmenBody(Segment.E);
                this.zmenBody(Segment.F);
                this.zmenBody(Segment.G);
                break;
            case 9:
                this.zmenBody(Segment.A);
                this.zmenBody(Segment.B);
                this.zmenBody(Segment.C);
                this.zmenBody(Segment.D);
                this.zmenBody(Segment.F);
                this.zmenBody(Segment.G);
                break;
        }
        return this.zobraz();
    }

    public String[][] zobraz() {
        return this.body;
    }

    private void zmenBody(Segment segment) {
        this.body[segment.getBod1()[0]][segment.getBod1()[1]] = ".";
        this.body[segment.getBod2()[0]][segment.getBod2()[1]] = ".";
        this.body[segment.getBod3()[0]][segment.getBod3()[1]] = ".";
    }

}
