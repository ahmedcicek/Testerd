package nl.hanze.t12.mvc.controller;

import javax.swing.*;
import nl.hanze.t12.mvc.model.*;

import java.awt.*;
import java.awt.event.*;

public class Controller extends AbstractController implements ActionListener {

	private JButton start;
	private JButton reset;
	private JButton pertien;
	private JButton perhonderd;

	public Controller(Simulator simulator) {
		super(simulator);
		setBackground(Color.cyan);
		setSize(450, 50);
		start=new JButton("Start");
		start.addActionListener(this);
		reset=new JButton("Stop");
		reset.addActionListener(this);
		pertien=new JButton("Per Tien");
		pertien.addActionListener(this);
		perhonderd=new JButton("Per Honderd");
		perhonderd.addActionListener(this);
		
		this.setLayout(null);
		add(start);
		add(reset);
		add(pertien);
		add(perhonderd);
		start.setBounds(10, 10, 70, 30);
		reset.setBounds(90, 10, 70, 30);
		pertien.setBounds(170,10,120,30);
		perhonderd.setBounds(300,10,120,30);
		//setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==start) {
			simulator.run();
		}
		if (e.getSource()==pertien) {
			simulator.runTien();
		}
		if(e.getSource()==perhonderd){
			simulator.runHonderd();
		}


	}
}
