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

        public static int delete(){
            int data=al.get(0);
            int temp=al.get(0);
            al.set(0, al.get(al.size()-1));
            al.set(al.size()-1, temp);
            al.remove(al.size()-1);
            heapify(0);
            return data;
        }

        public static void heapify(int i){
            int maxIdx=i;
            int left=(2*i)+1;
            int right=(2*i)+2;
            if (left<al.size() && al.get(left)>al.get(i)) {
                 maxIdx=left;
            }
            if (right<al.size() && al.get(right)>al.get(i)) {
                maxIdx=right;
            }
            if (maxIdx!=i) {
                int temp=al.get(i);
                al.set(i, al.get(maxIdx));
                al.set(maxIdx, temp);
                heapify(maxIdx);
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
        System.out.println("After deletion");
        h1.delete();
        h1.display();

     
    }
}
