package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spices;

    public Food(){
        spices = new ArrayList<>();

    }

    public Food(List<Spice> spices){
        this.spices = spices;
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> result = new HashMap<>();


        for (Spice each : spices) {
            if(result.containsKey((SpiceType) each.getClass())){
                result.put((SpiceType) each.getClass(), result.get((SpiceType) each.getClass()) + 1);
            }
            else{
                result.put((SpiceType) each.getClass(), 1);
            }
        }

        for (Map.Entry entry : result.entrySet())
        {
            System.out.println("key: " + entry.getKey() + "; value: " + entry.getValue());
        }

//        //System.out.println("BBLEH : " + spices.get(0).getClass().getSimpleName());
        return result;//spices.stream().collect(Collectors.toMap(p->p, e -> 1, Math::addExact, HashMap<SpiceType, Integer>::new));
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
