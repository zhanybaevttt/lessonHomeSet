import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static <Interator> void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet1.add(0);
        hashSet1.add(1);
        hashSet1.add(2);



        System.out.println(hashSet);
        System.out.println(hashSet1);
        System.out.println(symmetricDifference(hashSet, hashSet1));

    }

    public static HashSet<Integer> symmetricDifference(HashSet<Integer> hashSet, HashSet<Integer> hashSet1) {
        HashSet<Integer> hashSet2 = new HashSet<>(hashSet);
        hashSet2.addAll(hashSet1);

        HashSet<Integer> hashSet3 = new HashSet<>(hashSet1);
        hashSet3.retainAll(hashSet);

        hashSet2.removeAll(hashSet3);
        return hashSet2;

    }
}
