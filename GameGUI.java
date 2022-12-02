import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameGUI extends JFrame
{
    private String answer = "";

    JPanel GUI = new JPanel();
    JLabel Output = new JLabel();
    JTextField inputBar = new JTextField(30);

    JButton Button = new JButton("Enter");

    public GameGUI()
    {





        //format for GUI
        setTitle("Stage = " + MainGame.getStage());
        setVisible(true);
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);





        //format for Scenario Result




        GUI.add(inputBar);
        //make it so that when the user presses "Enter" it passes the input into main as a string
        inputBar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                //do stuff when enter is pressed
                String input = inputBar.getText();
                answer = input;
            }
        });

        GUI.add(Output);
        add(GUI);

    }

    public String getAnswer() {
        String temp = answer;
        answer = "";
        return temp;

    }


    //for testing what main has to do
    public static void main(String[] args)
    {
        GameGUI t = new GameGUI();


        //format for Scenario display
        JFrame f= new JFrame();

        //this prints out the first text and makes the variable 'area' that you can use to append
        JTextArea area=new JTextArea("This is the scenario");
        area.setBounds(10,30, 270,220);
        f.add(area);
        f.setSize(350,400);
        f.setLayout(null);
        f.setVisible(true);

        //set title
        f.setTitle("Situation Description");

        area.setEditable(false);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);




        //change title of GUI
        t.setTitle("Moves");



        //format for Scenario display
        JFrame out= new JFrame();

        //this prints out the first text and makes the variable 'area' that you can use to append
        JTextArea area2=new JTextArea("This is the scenario");
        area2.setBounds(10,30, 270,220);
        out.add(area2);
        out.setSize(350,400);
        out.setLayout(null);
        out.setVisible(true);

        //set title
        out.setTitle("Result");

        area.setEditable(false);
        out.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}