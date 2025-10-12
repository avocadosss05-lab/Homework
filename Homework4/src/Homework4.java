import java.util.Scanner;

public class Homework4 {

    // 재귀호출 버전
    public static int gcd(int m, int n) {
        if (n == 0) { // n이 0이면 m이 최대공약수
            return m;
        } else {
            return gcd(n, m % n); // 재귀 호출
        }
    }

    /*
    // 반복문 버전
    public static int gcd(int m, int n) {
        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두수를입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = gcd(a, b);
        System.out.println("두수의최대공약수는 " + result + "입니다");

        sc.close();
    }
}

