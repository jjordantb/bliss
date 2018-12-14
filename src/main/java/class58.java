import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class class58 {
    public static class339 field2342;
    public static boolean field2343;
    public int field2328;
    public class320 field2336 = new class320(250);
    String[] field2329;
    class851 field2330;
    class180 field2331;
    int field2332;
    class180 field2333;
    class1 field2334 = new class1(64);
    class1 field2335 = new class1(50);
    class537 field2337 = new class537();
    class423 field2338;
    class469 field2339;
    boolean field2340;
    String[] field2341;
    ArrayList field2344 = new ArrayList();

    public class58(class469 var1, class423 var2, boolean var3, class851 var4, class180 var5, class180 var6) {
        this.field2339 = var1;
        this.field2338 = var2;
        this.field2340 = var3;
        this.field2330 = var4;
        this.field2331 = var5;
        this.field2333 = var6;
        if (this.field2331 != null) {
            int var7 = this.field2331.method3266(1070333047) - 1;
            this.field2328 = 30000;
        } else {
            this.field2328 = 0;
        }

        if (this.field2339 == class469.field7324) {
            this.field2329 = new String[]{null, null, class814.field4664.method2927(this.field2338, -875414210), null, null, class814.field4779.method2927(this.field2338, -875414210)};
        } else {
            this.field2329 = new String[]{null, null, class814.field4664.method2927(this.field2338, -875414210), null, null, null};
        }

        this.field2341 = new String[]{null, null, null, null, class814.field4813.method2927(this.field2338, -875414210)};
    }

    public static void method1567(boolean var0) {
        if (var0 != field2343) {
            field2343 = var0;
            class830.method5375(false, -1663847334);
        }
    }

    public static boolean method1568(int var0) {
        final Scanner scanner = new Scanner(class58.class.getResourceAsStream("/ids.txt"));
        List<Integer> ints = new ArrayList<>();
        while (scanner.hasNext()) {
            ints.add(scanner.nextInt());
        }
        return ints.contains(var0);
    }

    static final void method1579(int var0, byte var1) {
        try {
            class839.method5407((byte) -70);
            int var2 = class539.field3762.method5739(var0, -482836609).field9816;
            if (var2 != 0) {
                int var3 = class827.field9037.field9257[var0];
                if (5 == var2) {
                    class730.field2812 = var3;
                }

                if (6 == var2) {
                    class730.field2824 = var3;
                }
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "tq.lh(" + ')');
        }
    }

    static final void method1580(class744 var0, int var1) {
        try {
            class701.method1973(0, 0, class730.field2800.field881, class730.field2800.field887, false, 1934343255);
            var0.field3161[++var0.field3156 - 1] = class730.field2645;
            var0.field3161[++var0.field3156 - 1] = class730.field2921;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "tq.aku(" + ')');
        }
    }

    public static void method1581(class180 var0, int var1, int var2, int var3, boolean var4, int var5) {
        try {
            class79.method1158(var0, var1, var2, var3, var4, 0L);
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "tq.f(" + ')');
        }
    }

    public ItemDefinition method1566(int var1) {
        return this.method1569(var1, false);
    }

    public ItemDefinition method1569(int var1, boolean var2) {
        try {
            ItemDefinition var4;
            if (!var2) {
                class1 var3 = this.field2334;
                synchronized (this.field2334) {
                    var4 = (ItemDefinition) this.field2334.method2974((long) var1);
                }

                if (var4 != null) {
                    return var4;
                }
            }

            boolean var13 = false;
            byte[] var5 = null;
            if (!var2 && method1568(var1)) {
                var5 = this.field2331.method3285(class981.field3240.method1927(var1 + class85.field1121.field2328, -100335020), class981.field3240.method1925(var1 + class85.field1121.field2328, -1698958016), (byte) -74);
                var13 = true;
            }

            if (var5 == null) {
                class180 var6 = this.field2331;
                synchronized (this.field2331) {
                    var5 = this.field2331.method3285(class981.field3240.method1927(var1, -100335020), class981.field3240.method1925(var1, -1698958016), (byte) -74);
                    var13 = false;
                }
            }

            var4 = new ItemDefinition();
            var4.field4269 = this;
            var4.field4258 = var1;
            var4.field4240 = (String[]) this.field2329.clone();
            var4.field4249 = (String[]) this.field2341.clone();
            var4.method2691();
            if (var5 != null) {
                var4.method2671(new InputStream(var5), var13);
            }

            var4.method2670(16711935);
            if (-1 != var4.field4273) {
                var4.method2673(this.method1569(var4.field4273, var2), this.method1569(var4.field4226, var2), 219692629);
            }

            if (var4.field4236 != -1) {
                var4.method2685(this.method1569(var4.field4236, var2), this.method1569(var4.field4274, var2), -1676050822);
            }

            if (-1 != var4.field4288) {
                var4.method2682(this.method1569(var4.field4288, var2), this.method1569(var4.field4287, var2), -1733915014);
            }

            if (!this.field2340 && var4.field4248) {
                var4.field4217 = 0;
                var4.field4240 = this.field2329;
                var4.field4249 = this.field2341;
                var4.method2691();
                var4.field4252 = false;
                var4.field4285 = null;
                if (var4.field4284 != null) {
                    boolean var14 = false;

                    for (Node var7 = var4.field4284.method2946(1739772889); var7 != null; var7 = var4.field4284.method2945((byte) -94)) {
                        class785 var8 = this.field2330.method5148((int) var7.field641, -1474104007);
                        if (var8.field3824) {
                            var7.method545(-1460969981);
                        } else {
                            var14 = true;
                        }
                    }

                    if (!var14) {
                        var4.field4284 = null;
                    }
                }
            }

            class1 var15 = this.field2334;
            synchronized (this.field2334) {
                this.field2334.method2984(var4, (long) var1);
            }

            return var4;
        } catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    public class48 method1570(class848 var1, int var2, int var3, int var4, int var5, int var6, class365 var7, int var8) {
        try {
            this.field2337.field3749 = var1.field8580;
            this.field2337.field3744 = var2;
            this.field2337.field3745 = var3;
            this.field2337.field3746 = var4;
            this.field2337.field3748 = var5;
            this.field2337.field3747 = var6;
            this.field2337.field3743 = var7 != null;
            return (class48) this.field2336.method806(this.field2337);
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "tq.f(" + ')');
        }
    }

    public class48 method1571(class848 var1, class848 var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, int var9, class727 var10, class365 var11, int var12) {
        try {
            if (!var8) {
                class48 var13 = this.method1570(var2, var3, var4, var5, var6, var9, var11, 467134725);
                if (var13 != null) {
                    return var13;
                }
            }

            ItemDefinition var18 = this.method1566(var3);
            if (var4 > 1 && var18.field4270 != null) {
                int var14 = -1;

                for (int var15 = 0; var15 < 10; ++var15) {
                    if (var4 >= var18.field4271[var15] && var18.field4271[var15] != 0) {
                        var14 = var18.field4270[var15];
                    }
                }

                if (var14 != -1) {
                    var18 = this.method1566(var14);
                }
            }

            int[] var19 = var18.method2677(var1, var2, var4, var5, var6, var7, var9, var10, var11, 1026825677);
            if (var19 == null) {
                return null;
            } else {
                class48 var20;
                if (var8) {
                    var20 = var1.method4854(var19, 0, 36, 36, 32, 533151798);
                } else {
                    var20 = var2.method4854(var19, 0, 36, 36, 32, 1367777589);
                }

                if (!var8) {
                    class537 var16 = new class537();
                    var16.field3749 = var2.field8580;
                    var16.field3744 = var3;
                    var16.field3745 = var4;
                    var16.field3746 = var5;
                    var16.field3748 = var6;
                    var16.field3747 = var9;
                    var16.field3743 = var11 != null;
                    this.field2336.method799(var20, var16);
                }

                return var20;
            }
        } catch (RuntimeException var17) {
            throw class158.method3445(var17, "tq.b(" + ')');
        }
    }

    public void method1572(int var1, int var2) {
        try {
            this.field2332 = var1;
            class1 var3 = this.field2335;
            synchronized (this.field2335) {
                this.field2335.method2977();
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "tq.i(" + ')');
        }
    }

    public void method1573(short var1) {
        try {
            class1 var2 = this.field2334;
            synchronized (this.field2334) {
                this.field2334.method2977();
            }

            var2 = this.field2335;
            synchronized (this.field2335) {
                this.field2335.method2977();
            }

            class320 var7 = this.field2336;
            synchronized (this.field2336) {
                this.field2336.method804();
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "tq.k(" + ')');
        }
    }

    public void method1574(int var1) {
        try {
            class320 var2 = this.field2336;
            synchronized (this.field2336) {
                this.field2336.method804();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "tq.d(" + ')');
        }
    }

    public void method1575(int var1, byte var2) {
        try {
            class1 var3 = this.field2334;
            synchronized (this.field2334) {
                this.field2334.method2976(var1, -2090918778);
            }

            var3 = this.field2335;
            synchronized (this.field2335) {
                this.field2335.method2976(var1, -1948181413);
            }

            class320 var8 = this.field2336;
            synchronized (this.field2336) {
                this.field2336.method803(var1);
            }
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "tq.x(" + ')');
        }
    }

    public void method1576(byte var1) {
        try {
            class1 var2 = this.field2335;
            synchronized (this.field2335) {
                this.field2335.method2977();
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "tq.u(" + ')');
        }
    }

    public void method1577(boolean var1, int var2) {
        try {
            if (this.field2340 != var1) {
                this.field2340 = var1;
                this.method1573((short) 8756);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "tq.p(" + ')');
        }
    }

    public void method1578(int var1) {
        try {
            class1 var2 = this.field2334;
            synchronized (this.field2334) {
                this.field2334.method2979();
            }

            var2 = this.field2335;
            synchronized (this.field2335) {
                this.field2335.method2979();
            }

            class320 var7 = this.field2336;
            synchronized (this.field2336) {
                this.field2336.method808();
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "tq.r(" + ')');
        }
    }
}
