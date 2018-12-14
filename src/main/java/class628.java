public class class628 extends class347 {
    static byte[] field9739;
    static int field9740 = 4096;
    static int field9742 = 3216;
    static int field9745 = 3216;
    static int field9746;

    static {
        int var0 = 0;
        field9739 = new byte['肀'];

        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; var2 <= var1; ++var2) {
                field9739[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) ('\uffff' + var1 * var1 + var2 * var2) / 65535.0F))));
            }
        }

    }

    int field9738 = 3216;
    int field9741 = 4096;
    int field9743 = 3216;
    int[] field9744 = new int[3];

    public class628() {
        super(1, true);
    }

    int[] method203(int var1, int var2) {
        try {
            int[] var3 = super.field270.method3546(var1, 1709165906);
            if (super.field270.field6612) {
                int var4 = this.field9741 * class322.field833 >> 12;
                int[] var5 = this.method201(0, var1 - 1 & class322.field834, -1887337990);
                int[] var6 = this.method201(0, var1, -1887337990);
                int[] var7 = this.method201(0, var1 + 1 & class322.field834, -1887337990);

                for (int var8 = 0; var8 < class322.field831; ++var8) {
                    int var9 = var4 * (var7[var8] - var5[var8]) >> 12;
                    int var10 = var4 * (var6[var8 - 1 & class322.field829] - var6[1 + var8 & class322.field829]) >> 12;
                    int var11 = var10 >> 4;
                    int var12 = var9 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }

                    if (var11 > 255) {
                        var11 = 255;
                    }

                    if (var12 < 0) {
                        var12 = -var12;
                    }

                    if (var12 > 255) {
                        var12 = 255;
                    }

                    int var13 = field9739[var11 + (var12 * (var12 + 1) >> 1)] & 255;
                    int var14 = var13 * var10 >> 8;
                    int var15 = var13 * var9 >> 8;
                    int var16 = var13 * 4096 >> 8;
                    var14 = this.field9744[0] * var14 >> 12;
                    var15 = this.field9744[1] * var15 >> 12;
                    var16 = this.field9744[2] * var16 >> 12;
                    var3[var8] = var14 + var15 + var16;
                }
            }

            return var3;
        } catch (RuntimeException var17) {
            throw class158.method3445(var17, "ahl.i(" + ')');
        }
    }

    void method209(int var1, InputStream var2, byte var3) {
        try {
            switch (var1) {
                case 0:
                    this.field9741 = var2.method6374();
                    break;
                case 1:
                    this.field9738 = var2.method6374();
                    break;
                case 2:
                    this.field9743 = var2.method6374();
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ahl.r(" + ')');
        }
    }

    void method5810(int var1) {
        try {
            double var2 = Math.cos((double) ((float) this.field9743 / 4096.0F));
            this.field9744[0] = (int) (Math.sin((double) ((float) this.field9738 / 4096.0F)) * var2 * 4096.0D);
            this.field9744[1] = (int) (Math.cos((double) ((float) this.field9738 / 4096.0F)) * var2 * 4096.0D);
            this.field9744[2] = (int) (Math.sin((double) ((float) this.field9743 / 4096.0F)) * 4096.0D);
            int var4 = this.field9744[0] * this.field9744[0] >> 12;
            int var5 = this.field9744[1] * this.field9744[1] >> 12;
            int var6 = this.field9744[2] * this.field9744[2] >> 12;
            int var7 = (int) (Math.sqrt((double) (var6 + var5 + var4 >> 12)) * 4096.0D);
            if (var7 != 0) {
                this.field9744[0] = (this.field9744[0] << 12) / var7;
                this.field9744[1] = (this.field9744[1] << 12) / var7;
                this.field9744[2] = (this.field9744[2] << 12) / var7;
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "ahl.ac(" + ')');
        }
    }

    void method205(int var1) {
        try {
            this.method5810(491041970);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ahl.x(" + ')');
        }
    }
}
