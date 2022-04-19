import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        //String[] adjectives = new String[10];
        //String[] nouns = new String[10];

        String[] nouns = new String[]{"Cow", "Moon", "Car", "House", "Person", "Backpack", "Computer", "Book", "Ring", "Watch"};
        String[] adjectives = new String[]{"Fast", "Slow", "Hype", "Blue", "Hairy", "Scary", "Dreamy", "Red", "Crazy", "Golden"};
        randomElement(adjectives, nouns);
    }

    public static void randomElement( String[] adjectives, String[] nouns) {
        System.out.println("Here is your server name:");
        Random random1 = new Random();
        int index1 = random1.nextInt(adjectives.length);
        System.out.print(adjectives[index1] +"-");

        Random random = new Random();
        int index = random.nextInt(nouns.length);
        System.out.print(nouns[index]);
    }
}
