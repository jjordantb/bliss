import java.io.File;
import java.io.RandomAccessFile;

public class class299 {
    class299() throws Throwable {
        throw new Error();
    }

    static void method6552(InputStream var0, byte var1) {
        try {
            if (var0.field10375.length - var0.field10376 >= 1) {
                int var2 = var0.method6371();
                if (var2 >= 0 && var2 <= 1 && var0.field10375.length - var0.field10376 >= 2) {
                    int var3 = var0.method6374();
                    if (var0.field10375.length - var0.field10376 >= var3 * 6) {
                        for (int var4 = 0; var4 < var3; ++var4) {
                            int var5 = var0.method6374();
                            int var6 = var0.method6420((byte) 13);
                            if (var5 < class14.field6693.length && class474.field8271[var5] && (class671.field7472.method6332(var5, (byte) 10).field9808 != '1' || var6 >= -1 && var6 <= 1)) {
                                class14.field6693[var5] = var6;
                            }
                        }
                    }
                }
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "tw.q(" + ')');
        }
    }

    static final void method6553(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class115.method1275(var3, var4, var0, (byte) -55);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "tw.cg(" + ')');
        }
    }

    static File method6554(String var0, byte var1) {
        try {
            if (!class882.field10203) {
                throw new RuntimeException("");
            } else {
                File var2 = (File) class882.field10204.get(var0);
                if (var2 != null) {
                    return var2;
                } else {
                    File var3 = new File(class882.field10202, var0);
                    RandomAccessFile var4 = null;

                    File var7;
                    try {
                        File var5 = new File(var3.getParent());
                        if (!var5.exists()) {
                            throw new RuntimeException("");
                        }

                        var4 = new RandomAccessFile(var3, "rw");
                        int var11 = var4.read();
                        var4.seek(0L);
                        var4.write(var11);
                        var4.seek(0L);
                        var4.close();
                        class882.field10204.put(var0, var3);
                        var7 = var3;
                    } catch (Exception var9) {
                        try {
                            if (var4 != null) {
                                var4.close();
                                Object var6 = null;
                            }
                        } catch (Exception var8) {
                            ;
                        }

                        throw new RuntimeException();
                    }

                    return var7;
                }
            }
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "tw.f(" + ')');
        }
    }

    static void method6555(int var0) {
        try {
            class1 var1 = class759.field4330;
            synchronized (class759.field4330) {
                class759.field4330.method2977();
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "tw.b(" + ')');
        }
    }

    static short[][] method6556(float[][] var0, short[][] var1, byte var2) {
        try {
            for (int var3 = 0; var3 < var0.length; ++var3) {
                for (int var4 = 0; var4 < var1[var3].length; ++var4) {
                    var1[var3][var4] = (short) ((int) (16383.0F * var0[var3][var4]));
                }
            }

            return var1;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "tw.q(" + ')');
        }
    }

    static final void method6557(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        try {
            int var8 = var6 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }

            int var9 = class730.field2905 + var8 * (class730.field2913 - class730.field2905) / 100;
            var5 = var9 * var5 >> 8;
            int var10 = 16384 - var3 & 16383;
            int var11 = 16384 - var4 & 16383;
            int var12 = 0;
            int var13 = 0;
            int var14 = var5;
            if (var10 != 0) {
                var13 = -var5 * class703.field3413[var10] >> 14;
                var14 = class703.field3404[var10] * var5 >> 14;
            }

            if (var11 != 0) {
                var12 = class703.field3413[var11] * var14 >> 14;
                var14 = class703.field3404[var11] * var14 >> 14;
            }

            class103.field205 = var0 - var12;
            class184.field5230 = var1 - var13;
            class7.field4918 = var2 - var14;
            class730.field2737 = var3;
            class232.field8266 = var4;
            class791.field446 = 0;
        } catch (RuntimeException var15) {
            throw class158.method3445(var15, "tw.je(" + ')');
        }
    }
}
