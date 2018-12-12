import java.util.Random;

public class class177 extends class347 {
   static int field5186 = 8;
   int[][] field5187;
   static int field5188 = 1024;
   static int field5189 = 204;
   static int field5190 = 1024;
   int field5191;
   static int field5192 = 4;
   static int field5193 = 81;
   int field5194 = 1711388372;
   int field5195;
   int field5196 = 0;
   static int field5197 = 409;
   int field5198 = 590017536;
   int field5199 = -481147336;
   int field5200 = 1124904956;
   int field5201 = -1398133837;
   int field5202 = 393787217;
   int[] field5203;
   int[][] field5204;
   int field5205;
   int field5206 = -694340608;
   static int field5207 = 0;

   void method3095(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field5194 = var2.method6371() * 427847093;
         break;
      case 1:
         this.field5199 = var2.method6371() * 2087340231;
         break;
      case 2:
         this.field5201 = var2.method6374() * 1949794091;
         break;
      case 3:
         this.field5200 = var2.method6374() * -984012539;
         break;
      case 4:
         this.field5206 = var2.method6374() * 414558029;
         break;
      case 5:
         this.field5196 = var2.method6374() * -83830103;
         break;
      case 6:
         this.field5202 = var2.method6374() * 216958721;
         break;
      case 7:
         this.field5198 = var2.method6374() * 1258867389;
      }

   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, -72959134);
         if (this.field270.field6612) {
            int var4 = 0;

            int var5;
            for(var5 = this.field5196 * -887199335 + class322.field836[var1]; var5 < 0; var5 += 4096) {
               ;
            }

            while(var5 > 4096) {
               var5 -= 4096;
            }

            while(var4 < this.field5199 * 1685453047) {
               if (var5 < this.field5203[var4]) {
                  if (var2 == -484575331) {
                     throw new IllegalStateException();
                  }
                  break;
               }

               ++var4;
            }

            int var6 = var4 - 1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field5203[var4];
            int var9 = this.field5203[var4 - 1];
            if (var5 > var9 + this.field5205 * -387493705 && var5 < var8 - -387493705 * this.field5205) {
               for(int var10 = 0; var10 < class322.field831 * -1474554145; ++var10) {
                  int var11 = 0;
                  int var12 = var7 ? this.field5206 * 642247045 : -(642247045 * this.field5206);

                  int var13;
                  for(var13 = class322.field838[var10] + (var12 * this.field5191 * -934471691 >> 12); var13 < 0; var13 += 4096) {
                     ;
                  }

                  while(var13 > 4096) {
                     var13 -= 4096;
                  }

                  while(var11 < this.field5194 * -327362403) {
                     if (var13 < this.field5204[var6][var11]) {
                        if (var2 == -484575331) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     ++var11;
                  }

                  int var14 = var11 - 1;
                  int var15 = this.field5204[var6][var14];
                  int var16 = this.field5204[var6][var11];
                  if (var13 > -387493705 * this.field5205 + var15 && var13 < var16 - -387493705 * this.field5205) {
                     var3[var10] = this.field5187[var6][var14];
                  } else {
                     var3[var10] = 0;
                  }
               }
            } else {
               class901.method6354(var3, 0, class322.field831 * -1474554145, 0);
            }
         }

         return var3;
      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "agu.i(" + ')');
      }
   }

   public class177() {
      super(0, true);
   }

   void method205(int var1) {
      try {
         this.method3097((short)917);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "agu.x(" + ')');
      }
   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field5194 = var2.method6371() * 427847093;
            break;
         case 1:
            this.field5199 = var2.method6371() * 2087340231;
            break;
         case 2:
            this.field5201 = var2.method6374() * 1949794091;
            break;
         case 3:
            this.field5200 = var2.method6374() * -984012539;
            break;
         case 4:
            this.field5206 = var2.method6374() * 414558029;
            break;
         case 5:
            this.field5196 = var2.method6374() * -83830103;
            break;
         case 6:
            this.field5202 = var2.method6374() * 216958721;
            break;
         case 7:
            this.field5198 = var2.method6374() * 1258867389;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "agu.r(" + ')');
      }
   }

   int[] method3096(int var1) {
      int[] var2 = this.field270.method3546(var1, 1139485503);
      if (this.field270.field6612) {
         int var3 = 0;

         int var4;
         for(var4 = this.field5196 * -887199335 + class322.field836[var1]; var4 < 0; var4 += 4096) {
            ;
         }

         while(var4 > 4096) {
            var4 -= 4096;
         }

         while(var3 < this.field5199 * 1685453047 && var4 >= this.field5203[var3]) {
            ++var3;
         }

         int var5 = var3 - 1;
         boolean var6 = (var3 & 1) == 0;
         int var7 = this.field5203[var3];
         int var8 = this.field5203[var3 - 1];
         if (var4 > var8 + this.field5205 * -387493705 && var4 < var7 - -387493705 * this.field5205) {
            for(int var9 = 0; var9 < class322.field831 * -1474554145; ++var9) {
               int var10 = 0;
               int var11 = var6 ? this.field5206 * 642247045 : -(642247045 * this.field5206);

               int var12;
               for(var12 = class322.field838[var9] + (var11 * this.field5191 * -934471691 >> 12); var12 < 0; var12 += 4096) {
                  ;
               }

               while(var12 > 4096) {
                  var12 -= 4096;
               }

               while(var10 < this.field5194 * -327362403 && var12 >= this.field5204[var5][var10]) {
                  ++var10;
               }

               int var13 = var10 - 1;
               int var14 = this.field5204[var5][var13];
               int var15 = this.field5204[var5][var10];
               if (var12 > -387493705 * this.field5205 + var14 && var12 < var15 - -387493705 * this.field5205) {
                  var2[var9] = this.field5187[var5][var13];
               } else {
                  var2[var9] = 0;
               }
            }
         } else {
            class901.method6354(var2, 0, class322.field831 * -1474554145, 0);
         }
      }

      return var2;
   }

   void method3097(short var1) {
      try {
         Random var2 = new Random((long)(1685453047 * this.field5199));
         this.field5205 = 1871219975 * (1732409601 * this.field5202 / 2);
         this.field5191 = 4096 / (-327362403 * this.field5194) * 1303485533;
         this.field5195 = 4096 / (1685453047 * this.field5199) * -1986852725;
         int var3 = -934471691 * this.field5191 / 2;
         int var4 = this.field5195 * 1194794787 / 2;
         this.field5203 = new int[1 + 1685453047 * this.field5199];
         this.field5204 = new int[this.field5199 * 1685453047][1 + this.field5194 * -327362403];
         this.field5187 = new int[1685453047 * this.field5199][this.field5194 * -327362403];
         this.field5203[0] = 0;

         for(int var5 = 0; var5 < 1685453047 * this.field5199; ++var5) {
            int var6;
            int var7;
            if (var5 > 0) {
               var6 = this.field5195 * 1194794787;
               var7 = (class977.method1813(var2, 4096, (byte)-30) - 2048) * this.field5200 * -1888601139 >> 12;
               var6 += var7 * var4 >> 12;
               this.field5203[var5] = var6 + this.field5203[var5 - 1];
            }

            this.field5204[var5][0] = 0;

            for(var6 = 0; var6 < this.field5194 * -327362403; ++var6) {
               if (var6 > 0) {
                  var7 = -934471691 * this.field5191;
                  int var8 = (class977.method1813(var2, 4096, (byte)-82) - 2048) * this.field5201 * -1484830845 >> 12;
                  var7 += var8 * var3 >> 12;
                  this.field5204[var5][var6] = var7 + this.field5204[var5][var6 - 1];
               }

               this.field5187[var5][var6] = this.field5198 * -762707819 > 0 ? 4096 - class977.method1813(var2, this.field5198 * -762707819, (byte)23) : 4096;
            }

            this.field5204[var5][-327362403 * this.field5194] = 4096;
         }

         this.field5203[1685453047 * this.field5199] = 4096;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "agu.ac(" + ')');
      }
   }

   void method3098() {
      this.method3097((short)917);
   }

   void method3099() {
      this.method3097((short)917);
   }

   void method3100() {
      this.method3097((short)917);
   }

   void method3101(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field5194 = var2.method6371() * 427847093;
         break;
      case 1:
         this.field5199 = var2.method6371() * 2087340231;
         break;
      case 2:
         this.field5201 = var2.method6374() * 1949794091;
         break;
      case 3:
         this.field5200 = var2.method6374() * -984012539;
         break;
      case 4:
         this.field5206 = var2.method6374() * 414558029;
         break;
      case 5:
         this.field5196 = var2.method6374() * -83830103;
         break;
      case 6:
         this.field5202 = var2.method6374() * 216958721;
         break;
      case 7:
         this.field5198 = var2.method6374() * 1258867389;
      }

   }

   int[] method3102(int var1) {
      int[] var2 = this.field270.method3546(var1, 1509909054);
      if (this.field270.field6612) {
         int var3 = 0;

         int var4;
         for(var4 = this.field5196 * -887199335 + class322.field836[var1]; var4 < 0; var4 += 4096) {
            ;
         }

         while(var4 > 4096) {
            var4 -= 4096;
         }

         while(var3 < this.field5199 * 1685453047 && var4 >= this.field5203[var3]) {
            ++var3;
         }

         int var5 = var3 - 1;
         boolean var6 = (var3 & 1) == 0;
         int var7 = this.field5203[var3];
         int var8 = this.field5203[var3 - 1];
         if (var4 > var8 + this.field5205 * -387493705 && var4 < var7 - -387493705 * this.field5205) {
            for(int var9 = 0; var9 < class322.field831 * -1474554145; ++var9) {
               int var10 = 0;
               int var11 = var6 ? this.field5206 * 642247045 : -(642247045 * this.field5206);

               int var12;
               for(var12 = class322.field838[var9] + (var11 * this.field5191 * -934471691 >> 12); var12 < 0; var12 += 4096) {
                  ;
               }

               while(var12 > 4096) {
                  var12 -= 4096;
               }

               while(var10 < this.field5194 * -327362403 && var12 >= this.field5204[var5][var10]) {
                  ++var10;
               }

               int var13 = var10 - 1;
               int var14 = this.field5204[var5][var13];
               int var15 = this.field5204[var5][var10];
               if (var12 > -387493705 * this.field5205 + var14 && var12 < var15 - -387493705 * this.field5205) {
                  var2[var9] = this.field5187[var5][var13];
               } else {
                  var2[var9] = 0;
               }
            }
         } else {
            class901.method6354(var2, 0, class322.field831 * -1474554145, 0);
         }
      }

      return var2;
   }
}
