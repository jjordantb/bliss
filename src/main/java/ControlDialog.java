import javax.swing.*;
import java.awt.*;

public class ControlDialog extends JDialog {

    private final BotController botController = new BotController();

    public ControlDialog(Frame owner) {
        super(owner);
        super.setTitle("BlissScape Control");
        super.setSize(200, 300);
        super.setLocationRelativeTo(owner);

        final JButton toggleRunning = new JButton("NOT RUNNING");
        toggleRunning.addActionListener(e -> {
            if (botController.getActiveBot() == null) {
                this.botController.startBot(new CoalMining());
                toggleRunning.setText("RUNNING");
            } else {
                this.botController.stopBot();
                toggleRunning.setText("NOT RUNNING");
            }
        });

//        final JButton doIt = new JButton("Open Bank!");
//        doIt.addActionListener(e -> {
//            final MenuItem item = new MenuItem("<col=ffff00>Banker", "Bank", 41, 11, -1, 40, 0, 0, true, false, 40, false);
//            class916.processAction(item, 50, 50, (short) 12);
//        });
//
//        final JButton action = new JButton("Mine!");
//        action.addActionListener(e -> {
//            final MenuItem item = new MenuItem("<col=ffff>Mineral deposit", "Mine", 58, 3, -1, 25766587963574L, 54, 49, true, false, 1600526722, false);
//            class916.processAction(item, 50, 50, (short) 12);
//        });
//
//        final JButton bank = new JButton("Bank!");
//        bank.addActionListener(e -> {
//            final MenuItem item = new MenuItem("", "Deposit carried items", -1, 57, -1, 1, -1, 49938465, true, false, -1, false);
//            class916.processAction(item, 50, 50, (short) 12);
//        });

//        this.add(doIt, BorderLayout.NORTH);
        this.add(toggleRunning, BorderLayout.CENTER);
//        this.add(bank, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
