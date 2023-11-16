    
    /**
     * Write a description of class Auto here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Auto {
        private Obdlznik auto;
        
        /**
         * Constructor for objects of class Auto
         */
        public Auto(int poziciaX,int poziciaY, boolean vertikal) {
            this.auto = new Obdlznik();
            this.auto.posunVodorovne(poziciaX - 60);
            this.auto.posunZvisle(poziciaY - 50);
            if (vertikal == false) {
                this.auto.zmenStrany(60, 30);
            }
            this.auto.zmenFarbu("magenta");
        }
        
        public void posunZelena(int smer){
            switch (smer) {
                case 1:
                    this.auto.posunZvisle(5);
                    break;
                case 2:
                    this.auto.posunVodorovne(-5);
                    break;
                case 3:
                    this.auto.posunZvisle(-5);
                    break;
                case 4:
                    this.auto.posunVodorovne(5);
                    break;
            }
        }
        
        public void posunCervena(int smer){
            switch (smer) {
                case 1:
                    if (this.auto.getY() >= 130 && this.auto.getY() <= 140){
                        break;
                    } else {
                        this.auto.posunZvisle(5);
                    }
                    break;
                case 2:
                    if (this.auto.getX() >= 295 && this.auto.getX() <= 305){
                        break;
                    } else {
                        this.auto.posunVodorovne(-5);
                    }
                    break;
                case 3:
                    if (this.auto.getY() >= 280 && this.auto.getY() <= 300){
                        break;
                    } else {
                        this.auto.posunZvisle(-5);
                    }
                    break;
                case 4:
                    if (this.auto.getX() >= 135 && this.auto.getX() <= 145){
                        break;
                    } else {
                        this.auto.posunVodorovne(5);
                    }
                    break;
            }
        }
        
        public void opakuj(int smer) {
            switch (smer) {
                case 1:
                if (this.auto.getY() > 560){
                    this.auto.posunZvisle(-620);
                }
                break;
            case 2:
                if (this.auto.getX() < -60){
                    this.auto.posunVodorovne(620);
                }
                break;
            case 3:
                if (this.auto.getY() < -60){
                    this.auto.posunZvisle(560);
                }
                break;
            case 4:
                if (this.auto.getX() > 560){
                    this.auto.posunVodorovne(-620);
                }
                break;
        }
    }
}
