public class BotController {

    private AbstractBot activeBot = null;

    public void startBot(final AbstractBot bot) {
        if (this.activeBot != null) {
            this.activeBot.setRunning(false);
        }
        this.activeBot = bot;
        final Thread thread = new Thread(() -> {
            while (this.activeBot != null && this.activeBot.isRunning()) {
                if (this.activeBot.isPaused()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    continue;
                }
                this.activeBot.loop();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    public void stopBot() {
        if (this.activeBot != null) {
            this.activeBot.setRunning(false);
            this.activeBot = null;
        }
    }

    public AbstractBot getActiveBot() {
        return activeBot;
    }
}
