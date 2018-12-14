public class class7 {
    public static class7 field4907 = new class7(2);
    public static class7 field4908 = new class7(2);
    public static class7 field4909 = new class7(2);
    public static class7 field4910 = new class7(2);
    public static class7 field4911 = new class7(1);
    public static class7 field4912 = new class7(1);
    public static class7 field4913 = new class7(1);
    public static class7 field4914 = new class7(2);
    public static class7 field4915 = new class7(1);
    public static class7 field4916 = new class7(1);
    public static int field4918;
    static long field4919;
    public int field4917;

    class7(int var1) {
        this.field4917 = var1;
    }

    public static String method2939(byte[] var0, int var1) {
        try {
            return class783.method2497(var0, 0, var0.length, 323436921);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "fx.d(" + ')');
        }
    }

    static final boolean method2940(int[][] var0, int[][] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        try {
            for (int var8 = var3; var8 <= var5; ++var8) {
                for (int var9 = var4; var9 <= var6; ++var9) {
                    if (var0[var8][var9] == var2 && var1[var8][var9] <= 1) {
                        return true;
                    }
                }
            }

            return false;
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "fx.ip(" + ')');
        }
    }
}
