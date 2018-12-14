public class class696 {
    public static int field7242 = 16;
    static int field7232 = 128;
    static int field7234 = 128;
    static Object field7237;
    static Object field7243;
    static Object field7244;
    public boolean field7236;
    public class801[] field7239 = null;
    public class332 field7240 = null;
    public class332 field7241 = null;
    class325 field7233;
    class801[] field7235 = null;
    class332 field7238 = null;

    class696(class325 var1) {
        this.field7233 = var1;
        this.field7236 = this.field7233.field809;
        if (this.field7236 && !this.field7233.method608(class264.field8199, class482.field8399)) {
            this.field7236 = false;
        }

        if (this.field7236 || this.field7233.method607(class264.field8199, class482.field8399)) {
            method3925();
            if (!this.field7236) {
                this.field7235 = new class801[16];

                int var2;
                byte[] var3;
                for (var2 = 0; var2 < 16; ++var2) {
                    var3 = class618.method5161(field7237, var2 * '耀', 32768, (byte) 1);
                    this.field7235[var2] = this.field7233.method610(class264.field8199, 128, 128, true, var3);
                }

                this.field7239 = new class801[16];

                for (var2 = 0; var2 < 16; ++var2) {
                    var3 = class618.method5161(field7243, var2 * '耀', 32768, (byte) 1);
                    this.field7239[var2] = this.field7233.method610(class264.field8199, 128, 128, true, var3);
                }
            } else {
                byte[] var4 = class886.method6166(field7237, false, 1565550558);
                this.field7238 = this.field7233.method675(class264.field8199, 128, 128, 16, true, var4);
                var4 = class886.method6166(field7243, false, -1292209598);
                this.field7240 = this.field7233.method675(class264.field8199, 128, 128, 16, true, var4);
            }
        }

    }

    static void method3925() {
        byte[] var1;
        if (field7237 == null) {
            class38 var0 = new class38();
            var1 = var0.method3339(128, 128, 16);
            field7237 = class562.method812(var1, false, (short) 5197);
        }

        if (field7243 == null) {
            class438 var2 = new class438();
            var1 = var2.method4263(128, 128, 16);
            field7243 = class562.method812(var1, false, (short) 9144);
        }

    }

    public boolean method3923() {
        return this.field7236 ? this.field7238 != null : this.field7235 != null;
    }

    // W2S?
    public boolean method3924() {
        if (!this.field7233.field809) {
            return false;
        } else {
            if (this.field7241 == null) {
                byte[] var1;
                if (field7244 == null) {
                    var1 = class674.method4250(128, 128, 16, 8, new class400(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
                    field7244 = class562.method812(var1, false, (short) 13525);
                }

                var1 = class886.method6166(field7244, false, 466014049);
                byte[] var2 = new byte[var1.length * 4];
                int var3 = 0;

                for (int var4 = 0; var4 < 16; ++var4) {
                    int var5 = var4 * 16384;
                    int var6 = var5;

                    for (int var7 = 0; var7 < 128; ++var7) {
                        int var8 = var6 + var7 * 128;
                        int var9 = var6 + (var7 - 1 & 127) * 128;
                        int var10 = var6 + (var7 + 1 & 127) * 128;

                        for (int var11 = 0; var11 < 128; ++var11) {
                            float var12 = (float) ((var1[var9 + var11] & 255) - (var1[var10 + var11] & 255));
                            float var13 = (float) ((var1[var8 + (var11 - 1 & 127)] & 255) - (var1[var8 + (var11 + 1 & 127)] & 255));
                            float var14 = (float) (128.0D / Math.sqrt((double) (var13 * var13 + 16384.0F + var12 * var12)));
                            var2[var3++] = (byte) ((int) (var13 * var14 + 127.0F));
                            var2[var3++] = (byte) ((int) (128.0F * var14 + 127.0F));
                            var2[var3++] = (byte) ((int) (var12 * var14 + 127.0F));
                            var2[var3++] = var1[var5++];
                        }
                    }
                }

                this.field7241 = this.field7233.method675(class264.field8191, 128, 128, 16, true, var2);
            }

            return this.field7241 != null;
        }
    }
}
