public class RadixSort {
    public static Integer[] sort(Integer[] unsorted, int position) {
        int[] numberoftimes = new int[10];
        int[] nextindex = new int[10];
        for (Integer integer : unsorted) {
            numberoftimes[(int) (integer / (Math.pow(10, position)))] += 1;
        }
        int ongoingstart = 0;
        for(int i =0; i < 10; ++i) {
            nextindex[i] = ongoingstart;
            ongoingstart += numberoftimes[i];
        }
        int idx;
        Integer[] finalarray = new Integer[unsorted.length];
        for(int i = 0; i < unsorted.length; ++i) {
            idx = (int) (unsorted[i]/(Math.pow(10,position)));
            int otheridx = nextindex[idx];
            finalarray[otheridx] = unsorted[i];
            nextindex[idx] += 1;
        }
        return finalarray;
    }
}
