import java.util.Arrays;

public class HomeWorkApp3a {
    public static void main(String[] args) {
        int one = 1;
        int zero = 0;
        int len = 5;
        int initialValue = 38;
        int[] compare = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        int[] arraysearch = new int[]{-1567, 54, 38, -1, 65, 248, 3154, -547, -54, -85, -24, 4587};
        System.out.println();
        int[] arrayReplacement = arrayReplacement();
        System.out.println();
        int[] makeAnArray = makeAnArray();
        System.out.println();
        int[] arrayMultiply = arrayMultiply();
        System.out.println();
        int[][] makeFilling = makeFilling(one, zero);
        System.out.println(Arrays.toString(acceptAndFill(len, initialValue)));
        System.out.println(Arrays.toString(doSearch(arraysearch)));
        System.out.println(doCompare(compare));
        doBias(compare, len);
        System.out.println(Arrays.toString(compare));

    }

    public static int[] arrayReplacement() {
        int[] arrayReplacement = new int[]{1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1};
        for (int i = 0; i < arrayReplacement.length; i++) {
            if (arrayReplacement[i] == 0) {
                arrayReplacement[i] = 1;
                System.out.print(arrayReplacement[i] + ", ");
            } else {
                arrayReplacement[i] = 0;
                System.out.print(arrayReplacement[i] + ", ");
            }
        }
        return arrayReplacement;
    }

    public static int[] makeAnArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static int[] arrayMultiply() {
        int[] multiply = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, 5, 6, 11, 3};
        for (int i = 0; i < multiply.length; i++) {
            if (multiply[i] < 6) {
                multiply[i] = multiply[i] * 2;
                System.out.print(multiply[i] + " ");
            } else {
                System.out.print(multiply[i] + " ");
            }
        }
        return multiply;
    }

    public static int[][] makeFilling(int one, int zero) {
        int[][] Filling = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j || 5 - i == j) {
                    System.out.print(one + " ");
                } else {
                    System.out.print(zero + " ");
                }
            }
            System.out.println();
        }
        return Filling;
    }

    public static int[] acceptAndFill(int len, int initialValue) {
        int[] arrAccept = new int[initialValue];
        for (int i = 0; i < arrAccept.length; i++) {
            arrAccept[i] = initialValue;
        }
        return arrAccept;
    }

    public static int[] doSearch(int[] arraysearch) {
        int[] result = new int[2];
        for (int i = 0; i < arraysearch.length; i++) {
        }
        int min = arraysearch[0];
        for (int i = 0; i < arraysearch.length; i++) {
            if (min > arraysearch[i]) {
                min = arraysearch[i];
            }
        }
        result[0] = min;

        int max = arraysearch[0];
        for (int i = 0; i < arraysearch.length; i++) {
            if (max < arraysearch[i]) {
                max = arraysearch[i];
            }
        }
        result[1] = max;
        return result;
    }

    public static boolean doCompare(int[] compare) {
        int sum = 0;
        int sum1 = 0;
        int array = compare.length;
        for (int i = 0; i < compare.length - 1; i++) {
            sum += compare[i];
            for (int j = compare.length - 1; j >= i + 1; j--) {
                sum1 += compare[j];
            }
            if (sum == sum1) {
                return true;
            }
            sum1 = 0;
        }
        return false;
    }

    public static void doBias(int[] compare, int N) {
        int number = N > 0 ? N : -N;
        for (int i = 0; i < number; i++) {
            if (N > 0) {
                int save = compare[0];
                for (int j = 0; j < compare.length - 1; j++) {
                    compare[j] = compare[j + 1];
                }
                compare[compare.length - 1] = save;
            } else {
                int save = compare[compare.length - 1];
                for (int j = compare.length - 1; j > 0; j--) {
                    compare[j] = compare[j - 1];
                }
                compare[0] = save;
            }
        }
    }
}





