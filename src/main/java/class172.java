public class class172 extends class347 {
   static int field4972 = 4;
   static int field4973 = 4;
   static int field4974 = 1638;
   static int field4975 = 0;
   static boolean field4976 = true;
   short[] field4977;
   short[] field4978;
   byte[] field4979 = new byte[512];
   int field4980 = 0;
   int field4981 = 710364358;
   int field4982 = -93378244;
   int field4983 = 277731988;
   int field4984 = 1307885412;
   boolean field4985 = true;
   static int field4986 = 8;

   void method3020(short var1) {
      try {
         int var2;
         if (993272049 * this.field4981 > 0) {
            this.field4977 = new short[832987241 * this.field4984];
            this.field4978 = new short[this.field4984 * 832987241];

            for(var2 = 0; var2 < 832987241 * this.field4984; ++var2) {
               this.field4977[var2] = (short)((int)(Math.pow((double)((float)(993272049 * this.field4981) / 4096.0F), (double)var2) * 4096.0D));
               this.field4978[var2] = (short)((int)Math.pow(2.0D, (double)var2));
            }
         } else if (this.field4977 != null && this.field4984 * 832987241 == this.field4977.length) {
            this.field4978 = new short[this.field4984 * 832987241];

            for(var2 = 0; var2 < this.field4984 * 832987241; ++var2) {
               this.field4978[var2] = (short)((int)Math.pow(2.0D, (double)var2));
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ahw.bd(" + ')');
      }
   }

   int method3021(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         int var8 = var1 >> 12;
         int var9 = 1 + var8;
         if (var9 >= var6) {
            var9 = 0;
         }

         var1 &= 4095;
         var8 &= 255;
         var9 &= 255;
         int var10 = var1 - 4096;
         int var11 = var2 - 4096;
         int var12 = class293.field10447[var1];
         int var13 = this.field4979[var8 + var3] & 3;
         int var14;
         if (var13 <= 1) {
            var14 = var13 == 0 ? var1 + var2 : var2 - var1;
         } else {
            var14 = 2 == var13 ? var1 - var2 : -var1 - var2;
         }

         var13 = this.field4979[var9 + var3] & 3;
         int var15;
         if (var13 <= 1) {
            var15 = var13 == 0 ? var2 + var10 : var2 - var10;
         } else {
            var15 = 2 == var13 ? var10 - var2 : -var10 - var2;
         }

         int var16 = var14 + ((var15 - var14) * var12 >> 12);
         var13 = this.field4979[var8 + var4] & 3;
         if (var13 <= 1) {
            var14 = var13 == 0 ? var1 + var11 : var11 - var1;
         } else {
            var14 = var13 == 2 ? var1 - var11 : -var1 - var11;
         }

         var13 = this.field4979[var4 + var9] & 3;
         if (var13 <= 1) {
            var15 = var13 == 0 ? var10 + var11 : var11 - var10;
         } else {
            var15 = 2 == var13 ? var10 - var11 : -var10 - var11;
         }

         int var17 = var14 + (var12 * (var15 - var14) >> 12);
         return ((var17 - var16) * var5 >> 12) + var16;
      } catch (RuntimeException var18) {
         throw class158.method3445(var18, "ahw.am(" + ')');
      }
   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field4985 = var2.method6371() == 1;
            break;
         case 1:
            this.field4984 = var2.method6371() * -1820512295;
            break;
         case 2:
            this.field4981 = var2.method6367(1683252364) * 52875281;
            if (993272049 * this.field4981 < 0) {
               this.field4977 = new short[832987241 * this.field4984];

               for(int var4 = 0; var4 < 832987241 * this.field4984; ++var4) {
                  this.field4977[var4] = (short)var2.method6367(2045257879);
               }
            }
            break;
         case 3:
            this.field4983 = (this.field4982 = var2.method6371() * 2124139087) * -1849370933;
            break;
         case 4:
            this.field4980 = var2.method6371() * -1333197873;
            break;
         case 5:
            this.field4983 = var2.method6371() * 1143174821;
            break;
         case 6:
            this.field4982 = var2.method6371() * 2124139087;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahw.r(" + ')');
      }
   }

   void method3022(int var1, int[] var2, int var3) {
      try {
         int var4 = this.field4982 * 963316911 * class322.field836[var1];
         short var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         if (this.field4984 * 832987241 == 1) {
            var5 = this.field4977[0];
            var6 = this.field4978[0] << 12;
            var7 = var6 * this.field4982 * 963316911 >> 12;
            var8 = var6 * this.field4983 * 1428128045 >> 12;
            var9 = var4 * var6 >> 12;
            var10 = var9 >> 12;
            var11 = 1 + var10;
            if (var11 >= var7) {
               var11 = 0;
            }

            var9 &= 4095;
            var12 = class293.field10447[var9];
            var13 = this.field4979[var10 & 255] & 255;
            var14 = this.field4979[var11 & 255] & 255;
            if (this.field4985) {
               for(var15 = 0; var15 < -1474554145 * class322.field831; ++var15) {
                  var16 = 1428128045 * this.field4983 * class322.field838[var15];
                  var17 = this.method3021(var6 * var16 >> 12, var9, var13, var14, var12, var8, 1556942442);
                  var17 = var17 * var5 >> 12;
                  var2[var15] = (var17 >> 1) + 2048;
               }
            } else {
               for(var15 = 0; var15 < class322.field831 * -1474554145; ++var15) {
                  var16 = this.field4983 * 1428128045 * class322.field838[var15];
                  var17 = this.method3021(var16 * var6 >> 12, var9, var13, var14, var12, var8, 1069393603);
                  var2[var15] = var5 * var17 >> 12;
               }
            }
         } else {
            var5 = this.field4977[0];
            if (var5 > 8 || var5 < -8) {
               var6 = this.field4978[0] << 12;
               var7 = var6 * this.field4982 * 963316911 >> 12;
               var8 = 1428128045 * this.field4983 * var6 >> 12;
               var9 = var6 * var4 >> 12;
               var10 = var9 >> 12;
               var11 = var10 + 1;
               if (var11 >= var7) {
                  var11 = 0;
               }

               var9 &= 4095;
               var12 = class293.field10447[var9];
               var13 = this.field4979[var10 & 255] & 255;
               var14 = this.field4979[var11 & 255] & 255;

               for(var15 = 0; var15 < -1474554145 * class322.field831; ++var15) {
                  var16 = 1428128045 * this.field4983 * class322.field838[var15];
                  var17 = this.method3021(var16 * var6 >> 12, var9, var13, var14, var12, var8, 818948604);
                  var2[var15] = var5 * var17 >> 12;
               }
            }

            for(var6 = 1; var6 < 832987241 * this.field4984; ++var6) {
               var5 = this.field4977[var6];
               if (var5 > 8 || var5 < -8) {
                  var7 = this.field4978[var6] << 12;
                  var8 = var7 * this.field4982 * 963316911 >> 12;
                  var9 = var7 * this.field4983 * 1428128045 >> 12;
                  var10 = var7 * var4 >> 12;
                  var11 = var10 >> 12;
                  var12 = 1 + var11;
                  if (var12 >= var8) {
                     var12 = 0;
                  }

                  var10 &= 4095;
                  var13 = class293.field10447[var10];
                  var14 = this.field4979[var11 & 255] & 255;
                  var15 = this.field4979[var12 & 255] & 255;
                  int var18;
                  if (this.field4985 && var6 == this.field4984 * 832987241 - 1) {
                     for(var16 = 0; var16 < -1474554145 * class322.field831; ++var16) {
                        var17 = class322.field838[var16] * 1428128045 * this.field4983;
                        var18 = this.method3021(var17 * var7 >> 12, var10, var14, var15, var13, var9, 2029664133);
                        var18 = var2[var16] + (var18 * var5 >> 12);
                        var2[var16] = (var18 >> 1) + 2048;
                     }
                  } else {
                     for(var16 = 0; var16 < class322.field831 * -1474554145; ++var16) {
                        var17 = class322.field838[var16] * 1428128045 * this.field4983;
                        var18 = this.method3021(var7 * var17 >> 12, var10, var14, var15, var13, var9, 1960253122);
                        var2[var16] += var5 * var18 >> 12;
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var19) {
         throw class158.method3445(var19, "ahw.ac(" + ')');
      }
   }

   void method3023(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field4985 = var2.method6371() == 1;
         break;
      case 1:
         this.field4984 = var2.method6371() * -1820512295;
         break;
      case 2:
         this.field4981 = var2.method6367(2118380070) * 52875281;
         if (993272049 * this.field4981 < 0) {
            this.field4977 = new short[832987241 * this.field4984];

            for(int var3 = 0; var3 < 832987241 * this.field4984; ++var3) {
               this.field4977[var3] = (short)var2.method6367(1991735410);
            }
         }
         break;
      case 3:
         this.field4983 = (this.field4982 = var2.method6371() * 2124139087) * -1849370933;
         break;
      case 4:
         this.field4980 = var2.method6371() * -1333197873;
         break;
      case 5:
         this.field4983 = var2.method6371() * 1143174821;
         break;
      case 6:
         this.field4982 = var2.method6371() * 2124139087;
      }

   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 1918477853);
         if (this.field270.field6612) {
            this.method3022(var1, var3, -1917282940);
         }

         return var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ahw.i(" + ')');
      }
   }

   void method3024() {
      this.field4979 = class322.method813(this.field4980 * -1656937681, (byte)20);
      this.method3020((short)1115);

      for(int var1 = 832987241 * this.field4984 - 1; var1 >= 1; --var1) {
         short var2 = this.field4977[var1];
         if (var2 > 8 || var2 < -8) {
            break;
         }

         this.field4984 -= -1820512295;
      }

   }

   void method3025() {
      this.field4979 = class322.method813(this.field4980 * -1656937681, (byte)106);
      this.method3020((short)-8674);

      for(int var1 = 832987241 * this.field4984 - 1; var1 >= 1; --var1) {
         short var2 = this.field4977[var1];
         if (var2 > 8 || var2 < -8) {
            break;
         }

         this.field4984 -= -1820512295;
      }

   }

   void method3026() {
      this.field4979 = class322.method813(this.field4980 * -1656937681, (byte)6);
      this.method3020((short)-21404);

      for(int var1 = 832987241 * this.field4984 - 1; var1 >= 1; --var1) {
         short var2 = this.field4977[var1];
         if (var2 > 8 || var2 < -8) {
            break;
         }

         this.field4984 -= -1820512295;
      }

   }

   void method3027(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field4985 = var2.method6371() == 1;
         break;
      case 1:
         this.field4984 = var2.method6371() * -1820512295;
         break;
      case 2:
         this.field4981 = var2.method6367(2106445483) * 52875281;
         if (993272049 * this.field4981 < 0) {
            this.field4977 = new short[832987241 * this.field4984];

            for(int var3 = 0; var3 < 832987241 * this.field4984; ++var3) {
               this.field4977[var3] = (short)var2.method6367(1806711607);
            }
         }
         break;
      case 3:
         this.field4983 = (this.field4982 = var2.method6371() * 2124139087) * -1849370933;
         break;
      case 4:
         this.field4980 = var2.method6371() * -1333197873;
         break;
      case 5:
         this.field4983 = var2.method6371() * 1143174821;
         break;
      case 6:
         this.field4982 = var2.method6371() * 2124139087;
      }

   }

   int[] method3028(int var1) {
      int[] var2 = this.field270.method3546(var1, 1993749029);
      if (this.field270.field6612) {
         this.method3022(var1, var2, -1997133557);
      }

      return var2;
   }

   public class172() {
      super(0, true);
   }

   void method205(int var1) {
      try {
         this.field4979 = class322.method813(this.field4980 * -1656937681, (byte)-21);
         this.method3020((short)-24216);

         for(int var2 = 832987241 * this.field4984 - 1; var2 >= 1; --var2) {
            short var3 = this.field4977[var2];
            if (var3 > 8 || var3 < -8) {
               break;
            }

            this.field4984 -= -1820512295;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ahw.x(" + ')');
      }
   }

   int[] method3029(int var1) {
      int[] var2 = this.field270.method3546(var1, 1441765254);
      if (this.field270.field6612) {
         this.method3022(var1, var2, -2123444089);
      }

      return var2;
   }

   static final void method3030(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         String var4 = (String)var2.field3157[(var2.field3158 -= 969361751) * -203050393];
         if (class960.method2212(var4, var2, -897734805) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field1010 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahw.ng(" + ')');
      }
   }
}
