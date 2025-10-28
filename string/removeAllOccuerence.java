
public class removeAllOccuerence {
    public static void main(String args[]){
        String str="aaaabcssssdeerrraamincccd";
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                continue;
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);

    }

}
