import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static class Room implements Comparable<Room>{
        int start;
        int end;
        public Room(int start, int end){
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(Room o){
            if(end == o.end){
                return start - o.start;
            }
            return end - o.end;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Room[] rooms = new Room[n];
        for(int i=0;i<n;i++){
            int startTime = in.nextInt();
            int endTime = in.nextInt();
            rooms[i]=new Room(startTime,endTime);
        }
        Arrays.sort(rooms);
        int count = 0;
        int time = 0;
        for(int i=0;i<n;i++){
            if(time<=rooms[i].start){
                count++;
                time = rooms[i].end;
            }
        }
        System.out.println(count);
    }
}