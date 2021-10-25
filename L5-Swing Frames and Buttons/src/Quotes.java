import javax.swing.*;
import java.awt.event.ActionListener;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Three Quotes");
        JPanel panel = new JPanel();
        JButton quote1But = new JButton("Click foe First Quote");
        JButton quote2But = new JButton("Click foe Second Quote");
        JButton quote3But = new JButton("Click foe Third Quote");

        window.setSize(350, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        quote1But.addActionListener(new uoteBut1());
        quote2But.addActionListener(new QuoteBut2());
        quote3But.addActionListener(new QuoteBut3());

        panel.add(quote1But);
        panel.add(quote2But);
        panel.add(quote3But);

        window.add(panel);
        window.setVisible(true);

    }

}






