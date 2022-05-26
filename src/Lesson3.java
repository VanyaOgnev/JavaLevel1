public class Lesson3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Task 1: ");
        invertArray(arr1);
        System.out.println("Task 2: ");
        fillArray(100);
        System.out.println("Task 3: ");
        changeArray(arr3);
        System.out.println("Task 4: ");
        fillDiagonal();
    }

    public static void invertArray(int[ ] arr) { // Задание 1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }

        System.out.print( arr [i] + " ");}
    }

    public static void fillArray(int size) { // Задание 2
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeArray(int[] arr) { // Задание 3
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillDiagonal() {// Задание 4
    int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (i == j) {
                arr[i][j] = 1;
            }
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}




}


















