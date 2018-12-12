public final class class527 extends class523 {
   class184[] field3672 = new class184[3];
   static int field3673 = 0;
   static int field3674 = 0;
   static int field3675 = 2;
   static int field3676 = 3;
   static int field3677 = 4;
   static int field3678 = 5;
   static int field3679 = 6;
   static int field3680 = 7;
   class223 field3681;
   static int field3682 = 1;
   class267 field3683 = new class267(0.0F, 0.0F, 0.0F, 0.0F);
   static int field3684 = 3;
   static int field3685 = 2;
   int[][] field3686 = new int[3][7];
   int[] field3687;
   class267 field3688 = new class267(1.0F, 1.0F, 1.0F, 1.0F);
   static int field3689 = 1;
   public static class277 field3690;

   public void method2773() {
      this.field3681.method4057(this.field3672[1]);
      this.field3687 = this.field3686[this.field3681.method4059(1490567798)];
      this.field3681.method4074(this.field3687[2], 1, this.field4361, 1647913438);
      this.field3681.method4072(this.field3687[4], this.field4367, -1599730439);
      this.method2249(-512231280);
   }

   boolean method2248(int var1) throws class934 {
      try {
         this.field3681 = this.field4364.method556("Sprite");
         class655 var2 = this.field3681.method4086("WVPMatrix", -1337554714);
         class655 var3 = this.field3681.method4086("SpriteSampler", -347092125);
         class655 var4 = this.field3681.method4086("MaskSampler", -1001377482);
         class655 var5 = this.field3681.method4086("MulColour", 116022092);
         class655 var6 = this.field3681.method4086("AddColour", -797757613);
         class655 var7 = this.field3681.method4086("SpriteTexCoordMatrix", 271809133);
         class655 var8 = this.field3681.method4086("MaskTexCoordMatrix", 1713273798);
         this.field3672[0] = this.field3681.method4053("Normal", (byte)-30);
         this.field3672[1] = this.field3681.method4053("Masked", (byte)-23);
         this.field3672[2] = this.field3681.method4053("AlphaTex", (byte)-96);

         for(int var9 = 0; var9 < 3; ++var9) {
            int var10 = this.field3681.method4055(this.field3672[var9], -180449856);
            this.field3686[var9][0] = var2.method5614(var10);
            this.field3686[var9][1] = var3.method5614(var10);
            this.field3686[var9][2] = var4.method5614(var10);
            this.field3686[var9][5] = var5.method5614(var10);
            this.field3686[var9][6] = var6.method5614(var10);
            this.field3686[var9][3] = var7.method5614(var10);
            this.field3686[var9][4] = var8.method5614(var10);
         }

         this.field3681.method4057(this.field3672[0]);
         return true;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "yi.y(" + ')');
      }
   }

   public void method2767() {
      this.field3681.method4057(this.field3672[0]);
      this.field3687 = this.field3686[this.field3681.method4059(1620928863)];
      this.method2249(-512231280);
   }

   public void method2770() {
      this.field3681.method4057(this.field3672[1]);
      this.field3687 = this.field3686[this.field3681.method4059(1799614751)];
      this.field3681.method4074(this.field3687[2], 1, this.field4361, -291659161);
      this.field3681.method4072(this.field3687[4], this.field4367, -1599730439);
      this.method2249(-512231280);
   }

   void method2249(int var1) {
      try {
         this.field3681.method4066();
         this.field3681.method4074(this.field3687[1], 0, this.field4362, -1250819692);
         this.field4364.method594(this.field4365);
         this.field3681.method4062(this.field3687[0], this.field4365, (byte)-62);
         this.field3681.method4072(this.field3687[3], this.field4366, -1599730439);
         this.field3681.method4068(this.field3687[5], this.field3688.field8205, this.field3688.field8204, this.field3688.field8202, this.field3688.field8203, (byte)6);
         this.field3681.method4068(this.field3687[6], this.field3683.field8205, this.field3683.field8204, this.field3683.field8202, this.field3683.field8203, (byte)29);
         this.field4364.method642(0, this.field4363);
         this.field4364.method714(this.field4369);
         this.field4364.method657(class427.field7385, this.field4368, 2);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "yi.t(" + ')');
      }
   }

   public void method2764() {
      try {
         this.field3681.method4057(this.field3672[1]);
         this.field3687 = this.field3686[this.field3681.method4059(983668425)];
         this.field3681.method4074(this.field3687[2], 1, this.field4361, 1449956625);
         this.field3681.method4072(this.field3687[4], this.field4367, -1599730439);
         this.method2249(-512231280);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "yi.b(" + ')');
      }
   }

   public void method2765(int var1, int var2) {
      switch(var1) {
      case 0:
         this.field3688.method4571(var2);
         this.field3683.method4571(0);
         break;
      case 1:
         this.field3688.method4571(-1);
         this.field3683.method4571(0);
         break;
      case 2:
         this.field3688.method4571(var2);
         this.field3683.method4571(0);
         break;
      case 3:
         this.field3688.method4571(16777215 | var2 & -16777216);
         this.field3683.method4571(var2 & 16777215);
         break;
      case 4:
         this.field3688.method4571(-1);
         this.field3683.method4571(var2);
         this.field3683.method4572();
      }

   }

   public void method2766(int var1, int var2) {
      switch(var1) {
      case 0:
         this.field3688.method4571(var2);
         this.field3683.method4571(0);
         break;
      case 1:
         this.field3688.method4571(-1);
         this.field3683.method4571(0);
         break;
      case 2:
         this.field3688.method4571(var2);
         this.field3683.method4571(0);
         break;
      case 3:
         this.field3688.method4571(16777215 | var2 & -16777216);
         this.field3683.method4571(var2 & 16777215);
         break;
      case 4:
         this.field3688.method4571(-1);
         this.field3683.method4571(var2);
         this.field3683.method4572();
      }

   }

   public void method2772() {
      this.field3681.method4057(this.field3672[1]);
      this.field3687 = this.field3686[this.field3681.method4059(1377516236)];
      this.field3681.method4074(this.field3687[2], 1, this.field4361, -709585424);
      this.field3681.method4072(this.field3687[4], this.field4367, -1599730439);
      this.method2249(-512231280);
   }

   public void method2768() {
      this.field3681.method4057(this.field3672[0]);
      this.field3687 = this.field3686[this.field3681.method4059(1548061224)];
      this.method2249(-512231280);
   }

   public void method2771() {
      this.field3681.method4057(this.field3672[0]);
      this.field3687 = this.field3686[this.field3681.method4059(1025602377)];
      this.method2249(-512231280);
   }

   public void method2761() {
      this.field3681.method4057(this.field3672[0]);
      this.field3687 = this.field3686[this.field3681.method4059(1272253028)];
      this.method2249(-512231280);
   }

   public class527(class325 var1) throws class934 {
      super(var1);
      this.method2248(-964242582);
   }

   public void method2769() {
      this.field3681.method4057(this.field3672[1]);
      this.field3687 = this.field3686[this.field3681.method4059(2074431922)];
      this.field3681.method4074(this.field3687[2], 1, this.field4361, -2013036939);
      this.field3681.method4072(this.field3687[4], this.field4367, -1599730439);
      this.method2249(-512231280);
   }

   public void method2763() {
      try {
         this.field3681.method4057(this.field3672[0]);
         this.field3687 = this.field3686[this.field3681.method4059(1291749440)];
         this.method2249(-512231280);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "yi.f(" + ')');
      }
   }

   public void method2774() {
      this.field3681.method4057(this.field3672[1]);
      this.field3687 = this.field3686[this.field3681.method4059(1159640978)];
      this.field3681.method4074(this.field3687[2], 1, this.field4361, -2044717945);
      this.field3681.method4072(this.field3687[4], this.field4367, -1599730439);
      this.method2249(-512231280);
   }

   public void method2762(int var1, int var2) {
      try {
         switch(var1) {
         case 0:
            this.field3688.method4571(var2);
            this.field3683.method4571(0);
            break;
         case 1:
            this.field3688.method4571(-1);
            this.field3683.method4571(0);
            break;
         case 2:
            this.field3688.method4571(var2);
            this.field3683.method4571(0);
            break;
         case 3:
            this.field3688.method4571(16777215 | var2 & -16777216);
            this.field3683.method4571(var2 & 16777215);
            break;
         case 4:
            this.field3688.method4571(-1);
            this.field3683.method4571(var2);
            this.field3683.method4572();
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "yi.a(" + ')');
      }
   }

   static final void method2250(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class615.field8903.field9139.method2273(var2, 1352882135);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "yi.aoz(" + ')');
      }
   }

   static final void method2251(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)-15);
         class131 var4 = class382.field1410[var2 >> 16];
         class490.method4432(var3, var4, var0, 1912101040);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "yi.lb(" + ')');
      }
   }

   static final void method2252(class744 var0, int var1) {
      try {
         var0.field3156 -= -1959403445;
         class587.method167(var0.field3161[var0.field3156 * 681479919], var0.field3161[681479919 * var0.field3156 + 1], var0.field3161[681479919 * var0.field3156 + 2], var0.field3161[681479919 * var0.field3156 + 3], var0.field3161[4 + 681479919 * var0.field3156], 1835382767);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "yi.tn(" + ')');
      }
   }
}
