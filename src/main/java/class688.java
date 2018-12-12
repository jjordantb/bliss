public class class688 extends class347 {
   int field7639 = 1210221109;

   int[] method4325(int var1) {
      int[] var2 = this.field270.method3546(var1, -122231988);
      if (this.field270.field6612) {
         int var3 = class322.field836[var1];

         for(int var4 = 0; var4 < class322.field831 * -1474554145; ++var4) {
            int var5 = class322.field838[var4];
            int var6;
            if (var5 > -121339323 * this.field7639 && var5 < 4096 - -121339323 * this.field7639 && var3 > 2048 - this.field7639 * -121339323 && var3 < 2048 + this.field7639 * -121339323) {
               var6 = 2048 - var5;
               var6 = var6 < 0 ? -var6 : var6;
               var6 <<= 12;
               var6 /= 2048 - -121339323 * this.field7639;
               var2[var4] = 4096 - var6;
            } else if (var5 > 2048 - -121339323 * this.field7639 && var5 < 2048 + this.field7639 * -121339323) {
               var6 = var3 - 2048;
               var6 = var6 < 0 ? -var6 : var6;
               var6 -= -121339323 * this.field7639;
               var6 <<= 12;
               var2[var4] = var6 / (2048 - -121339323 * this.field7639);
            } else if (var3 >= this.field7639 * -121339323 && var3 <= 4096 - this.field7639 * -121339323) {
               if (var5 >= this.field7639 * -121339323 && var5 <= 4096 - this.field7639 * -121339323) {
                  var2[var4] = 0;
               } else {
                  var6 = 2048 - var3;
                  var6 = var6 < 0 ? -var6 : var6;
                  var6 <<= 12;
                  var6 /= 2048 - this.field7639 * -121339323;
                  var2[var4] = 4096 - var6;
               }
            } else {
               var6 = var5 - 2048;
               var6 = var6 < 0 ? -var6 : var6;
               var6 -= this.field7639 * -121339323;
               var6 <<= 12;
               var2[var4] = var6 / (2048 - this.field7639 * -121339323);
            }
         }
      }

      return var2;
   }

   public class688() {
      super(0, true);
   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field7639 = var2.method6374() * 2065121421;
         default:
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahz.r(" + ')');
      }
   }

   int[] method4326(int var1) {
      int[] var2 = this.field270.method3546(var1, 1278925238);
      if (this.field270.field6612) {
         int var3 = class322.field836[var1];

         for(int var4 = 0; var4 < class322.field831 * -1474554145; ++var4) {
            int var5 = class322.field838[var4];
            int var6;
            if (var5 > -121339323 * this.field7639 && var5 < 4096 - -121339323 * this.field7639 && var3 > 2048 - this.field7639 * -121339323 && var3 < 2048 + this.field7639 * -121339323) {
               var6 = 2048 - var5;
               var6 = var6 < 0 ? -var6 : var6;
               var6 <<= 12;
               var6 /= 2048 - -121339323 * this.field7639;
               var2[var4] = 4096 - var6;
            } else if (var5 > 2048 - -121339323 * this.field7639 && var5 < 2048 + this.field7639 * -121339323) {
               var6 = var3 - 2048;
               var6 = var6 < 0 ? -var6 : var6;
               var6 -= -121339323 * this.field7639;
               var6 <<= 12;
               var2[var4] = var6 / (2048 - -121339323 * this.field7639);
            } else if (var3 >= this.field7639 * -121339323 && var3 <= 4096 - this.field7639 * -121339323) {
               if (var5 >= this.field7639 * -121339323 && var5 <= 4096 - this.field7639 * -121339323) {
                  var2[var4] = 0;
               } else {
                  var6 = 2048 - var3;
                  var6 = var6 < 0 ? -var6 : var6;
                  var6 <<= 12;
                  var6 /= 2048 - this.field7639 * -121339323;
                  var2[var4] = 4096 - var6;
               }
            } else {
               var6 = var5 - 2048;
               var6 = var6 < 0 ? -var6 : var6;
               var6 -= this.field7639 * -121339323;
               var6 <<= 12;
               var2[var4] = var6 / (2048 - this.field7639 * -121339323);
            }
         }
      }

      return var2;
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 1728216367);
         if (this.field270.field6612) {
            int var4 = class322.field836[var1];

            for(int var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               int var6 = class322.field838[var5];
               int var7;
               if (var6 > -121339323 * this.field7639 && var6 < 4096 - -121339323 * this.field7639 && var4 > 2048 - this.field7639 * -121339323 && var4 < 2048 + this.field7639 * -121339323) {
                  var7 = 2048 - var6;
                  var7 = var7 < 0 ? -var7 : var7;
                  var7 <<= 12;
                  var7 /= 2048 - -121339323 * this.field7639;
                  var3[var5] = 4096 - var7;
               } else if (var6 > 2048 - -121339323 * this.field7639 && var6 < 2048 + this.field7639 * -121339323) {
                  var7 = var4 - 2048;
                  var7 = var7 < 0 ? -var7 : var7;
                  var7 -= -121339323 * this.field7639;
                  var7 <<= 12;
                  var3[var5] = var7 / (2048 - -121339323 * this.field7639);
               } else if (var4 >= this.field7639 * -121339323 && var4 <= 4096 - this.field7639 * -121339323) {
                  if (var6 >= this.field7639 * -121339323 && var6 <= 4096 - this.field7639 * -121339323) {
                     var3[var5] = 0;
                  } else {
                     var7 = 2048 - var4;
                     var7 = var7 < 0 ? -var7 : var7;
                     var7 <<= 12;
                     var7 /= 2048 - this.field7639 * -121339323;
                     var3[var5] = 4096 - var7;
                  }
               } else {
                  var7 = var6 - 2048;
                  var7 = var7 < 0 ? -var7 : var7;
                  var7 -= this.field7639 * -121339323;
                  var7 <<= 12;
                  var3[var5] = var7 / (2048 - this.field7639 * -121339323);
               }
            }
         }

         return var3;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "ahz.i(" + ')');
      }
   }

   void method4327(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field7639 = var2.method6374() * 2065121421;
      default:
      }
   }

   void method4328(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field7639 = var2.method6374() * 2065121421;
      default:
      }
   }
}
