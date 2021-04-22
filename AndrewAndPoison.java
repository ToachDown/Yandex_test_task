import java.util.Scanner;

public class AndrewAndPoison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        int sum = arr[0];
        int max = arr[0];
        boolean sort = true;
        int min = arr[0];
        for(int i = 1; i < n; i++){
            sum+=arr[i];
            if(arr[i-1] > arr[i]){
                sort = false;
            }
            if(max < arr[i]){
                max =arr[i];
            }
        }
        int count = 0;
        for(int i =0; i < n; i++) {
            if (max == arr[i]) {
                count++;
            }
        }
        int res;
        if(!sort){
            res = -1;
        } else{
            res = max - arr[0];
        }
        System.out.println(res);
    }
}
