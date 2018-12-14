package util;

public class Execution {

    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void delayUntil(Condition condition, long timeOut) {
        long startTime = System.currentTimeMillis();
        while (!condition.validate() && (System.currentTimeMillis() - startTime < timeOut)) {
            Execution.delay(200);
        }
    }

}
