import jaclib.memory.Stream;
import jaclib.memory.heap.I;
import jaggl.OpenGL;

public class class291 extends class454 {
   class847 field10484;
   static int field10485 = 74;
   class847 field10486;
   int field10487;
   int field10488;
   int field10489;
   int field10490;
   static float[] field10491 = new float[16];
   int field10492;
   int field10493;
   class724[][][] field10494;
   int[][][] field10495;
   int[][][] field10496;
   float[][] field10497;
   int[][][] field10498;
   int[][][] field10499;
   int[][][] field10500;
   class568[] field10501;
   class13 field10502;
   class599 field10503 = new class599();
   int[][][] field10504;
   class269 field10505;
   class847 field10506;
   class847 field10507;
   class243 field10508;
   static int field10509 = 1;
   int field10510;
   int field10511;
   byte[][] field10512;
   byte[][] field10513;
   float[][] field10514;
   float[][] field10515;
   class539 field10516;
   short[][] field10517;

   public void method3881(int var1, int var2, int var3) {
      if ((this.field10512[var1][var2] & 255) < var3) {
         this.field10512[var1][var2] = (byte)var3;
      }

   }

   public class770 method3909(int var1, int var2, class770 var3) {
      if ((this.field10513[var1][var2] & 1) == 0) {
         return null;
      } else {
         int var4 = this.field7227 * -1212653763 >> this.field10502.field6751;
         class464 var5 = (class464)var3;
         class464 var6;
         if (var5 != null && var5.method4110(var4, var4)) {
            var6 = var5;
            var5.method4111();
         } else {
            var6 = new class464(this.field10502, var4, var4);
         }

         var6.method4114(0, 0, var4, var4);
         this.method6526(var6, var1, var2);
         return var6;
      }
   }

   public void method3893(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.field10508 != null && var1 != null) {
         int var7 = var2 - (var3 * this.field10502.field6753 >> 8) >> this.field10502.field6751;
         int var8 = var4 - (var3 * this.field10502.field6713 >> 8) >> this.field10502.field6751;
         this.field10508.method4758(var1, var7, var8);
      }

   }

   public void method3898() {
      if (this.field10510 > 0) {
         byte[][] var1 = new byte[this.field7226 * -506105871 + 1][this.field7225 * -1148794921 + 1];

         int var2;
         for(var2 = 1; var2 < this.field7226 * -506105871; ++var2) {
            for(int var3 = 1; var3 < this.field7225 * -1148794921; ++var3) {
               var1[var2][var3] = (byte)((this.field10512[var2 - 1][var3] >> 2) + (this.field10512[var2 + 1][var3] >> 3) + (this.field10512[var2][var3 - 1] >> 2) + (this.field10512[var2][var3 + 1] >> 3) + (this.field10512[var2][var3] >> 1));
            }
         }

         this.field10501 = new class568[this.field10516.method2334(1429819619)];
         this.field10516.method2333(this.field10501, 2105233647);

         for(var2 = 0; var2 < this.field10501.length; ++var2) {
            ((class724)this.field10501[var2]).method1708(this.field10510);
         }

         var2 = 24;
         if (this.field10500 != null) {
            var2 += 4;
         }

         if ((this.field10490 & 7) != 0) {
            var2 += 12;
         }

         I var64 = this.field10502.field6868.f(this.field10510 * var2, false);
         Stream var4 = new Stream(var64);
         class724[] var5 = new class724[this.field10510];
         int var6 = class236.method4619(this.field10510 / 4, 1715118458);
         if (var6 < 1) {
            var6 = 1;
         }

         class539 var7 = new class539(var6);
         class724[] var8 = new class724[this.field10511];

         int var9;
         int var10;
         for(var9 = 0; var9 < this.field7226 * -506105871; ++var9) {
            for(var10 = 0; var10 < this.field7225 * -1148794921; ++var10) {
               if (this.field10495[var9][var10] != null) {
                  class724[] var11 = this.field10494[var9][var10];
                  int[] var12 = this.field10504[var9][var10];
                  int[] var13 = this.field10498[var9][var10];
                  int[] var14 = this.field10496[var9][var10];
                  int[] var15 = this.field10495[var9][var10];
                  int[] var16 = this.field10499 != null ? this.field10499[var9][var10] : null;
                  int[] var17 = this.field10500 != null ? this.field10500[var9][var10] : null;
                  if (var14 == null) {
                     var14 = var15;
                  }

                  float var18 = this.field10497[var9][var10];
                  float var19 = this.field10514[var9][var10];
                  float var20 = this.field10515[var9][var10];
                  float var21 = this.field10497[var9][var10 + 1];
                  float var22 = this.field10514[var9][var10 + 1];
                  float var23 = this.field10515[var9][var10 + 1];
                  float var24 = this.field10497[var9 + 1][var10 + 1];
                  float var25 = this.field10514[var9 + 1][var10 + 1];
                  float var26 = this.field10515[var9 + 1][var10 + 1];
                  float var27 = this.field10497[var9 + 1][var10];
                  float var28 = this.field10514[var9 + 1][var10];
                  float var29 = this.field10515[var9 + 1][var10];
                  int var30 = var1[var9][var10] & 255;
                  int var31 = var1[var9][var10 + 1] & 255;
                  int var32 = var1[var9 + 1][var10 + 1] & 255;
                  int var33 = var1[var9 + 1][var10] & 255;
                  int var34 = 0;

                  int var37;
                  label343:
                  for(int var35 = 0; var35 < var15.length; ++var35) {
                     class724 var36 = var11[var35];

                     for(var37 = 0; var37 < var34; ++var37) {
                        if (var8[var37] == var36) {
                           continue label343;
                        }
                     }

                     var8[var34++] = var36;
                  }

                  short[] var80 = this.field10517[var10 * this.field7226 * -506105871 + var9] = new short[var15.length];

                  for(int var81 = 0; var81 < var15.length; ++var81) {
                     var37 = (var9 << this.field7228 * -2137349879) + var12[var81];
                     int var38 = (var10 << this.field7228 * -2137349879) + var13[var81];
                     int var39 = var37 >> this.field10487;
                     int var40 = var38 >> this.field10487;
                     int var41 = var15[var81];
                     int var42 = var14[var81];
                     int var43 = var16 != null ? var16[var81] : 0;
                     long var44 = (long)var42 << 48 | (long)var41 << 32 | (long)(var39 << 16) | (long)var40;
                     int var46 = var12[var81];
                     int var47 = var13[var81];
                     byte var48 = 74;
                     int var49 = 0;
                     float var50 = 1.0F;
                     float var51;
                     float var52;
                     float var53;
                     float var58;
                     int var82;
                     if (var46 == 0 && var47 == 0) {
                        var51 = var18;
                        var52 = var19;
                        var53 = var20;
                        var82 = var48 - var30;
                     } else if (var46 == 0 && var47 == this.field7227 * -1212653763) {
                        var51 = var21;
                        var52 = var22;
                        var53 = var23;
                        var82 = var48 - var31;
                     } else if (var46 == this.field7227 * -1212653763 && var47 == this.field7227 * -1212653763) {
                        var51 = var24;
                        var52 = var25;
                        var53 = var26;
                        var82 = var48 - var32;
                     } else if (var46 == this.field7227 * -1212653763 && var47 == 0) {
                        var51 = var27;
                        var52 = var28;
                        var53 = var29;
                        var82 = var48 - var33;
                     } else {
                        float var54 = (float)var46 / (float)(this.field7227 * -1212653763);
                        float var55 = (float)var47 / (float)(this.field7227 * -1212653763);
                        float var56 = var18 + (var27 - var18) * var54;
                        float var57 = var19 + (var28 - var19) * var54;
                        var58 = var20 + (var29 - var20) * var54;
                        float var59 = var21 + (var24 - var21) * var54;
                        float var60 = var22 + (var25 - var22) * var54;
                        float var61 = var23 + (var26 - var23) * var54;
                        var51 = var56 + (var59 - var56) * var55;
                        var52 = var57 + (var60 - var57) * var55;
                        var53 = var58 + (var61 - var58) * var55;
                        int var62 = var30 + ((var33 - var30) * var46 >> this.field7228 * -2137349879);
                        int var63 = var31 + ((var32 - var31) * var46 >> this.field7228 * -2137349879);
                        var82 = var48 - (var62 + ((var63 - var62) * var47 >> this.field7228 * -2137349879));
                     }

                     if (var41 != -1) {
                        int var83 = (var41 & 127) * var82 >> 7;
                        if (var83 < 2) {
                           var83 = 2;
                        } else if (var83 > 126) {
                           var83 = 126;
                        }

                        var49 = class134.field1398[var41 & 'ﾀ' | var83];
                        if ((this.field10490 & 7) == 0) {
                           var50 = this.field10502.field6811[0] * var51 + this.field10502.field6811[1] * var52 + this.field10502.field6811[2] * var53;
                           var50 = this.field10502.field6817 + var50 * (var50 > 0.0F ? this.field10502.field6818 : this.field10502.field6819);
                        }
                     }

                     class568 var85 = null;
                     if ((var37 & this.field10488 - 1) == 0 && (var38 & this.field10488 - 1) == 0) {
                        var85 = var7.method2331(var44);
                     }

                     int var84;
                     int var86;
                     if (var85 == null) {
                        if (var42 != var41) {
                           int var87 = (var42 & 127) * var82 >> 7;
                           if (var87 < 2) {
                              var87 = 2;
                           } else if (var87 > 126) {
                              var87 = 126;
                           }

                           var86 = class134.field1398[var42 & 'ﾀ' | var87];
                           if ((this.field10490 & 7) == 0) {
                              float var10000 = this.field10502.field6811[0] * var51 + this.field10502.field6811[1] * var52 + this.field10502.field6811[2] * var53;
                              var58 = this.field10502.field6817 + var50 * (var50 > 0.0F ? this.field10502.field6818 : this.field10502.field6819);
                              int var88 = var86 >> 16 & 255;
                              int var89 = var86 >> 8 & 255;
                              int var90 = var86 & 255;
                              var88 = (int)((float)var88 * var58);
                              if (var88 < 0) {
                                 var88 = 0;
                              } else if (var88 > 255) {
                                 var88 = 255;
                              }

                              var89 = (int)((float)var89 * var58);
                              if (var89 < 0) {
                                 var89 = 0;
                              } else if (var89 > 255) {
                                 var89 = 255;
                              }

                              var90 = (int)((float)var90 * var58);
                              if (var90 < 0) {
                                 var90 = 0;
                              } else if (var90 > 255) {
                                 var90 = 255;
                              }

                              var86 = var88 << 16 | var89 << 8 | var90;
                           }
                        } else {
                           var86 = var49;
                        }

                        if (this.field10502.field6830) {
                           var4.d((float)var37);
                           var4.d((float)(this.method3887(var37, var38, -1789282838) + var43));
                           var4.d((float)var38);
                           var4.p((byte)(var86 >> 16));
                           var4.p((byte)(var86 >> 8));
                           var4.p((byte)var86);
                           var4.p(-1);
                           var4.d((float)var37);
                           var4.d((float)var38);
                           if (this.field10500 != null) {
                              var4.d(var17 != null ? (float)(var17[var81] - 1) : 0.0F);
                           }

                           if ((this.field10490 & 7) != 0) {
                              var4.d(var51);
                              var4.d(var52);
                              var4.d(var53);
                           }
                        } else {
                           var4.u((float)var37);
                           var4.u((float)(this.method3887(var37, var38, -1884194336) + var43));
                           var4.u((float)var38);
                           var4.p((byte)(var86 >> 16));
                           var4.p((byte)(var86 >> 8));
                           var4.p((byte)var86);
                           var4.p(-1);
                           var4.u((float)var37);
                           var4.u((float)var38);
                           if (this.field10500 != null) {
                              var4.u(var17 != null ? (float)(var17[var81] - 1) : 0.0F);
                           }

                           if ((this.field10490 & 7) != 0) {
                              var4.u(var51);
                              var4.u(var52);
                              var4.u(var53);
                           }
                        }

                        var84 = this.field10493++;
                        var80[var81] = (short)var84;
                        if (var41 != -1) {
                           var5[var84] = var11[var81];
                        }

                        var7.method2337(new class129(var80[var81]), var44);
                     } else {
                        var80[var81] = ((class129)var85).field1084;
                        var84 = var80[var81] & '\uffff';
                        if (var41 != -1 && var11[var81].field641 * 7051297995265073167L < var5[var84].field641 * 7051297995265073167L) {
                           var5[var84] = var11[var81];
                        }
                     }

                     for(var86 = 0; var86 < var34; ++var86) {
                        var8[var86].method1706(var84, var49, var82, var50);
                     }

                     ++this.field10492;
                  }
               }
            }
         }

         for(var9 = 0; var9 < this.field10493; ++var9) {
            class724 var65 = var5[var9];
            if (var65 != null) {
               var65.method1707(var9);
            }
         }

         for(var9 = 0; var9 < this.field7226 * -506105871; ++var9) {
            for(var10 = 0; var10 < this.field7225 * -1148794921; ++var10) {
               short[] var67 = this.field10517[var10 * this.field7226 * -506105871 + var9];
               if (var67 != null) {
                  int var70 = 0;

                  for(int var72 = 0; var72 < var67.length; ++var70) {
                     int var73 = var67[var72++] & '\uffff';
                     int var74 = var67[var72++] & '\uffff';
                     int var75 = var67[var72++] & '\uffff';
                     class724 var76 = var5[var73];
                     class724 var77 = var5[var74];
                     class724 var78 = var5[var75];
                     class724 var79 = null;
                     if (var76 != null) {
                        var76.method1705(var9, var10, var70);
                        var79 = var76;
                     }

                     if (var77 != null) {
                        var77.method1705(var9, var10, var70);
                        if (var79 == null || var77.field641 * 7051297995265073167L < var79.field641 * 7051297995265073167L) {
                           var79 = var77;
                        }
                     }

                     if (var78 != null) {
                        var78.method1705(var9, var10, var70);
                        if (var79 == null || var78.field641 * 7051297995265073167L < var79.field641 * 7051297995265073167L) {
                           var79 = var78;
                        }
                     }

                     if (var79 != null) {
                        if (var76 != null) {
                           var79.method1707(var73);
                        }

                        if (var77 != null) {
                           var79.method1707(var74);
                        }

                        if (var78 != null) {
                           var79.method1707(var75);
                        }

                        var79.method1705(var9, var10, var70);
                     }
                  }
               }
            }
         }

         var4.x();
         this.field10505 = this.field10502.method3628(var2, var64, var4.f(), false);
         if (this.field10505 instanceof class409) {
            var64.t();
         }

         this.field10506 = new class847(this.field10505, 5126, 3, 0);
         this.field10507 = new class847(this.field10505, 5121, 4, 12);
         byte var66;
         if (this.field10500 != null) {
            this.field10484 = new class847(this.field10505, 5126, 3, 16);
            var66 = 28;
         } else {
            this.field10484 = new class847(this.field10505, 5126, 2, 16);
            var66 = 24;
         }

         if ((this.field10490 & 7) != 0) {
            this.field10486 = new class847(this.field10505, 5126, 3, var66);
         }

         long[] var68 = new long[this.field10501.length];

         for(int var69 = 0; var69 < this.field10501.length; ++var69) {
            class724 var71 = (class724)this.field10501[var69];
            var68[var69] = var71.field641 * 7051297995265073167L;
            var71.method1709(this.field10493);
         }

         class715.method2096(var68, this.field10501, (byte)-115);
         if (this.field10508 != null) {
            this.field10508.method4756();
         }
      } else {
         this.field10508 = null;
      }

      if ((this.field10489 & 2) == 0) {
         this.field10498 = null;
         this.field10504 = null;
         this.field10495 = null;
      }

      this.field10500 = null;
      this.field10496 = null;
      this.field10499 = null;
      this.field10494 = null;
      this.field10512 = null;
      this.field10516 = null;
      this.field10515 = null;
      this.field10514 = null;
      this.field10497 = null;
   }

   public void method3905(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      class783 var9 = this.field10502.method4800((short)23850);
      if (this.field10510 > 0 && var9 != null) {
         this.field10502.method3674();
         this.field10502.method3609(false);
         this.field10502.method3645(false);
         this.field10502.method3647(false);
         this.field10502.method3664(false);
         this.field10502.method3649(0);
         this.field10502.method3658(-2);
         this.field10502.method3639((class203)null);
         field10491[0] = (float)var3 / (128.0F * (float)(this.field7227 * -1212653763) * (float)var9.method2481());
         field10491[1] = 0.0F;
         field10491[2] = 0.0F;
         field10491[3] = 0.0F;
         field10491[4] = 0.0F;
         field10491[5] = (float)var3 / (128.0F * (float)(this.field7227 * -1212653763) * (float)var9.method2493());
         field10491[6] = 0.0F;
         field10491[7] = 0.0F;
         field10491[8] = 0.0F;
         field10491[9] = 0.0F;
         field10491[10] = 0.0F;
         field10491[11] = 0.0F;
         field10491[12] = -1.0F - ((float)(var4 * var3) / 128.0F - (float)(var1 * 2)) / (float)var9.method2481();
         field10491[13] = 1.0F - ((float)(2 * var2) + (float)(var7 * var3) / 128.0F) / (float)var9.method2493();
         field10491[14] = 0.0F;
         field10491[15] = 1.0F;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadMatrixf(field10491, 0);
         field10491[0] = 1.0F;
         field10491[1] = 0.0F;
         field10491[2] = 0.0F;
         field10491[3] = 0.0F;
         field10491[4] = 0.0F;
         field10491[5] = 0.0F;
         field10491[6] = 1.0F;
         field10491[7] = 0.0F;
         field10491[8] = 0.0F;
         field10491[9] = 1.0F;
         field10491[10] = 0.0F;
         field10491[11] = 0.0F;
         field10491[12] = 0.0F;
         field10491[13] = 0.0F;
         field10491[14] = 0.0F;
         field10491[15] = 1.0F;
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadMatrixf(field10491, 0);
         if ((this.field10490 & 7) != 0) {
            this.field10502.method3645(true);
            this.field10502.method3662();
         } else {
            this.field10502.method3645(false);
         }

         this.field10502.method3631(this.field10506, this.field10486, this.field10507, this.field10484);
         if (this.field10502.field6884.field10375.length < this.field10492 * 2) {
            this.field10502.field6884 = new class782(this.field10492 * 2);
         } else {
            this.field10502.field6884.field10376 = 0;
         }

         int var10 = 0;
         class782 var11 = this.field10502.field6884;
         int var12;
         int var13;
         int var14;
         short[] var15;
         int var16;
         if (this.field10502.field6830) {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.field7226 * -506105871 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if (var8[var14 - var4][var12 - var5]) {
                     var15 = this.field10517[var13];
                     if (var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method6362(var15[var16] & '\uffff', 16711935);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         } else {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.field7226 * -506105871 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if (var8[var14 - var4][var12 - var5]) {
                     var15 = this.field10517[var13];
                     if (var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method6363(var15[var16] & '\uffff', 1368367793);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         }

         if (var10 > 0) {
            class424 var17 = new class424(this.field10502, 5123, var11.field10375, var11.field10376 * 385051775);
            this.field10502.method3637(var17, 4, 0, var10);
         }
      }

   }

   void method6525(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if (this.field10501 != null) {
         int var7 = var3 + var3 + 1;
         var7 *= var7;
         if (this.field10502.field6887.length < var7) {
            this.field10502.field6887 = new int[var7];
         }

         if (this.field10502.field6884.field10375.length < this.field10492 * 2) {
            this.field10502.field6884 = new class782(this.field10492 * 2);
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
         if (var12 > this.field7226 * -506105871 - 1) {
            var12 = this.field7226 * -506105871 - 1;
         }

         int var13 = var2 + var3;
         if (var13 > this.field7225 * -1148794921 - 1) {
            var13 = this.field7225 * -1148794921 - 1;
         }

         int var14 = 0;
         int[] var15 = this.field10502.field6887;

         int var16;
         for(var16 = var8; var16 <= var12; ++var16) {
            boolean[] var17 = var4[var16 - var9];

            for(int var18 = var10; var18 <= var13; ++var18) {
               if (var17[var18 - var11]) {
                  var15[var14++] = var18 * this.field7226 * -506105871 + var16;
               }
            }
         }

         this.field10502.method3635();
         this.field10502.method3645((this.field10490 & 7) != 0);

         for(var16 = 0; var16 < this.field10501.length - 0; ++var16) {
            ((class724)this.field10501[var16]).method1710(var15, var14);
         }

         if (!this.field10503.method1284((byte)115)) {
            var16 = this.field10502.field6826;
            int var20 = this.field10502.field6694;
            this.field10502.method4874(0, var20, this.field10502.field6882);
            this.field10502.method3645(false);
            this.field10502.method3664(false);
            this.field10502.method3649(128);
            this.field10502.method3658(-2);
            this.field10502.method3639(this.field10502.field6827);
            this.field10502.method3641(8448, 7681);
            this.field10502.method3642(0, 34166, 770);
            this.field10502.method3669(0, 34167, 770);

            for(class568 var21 = this.field10503.method1281(1797943581); var21 != null; var21 = this.field10503.method1283((byte)-37)) {
               class68 var19 = (class68)var21;
               var19.method1348(var1, var2, var3, var4);
            }

            this.field10502.method3642(0, 5890, 768);
            this.field10502.method3669(0, 5890, 770);
            this.field10502.method3639((class203)null);
            this.field10502.method4874(var16, var20, this.field10502.field6882);
         }

         if (this.field10508 != null) {
            OpenGL.glPushMatrix();
            OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
            this.field10502.method3631(this.field10506, (class847)null, (class847)null, this.field10484);
            this.field10508.method4757(var1, var2, var3, var4, var5);
            OpenGL.glPopMatrix();
         }
      }

   }

   public void method3886(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      class783 var9 = this.field10502.method4800((short)-628);
      if (this.field10510 > 0 && var9 != null) {
         this.field10502.method3674();
         this.field10502.method3609(false);
         this.field10502.method3645(false);
         this.field10502.method3647(false);
         this.field10502.method3664(false);
         this.field10502.method3649(0);
         this.field10502.method3658(-2);
         this.field10502.method3639((class203)null);
         field10491[0] = (float)var3 / (128.0F * (float)(this.field7227 * -1212653763) * (float)var9.method2481());
         field10491[1] = 0.0F;
         field10491[2] = 0.0F;
         field10491[3] = 0.0F;
         field10491[4] = 0.0F;
         field10491[5] = (float)var3 / (128.0F * (float)(this.field7227 * -1212653763) * (float)var9.method2493());
         field10491[6] = 0.0F;
         field10491[7] = 0.0F;
         field10491[8] = 0.0F;
         field10491[9] = 0.0F;
         field10491[10] = 0.0F;
         field10491[11] = 0.0F;
         field10491[12] = -1.0F - ((float)(var4 * var3) / 128.0F - (float)(var1 * 2)) / (float)var9.method2481();
         field10491[13] = 1.0F - ((float)(2 * var2) + (float)(var7 * var3) / 128.0F) / (float)var9.method2493();
         field10491[14] = 0.0F;
         field10491[15] = 1.0F;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadMatrixf(field10491, 0);
         field10491[0] = 1.0F;
         field10491[1] = 0.0F;
         field10491[2] = 0.0F;
         field10491[3] = 0.0F;
         field10491[4] = 0.0F;
         field10491[5] = 0.0F;
         field10491[6] = 1.0F;
         field10491[7] = 0.0F;
         field10491[8] = 0.0F;
         field10491[9] = 1.0F;
         field10491[10] = 0.0F;
         field10491[11] = 0.0F;
         field10491[12] = 0.0F;
         field10491[13] = 0.0F;
         field10491[14] = 0.0F;
         field10491[15] = 1.0F;
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadMatrixf(field10491, 0);
         if ((this.field10490 & 7) != 0) {
            this.field10502.method3645(true);
            this.field10502.method3662();
         } else {
            this.field10502.method3645(false);
         }

         this.field10502.method3631(this.field10506, this.field10486, this.field10507, this.field10484);
         if (this.field10502.field6884.field10375.length < this.field10492 * 2) {
            this.field10502.field6884 = new class782(this.field10492 * 2);
         } else {
            this.field10502.field6884.field10376 = 0;
         }

         int var10 = 0;
         class782 var11 = this.field10502.field6884;
         int var12;
         int var13;
         int var14;
         short[] var15;
         int var16;
         if (this.field10502.field6830) {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.field7226 * -506105871 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if (var8[var14 - var4][var12 - var5]) {
                     var15 = this.field10517[var13];
                     if (var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method6362(var15[var16] & '\uffff', 16711935);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         } else {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.field7226 * -506105871 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if (var8[var14 - var4][var12 - var5]) {
                     var15 = this.field10517[var13];
                     if (var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method6363(var15[var16] & '\uffff', 1368367793);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         }

         if (var10 > 0) {
            class424 var17 = new class424(this.field10502, 5123, var11.field10375, var11.field10376 * 385051775);
            this.field10502.method3637(var17, 4, 0, var10);
         }
      }

   }

   public class770 method3889(int var1, int var2, class770 var3) {
      if ((this.field10513[var1][var2] & 1) == 0) {
         return null;
      } else {
         int var4 = this.field7227 * -1212653763 >> this.field10502.field6751;
         class464 var5 = (class464)var3;
         class464 var6;
         if (var5 != null && var5.method4110(var4, var4)) {
            var6 = var5;
            var5.method4111();
         } else {
            var6 = new class464(this.field10502, var4, var4);
         }

         var6.method4114(0, 0, var4, var4);
         this.method6526(var6, var1, var2);
         return var6;
      }
   }

   void method6526(class464 var1, int var2, int var3) {
      int[] var4 = this.field10504[var2][var3];
      int[] var5 = this.field10498[var2][var3];
      int var6 = var4.length;
      if (this.field10502.field6885.length < var6) {
         this.field10502.field6885 = new int[var6];
         this.field10502.field6886 = new int[var6];
      }

      int[] var7 = this.field10502.field6885;
      int[] var8 = this.field10502.field6886;

      int var9;
      for(var9 = 0; var9 < var6; ++var9) {
         var7[var9] = var4[var9] >> this.field10502.field6751;
         var8[var9] = var5[var9] >> this.field10502.field6751;
      }

      var9 = 0;

      while(var9 < var6) {
         int var10 = var7[var9];
         int var11 = var8[var9++];
         int var12 = var7[var9];
         int var13 = var8[var9++];
         int var14 = var7[var9];
         int var15 = var8[var9++];
         if ((var10 - var12) * (var13 - var15) - (var13 - var11) * (var14 - var12) > 0) {
            var1.method4112(var11, var13, var15, var10, var12, var14);
         }
      }

   }

   public void method3885(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      this.method6525(var1, var2, var3, var4, var5, var6);
   }

   public void method3882(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12) {
      class478 var13 = this.field10502.field8581;
      if (var6 != null && this.field10500 == null) {
         this.field10500 = new int[this.field7226 * -506105871][this.field7225 * -1148794921][];
      }

      if (var4 != null && this.field10499 == null) {
         this.field10499 = new int[this.field7226 * -506105871][this.field7225 * -1148794921][];
      }

      this.field10504[var1][var2] = var3;
      this.field10498[var1][var2] = var5;
      this.field10495[var1][var2] = var7;
      this.field10496[var1][var2] = var8;
      if (this.field10500 != null) {
         this.field10500[var1][var2] = var6;
      }

      if (this.field10499 != null) {
         this.field10499[var1][var2] = var4;
      }

      class724[] var14 = this.field10494[var1][var2] = new class724[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if ((this.field10490 & 32) != 0 && var16 != -1 && var13.method4625(var16, 602140986).field9378) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.field10427 * -1475891183) << 48 | (long)(var11.field10425 * 1996750669) << 42 | (long)(var11.field10426 * -1212608691) << 28 | (long)(var17 << 14) | (long)var16;

         class568 var20;
         for(var20 = this.field10516.method2331(var18); var20 != null; var20 = this.field10516.method2332(-1829773748)) {
            class724 var21 = (class724)var20;
            if (var21.field2516 == var16 && var21.field2513 == (float)var17 && var21.field2515.method6484(var11, (byte)-48)) {
               break;
            }
         }

         if (var20 == null) {
            var14[var15] = new class724(this, var16, var17, var11);
            this.field10516.method2337(var14[var15], var18);
         } else {
            var14[var15] = (class724)var20;
         }
      }

      if (var12) {
         this.field10513[var1][var2] = (byte)(this.field10513[var1][var2] | 1);
      }

      if (var7.length > this.field10511) {
         this.field10511 = var7.length;
      }

      this.field10510 += var7.length;
   }

   public void method3891(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.field10508 != null && var1 != null) {
         int var7 = var2 - (var3 * this.field10502.field6753 >> 8) >> this.field10502.field6751;
         int var8 = var4 - (var3 * this.field10502.field6713 >> 8) >> this.field10502.field6751;
         this.field10508.method4758(var1, var7, var8);
      }

   }

   public void method3892(class639 var1, int[] var2) {
      this.field10503.method1282(new class68(this.field10502, this, var1, var2), 136823922);
   }

   public void method3913(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = var11 != null ? new int[var16 * 3] : null;
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
         if (var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if (var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if (var11 != null) {
            var20[var25] = var11[var26];
         }

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

   public void method3894(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = var11 != null ? new int[var16 * 3] : null;
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
         if (var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if (var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if (var11 != null) {
            var20[var25] = var11[var26];
         }

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

   public void method3904(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      class783 var9 = this.field10502.method4800((short)8066);
      if (this.field10510 > 0 && var9 != null) {
         this.field10502.method3674();
         this.field10502.method3609(false);
         this.field10502.method3645(false);
         this.field10502.method3647(false);
         this.field10502.method3664(false);
         this.field10502.method3649(0);
         this.field10502.method3658(-2);
         this.field10502.method3639((class203)null);
         field10491[0] = (float)var3 / (128.0F * (float)(this.field7227 * -1212653763) * (float)var9.method2481());
         field10491[1] = 0.0F;
         field10491[2] = 0.0F;
         field10491[3] = 0.0F;
         field10491[4] = 0.0F;
         field10491[5] = (float)var3 / (128.0F * (float)(this.field7227 * -1212653763) * (float)var9.method2493());
         field10491[6] = 0.0F;
         field10491[7] = 0.0F;
         field10491[8] = 0.0F;
         field10491[9] = 0.0F;
         field10491[10] = 0.0F;
         field10491[11] = 0.0F;
         field10491[12] = -1.0F - ((float)(var4 * var3) / 128.0F - (float)(var1 * 2)) / (float)var9.method2481();
         field10491[13] = 1.0F - ((float)(2 * var2) + (float)(var7 * var3) / 128.0F) / (float)var9.method2493();
         field10491[14] = 0.0F;
         field10491[15] = 1.0F;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadMatrixf(field10491, 0);
         field10491[0] = 1.0F;
         field10491[1] = 0.0F;
         field10491[2] = 0.0F;
         field10491[3] = 0.0F;
         field10491[4] = 0.0F;
         field10491[5] = 0.0F;
         field10491[6] = 1.0F;
         field10491[7] = 0.0F;
         field10491[8] = 0.0F;
         field10491[9] = 1.0F;
         field10491[10] = 0.0F;
         field10491[11] = 0.0F;
         field10491[12] = 0.0F;
         field10491[13] = 0.0F;
         field10491[14] = 0.0F;
         field10491[15] = 1.0F;
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadMatrixf(field10491, 0);
         if ((this.field10490 & 7) != 0) {
            this.field10502.method3645(true);
            this.field10502.method3662();
         } else {
            this.field10502.method3645(false);
         }

         this.field10502.method3631(this.field10506, this.field10486, this.field10507, this.field10484);
         if (this.field10502.field6884.field10375.length < this.field10492 * 2) {
            this.field10502.field6884 = new class782(this.field10492 * 2);
         } else {
            this.field10502.field6884.field10376 = 0;
         }

         int var10 = 0;
         class782 var11 = this.field10502.field6884;
         int var12;
         int var13;
         int var14;
         short[] var15;
         int var16;
         if (this.field10502.field6830) {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.field7226 * -506105871 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if (var8[var14 - var4][var12 - var5]) {
                     var15 = this.field10517[var13];
                     if (var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method6362(var15[var16] & '\uffff', 16711935);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         } else {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.field7226 * -506105871 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if (var8[var14 - var4][var12 - var5]) {
                     var15 = this.field10517[var13];
                     if (var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method6363(var15[var16] & '\uffff', 1368367793);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         }

         if (var10 > 0) {
            class424 var17 = new class424(this.field10502, 5123, var11.field10375, var11.field10376 * 385051775);
            this.field10502.method3637(var17, 4, 0, var10);
         }
      }

   }

   public void method3917(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12) {
      class478 var13 = this.field10502.field8581;
      if (var6 != null && this.field10500 == null) {
         this.field10500 = new int[this.field7226 * -506105871][this.field7225 * -1148794921][];
      }

      if (var4 != null && this.field10499 == null) {
         this.field10499 = new int[this.field7226 * -506105871][this.field7225 * -1148794921][];
      }

      this.field10504[var1][var2] = var3;
      this.field10498[var1][var2] = var5;
      this.field10495[var1][var2] = var7;
      this.field10496[var1][var2] = var8;
      if (this.field10500 != null) {
         this.field10500[var1][var2] = var6;
      }

      if (this.field10499 != null) {
         this.field10499[var1][var2] = var4;
      }

      class724[] var14 = this.field10494[var1][var2] = new class724[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if ((this.field10490 & 32) != 0 && var16 != -1 && var13.method4625(var16, 620135548).field9378) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.field10427 * -1475891183) << 48 | (long)(var11.field10425 * 1996750669) << 42 | (long)(var11.field10426 * -1212608691) << 28 | (long)(var17 << 14) | (long)var16;

         class568 var20;
         for(var20 = this.field10516.method2331(var18); var20 != null; var20 = this.field10516.method2332(-2069832948)) {
            class724 var21 = (class724)var20;
            if (var21.field2516 == var16 && var21.field2513 == (float)var17 && var21.field2515.method6484(var11, (byte)30)) {
               break;
            }
         }

         if (var20 == null) {
            var14[var15] = new class724(this, var16, var17, var11);
            this.field10516.method2337(var14[var15], var18);
         } else {
            var14[var15] = (class724)var20;
         }
      }

      if (var12) {
         this.field10513[var1][var2] = (byte)(this.field10513[var1][var2] | 1);
      }

      if (var7.length > this.field10511) {
         this.field10511 = var7.length;
      }

      this.field10510 += var7.length;
   }

   public void method3897(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12) {
      class478 var13 = this.field10502.field8581;
      if (var6 != null && this.field10500 == null) {
         this.field10500 = new int[this.field7226 * -506105871][this.field7225 * -1148794921][];
      }

      if (var4 != null && this.field10499 == null) {
         this.field10499 = new int[this.field7226 * -506105871][this.field7225 * -1148794921][];
      }

      this.field10504[var1][var2] = var3;
      this.field10498[var1][var2] = var5;
      this.field10495[var1][var2] = var7;
      this.field10496[var1][var2] = var8;
      if (this.field10500 != null) {
         this.field10500[var1][var2] = var6;
      }

      if (this.field10499 != null) {
         this.field10499[var1][var2] = var4;
      }

      class724[] var14 = this.field10494[var1][var2] = new class724[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if ((this.field10490 & 32) != 0 && var16 != -1 && var13.method4625(var16, 1671695698).field9378) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.field10427 * -1475891183) << 48 | (long)(var11.field10425 * 1996750669) << 42 | (long)(var11.field10426 * -1212608691) << 28 | (long)(var17 << 14) | (long)var16;

         class568 var20;
         for(var20 = this.field10516.method2331(var18); var20 != null; var20 = this.field10516.method2332(-1821853943)) {
            class724 var21 = (class724)var20;
            if (var21.field2516 == var16 && var21.field2513 == (float)var17 && var21.field2515.method6484(var11, (byte)-53)) {
               break;
            }
         }

         if (var20 == null) {
            var14[var15] = new class724(this, var16, var17, var11);
            this.field10516.method2337(var14[var15], var18);
         } else {
            var14[var15] = (class724)var20;
         }
      }

      if (var12) {
         this.field10513[var1][var2] = (byte)(this.field10513[var1][var2] | 1);
      }

      if (var7.length > this.field10511) {
         this.field10511 = var7.length;
      }

      this.field10510 += var7.length;
   }

   public class770 method3907(int var1, int var2, class770 var3) {
      if ((this.field10513[var1][var2] & 1) == 0) {
         return null;
      } else {
         int var4 = this.field7227 * -1212653763 >> this.field10502.field6751;
         class464 var5 = (class464)var3;
         class464 var6;
         if (var5 != null && var5.method4110(var4, var4)) {
            var6 = var5;
            var5.method4111();
         } else {
            var6 = new class464(this.field10502, var4, var4);
         }

         var6.method4114(0, 0, var4, var4);
         this.method6526(var6, var1, var2);
         return var6;
      }
   }

   public void method3899() {
      if (this.field10510 > 0) {
         byte[][] var1 = new byte[this.field7226 * -506105871 + 1][this.field7225 * -1148794921 + 1];

         int var2;
         for(var2 = 1; var2 < this.field7226 * -506105871; ++var2) {
            for(int var3 = 1; var3 < this.field7225 * -1148794921; ++var3) {
               var1[var2][var3] = (byte)((this.field10512[var2 - 1][var3] >> 2) + (this.field10512[var2 + 1][var3] >> 3) + (this.field10512[var2][var3 - 1] >> 2) + (this.field10512[var2][var3 + 1] >> 3) + (this.field10512[var2][var3] >> 1));
            }
         }

         this.field10501 = new class568[this.field10516.method2334(-575368869)];
         this.field10516.method2333(this.field10501, 2072858153);

         for(var2 = 0; var2 < this.field10501.length; ++var2) {
            ((class724)this.field10501[var2]).method1708(this.field10510);
         }

         var2 = 24;
         if (this.field10500 != null) {
            var2 += 4;
         }

         if ((this.field10490 & 7) != 0) {
            var2 += 12;
         }

         I var64 = this.field10502.field6868.f(this.field10510 * var2, false);
         Stream var4 = new Stream(var64);
         class724[] var5 = new class724[this.field10510];
         int var6 = class236.method4619(this.field10510 / 4, 1877653209);
         if (var6 < 1) {
            var6 = 1;
         }

         class539 var7 = new class539(var6);
         class724[] var8 = new class724[this.field10511];

         int var9;
         int var10;
         for(var9 = 0; var9 < this.field7226 * -506105871; ++var9) {
            for(var10 = 0; var10 < this.field7225 * -1148794921; ++var10) {
               if (this.field10495[var9][var10] != null) {
                  class724[] var11 = this.field10494[var9][var10];
                  int[] var12 = this.field10504[var9][var10];
                  int[] var13 = this.field10498[var9][var10];
                  int[] var14 = this.field10496[var9][var10];
                  int[] var15 = this.field10495[var9][var10];
                  int[] var16 = this.field10499 != null ? this.field10499[var9][var10] : null;
                  int[] var17 = this.field10500 != null ? this.field10500[var9][var10] : null;
                  if (var14 == null) {
                     var14 = var15;
                  }

                  float var18 = this.field10497[var9][var10];
                  float var19 = this.field10514[var9][var10];
                  float var20 = this.field10515[var9][var10];
                  float var21 = this.field10497[var9][var10 + 1];
                  float var22 = this.field10514[var9][var10 + 1];
                  float var23 = this.field10515[var9][var10 + 1];
                  float var24 = this.field10497[var9 + 1][var10 + 1];
                  float var25 = this.field10514[var9 + 1][var10 + 1];
                  float var26 = this.field10515[var9 + 1][var10 + 1];
                  float var27 = this.field10497[var9 + 1][var10];
                  float var28 = this.field10514[var9 + 1][var10];
                  float var29 = this.field10515[var9 + 1][var10];
                  int var30 = var1[var9][var10] & 255;
                  int var31 = var1[var9][var10 + 1] & 255;
                  int var32 = var1[var9 + 1][var10 + 1] & 255;
                  int var33 = var1[var9 + 1][var10] & 255;
                  int var34 = 0;

                  int var37;
                  label343:
                  for(int var35 = 0; var35 < var15.length; ++var35) {
                     class724 var36 = var11[var35];

                     for(var37 = 0; var37 < var34; ++var37) {
                        if (var8[var37] == var36) {
                           continue label343;
                        }
                     }

                     var8[var34++] = var36;
                  }

                  short[] var80 = this.field10517[var10 * this.field7226 * -506105871 + var9] = new short[var15.length];

                  for(int var81 = 0; var81 < var15.length; ++var81) {
                     var37 = (var9 << this.field7228 * -2137349879) + var12[var81];
                     int var38 = (var10 << this.field7228 * -2137349879) + var13[var81];
                     int var39 = var37 >> this.field10487;
                     int var40 = var38 >> this.field10487;
                     int var41 = var15[var81];
                     int var42 = var14[var81];
                     int var43 = var16 != null ? var16[var81] : 0;
                     long var44 = (long)var42 << 48 | (long)var41 << 32 | (long)(var39 << 16) | (long)var40;
                     int var46 = var12[var81];
                     int var47 = var13[var81];
                     byte var48 = 74;
                     int var49 = 0;
                     float var50 = 1.0F;
                     float var51;
                     float var52;
                     float var53;
                     float var58;
                     int var82;
                     if (var46 == 0 && var47 == 0) {
                        var51 = var18;
                        var52 = var19;
                        var53 = var20;
                        var82 = var48 - var30;
                     } else if (var46 == 0 && var47 == this.field7227 * -1212653763) {
                        var51 = var21;
                        var52 = var22;
                        var53 = var23;
                        var82 = var48 - var31;
                     } else if (var46 == this.field7227 * -1212653763 && var47 == this.field7227 * -1212653763) {
                        var51 = var24;
                        var52 = var25;
                        var53 = var26;
                        var82 = var48 - var32;
                     } else if (var46 == this.field7227 * -1212653763 && var47 == 0) {
                        var51 = var27;
                        var52 = var28;
                        var53 = var29;
                        var82 = var48 - var33;
                     } else {
                        float var54 = (float)var46 / (float)(this.field7227 * -1212653763);
                        float var55 = (float)var47 / (float)(this.field7227 * -1212653763);
                        float var56 = var18 + (var27 - var18) * var54;
                        float var57 = var19 + (var28 - var19) * var54;
                        var58 = var20 + (var29 - var20) * var54;
                        float var59 = var21 + (var24 - var21) * var54;
                        float var60 = var22 + (var25 - var22) * var54;
                        float var61 = var23 + (var26 - var23) * var54;
                        var51 = var56 + (var59 - var56) * var55;
                        var52 = var57 + (var60 - var57) * var55;
                        var53 = var58 + (var61 - var58) * var55;
                        int var62 = var30 + ((var33 - var30) * var46 >> this.field7228 * -2137349879);
                        int var63 = var31 + ((var32 - var31) * var46 >> this.field7228 * -2137349879);
                        var82 = var48 - (var62 + ((var63 - var62) * var47 >> this.field7228 * -2137349879));
                     }

                     if (var41 != -1) {
                        int var83 = (var41 & 127) * var82 >> 7;
                        if (var83 < 2) {
                           var83 = 2;
                        } else if (var83 > 126) {
                           var83 = 126;
                        }

                        var49 = class134.field1398[var41 & 'ﾀ' | var83];
                        if ((this.field10490 & 7) == 0) {
                           var50 = this.field10502.field6811[0] * var51 + this.field10502.field6811[1] * var52 + this.field10502.field6811[2] * var53;
                           var50 = this.field10502.field6817 + var50 * (var50 > 0.0F ? this.field10502.field6818 : this.field10502.field6819);
                        }
                     }

                     class568 var85 = null;
                     if ((var37 & this.field10488 - 1) == 0 && (var38 & this.field10488 - 1) == 0) {
                        var85 = var7.method2331(var44);
                     }

                     int var84;
                     int var86;
                     if (var85 == null) {
                        if (var42 != var41) {
                           int var87 = (var42 & 127) * var82 >> 7;
                           if (var87 < 2) {
                              var87 = 2;
                           } else if (var87 > 126) {
                              var87 = 126;
                           }

                           var86 = class134.field1398[var42 & 'ﾀ' | var87];
                           if ((this.field10490 & 7) == 0) {
                              float var10000 = this.field10502.field6811[0] * var51 + this.field10502.field6811[1] * var52 + this.field10502.field6811[2] * var53;
                              var58 = this.field10502.field6817 + var50 * (var50 > 0.0F ? this.field10502.field6818 : this.field10502.field6819);
                              int var88 = var86 >> 16 & 255;
                              int var89 = var86 >> 8 & 255;
                              int var90 = var86 & 255;
                              var88 = (int)((float)var88 * var58);
                              if (var88 < 0) {
                                 var88 = 0;
                              } else if (var88 > 255) {
                                 var88 = 255;
                              }

                              var89 = (int)((float)var89 * var58);
                              if (var89 < 0) {
                                 var89 = 0;
                              } else if (var89 > 255) {
                                 var89 = 255;
                              }

                              var90 = (int)((float)var90 * var58);
                              if (var90 < 0) {
                                 var90 = 0;
                              } else if (var90 > 255) {
                                 var90 = 255;
                              }

                              var86 = var88 << 16 | var89 << 8 | var90;
                           }
                        } else {
                           var86 = var49;
                        }

                        if (this.field10502.field6830) {
                           var4.d((float)var37);
                           var4.d((float)(this.method3887(var37, var38, -1419532745) + var43));
                           var4.d((float)var38);
                           var4.p((byte)(var86 >> 16));
                           var4.p((byte)(var86 >> 8));
                           var4.p((byte)var86);
                           var4.p(-1);
                           var4.d((float)var37);
                           var4.d((float)var38);
                           if (this.field10500 != null) {
                              var4.d(var17 != null ? (float)(var17[var81] - 1) : 0.0F);
                           }

                           if ((this.field10490 & 7) != 0) {
                              var4.d(var51);
                              var4.d(var52);
                              var4.d(var53);
                           }
                        } else {
                           var4.u((float)var37);
                           var4.u((float)(this.method3887(var37, var38, -2119264527) + var43));
                           var4.u((float)var38);
                           var4.p((byte)(var86 >> 16));
                           var4.p((byte)(var86 >> 8));
                           var4.p((byte)var86);
                           var4.p(-1);
                           var4.u((float)var37);
                           var4.u((float)var38);
                           if (this.field10500 != null) {
                              var4.u(var17 != null ? (float)(var17[var81] - 1) : 0.0F);
                           }

                           if ((this.field10490 & 7) != 0) {
                              var4.u(var51);
                              var4.u(var52);
                              var4.u(var53);
                           }
                        }

                        var84 = this.field10493++;
                        var80[var81] = (short)var84;
                        if (var41 != -1) {
                           var5[var84] = var11[var81];
                        }

                        var7.method2337(new class129(var80[var81]), var44);
                     } else {
                        var80[var81] = ((class129)var85).field1084;
                        var84 = var80[var81] & '\uffff';
                        if (var41 != -1 && var11[var81].field641 * 7051297995265073167L < var5[var84].field641 * 7051297995265073167L) {
                           var5[var84] = var11[var81];
                        }
                     }

                     for(var86 = 0; var86 < var34; ++var86) {
                        var8[var86].method1706(var84, var49, var82, var50);
                     }

                     ++this.field10492;
                  }
               }
            }
         }

         for(var9 = 0; var9 < this.field10493; ++var9) {
            class724 var65 = var5[var9];
            if (var65 != null) {
               var65.method1707(var9);
            }
         }

         for(var9 = 0; var9 < this.field7226 * -506105871; ++var9) {
            for(var10 = 0; var10 < this.field7225 * -1148794921; ++var10) {
               short[] var67 = this.field10517[var10 * this.field7226 * -506105871 + var9];
               if (var67 != null) {
                  int var70 = 0;

                  for(int var72 = 0; var72 < var67.length; ++var70) {
                     int var73 = var67[var72++] & '\uffff';
                     int var74 = var67[var72++] & '\uffff';
                     int var75 = var67[var72++] & '\uffff';
                     class724 var76 = var5[var73];
                     class724 var77 = var5[var74];
                     class724 var78 = var5[var75];
                     class724 var79 = null;
                     if (var76 != null) {
                        var76.method1705(var9, var10, var70);
                        var79 = var76;
                     }

                     if (var77 != null) {
                        var77.method1705(var9, var10, var70);
                        if (var79 == null || var77.field641 * 7051297995265073167L < var79.field641 * 7051297995265073167L) {
                           var79 = var77;
                        }
                     }

                     if (var78 != null) {
                        var78.method1705(var9, var10, var70);
                        if (var79 == null || var78.field641 * 7051297995265073167L < var79.field641 * 7051297995265073167L) {
                           var79 = var78;
                        }
                     }

                     if (var79 != null) {
                        if (var76 != null) {
                           var79.method1707(var73);
                        }

                        if (var77 != null) {
                           var79.method1707(var74);
                        }

                        if (var78 != null) {
                           var79.method1707(var75);
                        }

                        var79.method1705(var9, var10, var70);
                     }
                  }
               }
            }
         }

         var4.x();
         this.field10505 = this.field10502.method3628(var2, var64, var4.f(), false);
         if (this.field10505 instanceof class409) {
            var64.t();
         }

         this.field10506 = new class847(this.field10505, 5126, 3, 0);
         this.field10507 = new class847(this.field10505, 5121, 4, 12);
         byte var66;
         if (this.field10500 != null) {
            this.field10484 = new class847(this.field10505, 5126, 3, 16);
            var66 = 28;
         } else {
            this.field10484 = new class847(this.field10505, 5126, 2, 16);
            var66 = 24;
         }

         if ((this.field10490 & 7) != 0) {
            this.field10486 = new class847(this.field10505, 5126, 3, var66);
         }

         long[] var68 = new long[this.field10501.length];

         for(int var69 = 0; var69 < this.field10501.length; ++var69) {
            class724 var71 = (class724)this.field10501[var69];
            var68[var69] = var71.field641 * 7051297995265073167L;
            var71.method1709(this.field10493);
         }

         class715.method2096(var68, this.field10501, (byte)-108);
         if (this.field10508 != null) {
            this.field10508.method4756();
         }
      } else {
         this.field10508 = null;
      }

      if ((this.field10489 & 2) == 0) {
         this.field10498 = null;
         this.field10504 = null;
         this.field10495 = null;
      }

      this.field10500 = null;
      this.field10496 = null;
      this.field10499 = null;
      this.field10494 = null;
      this.field10512 = null;
      this.field10516 = null;
      this.field10515 = null;
      this.field10514 = null;
      this.field10497 = null;
   }

   public void method3915(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      this.method6525(var1, var2, var3, var4, var5, var6);
   }

   public void method3896(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12) {
      class478 var13 = this.field10502.field8581;
      if (var6 != null && this.field10500 == null) {
         this.field10500 = new int[this.field7226 * -506105871][this.field7225 * -1148794921][];
      }

      if (var4 != null && this.field10499 == null) {
         this.field10499 = new int[this.field7226 * -506105871][this.field7225 * -1148794921][];
      }

      this.field10504[var1][var2] = var3;
      this.field10498[var1][var2] = var5;
      this.field10495[var1][var2] = var7;
      this.field10496[var1][var2] = var8;
      if (this.field10500 != null) {
         this.field10500[var1][var2] = var6;
      }

      if (this.field10499 != null) {
         this.field10499[var1][var2] = var4;
      }

      class724[] var14 = this.field10494[var1][var2] = new class724[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if ((this.field10490 & 32) != 0 && var16 != -1 && var13.method4625(var16, 156111587).field9378) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.field10427 * -1475891183) << 48 | (long)(var11.field10425 * 1996750669) << 42 | (long)(var11.field10426 * -1212608691) << 28 | (long)(var17 << 14) | (long)var16;

         class568 var20;
         for(var20 = this.field10516.method2331(var18); var20 != null; var20 = this.field10516.method2332(-2112383276)) {
            class724 var21 = (class724)var20;
            if (var21.field2516 == var16 && var21.field2513 == (float)var17 && var21.field2515.method6484(var11, (byte)12)) {
               break;
            }
         }

         if (var20 == null) {
            var14[var15] = new class724(this, var16, var17, var11);
            this.field10516.method2337(var14[var15], var18);
         } else {
            var14[var15] = (class724)var20;
         }
      }

      if (var12) {
         this.field10513[var1][var2] = (byte)(this.field10513[var1][var2] | 1);
      }

      if (var7.length > this.field10511) {
         this.field10511 = var7.length;
      }

      this.field10510 += var7.length;
   }

   public void method3900(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      class783 var9 = this.field10502.method4800((short)-5205);
      if (this.field10510 > 0 && var9 != null) {
         this.field10502.method3674();
         this.field10502.method3609(false);
         this.field10502.method3645(false);
         this.field10502.method3647(false);
         this.field10502.method3664(false);
         this.field10502.method3649(0);
         this.field10502.method3658(-2);
         this.field10502.method3639((class203)null);
         field10491[0] = (float)var3 / (128.0F * (float)(this.field7227 * -1212653763) * (float)var9.method2481());
         field10491[1] = 0.0F;
         field10491[2] = 0.0F;
         field10491[3] = 0.0F;
         field10491[4] = 0.0F;
         field10491[5] = (float)var3 / (128.0F * (float)(this.field7227 * -1212653763) * (float)var9.method2493());
         field10491[6] = 0.0F;
         field10491[7] = 0.0F;
         field10491[8] = 0.0F;
         field10491[9] = 0.0F;
         field10491[10] = 0.0F;
         field10491[11] = 0.0F;
         field10491[12] = -1.0F - ((float)(var4 * var3) / 128.0F - (float)(var1 * 2)) / (float)var9.method2481();
         field10491[13] = 1.0F - ((float)(2 * var2) + (float)(var7 * var3) / 128.0F) / (float)var9.method2493();
         field10491[14] = 0.0F;
         field10491[15] = 1.0F;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadMatrixf(field10491, 0);
         field10491[0] = 1.0F;
         field10491[1] = 0.0F;
         field10491[2] = 0.0F;
         field10491[3] = 0.0F;
         field10491[4] = 0.0F;
         field10491[5] = 0.0F;
         field10491[6] = 1.0F;
         field10491[7] = 0.0F;
         field10491[8] = 0.0F;
         field10491[9] = 1.0F;
         field10491[10] = 0.0F;
         field10491[11] = 0.0F;
         field10491[12] = 0.0F;
         field10491[13] = 0.0F;
         field10491[14] = 0.0F;
         field10491[15] = 1.0F;
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadMatrixf(field10491, 0);
         if ((this.field10490 & 7) != 0) {
            this.field10502.method3645(true);
            this.field10502.method3662();
         } else {
            this.field10502.method3645(false);
         }

         this.field10502.method3631(this.field10506, this.field10486, this.field10507, this.field10484);
         if (this.field10502.field6884.field10375.length < this.field10492 * 2) {
            this.field10502.field6884 = new class782(this.field10492 * 2);
         } else {
            this.field10502.field6884.field10376 = 0;
         }

         int var10 = 0;
         class782 var11 = this.field10502.field6884;
         int var12;
         int var13;
         int var14;
         short[] var15;
         int var16;
         if (this.field10502.field6830) {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.field7226 * -506105871 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if (var8[var14 - var4][var12 - var5]) {
                     var15 = this.field10517[var13];
                     if (var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method6362(var15[var16] & '\uffff', 16711935);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         } else {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.field7226 * -506105871 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if (var8[var14 - var4][var12 - var5]) {
                     var15 = this.field10517[var13];
                     if (var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method6363(var15[var16] & '\uffff', 1368367793);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         }

         if (var10 > 0) {
            class424 var17 = new class424(this.field10502, 5123, var11.field10375, var11.field10376 * 385051775);
            this.field10502.method3637(var17, 4, 0, var10);
         }
      }

   }

   public void method3903(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      class783 var9 = this.field10502.method4800((short)-3637);
      if (this.field10510 > 0 && var9 != null) {
         this.field10502.method3674();
         this.field10502.method3609(false);
         this.field10502.method3645(false);
         this.field10502.method3647(false);
         this.field10502.method3664(false);
         this.field10502.method3649(0);
         this.field10502.method3658(-2);
         this.field10502.method3639((class203)null);
         field10491[0] = (float)var3 / (128.0F * (float)(this.field7227 * -1212653763) * (float)var9.method2481());
         field10491[1] = 0.0F;
         field10491[2] = 0.0F;
         field10491[3] = 0.0F;
         field10491[4] = 0.0F;
         field10491[5] = (float)var3 / (128.0F * (float)(this.field7227 * -1212653763) * (float)var9.method2493());
         field10491[6] = 0.0F;
         field10491[7] = 0.0F;
         field10491[8] = 0.0F;
         field10491[9] = 0.0F;
         field10491[10] = 0.0F;
         field10491[11] = 0.0F;
         field10491[12] = -1.0F - ((float)(var4 * var3) / 128.0F - (float)(var1 * 2)) / (float)var9.method2481();
         field10491[13] = 1.0F - ((float)(2 * var2) + (float)(var7 * var3) / 128.0F) / (float)var9.method2493();
         field10491[14] = 0.0F;
         field10491[15] = 1.0F;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadMatrixf(field10491, 0);
         field10491[0] = 1.0F;
         field10491[1] = 0.0F;
         field10491[2] = 0.0F;
         field10491[3] = 0.0F;
         field10491[4] = 0.0F;
         field10491[5] = 0.0F;
         field10491[6] = 1.0F;
         field10491[7] = 0.0F;
         field10491[8] = 0.0F;
         field10491[9] = 1.0F;
         field10491[10] = 0.0F;
         field10491[11] = 0.0F;
         field10491[12] = 0.0F;
         field10491[13] = 0.0F;
         field10491[14] = 0.0F;
         field10491[15] = 1.0F;
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadMatrixf(field10491, 0);
         if ((this.field10490 & 7) != 0) {
            this.field10502.method3645(true);
            this.field10502.method3662();
         } else {
            this.field10502.method3645(false);
         }

         this.field10502.method3631(this.field10506, this.field10486, this.field10507, this.field10484);
         if (this.field10502.field6884.field10375.length < this.field10492 * 2) {
            this.field10502.field6884 = new class782(this.field10492 * 2);
         } else {
            this.field10502.field6884.field10376 = 0;
         }

         int var10 = 0;
         class782 var11 = this.field10502.field6884;
         int var12;
         int var13;
         int var14;
         short[] var15;
         int var16;
         if (this.field10502.field6830) {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.field7226 * -506105871 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if (var8[var14 - var4][var12 - var5]) {
                     var15 = this.field10517[var13];
                     if (var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method6362(var15[var16] & '\uffff', 16711935);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         } else {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.field7226 * -506105871 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if (var8[var14 - var4][var12 - var5]) {
                     var15 = this.field10517[var13];
                     if (var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method6363(var15[var16] & '\uffff', 1368367793);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         }

         if (var10 > 0) {
            class424 var17 = new class424(this.field10502, 5123, var11.field10375, var11.field10376 * 385051775);
            this.field10502.method3637(var17, 4, 0, var10);
         }
      }

   }

   public boolean method3908(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.field10508 != null && var1 != null) {
         int var7 = var2 - (var3 * this.field10502.field6753 >> 8) >> this.field10502.field6751;
         int var8 = var4 - (var3 * this.field10502.field6713 >> 8) >> this.field10502.field6751;
         return this.field10508.method4759(var1, var7, var8);
      } else {
         return false;
      }
   }

   public void method3916(class639 var1, int[] var2) {
      this.field10503.method1282(new class68(this.field10502, this, var1, var2), 2091242360);
   }

   public void method3906(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      class783 var9 = this.field10502.method4800((short)8148);
      if (this.field10510 > 0 && var9 != null) {
         this.field10502.method3674();
         this.field10502.method3609(false);
         this.field10502.method3645(false);
         this.field10502.method3647(false);
         this.field10502.method3664(false);
         this.field10502.method3649(0);
         this.field10502.method3658(-2);
         this.field10502.method3639((class203)null);
         field10491[0] = (float)var3 / (128.0F * (float)(this.field7227 * -1212653763) * (float)var9.method2481());
         field10491[1] = 0.0F;
         field10491[2] = 0.0F;
         field10491[3] = 0.0F;
         field10491[4] = 0.0F;
         field10491[5] = (float)var3 / (128.0F * (float)(this.field7227 * -1212653763) * (float)var9.method2493());
         field10491[6] = 0.0F;
         field10491[7] = 0.0F;
         field10491[8] = 0.0F;
         field10491[9] = 0.0F;
         field10491[10] = 0.0F;
         field10491[11] = 0.0F;
         field10491[12] = -1.0F - ((float)(var4 * var3) / 128.0F - (float)(var1 * 2)) / (float)var9.method2481();
         field10491[13] = 1.0F - ((float)(2 * var2) + (float)(var7 * var3) / 128.0F) / (float)var9.method2493();
         field10491[14] = 0.0F;
         field10491[15] = 1.0F;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadMatrixf(field10491, 0);
         field10491[0] = 1.0F;
         field10491[1] = 0.0F;
         field10491[2] = 0.0F;
         field10491[3] = 0.0F;
         field10491[4] = 0.0F;
         field10491[5] = 0.0F;
         field10491[6] = 1.0F;
         field10491[7] = 0.0F;
         field10491[8] = 0.0F;
         field10491[9] = 1.0F;
         field10491[10] = 0.0F;
         field10491[11] = 0.0F;
         field10491[12] = 0.0F;
         field10491[13] = 0.0F;
         field10491[14] = 0.0F;
         field10491[15] = 1.0F;
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadMatrixf(field10491, 0);
         if ((this.field10490 & 7) != 0) {
            this.field10502.method3645(true);
            this.field10502.method3662();
         } else {
            this.field10502.method3645(false);
         }

         this.field10502.method3631(this.field10506, this.field10486, this.field10507, this.field10484);
         if (this.field10502.field6884.field10375.length < this.field10492 * 2) {
            this.field10502.field6884 = new class782(this.field10492 * 2);
         } else {
            this.field10502.field6884.field10376 = 0;
         }

         int var10 = 0;
         class782 var11 = this.field10502.field6884;
         int var12;
         int var13;
         int var14;
         short[] var15;
         int var16;
         if (this.field10502.field6830) {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.field7226 * -506105871 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if (var8[var14 - var4][var12 - var5]) {
                     var15 = this.field10517[var13];
                     if (var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method6362(var15[var16] & '\uffff', 16711935);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         } else {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.field7226 * -506105871 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if (var8[var14 - var4][var12 - var5]) {
                     var15 = this.field10517[var13];
                     if (var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method6363(var15[var16] & '\uffff', 1368367793);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         }

         if (var10 > 0) {
            class424 var17 = new class424(this.field10502, 5123, var11.field10375, var11.field10376 * 385051775);
            this.field10502.method3637(var17, 4, 0, var10);
         }
      }

   }

   public void method3884(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = var11 != null ? new int[var16 * 3] : null;
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
         if (var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if (var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if (var11 != null) {
            var20[var25] = var11[var26];
         }

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

   public class770 method3902(int var1, int var2, class770 var3) {
      if ((this.field10513[var1][var2] & 1) == 0) {
         return null;
      } else {
         int var4 = this.field7227 * -1212653763 >> this.field10502.field6751;
         class464 var5 = (class464)var3;
         class464 var6;
         if (var5 != null && var5.method4110(var4, var4)) {
            var6 = var5;
            var5.method4111();
         } else {
            var6 = new class464(this.field10502, var4, var4);
         }

         var6.method4114(0, 0, var4, var4);
         this.method6526(var6, var1, var2);
         return var6;
      }
   }

   class291(class13 var1, int var2, int var3, int var4, int var5, int[][] var6, int[][] var7, int var8) {
      super(var4, var5, var8, var6);
      this.field10502 = var1;
      this.field10487 = this.field7228 * -2137349879 - 2;
      this.field10488 = 1 << this.field10487;
      this.field10489 = var2;
      this.field10490 = var3;
      this.field10499 = new int[var4][var5][];
      this.field10494 = new class724[var4][var5][];
      this.field10504 = new int[var4][var5][];
      this.field10498 = new int[var4][var5][];
      this.field10495 = new int[var4][var5][];
      this.field10496 = new int[var4][var5][];
      this.field10517 = new short[var4 * var5][];
      this.field10513 = new byte[var4][var5];
      this.field10512 = new byte[var4 + 1][var5 + 1];
      this.field10497 = new float[this.field7226 * -506105871 + 1][this.field7225 * -1148794921 + 1];
      this.field10514 = new float[this.field7226 * -506105871 + 1][this.field7225 * -1148794921 + 1];
      this.field10515 = new float[this.field7226 * -506105871 + 1][this.field7225 * -1148794921 + 1];

      for(int var9 = 1; var9 < this.field7225 * -1148794921; ++var9) {
         for(int var10 = 1; var10 < this.field7226 * -506105871; ++var10) {
            int var11 = var7[var10 + 1][var9] - var7[var10 - 1][var9];
            int var12 = var7[var10][var9 + 1] - var7[var10][var9 - 1];
            float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + 4 * var8 * var8 + var12 * var12)));
            this.field10497[var10][var9] = (float)var11 * var13;
            this.field10514[var10][var9] = (float)(-var8 * 2) * var13;
            this.field10515[var10][var9] = (float)var12 * var13;
         }
      }

      this.field10516 = new class539(128);
      if ((this.field10490 & 16) != 0) {
         this.field10508 = new class243(this.field10502, this);
      }

   }

   public void method3910(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.field10508 != null && var1 != null) {
         int var7 = var2 - (var3 * this.field10502.field6753 >> 8) >> this.field10502.field6751;
         int var8 = var4 - (var3 * this.field10502.field6713 >> 8) >> this.field10502.field6751;
         this.field10508.method4763(var1, var7, var8);
      }

   }

   public boolean method3911(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.field10508 != null && var1 != null) {
         int var7 = var2 - (var3 * this.field10502.field6753 >> 8) >> this.field10502.field6751;
         int var8 = var4 - (var3 * this.field10502.field6713 >> 8) >> this.field10502.field6751;
         return this.field10508.method4759(var1, var7, var8);
      } else {
         return false;
      }
   }

   public boolean method3912(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.field10508 != null && var1 != null) {
         int var7 = var2 - (var3 * this.field10502.field6753 >> 8) >> this.field10502.field6751;
         int var8 = var4 - (var3 * this.field10502.field6713 >> 8) >> this.field10502.field6751;
         return this.field10508.method4759(var1, var7, var8);
      } else {
         return false;
      }
   }

   public void method3883(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = var11 != null ? new int[var16 * 3] : null;
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
         if (var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if (var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if (var11 != null) {
            var20[var25] = var11[var26];
         }

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

   public void method3901(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      this.method6525(var1, var2, var3, var4, var5, var6);
   }

   public void method3914(int var1, int var2, int var3) {
      if ((this.field10512[var1][var2] & 255) < var3) {
         this.field10512[var1][var2] = (byte)var3;
      }

   }

   public void method3880(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.field10508 != null && var1 != null) {
         int var7 = var2 - (var3 * this.field10502.field6753 >> 8) >> this.field10502.field6751;
         int var8 = var4 - (var3 * this.field10502.field6713 >> 8) >> this.field10502.field6751;
         this.field10508.method4758(var1, var7, var8);
      }

   }

   public void method3895(class639 var1, int[] var2) {
      this.field10503.method1282(new class68(this.field10502, this, var1, var2), 1011020488);
   }

   public void method3890(class770 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (this.field10508 != null && var1 != null) {
         int var7 = var2 - (var3 * this.field10502.field6753 >> 8) >> this.field10502.field6751;
         int var8 = var4 - (var3 * this.field10502.field6713 >> 8) >> this.field10502.field6751;
         this.field10508.method4763(var1, var7, var8);
      }

   }
}
