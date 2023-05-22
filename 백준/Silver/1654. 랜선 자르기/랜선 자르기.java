import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k=in.nextInt(); //가지고 있는 랜선의 개수 k
        int n=in.nextInt(); //필요한 랜선의 개수 n
        int [] num=new int[n];
        long start=1;
        long end=0; //제일 긴 랜선의 길이
        for(int i=0;i<k;i++){
            num[i]=in.nextInt(); //k개의 랜선 길이를 저장
            if(end<num[i]){
                end=num[i];
            }
        }
        long mid=0; //랜선의 최대 길이
        while(start<=end){
            long count=0; //랜선의 개수
            mid=(end+start)/2;
            for(int j=0;j<k;j++){
                count+=num[j]/mid; //만들 수 있는 랜선의 개수
            }
            if(count>=n){ //n개 이상 만들 수 있는 경우
                start = mid+1;  //랜선 길이의 범위는 start----------mid[//////////end]
            }
            else { //n를 못 만드는 경우
                end = mid-1;  //랜선 길이의 범위는 [start//////////]mid----------end
            }
        }
        System.out.print(end);
    }
}