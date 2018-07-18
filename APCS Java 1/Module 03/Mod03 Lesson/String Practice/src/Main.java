public class Main {

    public static void main(String[] args) {
	String replaceCharacters = "03/07/2007";
        replaceCharacters = replaceCharacters.replace("/", "-");
        System.out.println("Replacement characters: " + replaceCharacters);
    }
}
