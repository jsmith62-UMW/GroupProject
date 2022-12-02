import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MainGame {
    public static String stage = "1";




    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        File save = new File("savefile.txt");

        if(!save.exists()) {       // creat a save file
            try {
                save.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        FileReader fin ;
        FileWriter fout;
                                            //constructing file architecture
        try {
            fin = new FileReader(save);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fout = new FileWriter(save);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scanner file = new Scanner(fin);
        System.out.println("do you want to load from a save? y/n");
        String temp = in.next();

                                                                //asks for save choice or new file
        if(temp.equals("n")) {
MainGame.changeStage("1");
        } else {
            MainGame.changeStage(file.next());
            file.close();
        }


                                        //game gui
        GameGUI t = new GameGUI();


        //format for Scenario display
        JFrame situationGUI= new JFrame();

        //this prints out the first text and makes the variable 'area' that you can use to append
        JTextArea area=new JTextArea("This is the scenario");
        area.setBounds(10,30, 400,220);
        situationGUI.add(area);
        situationGUI.setSize(500,400);
        situationGUI.setLayout(null);
        situationGUI.setVisible(true);

        //set title
        situationGUI.setTitle("Situation Description");

        area.setEditable(false);
        situationGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);




        //change title of GUI
        t.setTitle("Stage = " + stage);



        //format for Scenario display
        JFrame resultGUI= new JFrame();

        //this prints out the first text and makes the variable 'area' that you can use to append
        JTextArea area2=new JTextArea("These are the results");
        area2.setBounds(10,30, 400,220);
        resultGUI.add(area2);
        resultGUI.setSize(500,400);
        resultGUI.setLayout(null);
        resultGUI.setVisible(true);

        //set title
        resultGUI.setTitle("Result");

        area.setEditable(false);
        resultGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);

        RulesGUI r = new RulesGUI();







        Scanner gui = new Scanner(System.in);
        boolean game = true;

        String option = "";
        //int stage = scenario.load
        boolean combat;
        boolean victory = false;
            Scenarios scen = new Scenarios();
            scen.generateScenarios();

        while (game){
            option = "";
            String scenario = scen.choice(getStage());
            //consult scenarios to get a scenario and put it in string
            combat = true;
            /*
            switch case for whatever scenario selected by scenarios based on stage
             */
            switch(scenario) {

                case "dragon":
                                                //appends situation
                    area.setText("");
                    area.append("there is a dragon guarding the road!\n what do you do?");

                                        //loop to get input from GUIS
                    while (combat) {
                        option = "";
                        while(option.equals("")){
                            option = t.getAnswer();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                        }
                        /*
                        prints the result of choices
                         */
                        if (option.equals("run")) {
                            area2.setText("");
                            area2.append("you side on caution and bravely run away");
                            combat = false;
                        }
                        else if (option.equals("trick")) {
                            area2.setText("");
                            area2.append("you dance in place and the dragon is confused... so are you \n try again");


                        } else if (option.equals("fight")) {
                            area2.setText("");
                            area2.append("your bravery impresses the dragon \n it give you a valiant end");

                            game = false;
                            combat = false;
                        }  else {
                            area2.setText("");
                            area2.append("you can't do that yet (invalid input, try again)");
                        }
                    }
                    break;
                case "bridge":
                    //appends situation
                    area.setText("");
                    area.append("there is a troll guarding a bridge!\n what do you do?");
                    while(combat) {
                        //loop to get input from GUIS
                        option = "";
                        while(option.equals("")){
                            option = t.getAnswer();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                        }
                        /*
                        prints the result of choices
                         */
                        if (option.equals("trick")) {
                            area2.setText("");
                            area2.append("you trick the troll with a cunning ridle and run past him!\n you pick up his bag of coins");
                            combat = false;
                            changeStage("2");
                            t.setTitle("stage = " + MainGame.getStage());
                        } else if (option.equals("run")) {
                            area2.setText("");
                            area2.append("victory? the troll is slow and cant keep up with you... \nbut there only one bridge");
                            combat = false;
                        } else if (option.equals("fight")) {
                            area2.setText("");
                            area2.append("the troll heals its wounds!\ntry again");
                        } else {
                            area2.setText("");
                            area2.append("you can't do that yet (invalid input, try again)");
                        }
                    }
                    break;
                case "goblin":
                    //appends situation
                    area.setText("");
                    area.append("there is a goblin patrolling the road!\n what do you do?");
                    while(combat) {
                        //loop to get input from GUIS
                        option = "";
                        while(option.equals("")){
                            option = t.getAnswer();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                        }
                        /*
                        prints the result of choices
                         */
                        if (option.equals("trick")) {
                            area2.setText("");
                            area2.append("you try to trick the goblin with a magic rhyme but he shakes it off!\n try again");


                        } else if (option.equals("run")) {
                            area2.setText("");
                            area2.append("he may be small but he can run fast! he keeps up with you");
                        } else if (option.equals("fight")) {
                            area2.setText("");
                            area2.append("you challenge the goblin and your bravery scares him away!");
                            combat = false;
                        } else {
                            area2.setText("");
                            area2.append("you can't do that yet (invalid input, try again)");
                        }
                    }
                    break;
                case "giant":
                    //appends situation
                    area.setText("");
                    area.append("there is a giant laying on the path!\n what do you do?");
                    while(combat) {
                        //loop to get input from GUIS
                        option = "";
                        while(option.equals("")){
                            option = t.getAnswer();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                        }
                        /*
                        prints the result of choices
                         */
                        if (option.equals("trick")) {
                            area2.setText("");
                            area2.append("The giant is all seeing and \n admonishes you, try again");

                        } else if (option.equals("run")) {

                            area2.setText("");
                            area2.append("with one step he makes up any distance you could ever make");

                        } else if (option.equals("fight")) {
                            area2.setText("");
                            area2.append("the giant trips on his way to attack you and you escape behind him");
                            combat = false;
                        }else if (option.equals("coins")) {
                            area2.setText("");
                            area2.append("the giant refuses your attempt at a bribe and challenges you to fight him");
                        }
                        else {
                            area2.setText("");
                            area2.append("you can't do that yet (invalid input, try again)");
                        }
                    }
                    break;
                case "wyvern":
                    //appends situation
                    area.setText("");
                    area.append("there is a wyvern attacking!\n what do you do?");
                    while(combat) {
                        //loop to get input from GUIS
                        option = "";
                        while(option.equals("")){
                            option = t.getAnswer();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                        }
                        /*
                        prints the result of choices
                         */
                        if (option.equals("trick")) {
                            area2.setText("");
                            area2.append("the wyvern is only an animal and eats your rations. \n leaving you free to run away");
                            combat = false;

                        } else if (option.equals("run")) {
                            area2.setText("");
                            area2.append("the wyvern catches up quick on its swift wings and defeats you!");
                            combat = false;
                            game = false;

                        } else if (option.equals("fight")) {
                            area2.setText("");
                            area2.append("the wyvern is only an animal and is scared away by your torch");
                            combat = false;
                        } else if (option.equals("coins")) {
                            area2.setText("");
                            area2.append("the wyvern is only an animal and doesnt care about coins\n it ontinues to attack you");
                        } else {
                            area2.setText("");
                            area2.append("you can't do that yet (invalid input, try again)");
                        }
                    }
                    break;

                case"ferry":
                    //appends situation
                    area.setText("");
                    area.append("a fairy blocks the ferry to ferry you across the fairly foul fetid river!\n what do you do?");
                    while(combat){
                        //loop to get input from GUIS
                        option = "";
                        while(option.equals("")){
                            option = t.getAnswer();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                        }
                        /*
                        prints the result of choices
                         */
                        if(option.equals("trick")){
                            area2.setText("");
                            area2.append("fabulously the fairy is fascinated with your facade and falls in step!\nalong with your journey you now have a fairy");

                            changeStage("3");
                            stage ="3";
                            t.setTitle("Stage = 3");
                            combat =false;

                        }else if(option.equals("run")){
                            area2.setText("");
                            area2.append("you run from the fairy! for some reason?");
                            combat = false;

                        }else if(option.equals("fight")){
                            area2.setText("");
                            area2.append("the fairy follows your foul blows and foils your attempts at fighting\ntry again");
                        }else if (option.equals("coins")) {
                            area2.setText("");
                            area2.append("the fairy accepts a bribe but can only carry one coin \n because of this the fairy follows you to ensure the safety of its coins");
                            combat = false;
                            changeStage("3");
                        }else{
                            area2.setText("");
                            area2.append("you can't do that yet (invalid input, try again)");
                        }
                    }
                    break;
                case"giant troll":
                    //appends situation
                    area.setText("");
                    area.append("there is a Giant Troll blocking your path forward!\n what do you do?");
                    while(combat){
                        //loop to get input from GUIS
                        option = "";
                        while(option.equals("")){
                            option = t.getAnswer();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        /*
                        prints the result of choices
                         */
                        if(option.equals("trick")){
                            area2.setText("");
                            area2.append("With the fairys dust of fabulousness you trick the troll!\n it falling off the very bridge it protects Congrats!");
                            combat=false;
                            game=false;
                            victory=true;
                        }else if(option.equals("run")){
                            area2.setText("");
                            area2.append("With the fairys dust of fabulousness you trick the troll!\n it falling off the very bridge it protects Congrats!");
                            combat=false;
                        }else if(option.equals("fight")){
                            area2.setText("");
                            area2.append("your sword is stuck in the trolls healing flesh and you are crushed!");
                            combat=false;game=false;
                        }else if (option.equals("coins")) {
                            area2.setText("");
                            area2.append("the fairy throws its coins at the troll, distracting it \ntaking advantage of this you rush forward and land a decisive blow\nforcing the troll to run in defeat");
                            combat = false;game = false;
                            victory = true;
                        }else if (option.equals("fairy")) {
                            area2.setText("");
                            area2.append("the fairy hates trolls and insults it... \n the troll laughs and ignores it");

                        }
                       else{
                            area2.setText("");
                            area2.append("you can't do that yet (invalid input, try again)");
                        }
                    }
                    break;
                case"ancient dragon":
                    //appends situation
                    area.setText("");
                    area.append("there is an Ancient dragon attacking from above!\n what do you do?");
                    while(combat){
                        //loop to get input from GUIS
                        option = "";
                        while(option.equals("")){
                            option = t.getAnswer();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                        }
                        /*
                        prints the result of choices
                         */
                        if(option.equals("trick")){
                            area2.setText("");
                            area2.append("the dragon sees through your trick and burns you!");
                            combat=false;game=false;

                        }else if(option.equals("run")){
                            area2.setText("");
                            area2.append("it sweeps to catch you running away but the fairy\n spurned to action, casts a spell to help \nyou float above the dragon and land on its back and tame the beast!");
                            combat=false;game = false;
                            victory = true;

                        }else if(option.equals("fight")){
                            area2.setText("");
                            area2.append("its armor is strong...yours isnt");
                            combat=false;game=false;
                        }else if (option.equals("coins")) {
                            area2.setText("");
                            area2.append("you offer the dragon coins for safe passage.\n it accepts, must to the anger of the fairy\n who spends its further days annoying the dragon in vain attempts to get back its bribe");
                            combat = false;game = false;
                            victory = true;
                        }else if (option.equals("fairy")) {
                            area2.setText("");
                            area2.append("the fairy is distracted by the dragons hoard being of no help atm");

                        }else{
                            area2.setText("");
                            area2.append("you can't do that yet (invalid input, try again)");
                        }
                    }
                    break;
                case"goblin king":
                    //appends situation
                    area.setText("");
                    area.append("The goblin kings fort blocks the path\nwhat do you do");
                    while(combat){
                        //loop to get input from GUIS
                        option = "";
                        while(option.equals("")){
                            option = t.getAnswer();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                        }
                        /*
                        prints the result of choices
                         */
                        if(option.equals("trick")){
                            area2.setText("");
                            area2.append("the king is cunning and cannot be tricked!\n he laughs your attempt away \n try again");


                        }else if(option.equals("run")){
                            area2.setText("");
                            area2.append("the king is slow and you are able to run away!");
                            combat=false;
                        }else if(option.equals("fight")){

                            area2.setText("");
                            area2.append("the king and you duel!\n at the decisive moment the fairy throws fairy dust into the kings eyes \n allowing you to land the killing blow");
                            combat=true;game=false;
                            victory=true;

                        }else if (option.equals("coins")) {
                            area2.setText("");
                            area2.append("the king takes the coins but still will not let you pass\n betraying his promise");

                        }else if (option.equals("fairy")) {
                            area2.setText("");
                            area2.append("the fairy tricks the king into a argument of words where it is distracted" +
                                    "\n allowing you to sneak up behind it and capture it");
                            combat = false;game = false;
                            victory = true;
                        }else{
                            area2.setText("");
                            area2.append("you can't do that yet (invalid input, try again)");
                        }
                    }
                    break;

            }
        }
        //prints result of your adventure
        if(victory){
            area.setText("");
            area.append("VICTORRRYYYYYY");
        }else {
            area.setText("");
            area.append("DEFFEEEAAATTTT!");
        }
        try {
            fout.write(stage);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fout.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //gives yout time to read the result before exiting
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.exit(0);



    }
    /*
    returns the stage
     */
    public static int getStage(){
        return Integer.parseInt(stage);
    }
    /*
    changes the stage to the param
     */
    public static void changeStage(String newstage){
        stage = newstage;
    }
}

