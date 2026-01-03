import java.util.*;

public class FruitCostCalculator {
    public static void main(String[] args) {

        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("a", 10);
        fruitPrices.put("b", 5);
        fruitPrices.put("c", 3);

      
        List<String> fruitsBought = Arrays.asList(
            "a", "a", "a", "a", 
            "b", "b",               
            "c", "c"                  
        );

        
        int totalCost = 0;
        for (String fruit : fruitsBought) {
            totalCost += fruitPrices.get(fruit);
        }

       
        System.out.println("Total cost: " + totalCost);
    }
}