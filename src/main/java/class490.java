import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Iterator;

public class class490 {
    public static class394 field7866;
    static InputStream field7865;
    public int field7862;
    public int field7863;
    public int field7864;

    public static void method4431(SceneGraph var0, class848 var1, int var2) {
        try {
            Iterator var3 = class198.field7046.iterator();

            while (var3.hasNext()) {
                class726 var4 = (class726) var3.next();
                if (var4.field2547) {
                    var4.method1728(var0, var1);
                }
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "nq.b(" + ')');
        }
    }

    static final void method4432(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            String var4 = (String) var2.field3157[--var2.field3158];
            if (class960.method2212(var4, var2, -68836416) != null) {
                var4 = var4.substring(0, var4.length() - 1);
            }

            var0.field1016 = class634.method5872(var4, var2, -2046058202);
            var0.field963 = true;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "nq.lt(" + ')');
        }
    }

    public static void method4433(boolean var0, byte[] var1, int var2) {
        try {
            if (field7865 == null) {
                field7865 = new InputStream(20000);
            }

            field7865.method6425(var1, 0, var1.length, (short) -3701);
            if (var0) {
                class488.method4735(field7865.field10375, 325303236);
                class601.field9199 = new class471[class104.field170];
                int var3 = 0;

                for (int var4 = class769.field3692; var4 <= class886.field10135; ++var4) {
                    class471 var5 = class695.method3937(var4, (byte) 40);
                    if (var5 != null) {
                        class601.field9199[var3++] = var5;
                    }
                }

                class601.field9198 = false;
                class191.field7004 = class27.resetTimer((byte) 1);
                field7865 = null;
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "nq.p(" + ')');
        }
    }

    static final boolean method4434(char var0, int var1) {
        try {
            return var0 == ' ' || var0 == ' ' || var0 == '_' || '-' == var0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "nq.b(" + ')');
        }
    }

    static class347 method4435(InputStream var0, int var1) {
        try {
            var0.method6371();
            int var2 = var0.method6371();
            class347 var3 = class984.method1883(var2, (byte) 11);
            var3.field267 = var0.method6371();
            int var4 = var0.method6371();

            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = var0.method6371();
                var3.method209(var6, var0, (byte) 92);
            }

            var3.method205(-245700254);
            return var3;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "nq.u(" + ')');
        }
    }

    static final void method4436(class744 var0, int var1) {
        try {
            String var2 = "";
            if (class397.field6496 != null) {
                Transferable var3 = class397.field6496.getContents((Object) null);
                if (var3 != null) {
                    try {
                        var2 = (String) var3.getTransferData(DataFlavor.stringFlavor);
                        if (var2 == null) {
                            var2 = "";
                        }
                    } catch (Exception var5) {
                        ;
                    }
                }
            }

            var0.field3157[++var0.field3158 - 1] = var2;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "nq.afl(" + ')');
        }
    }

    static void method4437(int var0) {
        try {
            class602.field8633 = new MenuItem(class814.field4808.method2927(class321.field1066, -875414210), "", class730.field2919, 1006, -1, 0L, 0, 0, true, false, 0L, true);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "nq.k(" + ')');
        }
    }

    static final void method4438(class744 var0, int var1) {
        try {
            int var2 = class730.field2748[var0.field3161[--var0.field3156]].length >> 1;
            var0.field3161[++var0.field3156 - 1] = var2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "nq.afz(" + ')');
        }
    }

    void method4429(InputStream var1, int var2) {
        try {
            while (true) {
                int var3 = var1.method6371();
                if (var3 == 0) {
                    return;
                }

                this.method4430(var1, var3, 1156077382);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "nq.a(" + ')');
        }
    }

    void method4430(InputStream var1, int var2, int var3) {
        try {
            if (1 == var2) {
                this.field7863 = var1.method6374();
                this.field7862 = var1.method6371();
                this.field7864 = var1.method6371();
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "nq.f(" + ')');
        }
    }
}
