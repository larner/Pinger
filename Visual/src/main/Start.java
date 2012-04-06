package main;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class Start {
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("Статус хостов");
		mainFrame.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
		mainFrame.setBounds(100, 100, 200, 300);
		
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(10, 1));
		
		JLabel l1 = new JLabel("TEST1");
		l1.setBackground(Color.GREEN);
		JLabel l2 = new JLabel("TEST2");
		JLabel l3 = new JLabel("TEST3");
		mainFrame.add(mainPanel);
		mainPanel.add(l1);
		mainPanel.add(l2);
		mainPanel.add(l3);
		
		mainFrame.setVisible(true);
		
	}

}
