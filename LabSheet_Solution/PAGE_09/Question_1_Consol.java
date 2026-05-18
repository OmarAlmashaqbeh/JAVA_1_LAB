package LabSheet_Solution.PAGE_09;
import java.util.Scanner;
public class Question_1_Consol {
    public static Scanner s = new Scanner(System.in);
    public static void fillArray(int[] ar, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a mark");
            ar[i] = s.nextInt();
        }
    }
    public static void printArray(int[] ar, int size) {
        System.out.println("The entered marks are:");
        for (int i = 0; i < size; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
    public static double getAverage(int[] ar, int size) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += ar[i];
        }
        return sum / size;
    }
    public static int countAboveAverage(int[] ar, int size, double average) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (ar[i] >= average) {
                count++;
            }
        }
        return count;
    }
    public static int getMinimumMark(int[] ar, int size) {
        int min = ar[0];
        for (int i = 1; i < size; i++) {
                if (min > ar[i]) {
                min = ar[i];
            }
        }
        return min;
    }
    public static int getMaximumMark(int[] ar, int size) {
        int max = ar[0];
        for (int i = 1; i < size; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of marks:");
        final int size = s.nextInt();
        int[] arMark = new int[size];
        fillArray(arMark, size);
        printArray(arMark, size);
        System.out.println("The average = " + getAverage(arMark, size));
        System.out.println("The number of marks that are above the average: " + countAboveAverage(arMark, size, getAverage(arMark, size)));
        System.out.println("Minimum mark is: " + getMinimumMark(arMark, size));
        System.out.println("Maximum mark is: " + getMaximumMark(arMark, size));
    }
}