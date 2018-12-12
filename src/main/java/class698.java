public class class698 extends class663 {
   class655 field7164;
   class655 field7165;
   class655 field7166;
   public class32 field7167 = new class32();
   public class344 field7168 = new class344();
   class655 field7169;
   public class344 field7170 = new class344();
   class655 field7171;
   public class32 field7172 = new class32();
   public int field7173;
   class267 field7174 = new class267();
   class267 field7175 = new class267();
   class655 field7176;
   public class32 field7177 = new class32();
   class655 field7178;
   class267 field7179 = new class267();
   class655 field7180;
   public class267 field7181 = new class267();
   class655 field7182;
   class696 field7183;
   class655 field7184;
   public class267 field7185 = new class267();
   public int field7186;
   class655 field7187;
   public int field7188;
   float field7189 = 0.0F;
   public int field7190;
   public int field7191;
   class655 field7192;
   boolean field7193;

   void method3796(class344 var1) {
      class344 var2 = new class344();
      var2.method274(this.field7189, this.field7189, 1.0F, 1.0F);
      var2.method270(var1, var2);
      super.method5763(var2);
   }

   void method5765(boolean var1) {
      try {
         float var2 = 1.0F + (1.0F - Math.abs(this.field10421.field727[1])) * 2.0F;
         float var3 = this.field10421.field808;
         this.field10421.field808 *= var2;
         super.method5765(var1);
         this.field10421.field808 = var3;
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

   void method3797(boolean var1) {
      float var2 = 1.0F + (1.0F - Math.abs(this.field10421.field727[1])) * 2.0F;
      float var3 = this.field10421.field808;
      this.field10421.field808 *= var2;
      super.method5765(var1);
      this.field10421.field808 = var3;
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
         this.field7175.method4570(-this.field10421.field727[0], -this.field10421.field727[1], -this.field10421.field727[2], 32.0F);
         this.field7174.method4570(this.field10421.field806, this.field10421.field733, this.field10421.field734, (float)var6);
         this.field7179.method4570(var5, var4, (float)var2, var3);
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "afv.am(" + ')');
      }
   }

   boolean method5772() throws class934 {
      if (!this.field7183.method3924()) {
         return false;
      } else {
         this.field7165 = this.field9666.method4086("NormalSampler", -1799179479);
         this.field7192 = this.field9666.method4086("EnvMapSampler", -863358126);
         this.field7166 = this.field9666.method4086("WVPMatrix", -1578257061);
         this.field7169 = this.field9666.method4086("TexCoordMatrix", 1173183718);
         this.field7171 = this.field9666.method4086("EyePosAndTime", 1913245218);
         this.field7164 = this.field9666.method4086("SunDirectionAndExponent", 143918019);
         this.field7176 = this.field9666.method4086("SunColourAndWaveExponent", -1330149261);
         this.field7178 = this.field9666.method4086("WaveIntensityAndBreakWaterDepthAndOffset", 458926447);
         this.field7182 = this.field9666.method4086("HeightFogPlane", -1594015511);
         this.field7187 = this.field9666.method4086("HeightFogColour", 191981507);
         this.field7184 = this.field9666.method4086("DistanceFogPlane", -193071269);
         this.field7180 = this.field9666.method4086("DistanceFogColour", 738690292);
         class184 var1 = this.field9666.method4053(this.field7193 ? "EnvMappedSea" : "EnvMappedWater", (byte)-66);
         this.field9666.method4057(var1);
         return true;
      }
   }

   void method3799(class344 var1) {
      class344 var2 = new class344();
      var2.method274(this.field7189, this.field7189, 1.0F, 1.0F);
      var2.method270(var1, var2);
      super.method5763(var2);
   }

   void method3800(class344 var1) {
      class344 var2 = new class344();
      var2.method274(this.field7189, this.field7189, 1.0F, 1.0F);
      var2.method270(var1, var2);
      super.method5763(var2);
   }

   void method3801(boolean var1) {
      float var2 = 1.0F + (1.0F - Math.abs(this.field10421.field727[1])) * 2.0F;
      float var3 = this.field10421.field808;
      this.field10421.field808 *= var2;
      super.method5765(var1);
      this.field10421.field808 = var3;
   }

   public class698(class325 var1, class696 var2, boolean var3) throws class934 {
      super(var1);
      new class344();
      this.field7183 = var2;
      this.field7193 = var3;
      if (var1.method554() && var1.method742()) {
         this.method5761("EnvMappedWater");
      }

   }

   void method3802(boolean var1) {
      float var2 = 1.0F + (1.0F - Math.abs(this.field10421.field727[1])) * 2.0F;
      float var3 = this.field10421.field808;
      this.field10421.field808 *= var2;
      super.method5765(var1);
      this.field10421.field808 = var3;
   }

   public void method3803(int var1) {
      try {
         this.method3798(1985693745);
         this.field9666.method4057(this.field9666.method4056(-1437671487));
         this.field9666.method4066();
         this.field9666.method4067(this.field7165, 0, this.field7183.field7241, -572281806);
         this.field9666.method4067(this.field7192, 1, this.field10421.method580(), -1260247991);
         this.field9666.method4094(this.field7166, this.field7168, 600012267);
         this.field9666.method4063(this.field7169, this.field7170, (byte)17);
         int var2 = 1 << (149563177 * this.field7173 & 3);
         this.field9666.method4092(this.field7171, this.field7172.field5296, this.field7172.field5300, this.field7172.field5299, (float)(var2 * this.field10421.field786 % '鱀') / 40000.0F, 2032048310);
         this.field9666.method4065(this.field7164, this.field7175, -1051400568);
         this.field9666.method4065(this.field7176, this.field7174, -1384576078);
         this.field9666.method4065(this.field7178, this.field7179, 642247137);
         this.field9666.method4065(this.field7182, this.field7181, -1615535867);
         this.field9666.method4064(this.field7187, this.field7177, -386546877);
         this.field9666.method4065(this.field7184, this.field7185, 221024078);
         this.field9666.method4064(this.field7180, this.field7167, -386546877);
         this.field10421.method651(class427.field7386, -1146886737 * this.field7188, this.field7186 * -2126568899, this.field7190 * 501274325, this.field7191 * -913937851);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "afv.ac(" + ')');
      }
   }

   boolean method5762() throws class934 {
      try {
         if (!this.field7183.method3924()) {
            return false;
         } else {
            this.field7165 = this.field9666.method4086("NormalSampler", -921780111);
            this.field7192 = this.field9666.method4086("EnvMapSampler", 606818732);
            this.field7166 = this.field9666.method4086("WVPMatrix", 1310649603);
            this.field7169 = this.field9666.method4086("TexCoordMatrix", 1954962863);
            this.field7171 = this.field9666.method4086("EyePosAndTime", -238618670);
            this.field7164 = this.field9666.method4086("SunDirectionAndExponent", -457877765);
            this.field7176 = this.field9666.method4086("SunColourAndWaveExponent", 442145451);
            this.field7178 = this.field9666.method4086("WaveIntensityAndBreakWaterDepthAndOffset", -391677311);
            this.field7182 = this.field9666.method4086("HeightFogPlane", 1386296488);
            this.field7187 = this.field9666.method4086("HeightFogColour", -1148212701);
            this.field7184 = this.field9666.method4086("DistanceFogPlane", -755878477);
            this.field7180 = this.field9666.method4086("DistanceFogColour", 1321216707);
            class184 var1 = this.field9666.method4053(this.field7193 ? "EnvMappedSea" : "EnvMappedWater", (byte)-97);
            this.field9666.method4057(var1);
            return true;
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "afv.e(" + ')');
      }
   }
}
