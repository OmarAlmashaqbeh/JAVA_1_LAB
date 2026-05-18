package LabSheet_Solution.PAGE_09;
import javax.swing.JOptionPane;
public class Question_1_Dialog {
    public static void fillArray(int[] ar, int size) {
        for (int i = 0; i < size; i++) {
            String str = JOptionPane.showInputDialog(null, "Enter a mark:");
            ar[i] = Integer.parseInt(str);
        }
    }
    public static void printArray(int[] ar, int size) {
        String output = "The entered marks are:\n";
        for (int i = 0; i < size; i++) {
            output += ar[i] + " ";
        }
        JOptionPane.showMessageDialog(null, output);
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
        String str = JOptionPane.showInputDialog(null, "Enter the number of marks:");
        final int size = Integer.parseInt(str);
        int[] arMark = new int[size];
        fillArray(arMark, size);
        printArray(arMark, size);
        JOptionPane.showMessageDialog(null, "The average = " + getAverage(arMark, size), "Average", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The number of marks that are above the average: " + countAboveAverage(arMark, size, getAverage(arMark, size)), "Above Average", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Minimum mark is: " + getMinimumMark(arMark, size), "Minimum Mark", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Maximum mark is: " + getMaximumMark(arMark, size), "Maximum Mark", JOptionPane.INFORMATION_MESSAGE);
    }
}