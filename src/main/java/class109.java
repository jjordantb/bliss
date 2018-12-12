public class class109 extends class347 {
   int field1566 = 0;
   int field1567 = -1452716032;
   int field1568 = 0;
   int field1569 = 2092275712;
   int field1570 = -2143252480;
   int field1571 = 113614848;
   int field1572 = -1105127424;

   void method1201() {
      class322.method814((byte)41);
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 1326097186);
         if (this.field270.field6612) {
            int var4 = class322.field836[var1] - 2048;

            for(int var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               int var6 = class322.field838[var5] - 2048;
               int var7 = this.field1569 * -1801516933 + var6;
               var7 = var7 < -2048 ? var7 + 4096 : var7;
               var7 = var7 > 2048 ? var7 - 4096 : var7;
               int var8 = var4 + 351466605 * this.field1566;
               var8 = var8 < -2048 ? 4096 + var8 : var8;
               var8 = var8 > 2048 ? var8 - 4096 : var8;
               int var9 = -670406741 * this.field1568 + var6;
               var9 = var9 < -2048 ? 4096 + var9 : var9;
               var9 = var9 > 2048 ? var9 - 4096 : var9;
               int var10 = var4 + this.field1572 * 939068299;
               var10 = var10 < -2048 ? 4096 + var10 : var10;
               var10 = var10 > 2048 ? var10 - 4096 : var10;
               var3[var5] = !this.method1203(var7, var8, 1631373907) && !this.method1202(var9, var10, 689077390) ? 0 : 4096;
            }
         }

         return var3;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "aie.i(" + ')');
      }
   }

   void method205(int var1) {
      try {
         class322.method814((byte)-3);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aie.x(" + ')');
      }
   }

   boolean method1202(int var1, int var2, int var3) {
      try {
         int var4 = -1052090709 * this.field1570 * (var1 + var2) >> 12;
         int var5 = class322.field839[255 * var4 >> 12 & 255];
         var5 = (var5 << 12) / (this.field1570 * -1052090709);
         var5 = (var5 << 12) / (454265253 * this.field1571);
         var5 = var5 * 679642301 * this.field1567 >> 12;
         return var2 - var1 < var5 && var2 - var1 > -var5;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aie.am(" + ')');
      }
   }

   boolean method1203(int var1, int var2, int var3) {
      try {
         int var4 = (var2 - var1) * -1052090709 * this.field1570 >> 12;
         int var5 = class322.field839[255 * var4 >> 12 & 255];
         var5 = (var5 << 12) / (-1052090709 * this.field1570);
         var5 = (var5 << 12) / (454265253 * this.field1571);
         var5 = var5 * this.field1567 * 679642301 >> 12;
         return var1 + var2 < var5 && var1 + var2 > -var5;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aie.ac(" + ')');
      }
   }

   int[] method1204(int var1) {
      int[] var2 = this.field270.method3546(var1, 682412629);
      if (this.field270.field6612) {
         int var3 = class322.field836[var1] - 2048;

         for(int var4 = 0; var4 < class322.field831 * -1474554145; ++var4) {
            int var5 = class322.field838[var4] - 2048;
            int var6 = this.field1569 * -1801516933 + var5;
            var6 = var6 < -2048 ? var6 + 4096 : var6;
            var6 = var6 > 2048 ? var6 - 4096 : var6;
            int var7 = var3 + 351466605 * this.field1566;
            var7 = var7 < -2048 ? 4096 + var7 : var7;
            var7 = var7 > 2048 ? var7 - 4096 : var7;
            int var8 = -670406741 * this.field1568 + var5;
            var8 = var8 < -2048 ? 4096 + var8 : var8;
            var8 = var8 > 2048 ? var8 - 4096 : var8;
            int var9 = var3 + this.field1572 * 939068299;
            var9 = var9 < -2048 ? 4096 + var9 : var9;
            var9 = var9 > 2048 ? var9 - 4096 : var9;
            var2[var4] = !this.method1203(var6, var7, 838244364) && !this.method1202(var8, var9, 424769104) ? 0 : 4096;
         }
      }

      return var2;
   }

   void method1205() {
      class322.method814((byte)-73);
   }

   void method1206() {
      class322.method814((byte)-116);
   }

   void method1207(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field1569 = var2.method6374() * -2115004749;
         break;
      case 1:
         this.field1566 = var2.method6374() * -925420187;
         break;
      case 2:
         this.field1568 = var2.method6374() * -871015677;
         break;
      case 3:
         this.field1572 = var2.method6374() * -1141390301;
         break;
      case 4:
         this.field1570 = var2.method6374() * 1435675651;
         break;
      case 5:
         this.field1567 = var2.method6374() * -1402300779;
         break;
      case 6:
         this.field1571 = var2.method6374() * 233322029;
      }

   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field1569 = var2.method6374() * -2115004749;
            break;
         case 1:
            this.field1566 = var2.method6374() * -925420187;
            break;
         case 2:
            this.field1568 = var2.method6374() * -871015677;
            break;
         case 3:
            this.field1572 = var2.method6374() * -1141390301;
            break;
         case 4:
            this.field1570 = var2.method6374() * 1435675651;
            break;
         case 5:
            this.field1567 = var2.method6374() * -1402300779;
            break;
         case 6:
            this.field1571 = var2.method6374() * 233322029;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aie.r(" + ')');
      }
   }

   void method1208(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field1569 = var2.method6374() * -2115004749;
         break;
      case 1:
         this.field1566 = var2.method6374() * -925420187;
         break;
      case 2:
         this.field1568 = var2.method6374() * -871015677;
         break;
      case 3:
         this.field1572 = var2.method6374() * -1141390301;
         break;
      case 4:
         this.field1570 = var2.method6374() * 1435675651;
         break;
      case 5:
         this.field1567 = var2.method6374() * -1402300779;
         break;
      case 6:
         this.field1571 = var2.method6374() * 233322029;
      }

   }

   int[] method1209(int var1) {
      int[] var2 = this.field270.method3546(var1, 1324106333);
      if (this.field270.field6612) {
         int var3 = class322.field836[var1] - 2048;

         for(int var4 = 0; var4 < class322.field831 * -1474554145; ++var4) {
            int var5 = class322.field838[var4] - 2048;
            int var6 = this.field1569 * -1801516933 + var5;
            var6 = var6 < -2048 ? var6 + 4096 : var6;
            var6 = var6 > 2048 ? var6 - 4096 : var6;
            int var7 = var3 + 351466605 * this.field1566;
            var7 = var7 < -2048 ? 4096 + var7 : var7;
            var7 = var7 > 2048 ? var7 - 4096 : var7;
            int var8 = -670406741 * this.field1568 + var5;
            var8 = var8 < -2048 ? 4096 + var8 : var8;
            var8 = var8 > 2048 ? var8 - 4096 : var8;
            int var9 = var3 + this.field1572 * 939068299;
            var9 = var9 < -2048 ? 4096 + var9 : var9;
            var9 = var9 > 2048 ? var9 - 4096 : var9;
            var2[var4] = !this.method1203(var6, var7, -630514594) && !this.method1202(var8, var9, -716173681) ? 0 : 4096;
         }
      }

      return var2;
   }

   public class109() {
      super(0, true);
   }

   public static int method1210(int var0, int var1, int var2, int var3) {
      try {
         int var4 = 255 - var2;
         var1 = (var2 * (var1 & 16711935) & -16711936 | var2 * (var1 & '\uff00') & 16711680) >>> 8;
         return var1 + (((var0 & 16711935) * var4 & -16711936 | (var0 & '\uff00') * var4 & 16711680) >>> 8);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aie.u(" + ')');
      }
   }
}
