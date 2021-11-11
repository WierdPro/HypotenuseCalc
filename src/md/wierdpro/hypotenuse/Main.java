package md.wierdpro.hypotenuse;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Importing operators
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        //Adding text, text area and buttons
        JLabel sideXText = new JLabel("Enter side x");
        TextArea x = new TextArea();

        //Fonts and size
        sideXText.setFont(new Font("Ink Free", 2, 28));


        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(sideXText);
        panel.add(x);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("Hypotenuse calculator v1.1.0-beta");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.pack();

        frame.setVisible(true);


//                double x = Double.parseDouble(JOptionPane.showInputDialog("Enter side x"));
//                double y = Double.parseDouble(JOptionPane.showInputDialog("Enter side y"));
//                double z = Math.sqrt((x*x) + (y*y));

                //JOptionPane.showMessageDialog(null, "x = " + x + "\ny = " + y + "\nThe hypotenuse is: " + z);

    }
}
