//Given an array of size N-1 and given that there are numbers from 1 to N with one element missing, 
//the missing number is to be found.

import java.util.Scanner;

public class Ques{


    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();

        int[] array = new int[n+1];
        System.out.println("The array should contain only one missing element, all elemnts must either be positive or negative.");
        for(int i =0; i < array.length -1; i++) {
            System.out.println("Enter The element of the array in incrementing order(incrementing by 1).");
            array[i] = sc.nextInt();
        }

    for(int i = 0; i<array.length; i++)
    {

        if(Math.abs(array[i]) !=1){
            for(int j = array.length - 1; j >= 1; j--)
            {
                array[j] = array[j-1];

            }
            if(array[i]<0) {
                array[i] =  1;
                array[i] = -array[i+1];
            }
            else
                array[i] = 1;

            break;


        }

        if( Math.abs(array[i + 1]) != Math.abs(array[i]) +1){

                for(int j = array.length - 1; j >= i+1; j--)
                {
                    array[j] = array[j-1];
                }
                if(array[i]<0) {
                    array[i + 1] = Math.abs(array[i + 1]) + 1;
                    array[i + 1] = -array[i+1];
                }
                else
                    array[i+1] = array[i+1] +1;

                break;
            }


    }
       for(int j= 0; j< array.length; j++) {
           System.out.print(array[j]);
           System.out.print(" ");
       }}


    }


