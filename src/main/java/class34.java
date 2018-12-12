public class class34 extends class347 {
   class138[] field5329;
   static boolean field5330 = true;

   final void method3318(int[][] var1, byte var2) {
      try {
         int var3 = class322.field831;
         int var4 = class322.field832;
         class390.method3421(var1, (byte)1);
         class972.method1773(0, 0, class322.field829, class322.field834, -252258015);
         if (this.field5329 != null) {
            for(int var5 = 0; var5 < this.field5329.length; ++var5) {
               class138 var6 = this.field5329[var5];
               int var7 = var6.field1170;
               int var8 = var6.field1169;
               if (var7 >= 0) {
                  if (var8 >= 0) {
                     var6.method985(var3, var4, (byte)1);
                  } else {
                     var6.method984(var3, var4, (byte)1);
                  }
               } else if (var8 >= 0) {
                  var6.method991(var3, var4, (byte)88);
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "agd.ac(" + ')');
      }
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = super.field270.method3546(var1, 22480626);
         if (super.field270.field6612) {
            this.method3318(super.field270.method3547(-45371310), (byte)24);
         }

         return var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agd.i(" + ')');
      }
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = super.field266.method162(var1, (byte)90);
         if (super.field266.field211) {
            int var4 = class322.field831;
            int var5 = class322.field832;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field266.method161((byte)53);
            this.method3318(var6, (byte)121);

            for(int var8 = 0; var8 < class322.field832; ++var8) {
               int[] var9 = var6[var8];
               int[][] var10 = var7[var8];
               int[] var11 = var10[0];
               int[] var12 = var10[1];
               int[] var13 = var10[2];

               for(int var14 = 0; var14 < class322.field831; ++var14) {
                  int var15 = var9[var14];
                  var13[var14] = (var15 & 255) << 4;
                  var12[var14] = (var15 & '\uff00') >> 4;
                  var11[var14] = (var15 & 16711680) >> 12;
               }
            }
         }

         return var3;
      } catch (RuntimeException var16) {
         throw class158.method3445(var16, "agd.k(" + ')');
      }
   }

   void method209(int var1, InputStream var2, byte var3) {
      try {
         if (var1 == 0) {
            this.field5329 = new class138[var2.method6371()];

            for(int var4 = 0; var4 < this.field5329.length; ++var4) {
               int var5 = var2.method6371();
               switch(var5) {
               case 0:
                  this.field5329[var4] = class345.method159(var2, -920913322);
                  break;
               case 1:
                  this.field5329[var4] = class307.method386(var2, -1403634291);
                  break;
               case 2:
                  this.field5329[var4] = class396.method3501(var2, 505653408);
                  break;
               case 3:
                  this.field5329[var4] = class255.method4498(var2, 2061944382);
               }
            }
         } else if (var1 == 1) {
            super.field268 = var2.method6371() == 1;
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "agd.r(" + ')');
      }
   }

   public class34() {
      super(0, true);
   }

   static final void method3325(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-15);
         class131 var4 = class382.field1410[var2 >> 16];
         class740.method1919(var3, var4, var0, (byte)31);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "agd.de(" + ')');
      }
   }
}
