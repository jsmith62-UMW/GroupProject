import java.util.Scanner;

public class MainGame {

    public static void main(String[] args){
        Scanner gui = new Scanner(System.in);
        boolean game = true;
        int stage = 1;

        while (game){
            String scenario = "dragon";
            //consult scenarios to get a scenario and put it in string
            // scenarios.get(stage);

            switch(scenario) {

                case "dragon":
                    System.out.println("there is a dragon guarding the road");
                    System.out.println("what do you do?");
                    if (gui.next().equals("fight"))
                        System.out.println("you fight bravely and find a chink in the dragons armor, defeating it");
                    // save the victory to file
                    else{
                        System.out.print("defeat! you have failed in your quest!");
                        // save the defeat to the file
                                game = false;
                    }
                    break;
                case "bridge":
                    System.out.println("there is a troll guarding a bridge!");
                    System.out.println("what do you do?");
                    if (gui.next().equals("trick")){
                        System.out.println("you trick the troll with a coin and run past him!");

                        stage=2;
                    }else{
                        System.out.print("defeat! you have failed in your quest!");
                        game = false;
                    }
                    break;
                case "giant":
                    System.out.println("there is a giant laying on the path!");
            }
        }


    }
}
