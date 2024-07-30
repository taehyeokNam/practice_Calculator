package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //문자열 입력 받기
        String str;
        char choice;

        Scanner sc = new Scanner(System.in);

        System.out.println("1을 입력하면 사칙연산 계산기 사용");
        System.out.println("2을 입력하면 원의 넓이 계산기 사용");

        choice = sc.next().charAt(0);

        if (choice == '1') {
            Calculator cal = new Calculator();

            while (true){

                System.out.print("첫 번째 숫자를 입력하세요:");
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요:");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요:");
                char operator = sc.next().charAt(0);

                cal.setNum1(num1);
                cal.setNum2(num2);

                //사칙 연산
                switch (operator) {
                    case '+' :
                        cal.Add(num1, num2);
                        break;
                    case '-' :
                        cal.Sub(num1, num2);
                        break;
                    case '*' :
                        cal.Multi(num1, num2);
                        break;
                    case '/' :
                        if (num2 ==0)
                            throw new ArithmeticException("나눗셈 연산에서 분모에 0을 입력할 수 없습니다.");
                        cal.Div(num1, num2);
                        break;
                    default:
                }

                sc.nextLine();

                System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시)");
                str = sc.nextLine();

                if (str.equals("remove"))
                    cal.removeResult();

                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                str = sc.nextLine();

                if (str.equals("inquiry")){
                    cal.displayResult();
                }

                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
                str = sc.nextLine();

                if (str.equals("exit"))
                    break;

            }
        }
        else if (choice == '2') {
            CircleCalculator circleCal = new CircleCalculator();

            while (true) {

                System.out.print("원의 반지름을 입력하세요 : ");
                double radius = sc.nextDouble();

                sc.nextLine();

                //원의 반지름 셋팅
                circleCal.setRadius(radius);

                //원의 넓이 계산
                circleCal.setCircleArea();

                //계산된 원의 넓이 출력
                circleCal.calculateCircleArea();

                //구한 원의 넓이 Queue에 저장
                circleCal.addCircleArea();

                //저장된 원의 넓이 출력
                circleCal.displayResult();

                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
                str = sc.nextLine();

                if (str.equals("exit"))
                    break;


            }
        }
    }
}
