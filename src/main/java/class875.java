import java.nio.ByteBuffer;

public class class875 extends class727 {
   class801 field9800;
   class325 field9801;
   class525 field9802;

   void method1680(char var1, int var2, int var3, int var4, boolean var5) {
      this.field9801.method596();
      this.field9801.method633(1);
      class523 var6 = this.field9801.field701;
      var6.field4362 = this.field9800;
      var6.method2762(3, var4);
      float var7 = (float)this.field9801.method4800((short)-19985).method2481();
      float var8 = (float)this.field9801.method4800((short)-4306).method2493();
      var6.field4365.method274(2.0F / var7, 2.0F / var8, 1.0F, 1.0F);
      var6.field4365.field325[12] = ((float)var2 + this.field9801.method574()) * 2.0F / var7 - 1.0F;
      var6.field4365.field325[13] = ((float)var3 + this.field9801.method574()) * 2.0F / var8 - 1.0F;
      var6.field4365.field325[14] = -1.0F;
      var6.field4366.method299();
      var6.field4363 = this.field9802;
      var6.field4368 = var1 * 4;
      var6.field4369 = this.field9801.field803;
      var6.method2763();
   }

   void method1674(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8) {
   }

   class875(class325 var1, class230 var2, class922[] var3, boolean var4) {
      super(var1, var2);
      this.field9801 = var1;
      int var5 = 0;

      int var6;
      for(var6 = 0; var6 < 256; ++var6) {
         class922 var7 = var3[var6];
         if (var7.field10273 > var5) {
            var5 = var7.field10273;
         }

         if (var7.field10269 > var5) {
            var5 = var7.field10269;
         }
      }

      var6 = var5 * 16;
      int var8;
      class922 var9;
      int var10;
      int var12;
      int var13;
      int var14;
      int var15;
      int var17;
      int var18;
      if (var4) {
         byte[] var22 = new byte[var6 * var6];

         for(var8 = 0; var8 < 256; ++var8) {
            var9 = var3[var8];
            var10 = var9.field10273;
            int var11 = var9.field10269;
            var12 = var8 % 16 * var5;
            var13 = var8 / 16 * var5;
            var14 = var13 * var6 + var12;
            var15 = 0;
            byte[] var16;
            if (var9.field10276 == null) {
               var16 = var9.field10275;

               for(var17 = 0; var17 < var10; ++var17) {
                  for(var18 = 0; var18 < var11; ++var18) {
                     var22[var14++] = (byte)(var16[var15++] == 0 ? 0 : -1);
                  }

                  var14 += var6 - var11;
               }
            } else {
               var16 = var9.field10276;

               for(var17 = 0; var17 < var10; ++var17) {
                  for(var18 = 0; var18 < var11; ++var18) {
                     var22[var14++] = var16[var15++];
                  }

                  var14 += var6 - var11;
               }
            }
         }

         if (!var1.method607(class264.field8201, class482.field8399)) {
            int[] var25 = new int[var22.length];

            for(int var26 = 0; var26 < var22.length; ++var26) {
               var25[var26] = var22[var26] << 24;
            }

            this.field9800 = var1.method609(var6, var6, false, var25);
         } else {
            this.field9800 = var1.method610(class264.field8201, var6, var6, false, var22);
         }
      } else {
         int[] var23 = new int[var6 * var6];

         for(var8 = 0; var8 < 256; ++var8) {
            var9 = var3[var8];
            int[] var28 = var9.field10274;
            byte[] var30 = var9.field10276;
            byte[] var32 = var9.field10275;
            var13 = var9.field10273;
            var14 = var9.field10269;
            var15 = var8 % 16 * var5;
            int var33 = var8 / 16 * var5;
            var17 = var33 * var6 + var15;
            var18 = 0;
            int var19;
            int var20;
            if (var30 != null) {
               for(var19 = 0; var19 < var13; ++var19) {
                  for(var20 = 0; var20 < var14; ++var20) {
                     var23[var17++] = var30[var18] << 24 | var28[var32[var18] & 255];
                     ++var18;
                  }

                  var17 += var6 - var14;
               }
            } else {
               for(var19 = 0; var19 < var13; ++var19) {
                  for(var20 = 0; var20 < var14; ++var20) {
                     byte var21;
                     if ((var21 = var32[var18++]) != 0) {
                        var23[var17++] = -16777216 | var28[var21 & 255];
                     } else {
                        ++var17;
                     }
                  }

                  var17 += var6 - var14;
               }
            }
         }

         this.field9800 = var1.method609(var6, var6, false, var23);
      }

      this.field9800.method5694(class566.field623);
      this.field9802 = var1.method641(false);
      this.field9802.method2237(20480, 20);
      ByteBuffer var24 = this.field9801.field660;
      var24.clear();
      float var27 = this.field9800.method2846((float)var6) / (float)var6;
      float var29 = this.field9800.method2847((float)var6) / (float)var6;

      for(var10 = 0; var10 < 256; ++var10) {
         class922 var31 = var3[var10];
         var12 = var31.field10273;
         var13 = var31.field10269;
         var14 = var31.field10268;
         var15 = var31.field10272;
         float var34 = (float)(var10 % 16 * var5);
         float var35 = (float)(var10 / 16 * var5);
         float var36 = var34 * var27;
         float var37 = var35 * var29;
         float var38 = (var34 + (float)var13) * var27;
         float var39 = (var35 + (float)var12) * var29;
         var24.putFloat((float)var15);
         var24.putFloat((float)var14);
         var24.putFloat(0.0F);
         var24.putFloat(var36);
         var24.putFloat(var37);
         var24.putFloat((float)var15);
         var24.putFloat((float)(var14 + var12));
         var24.putFloat(0.0F);
         var24.putFloat(var36);
         var24.putFloat(var39);
         var24.putFloat((float)(var15 + var13));
         var24.putFloat((float)(var14 + var12));
         var24.putFloat(0.0F);
         var24.putFloat(var38);
         var24.putFloat(var39);
         var24.putFloat((float)(var15 + var13));
         var24.putFloat((float)var14);
         var24.putFloat(0.0F);
         var24.putFloat(var38);
         var24.putFloat(var37);
      }

      this.field9802.method1977(0, var24.position(), this.field9801.field661);
      var1.method563(12);
   }
}
