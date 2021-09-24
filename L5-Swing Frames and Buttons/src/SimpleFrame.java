import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleFrame
{
    public static void main(String[] args) {
        JFrame window = new JFrame("This is a simple window");
        window.setSize(300, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        JPanel panel = new JPanel();
        window.add(panel);
        JButton button = new JButton("Click for $1");
        panel.add(button);

    }


private static class ButtonListener implements ActionListener {


    public void actionPeformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "You got 1");

    }
}
}




