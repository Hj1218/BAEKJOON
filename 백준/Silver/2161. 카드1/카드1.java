import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(true){
            System.out.print(q.poll()+" ");
            if(q.isEmpty()){
                break;
            }
            int a = q.poll();
            q.add(a);
        }
    }
}
