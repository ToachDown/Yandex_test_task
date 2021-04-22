import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
            arr1[i] = arr[i];
        }
        for(int i = 0; i < n; i++){
            int l = 0;
           for(int j = 0; j < n; j++){
               if(i == j ) continue;
               arr1[l] = size(arr[i],arr[j]);
               l++;
           }
           for (int min = 0; min < n-1; min++) {
                int least = min;
                for (int j = min + 1; j < n; j++) {
                    if (arr1[j] < arr1[least]) {
                        least = j;
                    }
                }
                int tmp = arr1[min];
                arr1[min] = arr1[least];
                arr1[least] = tmp;
           }
           int b = 0;
           int sum =0;
           while(b < k){
               sum+=arr1[b];
               b++;
           }
           result[i] = sum;
        }
        for(int i = 0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int size(int a, int b){
        if(a-b < 0)
            return (a-b)*(-1);
        else
            return a-b;
    }
}
