package main;

import java.awt.GridLayout;
import javax.swing.*;

public class Window {
	public static void Show(Host[] h){
		JFrame mainFrame = new JFrame("Offline hosts");
		mainFrame.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
		mainFrame.setBounds(100, 100, 200, 300);
		

		mainFrame.setLayout(new GridLayout(10, 2));
		
		for(Host i : h){
			if(i.getStatus() == "Offline!"){
				mainFrame.add(new JLabel(i.getIpaddress().toString()+"	"+i.getDescription()+"	"));
			}
		}
		
		mainFrame.setVisible(true);
		
	}


}
