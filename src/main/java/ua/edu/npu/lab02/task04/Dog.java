package ua.edu.npu.lab02.task04;

public class Dog {
    private int age ;
    private String name;
    static int count = 0;



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

    public void said(){
        for ( int i=0; i<age; i++){
            System.out.println("gav ");
        }
    }
    public Dog(int count) {
        Dog.count =count;
        count++;
        System.out.printf("count" + count++);

    }
    public void count() {
        count++;
        System.out.println("The number of dogs:" + count);
    }
}
