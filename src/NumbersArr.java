import java.util.Arrays;

public class NumbersArr {
    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5};
        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
        Arrays.fill(numbers, 0);

        System.out.println(Arrays.toString(numbers)); // [0,0,0,0,0]
        System.out.println(Arrays.toString(copyOfNumbers)); // [1,2,3,4,5]
    }
}
