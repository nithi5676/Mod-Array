package modArray;

import java.util.Scanner;

public class ModArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        System.out.println("Enter array elements");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter mod value: ");
        int mod = scanner.nextInt();
        scanner.close();
        System.out.println(lastMod(array, mod));
    }

    private static int lastMod(int array[], int mod) {
        int result = 0, power = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            result = (result + (array[i] % mod) * power) % mod;
            power = (power * 10) % mod;
        }
        return result;
    }

}
