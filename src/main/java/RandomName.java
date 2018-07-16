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

    public ArrayList<String> getThreeRandomNames() {
        ArrayList<String> results = new ArrayList<>();
        String name1 = getRandomName();
        String name2 = getRandomName();
        String name3 = getRandomName();

        results.add(name1);
        results.add(name2);
        results.add(name3);

        return results;
    }

    public ArrayList<String> getFourRandomNames() {
        ArrayList<String> results = new ArrayList<>();
        String name1 = getRandomName();
        String name2 = getRandomName();
        String name3 = getRandomName();
        String name4 = getRandomName();

        results.add(name1);
        results.add(name2);
        results.add(name3);
        results.add(name4);

        return results;
    }
}
