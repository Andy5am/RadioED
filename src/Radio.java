public interface Radio {
    public void toggle();
    public boolean getState();
    public void changeFrecuency();
    public void changeStation(boolean up);
    public boolean getFrecuency();
    public void saveStation(int numButton);
    public void changeStationButton(int numButton);
    public double getStation();
}
