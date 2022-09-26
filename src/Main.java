public class Main {
    public static void main(String[] args) {
        int largeArray[] = {21,24,242,44,45,44,453,7,8,98,432,66,456,899}; //14 elements

        int smallest = largeArray[0];
        int largest = largeArray[0];

        for(int i = 0;i<=13; i++){
            if (largeArray[i] < smallest) smallest = largeArray[i];
            if (largeArray[i] > largest) largest = largeArray[i];

            System.out.println("The smallest value in the Array is: " + smallest);
            System.out.println("The largest value in the Array is: " + largest);


        }
    }
}