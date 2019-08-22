package sortTest;

/**
 * @ClassName :SortMethod
 * @Description :各种排序算法，算是个逐渐添加的记录类
 * @Author :DexterMrC
 * @Date :2019/8/19 19:24
 **/
public class SortMethod {
    //选择排序
    public static void selectSort(int arr[]) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(arr[i]>arr[j]) {
                    arr[i] = arr[i]^arr[j];
                    arr[j] = arr[i]^arr[j];
                    arr[i] = arr[i]^arr[j];
                }
            }
            for (int i1 : arr) {
                System.out.print(i1+"\t");
            }
            System.out.println();
        }
        for (int i : arr) {
            System.out.print(i+"\t");
        }
    }
    //插入排序
    public static void insertSort(int arr[]) {
        int i;
        int j;
        int n=arr.length;
        //外层循环，控制循环总次数
        for (i=1;i<n;i++) {
            //临时变量，
            // 存储需要插入的数字，以便空出空位置。让比临时变量大的数字后退。
            int temp = arr[i];
            //内层循环，
            // 控制比临时变量大的数字后退。
            for (j=i-1;j>=0&&arr[j]>temp;j--) {
                //数字后退，
                //（比临时变量大的数字向后退，同时因为临时变量已经存储到了temp中，所以等于空出了一个临时变量的位置）
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
        for (int i1 : arr) {
            System.out.print(i1+"\t");
        }
    }
}
