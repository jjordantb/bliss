public class class383 extends class535 {
    public static int field1434 = 0;
    static int field1435 = 2;

    public class383(int var1, class838 var2) {
        super(var1, var2);
    }

    public class383(class838 var1) {
        super(var1);
    }

    static void method1099(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        try {
            int var8 = 0;
            int var9 = var3;
            int var10 = 0;
            int var11 = var2 - var6;
            int var12 = var3 - var6;
            int var13 = var2 * var2;
            int var14 = var3 * var3;
            int var15 = var11 * var11;
            int var16 = var12 * var12;
            int var17 = var14 << 1;
            int var18 = var13 << 1;
            int var19 = var16 << 1;
            int var20 = var15 << 1;
            int var21 = var3 << 1;
            int var22 = var12 << 1;
            int var23 = (1 - var21) * var13 + var17;
            int var24 = var14 - var18 * (var21 - 1);
            int var25 = var19 + var15 * (1 - var22);
            int var26 = var16 - (var22 - 1) * var20;
            int var27 = var13 << 2;
            int var28 = var14 << 2;
            int var29 = var15 << 2;
            int var30 = var16 << 2;
            int var31 = 3 * var17;
            int var32 = var18 * (var21 - 3);
            int var33 = var19 * 3;
            int var34 = (var22 - 3) * var20;
            int var35 = var28;
            int var36 = var27 * (var3 - 1);
            int var37 = var30;
            int var38 = (var12 - 1) * var29;
            int var40;
            int var41;
            int var42;
            int var43;
            if (var1 >= class381.field1414 && var1 <= class381.field1415) {
                int[] var39 = class381.field1412[var1];
                var40 = class972.method1776(var0 - var2, class381.field1416, class381.field1413, -1212608691);
                var41 = class972.method1776(var0 + var2, class381.field1416, class381.field1413, -1212608691);
                var42 = class972.method1776(var0 - var11, class381.field1416, class381.field1413, -1212608691);
                var43 = class972.method1776(var11 + var0, class381.field1416, class381.field1413, -1212608691);
                class484.method4769(var39, var40, var42, var5, 1844098272);
                class484.method4769(var39, var42, var43, var4, -739253867);
                class484.method4769(var39, var43, var41, var5, 133831113);
            }

            while (var9 > 0) {
                boolean var48 = var9 <= var12;
                if (var48) {
                    if (var25 < 0) {
                        while (var25 < 0) {
                            var25 += var33;
                            var26 += var37;
                            var33 += var30;
                            var37 += var30;
                            ++var10;
                        }
                    }

                    if (var26 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var37 += var30;
                        ++var10;
                    }

                    var25 += -var38;
                    var26 += -var34;
                    var34 -= var29;
                    var38 -= var29;
                }

                if (var23 < 0) {
                    while (var23 < 0) {
                        var23 += var31;
                        var24 += var35;
                        var31 += var28;
                        var35 += var28;
                        ++var8;
                    }
                }

                if (var24 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    ++var8;
                }

                var23 += -var36;
                var24 += -var32;
                var32 -= var27;
                var36 -= var27;
                --var9;
                var40 = var1 - var9;
                var41 = var9 + var1;
                if (var41 >= class381.field1414 && var40 <= class381.field1415) {
                    var42 = class972.method1776(var0 + var8, class381.field1416, class381.field1413, -1212608691);
                    var43 = class972.method1776(var0 - var8, class381.field1416, class381.field1413, -1212608691);
                    if (var48) {
                        int var44 = class972.method1776(var0 + var10, class381.field1416, class381.field1413, -1212608691);
                        int var45 = class972.method1776(var0 - var10, class381.field1416, class381.field1413, -1212608691);
                        int[] var46;
                        if (var40 >= class381.field1414) {
                            var46 = class381.field1412[var40];
                            class484.method4769(var46, var43, var45, var5, -1776826233);
                            class484.method4769(var46, var45, var44, var4, 651762139);
                            class484.method4769(var46, var44, var42, var5, 1941324857);
                        }

                        if (var41 <= class381.field1415) {
                            var46 = class381.field1412[var41];
                            class484.method4769(var46, var43, var45, var5, -1085147179);
                            class484.method4769(var46, var45, var44, var4, -2113781639);
                            class484.method4769(var46, var44, var42, var5, 154634107);
                        }
                    } else {
                        if (var40 >= class381.field1414) {
                            class484.method4769(class381.field1412[var40], var43, var42, var5, -1094701951);
                        }

                        if (var41 <= class381.field1415) {
                            class484.method4769(class381.field1412[var41], var43, var42, var5, 1089051807);
                        }
                    }
                }
            }

        } catch (RuntimeException var47) {
            throw class158.method3445(var47, "ado.av(" + ')');
        }
    }

    public void method1096(byte var1) {
        try {
            if (super.field3704.field9137.method3691(16711680) && !class510.method2624(super.field3704.field9137.method3689(-1298559578), 1142209695)) {
                super.field3708 = 0;
            }

            if (super.field3708 < 0 || super.field3708 > 2) {
                super.field3708 = this.method2272(-1016152227);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ado.s(" + ')');
        }
    }

    public boolean method1097(int var1) {
        try {
            return class510.method2624(super.field3704.field9137.method3689(-541516290), 718607573);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ado.z(" + ')');
        }
    }

    int method2272(int var1) {
        return 0;
    }

    void method2275(int var1, int var2) {
        try {
            super.field3708 = var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ado.p(" + ')');
        }
    }

    public int method1098(int var1) {
        try {
            return super.field3708;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ado.y(" + ')');
        }
    }

    public int method2273(int var1, int var2) {
        try {
            return !class510.method2624(super.field3704.field9137.method3689(-1771476690), -1583872086) ? 3 : 1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ado.f(" + ')');
        }
    }
}
