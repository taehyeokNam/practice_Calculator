package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws CalculatorException {



        //문자열 입력 받기
        String str;
        char choice;

        Scanner sc = new Scanner(System.in);

        System.out.println("1을 입력하면 사칙연산 계산기 사용");
        System.out.println("2을 입력하면 원이 넓이 계산기 사용");

        choice = sc.next().charAt(0);

        if (choice == '1') {

        }
        else if (choice == '2') {

        }

        ArithmeticCalculator Cal = new ArithmeticCalculator ();

        while (true){

            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요:");
            char operator = sc.next().charAt(0);

            Cal.setNum1(num1);
            Cal.setNum2(num2);

            //사칙 연산
            switch (operator) {
                case '+' :
                    if (Cal.getNum1() < 0 || Cal.getNum2() <0)
                        throw new CalculatorException();
                    Cal.Plus();
                    break;
                case '-' :
                    if (Cal.getNum1() < 0 || Cal.getNum2() <0)
                        throw new CalculatorException();
                    Cal.Sub();
                    break;
                case '*' :
                    if (Cal.getNum1() < 0 || Cal.getNum2() <0)
                        throw new CalculatorException();
                    Cal.Multi();
                    break;
                case '/' :
                    if (Cal.getNum2() == 0)
                        throw new CalculatorException();
                    Cal.Div();
                    break;
                default:
                    throw new CalculatorException();
            }

            sc.nextLine();

            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시)");
            str = sc.nextLine();

            if (str.equals("remove"))
                Cal.removeResult();

            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            str = sc.nextLine();

            if (str.equals("inquiry")){
                Cal.displayResult();
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            str = sc.nextLine();

            if (str.equals("exit"))
                break;

        }
    }
}
