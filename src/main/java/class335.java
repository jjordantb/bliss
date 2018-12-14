public class class335 {
    public static class335 field44 = new class335(true, false);
    public static class335 field45 = new class335(false, false);
    public static class335 field46 = new class335(false, false);
    public static class335 field50 = new class335(false, false);
    public static class335 field52 = new class335(true, false);
    public static class180 field53;
    static class335 field43 = new class335(true, true);
    static class335 field47 = new class335(true, false);
    static class335 field48 = new class335(true, true);
    boolean field49;
    boolean field51;

    class335(boolean var1, boolean var2) {
        this.field51 = var1;
        this.field49 = var2;
    }

    public static class440[] method38(int var0) {
        try {
            return new class440[]{class440.field7651, class440.field7680, class440.field7668, class440.field7658, class440.field7669, class440.field7681, class440.field7672, class440.field7652, class440.field7664, class440.field7675, class440.field7678, class440.field7676, class440.field7660, class440.field7653, class440.field7677, class440.field7654, class440.field7656, class440.field7666, class440.field7665, class440.field7673, class440.field7663, class440.field7682, class440.field7679, class440.field7659, class440.field7662, class440.field7657, class440.field7671, class440.field7661, class440.field7674, class440.field7670, class440.field7667, class440.field7655};
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "lb.a(" + ')');
        }
    }

    public static class827 method39(InputStream var0, byte var1) {
        try {
            class827 var2 = class932.method6291(var0, -2082890426);
            int var3 = var0.method6423(1235052657);
            int var4 = var0.method6423(1235052657);
            int var5 = var0.method6423(1235052657);
            int var6 = var0.method6423(1235052657);
            int var7 = var0.method6423(1235052657);
            int var8 = var0.method6423(1235052657);
            return new class710(var2.field9028, var2.field9029, var2.field9033, var2.field9031, var2.field9032, var2.field9036, var2.field9034, var2.field9035, var2.field9030, var3, var4, var5, var6, var7, var8);
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "lb.i(" + ')');
        }
    }

    static final int method40(Actor var0, int var1) {
        try {
            if (var0.field4079 == 0) {
                return 0;
            } else {
                int var5;
                RegionOffset var9;
                if (var0.field4054 != -1) {
                    Object var2 = null;
                    if (var0.field4054 < 32768) {
                        class437 var3 = (class437) class730.field2677.method2942((long) var0.field4054);
                        if (var3 != null) {
                            var2 = (Actor) var3.field7515;
                        }
                    } else if (var0.field4054 >= 32768) {
                        var2 = class730.loaded[var0.field4054 - '耀'];
                    }

                    if (var2 != null) {
                        var9 = RegionOffset.method3296(var0.getRegion().regionOffset, ((Actor) var2).getRegion().regionOffset);
                        int var4 = (int) var9.offsetX;
                        var5 = (int) var9.offsetY;
                        if (var4 != 0 || var5 != 0) {
                            var0.method2542((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 16383, (byte) 1);
                        }
                    }
                }

                if (var0 instanceof Player) {
                    Player var8 = (Player) var0;
                    if (-1 != var8.field3400 && (var8.field4084 == 0 || var8.field4088 > 0)) {
                        var8.method2542(var8.field3400, (byte) 1);
                        var8.field3400 = -1;
                    }
                } else if (var0 instanceof Npc) {
                    Npc var10 = (Npc) var0;
                    if (-1 != var10.field1626 && (var10.field4084 == 0 || var10.field4088 > 0)) {
                        var9 = var10.getRegion().regionOffset;
                        RegionBase var11 = class730.field2697.getRegionBase(681479919);
                        var5 = (int) var9.offsetX - (var10.field1626 * 256 - var11.baseX * 256 - var11.baseX * 256);
                        int var6 = (int) var9.offsetY - (var10.field1627 * 256 - var11.baseY * 256 - var11.baseY * 256);
                        if (var5 != 0 || var6 != 0) {
                            var10.method2542((int) (Math.atan2((double) var5, (double) var6) * 2607.5945876176133D) & 16383, (byte) 1);
                        }

                        var10.field1626 = -1;
                    }
                }

                return var0.method2578((short) 6752);
            }
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "lb.ha(" + ')');
        }
    }

    static void method41(class848 var0, class373 var1, int var2, int var3, int var4) {
        try {
            class439.field7537.method905((byte) 1);
            if (!class740.field3209) {
                for (class392 var5 = (class392) var1.method901(1766612795); var5 != null; var5 = (class392) var1.method906(49146)) {
                    class718 var6 = class491.field7826.method5091(var5.field5396, -1838109089);
                    if (class517.method2719(var6, 1541069402)) {
                        boolean var7 = class890.method5560(var0, var5, var6, var2, var3, -1417215477);
                        if (var7) {
                            class880.method6177(var0, var5, var6, 1387394029);
                        }
                    }
                }
            }

        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "lb.bh(" + ')');
        }
    }

    static final void method42(class744 var0, int var1) {
        try {
            var0.field3161[++var0.field3156 - 1] = class621.field8926;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lb.amk(" + ')');
        }
    }

    boolean method36(int var1) {
        try {
            return this.field51;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lb.a(" + ')');
        }
    }

    public boolean method37(byte var1) {
        try {
            return this.field49;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "lb.f(" + ')');
        }
    }
}
