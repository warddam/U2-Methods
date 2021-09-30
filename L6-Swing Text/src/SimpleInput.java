import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SimpleInput {

static int clickerCount = 0;
static JLabel clickerCountLabel;

    public static void main(String[] args) {
        JFrame window = new JFrame("CLICKER GAME");
        JPanel panel = new JPanel();
        clickerCountLabel = new JLabel("Balance : $");
        JButton clicker = new JButton("Click for $1");

        window.setSize(250, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        clicker.addActionListener(new ClickerListener());


        panel.add(clickerCountLabel);
        panel.add(clicker);
        window.add(panel);

        window.setVisible(true);





    }


}

        private static class ClickerListener implements ActionListener {


            public void actionPeformed(ActionEvent actionEvent) {

                clickerCount++;

                clickerCountLabel.setText("Balance: $ " + clickerCount);
            }
        }




