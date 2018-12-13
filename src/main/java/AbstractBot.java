public abstract class AbstractBot {

    private boolean running = true;
    private boolean paused = false;

    public abstract void loop();

    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isRunning() {
        return running;
    }

    public boolean isPaused() {
        return paused;
    }

}
