public class RadioImp implements Radio {

    private boolean state;
    private boolean frecuency;
    private double station;
    private double[] buttonAM = new double[12];
    private double[] buttonFM = new double[12];


    public RadioImp(){
        this.state = false;
        this.frecuency = true;
        this.station = 87.9;
    }
    public void toggle(){
        this.state = !this.state;
    }
    public boolean getState() {
        return state;
    }
    public void changeFrecuency(){
        this.frecuency = !this.frecuency;
        if (this.frecuency) {
            this.station = 87.9;
        } else {
            this.station = 530;
        }
    }
    public void changeStation(boolean up){
        if (this.frecuency){
            if (up){
                this.station = this.station + 0.2;
                if (this.station > 107.9){
                    this.station = 87.9;
                }
            }
            else {
                this.station = this.station -0.2;
                if (this.station < 87.9){
                    this.station = 107.9;
                }
            }
        }
        else {
            if (up){
                this.station = this.station + 10;
                if (this.station > 1610){
                    this.station = 530;
                }
            }
            else{
                this.station = this.station -10;
                if (this.station < 530){
                    this.station = 1610;
                }
            }
        }
    }
    public boolean getFrecuency(){
        return frecuency;
    }
    public void saveStation(int numButton){
        if (this.frecuency){
            this.buttonFM[numButton-1] = this.station;
        }
        else {
            this.buttonAM[numButton-1] = this.station;
        }
    }
    public void changeStationButton(int numButton){
        if (this.frecuency){
            this.station = this.buttonFM[numButton-1];
        }
        else {
            this.station = this.buttonAM[numButton-1];
        }
    }
    public double getStation(){
        return station;
    }

    @Override
    public String toString() {
        String str = "";

        String strFre = "";
        if (this.frecuency){
            strFre = "FM";
        }else{
            strFre = "AM";
        }

        if (this.state){
            str = "\tEncendido\n";
            str += "Estacion: "+this.station+"\n";
            str += "Frecuencia: "+strFre+"\n";
            str += "Boton 1\n";
            str += "Boton 2\n";
            str += "Boton 3\n";
            str += "Boton 4\n";
            str += "Boton 5\n";
            str += "Boton 6\n";
            str += "Boton 7\n";
            str += "Boton 8\n";
            str += "Boton 9\n";
            str += "Boton 10\n";
            str += "Boton 11\n";
            str += "Boton 12\n";


        }else {
            str = "\t Apagado\n";
        }
        return str;


    }
}
