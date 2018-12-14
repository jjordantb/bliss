public class class118 {
    public static int field2158;
    public int field2152;
    public int field2153;
    public int[] field2154;
    public int[] field2155;
    public class23 field2156;
    int field2157;

    class118(int var1, int var2, int[] var3, int[] var4, class23 var5, int var6) {
        this.field2152 = var1;
        this.field2153 = var2;
        this.field2154 = var3;
        this.field2155 = var4;
        this.field2156 = var5;
        this.field2157 = var6;
    }

    static boolean method1458(byte var0) {
        try {
            return class447.method4319(class422.field9604.field2973, -1677177503);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "et.f(" + ')');
        }
    }

    static String method1459(String var0, byte var1) {
        try {
            String var2 = null;
            int var3 = var0.indexOf("--> ");
            if (var3 >= 0) {
                var2 = var0.substring(0, 4 + var3);
                var0 = var0.substring(var3 + 4);
            }

            if (var0.startsWith("directlogin ")) {
                int var4 = var0.indexOf(" ", "directlogin ".length());
                if (var4 >= 0) {
                    int var5 = var0.length();
                    var0 = var0.substring(0, var4) + " ";

                    for (int var6 = var4 + 1; var6 < var5; ++var6) {
                        var0 = var0 + "*";
                    }
                }
            }

            return var2 != null ? var2 + var0 : var0;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "et.z(" + ')');
        }
    }

    static final void method1460(class744 var0, byte var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class552.method457(class730.field2733, (byte) -20) ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "et.afp(" + ')');
        }
    }

    public static void method1461(byte var0) {
        try {
            for (class689 var1 = (class689) class371.field1088.method2946(2005270396); var1 != null; var1 = (class689) class371.field1088.method2945((byte) 63)) {
                class56.method1546(var1.field7628, (byte) 69);
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "et.x(" + ')');
        }
    }

    public static final void method1462(int var0) {
        try {
            String var1 = class51.field2310 != null ? class51.field2310 : class833.method5432((byte) -3);
            class158.method3442(var1, false, class615.field8903.field9137.method3689(-2014540467) == 5, class730.field2849, class730.field2632, (byte) 37);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "et.fb(" + ')');
        }
    }

    public static void method1463(int var0, int var1, int var2) {
        try {
            class701 var3 = class637.method5936(class643.field10002, class730.field2692.field7765, (byte) 84);
            var3.field3364.method6364(var0, -1769259974);
            var3.field3364.method6419(var1);
            class730.field2692.method4380(var3, (byte) -5);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "et.ks(" + ')');
        }
    }

    static final void method1464(class744 var0, short var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class740.field3199;
            var0.field3161[++var0.field3156 - 1] = class162.field6603;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "et.adn(" + ')');
        }
    }

    static void method1465(Widget[] var0, Widget var1, boolean var2, short var3) {
        try {
            int var4 = var1.field893 != 0 ? 1867913305 * var1.field893 * -1609060375 : -2093041337 * var1.field881 * -614915977;
            int var5 = var1.field894 != 0 ? var1.field894 * -1638942269 * 2053897963 : 457937409 * var1.field887 * -67604991;
            class381.method1066(var0, var1.field867, var4, var5, var2, (short) 17804);
            if (var1.children2 != null) {
                class381.method1066(var1.children2, var1.field867, var4, var5, var2, (short) -9832);
            }

            class256 var6 = (class256) class730.field2823.method2942((long) var1.field867);
            if (var6 != null) {
                class811.method2924(var6.field8101, var4, var5, var2, 1828905535);
            }

            if (var1 == class730.field2800) {
                int var7 = class498.field8102;
                int[] var8 = class498.field8108;

                int var9;
                for (var9 = 0; var9 < var7; ++var9) {
                    Player var10 = class730.loaded[var8[var9]];
                    if (var10 != null) {
                        var10.method2570(var4, var5, var2, 1554634008);
                    }
                }

                for (var9 = 0; var9 < class730.field2684; ++var9) {
                    int var13 = class730.field2680[var9];
                    class437 var11 = (class437) class730.field2677.method2942((long) var13);
                    if (var11 != null) {
                        ((Actor) var11.field7515).method2570(var4, var5, var2, 1554634008);
                    }
                }
            }

        } catch (RuntimeException var12) {
            throw class158.method3445(var12, "et.ko(" + ')');
        }
    }

    static final void method1466(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class172.method3030(var3, var4, var0, -125767294);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "et.nl(" + ')');
        }
    }

    static final void method1467(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            if (class382.widgetContainers[var2] == null) {
                var0.field3157[++var0.field3158 - 1] = "";
            } else {
                String var4 = class382.widgetContainers[var2].widgetsCopy[var3].field984;
                if (var4 == null) {
                    var0.field3157[++var0.field3158 - 1] = "";
                } else {
                    var0.field3157[++var0.field3158 - 1] = var4;
                }
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "et.alv(" + ')');
        }
    }

    static final void method1468(class563 var0, int var1) {
        try {
            SceneGraph var2 = class730.field2697.method5317(-1611682495);
            if (var2 != null) {
                class265 var3 = null;
                if (var0.field1076 == 0) {
                    var3 = (class265) var2.method2425(var0.field1070, var0.field1069, var0.field1074, 1297068206);
                }

                if (var0.field1076 == 1) {
                    var3 = (class265) var2.method2427(var0.field1070, var0.field1069, var0.field1074, 1080081135);
                }

                if (2 == var0.field1076) {
                    var3 = (class265) var2.method2429(var0.field1070, var0.field1069, var0.field1074, class730.field2942, -2076271452);
                }

                if (var0.field1076 == 3) {
                    var3 = (class265) var2.method2452(var0.field1070, var0.field1069, var0.field1074, (byte) 16);
                }

                if (var3 != null) {
                    var0.field1067 = var3.getID();
                    var0.field1073 = var3.method4548(726839210);
                    var0.field1080 = var3.method4549((short) 24143);
                } else {
                    var0.field1067 = -1;
                    var0.field1073 = 0;
                    var0.field1080 = 0;
                }
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "et.p(" + ')');
        }
    }

    public boolean method1457(int var1, int var2, int var3) {
        try {
            if (var2 >= 0 && var2 < this.field2155.length) {
                int var4 = this.field2155[var2];
                if (var1 >= var4 && var1 <= this.field2154[var2] + var4) {
                    return true;
                }
            }

            return false;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "et.a(" + ')');
        }
    }
}
