package eu.edu.npu.lab03.Task02;

public class Pet {
    public String name;
    public int age;

    public Pet(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println("Name is "+ name + " and age are " + age + " years!");
    }
    public Pet (){
        System.out.println("Doesn't have any info");
    }
}
