public class DisplayMessages {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("I love Java");
        }


        // Although the prompt only asks for "I love Java" five times,
        // it also mentions displaying "eight messages".  To clarify 
        // and fulfill the potential "eight messages" requirement, we can
        // add three more messages (or any other relevant messages)
        // This avoids any ambiguity about the instructions.

        System.out.println("Java is fun!");
        System.out.println("Learning Java is rewarding.");
        System.out.println("Java is a powerful language.");
    }
}
