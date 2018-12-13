public class class340 extends Node {
   static int[] field160;
   int field161;
   boolean field162;
   int field163;
   int[] field164;
   int field165;

   int[] method138() {
      return this.field164;
   }

   class340(int var1, int var2, int[] var3, boolean var4) {
      this.field163 = var1;
      this.field165 = var2;
      this.field164 = var3;
      if (var4) {
         int[] var5 = new int[this.field165];
         int[] var6 = new int[this.field165];
         int[] var7 = new int[this.field165];
         int[] var8 = new int[this.field165];
         if (field160 == null || field160.length != this.field164.length) {
            field160 = new int[this.field164.length];
         }

         int var9 = this.field165;
         int var10 = this.field165;
         int var11 = var9 - 1;
         int var12 = var10 - 1;
         int var13 = var9 * var10;
         int var14 = var9;
         int var15 = var9;

         int var16;
         int var17;
         int var18;
         for(var16 = 2; var16 >= 0; --var16) {
            for(var17 = var11; var17 >= 0; --var17) {
               --var14;
               var18 = this.field164[var14];
               var5[var17] += var18 >> 24 & 255;
               var6[var17] += var18 >> 16 & 255;
               var7[var17] += var18 >> 8 & 255;
               var8[var17] += var18 & 255;
            }

            if (var14 == 0) {
               var14 = var13;
            }
         }

         var16 = var13;

         for(var17 = var12; var17 >= 0; --var17) {
            var18 = 1;
            int var19 = 1;
            int var20 = 0;
            int var21 = 0;
            int var22 = 0;
            int var23 = 0;

            int var24;
            for(var24 = 2; var24 >= 0; --var24) {
               --var19;
               var23 += var5[var19];
               var22 += var6[var19];
               var20 += var7[var19];
               var21 += var8[var19];
               if (var19 == 0) {
                  var19 = var9;
               }
            }

            int var25;
            int var26;
            for(var24 = var11; var24 >= 0; --var24) {
               --var19;
               --var18;
               var25 = var23 / 9;
               var26 = var22 / 9;
               int var27 = var20 / 9;
               int var28 = var21 / 9;
               --var16;
               field160[var16] = var25 << 24 | var26 << 16 | var27 << 8 | var28;
               var23 += var5[var19] - var5[var18];
               var22 += var6[var19] - var6[var18];
               var21 += var8[var19] - var8[var18];
               var20 += var7[var19] - var7[var18];
               if (var19 == 0) {
                  var19 = var9;
               }

               if (var18 == 0) {
                  var18 = var9;
               }
            }

            for(var24 = var11; var24 >= 0; --var24) {
               --var14;
               var25 = this.field164[var14];
               --var15;
               var26 = this.field164[var15];
               var5[var24] += (var25 >> 24 & 255) - (var26 >> 24 & 255);
               var6[var24] += (var25 >> 16 & 255) - (var26 >> 16 & 255);
               var7[var24] += (var25 >> 8 & 255) - (var26 >> 8 & 255);
               var8[var24] += (var25 & 255) - (var26 & 255);
            }

            if (var14 == 0) {
               var14 = var13;
            }

            if (var15 == 0) {
               var15 = var13;
            }
         }

         int[] var29 = this.field164;
         this.field164 = field160;
         field160 = var29;
      }

   }

   void method139(int var1, int var2) {
      if (var1 != 0 || var2 != 0) {
         if (field160 == null || field160.length != this.field164.length) {
            field160 = new int[this.field164.length];
         }

         int var3 = this.field164.length;
         int var4 = var1;
         int var5 = this.field165 - 1;
         int var6 = this.field165 * var2;
         int var7 = var3 - 1;

         for(int var8 = 0; var8 < var3; var8 += this.field165) {
            int var9 = var8 + var6 & var7;

            for(int var10 = 0; var10 < this.field165; ++var10) {
               int var11 = var8 + var10;
               int var12 = var9 + (var10 + var4 & var5);
               field160[var11] = this.field164[var12];
            }
         }

         int[] var13 = this.field164;
         this.field164 = field160;
         field160 = var13;
      }

   }
}
