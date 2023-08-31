package array;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayDemo demo = new ArrayDemo();
        demo.arrayDemo();
    }

    public void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] array = new int[5];
        printArray(array); //0 0 0 0 0
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        printArray(array); //10 20 30 40 50
        System.out.println("Length of Array = "+array.length); //5
        System.out.println("Last element of Array = "+array[array.length - 1]); //50

        int[] arr = {50, 40, 30, 20, 10};
        printArray(arr);
        int[] evenOddArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(removeEven(evenOddArray));
        printArray(reversedArray(evenOddArray));
        System.out.println("Minimum of an Array = "+findMinimumOfArray(evenOddArray));
        System.out.println("Second MAX of an Array = "+findSecondMaximum(evenOddArray));
        int[] arrayWithZeroes = {3, 0, 1, 5, 0, 0, 8, 19};
        printArray(moveAllZeroesToEnd(arrayWithZeroes));
        int[] original = {10, 30, 21, 48};
        System.out.println("The original size of an array = "+original.length);
        original = resizeArray(original, 10);
        System.out.println("The resized size of an array = "+original.length);
        int[] missingArray = {1, 2, 3, 5, 6};
        findMissingNumber(missingArray);
    }

    public int[] removeEven(int[] array) {
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] resultArray = new int[oddCount];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                resultArray[index] = array[i];
                index++;
            }
        }
        return resultArray;
    }

    public int[] reversedArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }

    public int findMinimumOfArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int findSecondMaximum(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    //3, 0, 1, 5, 0, 0, 8, 19
    public int[] moveAllZeroesToEnd(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[j] == 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if (array[j] != 0) {
                j++;
            }
        }
        return array;
    }

    public int[] resizeArray(int[] array, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < array.length; i ++) {
            temp[i] = array[i];
        }
        array = temp;
        return array;
    }

    //Que:- Given an array = n - 1 distinct numbers in the range of 1 to n,
    //find missing number.
    //We will use formula sum of n natural numbers:- 1+2+3+4...+n = n * (n + 1) / 2
    public void findMissingNumber(int[] array) {
        int sum = array.length * (array.length + 1) / 2;
        System.out.println("The sum is = "+sum);
        for (int i = 0; i < array.length; i++) {
            sum -= array[i];
            if (sum <= 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("The missing number is = "+sum);
    }
}
