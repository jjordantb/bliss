public class class555 extends class304 {
    int field472;
    int field473;

    class555(InputStream var1) {
        super(var1);
        this.field472 = var1.method6374() * 60133325;
        this.field473 = var1.method6420((byte) -19);
    }

    public static final int method412(ObjectDefinitionLoader var0, byte[] var1, int var2, int var3, int var4, int var5, byte var6) {
        try {
            int var7 = 0;
            InputStream var8 = new InputStream(var1);
            int var9 = -1;

            label66:
            do {
                label64:
                while (true) {
                    int var10 = var8.method6383((short) 255);
                    if (var10 == 0) {
                        return var7;
                    }

                    var9 += var10;
                    int var11 = 0;
                    boolean var12 = false;

                    while (true) {
                        int var13;
                        while (!var12) {
                            var13 = var8.method6382(1723054621);
                            if (var13 == 0) {
                                continue label64;
                            }

                            var11 += var13 - 1;
                            int var14 = var11 & 63;
                            int var15 = var11 >> 6 & 63;
                            int var16 = var8.method6371() >> 2;
                            int var17 = var2 + var15;
                            int var18 = var14 + var3;
                            if (var17 > 0 && var18 > 0 && var17 < var4 - 1 && var18 < var5 - 1) {
                                ObjectDefinition var19 = var0.getObjectDefinition(var9);
                                if (class15.field6918.field6921 != var16 || class615.field8903.field9113.method971(-1915667162) != 0 || var19.field2214 != 0 || var19.field2212 == 1 || var19.field2242) {
                                    if (!var19.method1482(-1755524122)) {
                                        ++var7;
                                    }

                                    var12 = true;
                                }
                            }
                        }

                        var13 = var8.method6382(1723054621);
                        if (var13 == 0) {
                            continue label66;
                        }

                        var8.method6371();
                    }
                }
            } while (var6 != 3);

            throw new IllegalStateException();
        } catch (RuntimeException var20) {
            throw class158.method3445(var20, "ya.ch(" + ')');
        }
    }

    public void method2383(int var1) {
        try {
            class730.field2709 = class730.field2866;
            class730.field2718 = class730.field2866 + this.field472 * -230034171;
            class152.field5415 = class730.field2662;
            class220.field7357 = class730.field2712;
            class601.field9204 = class730.field2713;
            class157.field6558 = class730.field2701;
            class730.field2662 = this.field473 >>> 24;
            class730.field2712 = this.field473 >>> 16 & 255;
            class730.field2713 = this.field473 >>> 8 & 255;
            class730.field2701 = this.field473 & 255;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ya.f(" + ')');
        }
    }
}
