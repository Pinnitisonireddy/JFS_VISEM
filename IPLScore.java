//write a program on ipl score

import java.util.HashMap;

public class IPLScore {
    public static void main(String[] args) {

        
        HashMap<String, Integer> score = new HashMap<>();

    
        score.put("CSK", 180);
        score.put("MI", 165);
        score.put("RCB", 190);
        score.put("KKR", 175);

    
        System.out.println("IPL Team Scores:");
        for (String team : score.keySet()) {
            System.out.println(team + " : " + score.get(team));
        }
    }
}
