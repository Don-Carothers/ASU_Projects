import java.awt.BorderLayout;

import javax.swing.*;

public class GUI {

	JFileChooser ExcelFile = new JFileChooser();


	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JButton CurrentFile = new JButton("Current Period");
	JButton PreviousFile = new JButton("Preious Period");
	JButton Automate = new JButton("Automate");
	
	panel.add(CurrentFile);
	panel.add(PreviousFile);
	panel.add(Automate);
	
	frame.add(panel, BorderLayout.CENTER);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("Excel Automation");
	frame.pack();
	frame.setVisible(true);
	
	
}
	
	
}
