public class Inventory {

    static final int[] inventoryIds = new int[27];
    static final int[] inventoryStacks = new int[27];

    public static boolean isFull() {
        for (int i = 0; i < inventoryIds.length; i++) {
            if (inventoryIds[i] == -1) {
                return false;
            }
        }
        return true;
    }

}
