import jaclib.memory.Stream;
import jaclib.memory.heap.I;
import java.nio.ByteBuffer;

public class class894 extends class454 {
   float field9465 = -3.4028235E38F;
   static int field9466 = 74;
   class525 field9467;
   int field9468;
   int field9469;
   class432 field9470;
   static int field9471;
   int field9472;
   int field9473;
   short[][] field9474;
   float field9475 = Float.MAX_VALUE;
   int[][][] field9476;
   class642[][][] field9477;
   int[][][] field9478;
   int[][][] field9479;
   int[][][] field9480;
   int field9481;
   static int field9482 = 1;
   int[][][] field9483;
   float[][] field9484;
   class325 field9485;
   class599 field9486 = new class599();
   byte[][] field9487;
   class525 field9488;
   static int[] field9489 = new int[1];
   class92 field9490;
   int field9491;
   int field9492;
   byte[][] field9493;
   float[][] field9494;
   float[][] field9495;
   class568[] field9496;
   class539 field9497;
   static int[] field9498 = new int[1];
   static int[] field9499 = new int[1];
   int field9500;
   int[][][] field9501;

   public void method3882(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12) {
      class478 var13 = this.field9485.field8581;
      if (var6 != null && this.field9483 == null) {
         this.field9483 = new int[super.field7226][super.field7225][];
      }

      if (var4 != null && this.field9478 == null) {
         this.field9478 = new int[super.field7226][super.field7225][];
      }

      this.field9480[var1][var2] = var3;
      this.field9476[var1][var2] = var5;
      this.field9501[var1][var2] = var7;
      this.field9479[var1][var2] = var8;
      if (this.field9483 != null) {
         this.field9483[var1][var2] = var6;
      }

      if (this.field9478 != null) {
         this.field9478[var1][var2] = var4;
      }

      class642[] var14 = this.field9477[var1][var2] = new class642[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if ((this.field9500 & 32) != 0 && var16 != -1 && var13.method4625(var16, 1147162095).field9378) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)var11.field10427 << 48 | (long)var11.field10425 << 42 | (long)var11.field10426 << 28 | (long)(var17 << 14) | (long)var16;

         class568 var20;
         for(var20 = this.field9497.method2331(var18); var20 != null; var20 = this.field9497.method2332(-1979022775)) {
            class642 var21 = (class642)var20;
            if (var21.field10074 == var16 && var21.field10084 == (float)var17 && var21.field10076.method6484(var11, (byte)61)) {
               break;
            }
         }

         if (var20 == null) {
            var14[var15] = new class642(this, var16, var17, var11);
            this.field9497.method2337(var14[var15], var18);
         } else {
            var14[var15] = (class642)var20;
         }
      }

      if (var12) {
         this.field9487[var1][var2] = (byte)(this.field9487[var1][var2] | 1);
      }

      if (var7.length > this.field9492) {
         this.field9492 = var7.length;
      }

      this.field9491 += var7.length;
   }

   class894(class325 var1, int var2, int var3, int var4, int var5, int[][] var6, int[][] var7, int var8) {
      super(var4, var5, var8, var6);
      this.field9485 = var1;
      this.field9468 = super.field7228 - 2;
      this.field9469 = 1 << this.field9468;
      this.field9481 = var2;
      this.field9500 = var3;
      this.field9478 = new int[var4][var5][];
      this.field9477 = new class642[var4][var5][];
      this.field9480 = new int[var4][var5][];
      this.field9476 = new int[var4][var5][];
      this.field9501 = new int[var4][var5][];
      this.field9479 = new int[var4][var5][];
      this.field9474 = new short[var4 * var5][];
      this.field9487 = new byte[var4][var5];
      this.field9493 = new byte[var4 + 1][var5 + 1];
      this.field9494 = new float[super.field7226 + 1][super.field7225 + 1];
      this.field9495 = new float[super.field7226 + 1][super.field7225 + 1];
      this.field9484 = new float[super.field7226 + 1][super.field7225 + 1];

      for(int var9 = 0; var9 <= super.field7225; ++var9) {
         for(int var10 = 0; var10 <= super.field7226; ++var10) {
            int var11 = super.field7229[var10][var9];
            if ((float)var11 < this.field9475) {
               this.field9475 = (float)var11;
            }

            if ((float)var11 > this.field9465) {
               this.field9465 = (float)var11;
            }

            if (var10 > 0 && var9 > 0 && var10 < super.field7226 && var9 < super.field7225) {
               int var12 = var7[var10 + 1][var9] - var7[var10 - 1][var9];
               int var13 = var7[var10][var9 + 1] - var7[var10][var9 - 1];
               float var14 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + 4 * var8 * var8 + var13 * var13)));
               this.field9494[var10][var9] = (float)var12 * var14;
               this.field9495[var10][var9] = (float)(-var8 * 2) * var14;
               this.field9484[var10][var9] = (float)var13 * var14;
            }
         }
      }

      --this.field9475;
      ++this.field9465;
      this.field9497 = new class539(128);
      if ((this.field9500 & 16) != 0) {
         this.field9470 = new class432(this.field9485, this);
      }

   }

   public void method3886(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      if (this.field9491 > 0) {
         class920 var9 = this.field9485.method571(this.field9473);
         int var10 = 0;
         int var11 = 32767;
         int var12 = -32768;
         ByteBuffer var13 = this.field9485.field660;
         var13.clear();

         for(int var14 = var5; var14 < var7; ++var14) {
            int var15 = var14 * super.field7226 + var4;

            for(int var16 = var4; var16 < var6; ++var16) {
               if (var8[var16 - var4][var14 - var5]) {
                  short[] var17 = this.field9474[var15];
                  if (var17 != null) {
                     for(int var18 = 0; var18 < var17.length; ++var18) {
                        int var19 = var17[var18] & '\uffff';
                        if (var19 > var12) {
                           var12 = var19;
                        }

                        if (var19 < var11) {
                           var11 = var19;
                        }

                        var13.putShort((short)var19);
                        ++var10;
                     }
                  }
               }

               ++var15;
            }
         }

         var9.method1977(0, var13.position(), this.field9485.field661);
         if (var10 > 0) {
            this.field9485.method652();
            class605 var20 = this.field9485.field760;
            this.field9485.method642(0, this.field9488);
            this.field9485.method642(1, this.field9467);
            this.field9485.method714(this.field9490);
            this.field9485.method643(var9);
            this.field9485.method4867(class135.field1194);
            float var21 = (float)this.field9485.method4800((short)2045).method2481();
            float var22 = (float)this.field9485.method4800((short)-2467).method2493();
            class135 var23 = new class135();
            class135 var24 = new class135();
            var23.method1011(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
            var24.method1019((float)var3 / (256.0F * (float)super.field7227), (float)(-var3) / (256.0F * (float)super.field7227), 1.0F / (this.field9465 - this.field9475));
            var24.method1018((float)var1 - (float)(var4 * var3) / 256.0F, (float)var2 + (float)(var7 * var3) / 256.0F, -this.field9475 / (this.field9465 - this.field9475));
            var24.method1015(2.0F / var21, 2.0F / var22, 1.0F);
            var24.method1018(-1.0F, -1.0F, 0.0F);
            this.field9485.field679.method1022(var23, var24);
            this.field9485.field680.method272(this.field9485.field679);
            this.field9485.method5054(this.field9485.field680);
            var20.method5105(class344.field326);
            var20.field8697.method4570(0.0F, 0.0F, 0.0F, 0.0F);
            var20.field8694.method3292(0.0F, 0.0F, 0.0F);
            var20.field8695.method4570(0.0F, 0.0F, 0.0F, 0.0F);
            var20.field8696.method3292(0.0F, 0.0F, 0.0F);
            var20.field8689 = this.field9485.field754;
            var20.field8691.method299();
            var20.field8704 = var11;
            var20.field8705 = var12 - var11 + 1;
            var20.field8706 = 0;
            var20.field8686 = var10 / 3;
            var20.method5113(false);
         }
      }

   }

   public void method3883(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = new int[var16 * 3];
      int[] var21 = new int[var16 * 3];
      int[] var22 = new int[var16 * 3];
      int[] var23 = var4 != null ? new int[var16 * 3] : null;
      int[] var24 = var6 != null ? new int[var16 * 3] : null;
      int var25 = 0;

      for(int var26 = 0; var26 < var16; ++var26) {
         int var27 = var7[var26];
         int var28 = var8[var26];
         int var29 = var9[var26];
         var17[var25] = var3[var27];
         var18[var25] = var5[var27];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null ? var11[var26] : var10[var26];
         if (var4 != null) {
            var23[var25] = var4[var27];
         }

         if (var6 != null) {
            var24[var25] = var6[var27];
         }

         ++var25;
         var17[var25] = var3[var28];
         var18[var25] = var5[var28];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null ? var11[var26] : var10[var26];
         if (var4 != null) {
            var23[var25] = var4[var28];
         }

         if (var6 != null) {
            var24[var25] = var6[var28];
         }

         ++var25;
         var17[var25] = var3[var29];
         var18[var25] = var5[var29];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null ? var11[var26] : var10[var26];
         if (var4 != null) {
            var23[var25] = var4[var29];
         }

         if (var6 != null) {
            var24[var25] = var6[var29];
         }

         ++var25;
      }

      this.method3882(var1, var2, var17, var23, var18, var24, var19, var20, var21, var22, var14, var15);
   }

   void method5639(class306 var1, int var2, int var3) {
      int[] var4 = this.field9480[var2][var3];
      int[] var5 = this.field9476[var2][var3];
      int var6 = var4.length;
      if (field9498.length < var6) {
         field9498 = new int[var6];
         field9499 = new int[var6];
      }

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         field9498[var7] = var4[var7] >> this.field9485.field757;
         field9499[var7] = var5[var7] >> this.field9485.field757;
      }

      var7 = 0;

      while(var7 < var6) {
         int var8 = field9498[var7];
         int var9 = field9499[var7++];
         int var10 = field9498[var7];
         int var11 = field9499[var7++];
         int var12 = field9498[var7];
         int var13 = field9499[var7++];
         if ((var8 - var10) * (var11 - var13) - (var11 - var9) * (var12 - var10) > 0) {
            var1.method370(var9, var11, var13, var8, var10, var12);
         }
      }

   }

   public boolean method3908(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.field9470 != null && var1 != null) {
         int var7 = var2 - (var3 * this.field9485.field743 >> 8) >> this.field9485.field757;
         int var8 = var4 - (var3 * this.field9485.field761 >> 8) >> this.field9485.field757;
         return this.field9470.method4247(var1, var7, var8);
      } else {
         return false;
      }
   }

   public void method3890(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.field9470 != null && var1 != null) {
         int var7 = var2 - (var3 * this.field9485.field743 >> 8) >> this.field9485.field757;
         int var8 = var4 - (var3 * this.field9485.field761 >> 8) >> this.field9485.field757;
         this.field9470.method4245(var1, var7, var8);
      }

   }

   public void method3891(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.field9470 != null && var1 != null) {
         int var7 = var2 - (var3 * this.field9485.field743 >> 8) >> this.field9485.field757;
         int var8 = var4 - (var3 * this.field9485.field761 >> 8) >> this.field9485.field757;
         this.field9470.method4241(var1, var7, var8);
      }

   }

   public class770 method3889(int var1, int var2, class770 var3) {
      if ((this.field9487[var1][var2] & 1) == 0) {
         return null;
      } else {
         int var4 = super.field7227 >> this.field9485.field757;
         class306 var5 = (class306)var3;
         class306 var6;
         if (var5 != null && var5.method369(var4, var4)) {
            var6 = var5;
            var5.method367();
         } else {
            var6 = new class306(this.field9485, var4, var4);
         }

         var6.method366(0, 0, var4, var4);
         this.method5639(var6, var1, var2);
         return var6;
      }
   }

   public void method3898() {
      if (this.field9491 > 0) {
         byte[][] var1 = new byte[super.field7226 + 1][super.field7225 + 1];

         int var3;
         for(int var2 = 1; var2 < super.field7226; ++var2) {
            for(var3 = 1; var3 < super.field7225; ++var3) {
               var1[var2][var3] = (byte)((this.field9493[var2 - 1][var3] >> 2) + (this.field9493[var2 + 1][var3] >> 3) + (this.field9493[var2][var3 - 1] >> 2) + (this.field9493[var2][var3 + 1] >> 3) + (this.field9493[var2][var3] >> 1));
            }
         }

         class568[] var67 = new class568[this.field9497.method2334(1332224628)];
         this.field9497.method2333(var67, 2094257346);

         for(var3 = 0; var3 < var67.length; ++var3) {
            ((class642)var67[var3]).method6134(this.field9491);
         }

         var3 = 20;
         if (this.field9483 != null) {
            var3 += 4;
         }

         if ((this.field9500 & 7) != 0) {
            var3 += 12;
         }

         I var4 = this.field9485.field665.f(this.field9491 * 4, false);
         I var5 = this.field9485.field665.f(this.field9491 * var3, false);
         Stream var6 = new Stream(var5);
         Stream var7 = new Stream(var4);
         class642[] var8 = new class642[this.field9491];
         int var9 = class236.method4619(this.field9491 / 4, 2098856769);
         if (var9 < 1) {
            var9 = 1;
         }

         class539 var10 = new class539(var9);
         class642[] var11 = new class642[this.field9492];

         int var12;
         int var13;
         for(var12 = 0; var12 < super.field7226; ++var12) {
            for(var13 = 0; var13 < super.field7225; ++var13) {
               if (this.field9501[var12][var13] != null) {
                  class642[] var14 = this.field9477[var12][var13];
                  int[] var15 = this.field9480[var12][var13];
                  int[] var16 = this.field9476[var12][var13];
                  int[] var17 = this.field9479[var12][var13];
                  int[] var18 = this.field9501[var12][var13];
                  int[] var19 = this.field9478 != null ? this.field9478[var12][var13] : null;
                  int[] var20 = this.field9483 != null ? this.field9483[var12][var13] : null;
                  if (var17 == null) {
                     var17 = var18;
                  }

                  float var21 = this.field9494[var12][var13];
                  float var22 = this.field9495[var12][var13];
                  float var23 = this.field9484[var12][var13];
                  float var24 = this.field9494[var12][var13 + 1];
                  float var25 = this.field9495[var12][var13 + 1];
                  float var26 = this.field9484[var12][var13 + 1];
                  float var27 = this.field9494[var12 + 1][var13 + 1];
                  float var28 = this.field9495[var12 + 1][var13 + 1];
                  float var29 = this.field9484[var12 + 1][var13 + 1];
                  float var30 = this.field9494[var12 + 1][var13];
                  float var31 = this.field9495[var12 + 1][var13];
                  float var32 = this.field9484[var12 + 1][var13];
                  int var33 = var1[var12][var13] & 255;
                  int var34 = var1[var12][var13 + 1] & 255;
                  int var35 = var1[var12 + 1][var13 + 1] & 255;
                  int var36 = var1[var12 + 1][var13] & 255;
                  int var37 = 0;

                  int var40;
                  label359:
                  for(int var38 = 0; var38 < var18.length; ++var38) {
                     class642 var39 = var14[var38];

                     for(var40 = 0; var40 < var37; ++var40) {
                        if (var11[var40] == var39) {
                           continue label359;
                        }
                     }

                     var11[var37++] = var39;
                  }

                  short[] var83 = this.field9474[var13 * super.field7226 + var12] = new short[var18.length];

                  for(int var84 = 0; var84 < var18.length; ++var84) {
                     var40 = (var12 << super.field7228) + var15[var84];
                     int var41 = (var13 << super.field7228) + var16[var84];
                     int var42 = var40 >> this.field9468;
                     int var43 = var41 >> this.field9468;
                     int var44 = var18[var84];
                     int var45 = var17[var84];
                     int var46 = var19 != null ? var19[var84] : 0;
                     long var47 = (long)var45 << 48 | (long)var44 << 32 | (long)(var42 << 16) | (long)var43;
                     int var49 = var15[var84];
                     int var50 = var16[var84];
                     byte var51 = 74;
                     int var52 = 0;
                     float var53 = 1.0F;
                     float var54;
                     float var55;
                     float var56;
                     float var61;
                     int var85;
                     if (var49 == 0 && var50 == 0) {
                        var54 = var21;
                        var55 = var22;
                        var56 = var23;
                        var85 = var51 - var33;
                     } else if (var49 == 0 && var50 == super.field7227) {
                        var54 = var24;
                        var55 = var25;
                        var56 = var26;
                        var85 = var51 - var34;
                     } else if (var49 == super.field7227 && var50 == super.field7227) {
                        var54 = var27;
                        var55 = var28;
                        var56 = var29;
                        var85 = var51 - var35;
                     } else if (var49 == super.field7227 && var50 == 0) {
                        var54 = var30;
                        var55 = var31;
                        var56 = var32;
                        var85 = var51 - var36;
                     } else {
                        float var57 = (float)var49 / (float)super.field7227;
                        float var58 = (float)var50 / (float)super.field7227;
                        float var59 = var21 + (var30 - var21) * var57;
                        float var60 = var22 + (var31 - var22) * var57;
                        var61 = var23 + (var32 - var23) * var57;
                        float var62 = var24 + (var27 - var24) * var57;
                        float var63 = var25 + (var28 - var25) * var57;
                        float var64 = var26 + (var29 - var26) * var57;
                        var54 = var59 + (var62 - var59) * var58;
                        var55 = var60 + (var63 - var60) * var58;
                        var56 = var61 + (var64 - var61) * var58;
                        int var65 = var33 + ((var36 - var33) * var49 >> super.field7228);
                        int var66 = var34 + ((var35 - var34) * var49 >> super.field7228);
                        var85 = var51 - (var65 + ((var66 - var65) * var50 >> super.field7228));
                     }

                     if (var44 != -1) {
                        int var86 = (var44 & 127) * var85 >> 7;
                        if (var86 < 2) {
                           var86 = 2;
                        } else if (var86 > 126) {
                           var86 = 126;
                        }

                        var52 = class134.field1398[var44 & 'ﾀ' | var86];
                        if ((this.field9500 & 7) == 0) {
                           var53 = this.field9485.field727[0] * var54 + this.field9485.field727[1] * var55 + this.field9485.field727[2] * var56;
                           var53 = this.field9485.field735 + var53 * (var53 > 0.0F ? this.field9485.field808 : this.field9485.field737);
                        }
                     }

                     class568 var88 = null;
                     if ((var40 & this.field9469 - 1) == 0 && (var41 & this.field9469 - 1) == 0) {
                        var88 = var10.method2331(var47);
                     }

                     int var87;
                     int var89;
                     if (var88 == null) {
                        if (var45 != var44) {
                           int var90 = (var45 & 127) * var85 >> 7;
                           if (var90 < 2) {
                              var90 = 2;
                           } else if (var90 > 126) {
                              var90 = 126;
                           }

                           var89 = class134.field1398[var45 & 'ﾀ' | var90];
                           if ((this.field9500 & 7) == 0) {
                              float var10000 = this.field9485.field727[0] * var54 + this.field9485.field727[1] * var55 + this.field9485.field727[2] * var56;
                              var61 = this.field9485.field735 + var53 * (var53 > 0.0F ? this.field9485.field808 : this.field9485.field737);
                              int var91 = var89 >> 16 & 255;
                              int var92 = var89 >> 8 & 255;
                              int var93 = var89 & 255;
                              var91 = (int)((float)var91 * var61);
                              if (var91 < 0) {
                                 var91 = 0;
                              } else if (var91 > 255) {
                                 var91 = 255;
                              }

                              var92 = (int)((float)var92 * var61);
                              if (var92 < 0) {
                                 var92 = 0;
                              } else if (var92 > 255) {
                                 var92 = 255;
                              }

                              var93 = (int)((float)var93 * var61);
                              if (var93 < 0) {
                                 var93 = 0;
                              } else if (var93 > 255) {
                                 var93 = 255;
                              }

                              var89 = var91 << 16 | var92 << 8 | var93;
                           }
                        } else {
                           var89 = var52;
                        }

                        if (Stream.r()) {
                           var6.d((float)var40);
                           var6.d((float)(this.method3887(var40, var41, -1533098299) + var46));
                           var6.d((float)var41);
                           var6.d((float)var40);
                           var6.d((float)var41);
                           if (this.field9483 != null) {
                              var6.d(var20 != null ? (float)(var20[var84] - 1) : 0.0F);
                           }

                           if ((this.field9500 & 7) != 0) {
                              var6.d(var54);
                              var6.d(var55);
                              var6.d(var56);
                           }
                        } else {
                           var6.u((float)var40);
                           var6.u((float)(this.method3887(var40, var41, -1562205139) + var46));
                           var6.u((float)var41);
                           var6.u((float)var40);
                           var6.u((float)var41);
                           if (this.field9483 != null) {
                              var6.u(var20 != null ? (float)(var20[var84] - 1) : 0.0F);
                           }

                           if ((this.field9500 & 7) != 0) {
                              var6.u(var54);
                              var6.u(var55);
                              var6.u(var56);
                           }
                        }

                        if (this.field9485.field790 == 0) {
                           var7.i(-16777216 | var89);
                        } else {
                           var7.k(-16777216 | var89);
                        }

                        var87 = this.field9472++;
                        var83[var84] = (short)var87;
                        if (var44 != -1) {
                           var8[var87] = var14[var84];
                        }

                        var10.method2337(new class129(var83[var84]), var47);
                     } else {
                        var83[var84] = ((class129)var88).field1084;
                        var87 = var83[var84] & '\uffff';
                        if (var44 != -1 && var14[var84].field641 < var8[var87].field641) {
                           var8[var87] = var14[var84];
                        }
                     }

                     for(var89 = 0; var89 < var37; ++var89) {
                        var11[var89].method6137(var87, var52, var85, var53);
                     }

                     ++this.field9473;
                  }
               }
            }
         }

         for(var12 = 0; var12 < this.field9472; ++var12) {
            class642 var68 = var8[var12];
            if (var68 != null) {
               var68.method6135(var12);
            }
         }

         for(var12 = 0; var12 < super.field7226; ++var12) {
            for(var13 = 0; var13 < super.field7225; ++var13) {
               short[] var69 = this.field9474[var13 * super.field7226 + var12];
               if (var69 != null) {
                  int var72 = 0;

                  for(int var75 = 0; var75 < var69.length; ++var72) {
                     int var76 = var69[var75++] & '\uffff';
                     int var77 = var69[var75++] & '\uffff';
                     int var78 = var69[var75++] & '\uffff';
                     class642 var79 = var8[var76];
                     class642 var80 = var8[var77];
                     class642 var81 = var8[var78];
                     class642 var82 = null;
                     if (var79 != null) {
                        var79.method6136(var12, var13, var72);
                        var82 = var79;
                     }

                     if (var80 != null) {
                        var80.method6136(var12, var13, var72);
                        if (var82 == null || var80.field641 < var82.field641) {
                           var82 = var80;
                        }
                     }

                     if (var81 != null) {
                        var81.method6136(var12, var13, var72);
                        if (var82 == null || var81.field641 < var82.field641) {
                           var82 = var81;
                        }
                     }

                     if (var82 != null) {
                        if (var79 != null) {
                           var82.method6135(var76);
                        }

                        if (var80 != null) {
                           var82.method6135(var77);
                        }

                        if (var81 != null) {
                           var82.method6135(var78);
                        }

                        var82.method6136(var12, var13, var72);
                     }
                  }
               }
            }
         }

         var6.x();
         var7.x();
         this.field9467 = this.field9485.method641(false);
         this.field9467.method2236(this.field9472 * 4, 4, var4);
         this.field9488 = this.field9485.method641(false);
         this.field9488.method2236(this.field9472 * var3, var3, var5);
         if ((this.field9500 & 7) != 0) {
            if (this.field9483 != null) {
               this.field9490 = this.field9485.method663(new class39[]{new class39(new class61[]{class61.field1601, class61.field1590, class61.field1592, class61.field1587}), new class39(class61.field1588)});
            } else {
               this.field9490 = this.field9485.method663(new class39[]{new class39(new class61[]{class61.field1601, class61.field1590, class61.field1587}), new class39(class61.field1588)});
            }
         } else if (this.field9483 != null) {
            this.field9490 = this.field9485.method663(new class39[]{new class39(new class61[]{class61.field1601, class61.field1590, class61.field1592}), new class39(class61.field1588)});
         } else {
            this.field9490 = this.field9485.method663(new class39[]{new class39(new class61[]{class61.field1601, class61.field1590}), new class39(class61.field1588)});
         }

         var12 = 0;

         for(var13 = 0; var13 < var67.length; ++var13) {
            class642 var70 = (class642)var67[var13];
            if (var70.field10080 > 0) {
               var67[var12++] = var70;
            }
         }

         this.field9496 = new class568[var12];
         long[] var73 = new long[var12];

         for(int var71 = 0; var71 < var12; ++var71) {
            class642 var74 = (class642)var67[var71];
            var73[var71] = var74.field641;
            this.field9496[var71] = var74;
            var74.method6138(this.field9472);
         }

         class715.method2096(var73, this.field9496, (byte)-13);
         if (this.field9470 != null) {
            this.field9470.method4239();
         }
      } else {
         this.field9470 = null;
      }

      if ((this.field9481 & 2) == 0) {
         this.field9476 = null;
         this.field9480 = null;
         this.field9501 = null;
      }

      this.field9483 = null;
      this.field9479 = null;
      this.field9478 = null;
      this.field9477 = null;
      this.field9493 = null;
      this.field9497 = null;
      this.field9484 = null;
      this.field9495 = null;
      this.field9494 = null;
   }

   public void method3885(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if (this.field9496 != null) {
         int var7 = var3 + var3 + 1;
         var7 *= var7;
         if (field9489.length < var7) {
            field9489 = new int[var7];
         }

         int var8 = var1 - var3;
         int var9 = var8;
         if (var8 < 0) {
            var8 = 0;
         }

         int var10 = var2 - var3;
         int var11 = var10;
         if (var10 < 0) {
            var10 = 0;
         }

         int var12 = var1 + var3;
         if (var12 > super.field7226 - 1) {
            var12 = super.field7226 - 1;
         }

         int var13 = var2 + var3;
         if (var13 > super.field7225 - 1) {
            var13 = super.field7225 - 1;
         }

         field9471 = 0;

         for(int var14 = var8; var14 <= var12; ++var14) {
            boolean[] var15 = var4[var14 - var9];

            for(int var16 = var10; var16 <= var13; ++var16) {
               if (var15[var16 - var11]) {
                  field9489[field9471++] = var16 * super.field7226 + var14;
               }
            }
         }

         ByteBuffer var24 = this.field9485.field660;
         var24.clear();

         int var25;
         for(var25 = 0; var25 < this.field9496.length; ++var25) {
            class642 var26 = (class642)this.field9496[var25];
            var26.method6139(field9489, field9471);
         }

         var25 = var24.position();
         class605 var27 = this.field9485.field760;
         if (var25 != 0) {
            class920 var17 = this.field9485.method571(var25 / 2);
            var17.method1977(0, var25, this.field9485.field661);
            this.field9485.method652();
            this.field9485.method642(0, this.field9488);
            this.field9485.method643(var17);
            var27.method5105(class344.field326);
            if (this.field9485.field677 > 0) {
               var27.field8697.method4570(0.0F, 0.0F, 1.0F, -this.field9485.field736);
               var27.field8694.method3292((float)(this.field9485.field776 >> 16 & 255) / 255.0F, (float)(this.field9485.field776 >> 8 & 255) / 255.0F, (float)(this.field9485.field776 >> 0 & 255) / 255.0F);
               this.field9485.field680.method269(this.field9485.field674);
               this.field9485.field680.method286();
               var27.field8697.method4573(this.field9485.field680);
               var27.field8697.method4574(1.0F / (this.field9485.field780 - this.field9485.field736));
            } else {
               var27.field8697.method4570(0.0F, 0.0F, 0.0F, 0.0F);
               var27.field8694.method3292(0.0F, 0.0F, 0.0F);
            }

            int var18;
            int var19;
            class642 var20;
            class414 var22;
            if ((this.field9500 & 55) == 0) {
               var18 = 0;

               for(var19 = 0; var19 < this.field9496.length; ++var19) {
                  var20 = (class642)this.field9496[var19];
                  if (var20.field10072 != 0) {
                     if (this.field9485.field770) {
                        this.field9485.method4887(0, var20.field10076);
                        var27.field8695.method4570(0.0F, 1.0F, 0.0F, (float)this.field9485.field772 + (float)var20.field10076.field10427 / 255.0F * (float)var20.field10076.field10425);
                        var27.field8695.method4574(1.0F / (float)var20.field10076.field10425);
                        var27.field8696.method3292((float)(var20.field10076.field10426 >> 16 & 255) / 255.0F, (float)(var20.field10076.field10426 >> 8 & 255) / 255.0F, (float)(var20.field10076.field10426 >> 0 & 255) / 255.0F);
                     } else {
                        var27.field8695.method4570(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.field8696.method3292(0.0F, 0.0F, 0.0F);
                     }

                     boolean var30 = false;
                     if (var20.field10074 != -1) {
                        var27.field8689 = this.field9485.field795.method4727(var20.field10074);
                        var22 = this.field9485.field8581.method4625(var20.field10074, 377396513);
                        var30 = !class355.method1414(var22.field9383, -596124611);
                     } else {
                        var27.field8689 = this.field9485.field754;
                     }

                     this.field9485.method642(1, var20.field10077);
                     this.field9485.method714(this.field9490);
                     var27.field8691.method274(1.0F / var20.field10084, 1.0F / var20.field10084, 1.0F, 1.0F);
                     var27.field8704 = var20.field10081;
                     var27.field8705 = var20.field10082 - var20.field10081 + 1;
                     var27.field8706 = var18;
                     var27.field8686 = var20.field10072 / 3;
                     var27.method5113(var30);
                     var18 += var20.field10072;
                  }
               }
            } else {
               var27.field8699.method3292(this.field9485.field727[0], this.field9485.field727[1], this.field9485.field727[2]);
               var27.field8700.method3292(this.field9485.field808 * this.field9485.field806, this.field9485.field808 * this.field9485.field733, this.field9485.field808 * this.field9485.field734);
               var27.field8701.method3292(-this.field9485.field737 * this.field9485.field806, -this.field9485.field737 * this.field9485.field733, -this.field9485.field737 * this.field9485.field734);
               var27.field8687.method3292(this.field9485.field735 * this.field9485.field806, this.field9485.field735 * this.field9485.field733, this.field9485.field735 * this.field9485.field734);
               var18 = 0;

               for(var19 = 0; var19 < this.field9496.length; ++var19) {
                  var20 = (class642)this.field9496[var19];
                  if (var20.field10072 > 0) {
                     if (this.field9485.field770) {
                        this.field9485.method4887(0, var20.field10076);
                        float var21 = 0.15F;
                        var27.field8695.method4570(0.0F, 1.0F / ((float)var20.field10076.field10425 * var21), 0.0F, 256.0F / ((float)var20.field10076.field10425 * var21));
                        var27.field8696.method3292((float)(var20.field10076.field10426 >> 16 & 255) / 255.0F, (float)(var20.field10076.field10426 >> 8 & 255) / 255.0F, (float)(var20.field10076.field10426 >> 0 & 255) / 255.0F);
                     } else {
                        var27.field8695.method4570(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.field8696.method3292(0.0F, 0.0F, 0.0F);
                     }

                     byte var29 = 11;
                     if (var20.field10074 != -1) {
                        var22 = this.field9485.field8581.method4625(var20.field10074, 515352996);
                        var29 = var22.field9383;
                        var27.field8689 = this.field9485.field795.method4727(var20.field10074);
                        var27.method5108(var22);
                     } else {
                        var27.field8689 = this.field9485.field754;
                     }

                     this.field9485.method642(1, var20.field10077);
                     this.field9485.method714(this.field9490);
                     var27.field8691.method274(1.0F / var20.field10084, 1.0F / var20.field10084, 1.0F, 1.0F);
                     var27.field8704 = var20.field10081;
                     var27.field8705 = var20.field10082 - var20.field10081 + 1;
                     var27.field8706 = var18;
                     var27.field8686 = var20.field10072 / 3;
                     switch(var29) {
                     case 1:
                        var27.field8702.method3292(this.field9485.field675.field325[12], this.field9485.field675.field325[13], this.field9485.field675.field325[14]);
                        var27.method5107(0);
                        break;
                     case 2:
                     case 4:
                     case 8:
                     case 9:
                        if (!this.field9485.field658 && (this.field9500 & 8) != 0) {
                           class698 var31 = this.field9485.field763;
                           var31.field7168.method269(this.field9485.field695);
                           var31.field7170.method274(1.0F / (var20.field10084 * (float)var20.field10076.field10429), 1.0F / (var20.field10084 * (float)var20.field10076.field10429), 1.0F, 1.0F);
                           var31.field7172.method3292(this.field9485.field675.field325[12], this.field9485.field675.field325[13], this.field9485.field675.field325[14]);
                           class414 var23 = this.field9485.field8581.method4625(var20.field10074, 191676686);
                           var31.field7173 = var23.field9390;
                           var31.field7188 = var20.field10081;
                           var31.field7186 = var20.field10082 - var20.field10081 + 1;
                           var31.field7190 = var18;
                           var31.field7191 = var20.field10072 / 3;
                           var31.field7181.method4575(var27.field8695);
                           var31.field7177.method3298(var27.field8696);
                           var31.field7185.method4575(var27.field8697);
                           var31.field7167.method3298(var27.field8694);
                           var31.method3803(-1712018251);
                        } else {
                           var27.method5106(0);
                        }
                        break;
                     case 3:
                     case 5:
                     default:
                        if (this.field9485.field770) {
                           var27.method5109();
                        } else {
                           var27.method5106(0);
                        }
                        break;
                     case 6:
                        var27.method5113(!class355.method1414(var29, -869988177));
                        break;
                     case 7:
                        var27.field8702.method3292(this.field9485.field675.field325[12], this.field9485.field675.field325[13], this.field9485.field675.field325[14]);
                        var27.field8707.method299();
                        var27.field8690 = this.field9485.method580();
                        var27.method5102(0);
                     }

                     var18 += var20.field10072;
                  }
               }
            }
         }

         if (this.field9470 != null) {
            this.field9485.method642(0, this.field9488);
            this.field9485.method642(1, this.field9467);
            this.field9485.method714(this.field9490);
            class344 var28 = this.field9485.field680;
            var28.method299();
            var28.field325[13] = -1.0F;
            var27.method5105(var28);
            this.field9470.method4240(var27, var1, var2, var3, var4, var5);
         }
      }

   }

   public void method3892(class639 var1, int[] var2) {
      this.field9486.method1282(new class651(this.field9485, this, var1, var2), 847764960);
   }

   public void method3881(int var1, int var2, int var3) {
      if ((this.field9493[var1][var2] & 255) < var3) {
         this.field9493[var1][var2] = (byte)var3;
      }

   }
}
