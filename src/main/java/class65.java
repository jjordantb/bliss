public class class65 extends class347 {
   static int field1669 = 12;
   static int field1670 = 2;
   static int field1671 = 3;
   static int field1672 = 10;
   static int field1673 = 5;
   static int field1674 = 4;
   static int field1675 = 7;
   int field1676 = -1528887782;
   static int field1677 = 9;
   static int field1678 = 8;
   static int field1679 = 11;
   static int field1680 = 6;
   static int field1681 = 6;
   static boolean field1682 = false;
   static int field1683 = 1;

   void method1254(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field1676 = var2.method6371() * -970642513;
         break;
      case 1:
         this.field268 = var2.method6371() == 1;
      }

   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 2069689682);
         if (this.field270.field6612) {
            int[] var4 = this.method201(0, var1, -1887337990);
            int[] var5 = this.method201(1, var1, -1887337990);
            int var6;
            int var7;
            int var8;
            switch(1871252303 * this.field1676) {
            case 1:
               for(var6 = 0; var6 < class322.field831 * -1474554145; ++var6) {
                  var3[var6] = var5[var6] + var4[var6];
               }

               return var3;
            case 2:
               for(var6 = 0; var6 < -1474554145 * class322.field831; ++var6) {
                  var3[var6] = var4[var6] - var5[var6];
               }

               return var3;
            case 3:
               for(var6 = 0; var6 < class322.field831 * -1474554145; ++var6) {
                  var3[var6] = var5[var6] * var4[var6] >> 12;
               }

               return var3;
            case 4:
               for(var6 = 0; var6 < -1474554145 * class322.field831; ++var6) {
                  var7 = var5[var6];
                  var3[var6] = var7 != 0 ? (var4[var6] << 12) / var7 : 4096;
               }

               return var3;
            case 5:
               for(var6 = 0; var6 < -1474554145 * class322.field831; ++var6) {
                  var3[var6] = 4096 - ((4096 - var5[var6]) * (4096 - var4[var6]) >> 12);
               }

               return var3;
            case 6:
               for(var6 = 0; var6 < class322.field831 * -1474554145; ++var6) {
                  var7 = var5[var6];
                  var3[var6] = var7 < 2048 ? var4[var6] * var7 >> 11 : 4096 - ((4096 - var4[var6]) * (4096 - var7) >> 11);
               }

               return var3;
            case 7:
               for(var6 = 0; var6 < class322.field831 * -1474554145; ++var6) {
                  var7 = var4[var6];
                  var3[var6] = var7 == 4096 ? 4096 : (var5[var6] << 12) / (4096 - var7);
               }

               return var3;
            case 8:
               for(var6 = 0; var6 < class322.field831 * -1474554145; ++var6) {
                  var7 = var4[var6];
                  var3[var6] = var7 == 0 ? 0 : 4096 - (4096 - var5[var6] << 12) / var7;
               }

               return var3;
            case 9:
               for(var6 = 0; var6 < -1474554145 * class322.field831; ++var6) {
                  var7 = var4[var6];
                  var8 = var5[var6];
                  var3[var6] = var7 < var8 ? var7 : var8;
               }

               return var3;
            case 10:
               for(var6 = 0; var6 < -1474554145 * class322.field831; ++var6) {
                  var7 = var4[var6];
                  var8 = var5[var6];
                  var3[var6] = var7 > var8 ? var7 : var8;
               }

               return var3;
            case 11:
               for(var6 = 0; var6 < class322.field831 * -1474554145; ++var6) {
                  var7 = var4[var6];
                  var8 = var5[var6];
                  var3[var6] = var7 > var8 ? var7 - var8 : var8 - var7;
               }

               return var3;
            case 12:
               for(var6 = 0; var6 < -1474554145 * class322.field831; ++var6) {
                  var7 = var4[var6];
                  var8 = var5[var6];
                  var3[var6] = var7 + var8 - (var8 * var7 >> 11);
               }
            }
         }

         return var3;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "aho.i(" + ')');
      }
   }

   int[][] method1255(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)31);
      if (this.field266.field211) {
         int[][] var3 = this.method206(0, var1, (byte)8);
         int[][] var4 = this.method206(1, var1, (byte)8);
         int[] var5 = var2[0];
         int[] var6 = var2[1];
         int[] var7 = var2[2];
         int[] var8 = var3[0];
         int[] var9 = var3[1];
         int[] var10 = var3[2];
         int[] var11 = var4[0];
         int[] var12 = var4[1];
         int[] var13 = var4[2];
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         int var20;
         switch(1871252303 * this.field1676) {
         case 1:
            for(var14 = 0; var14 < class322.field831 * -1474554145; ++var14) {
               var5[var14] = var11[var14] + var8[var14];
               var6[var14] = var12[var14] + var9[var14];
               var7[var14] = var13[var14] + var10[var14];
            }

            return var2;
         case 2:
            for(var14 = 0; var14 < class322.field831 * -1474554145; ++var14) {
               var5[var14] = var8[var14] - var11[var14];
               var6[var14] = var9[var14] - var12[var14];
               var7[var14] = var10[var14] - var13[var14];
            }

            return var2;
         case 3:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var5[var14] = var11[var14] * var8[var14] >> 12;
               var6[var14] = var9[var14] * var12[var14] >> 12;
               var7[var14] = var10[var14] * var13[var14] >> 12;
            }

            return var2;
         case 4:
            for(var14 = 0; var14 < class322.field831 * -1474554145; ++var14) {
               var15 = var11[var14];
               var16 = var12[var14];
               var17 = var13[var14];
               var5[var14] = var15 != 0 ? (var8[var14] << 12) / var15 : 4096;
               var6[var14] = var16 != 0 ? (var9[var14] << 12) / var16 : 4096;
               var7[var14] = var17 != 0 ? (var10[var14] << 12) / var17 : 4096;
            }

            return var2;
         case 5:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var5[var14] = 4096 - ((4096 - var11[var14]) * (4096 - var8[var14]) >> 12);
               var6[var14] = 4096 - ((4096 - var12[var14]) * (4096 - var9[var14]) >> 12);
               var7[var14] = 4096 - ((4096 - var10[var14]) * (4096 - var13[var14]) >> 12);
            }

            return var2;
         case 6:
            for(var14 = 0; var14 < class322.field831 * -1474554145; ++var14) {
               var15 = var11[var14];
               var16 = var12[var14];
               var17 = var13[var14];
               var5[var14] = var15 < 2048 ? var8[var14] * var15 >> 11 : 4096 - ((4096 - var8[var14]) * (4096 - var15) >> 11);
               var6[var14] = var16 < 2048 ? var9[var14] * var16 >> 11 : 4096 - ((4096 - var9[var14]) * (4096 - var16) >> 11);
               var7[var14] = var17 < 2048 ? var17 * var10[var14] >> 11 : 4096 - ((4096 - var10[var14]) * (4096 - var17) >> 11);
            }

            return var2;
         case 7:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var15 = var8[var14];
               var16 = var9[var14];
               var17 = var10[var14];
               var5[var14] = var15 == 4096 ? 4096 : (var11[var14] << 12) / (4096 - var15);
               var6[var14] = var16 == 4096 ? 4096 : (var12[var14] << 12) / (4096 - var16);
               var7[var14] = var17 == 4096 ? 4096 : (var13[var14] << 12) / (4096 - var17);
            }

            return var2;
         case 8:
            for(var14 = 0; var14 < class322.field831 * -1474554145; ++var14) {
               var15 = var8[var14];
               var16 = var9[var14];
               var17 = var10[var14];
               var5[var14] = var15 == 0 ? 0 : 4096 - (4096 - var11[var14] << 12) / var15;
               var6[var14] = var16 == 0 ? 0 : 4096 - (4096 - var12[var14] << 12) / var16;
               var7[var14] = var17 == 0 ? 0 : 4096 - (4096 - var13[var14] << 12) / var17;
            }

            return var2;
         case 9:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var15 = var8[var14];
               var16 = var9[var14];
               var17 = var10[var14];
               var18 = var11[var14];
               var19 = var12[var14];
               var20 = var13[var14];
               var5[var14] = var15 < var18 ? var15 : var18;
               var6[var14] = var16 < var19 ? var16 : var19;
               var7[var14] = var17 < var20 ? var17 : var20;
            }

            return var2;
         case 10:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var15 = var8[var14];
               var16 = var9[var14];
               var17 = var10[var14];
               var18 = var11[var14];
               var19 = var12[var14];
               var20 = var13[var14];
               var5[var14] = var15 > var18 ? var15 : var18;
               var6[var14] = var16 > var19 ? var16 : var19;
               var7[var14] = var17 > var20 ? var17 : var20;
            }

            return var2;
         case 11:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var15 = var8[var14];
               var16 = var9[var14];
               var17 = var10[var14];
               var18 = var11[var14];
               var19 = var12[var14];
               var20 = var13[var14];
               var5[var14] = var15 > var18 ? var15 - var18 : var18 - var15;
               var6[var14] = var16 > var19 ? var16 - var19 : var19 - var16;
               var7[var14] = var17 > var20 ? var17 - var20 : var20 - var17;
            }

            return var2;
         case 12:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var15 = var8[var14];
               var16 = var9[var14];
               var17 = var10[var14];
               var18 = var11[var14];
               var19 = var12[var14];
               var20 = var13[var14];
               var5[var14] = var15 + var18 - (var18 * var15 >> 11);
               var6[var14] = var19 + var16 - (var16 * var19 >> 11);
               var7[var14] = var20 + var17 - (var20 * var17 >> 11);
            }
         }
      }

      return var2;
   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field1676 = var2.method6371() * -970642513;
            break;
         case 1:
            this.field268 = var2.method6371() == 1;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aho.r(" + ')');
      }
   }

   int[] method1256(int var1) {
      int[] var2 = this.field270.method3546(var1, 1521688759);
      if (this.field270.field6612) {
         int[] var3 = this.method201(0, var1, -1887337990);
         int[] var4 = this.method201(1, var1, -1887337990);
         int var5;
         int var6;
         int var7;
         switch(1871252303 * this.field1676) {
         case 1:
            for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               var2[var5] = var4[var5] + var3[var5];
            }

            return var2;
         case 2:
            for(var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
               var2[var5] = var3[var5] - var4[var5];
            }

            return var2;
         case 3:
            for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               var2[var5] = var4[var5] * var3[var5] >> 12;
            }

            return var2;
         case 4:
            for(var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
               var6 = var4[var5];
               var2[var5] = var6 != 0 ? (var3[var5] << 12) / var6 : 4096;
            }

            return var2;
         case 5:
            for(var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
               var2[var5] = 4096 - ((4096 - var4[var5]) * (4096 - var3[var5]) >> 12);
            }

            return var2;
         case 6:
            for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               var6 = var4[var5];
               var2[var5] = var6 < 2048 ? var3[var5] * var6 >> 11 : 4096 - ((4096 - var3[var5]) * (4096 - var6) >> 11);
            }

            return var2;
         case 7:
            for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               var6 = var3[var5];
               var2[var5] = var6 == 4096 ? 4096 : (var4[var5] << 12) / (4096 - var6);
            }

            return var2;
         case 8:
            for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               var6 = var3[var5];
               var2[var5] = var6 == 0 ? 0 : 4096 - (4096 - var4[var5] << 12) / var6;
            }

            return var2;
         case 9:
            for(var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
               var6 = var3[var5];
               var7 = var4[var5];
               var2[var5] = var6 < var7 ? var6 : var7;
            }

            return var2;
         case 10:
            for(var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
               var6 = var3[var5];
               var7 = var4[var5];
               var2[var5] = var6 > var7 ? var6 : var7;
            }

            return var2;
         case 11:
            for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               var6 = var3[var5];
               var7 = var4[var5];
               var2[var5] = var6 > var7 ? var6 - var7 : var7 - var6;
            }

            return var2;
         case 12:
            for(var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
               var6 = var3[var5];
               var7 = var4[var5];
               var2[var5] = var6 + var7 - (var7 * var6 >> 11);
            }
         }
      }

      return var2;
   }

   public class65() {
      super(2, false);
   }

   void method1257(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field1676 = var2.method6371() * -970642513;
         break;
      case 1:
         this.field268 = var2.method6371() == 1;
      }

   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = this.field266.method162(var1, (byte)108);
         if (this.field266.field211) {
            int[][] var4 = this.method206(0, var1, (byte)8);
            int[][] var5 = this.method206(1, var1, (byte)8);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            switch(1871252303 * this.field1676) {
            case 1:
               for(var15 = 0; var15 < class322.field831 * -1474554145; ++var15) {
                  var6[var15] = var12[var15] + var9[var15];
                  var7[var15] = var13[var15] + var10[var15];
                  var8[var15] = var14[var15] + var11[var15];
               }

               return var3;
            case 2:
               for(var15 = 0; var15 < class322.field831 * -1474554145; ++var15) {
                  var6[var15] = var9[var15] - var12[var15];
                  var7[var15] = var10[var15] - var13[var15];
                  var8[var15] = var11[var15] - var14[var15];
               }

               return var3;
            case 3:
               for(var15 = 0; var15 < -1474554145 * class322.field831; ++var15) {
                  var6[var15] = var12[var15] * var9[var15] >> 12;
                  var7[var15] = var10[var15] * var13[var15] >> 12;
                  var8[var15] = var11[var15] * var14[var15] >> 12;
               }

               return var3;
            case 4:
               for(var15 = 0; var15 < class322.field831 * -1474554145; ++var15) {
                  var16 = var12[var15];
                  var17 = var13[var15];
                  var18 = var14[var15];
                  var6[var15] = var16 != 0 ? (var9[var15] << 12) / var16 : 4096;
                  var7[var15] = var17 != 0 ? (var10[var15] << 12) / var17 : 4096;
                  var8[var15] = var18 != 0 ? (var11[var15] << 12) / var18 : 4096;
               }

               return var3;
            case 5:
               for(var15 = 0; var15 < -1474554145 * class322.field831; ++var15) {
                  var6[var15] = 4096 - ((4096 - var12[var15]) * (4096 - var9[var15]) >> 12);
                  var7[var15] = 4096 - ((4096 - var13[var15]) * (4096 - var10[var15]) >> 12);
                  var8[var15] = 4096 - ((4096 - var11[var15]) * (4096 - var14[var15]) >> 12);
               }

               return var3;
            case 6:
               for(var15 = 0; var15 < class322.field831 * -1474554145; ++var15) {
                  var16 = var12[var15];
                  var17 = var13[var15];
                  var18 = var14[var15];
                  var6[var15] = var16 < 2048 ? var9[var15] * var16 >> 11 : 4096 - ((4096 - var9[var15]) * (4096 - var16) >> 11);
                  var7[var15] = var17 < 2048 ? var10[var15] * var17 >> 11 : 4096 - ((4096 - var10[var15]) * (4096 - var17) >> 11);
                  var8[var15] = var18 < 2048 ? var18 * var11[var15] >> 11 : 4096 - ((4096 - var11[var15]) * (4096 - var18) >> 11);
               }

               return var3;
            case 7:
               for(var15 = 0; var15 < -1474554145 * class322.field831; ++var15) {
                  var16 = var9[var15];
                  var17 = var10[var15];
                  var18 = var11[var15];
                  var6[var15] = var16 == 4096 ? 4096 : (var12[var15] << 12) / (4096 - var16);
                  var7[var15] = var17 == 4096 ? 4096 : (var13[var15] << 12) / (4096 - var17);
                  var8[var15] = var18 == 4096 ? 4096 : (var14[var15] << 12) / (4096 - var18);
               }

               return var3;
            case 8:
               for(var15 = 0; var15 < class322.field831 * -1474554145; ++var15) {
                  var16 = var9[var15];
                  var17 = var10[var15];
                  var18 = var11[var15];
                  var6[var15] = var16 == 0 ? 0 : 4096 - (4096 - var12[var15] << 12) / var16;
                  var7[var15] = var17 == 0 ? 0 : 4096 - (4096 - var13[var15] << 12) / var17;
                  var8[var15] = var18 == 0 ? 0 : 4096 - (4096 - var14[var15] << 12) / var18;
               }

               return var3;
            case 9:
               for(var15 = 0; var15 < -1474554145 * class322.field831; ++var15) {
                  var16 = var9[var15];
                  var17 = var10[var15];
                  var18 = var11[var15];
                  var19 = var12[var15];
                  var20 = var13[var15];
                  var21 = var14[var15];
                  var6[var15] = var16 < var19 ? var16 : var19;
                  var7[var15] = var17 < var20 ? var17 : var20;
                  var8[var15] = var18 < var21 ? var18 : var21;
               }

               return var3;
            case 10:
               for(var15 = 0; var15 < -1474554145 * class322.field831; ++var15) {
                  var16 = var9[var15];
                  var17 = var10[var15];
                  var18 = var11[var15];
                  var19 = var12[var15];
                  var20 = var13[var15];
                  var21 = var14[var15];
                  var6[var15] = var16 > var19 ? var16 : var19;
                  var7[var15] = var17 > var20 ? var17 : var20;
                  var8[var15] = var18 > var21 ? var18 : var21;
               }

               return var3;
            case 11:
               for(var15 = 0; var15 < -1474554145 * class322.field831; ++var15) {
                  var16 = var9[var15];
                  var17 = var10[var15];
                  var18 = var11[var15];
                  var19 = var12[var15];
                  var20 = var13[var15];
                  var21 = var14[var15];
                  var6[var15] = var16 > var19 ? var16 - var19 : var19 - var16;
                  var7[var15] = var17 > var20 ? var17 - var20 : var20 - var17;
                  var8[var15] = var18 > var21 ? var18 - var21 : var21 - var18;
               }

               return var3;
            case 12:
               for(var15 = 0; var15 < -1474554145 * class322.field831; ++var15) {
                  var16 = var9[var15];
                  var17 = var10[var15];
                  var18 = var11[var15];
                  var19 = var12[var15];
                  var20 = var13[var15];
                  var21 = var14[var15];
                  var6[var15] = var16 + var19 - (var19 * var16 >> 11);
                  var7[var15] = var20 + var17 - (var17 * var20 >> 11);
                  var8[var15] = var21 + var18 - (var21 * var18 >> 11);
               }
            }
         }

         return var3;
      } catch (RuntimeException var22) {
         throw class158.method3445(var22, "aho.k(" + ')');
      }
   }

   int[] method1258(int var1) {
      int[] var2 = this.field270.method3546(var1, 825764346);
      if (this.field270.field6612) {
         int[] var3 = this.method201(0, var1, -1887337990);
         int[] var4 = this.method201(1, var1, -1887337990);
         int var5;
         int var6;
         int var7;
         switch(1871252303 * this.field1676) {
         case 1:
            for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               var2[var5] = var4[var5] + var3[var5];
            }

            return var2;
         case 2:
            for(var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
               var2[var5] = var3[var5] - var4[var5];
            }

            return var2;
         case 3:
            for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               var2[var5] = var4[var5] * var3[var5] >> 12;
            }

            return var2;
         case 4:
            for(var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
               var6 = var4[var5];
               var2[var5] = var6 != 0 ? (var3[var5] << 12) / var6 : 4096;
            }

            return var2;
         case 5:
            for(var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
               var2[var5] = 4096 - ((4096 - var4[var5]) * (4096 - var3[var5]) >> 12);
            }

            return var2;
         case 6:
            for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               var6 = var4[var5];
               var2[var5] = var6 < 2048 ? var3[var5] * var6 >> 11 : 4096 - ((4096 - var3[var5]) * (4096 - var6) >> 11);
            }

            return var2;
         case 7:
            for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               var6 = var3[var5];
               var2[var5] = var6 == 4096 ? 4096 : (var4[var5] << 12) / (4096 - var6);
            }

            return var2;
         case 8:
            for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               var6 = var3[var5];
               var2[var5] = var6 == 0 ? 0 : 4096 - (4096 - var4[var5] << 12) / var6;
            }

            return var2;
         case 9:
            for(var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
               var6 = var3[var5];
               var7 = var4[var5];
               var2[var5] = var6 < var7 ? var6 : var7;
            }

            return var2;
         case 10:
            for(var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
               var6 = var3[var5];
               var7 = var4[var5];
               var2[var5] = var6 > var7 ? var6 : var7;
            }

            return var2;
         case 11:
            for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               var6 = var3[var5];
               var7 = var4[var5];
               var2[var5] = var6 > var7 ? var6 - var7 : var7 - var6;
            }

            return var2;
         case 12:
            for(var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
               var6 = var3[var5];
               var7 = var4[var5];
               var2[var5] = var6 + var7 - (var7 * var6 >> 11);
            }
         }
      }

      return var2;
   }

   int[][] method1259(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)82);
      if (this.field266.field211) {
         int[][] var3 = this.method206(0, var1, (byte)8);
         int[][] var4 = this.method206(1, var1, (byte)8);
         int[] var5 = var2[0];
         int[] var6 = var2[1];
         int[] var7 = var2[2];
         int[] var8 = var3[0];
         int[] var9 = var3[1];
         int[] var10 = var3[2];
         int[] var11 = var4[0];
         int[] var12 = var4[1];
         int[] var13 = var4[2];
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         int var20;
         switch(1871252303 * this.field1676) {
         case 1:
            for(var14 = 0; var14 < class322.field831 * -1474554145; ++var14) {
               var5[var14] = var11[var14] + var8[var14];
               var6[var14] = var12[var14] + var9[var14];
               var7[var14] = var13[var14] + var10[var14];
            }

            return var2;
         case 2:
            for(var14 = 0; var14 < class322.field831 * -1474554145; ++var14) {
               var5[var14] = var8[var14] - var11[var14];
               var6[var14] = var9[var14] - var12[var14];
               var7[var14] = var10[var14] - var13[var14];
            }

            return var2;
         case 3:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var5[var14] = var11[var14] * var8[var14] >> 12;
               var6[var14] = var9[var14] * var12[var14] >> 12;
               var7[var14] = var10[var14] * var13[var14] >> 12;
            }

            return var2;
         case 4:
            for(var14 = 0; var14 < class322.field831 * -1474554145; ++var14) {
               var15 = var11[var14];
               var16 = var12[var14];
               var17 = var13[var14];
               var5[var14] = var15 != 0 ? (var8[var14] << 12) / var15 : 4096;
               var6[var14] = var16 != 0 ? (var9[var14] << 12) / var16 : 4096;
               var7[var14] = var17 != 0 ? (var10[var14] << 12) / var17 : 4096;
            }

            return var2;
         case 5:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var5[var14] = 4096 - ((4096 - var11[var14]) * (4096 - var8[var14]) >> 12);
               var6[var14] = 4096 - ((4096 - var12[var14]) * (4096 - var9[var14]) >> 12);
               var7[var14] = 4096 - ((4096 - var10[var14]) * (4096 - var13[var14]) >> 12);
            }

            return var2;
         case 6:
            for(var14 = 0; var14 < class322.field831 * -1474554145; ++var14) {
               var15 = var11[var14];
               var16 = var12[var14];
               var17 = var13[var14];
               var5[var14] = var15 < 2048 ? var8[var14] * var15 >> 11 : 4096 - ((4096 - var8[var14]) * (4096 - var15) >> 11);
               var6[var14] = var16 < 2048 ? var9[var14] * var16 >> 11 : 4096 - ((4096 - var9[var14]) * (4096 - var16) >> 11);
               var7[var14] = var17 < 2048 ? var17 * var10[var14] >> 11 : 4096 - ((4096 - var10[var14]) * (4096 - var17) >> 11);
            }

            return var2;
         case 7:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var15 = var8[var14];
               var16 = var9[var14];
               var17 = var10[var14];
               var5[var14] = var15 == 4096 ? 4096 : (var11[var14] << 12) / (4096 - var15);
               var6[var14] = var16 == 4096 ? 4096 : (var12[var14] << 12) / (4096 - var16);
               var7[var14] = var17 == 4096 ? 4096 : (var13[var14] << 12) / (4096 - var17);
            }

            return var2;
         case 8:
            for(var14 = 0; var14 < class322.field831 * -1474554145; ++var14) {
               var15 = var8[var14];
               var16 = var9[var14];
               var17 = var10[var14];
               var5[var14] = var15 == 0 ? 0 : 4096 - (4096 - var11[var14] << 12) / var15;
               var6[var14] = var16 == 0 ? 0 : 4096 - (4096 - var12[var14] << 12) / var16;
               var7[var14] = var17 == 0 ? 0 : 4096 - (4096 - var13[var14] << 12) / var17;
            }

            return var2;
         case 9:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var15 = var8[var14];
               var16 = var9[var14];
               var17 = var10[var14];
               var18 = var11[var14];
               var19 = var12[var14];
               var20 = var13[var14];
               var5[var14] = var15 < var18 ? var15 : var18;
               var6[var14] = var16 < var19 ? var16 : var19;
               var7[var14] = var17 < var20 ? var17 : var20;
            }

            return var2;
         case 10:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var15 = var8[var14];
               var16 = var9[var14];
               var17 = var10[var14];
               var18 = var11[var14];
               var19 = var12[var14];
               var20 = var13[var14];
               var5[var14] = var15 > var18 ? var15 : var18;
               var6[var14] = var16 > var19 ? var16 : var19;
               var7[var14] = var17 > var20 ? var17 : var20;
            }

            return var2;
         case 11:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var15 = var8[var14];
               var16 = var9[var14];
               var17 = var10[var14];
               var18 = var11[var14];
               var19 = var12[var14];
               var20 = var13[var14];
               var5[var14] = var15 > var18 ? var15 - var18 : var18 - var15;
               var6[var14] = var16 > var19 ? var16 - var19 : var19 - var16;
               var7[var14] = var17 > var20 ? var17 - var20 : var20 - var17;
            }

            return var2;
         case 12:
            for(var14 = 0; var14 < -1474554145 * class322.field831; ++var14) {
               var15 = var8[var14];
               var16 = var9[var14];
               var17 = var10[var14];
               var18 = var11[var14];
               var19 = var12[var14];
               var20 = var13[var14];
               var5[var14] = var15 + var18 - (var18 * var15 >> 11);
               var6[var14] = var19 + var16 - (var16 * var19 >> 11);
               var7[var14] = var20 + var17 - (var20 * var17 >> 11);
            }
         }
      }

      return var2;
   }

   static final void method1260(class256 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte var10) {
      try {
         if (class215.method3835(var1, (int[])null, -1677271827)) {
            if (var0 != null && !var0.method4487(364199740)) {
               class526.method2226(var0, true, false, -113822480);
            } else {
               class131 var11 = class382.field1410[var1];
               class730.method1760(var11, var11.method887((byte)-55), -1, var2, var3, var4, var5, var6, var7, var8, var9);
            }
         }

      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "aho.lt(" + ')');
      }
   }
}
