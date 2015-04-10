package boletin251;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sbenavidesvazquez
 */
public class Metodos implements ActionListener {

    JFrame marco;
    JButton boton;
    JPanel panel;
    JLabel etiqueta;
    
    public void Ventana(){
        
        marco=new JFrame("GUI");
        panel=new JPanel();
        boton=new JButton("Premer");
        etiqueta=new JLabel();
        
        panel.setLayout(new FlowLayout());
        
        panel.add(boton);
        panel.add(etiqueta);
        marco.add(panel);
        marco.setSize(250, 250);
        
        boton.addActionListener(this);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText("Premeches o boton");
    }
    
}
