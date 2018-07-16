import java.util.ArrayList;
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

        return result;
    }

    public ArrayList<String> getTwoRandomNames() {
        ArrayList<String> results = new ArrayList<>();
        String name1 = getRandomName();
        String name2 = getRandomName();

        results.add(name1);
        results.add(name2);

        return results;
    }

}
