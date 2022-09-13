import java.io.*;

    public class FileIO {
        public static void main(String[] args) {
            //Declare an array of employee names
            String[] names = {"Abdi", "Chue", "Halima", "Rosa"};

            //Declare a try-catch block to catch an exception that is thrown if the file cannot be created.
            try {
                //Create a new BufferedWriter to write to the file called output.txt.
                BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

                //Write a header to the file
                writer.write("Employee Names:\n");

                //Loop through the array of names and write each one to the file.
                for (String name : names) {
                    writer.write("\n" + name);
                } //end for loop

                //Close the file
                writer.close();
            } catch (IOException e) {
                //This catch block will catch any exceptions.
                //If an excpetion is caught, print the stack trace.
                e.printStackTrace();
            }//end try-catch

            //Declare a try-catch block to catch an exception that is thrown if the file cannot be read.
            try {
                //Create a new BufferedReader to read in the file.
                BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

                //Declare a string variable to hold the value of the current line of the file.
                String line;

                //While there is another line in the file, read it it and display it to the user.
                while((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                //Close the file.
                reader.close();
            } catch (IOException e) {
                //This catch block will catch any exceptions.
                //If an exception is caught, print the stack trace.
                e.printStackTrace();
            }//end try-catch
        }//end main
    }//end class

