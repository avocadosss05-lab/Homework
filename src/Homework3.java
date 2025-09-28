import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 몇 개의 수를 입력할지 먼저 받기
        System.out.print("몇개의 수를 입력할 예정인가요? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // 정수 입력 (공백 구분)
        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 최소/최대값 초기화
        int min = numbers[0];
        int max = numbers[0];

        // 배열 탐색하면서 갱신
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
