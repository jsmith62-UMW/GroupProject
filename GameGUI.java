
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameGUI extends JFrame
{
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JTextField jt = new JTextField(30);
    JButton jb = new JButton("Enter");

    public GameGUI()
    {
        setTitle("Game Moves");
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);





        jp.add(jt);
        //make it so that when the user presses "Enter" it passes the input into main as a string
        jt.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();

                //convert to integer
                int number = Integer.parseInt(input);


                //calculate the factorial
                int i = number;
                // int number=5;//It is the number to calculate factorial
                while(i >= 2){
                    i = i - 1;
                    number = number * i;

                }


                //convert the factorial back into a String
                input = Integer.toString(number);
                //print out the result
                jl.setText(input);

                jl.setText("GADFADFAADF\nDFADFADFADFADFA\nDAFADFADFADFdfafadfadfafafdafadfadfadadfadf");
            }
        });





        jp.add(jb);
        jb.addActionListener(new ActionListener()

                //passes string into main if button is pressed
        {
            public void actionPerformed(ActionEvent e)
            {
            //blank for now
            }
        });

        jp.add(jl);
        add(jp);

    }

    public static void main(String[] args)
    {
        GameGUI t = new GameGUI();
    }

}