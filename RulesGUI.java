
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RulesGUI extends JFrame
{
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JTextField jt = new JTextField(30);
    JButton jb = new JButton("Enter");

    public RulesGUI()
    {
        setTitle("Calculate the Factorial");
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jp.add(jt);



        //make it so that when the user presses "Enter" it calculates the factorial
        jt.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
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
            }
        });

        jp.add(jb);
        jb.addActionListener(new ActionListener()

                //calculates the factorial if the button is pressed
        {
            public void actionPerformed(ActionEvent e)
            {
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
            }
        });

        jp.add(jl);
        add(jp);

    }

}