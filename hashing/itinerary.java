import java.util.*;
public class itinerary {

    public static String getStart(HashMap<String,String> map){
        HashMap<String,String> revmap=new HashMap<>();
        for (String city : map.keySet()) {
            revmap.put(map.get(city), city);
        }

         for (String city : map.keySet()) {
            if (!revmap.containsKey(city)) {
                return city;
            }
        }
        return null;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> map=new HashMap<>();
        map.put("Chennai", "Bangalore");
        map.put("Bombay", "Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi" , "Goa");

        String start=getStart(map);

        System.out.print(start);
        for (String cityString : map.keySet()) {
            if (map.containsKey(start)) {
            System.out.print("-->"+map.get(start));
            start=map.get(start);
            }
           
        }


    }
}
