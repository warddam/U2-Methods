import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangingColorsGUI {



        JFrame window;
        JFrame panel;
        JFrame colorClicker;


        public static void main(String[] args) {



            new ChangingColorsGUI();

            window =  new JFrame("Color Changer");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(350,137);
            window.setLocationRelativeTo(null);

            panel = new JPanel();
            Colorclicker = new JButton("Change the colors");



            Color panelBack = new Color(83, 75, 189, 155);
            Color buttonBack = new Color(75, 213, 175);
            Color buttonFront = new Color(100, 50, 27);






            panel.setBackground(panelBack);
            colorClicker.setForeground(buttonBack);
            colorClicker.setForeground(buttonFront);




        }


    }

    //Variables in a class are declared here,
    //but often not initialized


    /*
    This is a constructor and absolutely necessary for a class.
    This is where we will build the GUI, it must have the same
    name as the class.
    */


}

    //Add a listener to change the color when the button is clicked








