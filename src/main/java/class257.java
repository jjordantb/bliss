import java.awt.*;

public class class257 extends class848 {
    int[] field7914;
    int field7915;
    int field7916;
    class1 field7917;
    int field7918;
    int field7919;
    float[] field7920;
    int field7921;
    class1 field7922;
    int field7923;
    int field7924;
    int field7925;
    int field7926;
    int field7927;
    int field7928;
    int field7929;
    int field7930;
    class135 field7931;
    boolean field7932;
    class344 field7933;
    class344 field7934;
    float[][] field7935;
    int field7936;
    int field7937;
    int field7938;
    class48 field7939;
    float field7940;
    boolean field7941;
    float field7942;
    float field7943;
    float field7944;
    int field7945;
    int field7946;
    class344 field7947;
    class258[] field7948;
    int field7949;
    boolean field7950;
    float field7951;
    float field7952;
    int field7953;

    class257(class478 var1) {
        super(var1);
        this.field7932 = false;
        this.field7941 = false;
        this.field7921 = 0;
        this.field7938 = 0;
        this.field7923 = 0;
        this.field7924 = 0;
        this.field7945 = 45823;
        this.field7929 = 78642;
        this.field7930 = 75518;
        this.field7935 = new float[6][4];
        this.field7944 = 1.0F;
        this.field7951 = 0.0F;
        this.field7949 = 128;
        this.field7950 = false;
        this.field7917 = new class1(16);
        this.field7953 = -1;

        try {
            this.field7922 = new class1(256);
            this.field7931 = new class135();
            this.field7947 = new class344();
            this.field7933 = new class344();
            this.field7934 = new class344();
            this.method4458(1);
            this.method4449(0);
            class771.method2300(true, true, -162450455);
            this.field7941 = true;
            this.field7915 = (int) class27.resetTimer((byte) 1);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method4996(2022818790);
            throw new RuntimeException("");
        }
    }

    class257(Canvas var1, class478 var2, int var3, int var4) {
        this(var2);

        try {
            this.method5032(var1, var3, var4, 288309230);
            this.method4816(var1, (byte) -11);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method4996(565330132);
            throw new RuntimeException("");
        }
    }

    public void method4872(int var1, float var2, float var3, float var4, float var5, float var6) {
        this.field7945 = (int) (var2 * 65535.0F);
        this.field7929 = (int) (var3 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (var5 * var5 + var4 * var4 + var6 * var6));
        this.field7925 = (int) (var4 * 65535.0F / var7);
        this.field7926 = (int) (65535.0F * var5 / var7);
        this.field7928 = (int) (var6 * 65535.0F / var7);
    }

    void method4797(int var1, int var2) throws class937 {
        super.field8594.method2517(var1, var2);
        if (super.field8581 != null) {
            super.field8581.method4627(-119853711);
        }

    }

    void method4846() {
        if (this.field7941) {
            class82.method919(true, false, (short) 7077);
            this.field7941 = false;
        }

        this.field7932 = true;
    }

    boolean method4444() {
        return this.field7932;
    }

    int[] method4445(int var1) {
        class1 var2 = this.field7922;
        class340 var3;
        synchronized (this.field7922) {
            var3 = (class340) this.field7922.method2974((long) var1 | Long.MIN_VALUE);
            if (var3 == null) {
                class414 var4;
                if (!super.field8581.method4621(var1, (short) 2824)) {
                    return null;
                }

                var4 = super.field8581.method4625(var1, 2098775003);
                int var5 = !var4.field9372 && !this.field7950 ? 1107560907 * this.field7949 * -806628381 : 64;
                var3 = new class340(var1, var5, super.field8581.method4623(var1, 0.7F, var5, var5, true, (byte) 2), 1 != var4.field9382);
                this.field7922.method2984(var3, (long) var1 | Long.MIN_VALUE);
            }
        }

        var3.field162 = true;
        return var3.method138();
    }

    public boolean method4814() {
        return false;
    }

    public boolean method4804() {
        return true;
    }

    public boolean method4878() {
        return false;
    }

    public boolean method4807() {
        return false;
    }

    public boolean method4916() {
        return false;
    }

    public boolean method4855() {
        return false;
    }

    public boolean method4810() {
        return false;
    }

    public boolean method4879() {
        return true;
    }

    public void method4891(boolean var1) {
    }

    class749 method4819(Canvas var1, int var2, int var3) {
        return class246.method4733(this, var1, var2, var3, -1465343898);
    }

    public void method4812(int[] var1) {
        var1[0] = this.field7918;
        var1[1] = this.field7919;
    }

    void method4446() {
        if (this.field7920 != null) {
            int var1;
            int var2;
            int var3;
            if (this.field7921 == 0 && this.field7938 == this.field7918 && this.field7923 == 0 && this.field7924 == this.field7919) {
                var1 = this.field7920.length;
                var2 = var1 - (var1 & 7);

                for (var3 = 0; var3 < var2; this.field7920[var3++] = 2.14748365E9F) {
                    this.field7920[var3++] = 2.14748365E9F;
                    this.field7920[var3++] = 2.14748365E9F;
                    this.field7920[var3++] = 2.14748365E9F;
                    this.field7920[var3++] = 2.14748365E9F;
                    this.field7920[var3++] = 2.14748365E9F;
                    this.field7920[var3++] = 2.14748365E9F;
                    this.field7920[var3++] = 2.14748365E9F;
                }

                while (var3 < var1) {
                    this.field7920[var3++] = 2.14748365E9F;
                }
            } else {
                var1 = this.field7938 - this.field7921;
                var2 = this.field7924 - this.field7923;
                var3 = this.field7918 - var1;
                int var4 = this.field7923 * this.field7918 + this.field7921;
                int var5 = var1 >> 3;
                int var6 = var1 & 7;
                var1 = var4 - 1;

                for (int var7 = -var2; var7 < 0; ++var7) {
                    int var8;
                    if (var5 > 0) {
                        var8 = var5;

                        do {
                            ++var1;
                            this.field7920[var1] = 2.14748365E9F;
                            ++var1;
                            this.field7920[var1] = 2.14748365E9F;
                            ++var1;
                            this.field7920[var1] = 2.14748365E9F;
                            ++var1;
                            this.field7920[var1] = 2.14748365E9F;
                            ++var1;
                            this.field7920[var1] = 2.14748365E9F;
                            ++var1;
                            this.field7920[var1] = 2.14748365E9F;
                            ++var1;
                            this.field7920[var1] = 2.14748365E9F;
                            ++var1;
                            this.field7920[var1] = 2.14748365E9F;
                            --var8;
                        } while (var8 > 0);
                    }

                    if (var6 > 0) {
                        var8 = var6;

                        do {
                            ++var1;
                            this.field7920[var1] = 2.14748365E9F;
                            --var8;
                        } while (var8 > 0);
                    }

                    var1 += var3;
                }
            }
        }

    }

    public void method4869(boolean var1) {
        class258 var2 = this.method4450(Thread.currentThread());
        var2.field7896 = var1;
    }

    public void method4824() {
        this.field7936 = 0;
        this.field7937 = 0;
        this.field7927 = this.field7918;
        this.field7916 = this.field7919;
        this.method4457();
    }

    public void method4968() {
    }

    public void method4826(float var1, float var2) {
        this.field7944 = var2 - var1;
        this.field7951 = var2 + var1 - 1.0F;

        for (int var3 = 0; var3 < this.field7946; ++var3) {
            class258 var4 = this.field7948[var3];
            class585 var5 = var4.field7881;
            var5.field362 = this.field7944;
            var5.field343 = this.field7951;
        }

    }

    public void method4827() {
        this.field7921 = 0;
        this.field7923 = 0;
        this.field7938 = this.field7918;
        this.field7924 = this.field7919;
        this.method4457();
    }

    public void method4986(int var1, int var2, int var3, int var4) {
        if (var1 < 0) {
            var1 = 0;
        }

        if (var2 < 0) {
            var2 = 0;
        }

        if (var3 > this.field7918) {
            var3 = this.field7918;
        }

        if (var4 > this.field7919) {
            var4 = this.field7919;
        }

        this.field7921 = var1;
        this.field7938 = var3;
        this.field7923 = var2;
        this.field7924 = var4;
        this.method4457();
    }

    boolean method4447(int var1) {
        return this.field7950 || super.field8581.method4625(var1, 507704159).field9372;
    }

    public void method4839(int var1, int var2, int var3, int var4, int var5) {
        if (this.field7914 != null && var2 >= this.field7923 && var2 < this.field7924) {
            if (var1 < this.field7921) {
                var3 -= this.field7921 - var1;
                var1 = this.field7921;
            }

            if (var1 + var3 > this.field7938) {
                var3 = this.field7938 - var1;
            }

            int var6 = var1 + this.field7918 * var2;
            int var7 = var4 >>> 24;
            int var8;
            if (var5 != 0 && (var5 != 1 || var7 != 255)) {
                int var9;
                int var10;
                if (var5 == 1) {
                    var4 = (var7 << 24) + ((var4 & '\uff00') * var7 >> 8 & '\uff00') + (var7 * (var4 & 16711935) >> 8 & 16711935);
                    var8 = 256 - var7;

                    for (var9 = 0; var9 < var3; ++var9) {
                        var10 = this.field7914[var9 + var6];
                        var10 = (var8 * (var10 & '\uff00') >> 8 & '\uff00') + (var8 * (var10 & 16711935) >> 8 & 16711935);
                        this.field7914[var9 + var6] = var4 + var10;
                    }
                } else {
                    if (var5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    for (var8 = 0; var8 < var3; ++var8) {
                        var9 = this.field7914[var6 + var8];
                        var10 = var4 + var9;
                        int var11 = (var9 & 16711935) + (var4 & 16711935);
                        var9 = (var11 & 16777472) + (var10 - var11 & 65536);
                        this.field7914[var6 + var8] = var10 - var9 | var9 - (var9 >>> 8);
                    }
                }
            } else {
                for (var8 = 0; var8 < var3; ++var8) {
                    this.field7914[var6 + var8] = var4;
                }
            }
        }

    }

    public void method4838(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.method4839(var1, var2, var3, var5, var6);
        this.method4839(var1, var4 + var2 - 1, var3, var5, var6);
        this.method4843(var1, 1 + var2, var4 - 2, var5, var6);
        this.method4843(var1 + var3 - 1, 1 + var2, var4 - 2, var5, var6);
    }

    public void method4984(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (this.field7914 != null) {
            if (var1 < this.field7921) {
                var3 -= this.field7921 - var1;
                var1 = this.field7921;
            }

            if (var2 < this.field7923) {
                var4 -= this.field7923 - var2;
                var2 = this.field7923;
            }

            if (var1 + var3 > this.field7938) {
                var3 = this.field7938 - var1;
            }

            if (var4 + var2 > this.field7924) {
                var4 = this.field7924 - var2;
            }

            if (var3 > 0 && var4 > 0 && var1 <= this.field7938 && var2 <= this.field7924) {
                int var7 = this.field7918 - var3;
                int var8 = var2 * this.field7918 + var1;
                int var9 = var5 >>> 24;
                int var10;
                int var11;
                int var12;
                if (var6 == 0 || var6 == 1 && 255 == var9) {
                    var10 = var3 >> 3;
                    var11 = var3 & 7;
                    var3 = var8 - 1;

                    for (var12 = -var4; var12 < 0; ++var12) {
                        if (var10 > 0) {
                            var1 = var10;

                            do {
                                ++var3;
                                this.field7914[var3] = var5;
                                ++var3;
                                this.field7914[var3] = var5;
                                ++var3;
                                this.field7914[var3] = var5;
                                ++var3;
                                this.field7914[var3] = var5;
                                ++var3;
                                this.field7914[var3] = var5;
                                ++var3;
                                this.field7914[var3] = var5;
                                ++var3;
                                this.field7914[var3] = var5;
                                ++var3;
                                this.field7914[var3] = var5;
                                --var1;
                            } while (var1 > 0);
                        }

                        if (var11 > 0) {
                            var1 = var11;

                            do {
                                ++var3;
                                this.field7914[var3] = var5;
                                --var1;
                            } while (var1 > 0);
                        }

                        var3 += var7;
                    }
                } else {
                    int var13;
                    if (1 == var6) {
                        var5 = (var9 * (var5 & 16711935) >> 8 & 16711935) + (var9 * ((var5 & -16711936) >>> 8) & -16711936);
                        var10 = 256 - var9;

                        for (var11 = 0; var11 < var4; ++var11) {
                            for (var12 = -var3; var12 < 0; ++var12) {
                                var13 = this.field7914[var8];
                                var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (var10 * ((var13 & -16711936) >>> 8) & -16711936);
                                this.field7914[var8++] = var13 + var5;
                            }

                            var8 += var7;
                        }
                    } else {
                        if (var6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        for (var10 = 0; var10 < var4; ++var10) {
                            for (var11 = -var3; var11 < 0; ++var11) {
                                var12 = this.field7914[var8];
                                var13 = var5 + var12;
                                int var14 = (var5 & 16711935) + (var12 & 16711935);
                                var12 = (var13 - var14 & 65536) + (var14 & 16777472);
                                this.field7914[var8++] = var13 - var12 | var12 - (var12 >>> 8);
                            }

                            var8 += var7;
                        }
                    }
                }
            }
        }

    }

    public void method4809(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9) {
        if (this.field7914 != null && var3 > 0 && var4 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (var8 << 16) / var3;
            int var13 = (var7.length / var8 << 16) / var4;
            int var14 = var1 + var2 * this.field7918;
            int var15 = this.field7918 - var3;
            if (var4 + var2 > this.field7924) {
                var4 -= var2 + var4 - this.field7924;
            }

            int var16;
            if (var2 < this.field7923) {
                var16 = this.field7923 - var2;
                var4 -= var16;
                var14 += var16 * this.field7918;
                var11 += var16 * var13;
            }

            if (var1 + var3 > this.field7938) {
                var16 = var1 + var3 - this.field7938;
                var3 -= var16;
                var15 += var16;
            }

            if (var1 < this.field7921) {
                var16 = this.field7921 - var1;
                var3 -= var16;
                var14 += var16;
                var10 += var12 * var16;
                var15 += var16;
            }

            var16 = var5 >>> 24;
            int var17 = var6 >>> 24;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var9 != 0 && (1 != var9 || var16 != 255 || var17 != 255)) {
                int var22;
                int var23;
                int var24;
                int var25;
                if (1 == var9) {
                    var18 = var10;

                    for (var19 = -var4; var19 < 0; ++var19) {
                        var20 = (var11 >> 16) * var8;

                        for (var21 = -var3; var21 < 0; ++var21) {
                            var22 = var5;
                            if (var7[(var10 >> 16) + var20] != 0) {
                                var22 = var6;
                            }

                            var23 = var22 >>> 24;
                            var24 = 255 - var23;
                            var25 = this.field7914[var14];
                            this.field7914[var14++] = (var23 * (var22 & '\uff00') + (var25 & '\uff00') * var24 & 16711680) + ((var25 & 16711935) * var24 + (var22 & 16711935) * var23 & -16711936) >> 8;
                            var10 += var12;
                        }

                        var11 += var13;
                        var10 = var18;
                        var14 += var15;
                    }
                } else {
                    if (var9 != 2) {
                        throw new IllegalArgumentException();
                    }

                    var18 = var10;

                    for (var19 = -var4; var19 < 0; ++var19) {
                        var20 = var8 * (var11 >> 16);

                        for (var21 = -var3; var21 < 0; ++var21) {
                            var22 = var5;
                            if (var7[(var10 >> 16) + var20] != 0) {
                                var22 = var6;
                            }

                            if (var22 != 0) {
                                var23 = this.field7914[var14];
                                var24 = var23 + var22;
                                var25 = (var23 & 16711935) + (var22 & 16711935);
                                var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                                this.field7914[var14++] = var24 - var23 | var23 - (var23 >>> 8);
                            } else {
                                ++var14;
                            }

                            var10 += var12;
                        }

                        var11 += var13;
                        var10 = var18;
                        var14 += var15;
                    }
                }
            } else {
                var18 = var10;

                for (var19 = -var4; var19 < 0; ++var19) {
                    var20 = (var11 >> 16) * var8;

                    for (var21 = -var3; var21 < 0; ++var21) {
                        if (var7[(var10 >> 16) + var20] != 0) {
                            this.field7914[var14++] = var6;
                        } else {
                            this.field7914[var14++] = var5;
                        }

                        var10 += var12;
                    }

                    var11 += var13;
                    var10 = var18;
                    var14 += var15;
                }
            }
        }

    }

    void method4841(int var1, int var2, int var3, int var4, int var5) {
        if (this.field7914 != null) {
            if (var3 < 0) {
                var3 = -var3;
            }

            int var6 = var2 - var3;
            if (var6 < this.field7923) {
                var6 = this.field7923;
            }

            int var7 = var3 + var2 + 1;
            if (var7 > this.field7924) {
                var7 = this.field7924;
            }

            int var8 = var6;
            int var9 = var3 * var3;
            int var10 = 0;
            int var11 = var2 - var6;
            int var12 = var11 * var11;
            int var13 = var12 - var11;
            if (var2 > var7) {
                var2 = var7;
            }

            int var14 = var4 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            if (var5 != 0 && (var5 != 1 || var14 != 255)) {
                int var19;
                int var20;
                if (var5 == 1) {
                    var4 = (var14 << 24) + (var14 * (var4 & 16711935) >> 8 & 16711935) + (var14 * (var4 & '\uff00') >> 8 & '\uff00');

                    for (var15 = 256 - var14; var8 < var2; var13 -= var11 + var11) {
                        while (var13 <= var9 || var12 <= var9) {
                            var12 += var10 + var10;
                            var13 += var10++ + var10;
                        }

                        var16 = 1 + (var1 - var10);
                        if (var16 < this.field7921) {
                            var16 = this.field7921;
                        }

                        var17 = var1 + var10;
                        if (var17 > this.field7938) {
                            var17 = this.field7938;
                        }

                        var18 = this.field7918 * var8 + var16;

                        for (var19 = var16; var19 < var17; ++var19) {
                            var20 = this.field7914[var18];
                            var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + (var15 * (var20 & '\uff00') >> 8 & '\uff00');
                            this.field7914[var18++] = var4 + var20;
                        }

                        ++var8;
                        var12 -= var11-- + var11;
                    }

                    var10 = var3;
                    var11 = -var11;
                    var13 = var9 + var11 * var11;
                    var12 = var13 - var3;

                    for (var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                        while (var13 > var9 && var12 > var9) {
                            var13 -= var10-- + var10;
                            var12 -= var10 + var10;
                        }

                        var16 = var1 - var10;
                        if (var16 < this.field7921) {
                            var16 = this.field7921;
                        }

                        var17 = var1 + var10;
                        if (var17 > this.field7938 - 1) {
                            var17 = this.field7938 - 1;
                        }

                        var18 = this.field7918 * var8 + var16;

                        for (var19 = var16; var19 <= var17; ++var19) {
                            var20 = this.field7914[var18];
                            var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + (var15 * (var20 & '\uff00') >> 8 & '\uff00');
                            this.field7914[var18++] = var4 + var20;
                        }

                        ++var8;
                        var13 += var11 + var11;
                    }
                } else {
                    if (var5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    int var21;
                    while (var8 < var2) {
                        while (var13 <= var9 || var12 <= var9) {
                            var12 += var10 + var10;
                            var13 += var10++ + var10;
                        }

                        var15 = var1 - var10 + 1;
                        if (var15 < this.field7921) {
                            var15 = this.field7921;
                        }

                        var16 = var1 + var10;
                        if (var16 > this.field7938) {
                            var16 = this.field7938;
                        }

                        var17 = this.field7918 * var8 + var15;

                        for (var18 = var15; var18 < var16; ++var18) {
                            var19 = this.field7914[var17];
                            var20 = var4 + var19;
                            var21 = (var4 & 16711935) + (var19 & 16711935);
                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                            this.field7914[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                        }

                        ++var8;
                        var12 -= var11-- + var11;
                        var13 -= var11 + var11;
                    }

                    var10 = var3;
                    var11 = -var11;
                    var13 = var11 * var11 + var9;
                    var12 = var13 - var3;

                    for (var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                        while (var13 > var9 && var12 > var9) {
                            var13 -= var10-- + var10;
                            var12 -= var10 + var10;
                        }

                        var15 = var1 - var10;
                        if (var15 < this.field7921) {
                            var15 = this.field7921;
                        }

                        var16 = var1 + var10;
                        if (var16 > this.field7938 - 1) {
                            var16 = this.field7938 - 1;
                        }

                        var17 = var15 + var8 * this.field7918;

                        for (var18 = var15; var18 <= var16; ++var18) {
                            var19 = this.field7914[var17];
                            var20 = var19 + var4;
                            var21 = (var19 & 16711935) + (var4 & 16711935);
                            var19 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field7914[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                        }

                        ++var8;
                        var13 += var11 + var11;
                    }
                }
            } else {
                while (var8 < var2) {
                    while (var13 <= var9 || var12 <= var9) {
                        var12 += var10 + var10;
                        var13 += var10++ + var10;
                    }

                    var15 = var1 - var10 + 1;
                    if (var15 < this.field7921) {
                        var15 = this.field7921;
                    }

                    var16 = var10 + var1;
                    if (var16 > this.field7938) {
                        var16 = this.field7938;
                    }

                    var17 = var15 + this.field7918 * var8;

                    for (var18 = var15; var18 < var16; ++var18) {
                        this.field7914[var17++] = var4;
                    }

                    ++var8;
                    var12 -= var11-- + var11;
                    var13 -= var11 + var11;
                }

                var10 = var3;
                var11 = var8 - var2;
                var13 = var11 * var11 + var9;
                var12 = var13 - var3;

                for (var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                    while (var13 > var9 && var12 > var9) {
                        var13 -= var10-- + var10;
                        var12 -= var10 + var10;
                    }

                    var15 = var1 - var10;
                    if (var15 < this.field7921) {
                        var15 = this.field7921;
                    }

                    var16 = var1 + var10;
                    if (var16 > this.field7938 - 1) {
                        var16 = this.field7938 - 1;
                    }

                    var17 = var8 * this.field7918 + var15;

                    for (var18 = var15; var18 <= var16; ++var18) {
                        this.field7914[var17++] = var4;
                    }

                    ++var8;
                    var13 += var11 + var11;
                }

                return;
            }
        }

    }

    public void method4843(int var1, int var2, int var3, int var4, int var5) {
        if (this.field7914 != null && var1 >= this.field7921 && var1 < this.field7938) {
            if (var2 < this.field7923) {
                var3 -= this.field7923 - var2;
                var2 = this.field7923;
            }

            if (var3 + var2 > this.field7924) {
                var3 = this.field7924 - var2;
            }

            int var6 = var1 + var2 * this.field7918;
            int var7 = var4 >>> 24;
            int var8;
            if (var5 != 0 && (1 != var5 || 255 != var7)) {
                int var9;
                int var10;
                int var11;
                if (var5 == 1) {
                    var4 = (var7 * (var4 & '\uff00') >> 8 & '\uff00') + ((var4 & 16711935) * var7 >> 8 & 16711935) + (var7 << 24);
                    var8 = 256 - var7;

                    for (var9 = 0; var9 < var3; ++var9) {
                        var10 = var9 * this.field7918 + var6;
                        var11 = this.field7914[var10];
                        var11 = (var8 * (var11 & 16711935) >> 8 & 16711935) + ((var11 & '\uff00') * var8 >> 8 & '\uff00');
                        this.field7914[var10] = var11 + var4;
                    }
                } else {
                    if (2 != var5) {
                        throw new IllegalArgumentException();
                    }

                    for (var8 = 0; var8 < var3; ++var8) {
                        var9 = var8 * this.field7918 + var6;
                        var10 = this.field7914[var9];
                        var11 = var4 + var10;
                        int var12 = (var10 & 16711935) + (var4 & 16711935);
                        var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                        this.field7914[var9] = var11 - var10 | var10 - (var10 >>> 8);
                    }
                }
            } else {
                for (var8 = 0; var8 < var3; ++var8) {
                    this.field7914[var6 + var8 * this.field7918] = var4;
                }
            }
        }

    }

    public void method5059(int var1, int var2, int var3, int var4) {
        this.field7936 = var1;
        this.field7937 = var2;
        this.field7927 = var3;
        this.field7916 = var4;
        this.method4457();
    }

    public void method4863(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        if (this.field7914 != null) {
            var3 -= var1;
            var4 -= var2;
            int var10;
            if (var4 == 0) {
                if (var3 >= 0) {
                    this.method4465(var1, var2, 1 + var3, var5, var6, var7, var8, var9);
                } else {
                    var10 = var8 + var7;
                    var9 %= var10;
                    var9 = var7 + var10 - var9 - (1 + -var3) % var10;
                    var9 %= var10;
                    if (var9 < 0) {
                        var9 += var10;
                    }

                    this.method4465(var3 + var1, var2, 1 + -var3, var5, var6, var7, var8, var9);
                }
            } else if (var3 == 0) {
                if (var4 >= 0) {
                    this.method4463(var1, var2, var4 + 1, var5, var6, var7, var8, var9);
                } else {
                    var10 = var8 + var7;
                    var9 %= var10;
                    var9 = var7 + var10 - var9 - (-var4 + 1) % var10;
                    var9 %= var10;
                    if (var9 < 0) {
                        var9 += var10;
                    }

                    this.method4463(var1, var4 + var2, 1 + -var4, var5, var6, var7, var8, var9);
                }
            } else {
                var9 <<= 8;
                var7 <<= 8;
                var8 <<= 8;
                var10 = var8 + var7;
                var9 %= var10;
                int var11;
                int var12;
                if (var4 + var3 < 0) {
                    var11 = (int) (Math.sqrt((double) (var4 * var4 + var3 * var3)) * 256.0D);
                    var12 = var11 % var10;
                    var9 = var10 + var7 - var9 - var12;
                    var9 %= var10;
                    if (var9 < 0) {
                        var9 += var10;
                    }

                    var1 += var3;
                    var3 = -var3;
                    var2 += var4;
                    var4 = -var4;
                }

                int var13;
                int var14;
                int var15;
                int var16;
                int var17;
                int var18;
                if (var3 > var4) {
                    var2 <<= 16;
                    var2 += 32768;
                    var4 <<= 16;
                    var11 = (int) Math.floor(0.5D + (double) var4 / (double) var3);
                    var3 += var1;
                    var12 = var5 >>> 24;
                    var13 = (int) Math.sqrt((double) (65536 + (var11 >> 8) * (var11 >> 8)));
                    if (var6 != 0 && (1 != var6 || var12 != 255)) {
                        if (var6 == 1) {
                            var5 = (var12 << 24) + ((var5 & '\uff00') * var12 >> 8 & '\uff00') + (var12 * (var5 & 16711935) >> 8 & 16711935);

                            for (var14 = 256 - var12; var1 <= var3; var9 %= var10) {
                                var15 = var2 >> 16;
                                if (var1 >= this.field7921 && var1 < this.field7938 && var15 >= this.field7923 && var15 < this.field7924 && var9 < var7) {
                                    var16 = var1 + var15 * this.field7918;
                                    var17 = this.field7914[var16];
                                    var17 = ((var17 & 16711935) * var14 >> 8 & 16711935) + (var14 * (var17 & '\uff00') >> 8 & '\uff00');
                                    this.field7914[var16] = var17 + var5;
                                }

                                var2 += var11;
                                ++var1;
                                var9 += var13;
                            }
                        } else {
                            if (2 != var6) {
                                throw new IllegalArgumentException();
                            }

                            while (var1 <= var3) {
                                var14 = var2 >> 16;
                                if (var1 >= this.field7921 && var1 < this.field7938 && var14 >= this.field7923 && var14 < this.field7924 && var9 < var7) {
                                    var15 = var1 + var14 * this.field7918;
                                    var16 = this.field7914[var15];
                                    var17 = var16 + var5;
                                    var18 = (var16 & 16711935) + (var5 & 16711935);
                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    this.field7914[var15] = var17 - var16 | var16 - (var16 >>> 8);
                                }

                                var2 += var11;
                                ++var1;
                                var9 += var13;
                                var9 %= var10;
                            }
                        }
                    } else {
                        while (var1 <= var3) {
                            var14 = var2 >> 16;
                            if (var1 >= this.field7921 && var1 < this.field7938 && var14 >= this.field7923 && var14 < this.field7924 && var9 < var7) {
                                this.field7914[this.field7918 * var14 + var1] = var5;
                            }

                            var2 += var11;
                            ++var1;
                            var9 += var13;
                            var9 %= var10;
                        }
                    }
                } else {
                    var1 <<= 16;
                    var1 += 32768;
                    var3 <<= 16;
                    var11 = (int) Math.floor((double) var3 / (double) var4 + 0.5D);
                    var4 += var2;
                    var12 = var5 >>> 24;
                    var13 = (int) Math.sqrt((double) ((var11 >> 8) * (var11 >> 8) + 65536));
                    if (var6 == 0 || 1 == var6 && var12 == 255) {
                        while (var2 <= var4) {
                            var14 = var1 >> 16;
                            if (var2 >= this.field7923 && var2 < this.field7924 && var14 >= this.field7921 && var14 < this.field7938 && var9 < var7) {
                                this.field7914[var2 * this.field7918 + var14] = var5;
                            }

                            var1 += var11;
                            ++var2;
                            var9 += var13;
                            var9 %= var10;
                        }
                    } else if (var6 == 1) {
                        var5 = (var12 << 24) + ((var5 & 16711935) * var12 >> 8 & 16711935) + ((var5 & '\uff00') * var12 >> 8 & '\uff00');

                        for (var14 = 256 - var12; var2 <= var4; var9 %= var10) {
                            var15 = var1 >> 16;
                            if (var2 >= this.field7923 && var2 < this.field7924 && var15 >= this.field7921 && var15 < this.field7938 && var9 < var7) {
                                var16 = this.field7918 * var2 + var15;
                                var17 = this.field7914[var16];
                                var17 = (var14 * (var17 & '\uff00') >> 8 & '\uff00') + (var14 * (var17 & 16711935) >> 8 & 16711935);
                                this.field7914[this.field7918 * var2 + var15] = var5 + var17;
                            }

                            var1 += var11;
                            ++var2;
                            var9 += var13;
                        }
                    } else {
                        if (2 != var6) {
                            throw new IllegalArgumentException();
                        }

                        while (var2 <= var4) {
                            var14 = var1 >> 16;
                            if (var2 >= this.field7923 && var2 < this.field7924 && var14 >= this.field7921 && var14 < this.field7938 && var9 < var7) {
                                var15 = var14 + var2 * this.field7918;
                                var16 = this.field7914[var15];
                                var17 = var16 + var5;
                                var18 = (var16 & 16711935) + (var5 & 16711935);
                                var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                this.field7914[var15] = var17 - var16 | var16 - (var16 >>> 8);
                            }

                            var1 += var11;
                            ++var2;
                            var9 += var13;
                            var9 %= var10;
                        }
                    }
                }
            }
        }

    }

    public class305 method4795() {
        return new class305(0, "Pure Java", 1, "CPU", 0L);
    }

    public void method4820(int var1, int var2, int var3, int var4, int var5, int var6, class23 var7, int var8, int var9, int var10, int var11, int var12) {
        if (this.field7914 != null) {
            class924 var13 = (class924) var7;
            int[] var14 = var13.field10289;
            int[] var15 = var13.field10288;
            int var16 = this.field7923 > var9 ? -1278653805 * this.field7923 * 104031131 : var9;
            int var17 = this.field7924 < var9 + var14.length ? this.field7924 * 1656090535 * 63686679 : var9 + var14.length;
            var12 <<= 8;
            var10 <<= 8;
            var11 <<= 8;
            int var18 = var10 + var11;
            var12 %= var18;
            var3 -= var1;
            var4 -= var2;
            int var19;
            int var20;
            if (var4 + var3 < 0) {
                var19 = (int) (Math.sqrt((double) (var4 * var4 + var3 * var3)) * 256.0D);
                var20 = var19 % var18;
                var12 = var10 + var18 - var12 - var20;
                var12 %= var18;
                if (var12 < 0) {
                    var12 += var18;
                }

                var1 += var3;
                var3 = -var3;
                var2 += var4;
                var4 = -var4;
            }

            int var21;
            int var22;
            int var23;
            int var24;
            int var25;
            int var26;
            int var27;
            if (var3 > var4) {
                var2 <<= 16;
                var2 += 32768;
                var4 <<= 16;
                var19 = (int) Math.floor((double) var4 / (double) var3 + 0.5D);
                var3 += var1;
                var20 = var5 >>> 24;
                var21 = (int) Math.sqrt((double) (65536 + (var19 >> 8) * (var19 >> 8)));
                if (var6 != 0 && (var6 != 1 || 255 != var20)) {
                    if (1 == var6) {
                        var5 = (var20 << 24) + (var20 * (var5 & 16711935) >> 8 & 16711935) + ((var5 & '\uff00') * var20 >> 8 & '\uff00');

                        for (var22 = 256 - var20; var1 <= var3; var12 %= var18) {
                            var23 = var2 >> 16;
                            var24 = var23 - var9;
                            if (var1 >= this.field7921 && var1 < this.field7938 && var23 >= var16 && var23 < var17 && var12 < var10) {
                                var25 = var8 + var14[var24];
                                if (var1 >= var25 && var1 < var15[var24] + var25) {
                                    var26 = var1 + this.field7918 * var23;
                                    var27 = this.field7914[var26];
                                    var27 = (var22 * (var27 & '\uff00') >> 8 & '\uff00') + (var22 * (var27 & 16711935) >> 8 & 16711935);
                                    this.field7914[var26] = var27 + var5;
                                }
                            }

                            var2 += var19;
                            ++var1;
                            var12 += var21;
                        }
                    } else {
                        if (var6 != 2) {
                            throw new IllegalArgumentException();
                        }

                        while (var1 <= var3) {
                            var22 = var2 >> 16;
                            var23 = var22 - var9;
                            if (var1 >= this.field7921 && var1 < this.field7938 && var22 >= var16 && var22 < var17 && var12 < var10) {
                                var24 = var14[var23] + var8;
                                if (var1 >= var24 && var1 < var24 + var15[var23]) {
                                    var25 = this.field7918 * var22 + var1;
                                    var26 = this.field7914[var25];
                                    var27 = var5 + var26;
                                    int var28 = (var5 & 16711935) + (var26 & 16711935);
                                    var26 = (var27 - var28 & 65536) + (var28 & 16777472);
                                    this.field7914[var25] = var27 - var26 | var26 - (var26 >>> 8);
                                }
                            }

                            var2 += var19;
                            ++var1;
                            var12 += var21;
                            var12 %= var18;
                        }
                    }
                } else {
                    while (var1 <= var3) {
                        var22 = var2 >> 16;
                        var23 = var22 - var9;
                        if (var1 >= this.field7921 && var1 < this.field7938 && var22 >= var16 && var22 < var17 && var12 < var10) {
                            var24 = var14[var23] + var8;
                            if (var1 >= var24 && var1 < var24 + var15[var23]) {
                                this.field7914[var1 + this.field7918 * var22] = var5;
                            }
                        }

                        var2 += var19;
                        ++var1;
                        var12 += var21;
                        var12 %= var18;
                    }
                }
            } else {
                var1 <<= 16;
                var1 += 32768;
                var3 <<= 16;
                var19 = (int) Math.floor(0.5D + (double) var3 / (double) var4);
                var20 = (int) Math.sqrt((double) ((var19 >> 8) * (var19 >> 8) + 65536));
                var4 += var2;
                var21 = var5 >>> 24;
                if (var6 == 0 || var6 == 1 && var21 == 255) {
                    while (var2 <= var4) {
                        var22 = var1 >> 16;
                        var23 = var2 - var9;
                        if (var2 >= var16 && var2 < var17 && var22 >= this.field7921 && var22 < this.field7938 && var12 < var10 && var22 >= var8 + var14[var23] && var22 < var15[var23] + var8 + var14[var23]) {
                            this.field7914[var2 * this.field7918 + var22] = var5;
                        }

                        var1 += var19;
                        ++var2;
                        var12 += var20;
                        var12 %= var18;
                    }
                } else if (1 == var6) {
                    var5 = ((var5 & 16711935) * var21 >> 8 & 16711935) + ((var5 & '\uff00') * var21 >> 8 & '\uff00') + (var21 << 24);

                    for (var22 = 256 - var21; var2 <= var4; var12 %= var18) {
                        var23 = var1 >> 16;
                        var24 = var2 - var9;
                        if (var2 >= var16 && var2 < var17 && var23 >= this.field7921 && var23 < this.field7938 && var12 < var10 && var23 >= var8 + var14[var24] && var23 < var14[var24] + var8 + var15[var24]) {
                            var25 = var23 + var2 * this.field7918;
                            var26 = this.field7914[var25];
                            var26 = (var22 * (var26 & '\uff00') >> 8 & '\uff00') + ((var26 & 16711935) * var22 >> 8 & 16711935);
                            this.field7914[var23 + var2 * this.field7918] = var5 + var26;
                        }

                        var1 += var19;
                        ++var2;
                        var12 += var20;
                    }
                } else {
                    if (2 != var6) {
                        throw new IllegalArgumentException();
                    }

                    while (var2 <= var4) {
                        var22 = var1 >> 16;
                        var23 = var2 - var9;
                        if (var2 >= var16 && var2 < var17 && var22 >= this.field7921 && var22 < this.field7938 && var12 < var10 && var22 >= var8 + var14[var23] && var22 < var14[var23] + var8 + var15[var23]) {
                            var24 = this.field7918 * var2 + var22;
                            var25 = this.field7914[var24];
                            var26 = var25 + var5;
                            var27 = (var5 & 16711935) + (var25 & 16711935);
                            var25 = (var27 & 16777472) + (var26 - var27 & 65536);
                            this.field7914[var24] = var26 - var25 | var25 - (var25 >>> 8);
                        }

                        var1 += var19;
                        ++var2;
                        var12 += var20;
                        var12 %= var18;
                    }
                }
            }
        }

    }

    public void method4811(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (this.field7914 != null) {
            class258 var8 = this.method4450(Thread.currentThread());
            class585 var9 = var8.field7881;
            int var10 = var3 - var1;
            int var11 = var4 - var2;
            int var12 = var10 >= 0 ? var10 : -var10;
            int var13 = var11 >= 0 ? var11 : -var11;
            int var14 = var12;
            if (var12 < var13) {
                var14 = var13;
            }

            if (var14 != 0) {
                int var15 = (var10 << 16) / var14;
                int var16 = (var11 << 16) / var14;
                var10 += var15 >> 16;
                var11 += var16 >> 16;
                if (var16 <= var15) {
                    var15 = -var15;
                } else {
                    var16 = -var16;
                }

                int var17 = var16 * var6 >> 17;
                int var18 = var16 * var6 + 1 >> 17;
                int var19 = var15 * var6 >> 17;
                int var20 = 1 + var6 * var15 >> 17;
                var1 -= var9.method335();
                var2 -= var9.method336();
                int var21 = var17 + var1;
                int var22 = var1 - var18;
                int var23 = var1 + var10 - var18;
                int var24 = var17 + var1 + var10;
                int var25 = var2 + var19;
                int var26 = var2 - var20;
                int var27 = var11 + var2 - var20;
                int var28 = var2 + var11 + var19;
                if (var7 == 0) {
                    var9.field335 = 0;
                } else {
                    if (var7 != 1) {
                        throw new IllegalArgumentException();
                    }

                    var9.field335 = 255 - (var5 >>> 24);
                }

                this.method4869(false);
                var9.field336 = var21 < 0 || var21 > var9.field338 || var22 < 0 || var22 > var9.field338 || var23 < 0 || var23 > var9.field338;
                var9.method341(true, false, false, (float) var25, (float) var26, (float) var27, (float) var21, (float) var22, (float) var23, 100.0F, 100.0F, 100.0F, var5);
                var9.field336 = var21 < 0 || var21 > var9.field338 || var23 < 0 || var23 > var9.field338 || var24 < 0 || var24 > var9.field338;
                var9.method341(true, false, false, (float) var25, (float) var27, (float) var28, (float) var21, (float) var23, (float) var24, 100.0F, 100.0F, 100.0F, var5);
                this.method4869(true);
            }
        }

    }

    boolean method4448(int var1) {
        return super.field8581.method4621(var1, (short) 19583);
    }

    public class792 method4849(int var1) {
        return null;
    }

    public void method4850(class792 var1) {
    }

    public boolean method4881() {
        return false;
    }

    public class23 method4857(int var1, int var2, int[] var3, int[] var4) {
        return new class924(var1, var2, var3, var4);
    }

    public class48 method4856(int var1, int var2, int var3, int var4, boolean var5) {
        if (this.field7914 == null) {
            throw new IllegalStateException("");
        } else {
            int[] var6 = new int[var3 * var4];
            int var7 = var2 * this.field7918 + var1;
            int var8 = this.field7918 - var3;

            for (int var9 = 0; var9 < var4; ++var9) {
                int var10 = var3 * var9;

                for (int var11 = 0; var11 < var3; ++var11) {
                    var6[var11 + var10] = this.field7914[var7++];
                }

                var7 += var8;
            }

            if (var5) {
                return new class774(this, var6, var3, var4);
            } else {
                return new class483(this, var6, var3, var4);
            }
        }
    }

    public void method4880(int var1, class23 var2, int var3, int var4) {
        if (this.field7914 != null) {
            class924 var5 = (class924) var2;
            int[] var6 = var5.field10289;
            int[] var7 = var5.field10288;
            int var8;
            if (this.field7924 < var6.length + var4) {
                var8 = this.field7924 - var4;
            } else {
                var8 = var6.length;
            }

            int var9;
            if (this.field7923 > var4) {
                var9 = this.field7923 - var4;
                var4 = this.field7923;
            } else {
                var9 = 0;
            }

            if (var8 - var9 > 0) {
                int var10 = this.field7918 * var4;

                for (int var11 = var9; var11 < var8; ++var11) {
                    int var12 = var3 + var6[var11];
                    int var13 = var7[var11];
                    if (this.field7921 > var12) {
                        var13 -= this.field7921 - var12;
                        var12 = this.field7921;
                    }

                    if (this.field7938 < var12 + var13) {
                        var13 = this.field7938 - var12;
                    }

                    var12 += var10;

                    for (int var14 = -var13; var14 < 0; ++var14) {
                        this.field7914[var12++] = var1;
                    }

                    var10 += this.field7918;
                }
            }
        }

    }

    public int method4817(int var1, int var2) {
        return var1 | var2;
    }

    public SceneGraphLevel method4864(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
        return new class885(this, var6, var7, var1, var2, var3, var4, var5);
    }

    public class135 method5048() {
        class258 var1 = this.method4450(Thread.currentThread());
        return var1.field7908;
    }

    public class639 method4877(int var1, int var2, int var3, int var4, int var5, float var6) {
        return null;
    }

    public void method4844(int var1, class639[] var2) {
    }

    void method4449(int var1) {
        this.field7948[var1].method4439(Thread.currentThread(), (byte) -84);
    }

    class258 method4450(Runnable var1) {
        for (int var2 = 0; var2 < this.field7946; ++var2) {
            if (this.field7948[var2].field7868 == var1) {
                return this.field7948[var2];
            }
        }

        return null;
    }

    public void method4866(class874 var1) {
        this.method4451(this.field7914 != null, this.field7920 != null, false, var1);
    }

    void method4451(boolean var1, boolean var2, boolean var3, class874 var4) {
        class258 var5 = this.method4450(Thread.currentThread());
        class846 var6 = var4.field9777.field9787;

        for (class846 var7 = var6.field8726; var7 != var6; var7 = var7.field8726) {
            class686 var8 = (class686) var7;
            int var9 = var8.field7608 >> 12;
            int var10 = var8.field7612 >> 12;
            int var11 = var8.field7613 >> 12;
            float var12 = (float) var9 * this.field7934.field325[2] + (float) var10 * this.field7934.field325[6] + this.field7934.field325[10] * (float) var11 + this.field7934.field325[14];
            float var13 = this.field7934.field325[15] + this.field7934.field325[11] * (float) var11 + this.field7934.field325[7] * (float) var10 + (float) var9 * this.field7934.field325[3];
            if (var12 >= -var13) {
                float var14 = this.field7944 * var12 / var13 + this.field7951;
                if (var12 <= var5.field7894) {
                    float var15 = this.field7934.field325[12] + (float) var10 * this.field7934.field325[4] + (float) var9 * this.field7934.field325[0] + this.field7934.field325[8] * (float) var11;
                    float var16 = this.field7934.field325[13] + (float) var11 * this.field7934.field325[9] + (float) var10 * this.field7934.field325[5] + this.field7934.field325[1] * (float) var9;
                    if (var15 >= -var13 && var15 <= var13 && var16 >= -var13 && var16 <= var13) {
                        float var17 = (float) var8.field7614 / 4096.0F;
                        float var18 = var15 + this.field7933.field325[0] * var17;
                        float var19 = var17 * this.field7933.field325[3] + var13;
                        float var20 = this.field7952 + var15 * this.field7940 / var13;
                        float var21 = var16 * this.field7942 / var13 + this.field7943;
                        float var22 = this.field7952 + var18 * this.field7940 / var19;
                        this.method4452(var1, var2, var3, var8, (int) var20, (int) var21, var14, (int) (var22 < var20 ? var20 - var22 : var22 - var20));
                    }
                }
            }
        }

    }

    void method4452(boolean var1, boolean var2, boolean var3, class686 var4, int var5, int var6, float var7, int var8) {
        int var9 = var4.field7617;
        int var10 = var8;
        var8 <<= 1;
        if (-1 == var9) {
            this.method4467(var2, var5, var6, var7, var10, var4.field7615, 1);
        } else {
            if (var9 != this.field7953) {
                class48 var11 = (class48) this.field7917.method2974((long) var9);
                if (var11 == null) {
                    int[] var12 = this.method4445(var9);
                    if (var12 == null) {
                        return;
                    }

                    int var13 = this.method4447(var9) ? 64 : 1107560907 * this.field7949 * -806628381;
                    var11 = this.method4854(var12, 0, var13, var13, var13, 105789167);
                    this.field7917.method2984(var11, (long) var9);
                }

                this.field7953 = var9;
                this.field7939 = var11;
            }

            ++var8;
            ((class360) this.field7939).method1469(var1, var2, var3, var5 - var10, var6 - var10, var7, var8, var8, 0, var4.field7615, 1, 1, false);
        }

    }

    void method4453(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, int var9, int var10, int var11, int var12) {
        if (var7 != 0 && var8 != 0) {
            if (var9 != 65535) {
                class414 var13 = super.field8581.method4625(var9, 1695034515);
                if (!var13.field9378) {
                    if (var9 != this.field7953) {
                        class48 var14 = (class48) this.field7917.method2974((long) var9);
                        if (var14 == null) {
                            int[] var15 = this.method4445(var9);
                            if (var15 == null) {
                                return;
                            }

                            int var16 = this.method4447(var9) ? 64 : this.field7949 * -806628381 * 1107560907;
                            var14 = this.method4854(var15, 0, var16, var16, var16, 2014032256);
                            this.field7917.method2984(var14, (long) var9);
                        }

                        this.field7953 = var9;
                        this.field7939 = var14;
                    }

                    ((class360) this.field7939).method1469(var1, var2, var3, var4 - var7, var5 - var8, var6, var7 << 1, var8 << 1, var11, var10, var12, 1, var13.field9382 != 2);
                    return;
                }
            }

            this.method4467(var2, var4, var5, var6, var7, var10, var12);
        }

    }

    int method4454(int var1) {
        return super.field8581.method4625(var1, 2099649978).field9386 & '\uffff';
    }

    void method4455(int var1, int var2, int[] var3, float[] var4) {
        this.field7918 = var1;
        this.field7919 = var2;
        this.field7914 = var3;
        this.field7920 = var4;

        for (int var5 = 0; var5 < this.field7946; ++var5) {
            this.field7948[var5].method4440(-455629367);
        }

        this.method4827();
        this.method4824();
    }

    public void method5054(class344 var1) {
        this.field7933.method269(var1);
        this.method4456();
    }

    public class344 method4870() {
        return new class344(this.field7933);
    }

    public void method5063(float var1) {
        this.field7930 = (int) (65535.0F * var1);
    }

    public int method4876() {
        return 0;
    }

    public void method4835(int var1) {
    }

    void method4456() {
        this.field7947.method272(this.field7931);
        this.field7934.method269(this.field7947);
        this.field7934.method271(this.field7933);
        this.field7934.method284(this.field7935[0]);
        this.field7934.method285(this.field7935[1]);
        this.field7934.method283(this.field7935[2]);
        this.field7934.method297(this.field7935[3]);
        this.field7934.method298(this.field7935[4]);
        this.field7934.method290(this.field7935[5]);
        float var1 = this.field7933.method282();
        float var2 = this.field7933.field325[10] * (var1 - 255.0F) + this.field7933.field325[14];
        float var3 = this.field7933.field325[10] * var1 + this.field7933.field325[14];
        float var4 = var3 - var2;

        for (int var5 = 0; var5 < this.field7946; ++var5) {
            class258 var6 = this.field7948[var5];
            var6.field7894 = var2;
            var6.field7872 = var4;
        }

    }

    public void method4867(class135 var1) {
        this.field7931 = var1;
        this.method4456();
    }

    public void method4950(class621 var1) {
    }

    void method4457() {
        int var1 = this.field7938 - this.field7921;
        int var2 = this.field7924 - this.field7923;
        float var3 = this.field7940 = (float) this.field7927 / 2.0F;
        float var4 = this.field7942 = (float) this.field7916 / 2.0F;
        this.field7952 = var3 + (float) this.field7936;
        this.field7943 = var4 + (float) this.field7937;

        int var5;
        for (var5 = 0; var5 < this.field7946; ++var5) {
            class258 var6 = this.field7948[var5];
            class585 var7 = var6.field7881;
            var7.field333 = var3;
            var7.field342 = var4;
            var7.field339 = this.field7952 - (float) this.field7921;
            var7.field341 = this.field7943 - (float) this.field7923;
            var7.field338 = var1;
            var7.field354 = var2;
        }

        var5 = this.field7923 * this.field7918 + this.field7921;

        for (int var8 = this.field7923; var8 < this.field7924; ++var8) {
            for (int var9 = 0; var9 < this.field7946; ++var9) {
                this.field7948[var9].field7881.field363[var8 - this.field7923] = var5;
            }

            var5 += this.field7918;
        }

    }

    public void method4882() {
    }

    public boolean method4883() {
        return false;
    }

    public void method4845(int var1, int var2, int var3, int var4, int var5, int var6, class23 var7, int var8, int var9) {
        if (this.field7914 != null) {
            class924 var10 = (class924) var7;
            int[] var11 = var10.field10289;
            int[] var12 = var10.field10288;
            int var13 = this.field7923 > var9 ? this.field7923 * 104031131 * -1278653805 : var9;
            int var14 = this.field7924 < var9 + var11.length ? 63686679 * this.field7924 * 1656090535 : var9 + var11.length;
            var3 -= var1;
            var4 -= var2;
            if (var3 + var4 < 0) {
                var1 += var3;
                var3 = -var3;
                var2 += var4;
                var4 = -var4;
            }

            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            if (var3 > var4) {
                var2 <<= 16;
                var2 += 32768;
                var4 <<= 16;
                var15 = (int) Math.floor(0.5D + (double) var4 / (double) var3);
                var3 += var1;
                if (var1 < this.field7921) {
                    var2 += (this.field7921 - var1) * var15;
                    var1 = this.field7921;
                }

                if (var3 >= this.field7938) {
                    var3 = this.field7938 - 1;
                }

                var16 = var5 >>> 24;
                if (var6 == 0 || var6 == 1 && 255 == var16) {
                    while (var1 <= var3) {
                        var17 = var2 >> 16;
                        var18 = var17 - var9;
                        if (var17 >= var13 && var17 < var14) {
                            var19 = var11[var18] + var8;
                            if (var1 >= var19 && var1 < var12[var18] + var19) {
                                this.field7914[this.field7918 * var17 + var1] = var5;
                            }
                        }

                        var2 += var15;
                        ++var1;
                    }
                } else if (1 == var6) {
                    var5 = (var16 << 24) + (var16 * (var5 & 16711935) >> 8 & 16711935) + ((var5 & '\uff00') * var16 >> 8 & '\uff00');

                    for (var17 = 256 - var16; var1 <= var3; ++var1) {
                        var18 = var2 >> 16;
                        var19 = var18 - var9;
                        if (var18 >= var13 && var18 < var14) {
                            var20 = var11[var19] + var8;
                            if (var1 >= var20 && var1 < var12[var19] + var20) {
                                var21 = var1 + this.field7918 * var18;
                                var22 = this.field7914[var21];
                                var22 = ((var22 & '\uff00') * var17 >> 8 & '\uff00') + (var17 * (var22 & 16711935) >> 8 & 16711935);
                                this.field7914[var21] = var22 + var5;
                            }
                        }

                        var2 += var15;
                    }
                } else {
                    if (2 != var6) {
                        throw new IllegalArgumentException();
                    }

                    while (var1 <= var3) {
                        var17 = var2 >> 16;
                        var18 = var17 - var9;
                        if (var17 >= var13 && var17 < var14) {
                            var19 = var11[var18] + var8;
                            if (var1 >= var19 && var1 < var19 + var12[var18]) {
                                var20 = var1 + var17 * this.field7918;
                                var21 = this.field7914[var20];
                                var22 = var5 + var21;
                                var23 = (var5 & 16711935) + (var21 & 16711935);
                                var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                this.field7914[var20] = var22 - var21 | var21 - (var21 >>> 8);
                            }
                        }

                        var2 += var15;
                        ++var1;
                    }
                }
            } else {
                var1 <<= 16;
                var1 += 32768;
                var3 <<= 16;
                var15 = (int) Math.floor((double) var3 / (double) var4 + 0.5D);
                var4 += var2;
                if (var2 < var13) {
                    var1 += (var13 - var2) * var15;
                    var2 = var13;
                }

                if (var4 >= var14) {
                    var4 = var14 - 1;
                }

                var16 = var5 >>> 24;
                if (var6 == 0 || 1 == var6 && var16 == 255) {
                    while (var2 <= var4) {
                        var17 = var1 >> 16;
                        var18 = var2 - var9;
                        var19 = var11[var18] + var8;
                        if (var17 >= this.field7921 && var17 < this.field7938 && var17 >= var19 && var17 < var12[var18] + var19) {
                            this.field7914[this.field7918 * var2 + var17] = var5;
                        }

                        var1 += var15;
                        ++var2;
                    }
                } else if (var6 == 1) {
                    var5 = (var16 * (var5 & 16711935) >> 8 & 16711935) + (var16 * (var5 & '\uff00') >> 8 & '\uff00') + (var16 << 24);

                    for (var17 = 256 - var16; var2 <= var4; ++var2) {
                        var18 = var1 >> 16;
                        var19 = var2 - var9;
                        var20 = var8 + var11[var19];
                        if (var18 >= this.field7921 && var18 < this.field7938 && var18 >= var20 && var18 < var12[var19] + var20) {
                            var21 = this.field7918 * var2 + var18;
                            var22 = this.field7914[var21];
                            var22 = ((var22 & '\uff00') * var17 >> 8 & '\uff00') + (var17 * (var22 & 16711935) >> 8 & 16711935);
                            this.field7914[var2 * this.field7918 + var18] = var22 + var5;
                        }

                        var1 += var15;
                    }
                } else {
                    if (var6 != 2) {
                        throw new IllegalArgumentException();
                    }

                    while (var2 <= var4) {
                        var17 = var1 >> 16;
                        var18 = var2 - var9;
                        var19 = var8 + var11[var18];
                        if (var17 >= this.field7921 && var17 < this.field7938 && var17 >= var19 && var17 < var19 + var12[var18]) {
                            var20 = this.field7918 * var2 + var17;
                            var21 = this.field7914[var20];
                            var22 = var21 + var5;
                            var23 = (var5 & 16711935) + (var21 & 16711935);
                            var21 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field7914[var20] = var22 - var21 | var21 - (var21 >>> 8);
                        }

                        var1 += var15;
                        ++var2;
                    }
                }
            }
        }

    }

    public void method4875(boolean var1) {
        this.field7950 = var1;
        this.field7922.method2977();
    }

    public class344 method4860() {
        class258 var1 = this.method4450(Thread.currentThread());
        return var1.field7879;
    }

    public class621 method5049(class621 var1, class621 var2, float var3, class621 var4) {
        return null;
    }

    public void method4888() {
        for (int var1 = 0; var1 < this.field7948.length; ++var1) {
            this.field7948[var1].field7873 = this.field7948[var1].field7874;
            this.field7948[var1].field7875 = false;
        }

    }

    public void method4840(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {
        boolean var14 = this.field7914 != null;
        boolean var15 = this.field7920 != null;
        if (var14 || var15) {
            class258 var16 = this.method4450(Thread.currentThread());
            class585 var17 = var16.field7881;
            var17.field332 = false;
            var1 -= this.field7921;
            var4 -= this.field7921;
            var7 -= this.field7921;
            var2 -= this.field7923;
            var5 -= this.field7923;
            var8 -= this.field7923;
            var17.field336 = var1 < 0 || var1 > var17.field338 || var4 < 0 || var4 > var17.field338 || var7 < 0 || var7 > var17.field338;
            int var18 = var10 >>> 24;
            if (var13 == 0 || var13 == 1 && 255 == var18) {
                var17.field335 = 0;
                var17.field364 = false;
                var17.method340(var14, var15, false, (float) var2, (float) var5, (float) var8, (float) var1, (float) var4, (float) var7, var3, var6, var9, var10, var11, var12);
            } else if (1 == var13) {
                var17.field335 = 255 - var18;
                var17.field364 = false;
                var17.method340(var14, var15, false, (float) var2, (float) var5, (float) var8, (float) var1, (float) var4, (float) var7, var3, var6, var9, var10, var11, var12);
            } else {
                if (2 != var13) {
                    throw new IllegalArgumentException();
                }

                var17.field335 = 128;
                var17.field364 = true;
                var17.method340(var14, var15, false, (float) var2, (float) var5, (float) var8, (float) var1, (float) var4, (float) var7, var3, var6, var9, var10, var11, var12);
            }

            var17.field332 = true;
        }

    }

    public void method4890(float var1, float var2, float var3, float[] var4) {
        float var5 = this.field7934.field325[11] * var3 + var1 * this.field7934.field325[3] + this.field7934.field325[15] + var2 * this.field7934.field325[7];
        float var6 = var3 * this.field7934.field325[8] + this.field7934.field325[12] + this.field7934.field325[0] * var1 + var2 * this.field7934.field325[4];
        float var7 = this.field7934.field325[5] * var2 + this.field7934.field325[1] * var1 + this.field7934.field325[13] + this.field7934.field325[9] * var3;
        float var8 = var1 * this.field7947.field325[2] + this.field7947.field325[14] + this.field7947.field325[6] * var2 + this.field7947.field325[10] * var3;
        var4[0] = var6 * this.field7940 / var5 + this.field7952;
        var4[1] = this.field7943 + this.field7942 * var7 / var5;
        var4[2] = var8;
    }

    public void method4889(float var1, float var2, float var3, float[] var4) {
        float var5 = var3 * this.field7934.field325[10] + this.field7934.field325[2] * var1 + this.field7934.field325[14] + this.field7934.field325[6] * var2;
        float var6 = var3 * this.field7934.field325[11] + this.field7934.field325[15] + this.field7934.field325[3] * var1 + var2 * this.field7934.field325[7];
        if (var5 >= -var6 && var5 <= var6) {
            float var7 = this.field7934.field325[12] + var1 * this.field7934.field325[0] + var2 * this.field7934.field325[4] + var3 * this.field7934.field325[8];
            if (var7 >= -var6 && var7 <= var6) {
                float var8 = this.field7934.field325[5] * var2 + this.field7934.field325[13] + var1 * this.field7934.field325[1] + this.field7934.field325[9] * var3;
                if (var8 >= -var6 && var8 <= var6) {
                    float var9 = this.field7947.field325[10] * var3 + var1 * this.field7947.field325[2] + this.field7947.field325[14] + this.field7947.field325[6] * var2;
                    var4[0] = this.field7952 + var7 * this.field7940 / var6;
                    var4[1] = this.field7942 * var8 / var6 + this.field7943;
                    var4[2] = var9;
                } else {
                    var4[2] = Float.NaN;
                    var4[1] = Float.NaN;
                    var4[0] = Float.NaN;
                }
            } else {
                var4[2] = Float.NaN;
                var4[1] = Float.NaN;
                var4[0] = Float.NaN;
            }
        } else {
            var4[2] = Float.NaN;
            var4[1] = Float.NaN;
            var4[0] = Float.NaN;
        }

    }

    public void method4887(int var1, class919 var2) {
        class258 var3 = this.method4450(Thread.currentThread());
        var3.field7885 = var1;
        var3.field7873 = var2.field10426;
        var3.field7904 = var2.field10425;
    }

    void method4458(int var1) {
        this.field7946 = var1;
        this.field7948 = new class258[this.field7946];

        for (int var2 = 0; var2 < this.field7946; ++var2) {
            this.field7948[var2] = new class258(this);
        }

    }

    public void method4831(int var1, int var2) {
        if ((var1 & 1) != 0) {
            this.method4984(0, 0, this.field7918, this.field7919, var2, 0);
        }

        if ((var1 & 2) != 0) {
            this.method4446();
        }

    }

    void method5060(float var1, float var2, float var3, float var4, float var5, float var6) {
    }

    public void method4830(int[] var1) {
        var1[0] = this.field7921;
        var1[1] = this.field7923;
        var1[2] = this.field7938;
        var1[3] = this.field7924;
    }

    boolean method4460(int var1) {
        return super.field8581.method4625(var1, 212515321).field9394 || super.field8581.method4625(var1, 1397930760).field9395;
    }

    public class727 method4936(class230 var1, class922[] var2, boolean var3) {
        int[] var4 = new int[var2.length];
        int[] var5 = new int[var2.length];
        boolean var6 = false;

        for (int var7 = 0; var7 < var2.length; ++var7) {
            var4[var7] = var2[var7].field10269;
            var5[var7] = var2[var7].field10273;
            if (var2[var7].field10276 != null) {
                var6 = true;
            }
        }

        if (var3) {
            if (var6) {
                return new class364(this, var1, var2, var4, var5);
            } else {
                return new class897(this, var1, var2, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class388(this, var1, var2, var4, var5);
        }
    }

    public int[] method5051(int var1, int var2, int var3, int var4) {
        if (this.field7914 == null) {
            throw new IllegalStateException("");
        } else {
            int[] var5 = new int[var3 * var4];
            int var6 = 0;

            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = var1 + this.field7918 * (var2 + var7);

                for (int var9 = 0; var9 < var3; ++var9) {
                    var5[var6++] = this.field7914[var9 + var8];
                }
            }

            return var5;
        }
    }

    public void method5046() {
    }

    public void method4886(int var1, class919 var2) {
        for (int var3 = 0; var3 < this.field7948.length; ++var3) {
            this.field7948[var3].field7874 = this.field7948[var3].field7873;
            this.field7948[var3].field7885 = var1;
            this.field7948[var3].field7873 = var2.field10426;
            this.field7948[var3].field7904 = var2.field10425;
            this.field7948[var3].field7875 = true;
        }

    }

    public void method4909() {
    }

    public void method4885(int var1, int var2, int var3, int var4) {
    }

    public void method4801(int var1) {
        int var2 = var1 - this.field7915;

        for (class340 var3 = (class340) this.field7922.method2980(1895439164); var3 != null; var3 = (class340) this.field7922.method2981(-150689583)) {
            if (var3.field162) {
                var3.field161 += var2;
                int var4 = var3.field161 / 50;
                if (var4 > 0) {
                    class414 var5 = super.field8581.method4625(var3.field163, 1049472051);
                    float var6 = var5.field9372 ? 64.0F : 128.0F;
                    var3.method139((int) ((float) var2 / 1000.0F * (float) var5.field9389 / 64.0F * var6), (int) (var6 * ((float) var5.field9363 * ((float) var2 / 1000.0F) / 64.0F)));
                    var3.field161 -= 50 * var4;
                }

                var3.field162 = false;
            }
        }

        this.field7915 = var1;
        this.field7917.method2976(5, -253785523);
        this.field7922.method2976(5, -559517412);
    }

    public void method4934(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (this.field7914 != null) {
            var3 -= var1;
            var4 -= var2;
            if (var4 == 0) {
                if (var3 >= 0) {
                    this.method4839(var1, var2, 1 + var3, var5, var6);
                } else {
                    this.method4839(var1 + var3, var2, -var3 + 1, var5, var6);
                }
            } else if (var3 == 0) {
                if (var4 >= 0) {
                    this.method4843(var1, var2, 1 + var4, var5, var6);
                } else {
                    this.method4843(var1, var2 + var4, 1 + -var4, var5, var6);
                }
            } else {
                if (var3 + var4 < 0) {
                    var1 += var3;
                    var3 = -var3;
                    var2 += var4;
                    var4 = -var4;
                }

                int var7;
                int var8;
                int var9;
                int var10;
                int var11;
                int var12;
                int var13;
                if (var3 > var4) {
                    var2 <<= 16;
                    var2 += 32768;
                    var4 <<= 16;
                    var7 = (int) Math.floor(0.5D + (double) var4 / (double) var3);
                    var3 += var1;
                    if (var1 < this.field7921) {
                        var2 += var7 * (this.field7921 - var1);
                        var1 = this.field7921;
                    }

                    if (var3 >= this.field7938) {
                        var3 = this.field7938 - 1;
                    }

                    var8 = var5 >>> 24;
                    if (var6 == 0 || var6 == 1 && var8 == 255) {
                        while (var1 <= var3) {
                            var9 = var2 >> 16;
                            if (var9 >= this.field7923 && var9 < this.field7924) {
                                this.field7914[var1 + var9 * this.field7918] = var5;
                            }

                            var2 += var7;
                            ++var1;
                        }
                    } else if (1 == var6) {
                        var5 = (var8 << 24) + (var8 * (var5 & '\uff00') >> 8 & '\uff00') + (var8 * (var5 & 16711935) >> 8 & 16711935);

                        for (var9 = 256 - var8; var1 <= var3; ++var1) {
                            var10 = var2 >> 16;
                            if (var10 >= this.field7923 && var10 < this.field7924) {
                                var11 = var1 + var10 * this.field7918;
                                var12 = this.field7914[var11];
                                var12 = (var9 * (var12 & '\uff00') >> 8 & '\uff00') + ((var12 & 16711935) * var9 >> 8 & 16711935);
                                this.field7914[var11] = var5 + var12;
                            }

                            var2 += var7;
                        }
                    } else {
                        if (2 != var6) {
                            throw new IllegalArgumentException();
                        }

                        while (var1 <= var3) {
                            var9 = var2 >> 16;
                            if (var9 >= this.field7923 && var9 < this.field7924) {
                                var10 = var9 * this.field7918 + var1;
                                var11 = this.field7914[var10];
                                var12 = var5 + var11;
                                var13 = (var11 & 16711935) + (var5 & 16711935);
                                var11 = (var12 - var13 & 65536) + (var13 & 16777472);
                                this.field7914[var10] = var12 - var11 | var11 - (var11 >>> 8);
                            }

                            var2 += var7;
                            ++var1;
                        }
                    }
                } else {
                    var1 <<= 16;
                    var1 += 32768;
                    var3 <<= 16;
                    var7 = (int) Math.floor(0.5D + (double) var3 / (double) var4);
                    var4 += var2;
                    if (var2 < this.field7923) {
                        var1 += (this.field7923 - var2) * var7;
                        var2 = this.field7923;
                    }

                    if (var4 >= this.field7924) {
                        var4 = this.field7924 - 1;
                    }

                    var8 = var5 >>> 24;
                    if (var6 == 0 || var6 == 1 && var8 == 255) {
                        while (var2 <= var4) {
                            var9 = var1 >> 16;
                            if (var9 >= this.field7921 && var9 < this.field7938) {
                                this.field7914[this.field7918 * var2 + var9] = var5;
                            }

                            var1 += var7;
                            ++var2;
                        }
                    } else if (1 == var6) {
                        var5 = ((var5 & 16711935) * var8 >> 8 & 16711935) + ((var5 & '\uff00') * var8 >> 8 & '\uff00') + (var8 << 24);

                        for (var9 = 256 - var8; var2 <= var4; ++var2) {
                            var10 = var1 >> 16;
                            if (var10 >= this.field7921 && var10 < this.field7938) {
                                var11 = var10 + this.field7918 * var2;
                                var12 = this.field7914[var11];
                                var12 = (var9 * (var12 & 16711935) >> 8 & 16711935) + (var9 * (var12 & '\uff00') >> 8 & '\uff00');
                                this.field7914[var10 + var2 * this.field7918] = var5 + var12;
                            }

                            var1 += var7;
                        }
                    } else {
                        if (2 != var6) {
                            throw new IllegalArgumentException();
                        }

                        while (var2 <= var4) {
                            var9 = var1 >> 16;
                            if (var9 >= this.field7921 && var9 < this.field7938) {
                                var10 = var9 + var2 * this.field7918;
                                var11 = this.field7914[var10];
                                var12 = var5 + var11;
                                var13 = (var11 & 16711935) + (var5 & 16711935);
                                var11 = (var12 - var13 & 65536) + (var13 & 16777472);
                                this.field7914[var10] = var12 - var11 | var11 - (var11 >>> 8);
                            }

                            var1 += var7;
                            ++var2;
                        }
                    }
                }
            }
        }

    }

    int method4462(int var1) {
        return super.field8581.method4625(var1, 1059221897).field9382;
    }

    public class135 method4868() {
        return new class135(this.field7931);
    }

    void method4463(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        if (this.field7914 != null && var1 >= this.field7921 && var1 < this.field7938) {
            int var9 = this.field7918 * var2 + var1;
            int var10 = var4 >>> 24;
            int var11 = var7 + var6;
            int var12 = var8 % var11;
            int var13;
            if (var5 != 0 && (1 != var5 || 255 != var10)) {
                int var14;
                int var15;
                int var16;
                if (1 == var5) {
                    var4 = (var10 * (var4 & '\uff00') >> 8 & '\uff00') + ((var4 & 16711935) * var10 >> 8 & 16711935) + (var10 << 24);
                    var13 = 256 - var10;

                    for (var14 = 0; var14 < var3; var12 %= var11) {
                        if (var14 + var2 >= this.field7923 && var14 + var2 < this.field7924 && var12 < var6) {
                            var15 = var14 * this.field7918 + var9;
                            var16 = this.field7914[var15];
                            var16 = ((var16 & 16711935) * var13 >> 8 & 16711935) + ((var16 & '\uff00') * var13 >> 8 & '\uff00');
                            this.field7914[var15] = var4 + var16;
                        }

                        ++var14;
                        ++var12;
                    }
                } else {
                    if (var5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    for (var13 = 0; var13 < var3; var12 %= var11) {
                        if (var13 + var2 >= this.field7923 && var2 + var13 < this.field7924 && var12 < var6) {
                            var14 = var13 * this.field7918 + var9;
                            var15 = this.field7914[var14];
                            var16 = var4 + var15;
                            int var17 = (var15 & 16711935) + (var4 & 16711935);
                            var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                            this.field7914[var14] = var16 - var15 | var15 - (var15 >>> 8);
                        }

                        ++var13;
                        ++var12;
                    }
                }
            } else {
                for (var13 = 0; var13 < var3; var12 %= var11) {
                    if (var13 + var2 >= this.field7923 && var2 + var13 < this.field7924 && var12 < var6) {
                        this.field7914[var13 * this.field7918 + var9] = var4;
                    }

                    ++var13;
                    ++var12;
                }
            }
        }

    }

    public void method4829(int var1, int var2, int var3, int var4) {
        if (this.field7921 < var1) {
            this.field7921 = var1;
        }

        if (this.field7923 < var2) {
            this.field7923 = var2;
        }

        if (this.field7938 > var3) {
            this.field7938 = var3;
        }

        if (this.field7924 > var4) {
            this.field7924 = var4;
        }

        this.method4457();
    }

    void method4465(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        if (this.field7914 != null && var2 >= this.field7923 && var2 < this.field7924) {
            int var9 = var2 * this.field7918 + var1;
            int var10 = var4 >>> 24;
            int var11 = var7 + var6;
            int var12 = var8 % var11;
            int var13;
            if (var5 != 0 && (var5 != 1 || 255 != var10)) {
                int var14;
                int var15;
                if (1 == var5) {
                    var4 = (var10 << 24) + ((var4 & 16711935) * var10 >> 8 & 16711935) + ((var4 & '\uff00') * var10 >> 8 & '\uff00');
                    var13 = 256 - var10;

                    for (var14 = 0; var14 < var3; var12 %= var11) {
                        if (var14 + var1 >= this.field7921 && var14 + var1 < this.field7938 && var12 < var6) {
                            var15 = this.field7914[var9 + var14];
                            var15 = ((var15 & 16711935) * var13 >> 8 & 16711935) + (var13 * (var15 & '\uff00') >> 8 & '\uff00');
                            this.field7914[var9 + var14] = var4 + var15;
                        }

                        ++var14;
                        ++var12;
                    }
                } else {
                    if (var5 != 2) {
                        throw new IllegalArgumentException();
                    }

                    for (var13 = 0; var13 < var3; var12 %= var11) {
                        if (var1 + var13 >= this.field7921 && var13 + var1 < this.field7938 && var12 < var6) {
                            var14 = this.field7914[var9 + var13];
                            var15 = var4 + var14;
                            int var16 = (var4 & 16711935) + (var14 & 16711935);
                            var14 = (var15 - var16 & 65536) + (var16 & 16777472);
                            this.field7914[var9 + var13] = var15 - var14 | var14 - (var14 >>> 8);
                        }

                        ++var13;
                        ++var12;
                    }
                }
            } else {
                for (var13 = 0; var13 < var3; var12 %= var11) {
                    if (var13 + var1 >= this.field7921 && var13 + var1 < this.field7938 && var12 < var6) {
                        this.field7914[var13 + var9] = var4;
                    }

                    ++var13;
                    ++var12;
                }
            }
        }

    }

    public class893 method5058(int var1, int var2) {
        return new class86(var1, var2);
    }

    public int method4802() {
        return 0;
    }

    public boolean method5028() {
        return false;
    }

    public void method5038(int var1) {
        class597.field2102 = var1;
        class597.field2079 = var1;
        if (this.field7946 > 1) {
            throw new IllegalStateException();
        } else {
            this.method4458(this.field7946);
            this.method4449(0);
        }
    }

    public class879 method4861(class25 var1, int var2, int var3, int var4, int var5) {
        return new class597(this, var1, var2, var4, var5, var3);
    }

    public class48 method4853(int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
        boolean var7 = false;
        int var8 = var2;

        for (int var9 = 0; var9 < var5; ++var9) {
            for (int var10 = 0; var10 < var4; ++var10) {
                int var11 = var1[var8++] >>> 24;
                if (var11 != 0 && 255 != var11) {
                    var7 = true;
                    return (class48) (var7 ? new class774(this, var1, var2, var3, var4, var5, var6) : new class483(this, var1, var2, var3, var4, var5, var6));
                }
            }
        }

        return (class48) (var7 ? new class774(this, var1, var2, var3, var4, var5, var6) : new class483(this, var1, var2, var3, var4, var5, var6));
    }

    public class806 method4942() {
        return new class274(this);
    }

    public boolean method4908() {
        return false;
    }

    public int method4848(int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = 0;
        float var8 = (float) var3 * this.field7934.field325[10] + this.field7934.field325[6] * (float) var2 + (float) var1 * this.field7934.field325[2] + this.field7934.field325[14];
        float var9 = (float) var6 * this.field7934.field325[10] + this.field7934.field325[6] * (float) var5 + this.field7934.field325[14] + (float) var4 * this.field7934.field325[2];
        float var10 = (float) var1 * this.field7934.field325[3] + this.field7934.field325[15] + this.field7934.field325[7] * (float) var2 + (float) var3 * this.field7934.field325[11];
        float var11 = (float) var4 * this.field7934.field325[3] + this.field7934.field325[15] + this.field7934.field325[7] * (float) var5 + this.field7934.field325[11] * (float) var6;
        if (var8 < -var10 && var9 < -var11) {
            var7 |= 16;
        } else if (var8 > var10 && var9 > var11) {
            var7 |= 32;
        }

        float var12 = this.field7934.field325[4] * (float) var2 + this.field7934.field325[12] + this.field7934.field325[0] * (float) var1 + this.field7934.field325[8] * (float) var3;
        float var13 = this.field7934.field325[8] * (float) var6 + (float) var4 * this.field7934.field325[0] + this.field7934.field325[12] + this.field7934.field325[4] * (float) var5;
        if (var12 < -var10 && var13 < -var11) {
            var7 |= 1;
        }

        if (var12 > var10 && var13 > var11) {
            var7 |= 2;
        }

        float var14 = (float) var2 * this.field7934.field325[5] + this.field7934.field325[1] * (float) var1 + this.field7934.field325[13] + this.field7934.field325[9] * (float) var3;
        float var15 = (float) var4 * this.field7934.field325[1] + this.field7934.field325[13] + (float) var5 * this.field7934.field325[5] + this.field7934.field325[9] * (float) var6;
        if (var14 < -var10 && var15 < -var11) {
            var7 |= 4;
        }

        if (var14 > var10 && var15 > var11) {
            var7 |= 8;
        }

        return var7;
    }

    public void method4874(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.field7948.length; ++var4) {
            class258 var5 = this.field7948[var4];
            var5.field7873 = var1 & 16777215;
            int var6 = var5.field7873 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }

            int var7 = var5.field7873 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }

            int var8 = var5.field7873 & 255;
            if (var8 < 2) {
                var8 = 2;
            }

            var5.field7873 = var6 << 16 | var7 << 8 | var8;
            if (var2 < 0) {
                var5.field7905 = false;
            } else {
                var5.field7905 = true;
            }
        }

    }

    public class48 method4982(class922 var1, boolean var2) {
        int[] var3 = var1.field10274;
        byte[] var4 = var1.field10275;
        int var5 = var1.field10269;
        int var6 = var1.field10273;
        int[] var7;
        byte[] var8;
        int var9;
        int var10;
        int var11;
        Object var12;
        if (var2 && var1.field10276 == null) {
            var7 = new int[var3.length];
            var8 = new byte[var6 * var5];

            for (var9 = 0; var9 < var6; ++var9) {
                var10 = var9 * var5;

                for (var11 = 0; var11 < var5; ++var11) {
                    var8[var10 + var11] = var4[var11 + var10];
                }
            }

            for (var9 = 0; var9 < var3.length; ++var9) {
                var7[var9] = var3[var9];
            }

            var12 = new class475(this, var8, var7, var5, var6);
        } else {
            var7 = new int[var6 * var5];
            var8 = var1.field10276;
            if (var8 != null) {
                for (var9 = 0; var9 < var6; ++var9) {
                    var10 = var5 * var9;

                    for (var11 = 0; var11 < var5; ++var11) {
                        var7[var10 + var11] = var3[var4[var10 + var11] & 255] | var8[var11 + var10] << 24;
                    }
                }

                var12 = new class774(this, var7, var5, var6);
            } else {
                for (var9 = 0; var9 < var6; ++var9) {
                    var10 = var9 * var5;

                    for (var11 = 0; var11 < var5; ++var11) {
                        int var13 = var3[var4[var11 + var10] & 255];
                        var7[var10 + var11] = var13 != 0 ? -16777216 | var13 : 0;
                    }
                }

                var12 = new class483(this, var7, var5, var6);
            }
        }

        ((class360) var12).method3104(var1.field10272, var1.field10268, var1.field10271, var1.field10270);
        return (class48) var12;
    }

    public class48 method4852(int var1, int var2, boolean var3, boolean var4) {
        return (class48) (var3 ? new class774(this, var1, var2) : new class483(this, var1, var2));
    }

    public class621 method4851(int var1, int var2, int var3, int var4, int var5, int var6) {
        return null;
    }

    public int method4836(int var1, int var2) {
        var1 |= 133120;
        return var1 & var2 ^ var2;
    }

    void method4467(boolean var1, int var2, int var3, float var4, int var5, int var6, int var7) {
        if (this.field7914 != null) {
            if (var5 < 0) {
                var5 = -var5;
            }

            int var8 = var3 - var5;
            if (var8 < this.field7923) {
                var8 = this.field7923;
            }

            int var9 = 1 + var5 + var3;
            if (var9 > this.field7924) {
                var9 = this.field7924;
            }

            int var10 = var8;
            int var11 = var5 * var5;
            int var12 = 0;
            int var13 = var3 - var8;
            int var14 = var13 * var13;
            int var15 = var14 - var13;
            if (var3 > var9) {
                var3 = var9;
            }

            int var16 = var6 >>> 24;
            int var17;
            int var18;
            int var19;
            int var20;
            if (var7 != 0 && (1 != var7 || 255 != var16)) {
                int var21;
                int var22;
                if (1 == var7) {
                    var6 = (var16 * (var6 & 16711935) >> 8 & 16711935) + ((var6 & '\uff00') * var16 >> 8 & '\uff00') + (var16 << 24);

                    for (var17 = 256 - var16; var10 < var3; var15 -= var13 + var13) {
                        while (var15 <= var11 || var14 <= var11) {
                            var14 += var12 + var12;
                            var15 += var12++ + var12;
                        }

                        var18 = var2 - var12 + 1;
                        if (var18 < this.field7921) {
                            var18 = this.field7921;
                        }

                        var19 = var2 + var12;
                        if (var19 > this.field7938) {
                            var19 = this.field7938;
                        }

                        var20 = var18 + var10 * this.field7918;

                        for (var21 = var18; var21 < var19; ++var21) {
                            if (!var1 || var4 < this.field7920[var20]) {
                                var22 = this.field7914[var20];
                                var22 = ((var22 & '\uff00') * var17 >> 8 & '\uff00') + (var17 * (var22 & 16711935) >> 8 & 16711935);
                                this.field7914[var20] = var22 + var6;
                            }

                            ++var20;
                        }

                        ++var10;
                        var14 -= var13-- + var13;
                    }

                    var12 = var5;
                    var13 = -var13;
                    var15 = var13 * var13 + var11;
                    var14 = var15 - var5;

                    for (var15 -= var13; var10 < var9; var14 += var13++ + var13) {
                        while (var15 > var11 && var14 > var11) {
                            var15 -= var12-- + var12;
                            var14 -= var12 + var12;
                        }

                        var18 = var2 - var12;
                        if (var18 < this.field7921) {
                            var18 = this.field7921;
                        }

                        var19 = var12 + var2;
                        if (var19 > this.field7938 - 1) {
                            var19 = this.field7938 - 1;
                        }

                        var20 = var10 * this.field7918 + var18;

                        for (var21 = var18; var21 <= var19; ++var21) {
                            if (!var1 || var4 < this.field7920[var20]) {
                                var22 = this.field7914[var20];
                                var22 = ((var22 & '\uff00') * var17 >> 8 & '\uff00') + (var17 * (var22 & 16711935) >> 8 & 16711935);
                                this.field7914[var20] = var22 + var6;
                            }

                            ++var20;
                        }

                        ++var10;
                        var15 += var13 + var13;
                    }
                } else {
                    if (2 != var7) {
                        throw new IllegalArgumentException();
                    }

                    int var23;
                    while (var10 < var3) {
                        while (var15 <= var11 || var14 <= var11) {
                            var14 += var12 + var12;
                            var15 += var12++ + var12;
                        }

                        var17 = var2 - var12 + 1;
                        if (var17 < this.field7921) {
                            var17 = this.field7921;
                        }

                        var18 = var2 + var12;
                        if (var18 > this.field7938) {
                            var18 = this.field7938;
                        }

                        var19 = var17 + this.field7918 * var10;

                        for (var20 = var17; var20 < var18; ++var20) {
                            if (!var1 || var4 < this.field7920[var19]) {
                                var21 = this.field7914[var19];
                                var22 = var21 + var6;
                                var23 = (var21 & 16711935) + (var6 & 16711935);
                                var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                this.field7914[var19] = var22 - var21 | var21 - (var21 >>> 8);
                            }

                            ++var19;
                        }

                        ++var10;
                        var14 -= var13-- + var13;
                        var15 -= var13 + var13;
                    }

                    var12 = var5;
                    var13 = -var13;
                    var15 = var11 + var13 * var13;
                    var14 = var15 - var5;

                    for (var15 -= var13; var10 < var9; var14 += var13++ + var13) {
                        while (var15 > var11 && var14 > var11) {
                            var15 -= var12-- + var12;
                            var14 -= var12 + var12;
                        }

                        var17 = var2 - var12;
                        if (var17 < this.field7921) {
                            var17 = this.field7921;
                        }

                        var18 = var12 + var2;
                        if (var18 > this.field7938 - 1) {
                            var18 = this.field7938 - 1;
                        }

                        var19 = this.field7918 * var10 + var17;

                        for (var20 = var17; var20 <= var18; ++var20) {
                            if (!var1 || var4 < this.field7920[var19]) {
                                var21 = this.field7914[var19];
                                var22 = var21 + var6;
                                var23 = (var6 & 16711935) + (var21 & 16711935);
                                var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                this.field7914[var19] = var22 - var21 | var21 - (var21 >>> 8);
                            }

                            ++var19;
                        }

                        ++var10;
                        var15 += var13 + var13;
                    }
                }
            } else {
                while (var10 < var3) {
                    while (var15 <= var11 || var14 <= var11) {
                        var14 += var12 + var12;
                        var15 += var12++ + var12;
                    }

                    var17 = 1 + (var2 - var12);
                    if (var17 < this.field7921) {
                        var17 = this.field7921;
                    }

                    var18 = var12 + var2;
                    if (var18 > this.field7938) {
                        var18 = this.field7938;
                    }

                    var19 = var10 * this.field7918 + var17;

                    for (var20 = var17; var20 < var18; ++var20) {
                        if (!var1 || var4 < this.field7920[var19]) {
                            this.field7914[var19] = var6;
                        }

                        ++var19;
                    }

                    ++var10;
                    var14 -= var13-- + var13;
                    var15 -= var13 + var13;
                }

                var12 = var5;
                var13 = var10 - var3;
                var15 = var13 * var13 + var11;
                var14 = var15 - var5;

                for (var15 -= var13; var10 < var9; var14 += var13++ + var13) {
                    while (var15 > var11 && var14 > var11) {
                        var15 -= var12-- + var12;
                        var14 -= var12 + var12;
                    }

                    var17 = var2 - var12;
                    if (var17 < this.field7921) {
                        var17 = this.field7921;
                    }

                    var18 = var2 + var12;
                    if (var18 > this.field7938 - 1) {
                        var18 = this.field7938 - 1;
                    }

                    var19 = var17 + var10 * this.field7918;

                    for (var20 = var17; var20 <= var18; ++var20) {
                        if (!var1 || var4 < this.field7920[var19]) {
                            this.field7914[var19] = var6;
                        }

                        ++var19;
                    }

                    ++var10;
                    var15 += var13 + var13;
                }

                return;
            }
        }

    }
}
