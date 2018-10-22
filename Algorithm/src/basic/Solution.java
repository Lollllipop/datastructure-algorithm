package basic;

import java.util.Scanner;

public class Solution {
    static int input[];
    static int num;
 
    static void quickSort(int first, int last)
    {
        int temp;       
        if (first < last)
        {
            int pivot = first;
            int i = first;
            int j = last;
 
            while (i < j){
                while (input[i] <= input[pivot] && i < last) i++;
                
                while (input[j] > input[pivot]) j--;
                
                if (i < j) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
 
            temp = input[pivot];
            input[pivot] = input[j];
            input[j] = temp;
 
            quickSort(first, j - 1);
            quickSort(j + 1, last);
        }
    }
 
    static void printResult()
    {
        for (int i = 0; i < num; ++i)
        {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
 
    public static void main(String arg[]) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        num = sc.nextInt();
             
        input = new int[num];
        for (int i = 0; i < num; i++)
        {
            input[i] = sc.nextInt();
        }
 
        quickSort(0, num - 1);	
            
        printResult();
 
 
        sc.close();
    }
}

