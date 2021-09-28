import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SimpleInput {

    public static void main(String[] args) {
        JFrame window = new JFrame("Clicker game");
        JPanel panel = new JPanel();
        JLabel clickercountlabel = new JLabel("Balance : $");
        JButton clicker = new JButton("Click for $1");

        window.setSize(250,200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(clickercountlabel);
        panel.add(clicker);
        window.add(panel);

        window.setVisible(true);

    }


}

private static class ClickerListener implements ActionListener{

    public void actionPeformed
