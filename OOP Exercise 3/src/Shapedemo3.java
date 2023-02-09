import java.util.Scanner;

import javax.swing.JOptionPane;

public class Shapedemo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];

		for (int i = 0; i < cylinder.length; i++) {

			double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius " + (i+1) + ":"));
			double height = Double.parseDouble(JOptionPane.showInputDialog("Input height " + (i+1) + ":"));

			cylinder[i] = new Cylinder(radius , height);
		}

		int count = 1;
		String text = "";

		for (Cylinder it : cylinder) {
			text = text + "Cylinder " + count + ", volume=" + it.GetVolume() + "\n";
			count++;
		}

		JOptionPane.showMessageDialog(null, text);
	}

}
