/*
 * Your name: Connor Byers
 * Description: Class Program2 defines methods in a way for the given tests in Program2Test to be successful when necessary
 * The main method displays some of those tests
 */

import java.text.DecimalFormat; //hypOfTriangle and sinOfAngle methods line 54 math.sqrt and line 45 is too precise to pass test

public class Program2 {

    // TODO #1: finish the method's implementation
    public static double add(double a, double b) {

        return (a+b);
    }

    // TODO #2: finish the method's implementation
    public static double subtract(double a, double b) {

        return (a-b);
    }

    // TODO #3: finish the method's implementation
    public static double multiply(double a, double b) {

        if (a==0||b==0) return 0; //so it doesn't return negative 0 and passes the test still and is still true
        else return (a*b);
    }

    // TODO #4: finish the method's implementation
    public static double divide(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        //before this, dividing by 0 returned 0 for some reason
        return a / b;

    }

    // TODO #5: finish the method's implementation - assume right triangle
    public static double sineOfAngle(double oppSide, double hyp) {

        double oppSideRadians = Math.toRadians(oppSide);
        double hypRadians = Math.toRadians(hyp);

        double sinResult = (Math.asin(oppSideRadians/hypRadians));
        DecimalFormat df = new DecimalFormat("#.##"); //to result in only 2 decimal precision using java.text.DecimalFormat

        return Double.parseDouble(df.format(sinResult));
    }

    // TODO #6: finish the method's implementation - assume right triangle
    public static double hypOfTriangle(double sideA, double sideB) {

        double hypResult = (Math.sqrt((sideA*sideA)+(sideB*sideB)));
        DecimalFormat df = new DecimalFormat("#.##"); //to result in only 2 decimal precision using java.text.DecimalFormat

        return Double.parseDouble(df.format(hypResult));
    }


    public static void main(String[] args) { //main method to print some test demonstration

        System.out.printf("%nTesting Methods:%n"); //Title
        int added1 = (int) add(0, 0); //adding
        int added2 = (int) add(0, 5);
        int added3 = (int) add(5, 0);
        int added4 = (int) add(0, -5);
        int added5 = (int) add(-5, 0);
        int added6 = (int) add(-5, -2);
        int added7 = (int) add(-2, -5);

        System.out.printf("%nAdding Answers:%n" + added1); //I suppose I could add an array, but it's too complicated just for demonstration.
        System.out.println();                              // I would make an array and/or loop if I were using the numbers for other operations and not just displaying them
        System.out.println(added2); //display adding
        System.out.println(added3);
        System.out.println(added4);
        System.out.println(added5);
        System.out.println(added6);
        System.out.println(added7);


        int subtracted1 = (int) subtract(0, 0); //subtracting
        int subtracted2 = (int) subtract(0, 5);
        int subtracted3 = (int) subtract(5, 0);
        int subtracted4 = (int) subtract(0, -5);
        int subtracted5 = (int) subtract(-5, 0);
        int subtracted6 = (int) subtract(-5, -2);
        int subtracted7 = (int) subtract(-2, -5);

        System.out.printf("%nSubtracting Answers:%n" + subtracted1); //display subtracting
        System.out.println();
        System.out.println(subtracted2);
        System.out.println(subtracted3);
        System.out.println(subtracted4);
        System.out.println(subtracted5);
        System.out.println(subtracted6);
        System.out.println(subtracted7);

        int multiplied1 = (int) multiply(0, 0); //multiplying
        int multiplied2 = (int) multiply(0, 5);
        int multiplied3 = (int) multiply(5, 0);
        int multiplied4 = (int) multiply(0, -5);
        int multiplied5 = (int) multiply(-5, 0);
        int multiplied6 = (int) multiply(-5, -2);
        int multiplied7 = (int) multiply(-2, -5);

        System.out.printf("%nMultiplying Answers:%n" + multiplied1); //display multiplying
        System.out.println();
        System.out.println(multiplied2);
        System.out.println(multiplied3);
        System.out.println(multiplied4);
        System.out.println(multiplied5);
        System.out.println(multiplied6);
        System.out.println(multiplied7);

        //int divided1 = (int) divide(0, 0); // dividing 0 is errors (which passes the test)
        int divided2 = (int) divide(0, 5); //dividing
        //int divided3 = (int) divide(5, 0);
        int divided4 = (int) divide(0, -5);
        //int divided5 = (int) divide(-5, 0);
        int divided6 = (int) divide(-5, -2);
        int divided7 = (int) divide(-2, -5);

        System.out.printf("%nDividing Answers:%n" /*+ divided1*/); //also errors
        System.out.println(); //displaying dividing
        System.out.println(divided2);
        //System.out.println(divided3);
        System.out.println(divided4);
        //System.out.println(divided5);
        System.out.println(divided6);
        System.out.println(divided7);


        int sin1 = (int) sineOfAngle(1.0, 1.0); //sin
        int sin2 = (int) sineOfAngle(3.0, 4.1);

        System.out.printf("%nSine Answers:%n" + sin1); //display sin
        System.out.println();
        System.out.println(sin2);

        int hypo1 = (int) hypOfTriangle(3.0, 4.0); //hyp
        int hypo2 = (int) hypOfTriangle(1.0, 1.0);
        int hypo3 = (int) hypOfTriangle(1.0, 2.0);

        System.out.printf("%nHypotenuse Answers:%n" + hypo1); //display hyp
        System.out.println();
        System.out.println(hypo2);
        System.out.println(hypo3);

    } //end main


} //end Program2


