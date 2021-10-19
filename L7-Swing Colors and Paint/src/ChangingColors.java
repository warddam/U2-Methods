import javax.swing.*;
import java.awt.*;

public class ChangingColors {
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
