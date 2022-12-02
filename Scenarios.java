import java.util.ArrayList;
import java.util.Random;

public class Scenarios {
    private ArrayList<String> beginningScenarios;
    private ArrayList<String> middleScenarios;
    private ArrayList<String> finalScenarios;

    public void generateScenarios(){
        //creating the arraylists
        beginningScenarios = new ArrayList<>();
        middleScenarios = new ArrayList<>();
        finalScenarios = new ArrayList<>();
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
    }
    //method returns random scenario from selected part of story
    public String choice(int stage){
        Random rand = new Random();
        if (stage == 1){
            int decide1 = rand.nextInt(beginningScenarios.size());
            return beginningScenarios.get(decide1);
        } else if (stage == 2) {
            int decide2 = rand.nextInt(middleScenarios.size());
            return middleScenarios.get(decide2);
        } else if (stage == 3) {
            int decide3 = rand.nextInt(finalScenarios.size());
            return finalScenarios.get(decide3);
        }
        return null;
    }
}
