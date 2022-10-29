public class RadixSort {
    public static Integer[] sort(Integer[] unsorted, int position) {
        int[] numberoftimes = new int[10];
        int[] nextindex = new int[10];
        for (Integer integer : unsorted) {
            numberoftimes[(int) Math.floor((integer/Math.pow(10, position)) % 10)] += 1;
        }
        int ongoingstart = 0;
        for(int i =0; i < 10; ++i) {
            nextindex[i] = ongoingstart;
            ongoingstart += numberoftimes[i];
        }
        Integer[] finalarray = new Integer[unsorted.length];
        for (Integer integer : unsorted) {
            int idx = (int) Math.floor((integer/Math.pow(10, position)) % 10);
            int otheridx = nextindex[idx];
            finalarray[otheridx] = integer;
            nextindex[idx] += 1;
        }
        return finalarray;
    }
}
