package implimentation;

import myinterface.MyStackADT;

public class MyStack implements MyStackADT {
    private final int MAX_CAPACITY;

    int top;
    int[] arr;

    public MyStack(int MAX_CAPACITY) {
        this.MAX_CAPACITY = MAX_CAPACITY;
        arr = new int[MAX_CAPACITY];
        top = 0;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public void push(int element) {
        if (top != MAX_CAPACITY) {
            arr[top] = element;
            top++;
        } else {
            System.out.println("Stack OverFlow!");
        }
    }

    @Override
    public int pop() {
        int response = 0;  //considering 0 as invalid data
        if (!isEmpty()) {
            top--;    //jab top ki value 0 hota hai to top ek operation
            // ke bad next index pe chala jata hai..
            // to usko pahle pichle pe lana padega
            response = arr[top];
            arr[top] = 0;
        } else {
            System.out.println("Stack UnderFlow");
        }
        return response;
    }

    @Override
    public int peek() {
        int response = 0;
        if (!isEmpty()) {
            response =arr[top - 1];
        } else {
            System.out.println("Stack is Empty");
        }
        return response;
    }

    @Override
    public int size() {
        return top;
    }
    @Override
    public void traverse(){
        if(!isEmpty()){
            for (int i = 0; i < top; i++) {
                System.out.println(arr[i]+", ");
            }
        }
        else{
            System.out.println("stack is empty!");
        }
    }
    public boolean search(int element){
        boolean response=false;
            for (int i = 0; i < top; i++) {
                if(element==arr[i]){
                    response=true;
                    break;
            }
        }
        return response;
    }
}
