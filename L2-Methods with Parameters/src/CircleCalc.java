import javax.swing.*;
import java.text.DecimalFormat;
import javax.swing.*;
public class CircleCalc {


    public static void main(String[] args) {
      double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?")) ;
      area(radius);
      circumference(radius);

    }



    //re-write the method to calculate a circle's area using parameters
    public static void area(double radius){
        DecimalFormat round = new DecimalFormat("#.##");

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of a circle"));
        double area = Math.pow(radius,2) * Math.PI;

        JOptionPane.showMessageDialog(null, "The circumference is" + round.format(circumference));
    }


    //re-write the method to calculate a circle's perimeter using parameters

}
