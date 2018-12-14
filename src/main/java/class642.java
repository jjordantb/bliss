import jaclib.memory.Stream;
import jaclib.memory.heap.I;

import java.nio.ByteBuffer;

public class class642 extends Node {
    int field10072 = 0;
    class894 field10073;
    int field10074;
    Stream field10075;
    class919 field10076;
    class525 field10077;
    class325 field10078;
    int[] field10079;
    int field10080 = 0;
    int field10081 = 0;
    int field10082 = 0;
    I field10083;
    float field10084;

    class642(class894 var1, int var2, int var3, class919 var4) {
        this.field10073 = var1;
        this.field10078 = this.field10073.field9485;
        this.field10074 = var2;
        this.field10084 = (float) var3;
        this.field10076 = var4;
        this.field10079 = new int[this.field10073.width * this.field10073.height];
        byte var5 = 10;
        if (var2 >= 0) {
            class414 var6 = this.field10078.field8581.method4625(var2, 1520533155);
            if (var6.field9383 > 0) {
                var5 = var6.field9383;
            }
        }

        this.field10078.method563(var5);
        this.field10078.method563(3);
    }

    void method6134(int var1) {
        this.field10083 = this.field10078.method776(var1 * 4, true);
        this.field10075 = new Stream(this.field10083, 0, var1 * 4);
    }

    void method6135(int var1) {
        this.field10075.b(var1 * 4 + 3);
        this.field10075.p(-1);
    }

    void method6136(int var1, int var2, int var3) {
        this.field10079[var2 * this.field10073.width + var1] |= 1 << var3;
        ++this.field10080;
    }

    void method6137(int var1, int var2, int var3, float var4) {
        int var6;
        int var7;
        if (this.field10074 != -1) {
            class414 var5 = this.field10078.field8581.method4625(this.field10074, 833044999);
            var6 = var5.field9387 & 255;
            int var9;
            if (var6 != 0 && var5.field9383 != 4) {
                if (var3 < 0) {
                    var7 = 0;
                } else if (var3 > 127) {
                    var7 = 16777215;
                } else {
                    var7 = 131586 * var3;
                }

                if (var6 == 256) {
                    var2 = var7;
                } else {
                    var9 = 256 - var6;
                    var2 = ((var7 & 16711935) * var6 + (var2 & 16711935) * var9 & -16711936) + ((var7 & '\uff00') * var6 + (var2 & '\uff00') * var9 & 16711680) >> 8;
                }
            }

            var7 = var5.field9388 & 255;
            if (var7 != 0) {
                var7 += 256;
                int var8 = ((var2 & 16711680) >> 16) * var7;
                if (var8 > 65535) {
                    var8 = 65535;
                }

                var9 = ((var2 & '\uff00') >> 8) * var7;
                if (var9 > 65535) {
                    var9 = 65535;
                }

                int var10 = (var2 & 255) * var7;
                if (var10 > 65535) {
                    var10 = 65535;
                }

                var2 = (var8 << 8 & 16711680) + (var9 & '\uff00') + (var10 >> 8);
            }
        }

        if (var4 != 1.0F) {
            int var11 = var2 >> 16 & 255;
            var6 = var2 >> 8 & 255;
            var7 = var2 & 255;
            var11 = (int) ((float) var11 * var4);
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }

            var6 = (int) ((float) var6 * var4);
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }

            var7 = (int) ((float) var7 * var4);
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }

            var2 = var11 << 16 | var6 << 8 | var7;
        }

        this.field10075.b(var1 * 4);
        if (this.field10078.field790 == 0) {
            this.field10075.p((byte) var2);
            this.field10075.p((byte) (var2 >> 8));
            this.field10075.p((byte) (var2 >> 16));
        } else {
            this.field10075.p((byte) (var2 >> 16));
            this.field10075.p((byte) (var2 >> 8));
            this.field10075.p((byte) var2);
        }

    }

    void method6138(int var1) {
        this.field10075.x();
        this.field10077 = this.field10078.method641(false);
        this.field10077.method2236(var1 * 4, 4, this.field10083);
        this.field10083 = null;
        this.field10075 = null;
    }

    void method6139(int[] var1, int var2) {
        this.field10072 = 0;
        this.field10081 = 32767;
        this.field10082 = -32768;
        ByteBuffer var3 = this.field10078.field660;

        label49:
        for (int var4 = 0; var4 < var2; ++var4) {
            int var5 = var1[var4];
            short[] var6 = this.field10073.field9474[var5];
            int var7 = this.field10079[var5];
            if (var7 != 0 && var6 != null) {
                int var8 = 0;
                int var9 = 0;

                while (true) {
                    while (true) {
                        if (var9 >= var6.length) {
                            continue label49;
                        }

                        if ((var7 & 1 << var8++) != 0) {
                            for (int var10 = 0; var10 < 3; ++var10) {
                                int var11 = var6[var9++] & '\uffff';
                                if (var11 > this.field10082) {
                                    this.field10082 = var11;
                                }

                                if (var11 < this.field10081) {
                                    this.field10081 = var11;
                                }

                                var3.putShort((short) var11);
                            }

                            this.field10072 += 3;
                        } else {
                            var9 += 3;
                        }
                    }
                }
            }
        }

    }
}
