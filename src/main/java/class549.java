import sun.awt.Win32GraphicsDevice;

import java.awt.*;
import java.lang.reflect.Field;

public class class549 {
    GraphicsDevice field436;
    DisplayMode field437;

    public class549() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field436 = var1.getDefaultScreenDevice();
        if (!this.field436.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;

            for (int var4 = 0; var4 < var3.length; ++var4) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field436 = var5;
                    return;
                }
            }

            throw new Exception();
        }
    }

    public void method391() {
        try {
            if (this.field437 != null) {
                this.field436.setDisplayMode(this.field437);
                if (!this.field436.getDisplayMode().equals(this.field437)) {
                    throw new RuntimeException("");
                }

                this.field437 = null;
            }

            this.method394((Frame) null, -2144003881);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "sv.exit(" + ')');
        }
    }

    public int[] method392() {
        try {
            DisplayMode[] var1 = this.field436.getDisplayModes();
            int[] var2 = new int[var1.length << 2];

            for (int var3 = 0; var3 < var1.length; ++var3) {
                var2[var3 << 2] = var1[var3].getWidth();
                var2[(var3 << 2) + 1] = var1[var3].getHeight();
                var2[2 + (var3 << 2)] = var1[var3].getBitDepth();
                var2[3 + (var3 << 2)] = var1[var3].getRefreshRate();
            }

            return var2;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "sv.listmodes(" + ')');
        }
    }

    public void method393(Frame var1, int var2, int var3, int var4, int var5) {
        try {
            this.field437 = this.field436.getDisplayMode();
            if (this.field437 == null) {
                throw new NullPointerException();
            } else {
                var1.setUndecorated(true);
                var1.enableInputMethods(false);
                this.method394(var1, -2144003881);
                if (var5 == 0) {
                    int var6 = this.field437.getRefreshRate();
                    DisplayMode[] var7 = this.field436.getDisplayModes();
                    boolean var8 = false;

                    for (int var9 = 0; var9 < var7.length; ++var9) {
                        if (var7[var9].getWidth() == var2 && var7[var9].getHeight() == var3 && var7[var9].getBitDepth() == var4) {
                            int var10 = var7[var9].getRefreshRate();
                            if (!var8 || Math.abs(var10 - var6) < Math.abs(var5 - var6)) {
                                var5 = var10;
                                var8 = true;
                            }
                        }
                    }

                    if (!var8) {
                        var5 = var6;
                    }
                }

                this.field436.setDisplayMode(new DisplayMode(var2, var3, var4, var5));
            }
        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "sv.enter(" + ')');
        }
    }

    void method394(Frame var1, int var2) {
        try {
            boolean var3 = false;

            Field var4;
            try {
                var4 = Win32GraphicsDevice.class.getDeclaredField("valid");
                var4.setAccessible(true);
                boolean var5 = ((Boolean) var4.get(this.field436)).booleanValue();
                if (var5) {
                    var4.set(this.field436, Boolean.FALSE);
                    var3 = true;
                }
            } catch (Throwable var8) {
                ;
            }

            try {
                this.field436.setFullScreenWindow(var1);
            } catch (RuntimeException var9) {
                if (var3) {
                    try {
                        Field var11 = Win32GraphicsDevice.class.getDeclaredField("valid");
                        var11.set(this.field436, Boolean.TRUE);
                    } catch (Throwable var6) {
                        ;
                    }
                }

                throw var9;
            }

            if (var3) {
                try {
                    var4 = Win32GraphicsDevice.class.getDeclaredField("valid");
                    var4.set(this.field436, Boolean.TRUE);
                } catch (Throwable var7) {
                    ;
                }
            }

        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "sv.a(" + ')');
        }
    }
}
