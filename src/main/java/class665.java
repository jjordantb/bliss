public class class665 extends class827 {
    public static InputStream field9597;
    static int field9598;
    static int field9599;
    public int field9595;
    public int field9596;

    class665(class971 var1, class49 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
        super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
        this.field9596 = var11;
        this.field9595 = var12;
    }

    static int method5714(int var0, int var1, int var2) {
        try {
            byte var3;
            if (var1 > 20074) {
                class115.method1276(774098447);
                var3 = 4;
            } else if (var1 > 10033) {
                class846.method5123((short) 24043);
                var3 = 3;
            } else if (var1 > 5030) {
                class671.method4234(-793746149);
                var3 = 2;
            } else {
                class874.method5851(true, -1704666042);
                var3 = 1;
            }

            if (class615.field8903.field9137.method3689(-1134958501) != var0) {
                class615.field8903.method5391(class615.field8903.field9136, var0, -1879623145);
                class337.method77(var0, false, 622850291);
            } else {
                class615.field8903.method5390(class615.field8903.field9137, true, -2138702215);
            }

            class95.method523(656179282);
            return var3;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "zp.k(" + ')');
        }
    }

    public static String method5715(int var0, boolean var1, byte var2) {
        try {
            return var1 && var0 >= 0 ? class321.method855(var0, 10, var1, 1472954804) : Integer.toString(var0);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "zp.u(" + ')');
        }
    }

    public class7 method6197(int var1) {
        try {
            return class7.field4909;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "zp.f(" + ')');
        }
    }
}
