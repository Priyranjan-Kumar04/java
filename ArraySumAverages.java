public class ArraySumAverages {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum and Average\n");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("Sum of the Number is : "+ sum);
        System.out.println("Averge of the Number is : "+ avg);
        
    }
    public static long sum(int[] numArray){
        long sum =0;
        int i = 0;
        while(i<numArray.length){
            i++;
            sum += numArray[i];

        }
        return sum;

    }
    public static int average(int[] numArray){
        long sum = sum(numArray);
        return (int) sum/numArray.length;

    }


}
