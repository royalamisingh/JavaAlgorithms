import java.util.HashMap;
import java.util.Map;

public class FindWinner extends Test{
	public static void findWinner(String votes[])
    {
        // Insert all votes in a hashmap
        Map<String,Integer> map =
                    new HashMap<String, Integer>();
        for (String str : votes)
        {
            if (map.keySet().contains(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }
 
        
        int maxValueInMap = 0;
        String winner = "";
        for (Map.Entry<String,Integer> entry: map.entrySet())
        {
            String key  = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxValueInMap)
            {
                maxValueInMap = val;
                winner = key;
            }
 
            // If there is a tie, pick lexicographically
            // smaller. 
            else if (val == maxValueInMap &&
                key.compareTo(winner) > 0)
                winner = key;
        }
        System.out.println("Winning Candidate is :" +
                                              winner);
    }
 
    // Driver code
    public static void main(String[] args)
    {
       String[] votes = { "Gulab-Jamun", "Gulab-Jamun","Gajar-Halwa","Gajar-Halwa"};
 
       findWinner(votes);
    }
}

