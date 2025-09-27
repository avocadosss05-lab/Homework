import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 몇 개의 정수를 입력할 것인지 먼저 입력받기
        System.out.print("몇개의수를입력할예정인가요? ");
        int n = sc.nextInt();

        // 배열 선언
        int[] numbers = new int[n];

        // 정수들 입력받기
        System.out.print("수를입력하세요: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 초기값은 배열의 첫 번째 원소로 설정
        int min = numbers[0];
        int max = numbers[0];

        // 배열 탐색하며 최소값/최대값 갱신
        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        sc.close();
    }
}
