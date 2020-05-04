package ua.edu.npu.lab02.task02;

public class Dog {
    private int age;
    private String name;

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
    public void contacts(){
        System.out.println("Name is "+ name + " and age are " + age + " years!");
    }
    public void said(){
        for ( int i=0; i<age; i++){
            System.out.print("gav ");
        }
    }

}
