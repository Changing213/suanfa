package quicksort;

public class quicksort {

    public static void main(String[] args) {

        int[] array = {9, 5, 7, 4, 20, 2, 6, 8};
        arrayRank(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
    private static void swop(int[] array, int low, int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }

    private static void arrayRank(int[] array, int lowIndex, int highIndex) {
        int low = lowIndex;
        int high = highIndex;
       int temp = array[(lowIndex + highIndex) / 2];//temp右边是比temp大的，左边是比temp小的
        if (lowIndex < highIndex) {
            while (low <= high) //直到low > high才停止第一轮交换
            {
//                temp = array[(lowIndex + highIndex) / 2];
                while ((low < highIndex) && (array[low] < temp))//此举为了找比temp大的
                {
                    ++low;
                }
                while ((high > lowIndex) && (array[high] > temp)) //此举为了找比temp小的
                {
                    --high;
                }
                if (low <= high) {
                    swop(array, low, high);
                    ++low;
                    --high;
                }
            }
            if (low < highIndex) {
                arrayRank(array, low, highIndex);
            }
            if (high > lowIndex) {
                arrayRank(array, lowIndex, high);
            }


        }
    }
}
