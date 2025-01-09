package gf.code_practice;
public class VideoPlayer {
    public static void main(String[] args) {
        Thread videoThread = new Thread(() -> {
            for (int i = 0; i <= 30; i++) { // 30 frames per second
                System.out.println("Playing frame " + i);
                try {
                    Thread.sleep(1000 / 30); // pause for 1/30th second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        videoThread.start();
    }
}
