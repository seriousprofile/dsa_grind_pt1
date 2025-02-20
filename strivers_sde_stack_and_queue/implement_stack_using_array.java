/*
NOTES:
when you want to convert a stack to an array, you just simply use the top pointer and manipulate 
it accordingly. 
1. for push, you do top++ so that it goes from -1 index to 0. 
2. for pop, you do top-- so that the index goes back to the previous index.
*/

class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
       top++;
       arr[top]=x;
    }

    public int pop() {
        if(top==-1){
            return -1;
        }
        int res=arr[top];
        top--;
        return res;
    }
}
