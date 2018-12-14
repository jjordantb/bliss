public abstract class class360 extends class48 {
    static int field2159;
    static int field2160;
    static int field2163;
    static int field2164 = 0;
    static int field2166;
    static int field2167 = 4;
    static int field2168 = 8;
    static int field2170;
    static int field2171;
    static int field2173;
    static int field2174 = 12;
    static int field2175;
    static int field2176;
    static int field2177;
    static int field2179;
    static int field2180;
    static int field2181 = 0;
    static int field2183;
    static int field2184;
    static int field2185;
    static int field2186;
    static int field2187 = 0;
    static int field2188 = 0;
    static int field2190 = 0;
    static int field2191 = 0;
    static int field2192;
    static int field2193 = 0;
    static int field2194 = 0;
    int field2161;
    int field2162;
    int field2165;
    int field2169;
    int field2172;
    class257 field2178;
    int field2182;
    int[] field2189;

    class360(class257 var1, int var2, int var3) {
        this.field2178 = var1;
        this.field2182 = var2;
        this.field2161 = var3;
    }

    public int method3106() {
        return this.field2182;
    }

    public int method3108() {
        return this.field2161;
    }

    public int method3109() {
        return this.field2172 + this.field2161 + this.field2165;
    }

    public abstract void method3114(int var1, int var2, int var3, int var4, int var5);

    abstract void method3118(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

    abstract void method1469(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13);

    boolean method1470(float var1, float var2, float var3, float var4, float var5, float var6) {
        int var7 = this.field2162 + this.field2182 + this.field2169;
        int var8 = this.field2172 + this.field2161 + this.field2165;
        float var9;
        float var10;
        float var11;
        float var12;
        float var13;
        float var14;
        float var15;
        float var16;
        if (var7 != this.field2182 || var8 != this.field2161) {
            var9 = (var3 - var1) / (float) var7;
            var10 = (var4 - var2) / (float) var7;
            var11 = (var5 - var1) / (float) var8;
            var12 = (var6 - var2) / (float) var8;
            var13 = var11 * (float) this.field2172;
            var14 = var12 * (float) this.field2172;
            var15 = var9 * (float) this.field2162;
            var16 = var10 * (float) this.field2162;
            float var17 = -var9 * (float) this.field2169;
            float var18 = -var10 * (float) this.field2169;
            float var19 = -var11 * (float) this.field2165;
            float var20 = -var12 * (float) this.field2165;
            var1 += var15 + var13;
            var2 += var16 + var14;
            var3 += var17 + var13;
            var4 += var18 + var14;
            var5 += var15 + var19;
            var6 += var16 + var20;
        }

        var9 = var5 + (var3 - var1);
        var10 = var4 + (var6 - var2);
        if (var1 < var3) {
            var11 = var1;
            var12 = var3;
        } else {
            var11 = var3;
            var12 = var1;
        }

        if (var5 < var11) {
            var11 = var5;
        }

        if (var9 < var11) {
            var11 = var9;
        }

        if (var5 > var12) {
            var12 = var5;
        }

        if (var9 > var12) {
            var12 = var9;
        }

        if (var2 < var4) {
            var13 = var2;
            var14 = var4;
        } else {
            var13 = var4;
            var14 = var2;
        }

        if (var6 < var13) {
            var13 = var6;
        }

        if (var10 < var13) {
            var13 = var10;
        }

        if (var6 > var14) {
            var14 = var6;
        }

        if (var10 > var14) {
            var14 = var10;
        }

        if (var11 < (float) this.field2178.field7921) {
            var11 = (float) this.field2178.field7921;
        }

        if (var12 > (float) this.field2178.field7938) {
            var12 = (float) this.field2178.field7938;
        }

        if (var13 < (float) this.field2178.field7923) {
            var13 = (float) this.field2178.field7923;
        }

        if (var14 > (float) this.field2178.field7924) {
            var14 = (float) this.field2178.field7924;
        }

        var12 = var11 - var12;
        if (var12 >= 0.0F) {
            return false;
        } else {
            var14 = var13 - var14;
            if (var14 >= 0.0F) {
                return false;
            } else {
                field2192 = this.field2178.field7918;
                field2175 = (int) ((float) ((int) var13 * field2192) + var11);
                var15 = (var3 - var1) * (var6 - var2) - (var4 - var2) * (var5 - var1);
                var16 = (var5 - var1) * (var4 - var2) - (var6 - var2) * (var3 - var1);
                field2176 = (int) ((var6 - var2) * 4096.0F * (float) this.field2182 / var15);
                field2163 = (int) ((var4 - var2) * 4096.0F * (float) this.field2161 / var16);
                field2177 = (int) ((var5 - var1) * 4096.0F * (float) this.field2182 / var16);
                field2179 = (int) ((var3 - var1) * 4096.0F * (float) this.field2161 / var15);
                field2180 = (int) (var11 * 16.0F + 8.0F - (var1 + var3 + var5 + var9) / 4.0F * 16.0F);
                field2159 = (int) (var13 * 16.0F + 8.0F - (var2 + var4 + var6 + var10) / 4.0F * 16.0F);
                field2160 = (this.field2182 >> 1 << 12) + (field2159 * field2177 >> 4);
                field2183 = (this.field2161 >> 1 << 12) + (field2159 * field2179 >> 4);
                field2184 = field2180 * field2176 >> 4;
                field2185 = field2180 * field2163 >> 4;
                field2170 = (int) var11;
                field2171 = (int) var12;
                field2166 = (int) var13;
                field2173 = (int) var14;
                return true;
            }
        }
    }

    void method3125(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
        if (this.field2178.method4444()) {
            throw new IllegalStateException();
        } else {
            if (this.method1470(var1, var2, var3, var4, var5, var6)) {
                field2186 = var8;
                if (var7 != 1) {
                    field2187 = var8 >>> 24;
                    field2188 = 256 - field2187;
                    if (var7 == 0) {
                        field2181 = (var8 & 16711680) >> 16;
                        field2190 = (var8 & '\uff00') >> 8;
                        field2191 = var8 & 255;
                    } else if (var7 == 2) {
                        field2164 = var8 >>> 24;
                        field2193 = 256 - field2164;
                        int var11 = (var8 & 16711935) * field2193 & -16711936;
                        int var12 = (var8 & '\uff00') * field2193 & 16711680;
                        field2194 = (var11 | var12) >>> 8;
                    }
                }

                if (var7 == 1) {
                    if (var9 == 0) {
                        this.method1471(1, 0);
                    } else if (var9 == 1) {
                        this.method1471(1, 1);
                    } else if (var9 == 2) {
                        this.method1471(1, 2);
                    }
                } else if (var7 == 0) {
                    if (var9 == 0) {
                        this.method1471(0, 0);
                    } else if (var9 == 1) {
                        this.method1471(0, 1);
                    } else if (var9 == 2) {
                        this.method1471(0, 2);
                    }
                } else if (var7 == 3) {
                    if (var9 == 0) {
                        this.method1471(3, 0);
                    } else if (var9 == 1) {
                        this.method1471(3, 1);
                    } else if (var9 == 2) {
                        this.method1471(3, 2);
                    }
                } else if (var7 == 2) {
                    if (var9 == 0) {
                        this.method1471(2, 0);
                    } else if (var9 == 1) {
                        this.method1471(2, 1);
                    } else if (var9 == 2) {
                        this.method1471(2, 2);
                    }
                }
            }

        }
    }

    abstract void method1471(int var1, int var2);

    abstract void method1472(int[] var1, int[] var2, int var3, int var4);

    public void method3104(int var1, int var2, int var3, int var4) {
        this.field2162 = var1;
        this.field2172 = var2;
        this.field2169 = var3;
        this.field2165 = var4;
    }

    public void method3105(int[] var1) {
        var1[0] = this.field2162;
        var1[1] = this.field2172;
        var1[2] = this.field2169;
        var1[3] = this.field2165;
    }

    void method3127(float var1, float var2, float var3, float var4, float var5, float var6, int var7, class23 var8, int var9, int var10) {
        if (this.field2178.method4444()) {
            throw new IllegalStateException();
        } else {
            if (this.method1470(var1, var2, var3, var4, var5, var6)) {
                class924 var11 = (class924) var8;
                this.method1472(var11.field10289, var11.field10288, field2170 - var9, -var10 - (field2173 - field2166));
            }

        }
    }

    public abstract void method3137(int var1, int var2, class23 var3, int var4, int var5);

    public void method3145(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (this.field2178.method4444()) {
            throw new IllegalStateException();
        } else {
            if (this.field2189 == null) {
                this.field2189 = new int[4];
            }

            this.field2178.method4830(this.field2189);
            this.field2178.method4829(this.field2178.field7921, this.field2178.field7923, var1 + var3, var2 + var4);
            int var8 = this.method5594();
            int var9 = this.method3109();
            int var10 = (var3 + var8 - 1) / var8;
            int var11 = (var4 + var9 - 1) / var9;

            for (int var12 = 0; var12 < var11; ++var12) {
                int var13 = var12 * var9;

                for (int var14 = 0; var14 < var10; ++var14) {
                    this.method3114(var1 + var14 * var8, var2 + var13, var5, var6, var7);
                }
            }

            this.field2178.method4986(this.field2189[0], this.field2189[1], this.field2189[2], this.field2189[3]);
        }
    }

    public int method5594() {
        return this.field2162 + this.field2182 + this.field2169;
    }
}
