public class class231 {
    static int field8276 = 2;
    static int field8277 = 0;
    static int field8279 = 500000;
    static byte[] field8281 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int field8283 = 1;
    static int field8285 = 3;
    long field8272;
    int field8273;
    InputStream field8274 = new InputStream((byte[]) null);
    int[] field8275;
    int[] field8278;
    int[] field8280;
    int[] field8282;
    int field8284;

    class231(byte[] var1) {
        this.method4671(var1);
    }

    class231() {
    }

    void method4671(byte[] var1) {
        this.field8274.field10375 = var1;
        this.field8274.field10376 = 10;
        int var2 = this.field8274.method6374();
        this.field8273 = this.field8274.method6374();
        this.field8284 = 500000;
        this.field8280 = new int[var2];

        int var3;
        int var5;
        for (var3 = 0; var3 < var2; this.field8274.field10376 += var5) {
            int var4 = this.field8274.method6420((byte) 54);
            var5 = this.field8274.method6420((byte) -51);
            if (var4 == 1297379947) {
                this.field8280[var3] = this.field8274.field10376;
                ++var3;
            }
        }

        this.field8272 = 0L;
        this.field8275 = new int[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            this.field8275[var3] = this.field8280[var3];
        }

        this.field8282 = new int[var2];
        this.field8278 = new int[var2];
    }

    void method4672() {
        this.field8274.field10375 = null;
        this.field8280 = null;
        this.field8275 = null;
        this.field8282 = null;
        this.field8278 = null;
    }

    int method4673() {
        return this.field8275.length;
    }

    void method4674(int var1) {
        this.field8274.field10376 = this.field8275[var1];
    }

    void method4675() {
        this.field8274.field10376 = -1;
    }

    void method4676(int var1) {
        int var2 = this.field8274.method6386(1692297361);
        this.field8282[var1] += var2;
    }

    int method4677(int var1) {
        int var2 = this.method4678(var1);
        return var2;
    }

    int method4678(int var1) {
        byte var2 = this.field8274.field10375[this.field8274.field10376];
        int var5;
        if (var2 < 0) {
            var5 = var2 & 255;
            this.field8278[var1] = var5;
            ++this.field8274.field10376;
        } else {
            var5 = this.field8278[var1];
        }

        if (var5 != 240 && var5 != 247) {
            return this.method4679(var1, var5);
        } else {
            int var3 = this.field8274.method6386(1692297361);
            if (var5 == 247 && var3 > 0) {
                int var4 = this.field8274.field10375[this.field8274.field10376] & 255;
                if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
                    ++this.field8274.field10376;
                    this.field8278[var1] = var4;
                    return this.method4679(var1, var4);
                }
            }

            this.field8274.field10376 += var3;
            return 0;
        }
    }

    int method4679(int var1, int var2) {
        int var4;
        if (var2 == 255) {
            int var7 = this.field8274.method6371();
            var4 = this.field8274.method6386(1692297361);
            if (var7 == 47) {
                this.field8274.field10376 += var4;
                return 1;
            } else if (var7 == 81) {
                int var5 = this.field8274.method6390((byte) 17);
                var4 -= 3;
                int var6 = this.field8282[var1];
                this.field8272 += (long) var6 * (long) (this.field8284 - var5);
                this.field8284 = var5;
                this.field8274.field10376 += var4;
                return 2;
            } else {
                this.field8274.field10376 += var4;
                return 3;
            }
        } else {
            byte var3 = field8281[var2 - 128];
            var4 = var2;
            if (var3 >= 1) {
                var4 = var2 | this.field8274.method6371() << 8;
            }

            if (var3 >= 2) {
                var4 |= this.field8274.method6371() << 16;
            }

            return var4;
        }
    }

    long method4680(int var1) {
        return this.field8272 + (long) var1 * (long) this.field8284;
    }

    int method4681() {
        int var1 = this.field8275.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;

        for (int var4 = 0; var4 < var1; ++var4) {
            if (this.field8275[var4] >= 0 && this.field8282[var4] < var3) {
                var2 = var4;
                var3 = this.field8282[var4];
            }
        }

        return var2;
    }

    boolean method4682() {
        int var1 = this.field8275.length;

        for (int var2 = 0; var2 < var1; ++var2) {
            if (this.field8275[var2] >= 0) {
                return false;
            }
        }

        return true;
    }

    void method4683(int var1) {
        this.field8275[var1] = this.field8274.field10376;
    }

    boolean method4684() {
        return this.field8274.field10375 != null;
    }

    void method4685(long var1) {
        this.field8272 = var1;
        int var3 = this.field8275.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            this.field8282[var4] = 0;
            this.field8278[var4] = 0;
            this.field8274.field10376 = this.field8280[var4];
            this.method4676(var4);
            this.field8275[var4] = this.field8274.field10376;
        }

    }
}
