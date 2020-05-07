package eu.edu.npu.lab03.Task04;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog ("Rex",4 );
        dog.swim();
        dog.walk();
        dog.talk();

        PetOwner ow = new PetOwner();
        ow.addPet("Rox", 7);
        ow.addPet("Max", 6);
        ow.showPet();

    }
}
