package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;  // Corrected import statement
import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String sentence) {
    if (sentence == null) {
        return 0;
    }
    String[] words = StringUtils.split(sentence);
    return words != null ? words.length : 0;
	}



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
		int count = app.countWords("I have four words");
		System.out.println("Word count: " + count);
    }
}
