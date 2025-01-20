package thisisjava_note.ch02;

public class ddd {
    public static void main(String[] args) {

        int [][] array ={
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };

        int sum = 0;
        double average = 0.0;
        int totalColums = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                totalColums++;
            }
        }
        average = (double) sum/totalColums;
        System.out.println(sum);
        System.out.println(average);



    }
}
