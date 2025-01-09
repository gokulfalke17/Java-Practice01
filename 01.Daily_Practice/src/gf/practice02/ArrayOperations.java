package gf.practice02;

import java.util.Scanner;

interface ArrayOperation {
    void performOperation(int[] x);
}

class Sorting implements ArrayOperation {
    public void performOperation(int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        System.out.println("After Sorting:");
        for (int value : x) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

class Inseration implements ArrayOperation {
    private int no, ind;

    void setValue(int value, int index) {
        no = value;
        ind = index;
    }

    public void performOperation(int[] x) {
        if (ind < 0 || ind > x.length) {
            System.out.println("Invalid index for insertion.");
            return;
        }
        int[] newArr = new int[x.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == ind) {
                newArr[i] = no;
            } else {
                newArr[i] = x[j++];
            }
        }
        System.out.println("After Insertion:");
        for (int value : newArr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

class Deletion implements ArrayOperation {
    private int ind;

    void setIndex(int index) {
        ind = index;
    }

    public void performOperation(int[] x) {
        if (ind < 0 || ind >= x.length) {
            System.out.println("Invalid index for deletion.");
            return;
        }
        int[] newArr = new int[x.length - 1];
        for (int i = 0, j = 0; i < x.length; i++) {
            if (i != ind) {
                newArr[j++] = x[i];
            }
        }
        System.out.println("After Deletion:");
        for (int value : newArr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

class Rev implements ArrayOperation {
    public void performOperation(int[] x) {
        int left = 0, right = x.length - 1;

        while (left < right) {
            int temp = x[left];
            x[left] = x[right];
            x[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed Array:");
        for (int value : x) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scn.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Sort");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Reverse");
            System.out.println("5. Exit");
            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    new Sorting().performOperation(arr);
                    break;
                case 2:
                    System.out.println("Enter the value and index to insert:");
                    int value = scn.nextInt();
                    int index = scn.nextInt();
                    Inseration insertion = new Inseration();
                    insertion.setValue(value, index);
                    insertion.performOperation(arr);
                    break;
                case 3:
                    System.out.println("Enter the index to delete:");
                    int delIndex = scn.nextInt();
                    Deletion deletion = new Deletion();
                    deletion.setIndex(delIndex);
                    deletion.performOperation(arr);
                    break;
                case 4:
                    new Rev().performOperation(arr);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scn.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
