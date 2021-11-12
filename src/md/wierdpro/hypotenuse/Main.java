package md.wierdpro.hypotenuse;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private static JLabel label1;
    private static JLabel label2;
    private static JLabel result;
    private static JTextField x;
    private static JTextField y;
    private static JButton calc;

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Hypotenuse calculator v1.1.0-beta");
        frame.setSize(250, 150);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        //This will be for the next update
        //Menu thing
//        JMenuBar bar = new JMenuBar();
//        JMenu menu =  new JMenu("More");
//        JMenuItem about = new JMenuItem("About");
//
//        menu.add(about);
//        bar.add(menu);
//        frame.setJMenuBar(bar);

        label1 = new JLabel("Enter side x: ");
        label1.setBounds(10,10,100,15);
        panel.add(label1);

        x = new JTextField();
        x.setBounds(100, 10, 100, 15);
        panel.add(x);

        label2 = new JLabel("Enter side y: ");
        label2.setBounds(10,30,100,15);
        panel.add(label2);

        y = new JTextField();
        y.setBounds(100, 30, 100, 15);
        panel.add(y);

        calc = new JButton("Calculate");
        calc.setBounds(10, 50, 100, 20);
        calc.addActionListener(new Main());
        calc.setActionCommand("Calc");
        panel.add(calc);

        result = new JLabel("");
        result.setBounds(10,70,100,15);
        panel.add(result);

        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double inputx = Double.parseDouble(x.getText());
        double inputy = Double.parseDouble(y.getText());
        double output = 0;

        if(e.getActionCommand() == "Calc") {
            output = Math.sqrt((inputx * inputx) + (inputy * inputy));
            result.setText("Result: " + output);
            result.repaint();
        }

    }
}