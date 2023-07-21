import java.util.*;

public class Singular {

    public static void singularSocks(int arr[],int n) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int cnt = 0;
        for(int i=0;i<n;i++) {
            mp.put(arr[i],mp.getOrDefault(arr[i], 0)+1);
        }

        System.out.print("Singulars are: ");
        for(Integer keys : mp.keySet()) {
            if(mp.get(keys)%2 != 0) {
                System.out.print(keys+" ");
                cnt++;
            }
        }
        System.out.println();
        System.out.println("Count of Singulars in an array is: "+cnt);
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

        singularSocks(arr,n);
    }
}
