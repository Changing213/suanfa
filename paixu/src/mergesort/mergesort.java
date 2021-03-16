package mergesort;

public class mergesort {

    public static void main(String[] args) {

        int[] array = {81,94,11,96,12,35,17,95,28,58,41,75,15};
        mergesort(array,0,array.length-1);
        for (int i : array) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
    public static  void mergesort(int[] a,int low,int high){//就是拆  别管那么多
        int mid = (low+high)/2;
        if(low<high){
            mergesort(a,low,mid);//拆拆拆，一半一半拆，拆到只剩一个数为止
            mergesort(a,mid+1,high);//老大说拆，我也跟着，拆拆拆，老大全都拆完，我再拆，也是拆到一个数为止
            //左右归并，反正轮到我执行的时候，假设老大和老二都排好了
            merge(a,low,mid,high);//拆到只剩一个数字，我才执行，执行完返回上一级，再执行，1+1 2+2 4+4
        }

    }
    public static void merge(int[] a, int low, int mid, int high) {//开始从第一级一个一个合并，再两个两个合并
        int[] temp = new int[high-low+1];//用来接住排好的数组
        int i= low;//可不得从山脚下开始
        int j = mid+1;//注意哈，你得从山脚下开始找，类似于选择排序
        int k=0;




        // 把较小的数先移到新数组中，找最小
        while(i<=mid && j<=high)//其中有一组已经找完了，开始下面的扫荡
        {
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        // 是你还剩没交的吗？老实点。把左边剩余的可能一个也可能不止一个数移入数组
        while(i<=mid){
            temp[k++] = a[i++];
        }
        // 不是他就是你！把右边剩余的可能一个也可能不止一个数移入数组
        while(j<=high){
            temp[k++] = a[j++];
        }



        // 把新数组中的数覆盖nums数组
        for(int x=0;x<temp.length;x++){
            a[x+low] = temp[x];
        }
    }

}
