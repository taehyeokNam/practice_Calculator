package calculator;

import java.util.*;

public class Calculator {

    private Queue<Integer> Result = new LinkedList<Integer>();

    //두 수의 덧셈
    public int Plus (int input1, int input2) {

        this.Result.add(input1 + input2);
        System.out.println(input1 + " + " + input2 + " = " + (input1 + input2));

        return (input1 + input2);
    }

    //두 수의 뺄셈
    public int Sub (int input1, int input2) {

        this.Result.add(input1 - input2);
        System.out.println(input1 + " - " + input2 + " = " + (input1 - input2));

        return (input1 - input2);
    }

    //두 수의 곱셈
    public int Multi (int input1, int input2) {

        this.Result.add(input1 * input2);
        System.out.println(input1 + " * " + input2 + " = " + (input1 * input2));

        return (input1 * input2);
    }

    //input1을 input2로 나눈 몫
    public int Div (int input1, int input2) {

        this.Result.add(input1 / input2);
        System.out.println(input1 + " / " + input2 + " = " + (input1 / input2));

        return (input1 / input2);
    }

    //계산 결과 지우기
    void Delete() {
        this.Result.remove();
    }

    //계산 결과 모두 보여주기
    void DisplayResult() {
        for (int result : this.Result)
            System.out.println(result);
    }

    public Calculator(int input1, int input2, char sign) throws CalculatorException{

        if (sign == '/' && input2 == 0) {
            //분모가 0일 때
            throw new CalculatorException();
        }
        else if (sign != '+' && sign != '-' &&
                sign != '*' && sign != '/') {
            //사칙연산 이외의 기호가 들어왔을 때
            throw new CalculatorException();
        }
    };

}


