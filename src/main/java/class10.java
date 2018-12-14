public class class10 extends class605 {
    static int field6622 = 13;
    static int field6624 = 1;
    static int field6625 = 0;
    static int field6626 = 2;
    static int field6627 = 4;
    static int field6628 = 5;
    static int field6629 = 6;
    static int field6630 = 15;
    static int field6631 = 8;
    static int field6632 = 9;
    static int field6633 = 10;
    static int field6634 = 1;
    static int field6635 = 12;
    static int field6636 = 7;
    static int field6637 = 14;
    static int field6639 = 16;
    static int field6640 = 17;
    static int field6641 = 2;
    static int field6642 = 11;
    static int field6643 = 3;
    static int field6644 = 7;
    static int field6645 = 12;
    static int field6646 = 17;
    static int field6647 = 18;
    static int field6650 = 0;
    static int field6652;
    int[][] field6623 = new int[18][17];
    class344 field6638 = new class344();
    class223 field6648;
    class184[] field6649 = new class184[18];
    int[] field6651;

    public class10(class325 var1) throws class934 {
        super(var1);
        this.method3556(-1327173096);
    }

    boolean method3556(int var1) throws class934 {
        try {
            this.field6648 = super.field8692.method556("Model");
            class655 var2 = this.field6648.method4086("DiffuseSampler", 1135001419);
            class655 var3 = this.field6648.method4086("EnvironmentSampler", -972656168);
            class655 var4 = this.field6648.method4086("PointLightsPosAndRadiusSq", 585215200);
            class655 var5 = this.field6648.method4086("PointLightsDiffuseColour", -1873919067);
            class655 var6 = this.field6648.method4086("WVPMatrix", 43401113);
            class655 var7 = this.field6648.method4086("TexCoordMatrix", -706631042);
            class655 var8 = this.field6648.method4086("HeightFogPlane", 363843467);
            class655 var9 = this.field6648.method4086("HeightFogColour", 177108279);
            class655 var10 = this.field6648.method4086("DistanceFogPlane", -1871545778);
            class655 var11 = this.field6648.method4086("DistanceFogColour", 245551574);
            class655 var12 = this.field6648.method4086("SunDir", 1373721238);
            class655 var13 = this.field6648.method4086("SunColour", -1112379488);
            class655 var14 = this.field6648.method4086("AntiSunColour", 737015999);
            class655 var15 = this.field6648.method4086("AmbientColour", -602820050);
            class655 var16 = this.field6648.method4086("EyePos", -2130760607);
            class655 var17 = this.field6648.method4086("SpecularExponent", -893975178);
            class655 var18 = this.field6648.method4086("WorldMatrix", -1633360167);
            this.field6649[0] = this.field6648.method4053("Unlit", (byte) -128);
            this.field6649[1] = this.field6648.method4053("Unlit_IgnoreAlpha", (byte) -73);
            this.field6649[17] = this.field6648.method4053("UnderwaterGround", (byte) -78);

            int var19;
            for (var19 = 0; var19 <= 4; ++var19) {
                this.field6649[var19 + 2] = this.field6648.method4053("Standard_" + var19 + "PointLights", (byte) -123);
                this.field6649[var19 + 7] = this.field6648.method4053("Specular_" + var19 + "PointLights", (byte) -11);
                this.field6649[12 + var19] = this.field6648.method4053("EnvironmentalMapping_" + var19 + "PointLights", (byte) -25);
            }

            for (var19 = 0; var19 < 18; ++var19) {
                int var20 = this.field6648.method4055(this.field6649[var19], -180449856);
                this.field6623[var19][2] = var2.method5614(var20);
                this.field6623[var19][3] = var3.method5614(var20);
                this.field6623[var19][1] = var4.method5614(var20);
                this.field6623[var19][0] = var5.method5614(var20);
                this.field6623[var19][4] = var6.method5614(var20);
                this.field6623[var19][5] = var7.method5614(var20);
                this.field6623[var19][7] = var8.method5614(var20);
                this.field6623[var19][8] = var9.method5614(var20);
                this.field6623[var19][9] = var10.method5614(var20);
                this.field6623[var19][10] = var11.method5614(var20);
                this.field6623[var19][11] = var12.method5614(var20);
                this.field6623[var19][12] = var13.method5614(var20);
                this.field6623[var19][13] = var14.method5614(var20);
                this.field6623[var19][14] = var15.method5614(var20);
                this.field6623[var19][6] = var16.method5614(var20);
                this.field6623[var19][15] = var18.method5614(var20);
                this.field6623[var19][16] = var17.method5614(var20);
            }

            this.field6648.method4057(this.field6649[2]);
            return true;
        } catch (RuntimeException var21) {
            throw class158.method3445(var21, "yg.m(" + ')');
        }
    }

    public void method5105(class344 var1) {
        try {
            this.field6638.method269(var1);
            this.field6638.method271(super.field8692.field695);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "yg.f(" + ')');
        }
    }

    public void method5109() {
        try {
            this.field6648.method4057(this.field6649[17]);
            this.field6651 = this.field6623[this.field6648.method4059(1837632307)];
            this.field6648.method4066();
            this.method3557(0, -445981727);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "yg.d(" + ')');
        }
    }

    public void method5107(int var1) {
        try {
            this.field6648.method4057(this.field6649[7 + var1]);
            this.field6651 = this.field6623[this.field6648.method4059(1308408550)];
            this.field6648.method4066();
            this.field6648.method4091(this.field6651[6], super.field8702.offsetX, super.field8702.field5300, super.field8702.offsetY, 526269137);
            this.field6648.method4068(this.field6651[16], super.field8693, super.field8685, 0.0F, 0.0F, (byte) 86);
            this.method3557(var1, -283020523);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "yg.i(" + ')');
        }
    }

    public void method5106(int var1) {
        try {
            this.field6648.method4057(this.field6649[var1 + 2]);
            this.field6651 = this.field6623[this.field6648.method4059(1833355992)];
            this.field6648.method4066();
            this.method3557(var1, -1046248356);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "yg.p(" + ')');
        }
    }

    void method3557(int var1, int var2) {
        try {
            this.field6648.method4074(this.field6651[2], 0, super.field8689, -1687300053);
            this.field6648.method4062(this.field6651[4], this.field6638, (byte) -39);
            this.field6648.method4072(this.field6651[5], super.field8691, -1599730439);
            this.field6648.method4068(this.field6651[7], super.field8695.field8205, super.field8695.field8204, super.field8695.field8202, super.field8695.field8203, (byte) 81);
            this.field6648.method4091(this.field6651[8], super.field8696.offsetX, super.field8696.field5300, super.field8696.offsetY, -1324328823);
            this.field6648.method4068(this.field6651[9], super.field8697.field8205, super.field8697.field8204, super.field8697.field8202, super.field8697.field8203, (byte) 20);
            this.field6648.method4091(this.field6651[10], super.field8694.offsetX, super.field8694.field5300, super.field8694.offsetY, 168782883);
            this.field6648.method4069(this.field6651[11], super.field8699, 902988581);
            this.field6648.method4069(this.field6651[12], super.field8700, -1254001480);
            this.field6648.method4069(this.field6651[13], super.field8701, 2097192794);
            this.field6648.method4069(this.field6651[14], super.field8687, -1756213043);
            if (var1 > 0) {
                this.field6648.method4070(this.field6651[1], super.field8688, 4 * var1, 2080438398);
                this.field6648.method4070(this.field6651[0], super.field8698, 4 * var1, 358111941);
            }

            super.field8692.method651(class427.field7386, super.field8704, super.field8705, super.field8706, super.field8686);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "yg.w(" + ')');
        }
    }

    public void method5113(boolean var1) {
        try {
            if (var1) {
                this.field6648.method4057(this.field6649[1]);
            } else {
                this.field6648.method4057(this.field6649[0]);
            }

            this.field6651 = this.field6623[this.field6648.method4059(1072994601)];
            this.field6648.method4066();
            this.field6648.method4074(this.field6651[2], 0, super.field8689, 1542479016);
            this.field6648.method4062(this.field6651[4], this.field6638, (byte) -116);
            this.field6648.method4072(this.field6651[5], super.field8691, -1599730439);
            this.field6648.method4068(this.field6651[7], super.field8695.field8205, super.field8695.field8204, super.field8695.field8202, super.field8695.field8203, (byte) 50);
            this.field6648.method4091(this.field6651[8], super.field8696.offsetX, super.field8696.field5300, super.field8696.offsetY, 105504318);
            this.field6648.method4068(this.field6651[9], super.field8697.field8205, super.field8697.field8204, super.field8697.field8202, super.field8697.field8203, (byte) 87);
            this.field6648.method4091(this.field6651[10], super.field8694.offsetX, super.field8694.field5300, super.field8694.offsetY, 937631726);
            super.field8692.method651(class427.field7386, super.field8704, super.field8705, super.field8706, super.field8686);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "yg.b(" + ')');
        }
    }

    public void method5102(int var1) {
        try {
            this.field6648.method4057(this.field6649[var1 + 12]);
            this.field6651 = this.field6623[this.field6648.method4059(1210039282)];
            this.field6648.method4066();
            this.field6648.method4071(this.field6651[15], super.field8707, (byte) -116);
            this.field6648.method4091(this.field6651[6], super.field8702.offsetX, super.field8702.field5300, super.field8702.offsetY, -1454092733);
            this.field6648.method4074(this.field6651[3], 1, super.field8690, 67553741);
            this.method3557(var1, -50147859);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "yg.k(" + ')');
        }
    }
}
