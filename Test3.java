public class Test3 extends Thread {

    @Override
    public void run() {
        for (int k = 1; k <= 500; k++) {
            System.out.println("FROM THREAD: " + k);
        }
    }

    public static void main(String[] args) {

        Test3 tcp = new Test3();

        tcp.start();

        System.out.println(" MAIN *****");
        System.out.println(" Done yet *****");
        System.out.println(" OK *****");
    }
}