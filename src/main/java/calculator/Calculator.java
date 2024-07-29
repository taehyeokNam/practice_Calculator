package calculator;

import java.util.*;

public class Calculator {

    //입력 받는 두 양의 정수
    private int num1, num2;

    private Queue<Integer> Result = new LinkedList<>();

    public Calculator(){}

    //두 수의 덧셈
    public int Plus () {

        this.Result.add(num1 + num2);
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        return (num1 + num2);
    }

    //두 수의 뺄셈
    public int Sub () {

        Result.add(num1 - num2);
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        return (num1 - num2);
    }

    //두 수의 곱셈
    public int Multi () {

        Result.add(num1 * num2);
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        return (num1 * num2);
    }

    //input1을 input2로 나눈 몫
    public int Div () {

        Result.add(num1 / num2);
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        return (num1 / num2);
    }

    void setResult(int value) {
        Result.add(value);
    }

    //계산 결과 지우기
    void removeResult() {
        Result.remove();
    }

    //계산 결과 모두 보여주기
    void displayResult() {
        for (int result : this.Result)
            System.out.println(result);
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num1;
    }
}


