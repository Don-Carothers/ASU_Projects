package jcomboBoxTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiTest {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 100, 10, 30));
		panel.setLayout(new GridLayout(1, 1));
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("IMI_GUI");
		frame.pack();
		frame.setVisible(true);
		

			
		
		}
	}

}
