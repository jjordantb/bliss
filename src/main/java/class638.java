public class class638 extends class663 {
   class184 field9828;
   class655 field9829;
   class655 field9830;
   public class344 field9831 = new class344();
   class696 field9832;
   class655 field9833;
   public class344 field9834 = new class344();
   class655 field9835;
   class655 field9836;
   class655 field9837;
   float[] field9838 = new float[4];
   float[] field9839 = new float[4];
   class184 field9840;
   float field9841;
   public int field9842;
   public int field9843;
   public int field9844;
   public int field9845;

   public void method5929(int var1, int var2, byte var3) {
      try {
         float var4 = -5.0E-4F * (float)(1 + (var1 & 3));
         float var5 = 5.0E-4F * (float)((var1 >> 3 & 3) + 1);
         float var6 = (var1 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
         boolean var7 = (var1 & 128) != 0;
         if (var7) {
            this.field9838[0] = var6;
            this.field9838[1] = 0.0F;
            this.field9838[2] = 0.0F;
            this.field9838[3] = 0.0F;
         } else {
            this.field9838[0] = 0.0F;
            this.field9838[1] = 0.0F;
            this.field9838[2] = var6;
            this.field9838[3] = 0.0F;
         }

         this.field9839[0] = 0.0F;
         this.field9839[1] = var6;
         this.field9839[2] = 0.0F;
         this.field9839[3] = var4 * (float)this.field10421.field786 % 1.0F;
         if (!this.field9832.field7236) {
            int var8 = (int)((float)this.field10421.field786 * var5 * 16.0F);
            this.field10421.method617(this.field9832.field7239[var8 % 16]);
         } else {
            this.field9841 = (float)((double)var5 * (double)this.field10421.field786 % 1.0D);
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "afj.ac(" + ')');
      }
   }

   boolean method5772() throws class934 {
      this.field9835 = this.field9666.method4086("WorldMatrix", -867744099);
      this.field9833 = this.field9666.method4086("WVPMatrix", -250672432);
      this.field9837 = this.field9666.method4086("UGenerationPlane", -1602523427);
      this.field9836 = this.field9666.method4086("VGenerationPlane", 1186138394);
      this.field9829 = this.field9666.method4086("Time", -2093315319);
      this.field9830 = this.field9666.method4086("billowSampler3D", -1560961563);
      if (this.field9832.field7236) {
         this.field9840 = this.field9666.method4053("Waterfall3D", (byte)0);
         this.field9666.method4057(this.field9840);
      } else {
         this.field9828 = this.field9666.method4053("Waterfall2D", (byte)-112);
         this.field9666.method4057(this.field9828);
      }

      return true;
   }

   public void method5930(int var1) {
      try {
         if (this.field9832.field7236) {
            this.field9666.method4057(this.field9840);
         } else {
            this.field9666.method4057(this.field9828);
         }

         this.field9666.method4066();
         if (this.field9832.field7236) {
            this.field9666.method4067(this.field9830, 0, this.field9832.field7240, -1892543284);
         }

         this.field9666.method4094(this.field9835, this.field9831, 600012267);
         this.field9666.method4094(this.field9833, this.field9834, 600012267);
         this.field9666.method4065(this.field9837, new class267(this.field9838[0], this.field9838[1], this.field9838[2], this.field9838[3]), 1385384483);
         this.field9666.method4065(this.field9836, new class267(this.field9839[0], this.field9839[1], this.field9839[2], this.field9839[3]), 560835049);
         this.field9666.method4065(this.field9829, new class267(this.field9841, 0.0F, 0.0F, 0.0F), -247168453);
         this.field10421.method651(class427.field7386, this.field9842 * 540763355, this.field9843 * -754699637, this.field9844 * -863719041, this.field9845 * 507848871);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "afj.am(" + ')');
      }
   }

   public class638(class325 var1, class696 var2) throws class934 {
      super(var1);
      this.field9832 = var2;
      if (this.field9832.method3923() && var1.method554()) {
         this.method5761("Waterfall");
      }

   }

   boolean method5762() throws class934 {
      try {
         this.field9835 = this.field9666.method4086("WorldMatrix", -2088418999);
         this.field9833 = this.field9666.method4086("WVPMatrix", -363138804);
         this.field9837 = this.field9666.method4086("UGenerationPlane", 1661649711);
         this.field9836 = this.field9666.method4086("VGenerationPlane", 2031421483);
         this.field9829 = this.field9666.method4086("Time", 293420542);
         this.field9830 = this.field9666.method4086("billowSampler3D", 2054271289);
         if (this.field9832.field7236) {
            this.field9840 = this.field9666.method4053("Waterfall3D", (byte)-79);
            this.field9666.method4057(this.field9840);
         } else {
            this.field9828 = this.field9666.method4053("Waterfall2D", (byte)-52);
            this.field9666.method4057(this.field9828);
         }

         return true;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "afj.e(" + ')');
      }
   }

   static class304 method5931(class907 var0, byte var1) {
      try {
         int var2 = var0.method6371();
         class928 var3 = class213.method3811(var2, -707576455);
         Object var4 = null;
         switch(var3.field10237 * -1646556509) {
         case 1:
            var4 = new class810(var0);
            break;
         case 2:
            var4 = new class842(var0);
            break;
         case 3:
            var4 = new class124(var0);
            break;
         case 4:
            var4 = new class898(var0);
            break;
         case 5:
            var4 = new class407(var0, true);
            break;
         case 6:
            var4 = new class859(var0);
         case 7:
         case 18:
         default:
            break;
         case 8:
            var4 = new class484(var0, 1, 0);
            break;
         case 9:
            var4 = new class896(var0);
            break;
         case 10:
            var4 = new class263(var0);
            break;
         case 11:
            var4 = new class407(var0, false);
            break;
         case 12:
            var4 = new class776(var0);
            break;
         case 13:
            var4 = new class484(var0, 1, 1);
            break;
         case 14:
            var4 = new class484(var0, 0, 0);
            break;
         case 15:
            var4 = new class974(var0);
            break;
         case 16:
            var4 = new class555(var0);
            break;
         case 17:
            var4 = new class766(var0);
            break;
         case 19:
            var4 = new class551(var0);
            break;
         case 20:
            var4 = new class413(var0);
            break;
         case 21:
            var4 = new class484(var0, 0, 1);
            break;
         case 22:
            var4 = new class26(var0);
            break;
         case 23:
            var4 = new class462(var0);
            break;
         case 24:
            var4 = new class929(var0);
            break;
         case 25:
            var4 = new class133(var0);
            break;
         case 26:
            var4 = new class290(var0);
            break;
         case 27:
            var4 = new class271(var0);
            break;
         case 28:
            var4 = new class854(var0);
            break;
         case 29:
            var4 = new class804(var0);
            break;
         case 30:
            var4 = new class473(var0);
         }

         return (class304)var4;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "afj.a(" + ')');
      }
   }
}
