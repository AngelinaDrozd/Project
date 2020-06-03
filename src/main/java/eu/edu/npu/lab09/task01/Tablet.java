package eu.edu.npu.lab09.task01;

public class Tablet implements Device {
    public void surfingTheInternet(String nameOfUser) {
        System.out.println(nameOfUser +" surfing the internet using tablet");
    }

    public void playGames(String nameOfUser) {
        System.out.println(nameOfUser +" uses tablet for games tablet");
    }

    public void forWorking(String nameOfUser) {
        System.out.println(nameOfUser +" uses for working tablet");
    }
}
