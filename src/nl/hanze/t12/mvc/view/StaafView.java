package nl.hanze.t12.mvc.view;


import nl.hanze.t12.mvc.model.Model;

import java.awt.*;


/**
 * Created by Ahmed Çiçek on 28-1-2017.
 */
public class StaafView extends AbstractView {

    public StaafView(Model model){
        super(model);
        setSize(200,200);
    }

    public void paintComponent(Graphics g) {
        int aantal=getModel().getAantal();
        boolean ready=false;
        int counter=1;

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 200, 200);
        g.setColor(Color.GRAY);

        for(int y=30;y<=145 && !ready; y+=15) {
            for(int x=30;x<=145 && !ready; x+=2) {
                ready=counter>aantal;
                if (!ready) g.fillRect(y, x, 7, 5);
                counter++;
            }
        }
    }
}
