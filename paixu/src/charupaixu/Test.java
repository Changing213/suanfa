package charupaixu;

import javax.jws.soap.SOAPBinding;

public class Test {
    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        int[] a = {81,94,11,96,12,35,17,95,28,58,41,75,15};

        for (int i : a) {
            System.out.print(i+",");
        }
        insertionSort(a);
        double end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void insertionSort(int[] a)  {
        int j;
        for(int p = 1; p < a.length; p++){
            int temp = a[p];//p每次循环将a[p]送到左边适合他的位置，
            //保证a[p]左边都是排好顺序的
            for(j = p; j > 0 && temp < a[j - 1]; j--){
                //只要temp小于左边，我就和他交换，往左移动，直到左边不比我大
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }
        }
        System.out.println();
        for (int i : a) {
            System.out.print(i+",");
        }
//int gap =13;
//        System.out.println(gap += 2);

    }
}
