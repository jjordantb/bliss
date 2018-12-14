import java.util.LinkedList;

public class class954 {
    public int field3578 = 2048;
    public int field3579 = 0;
    public int field3580 = 2048;
    public int field3581 = 0;

    public static void method2090(class180 var0, int var1) {
        try {
            class198.field7041 = 0;
            class198.field7049 = 0;
            class198.field7046 = new LinkedList();
            class198.field7039 = new class737[1024];
            class198.field7042 = new class726[1 + class948.field3284[class198.field7038]];
            class198.field7043 = 0;
            class198.field7044 = 0;
            class143.method1176(var0, (byte) -107);
            class220.method4040(var0, 679109105);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ui.a(" + ')');
        }
    }

    static boolean method2091(int var0, byte var1) {
        try {
            return 44 == var0 || var0 == 45 || 46 == var0 || 47 == var0 || 48 == var0 || 49 == var0 || 50 == var0 || var0 == 51 || 52 == var0 || 53 == var0 || var0 == 15;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ui.bl(" + ')');
        }
    }

    public static char method2092(byte var0, int var1) {
        try {
            int var2 = var0 & 255;
            if (var2 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var2, 16));
            } else {
                if (var2 >= 128 && var2 < 160) {
                    char var3 = class519.field4212[var2 - 128];
                    if (var3 == 0) {
                        var3 = '?';
                    }

                    var2 = var3;
                }

                return (char) var2;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ui.p(" + ')');
        }
    }

    void method2088(InputStream var1, int var2) {
        try {
            while (true) {
                int var3 = var1.method6371();
                if (var3 == 0) {
                    return;
                }

                this.method2089(var1, var3, (byte) 112);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ui.a(" + ')');
        }
    }

    void method2089(InputStream var1, int var2, byte var3) {
        try {
            if (var2 == 1) {
                this.field3581 = var1.method6371();
            } else if (2 == var2) {
                this.field3580 = var1.method6374();
            } else if (3 == var2) {
                this.field3578 = var1.method6374();
            } else if (var2 == 4) {
                this.field3579 = var1.method6367(1649788845);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ui.f(" + ')');
        }
    }
}
