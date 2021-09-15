import javax.swing.*;
import java.text.DecimalFormat;

/*
1. Get the input - radius
2. calculate area
3. calculate circumference
4. Display results - output
 */




public class CircleCalc {


    public static void main(String[] args) {

        double radius = getInput("What is the radius?");


        //create and run the program
        // public static double area(double radius){

//Get the input
//

        }


    }

    //re-write the method to calculate a circle's area using parameters and return statement
public static double area(double radius){

return Math.pow(radius, 2) * Math.PI;
    }



    //re-write the method to calculate a circle's perimeter using parameters and return statement
public static double circumference(double radius){
    return 2 * Math.PI  * radius;

    }
}
