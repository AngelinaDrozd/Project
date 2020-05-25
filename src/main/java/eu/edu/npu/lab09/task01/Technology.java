package eu.edu.npu.lab09.task01;

public class Technology {
    private String name;
    private Device device;

    public Technology(String name, Device device) {
        this.name = name;
        this.device = device;
    }
    public Technology(String name) {
        this.name = name;
    }

    public Technology() {
    }

    public void surfingTheInternet (){
        device.surfingTheInternet(name);
    }

    public void playGame(){
        device.playGames(name);
    }

    public void forWorking(){
        device.forWorking(name);
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
