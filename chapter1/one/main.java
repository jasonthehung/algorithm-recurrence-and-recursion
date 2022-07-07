package one;

public class main {
    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400, 500, 600 };
        int sum1 = sum1(arr), sum2 = sumToEnd(arr, 0);
        System.out.printf("%d and %d are equal.\n", sum1, sum2);
    }

    public static int sum1(int[] arr) {
        var sum = 0;
        for (var n : arr) {
            sum += n;
        }
        return sum;
    }

    public static int sumToEnd(int[] arr, int cur) {
        if (cur == arr.length)
            return 0;
        return arr[cur] + sumToEnd(arr, cur + 1);
    }
}