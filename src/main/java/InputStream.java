import java.math.BigInteger;

public class InputStream extends Node {
    public static int field10379 = 5000;
    public static int field10381 = 100;
    public static long[] field10382;
    static int[] field10377 = new int[256];
    static int field10378 = -306674912;
    static long field10380 = -3932672073523589310L;

    static {
        int var0;
        for (var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;

            for (int var2 = 0; var2 < 8; ++var2) {
                if ((var1 & 1) == 1) {
                    var1 = var1 >>> 1 ^ -306674912;
                } else {
                    var1 >>>= 1;
                }
            }

            field10377[var0] = var1;
        }

        field10382 = new long[256];

        for (var0 = 0; var0 < 256; ++var0) {
            long var3 = (long) var0;

            for (int var5 = 0; var5 < 8; ++var5) {
                if ((var3 & 1L) == 1L) {
                    var3 = var3 >>> 1 ^ -3932672073523589310L;
                } else {
                    var3 >>>= 1;
                }
            }

            field10382[var0] = var3;
        }

    }

    public byte[] field10375;
    public int field10376;

    public InputStream(int var1) {
        this.field10375 = class18.method3686(var1, (short) -31789);
        this.field10376 = 0;
    }

    public InputStream(byte[] var1) {
        this.field10375 = var1;
        this.field10376 = 0;
    }

    static final void method6430(class744 var0, int var1) {
        try {
            String var2 = (String) var0.field3157[--var0.field3158];
            var0.field3157[++var0.field3158 - 1] = var2.toLowerCase();
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.zd(" + ')');
        }
    }

    static final void method6431(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            Widget var3 = class449.method3756(var2, (byte) 28);
            WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
            Animation.method3568(var3, var4, var0, (byte) -121);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "acx.dp(" + ')');
        }
    }

    static final void method6432(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9115.method1097(-484902399) && class593.field1623.method4855() ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.anb(" + ')');
        }
    }

    static void method6433(int var0, int var1, int var2, short var3) {
        try {
            class682 var4 = class370.method881(9, (long) var0);
            var4.method4340((byte) 105);
            var4.field7687 = var1;
            var4.field7685 = var2;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "acx.aw(" + ')');
        }
    }

    static final void method6434(class744 var0, byte var1) {
        try {
            String var2 = (String) var0.field3157[--var0.field3158];
            int var3 = var0.field3161[--var0.field3156];
            if (-1 == var3) {
                throw new RuntimeException("");
            } else {
                var0.field3157[++var0.field3158 - 1] = var2 + (char) var3;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.za(" + ')');
        }
    }

    public void method6360(long var1) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) ((int) (var1 >> 32));
            this.field10375[++this.field10376 - 1] = (byte) ((int) (var1 >> 24));
            this.field10375[++this.field10376 - 1] = (byte) ((int) (var1 >> 16));
            this.field10375[++this.field10376 - 1] = (byte) ((int) (var1 >> 8));
            this.field10375[++this.field10376 - 1] = (byte) ((int) var1);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.r(" + ')');
        }
    }

    public void method6361(int var1) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) var1;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.p(" + ')');
        }
    }

    public void method6362(int var1, int var2) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 8);
            this.field10375[++this.field10376 - 1] = (byte) var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.i(" + ')');
        }
    }

    public void method6363(int var1, int var2) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) var1;
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 8);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.k(" + ')');
        }
    }

    public void method6364(int var1, int var2) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 24);
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 16);
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 8);
            this.field10375[++this.field10376 - 1] = (byte) var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.u(" + ')');
        }
    }

    public void method6365(int var1, int var2) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) var1;
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 8);
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 16);
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 24);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.x(" + ')');
        }
    }

    public void method6366(String var1, int var2) {
        try {
            int var3 = var1.indexOf(0);
            if (var3 >= 0) {
                throw new IllegalArgumentException("");
            } else {
                this.field10376 += class861.method5350(var1, 0, var1.length(), this.field10375, this.field10376, (byte) 41);
                this.field10375[++this.field10376 - 1] = 0;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.z(" + ')');
        }
    }

    public int method6367(int var1) {
        try {
            this.field10376 += 2;
            int var2 = ((this.field10375[this.field10376 - 2] & 255) << 8) + (this.field10375[this.field10376 - 1] & 255);
            if (var2 > 32767) {
                var2 -= 65536;
            }

            return var2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.ao(" + ')');
        }
    }

    public void method6368(int var1, byte var2) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 8);
            this.field10375[++this.field10376 - 1] = (byte) var1;
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 24);
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 16);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.ba(" + ')');
        }
    }

    public void method6369(int var1, int var2) {
        try {
            this.field10375[this.field10376 - var1 - 2] = (byte) (var1 >> 8);
            this.field10375[this.field10376 - var1 - 1] = (byte) var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.j(" + ')');
        }
    }

    public void method6370(int var1, byte var2) {
        try {
            if (var1 >= 0 && var1 < 128) {
                this.method6361(var1);
            } else {
                if (var1 < 0 || var1 >= 32768) {
                    throw new IllegalArgumentException();
                }

                this.method6362('耀' + var1, 16711935);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.l(" + ')');
        }
    }

    public int method6371() {
        try {
            return this.field10375[++this.field10376 - 1] & 255;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "acx.aa(" + ')');
        }
    }

    public byte method6372(int var1) {
        try {
            return this.field10375[++this.field10376 - 1];
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.ak(" + ')');
        }
    }

    final int method6373() {
        int var1 = this.method6374();
        return var1 == 65535 ? -1 : var1;
    }

    public int method6374() {
        try {
            this.field10376 += 2;
            return (this.field10375[this.field10376 - 1] & 255) + ((this.field10375[this.field10376 - 2] & 255) << 8);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "acx.ae(" + ')');
        }
    }

    public long method6375(short var1) {
        try {
            long var2 = (long) this.method6420((byte) 35) & 4294967295L;
            long var4 = (long) this.method6420((byte) 13) & 4294967295L;
            return (var2 << 32) + var4;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "acx.al(" + ')');
        }
    }

    public void method6376(int var1, int var2) {
        try {
            this.field10375[this.field10376 - var1 - 4] = (byte) (var1 >> 24);
            this.field10375[this.field10376 - var1 - 3] = (byte) (var1 >> 16);
            this.field10375[this.field10376 - var1 - 2] = (byte) (var1 >> 8);
            this.field10375[this.field10376 - var1 - 1] = (byte) var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.w(" + ')');
        }
    }

    public int method6377(int var1) {
        try {
            this.field10376 += 4;
            return ((this.field10375[this.field10376 - 1] & 255) << 24) + ((this.field10375[this.field10376 - 2] & 255) << 16) + ((this.field10375[this.field10376 - 3] & 255) << 8) + (this.field10375[this.field10376 - 4] & 255);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.ah(" + ')');
        }
    }

    public long method6378(byte var1) {
        try {
            long var2 = (long) this.method6371() & 4294967295L;
            long var4 = (long) this.method6420((byte) 19) & 4294967295L;
            return (var2 << 32) + var4;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "acx.ai(" + ')');
        }
    }

    public String method6379(int var1) {
        try {
            int var2 = this.field10376;

            while (this.field10375[++this.field10376 - 1] != 0) {
                ;
            }

            int var3 = this.field10376 - var2 - 1;
            return var3 == 0 ? "" : class783.method2497(this.field10375, var2, var3, 964250329);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.af(" + ')');
        }
    }

    public void method6380(long var1, int var3, int var4) {
        try {
            --var3;
            if (var3 >= 0 && var3 <= 7) {
                for (int var5 = var3 * 8; var5 >= 0; var5 -= 8) {
                    this.field10375[++this.field10376 - 1] = (byte) ((int) (var1 >> var5));
                }

            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "acx.n(" + ')');
        }
    }

    public void method6381(byte[] var1, int var2, int var3, int var4) {
        try {
            for (int var5 = var2; var5 < var2 + var3; ++var5) {
                var1[var5] = this.field10375[++this.field10376 - 1];
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "acx.ab(" + ')');
        }
    }

    public int method6382(int var1) {
        try {
            int var2 = this.field10375[this.field10376] & 255;
            return var2 < 128 ? this.method6371() : this.method6374() - '耀';
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.ay(" + ')');
        }
    }

    public int method6383(short var1) {
        try {
            int var2 = 0;

            int var3;
            for (var3 = this.method6382(1723054621); 32767 == var3; var3 = this.method6382(1723054621)) {
                var2 += 32767;
            }

            var2 += var3;
            return var2;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.aq(" + ')');
        }
    }

    public int method6384(int var1) {
        try {
            return this.field10375[this.field10376] < 0 ? this.method6420((byte) 47) & Integer.MAX_VALUE : this.method6374();
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.ag(" + ')');
        }
    }

    public void method6385(long var1) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) ((int) (var1 >> 56));
            this.field10375[++this.field10376 - 1] = (byte) ((int) (var1 >> 48));
            this.field10375[++this.field10376 - 1] = (byte) ((int) (var1 >> 40));
            this.field10375[++this.field10376 - 1] = (byte) ((int) (var1 >> 32));
            this.field10375[++this.field10376 - 1] = (byte) ((int) (var1 >> 24));
            this.field10375[++this.field10376 - 1] = (byte) ((int) (var1 >> 16));
            this.field10375[++this.field10376 - 1] = (byte) ((int) (var1 >> 8));
            this.field10375[++this.field10376 - 1] = (byte) ((int) var1);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.q(" + ')');
        }
    }

    public int method6386(int var1) {
        try {
            byte var2 = this.field10375[++this.field10376 - 1];

            int var3;
            for (var3 = 0; var2 < 0; var2 = this.field10375[++this.field10376 - 1]) {
                var3 = (var3 | var2 & 127) << 7;
            }

            return var3 | var2;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.au(" + ')');
        }
    }

    public void method6387(int[] var1, int var2) {
        try {
            int var3 = this.field10376 / 8;
            this.field10376 = 0;

            for (int var4 = 0; var4 < var3; ++var4) {
                int var5 = this.method6420((byte) -31);
                int var6 = this.method6420((byte) -90);
                int var7 = -957401312;
                int var8 = -1640531527;

                for (int var9 = 32; var9-- > 0; var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3]) {
                    var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7;
                    var7 -= var8;
                }

                this.field10376 -= 8;
                this.method6364(var5, -429646008);
                this.method6364(var6, 96557392);
            }

        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "acx.ar(" + ')');
        }
    }

    public void method6388(int[] var1, int var2, int var3, int var4) {
        try {
            int var5 = this.field10376;
            this.field10376 = var2;
            int var6 = (var3 - var2) / 8;

            for (int var7 = 0; var7 < var6; ++var7) {
                int var8 = this.method6420((byte) -6);
                int var9 = this.method6420((byte) -16);
                int var10 = 0;
                int var11 = -1640531527;

                for (int var12 = 32; var12-- > 0; var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var10 + var1[var10 >>> 11 & 3]) {
                    var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10;
                    var10 += var11;
                }

                this.field10376 -= 8;
                this.method6364(var8, -1455722924);
                this.method6364(var9, -1798688670);
            }

            this.field10376 = var5;
        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "acx.ac(" + ')');
        }
    }

    public void method6389(int[] var1, int var2, int var3, int var4) {
        try {
            int var5 = this.field10376;
            this.field10376 = var2;
            int var6 = (var3 - var2) / 8;

            for (int var7 = 0; var7 < var6; ++var7) {
                int var8 = this.method6420((byte) -22);
                int var9 = this.method6420((byte) -60);
                int var10 = -957401312;
                int var11 = -1640531527;

                for (int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var1[var10 & 3] + var10) {
                    var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var10 + var1[var10 >>> 11 & 3];
                    var10 -= var11;
                }

                this.field10376 -= 8;
                this.method6364(var8, -1451619282);
                this.method6364(var9, -1662476613);
            }

            this.field10376 = var5;
        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "acx.am(" + ')');
        }
    }

    public int method6390(byte var1) {
        try {
            this.field10376 += 3;
            return (this.field10375[this.field10376 - 1] & 255) + ((this.field10375[this.field10376 - 3] & 255) << 16) + ((this.field10375[this.field10376 - 2] & 255) << 8);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.ad(" + ')');
        }
    }

    public int method6391(int var1, int var2) {
        try {
            int var3 = class182.method3306(this.field10375, var1, this.field10376, -1501053505);
            this.method6364(var3, 533083974);
            return var3;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.bf(" + ')');
        }
    }

    public boolean method6392(byte var1) {
        try {
            this.field10376 -= 4;
            int var2 = class182.method3306(this.field10375, 0, this.field10376, -395934040);
            int var3 = this.method6420((byte) -63);
            return var3 == var2;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.be(" + ')');
        }
    }

    public void method6393(int var1, int var2) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) (128 + var1);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.by(" + ')');
        }
    }

    public void method6394(int var1, int var2) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) (0 - var1);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.bm(" + ')');
        }
    }

    public int method6395(int var1) {
        try {
            return this.field10375[++this.field10376 - 1] - 128 & 255;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bx(" + ')');
        }
    }

    public int method6396(short var1) {
        try {
            return 0 - this.field10375[++this.field10376 - 1] & 255;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bo(" + ')');
        }
    }

    public int method6397(byte var1) {
        try {
            return 128 - this.field10375[++this.field10376 - 1] & 255;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bb(" + ')');
        }
    }

    public byte method6398(int var1) {
        try {
            return (byte) (0 - this.field10375[++this.field10376 - 1]);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bu(" + ')');
        }
    }

    public byte method6399(int var1) {
        try {
            return (byte) (128 - this.field10375[++this.field10376 - 1]);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bw(" + ')');
        }
    }

    public void method6400(int var1) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) (var1 + 128);
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 8);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bg(" + ')');
        }
    }

    public int method6401(byte var1) {
        try {
            this.field10376 += 2;
            return (this.field10375[this.field10376 - 2] & 255) + ((this.field10375[this.field10376 - 1] & 255) << 8);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bs(" + ')');
        }
    }

    public int method6402(int var1) {
        try {
            this.field10376 += 2;
            return ((this.field10375[this.field10376 - 2] & 255) << 8) + (this.field10375[this.field10376 - 1] - 128 & 255);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bp(" + ')');
        }
    }

    public int method6403(int var1) {
        try {
            this.field10376 += 2;
            return ((this.field10375[this.field10376 - 1] & 255) << 8) + (this.field10375[this.field10376 - 2] - 128 & 255);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bv(" + ')');
        }
    }

    public int method6404(byte var1) {
        try {
            this.field10376 += 3;
            int var2 = ((this.field10375[this.field10376 - 3] & 255) << 16) + ((this.field10375[this.field10376 - 2] & 255) << 8) + (this.field10375[this.field10376 - 1] & 255);
            if (var2 > 8388607) {
                var2 -= 16777216;
            }

            return var2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.av(" + ')');
        }
    }

    public int method6405(byte var1) {
        try {
            this.field10376 += 3;
            return (this.field10375[this.field10376 - 2] & 255) + ((this.field10375[this.field10376 - 3] & 255) << 16) + ((this.field10375[this.field10376 - 1] & 255) << 8);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bn(" + ')');
        }
    }

    public void method6406(int var1, byte var2) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) var1;
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 8);
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 16);
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 24);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.bi(" + ')');
        }
    }

    public byte method6407(byte var1) {
        try {
            return (byte) (this.field10375[++this.field10376 - 1] - 128);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bl(" + ')');
        }
    }

    public void method6408(int var1) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 16);
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 24);
            this.field10375[++this.field10376 - 1] = (byte) var1;
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 8);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bt(" + ')');
        }
    }

    public int method6409(int var1) {
        try {
            this.field10376 += 4;
            return ((this.field10375[this.field10376 - 3] & 255) << 8) + ((this.field10375[this.field10376 - 1] & 255) << 24) + ((this.field10375[this.field10376 - 2] & 255) << 16) + (this.field10375[this.field10376 - 4] & 255);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bj(" + ')');
        }
    }

    public int method6410(byte var1) {
        try {
            this.field10376 += 4;
            return (this.field10375[this.field10376 - 2] & 255) + ((this.field10375[this.field10376 - 1] & 255) << 8) + ((this.field10375[this.field10376 - 4] & 255) << 16) + ((this.field10375[this.field10376 - 3] & 255) << 24);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bz(" + ')');
        }
    }

    public void method6411(int var1, byte var2) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 16);
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 8);
            this.field10375[++this.field10376 - 1] = (byte) var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.d(" + ')');
        }
    }

    public void method6412(BigInteger var1, BigInteger var2, int var3) {
        try {
            int var4 = this.field10376;
            this.field10376 = 0;
            byte[] var5 = new byte[var4];
            this.method6381(var5, 0, var4, -953523806);
            BigInteger var6 = new BigInteger(var5);
            BigInteger var7 = Loader.field6965 ? var6 : var6.modPow(var1, var2);
            byte[] var8 = var7.toByteArray();
            this.field10376 = 0;
            this.method6362(var8.length, 16711935);
            this.method6425(var8, 0, var8.length, (short) -25461);
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "acx.bd(" + ')');
        }
    }

    public String method6413(int var1) {
        try {
            byte var2 = this.field10375[++this.field10376 - 1];
            if (var2 != 0) {
                throw new IllegalStateException("");
            } else {
                int var3 = this.field10376;

                while (this.field10375[++this.field10376 - 1] != 0) {
                    if (var1 != 681479919) {
                        throw new IllegalStateException();
                    }
                }

                int var4 = this.field10376 - var3 - 1;
                return var4 == 0 ? "" : class783.method2497(this.field10375, var3, var4, -1673599026);
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "acx.aw(" + ')');
        }
    }

    public int method6414(int var1) {
        try {
            this.field10376 += 4;
            return ((this.field10375[this.field10376 - 1] & 255) << 16) + ((this.field10375[this.field10376 - 2] & 255) << 24) + ((this.field10375[this.field10376 - 4] & 255) << 8) + (this.field10375[this.field10376 - 3] & 255);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.br(" + ')');
        }
    }

    public void method6415(int var1, byte var2) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) (128 - var1);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.bc(" + ')');
        }
    }

    public void method6416(int var1, int var2) {
        try {
            if ((var1 & -128) != 0) {
                if ((var1 & -16384) != 0) {
                    if ((var1 & -2097152) != 0) {
                        if ((var1 & -268435456) != 0) {
                            this.method6361(var1 >>> 28 | 128);
                        }

                        this.method6361(var1 >>> 21 | 128);
                    }

                    this.method6361(var1 >>> 14 | 128);
                }

                this.method6361(var1 >>> 7 | 128);
            }

            this.method6361(var1 & 127);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.ax(" + ')');
        }
    }

    public long method6417(int var1) {
        try {
            long var2 = (long) this.method6377(143621107) & 4294967295L;
            long var4 = (long) this.method6377(742659427) & 4294967295L;
            return (var4 << 32) + var2;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "acx.az(" + ')');
        }
    }

    public void method6418(String var1, short var2) {
        try {
            int var3 = var1.indexOf(0);
            if (var3 >= 0) {
                throw new IllegalArgumentException("");
            } else {
                this.field10375[++this.field10376 - 1] = 0;
                this.field10376 += class861.method5350(var1, 0, var1.length(), this.field10375, this.field10376, (byte) 102);
                this.field10375[++this.field10376 - 1] = 0;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.c(" + ')');
        }
    }

    public void method6419(int var1) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 8);
            this.field10375[++this.field10376 - 1] = (byte) (var1 + 128);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bq(" + ')');
        }
    }

    public int method6420(byte var1) {
        try {
            this.field10376 += 4;
            return ((this.field10375[this.field10376 - 3] & 255) << 16) + ((this.field10375[this.field10376 - 4] & 255) << 24) + ((this.field10375[this.field10376 - 2] & 255) << 8) + (this.field10375[this.field10376 - 1] & 255);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.at(" + ')');
        }
    }

    public void method6421(int var1, int var2) {
        try {
            this.field10375[++this.field10376 - 1] = (byte) var1;
            this.field10375[++this.field10376 - 1] = (byte) (var1 >> 8);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.bk(" + ')');
        }
    }

    public int method6422(int var1) {
        try {
            int var2 = this.field10375[this.field10376] & 255;
            return var2 < 128 ? this.method6371() - 64 : this.method6374() - '쀀';
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.aj(" + ')');
        }
    }

    public int method6423(int var1) {
        try {
            if (this.field10375[this.field10376] < 0) {
                return this.method6420((byte) 33) & Integer.MAX_VALUE;
            } else {
                int var2 = this.method6374();
                return 32767 == var2 ? -1 : var2;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.an(" + ')');
        }
    }

    public long method6424(int var1, byte var2) {
        try {
            --var1;
            if (var1 >= 0 && var1 <= 7) {
                int var3 = 8 * var1;

                long var4;
                for (var4 = 0L; var3 >= 0; var3 -= 8) {
                    var4 |= ((long) this.field10375[++this.field10376 - 1] & 255L) << var3;
                }

                return var4;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "acx.as(" + ')');
        }
    }

    public void method6425(byte[] var1, int var2, int var3, short var4) {
        try {
            for (int var5 = var2; var5 < var3 + var2; ++var5) {
                this.field10375[++this.field10376 - 1] = var1[var5];
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "acx.m(" + ')');
        }
    }

    public void method6426(int var1, byte var2) {
        try {
            this.field10375[this.field10376 - var1 - 1] = (byte) var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "acx.o(" + ')');
        }
    }

    public void method6427(int var1) {
        try {
            if (this.field10375 != null) {
                class44.method3082(this.field10375, -860028882);
            }

            this.field10375 = null;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.b(" + ')');
        }
    }

    public int method6428(int var1) {
        try {
            this.field10376 += 2;
            int var2 = (this.field10375[this.field10376 - 2] & 255) + ((this.field10375[this.field10376 - 1] & 255) << 8);
            if (var2 > 32767) {
                var2 -= 65536;
            }

            return var2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.bh(" + ')');
        }
    }

    public String method6429(int var1) {
        try {
            if (this.field10375[this.field10376] == 0) {
                ++this.field10376;
                return null;
            } else {
                return this.method6379(541883117);
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acx.ap(" + ')');
        }
    }
}
