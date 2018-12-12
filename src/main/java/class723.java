public class class723 extends class347 {
   static int field2523 = 409;
   static int field2524 = 4096;
   int field2525 = 409;
   int field2526 = 4096;
   int field2527 = 4096;
   static int field2528 = 4096;
   int field2529 = 4096;
   static int field2530 = 4096;
   int[] field2531 = new int[3];

   void method209(int var1, InputStream var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field2525 = var2.method6374();
            break;
         case 1:
            this.field2527 = var2.method6374();
            break;
         case 2:
            this.field2526 = var2.method6374();
            break;
         case 3:
            this.field2529 = var2.method6374();
            break;
         case 4:
            int var4 = var2.method6390((byte)109);
            this.field2531[0] = (var4 & 16711680) << 4;
            this.field2531[1] = (var4 & '\uff00') >> 4;
            this.field2531[2] = (var4 & 255) >> 12;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "agq.r(" + ')');
      }
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = super.field266.method162(var1, (byte)97);
         if (super.field266.field211) {
            int[][] var4 = this.method206(0, var1, (byte)8);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];

            for(int var11 = 0; var11 < class322.field831; ++var11) {
               int var12 = var5[var11];
               int var13 = var12 - this.field2531[0];
               if (var13 < 0) {
                  var13 = -var13;
               }

               if (var13 > this.field2525) {
                  var8[var11] = var12;
                  var9[var11] = var6[var11];
                  var10[var11] = var7[var11];
               } else {
                  int var14 = var6[var11];
                  var13 = var14 - this.field2531[1];
                  if (var13 < 0) {
                     var13 = -var13;
                  }

                  if (var13 > this.field2525) {
                     var8[var11] = var12;
                     var9[var11] = var14;
                     var10[var11] = var7[var11];
                  } else {
                     int var15 = var7[var11];
                     var13 = var15 - this.field2531[2];
                     if (var13 < 0) {
                        var13 = -var13;
                     }

                     if (var13 > this.field2525) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var15;
                     } else {
                        var8[var11] = var12 * this.field2529 >> 12;
                        var9[var11] = var14 * this.field2526 >> 12;
                        var10[var11] = var15 * this.field2527 >> 12;
                     }
                  }
               }
            }
         }

         return var3;
      } catch (RuntimeException var16) {
         throw class158.method3445(var16, "agq.k(" + ')');
      }
   }

   public class723() {
      super(1, false);
   }
}
