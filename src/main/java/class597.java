public class class597 extends class879 {
   boolean field2025;
   int[] field2026;
   class258 field2027;
   class258 field2028;
   class585 field2029;
   float[][] field2030;
   short field2031;
   class609[] field2032;
   static int field2033 = 7;
   int field2034 = 0;
   short field2035;
   static int field2036 = 618520;
   float[] field2037;
   int field2038;
   int field2039;
   int field2040;
   static int field2041 = 4;
   class933[] field2042;
   int[] field2043;
   int[] field2044;
   int[] field2045;
   class396[] field2046;
   class87[] field2047;
   boolean field2048 = false;
   int field2049 = 0;
   short[] field2050;
   short[] field2051;
   short[] field2052;
   int[] field2053;
   float[][] field2054;
   int[] field2055;
   int[] field2056;
   static int field2057 = 618648;
   static int field2058 = 0;
   static int field2059 = 1;
   static int field2060 = 2;
   class257 field2061;
   short field2062;
   byte[] field2063;
   byte[] field2064;
   byte[] field2065;
   short[] field2066;
   short[] field2067;
   short[] field2068;
   boolean field2069 = false;
   int[][] field2070;
   int[][] field2071;
   boolean field2072 = false;
   int field2073;
   int field2074;
   int field2075;
   float[] field2076;
   boolean field2077 = false;
   class87[] field2078;
   static int field2079 = 4096;
   int field2080;
   class47[] field2081;
   class637[] field2082;
   int[][] field2083;
   boolean field2084 = false;
   int[] field2085;
   short field2086;
   short field2087;
   short field2088;
   short field2089;
   static int field2090 = -2;
   int field2091 = 0;
   short field2092;
   int[] field2093;
   static int field2094 = -1;
   short[] field2095;
   class597[] field2096;
   static int field2097 = 0;
   float[] field2098;
   float[] field2099;
   boolean field2100 = false;
   int[] field2101;
   static int field2102 = 4096;
   int[] field2103;
   int field2104 = 0;
   int[] field2105;
   int[] field2106;
   class597[] field2107;
   short[] field2108;

   class597(class257 var1, class25 var2, int var3, int var4, int var5, int var6) {
      this.field2061 = var1;
      this.field2038 = var3;
      this.field2039 = var4;
      this.field2040 = var5;
      class478 var7 = this.field2061.field8581;
      this.field2091 = var2.field6446;
      this.field2034 = var2.field6458;
      this.field2043 = var2.field6448;
      this.field2044 = var2.field6474;
      this.field2045 = var2.field6450;
      this.field2049 = var2.field6453;
      this.field2050 = var2.field6476;
      this.field2051 = var2.field6478;
      this.field2052 = var2.field6456;
      this.field2064 = var2.field6465;
      this.field2067 = var2.field6461;
      this.field2065 = var2.field6459;
      this.field2068 = var2.field6447;
      this.field2063 = var2.field6457;
      this.field2042 = var2.field6479;
      this.field2046 = var2.field6445;
      this.field2108 = var2.field6452;
      int[] var8 = new int[this.field2049];

      for(int var9 = 0; var9 < this.field2049; var8[var9] = var9++) {
         ;
      }

      long[] var54 = new long[this.field2049];
      boolean var10 = (this.field2038 & 256) != 0;

      int var11;
      int var14;
      byte var17;
      int var60;
      short var64;
      for(var11 = 0; var11 < this.field2049; ++var11) {
         int var12 = var8[var11];
         class414 var13 = null;
         var14 = 0;
         byte var15 = 0;
         byte var16 = 0;
         var17 = 0;
         if (var2.field6481 != null) {
            boolean var18 = false;

            for(int var19 = 0; var19 < var2.field6481.length; ++var19) {
               class606 var20 = var2.field6481[var19];
               if (var12 == var20.field8569) {
                  class526 var21 = class568.method550(var20.field8570, 222052700);
                  if (var21.field3665) {
                     var18 = true;
                  }

                  if (var21.field3659 != -1) {
                     class414 var22 = var7.method4625(var21.field3659, 133087577);
                     if (var22.field9382 == 2) {
                        this.field2048 = true;
                     }
                  }
               }
            }

            if (var18) {
               var54[var11] = Long.MAX_VALUE;
            }
         }

         var64 = -1;
         if (var2.field6449 != null) {
            var64 = var2.field6449[var12];
            if (var64 != -1) {
               var13 = var7.method4625(var64 & '\uffff', 2033118818);
               if ((var6 & 64) != 0 && var13.field9378) {
                  var64 = -1;
               } else {
                  var16 = var13.field9383;
                  var17 = var13.field9390;
               }
            }
         }

         boolean var67 = this.field2065 != null && this.field2065[var12] != 0 || var13 != null && var13.field9382 == 2;
         if ((var10 || var67) && this.field2064 != null) {
            var14 += this.field2064[var12] << 17;
         }

         if (var67) {
            var14 += 65536;
         }

         var14 += (var16 & 255) << 8;
         var14 += var17 & 255;
         var60 = var15 + ((var64 & '\uffff') << 16);
         var60 += var11 & '\uffff';
         var54[var11] = ((long)var14 << 32) + (long)var60;
         this.field2048 |= var67;
      }

      class544.method2368(var54, var8, (byte)-26);
      if (var2.field6481 != null) {
         this.field2080 = var2.field6481.length;
         this.field2081 = new class47[this.field2080];
         this.field2082 = new class637[this.field2080];

         for(var11 = 0; var11 < var2.field6481.length; ++var11) {
            class606 var56 = var2.field6481[var11];
            class526 var58 = class568.method550(var56.field8570, -919855044);
            var14 = class543.field3817[var2.field6461[var56.field8569] & '\uffff'] & 16777215;
            var14 |= 255 - (var2.field6459 != null ? var2.field6459[var56.field8569] & 255 : 0) << 24;
            this.field2081[var11] = new class47(var56.field8569, var2.field6476[var56.field8569], var2.field6478[var56.field8569], var2.field6456[var56.field8569], var58.field3663, var58.field3661, var58.field3659, var58.field3660, var58.field3662, var58.field3665, var56.field8571);
            this.field2082[var11] = new class637(var14);
         }
      }

      this.field2030 = new float[this.field2049][];
      this.field2054 = new float[this.field2049][];
      class251 var55 = this.method6095(var2, var8, this.field2049);
      class258 var57 = this.field2061.method4450(Thread.currentThread());
      float[] var59 = var57.field7899;
      boolean var62 = false;

      int var63;
      for(var60 = 0; var60 < this.field2049; ++var60) {
         var63 = var8[var60];
         if (var2.field6467 == null) {
            var17 = -1;
         } else {
            var17 = var2.field6467[var63];
         }

         var64 = var2.field6449 == null ? -1 : var2.field6449[var63];
         if (var64 != -1 && (var6 & 64) != 0) {
            class414 var68 = var7.method4625(var64 & '\uffff', 112924147);
            if (var68.field9378) {
               var64 = -1;
            }
         }

         if (var64 != -1) {
            var62 = true;
            float[] var69 = this.field2030[var63] = new float[3];
            float[] var70 = this.field2054[var63] = new float[3];
            boolean var72 = false;
            if (var17 == -1) {
               var69[0] = 0.0F;
               var70[0] = 1.0F;
               var69[1] = 1.0F;
               var70[1] = 1.0F;
               var69[2] = 0.0F;
               var70[2] = 0.0F;
            } else {
               int var65 = var17 & 255;
               byte var73 = var2.field6454[var65];
               short var23;
               short var24;
               short var25;
               float var31;
               float var32;
               float var33;
               float var43;
               float var44;
               float var45;
               float var46;
               float var47;
               float var48;
               if (var73 == 0) {
                  var23 = this.field2050[var63];
                  var24 = this.field2051[var63];
                  var25 = this.field2052[var63];
                  short var26 = var2.field6455[var65];
                  short var27 = var2.field6468[var65];
                  short var28 = var2.field6470[var65];
                  float var29 = (float)this.field2043[var26];
                  float var30 = (float)this.field2044[var26];
                  var31 = (float)this.field2045[var26];
                  var32 = (float)this.field2043[var27] - var29;
                  var33 = (float)this.field2044[var27] - var30;
                  float var34 = (float)this.field2045[var27] - var31;
                  float var35 = (float)this.field2043[var28] - var29;
                  float var36 = (float)this.field2044[var28] - var30;
                  float var37 = (float)this.field2045[var28] - var31;
                  float var38 = (float)this.field2043[var23] - var29;
                  float var39 = (float)this.field2044[var23] - var30;
                  float var40 = (float)this.field2045[var23] - var31;
                  float var41 = (float)this.field2043[var24] - var29;
                  float var42 = (float)this.field2044[var24] - var30;
                  var43 = (float)this.field2045[var24] - var31;
                  var44 = (float)this.field2043[var25] - var29;
                  var45 = (float)this.field2044[var25] - var30;
                  var46 = (float)this.field2045[var25] - var31;
                  var47 = var33 * var37 - var34 * var36;
                  var48 = var34 * var35 - var32 * var37;
                  float var49 = var32 * var36 - var33 * var35;
                  float var50 = var36 * var49 - var37 * var48;
                  float var51 = var37 * var47 - var35 * var49;
                  float var52 = var35 * var48 - var36 * var47;
                  float var53 = 1.0F / (var50 * var32 + var51 * var33 + var52 * var34);
                  var69[0] = (var50 * var38 + var51 * var39 + var52 * var40) * var53;
                  var69[1] = (var50 * var41 + var51 * var42 + var52 * var43) * var53;
                  var69[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
                  var50 = var33 * var49 - var34 * var48;
                  var51 = var34 * var47 - var32 * var49;
                  var52 = var32 * var48 - var33 * var47;
                  var53 = 1.0F / (var50 * var35 + var51 * var36 + var52 * var37);
                  var70[0] = (var50 * var38 + var51 * var39 + var52 * var40) * var53;
                  var70[1] = (var50 * var41 + var51 * var42 + var52 * var43) * var53;
                  var70[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
               } else {
                  var23 = this.field2050[var63];
                  var24 = this.field2051[var63];
                  var25 = this.field2052[var63];
                  int var74 = var55.field7851[var65];
                  int var75 = var55.field7848[var65];
                  int var76 = var55.field7847[var65];
                  float[] var77 = var55.field7849[var65];
                  byte var78 = var2.field6460[var65];
                  var31 = (float)var2.field6469[var65] / 256.0F;
                  if (var73 == 1) {
                     var32 = (float)var2.field6473[var65] / 1024.0F;
                     this.method5991(this.field2043[var23], this.field2044[var23], this.field2045[var23], var74, var75, var76, var77, var32, var78, var31, var59);
                     var69[0] = var59[0];
                     var70[0] = var59[1];
                     this.method5991(this.field2043[var24], this.field2044[var24], this.field2045[var24], var74, var75, var76, var77, var32, var78, var31, var59);
                     var69[1] = var59[0];
                     var70[1] = var59[1];
                     this.method5991(this.field2043[var25], this.field2044[var25], this.field2045[var25], var74, var75, var76, var77, var32, var78, var31, var59);
                     var69[2] = var59[0];
                     var70[2] = var59[1];
                     var33 = var32 / 2.0F;
                     if ((var78 & 1) == 0) {
                        if (var69[1] - var69[0] > var33) {
                           var69[1] -= var32;
                        } else if (var69[0] - var69[1] > var33) {
                           var69[1] += var32;
                        }

                        if (var69[2] - var69[0] > var33) {
                           var69[2] -= var32;
                        } else if (var69[0] - var69[2] > var33) {
                           var69[2] += var32;
                        }
                     } else {
                        if (var70[1] - var70[0] > var33) {
                           var70[1] -= var32;
                        } else if (var70[0] - var70[1] > var33) {
                           var70[1] += var32;
                        }

                        if (var70[2] - var70[0] > var33) {
                           var70[2] -= var32;
                        } else if (var70[0] - var70[2] > var33) {
                           var70[2] += var32;
                        }
                     }
                  } else if (var73 == 2) {
                     var32 = (float)var2.field6475[var65] / 256.0F;
                     var33 = (float)var2.field6480[var65] / 256.0F;
                     int var79 = this.field2043[var24] - this.field2043[var23];
                     int var80 = this.field2044[var24] - this.field2044[var23];
                     int var81 = this.field2045[var24] - this.field2045[var23];
                     int var82 = this.field2043[var25] - this.field2043[var23];
                     int var83 = this.field2044[var25] - this.field2044[var23];
                     int var84 = this.field2045[var25] - this.field2045[var23];
                     int var85 = var80 * var84 - var83 * var81;
                     int var86 = var81 * var82 - var84 * var79;
                     int var87 = var79 * var83 - var82 * var80;
                     var43 = 64.0F / (float)var2.field6471[var65];
                     var44 = 64.0F / (float)var2.field6472[var65];
                     var45 = 64.0F / (float)var2.field6473[var65];
                     var46 = ((float)var85 * var77[0] + (float)var86 * var77[1] + (float)var87 * var77[2]) / var43;
                     var47 = ((float)var85 * var77[3] + (float)var86 * var77[4] + (float)var87 * var77[5]) / var44;
                     var48 = ((float)var85 * var77[6] + (float)var86 * var77[7] + (float)var87 * var77[8]) / var45;
                     int var88 = this.method5942(var46, var47, var48);
                     this.method5943(this.field2043[var23], this.field2044[var23], this.field2045[var23], var74, var75, var76, var88, var77, var78, var31, var32, var33, var59);
                     var69[0] = var59[0];
                     var70[0] = var59[1];
                     this.method5943(this.field2043[var24], this.field2044[var24], this.field2045[var24], var74, var75, var76, var88, var77, var78, var31, var32, var33, var59);
                     var69[1] = var59[0];
                     var70[1] = var59[1];
                     this.method5943(this.field2043[var25], this.field2044[var25], this.field2045[var25], var74, var75, var76, var88, var77, var78, var31, var32, var33, var59);
                     var69[2] = var59[0];
                     var70[2] = var59[1];
                  } else if (var73 == 3) {
                     this.method6087(this.field2043[var23], this.field2044[var23], this.field2045[var23], var74, var75, var76, var77, var78, var31, var59);
                     var69[0] = var59[0];
                     var70[0] = var59[1];
                     this.method6087(this.field2043[var24], this.field2044[var24], this.field2045[var24], var74, var75, var76, var77, var78, var31, var59);
                     var69[1] = var59[0];
                     var70[1] = var59[1];
                     this.method6087(this.field2043[var25], this.field2044[var25], this.field2045[var25], var74, var75, var76, var77, var78, var31, var59);
                     var69[2] = var59[0];
                     var70[2] = var59[1];
                     if ((var78 & 1) == 0) {
                        if (var69[1] - var69[0] > 0.5F) {
                           --var69[1];
                        } else if (var69[0] - var69[1] > 0.5F) {
                           ++var69[1];
                        }

                        if (var69[2] - var69[0] > 0.5F) {
                           --var69[2];
                        } else if (var69[0] - var69[2] > 0.5F) {
                           ++var69[2];
                        }
                     } else {
                        if (var70[1] - var70[0] > 0.5F) {
                           --var70[1];
                        } else if (var70[0] - var70[1] > 0.5F) {
                           ++var70[1];
                        }

                        if (var70[2] - var70[0] > 0.5F) {
                           --var70[2];
                        } else if (var70[0] - var70[2] > 0.5F) {
                           ++var70[2];
                        }
                     }
                  }
               }
            }
         }
      }

      if (!var62) {
         this.field2054 = null;
         this.field2030 = null;
      }

      if (var2.field6451 != null && (this.field2038 & 32) != 0) {
         this.field2070 = var2.method3452(true);
      }

      if (var2.field6463 != null && (this.field2038 & 384) != 0) {
         this.field2071 = var2.method3453();
      }

      if (var2.field6481 != null && (this.field2038 & 1024) != 0) {
         this.field2083 = var2.method3462();
      }

      if (var2.field6449 != null) {
         this.field2066 = new short[this.field2049];
         boolean var61 = false;

         for(var63 = 0; var63 < this.field2049; ++var63) {
            short var66 = var2.field6449[var63];
            if (var66 != -1) {
               class414 var71 = this.field2061.field8581.method4625(var66, 1737067393);
               if ((var6 & 64) != 0 && var71.field9378) {
                  this.field2066[var63] = -1;
               } else {
                  this.field2066[var63] = var66;
                  var61 = true;
                  if (var71.field9382 == 2) {
                     this.field2048 = true;
                  }

                  if (var71.field9389 != 0 || var71.field9363 != 0) {
                     this.field2069 = true;
                  }
               }
            } else {
               this.field2066[var63] = -1;
            }
         }

         if (!var61) {
            this.field2066 = null;
         }
      } else {
         this.field2066 = null;
      }

      if (this.field2048 || this.field2081 != null) {
         this.field2095 = new short[this.field2049];

         for(var60 = 0; var60 < this.field2049; ++var60) {
            this.field2095[var60] = (short)var8[var60];
         }
      }

   }

   void method1415(class258 var1) {
      this.field2029 = var1.field7881;
      if (var1 != this.field2027) {
         this.field2027 = var1;
         this.field2026 = this.field2027.field7902;
         this.field2076 = this.field2027.field7886;
         this.field2098 = this.field2027.field7877;
         this.field2099 = this.field2027.field7888;
         this.field2037 = this.field2027.field7889;
         this.field2101 = this.field2027.field7890;
         this.field2053 = this.field2027.field7891;
         this.field2103 = this.field2027.field7892;
         this.field2085 = this.field2027.field7893;
         this.field2105 = this.field2027.field7867;
         this.field2106 = this.field2027.field7895;
      }

   }

   public boolean method5989() {
      return this.field2048;
   }

   void method1416(boolean var1) {
      if (this.field2104 == 1) {
         this.method1418();
      } else if (this.field2104 == 2) {
         if ((this.field2038 & 618648) == 0 && this.field2030 == null) {
            this.field2067 = null;
         }

         if (var1) {
            this.field2063 = null;
         }
      } else {
         this.method1440();
         int var2 = this.field2061.field7925;
         int var3 = this.field2061.field7926;
         int var4 = this.field2061.field7928;
         int var5 = this.field2061.field7930 >> 8;
         int var6 = 0;
         int var7 = 0;
         if (this.field2040 != 0) {
            var6 = this.field2061.field7945 * 768 / this.field2040;
            var7 = this.field2061.field7929 * 768 / this.field2040;
         }

         if (this.field2055 == null) {
            this.field2055 = new int[this.field2049];
            this.field2056 = new int[this.field2049];
            this.field2093 = new int[this.field2049];
         }

         for(int var8 = 0; var8 < this.field2049; ++var8) {
            byte var9;
            if (this.field2063 == null) {
               var9 = 0;
            } else {
               var9 = this.field2063[var8];
            }

            byte var10;
            if (this.field2065 == null) {
               var10 = 0;
            } else {
               var10 = this.field2065[var8];
            }

            short var11;
            if (this.field2066 == null) {
               var11 = -1;
            } else {
               var11 = this.field2066[var8];
            }

            if (var10 == -2) {
               var9 = 3;
            }

            if (var10 == -1) {
               var9 = 2;
            }

            int var12;
            int var16;
            if (var11 == -1) {
               int var17;
               int var18;
               short var19;
               int var21;
               if (var9 != 0) {
                  if (var9 == 1) {
                     var12 = this.field2067[var8] & '\uffff';
                     var21 = (var12 & 127) * this.field2039 >> 7;
                     var19 = class526.method2228(var12 & -128 | var21, (byte)0);
                     class609 var23 = this.field2032[var8];
                     var16 = var2 * var23.field8598 + var3 * var23.field8599 + var4 * var23.field8600 >> 16;
                     var17 = var16 > 256 ? var6 : var7;
                     var18 = (var5 >> 1) + (var17 * var16 >> 17);
                     this.field2055[var8] = var18 << 17 | class63.method1253(var19, var18, -952106382);
                     this.field2093[var8] = -1;
                  } else if (var9 == 3) {
                     this.field2055[var8] = 128;
                     this.field2093[var8] = -1;
                  } else {
                     this.field2093[var8] = -2;
                  }
               } else {
                  var12 = this.field2067[var8] & '\uffff';
                  var21 = (var12 & 127) * this.field2039 >> 7;
                  var19 = class526.method2228(var12 & -128 | var21, (byte)0);
                  class87 var22;
                  if (this.field2078 != null && this.field2078[this.field2050[var8]] != null) {
                     var22 = this.field2078[this.field2050[var8]];
                  } else {
                     var22 = this.field2047[this.field2050[var8]];
                  }

                  var16 = (var2 * var22.field1128 + var3 * var22.field1127 + var4 * var22.field1129) / var22.field1130 >> 16;
                  var17 = var16 > 256 ? var6 : var7;
                  var18 = (var5 >> 1) + (var17 * var16 >> 17);
                  this.field2055[var8] = var18 << 17 | class63.method1253(var19, var18, -952106382);
                  if (this.field2078 != null && this.field2078[this.field2051[var8]] != null) {
                     var22 = this.field2078[this.field2051[var8]];
                  } else {
                     var22 = this.field2047[this.field2051[var8]];
                  }

                  var16 = (var2 * var22.field1128 + var3 * var22.field1127 + var4 * var22.field1129) / var22.field1130 >> 16;
                  var17 = var16 > 256 ? var6 : var7;
                  var18 = (var5 >> 1) + (var17 * var16 >> 17);
                  this.field2056[var8] = var18 << 17 | class63.method1253(var19, var18, -952106382);
                  if (this.field2078 != null && this.field2078[this.field2052[var8]] != null) {
                     var22 = this.field2078[this.field2052[var8]];
                  } else {
                     var22 = this.field2047[this.field2052[var8]];
                  }

                  var16 = (var2 * var22.field1128 + var3 * var22.field1127 + var4 * var22.field1129) / var22.field1130 >> 16;
                  var17 = var16 > 256 ? var6 : var7;
                  var18 = (var5 >> 1) + (var17 * var16 >> 17);
                  this.field2093[var8] = var18 << 17 | class63.method1253(var19, var18, -952106382);
               }
            } else {
               var12 = this.field2067[var8] & '\uffff';
               int var14;
               int var15;
               if (var9 != 0) {
                  if (var9 == 1) {
                     class609 var20 = this.field2032[var8];
                     var14 = var2 * var20.field8598 + var3 * var20.field8599 + var4 * var20.field8600 >> 16;
                     var15 = var14 > 256 ? var6 : var7;
                     var16 = this.method1420((var5 >> 2) + (var15 * var14 >> 18));
                     this.field2055[var8] = var16 << 24 | this.method1417(var12, var11, var16);
                     this.field2093[var8] = -1;
                  } else {
                     this.field2093[var8] = -2;
                  }
               } else {
                  class87 var13;
                  if (this.field2078 != null && this.field2078[this.field2050[var8]] != null) {
                     var13 = this.field2078[this.field2050[var8]];
                  } else {
                     var13 = this.field2047[this.field2050[var8]];
                  }

                  var14 = (var2 * var13.field1128 + var3 * var13.field1127 + var4 * var13.field1129) / var13.field1130 >> 16;
                  var15 = var14 > 256 ? var6 : var7;
                  var16 = this.method1420((var5 >> 2) + (var15 * var14 >> 18));
                  this.field2055[var8] = var16 << 24 | this.method1417(var12, var11, var16);
                  if (this.field2078 != null && this.field2078[this.field2051[var8]] != null) {
                     var13 = this.field2078[this.field2051[var8]];
                  } else {
                     var13 = this.field2047[this.field2051[var8]];
                  }

                  var14 = (var2 * var13.field1128 + var3 * var13.field1127 + var4 * var13.field1129) / var13.field1130 >> 16;
                  var15 = var14 > 256 ? var6 : var7;
                  var16 = this.method1420((var5 >> 2) + (var15 * var14 >> 18));
                  this.field2056[var8] = var16 << 24 | this.method1417(var12, var11, var16);
                  if (this.field2078 != null && this.field2078[this.field2052[var8]] != null) {
                     var13 = this.field2078[this.field2052[var8]];
                  } else {
                     var13 = this.field2047[this.field2052[var8]];
                  }

                  var14 = (var2 * var13.field1128 + var3 * var13.field1127 + var4 * var13.field1129) / var13.field1130 >> 16;
                  var15 = var14 > 256 ? var6 : var7;
                  var16 = this.method1420((var5 >> 2) + (var15 * var14 >> 18));
                  this.field2093[var8] = var16 << 24 | this.method1417(var12, var11, var16);
               }
            }
         }

         this.field2047 = null;
         this.field2078 = null;
         this.field2032 = null;
         if ((this.field2038 & 618648) == 0 && this.field2030 == null) {
            this.field2067 = null;
         }

         if (var1) {
            this.field2063 = null;
         }

         this.field2104 = 2;
      }

   }

   int method1417(int var1, short var2, int var3) {
      int var4 = class134.field1398[this.method1421(var1, var3)];
      class414 var5 = this.field2061.field8581.method4625(var2 & '\uffff', 978917350);
      int var6 = var5.field9387 & 255;
      int var7;
      int var9;
      if (var6 != 0) {
         var7 = 131586 * var3;
         if (var6 == 256) {
            var4 = var7;
         } else {
            var9 = 256 - var6;
            var4 = ((var7 & 16711935) * var6 + (var4 & 16711935) * var9 & -16711936) + ((var7 & '\uff00') * var6 + (var4 & '\uff00') * var9 & 16711680) >> 8;
         }
      }

      var7 = var5.field9388 & 255;
      if (var7 != 0) {
         var7 += 256;
         int var8 = ((var4 & 16711680) >> 16) * var7;
         if (var8 > 65535) {
            var8 = 65535;
         }

         var9 = ((var4 & '\uff00') >> 8) * var7;
         if (var9 > 65535) {
            var9 = 65535;
         }

         int var10 = (var4 & 255) * var7;
         if (var10 > 65535) {
            var10 = 65535;
         }

         var4 = (var8 << 8 & 16711680) + (var9 & '\uff00') + (var10 >> 8);
      }

      return var4;
   }

   void method1418() {
      if (this.field2104 == 0) {
         this.method1436(false);
      } else if (this.field2061.field7946 > 1) {
         synchronized(this) {
            this.method1430();
         }
      } else {
         this.method1430();
      }

   }

   public void method5994(class879 var1, int var2, int var3, int var4, boolean var5) {
      class597 var6 = (class597)var1;
      if ((this.field2038 & 65536) != 65536) {
         throw new IllegalStateException("");
      } else if ((var6.field2038 & 65536) != 65536) {
         throw new IllegalStateException("");
      } else {
         this.method1415(this.field2061.method4450(Thread.currentThread()));
         this.method1433();
         this.method1440();
         var6.method1433();
         var6.method1440();
         ++field2097;
         int var7 = 0;
         int[] var8 = var6.field2043;
         int var9 = var6.field2034;

         int var10;
         for(var10 = 0; var10 < this.field2034; ++var10) {
            class87 var11 = this.field2047[var10];
            if (var11.field1130 != 0) {
               int var12 = this.field2044[var10] - var3;
               if (var12 >= var6.field2062 && var12 <= var6.field2088) {
                  int var13 = this.field2043[var10] - var2;
                  if (var13 >= var6.field2089 && var13 <= var6.field2035) {
                     int var14 = this.field2045[var10] - var4;
                     if (var14 >= var6.field2087 && var14 <= var6.field2092) {
                        for(int var15 = 0; var15 < var9; ++var15) {
                           class87 var16 = var6.field2047[var15];
                           if (var13 == var8[var15] && var14 == var6.field2045[var15] && var12 == var6.field2044[var15] && var16.field1130 != 0) {
                              if (this.field2078 == null) {
                                 this.field2078 = new class87[this.field2034];
                              }

                              if (var6.field2078 == null) {
                                 var6.field2078 = new class87[var9];
                              }

                              class87 var17 = this.field2078[var10];
                              if (var17 == null) {
                                 var17 = this.field2078[var10] = new class87(var11);
                              }

                              class87 var18 = var6.field2078[var15];
                              if (var18 == null) {
                                 var18 = var6.field2078[var15] = new class87(var16);
                              }

                              var17.field1128 += var16.field1128;
                              var17.field1127 += var16.field1127;
                              var17.field1129 += var16.field1129;
                              var17.field1130 += var16.field1130;
                              var18.field1128 += var11.field1128;
                              var18.field1127 += var11.field1127;
                              var18.field1129 += var11.field1129;
                              var18.field1130 += var11.field1130;
                              ++var7;
                              this.field2085[var10] = field2097;
                              this.field2105[var15] = field2097;
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var7 >= 3 && var5) {
            for(var10 = 0; var10 < this.field2049; ++var10) {
               if (this.field2085[this.field2050[var10]] == field2097 && this.field2085[this.field2051[var10]] == field2097 && this.field2085[this.field2052[var10]] == field2097) {
                  if (this.field2063 == null) {
                     this.field2063 = new byte[this.field2049];
                  }

                  this.field2063[var10] = 2;
               }
            }

            for(var10 = 0; var10 < var6.field2049; ++var10) {
               if (this.field2105[var6.field2050[var10]] == field2097 && this.field2105[var6.field2051[var10]] == field2097 && this.field2105[var6.field2052[var10]] == field2097) {
                  if (var6.field2063 == null) {
                     var6.field2063 = new byte[var6.field2049];
                  }

                  var6.field2063[var10] = 2;
               }
            }
         }

      }
   }

   public class879 method6017(byte var1, int var2, boolean var3) {
      this.method1441(Thread.currentThread());
      boolean var4 = false;
      class597 var5;
      class597 var6;
      if (var1 > 0 && var1 <= 7) {
         var5 = this.field2096[var1 - 1];
         var6 = this.field2107[var1 - 1];
         var4 = true;
      } else {
         var6 = var5 = new class597(this.field2061);
      }

      return this.method1419(var6, var5, var2, var4, var3);
   }

   class879 method1419(class597 var1, class597 var2, int var3, boolean var4, boolean var5) {
      var1.field2084 = this.field2084;
      if (this.field2084) {
         var1.field2035 = this.field2035;
         var1.field2088 = this.field2088;
         var1.field2092 = this.field2092;
         var1.field2089 = this.field2089;
         var1.field2062 = this.field2062;
         var1.field2087 = this.field2087;
         var1.field2031 = this.field2031;
         var1.field2086 = this.field2086;
      }

      var1.field2039 = this.field2039;
      var1.field2040 = this.field2040;
      var1.field2091 = this.field2091;
      var1.field2034 = this.field2034;
      var1.field2049 = this.field2049;
      var1.field2080 = this.field2080;
      if ((var3 & 256) != 0) {
         var1.field2048 = true;
      } else {
         var1.field2048 = this.field2048;
      }

      var1.field2069 = this.field2069;
      boolean var6 = (var3 & 7) == 7 | (var3 & 32) != 0;
      boolean var7 = var6 || (var3 & 1) != 0;
      boolean var8 = var6 || (var3 & 2) != 0;
      boolean var9 = var6 || (var3 & 4) != 0 || (var3 & 16) != 0;
      int var10;
      if (!var7 && !var8 && !var9) {
         var1.field2043 = this.field2043;
         var1.field2044 = this.field2044;
         var1.field2045 = this.field2045;
      } else {
         if (!var7) {
            var1.field2043 = this.field2043;
         } else {
            if (var2.field2043 != null && var2.field2043.length >= this.field2091) {
               var1.field2043 = var2.field2043;
            } else {
               var1.field2043 = var2.field2043 = new int[this.field2091];
            }

            for(var10 = 0; var10 < this.field2091; ++var10) {
               var1.field2043[var10] = this.field2043[var10];
            }
         }

         if (!var8) {
            var1.field2044 = this.field2044;
         } else {
            if (var2.field2044 != null && var2.field2044.length >= this.field2091) {
               var1.field2044 = var2.field2044;
            } else {
               var1.field2044 = var2.field2044 = new int[this.field2091];
            }

            for(var10 = 0; var10 < this.field2091; ++var10) {
               var1.field2044[var10] = this.field2044[var10];
            }
         }

         if (var9) {
            if (var2.field2045 != null && var2.field2045.length >= this.field2091) {
               var1.field2045 = var2.field2045;
            } else {
               var1.field2045 = var2.field2045 = new int[this.field2091];
            }

            for(var10 = 0; var10 < this.field2091; ++var10) {
               var1.field2045[var10] = this.field2045[var10];
            }
         } else {
            var1.field2045 = this.field2045;
         }
      }

      if ((var3 & 540800) != 0) {
         if (var2.field2067 != null && var2.field2067.length >= this.field2049) {
            var1.field2067 = var2.field2067;
         } else {
            var10 = this.field2049;
            var1.field2067 = var2.field2067 = new short[var10];
         }

         for(var10 = 0; var10 < this.field2049; ++var10) {
            var1.field2067[var10] = this.field2067[var10];
         }
      } else {
         var1.field2067 = this.field2067;
      }

      if ((var3 & 618520) != 0) {
         var1.field2104 = 0;
         var1.field2093 = null;
         var1.field2056 = null;
         var1.field2055 = null;
      } else if ((var3 & 128) != 0) {
         if (var5) {
            this.method1436(false);
         }

         if (this.field2055 != null) {
            if (var2.field2055 != null && var2.field2055.length >= this.field2049) {
               var1.field2055 = var2.field2055;
               var1.field2056 = var2.field2056;
               var1.field2093 = var2.field2093;
            } else {
               var10 = this.field2049;
               var1.field2055 = var2.field2055 = new int[var10];
               var1.field2056 = var2.field2056 = new int[var10];
               var1.field2093 = var2.field2093 = new int[var10];
            }

            for(var10 = 0; var10 < this.field2049; ++var10) {
               var1.field2055[var10] = this.field2055[var10];
               var1.field2056[var10] = this.field2056[var10];
               var1.field2093[var10] = this.field2093[var10];
            }
         }

         var1.field2104 = this.field2104;
      } else {
         if (var5) {
            this.method1436(false);
         }

         var1.field2055 = this.field2055;
         var1.field2056 = this.field2056;
         var1.field2093 = this.field2093;
         var1.field2104 = this.field2104;
      }

      if ((var3 & 256) != 0) {
         if (var2.field2065 != null && var2.field2065.length >= this.field2049) {
            var1.field2065 = var2.field2065;
         } else {
            var10 = this.field2049;
            var1.field2065 = var2.field2065 = new byte[var10];
         }

         if (this.field2065 != null) {
            for(var10 = 0; var10 < this.field2049; ++var10) {
               var1.field2065[var10] = this.field2065[var10];
            }
         } else {
            for(var10 = 0; var10 < this.field2049; ++var10) {
               var1.field2065[var10] = 0;
            }
         }
      } else {
         var1.field2065 = this.field2065;
      }

      if ((var3 & 8) == 0 && (var3 & 16) == 0) {
         if (var5) {
            this.method1440();
         }

         var1.field2047 = this.field2047;
         var1.field2032 = this.field2032;
      } else {
         if (var2.field2047 != null && var2.field2047.length >= this.field2034) {
            var1.field2047 = var2.field2047;
         } else {
            var10 = this.field2034;
            var1.field2047 = var2.field2047 = new class87[var10];
         }

         if (this.field2047 != null) {
            for(var10 = 0; var10 < this.field2034; ++var10) {
               var1.field2047[var10] = new class87(this.field2047[var10]);
            }
         } else {
            var1.field2047 = null;
         }

         if (this.field2032 != null) {
            if (var2.field2032 != null && var2.field2032.length >= this.field2049) {
               var1.field2032 = var2.field2032;
            } else {
               var10 = this.field2049;
               var1.field2032 = var2.field2032 = new class609[var10];
            }

            for(var10 = 0; var10 < this.field2049; ++var10) {
               var1.field2032[var10] = this.field2032[var10] != null ? new class609(this.field2032[var10]) : null;
            }
         } else {
            var1.field2032 = null;
         }
      }

      if ((var3 & '耀') != 0) {
         if (this.field2066 == null) {
            var1.field2066 = null;
         } else {
            if (var2.field2066 != null && var2.field2066.length >= this.field2049) {
               var1.field2066 = var2.field2066;
            } else {
               var10 = this.field2049;
               var1.field2066 = var2.field2066 = new short[var10];
            }

            for(var10 = 0; var10 < this.field2049; ++var10) {
               var1.field2066[var10] = this.field2066[var10];
            }
         }
      } else {
         var1.field2066 = this.field2066;
      }

      if ((var3 & 65536) != 0) {
         if (this.field2063 == null) {
            var1.field2063 = null;
         } else {
            if (var2.field2063 != null && var2.field2063.length >= this.field2049) {
               var1.field2063 = var2.field2063;
            } else {
               var10 = var4 ? this.field2049 + 100 : this.field2049;
               var1.field2063 = var2.field2063 = new byte[var10];
            }

            for(var10 = 0; var10 < this.field2049; ++var10) {
               var1.field2063[var10] = this.field2063[var10];
            }
         }
      } else {
         var1.field2063 = this.field2063;
      }

      if ((var3 & '얀') != 0) {
         if (var2.field2082 != null && var2.field2082.length >= this.field2080) {
            var1.field2082 = var2.field2082;

            for(var10 = 0; var10 < this.field2080; ++var10) {
               var1.field2082[var10].method5933(this.field2082[var10], 1628993725);
            }
         } else {
            var10 = this.field2080;
            var1.field2082 = var2.field2082 = new class637[var10];

            for(int var11 = 0; var11 < this.field2080; ++var11) {
               var1.field2082[var11] = this.field2082[var11].method5932(-1999450159);
            }
         }
      } else {
         var1.field2082 = this.field2082;
      }

      if (this.field2030 != null && (var3 & 16) != 0) {
         if (var2.field2030 != null && var2.field2030.length >= this.field2049) {
            var1.field2030 = var2.field2030;
         } else {
            var10 = var4 ? this.field2049 + 100 : this.field2049;
            var1.field2030 = var2.field2030 = new float[var10][3];
         }

         for(var10 = 0; var10 < this.field2049; ++var10) {
            if (this.field2030[var10] != null) {
               var1.field2030[var10][0] = this.field2030[var10][0];
               var1.field2030[var10][1] = this.field2030[var10][1];
               var1.field2030[var10][2] = this.field2030[var10][2];
            }
         }

         if (var2.field2054 != null && var2.field2054.length >= this.field2049) {
            var1.field2054 = var2.field2054;
         } else {
            var10 = var4 ? this.field2049 + 100 : this.field2049;
            var1.field2054 = var2.field2054 = new float[var10][3];
         }

         for(var10 = 0; var10 < this.field2049; ++var10) {
            if (this.field2054[var10] != null) {
               var1.field2054[var10][0] = this.field2054[var10][0];
               var1.field2054[var10][1] = this.field2054[var10][1];
               var1.field2054[var10][2] = this.field2054[var10][2];
            }
         }
      } else {
         var1.field2030 = this.field2030;
         var1.field2054 = this.field2054;
      }

      var1.field2070 = this.field2070;
      var1.field2071 = this.field2071;
      var1.field2083 = this.field2083;
      var1.field2108 = this.field2108;
      var1.field2068 = this.field2068;
      var1.field2064 = this.field2064;
      var1.field2050 = this.field2050;
      var1.field2051 = this.field2051;
      var1.field2052 = this.field2052;
      var1.field2042 = this.field2042;
      var1.field2046 = this.field2046;
      var1.field2081 = this.field2081;
      var1.field2095 = this.field2095;
      var1.field2038 = var3;
      return var1;
   }

   int method1420(int var1) {
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return var1;
   }

   public void method6093() {
   }

   int method1421(int var1, int var2) {
      var2 = var2 * (var1 & 127) >> 7;
      if (var2 < 2) {
         var2 = 2;
      } else if (var2 > 126) {
         var2 = 126;
      }

      return (var1 & 'ﾀ') + var2;
   }

   public void method5951(int var1) {
      if ((this.field2038 & 13) != 13) {
         throw new IllegalStateException();
      } else {
         if (this.field2047 != null) {
            if (var1 == 4096) {
               this.method1423();
            } else if (var1 == 8192) {
               this.method1424();
            } else if (var1 == 12288) {
               this.method1425();
            } else {
               int var2 = class703.field3413[var1];
               int var3 = class703.field3404[var1];
               synchronized(this) {
                  int var5;
                  int var6;
                  for(var5 = 0; var5 < this.field2034; ++var5) {
                     var6 = this.field2045[var5] * var2 + this.field2043[var5] * var3 >> 14;
                     this.field2045[var5] = this.field2045[var5] * var3 - this.field2043[var5] * var2 >> 14;
                     this.field2043[var5] = var6;
                     if (this.field2047[var5] != null) {
                        var6 = this.field2047[var5].field1129 * var2 + this.field2047[var5].field1128 * var3 >> 14;
                        this.field2047[var5].field1129 = this.field2047[var5].field1129 * var3 - this.field2047[var5].field1128 * var2 >> 14;
                        this.field2047[var5].field1128 = var6;
                     }
                  }

                  if (this.field2032 != null) {
                     for(var5 = 0; var5 < this.field2049; ++var5) {
                        if (this.field2032[var5] != null) {
                           var6 = this.field2032[var5].field8600 * var2 + this.field2032[var5].field8598 * var3 >> 14;
                           this.field2032[var5].field8600 = this.field2032[var5].field8600 * var3 - this.field2032[var5].field8598 * var2 >> 14;
                           this.field2032[var5].field8598 = var6;
                        }
                     }
                  }

                  for(var5 = this.field2034; var5 < this.field2091; ++var5) {
                     var6 = this.field2045[var5] * var2 + this.field2043[var5] * var3 >> 14;
                     this.field2045[var5] = this.field2045[var5] * var3 - this.field2043[var5] * var2 >> 14;
                     this.field2043[var5] = var6;
                  }

                  this.field2104 = 0;
                  this.field2084 = false;
               }
            }
         } else {
            this.method6016(var1);
         }

      }
   }

   void method1422() {
      synchronized(this) {
         for(int var2 = 0; var2 < this.field2091; ++var2) {
            this.field2043[var2] = -this.field2043[var2];
            this.field2045[var2] = -this.field2045[var2];
         }

         this.method1426();
      }
   }

   void method1423() {
      synchronized(this) {
         int var2;
         int var3;
         for(var2 = 0; var2 < this.field2034; ++var2) {
            var3 = this.field2043[var2];
            this.field2043[var2] = this.field2045[var2];
            this.field2045[var2] = -var3;
            if (this.field2047[var2] != null) {
               var3 = this.field2047[var2].field1128;
               this.field2047[var2].field1128 = this.field2047[var2].field1129;
               this.field2047[var2].field1129 = -var3;
            }
         }

         if (this.field2032 != null) {
            for(var2 = 0; var2 < this.field2049; ++var2) {
               if (this.field2032[var2] != null) {
                  var3 = this.field2032[var2].field8598;
                  this.field2032[var2].field8598 = this.field2032[var2].field8600;
                  this.field2032[var2].field8600 = -var3;
               }
            }
         }

         for(var2 = this.field2034; var2 < this.field2091; ++var2) {
            var3 = this.field2043[var2];
            this.field2043[var2] = this.field2045[var2];
            this.field2045[var2] = -var3;
         }

         this.field2104 = 0;
         this.field2084 = false;
      }
   }

   void method1424() {
      synchronized(this) {
         int var2;
         for(var2 = 0; var2 < this.field2034; ++var2) {
            this.field2043[var2] = -this.field2043[var2];
            this.field2045[var2] = -this.field2045[var2];
            if (this.field2047[var2] != null) {
               this.field2047[var2].field1128 = -this.field2047[var2].field1128;
               this.field2047[var2].field1129 = -this.field2047[var2].field1129;
            }
         }

         if (this.field2032 != null) {
            for(var2 = 0; var2 < this.field2049; ++var2) {
               if (this.field2032[var2] != null) {
                  this.field2032[var2].field8598 = -this.field2032[var2].field8598;
                  this.field2032[var2].field8600 = -this.field2032[var2].field8600;
               }
            }
         }

         for(var2 = this.field2034; var2 < this.field2091; ++var2) {
            this.field2043[var2] = -this.field2043[var2];
            this.field2045[var2] = -this.field2045[var2];
         }

         this.field2104 = 0;
         this.field2084 = false;
      }
   }

   void method1425() {
      synchronized(this) {
         int var2;
         int var3;
         for(var2 = 0; var2 < this.field2034; ++var2) {
            var3 = this.field2045[var2];
            this.field2045[var2] = this.field2043[var2];
            this.field2043[var2] = -var3;
            if (this.field2047[var2] != null) {
               var3 = this.field2047[var2].field1129;
               this.field2047[var2].field1129 = this.field2047[var2].field1128;
               this.field2047[var2].field1128 = -var3;
            }
         }

         if (this.field2032 != null) {
            for(var2 = 0; var2 < this.field2049; ++var2) {
               if (this.field2032[var2] != null) {
                  var3 = this.field2032[var2].field8600;
                  this.field2032[var2].field8600 = this.field2032[var2].field8598;
                  this.field2032[var2].field8598 = -var3;
               }
            }
         }

         for(var2 = this.field2034; var2 < this.field2091; ++var2) {
            var3 = this.field2045[var2];
            this.field2045[var2] = this.field2043[var2];
            this.field2043[var2] = -var3;
         }

         this.field2104 = 0;
         this.field2084 = false;
      }
   }

   public void method5952(int var1) {
      if ((this.field2038 & 6) != 6) {
         throw new IllegalStateException();
      } else {
         int var2 = class703.field3413[var1];
         int var3 = class703.field3404[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.field2091; ++var5) {
               int var6 = this.field2044[var5] * var3 - this.field2045[var5] * var2 >> 14;
               this.field2045[var5] = this.field2044[var5] * var2 + this.field2045[var5] * var3 >> 14;
               this.field2044[var5] = var6;
            }

            this.method1426();
         }
      }
   }

   public void method6041(int var1) {
      if ((this.field2038 & 3) != 3) {
         throw new IllegalStateException();
      } else {
         int var2 = class703.field3413[var1];
         int var3 = class703.field3404[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.field2091; ++var5) {
               int var6 = this.field2044[var5] * var2 + this.field2043[var5] * var3 >> 14;
               this.field2044[var5] = this.field2044[var5] * var3 - this.field2043[var5] * var2 >> 14;
               this.field2043[var5] = var6;
            }

            this.method1426();
         }
      }
   }

   public void method5955(int var1, int var2, int var3) {
      if (var1 != 128 && (this.field2038 & 1) != 1) {
         throw new IllegalStateException();
      } else if (var2 != 128 && (this.field2038 & 2) != 2) {
         throw new IllegalStateException();
      } else if (var3 != 128 && (this.field2038 & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.field2091; ++var5) {
               this.field2043[var5] = this.field2043[var5] * var1 >> 7;
               this.field2044[var5] = this.field2044[var5] * var2 >> 7;
               this.field2045[var5] = this.field2045[var5] * var3 >> 7;
            }

            this.field2084 = false;
         }
      }
   }

   public void method5961(int var1, int var2, class454 var3, class454 var4, int var5, int var6, int var7) {
      if (var1 == 3) {
         if ((this.field2038 & 7) != 7) {
            throw new IllegalStateException();
         }
      } else if ((this.field2038 & 2) != 2) {
         throw new IllegalStateException();
      }

      if (!this.field2084) {
         this.method1433();
      }

      int var8 = var5 + this.field2089;
      int var9 = var5 + this.field2035;
      int var10 = var7 + this.field2087;
      int var11 = var7 + this.field2092;
      if (var1 == 4 || var8 >= 0 && var9 + var3.field7227 >> var3.field7228 < var3.field7226 && var10 >= 0 && var11 + var3.field7227 >> var3.field7228 < var3.field7225) {
         int[][] var12 = var3.field7229;
         int[][] var13 = null;
         if (var4 != null) {
            var13 = var4.field7229;
         }

         if (var1 != 4 && var1 != 5) {
            var8 >>= var3.field7228;
            var9 = var9 + (var3.field7227 - 1) >> var3.field7228;
            var10 >>= var3.field7228;
            var11 = var11 + (var3.field7227 - 1) >> var3.field7228;
            if (var12[var8][var10] == var6 && var12[var9][var10] == var6 && var12[var8][var11] == var6 && var12[var9][var11] == var6) {
               return;
            }
         } else if (var4 == null || var8 < 0 || var9 + var4.field7227 >> var4.field7228 >= var4.field7226 || var10 < 0 || var11 + var4.field7227 >> var4.field7228 >= var4.field7225) {
            return;
         }

         synchronized(this) {
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var25;
            if (var1 == 1) {
               var15 = var3.field7227 - 1;

               for(var16 = 0; var16 < this.field2034; ++var16) {
                  var17 = this.field2043[var16] + var5;
                  var18 = this.field2045[var16] + var7;
                  var19 = var17 & var15;
                  var20 = var18 & var15;
                  var21 = var17 >> var3.field7228;
                  var22 = var18 >> var3.field7228;
                  var23 = var12[var21][var22] * (var3.field7227 - var19) + var12[var21 + 1][var22] * var19 >> var3.field7228;
                  var24 = var12[var21][var22 + 1] * (var3.field7227 - var19) + var12[var21 + 1][var22 + 1] * var19 >> var3.field7228;
                  var25 = var23 * (var3.field7227 - var20) + var24 * var20 >> var3.field7228;
                  this.field2044[var16] = this.field2044[var16] + var25 - var6;
               }

               for(var16 = this.field2034; var16 < this.field2091; ++var16) {
                  var17 = this.field2043[var16] + var5;
                  var18 = this.field2045[var16] + var7;
                  var19 = var17 & var15;
                  var20 = var18 & var15;
                  var21 = var17 >> var3.field7228;
                  var22 = var18 >> var3.field7228;
                  if (var21 >= 0 && var21 < var12.length - 1 && var22 >= 0 && var22 < var12[0].length - 1) {
                     var23 = var12[var21][var22] * (var3.field7227 - var19) + var12[var21 + 1][var22] * var19 >> var3.field7228;
                     var24 = var12[var21][var22 + 1] * (var3.field7227 - var19) + var12[var21 + 1][var22 + 1] * var19 >> var3.field7228;
                     var25 = var23 * (var3.field7227 - var20) + var24 * var20 >> var3.field7228;
                     this.field2044[var16] = this.field2044[var16] + var25 - var6;
                  }
               }
            } else {
               int var26;
               if (var1 == 2) {
                  var15 = var3.field7227 - 1;

                  for(var16 = 0; var16 < this.field2034; ++var16) {
                     var17 = (this.field2044[var16] << 16) / this.field2062;
                     if (var17 < var2) {
                        var18 = this.field2043[var16] + var5;
                        var19 = this.field2045[var16] + var7;
                        var20 = var18 & var15;
                        var21 = var19 & var15;
                        var22 = var18 >> var3.field7228;
                        var23 = var19 >> var3.field7228;
                        var24 = var12[var22][var23] * (var3.field7227 - var20) + var12[var22 + 1][var23] * var20 >> var3.field7228;
                        var25 = var12[var22][var23 + 1] * (var3.field7227 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.field7228;
                        var26 = var24 * (var3.field7227 - var21) + var25 * var21 >> var3.field7228;
                        this.field2044[var16] += (var26 - var6) * (var2 - var17) / var2;
                     } else {
                        this.field2044[var16] = this.field2044[var16];
                     }
                  }

                  for(var16 = this.field2034; var16 < this.field2091; ++var16) {
                     var17 = (this.field2044[var16] << 16) / this.field2062;
                     if (var17 < var2) {
                        var18 = this.field2043[var16] + var5;
                        var19 = this.field2045[var16] + var7;
                        var20 = var18 & var15;
                        var21 = var19 & var15;
                        var22 = var18 >> var3.field7228;
                        var23 = var19 >> var3.field7228;
                        if (var22 >= 0 && var22 < var3.field7226 - 1 && var23 >= 0 && var23 < var3.field7225 - 1) {
                           var24 = var12[var22][var23] * (var3.field7227 - var20) + var12[var22 + 1][var23] * var20 >> var3.field7228;
                           var25 = var12[var22][var23 + 1] * (var3.field7227 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.field7228;
                           var26 = var24 * (var3.field7227 - var21) + var25 * var21 >> var3.field7228;
                           this.field2044[var16] += (var26 - var6) * (var2 - var17) / var2;
                        }
                     } else {
                        this.field2044[var16] = this.field2044[var16];
                     }
                  }
               } else if (var1 == 3) {
                  var15 = (var2 & 255) * 4;
                  var16 = (var2 >> 8 & 255) * 4;
                  var17 = (var2 >> 16 & 255) << 6;
                  var18 = (var2 >> 24 & 255) << 6;
                  if (var5 - (var15 >> 1) < 0 || var5 + (var15 >> 1) + var3.field7227 >= var3.field7226 << var3.field7228 || var7 - (var16 >> 1) < 0 || var7 + (var16 >> 1) + var3.field7227 >= var3.field7225 << var3.field7228) {
                     return;
                  }

                  this.method5957(var3, var5, var6, var7, var15, var16, var17, var18);
               } else if (var1 == 4) {
                  var15 = var4.field7227 - 1;
                  var16 = this.field2088 - this.field2062;

                  for(var17 = 0; var17 < this.field2034; ++var17) {
                     var18 = this.field2043[var17] + var5;
                     var19 = this.field2045[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var4.field7228;
                     var23 = var19 >> var4.field7228;
                     var24 = var13[var22][var23] * (var4.field7227 - var20) + var13[var22 + 1][var23] * var20 >> var4.field7228;
                     var25 = var13[var22][var23 + 1] * (var4.field7227 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.field7228;
                     var26 = var24 * (var4.field7227 - var21) + var25 * var21 >> var4.field7228;
                     this.field2044[var17] = this.field2044[var17] + (var26 - var6) + var16;
                  }

                  for(var17 = this.field2034; var17 < this.field2091; ++var17) {
                     var18 = this.field2043[var17] + var5;
                     var19 = this.field2045[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var4.field7228;
                     var23 = var19 >> var4.field7228;
                     if (var22 >= 0 && var22 < var4.field7226 - 1 && var23 >= 0 && var23 < var4.field7225 - 1) {
                        var24 = var13[var22][var23] * (var4.field7227 - var20) + var13[var22 + 1][var23] * var20 >> var4.field7228;
                        var25 = var13[var22][var23 + 1] * (var4.field7227 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.field7228;
                        var26 = var24 * (var4.field7227 - var21) + var25 * var21 >> var4.field7228;
                        this.field2044[var17] = this.field2044[var17] + (var26 - var6) + var16;
                     }
                  }
               } else if (var1 == 5) {
                  var15 = var4.field7227 - 1;
                  var16 = this.field2088 - this.field2062;

                  int var27;
                  int var28;
                  for(var17 = 0; var17 < this.field2034; ++var17) {
                     var18 = this.field2043[var17] + var5;
                     var19 = this.field2045[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var3.field7228;
                     var23 = var19 >> var3.field7228;
                     var24 = var12[var22][var23] * (var3.field7227 - var20) + var12[var22 + 1][var23] * var20 >> var3.field7228;
                     var25 = var12[var22][var23 + 1] * (var3.field7227 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.field7228;
                     var26 = var24 * (var3.field7227 - var21) + var25 * var21 >> var3.field7228;
                     var24 = var13[var22][var23] * (var4.field7227 - var20) + var13[var22 + 1][var23] * var20 >> var4.field7228;
                     var25 = var13[var22][var23 + 1] * (var4.field7227 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.field7228;
                     var27 = var24 * (var4.field7227 - var21) + var25 * var21 >> var4.field7228;
                     var28 = var26 - var27 - var2;
                     this.field2044[var17] = ((this.field2044[var17] << 8) / var16 * var28 >> 8) - (var6 - var26);
                  }

                  for(var17 = this.field2034; var17 < this.field2091; ++var17) {
                     var18 = this.field2043[var17] + var5;
                     var19 = this.field2045[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var3.field7228;
                     var23 = var19 >> var3.field7228;
                     if (var22 >= 0 && var22 < var3.field7226 - 1 && var22 < var4.field7226 - 1 && var23 >= 0 && var23 < var3.field7225 - 1 && var23 < var4.field7225 - 1) {
                        var24 = var12[var22][var23] * (var3.field7227 - var20) + var12[var22 + 1][var23] * var20 >> var3.field7228;
                        var25 = var12[var22][var23 + 1] * (var3.field7227 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.field7228;
                        var26 = var24 * (var3.field7227 - var21) + var25 * var21 >> var3.field7228;
                        var24 = var13[var22][var23] * (var4.field7227 - var20) + var13[var22 + 1][var23] * var20 >> var4.field7228;
                        var25 = var13[var22][var23 + 1] * (var4.field7227 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.field7228;
                        var27 = var24 * (var4.field7227 - var21) + var25 * var21 >> var4.field7228;
                        var28 = var26 - var27 - var2;
                        this.field2044[var17] = ((this.field2044[var17] << 8) / var16 * var28 >> 8) - (var6 - var26);
                     }
                  }
               }
            }

            this.field2084 = false;
         }
      }

   }

   void method1426() {
      this.field2047 = null;
      this.field2078 = null;
      this.field2032 = null;
      this.field2084 = false;
   }

   void method5959() {
      if (this.field2061.field7946 > 1) {
         synchronized(this) {
            super.field9859 = false;
            this.notifyAll();
         }
      }

   }

   public int method5977() {
      if (!this.field2084) {
         this.method1433();
      }

      return this.field2088;
   }

   boolean method1427(int var1, int var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if ((float)var2 < var3 && (float)var2 < var4 && (float)var2 < var5) {
         return false;
      } else if ((float)var2 > var3 && (float)var2 > var4 && (float)var2 > var5) {
         return false;
      } else if ((float)var1 < var6 && (float)var1 < var7 && (float)var1 < var8) {
         return false;
      } else {
         return (float)var1 <= var6 || (float)var1 <= var7 || (float)var1 <= var8;
      }
   }

   void method5967(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var12;
      int var14;
      int var15;
      if (var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         if (!this.field2072) {
            for(var10 = 0; var10 < this.field2091; ++var10) {
               this.field2043[var10] <<= 4;
               this.field2044[var10] <<= 4;
               this.field2045[var10] <<= 4;
            }

            this.field2072 = true;
         }

         var10 = 0;
         this.field2074 = 0;
         this.field2075 = 0;
         this.field2073 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var12 = var2[var11];
            if (var12 < this.field2070.length) {
               int[] var13 = this.field2070[var12];

               for(var14 = 0; var14 < var13.length; ++var14) {
                  var15 = var13[var14];
                  if (this.field2108 == null || (var7 & this.field2108[var15]) != 0) {
                     this.field2074 += this.field2043[var15];
                     this.field2075 += this.field2044[var15];
                     this.field2073 += this.field2045[var15];
                     ++var10;
                  }
               }
            }
         }

         if (var10 > 0) {
            this.field2074 = this.field2074 / var10 + var3;
            this.field2075 = this.field2075 / var10 + var4;
            this.field2073 = this.field2073 / var10 + var5;
            this.field2077 = true;
         } else {
            this.field2074 = var3;
            this.field2075 = var4;
            this.field2073 = var5;
         }
      } else {
         int[] var47;
         int var48;
         if (var1 == 1) {
            if (var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var12 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var12;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;
            if (!this.field2072) {
               for(var10 = 0; var10 < this.field2091; ++var10) {
                  this.field2043[var10] <<= 4;
                  this.field2044[var10] <<= 4;
                  this.field2045[var10] <<= 4;
               }

               this.field2072 = true;
            }

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if (var11 < this.field2070.length) {
                  var47 = this.field2070[var11];

                  for(var48 = 0; var48 < var47.length; ++var48) {
                     var14 = var47[var48];
                     if (this.field2108 == null || (var7 & this.field2108[var14]) != 0) {
                        this.field2043[var14] += var3;
                        this.field2044[var14] += var4;
                        this.field2045[var14] += var5;
                     }
                  }
               }
            }
         } else {
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var26;
            int var27;
            int var28;
            int var30;
            int var32;
            int var33;
            int var34;
            int var36;
            int var37;
            int var38;
            int var39;
            int var40;
            int[] var56;
            if (var1 == 2) {
               if (var8 != null) {
                  if (!this.field2072) {
                     for(var10 = 0; var10 < this.field2091; ++var10) {
                        this.field2043[var10] <<= 4;
                        this.field2044[var10] <<= 4;
                        this.field2045[var10] <<= 4;
                     }

                     this.field2072 = true;
                  }

                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var12 = var8[11] << 4;
                  var48 = var8[12] << 4;
                  var14 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if (this.field2077) {
                     var16 = var8[0] * this.field2074 + var8[3] * this.field2075 + var8[6] * this.field2073 + 8192 >> 14;
                     var17 = var8[1] * this.field2074 + var8[4] * this.field2075 + var8[7] * this.field2073 + 8192 >> 14;
                     var18 = var8[2] * this.field2074 + var8[5] * this.field2075 + var8[8] * this.field2073 + 8192 >> 14;
                     var16 += var48;
                     var17 += var14;
                     var18 += var15;
                     this.field2074 = var16;
                     this.field2075 = var17;
                     this.field2073 = var18;
                     this.field2077 = false;
                  }

                  int[] var51 = new int[9];
                  var17 = class703.field3404[var3];
                  var18 = class703.field3413[var3];
                  var19 = class703.field3404[var4];
                  var20 = class703.field3413[var4];
                  var21 = class703.field3404[var5];
                  var22 = class703.field3413[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var51[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var51[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var51[2] = var20 * var17 + 8192 >> 14;
                  var51[3] = var17 * var22 + 8192 >> 14;
                  var51[4] = var17 * var21 + 8192 >> 14;
                  var51[5] = -var18;
                  var51[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var51[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var51[8] = var19 * var17 + 8192 >> 14;
                  int var25 = var51[0] * -this.field2074 + var51[1] * -this.field2075 + var51[2] * -this.field2073 + 8192 >> 14;
                  var26 = var51[3] * -this.field2074 + var51[4] * -this.field2075 + var51[5] * -this.field2073 + 8192 >> 14;
                  var27 = var51[6] * -this.field2074 + var51[7] * -this.field2075 + var51[8] * -this.field2073 + 8192 >> 14;
                  var28 = var25 + this.field2074;
                  int var29 = var26 + this.field2075;
                  var30 = var27 + this.field2073;
                  int[] var31 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var35 = 0; var35 < 3; ++var35) {
                           var34 += var51[var32 * 3 + var35] * var8[var33 * 3 + var35];
                        }

                        var31[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var51[0] * var48 + var51[1] * var14 + var51[2] * var15 + 8192 >> 14;
                  var33 = var51[3] * var48 + var51[4] * var14 + var51[5] * var15 + 8192 >> 14;
                  var34 = var51[6] * var48 + var51[7] * var14 + var51[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var29;
                  var34 += var30;
                  var56 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var31[var37 + var39 * 3];
                        }

                        var56[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var12;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if (var40 < this.field2070.length) {
                        int[] var41 = this.field2070[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if (this.field2108 == null || (var7 & this.field2108[var43]) != 0) {
                              int var44 = var56[0] * this.field2043[var43] + var56[1] * this.field2044[var43] + var56[2] * this.field2045[var43] + 8192 >> 14;
                              int var45 = var56[3] * this.field2043[var43] + var56[4] * this.field2044[var43] + var56[5] * this.field2045[var43] + 8192 >> 14;
                              int var46 = var56[6] * this.field2043[var43] + var56[7] * this.field2044[var43] + var56[8] * this.field2045[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.field2043[var43] = var44;
                              this.field2044[var43] = var45;
                              this.field2045[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if (var11 < this.field2070.length) {
                        var47 = this.field2070[var11];

                        for(var48 = 0; var48 < var47.length; ++var48) {
                           var14 = var47[var48];
                           if (this.field2108 == null || (var7 & this.field2108[var14]) != 0) {
                              this.field2043[var14] -= this.field2074;
                              this.field2044[var14] -= this.field2075;
                              this.field2045[var14] -= this.field2073;
                              if (var5 != 0) {
                                 var15 = class703.field3413[var5];
                                 var16 = class703.field3404[var5];
                                 var17 = this.field2044[var14] * var15 + this.field2043[var14] * var16 + 16383 >> 14;
                                 this.field2044[var14] = this.field2044[var14] * var16 - this.field2043[var14] * var15 + 16383 >> 14;
                                 this.field2043[var14] = var17;
                              }

                              if (var3 != 0) {
                                 var15 = class703.field3413[var3];
                                 var16 = class703.field3404[var3];
                                 var17 = this.field2044[var14] * var16 - this.field2045[var14] * var15 + 16383 >> 14;
                                 this.field2045[var14] = this.field2044[var14] * var15 + this.field2045[var14] * var16 + 16383 >> 14;
                                 this.field2044[var14] = var17;
                              }

                              if (var4 != 0) {
                                 var15 = class703.field3413[var4];
                                 var16 = class703.field3404[var4];
                                 var17 = this.field2045[var14] * var15 + this.field2043[var14] * var16 + 16383 >> 14;
                                 this.field2045[var14] = this.field2045[var14] * var16 - this.field2043[var14] * var15 + 16383 >> 14;
                                 this.field2043[var14] = var17;
                              }

                              this.field2043[var14] += this.field2074;
                              this.field2044[var14] += this.field2075;
                              this.field2045[var14] += this.field2073;
                           }
                        }
                     }
                  }
               }
            } else if (var1 == 3) {
               if (var8 != null) {
                  if (!this.field2072) {
                     for(var10 = 0; var10 < this.field2091; ++var10) {
                        this.field2043[var10] <<= 4;
                        this.field2044[var10] <<= 4;
                        this.field2045[var10] <<= 4;
                     }

                     this.field2072 = true;
                  }

                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var12 = var8[11] << 4;
                  var48 = var8[12] << 4;
                  var14 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if (this.field2077) {
                     var16 = var8[0] * this.field2074 + var8[3] * this.field2075 + var8[6] * this.field2073 + 8192 >> 14;
                     var17 = var8[1] * this.field2074 + var8[4] * this.field2075 + var8[7] * this.field2073 + 8192 >> 14;
                     var18 = var8[2] * this.field2074 + var8[5] * this.field2075 + var8[8] * this.field2073 + 8192 >> 14;
                     var16 += var48;
                     var17 += var14;
                     var18 += var15;
                     this.field2074 = var16;
                     this.field2075 = var17;
                     this.field2073 = var18;
                     this.field2077 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -this.field2074 + 8192 >> 14;
                  var20 = var17 * -this.field2075 + 8192 >> 14;
                  var21 = var18 * -this.field2073 + 8192 >> 14;
                  var22 = var19 + this.field2074;
                  var23 = var20 + this.field2075;
                  var24 = var21 + this.field2073;
                  int[] var53 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var48 + 8192 >> 14;
                  var27 = var17 * var14 + 8192 >> 14;
                  var28 = var18 * var15 + 8192 >> 14;
                  var26 += var22;
                  var27 += var23;
                  var28 += var24;
                  int[] var54 = new int[9];

                  int var55;
                  for(var30 = 0; var30 < 3; ++var30) {
                     for(var55 = 0; var55 < 3; ++var55) {
                        var32 = 0;

                        for(var33 = 0; var33 < 3; ++var33) {
                           var32 += var8[var30 * 3 + var33] * var53[var55 + var33 * 3];
                        }

                        var54[var30 * 3 + var55] = var32 + 8192 >> 14;
                     }
                  }

                  var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 8192 >> 14;
                  var55 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 8192 >> 14;
                  var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 8192 >> 14;
                  var30 += var10;
                  var55 += var11;
                  var32 += var12;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if (var34 < this.field2070.length) {
                        var56 = this.field2070[var34];

                        for(var36 = 0; var36 < var56.length; ++var36) {
                           var37 = var56[var36];
                           if (this.field2108 == null || (var7 & this.field2108[var37]) != 0) {
                              var38 = var54[0] * this.field2043[var37] + var54[1] * this.field2044[var37] + var54[2] * this.field2045[var37] + 8192 >> 14;
                              var39 = var54[3] * this.field2043[var37] + var54[4] * this.field2044[var37] + var54[5] * this.field2045[var37] + 8192 >> 14;
                              var40 = var54[6] * this.field2043[var37] + var54[7] * this.field2044[var37] + var54[8] * this.field2045[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var55;
                              var40 += var32;
                              this.field2043[var37] = var38;
                              this.field2044[var37] = var39;
                              this.field2045[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if (var11 < this.field2070.length) {
                        var47 = this.field2070[var11];

                        for(var48 = 0; var48 < var47.length; ++var48) {
                           var14 = var47[var48];
                           if (this.field2108 == null || (var7 & this.field2108[var14]) != 0) {
                              this.field2043[var14] -= this.field2074;
                              this.field2044[var14] -= this.field2075;
                              this.field2045[var14] -= this.field2073;
                              this.field2043[var14] = this.field2043[var14] * var3 / 128;
                              this.field2044[var14] = this.field2044[var14] * var4 / 128;
                              this.field2045[var14] = this.field2045[var14] * var5 / 128;
                              this.field2043[var14] += this.field2074;
                              this.field2044[var14] += this.field2075;
                              this.field2045[var14] += this.field2073;
                           }
                        }
                     }
                  }
               }
            } else {
               class47 var49;
               class637 var50;
               if (var1 == 5) {
                  if (this.field2071 != null && this.field2065 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if (var11 < this.field2071.length) {
                           var47 = this.field2071[var11];

                           for(var48 = 0; var48 < var47.length; ++var48) {
                              var14 = var47[var48];
                              if (this.field2068 == null || (var7 & this.field2068[var14]) != 0) {
                                 var15 = (this.field2065[var14] & 255) + var3 * 8;
                                 if (var15 < 0) {
                                    var15 = 0;
                                 } else if (var15 > 255) {
                                    var15 = 255;
                                 }

                                 this.field2065[var14] = (byte)var15;
                              }
                           }
                        }
                     }

                     if (this.field2081 != null) {
                        for(var10 = 0; var10 < this.field2080; ++var10) {
                           var49 = this.field2081[var10];
                           var50 = this.field2082[var10];
                           var50.field9856 = var50.field9856 & 16777215 | 255 - (this.field2065[var49.field5172] & 255) << 24;
                        }
                     }
                  }
               } else if (var1 == 7) {
                  if (this.field2071 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if (var11 < this.field2071.length) {
                           var47 = this.field2071[var11];

                           for(var48 = 0; var48 < var47.length; ++var48) {
                              var14 = var47[var48];
                              if (this.field2068 == null || (var7 & this.field2068[var14]) != 0) {
                                 var15 = this.field2067[var14] & '\uffff';
                                 var16 = var15 >> 10 & 63;
                                 var17 = var15 >> 7 & 7;
                                 var18 = var15 & 127;
                                 var16 = var16 + var3 & 63;
                                 var17 += var4;
                                 if (var17 < 0) {
                                    var17 = 0;
                                 } else if (var17 > 7) {
                                    var17 = 7;
                                 }

                                 var18 += var5;
                                 if (var18 < 0) {
                                    var18 = 0;
                                 } else if (var18 > 127) {
                                    var18 = 127;
                                 }

                                 this.field2067[var14] = (short)(var16 << 10 | var17 << 7 | var18);
                              }
                           }

                           this.field2025 = true;
                        }
                     }

                     if (this.field2081 != null) {
                        for(var10 = 0; var10 < this.field2080; ++var10) {
                           var49 = this.field2081[var10];
                           var50 = this.field2082[var10];
                           var50.field9856 = var50.field9856 & -16777216 | class543.field3817[class526.method2228(this.field2067[var49.field5172] & '\uffff', (byte)0) & '\uffff'] & 16777215;
                        }
                     }
                  }
               } else {
                  class637 var52;
                  if (var1 == 8) {
                     if (this.field2083 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if (var11 < this.field2083.length) {
                              var47 = this.field2083[var11];

                              for(var48 = 0; var48 < var47.length; ++var48) {
                                 var52 = this.field2082[var47[var48]];
                                 var52.field9849 += var3;
                                 var52.field9846 += var4;
                              }
                           }
                        }
                     }
                  } else if (var1 == 10) {
                     if (this.field2083 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if (var11 < this.field2083.length) {
                              var47 = this.field2083[var11];

                              for(var48 = 0; var48 < var47.length; ++var48) {
                                 var52 = this.field2082[var47[var48]];
                                 var52.field9847 = var52.field9847 * (float)var3 / 128.0F;
                                 var52.field9850 = var52.field9850 * (float)var4 / 128.0F;
                              }
                           }
                        }
                     }
                  } else if (var1 == 9 && this.field2083 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if (var11 < this.field2083.length) {
                           var47 = this.field2083[var11];

                           for(var48 = 0; var48 < var47.length; ++var48) {
                              var52 = this.field2082[var47[var48]];
                              var52.field9851 = var52.field9851 + var3 & 16383;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void method5968(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      if (var1 == 0) {
         var5 = 0;
         this.field2074 = 0;
         this.field2075 = 0;
         this.field2073 = 0;

         for(var6 = 0; var6 < this.field2091; ++var6) {
            this.field2074 += this.field2043[var6];
            this.field2075 += this.field2044[var6];
            this.field2073 += this.field2045[var6];
            ++var5;
         }

         if (var5 > 0) {
            this.field2074 = this.field2074 / var5 + var2;
            this.field2075 = this.field2075 / var5 + var3;
            this.field2073 = this.field2073 / var5 + var4;
         } else {
            this.field2074 = var2;
            this.field2075 = var3;
            this.field2073 = var4;
         }
      } else if (var1 == 1) {
         for(var5 = 0; var5 < this.field2091; ++var5) {
            this.field2043[var5] += var2;
            this.field2044[var5] += var3;
            this.field2045[var5] += var4;
         }
      } else {
         int var7;
         int var8;
         if (var1 == 2) {
            for(var5 = 0; var5 < this.field2091; ++var5) {
               this.field2043[var5] -= this.field2074;
               this.field2044[var5] -= this.field2075;
               this.field2045[var5] -= this.field2073;
               if (var4 != 0) {
                  var6 = class703.field3413[var4];
                  var7 = class703.field3404[var4];
                  var8 = this.field2044[var5] * var6 + this.field2043[var5] * var7 + 16383 >> 14;
                  this.field2044[var5] = this.field2044[var5] * var7 - this.field2043[var5] * var6 + 16383 >> 14;
                  this.field2043[var5] = var8;
               }

               if (var2 != 0) {
                  var6 = class703.field3413[var2];
                  var7 = class703.field3404[var2];
                  var8 = this.field2044[var5] * var7 - this.field2045[var5] * var6 + 16383 >> 14;
                  this.field2045[var5] = this.field2044[var5] * var6 + this.field2045[var5] * var7 + 16383 >> 14;
                  this.field2044[var5] = var8;
               }

               if (var3 != 0) {
                  var6 = class703.field3413[var3];
                  var7 = class703.field3404[var3];
                  var8 = this.field2045[var5] * var6 + this.field2043[var5] * var7 + 16383 >> 14;
                  this.field2045[var5] = this.field2045[var5] * var7 - this.field2043[var5] * var6 + 16383 >> 14;
                  this.field2043[var5] = var8;
               }

               this.field2043[var5] += this.field2074;
               this.field2044[var5] += this.field2075;
               this.field2045[var5] += this.field2073;
            }
         } else if (var1 == 3) {
            for(var5 = 0; var5 < this.field2091; ++var5) {
               this.field2043[var5] -= this.field2074;
               this.field2044[var5] -= this.field2075;
               this.field2045[var5] -= this.field2073;
               this.field2043[var5] = this.field2043[var5] * var2 / 128;
               this.field2044[var5] = this.field2044[var5] * var3 / 128;
               this.field2045[var5] = this.field2045[var5] * var4 / 128;
               this.field2043[var5] += this.field2074;
               this.field2044[var5] += this.field2075;
               this.field2045[var5] += this.field2073;
            }
         } else {
            class637 var10;
            class47 var11;
            if (var1 == 5) {
               for(var5 = 0; var5 < this.field2049; ++var5) {
                  var6 = (this.field2065[var5] & 255) + var2 * 8;
                  if (var6 < 0) {
                     var6 = 0;
                  } else if (var6 > 255) {
                     var6 = 255;
                  }

                  this.field2065[var5] = (byte)var6;
               }

               if (this.field2081 != null) {
                  for(var5 = 0; var5 < this.field2080; ++var5) {
                     var11 = this.field2081[var5];
                     var10 = this.field2082[var5];
                     var10.field9856 = var10.field9856 & 16777215 | 255 - (this.field2065[var11.field5172] & 255) << 24;
                  }
               }
            } else if (var1 == 7) {
               for(var5 = 0; var5 < this.field2049; ++var5) {
                  var6 = this.field2067[var5] & '\uffff';
                  var7 = var6 >> 10 & 63;
                  var8 = var6 >> 7 & 7;
                  int var9 = var6 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3;
                  if (var8 < 0) {
                     var8 = 0;
                  } else if (var8 > 7) {
                     var8 = 7;
                  }

                  var9 += var4;
                  if (var9 < 0) {
                     var9 = 0;
                  } else if (var9 > 127) {
                     var9 = 127;
                  }

                  this.field2067[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               this.field2025 = true;
               if (this.field2081 != null) {
                  for(var5 = 0; var5 < this.field2080; ++var5) {
                     var11 = this.field2081[var5];
                     var10 = this.field2082[var5];
                     var10.field9856 = var10.field9856 & -16777216 | class543.field3817[class526.method2228(this.field2067[var11.field5172] & '\uffff', (byte)0) & '\uffff'] & 16777215;
                  }
               }
            } else {
               class637 var12;
               if (var1 == 8) {
                  for(var5 = 0; var5 < this.field2080; ++var5) {
                     var12 = this.field2082[var5];
                     var12.field9849 += var2;
                     var12.field9846 += var3;
                  }
               } else if (var1 == 10) {
                  for(var5 = 0; var5 < this.field2080; ++var5) {
                     var12 = this.field2082[var5];
                     var12.field9847 = var12.field9847 * (float)var2 / 128.0F;
                     var12.field9850 = var12.field9850 * (float)var3 / 128.0F;
                  }
               } else if (var1 == 9) {
                  for(var5 = 0; var5 < this.field2080; ++var5) {
                     var12 = this.field2082[var5];
                     var12.field9851 = var12.field9851 + var2 & 16383;
                  }
               }
            }
         }
      }

   }

   public void method5965(class135 var1, class211 var2, int var3) {
      this.method1437(var1, var2, var3);
   }

   void method5964(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var13;
      int var14;
      if (var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         if (!this.field2072) {
            for(var9 = 0; var9 < this.field2091; ++var9) {
               this.field2043[var9] <<= 4;
               this.field2044[var9] <<= 4;
               this.field2045[var9] <<= 4;
            }

            this.field2072 = true;
         }

         var9 = 0;
         this.field2074 = 0;
         this.field2075 = 0;
         this.field2073 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var11 = var2[var10];
            if (var11 < this.field2070.length) {
               int[] var12 = this.field2070[var11];

               for(var13 = 0; var13 < var12.length; ++var13) {
                  var14 = var12[var13];
                  this.field2074 += this.field2043[var14];
                  this.field2075 += this.field2044[var14];
                  this.field2073 += this.field2045[var14];
                  ++var9;
               }
            }
         }

         if (var9 > 0) {
            this.field2074 = this.field2074 / var9 + var3;
            this.field2075 = this.field2075 / var9 + var4;
            this.field2073 = this.field2073 / var9 + var5;
         } else {
            this.field2074 = var3;
            this.field2075 = var4;
            this.field2073 = var5;
         }
      } else {
         int[] var18;
         int var20;
         if (var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;
            if (!this.field2072) {
               for(var9 = 0; var9 < this.field2091; ++var9) {
                  this.field2043[var9] <<= 4;
                  this.field2044[var9] <<= 4;
                  this.field2045[var9] <<= 4;
               }

               this.field2072 = true;
            }

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if (var10 < this.field2070.length) {
                  var18 = this.field2070[var10];

                  for(var20 = 0; var20 < var18.length; ++var20) {
                     var13 = var18[var20];
                     this.field2043[var13] += var3;
                     this.field2044[var13] += var4;
                     this.field2045[var13] += var5;
                  }
               }
            }
         } else {
            int var15;
            int var16;
            if (var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if (var10 < this.field2070.length) {
                     var18 = this.field2070[var10];
                     if ((var6 & 1) == 0) {
                        for(var20 = 0; var20 < var18.length; ++var20) {
                           var13 = var18[var20];
                           this.field2043[var13] -= this.field2074;
                           this.field2044[var13] -= this.field2075;
                           this.field2045[var13] -= this.field2073;
                           if (var5 != 0) {
                              var14 = class703.field3413[var5];
                              var15 = class703.field3404[var5];
                              var16 = this.field2044[var13] * var14 + this.field2043[var13] * var15 + 16383 >> 14;
                              this.field2044[var13] = this.field2044[var13] * var15 - this.field2043[var13] * var14 + 16383 >> 14;
                              this.field2043[var13] = var16;
                           }

                           if (var3 != 0) {
                              var14 = class703.field3413[var3];
                              var15 = class703.field3404[var3];
                              var16 = this.field2044[var13] * var15 - this.field2045[var13] * var14 + 16383 >> 14;
                              this.field2045[var13] = this.field2044[var13] * var14 + this.field2045[var13] * var15 + 16383 >> 14;
                              this.field2044[var13] = var16;
                           }

                           if (var4 != 0) {
                              var14 = class703.field3413[var4];
                              var15 = class703.field3404[var4];
                              var16 = this.field2045[var13] * var14 + this.field2043[var13] * var15 + 16383 >> 14;
                              this.field2045[var13] = this.field2045[var13] * var15 - this.field2043[var13] * var14 + 16383 >> 14;
                              this.field2043[var13] = var16;
                           }

                           this.field2043[var13] += this.field2074;
                           this.field2044[var13] += this.field2075;
                           this.field2045[var13] += this.field2073;
                        }
                     } else {
                        for(var20 = 0; var20 < var18.length; ++var20) {
                           var13 = var18[var20];
                           this.field2043[var13] -= this.field2074;
                           this.field2044[var13] -= this.field2075;
                           this.field2045[var13] -= this.field2073;
                           if (var3 != 0) {
                              var14 = class703.field3413[var3];
                              var15 = class703.field3404[var3];
                              var16 = this.field2044[var13] * var15 - this.field2045[var13] * var14 + 16383 >> 14;
                              this.field2045[var13] = this.field2044[var13] * var14 + this.field2045[var13] * var15 + 16383 >> 14;
                              this.field2044[var13] = var16;
                           }

                           if (var5 != 0) {
                              var14 = class703.field3413[var5];
                              var15 = class703.field3404[var5];
                              var16 = this.field2044[var13] * var14 + this.field2043[var13] * var15 + 16383 >> 14;
                              this.field2044[var13] = this.field2044[var13] * var15 - this.field2043[var13] * var14 + 16383 >> 14;
                              this.field2043[var13] = var16;
                           }

                           if (var4 != 0) {
                              var14 = class703.field3413[var4];
                              var15 = class703.field3404[var4];
                              var16 = this.field2045[var13] * var14 + this.field2043[var13] * var15 + 16383 >> 14;
                              this.field2045[var13] = this.field2045[var13] * var15 - this.field2043[var13] * var14 + 16383 >> 14;
                              this.field2043[var13] = var16;
                           }

                           this.field2043[var13] += this.field2074;
                           this.field2044[var13] += this.field2075;
                           this.field2045[var13] += this.field2073;
                        }
                     }
                  }
               }
            } else if (var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if (var10 < this.field2070.length) {
                     var18 = this.field2070[var10];

                     for(var20 = 0; var20 < var18.length; ++var20) {
                        var13 = var18[var20];
                        this.field2043[var13] -= this.field2074;
                        this.field2044[var13] -= this.field2075;
                        this.field2045[var13] -= this.field2073;
                        this.field2043[var13] = this.field2043[var13] * var3 / 128;
                        this.field2044[var13] = this.field2044[var13] * var4 / 128;
                        this.field2045[var13] = this.field2045[var13] * var5 / 128;
                        this.field2043[var13] += this.field2074;
                        this.field2044[var13] += this.field2075;
                        this.field2045[var13] += this.field2073;
                     }
                  }
               }
            } else {
               class47 var19;
               class637 var21;
               if (var1 == 5) {
                  if (this.field2071 != null && this.field2065 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if (var10 < this.field2071.length) {
                           var18 = this.field2071[var10];

                           for(var20 = 0; var20 < var18.length; ++var20) {
                              var13 = var18[var20];
                              var14 = (this.field2065[var13] & 255) + var3 * 8;
                              if (var14 < 0) {
                                 var14 = 0;
                              } else if (var14 > 255) {
                                 var14 = 255;
                              }

                              this.field2065[var13] = (byte)var14;
                           }
                        }
                     }

                     if (this.field2081 != null) {
                        for(var9 = 0; var9 < this.field2080; ++var9) {
                           var19 = this.field2081[var9];
                           var21 = this.field2082[var9];
                           var21.field9856 = var21.field9856 & 16777215 | 255 - (this.field2065[var19.field5172] & 255) << 24;
                        }
                     }
                  }
               } else if (var1 == 7) {
                  if (this.field2071 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if (var10 < this.field2071.length) {
                           var18 = this.field2071[var10];

                           for(var20 = 0; var20 < var18.length; ++var20) {
                              var13 = var18[var20];
                              var14 = this.field2067[var13] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              int var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4;
                              if (var16 < 0) {
                                 var16 = 0;
                              } else if (var16 > 7) {
                                 var16 = 7;
                              }

                              var17 += var5;
                              if (var17 < 0) {
                                 var17 = 0;
                              } else if (var17 > 127) {
                                 var17 = 127;
                              }

                              this.field2067[var13] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           this.field2025 = true;
                        }
                     }

                     if (this.field2081 != null) {
                        for(var9 = 0; var9 < this.field2080; ++var9) {
                           var19 = this.field2081[var9];
                           var21 = this.field2082[var9];
                           var21.field9856 = var21.field9856 & -16777216 | class543.field3817[class526.method2228(this.field2067[var19.field5172] & '\uffff', (byte)0) & '\uffff'] & 16777215;
                        }
                     }
                  }
               } else {
                  class637 var22;
                  if (var1 == 8) {
                     if (this.field2083 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if (var10 < this.field2083.length) {
                              var18 = this.field2083[var10];

                              for(var20 = 0; var20 < var18.length; ++var20) {
                                 var22 = this.field2082[var18[var20]];
                                 var22.field9849 += var3;
                                 var22.field9846 += var4;
                              }
                           }
                        }
                     }
                  } else if (var1 == 10) {
                     if (this.field2083 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if (var10 < this.field2083.length) {
                              var18 = this.field2083[var10];

                              for(var20 = 0; var20 < var18.length; ++var20) {
                                 var22 = this.field2082[var18[var20]];
                                 var22.field9847 = var22.field9847 * (float)var3 / 128.0F;
                                 var22.field9850 = var22.field9850 * (float)var4 / 128.0F;
                              }
                           }
                        }
                     }
                  } else if (var1 == 9 && this.field2083 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if (var10 < this.field2083.length) {
                           var18 = this.field2083[var10];

                           for(var20 = 0; var20 < var18.length; ++var20) {
                              var22 = this.field2082[var18[var20]];
                              var22.field9851 = var22.field9851 + var3 & 16383;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   final boolean method1428(int var1) {
      if (this.field2065 == null) {
         return false;
      } else {
         return this.field2065[var1] != 0;
      }
   }

   public void method6016(int var1) {
      if ((this.field2038 & 5) != 5) {
         throw new IllegalStateException();
      } else {
         if (var1 == 4096) {
            this.method1435();
         } else if (var1 == 8192) {
            this.method1422();
         } else if (var1 == 12288) {
            this.method1432();
         } else {
            int var2 = class703.field3413[var1];
            int var3 = class703.field3404[var1];
            synchronized(this) {
               for(int var5 = 0; var5 < this.field2091; ++var5) {
                  int var6 = this.field2045[var5] * var2 + this.field2043[var5] * var3 >> 14;
                  this.field2045[var5] = this.field2045[var5] * var3 - this.field2043[var5] * var2 >> 14;
                  this.field2043[var5] = var6;
               }

               this.method1426();
            }
         }

      }
   }

   final void method1429(boolean var1, boolean var2, boolean var3, int var4, boolean var5, boolean var6) {
      if (this.field2093[var4] != -2) {
         short var7 = this.field2050[var4];
         short var8 = this.field2051[var4];
         short var9 = this.field2052[var4];
         float var10 = this.field2076[var7];
         float var11 = this.field2076[var8];
         float var12 = this.field2076[var9];
         if (!var5 || var10 != -5000.0F && var11 != -5000.0F && var12 != -5000.0F) {
            float var13 = this.field2098[var7];
            float var14 = this.field2098[var8];
            float var15 = this.field2098[var9];
            if (this.field2106[var4] != -1 || (var10 - var11) * (var15 - var14) - (var13 - var14) * (var12 - var11) > 0.0F) {
               if (var10 >= 0.0F && var11 >= 0.0F && var12 >= 0.0F && var10 <= (float)this.field2027.field7903 && var11 <= (float)this.field2027.field7903 && var12 <= (float)this.field2027.field7903) {
                  this.field2029.field336 = false;
               } else {
                  this.field2029.field336 = true;
               }

               int var16;
               if (var6) {
                  var16 = this.field2106[var4];
                  if (var16 == -1 || !this.field2081[var16].field5171) {
                     this.method1431(var1, var2, var3, var4);
                  }
               } else {
                  var16 = this.field2106[var4];
                  if (var16 != -1) {
                     class47 var17 = this.field2081[var16];
                     class637 var18 = this.field2082[var16];
                     if (!var17.field5171) {
                        this.method1438(var1, var2, var3, var4);
                     }

                     this.field2061.method4453(var1, var2, var3, var18.field9854, var18.field9853, var18.field9852, var18.field9848, var18.field9855, var17.field5174 & '\uffff', var18.field9856, var17.field5176, var17.field5173);
                  } else {
                     this.method1438(var1, var2, var3, var4);
                  }
               }
            }
         }
      }

   }

   void method1430() {
      for(int var1 = 0; var1 < this.field2049; ++var1) {
         short var2 = this.field2066 != null ? this.field2066[var1] : -1;
         if (var2 == -1) {
            int var3 = this.field2067[var1] & '\uffff';
            int var4 = (var3 & 127) * this.field2039 >> 7;
            short var5 = class526.method2228(var3 & -128 | var4, (byte)0);
            int var6;
            if (this.field2093[var1] == -1) {
               var6 = this.field2055[var1] & -131072;
               this.field2055[var1] = var6 | class63.method1253(var5, var6 >> 17, -952106382);
            } else if (this.field2093[var1] != -2) {
               var6 = this.field2055[var1] & -131072;
               this.field2055[var1] = var6 | class63.method1253(var5, var6 >> 17, -952106382);
               var6 = this.field2056[var1] & -131072;
               this.field2056[var1] = var6 | class63.method1253(var5, var6 >> 17, -952106382);
               var6 = this.field2093[var1] & -131072;
               this.field2093[var1] = var6 | class63.method1253(var5, var6 >> 17, -952106382);
            }
         }
      }

      this.field2104 = 2;
   }

   final void method1431(boolean var1, boolean var2, boolean var3, int var4) {
      short var5;
      short var6;
      short var7;
      float var9;
      float var10;
      if (!this.field2027.field7875) {
         var5 = this.field2050[var4];
         var6 = this.field2051[var4];
         var7 = this.field2052[var4];
         class344 var8 = this.field2061.field7933;
         var9 = var8.field325[10];
         var10 = var8.field325[14];
         float var11 = var8.field325[11];
         float var12 = var8.field325[15];
         float var13 = var10 * var11 - var9 * var12;
         float var14 = (this.field2099[var5] - this.field2027.field7901) * this.field2027.field7880;
         float var15 = (this.field2099[var6] - this.field2027.field7901) * this.field2027.field7880;
         float var16 = (this.field2099[var7] - this.field2027.field7901) * this.field2027.field7880;
         float var17 = var14 * var13 / (var14 * var11 - var9);
         float var18 = var15 * var13 / (var15 * var11 - var9);
         float var19 = var16 * var13 / (var16 * var11 - var9);
         float var20 = (var17 - this.field2027.field7894) / this.field2027.field7872;
         if (var20 > 1.0F) {
            var20 = 1.0F;
         } else if (var20 < 0.0F) {
            var20 = 0.0F;
         }

         float var21 = (var18 - this.field2027.field7894) / this.field2027.field7872;
         if (var21 > 1.0F) {
            var21 = 1.0F;
         } else if (var21 < 0.0F) {
            var21 = 0.0F;
         }

         float var22 = (var19 - this.field2027.field7894) / this.field2027.field7872;
         if (var22 > 1.0F) {
            var22 = 1.0F;
         } else if (var22 < 0.0F) {
            var22 = 0.0F;
         }

         float var23 = var20 + var21 + var22;
         if (var23 < 3.0F) {
            if (var23 <= 0.0F) {
               this.method1438(var1, var2, var3, var4);
            } else {
               if (this.field2065 == null) {
                  this.field2029.field335 = 0;
               } else {
                  this.field2029.field335 = this.field2065[var4] & 255;
               }

               if (this.field2066 != null && this.field2066[var4] != -1) {
                  int var24 = -16777216;
                  if (this.field2065 != null) {
                     var24 = 255 - (this.field2065[var4] & 255) << 24;
                  }

                  if (this.field2093[var4] == -1) {
                     int var25 = var24 | this.field2055[var4] & 16777215;
                     this.field2029.method338(var1, var2, var3, this.field2098[var5], this.field2098[var6], this.field2098[var7], this.field2076[var5], this.field2076[var6], this.field2076[var7], this.field2099[var5], this.field2099[var6], this.field2099[var7], this.field2037[var5], this.field2037[var6], this.field2037[var7], this.field2030[var4][0], this.field2030[var4][1], this.field2030[var4][2], this.field2054[var4][0], this.field2054[var4][1], this.field2054[var4][2], var25, var25, var25, this.field2027.field7873, var20 * 255.0F, var21 * 255.0F, var22 * 255.0F, this.field2066[var4]);
                  } else {
                     this.field2029.method338(var1, var2, var3, this.field2098[var5], this.field2098[var6], this.field2098[var7], this.field2076[var5], this.field2076[var6], this.field2076[var7], this.field2099[var5], this.field2099[var6], this.field2099[var7], this.field2037[var5], this.field2037[var6], this.field2037[var7], this.field2030[var4][0], this.field2030[var4][1], this.field2030[var4][2], this.field2054[var4][0], this.field2054[var4][1], this.field2054[var4][2], var24 | this.field2055[var4] & 16777215, var24 | this.field2056[var4] & 16777215, var24 | this.field2093[var4] & 16777215, this.field2027.field7873, var20 * 255.0F, var21 * 255.0F, var22 * 255.0F, this.field2066[var4]);
                  }
               } else if (this.field2093[var4] == -1) {
                  this.field2029.method340(var1, var2, var3, this.field2098[var5], this.field2098[var6], this.field2098[var7], this.field2076[var5], this.field2076[var6], this.field2076[var7], this.field2099[var5], this.field2099[var6], this.field2099[var7], class507.method2511(class543.field3817[this.field2055[var4] & '\uffff'], this.field2027.field7873, var20 * 255.0F, -528080657), class507.method2511(class543.field3817[this.field2055[var4] & '\uffff'], this.field2027.field7873, var21 * 255.0F, -794747300), class507.method2511(class543.field3817[this.field2055[var4] & '\uffff'], this.field2027.field7873, var22 * 255.0F, 1603189595));
               } else {
                  this.field2029.method340(var1, var2, var3, this.field2098[var5], this.field2098[var6], this.field2098[var7], this.field2076[var5], this.field2076[var6], this.field2076[var7], this.field2099[var5], this.field2099[var6], this.field2099[var7], class507.method2511(class543.field3817[this.field2055[var4] & '\uffff'], this.field2027.field7873, var20 * 255.0F, 2033179026), class507.method2511(class543.field3817[this.field2056[var4] & '\uffff'], this.field2027.field7873, var21 * 255.0F, -851580975), class507.method2511(class543.field3817[this.field2093[var4] & '\uffff'], this.field2027.field7873, var22 * 255.0F, -1739107001));
               }
            }
         }
      } else {
         var5 = this.field2050[var4];
         var6 = this.field2051[var4];
         var7 = this.field2052[var4];
         float var26 = 0.0F;
         var9 = 0.0F;
         var10 = 0.0F;
         if (this.field2026[var5] > this.field2027.field7904) {
            var26 = 1.0F;
         } else if (this.field2026[var5] > this.field2027.field7885) {
            var26 = (float)(this.field2027.field7885 - this.field2026[var5]) * 1.0F / (float)(this.field2027.field7885 - this.field2027.field7904);
         }

         if (this.field2026[var6] > this.field2027.field7904) {
            var9 = 1.0F;
         } else if (this.field2026[var6] > this.field2027.field7885) {
            var9 = (float)(this.field2027.field7885 - this.field2026[var6]) * 1.0F / (float)(this.field2027.field7885 - this.field2027.field7904);
         }

         if (this.field2026[var7] > this.field2027.field7904) {
            var10 = 1.0F;
         } else if (this.field2026[var7] > this.field2027.field7885) {
            var10 = (float)(this.field2027.field7885 - this.field2026[var7]) * 1.0F / (float)(this.field2027.field7885 - this.field2027.field7904);
         }

         if (this.field2065 == null) {
            this.field2029.field335 = 0;
         } else {
            this.field2029.field335 = this.field2065[var4] & 255;
         }

         if (this.field2066 != null && this.field2066[var4] != -1) {
            int var27 = -16777216;
            if (this.field2065 != null) {
               var27 = 255 - (this.field2065[var4] & 255) << 24;
            }

            if (this.field2093[var4] == -1) {
               int var28 = var27 | this.field2055[var4] & 16777215;
               this.field2029.method338(var1, var2, var3, this.field2098[var5], this.field2098[var6], this.field2098[var7], this.field2076[var5], this.field2076[var6], this.field2076[var7], this.field2099[var5], this.field2099[var6], this.field2099[var7], this.field2037[var5], this.field2037[var6], this.field2037[var7], this.field2030[var4][0], this.field2030[var4][1], this.field2030[var4][2], this.field2054[var4][0], this.field2054[var4][1], this.field2054[var4][2], var28, var28, var28, this.field2027.field7873, var26 * 255.0F, var9 * 255.0F, var10 * 255.0F, this.field2066[var4]);
            } else {
               this.field2029.method338(var1, var2, var3, this.field2098[var5], this.field2098[var6], this.field2098[var7], this.field2076[var5], this.field2076[var6], this.field2076[var7], this.field2099[var5], this.field2099[var6], this.field2099[var7], this.field2037[var5], this.field2037[var6], this.field2037[var7], this.field2030[var4][0], this.field2030[var4][1], this.field2030[var4][2], this.field2054[var4][0], this.field2054[var4][1], this.field2054[var4][2], var27 | this.field2055[var4] & 16777215, var27 | this.field2056[var4] & 16777215, var27 | this.field2093[var4] & 16777215, this.field2027.field7873, var26 * 255.0F, var9 * 255.0F, var10 * 255.0F, this.field2066[var4]);
            }
         } else if (this.field2093[var4] == -1) {
            this.field2029.method340(var1, var2, var3, this.field2098[var5], this.field2098[var6], this.field2098[var7], this.field2076[var5], this.field2076[var6], this.field2076[var7], this.field2099[var5], this.field2099[var6], this.field2099[var7], class507.method2511(class543.field3817[this.field2055[var4] & '\uffff'], this.field2027.field7873, var26 * 255.0F, 886179764), class507.method2511(class543.field3817[this.field2055[var4] & '\uffff'], this.field2027.field7873, var9 * 255.0F, 246996122), class507.method2511(class543.field3817[this.field2055[var4] & '\uffff'], this.field2027.field7873, var10 * 255.0F, -99900090));
         } else {
            this.field2029.method340(var1, var2, var3, this.field2098[var5], this.field2098[var6], this.field2098[var7], this.field2076[var5], this.field2076[var6], this.field2076[var7], this.field2099[var5], this.field2099[var6], this.field2099[var7], class507.method2511(class543.field3817[this.field2055[var4] & '\uffff'], this.field2027.field7873, var26 * 255.0F, 1366677082), class507.method2511(class543.field3817[this.field2056[var4] & '\uffff'], this.field2027.field7873, var9 * 255.0F, 1481945329), class507.method2511(class543.field3817[this.field2093[var4] & '\uffff'], this.field2027.field7873, var10 * 255.0F, 153021321));
         }
      }

   }

   boolean method5949() {
      if (this.field2070 == null) {
         return false;
      } else {
         this.field2074 = 0;
         this.field2075 = 0;
         this.field2073 = 0;
         return true;
      }
   }

   void method1432() {
      synchronized(this) {
         for(int var2 = 0; var2 < this.field2091; ++var2) {
            int var3 = this.field2045[var2];
            this.field2045[var2] = this.field2043[var2];
            this.field2043[var2] = -var3;
         }

         this.method1426();
      }
   }

   public void method6096(class135 var1) {
      this.method1415(this.field2061.method4450(Thread.currentThread()));
      class344 var2 = this.field2027.field7883;
      var2.method272(var1);
      int var3;
      if (this.field2042 != null) {
         for(var3 = 0; var3 < this.field2042.length; ++var3) {
            class933 var4 = this.field2042[var3];
            class933 var5 = var4;
            if (var4.field10329 != null) {
               var5 = var4.field10329;
            }

            var5.field10330 = (int)(var2.field325[12] + var2.field325[0] * (float)this.field2043[var4.field10326] + var2.field325[4] * (float)this.field2044[var4.field10326] + var2.field325[8] * (float)this.field2045[var4.field10326]);
            var5.field10336 = (int)(var2.field325[13] + var2.field325[1] * (float)this.field2043[var4.field10326] + var2.field325[5] * (float)this.field2044[var4.field10326] + var2.field325[9] * (float)this.field2045[var4.field10326]);
            var5.field10332 = (int)(var2.field325[14] + var2.field325[2] * (float)this.field2043[var4.field10326] + var2.field325[6] * (float)this.field2044[var4.field10326] + var2.field325[10] * (float)this.field2045[var4.field10326]);
            var5.field10325 = (int)(var2.field325[12] + var2.field325[0] * (float)this.field2043[var4.field10327] + var2.field325[4] * (float)this.field2044[var4.field10327] + var2.field325[8] * (float)this.field2045[var4.field10327]);
            var5.field10334 = (int)(var2.field325[13] + var2.field325[1] * (float)this.field2043[var4.field10327] + var2.field325[5] * (float)this.field2044[var4.field10327] + var2.field325[9] * (float)this.field2045[var4.field10327]);
            var5.field10335 = (int)(var2.field325[14] + var2.field325[2] * (float)this.field2043[var4.field10327] + var2.field325[6] * (float)this.field2044[var4.field10327] + var2.field325[10] * (float)this.field2045[var4.field10327]);
            var5.field10324 = (int)(var2.field325[12] + var2.field325[0] * (float)this.field2043[var4.field10328] + var2.field325[4] * (float)this.field2044[var4.field10328] + var2.field325[8] * (float)this.field2045[var4.field10328]);
            var5.field10337 = (int)(var2.field325[13] + var2.field325[1] * (float)this.field2043[var4.field10328] + var2.field325[5] * (float)this.field2044[var4.field10328] + var2.field325[9] * (float)this.field2045[var4.field10328]);
            var5.field10338 = (int)(var2.field325[14] + var2.field325[2] * (float)this.field2043[var4.field10328] + var2.field325[6] * (float)this.field2044[var4.field10328] + var2.field325[10] * (float)this.field2045[var4.field10328]);
         }
      }

      if (this.field2046 != null) {
         for(var3 = 0; var3 < this.field2046.length; ++var3) {
            class396 var6 = this.field2046[var3];
            class396 var7 = var6;
            if (var6.field6509 != null) {
               var7 = var6.field6509;
            }

            if (var6.field6514 != null) {
               var6.field6514.method269(var2);
            } else {
               var6.field6514 = new class344(var2);
            }

            var7.field6508 = (int)(var2.field325[12] + var2.field325[0] * (float)this.field2043[var6.field6511] + var2.field325[4] * (float)this.field2044[var6.field6511] + var2.field325[8] * (float)this.field2045[var6.field6511]);
            var7.field6512 = (int)(var2.field325[13] + var2.field325[1] * (float)this.field2043[var6.field6511] + var2.field325[5] * (float)this.field2044[var6.field6511] + var2.field325[9] * (float)this.field2045[var6.field6511]);
            var7.field6513 = (int)(var2.field325[14] + var2.field325[2] * (float)this.field2043[var6.field6511] + var2.field325[6] * (float)this.field2044[var6.field6511] + var2.field325[10] * (float)this.field2045[var6.field6511]);
         }
      }

   }

   public class770 method6102(class770 var1) {
      return null;
   }

   void method1433() {
      if (!this.field2084) {
         int var1 = 0;
         int var2 = 0;
         int var3 = 32767;
         int var4 = 32767;
         int var5 = 32767;
         int var6 = -32768;
         int var7 = -32768;
         int var8 = -32768;

         for(int var9 = 0; var9 < this.field2034; ++var9) {
            int var10 = this.field2043[var9];
            int var11 = this.field2044[var9];
            int var12 = this.field2045[var9];
            if (var10 < var3) {
               var3 = var10;
            }

            if (var10 > var6) {
               var6 = var10;
            }

            if (var11 < var4) {
               var4 = var11;
            }

            if (var11 > var7) {
               var7 = var11;
            }

            if (var12 < var5) {
               var5 = var12;
            }

            if (var12 > var8) {
               var8 = var12;
            }

            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var1) {
               var1 = var13;
            }

            var13 += var11 * var11;
            if (var13 > var2) {
               var2 = var13;
            }
         }

         this.field2089 = (short)var3;
         this.field2035 = (short)var6;
         this.field2062 = (short)var4;
         this.field2088 = (short)var7;
         this.field2087 = (short)var5;
         this.field2092 = (short)var8;
         this.field2031 = (short)((int)(Math.sqrt((double)var1) + 0.99D));
         this.field2086 = (short)((int)(Math.sqrt((double)var2) + 0.99D));
         this.field2084 = true;
      }

   }

   public int method5972() {
      if (!this.field2084) {
         this.method1433();
      }

      return this.field2031;
   }

   public int method5973() {
      if (!this.field2084) {
         this.method1433();
      }

      return this.field2086;
   }

   public int method6099() {
      if (!this.field2084) {
         this.method1433();
      }

      return this.field2089;
   }

   public int method6006() {
      if (!this.field2084) {
         this.method1433();
      }

      return this.field2035;
   }

   public int method5976() {
      if (!this.field2084) {
         this.method1433();
      }

      return this.field2062;
   }

   void method1434() {
      this.field2047 = new class87[this.field2034];

      int var1;
      for(var1 = 0; var1 < this.field2034; ++var1) {
         this.field2047[var1] = new class87();
      }

      for(var1 = 0; var1 < this.field2049; ++var1) {
         short var2 = this.field2050[var1];
         short var3 = this.field2051[var1];
         short var4 = this.field2052[var1];
         int var5 = this.field2043[var3] - this.field2043[var2];
         int var6 = this.field2044[var3] - this.field2044[var2];
         int var7 = this.field2045[var3] - this.field2045[var2];
         int var8 = this.field2043[var4] - this.field2043[var2];
         int var9 = this.field2044[var4] - this.field2044[var2];
         int var10 = this.field2045[var4] - this.field2045[var2];
         int var11 = var6 * var10 - var9 * var7;
         int var12 = var7 * var8 - var10 * var5;

         int var13;
         for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
            var11 >>= 1;
            var12 >>= 1;
         }

         int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
         if (var14 <= 0) {
            var14 = 1;
         }

         var11 = var11 * 256 / var14;
         var12 = var12 * 256 / var14;
         var13 = var13 * 256 / var14;
         byte var15;
         if (this.field2063 == null) {
            var15 = 0;
         } else {
            var15 = this.field2063[var1];
         }

         if (var15 == 0) {
            class87 var16 = this.field2047[var2];
            var16.field1128 += var11;
            var16.field1127 += var12;
            var16.field1129 += var13;
            ++var16.field1130;
            var16 = this.field2047[var3];
            var16.field1128 += var11;
            var16.field1127 += var12;
            var16.field1129 += var13;
            ++var16.field1130;
            var16 = this.field2047[var4];
            var16.field1128 += var11;
            var16.field1127 += var12;
            var16.field1129 += var13;
            ++var16.field1130;
         } else if (var15 == 1) {
            if (this.field2032 == null) {
               this.field2032 = new class609[this.field2049];
            }

            class609 var17 = this.field2032[var1] = new class609();
            var17.field8598 = var11;
            var17.field8599 = var12;
            var17.field8600 = var13;
         }
      }

   }

   public int method5978() {
      if (!this.field2084) {
         this.method1433();
      }

      return this.field2087;
   }

   public void method5980(int var1) {
      if ((this.field2038 & 4096) != 4096) {
         throw new IllegalStateException();
      } else {
         this.field2039 = var1;
         this.field2104 = 0;
      }
   }

   public boolean method6097(int var1, int var2, class135 var3, boolean var4, int var5) {
      this.method1415(this.field2061.method4450(Thread.currentThread()));
      class344 var6 = this.field2027.field7883;
      var6.method272(var3);
      class344 var7 = this.field2027.field7884;
      var7.method269(var6);
      var7.method271(this.field2061.field7934);
      boolean var8 = false;
      int var9 = Integer.MAX_VALUE;
      int var10 = Integer.MIN_VALUE;
      int var11 = Integer.MAX_VALUE;
      int var12 = Integer.MIN_VALUE;
      if (!this.field2084) {
         this.method1433();
      }

      int var13 = this.field2035 - this.field2089 >> 1;
      int var14 = this.field2088 - this.field2062 >> 1;
      int var15 = this.field2092 - this.field2087 >> 1;
      int var16 = this.field2089 + var13;
      int var17 = this.field2062 + var14;
      int var18 = this.field2087 + var15;
      int var19 = var16 - (var13 << var5);
      int var20 = var17 - (var14 << var5);
      int var21 = var18 - (var15 << var5);
      int var22 = var16 + (var13 << var5);
      int var23 = var17 + (var14 << var5);
      int var24 = var18 + (var15 << var5);
      this.field2101[0] = var19;
      this.field2053[0] = var20;
      this.field2103[0] = var21;
      this.field2101[1] = var22;
      this.field2053[1] = var20;
      this.field2103[1] = var21;
      this.field2101[2] = var19;
      this.field2053[2] = var23;
      this.field2103[2] = var21;
      this.field2101[3] = var22;
      this.field2053[3] = var23;
      this.field2103[3] = var21;
      this.field2101[4] = var19;
      this.field2053[4] = var20;
      this.field2103[4] = var24;
      this.field2101[5] = var22;
      this.field2053[5] = var20;
      this.field2103[5] = var24;
      this.field2101[6] = var19;
      this.field2053[6] = var23;
      this.field2103[6] = var24;
      this.field2101[7] = var22;
      this.field2053[7] = var23;
      this.field2103[7] = var24;

      int var25;
      int var26;
      int var27;
      int var28;
      float var29;
      float var30;
      float var31;
      float var32;
      for(var25 = 0; var25 < 8; ++var25) {
         var26 = this.field2101[var25];
         var27 = this.field2053[var25];
         var28 = this.field2103[var25];
         var29 = var7.field325[2] * (float)var26 + var7.field325[6] * (float)var27 + var7.field325[10] * (float)var28 + var7.field325[14];
         var30 = var7.field325[3] * (float)var26 + var7.field325[7] * (float)var27 + var7.field325[11] * (float)var28 + var7.field325[15];
         if (var29 >= -var30) {
            var31 = var7.field325[0] * (float)var26 + var7.field325[4] * (float)var27 + var7.field325[8] * (float)var28 + var7.field325[12];
            var32 = var7.field325[1] * (float)var26 + var7.field325[5] * (float)var27 + var7.field325[9] * (float)var28 + var7.field325[13];
            int var33 = (int)(this.field2061.field7952 + this.field2061.field7940 * var31 / var30);
            int var34 = (int)(this.field2061.field7943 + this.field2061.field7942 * var32 / var30);
            if (var33 < var9) {
               var9 = var33;
            }

            if (var33 > var10) {
               var10 = var33;
            }

            if (var34 < var11) {
               var11 = var34;
            }

            if (var34 > var12) {
               var12 = var34;
            }

            var8 = true;
         }
      }

      if (var8 && var1 > var9 && var1 < var10 && var2 > var11 && var2 < var12) {
         if (var4) {
            return true;
         }

         for(var25 = 0; var25 < this.field2091; ++var25) {
            var26 = this.field2043[var25];
            var27 = this.field2044[var25];
            var28 = this.field2045[var25];
            var29 = var7.field325[2] * (float)var26 + var7.field325[6] * (float)var27 + var7.field325[10] * (float)var28 + var7.field325[14];
            var30 = var7.field325[3] * (float)var26 + var7.field325[7] * (float)var27 + var7.field325[11] * (float)var28 + var7.field325[15];
            if (var29 >= -var30) {
               var31 = var7.field325[0] * (float)var26 + var7.field325[4] * (float)var27 + var7.field325[8] * (float)var28 + var7.field325[12];
               var32 = var7.field325[1] * (float)var26 + var7.field325[5] * (float)var27 + var7.field325[9] * (float)var28 + var7.field325[13];
               this.field2076[var25] = (float)((int)(this.field2061.field7952 + this.field2061.field7940 * var31 / var30));
               this.field2098[var25] = (float)((int)(this.field2061.field7943 + this.field2061.field7942 * var32 / var30));
            } else {
               this.field2076[var25] = -999999.0F;
            }
         }

         for(var25 = 0; var25 < this.field2049; ++var25) {
            if (this.field2076[this.field2050[var25]] != -999999.0F && this.field2076[this.field2051[var25]] != -999999.0F && this.field2076[this.field2052[var25]] != -999999.0F && this.method1427(var1, var2, this.field2098[this.field2050[var25]], this.field2098[this.field2051[var25]], this.field2098[this.field2052[var25]], this.field2076[this.field2050[var25]], this.field2076[this.field2051[var25]], this.field2076[this.field2052[var25]])) {
               return true;
            }
         }
      }

      return false;
   }

   public byte[] method5983() {
      return this.field2065;
   }

   public void method5984(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.field2049; ++var3) {
         if (this.field2067[var3] == var1) {
            this.field2067[var3] = var2;
         }
      }

      if (this.field2081 != null) {
         for(var3 = 0; var3 < this.field2080; ++var3) {
            class47 var4 = this.field2081[var3];
            class637 var5 = this.field2082[var3];
            var5.field9856 = var5.field9856 & -16777216 | class543.field3817[class526.method2228(this.field2067[var4.field5172], (byte)0) & '\uffff'] & 16777215;
         }
      }

      if (this.field2104 == 2) {
         this.field2104 = 1;
      }

   }

   public void method5985(byte var1, byte[] var2) {
      if ((this.field2038 & 1048576) == 0) {
         throw new RuntimeException();
      } else {
         if (this.field2065 == null) {
            this.field2065 = new byte[this.field2049];
         }

         int var3;
         if (var2 == null) {
            for(var3 = 0; var3 < this.field2049; ++var3) {
               this.field2065[var3] = var1;
            }
         } else {
            for(var3 = 0; var3 < this.field2049; ++var3) {
               int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
               this.field2065[var3] = (byte)var4;
            }
         }

         if (this.field2104 == 2) {
            this.field2104 = 1;
         }

      }
   }

   void method6084() {
      if (this.field2072) {
         for(int var1 = 0; var1 < this.field2091; ++var1) {
            this.field2043[var1] = this.field2043[var1] + 7 >> 4;
            this.field2044[var1] = this.field2044[var1] + 7 >> 4;
            this.field2045[var1] = this.field2045[var1] + 7 >> 4;
         }

         this.field2072 = false;
      }

      if (this.field2025) {
         this.method1418();
         this.field2025 = false;
      }

      this.field2084 = false;
   }

   public class396[] method5941() {
      return this.field2046;
   }

   public boolean method5988() {
      if (this.field2066 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.field2066.length; ++var1) {
            if (this.field2066[var1] != -1 && !this.field2061.method4448(this.field2066[var1])) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method6036() {
      return this.field2069;
   }

   public void method5954() {
      if ((this.field2038 & 16) != 16) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            int var2;
            for(var2 = 0; var2 < this.field2091; ++var2) {
               this.field2045[var2] = -this.field2045[var2];
            }

            if (this.field2047 != null) {
               for(var2 = 0; var2 < this.field2034; ++var2) {
                  if (this.field2047[var2] != null) {
                     this.field2047[var2].field1129 = -this.field2047[var2].field1129;
                  }
               }
            }

            if (this.field2078 != null) {
               for(var2 = 0; var2 < this.field2034; ++var2) {
                  if (this.field2078[var2] != null) {
                     this.field2078[var2].field1129 = -this.field2078[var2].field1129;
                  }
               }
            }

            if (this.field2032 != null) {
               for(var2 = 0; var2 < this.field2049; ++var2) {
                  if (this.field2032[var2] != null) {
                     this.field2032[var2].field8600 = -this.field2032[var2].field8600;
                  }
               }
            }

            short[] var6 = this.field2050;
            this.field2050 = this.field2052;
            this.field2052 = var6;
            if (this.field2030 != null) {
               for(int var3 = 0; var3 < this.field2049; ++var3) {
                  float var4;
                  if (this.field2030[var3] != null) {
                     var4 = this.field2030[var3][0];
                     this.field2030[var3][0] = this.field2030[var3][2];
                     this.field2030[var3][2] = var4;
                  }

                  if (this.field2054[var3] != null) {
                     var4 = this.field2054[var3][0];
                     this.field2054[var3][0] = this.field2054[var3][2];
                     this.field2054[var3][2] = var4;
                  }
               }
            }

            this.field2084 = false;
            this.field2104 = 0;
         }
      }
   }

   public void method5987(int var1, int var2, int var3, int var4) {
      if ((this.field2038 & 524288) != 524288) {
         throw new IllegalStateException();
      } else {
         int var5;
         for(var5 = 0; var5 < this.field2049; ++var5) {
            int var6 = this.field2067[var5] & '\uffff';
            int var7 = var6 >> 10 & 63;
            int var8 = var6 >> 7 & 7;
            int var9 = var6 & 127;
            if (var1 != -1) {
               var7 += (var1 - var7) * var4 >> 7;
            }

            if (var2 != -1) {
               var8 += (var2 - var8) * var4 >> 7;
            }

            if (var3 != -1) {
               var9 += (var3 - var9) * var4 >> 7;
            }

            this.field2067[var5] = (short)(var7 << 10 | var8 << 7 | var9);
         }

         if (this.field2081 != null) {
            for(var5 = 0; var5 < this.field2080; ++var5) {
               class47 var10 = this.field2081[var5];
               class637 var11 = this.field2082[var5];
               var11.field9856 = var11.field9856 & -16777216 | class543.field3817[class526.method2228(this.field2067[var10.field5172] & '\uffff', (byte)0) & '\uffff'] & 16777215;
            }
         }

         if (this.field2104 == 2) {
            this.field2104 = 1;
         }

      }
   }

   void method1435() {
      synchronized(this) {
         for(int var2 = 0; var2 < this.field2091; ++var2) {
            int var3 = this.field2043[var2];
            this.field2043[var2] = this.field2045[var2];
            this.field2045[var2] = -var3;
         }

         this.method1426();
      }
   }

   void method1436(boolean var1) {
      if (this.field2061.field7946 > 1) {
         synchronized(this) {
            this.method1416(var1);
         }
      } else {
         this.method1416(var1);
      }

   }

   public void method5970(class135 var1, int var2, boolean var3) {
      if (this.field2108 != null) {
         class258 var4 = this.field2061.method4450(Thread.currentThread());
         class135 var5 = var4.field7878;
         var5.method1024(var1);
         if (var3) {
            var5.method1012();
         }

         class344 var6 = var4.field7883;
         var6.method272(var5);
         float[] var7 = new float[3];

         for(int var8 = 0; var8 < this.field2034; ++var8) {
            if ((var2 & this.field2108[var8]) != 0) {
               var6.method276((float)this.field2043[var8], (float)this.field2044[var8], (float)this.field2045[var8], var7);
               this.field2043[var8] = (int)var7[0];
               this.field2044[var8] = (int)var7[1];
               this.field2045[var8] = (int)var7[2];
            }
         }
      }

   }

   public void method5953(int var1, int var2, int var3) {
      if (var1 != 0 && (this.field2038 & 1) != 1) {
         throw new IllegalStateException();
      } else if (var2 != 0 && (this.field2038 & 2) != 2) {
         throw new IllegalStateException();
      } else if (var3 != 0 && (this.field2038 & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.field2091; ++var5) {
               this.field2043[var5] += var1;
               this.field2044[var5] += var2;
               this.field2045[var5] += var3;
            }

         }
      }
   }

   void method1437(class135 var1, class211 var2, int var3) {
      if (this.field2034 >= 1) {
         class258 var4 = this.field2061.method4450(Thread.currentThread());
         class344 var5 = var4.field7883;
         var5.method272(var1);
         class344 var6 = this.field2061.field7947;
         class344 var7 = this.field2061.field7933;
         if (!this.field2084) {
            this.method1433();
         }

         boolean var8 = var5.method275();
         float[] var9 = var4.field7887;
         var5.method276(0.0F, (float)this.field2062, 0.0F, var9);
         float var10 = var9[0];
         float var11 = var9[1];
         float var12 = var9[2];
         var5.method276(0.0F, (float)this.field2088, 0.0F, var9);
         float var13 = var9[0];
         float var14 = var9[1];
         float var15 = var9[2];

         float var18;
         float var19;
         for(int var16 = 0; var16 < 6; ++var16) {
            float[] var17 = this.field2061.field7935[var16];
            var18 = var17[0] * var10 + var17[1] * var11 + var17[2] * var12 + var17[3] + (float)this.field2031;
            var19 = var17[0] * var13 + var17[1] * var14 + var17[2] * var15 + var17[3] + (float)this.field2031;
            if (var18 < 0.0F && var19 < 0.0F) {
               return;
            }
         }

         float var50;
         float var51;
         if (var8) {
            var50 = var6.field325[14];
            var51 = var6.field325[6];
         } else {
            var50 = var5.field325[12] * var6.field325[2] + var5.field325[13] * var6.field325[6] + var5.field325[14] * var6.field325[10] + var6.field325[14];
            var51 = var5.field325[4] * var6.field325[2] + var5.field325[5] * var6.field325[6] + var5.field325[6] * var6.field325[10];
         }

         var18 = var50 + (float)this.field2062 * var51;
         var19 = var50 + (float)this.field2088 * var51;
         float var20 = var18 > var19 ? var18 + (float)this.field2031 : var19 + (float)this.field2031;
         float var21 = var7.field325[10] * var20 + var7.field325[14];
         if (this.field2061.field7946 > 1) {
            synchronized(this) {
               while(this.field2100) {
                  try {
                     this.wait();
                  } catch (InterruptedException var47) {
                     ;
                  }
               }

               this.field2100 = true;
            }
         }

         this.method1415(var4);
         class344 var22 = this.field2027.field7884;
         var22.method269(var5);
         var22.method271(this.field2061.field7934);
         if ((var3 & 2) != 0) {
            this.field2029.method337(true);
         } else {
            this.field2029.method337(false);
         }

         boolean var23 = false;
         this.field2027.field7909 = this.field2029.field333;
         this.field2027.field7898 = this.field2029.field342;
         this.field2027.field7900 = this.field2029.field362;
         this.field2027.field7880 = 1.0F / this.field2029.field362;
         this.field2027.field7897 = this.field2029.field339;
         this.field2027.field7882 = this.field2029.field341;
         this.field2027.field7901 = this.field2029.field343;
         this.field2027.field7903 = this.field2029.field338;

         int var24;
         int var26;
         int var27;
         float var31;
         for(var24 = 0; var24 < this.field2091; ++var24) {
            int var25 = this.field2043[var24];
            var26 = this.field2044[var24];
            var27 = this.field2045[var24];
            float var28 = var22.field325[0] * (float)var25 + var22.field325[4] * (float)var26 + var22.field325[8] * (float)var27 + var22.field325[12];
            float var29 = var22.field325[1] * (float)var25 + var22.field325[5] * (float)var26 + var22.field325[9] * (float)var27 + var22.field325[13];
            float var30 = var22.field325[2] * (float)var25 + var22.field325[6] * (float)var26 + var22.field325[10] * (float)var27 + var22.field325[14];
            var31 = var22.field325[3] * (float)var25 + var22.field325[7] * (float)var26 + var22.field325[11] * (float)var27 + var22.field325[15];
            this.field2099[var24] = this.field2027.field7901 + this.field2027.field7900 * var30 / var31;
            this.field2037[var24] = var31;
            if (var30 >= -var31) {
               this.field2076[var24] = (float)((int)(this.field2027.field7897 + this.field2027.field7909 * var28 / var31));
               this.field2098[var24] = (float)((int)(this.field2027.field7882 + this.field2027.field7898 * var29 / var31));
            } else {
               this.field2076[var24] = -5000.0F;
               var23 = true;
            }

            if (this.field2027.field7875) {
               this.field2026[var24] = (int)(var5.field325[13] + var5.field325[1] * (float)var25 + var5.field325[5] * (float)var26 + var5.field325[9] * (float)var27);
            }
         }

         float var33;
         float var34;
         float var35;
         float var36;
         float var37;
         float var38;
         float var39;
         float var40;
         float var41;
         float var42;
         short var58;
         if (this.field2081 != null) {
            for(var24 = 0; var24 < this.field2080; ++var24) {
               class47 var53 = this.field2081[var24];
               class637 var55 = this.field2082[var24];
               short var56 = this.field2050[var53.field5172];
               short var57 = this.field2051[var53.field5172];
               var58 = this.field2052[var53.field5172];
               int var59 = (this.field2043[var56] + this.field2043[var57] + this.field2043[var58]) / 3;
               int var60 = (this.field2044[var56] + this.field2044[var57] + this.field2044[var58]) / 3;
               int var32 = (this.field2045[var56] + this.field2045[var57] + this.field2045[var58]) / 3;
               var33 = var22.field325[0] * (float)var59 + var22.field325[4] * (float)var60 + var22.field325[8] * (float)var32 + var22.field325[12];
               var34 = var22.field325[1] * (float)var59 + var22.field325[5] * (float)var60 + var22.field325[9] * (float)var32 + var22.field325[13];
               var35 = var22.field325[2] * (float)var59 + var22.field325[6] * (float)var60 + var22.field325[10] * (float)var32 + var22.field325[14];
               var36 = var22.field325[3] * (float)var59 + var22.field325[7] * (float)var60 + var22.field325[11] * (float)var32 + var22.field325[15];
               var35 += var7.field325[2] * (float)var55.field9849 + var7.field325[6] * (float)var55.field9846;
               var36 += var7.field325[3] * (float)var55.field9849 + var7.field325[7] * (float)var55.field9846;
               if (var35 > -var36) {
                  var33 += var7.field325[0] * (float)var55.field9849 + var7.field325[4] * (float)var55.field9846;
                  var34 += var7.field325[1] * (float)var55.field9849 + var7.field325[5] * (float)var55.field9846;
                  var37 = this.field2061.field7952 + this.field2061.field7940 * var33 / var36;
                  var38 = this.field2061.field7943 + this.field2061.field7942 * var34 / var36;
                  var39 = var55.field9847 * (float)var53.field5175;
                  var40 = var55.field9850 * (float)var53.field5177;
                  var41 = var33 + var7.field325[0] * var39 + var7.field325[4] * var40;
                  var42 = var34 + var7.field325[1] * var39 + var7.field325[5] * var40;
                  float var43 = var36 + var7.field325[3] * var39 + var7.field325[7] * var40;
                  float var44 = this.field2061.field7952 + this.field2061.field7940 * var41 / var43;
                  float var45 = this.field2061.field7943 + this.field2061.field7942 * var42 / var43;
                  var55.field9854 = (int)var37;
                  var55.field9853 = (int)var38;
                  var55.field9852 = this.field2061.field7951 + this.field2061.field7944 * (var35 - var7.field325[10] * (float)var53.field5178) / var36;
                  var55.field9848 = (int)(var44 < var37 ? var37 - var44 : var44 - var37);
                  var55.field9855 = (int)(var45 < var38 ? var38 - var45 : var45 - var38);
               } else {
                  var55.field9855 = 0;
                  var55.field9848 = 0;
               }
            }
         }

         if (var2 != null) {
            boolean var52 = false;
            boolean var54 = true;
            var26 = this.field2089 + this.field2035 >> 1;
            var27 = this.field2087 + this.field2092 >> 1;
            var58 = this.field2062;
            var31 = var22.field325[0] * (float)var26 + var22.field325[4] * (float)var58 + var22.field325[8] * (float)var27 + var22.field325[12];
            float var61 = var22.field325[1] * (float)var26 + var22.field325[5] * (float)var58 + var22.field325[9] * (float)var27 + var22.field325[13];
            var33 = var22.field325[2] * (float)var26 + var22.field325[6] * (float)var58 + var22.field325[10] * (float)var27 + var22.field325[14];
            var34 = var22.field325[3] * (float)var26 + var22.field325[7] * (float)var58 + var22.field325[11] * (float)var27 + var22.field325[15];
            if (var33 >= -var34) {
               var2.field7246 = (int)(this.field2061.field7952 + this.field2061.field7940 * var31 / var34);
               var2.field7247 = (int)(this.field2061.field7943 + this.field2061.field7942 * var61 / var34);
            } else {
               var52 = true;
            }

            var58 = this.field2088;
            var35 = var22.field325[0] * (float)var26 + var22.field325[4] * (float)var58 + var22.field325[8] * (float)var27 + var22.field325[12];
            var36 = var22.field325[1] * (float)var26 + var22.field325[5] * (float)var58 + var22.field325[9] * (float)var27 + var22.field325[13];
            var37 = var22.field325[2] * (float)var26 + var22.field325[6] * (float)var58 + var22.field325[10] * (float)var27 + var22.field325[14];
            var38 = var22.field325[3] * (float)var26 + var22.field325[7] * (float)var58 + var22.field325[11] * (float)var27 + var22.field325[15];
            if (var37 >= -var38) {
               var2.field7248 = (int)(this.field2061.field7952 + this.field2061.field7940 * var35 / var38);
               var2.field7245 = (int)(this.field2061.field7943 + this.field2061.field7942 * var36 / var38);
            } else {
               var52 = true;
            }

            if (var52) {
               if (var33 < -var34 && var37 < -var38) {
                  var54 = false;
               } else if (var33 < -var34) {
                  var39 = (var33 + var34) / (var37 + var38) - 1.0F;
                  var40 = var31 + var39 * (var35 - var31);
                  var41 = var61 + var39 * (var36 - var61);
                  var42 = var34 + var39 * (var38 - var34);
                  var2.field7246 = (int)(this.field2061.field7952 + this.field2061.field7940 * var40 / var42);
                  var2.field7247 = (int)(this.field2061.field7943 + this.field2061.field7942 * var41 / var42);
               } else if (var37 < -var38) {
                  var39 = (var37 + var38) / (var33 + var34) - 1.0F;
                  var40 = var35 + var39 * (var31 - var35);
                  var41 = var36 + var39 * (var61 - var36);
                  var42 = var38 + var39 * (var34 - var38);
                  var2.field7248 = (int)(this.field2061.field7952 + this.field2061.field7940 * var40 / var42);
                  var2.field7245 = (int)(this.field2061.field7943 + this.field2061.field7942 * var41 / var42);
               }
            }

            if (var54) {
               if (var33 / var34 > var37 / var38) {
                  var39 = var31 + var7.field325[0] * (float)this.field2031 + var7.field325[12];
                  var40 = var34 + var7.field325[3] * (float)this.field2031 + var7.field325[15];
                  var2.field7250 = (int)(this.field2061.field7952 - (float)var2.field7246 + this.field2061.field7940 * var39 / var40);
               } else {
                  var39 = var35 + var7.field325[0] * (float)this.field2031 + var7.field325[12];
                  var40 = var38 + var7.field325[3] * (float)this.field2031 + var7.field325[15];
                  var2.field7250 = (int)(this.field2061.field7952 - (float)var2.field7248 + this.field2061.field7940 * var39 / var40);
               }

               var2.field7249 = true;
            }
         }

         this.method1436(true);
         this.field2029.field332 = (var3 & 1) == 0;
         this.field2029.field364 = false;

         try {
            this.method1439(this.field2061.field7914 != null, this.field2061.field7920 != null, (var3 & 4) != 0, var23, this.field2027.field7905 && var21 > this.field2027.field7894 || this.field2027.field7875);
         } catch (Exception var48) {
            ;
         }

         if (this.field2081 != null) {
            for(var24 = 0; var24 < this.field2049; ++var24) {
               this.field2106[var24] = -1;
            }
         }

         this.field2029 = null;
         if (this.field2061.field7946 > 1) {
            synchronized(this) {
               this.field2100 = false;
               this.notifyAll();
            }
         }
      }

   }

   public class933[] method6089() {
      return this.field2042;
   }

   class597(class257 var1) {
      this.field2061 = var1;
   }

   final void method1438(boolean var1, boolean var2, boolean var3, int var4) {
      short var5 = this.field2050[var4];
      short var6 = this.field2051[var4];
      short var7 = this.field2052[var4];
      if (this.field2066 != null && this.field2066[var4] != -1) {
         int var8 = -16777216;
         if (this.field2065 != null) {
            var8 = 255 - (this.field2065[var4] & 255) << 24;
         }

         if (this.field2093[var4] == -1) {
            int var9 = var8 | this.field2055[var4] & 16777215;
            this.field2029.method338(var1, var2, var3, this.field2098[var5], this.field2098[var6], this.field2098[var7], this.field2076[var5], this.field2076[var6], this.field2076[var7], this.field2099[var5], this.field2099[var6], this.field2099[var7], this.field2037[var5], this.field2037[var6], this.field2037[var7], this.field2030[var4][0], this.field2030[var4][1], this.field2030[var4][2], this.field2054[var4][0], this.field2054[var4][1], this.field2054[var4][2], var9, var9, var9, this.field2027.field7873, 0.0F, 0.0F, 0.0F, this.field2066[var4]);
         } else {
            this.field2029.method338(var1, var2, var3, this.field2098[var5], this.field2098[var6], this.field2098[var7], this.field2076[var5], this.field2076[var6], this.field2076[var7], this.field2099[var5], this.field2099[var6], this.field2099[var7], this.field2037[var5], this.field2037[var6], this.field2037[var7], this.field2030[var4][0], this.field2030[var4][1], this.field2030[var4][2], this.field2054[var4][0], this.field2054[var4][1], this.field2054[var4][2], var8 | this.field2055[var4] & 16777215, var8 | this.field2056[var4] & 16777215, var8 | this.field2093[var4] & 16777215, this.field2027.field7873, 0.0F, 0.0F, 0.0F, this.field2066[var4]);
         }
      } else {
         if (this.field2065 == null) {
            this.field2029.field335 = 0;
         } else {
            this.field2029.field335 = this.field2065[var4] & 255;
         }

         if (this.field2093[var4] == -1) {
            this.field2029.method341(var1, var2, var3, this.field2098[var5], this.field2098[var6], this.field2098[var7], this.field2076[var5], this.field2076[var6], this.field2076[var7], this.field2099[var5], this.field2099[var6], this.field2099[var7], class543.field3817[this.field2055[var4] & '\uffff']);
         } else {
            this.field2029.method347(var1, var2, var3, this.field2098[var5], this.field2098[var6], this.field2098[var7], this.field2076[var5], this.field2076[var6], this.field2076[var7], this.field2099[var5], this.field2099[var6], this.field2099[var7], (float)(this.field2055[var4] & '\uffff'), (float)(this.field2056[var4] & '\uffff'), (float)(this.field2093[var4] & '\uffff'));
         }
      }

   }

   public void method5986(short var1, short var2) {
      if (this.field2066 != null) {
         if (!this.field2069 && var2 >= 0) {
            class414 var3 = this.field2061.field8581.method4625(var2 & '\uffff', 1755234581);
            if (var3.field9389 != 0 || var3.field9363 != 0) {
               this.field2069 = true;
            }
         }

         for(int var4 = 0; var4 < this.field2049; ++var4) {
            if (this.field2066[var4] == var1) {
               this.field2066[var4] = var2;
            }
         }
      }

   }

   public int method5948() {
      return this.field2038;
   }

   public void method5981(int var1) {
      if ((this.field2038 & 8192) != 8192) {
         throw new IllegalStateException();
      } else {
         this.field2040 = var1;
         this.field2104 = 0;
      }
   }

   final void method1439(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      int var6;
      class47 var7;
      if (this.field2081 != null) {
         for(var6 = 0; var6 < this.field2080; this.field2106[var7.field5172] = var6++) {
            var7 = this.field2081[var6];
         }
      }

      if (!this.field2048 && this.field2081 == null) {
         for(var6 = 0; var6 < this.field2049; ++var6) {
            this.method1429(var1, var2, var3, var6, var4, var5);
         }
      } else if ((this.field2038 & 256) == 0 && this.field2095 != null) {
         for(var6 = 0; var6 < this.field2049; ++var6) {
            short var9 = this.field2095[var6];
            this.method1429(var1, var2, var3, var9, var4, var5);
         }
      } else {
         for(var6 = 0; var6 < this.field2049; ++var6) {
            if (!this.method1428(var6) && !this.method1442(var6)) {
               this.method1429(var1, var2, var3, var6, var4, var5);
            }
         }

         if (this.field2064 == null) {
            for(var6 = 0; var6 < this.field2049; ++var6) {
               if (this.method1428(var6) || this.method1442(var6)) {
                  this.method1429(var1, var2, var3, var6, var4, var5);
               }
            }
         } else {
            for(var6 = 0; var6 < 12; ++var6) {
               for(int var8 = 0; var8 < this.field2049; ++var8) {
                  if (this.field2064[var8] == var6 && (this.method1428(var8) || this.method1442(var8))) {
                     this.method1429(var1, var2, var3, var8, var4, var5);
                  }
               }
            }
         }
      }

   }

   void method1440() {
      if (this.field2104 == 0 && this.field2047 == null) {
         if (this.field2061.field7946 > 1) {
            synchronized(this) {
               this.method1434();
            }
         } else {
            this.method1434();
         }
      }

   }

   public int method5982() {
      return this.field2039;
   }

   public int method5979() {
      if (!this.field2084) {
         this.method1433();
      }

      return this.field2092;
   }

   void method1441(Thread var1) {
      class258 var2 = this.field2061.method4450(var1);
      if (var2 != this.field2028) {
         this.field2028 = var2;
         this.field2107 = this.field2028.field7876;
         this.field2096 = this.field2028.field7906;
      }

   }

   public int method5950() {
      return this.field2040;
   }

   void method5958() {
      if (this.field2061.field7946 > 1) {
         synchronized(this) {
            while(super.field9859) {
               try {
                  this.wait();
               } catch (InterruptedException var3) {
                  ;
               }
            }

            super.field9859 = true;
         }
      }

   }

   final boolean method1442(int var1) {
      if (this.field2106 == null) {
         return false;
      } else {
         return this.field2106[var1] != -1;
      }
   }

   public void method5947(int var1) {
      if (this.field2061.field7946 > 1) {
         synchronized(this) {
            if ((this.field2038 & 65536) == 65536 && (var1 & 65536) == 0) {
               this.method1436(true);
            }

            this.field2038 = var1;
         }
      } else {
         if ((this.field2038 & 65536) == 65536 && (var1 & 65536) == 0) {
            this.method1436(true);
         }

         this.field2038 = var1;
      }

   }
}
