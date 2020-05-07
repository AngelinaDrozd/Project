package eu.edu.npu.lab03.Task04;

public class Dog extends Pet implements Talking, Walking, Swimming {
    private int age ;
    private String name;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Name is "+ name + " and age are " + age + " years!");
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    @Override
    public void swim() {
        System.out.println("Dog swims");
    }

    @Override
    public void talk() {
        System.out.println("I eat meat");
    }

    @Override
    public void walk() {
        System.out.println("I walk everyday");

    }
}
