public class class77 implements class331 {
    public static class77 field1507 = new class77(2, 4);
    static class77 field1506 = new class77(3, 1);
    static class77 field1508 = new class77(4, 7);
    static class77 field1509 = new class77(0, 3);
    static class77 field1511 = new class77(5, 5);
    static class77 field1512 = new class77(1, 6);
    static class77 field1513 = new class77(7, 0);
    static class77 field1514 = new class77(6, 2);
    static class48 field1516;
    public int field1510;
    int field1515;

    class77(int var1, int var2) {
        this.field1510 = var1;
        this.field1515 = var2;
    }

    static final void method1134(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -68);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            class779.method2324(var3, var4, var0, 783841228);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "lj.fg(" + ')');
        }
    }

    static final void method1135(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class499.method4475(var3, var4, var0, -1683091614);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "lj.nk(" + ')');
        }
    }

    public class77 method1133(byte var1) {
        try {
            switch (this.field1510) {
                case 0:
                    return field1508;
                case 1:
                    return field1514;
                case 2:
                    return field1513;
                case 3:
                    return field1511;
                case 4:
                    return field1509;
                case 5:
                    return field1506;
                case 6:
                    return field1512;
                case 7:
                    return field1507;
                default:
                    throw new IllegalStateException();
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lj.b(" + ')');
        }
    }

    public int method89(int var1) {
        try {
            return this.field1515;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lj.f(" + ')');
        }
    }
}
