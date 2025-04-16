package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActivitySelection {
    

    private static class Pair {
        Integer start;
        Integer end;

        public Pair(Integer a, Integer b) {
            this.start = a;
            end = b;
        }
    }



    public static void main(String args[]) {
        List<Integer>start = new ArrayList<>(Arrays.asList(1, 3, 0, 5, 8, 5));
        List<Integer>end = new ArrayList<>(Arrays.asList(2, 4, 6, 7, 9, 9));


        List<Pair>arr = new ArrayList<>();

        for(int i = 0 ; i<start.size() ; i++) {
            Pair newPr = new Pair(start.get(i), end.get(i));
            arr.add(newPr);
        }

        arr.sort(( Pair a, Pair b)->{
            return Integer.compare(a.end,b.end);
        });

        int count = 1;
        int ei = arr.get(0).end;

        for(int i = 1; i<arr.size() ; i++) {
            if(ei <= arr.get(i).start) {
                count++;
                ei = arr.get(i).end;
            }
        }

        System.out.println(count);

    }
}


