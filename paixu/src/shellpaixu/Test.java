package shellpaixu;

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
        for(int gap = a.length /2; gap > 0; gap /= 2)//希尔增量的希尔排序，每次gap除以二
            for (int i = gap; i < a.length; i++)//每次以gap为插入元素的起点，gap后面的所有元素都进行插入操作
            {
                int temp = a[i];//暂存插入元素
                for(int j = i; j >= gap && temp < a[j - gap]; j -= gap)//只跟插入元素左边间隔gap的元素进行比较，大的则交换
                {
                    a[j] = a[j - gap];
                    a[j - gap] = temp;
                }
            }
//        for(int p = 1; p < a.length; p++){
//            int temp = a[p];//p每次循环将a[p]送到左边适合他的位置，
//            //保证a[p]左边都是排好顺序的
//            for(j = p; j > 0 && temp < a[j - 1]; j--){
//                //只要temp小于左边，我就和他交换，往左移动，直到左边不比我大
//                a[j] = a[j - 1];
//                a[j - 1] = temp;
//            }
//
//        }
        System.out.println();
        for (int i : a) {
            System.out.print(i+",");
        }


    }
}
