import java.util.*;
public class minStack{
    private class Pair{
        int value;
        int minValue;
        Pair(int value,int minValue){
            this.value=value;
            this.minValue=minValue;
        }
    }
    Stack<Pair> s=new Stack<>();

    public void push(int value){
        if(s.isEmpty()){
            s.push(new Pair(value,value));
        }else{
            int currentMin=Math.min(s.peek().minValue,value);
            s.push(new Pair(value,currentMin));
        }
    }
    public void pop(){
        if(!s.isEmpty()){
            s.pop();

        }
    }
    public int peek(){
        if(!s.isEmpty()){
            return s.peek().value;
           
        }
         throw new EmptyStackException();
    }
    public int minValue(){
        if(!s.isEmpty()){
            return s.peek().minValue;
        }
        throw new EmptyStackException(); 

    }
    public static void main(String args[]){
        minStack s=new minStack();
        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);
         System.out.println("Min: " + s.minValue()); // 2
        s.pop();
        System.out.println("Top: " + s.peek());    // 7
        System.out.println("Min: " + s.minValue()); // 3

    }
}