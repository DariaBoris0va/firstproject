package borisova.generics;

public class T2 {
    public static void main(String[] args) {

    }
    public static final class Algorithm {
        public static <T extends Comparable<T>> T max(T x, T y) {
            return x.compareTo(y) > 0 ? x : y;
        }
    }
}
