import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class RandomName {

    private ArrayList<String> names;

    public RandomName() {
        this.names = new ArrayList<String>();
        names.add("Gaius");
        names.add("Crassus");
        names.add("Brutus");
        names.add("Julius");
        names.add("Pompianus");
        names.add("Marcus");
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public String getRandomName() {
        String result = null;

        Random rand = new Random();
        int index = rand.nextInt(names.size());

        result = names.remove(index);
        names.add(result);
//TODO: use get
        return result;
    }

    public ArrayList<String> getXRandomNames(int x) {
        ArrayList<String> results = new ArrayList<>();

        int counter = 0;

        while (x > counter) {
            String name = getRandomName();
            results.add(name);
            counter += 1;
        }

        return results;
    }
}
