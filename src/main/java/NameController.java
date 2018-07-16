import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.HashMap;
import static spark.Spark.get;

public class NameController {
    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        RandomName randomNames = new RandomName();

        get("/one", (req, res) -> {

            String name = randomNames.getRandomName();

            HashMap<String, Object> model = new HashMap<>();
            model.put("name", name);

            return new ModelAndView(model, "one.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {

            ArrayList<String> names = randomNames.getTwoRandomNames();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);

            return new ModelAndView(model, "two.vtl");
        }, velocityTemplateEngine);









    }
}
