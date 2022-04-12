package regexCases;

import java.util.regex.*;

public class RegexPattern {
	

		public void first_Name() {
			// scanning
			String line = "Mohit";
			String pattern = "^[A-Z][a-z]*";

			// Create pattern object
			Pattern pat = Pattern.compile(pattern);

			// matching object create
			Matcher mat = pat.matcher(line);

			// Check Matching or not
			boolean result = mat.matches();
			System.out.println("First Name Matching result is " + result);
			System.out.println();

		}

}

