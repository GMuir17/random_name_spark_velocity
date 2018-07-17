import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import javax.jws.WebParam;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import static spark.Spark.get;

public class NameController {
    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        RandomName randomNames = new RandomName();

        get("/:number", (req, res) -> {
            int numberOfNames = Integer.parseInt(req.params(":number"));

            ArrayList<String> names = randomNames.getXRandomNames(numberOfNames);
            int x = names.size();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);
            model.put("x", x);

            return new ModelAndView(model, "name.vtl");
        }, velocityTemplateEngine);

    }
}
