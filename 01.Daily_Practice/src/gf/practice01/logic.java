package gf.practice01;

import java.util.Arrays;

public class logic {
    
    int arr[];
    
    public void setArray(int arr[]) {
        this.arr = arr;
    }



    
    public void sumOfArrayElemenets() {
        System.out.println("Sum of digits for each number:");
        
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int num = arr[i];
            
            while (num != 0) {
                sum += num % 10;  
                num /= 10;        
            }
            
            System.out.println("Sum of digits of " + arr[i] + " is: " + sum);
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {5732, 8659, 2534, 9625, 7354, 1325};
        
        System.out.println("Original Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        logic operation = new logic();
        operation.setArray(arr);
       // operation.sortArrayASC(arr);          
       // operation.sumOfArrayElemenets();    
    }
}
