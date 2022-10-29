import java.util.Random;

public class main {
    public static void main(String[] args) {
        Integer[] unsorted = {13,15,46,32,46,11};
        Integer[] sorted = RadixSort.sort(unsorted,21);
        sorted = RadixSort.sort(unsorted,1);
        System.out.println(write(sorted).abc(sorted));
    }

    public static writeout write(Integer[] temp) {
        return ((n) -> {
            String thend = "";
            for(Integer i : n) {
                thend += i + ", ";
            }
            return thend += "\n";
        });
    }
}

interface writeout {
    public String abc(Integer[] temp);
}