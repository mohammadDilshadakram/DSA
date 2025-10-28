import java.util.*;
public class checkoccur{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        int i,k,j;
        boolean c=true;
        for(j=0;j<arr.length;j++){
            System.out.println("Enter the number");
            arr[j]=sc.nextInt();

        
        }
// email-dilnawaz.akram@gds.ey.com
// pass-dna@AK52208




        for(i=0;i<arr.length;i++){
            for(k=i+1;k<arr.length;k++)
            if(arr[i]==arr[k]){
                c=false;
                System.out.println(c);
            }

        }



System.out.println(c);



    }
}





// import java.util.*;

// public class CheckOccur {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[4];
//         boolean hasDuplicates = false;

//         // Reading array elements from user
//         for (int j = 0; j < arr.length; j++) {
//             System.out.println("Enter the number:");
//             arr[j] = sc.nextInt();
//         }

//         // Checking for duplicates
//         for (int i = 0; i < arr.length; i++) {
//             for (int k = i + 1; k < arr.length; k++) {
//                 if (arr[i] == arr[k]) {
//                     hasDuplicates = true;
//                     break;
//                 }
//             }
//             if (hasDuplicates) {
//                 break;
//             }
//         }

//         // Output the result
//         System.out.println("Array has duplicates: " + hasDuplicates);
//     }
// }
