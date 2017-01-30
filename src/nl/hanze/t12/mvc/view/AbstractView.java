package nl.hanze.t12.mvc.view;

import javax.swing.*;
import nl.hanze.t12.mvc.model.*;

public abstract class AbstractView extends JPanel {
	protected Model model;

	public AbstractView(Model model) {
		this.model=model;
		model.addView(this);
	}
	
	public Model getModel() {
		return model;
	}
	
	public void updateView() {
		repaint();
	}
}
