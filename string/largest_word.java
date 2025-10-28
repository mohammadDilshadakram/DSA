import java.util.*;
public class largest_word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruits[]={"apple","banana","mango","watermelon"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(fruits[i].compareTo(largest)>0){
                largest=fruits[i];
            }
        }
        System.out.println("The largest word is "+largest);
    }
}