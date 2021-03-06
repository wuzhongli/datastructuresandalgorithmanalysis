package recursion;

/**
 * 使用递归的方式对数组求和
 *
 * @author wzl
 */
public class Sum {

    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    /**
     * arr[left...n)这个区间内所有数字的和
     */
    private static int sum(int[] arr, int left) {
        if (left == arr.length) {
            return 0;
        }
        return arr[left] + sum(arr, left + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum(array));
    }
}
