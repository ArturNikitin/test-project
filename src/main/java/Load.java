public class Load {
    public void print() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
