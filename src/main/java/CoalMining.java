import util.Execution;

public class CoalMining extends AbstractBot {

    private final Tile tile = new Tile(5503, 4435);

    @Override
    public void loop() {
        if (Inventory.isFull()) {
            if (Bank.isOpen()) {
                System.out.println("Depositing Inventory");
                final MenuItem item = new MenuItem("", "Deposit carried items", -1, 57, -1, 1, -1, 49938465, true, false, -1, false);
                class916.processAction(item, 50, 50, (short) 12);
                Execution.delayUntil(() -> !Inventory.isFull(), 5000);
            } else {
                System.out.println("Opening Bank");
                final MenuItem item = new MenuItem("<col=ffff00>Banker", "Bank", 41, 11, -1, 40, 0, 0, true, false, 40, false);
                class916.processAction(item, 50, 50, (short) 12);
                Execution.delayUntil(Bank::isOpen, 5000);
            }
        } else {
            final Player player;
            if ((player = Players.getLocal()) != null) {
                if (player.getLocation().distanceTo(tile) <= 15) {
                    if (player.getAnimationId() == -1) {
                        Execution.delay(1000);
                        if (player.getAnimationId() == -1) {
                            System.out.println("Mining Action");
                            final MenuItem item = new MenuItem("<col=ffff>Mineral deposit", "Mine", 58, 3, -1, 25766587963574L, 54, 49, true, false, 8380398, false);
                            class916.processAction(item, 50, 50, (short) 12);
                            Execution.delayUntil(() -> player.getAnimationId() != -1, 5000);
                        }
                    }
                } else {
                    System.out.println("OH NO TO FAR AWAY OH GOD WTF!");
                }
            }
        }
    }
    /*
    For delayUntil, make it boolean and return true if the condition was successful and false if it timed out
    Then we can do if (animation == -1 && !delayUntil(animation != -1, 1000)) and it looks cooler
     */

}
