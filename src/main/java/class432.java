import java.nio.ByteBuffer;

public class class432 {
   int field7473;
   class894 field7474;
   int field7475;
   int field7476;
   int field7477;
   class325 field7478;
   byte[] field7479;
   int field7480;
   class790[][] field7481;

   void method4239() {
      this.field7481 = new class790[this.field7477][this.field7476];

      for(int var1 = 0; var1 < this.field7476; ++var1) {
         for(int var2 = 0; var2 < this.field7477; ++var2) {
            this.field7481[var2][var1] = new class790(this.field7478, this, this.field7474, var2, var1, this.field7480, var2 * 128 + 1, var1 * 128 + 1);
            if (this.field7481[var2][var1].field456 == 0) {
               this.field7481[var2][var1] = null;
            }
         }
      }

   }

   void method4240(class605 var1, int var2, int var3, int var4, boolean[][] var5, boolean var6) {
      float var7 = 1.0F / (float)(this.field7478.field741 * 128);
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      if (var6) {
         for(int var8 = 0; var8 < this.field7476; ++var8) {
            int var9 = var8 << this.field7480;
            var10 = var8 + 1 << this.field7480;

            label143:
            for(var11 = 0; var11 < this.field7477; ++var11) {
               if (this.field7481[var11][var8] != null) {
                  var12 = var11 << this.field7480;
                  var13 = var11 + 1 << this.field7480;

                  for(var14 = var12; var14 < var13; ++var14) {
                     if (var14 - var2 >= -var4 && var14 - var2 <= var4) {
                        for(var15 = var9; var15 < var10; ++var15) {
                           if (var15 - var3 >= -var4 && var15 - var3 <= var4 && var5[var14 - var2 + var4][var15 - var3 + var4]) {
                              var1.field8691.method274(var7, var7, 1.0F, 1.0F);
                              var1.field8691.field325[12] = (float)(-var11);
                              var1.field8691.field325[13] = (float)(-var8);
                              this.field7481[var11][var8].method399(var1);
                              continue label143;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         int[] var24 = new int[this.field7476 * this.field7477];
         ByteBuffer var25 = this.field7478.field660;
         var25.clear();
         var10 = 0;

         for(var11 = 0; var11 < this.field7476; ++var11) {
            var12 = var11 << this.field7480;
            var13 = var11 + 1 << this.field7480;

            for(var14 = 0; var14 < this.field7477; ++var14) {
               class790 var27 = this.field7481[var14][var11];
               int var16 = 0;
               if (var27 != null) {
                  int var17 = var14 << this.field7480;
                  int var18 = var14 + 1 << this.field7480;

                  for(int var19 = var12; var19 < var13; ++var19) {
                     if (var19 - var3 >= -var4 && var19 - var3 <= var4) {
                        int var20 = var19 * this.field7474.field7226 * -506105871 + var17;

                        for(int var21 = var17; var21 < var18; ++var21) {
                           if (var21 - var2 >= -var4 && var21 - var2 <= var4 && var5[var21 - var2 + var4][var19 - var3 + var4]) {
                              short[] var22 = this.field7474.field9474[var20];
                              if (var22 != null) {
                                 for(int var23 = 0; var23 < var22.length; ++var23) {
                                    var25.putShort(var22[var23]);
                                    ++var16;
                                 }
                              }
                           }

                           ++var20;
                        }
                     }
                  }
               }

               var24[var10] = var16;
               ++var10;
            }
         }

         if (var25.position() != 0) {
            var11 = var25.position();
            class920 var26 = this.field7478.method571(var11 / 2);
            var26.method1977(0, var11, this.field7478.field661);
            var13 = 0;
            var10 = 0;

            for(var14 = 0; var14 < this.field7476; ++var14) {
               for(var15 = 0; var15 < this.field7477; ++var15) {
                  if (var24[var10] != 0) {
                     var1.field8691.method274(var7, var7, 1.0F, 1.0F);
                     var1.field8691.field325[12] = (float)(-var15);
                     var1.field8691.field325[13] = (float)(-var14);
                     this.field7481[var15][var14].method400(var1, var26, var13, var24[var10] / 3);
                     var13 += var24[var10];
                  }

                  ++var10;
               }
            }
         }
      }

   }

   void method4241(class770 var1, int var2, int var3) {
      class306 var4 = (class306)var1;
      var2 += var4.field390 + 1;
      var3 += var4.field394 + 1;
      int var5 = var2 + var3 * this.field7475;
      int var6 = 0;
      int var7 = var4.field393;
      int var8 = var4.field391;
      int var9 = this.field7475 - var8;
      int var10 = 0;
      int var11;
      if (var3 <= 0) {
         var11 = 1 - var3;
         var7 -= var11;
         var6 += var11 * var8;
         var5 += var11 * this.field7475;
         var3 = 1;
      }

      if (var3 + var7 >= this.field7473) {
         var11 = var3 + var7 + 1 - this.field7473;
         var7 -= var11;
      }

      if (var2 <= 0) {
         var11 = 1 - var2;
         var8 -= var11;
         var6 += var11;
         var5 += var11;
         var10 += var11;
         var9 += var11;
         var2 = 1;
      }

      if (var2 + var8 >= this.field7475) {
         var11 = var2 + var8 + 1 - this.field7475;
         var8 -= var11;
         var10 += var11;
         var9 += var11;
      }

      if (var8 > 0 && var7 > 0) {
         method4243(this.field7479, var4.field392, var6, var5, var8, var7, var9, var10);
         this.method4242(var2, var3, var8, var7);
      }

   }

   void method4242(int var1, int var2, int var3, int var4) {
      if (this.field7481 != null) {
         int var5 = var1 - 1 >> 7;
         int var6 = var1 - 1 + var3 - 1 >> 7;
         int var7 = var2 - 1 >> 7;
         int var8 = var2 - 1 + var4 - 1 >> 7;

         for(int var9 = var5; var9 <= var6; ++var9) {
            class790[] var10 = this.field7481[var9];

            for(int var11 = var7; var11 <= var8; ++var11) {
               if (var10[var11] != null) {
                  var10[var11].field454 = true;
               }
            }
         }
      }

   }

   static final void method4243(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10001;
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
         }

         for(var10 = var4; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }

   }

   static final boolean method4244(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 % var5;
      int var7;
      if (var6 != 0) {
         var7 = var5 - var6;
      } else {
         var7 = 0;
      }

      int var8 = -((var3 + var5 - 1) / var5);
      int var9 = -((var2 + var5 - 1) / var5);

      for(int var10 = var8; var10 < 0; ++var10) {
         for(int var11 = var9; var11 < 0; ++var11) {
            if (var0[var1] == 0) {
               return true;
            }

            var1 += var5;
         }

         var1 -= var7;
         if (var0[var1 - 1] == 0) {
            return true;
         }

         var1 += var4;
      }

      return false;
   }

   void method4245(class770 var1, int var2, int var3) {
      class306 var4 = (class306)var1;
      var2 += var4.field390 + 1;
      var3 += var4.field394 + 1;
      int var5 = var2 + var3 * this.field7475;
      int var6 = 0;
      int var7 = var4.field393;
      int var8 = var4.field391;
      int var9 = this.field7475 - var8;
      int var10 = 0;
      int var11;
      if (var3 <= 0) {
         var11 = 1 - var3;
         var7 -= var11;
         var6 += var11 * var8;
         var5 += var11 * this.field7475;
         var3 = 1;
      }

      if (var3 + var7 >= this.field7473) {
         var11 = var3 + var7 + 1 - this.field7473;
         var7 -= var11;
      }

      if (var2 <= 0) {
         var11 = 1 - var2;
         var8 -= var11;
         var6 += var11;
         var5 += var11;
         var10 += var11;
         var9 += var11;
         var2 = 1;
      }

      if (var2 + var8 >= this.field7475) {
         var11 = var2 + var8 + 1 - this.field7475;
         var8 -= var11;
         var10 += var11;
         var9 += var11;
      }

      if (var8 > 0 && var7 > 0) {
         method4246(this.field7479, var4.field392, var6, var5, var8, var7, var9, var10);
         this.method4242(var2, var3, var8, var7);
      }

   }

   static final void method4246(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10001;
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
         }

         for(var10 = var4; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] += var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }

   }

   class432(class325 var1, class894 var2) {
      this.field7478 = var1;
      this.field7474 = var2;
      this.field7475 = 2 + (this.field7474.field7226 * -506105871 * this.field7474.field7227 * -1212653763 >> this.field7478.field757);
      this.field7473 = 2 + (this.field7474.field7225 * -1148794921 * this.field7474.field7227 * -1212653763 >> this.field7478.field757);
      this.field7479 = new byte[this.field7475 * this.field7473];
      this.field7480 = 7 + this.field7478.field757 - this.field7474.field7228 * -2137349879;
      this.field7477 = this.field7474.field7226 * -506105871 >> this.field7480;
      this.field7476 = this.field7474.field7225 * -1148794921 >> this.field7480;
   }

   boolean method4247(class770 var1, int var2, int var3) {
      class306 var4 = (class306)var1;
      var2 += var4.field390 + 1;
      var3 += var4.field394 + 1;
      int var5 = var2 + var3 * this.field7475;
      int var6 = var4.field393;
      int var7 = var4.field391;
      int var8 = this.field7475 - var7;
      int var9;
      if (var3 <= 0) {
         var9 = 1 - var3;
         var6 -= var9;
         var5 += var9 * this.field7475;
         var3 = 1;
      }

      if (var3 + var6 >= this.field7473) {
         var9 = var3 + var6 + 1 - this.field7473;
         var6 -= var9;
      }

      if (var2 <= 0) {
         var9 = 1 - var2;
         var7 -= var9;
         var5 += var9;
         var8 += var9;
         var2 = 1;
      }

      if (var2 + var7 >= this.field7475) {
         var9 = var2 + var7 + 1 - this.field7475;
         var7 -= var9;
         var8 += var9;
      }

      if (var7 > 0 && var6 > 0) {
         byte var10 = 8;
         var8 += (var10 - 1) * this.field7475;
         return method4244(this.field7479, var5, var7, var6, var8, var10);
      } else {
         return false;
      }
   }
}
