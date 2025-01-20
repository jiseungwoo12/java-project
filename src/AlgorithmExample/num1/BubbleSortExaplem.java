package AlgorithmExample.num1;

public class BubbleSortExaplem {
    public static void main(String[] args) {
        //버블정렬은 숫자 2개를 비교하여 6,3 비교시 6이 3보다 크므로 3,6으로 자리를바꾼다
        //6과 12비교 12와 7비교 12와 25비교 25와 2비교 25와 9비교 25와 11비교
        //첫번째는 3,6,7,12,2,9,11,25 가될것이다. 이것을 계속반복하여 오름차순으로 정렬을하는것을말한다.
        int arr[] = {6,3,12,7,25,2,9,11};
            //왜 길이에 -1을할까
            //한번 정렬하면 제일큰수가 맨뒤로가므롴
        for (int i = 0; i < arr.length-1; i++) { //한바퀴를돌면 제일큰수가 뒤로가게되있다.
            //그러므로 반복할횟수를 -1빼기 해주면 배열전체를 정렬할수있다.
            for (int j = 0; j < arr.length-1-i; j++) {
                //lenght-1-i 하는이유
                //i는이미 정렬된 부분을 제외하기위함이고
                //-1은 두개의 값을 비교해야하므로 마지막 인덱스는 제외해야한다.
                //arr[j+1]이 배열의범위를벗어나지않도록
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr){
            System.out.print(i+",");
        }
    }
}
