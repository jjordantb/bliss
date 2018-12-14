import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class class519 {
    public static List field4214 = new ArrayList();
    static char[] field4212 = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
    static int field4213;

    class519() throws Throwable {
        throw new Error();
    }

    public static void method2666(int[] var0, Object[] var1, int var2, int var3, int var4) {
        try {
            if (var2 < var3) {
                int var5 = (var3 + var2) / 2;
                int var6 = var2;
                int var7 = var0[var5];
                var0[var5] = var0[var3];
                var0[var3] = var7;
                Object var8 = var1[var5];
                var1[var5] = var1[var3];
                var1[var3] = var8;
                int var9 = Integer.MAX_VALUE == var7 ? 0 : 1;

                for (int var10 = var2; var10 < var3; ++var10) {
                    if (var0[var10] < (var10 & var9) + var7) {
                        int var11 = var0[var10];
                        var0[var10] = var0[var6];
                        var0[var6] = var11;
                        Object var12 = var1[var10];
                        var1[var10] = var1[var6];
                        var1[var6++] = var12;
                    }
                }

                var0[var3] = var0[var6];
                var0[var6] = var7;
                var1[var3] = var1[var6];
                var1[var6] = var8;
                method2666(var0, var1, var2, var6 - 1, -641027314);
                method2666(var0, var1, var6 + 1, var3, -641027314);
            }

        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "rj.x(" + ')');
        }
    }

    static boolean method2667(Widget var0, int var1) {
        try {
            class725 var2 = class730.method1761(var0);
            if (var2.method1738((byte) 1) > 0) {
                return true;
            } else if (var2.method1741(-1320707999)) {
                return true;
            } else {
                return var0.parent != null;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "rj.lo(" + ')');
        }
    }

    static final void method2668(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class912.field10424.method5508(1767596149) ? 1 : 0;
            var0.field3161[++var0.field3156 - 1] = class912.field10424.method5517(1474356836) ? 1 : 0;
            var0.field3161[++var0.field3156 - 1] = class912.field10424.method5510((byte) -46) ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "rj.vg(" + ')');
        }
    }

    public static void method2669(String var0, boolean var1, boolean var2, int var3) {
        field4214.add(var0);

        try {
            label289:
            {
                try {
                    if (!var0.equalsIgnoreCase("commands") && !var0.equalsIgnoreCase("help")) {
                        if (var0.equalsIgnoreCase("cls")) {
                            class342.field282 = 0;
                            class342.field283 = 0;
                        } else if (var0.equalsIgnoreCase("displayfps")) {
                            class730.field2648 = !class730.field2648;
                            if (class730.field2648) {
                                class213.method3810("FPS on", 899052076);
                            } else {
                                class213.method3810("FPS off", 1184714257);
                            }
                        } else if (var0.equals("renderer")) {
                            class305 var4 = class593.field1623.method4795();
                            class213.method3810("Toolkit ID: " + class615.field8903.field9137.method3689(-481266690), 1038434697);
                            class213.method3810("Vendor: " + var4.field398, 212944002);
                            class213.method3810("Name: " + var4.field406, 723527437);
                            class213.method3810("Version: " + var4.field405, 1382813939);
                            class213.method3810("Device: " + var4.field401, 536857078);
                            class213.method3810("Driver Version: " + var4.field407, 1218429557);
                        } else if (var0.equals("heap")) {
                            class213.method3810("Heap: " + class69.field1827 + "MB", 170718628);
                        } else {
                            if (!var0.equalsIgnoreCase("getcamerapos")) {
                                break label289;
                            }

                            RegionBase var12 = class730.field2697.getRegionBase(681479919);
                            class213.method3810("Pos: " + class923.local.field3639 + "," + ((class103.field205 >> 9) + var12.baseX >> 6) + "," + ((class7.field4918 >> 9) + var12.baseY >> 6) + "," + (var12.baseX + (class103.field205 >> 9) & 63) + "," + (var12.baseY + (class7.field4918 >> 9) & 63) + " Height: " + (class679.method4271(class103.field205, class7.field4918, class923.local.field3639, -1453034846) - class184.field5230), 306448697);
                            class213.method3810("Look: " + class923.local.field3639 + "," + (SceneGraphLevel.field7231 + var12.baseX >> 6) + "," + (var12.baseY + class764.field4349 >> 6) + "," + (var12.baseX + SceneGraphLevel.field7231 & 63) + "," + (var12.baseY + class764.field4349 & 63) + " Height: " + (class679.method4271(SceneGraphLevel.field7231, class764.field4349, class923.local.field3639, -860898067) - class637.field9857), 1171744016);
                        }
                    } else {
                        class213.method3810("commands - This command", 186560885);
                        class213.method3810("cls - Clear console", 1228482885);
                        class213.method3810("displayfps - Toggle FPS and other information", 553669962);
                        class213.method3810("renderer - Print graphics renderer information", 757390347);
                        class213.method3810("heap - Print java memory information", 1394924823);
                        class213.method3810("getcamerapos - Print location and direction of camera for use in bug reports", 1131153902);
                    }
                } catch (Exception var10) {
                    class213.method3810(class814.field4656.method2927(class321.field1066, -875414210), 247216384);
                }

                return;
            }

            if (class721.field3634 != class916.field10415 || class730.field2790 >= 2) {
                try {
                    if (var0.equalsIgnoreCase("wm1")) {
                        class739.method1795(1, -1, -1, false, 1791719030);
                        if (class660.method5750((byte) -15) == 1) {
                            class213.method3810("Success", 1472876448);
                        } else {
                            class213.method3810("Failure", 1016209121);
                        }

                        return;
                    }

                    if (var0.equalsIgnoreCase("wm2")) {
                        class739.method1795(2, -1, -1, false, -674111799);
                        if (class660.method5750((byte) -79) == 2) {
                            class213.method3810("Success", 1308535348);
                        } else {
                            class213.method3810("Failure", 863221927);
                        }

                        return;
                    }

                    if (class53.field2311 && var0.equalsIgnoreCase("wm3")) {
                        class739.method1795(3, 1024, 768, false, 1894568246);
                        if (class660.method5750((byte) -25) == 3) {
                            class213.method3810("Success", 2072006321);
                        } else {
                            class213.method3810("Failure", 1988552564);
                        }

                        return;
                    }

                    if (var0.equalsIgnoreCase("tk0")) {
                        class337.method77(0, false, 622850291);
                        if (class615.field8903.field9137.method3689(-1547826526) == 0) {
                            class213.method3810("Success", 267543271);
                            class615.field8903.method5391(class615.field8903.field9136, 0, -458723189);
                            class95.method523(656179282);
                            class730.field2647 = false;
                        } else {
                            class213.method3810("Failure", 268000194);
                        }

                        return;
                    }

                    if (var0.equalsIgnoreCase("tk1")) {
                        class337.method77(1, false, 622850291);
                        if (class615.field8903.field9137.method3689(-957568446) == 1) {
                            class213.method3810("Success", 1271200712);
                            class615.field8903.method5391(class615.field8903.field9136, 1, -72348841);
                            class95.method523(656179282);
                            class730.field2647 = false;
                        } else {
                            class213.method3810("Failure", 1851865795);
                        }

                        return;
                    }

                    if (var0.equalsIgnoreCase("tk2")) {
                        class337.method77(2, false, 622850291);
                        if (class615.field8903.field9137.method3689(-565622932) == 2) {
                            class213.method3810("Success", 1728166997);
                            class615.field8903.method5391(class615.field8903.field9136, 2, 345084383);
                            class95.method523(656179282);
                            class730.field2647 = false;
                        } else {
                            class213.method3810("Failure", 807691994);
                        }

                        return;
                    }

                    if (var0.equalsIgnoreCase("tk3")) {
                        class337.method77(3, false, 622850291);
                        if (class615.field8903.field9137.method3689(-1899485997) == 3) {
                            class213.method3810("Success", 2073339182);
                            class615.field8903.method5391(class615.field8903.field9136, 3, 1121469356);
                            class95.method523(656179282);
                            class730.field2647 = false;
                        } else {
                            class213.method3810("Failure", 1035326643);
                        }

                        return;
                    }

                    if (var0.equalsIgnoreCase("tk5")) {
                        class337.method77(5, false, 622850291);
                        if (class615.field8903.field9137.method3689(-996545824) == 5) {
                            class213.method3810("Success", 892097548);
                            class615.field8903.method5391(class615.field8903.field9136, 5, -1087457820);
                            class95.method523(656179282);
                            class730.field2647 = false;
                        } else {
                            class213.method3810("Failure", 1743942992);
                        }

                        return;
                    }

                    if (var0.equalsIgnoreCase("clientdrop")) {
                        if (class730.field2733 == 0) {
                            class307.method387(554378996);
                        } else if (17 == class730.field2733) {
                            class730.field2692.field7782 = true;
                        }

                        return;
                    }

                    int var15;
                    if (var0.equalsIgnoreCase("breakcon")) {
                        class684[] var19 = class730.field2660;

                        for (var15 = 0; var15 < var19.length; ++var15) {
                            class684 var16 = var19[var15];
                            if (var16.method4377(537308016) != null) {
                                var16.method4377(537308016).method186((byte) 100);
                            }
                        }

                        class794.field541.method240((short) 2067);
                        return;
                    }

                    int var18;
                    if (var0.startsWith("getclientvarpbit")) {
                        var18 = Integer.parseInt(var0.substring(17));
                        class213.method3810("varpbit=" + class827.field9037.method5653(var18, (byte) 49), 812809440);
                        return;
                    }

                    if (var0.startsWith("getclientvarp")) {
                        var18 = Integer.parseInt(var0.substring(14));
                        class213.method3810("varp=" + class827.field9037.method5655(var18, (byte) 25), 1156644577);
                        return;
                    }

                    String[] var17;
                    if (var0.startsWith("directlogin")) {
                        var17 = WallDecoration.method2097(var0.substring(12), ' ', 1545850593);
                        if (2 == var17.length) {
                            class935.method6311(var17[0], var17[1], 2101690439);
                        }

                        return;
                    }

                    if (var0.startsWith("snlogin ")) {
                        var17 = WallDecoration.method2097(var0.substring(8), ' ', 259158417);
                        var15 = Integer.parseInt(var17[0]);
                        class84.method938(var15, (byte) -22);
                        return;
                    }

                    File var13;
                    if (var0.startsWith("setoutput ")) {
                        var13 = new File(var0.substring(10));
                        if (var13.exists()) {
                            var13 = new File(var0.substring(10) + "." + class27.resetTimer((byte) 1) + ".log");
                            if (var13.exists()) {
                                class213.method3810("file already exists!", 1609687254);
                                return;
                            }
                        }

                        if (class919.field10431 != null) {
                            class919.field10431.close();
                            class919.field10431 = null;
                        }

                        try {
                            class919.field10431 = new FileOutputStream(var13);
                        } catch (FileNotFoundException var7) {
                            class213.method3810("Could not create " + var13.getName(), 2057720306);
                        } catch (SecurityException var8) {
                            class213.method3810("Cannot write to " + var13.getName(), 651886745);
                        }

                        return;
                    }

                    if (var0.equals("closeoutput")) {
                        if (class919.field10431 != null) {
                            class919.field10431.close();
                        }

                        class919.field10431 = null;
                        return;
                    }

                    if (var0.startsWith("runscript ")) {
                        var13 = new File(var0.substring(10));
                        if (!var13.exists()) {
                            class213.method3810("No such file", 1833830484);
                            return;
                        }

                        byte[] var5 = class677.method4228(var13, -1944658057);
                        if (var5 == null) {
                            class213.method3810("Failed to read file", 1208919662);
                            return;
                        }

                        String[] var6 = WallDecoration.method2097(class223.method4104(class7.method2939(var5, 1704231187), '\r', "", (short) 316), '\n', 714918179);
                        class264.method4568(var6, 408166320);
                    }

                    if (class730.field2733 == 0) {
                        class701 var14 = class637.method5936(class643.field9954, class730.field2692.field7765, (byte) 6);
                        var14.field3364.method6361(var0.length() + 3);
                        var14.field3364.method6361(var1 ? 1 : 0);
                        var14.field3364.method6361(var2 ? 1 : 0);
                        var14.field3364.method6366(var0, 2127017558);
                        class730.field2692.method4380(var14, (byte) -55);
                    }
                } catch (Exception var9) {
                    class213.method3810(class814.field4656.method2927(class321.field1066, -875414210), 417864665);
                    return;
                }
            }

            if (class730.field2733 != 0) {
                class213.method3810(class814.field4679.method2927(class321.field1066, -875414210) + var0, 276776266);
            }

        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "rj.t(" + ')');
        }
    }
}
