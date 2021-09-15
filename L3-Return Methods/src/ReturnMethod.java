import javax.swing.*;

public class ReturnMethod {

    public static void main(String[] args) {

        double length = Double.parseDouble(JOptionPane.showInputDialog("What is the length"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("What is the width?"));

        //ONE way to use return methods
        double area = area(length, width);

        JOptionPane.showMessageDialog(null, "The area: " + area + "\nThe perimeter is: " + perimeter(length, width));
    }


public static double area(double length, double width){
        //double area * width;
        //return area

    return length * width;

    }
public static double perimeter(double length, double width){

        return 2 * (length * width);

    }



}
