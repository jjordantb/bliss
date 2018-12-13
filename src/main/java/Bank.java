public class Bank {

    public static void depositAll() {
        final MenuItem item = new MenuItem("", "Deposit carried items", -1, 57, -1, 1, -1, 49938465, true, false, -1, false);
        class916.processAction(item, 50, 50, (short) 12);
    }

    public static boolean isOpen() {
        return Widgets.getWidget(762, 47) != null;
    }

}
