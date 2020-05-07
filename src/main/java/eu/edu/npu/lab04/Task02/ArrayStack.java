package eu.edu.npu.lab04.Task02;

public class ArrayStack implements Stack{
    private int stck[];
    private int tos;

    ArrayStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public ArrayStack() {

    }

        /*public int size;
        public int []array;
        public int top;
        void ArrayStackStack(int s)
        {
            size =s;
            array = new int[size];
            top=-1;
        }*/

    @Override
    public void push ( int data){
        if(tos==stck.length-1) // использование члена длины стека
            System.out.println("Стек полон.");
        else
            stck[++tos] = data;
        //array[++top] = data;
    }

    @Override
    public int pop () {
            /*int i;
            if (isEmpty())
            {
                System.out.println("Стек пустой!");
                return 0;
            }
            else
            {
                System.out.println("Удаленный элемент из стека - "+top);
                return array[top--];

            }*/
        return 0;
    }

    @Override
    public int size () {
        return 0;
    }

    @Override
    public boolean isEmpty () {
        return false;
    }

    @Override
    public void clear () {

    }
}
