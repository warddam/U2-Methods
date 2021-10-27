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
            g.fillRect(50, 50, 100, 100);
            g.setColor(Color.BLACK);
            g.fillRect(200, 200, 100, 100);
            g.setColor(Color.BLACK);
            g.fillRect(75,75,10,10);
            g.setColor(Color.cyan);
            g.fillRect(100,100,10,10);
            g.setColor(Color.cyan);
            g.fillRect(76,100,10,10);
            g.setColor(Color.cyan);
            g.fillRect(120,100,10,10);
            g.setColor(Color.cyan);
            g.fillRect(100,80,10,10);
            g.setColor(Color.cyan);
            g.fillRect(250,250,100,100);
            g.setColor(Color.MAGENTA);
            g.fillRect(150,150,100,100);
            g.setColor(Color.GREEN);


        }
    }
}
