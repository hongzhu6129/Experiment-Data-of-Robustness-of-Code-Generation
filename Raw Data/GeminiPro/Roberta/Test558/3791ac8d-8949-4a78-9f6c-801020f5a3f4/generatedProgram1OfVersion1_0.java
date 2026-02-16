public class UpdateArray {

    public static void main(String[] args) {
        // Example usage:
        int[] myArray = {1, 2, 3, 4, 5};
        int indexToUpdate = 2; // Update the element at index 2 (which is currently 3)
        int newValue = 99;

        // Update the array (in-place modification)
        if (indexToUpdate >= 0 && indexToUpdate < myArray.length) {
            myArray[indexToUpdate] = newValue;
        } else {
            System.out.println("Invalid index. Array remains unchanged.");
        }

        // Print the updated array
        System.out.print("Updated array: ");
        for (int element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println();


        //Another Example (using command line args):

        if(args.length >= 3){ //We need at least 3 arguments: Array values, index, new value.
          try{
            int arrLength = args.length-2;
            int[] arrFromArgs = new int[arrLength];

            for(int i=0; i<arrLength; i++){
                arrFromArgs[i] = Integer.parseInt(args[i]);
            }
            
            int index = Integer.parseInt(args[args.length - 2]);
            int newVal = Integer.parseInt(args[args.length - 1]);
            
             if (index >= 0 && index < arrFromArgs.length) {
                arrFromArgs[index] = newVal;
            } else {
                System.out.println("Invalid index. Array remains unchanged.");
            }


             System.out.print("Updated array: ");
            for (int element : arrFromArgs) {
                System.out.print(element + " ");
            }
            System.out.println();

          } catch (NumberFormatException e) {
             System.out.println("Invalid input. Please provide numbers as arguments.");
          }



        } else{
            System.out.println("Please provide enough arguments: Array values, index to update, new value.");
        }



    }
}
