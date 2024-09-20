import java.util.Arrays;

class ArrayPractice {
    public static void main(String[] args) {
        char vowels[] = {'i','u','e','o','a'}; 
        int startingIndex = 1;
        int endingIndex = 3;
        Arrays.fill(vowels,startingIndex,endingIndex, 'x');
        System.out.println(Arrays.toString(vowels)); 
    }
}
