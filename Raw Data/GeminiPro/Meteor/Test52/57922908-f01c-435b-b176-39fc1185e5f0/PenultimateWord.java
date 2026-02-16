public class PenultimateWord {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a sentence as input.");
            return;
        }

        String sentence = String.join(" ", args); 
        sentence = sentence.trim(); // Remove leading/trailing whitespace

        if (sentence.isEmpty()) {
            System.out.println("Input sentence is empty.");
            return;
        }


        int lastSpaceIndex = sentence.lastIndexOf(' ');

        if (lastSpaceIndex == -1) { // Only one word
            System.out.println("There is no penultimate word.");
        } else {
            int secondLastSpaceIndex = sentence.lastIndexOf(' ', lastSpaceIndex - 1);
            String penultimateWord;
            if (secondLastSpaceIndex == -1) { // Two words
                penultimateWord = sentence.substring(0, lastSpaceIndex);
            } else { // More than two words
                penultimateWord = sentence.substring(secondLastSpaceIndex + 1, lastSpaceIndex);
            }
            System.out.println(penultimateWord);
        }

    }
}
