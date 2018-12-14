import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.Iterator;

public final class class4 {
    public static boolean field4946;

    class4() throws Throwable {
        throw new Error();
    }

    static final void method2962(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            long var2 = (long) var0.field3161[var0.field3156];
            long var4 = (long) var0.field3161[var0.field3156 + 1];
            var0.field3161[++var0.field3156 - 1] = (int) (var2 + var2 * var4 / 100L);
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "qw.yx(" + ')');
        }
    }

    static final void method2963(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            if (class382.widgetContainers[var2] == null) {
                var0.field3161[++var0.field3156 - 1] = 0;
            } else {
                var0.field3161[++var0.field3156 - 1] = class382.widgetContainers[var2].widgetsCopy[var3].field866;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "qw.ale(" + ')');
        }
    }

    static final void method2964(boolean var0, int var1) {
        try {
            class730.field2689 = 0;
            class730.field2789 = 0;
            ++class730.field2688;
            class603.method5083(1694864911);
            class823.method5362(var0, -775686729);
            class253.method4480((short) -6102);
            boolean var2 = false;

            int var3;
            int var4;
            for (var3 = 0; var3 < class730.field2689; ++var3) {
                var4 = class730.field2690[var3];
                class437 var5 = (class437) class730.field2677.method2942((long) var4);
                Npc var6 = (Npc) var5.field7515;
                if (var6.field4039 != class730.field2688) {
                    if (class602.field8645 && class779.method2322(var4, 351851633)) {
                        class979.method1835(2025307040);
                    }

                    if (var6.field1637.method6112((byte) 32)) {
                        class153.method3396(var6, (byte) 35);
                    }

                    var6.method1248((NpcDefinition) null, 1734282756);
                    var5.method545(-1460969981);
                    var2 = true;
                }
            }

            if (var2) {
                var3 = class730.field2753;
                class730.field2753 = class730.field2677.method2944(1946710966);
                var4 = 0;

                class437 var9;
                for (Iterator var8 = class730.field2677.iterator(); var8.hasNext(); class730.field2797[var4++] = var9) {
                    var9 = (class437) var8.next();
                }

                for (int var10 = class730.field2753; var10 < var3; ++var10) {
                    class730.field2797[var10] = null;
                }
            }

            int var10000 = class730.field2692.field7768.field10376 * 116413311;
            var10000 = class730.field2692.field7771 * -1265692267;

            for (var3 = 0; var3 < class730.field2684; ++var3) {
                class730.field2677.method2942((long) class730.field2680[var3]);
            }

            var10000 = class730.field2753 * -118843751;
            var10000 = class730.field2684 * -409937273;

            for (var3 = 0; var3 < class730.field2753; ++var3) {
                var10000 = ((Actor) class730.field2797[var3].field7515).field4039 * -699023045;
                var10000 = class730.field2688 * 1968119283;
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "qw.jq(" + ')');
        }
    }

    public static final void method2965(int var0, String var1, Color var2, Color var3, Color var4, byte var5) {
        try {
            try {
                Graphics gg = class837.field9161.getGraphics();
                if (class56.field2320 == null) {
                    class56.field2320 = new Font("Helvetica", 1, 13);
                }

                if (var2 == null) {
                    var2 = new Color(140, 17, 17);
                }

                if (var3 == null) {
                    var3 = new Color(140, 17, 17);
                }

                if (var4 == null) {
                    var4 = new Color(255, 255, 255);
                }

                int var8;
                int var9;
                try {
                    if (class654.field9352 == null) {
                        class654.field9352 = class837.field9161.createImage(class759.field4331, class97.field614);
                    }

                    Graphics var7 = class654.field9352.getGraphics();
                    var7.setColor(Color.black);
                    var7.fillRect(0, 0, class759.field4331, class97.field614);
                    var8 = class759.field4331 / 2 - 152;
                    var9 = class97.field614 / 2 - 18;
                    var7.setColor(var3);
                    var7.drawRect(var8, var9, 303, 33);
                    var7.setColor(var2);
                    var7.fillRect(var8 + 2, var9 + 2, var0 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                    var7.fillRect(var0 * 3 + 2 + var8, var9 + 2, 300 - 3 * var0, 30);
                    var7.setFont(class56.field2320);
                    var7.setColor(var4);
                    var7.drawString(var1, var8 + (304 - var1.length() * 6) / 2, 22 + var9);
                    if (class69.field1825 != null) {
                        var7.setFont(class56.field2320);
                        var7.setColor(var4);
                        var7.drawString(class69.field1825, class759.field4331 / 2 - class69.field1825.length() * 6 / 2, class97.field614 / 2 - 26);
                    }

                    gg.drawImage(class654.field9352, 0, 0, (ImageObserver) null);
                } catch (Exception var10) {
                    gg.setColor(Color.black);
                    gg.fillRect(0, 0, class759.field4331, class97.field614);
                    var8 = class759.field4331 / 2 - 152;
                    var9 = class97.field614 / 2 - 18;
                    gg.setColor(var3);
                    gg.drawRect(var8, var9, 303, 33);
                    gg.setColor(var2);
                    gg.fillRect(var8 + 2, var9 + 2, 3 * var0, 30);
                    gg.setColor(Color.black);
                    gg.drawRect(var8 + 1, 1 + var9, 301, 31);
                    gg.fillRect(var0 * 3 + var8 + 2, 2 + var9, 300 - var0 * 3, 30);
                    gg.setFont(class56.field2320);
                    gg.setColor(var4);
                    if (class69.field1825 != null) {
                        gg.setFont(class56.field2320);
                        gg.setColor(var4);
                        gg.drawString(class69.field1825, class759.field4331 / 2 - class69.field1825.length() * 6 / 2, class97.field614 / 2 - 26);
                    }

                    gg.drawString(var1, var8 + (304 - var1.length() * 6) / 2, 22 + var9);
                }
            } catch (Exception var11) {
                class837.field9161.repaint();
            }

        } catch (RuntimeException var12) {
            throw class158.method3445(var12, "qw.av(" + ')');
        }
    }
}
