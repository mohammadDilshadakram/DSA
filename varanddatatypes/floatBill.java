import java.util.*;
public class floatBill{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        float pencilPrice,penPrice,eraserPrice,bill;
        System.out.println("Enter the price of pencil ");
        pencilPrice=sc.nextFloat();

        System.out.println("Enter the price of pen");
        penPrice=sc.nextFloat();

        System.out.println("Enter the price of Eraser");
        eraserPrice=sc.nextFloat();

        bill=pencilPrice+penPrice+eraserPrice;
        System.out.println("The total bill is"+bill);
    }

}
