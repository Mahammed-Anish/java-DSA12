import java.util.*;
public class Missing {

    public static void missingNum(int arr[], int ans[], int n) {
        for(int i=0;i<n;i++) {
            ans[arr[i]] = 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int mx = arr[n-1];
        int ans[] = new int[mx+1];

        missingNum(arr,ans,n);
        System.out.println("Missing Elements are: ");
        for(int i=1;i<mx;i++) {
            if(ans[i]==0)
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
