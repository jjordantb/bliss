public class class604 {
    static int field8712 = 16;
    static int field8713 = 128;
    static int field8714 = 128;
    static Object field8715;
    static Object field8717;
    static int field8722 = 4000;
    static Object field8724;
    boolean field8716;
    class546 field8718 = null;
    class678[] field8719 = null;
    class546 field8720 = null;
    class546 field8721 = null;
    class678[] field8723 = null;

    class604(class13 var1) {
        this.field8716 = var1.field6864;
        method5121(var1);
        if (!this.field8716) {
            this.field8723 = new class678[16];

            int var2;
            byte[] var3;
            for (var2 = 0; var2 < 16; ++var2) {
                var3 = class618.method5161(field8724, var2 * '耀', 32768, (byte) 1);
                this.field8723[var2] = new class678(var1, 3553, class264.field8199, class482.field8399, 128, 128, true, var3, class264.field8199, false);
            }

            this.field8719 = new class678[16];

            for (var2 = 0; var2 < 16; ++var2) {
                var3 = class618.method5161(field8715, var2 * '耀', 32768, (byte) 1);
                this.field8719[var2] = new class678(var1, 3553, class264.field8199, class482.field8399, 128, 128, true, var3, class264.field8199, false);
            }
        } else {
            byte[] var5 = class886.method6166(field8724, false, -1069979681);
            this.field8718 = new class546(var1, class264.field8199, class482.field8399, 128, 128, 16, var5, class264.field8199);
            var5 = class886.method6166(field8715, false, -2082451325);
            this.field8720 = new class546(var1, class264.field8199, class482.field8399, 128, 128, 16, var5, class264.field8199);
            class778 var6 = var1.field6748;
            if (var6.method2330()) {
                var5 = class886.method6166(field8717, false, 77360531);
                this.field8721 = new class546(var1, class264.field8191, class482.field8399, 128, 128, 16);
                class546 var4 = new class546(var1, class264.field8193, class482.field8399, 128, 128, 16, var5, class264.field8193);
                if (!var6.method2329(this.field8721, var4, 2.0F)) {
                    this.field8721.method4296();
                    this.field8721 = null;
                } else {
                    this.field8721.method4292();
                }

                var4.method4296();
            }
        }

    }

    static void method5121(class13 var0) {
        byte[] var2;
        if (field8724 == null) {
            class504 var1 = new class504();
            var2 = var1.method2538(128, 128, 16);
            field8724 = class562.method812(var2, false, (short) 467);
        }

        if (field8715 == null) {
            class975 var3 = new class975();
            var2 = var3.method1781(128, 128, 16);
            field8715 = class562.method812(var2, false, (short) -3222);
        }

        class778 var4 = var0.field6748;
        if (var4.method2330() && field8717 == null) {
            var2 = class674.method4250(128, 128, 16, 8, new class400(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
            field8717 = class562.method812(var2, false, (short) -1995);
        }

    }
}
