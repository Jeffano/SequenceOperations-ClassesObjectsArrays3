public class Task3Demo {
    public static void main(String[] args) {

        //Initializes the array and stores values into it
        double[] array = new double[7];
        array[0] = 3.0;
        array[1] = 2.4;
        array[2] = 6.0;
        array[3] = 2.0;
        array[4] = 4.0;
        array[5] = 5.1;
        array[6] = 7.2;

        //Creates the SequenceOperations object
        SequenceOperations sq = new SequenceOperations(array);

        //Creating a forloop to print the out the values in the array
        String arrayList = "";
        for(int i = 0; i < 6; i++){
            arrayList += array[i] + ", ";
        }
        //Adds the last value of the array
        arrayList += array[6];

        //Prints the value in the array
        System.out.println("Processing the array: [" + arrayList + "]");
        //Prints the total of all the values
        System.out.println("Total: " + sq.getTotal());
        //Prints the average of all the values
        System.out.println("Average: " + sq.getAverage());
        //Prints the highest of all the values
        System.out.println("Highest Value: " + sq.getHighest());
        //Prints the reverse of the values in the array
        System.out.println("Array Reverse: [" + sq.getReverse() + "]");
    }
}
