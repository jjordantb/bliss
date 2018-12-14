import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

public class class618 {
    static {
        new HashMap();
    }

    class618() throws Throwable {
        throw new Error();
    }

    public static byte[] method5161(Object var0, int var1, int var2, byte var3) {
        try {
            if (var0 == null) {
                return null;
            } else if (var0 instanceof byte[]) {
                byte[] var7 = (byte[]) var0;
                return Arrays.copyOfRange(var7, var1, var1 + var2);
            } else if (var0 instanceof ByteBuffer) {
                ByteBuffer var4 = (ByteBuffer) var0;
                byte[] var5 = new byte[var2];
                var4.position(var1);
                var4.get(var5, 0, var2);
                return var5;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "rf.b(" + ')');
        }
    }

    public static int method5162(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            if ((var5 & 1) == 1) {
                int var7 = var3;
                var3 = var4;
                var4 = var7;
            }

            var2 &= 3;
            if (var2 == 0) {
                return var0;
            } else if (var2 == 1) {
                return var1;
            } else {
                return 2 == var2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
            }
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "rf.i(" + ')');
        }
    }

    static String method5163(CharSequence var0, class21 var1, byte var2) {
        try {
            if (var0 == null) {
                return null;
            } else {
                int var3 = 0;

                int var4;
                for (var4 = var0.length(); var3 < var4 && class490.method4434(var0.charAt(var3), 185580898); ++var3) {
                    ;
                }

                while (var4 > var3 && class490.method4434(var0.charAt(var4 - 1), -1519613648)) {
                    --var4;
                }

                int var5 = var4 - var3;
                if (var5 >= 1 && var5 <= class95.method525(var1, 1677499576)) {
                    StringBuilder var6 = new StringBuilder(var5);

                    for (int var7 = var3; var7 < var4; ++var7) {
                        char var8 = var0.charAt(var7);
                        if (class535.method2282(var8, -1788323982)) {
                            char var9 = class574.method132(var8, 1232009783);
                            if (var9 != 0) {
                                var6.append(var9);
                            }
                        }
                    }

                    if (var6.length() == 0) {
                        return null;
                    } else {
                        return var6.toString();
                    }
                } else {
                    return null;
                }
            }
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "rf.i(" + ')');
        }
    }
}
