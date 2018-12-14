import jaclib.ping.Ping;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class class84 implements Runnable {
    static class180 field1126;
    volatile long field1122 = -1L;
    InetAddress field1123;
    String field1124;
    volatile boolean field1125 = true;

    public static void method938(int var0, byte var1) {
        try {
            if (class878.method5922((byte) 71)) {
                if (class881.field10145 != var0) {
                    class881.field10146 = -1L;
                }

                class881.field10145 = var0;
                class967.method1750(3, 1633403726);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "f.x(" + ')');
        }
    }

    static void method939(byte var0) {
        try {
            class881.field10140 = 136;
            class881.field10177 = class730.field2674;
            class521.method2751(-1L == class881.field10146, true, "", "", class881.field10146);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "f.g(" + ')');
        }
    }

    public static byte method940(char var0, int var1) {
        try {
            byte var2;
            if ((var0 <= 0 || var0 >= '\u0080') && (var0 < ' ' || var0 > 'ÿ')) {
                if (var0 == '€') {
                    var2 = -128;
                } else if ('‚' == var0) {
                    var2 = -126;
                } else if ('ƒ' == var0) {
                    var2 = -125;
                } else if (var0 == '„') {
                    var2 = -124;
                } else if (var0 == '…') {
                    var2 = -123;
                } else if ('†' == var0) {
                    var2 = -122;
                } else if ('‡' == var0) {
                    var2 = -121;
                } else if ('ˆ' == var0) {
                    var2 = -120;
                } else if (var0 == '‰') {
                    var2 = -119;
                } else if (var0 == 'Š') {
                    var2 = -118;
                } else if ('‹' == var0) {
                    var2 = -117;
                } else if ('Œ' == var0) {
                    var2 = -116;
                } else if ('Ž' == var0) {
                    var2 = -114;
                } else if (var0 == '‘') {
                    var2 = -111;
                } else if ('’' == var0) {
                    var2 = -110;
                } else if ('“' == var0) {
                    var2 = -109;
                } else if (var0 == '”') {
                    var2 = -108;
                } else if ('•' == var0) {
                    var2 = -107;
                } else if ('–' == var0) {
                    var2 = -106;
                } else if ('—' == var0) {
                    var2 = -105;
                } else if (var0 == '˜') {
                    var2 = -104;
                } else if (var0 == '™') {
                    var2 = -103;
                } else if ('š' == var0) {
                    var2 = -102;
                } else if ('›' == var0) {
                    var2 = -101;
                } else if ('œ' == var0) {
                    var2 = -100;
                } else if (var0 == 'ž') {
                    var2 = -98;
                } else if (var0 == 'Ÿ') {
                    var2 = -97;
                } else {
                    var2 = 63;
                }
            } else {
                var2 = (byte) var0;
            }

            return var2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "f.a(" + ')');
        }
    }

    static final void method941(class744 var0, int var1) {
        try {
            var0.field3156 -= 3;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            int var4 = var0.field3161[var0.field3156 + 2];
            class740.method1920(6, var2 << 16 | var3, var4, "", -759655050);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "f.alw(" + ')');
        }
    }

    static final void method942(Actor var0, int var1) {
        try {
            int var2 = var0.field4059 - class730.field2866;
            int var3 = var0.field4062 * 512 + var0.method2550() * 256;
            int var4 = var0.field4064 * 512 + var0.method2550() * 256;
            RegionOffset var5 = var0.getRegion().regionOffset;
            var0.method1515((float) ((var3 - (int) var5.offsetX) / var2 + (int) var5.offsetX), (float) ((int) var5.field5300), (float) ((int) var5.offsetY + (var4 - (int) var5.offsetY) / var2));
            var0.field4088 = 0;
            var0.method2542(var0.field4068, (byte) 1);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "f.he(" + ')');
        }
    }

    void method934(String var1, int var2) {
        try {
            this.field1124 = var1;
            this.field1123 = null;
            this.field1122 = -1L;
            if (this.field1124 != null) {
                try {
                    this.field1123 = InetAddress.getByName(this.field1124);
                } catch (UnknownHostException var4) {
                    ;
                }
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "f.a(" + ')');
        }
    }

    void method935(int var1) {
        try {
            this.field1125 = false;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "f.b(" + ')');
        }
    }

    public void run() {
        try {
            while (this.field1125) {
                this.method936((byte) 52);
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "f.run(" + ')');
        }
    }

    void method936(byte var1) {
        try {
            if (this.field1123 != null) {
                try {
                    byte[] var2 = this.field1123.getAddress();
                    this.field1122 = (long) Ping.a(var2[0], var2[1], var2[2], var2[3], 10000L);
                } catch (Throwable var3) {
                    ;
                }
            }

            class764.method2745(1000L);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "f.p(" + ')');
        }
    }

    long method937(int var1) {
        try {
            return this.field1122;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "f.f(" + ')');
        }
    }
}
