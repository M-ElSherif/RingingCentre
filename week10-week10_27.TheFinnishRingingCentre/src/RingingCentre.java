
import java.util.*;

/**
 *
 * @author thesh
 */
public class RingingCentre {
    
    private Map<Bird, List<String>> observations = new HashMap<Bird, List<String>>();
            
    // METHOD. records the observation and its place among the bird information
    public void observe(Bird bird, String place) {
        if (this.observations.containsKey(bird)) {
            this.observations.get(bird).add(place);
        }
        else {
            List<String> places = new ArrayList<String>();
            places.add(place);
            this.observations.put(bird, places);
        }
    }
    
    // METHOD. prints all the observations of the parameter bird 
    public void observations(Bird bird) {
        if (this.observations.containsKey(bird)) {
            System.out.println(bird + " observations: " + this.observations.get(bird).size() );
            for (String place : this.observations.get(bird)) {
                System.out.println(place);
            }
        }
        else {
            System.out.println(bird + " observations: 0");
        }
    }
    
}
