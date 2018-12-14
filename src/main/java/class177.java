import java.util.Random;

public class class177 extends class347 {
    static int field5186 = 8;
    static int field5188 = 1024;
    static int field5189 = 204;
    static int field5190 = 1024;
    static int field5192 = 4;
    static int field5193 = 81;
    static int field5197 = 409;
    static int field5207 = 0;
    int[][] field5187;
    int field5191;
    int field5194 = 4;
    int field5195;
    int field5196 = 0;
    int field5198 = 1024;
    int field5199 = 8;
    int field5200 = 204;
    int field5201 = 409;
    int field5202 = 81;
    int[] field5203;
    int[][] field5204;
    int field5205;
    int field5206 = 1024;

    public class177() {
        super(0, true);
    }

    int[] method203(int var1, int var2) {
        try {
            int[] var3 = super.field270.method3546(var1, -72959134);
            if (super.field270.field6612) {
                int var4 = 0;

                int var5;
                for (var5 = this.field5196 + class322.field836[var1]; var5 < 0; var5 += 4096) {
                    ;
                }

                while (var5 > 4096) {
                    var5 -= 4096;
                }

                while (var4 < this.field5199) {
                    if (var5 < this.field5203[var4]) {
                        if (var2 == -484575331) {
                            throw new IllegalStateException();
                        }
                        break;
                    }

                    ++var4;
                }

                int var6 = var4 - 1;
                boolean var7 = (var4 & 1) == 0;
                int var8 = this.field5203[var4];
                int var9 = this.field5203[var4 - 1];
                if (var5 > var9 + this.field5205 && var5 < var8 - this.field5205) {
                    for (int var10 = 0; var10 < class322.field831; ++var10) {
                        int var11 = 0;
                        int var12 = var7 ? this.field5206 * 414558029 * 642247045 : -this.field5206;

                        int var13;
                        for (var13 = class322.field838[var10] + (var12 * this.field5191 >> 12); var13 < 0; var13 += 4096) {
                            ;
                        }

                        while (var13 > 4096) {
                            var13 -= 4096;
                        }

                        while (var11 < this.field5194) {
                            if (var13 < this.field5204[var6][var11]) {
                                if (var2 == -484575331) {
                                    throw new IllegalStateException();
                                }
                                break;
                            }

                            ++var11;
                        }

                        int var14 = var11 - 1;
                        int var15 = this.field5204[var6][var14];
                        int var16 = this.field5204[var6][var11];
                        if (var13 > this.field5205 + var15 && var13 < var16 - this.field5205) {
                            var3[var10] = this.field5187[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class901.method6354(var3, 0, class322.field831, 0);
                }
            }

            return var3;
        } catch (RuntimeException var17) {
            throw class158.method3445(var17, "agu.i(" + ')');
        }
    }

    void method205(int var1) {
        try {
            this.method3097((short) 917);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "agu.x(" + ')');
        }
    }

    void method209(int var1, InputStream var2, byte var3) {
        try {
            switch (var1) {
                case 0:
                    this.field5194 = var2.method6371();
                    break;
                case 1:
                    this.field5199 = var2.method6371();
                    break;
                case 2:
                    this.field5201 = var2.method6374();
                    break;
                case 3:
                    this.field5200 = var2.method6374();
                    break;
                case 4:
                    this.field5206 = var2.method6374();
                    break;
                case 5:
                    this.field5196 = var2.method6374();
                    break;
                case 6:
                    this.field5202 = var2.method6374();
                    break;
                case 7:
                    this.field5198 = var2.method6374();
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "agu.r(" + ')');
        }
    }

    void method3097(short var1) {
        try {
            Random var2 = new Random((long) this.field5199);
            this.field5205 = this.field5202 / 2;
            this.field5191 = 4096 / this.field5194;
            this.field5195 = 4096 / this.field5199;
            int var3 = this.field5191 / 2;
            int var4 = this.field5195 / 2;
            this.field5203 = new int[1 + this.field5199];
            this.field5204 = new int[this.field5199][1 + this.field5194];
            this.field5187 = new int[this.field5199][this.field5194];
            this.field5203[0] = 0;

            for (int var5 = 0; var5 < this.field5199; ++var5) {
                int var6;
                int var7;
                if (var5 > 0) {
                    var6 = this.field5195;
                    var7 = (class977.method1813(var2, 4096, (byte) -30) - 2048) * this.field5200 >> 12;
                    var6 += var7 * var4 >> 12;
                    this.field5203[var5] = var6 + this.field5203[var5 - 1];
                }

                this.field5204[var5][0] = 0;

                for (var6 = 0; var6 < this.field5194; ++var6) {
                    if (var6 > 0) {
                        var7 = this.field5191;
                        int var8 = (class977.method1813(var2, 4096, (byte) -82) - 2048) * this.field5201 >> 12;
                        var7 += var8 * var3 >> 12;
                        this.field5204[var5][var6] = var7 + this.field5204[var5][var6 - 1];
                    }

                    this.field5187[var5][var6] = this.field5198 > 0 ? 4096 - class977.method1813(var2, this.field5198, (byte) 23) : 4096;
                }

                this.field5204[var5][this.field5194] = 4096;
            }

            this.field5203[this.field5199] = 4096;
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "agu.ac(" + ')');
        }
    }
}
