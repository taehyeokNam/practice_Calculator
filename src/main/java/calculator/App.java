package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //입력 받을 숫자 저장할 변수
        int num1, num2;

        //사칙연산 기호
        String letter;

        //두 수의 계산 결과
        int result[]= new int[10];

        //계산한 횟수
        int count = 0;


        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("사칙 연산 기호를 입력하세요");

            letter = sc.nextLine();

            if(letter.equals("exit")){
                break;
            }
            else if(!letter.equals("+")  && !letter.equals("-") && !letter.equals("*") && !letter.equals("/")) {
                System.out.println("+, -, *, /만 입력하세요");
                continue;
            }

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

                if (num2 >= 0){
                    if(letter.equals("/") && num2 == 0){
                        System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                        continue;
                    }
                    break;
                }
                else {
                    System.out.println("양의 정수만 입력하시오");
                }
            }

            //사칙 연산
            switch (letter) {
                case "+" :
                    result[count] = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case "-" :
                    result[count] = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case "*" :
                    result[count] = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case "/" :
                    result[count] = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    break;
            }

            //값을 출력하기전에 저장한 횟수 늘려주기
            count++;

            // 0~9까지 저장하면 총 10개
            // 10이되면 다시 0으로 초기화 시켜준다.
            if (count == 10)
                count = 0;

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            letter = sc.nextLine();

            if(letter.equals("exit"))
                break;
            else
                continue;

        }
    }
}
