public class HelloApp {
    public static void main(String[] args) {

        // Default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String result = "";

        // Enhanced for loop
        for (String name : args) {
            result += name + ", ";
        }

        // Remove last comma and space
        result = result.substring(0, result.length() - 2);

        System.out.println("Hello, " + result + "!");
    }
}
