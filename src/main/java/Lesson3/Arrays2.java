package Lesson3;

public class Arrays2 {

    public static void main(String[] args) {

        int[][] arr2d = new int[5][5];
        for (int i = 0; i < arr2d.length; i++){
            for (int j = 0; j < arr2d[i].length; j++){
                if (i == j) arr2d[i][j] = 1;
                if (j == arr2d.length - 1 - i) arr2d[i][j] = 1;
                System.out.format("%d ", arr2d[i][j]);
            }
            System.out.println();
        }
    }
}
