package I;

import java.io.InputStream;

public class I {
    static byte[] getResourceAsStream;
    static String[] intern = new String[256];
    static int[] read = new int[256];

    static {
        try {
            InputStream var0 = (new I()).getClass().getResourceAsStream("" + 'I' + '.' + 'g' + 'i' + 'f');
            if (var0 != null) {
                int var1 = var0.read() << 16 | var0.read() << 8 | var0.read();
                getResourceAsStream = new byte[var1];
                int var2 = 0;
                byte var3 = (byte) var1;
                byte[] var4 = getResourceAsStream;

                while (var1 != 0) {
                    int var5 = var0.read(var4, var2, var1);
                    if (var5 == -1) {
                        break;
                    }

                    var1 -= var5;

                    for (var5 += var2; var2 < var5; ++var2) {
                        var4[var2] ^= var3;
                    }
                }

                var0.close();
            }
        } catch (Exception var6) {
            ;
        }

    }

    public static final synchronized String I(int var0) {
        int var1 = var0 & 255;
        if (read[var1] != var0) {
            read[var1] = var0;
            if (var0 < 0) {
                var0 &= 65535;
            }

            String var2 = (new String(getResourceAsStream, var0, getResourceAsStream[var0 - 1] & 255)).intern();
            intern[var1] = var2;
        }

        return intern[var1];
    }
}
