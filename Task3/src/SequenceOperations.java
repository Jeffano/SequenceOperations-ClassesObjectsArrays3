import java.text.DecimalFormat;
import java.util.Arrays;

public class SequenceOperations {

    //initializes the array in the class
    private double[] numArray;

    //Creating the SequenceOperations constructor, reads the array from the main class
    public SequenceOperations(double[] a){
        numArray = a;
    }

    //Creating a method to calculate the total of the values
    public double getTotal(){
        double sum = 0;
        //Uses a for lopp to find the sum of values in the array
        for (int i = 0; i < 7;i++){
            sum += numArray[i];
        }
        //Returns the sum of all the values
        return sum;
    }

    //Finds the average of all the values
    public String getAverage(){
        double average;
        //Gets the sum from gettotal method and divides by 7 for the average
        average = getTotal() / 7;
        //Returns the average to 2 decimal palaces
        return String.format("%.02f", average);
    }

    //Method to return the highest number in the array
    public double getHighest(){
        //initializes the first value in the array as the highest
        double highest = numArray[0];
        //Checks through all 7 values
        for (int i = 1; i < 7;i++){
            //Uses if statemtn to compare which value is greater. If it is less than the next number, it switches and
            //continues the loop till the end
            if (highest < numArray[i]){
                highest = numArray[i];
            }
        }
        //Returns the highest value
        return highest;
    }

    //Method to reverse the array
    public String getReverse(){
        String output = "";
        //Opposite for loop to print the array backwards
        for (int i = 6; i > 0;i--){
            //Adds all the value into one line
            output += numArray[i] + ", ";
        }
        //Adds the first value last
        output += numArray[0];
        //Returns the reverse order
        return output;
    }
}
