public class Test2 {
    public static void main(String[] args) {

        Thread th = new Thread() {
            @Override
            public void run() {
                for (int k = 700; k > 0; k--) {
                    System.out.println(k);
                }
            }
        };

        Thread th2 = new Thread() {
            @Override
            public void run() {
                for (int k = 100; k < 500; k++) {
                    System.out.println("TH2: " + k);
                }
            }
        };

        th.start();
        th2.start();
    }
}