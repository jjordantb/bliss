import java.io.IOException;

public class class957 extends class353 {
    static int field3587 = 10;
    int field3586;
    class180 field3588;
    byte[][] field3589 = new byte[10][];
    int[] field3590;
    int field3591;
    InputStream field3592 = new InputStream((byte[]) null);
    InputStream field3593 = new InputStream((byte[]) null);

    public class957(int var1, class180 var2, int var3) {
        super(var1);
        this.field3588 = var2;
        this.field3586 = var3;
    }

    static final void method2100(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            String var4 = (String) var2.field3157[--var2.field3158];
            if (class960.method2212(var4, var2, -301797495) != null) {
                var4 = var4.substring(0, var4.length() - 1);
            }

            var0.field875 = class634.method5872(var4, var2, -2046058202);
            var0.field963 = true;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "acm.kh(" + ')');
        }
    }

    int method1374(byte[] var1, int var2) throws IOException {
        try {
            int var4;
            int var5;
            if (this.field3590 == null) {
                if (!this.field3588.method3260(this.field3586, 0, -925167069)) {
                    return 0;
                }

                byte[] var3 = this.field3588.method3285(this.field3586, 0, (byte) -2);
                if (var3 == null) {
                    throw new IllegalStateException("");
                }

                this.field3593.field10375 = var3;
                this.field3593.field10376 = 0;
                var4 = var3.length >> 1;
                this.field3590 = new int[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field3590[var5] = this.field3593.method6374();
                }
            }

            if (this.field3591 >= this.field3590.length) {
                return -1;
            } else {
                this.method2099((byte) 81);
                this.field3593.field10375 = var1;
                this.field3593.field10376 = 0;

                do {
                    if (this.field3593.field10376 >= this.field3593.field10375.length) {
                        this.field3593.field10375 = null;
                        return var1.length;
                    }

                    if (this.field3592.field10375 == null) {
                        if (this.field3589[0] == null) {
                            this.field3593.field10375 = null;
                            return this.field3593.field10376;
                        }

                        this.field3592.field10375 = this.field3589[0];
                    }

                    int var7 = this.field3593.field10375.length - this.field3593.field10376;
                    var4 = this.field3592.field10375.length - this.field3592.field10376;
                    if (var7 < var4) {
                        this.field3592.method6381(this.field3593.field10375, this.field3593.field10376, var7, -953523806);
                        this.field3593.field10375 = null;
                        return var1.length;
                    }

                    this.field3593.method6425(this.field3592.field10375, this.field3592.field10376, var4, (short) -26872);
                    this.field3592.field10375 = null;
                    this.field3592.field10376 = 0;
                    ++this.field3591;

                    for (var5 = 0; var5 < 9; ++var5) {
                        this.field3589[var5] = this.field3589[1 + var5];
                    }

                    this.field3589[9] = null;
                } while (this.field3591 < this.field3590.length);

                this.field3593.field10375 = null;
                return this.field3593.field10376;
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "acm.a(" + ')');
        }
    }

    public void method2099(byte var1) {
        try {
            if (this.field3590 != null) {
                for (int var2 = 0; var2 < 10 && var2 + this.field3591 < this.field3590.length; ++var2) {
                    if (this.field3589[var2] == null && this.field3588.method3260(this.field3590[var2 + this.field3591], 0, -951445461)) {
                        this.field3589[var2] = this.field3588.method3285(this.field3590[this.field3591 + var2], 0, (byte) -31);
                    }
                }
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "acm.as(" + ')');
        }
    }
}
