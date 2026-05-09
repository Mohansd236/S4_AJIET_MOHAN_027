public class CandyJar {
    public static void main(String[] args) {
        int N = 10, K = 5, M = N;
        int[] orders = {3, 4, 5, 2, 11, 1};
        for (int order : orders) {
            if (order > M) {
                System.out.println("INVALID INPUT");
            } else {
                M -= order;
                System.out.println("Sold: " + order + ", Left: " + M);
                if (M <= K) {
                M = N; 
                System.out.println("Jar refilled to " + M);}
            }
        }
    }
}
