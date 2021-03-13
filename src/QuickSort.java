import java.util.PriorityQueue;

public class QuickSort {
    static void QuickSort(int[] a, int l, int r){
        int mid = (r + l) / 2;
        if (a.length == 0)
            return;
        if (l >= r)
            return;
        int op = a[mid];
        int L = l, R = r;
        while (L <= R) {
            while (a[L] < op) {
                L++;
            }
            while (a[R] > op) {
                R--;
            }

            if (L <= R) {
                int temp = a[L];
                a[L] = a[R];
                a[R] = temp;
                L++;
                R--;
            }
        }
        if (l < R)
            QuickSort(a, l, R);

        if (r > L)
            QuickSort(a, L, r);
    }
    public static void main(String[] args) {
        int[] a = {7, 1, 8, 4, 90, 92, 74, -2};
//        QuickSort(a, 0, a.length - 1);
//        int k = 0;
        int[] b = {0, 0, 0, 0, 0, 0, 0, 0};
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < a.length; ++i){
            heap.add(a[i]);
        }
        for (int i = 0; i < a.length; ++i){
            b[i] = heap.remove();
        }
        for(int i = 0; i < a.length; ++i){
            System.out.print(b[i] + " ");
        }
    }

}