import java.util.*;
public class insertion {

    public static class Heap{
        static ArrayList<Integer> al=new ArrayList<>();
        public static void insert(int val){
            
            al.add(val);
            int n=al.size()-1;
            int par=(n-1)/2;
            while (n>0 && al.get(par)<al.get(n)) {//descending order
                int temp=al.get(par);
                al.set(par,al.get(n));
                al.set(n,temp);
                n=par;
                par=(n-1)/2;
            }

        }

        public static void display(){
            for (int i = 0; i < al.size(); i++) {
                System.out.println(al.get(i));
            }
        }
    } 
    public static void main(String[] args) {
        Heap h1=new Heap();
        h1.insert(2);
        h1.insert(6);
        h1.insert(8);
        h1.insert(1);
        h1.insert(0);
        h1.insert(90);
        h1.display();

     
    }
}
