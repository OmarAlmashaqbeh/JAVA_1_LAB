package LabSheet_Solution.PAGE_10;
public class Question_1 {
    public static int getSumOfArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum+=array[i][j];
            }
        }
        return sum;
    }
    public static int getSumOfRow3(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array[2].length; i++) {
            sum += array[2][i];
        }
        return sum;
    }
    public static int getSumOfCol3(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][2];
        }
        return sum;
    }
    public static int getSumOfDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }
    public static void printRowsSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println("Sum of Row[" + (i + 1) + "] = " + sum);
            sum = 0;
        }
    }
    public static void printColsSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[j][i];
            }
            System.out.println("Sum of Column[" + (i + 1) + "] = " + sum);
            sum = 0;
        }
    }
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,3,4},{7,8,2,2},{9,8,7,6},{1,0,1,2}};
        System.out.println("Sum of all elements in array = " + getSumOfArray(array));
        System.out.println("Sum of the third row of the array = " + getSumOfRow3(array));
        System.out.println("Sum of the third column of the array = " + getSumOfCol3(array));
        System.out.println("Sum of the primary diagonal of the  array = " + getSumOfDiagonal(array));
        printRowsSum(array);
        printColsSum(array);
    }
}