public final class class603 {
    class603() throws Throwable {
        throw new Error();
    }

    static final void method5083(int var0) {
        try {
            class513 var1 = class730.field2692.field7768;
            var1.method2650(1157167964);
            int var2 = var1.method2647(8);
            int var3;
            if (var2 < class730.field2684) {
                for (var3 = var2; var3 < class730.field2684; ++var3) {
                    class730.field2690[++class730.field2689 - 1] = class730.field2680[var3];
                }
            }

            if (var2 > class730.field2684) {
                throw new RuntimeException();
            } else {
                class730.field2684 = 0;

                for (var3 = 0; var3 < var2; ++var3) {
                    int var4 = class730.field2680[var3];
                    Npc var5 = (Npc) ((class437) class730.field2677.method2942((long) var4)).field7515;
                    int var6 = var1.method2647(1);
                    if (var6 == 0) {
                        class730.field2680[++class730.field2684 - 1] = var4;
                        var5.field4039 = class730.field2688;
                    } else {
                        int var7 = var1.method2647(2);
                        if (var7 == 0) {
                            class730.field2680[++class730.field2684 - 1] = var4;
                            var5.field4039 = class730.field2688;
                            class730.field2687[++class730.field2789 - 1] = var4;
                        } else {
                            class77 var8;
                            if (1 == var7) {
                                class730.field2680[++class730.field2684 - 1] = var4;
                                var5.field4039 = class730.field2688;
                                var8 = (class77) class367.method1565(class669.method4119(-2130206915), var1.method2647(3), (byte) 2);
                                var5.method1239(var8, class647.field9228.field9230, (short) 32767);
                                int var9 = var1.method2647(1);
                                if (1 == var9) {
                                    class730.field2687[++class730.field2789 - 1] = var4;
                                }
                            } else if (var7 == 2) {
                                class730.field2680[++class730.field2684 - 1] = var4;
                                var5.field4039 = class730.field2688;
                                if (var1.method2647(1) == 1) {
                                    var8 = (class77) class367.method1565(class669.method4119(-2113999549), var1.method2647(3), (byte) 2);
                                    var5.method1239(var8, class647.field9229.field9230, (short) 32767);
                                    class77 var12 = (class77) class367.method1565(class669.method4119(-1890825389), var1.method2647(3), (byte) 2);
                                    var5.method1239(var12, class647.field9229.field9230, (short) 32767);
                                } else {
                                    var8 = (class77) class367.method1565(class669.method4119(-2012553016), var1.method2647(3), (byte) 2);
                                    var5.method1239(var8, class647.field9233.field9230, (short) 32767);
                                }

                                int var11 = var1.method2647(1);
                                if (1 == var11) {
                                    class730.field2687[++class730.field2789 - 1] = var4;
                                }
                            } else if (var7 == 3) {
                                class730.field2690[++class730.field2689 - 1] = var4;
                            }
                        }
                    }
                }

            }
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "tg.jn(" + ')');
        }
    }

    static final void method5084(class744 var0, int var1) {
        try {
            int var2 = var0.field3174[var0.field3176];
            class346 var3 = class82.method915(var2, (byte) 1);
            if (var3 == null) {
                throw new RuntimeException();
            } else {
                int[] var4 = new int[var3.field177];
                Object[] var5 = new Object[var3.field178];
                long[] var6 = new long[var3.field179];

                int var7;
                for (var7 = 0; var7 < var3.field180; ++var7) {
                    var4[var7] = var0.field3161[var0.field3156 - var3.field180 + var7];
                }

                for (var7 = 0; var7 < var3.field172; ++var7) {
                    var5[var7] = var0.field3157[var7 + (var0.field3158 - var3.field172)];
                }

                for (var7 = 0; var7 < var3.field182; ++var7) {
                    var6[var7] = var0.field3168[var7 + (var0.field3162 - var3.field182)];
                }

                var0.field3156 -= var3.field180;
                var0.field3158 -= var3.field172;
                var0.field3162 -= var3.field182;
                class596 var9 = new class596();
                var9.field2143 = var0.field3177;
                var9.field2140 = var0.field3176;
                var9.field2142 = var0.field3165;
                var9.field2145 = var0.field3151;
                var9.field2144 = var0.field3152;
                if (var0.field3167 >= var0.field3166.length) {
                    throw new RuntimeException();
                } else {
                    var0.field3166[++var0.field3167 - 1] = var9;
                    var0.field3177 = var3;
                    var0.field3175 = var0.field3177.field173;
                    var0.field3174 = var0.field3177.field174;
                    var0.field3176 = -1;
                    var0.field3165 = var4;
                    var0.field3151 = var5;
                    var0.field3152 = var6;
                }
            }
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "tg.ay(" + ')');
        }
    }
}
