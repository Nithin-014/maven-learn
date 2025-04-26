package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;  // Corrected import statement

public class Application {

    public void greet() {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");

        for (String greeting : greetings) {  // Fixed loop variable name
            System.out.println("Greetings: " + greeting);
        }
    }

    public Application() {
        System.out.println("Inside Application");
    }

    // Main method: Application entry point
    public static void main(String[] args) {
        System.out.println("Starting Application");
        Application app = new Application();
        app.greet();
    }
}
