public class RainWater {

public static void main (String[]args){
    int[] a= {5,1,4,3,5};
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
