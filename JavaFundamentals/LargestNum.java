public class LargestNum{
    public static int Largestint(int[]arr){
        int largest = arr[0];
        for(int num : arr){
            if(num>largest){
                largest=num;
            }
        }
        return largest;
    }
    public static void main(String[]args){
        int[] numbers ={3,1,4,5,9};
        System.out.println(Largestint(numbers));
    }
}
