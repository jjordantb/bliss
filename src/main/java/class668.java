public class class668 extends class347 {
    int field7404 = -1;
    int field7405;
    int[] field7406;
    int field7407;

    public class668() {
        super(0, false);
    }

    int[][] method204(int var1, byte var2) {
        try {
            int[][] var3 = super.field266.method162(var1, (byte) 73);
            if (super.field266.field211) {
                int var4 = this.field7405 * (this.field7407 != class322.field832 ? this.field7407 * var1 / class322.field832 : var1);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                int var8;
                int var9;
                if (class322.field831 == this.field7405) {
                    for (var8 = 0; var8 < class322.field831; ++var8) {
                        var9 = this.field7406[var4++];
                        var7[var8] = (var9 & 255) << 4;
                        var6[var8] = (var9 & '\uff00') >> 4;
                        var5[var8] = (var9 & 16711680) >> 12;
                    }
                } else {
                    for (var8 = 0; var8 < class322.field831; ++var8) {
                        var9 = var8 * this.field7405 / class322.field831;
                        int var10 = this.field7406[var4 + var9];
                        var7[var8] = (var10 & 255) << 4;
                        var6[var8] = (var10 & '\uff00') >> 4;
                        var5[var8] = (var10 & 16711680) >> 12;
                    }
                }
            }

            return var3;
        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "ahr.k(" + ')');
        }
    }

    int method208(byte var1) {
        try {
            return this.field7404;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ahr.n(" + ')');
        }
    }

    void method202(int var1, int var2, int var3) {
        try {
            super.method202(var1, var2, -1661668864);
            if (this.field7404 >= 0 && class134.field1399 != null) {
                int var4 = class134.field1399.method4625(this.field7404, 816226410).field9372 ? 64 : 128;
                this.field7406 = class134.field1399.method4622(this.field7404, 1.0F, var4, var4, false, 215810850);
                this.field7407 = var4;
                this.field7405 = var4;
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ahr.a(" + ')');
        }
    }

    void method200(int var1) {
        try {
            super.method200(1881168514);
            this.field7406 = null;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ahr.f(" + ')');
        }
    }

    void method209(int var1, InputStream var2, byte var3) {
        try {
            if (var1 == 0) {
                this.field7404 = var2.method6374();
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ahr.r(" + ')');
        }
    }
}
