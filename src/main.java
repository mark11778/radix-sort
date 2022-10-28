import java.util.Random;

public class main {
    public static void main(String[] args) {
        Integer[] unsorted = {13,15,46,32,46,11};
        Integer[] sorted = RadixSort.sort(unsorted,21);
        for(Integer n : sorted) {
            System.out.print(n + ",");
        }
        System.out.println();
        sorted = RadixSort.sort(unsorted,1);
        for(Integer n : sorted) {
            System.out.print(n + ",");
        }

    }
}
