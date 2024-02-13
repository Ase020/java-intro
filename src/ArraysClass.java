import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args){
//        char vowels[] = new char[5];
//
//        vowels[0] = 'a';
//        vowels[1] = 'e';
//        vowels[2] = 'i';
//        vowels[3] = 'o';
//        vowels[4] = 'u';

        char vowels[] = {'a', 'e', 'i', 'o', 'u'};

//        System.out.println(Arrays.toString(vowels)); // [a, e, i, o, u]

//        vowels[2] = 'x';
//        System.out.println(Arrays.toString(vowels)); // [a, e, x, o, u]
//        System.out.println(vowels.length); // 5
        char unSortedVowels[] = {'e', 'u', 'a', 'o', 'i'};

        int startingIndex = 1;
        int endingIndex = 4;
        Arrays.sort(unSortedVowels, startingIndex, endingIndex);
//        System.out.println(Arrays.toString(unSortedVowels)); // [e,a,o,u,i]

        char sortedVowels[] = {'a', 'e', 'i', 'o', 'u'};

        char key = 'o';
        int foundIndex = Arrays.binarySearch(sortedVowels, startingIndex, endingIndex, key);
//       System.out.println(foundIndex); //3

        char fillVowels[] = {'a', 'e', 'i', 'o', 'u'};
        Arrays.fill(fillVowels, startingIndex, endingIndex, 'x');

        System.out.println(Arrays.toString(fillVowels));  // [a,x,x,x,u]


    }
}
