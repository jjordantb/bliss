public class class256 extends Node {
    public int field8100;
    public int field8101;

    public class256(int var1, int var2) {
        this.field8101 = var1;
        this.field8100 = var2;
    }

    static final void method4488(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) -86);
            if (var3.field953 == null) {
                var0.field3157[++var0.field3158 - 1] = "";
            } else {
                var0.field3157[++var0.field3158 - 1] = var3.field953;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acs.sw(" + ')');
        }
    }

    public static void method4489(byte var0) {
        try {
            class949.field3320 = class730.field2916;
            class673.field7509 = class730.field2917;
            class808.field4596 = class730.field2821;
            class559.field542 = class730.field2724;
            class949.field3330 = true;
            if (class949.field3329 != 0 && class949.field3328 != 0) {
                class730.field2821 = 334;
                class730.field2724 = 334;
                class730.field2917 = class730.field2916 = (short) (class949.field3329 * 512 / class949.field3328);
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "acs.p(" + ')');
        }
    }

    public static int[] method4490(int var0, int var1) {
        try {
            int[] var2 = new int[3];
            class411.method5593(class469.method4016(var0, 1691290576));
            var2[0] = class308.field416.get(5);
            var2[1] = class308.field416.get(2);
            var2[2] = class308.field416.get(1);
            return var2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acs.u(" + ')');
        }
    }

    public boolean method4487(int var1) {
        return true;
    }
}
