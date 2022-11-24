import java.util.ArrayList;
import java.util.Random;

public class Scenarios {
    private ArrayList<String> beginningScenarios;
    private ArrayList<String> middleScenarios;
    private ArrayList<String> finalScenarios;

    //method returns random scenario from selected part of story
    public String choice(int stage){
        //adding string to beginning
        beginningScenarios.add("dragon");
        beginningScenarios.add("goblin");
        beginningScenarios.add("bridge");
        //adding to middle
        middleScenarios.add("giant");
        middleScenarios.add("wyvern");
        middleScenarios.add("ferry");
        //adding to final
        finalScenarios.add("giant troll");
        finalScenarios.add("ancient dragon");
        finalScenarios.add("goblin king");
        //random decider
        Random rand = new Random();
        int decide = rand.nextInt(3);
        //choice
        if (stage == 1){
            return beginningScenarios.get(decide);
        } else if (stage == 2) {
            return middleScenarios.get(decide);
        } else if (stage == 3) {
            return finalScenarios.get(decide);
        }
        return null;
    }
}
