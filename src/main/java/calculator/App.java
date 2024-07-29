package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws CalculatorException {

        Calculator Cal;

        //사칙연산 기호
        String str;

        Queue<Integer> Result = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요:");
            char operator = sc.next().charAt(0);

            Cal = new Calculator(num1, num2, operator);


            //사칙 연산
            switch (operator) {
                case '+' :
                    Result.add(Cal.Plus(num1, num2));
                    break;
                case '-' :
                    Result.add(Cal.Sub(num1, num2));

                    break;
                case '*' :
                    Result.add(Cal.Multi(num1, num2));
                    break;
                case '/' :
                    if (num2 == 0)
                        throw new CalculatorException();
                    Result.add(Cal.Div(num1, num2));
                    break;
                default:
                    throw new CalculatorException();
            }

            sc.nextLine();

            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시)");
            str = sc.nextLine();

            if (str.equals("remove"))
                Result.poll();

            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            str = sc.nextLine();

            if (str.equals("inquiry")){
                for(Integer Array : Result){
                    System.out.println(Array);
                }
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            str = sc.next();

            if (str.equals("exit"))
                break;

        }
    }
}
