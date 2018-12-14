public class class421 {
    static int field9654;
    static int field9655;
    static int field9656;
    static int[] field9657;
    static int field9658;
    static int field9659;
    static int field9660;
    static int field9661;

    class421() throws Throwable {
        throw new Error();
    }

    public static void method5752(class848 var0, int[] var1, int var2) {
        method5754(var0, var1, 0, var1.length, var2, (int[]) null, (int[]) null);
    }

    public static void method5753(class848 var0, int[] var1, int var2, int[] var3, int[] var4) {
        method5754(var0, var1, 0, var1.length, var2, var3, var4);
    }

    static void method5754(class848 var0, int[] var1, int var2, int var3, int var4, int[] var5, int[] var6) {
        int[] var7 = new int[4];
        var0.method4830(var7);
        if (var5 != null && var7[3] - var7[1] != var5.length) {
            throw new IllegalStateException();
        } else {
            method5759();
            method5755(var1, var2, var3);
            method5756(var7[1]);

            while (true) {
                int var8;
                int var9;
                int var10;
                do {
                    if (!method5757(var7[3])) {
                        return;
                    }

                    var8 = field9655;
                    var9 = field9656;
                    var10 = field9658;
                    if (var5 == null) {
                        break;
                    }

                    int var11 = var10 - var7[1];
                    if (var8 < var5[var11] + var7[0]) {
                        var8 = var5[var11] + var7[0];
                    }

                    if (var9 > var5[var11] + var6[var11] + var7[0]) {
                        var9 = var5[var11] + var6[var11] + var7[0];
                    }
                } while (var9 - var8 <= 0);

                var0.method4839(var8, var10, var9 - var8, var4, 1);
            }
        }
    }

    static void method5755(int[] var0, int var1, int var2) {
        int var3 = field9654 + (var2 << 1);
        int var5;
        if (field9657 == null || field9657.length < var3) {
            int[] var4 = new int[var3];

            for (var5 = 0; var5 < field9654; ++var5) {
                var4[var5] = field9657[var5];
            }

            field9657 = var4;
        }

        var2 += var1;
        int var8 = var2 - 2;

        for (var5 = var1; var5 < var2; var5 += 2) {
            int var6 = var0[var8 + 1];
            int var7 = var0[var5 + 1];
            if (var6 < var7) {
                field9657[field9654++] = var0[var8];
                field9657[field9654++] = var6;
                field9657[field9654++] = var0[var5];
                field9657[field9654++] = var7;
            } else if (var7 < var6) {
                field9657[field9654++] = var0[var5];
                field9657[field9654++] = var7;
                field9657[field9654++] = var0[var8];
                field9657[field9654++] = var6;
            }

            var8 = var5;
        }

    }

    static void method5756(int var0) {
        if (field9654 < 0) {
            field9661 = 0;
            field9660 = 0;
            field9659 = 0;
            field9658 = 2147483646;
        } else {
            method5758(0, field9654);
            int var1 = field9657[1];
            if (var1 < var0) {
                var1 = var0;
            }

            byte var2 = 0;

            int var3;
            for (var3 = 0; var3 < field9654; var3 += 4) {
                int var4 = field9657[var3 + 1];
                if (var1 < var4) {
                    break;
                }

                int var5 = field9657[var3];
                int var6 = field9657[var3 + 2];
                int var7 = field9657[var3 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + '耀';
                field9657[var3] = var9 + (var1 - var4) * var8;
                field9657[var3 + 2] = var8;
            }

            field9659 = var2;
            field9660 = var3;
            field9661 = var3;
            field9658 = var1 - 1;
        }

    }

    static boolean method5757(int var0) {
        int var1 = field9660;
        int var2 = field9661;

        int var4;
        for (int var3 = field9658; var2 >= var1; var2 = var4) {
            ++var3;
            field9658 = var3;
            if (var3 >= var0) {
                return false;
            }

            int var5;
            int var6;
            for (var4 = field9659; var1 < field9654; var1 += 4) {
                var5 = field9657[var1 + 1];
                if (var3 < var5) {
                    break;
                }

                var6 = field9657[var1];
                int var7 = field9657[var1 + 2];
                int var8 = field9657[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + '耀';
                field9657[var1] = var10;
                field9657[var1 + 2] = var9;
            }

            for (var5 = var4; var5 < var1; var5 += 4) {
                var6 = field9657[var5 + 3];
                if (var3 >= var6) {
                    field9657[var5] = field9657[var4];
                    field9657[var5 + 1] = field9657[var4 + 1];
                    field9657[var5 + 2] = field9657[var4 + 2];
                    field9657[var5 + 3] = field9657[var4 + 3];
                    var4 += 4;
                }
            }

            if (var4 == field9654) {
                field9654 = 0;
                return false;
            }

            method5760(var4, var1);
            field9659 = var4;
            field9660 = var1;
        }

        field9655 = field9657[var2] >> 16;
        field9656 = field9657[var2 + 4] >> 16;
        field9657[var2] += field9657[var2 + 2];
        field9657[var2 + 4] += field9657[var2 + 6];
        var2 += 8;
        field9661 = var2;
        return true;
    }

    static void method5758(int var0, int var1) {
        if (var1 > var0 + 4) {
            int var2 = var0;
            int var3 = field9657[var0];
            int var4 = field9657[var0 + 1];
            int var5 = field9657[var0 + 2];
            int var6 = field9657[var0 + 3];

            for (int var7 = var0 + 4; var7 < var1; var7 += 4) {
                int var8 = field9657[var7 + 1];
                if (var8 < var4) {
                    field9657[var2] = field9657[var7];
                    field9657[var2 + 1] = var8;
                    field9657[var2 + 2] = field9657[var7 + 2];
                    field9657[var2 + 3] = field9657[var7 + 3];
                    var2 += 4;
                    field9657[var7] = field9657[var2];
                    field9657[var7 + 1] = field9657[var2 + 1];
                    field9657[var7 + 2] = field9657[var2 + 2];
                    field9657[var7 + 3] = field9657[var2 + 3];
                }
            }

            field9657[var2] = var3;
            field9657[var2 + 1] = var4;
            field9657[var2 + 2] = var5;
            field9657[var2 + 3] = var6;
            method5758(var0, var2);
            method5758(var2 + 4, var1);
        }

    }

    static void method5759() {
        field9654 = 0;
    }

    static void method5760(int var0, int var1) {
        while (true) {
            if (var1 >= var0 + 8) {
                boolean var2 = true;

                for (int var3 = var0 + 4; var3 < var1; var3 += 4) {
                    int var4 = field9657[var3 - 4];
                    int var5 = field9657[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field9657[var3 - 4] = var5;
                        field9657[var3] = var4;
                        var4 = field9657[var3 - 2];
                        field9657[var3 - 2] = field9657[var3 + 2];
                        field9657[var3 + 2] = var4;
                        var4 = field9657[var3 - 1];
                        field9657[var3 - 1] = field9657[var3 + 3];
                        field9657[var3 + 3] = var4;
                    }
                }

                if (!var2) {
                    var1 -= 4;
                    continue;
                }
            }

            return;
        }
    }
}
