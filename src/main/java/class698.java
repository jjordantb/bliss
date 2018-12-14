public class class698 extends class663 {
    public RegionOffset field7167 = new RegionOffset();
    public class344 field7168 = new class344();
    public class344 field7170 = new class344();
    public RegionOffset field7172 = new RegionOffset();
    public int field7173;
    public RegionOffset field7177 = new RegionOffset();
    public class267 field7181 = new class267();
    public class267 field7185 = new class267();
    public int field7186;
    public int field7188;
    public int field7190;
    public int field7191;
    class655 field7164;
    class655 field7165;
    class655 field7166;
    class655 field7169;
    class655 field7171;
    class267 field7174 = new class267();
    class267 field7175 = new class267();
    class655 field7176;
    class655 field7178;
    class267 field7179 = new class267();
    class655 field7180;
    class655 field7182;
    class696 field7183;
    class655 field7184;
    class655 field7187;
    float field7189 = 0.0F;
    class655 field7192;
    boolean field7193;

    public class698(class325 var1, class696 var2, boolean var3) throws class934 {
        super(var1);
        new class344();
        this.field7183 = var2;
        this.field7193 = var3;
        if (var1.method554() && var1.method742()) {
            this.method5761("EnvMappedWater");
        }

    }

    void method5765(boolean var1) {
        try {
            float var2 = 1.0F + (1.0F - Math.abs(super.field10421.field727[1])) * 2.0F;
            float var3 = super.field10421.field808;
            super.field10421.field808 *= var2;
            super.method5765(var1);
            super.field10421.field808 = var3;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "afv.l(" + ')');
        }
    }

    void method5763(class344 var1) {
        try {
            class344 var2 = new class344();
            var2.method274(this.field7189, this.field7189, 1.0F, 1.0F);
            var2.method270(var1, var2);
            super.method5763(var2);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "afv.m(" + ')');
        }
    }

    void method3798(int var1) {
        try {
            this.field7189 = 2.4414062E-4F;
            short var2 = 256;
            float var3 = 0.3F;
            float var4 = 0.4F;
            float var5 = 0.1F;
            byte var6 = 5;
            this.field7170.method274(this.field7189, this.field7189, this.field7189, this.field7189);
            this.field7175.method4570(-super.field10421.field727[0], -super.field10421.field727[1], -super.field10421.field727[2], 32.0F);
            this.field7174.method4570(super.field10421.field806, super.field10421.field733, super.field10421.field734, (float) var6);
            this.field7179.method4570(var5, var4, (float) var2, var3);
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "afv.am(" + ')');
        }
    }

    public void method3803(int var1) {
        try {
            this.method3798(1985693745);
            super.field9666.method4057(super.field9666.method4056(-1437671487));
            super.field9666.method4066();
            super.field9666.method4067(this.field7165, 0, this.field7183.field7241, -572281806);
            super.field9666.method4067(this.field7192, 1, super.field10421.method580(), -1260247991);
            super.field9666.method4094(this.field7166, this.field7168, 600012267);
            super.field9666.method4063(this.field7169, this.field7170, (byte) 17);
            int var2 = 1 << (this.field7173 & 3);
            super.field9666.method4092(this.field7171, this.field7172.offsetX, this.field7172.field5300, this.field7172.offsetY, (float) (var2 * super.field10421.field786 % '鱀') / 40000.0F, 2032048310);
            super.field9666.method4065(this.field7164, this.field7175, -1051400568);
            super.field9666.method4065(this.field7176, this.field7174, -1384576078);
            super.field9666.method4065(this.field7178, this.field7179, 642247137);
            super.field9666.method4065(this.field7182, this.field7181, -1615535867);
            super.field9666.method4064(this.field7187, this.field7177, -386546877);
            super.field9666.method4065(this.field7184, this.field7185, 221024078);
            super.field9666.method4064(this.field7180, this.field7167, -386546877);
            super.field10421.method651(class427.field7386, this.field7188, this.field7186, this.field7190, this.field7191);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "afv.ac(" + ')');
        }
    }

    boolean method5762() throws class934 {
        try {
            if (!this.field7183.method3924()) {
                return false;
            } else {
                this.field7165 = super.field9666.method4086("NormalSampler", -921780111);
                this.field7192 = super.field9666.method4086("EnvMapSampler", 606818732);
                this.field7166 = super.field9666.method4086("WVPMatrix", 1310649603);
                this.field7169 = super.field9666.method4086("TexCoordMatrix", 1954962863);
                this.field7171 = super.field9666.method4086("EyePosAndTime", -238618670);
                this.field7164 = super.field9666.method4086("SunDirectionAndExponent", -457877765);
                this.field7176 = super.field9666.method4086("SunColourAndWaveExponent", 442145451);
                this.field7178 = super.field9666.method4086("WaveIntensityAndBreakWaterDepthAndOffset", -391677311);
                this.field7182 = super.field9666.method4086("HeightFogPlane", 1386296488);
                this.field7187 = super.field9666.method4086("HeightFogColour", -1148212701);
                this.field7184 = super.field9666.method4086("DistanceFogPlane", -755878477);
                this.field7180 = super.field9666.method4086("DistanceFogColour", 1321216707);
                class184 var1 = super.field9666.method4053(this.field7193 ? "EnvMappedSea" : "EnvMappedWater", (byte) -97);
                super.field9666.method4057(var1);
                return true;
            }
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "afv.e(" + ')');
        }
    }
}
