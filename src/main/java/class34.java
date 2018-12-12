public class class34 extends class347 {
   class138[] field5329;
   static boolean field5330 = true;

   final void method3318(int[][] var1, byte var2) {
      try {
         int var3 = class322.field831 * -1474554145;
         int var4 = 461985445 * class322.field832;
         class390.method3421(var1, (byte)1);
         class972.method1773(0, 0, class322.field829 * -901777799, class322.field834 * -289063255, -252258015);
         if (this.field5329 != null) {
            for(int var5 = 0; var5 < this.field5329.length; ++var5) {
               class138 var6 = this.field5329[var5];
               int var7 = var6.field1170 * 699194661;
               int var8 = 1785836763 * var6.field1169;
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
         int[] var3 = this.field270.method3546(var1, 22480626);
         if (this.field270.field6612) {
            this.method3318(this.field270.method3547(-45371310), (byte)24);
         }

         return var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agd.i(" + ')');
      }
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = this.field266.method162(var1, (byte)90);
         if (this.field266.field211) {
            int var4 = -1474554145 * class322.field831;
            int var5 = class322.field832 * 461985445;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field266.method161((byte)53);
            this.method3318(var6, (byte)121);

            for(int var8 = 0; var8 < 461985445 * class322.field832; ++var8) {
               int[] var9 = var6[var8];
               int[][] var10 = var7[var8];
               int[] var11 = var10[0];
               int[] var12 = var10[1];
               int[] var13 = var10[2];

               for(int var14 = 0; var14 < class322.field831 * -1474554145; ++var14) {
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

   void method209(int var1, class907 var2, byte var3) {
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
            this.field268 = var2.method6371() == 1;
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "agd.r(" + ')');
      }
   }

   int[] method3319(int var1) {
      int[] var2 = this.field270.method3546(var1, 294665976);
      if (this.field270.field6612) {
         this.method3318(this.field270.method3547(-654420077), (byte)118);
      }

      return var2;
   }

   int[] method3320(int var1) {
      int[] var2 = this.field270.method3546(var1, 569359385);
      if (this.field270.field6612) {
         this.method3318(this.field270.method3547(226434011), (byte)55);
      }

      return var2;
   }

   void method3321(int var1, class907 var2) {
      if (var1 == 0) {
         this.field5329 = new class138[var2.method6371()];

         for(int var3 = 0; var3 < this.field5329.length; ++var3) {
            int var4 = var2.method6371();
            switch(var4) {
            case 0:
               this.field5329[var3] = class345.method159(var2, -205247731);
               break;
            case 1:
               this.field5329[var3] = class307.method386(var2, -1904035175);
               break;
            case 2:
               this.field5329[var3] = class396.method3501(var2, 634970133);
               break;
            case 3:
               this.field5329[var3] = class255.method4498(var2, -291977486);
            }
         }
      } else if (var1 == 1) {
         this.field268 = var2.method6371() == 1;
      }

   }

   public class34() {
      super(0, true);
   }

   void method3322(int var1, class907 var2) {
      if (var1 == 0) {
         this.field5329 = new class138[var2.method6371()];

         for(int var3 = 0; var3 < this.field5329.length; ++var3) {
            int var4 = var2.method6371();
            switch(var4) {
            case 0:
               this.field5329[var3] = class345.method159(var2, 492697170);
               break;
            case 1:
               this.field5329[var3] = class307.method386(var2, 388197853);
               break;
            case 2:
               this.field5329[var3] = class396.method3501(var2, 892412290);
               break;
            case 3:
               this.field5329[var3] = class255.method4498(var2, -646790238);
            }
         }
      } else if (var1 == 1) {
         this.field268 = var2.method6371() == 1;
      }

   }

   int[][] method3323(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)78);
      if (this.field266.field211) {
         int var3 = -1474554145 * class322.field831;
         int var4 = class322.field832 * 461985445;
         int[][] var5 = new int[var4][var3];
         int[][][] var6 = this.field266.method161((byte)97);
         this.method3318(var5, (byte)120);

         for(int var7 = 0; var7 < 461985445 * class322.field832; ++var7) {
            int[] var8 = var5[var7];
            int[][] var9 = var6[var7];
            int[] var10 = var9[0];
            int[] var11 = var9[1];
            int[] var12 = var9[2];

            for(int var13 = 0; var13 < class322.field831 * -1474554145; ++var13) {
               int var14 = var8[var13];
               var12[var13] = (var14 & 255) << 4;
               var11[var13] = (var14 & '\uff00') >> 4;
               var10[var13] = (var14 & 16711680) >> 12;
            }
         }
      }

      return var2;
   }

   int[][] method3324(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)34);
      if (this.field266.field211) {
         int var3 = -1474554145 * class322.field831;
         int var4 = class322.field832 * 461985445;
         int[][] var5 = new int[var4][var3];
         int[][][] var6 = this.field266.method161((byte)114);
         this.method3318(var5, (byte)39);

         for(int var7 = 0; var7 < 461985445 * class322.field832; ++var7) {
            int[] var8 = var5[var7];
            int[][] var9 = var6[var7];
            int[] var10 = var9[0];
            int[] var11 = var9[1];
            int[] var12 = var9[2];

            for(int var13 = 0; var13 < class322.field831 * -1474554145; ++var13) {
               int var14 = var8[var13];
               var12[var13] = (var14 & 255) << 4;
               var11[var13] = (var14 & '\uff00') >> 4;
               var10[var13] = (var14 & 16711680) >> 12;
            }
         }
      }

      return var2;
   }

   static final void method3325(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)-15);
         class131 var4 = class382.field1410[var2 >> 16];
         class740.method1919(var3, var4, var0, (byte)31);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "agd.de(" + ')');
      }
   }
}
