public class class723 extends class347 {
   static int field2523 = 409;
   static int field2524 = 4096;
   int field2525 = -496736879;
   int field2526 = 571002880;
   int field2527 = -1106251776;
   static int field2528 = 4096;
   int field2529 = 1049899008;
   static int field2530 = 4096;
   int[] field2531 = new int[3];

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field2525 = var2.method6374() * -2038436167;
            break;
         case 1:
            this.field2527 = var2.method6374() * 1987830015;
            break;
         case 2:
            this.field2526 = var2.method6374() * -1725816691;
            break;
         case 3:
            this.field2529 = var2.method6374() * 2122574147;
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
         int[][] var3 = this.field266.method162(var1, (byte)97);
         if (this.field266.field211) {
            int[][] var4 = this.method206(0, var1, (byte)8);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];

            for(int var11 = 0; var11 < -1474554145 * class322.field831; ++var11) {
               int var12 = var5[var11];
               int var13 = var12 - this.field2531[0];
               if (var13 < 0) {
                  var13 = -var13;
               }

               if (var13 > this.field2525 * 1467725705) {
                  var8[var11] = var12;
                  var9[var11] = var6[var11];
                  var10[var11] = var7[var11];
               } else {
                  int var14 = var6[var11];
                  var13 = var14 - this.field2531[1];
                  if (var13 < 0) {
                     var13 = -var13;
                  }

                  if (var13 > this.field2525 * 1467725705) {
                     var8[var11] = var12;
                     var9[var11] = var14;
                     var10[var11] = var7[var11];
                  } else {
                     int var15 = var7[var11];
                     var13 = var15 - this.field2531[2];
                     if (var13 < 0) {
                        var13 = -var13;
                     }

                     if (var13 > 1467725705 * this.field2525) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var15;
                     } else {
                        var8[var11] = var12 * this.field2529 * -1157633173 >> 12;
                        var9[var11] = var14 * this.field2526 * -620453307 >> 12;
                        var10[var11] = var15 * -322756865 * this.field2527 >> 12;
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

   void method1712(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field2525 = var2.method6374() * -2038436167;
         break;
      case 1:
         this.field2527 = var2.method6374() * 1987830015;
         break;
      case 2:
         this.field2526 = var2.method6374() * -1725816691;
         break;
      case 3:
         this.field2529 = var2.method6374() * 2122574147;
         break;
      case 4:
         int var3 = var2.method6390((byte)-48);
         this.field2531[0] = (var3 & 16711680) << 4;
         this.field2531[1] = (var3 & '\uff00') >> 4;
         this.field2531[2] = (var3 & 255) >> 12;
      }

   }

   public class723() {
      super(1, false);
   }

   void method1713(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field2525 = var2.method6374() * -2038436167;
         break;
      case 1:
         this.field2527 = var2.method6374() * 1987830015;
         break;
      case 2:
         this.field2526 = var2.method6374() * -1725816691;
         break;
      case 3:
         this.field2529 = var2.method6374() * 2122574147;
         break;
      case 4:
         int var3 = var2.method6390((byte)108);
         this.field2531[0] = (var3 & 16711680) << 4;
         this.field2531[1] = (var3 & '\uff00') >> 4;
         this.field2531[2] = (var3 & 255) >> 12;
      }

   }

   int[][] method1714(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)81);
      if (this.field266.field211) {
         int[][] var3 = this.method206(0, var1, (byte)8);
         int[] var4 = var3[0];
         int[] var5 = var3[1];
         int[] var6 = var3[2];
         int[] var7 = var2[0];
         int[] var8 = var2[1];
         int[] var9 = var2[2];

         for(int var10 = 0; var10 < -1474554145 * class322.field831; ++var10) {
            int var11 = var4[var10];
            int var12 = var11 - this.field2531[0];
            if (var12 < 0) {
               var12 = -var12;
            }

            if (var12 > this.field2525 * 1467725705) {
               var7[var10] = var11;
               var8[var10] = var5[var10];
               var9[var10] = var6[var10];
            } else {
               int var13 = var5[var10];
               var12 = var13 - this.field2531[1];
               if (var12 < 0) {
                  var12 = -var12;
               }

               if (var12 > this.field2525 * 1467725705) {
                  var7[var10] = var11;
                  var8[var10] = var13;
                  var9[var10] = var6[var10];
               } else {
                  int var14 = var6[var10];
                  var12 = var14 - this.field2531[2];
                  if (var12 < 0) {
                     var12 = -var12;
                  }

                  if (var12 > 1467725705 * this.field2525) {
                     var7[var10] = var11;
                     var8[var10] = var13;
                     var9[var10] = var14;
                  } else {
                     var7[var10] = var11 * this.field2529 * -1157633173 >> 12;
                     var8[var10] = var13 * this.field2526 * -620453307 >> 12;
                     var9[var10] = var14 * -322756865 * this.field2527 >> 12;
                  }
               }
            }
         }
      }

      return var2;
   }

   int[][] method1715(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)19);
      if (this.field266.field211) {
         int[][] var3 = this.method206(0, var1, (byte)8);
         int[] var4 = var3[0];
         int[] var5 = var3[1];
         int[] var6 = var3[2];
         int[] var7 = var2[0];
         int[] var8 = var2[1];
         int[] var9 = var2[2];

         for(int var10 = 0; var10 < -1474554145 * class322.field831; ++var10) {
            int var11 = var4[var10];
            int var12 = var11 - this.field2531[0];
            if (var12 < 0) {
               var12 = -var12;
            }

            if (var12 > this.field2525 * 1467725705) {
               var7[var10] = var11;
               var8[var10] = var5[var10];
               var9[var10] = var6[var10];
            } else {
               int var13 = var5[var10];
               var12 = var13 - this.field2531[1];
               if (var12 < 0) {
                  var12 = -var12;
               }

               if (var12 > this.field2525 * 1467725705) {
                  var7[var10] = var11;
                  var8[var10] = var13;
                  var9[var10] = var6[var10];
               } else {
                  int var14 = var6[var10];
                  var12 = var14 - this.field2531[2];
                  if (var12 < 0) {
                     var12 = -var12;
                  }

                  if (var12 > 1467725705 * this.field2525) {
                     var7[var10] = var11;
                     var8[var10] = var13;
                     var9[var10] = var14;
                  } else {
                     var7[var10] = var11 * this.field2529 * -1157633173 >> 12;
                     var8[var10] = var13 * this.field2526 * -620453307 >> 12;
                     var9[var10] = var14 * -322756865 * this.field2527 >> 12;
                  }
               }
            }
         }
      }

      return var2;
   }
}
