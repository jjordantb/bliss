import java.nio.ByteBuffer;

public class class651 extends class568 {
   class639 field9502;
   class894 field9503;
   float[][] field9504;
   int field9505;
   class539 field9506;
   int field9507;
   int field9508;
   int field9509;
   int field9510;
   class920 field9511;
   class525 field9512;
   int field9513;
   float[][] field9514;
   float[][] field9515;
   class325 field9516;

   void method5640(int var1, int var2, int var3, int var4, int var5, int var6, ByteBuffer var7, ByteBuffer var8) {
      long var9 = -1L;
      int var11 = var5 + (var3 << this.field9503.field7228 * -2137349879);
      int var12 = var6 + (var4 << this.field9503.field7228 * -2137349879);
      int var13 = this.field9503.method3887(var11, var12, -1829757752);
      if ((var5 & 127) == 0 || (var6 & 127) == 0) {
         var9 = ((long)var12 & 65535L) << 16 | (long)var11 & 65535L;
         class568 var14 = this.field9506.method2331(var9);
         if (var14 != null) {
            var7.putShort(((class129)var14).field1084);
            return;
         }
      }

      short var31 = (short)(this.field9509++);
      if (var9 != -1L) {
         this.field9506.method2337(new class129(var31), var9);
      }

      float var15;
      float var16;
      float var17;
      float var18;
      float var19;
      float var20;
      float var21;
      float var22;
      float var23;
      float var24;
      float var25;
      if (var5 == 0 && var6 == 0) {
         var15 = this.field9504[var1][var2];
         var16 = this.field9514[var1][var2];
         var17 = this.field9515[var1][var2];
      } else if (var5 == this.field9503.field7227 * -1212653763 && var6 == 0) {
         var15 = this.field9504[var1 + 1][var2];
         var16 = this.field9514[var1 + 1][var2];
         var17 = this.field9515[var1 + 1][var2];
      } else if (var5 == this.field9503.field7227 * -1212653763 && var6 == this.field9503.field7227 * -1212653763) {
         var15 = this.field9504[var1 + 1][var2 + 1];
         var16 = this.field9514[var1 + 1][var2 + 1];
         var17 = this.field9515[var1 + 1][var2 + 1];
      } else if (var5 == 0 && var6 == this.field9503.field7227 * -1212653763) {
         var15 = this.field9504[var1][var2 + 1];
         var16 = this.field9514[var1][var2 + 1];
         var17 = this.field9515[var1][var2 + 1];
      } else {
         var18 = (float)var5 / (float)(this.field9503.field7227 * -1212653763);
         var19 = (float)var6 / (float)(this.field9503.field7227 * -1212653763);
         var20 = this.field9504[var1][var2];
         var21 = this.field9514[var1][var2];
         var22 = this.field9515[var1][var2];
         var23 = this.field9504[var1 + 1][var2];
         var24 = this.field9514[var1 + 1][var2];
         var25 = this.field9515[var1 + 1][var2];
         var20 += (this.field9504[var1][var2 + 1] - var20) * var18;
         var21 += (this.field9514[var1][var2 + 1] - var21) * var18;
         var22 += (this.field9515[var1][var2 + 1] - var22) * var18;
         var23 += (this.field9504[var1 + 1][var2 + 1] - var23) * var18;
         var24 += (this.field9514[var1 + 1][var2 + 1] - var24) * var18;
         var25 += (this.field9515[var1 + 1][var2 + 1] - var25) * var18;
         var15 = var20 + (var23 - var20) * var19;
         var16 = var21 + (var24 - var21) * var19;
         var17 = var22 + (var25 - var22) * var19;
      }

      var18 = (float)(this.field9502.method5902(823958259) - var11);
      var19 = (float)(this.field9502.method5901(1790623605) - var13);
      var20 = (float)(this.field9502.method5904((byte)62) - var12);
      var21 = (float)Math.sqrt((double)(var18 * var18 + var19 * var19 + var20 * var20));
      var22 = 1.0F / var21;
      var18 *= var22;
      var19 *= var22;
      var20 *= var22;
      var23 = var21 / (float)this.field9502.method5907(-1347339001);
      var24 = 1.0F - var23 * var23;
      if (var24 < 0.0F) {
         var24 = 0.0F;
      }

      var25 = var18 * var15 + var19 * var16 + var20 * var17;
      if (var25 < 0.0F) {
         var25 = 0.0F;
      }

      float var26 = var25 * var24 * 2.0F;
      if (var26 > 1.0F) {
         var26 = 1.0F;
      }

      int var27 = this.field9502.method5905(-1418172708);
      int var28 = (int)(var26 * (float)(var27 >> 16 & 255));
      if (var28 > 255) {
         var28 = 255;
      }

      int var29 = (int)(var26 * (float)(var27 >> 8 & 255));
      if (var29 > 255) {
         var29 = 255;
      }

      int var30 = (int)(var26 * (float)(var27 & 255));
      if (var30 > 255) {
         var30 = 255;
      }

      var8.putFloat((float)var11);
      var8.putFloat((float)var13);
      var8.putFloat((float)var12);
      if (this.field9516.field790 == 0) {
         var8.put((byte)var30);
         var8.put((byte)var29);
         var8.put((byte)var28);
      } else {
         var8.put((byte)var28);
         var8.put((byte)var29);
         var8.put((byte)var30);
      }

      var8.put((byte)-1);
      var7.putShort(var31);
   }

   class651(class325 var1, class894 var2, class639 var3, int[] var4) {
      this.field9516 = var1;
      this.field9502 = var3;
      this.field9503 = var2;
      int var5 = this.field9502.method5907(-447705698) - (var2.field7227 * -1212653763 >> 1);
      this.field9510 = this.field9502.method5902(823958259) - var5 >> var2.field7228 * -2137349879;
      this.field9507 = this.field9502.method5902(823958259) + var5 >> var2.field7228 * -2137349879;
      this.field9513 = this.field9502.method5904((byte)100) - var5 >> var2.field7228 * -2137349879;
      this.field9508 = this.field9502.method5904((byte)65) + var5 >> var2.field7228 * -2137349879;
      int var6 = this.field9507 - this.field9510 + 1;
      int var7 = this.field9508 - this.field9513 + 1;
      this.field9504 = new float[var6 + 1][var7 + 1];
      this.field9514 = new float[var6 + 1][var7 + 1];
      this.field9515 = new float[var6 + 1][var7 + 1];

      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var8 = 0; var8 <= var7; ++var8) {
         var9 = var8 + this.field9513;
         if (var9 > 0 && var9 < this.field9503.field7225 * -1148794921 - 1) {
            for(var10 = 0; var10 <= var6; ++var10) {
               var11 = var10 + this.field9510;
               if (var11 > 0 && var11 < this.field9503.field7226 * -506105871 - 1) {
                  var12 = var2.method3888(var11 + 1, var9, (byte)-128) - var2.method3888(var11 - 1, var9, (byte)-55);
                  var13 = var2.method3888(var11, var9 + 1, (byte)-98) - var2.method3888(var11, var9 - 1, (byte)-82);
                  float var14 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + 65536 + var13 * var13)));
                  this.field9504[var10][var8] = (float)var12 * var14;
                  this.field9514[var10][var8] = -256.0F * var14;
                  this.field9515[var10][var8] = (float)var13 * var14;
               }
            }
         }
      }

      var8 = 0;

      for(var9 = this.field9513; var9 <= this.field9508; ++var9) {
         if (var9 >= 0 && var9 < var2.field7225 * -1148794921) {
            for(var10 = this.field9510; var10 <= this.field9507; ++var10) {
               if (var10 >= 0 && var10 < var2.field7226 * -506105871) {
                  var11 = var4[var8];
                  int[] var22 = var2.field9501[var10][var9];
                  if (var22 != null && var11 != 0) {
                     if (var11 == 1) {
                        var13 = 0;

                        while(var13 < var22.length) {
                           if (var22[var13++] != -1 && var22[var13++] != -1 && var22[var13++] != -1) {
                              this.field9505 += 3;
                           }
                        }
                     } else {
                        this.field9505 += 3;
                     }
                  }
               }

               ++var8;
            }
         } else {
            var8 += this.field9507 - this.field9510;
         }
      }

      if (this.field9505 > 0) {
         this.field9506 = new class539(class18.method3687(this.field9505, (byte)16));
         ByteBuffer var20 = this.field9516.field660;
         var20.clear();
         var20.position(2097152);
         ByteBuffer var21 = var20.slice();
         var20.position(0);
         var20.limit(2097152);
         var11 = 0;
         var8 = 0;

         for(var12 = this.field9513; var12 <= this.field9508; ++var12) {
            if (var12 >= 0 && var12 < var2.field7225 * -1148794921) {
               var13 = 0;

               for(int var23 = this.field9510; var23 <= this.field9507; ++var23) {
                  if (var23 >= 0 && var23 < var2.field7226 * -506105871) {
                     int var15 = var4[var8];
                     int[] var16 = var2.field9501[var23][var12];
                     if (var16 != null && var15 != 0) {
                        if (var15 != 1) {
                           if (var15 == 3) {
                              this.method5640(var13, var11, var23, var12, 0, 0, var21, var20);
                              this.method5640(var13, var11, var23, var12, var2.field7227 * -1212653763, 0, var21, var20);
                              this.method5640(var13, var11, var23, var12, 0, var2.field7227 * -1212653763, var21, var20);
                           } else if (var15 == 2) {
                              this.method5640(var13, var11, var23, var12, var2.field7227 * -1212653763, 0, var21, var20);
                              this.method5640(var13, var11, var23, var12, var2.field7227 * -1212653763, var2.field7227 * -1212653763, var21, var20);
                              this.method5640(var13, var11, var23, var12, 0, 0, var21, var20);
                           } else if (var15 == 5) {
                              this.method5640(var13, var11, var23, var12, var2.field7227 * -1212653763, var2.field7227 * -1212653763, var21, var20);
                              this.method5640(var13, var11, var23, var12, 0, var2.field7227 * -1212653763, var21, var20);
                              this.method5640(var13, var11, var23, var12, var2.field7227 * -1212653763, 0, var21, var20);
                           } else if (var15 == 4) {
                              this.method5640(var13, var11, var23, var12, 0, var2.field7227 * -1212653763, var21, var20);
                              this.method5640(var13, var11, var23, var12, 0, 0, var21, var20);
                              this.method5640(var13, var11, var23, var12, var2.field7227 * -1212653763, var2.field7227 * -1212653763, var21, var20);
                           }
                        } else {
                           int[] var17 = var2.field9480[var23][var12];
                           int[] var18 = var2.field9476[var23][var12];
                           int var19 = 0;

                           label108:
                           while(true) {
                              while(true) {
                                 if (var19 >= var16.length) {
                                    break label108;
                                 }

                                 if (var16[var19] != -1 && var16[var19 + 1] != -1 && var16[var19 + 2] != -1) {
                                    this.method5640(var13, var11, var23, var12, var17[var19], var18[var19], var21, var20);
                                    ++var19;
                                    this.method5640(var13, var11, var23, var12, var17[var19], var18[var19], var21, var20);
                                    ++var19;
                                    this.method5640(var13, var11, var23, var12, var17[var19], var18[var19], var21, var20);
                                    ++var19;
                                 } else {
                                    var19 += 3;
                                 }
                              }
                           }
                        }
                     }
                  }

                  ++var8;
                  ++var13;
               }
            } else {
               var8 += this.field9507 - this.field9510;
            }

            ++var11;
         }

         this.field9511 = this.field9516.method640(false);
         this.field9511.method6489(this.field9505);
         this.field9512 = this.field9516.method641(false);
         this.field9512.method2237(this.field9509 * 16, 16);
         this.field9512.method1977(0, var20.position(), this.field9516.field661);
         this.field9511.method1977(0, var21.position(), this.field9516.field661 + 2097152L);
      } else {
         this.field9512 = null;
         this.field9511 = null;
      }

      this.field9506 = null;
      this.field9515 = null;
      this.field9514 = null;
      this.field9504 = null;
   }
}
