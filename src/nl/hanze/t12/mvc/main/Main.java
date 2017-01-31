package nl.hanze.t12.mvc.main;

import nl.hanze.t12.mvc.controller.Controller;
import nl.hanze.t12.mvc.model.Simulator;
import nl.hanze.t12.mvc.view.CarparkView;

import javax.swing.*;

public class Main {
	protected static void createAndShowGUI(){
		Simulator simulator=new Simulator();//Dit is het model

		JFrame screen=new JFrame("Parkeergarage");
		screen.setSize(920, 550); // de afmetingen van de screen dat is het Frame
		screen.setResizable(false); // dat je het de width/height niet kan verstellen
		screen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		screen.add(new Userinterface(simulator)); // hier voeg je de simulator toe aan de nieuwe interface
		screen.setVisible(true); // maak het zichtbaar
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
