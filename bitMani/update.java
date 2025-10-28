import java .util.*;
public class update {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number in binary to get updated");
        int n=sc.nextInt();
        System.out.println("Enter the value to be reflect");
        int key=sc.nextInt();
        System.out.println("Enter the index to get update");
        int i=sc.nextInt();

        if(key==1){
            int bitMask=1<<i;
            System.out.println(n|(bitMask));
        }
        if(key==0){
            int bitMask=~(1<<i);
            System.out.println(n&(bitMask));
        }

        sc.close();
    }
}
