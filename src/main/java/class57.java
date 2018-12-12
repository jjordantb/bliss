public class class57 extends class442 {
   public static float field2349 = 1.0F;
   public static float field2350 = 0.25F;
   public static float field2351 = 1.0F;
   class655 field2352;
   public static float field2353 = 1.0F;
   class223 field2354;
   class184 field2355;
   class184 field2356;
   class184 field2357;
   class655 field2358;
   class655 field2359;
   class184 field2360;
   class655 field2361;
   class655 field2362;
   class655 field2363;
   class184 field2364;
   static int field2365 = 256;
   boolean field2366;

   boolean method1589() {
      return super.field7760.field793 && super.field7760.method742();
   }

   boolean method4355() {
      return this.field2366;
   }

   void method4359(int var1, int var2) {
   }

   int method4362() {
      return 4;
   }

   void method4371(int var1, class806 var2, class801 var3, class893 var4, class801 var5) {
      float var6 = super.field7760.method574();
      float var7 = (float)var2.method2481();
      float var8 = (float)var2.method2493();
      class801 var9 = var3;
      float[] var10 = new float[]{-1.0F, 1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 2.0F, 0.0F};
      int var11 = (int)var7;
      int var12 = (int)var8;
      int var13 = var11;
      int var14 = var12;
      if (var1 == 0) {
         var11 = 256;
         var12 = 256;
         this.field2354.method4057(this.field2364);
         this.field2354.method4066();
      } else if (var1 == 1) {
         var11 = 256;
         var12 = 256;
         var13 = var11;
         var14 = var12;
         this.field2354.method4057(this.field2357);
         this.field2354.method4066();
         this.field2354.method4050(this.field2363, field2353 / var7, 0.0F, -1570489076);
      } else if (var1 == 2) {
         var11 = 256;
         var12 = 256;
         var13 = var11;
         var14 = var12;
         this.field2354.method4057(this.field2357);
         this.field2354.method4066();
         this.field2354.method4050(this.field2363, 0.0F, field2353 / var8, 895542574);
      } else if (var1 == 3) {
         this.field2354.method4057(this.field2355);
         var9 = var5;
         this.field2354.method4067(this.field2361, 1, var3, -1586296471);
         this.field2354.method4066();
      }

      float var15 = (float)var11 / var7;
      float var16 = (float)var12 / var8;
      float var17 = (float)var13 / var7;
      float var18 = (float)var14 / var8;
      var10[8] = (var10[8] + 1.0F) * var15 - 1.0F;
      var10[5] = (var10[5] - 1.0F) * var16 + 1.0F;
      var10[10] *= var17;
      var10[7] *= var18;
      this.field2354.method4073(this.field2358, var10, (byte)51);
      this.field2354.method4067(this.field2359, 0, var9, -709560507);
      this.field2354.method4092(this.field2362, field2349, field2350, field2351, 0.0F, -749411893);
      this.field2354.method4092(this.field2352, var6 / var7, var6 / var8, 256.0F / var7, 256.0F / var8, -14612883);
      super.field7760.method5059(0, 0, var11, var12);
      super.field7760.method4986(0, 0, var11, var12);
   }

   void method4361(int var1) {
      this.field2354.method4098();
   }

   boolean method4356() {
      if (this.method1589()) {
         this.field2354 = super.field7760.method556("FilterBloom");
         if (this.field2354 == null) {
            return false;
         } else {
            try {
               this.field2359 = this.field2354.method4086("sceneTex", -490582709);
               this.field2361 = this.field2354.method4086("bloomTex1", 1106954447);
               this.field2362 = this.field2354.method4086("params", 903814817);
               this.field2363 = this.field2354.method4086("sampleSize", 1499503394);
               this.field2352 = this.field2354.method4086("pixelOffsetAndBloomScale", 348725520);
               this.field2358 = this.field2354.method4086("PosAndTexCoords", -1410472149);
               this.field2354.method4053("test", (byte)-51);
               this.field2360 = this.field2354.method4053("techFullscreenTri", (byte)-32);
               this.field2364 = this.field2354.method4053("brightpass", (byte)-69);
               this.field2357 = this.field2354.method4053("blur", (byte)-25);
               this.field2355 = this.field2354.method4053("composite", (byte)-20);
               this.field2356 = this.field2354.method4053("techDefault", (byte)-52);
            } catch (class338 var2) {
               return false;
            } catch (class336 var3) {
               return false;
            }

            if (!this.field2360.method3237()) {
               return false;
            } else if (!this.field2364.method3237()) {
               return false;
            } else if (!this.field2357.method3237()) {
               return false;
            } else if (!this.field2355.method3237()) {
               return false;
            } else if (!this.field2356.method3237()) {
               return false;
            } else {
               this.field2366 = true;
               return true;
            }
         }
      } else {
         return false;
      }
   }

   int method4363() {
      return 1;
   }

   void method4358() {
   }

   public class57(class325 var1) {
      super(var1);
   }
}
