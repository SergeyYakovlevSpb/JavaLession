import java.util.Random;

/**
 * Created by ss on 11.06.2017.
 */
public class MinMaxArray {

    int[] array;

    MinMaxArray(){
        int index;
        int lenghtArray = 10;
        array = new int[10];

        enterArray(lenghtArray);
        int minValue = array[0];
        int maxValue = array[0];

        for(index = 0;index < 10;index++){
            if(array[index] > maxValue){
                maxValue = array[index];
            }
            if(array[index] < minValue){
                minValue = array[index];
            }
        }
        System.out.println("Минимальное значение массива = " + minValue + "\nМаксимальное значение массива " + maxValue);
    }

    void enterArray(int lenghtArray) {
        int index;
        Random random = new Random();
        Integer valueEnd = 100;

        for(index = 0;index < lenghtArray;index++){
            int valueRandom = random.nextInt(valueEnd);
            array[index] = valueRandom;
            System.out.println(array[index]);
        }
    }



}
