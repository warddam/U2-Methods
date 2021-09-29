import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SimpleInput {

static int clickerCount = 0;
static JLabel clickercountlabel;
static JTextField textInputField;

    public static void main(String[] args) {
        JFrame window = new JFrame("Clicker game");
        JPanel panel = new JPanel();
        textInputField = new JTextField(10);
        JLabel clickerCountLabel = new JLabel("Balance : $");
        JLabel textInputLabel = new JLabel("Enter a Multiplier");
        JButton clicker = new JButton("Click for $1");

        window.setSize(250, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        clicker.addActionListener(new ClickerListener());

        panel.add(textInputLabel);
        panel.add(textInputField);
        panel.add(clickercountlabel);
        panel.add(clicker);
        window.add(panel);

        window.setVisible(true);



    }


}


        private static class ClickerListener implements ActionListener {


            public void actionPeformed(ActionEvent actionEvent) {

                clickerCount += multiplier;

                clickerCountLabel.setText("Balance: $ " + clickerCount);
            }
        }



