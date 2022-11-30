import java.util.Scanner;

public class MainGame {
public int stage = 1;




    public static void main(String[] args){
        Scanner gui = new Scanner(System.in);
        boolean game = true;

        String option = "";
        //int stage = scenario.load
        boolean combat;
        boolean victory = false;
        //initiate both GUI
        RulesGUI r = new RulesGUI();
        GameGUI g = new GameGUI();

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
                            combat = false;
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

                            //stage = 2;
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

                case"ferry":
                    System.out.println("afairyblockstheferrytoferryyouacrossthefairlyfoulfetidriver!");
                    System.out.println("whatdoyoudo?");
                    while(combat){
                        option=gui.next();
                        if(option.equals("trick")){

                            System.out.println("fabulouslythefairyisfascinatedwithyourfacadeandfallsinstep!");
                            //stage=3;
                            combat=false;

                        }else if(option.equals("run")){
                            System.out.print("yourunfromthefairy!forsomereason?");
                            combat=false;


                        }else if(option.equals("fight")){
                            System.out.println("thefairyfollowsyourfoulblowsandfoilsyourattemptsatfighting\ntryagain");
                        }else{
                            System.out.println("youcan'tdothatyet\"invalidinput,tryagain\"");
                        }
                    }
                    break;
                case"GIANTTROLL":
                    System.out.println("thereisaGiantTrollblockingyourpathforward!");
                    System.out.println("whatdoyoudo?");
                    while(combat){
                        option=gui.next();
                        if(option.equals("trick")){

                            System.out.println("WiththefairysdustoffabulousnessyoutrickthetrollintofallingintotheverybridgeitprotectsCongrats!");
                            combat=false;game=false;
                            victory=true;
                        }else if(option.equals("run")){
                            System.out.print("itbellowsinsultsasyourunawayfromyourfinalbattle!");
                            combat=false;


                        }else if(option.equals("fight")){
                            System.out.println("yourswordisstuckinthetrollshealingfleshandyouarecrushed!");
                            combat=true;game=false;
                        }else{
                            System.out.println("youcan'tdothatyet\"invalidinput,tryagain\"");
                        }
                    }
                    break;
                case"ANCIENTDRAGON":
                    System.out.println("thereisanAncientdragonattackingfromabove!");
                    System.out.println("whatdoyoudo?");
                    while(combat){
                        option=gui.next();
                        if(option.equals("trick")){

                            System.out.println("thedragonseesthroughyourtrickandburnsyou!");
                            combat=false;game=false;

                        }else if(option.equals("run")){
                            System.out.print("itsweepstocatchyourunningawaybutthefairycastsaspelltomakeyoufloatabovethedragonyoulandonitsbackandtamethebeast!");
                            combat=false;


                        }else if(option.equals("fight")){
                            System.out.println("itsarmorisstrong...yoursisnt");
                            combat=true;game=false;
                        }else{
                            System.out.println("youcan'tdothatyet\"invalidinput,tryagain\"");
                        }
                    }
                    break;
                case"GOBLINKING":
                    System.out.println("thegoblinkingguardshiscastle!");
                    System.out.println("whatdoyoudo?");
                    while(combat){
                        option=gui.next();
                        if(option.equals("trick")){

                            System.out.println("thekingiscunningandcannotbetricked!helaughsyourattemptaway\ntryagain");


                        }else if(option.equals("run")){
                            System.out.print("thekingisslowandyouareabletorunaway!");
                            combat=false;


                        }else if(option.equals("fight")){
                            System.out.println("thekingandyouduel!atthedecisivemomentthefairythrowsfairydustintothekingseyesallowingyoutolandthekillingblow");
                            combat=true;game=false;
                            victory=true;
                        }else{
                            System.out.println("youcan'tdothatyet\"invalidinput,tryagain\"");
                        }
                    }
                    break;

            }
        }
        if(victory){
            System.out.println("VICTORY!!!");
        }else
            System.out.println("DEFEAT!!!");




}
    public int getstage(){
        return stage;
    }
}
