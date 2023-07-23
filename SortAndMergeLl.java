import java.util.*;

public class SortAndMergeLl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        LinkedList<Integer> ll3 = new LinkedList<>();

        System.out.println("Enter elements into LinkedList1: ");
        for(int i=0;i<n;i++) {
            int val = sc.nextInt();
            ll1.add(val);
        }

        System.out.println("Enter elements into LinkedList2: ");
        for(int i=0;i<n;i++) {
            int val = sc.nextInt();
            ll2.add(val);
        }

        Collections.sort(ll1);
        Collections.sort(ll2);

        int i=0,j=0;
        while(i<n && j<n) {
            if(ll1.get(i) < ll2.get(j)) {
                ll3.add(ll1.get(i));
                i++;
            } else if(ll1.get(i) > ll2.get(j)) {
                ll3.add(ll2.get(j));
                j++;
            }
        }

        while(i<n) {
            ll3.add(ll1.get(i));
            i++;
        }

        while(j<n) {
            ll3.add(ll2.get(j));
            j++;
        }

        for(int k=0;k<ll3.size();k++) {
            System.out.println("ll3: "+ll3.get(k));
        }
    }
}
