package Recursion;

import java.util.Scanner;

public class Java_10870 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println(fibonacci((n)));

    }
    static int fibonacci(int n) {
      if (n == 0) return 0;
      if (n == 1) return 1;

      return fibonacci(n-1) + fibonacci(n-2);
    }
}

//메모리 17684KB, 시간 204ms
