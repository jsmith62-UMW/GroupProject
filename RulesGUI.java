
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RulesGUI extends JFrame
{
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();


    public RulesGUI()
    {
      // setTitle("Calculate the Factorial");
        //setVisible(true);
        //setSize(400, 200);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);

        //jp.add(jl);
        //add(jp);

        JFrame f= new JFrame();
        JTextArea area=new JTextArea("Welcome to our game\n fight the bad guys\n no one likes them");
        area.setBounds(10,30, 300,500);
        f.add(area);
        f.setSize(350,600);
        f.setLayout(null);
        f.setVisible(true);

        area.setEditable(false);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }




        public static void main(String[] args)
    {






       RulesGUI t = new RulesGUI();
       // JLabel story = new JLabel("Yo what is good?");
        //JLabel rule = new JLabel("HAAHAHA");

    }

}