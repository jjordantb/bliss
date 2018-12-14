public class class440 {
    public static class440 field7666 = new class440("14", "14");
    public static class440 field7670 = new class440("8", "8");
    static class440 field7651 = new class440("30", "30");
    static class440 field7652 = new class440("13", "13");
    static class440 field7653 = new class440("6", "6");
    static class440 field7654 = new class440("24", "24");
    static class440 field7655 = new class440("18", "18");
    static class440 field7656 = new class440("21", "21");
    static class440 field7657 = new class440("16", "16");
    static class440 field7658 = new class440("28", "28");
    static class440 field7659 = new class440("4", "4");
    static class440 field7660 = new class440("20", "20");
    static class440 field7661 = new class440("27", "27");
    static class440 field7662 = new class440("1", "1");
    static class440 field7663 = new class440("31", "31");
    static class440 field7664 = new class440("9", "9");
    static class440 field7665 = new class440("3", "3");
    static class440 field7667 = new class440("12", "12");
    static class440 field7668 = new class440("15", "15");
    static class440 field7669 = new class440("26", "26");
    static class440 field7671 = new class440("23", "23");
    static class440 field7672 = new class440("29", "29");
    static class440 field7673 = new class440("32", "32");
    static class440 field7674 = new class440("2", "2");
    static class440 field7675 = new class440("7", "7");
    static class440 field7676 = new class440("5", "5");
    static class440 field7677 = new class440("33", "33");
    static class440 field7678 = new class440("17", "17");
    static class440 field7679 = new class440("25", "25");
    static class440 field7680 = new class440("22", "22");
    static class440 field7681 = new class440("10", "10");
    static class440 field7682 = new class440("11", "11");
    public String field7683;

    class440(String var1, String var2) {
        this.field7683 = var2;
    }

    public static void method4332(Animation var0, int var1, Interactable var2, int var3) {
        try {
            if (class540.field3926 < 50 && var0 != null && var0.field6671 != null && var1 < var0.field6671.length && var0.field6671[var1] != null) {
                int var4 = var0.field6671[var1][0];
                int var5 = var4 >> 8;
                int var6 = var4 >> 5 & 7;
                int var7 = var4 & 31;
                int var8;
                if (var0.field6671[var1].length > 1) {
                    var8 = (int) (Math.random() * (double) var0.field6671[var1].length);
                    if (var8 > 0) {
                        var5 = var0.field6671[var1][var8];
                    }
                }

                var8 = 256;
                if (var0.field6667 != null && var0.field6674 != null) {
                    var8 = (int) (Math.random() * (double) (var0.field6674[var1] - var0.field6667[var1])) + var0.field6667[var1];
                }

                int var9 = var0.field6672 == null ? 255 : var0.field6672[var1];
                if (var7 == 0) {
                    if (class923.local == var2) {
                        if (var0.field6657) {
                            class671.method4237(var5, var6, 0, var9, false, var8, 1619018556);
                        } else {
                            class587.method167(var5, var6, 0, var9, var8, 1846790975);
                        }
                    }
                } else if (class615.field8903.field9148.method2717(-2147180332) != 0) {
                    RegionOffset var10 = var2.getRegion().regionOffset;
                    int var11 = (int) var10.offsetX - 256 >> 9;
                    int var12 = (int) var10.offsetY - 256 >> 9;
                    int var13 = class923.local == var2 ? 0 : (var12 << 8) + (var11 << 16) + (var2.field3639 << 24) + var7;
                    class540.field3927[++class540.field3926 - 1] = new class45((byte) (var0.field6657 ? 2 : 1), var5, var6, 0, var9, var13, var8, var2);
                }
            }

        } catch (RuntimeException var14) {
            throw class158.method3445(var14, "iu.r(" + ')');
        }
    }

    static void method4333(int var0) {
        try {
            class881.field10171 = "";
            class881.field10170 = "";
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "iu.s(" + ')');
        }
    }

    static final void method4334(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            var0.field3161[++var0.field3156 - 1] = var2 & -1 - (1 << var3);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "iu.yi(" + ')');
        }
    }

    public static class312 method4335(int var0, int var1, int var2, int var3, int var4) {
        try {
            class673.field7507.field476 = var0;
            class673.field7507.field475 = var1;
            class673.field7507.field477 = var2;
            class673.field7507.field478 = var3;
            class673.field7507.field5430 = var4;
            return class673.field7507;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "iu.p(" + ')');
        }
    }
}
