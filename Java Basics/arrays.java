public class arrays {
    public static void main(String[] args) {
        int[] array;
        array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = i * 2 + 1;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        // 2D array
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
