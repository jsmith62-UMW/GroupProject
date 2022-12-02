
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

        JFrame f= new JFrame();

        //this prints out the first text and makes the variable 'area' that you can use to append
        JTextArea area=new JTextArea("Welcome to our game\n fight the bad guys\n no one likes them\n" +
                "when you enter a scenario you can do three things\nyou can 'fight' but remember you are only human\nyou can 'run' away from a fight too\n or if your tricky you could try and 'trick' your foes\n" +
               "if you grab the trolls bag of coins you can use\n them in stage2 and 3 by saying 'coins'" +"\nafter your run through with the fairy you can say\n 'fairy' and enlist its help in stage 3\n ");
        area.setBounds(10,30, 270,220);
        f.add(area);
        f.setSize(350,400);
        f.setLayout(null);
        f.setVisible(true);

       //set title
        f.setTitle("Rules and Info");

        area.setEditable(false);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);


//edit here. This is how you edit the textAreas
     //   area.setText("");
   //     area.append("hi there");


    }




        public static void main(String[] args)
    {






       RulesGUI t = new RulesGUI();
    }

}