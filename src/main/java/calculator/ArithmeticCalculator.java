package calculator;

import java.util.*;

public class ArithmeticCalculator  {

    //입력 받는 두 양의 정수
    private int num1, num2;

    //계산된 값이 저장된 Queue
    private Queue<Integer> Result = new LinkedList<>();

    public ArithmeticCalculator() {
        Result.clear();
    }

    //두 수의 덧셈
    public int Plus() {

        addResult(num1 + num2);
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        return (num1 + num2);
    }

    //두 수의 뺄셈
    public int Sub() {

        addResult(num1 - num2);
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        return (num1 - num2);
    }

    //두 수의 곱셈
    public int Multi() {

        addResult(num1 * num2);
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        return (num1 * num2);
    }

    //input1을 input2로 나눈 몫
    public int Div() {

        Result.add(num1 / num2);
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        return (num1 / num2);
    }

    public void addResult(int value) {
        Result.add(value);
    }

    //계산 결과 지우기
    public void removeResult() {
        Result.remove();
    }

    //계산 결과 모두 보여주기
    public void displayResult() {
        for (int result : Result)
            System.out.println(result);
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num1;
    }

    public double calculateCircleArea(double radius) {
        return CircleCalculator.PI * radius * radius;
    }
}

class CalculatorException extends Exception{
    public CalculatorException() {
        System.out.println("잘못된 입력입니다.");
    }
}


