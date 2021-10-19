import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ChangingColorsGUI {

    //Variables in a class are declared here,
    //but often not initialized

    JFrame window;
    JPanel panel;
    JButton colorClicker;

    /*
    This is a constructor and absolutely necessary for a class.
    This is where we will build the GUI, it must have the same
    name as the class.
    */

    public static void main(String[] args) {

    }

    public ChangingColorsGUI() {

        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        colorClicker = new JButton("Change the Colors");

        //create a new Custom color
        Color panelBack = new Color(220, 220, 220);
        Color buttonBack = new Color(34, 49, 2);
        Color buttonFront = new Color(100, 50, 27);

        //Set the colors of our buttons and panel

        panel.setBackground(panelBack);
        colorClicker.setForeground(buttonBack);
        colorClicker.setForeground(buttonFront);




        panel.add(colorClicker);
        window.add(panel);

        window.setVisible(true);


    }
}

    //Add a listener to change the color when the button is clicked








