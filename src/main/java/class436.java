public class class436 extends class298 {
    int field7442;
    int field7443;
    int field7444;
    int field7445;
    int field7446;
    int field7447;
    int field7448;
    int field7449;
    int field7450;
    int field7451;
    boolean field7452;
    int field7453;
    int field7454;
    int field7455;
    int field7456;

    class436(class656 var1, int var2, int var3, int var4) {
        super.field10520 = var1;
        this.field7450 = var1.field9402;
        this.field7451 = var1.field9401;
        this.field7452 = var1.field9404;
        this.field7443 = var2;
        this.field7444 = var3;
        this.field7455 = var4;
        this.field7449 = 0;
        this.method4171();
    }

    static int method4169(int var0, int var1) {
        return var1 < 0 ? -var0 : (int) ((double) var0 * Math.sqrt((double) var1 * 1.220703125E-4D) + 0.5D);
    }

    static int method4182(int var0, int var1) {
        return var1 < 0 ? var0 : (int) ((double) var0 * Math.sqrt((double) (16384 - var1) * 1.220703125E-4D) + 0.5D);
    }

    static int method4186(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class436 var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = var3 + var8 - var2) > var7) {
            var6 = var7;
        }

        var9.field7447 += var9.field7445 * (var6 - var3);
        var9.field7448 += var9.field7456 * (var6 - var3);

        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }

        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }

        var9.field7442 = var4 >> 2;
        var9.field7449 = var2 << 8;
        return var3;
    }

    static int method4188(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class436 var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
            var5 = var6;
        }

        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
        }

        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
        }

        var8.field7449 = var2 << 8;
        return var3;
    }

    static int method4189(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class436 var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
            var7 = var8;
        }

        var4 <<= 1;
        var7 <<= 1;

        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        var10.field7449 = var3 << 8;
        return var4 >> 1;
    }

    static int method4190(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class436 var10, int var11, int var12) {
        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
            var7 = var8;
        }

        byte var13;
        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            var13 = var2[var1];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
            var7 = var8;
        }

        for (var1 = var12; var5 < var7; var4 += var11) {
            var13 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
        }

        var10.field7449 = var4;
        return var5;
    }

    static int method4191(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class436 var11, int var12, int var13) {
        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
            var8 = var9;
        }

        var5 <<= 1;

        byte var14;
        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
            var8 = var9;
        }

        var8 <<= 1;

        for (var1 = var13; var5 < var8; var4 += var12) {
            var14 = var2[var4 >> 8];
            var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        var11.field7449 = var4;
        return var5 >> 1;
    }

    static int method4192(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class436 var11, int var12, int var13) {
        if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var5 <<= 1;

        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var8 <<= 1;

        for (var1 = var13; var5 < var8; var4 += var12) {
            var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        var11.field7449 = var4;
        return var5 >> 1;
    }

    static int method4193(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class436 var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = var4 + var11 - var3) > var10) {
            var9 = var10;
        }

        var12.field7442 += var12.field7454 * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;

        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        var12.field7447 = var5 >> 2;
        var12.field7448 = var6 >> 2;
        var12.field7449 = var3 << 8;
        return var4 >> 1;
    }

    static int method4194(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class436 var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
            var6 = var7;
        }

        var9.field7447 += var9.field7445 * (var6 - var3);
        var9.field7448 += var9.field7456 * (var6 - var3);

        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }

        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }

        var9.field7442 = var4 >> 2;
        var9.field7449 = var2 << 8;
        return var3;
    }

    static int method4195(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class436 var11, int var12, int var13) {
        var11.field7447 -= var11.field7445 * var5;
        var11.field7448 -= var11.field7456 * var5;
        if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var0 = var13;

        for (var1 = var12; var5 < var8; var4 += var1) {
            var10001 = var5++;
            var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
        }

        var11.field7447 += var11.field7445 * var5;
        var11.field7448 += var11.field7456 * var5;
        var11.field7442 = var6;
        var11.field7449 = var4;
        return var5;
    }

    static int method4196(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class436 var13, int var14, int var15) {
        var13.field7442 -= var13.field7454 * var5;
        if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
            var10 = var11;
        }

        var5 <<= 1;

        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            byte var16 = var2[var1 - 1];
            var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
            var10 = var11;
        }

        var10 <<= 1;

        for (var1 = var15; var5 < var10; var4 += var14) {
            var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        var5 >>= 1;
        var13.field7442 += var13.field7454 * var5;
        var13.field7447 = var6;
        var13.field7448 = var7;
        var13.field7449 = var4;
        return var5;
    }

    static int method4198(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class436 var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = var3 + var7 - var2) > var6) {
            var5 = var6;
        }

        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
        }

        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
        }

        var8.field7449 = var2 << 8;
        return var3;
    }

    static int method4199(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class436 var13, int var14, int var15) {
        var13.field7442 -= var13.field7454 * var5;
        if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
            var10 = var11;
        }

        var5 <<= 1;

        byte var16;
        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            var16 = var2[var1];
            var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
            var10 = var11;
        }

        var10 <<= 1;

        for (var1 = var15; var5 < var10; var4 += var14) {
            var16 = var2[var4 >> 8];
            var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        var5 >>= 1;
        var13.field7442 += var13.field7454 * var5;
        var13.field7447 = var6;
        var13.field7448 = var7;
        var13.field7449 = var4;
        return var5;
    }

    static int method4203(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class436 var11, int var12, int var13) {
        var11.field7447 -= var11.field7445 * var5;
        var11.field7448 -= var11.field7456 * var5;
        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
            var8 = var9;
        }

        byte var14;
        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
            var8 = var9;
        }

        for (var1 = var13; var5 < var8; var4 += var12) {
            var14 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
        }

        var11.field7447 += var11.field7445 * var5;
        var11.field7448 += var11.field7456 * var5;
        var11.field7442 = var6;
        var11.field7449 = var4;
        return var5;
    }

    static int method4205(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class436 var10, int var11, int var12) {
        if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
            var7 = var8;
        }

        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            byte var13 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
            var7 = var8;
        }

        var0 = var12;

        for (var1 = var11; var5 < var7; var4 += var1) {
            var10001 = var5++;
            var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
        }

        var10.field7449 = var4;
        return var5;
    }

    public static class436 method4208(class656 var0, int var1, int var2, int var3) {
        return var0.field9400 != null && var0.field9400.length != 0 ? new class436(var0, var1, var2, var3) : null;
    }

    static int method4209(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class436 var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = var4 + var9 - var3) > var8) {
            var7 = var8;
        }

        var4 <<= 1;
        var7 <<= 1;

        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        var10.field7449 = var3 << 8;
        return var4 >> 1;
    }

    static int method4210(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class436 var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
            var9 = var10;
        }

        var12.field7442 += var12.field7454 * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;

        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        var12.field7447 = var5 >> 2;
        var12.field7448 = var6 >> 2;
        var12.field7449 = var3 << 8;
        return var4 >> 1;
    }

    public synchronized void method4170(int var1) {
        this.method4176(this.method4200(), var1);
    }

    int method6549() {
        int var1 = this.field7442 * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field7446 == 0) {
            var1 -= var1 * this.field7449 / (((class656) super.field10520).field9400.length << 8);
        } else if (this.field7446 >= 0) {
            var1 -= var1 * this.field7450 / ((class656) super.field10520).field9400.length;
        }

        return var1 > 255 ? 255 : var1;
    }

    void method4171() {
        this.field7442 = this.field7444;
        this.field7447 = method4182(this.field7444, this.field7455);
        this.field7448 = method4169(this.field7444, this.field7455);
    }

    public synchronized void method4172(int var1) {
        this.field7446 = var1;
    }

    public synchronized void method4173(int var1) {
        this.method4176(var1 << 6, this.method4177());
    }

    public synchronized void method4174(int var1) {
        if (var1 == 0) {
            this.method4187(0);
            this.method545(-1460969981);
        } else if (this.field7447 == 0 && this.field7448 == 0) {
            this.field7453 = 0;
            this.field7444 = 0;
            this.field7442 = 0;
            this.method545(-1460969981);
        } else {
            int var2 = -this.field7442;
            if (this.field7442 > var2) {
                var2 = this.field7442;
            }

            if (-this.field7447 > var2) {
                var2 = -this.field7447;
            }

            if (this.field7447 > var2) {
                var2 = this.field7447;
            }

            if (-this.field7448 > var2) {
                var2 = -this.field7448;
            }

            if (this.field7448 > var2) {
                var2 = this.field7448;
            }

            if (var1 > var2) {
                var1 = var2;
            }

            this.field7453 = var1;
            this.field7444 = Integer.MIN_VALUE;
            this.field7454 = -this.field7442 / var1;
            this.field7445 = -this.field7447 / var1;
            this.field7456 = -this.field7448 / var1;
        }

    }

    synchronized void method4176(int var1, int var2) {
        this.field7444 = var1;
        this.field7455 = var2;
        this.field7453 = 0;
        this.method4171();
    }

    public synchronized int method4177() {
        return this.field7455 < 0 ? -1 : this.field7455;
    }

    public synchronized void method4178(int var1) {
        int var2 = ((class656) super.field10520).field9400.length << 8;
        if (var1 < -1) {
            var1 = -1;
        }

        if (var1 > var2) {
            var1 = var2;
        }

        this.field7449 = var1;
    }

    void method4179() {
        if (this.field7453 != 0) {
            if (this.field7444 == Integer.MIN_VALUE) {
                this.field7444 = 0;
            }

            this.field7453 = 0;
            this.method4171();
        }

    }

    public synchronized void method4180(int var1, int var2) {
        this.method4204(var1, var2, this.method4177());
    }

    public synchronized void method6534(int var1) {
        if (this.field7453 > 0) {
            if (var1 >= this.field7453) {
                if (this.field7444 == Integer.MIN_VALUE) {
                    this.field7444 = 0;
                    this.field7448 = 0;
                    this.field7447 = 0;
                    this.field7442 = 0;
                    this.method545(-1460969981);
                    var1 = this.field7453;
                }

                this.field7453 = 0;
                this.method4171();
            } else {
                this.field7442 += this.field7454 * var1;
                this.field7447 += this.field7445 * var1;
                this.field7448 += this.field7456 * var1;
                this.field7453 -= var1;
            }
        }

        class656 var2 = (class656) super.field10520;
        int var3 = this.field7450 << 8;
        int var4 = this.field7451 << 8;
        int var5 = var2.field9400.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field7446 = 0;
        }

        if (this.field7449 < 0) {
            if (this.field7443 <= 0) {
                this.method4179();
                this.method545(-1460969981);
                return;
            }

            this.field7449 = 0;
        }

        if (this.field7449 >= var5) {
            if (this.field7443 >= 0) {
                this.method4179();
                this.method545(-1460969981);
                return;
            }

            this.field7449 = var5 - 1;
        }

        this.field7449 += this.field7443 * var1;
        if (this.field7446 < 0) {
            if (this.field7452) {
                if (this.field7443 < 0) {
                    if (this.field7449 >= var3) {
                        return;
                    }

                    this.field7449 = var3 + var3 - 1 - this.field7449;
                    this.field7443 = -this.field7443;
                }

                while (this.field7449 >= var4) {
                    this.field7449 = var4 + var4 - 1 - this.field7449;
                    this.field7443 = -this.field7443;
                    if (this.field7449 >= var3) {
                        break;
                    }

                    this.field7449 = var3 + var3 - 1 - this.field7449;
                    this.field7443 = -this.field7443;
                }
            } else if (this.field7443 < 0) {
                if (this.field7449 < var3) {
                    this.field7449 = var4 - 1 - (var4 - 1 - this.field7449) % var6;
                }
            } else if (this.field7449 >= var4) {
                this.field7449 = var3 + (this.field7449 - var3) % var6;
            }
        } else {
            if (this.field7446 > 0) {
                if (this.field7452) {
                    label120:
                    {
                        if (this.field7443 < 0) {
                            if (this.field7449 >= var3) {
                                return;
                            }

                            this.field7449 = var3 + var3 - 1 - this.field7449;
                            this.field7443 = -this.field7443;
                            if (--this.field7446 == 0) {
                                break label120;
                            }
                        }

                        do {
                            if (this.field7449 < var4) {
                                return;
                            }

                            this.field7449 = var4 + var4 - 1 - this.field7449;
                            this.field7443 = -this.field7443;
                            if (--this.field7446 == 0) {
                                break;
                            }

                            if (this.field7449 >= var3) {
                                return;
                            }

                            this.field7449 = var3 + var3 - 1 - this.field7449;
                            this.field7443 = -this.field7443;
                        } while (--this.field7446 != 0);
                    }
                } else {
                    int var7;
                    if (this.field7443 < 0) {
                        if (this.field7449 >= var3) {
                            return;
                        }

                        var7 = (var4 - 1 - this.field7449) / var6;
                        if (var7 < this.field7446) {
                            this.field7449 += var6 * var7;
                            this.field7446 -= var7;
                            return;
                        }

                        this.field7449 += var6 * this.field7446;
                        this.field7446 = 0;
                    } else {
                        if (this.field7449 < var4) {
                            return;
                        }

                        var7 = (this.field7449 - var3) / var6;
                        if (var7 < this.field7446) {
                            this.field7449 -= var6 * var7;
                            this.field7446 -= var7;
                            return;
                        }

                        this.field7449 -= var6 * this.field7446;
                        this.field7446 = 0;
                    }
                }
            }

            if (this.field7443 < 0) {
                if (this.field7449 < 0) {
                    this.field7449 = -1;
                    this.method4179();
                    this.method545(-1460969981);
                }
            } else if (this.field7449 >= var5) {
                this.field7449 = var5;
                this.method4179();
                this.method545(-1460969981);
            }
        }

    }

    public synchronized void method4181(int var1) {
        if (this.field7443 < 0) {
            this.field7443 = -var1;
        } else {
            this.field7443 = var1;
        }

    }

    public synchronized boolean method4183() {
        return this.field7449 < 0 || this.field7449 >= ((class656) super.field10520).field9400.length << 8;
    }

    public synchronized boolean method4184() {
        return this.field7453 != 0;
    }

    int method6528() {
        return this.field7444 == 0 && this.field7453 == 0 ? 0 : 1;
    }

    public synchronized void method6533(int[] var1, int var2, int var3) {
        if (this.field7444 == 0 && this.field7453 == 0) {
            this.method6534(var3);
        } else {
            class656 var4 = (class656) super.field10520;
            int var5 = this.field7450 << 8;
            int var6 = this.field7451 << 8;
            int var7 = var4.field9400.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field7446 = 0;
            }

            int var9 = var2;
            var3 += var2;
            if (this.field7449 < 0) {
                if (this.field7443 <= 0) {
                    this.method4179();
                    this.method545(-1460969981);
                    return;
                }

                this.field7449 = 0;
            }

            if (this.field7449 >= var7) {
                if (this.field7443 >= 0) {
                    this.method4179();
                    this.method545(-1460969981);
                    return;
                }

                this.field7449 = var7 - 1;
            }

            if (this.field7446 < 0) {
                if (this.field7452) {
                    if (this.field7443 < 0) {
                        var9 = this.method4206(var1, var2, var5, var3, var4.field9400[this.field7450]);
                        if (this.field7449 >= var5) {
                            return;
                        }

                        this.field7449 = var5 + var5 - 1 - this.field7449;
                        this.field7443 = -this.field7443;
                    }

                    while (true) {
                        var9 = this.method4185(var1, var9, var6, var3, var4.field9400[this.field7451 - 1]);
                        if (this.field7449 < var6) {
                            break;
                        }

                        this.field7449 = var6 + var6 - 1 - this.field7449;
                        this.field7443 = -this.field7443;
                        var9 = this.method4206(var1, var9, var5, var3, var4.field9400[this.field7450]);
                        if (this.field7449 >= var5) {
                            break;
                        }

                        this.field7449 = var5 + var5 - 1 - this.field7449;
                        this.field7443 = -this.field7443;
                    }
                } else if (this.field7443 < 0) {
                    while (true) {
                        var9 = this.method4206(var1, var9, var5, var3, var4.field9400[this.field7451 - 1]);
                        if (this.field7449 >= var5) {
                            break;
                        }

                        this.field7449 = var6 - 1 - (var6 - 1 - this.field7449) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method4185(var1, var9, var6, var3, var4.field9400[this.field7450]);
                        if (this.field7449 < var6) {
                            break;
                        }

                        this.field7449 = var5 + (this.field7449 - var5) % var8;
                    }
                }
            } else {
                if (this.field7446 > 0) {
                    if (this.field7452) {
                        label94:
                        {
                            if (this.field7443 < 0) {
                                var9 = this.method4206(var1, var2, var5, var3, var4.field9400[this.field7450]);
                                if (this.field7449 >= var5) {
                                    return;
                                }

                                this.field7449 = var5 + var5 - 1 - this.field7449;
                                this.field7443 = -this.field7443;
                                if (--this.field7446 == 0) {
                                    break label94;
                                }
                            }

                            do {
                                var9 = this.method4185(var1, var9, var6, var3, var4.field9400[this.field7451 - 1]);
                                if (this.field7449 < var6) {
                                    return;
                                }

                                this.field7449 = var6 + var6 - 1 - this.field7449;
                                this.field7443 = -this.field7443;
                                if (--this.field7446 == 0) {
                                    break;
                                }

                                var9 = this.method4206(var1, var9, var5, var3, var4.field9400[this.field7450]);
                                if (this.field7449 >= var5) {
                                    return;
                                }

                                this.field7449 = var5 + var5 - 1 - this.field7449;
                                this.field7443 = -this.field7443;
                            } while (--this.field7446 != 0);
                        }
                    } else {
                        int var10;
                        if (this.field7443 < 0) {
                            while (true) {
                                var9 = this.method4206(var1, var9, var5, var3, var4.field9400[this.field7451 - 1]);
                                if (this.field7449 >= var5) {
                                    return;
                                }

                                var10 = (var6 - 1 - this.field7449) / var8;
                                if (var10 >= this.field7446) {
                                    this.field7449 += var8 * this.field7446;
                                    this.field7446 = 0;
                                    break;
                                }

                                this.field7449 += var8 * var10;
                                this.field7446 -= var10;
                            }
                        } else {
                            while (true) {
                                var9 = this.method4185(var1, var9, var6, var3, var4.field9400[this.field7450]);
                                if (this.field7449 < var6) {
                                    return;
                                }

                                var10 = (this.field7449 - var5) / var8;
                                if (var10 >= this.field7446) {
                                    this.field7449 -= var8 * this.field7446;
                                    this.field7446 = 0;
                                    break;
                                }

                                this.field7449 -= var8 * var10;
                                this.field7446 -= var10;
                            }
                        }
                    }
                }

                if (this.field7443 < 0) {
                    this.method4206(var1, var9, 0, var3, 0);
                    if (this.field7449 < 0) {
                        this.field7449 = -1;
                        this.method4179();
                        this.method545(-1460969981);
                    }
                } else {
                    this.method4185(var1, var9, var7, var3, 0);
                    if (this.field7449 >= var7) {
                        this.field7449 = var7;
                        this.method4179();
                        this.method545(-1460969981);
                    }
                }
            }
        }

    }

    int method4185(int[] var1, int var2, int var3, int var4, int var5) {
        do {
            if (this.field7453 <= 0) {
                if (this.field7443 == 256 && (this.field7449 & 255) == 0) {
                    if (class752.field4167) {
                        return method4209(0, ((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7447, this.field7448, 0, var4, var3, this);
                    }

                    return method4198(((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7442, 0, var4, var3, this);
                }

                if (class752.field4167) {
                    return method4191(0, 0, ((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7447, this.field7448, 0, var4, var3, this, this.field7443, var5);
                }

                return method4190(0, 0, ((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7442, 0, var4, var3, this, this.field7443, var5);
            }

            int var6 = var2 + this.field7453;
            if (var6 > var4) {
                var6 = var4;
            }

            this.field7453 += var2;
            if (this.field7443 == 256 && (this.field7449 & 255) == 0) {
                if (class752.field4167) {
                    var2 = method4193(0, ((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7447, this.field7448, this.field7445, this.field7456, 0, var6, var3, this);
                } else {
                    var2 = method4186(((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7442, this.field7454, 0, var6, var3, this);
                }
            } else if (class752.field4167) {
                var2 = method4199(0, 0, ((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7447, this.field7448, this.field7445, this.field7456, 0, var6, var3, this, this.field7443, var5);
            } else {
                var2 = method4203(0, 0, ((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7442, this.field7454, 0, var6, var3, this, this.field7443, var5);
            }

            this.field7453 -= var2;
            if (this.field7453 != 0) {
                return var2;
            }
        } while (!this.method4202());

        return var4;
    }

    synchronized void method4187(int var1) {
        this.method4176(var1, this.method4177());
    }

    class298 method6529() {
        return null;
    }

    public synchronized int method4197() {
        return this.field7443 < 0 ? -this.field7443 : this.field7443;
    }

    public synchronized int method4200() {
        return this.field7444 == Integer.MIN_VALUE ? 0 : this.field7444;
    }

    boolean method4202() {
        int var1 = this.field7444;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method4182(var1, this.field7455);
            var2 = method4169(var1, this.field7455);
        }

        if (this.field7442 == var1 && this.field7447 == var3 && this.field7448 == var2) {
            if (this.field7444 == Integer.MIN_VALUE) {
                this.field7444 = 0;
                this.field7448 = 0;
                this.field7447 = 0;
                this.field7442 = 0;
                this.method545(-1460969981);
                return true;
            } else {
                this.method4171();
                return false;
            }
        } else {
            if (this.field7442 < var1) {
                this.field7454 = 1;
                this.field7453 = var1 - this.field7442;
            } else if (this.field7442 > var1) {
                this.field7454 = -1;
                this.field7453 = this.field7442 - var1;
            } else {
                this.field7454 = 0;
            }

            if (this.field7447 < var3) {
                this.field7445 = 1;
                if (this.field7453 == 0 || this.field7453 > var3 - this.field7447) {
                    this.field7453 = var3 - this.field7447;
                }
            } else if (this.field7447 > var3) {
                this.field7445 = -1;
                if (this.field7453 == 0 || this.field7453 > this.field7447 - var3) {
                    this.field7453 = this.field7447 - var3;
                }
            } else {
                this.field7445 = 0;
            }

            if (this.field7448 < var2) {
                this.field7456 = 1;
                if (this.field7453 == 0 || this.field7453 > var2 - this.field7448) {
                    this.field7453 = var2 - this.field7448;
                }
            } else if (this.field7448 > var2) {
                this.field7456 = -1;
                if (this.field7453 == 0 || this.field7453 > this.field7448 - var2) {
                    this.field7453 = this.field7448 - var2;
                }
            } else {
                this.field7456 = 0;
            }

            return false;
        }
    }

    public synchronized void method4204(int var1, int var2, int var3) {
        if (var1 == 0) {
            this.method4176(var2, var3);
        } else {
            int var4 = method4182(var2, var3);
            int var5 = method4169(var2, var3);
            if (this.field7447 == var4 && this.field7448 == var5) {
                this.field7453 = 0;
            } else {
                int var6 = var2 - this.field7442;
                if (this.field7442 - var2 > var6) {
                    var6 = this.field7442 - var2;
                }

                if (var4 - this.field7447 > var6) {
                    var6 = var4 - this.field7447;
                }

                if (this.field7447 - var4 > var6) {
                    var6 = this.field7447 - var4;
                }

                if (var5 - this.field7448 > var6) {
                    var6 = var5 - this.field7448;
                }

                if (this.field7448 - var5 > var6) {
                    var6 = this.field7448 - var5;
                }

                if (var1 > var6) {
                    var1 = var6;
                }

                this.field7453 = var1;
                this.field7444 = var2;
                this.field7455 = var3;
                this.field7454 = (var2 - this.field7442) / var1;
                this.field7445 = (var4 - this.field7447) / var1;
                this.field7456 = (var5 - this.field7448) / var1;
            }
        }

    }

    class298 method6530() {
        return null;
    }

    int method4206(int[] var1, int var2, int var3, int var4, int var5) {
        do {
            if (this.field7453 <= 0) {
                if (this.field7443 == -256 && (this.field7449 & 255) == 0) {
                    if (class752.field4167) {
                        return method4189(0, ((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7447, this.field7448, 0, var4, var3, this);
                    }

                    return method4188(((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7442, 0, var4, var3, this);
                }

                if (class752.field4167) {
                    return method4192(0, 0, ((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7447, this.field7448, 0, var4, var3, this, this.field7443, var5);
                }

                return method4205(0, 0, ((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7442, 0, var4, var3, this, this.field7443, var5);
            }

            int var6 = var2 + this.field7453;
            if (var6 > var4) {
                var6 = var4;
            }

            this.field7453 += var2;
            if (this.field7443 == -256 && (this.field7449 & 255) == 0) {
                if (class752.field4167) {
                    var2 = method4210(0, ((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7447, this.field7448, this.field7445, this.field7456, 0, var6, var3, this);
                } else {
                    var2 = method4194(((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7442, this.field7454, 0, var6, var3, this);
                }
            } else if (class752.field4167) {
                var2 = method4196(0, 0, ((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7447, this.field7448, this.field7445, this.field7456, 0, var6, var3, this, this.field7443, var5);
            } else {
                var2 = method4195(0, 0, ((class656) super.field10520).field9400, var1, this.field7449, var2, this.field7442, this.field7454, 0, var6, var3, this, this.field7443, var5);
            }

            this.field7453 -= var2;
            if (this.field7453 != 0) {
                return var2;
            }
        } while (!this.method4202());

        return var4;
    }

    public synchronized void method4207(boolean var1) {
        this.field7443 = (this.field7443 ^ this.field7443 >> 31) + (this.field7443 >>> 31);
        if (var1) {
            this.field7443 = -this.field7443;
        }

    }
}
