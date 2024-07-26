package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //입력 받을 숫자 저장할 변수
        int num1 = 0, num2 = 0;

        //사칙연산 기호
        char letter;

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");

        //첫 번째 숫자(양의 정수) 입력 받기
        while (true) {
            num1 = sc.nextInt();

            //숫자 입력 후 엔터를 쳤을 때 버퍼에 남아있는 개행문자를 제거하기 위해 추가
            sc.nextLine();

            if (num1 >= 0)
                break;
            else
                System.out.println("양의 정수만 입력하시오");
        }

        System.out.println("두 번째 숫자를 입력하세요: ");

        //두 번째 숫자(양의 정수) 입력 받기
        while (true) {
            num2 = sc.nextInt();

            //숫자 입력 후 엔터를 쳤을 때 버퍼에 남아있는 개행문자를 제거하기 위해 추가
            sc.nextLine();

            if (num2 >= 0)
                break;
            else
                System.out.println("양의 정수만 입력하시오");
        }

        System.out.println("사칙 연산 기호를 입력하세요");
        letter = sc.next().charAt(0);


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("입력 받은 사칙 연산 기호 : " + letter);
    }
}
