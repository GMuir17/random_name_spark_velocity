import java.util.ArrayList;

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
}
