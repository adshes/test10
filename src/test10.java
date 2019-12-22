import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число строк: ");
        int s = in.nextInt();
        System.out.print("Введите число столбцов: ");
        int s1 = in.nextInt();
        int nums[][] = new int[s][s1];

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s1; j++) {
                nums[i][j] = in.nextInt();
            }}
        System.out.print("Вывод массива " + "\n");
        for (int i = 0; i < s; ++i) {
            for (int j = 0; j < s1; ++j) {
                System.out.print(nums[i][j] + " ");


            }
            System.out.println();        }

        System.out.print("Вывод сроки * 3" + "\n");
        for (int j = 0; j < s1; ++j) {

            System.out.print(nums[0][j]*3 + " ");
        }}}