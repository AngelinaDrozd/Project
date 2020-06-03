package eu.edu.npu.lab09.task01;

public class App {
    public static void main(String[] args) {
        Technology tech = new Technology("Angelina");
        tech.setDevice(new Computer());
        tech.playGame();
        tech.surfingTheInternet();

        tech.setDevice(new Phone());
        tech.playGame();
        tech.surfingTheInternet();

        tech.setDevice(new Tablet());
        tech.playGame();
        tech.surfingTheInternet();
    }
    }
