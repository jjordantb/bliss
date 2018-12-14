import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class764 {
    public static int field4348;
    public static int field4349;
    public String field4343;
    public int field4344 = 1723266594;
    public int field4345 = -2031127069;
    public int field4347;
    boolean field4342 = false;
    boolean field4346 = true;

    public static Socket method2741(String var0, int var1) throws IOException {
        try {
            return new Socket(InetAddress.getByName(var0), var1);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "tk.a(" + ')');
        }
    }

    static final void method2744(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            int var3 = class85.field1121.method1566(var2).field4238;

            for (int var4 = 0; var4 < ItemDefinition.field4215.length; ++var4) {
                if (ItemDefinition.field4215[var4] == var2) {
                    var3 = ItemDefinition.field4216[var4];
                }
            }

            var0.field3161[++var0.field3156 - 1] = var3;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "tk.aad(" + ')');
        }
    }

    public static final void method2745(long var0) {
        try {
            if (var0 > 0L) {
                if (var0 % 10L == 0L) {
                    class717.method2031(var0 - 1L);
                    class717.method2031(1L);
                } else {
                    class717.method2031(var0);
                }
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "tk.a(" + ')');
        }
    }

    static void method2746(class744 var0, byte var1) {
        try {
            var0.field3161[var0.field3156 - 1] = class735.field3009.method4224(var0.field3161[var0.field3156 - 1], 245040087).field8988;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "tk.b(" + ')');
        }
    }

    public static void method2747(String var0, Throwable var1, short var2) {
        try {
            try {
                String var3 = "";
                if (var1 != null) {
                    var3 = class706.method1936(var1, (byte) 10);
                }

                if (var0 != null) {
                    if (var1 != null) {
                        var3 = var3 + " | ";
                    }

                    var3 = var3 + var0;
                }

                class776.method2298(var3, (byte) -97);
                var3 = class104.method146(var3, 1866879375);
                if (class862.field8933 != null) {
                    String var4 = "Unknown";
                    String var5 = "1.1";

                    try {
                        var4 = System.getProperty("java.vendor");
                        var5 = System.getProperty("java.version");
                    } catch (Exception var8) {
                        ;
                    }

                    URL var6 = new URL(class862.field8933.getCodeBase(), "clienterror.ws?c=" + class862.field8934 + "&cs=" + class878.field9821 + "&u=" + (class862.field8932 != null ? class104.method146(class862.field8932, 1755268630) : "" + class862.field8931) + "&v1=" + class104.method146(var4, 1908813810) + "&v2=" + class104.method146(var5, 1870225284) + "&e=" + var3);
                    DataInputStream var7 = new DataInputStream(var6.openStream());
                    var7.read();
                    var7.close();
                }
            } catch (Exception var9) {
                var9.printStackTrace();
            }

        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "tk.a(" + ')');
        }
    }

    public Socket method2740(int var1) throws IOException {
        try {
            return new Socket(InetAddress.getByName(Loader.field6960), Loader.field6961);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "tk.a(" + ')');
        }
    }

    public boolean method2742(class764 var1, int var2) {
        try {
            if (var1 == null) {
                return false;
            } else {
                return this.field4347 == var1.field4347 && this.field4343.equals(var1.field4343);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "tk.b(" + ')');
        }
    }

    public void method2743(int var1) {
        try {
            if (!this.field4346) {
                this.field4346 = true;
                this.field4342 = true;
            } else if (this.field4342) {
                this.field4342 = false;
            } else {
                this.field4346 = false;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "tk.f(" + ')');
        }
    }
}
