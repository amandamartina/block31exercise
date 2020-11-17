package animalshelter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niklas on 2016-02-07.
 */
public class AnimalShelter<A> {

    private List<A> animalsInShelter = new ArrayList<>(20);

    A adoptAnimal(){
        return animalsInShelter.remove(0);
    }

    void putAnimal(A animal){
        animalsInShelter.add(animal);
    }

}
