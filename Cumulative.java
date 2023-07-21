import java.util.*;
public class Cumulative {

    public static void cumulative(int arr[],int n) {
        for(int i=1;i<n;i++) {
            arr[i] = arr[i]*arr[i-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter length of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            if(n == 0) {
                throw new Exception("Array Length cannot be zero");
            }

            System.out.print("Enter array elements: ");
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            cumulative(arr,n);

            System.out.println("Array Elements are: ");
            for(int i=0;i<n;i++) {
                System.out.println(arr[i]);
            }
        } catch(Exception e) {
            System.out.println("Exception caused: "+e);
        }
    }
}
