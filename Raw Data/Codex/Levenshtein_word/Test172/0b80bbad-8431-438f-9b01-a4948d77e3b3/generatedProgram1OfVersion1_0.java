import java.io.*;

class PrintableCharacter {

    public static void printPrintableValue(char ch) {
        if (Character.isISOControl(ch)) {
            System.out.println("Non-printable character (Control character)");
        } else if (Character.isWhitespace(ch)) {
            if (ch == ' ') {
                System.out.println("Space");  // Specific handling for space
            } else if (ch == '\t') {
                System.out.println("Tab");      // Specific handling for tab
            } else if (ch == '\n') {
                System.out.println("Newline");   // Specific handling for newline
            } else if (ch == '\r') {
                System.out.println("Carriage return"); // Specific handling for carriage return
            } else if (ch == '\f') {
                System.out.println("Form feed");   // Specific handling for form feed
            } else if (ch == '\b') {
                System.out.println("Backspace"); //Specific handling for backspace
            } else {                
                System.out.println("Whitespace character (other)");
            }
        } else {
            System.out.println(ch);
        }
    }



    public static void main(String[] args) throws IOException {

        // Test cases
        printPrintableValue('A');             // Regular character
        printPrintableValue(' ');             // Space
        printPrintableValue('\t');            // Tab
        printPrintableValue('\n');            // Newline
        printPrintableValue('\r');            // Carriage Return
        printPrintableValue('\b');            // Backspace
        printPrintableValue('\f');            // Form Feed
        printPrintableValue((char) 0x07);     // Control character (BEL)
        printPrintableValue((char) 0x1B);      // Control character (ESC)
        printPrintableValue((char) 127);       // DEL (Control character)
        printPrintableValue('9');            // Digit
        printPrintableValue('!');            // Special character
        printPrintableValue('�');            // Unicode character
        printPrintableValue((char) 0);       // Null character (control)


        //Taking input from the user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a character: ");
        String input = reader.readLine();
        if (input.length() > 0) { // Check if the user entered anything
            char userInputChar = input.charAt(0); 
            printPrintableValue(userInputChar);
        } else {
            System.out.println("No character entered.");
        }
        reader.close();
    }
}
