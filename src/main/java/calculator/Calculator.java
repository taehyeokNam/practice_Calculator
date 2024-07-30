package calculator;

import java.util.*;

class Calculator {

    //입력 받는 두 양의 정수
    private double num1, num2;

    //계산된 값이 저장된 Queue
    protected final Queue<Double> Result = new LinkedList<>();

    public Calculator () {
        Result.clear();
    }

    //두 수의 덧셈
    public double Add(double input1 , double input2) {

        num1 = input1;
        num2 = input2;

        addResult(num1 + num2);
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        return (num1 + num2);
    }

    //두 수의 뺄셈
    public double Sub(double input1 , double input2) {

        num1 = input1;
        num2 = input2;

        addResult(num1 - num2);
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        return (num1 - num2);
    }

    //두 수의 곱셈
    public double Multi(double input1 , double input2) {

        num1 = input1;
        num2 = input2;

        addResult(num1 * num2);
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        return (num1 * num2);
    }

    //input1을 input2로 나눈 몫
    public double Div(double input1 , double input2) {

        num1 = input1;
        num2 = input2;

        Result.add(num1 / num2);
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        return (num1 / num2);
    }

    public void addResult(double value) {
        Result.add(value);
    }

    //계산 결과 지우기
    public void removeResult() {
        Result.remove();
    }

    //계산 결과 모두 보여주기
    public void displayResult() {
        for (double result : Result)
            System.out.println(result);
    }

    public void clearResult() {
        Result.clear();
    }

    public void setNum1(double num1) {
        if(num1 > 0)
            return;
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        if(num2 > 0)
            return;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num1;
    }

    public double calculateCircleArea(double radius) {
        return CircleCalculator.PI * radius * radius;
    }
}


