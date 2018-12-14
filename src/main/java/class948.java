import java.net.URL;

public class class948 {
    public static int field3276 = 0;
    public static int field3277 = 8;
    public static int field3278 = 16;
    public static int field3279 = 2;
    public static int field3280 = 1023;
    public static int field3281 = 8191;
    public static int field3282 = 32;
    public static int field3283 = 8;
    public static int[] field3284 = new int[]{3, 7, 15};
    public static int field3285 = 1;
    public static int field3286 = 0;
    public static int field3287 = 2;
    public static int field3288 = 32;
    public static int[] field3289 = new int[]{2047, 16383, 65535};
    public static class180 field3291;
    static class727 field3290;

    class948() throws Throwable {
        throw new Error();
    }

    static final void method1937(class744 var0, short var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class370.method880(var3, var4, var0, (byte) 7);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "cq.oz(" + ')');
        }
    }

    public static void method1938(WidgetContainer var0, Widget var1, boolean var2, int var3) {
        try {
            class118.method1465(var0.widgetsCopy, var1, var2, (short) -2046);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "cq.kh(" + ')');
        }
    }

    public static boolean method1939(String var0, int var1, String var2, int var3) {
        try {
            boolean var6;
            if (var1 == 0) {
                try {
                    if (!class407.field9261.startsWith("win")) {
                        throw new Exception();
                    } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
                        throw new Exception();
                    } else {
                        String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

                        for (int var5 = 0; var5 < var0.length(); ++var5) {
                            if (var13.indexOf(var0.charAt(var5)) == -1) {
                                throw new Exception();
                            }
                        }

                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
                        var6 = true;
                        return var6;
                    }
                } catch (Throwable var11) {
                    return false;
                }
            } else if (1 == var1) {
                try {
                    Object var4 = class872.method5895(class833.field9178, var2, new Object[]{(new URL(class833.field9178.getCodeBase(), var0)).toString()}, (byte) 44);
                    var6 = var4 != null;
                } catch (Throwable var7) {
                    return false;
                }

                return var6;
            } else if (2 == var1) {
                try {
                    class833.field9178.getAppletContext().showDocument(new URL(class833.field9178.getCodeBase(), var0), "_blank");
                    var6 = true;
                } catch (Exception var8) {
                    return false;
                }

                return var6;
            } else if (var1 == 3) {
                try {
                    class872.method5894(class833.field9178, "loggedout", (short) 1853);
                } catch (Throwable var10) {
                    ;
                }

                try {
                    class833.field9178.getAppletContext().showDocument(new URL(class833.field9178.getCodeBase(), var0), "_top");
                    var6 = true;
                } catch (Exception var9) {
                    return false;
                }

                return var6;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var12) {
            throw class158.method3445(var12, "cq.p(" + ')');
        }
    }
}
