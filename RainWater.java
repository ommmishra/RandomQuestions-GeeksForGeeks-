

// Given n non-negative integers in array representing an elevation map where the width of each bar is 1, 
// compute how much water it is able to trap after raining.
// For example:
// Input:
// 3
// 2 0 2
// Output:
// 2
// Structure is like below
// | |
// |_|
// We can trap 2 units of water in the middle gap.
import java.util.Scanner;
public class RainWater {

public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array / water tank");
    int n = sc.nextInt();
    int[] a= new int[n];
    
    for(int i = 0; i < a.length; i++)
    {
    System.out.println("Enter the value of the bars");
        a[i] = sc.nextInt();
    }
    
    int s = a[0];
    int rainWater = 0;
    for(int i = 1; i< a.length; i++){
        if(a[i] < s){
            rainWater = rainWater + s-a[i];
        }
         else if(a[i] > s)
        {
            s=a[i];
        }
    }
    System.out.println("The rain water colleced is "+ rainWater);
}

}
