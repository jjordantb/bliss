public class class61 {
    public static class61 field1587;
    public static class61 field1588;
    public static class61 field1589;
    public static class61 field1590;
    public static class61 field1591;
    public static class61 field1592;
    public static class61 field1601;
    static class61 field1586;
    static class61 field1593;
    static class61 field1594;
    static class61 field1597;
    static int field1599 = 16;
    static int field1600;
    static class61 field1604;

    static {
        field1601 = new class61(0, 0, 3, class482.field8403);
        field1587 = new class61(11, 1, 3, class482.field8403);
        field1588 = new class61(3, 2, 4, class482.field8399);
        field1592 = new class61(9, 3, 1, class482.field8403);
        field1590 = new class61(10, 4, 2, class482.field8403);
        field1591 = new class61(5, 5, 3, class482.field8403);
        field1589 = new class61(8, 6, 4, class482.field8403);
        field1593 = new class61(6, 7, 4, class482.field8403);
        field1604 = new class61(1, 8, 4, class482.field8403);
        field1586 = new class61(4, 9, 4, class482.field8403);
        field1594 = new class61(7, 10, 3, class482.field8403);
        field1597 = new class61(2, 11, 3, class482.field8403);
        field1600 = class949.method1955(16, 1046709218);
    }

    public int field1595;
    public int field1602;
    class482 field1596;
    int field1598;
    int field1603;

    class61(int var1, int var2, int var3, class482 var4) {
        this.field1595 = var1;
        this.field1598 = var2;
        this.field1603 = var3;
        this.field1596 = var4;
        this.field1602 = this.field1603 * this.field1596.field8406;
        if (this.field1598 >= 16) {
            throw new RuntimeException();
        }
    }

    static class61 method1224(int var0) {
        switch (var0) {
            case 0:
                return field1601;
            case 1:
                return field1587;
            case 2:
                return field1588;
            case 3:
                return field1592;
            case 4:
                return field1590;
            case 5:
                return field1591;
            case 6:
                return field1589;
            default:
                return null;
        }
    }
}
