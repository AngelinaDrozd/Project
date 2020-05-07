package eu.edu.npu.lab03.Task04;

import java.util.ArrayList;
import java.util.List;

public class PetOwner {
    private String owner;
    private List<Dog> pets;

    public PetOwner()
    {
        pets = new ArrayList<>();
    }

    public PetOwner(String owner)
    {
        this.owner = owner;
        pets = new ArrayList<>();
    }

    public void addPet(String name, int age)
    {
        pets.add(new Dog(name, age));
    }


    public void showPet()
    {
        for (Dog dog: pets) {
            System.out.println(
                    "Name: " + dog.getName() + ", Age: " + dog.getAge()
            );
        }
    }


}
