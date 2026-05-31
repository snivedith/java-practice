public class Smallest{
public static int SmallestNum(int[]arr){
int smallest=arr[0];
for(int num:arr){
if(num<smallest){
smallest=num;
}
}
return smallest;
}
public static void main(String[]args){
int[] numbers={3,1,4,5,9};
System.out.print(SmallestNum(numbers));
}
}