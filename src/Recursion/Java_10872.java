package Recursion;

import java.util.Scanner;

public class Java_10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int N = scanner.nextInt();
        scanner.close();

        int sum = factorial(N);
        System.out.println(sum);
    }
    public static int factorial(int N) {
        if(N <= 1) return 1;
        return N * factorial(N-1);
    }
}
//메모리 17712KB, 시간 208ms