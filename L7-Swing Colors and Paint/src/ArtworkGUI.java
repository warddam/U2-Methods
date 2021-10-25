import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES
    JFrame frame;

    public ArtworkGUI() {
        //CREATE THE GUI
        frame = new JFrame("crazy square");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel= new MyDrawing();
        frame.add(panel);
        frame.setVisible(true);



    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
            setBackground(Color.ORANGE);
        }

        //Add the PaintComponent Method and create your drawing.
        public void paintComponent(Graphics g){

            super.paintComponent(g);
            g.fillRect(50, 50, 50, 50);
            g.setColor(Color.BLACK);
            g.fillRect(100, 100, 100, 100);
            g.setColor(Color.BLACK);

        }
    }
}
