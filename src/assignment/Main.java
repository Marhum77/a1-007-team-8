package assignment;

public class Main {

    public static void main(String[] args) {
        new NamePrinter().printNames();
    }
}

class NamePrinter {
    /**
     * Prints the names in the names array seperated by the separator variable
	 * 
	 * @author Team 08
	 * @version 1.0
	 * 
     */
    public void printNames() {
        String separator = "+";

        String[] names = {
                "Scott Jacobsen",
                "Name 2",
                "Name 3",
                "Name 4",
                "Name 5"};

        System.out.println(String.join(separator, names));
    }
}
