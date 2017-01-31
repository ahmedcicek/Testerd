package nl.hanze.t12.mvc.main;

import nl.hanze.t12.mvc.controller.Controller;
import nl.hanze.t12.mvc.model.Simulator;
import nl.hanze.t12.mvc.view.CarparkView;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ahmed Çiçek on 30-1-2017.
 */
public class Userinterface extends JPanel {

    public Userinterface(Simulator simulator) {

        Controller control = new Controller(simulator); // dit is de Controller
        CarparkView carparkView = new CarparkView(simulator);
        add(control);
        add(carparkView);
        setLayout(null);
        carparkView.setBounds(80,60,800,400); // parkeervakjes
        control.setBounds(0,465,1000,80); // blauwe kleur
        setBackground(Color.green);
    }
}