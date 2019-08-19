package sortTest;

/**
 * @ClassName :SortMethod
 * @Description :
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
}
