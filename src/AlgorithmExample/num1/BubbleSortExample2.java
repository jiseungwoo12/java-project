package AlgorithmExample.num1;





public class BubbleSortExample2 {
    public static int[] bubbleSort (int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,12,7,25,2,9,11};
        int []array = bubbleSort(arr);
        for (int i : array){
            System.out.print(i+",");
        }
    }
}
