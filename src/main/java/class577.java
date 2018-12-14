public class class577 extends class347 {
    static int field55 = 0;
    static int field56 = 0;
    static int field60 = 0;
    int field54;
    int field57 = 0;
    int field58 = 0;
    int field59 = 0;
    int field61;
    int field62;
    int field63;
    int field64;
    int field65;

    public class577() {
        super(1, false);
    }

    int[][] method204(int var1, byte var2) {
        try {
            int[][] var3 = super.field266.method162(var1, (byte) 87);
            if (super.field266.field211) {
                int[][] var4 = this.method206(0, var1, (byte) 8);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];

                for (int var11 = 0; var11 < class322.field831; ++var11) {
                    this.method47(var5[var11], var6[var11], var7[var11], -128256883);
                    this.field62 += this.field57 * 1081228573;
                    this.field61 += this.field58 * -736197367;

                    for (this.field54 += this.field59 * -469731721; this.field62 < 0; this.field62 += 4096) {
                        ;
                    }

                    while (this.field62 > 4096) {
                        this.field62 -= 4096;
                    }

                    if (this.field61 < 0) {
                        this.field61 = 0;
                    }

                    if (this.field61 > 4096) {
                        this.field61 = 4096;
                    }

                    if (this.field54 < 0) {
                        this.field54 = 0;
                    }

                    if (this.field54 > 4096) {
                        this.field54 = 4096;
                    }

                    this.method44(this.field62, this.field61, this.field54, -1235292265);
                    var8[var11] = this.field63;
                    var9[var11] = this.field64;
                    var10[var11] = this.field65;
                }
            }

            return var3;
        } catch (RuntimeException var12) {
            throw class158.method3445(var12, "agg.k(" + ')');
        }
    }

    void method44(int var1, int var2, int var3, int var4) {
        try {
            int var5 = var3 <= 2048 ? var3 * (4096 + var2) >> 12 : var3 + var2 - (var2 * var3 >> 12);
            if (var5 > 0) {
                var1 *= 6;
                int var6 = var3 + var3 - var5;
                int var7 = (var5 - var6 << 12) / var5;
                int var8 = var1 >> 12;
                int var9 = var1 - (var8 << 12);
                int var10 = var5 * var7 >> 12;
                var10 = var9 * var10 >> 12;
                int var11 = var6 + var10;
                int var12 = var5 - var10;
                switch (var8) {
                    case 0:
                        this.field63 = var5;
                        this.field64 = var11;
                        this.field65 = var6;
                        break;
                    case 1:
                        this.field63 = var12;
                        this.field64 = var5;
                        this.field65 = var6;
                        break;
                    case 2:
                        this.field63 = var6;
                        this.field64 = var5;
                        this.field65 = var11;
                        break;
                    case 3:
                        this.field63 = var6;
                        this.field64 = var12;
                        this.field65 = var5;
                        break;
                    case 4:
                        this.field63 = var11;
                        this.field64 = var6;
                        this.field65 = var5;
                        break;
                    case 5:
                        this.field63 = var5;
                        this.field64 = var6;
                        this.field65 = var12;
                }
            } else {
                this.field63 = this.field64 = this.field65 = var3;
            }

        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "agg.am(" + ')');
        }
    }

    void method47(int var1, int var2, int var3, int var4) {
        try {
            int var5 = var1 > var2 ? var1 : var2;
            var5 = var3 > var5 ? var3 : var5;
            int var6 = var1 < var2 ? var1 : var2;
            var6 = var3 < var6 ? var3 : var6;
            int var7 = var5 - var6;
            this.field54 = (var5 + var6) / 2;
            if (this.field54 > 0 && this.field54 < 4096) {
                this.field61 = (var7 << 12) / (this.field54 <= 2048 ? this.field54 * -745389241 * -939463442 : 8192 - this.field54 * 2);
            } else {
                this.field61 = 0;
            }

            if (var7 > 0) {
                int var8 = (var5 - var1 << 12) / var7;
                int var9 = (var5 - var2 << 12) / var7;
                int var10 = (var5 - var3 << 12) / var7;
                if (var1 == var5) {
                    this.field62 = var2 == var6 ? var10 + 20480 : 4096 - var9;
                } else if (var2 == var5) {
                    this.field62 = var3 == var6 ? var8 + 4096 : 12288 - var10;
                } else {
                    this.field62 = var6 == var1 ? var9 + 12288 : 20480 - var8;
                }

                this.field62 /= 6;
            } else {
                this.field62 = 0;
            }

        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "agg.ac(" + ')');
        }
    }

    void method209(int var1, InputStream var2, byte var3) {
        try {
            switch (var1) {
                case 0:
                    this.field57 = var2.method6367(1909722828) * -1453036235;
                    break;
                case 1:
                    this.field58 = (var2.method6372(-12558881) << 12) / 100 * -1734174407;
                    break;
                case 2:
                    this.field59 = (var2.method6372(-12558881) << 12) / 100 * -745389241;
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "agg.r(" + ')');
        }
    }
}
