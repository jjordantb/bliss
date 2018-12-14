import java.util.Random;

public class class578 extends class347 {
    static int field79 = 3;
    static int field80 = 1;
    static int field81 = 2;
    static int field82 = 2048;
    static int field84 = 1;
    static int field85 = 2;
    static int field87 = 0;
    static int field88 = 5;
    static int field89 = 0;
    static int field90 = 2;
    static int field91 = 5;
    static int field92 = 4;
    static int field93 = 1;
    static int field100 = 4;
    static int field101 = 3;
    short[] field83 = new short[512];
    byte[] field86 = new byte[512];
    int field94 = 0;
    int field95 = 2048;
    int field96 = 5;
    int field97 = 5;
    int field98 = 2;
    int field99 = 1;

    public class578() {
        super(0, true);
    }

    int[] method203(int var1, int var2) {
        try {
            int[] var3 = super.field270.method3546(var1, 1076087457);
            if (super.field270.field6612) {
                int var4 = this.field97 * class322.field836[var1] + 2048;
                int var5 = var4 >> 12;
                int var6 = 1 + var5;

                for (int var7 = 0; var7 < class322.field831; ++var7) {
                    class645.field10128 = Integer.MAX_VALUE;
                    class399.field6578 = Integer.MAX_VALUE;
                    class469.field7329 = Integer.MAX_VALUE;
                    class628.field9746 = Integer.MAX_VALUE;
                    int var8 = this.field96 * class322.field838[var7] + 2048;
                    int var9 = var8 >> 12;
                    int var10 = 1 + var9;

                    for (int var11 = var5 - 1; var11 <= var6; ++var11) {
                        int var12 = this.field86[(var11 >= this.field97 ? var11 - this.field97 : var11) & 255] & 255;

                        for (int var13 = var9 - 1; var13 <= var10; ++var13) {
                            int var14 = (this.field86[(var13 >= this.field96 ? var13 - this.field96 : var13) + var12 & 255] & 255) * 2;
                            int var15 = var8 - (this.field83[var14++] + (var13 << 12));
                            int var16 = var4 - ((var11 << 12) + this.field83[var14]);
                            int var17;
                            switch (this.field99) {
                                case 1:
                                    var17 = var15 * var15 + var16 * var16 >> 12;
                                    break;
                                case 2:
                                    var17 = (var16 < 0 ? -var16 : var16) + (var15 < 0 ? -var15 : var15);
                                    break;
                                case 3:
                                    var15 = var15 < 0 ? -var15 : var15;
                                    var16 = var16 < 0 ? -var16 : var16;
                                    var17 = var15 > var16 ? var15 : var16;
                                    break;
                                case 4:
                                    var15 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                                    var16 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    var17 = var16 + var15;
                                    var17 = var17 * var17 >> 12;
                                    break;
                                case 5:
                                    var15 *= var15;
                                    var16 *= var16;
                                    var17 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var15 + var16) / 1.6777216E7F))) * 4096.0D);
                                    break;
                                default:
                                    var17 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var15 * var15) / 1.6777216E7F)) * 4096.0D);
                            }

                            if (var17 < class628.field9746) {
                                class645.field10128 = class399.field6578;
                                class399.field6578 = class469.field7329;
                                class469.field7329 = class628.field9746;
                                class628.field9746 = var17;
                            } else if (var17 < class469.field7329) {
                                class645.field10128 = class399.field6578;
                                class399.field6578 = class469.field7329;
                                class469.field7329 = var17;
                            } else if (var17 < class399.field6578) {
                                class645.field10128 = class399.field6578;
                                class399.field6578 = var17;
                            } else if (var17 < class645.field10128) {
                                class645.field10128 = var17;
                            }
                        }
                    }

                    switch (this.field98) {
                        case 0:
                            var3[var7] = class628.field9746;
                            break;
                        case 1:
                            var3[var7] = class469.field7329;
                            break;
                        case 2:
                            var3[var7] = class469.field7329 - class628.field9746;
                            break;
                        case 3:
                            var3[var7] = class399.field6578;
                            break;
                        case 4:
                            var3[var7] = class645.field10128;
                    }
                }
            }

            return var3;
        } catch (RuntimeException var18) {
            throw class158.method3445(var18, "ahf.i(" + ')');
        }
    }

    void method205(int var1) {
        try {
            this.field86 = class322.method813(this.field94, (byte) 47);
            this.method82(-804707257);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ahf.x(" + ')');
        }
    }

    void method82(int var1) {
        try {
            Random var2 = new Random((long) this.field94);
            this.field83 = new short[512];
            if (this.field95 > 0) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field83[var3] = (short) class977.method1813(var2, this.field95, (byte) 14);
                }
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ahf.ac(" + ')');
        }
    }

    void method209(int var1, InputStream var2, byte var3) {
        try {
            switch (var1) {
                case 0:
                    this.field96 = this.field97 = var2.method6371();
                    break;
                case 1:
                    this.field94 = var2.method6371();
                    break;
                case 2:
                    this.field95 = var2.method6374();
                    break;
                case 3:
                    this.field98 = var2.method6371();
                    break;
                case 4:
                    this.field99 = var2.method6371();
                    break;
                case 5:
                    this.field96 = var2.method6371();
                    break;
                case 6:
                    this.field97 = var2.method6371();
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ahf.r(" + ')');
        }
    }
}
