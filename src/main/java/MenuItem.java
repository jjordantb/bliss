public class MenuItem extends class345 {

    String name;
    int regionX;
    int idk;
    int field1700;
    long field1701;
    int opcode;
    int regionY;
    boolean field1704;
    boolean field1705;
    long field1706;
    String action;
    boolean field1708;
    String field1709;

    MenuItem(String name, String action, int idk, int op, int neg1, long uid, int regionX, int regionY, boolean var10, boolean var11, long var12, boolean var14) {
        this.name = action;
        this.action = name;
        this.idk = idk;
        this.opcode = op;
        this.field1700 = neg1;
        this.field1701 = uid;
        this.regionX = regionX;
        this.regionY = regionY;
        this.field1704 = var10;
        this.field1705 = var11;
        this.field1706 = var12;
        this.field1708 = var14;
    }

    public MenuItem(int op, int regionX, int regionY, long uid, int idk1, int idk2) {
        this("SUCK", "ADICK", idk1, op, -1, uid, regionX, regionY, true, false, idk2, false);
    }

    @Override
    public String toString() {
        return "MenuItem{\"" +
                this.name + "\", \"" +
                this.action + "\", " +
                this.idk + ", " +
                this.opcode + ", " +
                this.field1700 + ", " +
                this.field1701 + ", " +
                this.regionX + ", " +
                this.regionY + ", " +
                this.field1704 + ", " +
                this.field1705 + ", " +
                this.field1706 + ", " +
                this.field1708 +
                "}";
    }
}
