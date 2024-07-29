package calculator;

import java.util.*;

public class CircleCalculator {

    //원의 반지름
    private double radius;

    //원의 넓이
    private double circleArea;

    //원의 넓이를 저장할 Queue
    private Queue <Double> Result = new LinkedList();

    // static final은 상수를 선언할 때 쓴다.
    // 원주율은 일반적으로 3.14로 통일하여 쓰므로 static final로 선언한다.
    static final double PI = 3.14;

    public CircleCalculator() {
        Result.clear();
    }

    public double calculateCircleArea() {
        System.out.println(PI + " * " + this.radius + " * " + this.radius + " = " + circleArea );
        return (PI * this.radius * this.radius);
    }

    public void setRadius( double radius) {
        this.radius = radius;
    }

    public void setCircleArea() {
        circleArea = radius * radius * PI;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getCircleArea() {
        return circleArea;
    }

    public void addCircleArea() {
        Result.add(circleArea);
    }

    public void removeCircleArea() {
        Result.remove();
    }

    public void displayResult() {
        for (Double result : Result) {
            System.out.println(result);
        }
    }
}
