import java.util.*;

public class StoryGenerator {

    public static void main(String[] args) {
        // Define the story vocabulary
        Set<String> nouns = new HashSet<>(Arrays.asList("cat", "dog", "house", "car", "tree"));
        Set<String> verbs = new HashSet<>(Arrays.asList("run", "jump", "walk", "eat", "sleep"));
        Set<String> adjectives = new HashSet<>(Arrays.asList("big", "small", "red", "blue", "green"));
        Set<String> adverbs = new HashSet<>(Arrays.asList("quickly", "slowly", "happily", "sadly", "excitedly"));

        // Generate a random story
        Random random = new Random();
        StringBuilder story = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            String noun = getRandomElement(nouns, random);
            String verb = getRandomElement(verbs, random);
            String adjective = getRandomElement(adjectives, random);
            String adverb = getRandomElement(adverbs, random);

            story.append(String.format("%s %s %s %s. ", adjective, noun, verb, adverb));
        }

        // Print the story
        System.out.println(story);
    }

    private static <T> T getRandomElement(Set<T> set, Random random) {
        int index = random.nextInt(set.size());
        Iterator<T> iterator = set.iterator();
        for (int i = 0; i < index; i++) {
            iterator.next();
        }
        return iterator.next();
    }
}
