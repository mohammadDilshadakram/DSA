import java.util.*;
public class twoStackinArray {
    public static class stackInArray{
        int arr[]=new int[100];
        int n=arr.length;
        int top1=-1;
        int top2=n;
        public void push1(int x){
            if (top1<top2-1) {
                arr[++top1]=x;
            }else{
                System.out.println("Stack overflow for stack1");
            }
        }
        public int peek1(){
            if (top1>=0) {
                return arr[top1];
            }else{
                return -1;
            }
        }
        public int pop1(){
            if (top1>=0) {
                return arr[top1--];
            }else{
                return -1;
            }
        }
        public void push2(int x){
            if (top2>top1+1) {
                arr[--top2]=x;
            } else {
                System.out.println("Stack overflow for stack2");
            }
        }
        public int peek2(){
            if (top2<n) {
                return arr[top2];
            }else{
                return -1;
            }
        }
        public int pop2(){

            
            if (top2<n) {
                return arr[top2++];
            }else{
                return -1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stackInArray ts = new stackInArray();
        ts.push1(2);
        ts.push1(3);
        ts.push2(4);
        System.out.print(ts.pop1() + " ");
        System.out.print(ts.pop2() + " ");
        System.out.print(ts.pop2() + " ");
    }

}
