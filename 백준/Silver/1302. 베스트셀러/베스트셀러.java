import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        int max = 0;
        in.nextLine();
        for(int i=0;i<n;i++){
            String book = in.nextLine();
            if(map.containsKey(book)){
                map.put(book,map.get(book)+1);
            }
            else{
                map.put(book,1);
            }
            max = Math.max(max,map.get(book));
        }
        ArrayList<String> list = new ArrayList<>();
        for(String key: map.keySet()){
            if(map.get(key)==max){
                list.add(key);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}