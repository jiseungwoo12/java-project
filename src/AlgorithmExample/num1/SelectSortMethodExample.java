package AlgorithmExample.num1;

public class SelectSortMethodExample {
    //이번에는 아까 해보았던 선택정렬을 메서드로 만든다.
    //배열을 입력하면 정렬된 배열을 리턴하는 메서드이다.

    public static int[] selectSort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int num = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[num]>arr[j]){
                    num = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,654,64,6,2,341,31,32,564,2,3,4,5,6};

        int sortarr[] = selectSort(arr);
        for (int i: sortarr){
            System.out.println(i);
        }
    }
}
