package nl.hanze.t12.mvc.controller;

import javax.swing.*;
import nl.hanze.t12.mvc.model.*;
import java.awt.event.*;

public class Controller extends AbstractController implements ActionListener {
	private static final long serialVersionUID = -7413164724294460746L;
	private JButton mineen;
	private JButton pluseen;
	private JButton start;
	private JButton stop;
	private JButton plustien;
	private JButton mintien;

	public Controller(Model model) {
		super(model);
		
		setSize(450, 50);
		mineen=new JButton("-1");
		mineen.addActionListener(this);
		pluseen=new JButton("+1");
		pluseen.addActionListener(this);
		start=new JButton("Start");
		start.addActionListener(this);
		stop=new JButton("Stop");
		stop.addActionListener(this);
		plustien=new JButton("+10");
		plustien.addActionListener(this);
		mintien=new JButton("-10");
		mintien.addActionListener(this);


		
		this.setLayout(null);
		add(mineen);
		add(pluseen);
		add(start);
		add(stop);
		add(plustien);
		add(mintien);
		mineen.setBounds(5, 10, 70, 30);
		pluseen.setBounds(80, 10, 70, 30);
		start.setBounds(155, 10, 70, 30);
		stop.setBounds(230, 10, 70, 30);
		plustien.setBounds(305, 10, 70, 30);
		mintien.setBounds(380, 10, 70, 30);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==mineen) {
			model.setAantal(model.getAantal()-1);
		}
		
		if (e.getSource()==pluseen) {
			model.setAantal(model.getAantal()+1);
		}

		if (e.getSource()==plustien) {
			model.setAantal(model.getAantal()+10);
		}

		if (e.getSource()==mintien) {
			model.setAantal(model.getAantal()-10);
		}

		if (e.getSource()==start) {
			model.start();
		}
		
		if (e.getSource()==stop) {
			model.stop();
		}
	}
}
