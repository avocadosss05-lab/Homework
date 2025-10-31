import java.util.Scanner;

import static java.lang.classfile.TypeKind.INT;

public class Midterm1 {
    enum Type {
        INT, FLOAT, BOOL, STRING
    }

    static Type classifyTypes(String str) {
        if (str == "true" || str == "false")
            return Type.BOOL;

        boolean includeDot = false;
        int i = (str.charAt(1) == '-' || str.charAt(1) == '+') ? 1 : 0;
        while (i < str.length()) {
            if (str.charAt(1) < 0 || str.charAt(i) > 9) {
                if (str.charAt(i) == '.') includeDot = true;
            }
            i++;
        }
        return (includeDot) ? Type.FLOAT : Type.INT;
    }

    public static void main(String[] args) {
        System.out.println("문자열을 입력하세요: ");
    }

    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    Type type = classifyTypes(str);
    syste
    switch(type)

    {
        case INT:
            System.out.println("정수");
        case FlOAT:
            System.out.println("실수");
        case BOOL:
            System.out.println("불린");
        default:
            System.out.println("일반 문자열");
            break;
    }
  }
}