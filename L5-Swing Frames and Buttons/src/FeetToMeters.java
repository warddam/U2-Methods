import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */
    public static void main(String[] args) {

        JFrame window = new JFrame("Feet/Meters Conversion");
        JPanel panel = new JPanel();
        JButton feetToMetersBut = new JButton("Feet to Meters");
        JButton metersToFeet = new JButton("Meters to Feet");


        window.setSize(250, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(feetToMetersBut);
        panel.add(metersToFeet);
        window.add(panel);

        window.setVisible(true);

    }
}

    private class FeetToMeter implements ActionListener {

        public void actionPeformed(ActionEvent actionEvent) {

            double feet = Double.parseDouble(JOptionPane.showInputDialog("enter the number of feet :"));
            double meters = feet / 3.28;
            JOptionPane.showMessageDialog(null, meters + " meters. ");
        }
    }

    private static class  meterToFeet implements ActionListener {



        public void actionPeformed(ActionEvent actionEvent) {

            double meters = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of meters: "));
            double feet = meters * 3.28;
            JOptionPane.showMessageDialog(null, feet + " feet. ");

        }
}
