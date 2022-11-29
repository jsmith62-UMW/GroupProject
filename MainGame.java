import java.util.Scanner;

public class MainGame {

    public static void main(String[] args){
        Scanner gui = new Scanner(System.in);
        boolean game = true;
        int stage = 0;
        String option = "";
        //int stage = scenario.load
        boolean combat;

        while (game){
            String scenario = "dragon";
            combat = true;
            //consult scenarios to get a scenario and put it in string
            // scenarios.get(stage);

            switch(scenario) {

                case "dragon":
                    System.out.println("there is a dragon guarding the road");
                    System.out.println("what do you do?");
                    while (combat) {
                        option = gui.next();
                        if (option.equals("run")) {
                            System.out.println("you side on caution and bravely run away!");
                            combat = false;
                            // save the victory to file
                        }
                        else if (option.equals("trick")) {
                            System.out.print("you dance in place and the dragon is confused... so are you \n try again" );
                            // save the attempt?

                        } else if (option.equals("fight")) {
                            System.out.println("your bravery impresses the dragon and it give you a valiant end");
                            //save the victory
                            game = false;
                        }  else {
                            System.out.println("you can't do that yet\"invalid input, try again\"");
                        }
                    }
                    break;
                case "bridge":
                    System.out.println("there is a troll guarding a bridge!");
                    System.out.println("what do you do?");
                    while(combat) {
                        option = gui.next();
                        if (option.equals("trick")) {

                            System.out.println("you trick the troll with a coin and run past him!");
                            combat = false;

                            stage = 2;
                        } else if (option.equals("run")) {
                            System.out.print("defeat! you have failed in your quest! the troll throws his club at you");
                            game = false;
                            combat = false;
                        } else if (option.equals("fight")) {
                            System.out.println("the troll heals its wounds!\ntry again");
                        } else {
                            System.out.println("you can't do that yet\"invalid input, try again\"");
                        }
                    }
                    break;
                case "goblin":System.out.println("there is a goblin  patrolling the road!");
                    System.out.println("what do you do?");
                    while(combat) {
                        option = gui.next();
                        if (option.equals("trick")) {

                            System.out.println("you try to trick the goblin with a magic rhyme but he shakes it off!\n try again");


                        } else if (option.equals("run")) {
                            System.out.print("he may be small but he can run fast! he keeps up with you");


                        } else if (option.equals("fight")) {
                            System.out.println("you challenge the goblin and your bravery scares him away!");
                            combat = false;
                        } else {
                            System.out.println("you can't do that yet\"invalid input, try again\"");
                        }
                    }
                    break;
                case "giant":
                    System.out.println("there is a giant laying on the path!");
                    System.out.println("what do you do?");
                    while(combat) {
                        option = gui.next();
                        if (option.equals("trick")) {

                            System.out.println("you try to trick the goblin with a magic rhyme but he shakes it off!\n try again");


                        } else if (option.equals("run")) {
                            System.out.print("he may be small but he can run fast! he keeps up with you");


                        } else if (option.equals("fight")) {
                            System.out.println("you challenge the goblin and your bravery scares him away!");
                            combat = false;
                        } else {
                            System.out.println("you can't do that yet\"invalid input, try again\"");
                        }
                    }
                    break;
                case "wyvern":
                    System.out.println("there is a wyvern attacking!");
                    System.out.println("what do you do?");
                    while(combat) {
                        option = gui.next();
                        if (option.equals("trick")) {

                            System.out.println("you try to trick the goblin with a magic rhyme but he shakes it off!\n try again");


                        } else if (option.equals("run")) {
                            System.out.print("the wyver catches up quick on its swift wings and defeats you!");
                        combat = false;
                        game = false;

                        } else if (option.equals("fight")) {
                            System.out.println("you challenge the goblin and your bravery scares him away!");
                            combat = false;
                        } else {
                            System.out.println("you can't do that yet\"invalid input, try again\"");
                        }
                    }
                    break;

            }
        }


    }
}
