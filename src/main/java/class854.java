public class class854 extends class304 {
    String field8823;
    int field8824;
    int field8825;
    int field8826;

    class854(InputStream var1) {
        super(var1);
        this.field8825 = var1.method6374();
        this.field8823 = var1.method6379(-1733451894);
        this.field8824 = var1.method6420((byte) 92);
        this.field8826 = var1.method6374();
    }

    public static int method5150(int var0, boolean var1, byte var2) {
        try {
            if (var1) {
                return 0;
            } else {
                ItemNode var3 = class213.method3812(var0, var1, 547680225);
                if (var3 == null) {
                    return class540.field3930.method2319(var0, 211542342).field4579;
                } else {
                    int var4 = 0;

                    for (int var5 = 0; var5 < var3.itemIds.length; ++var5) {
                        if (-1 == var3.itemIds[var5]) {
                            ++var4;
                        }
                    }

                    var4 += class540.field3930.method2319(var0, 138660103).field4579 - var3.itemIds.length;
                    return var4;
                }
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "xj.i(" + ')');
        }
    }

    public static final int method5151(byte var0) {
        try {
            return (int) (1000000000L / class69.field1824);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "xj.l(" + ')');
        }
    }

    public void method2383(int var1) {
        try {
            class949.field3322[this.field8825].method6636(1923584032).method2558(this.field8823, this.field8824, 0, this.field8826, (byte) -32);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "xj.f(" + ')');
        }
    }
}
