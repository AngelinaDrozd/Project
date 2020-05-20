package ua.edu.npu.lab02.task03;

public class Dog {
    private int age ;
    private String name;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Name is "+ name + " and age are " + age + " years!");
    }
    public Dog( ){
        System.out.println("Name is unknown and its age is 0 !");
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


    public void said(){
        for ( int i=0; i<age; i++){
            System.out.print("gav ");
        }
    }
}
