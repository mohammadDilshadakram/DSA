import java.util.*;
public class subsequence{
    public static void subseq(String s,int index,String newstr){
        if(index==s.length()){
            if(newstr==""){
                System.out.println("NULL");
            }else{
                System.out.println(newstr);
            }
            
            return;
        }
        char ch=s.charAt(index);
        //want to add
        subseq(s,index+1,newstr+ch);
        //dont want to add
        subseq(s,index+1,newstr);
        return;
    }
    public static void main(String[] args) {
        subseq("abc", 0, "");
    }
}
