package nl.hanze.t12.mvc.main;

import javax.swing.*;

import nl.hanze.t12.mvc.controller.*;
import nl.hanze.t12.mvc.model.*;
import nl.hanze.t12.mvc.view.SimulatorView;

public class Main {
	private Simulator simulator;
	private JFrame screen;
//	private AbstractView countview;
//	private AbstractView pieview;
//	private AbstractView staafview;
//	private Controller controller;
	private SimulatorView simulatorview;
	public Main() {
		simulator=new Simulator();//hoi
//		controller=new Controller(model);
//		countview=new CountView(model);
//		pieview=new PieView(model);
//		staafview=new StaafView(model);
		simulatorview=new SimulatorView(3,6,30);

		screen=new JFrame("Model View Controller/Dynamic Model with thread");
		screen.setSize(650, 285);
		screen.setResizable(false);
		screen.setLayout(null);
//		screen.getContentPane().add(countview);
//		screen.getContentPane().add(pieview);
//		screen.getContentPane().add(staafview);
//		screen.getContentPane().add(controller);
		screen.getContentPane().add(simulatorview);
//		countview.setBounds(10, 10, 200, 200);
//		pieview.setBounds(230, 10, 200, 200);
//		staafview.setBounds(440,10,200,200);
//		controller.setBounds(0, 210, 450, 50);
		simulatorview.setBounds(10,10,200,200);

		screen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		screen.setVisible(true);
	}
}
