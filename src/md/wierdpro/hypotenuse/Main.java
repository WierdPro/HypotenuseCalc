package md.wierdpro.hypotenuse;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
                System.out.println("Lesson 7 GUI");
                System.out.println("Hypotenuse GUI\n");

                double x = Double.parseDouble(JOptionPane.showInputDialog("Enter side x"));
                double y = Double.parseDouble(JOptionPane.showInputDialog("Enter side y"));
                double z = Math.sqrt((x*x) + (y*y));

                JOptionPane.showMessageDialog(null, "x = " + x + "\ny = " + y + "\nThe hypotenuse is: " + z);

    }
}
