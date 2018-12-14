import java.util.Calendar;

public class class378 extends class535 {
    public static int field1156 = 1;
    public static int field1157 = 0;
    public static class230 field1158;

    public class378(class838 var1) {
        super(var1);
    }

    public class378(int var1, class838 var2) {
        super(var1, var2);
    }

    static final void method972(class744 var0, int var1) {
        try {
            int var2 = class230.method4606(-1206667424);
            var0.field3161[++var0.field3156 - 1] = class182.field5317 = class615.field8903.field9137.method3689(-460463412);
            var0.field3161[++var0.field3156 - 1] = var2;
            class730.field2697.method5309(1422757720);
            class95.method523(656179282);
            class730.field2647 = false;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "adc.amy(" + ')');
        }
    }

    static String method973(long var0, int var2, boolean var3, byte var4) {
        try {
            Calendar var5;
            if (var3) {
                class540.method2465(var0);
                var5 = class308.field418;
            } else {
                class411.method5593(var0);
                var5 = class308.field416;
            }

            int var6 = var5.get(5);
            int var7 = var5.get(2) + 1;
            int var8 = var5.get(1);
            int var9 = var5.get(11);
            int var10 = var5.get(12);
            return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "adc.b(" + ')');
        }
    }

    public void method969(int var1) {
        try {
            if (super.field3704.method5392((byte) -7) != class469.field7324) {
                super.field3708 = 1;
            }

            if (super.field3708 != 0 && 1 != super.field3708) {
                super.field3708 = this.method2272(-993111338);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "adc.s(" + ')');
        }
    }

    public boolean method970(byte var1) {
        try {
            return super.field3704.method5392((byte) -10) == class469.field7324;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "adc.z(" + ')');
        }
    }

    public int method2273(int var1, int var2) {
        try {
            return super.field3704.method5392((byte) -75) == class469.field7324 ? 1 : 3;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "adc.f(" + ')');
        }
    }

    int method2272(int var1) {
        return 1;
    }

    public int method971(int var1) {
        try {
            return super.field3708;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "adc.y(" + ')');
        }
    }

    void method2275(int var1, int var2) {
        try {
            super.field3708 = var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "adc.p(" + ')');
        }
    }
}
