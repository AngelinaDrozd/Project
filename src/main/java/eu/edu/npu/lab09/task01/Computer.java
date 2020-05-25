package eu.edu.npu.lab09.task01;

public class Computer implements Device {
    public void surfingTheInternet(String nameOfUser) {
        System.out.println(nameOfUser +" surfing the internet using computer");
    }

    public void playGames(String nameOfUser) {
        System.out.println(nameOfUser +" uses computer for games");
    }

    public void forWorking(String nameOfUser) {
        System.out.println(nameOfUser +" uses computer good for working");
    }
}
