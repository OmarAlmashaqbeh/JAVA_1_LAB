package LabSheet_Solution.PAGE_09;
import java.util.Scanner;
public class Question_2 {
    public static int sumOfGreaters (int [] arr, int num) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void  fillEvenOdd(int[] arr, char[]chArr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                chArr[i] = 'E';
            } else {
                chArr[i] = 'O';
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        if (num1 > num2) {
            int T = num1;
            num1 = num2;
            num2 = T;
        }
        int size = num2 - num1 + 1;
        int[] numbers = new int[size];
        for (int i = num1; i <= num2; i++) {
            numbers[i - num1] = i;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nEnter number to calculate sum of all numbers that are greater than it:");
        int num = s.nextInt();
        System.out.println("The sum of all numbers greater than " + num + " is: " + sumOfGreaters(numbers, num));
        char[] chEvenOdd = new char[numbers.length];
        fillEvenOdd(numbers, chEvenOdd);
        for (int i = 0; i < chEvenOdd.length; i++) {
            System.out.print(chEvenOdd[i] + " ");
        }
    }
}