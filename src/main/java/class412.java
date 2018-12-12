import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class class412 extends class879 {
   class664[] field9271;
   boolean field9272;
   class325 field9273;
   int[] field9274;
   int field9275;
   short field9276;
   short field9277;
   int field9278;
   int field9279;
   int[] field9280;
   static int field9281;
   boolean field9282;
   class396[] field9283;
   static boolean field9284;
   int field9285;
   short[] field9286;
   short[] field9287;
   short[] field9288;
   short[] field9289;
   class750 field9290;
   int field9291;
   int[] field9292;
   float[] field9293;
   class626 field9294;
   int field9295;
   int field9296;
   int[][] field9297;
   short[] field9298;
   short[] field9299;
   short[] field9300;
   short[] field9301;
   short[] field9302;
   int[][] field9303;
   short[] field9304;
   class303 field9305;
   class750 field9306;
   int field9307;
   static int[] field9308 = new int[1];
   class750 field9309;
   boolean field9310;
   boolean field9311;
   static int[] field9312 = new int[1];
   class750 field9313;
   short[] field9314;
   int field9315;
   static int field9316;
   int field9317;
   int field9318;
   int field9319;
   int field9320;
   int field9321;
   int field9322;
   int[] field9323;
   int[] field9324;
   int[][] field9325;
   int[] field9326;
   short[] field9327;
   class933[] field9328;
   boolean field9329;
   int field9330;
   class300[] field9331;
   float[] field9332;
   static int field9333 = 7;
   static long[] field9334;
   static int field9335;
   static int field9336 = 4;
   byte[] field9337;
   static int[] field9338 = new int[8];
   static int[] field9339 = new int[8];
   static int[] field9340 = new int[8];
   static float[] field9341 = new float[2];
   byte[] field9342;
   short[] field9343;
   int[] field9344;
   static class42 field9345;

   public int method6006() {
      if (!this.field9329) {
         this.method5562();
      }

      return this.field9320;
   }

   void method5562() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.field9279; ++var9) {
         int var10 = this.field9280[var9];
         int var11 = this.field9274[var9];
         int var12 = this.field9344[var9];
         if (var10 < var1) {
            var1 = var10;
         }

         if (var10 > var4) {
            var4 = var10;
         }

         if (var11 < var2) {
            var2 = var11;
         }

         if (var11 > var5) {
            var5 = var11;
         }

         if (var12 < var3) {
            var3 = var12;
         }

         if (var12 > var6) {
            var6 = var12;
         }

         int var13 = var10 * var10 + var12 * var12;
         if (var13 > var7) {
            var7 = var13;
         }

         var13 = var10 * var10 + var12 * var12 + var11 * var11;
         if (var13 > var8) {
            var8 = var13;
         }
      }

      this.field9319 = var1;
      this.field9320 = var4;
      this.field9317 = var2;
      this.field9318 = var5;
      this.field9321 = var3;
      this.field9322 = var6;
      this.field9315 = (int)(Math.sqrt((double)var7) + 0.99D);
      this.field9307 = (int)(Math.sqrt((double)var8) + 0.99D);
      this.field9329 = true;
   }

   static byte[] method5563(byte[] var0, int var1) {
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   static short[] method5564(short[] var0, int var1) {
      short[] var2 = new short[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   boolean method5565() {
      if (this.field9305.field3847) {
         return true;
      } else {
         if (this.field9305.field3846 == null) {
            this.field9305.field3846 = this.field9273.method640(false);
         }

         class920 var1 = this.field9305.field3846;
         var1.method6489(this.field9296 * 6);
         Unsafe var2 = this.field9273.field663;
         if (var2 != null) {
            int var8 = this.field9296 * 6;
            long var4 = var1.method1976(0, var8);
            if (var4 == 0L) {
               return false;
            } else {
               for(int var6 = 0; var6 < this.field9296; ++var6) {
                  var2.putShort(var4, this.field9299[var6]);
                  var4 += 2L;
                  var2.putShort(var4, this.field9300[var6]);
                  var4 += 2L;
                  var2.putShort(var4, this.field9301[var6]);
                  var4 += 2L;
               }

               var1.method1983();
               this.field9305.field3844 = var1;
               this.field9305.field3847 = true;
               this.field9311 = true;
               return true;
            }
         } else {
            ByteBuffer var3 = this.field9273.field660;
            var3.clear();

            for(int var7 = 0; var7 < this.field9296; ++var7) {
               var3.putShort(this.field9299[var7]);
               var3.putShort(this.field9300[var7]);
               var3.putShort(this.field9301[var7]);
            }

            if (var1.method1977(0, var3.position(), this.field9273.field661)) {
               this.field9305.field3844 = var1;
               this.field9305.field3847 = true;
               this.field9311 = true;
               return true;
            } else {
               return false;
            }
         }
      }
   }

   void method5964(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var11;
      int[] var12;
      int var13;
      int var14;
      if (var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var9 = 0;
         field9281 = 0;
         field9316 = 0;
         field9335 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            var11 = var2[var10];
            if (var11 < this.field9297.length) {
               var12 = this.field9297[var11];

               for(var13 = 0; var13 < var12.length; ++var13) {
                  var14 = var12[var13];
                  field9281 += this.field9280[var14];
                  field9316 += this.field9274[var14];
                  field9335 += this.field9344[var14];
                  ++var9;
               }
            }
         }

         if (var9 > 0) {
            field9281 = field9281 / var9 + var3;
            field9316 = field9316 / var9 + var4;
            field9335 = field9335 / var9 + var5;
         } else {
            field9281 = var3;
            field9316 = var4;
            field9335 = var5;
         }
      } else {
         int[] var21;
         int var22;
         if (var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if (var10 < this.field9297.length) {
                  var21 = this.field9297[var10];

                  for(var22 = 0; var22 < var21.length; ++var22) {
                     var13 = var21[var22];
                     this.field9280[var13] += var3;
                     this.field9274[var13] += var4;
                     this.field9344[var13] += var5;
                  }
               }
            }
         } else {
            int var15;
            int var16;
            int var17;
            int var18;
            if (var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if (var10 < this.field9297.length) {
                     var21 = this.field9297[var10];
                     if ((var6 & 1) == 0) {
                        for(var22 = 0; var22 < var21.length; ++var22) {
                           var13 = var21[var22];
                           this.field9280[var13] -= field9281;
                           this.field9274[var13] -= field9316;
                           this.field9344[var13] -= field9335;
                           if (var5 != 0) {
                              var14 = class703.field3413[var5];
                              var15 = class703.field3404[var5];
                              var16 = this.field9274[var13] * var14 + this.field9280[var13] * var15 + 16383 >> 14;
                              this.field9274[var13] = this.field9274[var13] * var15 - this.field9280[var13] * var14 + 16383 >> 14;
                              this.field9280[var13] = var16;
                           }

                           if (var3 != 0) {
                              var14 = class703.field3413[var3];
                              var15 = class703.field3404[var3];
                              var16 = this.field9274[var13] * var15 - this.field9344[var13] * var14 + 16383 >> 14;
                              this.field9344[var13] = this.field9274[var13] * var14 + this.field9344[var13] * var15 + 16383 >> 14;
                              this.field9274[var13] = var16;
                           }

                           if (var4 != 0) {
                              var14 = class703.field3413[var4];
                              var15 = class703.field3404[var4];
                              var16 = this.field9344[var13] * var14 + this.field9280[var13] * var15 + 16383 >> 14;
                              this.field9344[var13] = this.field9344[var13] * var15 - this.field9280[var13] * var14 + 16383 >> 14;
                              this.field9280[var13] = var16;
                           }

                           this.field9280[var13] += field9281;
                           this.field9274[var13] += field9316;
                           this.field9344[var13] += field9335;
                        }
                     } else {
                        for(var22 = 0; var22 < var21.length; ++var22) {
                           var13 = var21[var22];
                           this.field9280[var13] -= field9281;
                           this.field9274[var13] -= field9316;
                           this.field9344[var13] -= field9335;
                           if (var3 != 0) {
                              var14 = class703.field3413[var3];
                              var15 = class703.field3404[var3];
                              var16 = this.field9274[var13] * var15 - this.field9344[var13] * var14 + 16383 >> 14;
                              this.field9344[var13] = this.field9274[var13] * var14 + this.field9344[var13] * var15 + 16383 >> 14;
                              this.field9274[var13] = var16;
                           }

                           if (var5 != 0) {
                              var14 = class703.field3413[var5];
                              var15 = class703.field3404[var5];
                              var16 = this.field9274[var13] * var14 + this.field9280[var13] * var15 + 16383 >> 14;
                              this.field9274[var13] = this.field9274[var13] * var15 - this.field9280[var13] * var14 + 16383 >> 14;
                              this.field9280[var13] = var16;
                           }

                           if (var4 != 0) {
                              var14 = class703.field3413[var4];
                              var15 = class703.field3404[var4];
                              var16 = this.field9344[var13] * var14 + this.field9280[var13] * var15 + 16383 >> 14;
                              this.field9344[var13] = this.field9344[var13] * var15 - this.field9280[var13] * var14 + 16383 >> 14;
                              this.field9280[var13] = var16;
                           }

                           this.field9280[var13] += field9281;
                           this.field9274[var13] += field9316;
                           this.field9344[var13] += field9335;
                        }
                     }
                  }
               }

               if (var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if (var10 < this.field9297.length) {
                        var21 = this.field9297[var10];

                        for(var22 = 0; var22 < var21.length; ++var22) {
                           var13 = var21[var22];
                           var14 = this.field9326[var13];
                           var15 = this.field9326[var13 + 1];

                           for(var16 = var14; var16 < var15; ++var16) {
                              var17 = this.field9327[var16] - 1;
                              if (var17 == -1) {
                                 break;
                              }

                              int var19;
                              int var20;
                              if (var5 != 0) {
                                 var18 = class703.field3413[var5];
                                 var19 = class703.field3404[var5];
                                 var20 = this.field9289[var17] * var18 + this.field9288[var17] * var19 + 16383 >> 14;
                                 this.field9289[var17] = (short)(this.field9289[var17] * var19 - this.field9288[var17] * var18 + 16383 >> 14);
                                 this.field9288[var17] = (short)var20;
                              }

                              if (var3 != 0) {
                                 var18 = class703.field3413[var3];
                                 var19 = class703.field3404[var3];
                                 var20 = this.field9289[var17] * var19 - this.field9298[var17] * var18 + 16383 >> 14;
                                 this.field9298[var17] = (short)(this.field9289[var17] * var18 + this.field9298[var17] * var19 + 16383 >> 14);
                                 this.field9289[var17] = (short)var20;
                              }

                              if (var4 != 0) {
                                 var18 = class703.field3413[var4];
                                 var19 = class703.field3404[var4];
                                 var20 = this.field9298[var17] * var18 + this.field9288[var17] * var19 + 16383 >> 14;
                                 this.field9298[var17] = (short)(this.field9298[var17] * var19 - this.field9288[var17] * var18 + 16383 >> 14);
                                 this.field9288[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  this.method5569();
               }
            } else if (var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if (var10 < this.field9297.length) {
                     var21 = this.field9297[var10];

                     for(var22 = 0; var22 < var21.length; ++var22) {
                        var13 = var21[var22];
                        this.field9280[var13] -= field9281;
                        this.field9274[var13] -= field9316;
                        this.field9344[var13] -= field9335;
                        this.field9280[var13] = this.field9280[var13] * var3 >> 7;
                        this.field9274[var13] = this.field9274[var13] * var4 >> 7;
                        this.field9344[var13] = this.field9344[var13] * var5 >> 7;
                        this.field9280[var13] += field9281;
                        this.field9274[var13] += field9316;
                        this.field9344[var13] += field9335;
                     }
                  }
               }
            } else {
               boolean var23;
               class300 var24;
               class664 var25;
               if (var1 == 5) {
                  if (this.field9303 != null) {
                     var23 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var11 = var2[var10];
                        if (var11 < this.field9303.length) {
                           var12 = this.field9303[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var14 = var12[var13];
                              var15 = (this.field9342[var14] & 255) + var3 * 8;
                              if (var15 < 0) {
                                 var15 = 0;
                              } else if (var15 > 255) {
                                 var15 = 255;
                              }

                              this.field9342[var14] = (byte)var15;
                           }

                           var23 |= var12.length > 0;
                        }
                     }

                     if (var23) {
                        if (this.field9331 != null) {
                           for(var10 = 0; var10 < this.field9330; ++var10) {
                              var24 = this.field9331[var10];
                              var25 = this.field9271[var10];
                              var25.field9607 = var25.field9607 & 16777215 | 255 - (this.field9342[var24.field3937] & 255) << 24;
                           }
                        }

                        this.method5568();
                     }
                  }
               } else if (var1 == 7) {
                  if (this.field9303 != null) {
                     var23 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var11 = var2[var10];
                        if (var11 < this.field9303.length) {
                           var12 = this.field9303[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var14 = var12[var13];
                              var15 = this.field9314[var14] & '\uffff';
                              var16 = var15 >> 10 & 63;
                              var17 = var15 >> 7 & 7;
                              var18 = var15 & 127;
                              var16 = var16 + var3 & 63;
                              var17 += var4 / 4;
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

                              this.field9314[var14] = (short)(var16 << 10 | var17 << 7 | var18);
                           }

                           var23 |= var12.length > 0;
                        }
                     }

                     if (var23) {
                        if (this.field9331 != null) {
                           for(var10 = 0; var10 < this.field9330; ++var10) {
                              var24 = this.field9331[var10];
                              var25 = this.field9271[var10];
                              var25.field9607 = var25.field9607 & -16777216 | class134.field1398[this.field9314[var24.field3937] & '\uffff'] & 16777215;
                           }
                        }

                        this.method5568();
                     }
                  }
               } else {
                  class664 var26;
                  if (var1 == 8) {
                     if (this.field9325 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if (var10 < this.field9325.length) {
                              var21 = this.field9325[var10];

                              for(var22 = 0; var22 < var21.length; ++var22) {
                                 var26 = this.field9271[var21[var22]];
                                 var26.field9608 += var3;
                                 var26.field9609 += var4;
                              }
                           }
                        }
                     }
                  } else if (var1 == 10) {
                     if (this.field9325 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if (var10 < this.field9325.length) {
                              var21 = this.field9325[var10];

                              for(var22 = 0; var22 < var21.length; ++var22) {
                                 var26 = this.field9271[var21[var22]];
                                 var26.field9606 = var26.field9606 * var3 >> 7;
                                 var26.field9605 = var26.field9605 * var4 >> 7;
                              }
                           }
                        }
                     }
                  } else if (var1 == 9 && this.field9325 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if (var10 < this.field9325.length) {
                           var21 = this.field9325[var10];

                           for(var22 = 0; var22 < var21.length; ++var22) {
                              var26 = this.field9271[var21[var22]];
                              var26.field9610 = var26.field9610 + var3 & 16383;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public void method6093() {
      if (this.field9285 > 0 && this.field9296 > 0) {
         this.method5574();
         this.method5565();
         this.method5567();
      }

   }

   public class879 method6017(byte var1, int var2, boolean var3) {
      boolean var4 = false;
      class412 var5;
      class412 var6;
      if (var1 > 0 && var1 <= 7) {
         var5 = this.field9273.field711[var1 - 1];
         var6 = this.field9273.field732[var1 - 1];
         var4 = true;
      } else {
         var6 = var5 = new class412(this.field9273, 0, 0, true, false);
      }

      return this.method5566(var6, var5, var2, var4, var3);
   }

   class879 method5566(class412 var1, class412 var2, int var3, boolean var4, boolean var5) {
      var1.field9291 = var3;
      var1.field9275 = this.field9275;
      var1.field9276 = this.field9276;
      var1.field9277 = this.field9277;
      var1.field9278 = this.field9278;
      var1.field9279 = this.field9279;
      var1.field9285 = this.field9285;
      var1.field9295 = this.field9295;
      var1.field9296 = this.field9296;
      var1.field9330 = this.field9330;
      if ((var3 & 256) != 0) {
         var1.field9272 = true;
      } else {
         var1.field9272 = this.field9272;
      }

      var1.field9282 = this.field9282;
      boolean var6 = class586.method301(var3, this.field9275);
      boolean var7 = class586.method312(var3, this.field9275);
      boolean var8 = class586.method302(var3, this.field9275);
      boolean var9 = var6 | var7 | var8;
      int var10;
      if (var9) {
         if (var6) {
            if (var2.field9280 != null && var2.field9280.length >= this.field9278) {
               var1.field9280 = var2.field9280;
            } else {
               var1.field9280 = var2.field9280 = new int[this.field9278];
            }
         } else {
            var1.field9280 = this.field9280;
         }

         if (var7) {
            if (var2.field9274 != null && var2.field9274.length >= this.field9278) {
               var1.field9274 = var2.field9274;
            } else {
               var1.field9274 = var2.field9274 = new int[this.field9278];
            }
         } else {
            var1.field9274 = this.field9274;
         }

         if (var8) {
            if (var2.field9344 != null && var2.field9344.length >= this.field9278) {
               var1.field9344 = var2.field9344;
            } else {
               var1.field9344 = var2.field9344 = new int[this.field9278];
            }
         } else {
            var1.field9344 = this.field9344;
         }

         for(var10 = 0; var10 < this.field9278; ++var10) {
            if (var6) {
               var1.field9280[var10] = this.field9280[var10];
            }

            if (var7) {
               var1.field9274[var10] = this.field9274[var10];
            }

            if (var8) {
               var1.field9344[var10] = this.field9344[var10];
            }
         }
      } else {
         var1.field9280 = this.field9280;
         var1.field9274 = this.field9274;
         var1.field9344 = this.field9344;
      }

      if (class586.method327(var3, this.field9275)) {
         var1.field9306 = var2.field9306;
         var1.field9306.field4210 = this.field9306.field4210;
         var1.field9306.field4208 = this.field9306.field4208;
         var1.field9306.field4209 = true;
      } else if (class586.method313(var3, this.field9275)) {
         var1.field9306 = this.field9306;
      } else {
         var1.field9306 = null;
      }

      if (class586.method304(var3, this.field9275)) {
         if (var2.field9314 != null && var2.field9314.length >= this.field9295) {
            var1.field9314 = var2.field9314;
         } else {
            var1.field9314 = var2.field9314 = new short[this.field9295];
         }

         for(var10 = 0; var10 < this.field9295; ++var10) {
            var1.field9314[var10] = this.field9314[var10];
         }
      } else {
         var1.field9314 = this.field9314;
      }

      if (class586.method305(var3, this.field9275)) {
         if (var2.field9342 != null && var2.field9342.length >= this.field9295) {
            var1.field9342 = var2.field9342;
         } else {
            var1.field9342 = var2.field9342 = new byte[this.field9295];
         }

         for(var10 = 0; var10 < this.field9295; ++var10) {
            var1.field9342[var10] = this.field9342[var10];
         }
      } else {
         var1.field9342 = this.field9342;
      }

      if (class586.method322(var3, this.field9275)) {
         var1.field9290 = var2.field9290;
         var1.field9290.field4210 = this.field9290.field4210;
         var1.field9290.field4208 = this.field9290.field4208;
         var1.field9290.field4209 = true;
      } else if (class586.method309(var3, this.field9275)) {
         var1.field9290 = this.field9290;
      } else {
         var1.field9290 = null;
      }

      int var11;
      if (class586.method303(var3, this.field9275)) {
         if (var2.field9288 != null && var2.field9288.length >= this.field9285) {
            var1.field9288 = var2.field9288;
            var1.field9289 = var2.field9289;
            var1.field9298 = var2.field9298;
         } else {
            var10 = this.field9285;
            var1.field9288 = var2.field9288 = new short[var10];
            var1.field9289 = var2.field9289 = new short[var10];
            var1.field9298 = var2.field9298 = new short[var10];
         }

         if (this.field9294 != null) {
            if (var2.field9294 == null) {
               var2.field9294 = new class626();
            }

            class626 var12 = var1.field9294 = var2.field9294;
            if (var12.field9773 == null || var12.field9773.length < this.field9285) {
               var11 = this.field9285;
               var12.field9773 = new short[var11];
               var12.field9771 = new short[var11];
               var12.field9770 = new short[var11];
               var12.field9772 = new byte[var11];
            }

            for(var11 = 0; var11 < this.field9285; ++var11) {
               var1.field9288[var11] = this.field9288[var11];
               var1.field9289[var11] = this.field9289[var11];
               var1.field9298[var11] = this.field9298[var11];
               var12.field9773[var11] = this.field9294.field9773[var11];
               var12.field9771[var11] = this.field9294.field9771[var11];
               var12.field9770[var11] = this.field9294.field9770[var11];
               var12.field9772[var11] = this.field9294.field9772[var11];
            }
         } else {
            var1.field9294 = null;

            for(var10 = 0; var10 < this.field9285; ++var10) {
               var1.field9288[var10] = this.field9288[var10];
               var1.field9289[var10] = this.field9289[var10];
               var1.field9298[var10] = this.field9298[var10];
            }
         }

         var1.field9337 = this.field9337;
      } else {
         var1.field9294 = this.field9294;
         var1.field9288 = this.field9288;
         var1.field9289 = this.field9289;
         var1.field9298 = this.field9298;
         var1.field9337 = this.field9337;
      }

      if (class586.method311(var3, this.field9275)) {
         var1.field9313 = var2.field9313;
         var1.field9313.field4210 = this.field9313.field4210;
         var1.field9313.field4208 = this.field9313.field4208;
         var1.field9313.field4209 = true;
      } else if (class586.method332(var3, this.field9275)) {
         var1.field9313 = this.field9313;
      } else {
         var1.field9313 = null;
      }

      if (class586.method306(var3, this.field9275)) {
         if (var2.field9332 != null && var2.field9332.length >= this.field9295) {
            var1.field9332 = var2.field9332;
            var1.field9293 = var2.field9293;
         } else {
            var10 = this.field9285;
            var1.field9332 = var2.field9332 = new float[var10];
            var1.field9293 = var2.field9293 = new float[var10];
         }

         for(var10 = 0; var10 < this.field9285; ++var10) {
            var1.field9332[var10] = this.field9332[var10];
            var1.field9293[var10] = this.field9293[var10];
         }
      } else {
         var1.field9332 = this.field9332;
         var1.field9293 = this.field9293;
      }

      if (class586.method334(var3, this.field9275)) {
         var1.field9309 = var2.field9309;
         var1.field9309.field4210 = this.field9309.field4210;
         var1.field9309.field4208 = this.field9309.field4208;
         var1.field9309.field4209 = true;
      } else if (class586.method325(var3, this.field9275)) {
         var1.field9309 = this.field9309;
      } else {
         var1.field9309 = null;
      }

      if (class586.method324(var3, this.field9275)) {
         if (var2.field9299 != null && var2.field9299.length >= this.field9295) {
            var1.field9299 = var2.field9299;
            var1.field9300 = var2.field9300;
            var1.field9301 = var2.field9301;
         } else {
            var10 = this.field9295;
            var1.field9299 = var2.field9299 = new short[var10];
            var1.field9300 = var2.field9300 = new short[var10];
            var1.field9301 = var2.field9301 = new short[var10];
         }

         for(var10 = 0; var10 < this.field9295; ++var10) {
            var1.field9299[var10] = this.field9299[var10];
            var1.field9300[var10] = this.field9300[var10];
            var1.field9301[var10] = this.field9301[var10];
         }
      } else {
         var1.field9299 = this.field9299;
         var1.field9300 = this.field9300;
         var1.field9301 = this.field9301;
      }

      if (class586.method328(var3, this.field9275)) {
         var1.field9305 = var2.field9305;
         var1.field9305.field3844 = this.field9305.field3844;
         var1.field9305.field3847 = this.field9305.field3847;
         var1.field9305.field3845 = true;
      } else if (class586.method310(var3, this.field9275)) {
         var1.field9305 = this.field9305;
      } else {
         var1.field9305 = null;
      }

      if (class586.method307(var3, this.field9275)) {
         if (var2.field9302 != null && var2.field9302.length >= this.field9295) {
            var1.field9302 = var2.field9302;
         } else {
            var10 = this.field9295;
            var1.field9302 = var2.field9302 = new short[var10];
         }

         for(var10 = 0; var10 < this.field9295; ++var10) {
            var1.field9302[var10] = this.field9302[var10];
         }
      } else {
         var1.field9302 = this.field9302;
      }

      if (class586.method308(var3, this.field9275)) {
         if (var2.field9271 != null && var2.field9271.length >= this.field9330) {
            var1.field9271 = var2.field9271;

            for(var10 = 0; var10 < this.field9330; ++var10) {
               var1.field9271[var10].method5727(this.field9271[var10]);
            }
         } else {
            var10 = this.field9330;
            var1.field9271 = var2.field9271 = new class664[var10];

            for(var11 = 0; var11 < this.field9330; ++var11) {
               var1.field9271[var11] = this.field9271[var11].method5726();
            }
         }
      } else {
         var1.field9271 = this.field9271;
      }

      var1.field9331 = this.field9331;
      if (this.field9329) {
         var1.field9307 = this.field9307;
         var1.field9315 = this.field9315;
         var1.field9319 = this.field9319;
         var1.field9320 = this.field9320;
         var1.field9317 = this.field9317;
         var1.field9318 = this.field9318;
         var1.field9321 = this.field9321;
         var1.field9322 = this.field9322;
         var1.field9329 = true;
      } else {
         var1.field9329 = false;
      }

      var1.field9297 = this.field9297;
      var1.field9303 = this.field9303;
      var1.field9325 = this.field9325;
      var1.field9327 = this.field9327;
      var1.field9326 = this.field9326;
      var1.field9286 = this.field9286;
      var1.field9287 = this.field9287;
      var1.field9343 = this.field9343;
      var1.field9304 = this.field9304;
      var1.field9323 = this.field9323;
      var1.field9292 = this.field9292;
      var1.field9324 = this.field9324;
      var1.field9328 = this.field9328;
      var1.field9283 = this.field9283;
      return var1;
   }

   void method5567() {
      if (this.field9311) {
         this.field9311 = false;
         if (this.field9328 == null && this.field9283 == null && this.field9331 == null && !class586.method331(this.field9291, this.field9275)) {
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if (this.field9280 != null && !class586.method314(this.field9291, this.field9275)) {
               if (this.field9306 != null && !this.field9306.method2664()) {
                  this.field9311 = true;
               } else {
                  if (!this.field9329) {
                     this.method5562();
                  }

                  var1 = true;
               }
            }

            if (this.field9274 != null && !class586.method315(this.field9291, this.field9275)) {
               if (this.field9306 != null && !this.field9306.method2664()) {
                  this.field9311 = true;
               } else {
                  if (!this.field9329) {
                     this.method5562();
                  }

                  var2 = true;
               }
            }

            if (this.field9344 != null && !class586.method316(this.field9291, this.field9275)) {
               if (this.field9306 != null && !this.field9306.method2664()) {
                  this.field9311 = true;
               } else {
                  if (!this.field9329) {
                     this.method5562();
                  }

                  var3 = true;
               }
            }

            if (var1) {
               this.field9280 = null;
            }

            if (var2) {
               this.field9274 = null;
            }

            if (var3) {
               this.field9344 = null;
            }
         }

         if (this.field9327 != null && this.field9280 == null && this.field9274 == null && this.field9344 == null) {
            this.field9327 = null;
            this.field9326 = null;
         }

         if (this.field9337 != null && !class586.method317(this.field9291, this.field9275)) {
            label275: {
               label218: {
                  if ((this.field9275 & 55) != 0) {
                     if (this.field9313 == null || this.field9313.method2664()) {
                        break label218;
                     }
                  } else if (this.field9290 == null || this.field9290.method2664()) {
                     break label218;
                  }

                  this.field9311 = true;
                  break label275;
               }

               this.field9298 = null;
               this.field9289 = null;
               this.field9288 = null;
               this.field9337 = null;
            }
         }

         if (this.field9314 != null && !class586.method330(this.field9291, this.field9275)) {
            if (this.field9290 != null && !this.field9290.method2664()) {
               this.field9311 = true;
            } else {
               this.field9314 = null;
            }
         }

         if (this.field9342 != null && !class586.method329(this.field9291, this.field9275)) {
            if (this.field9290 != null && !this.field9290.method2664()) {
               this.field9311 = true;
            } else {
               this.field9342 = null;
            }
         }

         if (this.field9332 != null && !class586.method318(this.field9291, this.field9275)) {
            if (this.field9309 != null && !this.field9309.method2664()) {
               this.field9311 = true;
            } else {
               this.field9293 = null;
               this.field9332 = null;
            }
         }

         if (this.field9302 != null && !class586.method323(this.field9291, this.field9275)) {
            if (this.field9290 != null && !this.field9290.method2664()) {
               this.field9311 = true;
            } else {
               this.field9302 = null;
            }
         }

         if (this.field9299 != null && !class586.method333(this.field9291, this.field9275)) {
            if (this.field9305 != null && !this.field9305.method2399() || this.field9290 != null && !this.field9290.method2664()) {
               this.field9311 = true;
            } else {
               this.field9301 = null;
               this.field9300 = null;
               this.field9299 = null;
            }
         }

         if (this.field9286 != null) {
            if (this.field9306 != null && !this.field9306.method2664()) {
               this.field9311 = true;
            } else {
               this.field9286 = null;
            }
         }

         if (this.field9287 != null) {
            if (this.field9290 != null && !this.field9290.method2664()) {
               this.field9311 = true;
            } else {
               this.field9287 = null;
            }
         }

         if (this.field9303 != null && !class586.method319(this.field9291, this.field9275)) {
            this.field9303 = null;
            this.field9304 = null;
         }

         if (this.field9297 != null && !class586.method320(this.field9291, this.field9275)) {
            this.field9297 = null;
            this.field9343 = null;
         }

         if (this.field9325 != null && !class586.method321(this.field9291, this.field9275)) {
            this.field9325 = null;
         }

         if (this.field9323 != null && (this.field9291 & 2048) == 0 && (this.field9291 & 262144) == 0) {
            this.field9323 = null;
            this.field9292 = null;
            this.field9324 = null;
         }
      }

   }

   void method5568() {
      if (this.field9290 != null) {
         this.field9290.field4208 = false;
      }

   }

   void method5569() {
      if ((this.field9275 & 55) != 0) {
         if (this.field9313 != null) {
            this.field9313.field4208 = false;
         }
      } else if (this.field9290 != null) {
         this.field9290.field4208 = false;
      }

   }

   public void method6016(int var1) {
      int var2 = class703.field3413[var1];
      int var3 = class703.field3404[var1];

      for(int var4 = 0; var4 < this.field9279; ++var4) {
         int var5 = this.field9344[var4] * var2 + this.field9280[var4] * var3 >> 14;
         this.field9344[var4] = this.field9344[var4] * var3 - this.field9280[var4] * var2 >> 14;
         this.field9280[var4] = var5;
      }

      this.method5581();
      this.field9329 = false;
   }

   public void method5952(int var1) {
      int var2 = class703.field3413[var1];
      int var3 = class703.field3404[var1];

      for(int var4 = 0; var4 < this.field9279; ++var4) {
         int var5 = this.field9274[var4] * var3 - this.field9344[var4] * var2 >> 14;
         this.field9344[var4] = this.field9274[var4] * var2 + this.field9344[var4] * var3 >> 14;
         this.field9274[var4] = var5;
      }

      this.method5581();
      this.field9329 = false;
   }

   public void method6041(int var1) {
      int var2 = class703.field3413[var1];
      int var3 = class703.field3404[var1];

      for(int var4 = 0; var4 < this.field9279; ++var4) {
         int var5 = this.field9274[var4] * var2 + this.field9280[var4] * var3 >> 14;
         this.field9274[var4] = this.field9274[var4] * var3 - this.field9280[var4] * var2 >> 14;
         this.field9280[var4] = var5;
      }

      this.method5581();
      this.field9329 = false;
   }

   public void method5953(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field9279; ++var4) {
         if (var1 != 0) {
            this.field9280[var4] += var1;
         }

         if (var2 != 0) {
            this.field9274[var4] += var2;
         }

         if (var3 != 0) {
            this.field9344[var4] += var3;
         }
      }

      this.method5581();
      this.field9329 = false;
   }

   public byte[] method5983() {
      return this.field9342;
   }

   public void method5955(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field9279; ++var4) {
         if (var1 != 128) {
            this.field9280[var4] = this.field9280[var4] * var1 >> 7;
         }

         if (var2 != 128) {
            this.field9274[var4] = this.field9274[var4] * var2 >> 7;
         }

         if (var3 != 128) {
            this.field9344[var4] = this.field9344[var4] * var3 >> 7;
         }
      }

      this.method5581();
      this.field9329 = false;
   }

   public void method5961(int var1, int var2, class454 var3, class454 var4, int var5, int var6, int var7) {
      if (!this.field9329) {
         this.method5562();
      }

      int var8 = var5 + this.field9319;
      int var9 = var5 + this.field9320;
      int var10 = var7 + this.field9321;
      int var11 = var7 + this.field9322;
      if (var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5 || var8 >= 0 && var9 + var3.field7227 >> var3.field7228 < var3.field7226 && var10 >= 0 && var11 + var3.field7227 >> var3.field7228 < var3.field7225) {
         if (var1 != 4 && var1 != 5) {
            var8 >>= var3.field7228;
            var9 = var9 + (var3.field7227 - 1) >> var3.field7228;
            var10 >>= var3.field7228;
            var11 = var11 + (var3.field7227 - 1) >> var3.field7228;
            if (var3.method3888(var8, var10, (byte)-124) == var6 && var3.method3888(var9, var10, (byte)-30) == var6 && var3.method3888(var8, var11, (byte)-100) == var6 && var3.method3888(var9, var11, (byte)-104) == var6) {
               return;
            }
         } else if (var4 == null || var8 < 0 || var9 + var4.field7227 >> var4.field7228 >= var4.field7226 || var10 < 0 || var11 + var4.field7227 >> var4.field7228 >= var4.field7225) {
            return;
         }

         int var12;
         if (var1 == 1) {
            for(var12 = 0; var12 < this.field9279; ++var12) {
               this.field9274[var12] = this.field9274[var12] + var3.method3887(this.field9280[var12] + var5, this.field9344[var12] + var7, -1680457516) - var6;
            }
         } else {
            int var13;
            int var14;
            if (var1 == 2) {
               var12 = this.field9317;
               if (var12 == 0) {
                  return;
               }

               for(var13 = 0; var13 < this.field9279; ++var13) {
                  var14 = (this.field9274[var13] << 16) / var12;
                  if (var14 < var2) {
                     this.field9274[var13] += (var3.method3887(this.field9280[var13] + var5, this.field9344[var13] + var7, -1706111217) - var6) * (var2 - var14) / var2;
                  }
               }
            } else {
               int var15;
               if (var1 == 3) {
                  var12 = (var2 & 255) * 4;
                  var13 = (var2 >> 8 & 255) * 4;
                  var14 = (var2 >> 16 & 255) << 6;
                  var15 = (var2 >> 24 & 255) << 6;
                  if (var5 - (var12 >> 1) < 0 || var5 + (var12 >> 1) + var3.field7227 >= var3.field7226 << var3.field7228 || var7 - (var13 >> 1) < 0 || var7 + (var13 >> 1) + var3.field7227 >= var3.field7225 << var3.field7228) {
                     return;
                  }

                  this.method5957(var3, var5, var6, var7, var12, var13, var14, var15);
               } else if (var1 == 4) {
                  var12 = this.field9318 - this.field9317;

                  for(var13 = 0; var13 < this.field9279; ++var13) {
                     this.field9274[var13] = this.field9274[var13] + (var4.method3887(this.field9280[var13] + var5, this.field9344[var13] + var7, -1523371782) - var6) + var12;
                  }
               } else if (var1 == 5) {
                  var12 = this.field9318 - this.field9317;

                  for(var13 = 0; var13 < this.field9279; ++var13) {
                     var14 = this.field9280[var13] + var5;
                     var15 = this.field9344[var13] + var7;
                     int var16 = var3.method3887(var14, var15, -1428452858);
                     int var17 = var4.method3887(var14, var15, -2144565564);
                     int var18 = var16 - var17 - var2;
                     this.field9274[var13] = ((this.field9274[var13] << 8) / var12 * var18 >> 8) - (var6 - var16);
                  }
               }
            }
         }

         this.method5581();
         this.field9329 = false;
      }

   }

   void method5570() {
      if (this.field9305 != null) {
         this.field9305.field3847 = false;
      }

   }

   class412(class325 var1, int var2, int var3, boolean var4, boolean var5) {
      this.field9278 = 0;
      this.field9279 = 0;
      this.field9285 = 0;
      this.field9295 = 0;
      this.field9296 = 0;
      this.field9310 = false;
      this.field9311 = true;
      this.field9272 = false;
      this.field9282 = false;
      this.field9329 = false;
      this.field9273 = var1;
      this.field9291 = var2;
      this.field9275 = var3;
      this.field9310 = var5;
      if (var4 || class586.method313(this.field9291, this.field9275)) {
         this.field9306 = new class750(class586.method327(this.field9291, this.field9275));
      }

      if (var4 || class586.method325(this.field9291, this.field9275)) {
         this.field9309 = new class750(class586.method334(this.field9291, this.field9275));
      }

      if (var4 || class586.method309(this.field9291, this.field9275)) {
         this.field9290 = new class750(class586.method322(this.field9291, this.field9275));
      }

      if (var4 || class586.method332(this.field9291, this.field9275)) {
         this.field9313 = new class750(class586.method311(this.field9291, this.field9275));
      }

      if (var4 || class586.method310(this.field9291, this.field9275)) {
         this.field9305 = new class303(class586.method328(this.field9291, this.field9275));
      }

      if (var4 && var5) {
         this.field9306.field4211 = this.field9306.field4210 = this.field9273.method641(this.field9310);
         this.field9309.field4211 = this.field9309.field4210 = this.field9273.method641(this.field9310);
         this.field9290.field4211 = this.field9290.field4210 = this.field9273.method641(this.field9310);
         this.field9313.field4211 = this.field9313.field4210 = this.field9273.method641(this.field9310);
      }

   }

   public int method5976() {
      if (!this.field9329) {
         this.method5562();
      }

      return this.field9317;
   }

   public int method5978() {
      if (!this.field9329) {
         this.method5562();
      }

      return this.field9321;
   }

   public void method5994(class879 var1, int var2, int var3, int var4, boolean var5) {
      class412 var6 = (class412)var1;
      if (this.field9295 != 0 && var6.field9295 != 0) {
         int var7 = var6.field9279;
         int[] var8 = var6.field9280;
         int[] var9 = var6.field9274;
         int[] var10 = var6.field9344;
         short[] var11 = var6.field9288;
         short[] var12 = var6.field9289;
         short[] var13 = var6.field9298;
         byte[] var14 = var6.field9337;
         short[] var15;
         short[] var16;
         short[] var17;
         byte[] var18;
         if (this.field9294 != null) {
            var15 = this.field9294.field9773;
            var16 = this.field9294.field9771;
            var17 = this.field9294.field9770;
            var18 = this.field9294.field9772;
         } else {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
         }

         short[] var19;
         short[] var20;
         short[] var21;
         byte[] var22;
         if (var6.field9294 != null) {
            var19 = var6.field9294.field9773;
            var20 = var6.field9294.field9771;
            var21 = var6.field9294.field9770;
            var22 = var6.field9294.field9772;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.field9326;
         short[] var24 = var6.field9327;
         if (!var6.field9329) {
            var6.method5562();
         }

         int var25 = var6.field9317;
         int var26 = var6.field9318;
         int var27 = var6.field9319;
         int var28 = var6.field9320;
         int var29 = var6.field9321;
         int var30 = var6.field9322;

         for(int var31 = 0; var31 < this.field9279; ++var31) {
            int var32 = this.field9274[var31] - var3;
            if (var32 >= var25 && var32 <= var26) {
               int var33 = this.field9280[var31] - var2;
               if (var33 >= var27 && var33 <= var28) {
                  int var34 = this.field9344[var31] - var4;
                  if (var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.field9326[var31];
                     int var37 = this.field9326[var31 + 1];

                     int var38;
                     for(var38 = var36; var38 < var37; ++var38) {
                        var35 = this.field9327[var38] - 1;
                        if (var35 == -1 || this.field9337[var35] != 0) {
                           break;
                        }
                     }

                     if (var35 != -1) {
                        for(var38 = 0; var38 < var7; ++var38) {
                           if (var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
                              int var39 = -1;
                              var36 = var23[var38];
                              var37 = var23[var38 + 1];

                              for(int var40 = var36; var40 < var37; ++var40) {
                                 var39 = var24[var40] - 1;
                                 if (var39 == -1 || var14[var39] != 0) {
                                    break;
                                 }
                              }

                              if (var39 != -1) {
                                 if (var15 == null) {
                                    this.field9294 = new class626();
                                    var15 = this.field9294.field9773 = class215.method3834(this.field9288, (byte)-55);
                                    var16 = this.field9294.field9771 = class215.method3834(this.field9289, (byte)-99);
                                    var17 = this.field9294.field9770 = class215.method3834(this.field9298, (byte)-32);
                                    var18 = this.field9294.field9772 = class614.method5193(this.field9337, 1194497584);
                                 }

                                 if (var19 == null) {
                                    class626 var46 = var6.field9294 = new class626();
                                    var19 = var46.field9773 = class215.method3834(var11, (byte)-56);
                                    var20 = var46.field9771 = class215.method3834(var12, (byte)-81);
                                    var21 = var46.field9770 = class215.method3834(var13, (byte)-45);
                                    var22 = var46.field9772 = class614.method5193(var14, 1194497584);
                                 }

                                 short var47 = this.field9288[var35];
                                 short var41 = this.field9289[var35];
                                 short var42 = this.field9298[var35];
                                 byte var43 = this.field9337[var35];
                                 var36 = var23[var38];
                                 var37 = var23[var38 + 1];

                                 int var44;
                                 int var45;
                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = var24[var44] - 1;
                                    if (var45 == -1) {
                                       break;
                                    }

                                    if (var22[var45] != 0) {
                                       var19[var45] += var47;
                                       var20[var45] += var41;
                                       var21[var45] += var42;
                                       var22[var45] += var43;
                                    }
                                 }

                                 var47 = var11[var39];
                                 var41 = var12[var39];
                                 var42 = var13[var39];
                                 var43 = var14[var39];
                                 var36 = this.field9326[var31];
                                 var37 = this.field9326[var31 + 1];

                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = this.field9327[var44] - 1;
                                    if (var45 == -1) {
                                       break;
                                    }

                                    if (var18[var45] != 0) {
                                       var15[var45] += var47;
                                       var16[var45] += var41;
                                       var17[var45] += var42;
                                       var18[var45] += var43;
                                    }
                                 }

                                 var6.method5569();
                                 this.method5569();
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void method5967(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var12;
      int[] var13;
      int var14;
      int var15;
      if (var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var10 = 0;
         field9281 = 0;
         field9316 = 0;
         field9335 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var12 = var2[var11];
            if (var12 < this.field9297.length) {
               var13 = this.field9297[var12];

               for(var14 = 0; var14 < var13.length; ++var14) {
                  var15 = var13[var14];
                  if (this.field9343 == null || (var7 & this.field9343[var15]) != 0) {
                     field9281 += this.field9280[var15];
                     field9316 += this.field9274[var15];
                     field9335 += this.field9344[var15];
                     ++var10;
                  }
               }
            }
         }

         if (var10 > 0) {
            field9281 = field9281 / var10 + var3;
            field9316 = field9316 / var10 + var4;
            field9335 = field9335 / var10 + var5;
            field9284 = true;
         } else {
            field9281 = var3;
            field9316 = var4;
            field9335 = var5;
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

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if (var11 < this.field9297.length) {
                  var47 = this.field9297[var11];

                  for(var48 = 0; var48 < var47.length; ++var48) {
                     var14 = var47[var48];
                     if (this.field9343 == null || (var7 & this.field9343[var14]) != 0) {
                        this.field9280[var14] += var3;
                        this.field9274[var14] += var4;
                        this.field9344[var14] += var5;
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
            int[] var57;
            if (var1 == 2) {
               if (var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var12 = var8[11] << 4;
                  var48 = var8[12] << 4;
                  var14 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if (field9284) {
                     var16 = var8[0] * field9281 + var8[3] * field9316 + var8[6] * field9335 + 8192 >> 14;
                     var17 = var8[1] * field9281 + var8[4] * field9316 + var8[7] * field9335 + 8192 >> 14;
                     var18 = var8[2] * field9281 + var8[5] * field9316 + var8[8] * field9335 + 8192 >> 14;
                     var16 += var48;
                     var17 += var14;
                     var18 += var15;
                     field9281 = var16;
                     field9316 = var17;
                     field9335 = var18;
                     field9284 = false;
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
                  int var25 = var51[0] * -field9281 + var51[1] * -field9316 + var51[2] * -field9335 + 8192 >> 14;
                  var26 = var51[3] * -field9281 + var51[4] * -field9316 + var51[5] * -field9335 + 8192 >> 14;
                  var27 = var51[6] * -field9281 + var51[7] * -field9316 + var51[8] * -field9335 + 8192 >> 14;
                  var28 = var25 + field9281;
                  int var29 = var26 + field9316;
                  var30 = var27 + field9335;
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
                  var57 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var31[var37 + var39 * 3];
                        }

                        var57[var36 * 3 + var37] = var38 + 8192 >> 14;
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
                     if (var40 < this.field9297.length) {
                        int[] var41 = this.field9297[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if (this.field9343 == null || (var7 & this.field9343[var43]) != 0) {
                              int var44 = var57[0] * this.field9280[var43] + var57[1] * this.field9274[var43] + var57[2] * this.field9344[var43] + 8192 >> 14;
                              int var45 = var57[3] * this.field9280[var43] + var57[4] * this.field9274[var43] + var57[5] * this.field9344[var43] + 8192 >> 14;
                              int var46 = var57[6] * this.field9280[var43] + var57[7] * this.field9274[var43] + var57[8] * this.field9344[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.field9280[var43] = var44;
                              this.field9274[var43] = var45;
                              this.field9344[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if (var11 < this.field9297.length) {
                        var47 = this.field9297[var11];

                        for(var48 = 0; var48 < var47.length; ++var48) {
                           var14 = var47[var48];
                           if (this.field9343 == null || (var7 & this.field9343[var14]) != 0) {
                              this.field9280[var14] -= field9281;
                              this.field9274[var14] -= field9316;
                              this.field9344[var14] -= field9335;
                              if (var5 != 0) {
                                 var15 = class703.field3413[var5];
                                 var16 = class703.field3404[var5];
                                 var17 = this.field9274[var14] * var15 + this.field9280[var14] * var16 + 16383 >> 14;
                                 this.field9274[var14] = this.field9274[var14] * var16 - this.field9280[var14] * var15 + 16383 >> 14;
                                 this.field9280[var14] = var17;
                              }

                              if (var3 != 0) {
                                 var15 = class703.field3413[var3];
                                 var16 = class703.field3404[var3];
                                 var17 = this.field9274[var14] * var16 - this.field9344[var14] * var15 + 16383 >> 14;
                                 this.field9344[var14] = this.field9274[var14] * var15 + this.field9344[var14] * var16 + 16383 >> 14;
                                 this.field9274[var14] = var17;
                              }

                              if (var4 != 0) {
                                 var15 = class703.field3413[var4];
                                 var16 = class703.field3404[var4];
                                 var17 = this.field9344[var14] * var15 + this.field9280[var14] * var16 + 16383 >> 14;
                                 this.field9344[var14] = this.field9344[var14] * var16 - this.field9280[var14] * var15 + 16383 >> 14;
                                 this.field9280[var14] = var17;
                              }

                              this.field9280[var14] += field9281;
                              this.field9274[var14] += field9316;
                              this.field9344[var14] += field9335;
                           }
                        }
                     }
                  }

                  if (var6) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if (var11 < this.field9297.length) {
                           var47 = this.field9297[var11];

                           for(var48 = 0; var48 < var47.length; ++var48) {
                              var14 = var47[var48];
                              if (this.field9343 == null || (var7 & this.field9343[var14]) != 0) {
                                 var15 = this.field9326[var14];
                                 var16 = this.field9326[var14 + 1];

                                 for(var17 = var15; var17 < var16; ++var17) {
                                    var18 = this.field9327[var17] - 1;
                                    if (var18 == -1) {
                                       break;
                                    }

                                    if (var5 != 0) {
                                       var19 = class703.field3413[var5];
                                       var20 = class703.field3404[var5];
                                       var21 = this.field9289[var18] * var19 + this.field9288[var18] * var20 + 16383 >> 14;
                                       this.field9289[var18] = (short)(this.field9289[var18] * var20 - this.field9288[var18] * var19 + 16383 >> 14);
                                       this.field9288[var18] = (short)var21;
                                    }

                                    if (var3 != 0) {
                                       var19 = class703.field3413[var3];
                                       var20 = class703.field3404[var3];
                                       var21 = this.field9289[var18] * var20 - this.field9298[var18] * var19 + 16383 >> 14;
                                       this.field9298[var18] = (short)(this.field9289[var18] * var19 + this.field9298[var18] * var20 + 16383 >> 14);
                                       this.field9289[var18] = (short)var21;
                                    }

                                    if (var4 != 0) {
                                       var19 = class703.field3413[var4];
                                       var20 = class703.field3404[var4];
                                       var21 = this.field9298[var18] * var19 + this.field9288[var18] * var20 + 16383 >> 14;
                                       this.field9298[var18] = (short)(this.field9298[var18] * var20 - this.field9288[var18] * var19 + 16383 >> 14);
                                       this.field9288[var18] = (short)var21;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     this.method5569();
                  }
               }
            } else if (var1 == 3) {
               if (var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var12 = var8[11] << 4;
                  var48 = var8[12] << 4;
                  var14 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if (field9284) {
                     var16 = var8[0] * field9281 + var8[3] * field9316 + var8[6] * field9335 + 8192 >> 14;
                     var17 = var8[1] * field9281 + var8[4] * field9316 + var8[7] * field9335 + 8192 >> 14;
                     var18 = var8[2] * field9281 + var8[5] * field9316 + var8[8] * field9335 + 8192 >> 14;
                     var16 += var48;
                     var17 += var14;
                     var18 += var15;
                     field9281 = var16;
                     field9316 = var17;
                     field9335 = var18;
                     field9284 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -field9281 + 8192 >> 14;
                  var20 = var17 * -field9316 + 8192 >> 14;
                  var21 = var18 * -field9335 + 8192 >> 14;
                  var22 = var19 + field9281;
                  var23 = var20 + field9316;
                  var24 = var21 + field9335;
                  int[] var54 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var48 + 8192 >> 14;
                  var27 = var17 * var14 + 8192 >> 14;
                  var28 = var18 * var15 + 8192 >> 14;
                  var26 += var22;
                  var27 += var23;
                  var28 += var24;
                  int[] var55 = new int[9];

                  int var56;
                  for(var30 = 0; var30 < 3; ++var30) {
                     for(var56 = 0; var56 < 3; ++var56) {
                        var32 = 0;

                        for(var33 = 0; var33 < 3; ++var33) {
                           var32 += var8[var30 * 3 + var33] * var54[var56 + var33 * 3];
                        }

                        var55[var30 * 3 + var56] = var32 + 8192 >> 14;
                     }
                  }

                  var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 8192 >> 14;
                  var56 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 8192 >> 14;
                  var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 8192 >> 14;
                  var30 += var10;
                  var56 += var11;
                  var32 += var12;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if (var34 < this.field9297.length) {
                        var57 = this.field9297[var34];

                        for(var36 = 0; var36 < var57.length; ++var36) {
                           var37 = var57[var36];
                           if (this.field9343 == null || (var7 & this.field9343[var37]) != 0) {
                              var38 = var55[0] * this.field9280[var37] + var55[1] * this.field9274[var37] + var55[2] * this.field9344[var37] + 8192 >> 14;
                              var39 = var55[3] * this.field9280[var37] + var55[4] * this.field9274[var37] + var55[5] * this.field9344[var37] + 8192 >> 14;
                              var40 = var55[6] * this.field9280[var37] + var55[7] * this.field9274[var37] + var55[8] * this.field9344[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var56;
                              var40 += var32;
                              this.field9280[var37] = var38;
                              this.field9274[var37] = var39;
                              this.field9344[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if (var11 < this.field9297.length) {
                        var47 = this.field9297[var11];

                        for(var48 = 0; var48 < var47.length; ++var48) {
                           var14 = var47[var48];
                           if (this.field9343 == null || (var7 & this.field9343[var14]) != 0) {
                              this.field9280[var14] -= field9281;
                              this.field9274[var14] -= field9316;
                              this.field9344[var14] -= field9335;
                              this.field9280[var14] = this.field9280[var14] * var3 >> 7;
                              this.field9274[var14] = this.field9274[var14] * var4 >> 7;
                              this.field9344[var14] = this.field9344[var14] * var5 >> 7;
                              this.field9280[var14] += field9281;
                              this.field9274[var14] += field9316;
                              this.field9344[var14] += field9335;
                           }
                        }
                     }
                  }
               }
            } else {
               boolean var49;
               class300 var50;
               class664 var52;
               if (var1 == 5) {
                  if (this.field9303 != null) {
                     var49 = false;

                     for(var11 = 0; var11 < var9; ++var11) {
                        var12 = var2[var11];
                        if (var12 < this.field9303.length) {
                           var13 = this.field9303[var12];

                           for(var14 = 0; var14 < var13.length; ++var14) {
                              var15 = var13[var14];
                              if (this.field9304 == null || (var7 & this.field9304[var15]) != 0) {
                                 var16 = (this.field9342[var15] & 255) + var3 * 8;
                                 if (var16 < 0) {
                                    var16 = 0;
                                 } else if (var16 > 255) {
                                    var16 = 255;
                                 }

                                 this.field9342[var15] = (byte)var16;
                              }
                           }

                           var49 |= var13.length > 0;
                        }
                     }

                     if (var49) {
                        if (this.field9331 != null) {
                           for(var11 = 0; var11 < this.field9330; ++var11) {
                              var50 = this.field9331[var11];
                              var52 = this.field9271[var11];
                              var52.field9607 = var52.field9607 & 16777215 | 255 - (this.field9342[var50.field3937] & 255) << 24;
                           }
                        }

                        this.method5568();
                     }
                  }
               } else if (var1 == 7) {
                  if (this.field9303 != null) {
                     var49 = false;

                     for(var11 = 0; var11 < var9; ++var11) {
                        var12 = var2[var11];
                        if (var12 < this.field9303.length) {
                           var13 = this.field9303[var12];

                           for(var14 = 0; var14 < var13.length; ++var14) {
                              var15 = var13[var14];
                              if (this.field9304 == null || (var7 & this.field9304[var15]) != 0) {
                                 var16 = this.field9314[var15] & '\uffff';
                                 var17 = var16 >> 10 & 63;
                                 var18 = var16 >> 7 & 7;
                                 var19 = var16 & 127;
                                 var17 = var17 + var3 & 63;
                                 var18 += var4 / 4;
                                 if (var18 < 0) {
                                    var18 = 0;
                                 } else if (var18 > 7) {
                                    var18 = 7;
                                 }

                                 var19 += var5;
                                 if (var19 < 0) {
                                    var19 = 0;
                                 } else if (var19 > 127) {
                                    var19 = 127;
                                 }

                                 this.field9314[var15] = (short)(var17 << 10 | var18 << 7 | var19);
                              }
                           }

                           var49 |= var13.length > 0;
                        }
                     }

                     if (var49) {
                        if (this.field9331 != null) {
                           for(var11 = 0; var11 < this.field9330; ++var11) {
                              var50 = this.field9331[var11];
                              var52 = this.field9271[var11];
                              var52.field9607 = var52.field9607 & -16777216 | class134.field1398[this.field9314[var50.field3937] & '\uffff'] & 16777215;
                           }
                        }

                        this.method5568();
                     }
                  }
               } else {
                  class664 var53;
                  if (var1 == 8) {
                     if (this.field9325 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if (var11 < this.field9325.length) {
                              var47 = this.field9325[var11];

                              for(var48 = 0; var48 < var47.length; ++var48) {
                                 var53 = this.field9271[var47[var48]];
                                 var53.field9608 += var3;
                                 var53.field9609 += var4;
                              }
                           }
                        }
                     }
                  } else if (var1 == 10) {
                     if (this.field9325 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if (var11 < this.field9325.length) {
                              var47 = this.field9325[var11];

                              for(var48 = 0; var48 < var47.length; ++var48) {
                                 var53 = this.field9271[var47[var48]];
                                 var53.field9606 = var53.field9606 * var3 >> 7;
                                 var53.field9605 = var53.field9605 * var4 >> 7;
                              }
                           }
                        }
                     }
                  } else if (var1 == 9 && this.field9325 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if (var11 < this.field9325.length) {
                           var47 = this.field9325[var11];

                           for(var48 = 0; var48 < var47.length; ++var48) {
                              var53 = this.field9271[var47[var48]];
                              var53.field9610 = var53.field9610 + var3 & 16383;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public void method5981(int var1) {
      this.field9277 = (short)var1;
      this.method5581();
      this.method5569();
   }

   public int method5982() {
      return this.field9276;
   }

   public int method5950() {
      return this.field9277;
   }

   public void method5986(short var1, short var2) {
      class478 var3 = this.field9273.field8581;

      for(int var4 = 0; var4 < this.field9295; ++var4) {
         if (this.field9302[var4] == var1) {
            this.field9302[var4] = var2;
         }
      }

      byte var11 = 0;
      byte var5 = 0;
      if (var1 != -1) {
         class414 var6 = var3.method4625(var1 & '\uffff', 1064866173);
         var11 = var6.field9387;
         var5 = var6.field9388;
      }

      byte var12 = 0;
      byte var7 = 0;
      if (var2 != -1) {
         class414 var8 = var3.method4625(var2 & '\uffff', 2063902774);
         var12 = var8.field9387;
         var7 = var8.field9388;
         if (var8.field9389 != 0 || var8.field9363 != 0) {
            this.field9282 = true;
         }
      }

      if (var11 != var12 | var5 != var7) {
         if (this.field9331 != null) {
            for(int var13 = 0; var13 < this.field9330; ++var13) {
               class300 var9 = this.field9331[var13];
               class664 var10 = this.field9271[var13];
               var10.field9607 = var10.field9607 & -16777216 | class134.field1398[this.field9314[var9.field3937] & '\uffff'] & 16777215;
            }
         }

         this.method5568();
      }

   }

   public void method5987(int var1, int var2, int var3, int var4) {
      int var5;
      for(var5 = 0; var5 < this.field9295; ++var5) {
         int var6 = this.field9314[var5] & '\uffff';
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

         this.field9314[var5] = (short)(var7 << 10 | var8 << 7 | var9);
      }

      if (this.field9331 != null) {
         for(var5 = 0; var5 < this.field9330; ++var5) {
            class300 var10 = this.field9331[var5];
            class664 var11 = this.field9271[var5];
            var11.field9607 = var11.field9607 & -16777216 | class134.field1398[this.field9314[var10.field3937] & '\uffff'] & 16777215;
         }
      }

      this.method5568();
   }

   public boolean method5988() {
      if (this.field9302 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.field9302.length; ++var1) {
            if (this.field9302[var1] != -1 && !this.field9273.field8581.method4621(this.field9302[var1], (short)10294)) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method5989() {
      return this.field9272;
   }

   public boolean method6036() {
      return this.field9282;
   }

   void method5959() {
   }

   void method5968(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      if (var1 == 0) {
         var5 = 0;
         field9281 = 0;
         field9316 = 0;
         field9335 = 0;

         for(var6 = 0; var6 < this.field9279; ++var6) {
            field9281 += this.field9280[var6];
            field9316 += this.field9274[var6];
            field9335 += this.field9344[var6];
            ++var5;
         }

         if (var5 > 0) {
            field9281 = field9281 / var5 + var2;
            field9316 = field9316 / var5 + var3;
            field9335 = field9335 / var5 + var4;
         } else {
            field9281 = var2;
            field9316 = var3;
            field9335 = var4;
         }
      } else if (var1 == 1) {
         for(var5 = 0; var5 < this.field9279; ++var5) {
            this.field9280[var5] += var2;
            this.field9274[var5] += var3;
            this.field9344[var5] += var4;
         }
      } else {
         int var7;
         int var8;
         if (var1 == 2) {
            for(var5 = 0; var5 < this.field9279; ++var5) {
               this.field9280[var5] -= field9281;
               this.field9274[var5] -= field9316;
               this.field9344[var5] -= field9335;
               if (var4 != 0) {
                  var6 = class703.field3413[var4];
                  var7 = class703.field3404[var4];
                  var8 = this.field9274[var5] * var6 + this.field9280[var5] * var7 + 16383 >> 14;
                  this.field9274[var5] = this.field9274[var5] * var7 - this.field9280[var5] * var6 + 16383 >> 14;
                  this.field9280[var5] = var8;
               }

               if (var2 != 0) {
                  var6 = class703.field3413[var2];
                  var7 = class703.field3404[var2];
                  var8 = this.field9274[var5] * var7 - this.field9344[var5] * var6 + 16383 >> 14;
                  this.field9344[var5] = this.field9274[var5] * var6 + this.field9344[var5] * var7 + 16383 >> 14;
                  this.field9274[var5] = var8;
               }

               if (var3 != 0) {
                  var6 = class703.field3413[var3];
                  var7 = class703.field3404[var3];
                  var8 = this.field9344[var5] * var6 + this.field9280[var5] * var7 + 16383 >> 14;
                  this.field9344[var5] = this.field9344[var5] * var7 - this.field9280[var5] * var6 + 16383 >> 14;
                  this.field9280[var5] = var8;
               }

               this.field9280[var5] += field9281;
               this.field9274[var5] += field9316;
               this.field9344[var5] += field9335;
            }
         } else if (var1 == 3) {
            for(var5 = 0; var5 < this.field9279; ++var5) {
               this.field9280[var5] -= field9281;
               this.field9274[var5] -= field9316;
               this.field9344[var5] -= field9335;
               this.field9280[var5] = this.field9280[var5] * var2 / 128;
               this.field9274[var5] = this.field9274[var5] * var3 / 128;
               this.field9344[var5] = this.field9344[var5] * var4 / 128;
               this.field9280[var5] += field9281;
               this.field9274[var5] += field9316;
               this.field9344[var5] += field9335;
            }
         } else {
            class664 var10;
            class300 var11;
            if (var1 == 5) {
               for(var5 = 0; var5 < this.field9295; ++var5) {
                  var6 = (this.field9342[var5] & 255) + var2 * 8;
                  if (var6 < 0) {
                     var6 = 0;
                  } else if (var6 > 255) {
                     var6 = 255;
                  }

                  this.field9342[var5] = (byte)var6;
               }

               if (this.field9331 != null) {
                  for(var5 = 0; var5 < this.field9330; ++var5) {
                     var11 = this.field9331[var5];
                     var10 = this.field9271[var5];
                     var10.field9607 = var10.field9607 & 16777215 | 255 - (this.field9342[var11.field3937] & 255) << 24;
                  }
               }

               this.method5568();
            } else if (var1 == 7) {
               for(var5 = 0; var5 < this.field9295; ++var5) {
                  var6 = this.field9314[var5] & '\uffff';
                  var7 = var6 >> 10 & 63;
                  var8 = var6 >> 7 & 7;
                  int var9 = var6 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3 / 4;
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

                  this.field9314[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               if (this.field9331 != null) {
                  for(var5 = 0; var5 < this.field9330; ++var5) {
                     var11 = this.field9331[var5];
                     var10 = this.field9271[var5];
                     var10.field9607 = var10.field9607 & -16777216 | class134.field1398[this.field9314[var11.field3937] & '\uffff'] & 16777215;
                  }
               }

               this.method5568();
            } else {
               class664 var12;
               if (var1 == 8) {
                  for(var5 = 0; var5 < this.field9330; ++var5) {
                     var12 = this.field9271[var5];
                     var12.field9608 += var2;
                     var12.field9609 += var3;
                  }
               } else if (var1 == 10) {
                  for(var5 = 0; var5 < this.field9330; ++var5) {
                     var12 = this.field9271[var5];
                     var12.field9606 = var12.field9606 * var2 >> 7;
                     var12.field9605 = var12.field9605 * var3 >> 7;
                  }
               } else if (var1 == 9) {
                  for(var5 = 0; var5 < this.field9330; ++var5) {
                     var12 = this.field9271[var5];
                     var12.field9610 = var12.field9610 + var2 & 16383;
                  }
               }
            }
         }
      }

   }

   void method6084() {
      for(int var1 = 0; var1 < this.field9278; ++var1) {
         this.field9280[var1] = this.field9280[var1] + 7 >> 4;
         this.field9274[var1] = this.field9274[var1] + 7 >> 4;
         this.field9344[var1] = this.field9344[var1] + 7 >> 4;
      }

      this.method5581();
      this.field9329 = false;
   }

   public void method5970(class135 var1, int var2, boolean var3) {
      if (this.field9343 != null) {
         class135 var4 = var1;
         if (var3) {
            var4 = this.field9273.field679;
            var4.method1028(var1);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.field9279; ++var6) {
            if ((var2 & this.field9343[var6]) != 0) {
               var4.method1031((float)this.field9280[var6], (float)this.field9274[var6], (float)this.field9344[var6], var5);
               this.field9280[var6] = (int)var5[0];
               this.field9274[var6] = (int)var5[1];
               this.field9344[var6] = (int)var5[2];
            }
         }
      }

   }

   public class396[] method5941() {
      return this.field9283;
   }

   public class933[] method6089() {
      return this.field9328;
   }

   public void method6096(class135 var1) {
      class344 var2 = this.field9273.field680;
      var2.method272(var1);
      int var3;
      if (this.field9328 != null) {
         for(var3 = 0; var3 < this.field9328.length; ++var3) {
            class933 var4 = this.field9328[var3];
            class933 var5 = var4;
            if (var4.field10329 != null) {
               var5 = var4.field10329;
            }

            var5.field10330 = (int)(var2.field325[12] + var2.field325[0] * (float)this.field9280[var4.field10326] + var2.field325[4] * (float)this.field9274[var4.field10326] + var2.field325[8] * (float)this.field9344[var4.field10326]);
            var5.field10336 = (int)(var2.field325[13] + var2.field325[1] * (float)this.field9280[var4.field10326] + var2.field325[5] * (float)this.field9274[var4.field10326] + var2.field325[9] * (float)this.field9344[var4.field10326]);
            var5.field10332 = (int)(var2.field325[14] + var2.field325[2] * (float)this.field9280[var4.field10326] + var2.field325[6] * (float)this.field9274[var4.field10326] + var2.field325[10] * (float)this.field9344[var4.field10326]);
            var5.field10325 = (int)(var2.field325[12] + var2.field325[0] * (float)this.field9280[var4.field10327] + var2.field325[4] * (float)this.field9274[var4.field10327] + var2.field325[8] * (float)this.field9344[var4.field10327]);
            var5.field10334 = (int)(var2.field325[13] + var2.field325[1] * (float)this.field9280[var4.field10327] + var2.field325[5] * (float)this.field9274[var4.field10327] + var2.field325[9] * (float)this.field9344[var4.field10327]);
            var5.field10335 = (int)(var2.field325[14] + var2.field325[2] * (float)this.field9280[var4.field10327] + var2.field325[6] * (float)this.field9274[var4.field10327] + var2.field325[10] * (float)this.field9344[var4.field10327]);
            var5.field10324 = (int)(var2.field325[12] + var2.field325[0] * (float)this.field9280[var4.field10328] + var2.field325[4] * (float)this.field9274[var4.field10328] + var2.field325[8] * (float)this.field9344[var4.field10328]);
            var5.field10337 = (int)(var2.field325[13] + var2.field325[1] * (float)this.field9280[var4.field10328] + var2.field325[5] * (float)this.field9274[var4.field10328] + var2.field325[9] * (float)this.field9344[var4.field10328]);
            var5.field10338 = (int)(var2.field325[14] + var2.field325[2] * (float)this.field9280[var4.field10328] + var2.field325[6] * (float)this.field9274[var4.field10328] + var2.field325[10] * (float)this.field9344[var4.field10328]);
         }
      }

      if (this.field9283 != null) {
         for(var3 = 0; var3 < this.field9283.length; ++var3) {
            class396 var6 = this.field9283[var3];
            class396 var7 = var6;
            if (var6.field6509 != null) {
               var7 = var6.field6509;
            }

            if (var6.field6514 != null) {
               var6.field6514.method269(var2);
            } else {
               var6.field6514 = new class344(var2);
            }

            var7.field6508 = (int)(var2.field325[12] + var2.field325[0] * (float)this.field9280[var6.field6511] + var2.field325[4] * (float)this.field9274[var6.field6511] + var2.field325[8] * (float)this.field9344[var6.field6511]);
            var7.field6512 = (int)(var2.field325[13] + var2.field325[1] * (float)this.field9280[var6.field6511] + var2.field325[5] * (float)this.field9274[var6.field6511] + var2.field325[9] * (float)this.field9344[var6.field6511]);
            var7.field6513 = (int)(var2.field325[14] + var2.field325[2] * (float)this.field9280[var6.field6511] + var2.field325[6] * (float)this.field9274[var6.field6511] + var2.field325[10] * (float)this.field9344[var6.field6511]);
         }
      }

   }

   public boolean method6097(int var1, int var2, class135 var3, boolean var4, int var5) {
      class344 var6 = this.field9273.field680;
      var6.method272(var3);
      var6.method271(this.field9273.field649);
      boolean var7 = false;
      float var8 = Float.MAX_VALUE;
      float var9 = -3.4028235E38F;
      float var10 = Float.MAX_VALUE;
      float var11 = -3.4028235E38F;
      if (!this.field9329) {
         this.method5562();
      }

      int var12 = this.field9320 - this.field9319 >> 1;
      int var13 = this.field9318 - this.field9317 >> 1;
      int var14 = this.field9322 - this.field9321 >> 1;
      int var15 = this.field9319 + var12;
      int var16 = this.field9317 + var13;
      int var17 = this.field9321 + var14;
      int var18 = var15 - (var12 << var5);
      int var19 = var16 - (var13 << var5);
      int var20 = var17 - (var14 << var5);
      int var21 = var15 + (var12 << var5);
      int var22 = var16 + (var13 << var5);
      int var23 = var17 + (var14 << var5);
      field9338[0] = var18;
      field9339[0] = var19;
      field9340[0] = var20;
      field9338[1] = var21;
      field9339[1] = var19;
      field9340[1] = var20;
      field9338[2] = var18;
      field9339[2] = var22;
      field9340[2] = var20;
      field9338[3] = var21;
      field9339[3] = var22;
      field9340[3] = var20;
      field9338[4] = var18;
      field9339[4] = var19;
      field9340[4] = var23;
      field9338[5] = var21;
      field9339[5] = var19;
      field9340[5] = var23;
      field9338[6] = var18;
      field9339[6] = var22;
      field9340[6] = var23;
      field9338[7] = var21;
      field9339[7] = var22;
      field9340[7] = var23;

      int var24;
      float var25;
      float var26;
      float var27;
      float var28;
      float var29;
      float var30;
      float var31;
      for(var24 = 0; var24 < 8; ++var24) {
         var25 = (float)field9338[var24];
         var26 = (float)field9339[var24];
         var27 = (float)field9340[var24];
         var28 = var6.field325[2] * var25 + var6.field325[6] * var26 + var6.field325[10] * var27 + var6.field325[14];
         var29 = var6.field325[3] * var25 + var6.field325[7] * var26 + var6.field325[11] * var27 + var6.field325[15];
         if (var28 >= -var29) {
            var30 = var6.field325[0] * var25 + var6.field325[4] * var26 + var6.field325[8] * var27 + var6.field325[12];
            var31 = var6.field325[1] * var25 + var6.field325[5] * var26 + var6.field325[9] * var27 + var6.field325[13];
            float var32 = this.field9273.field697 + this.field9273.field773 * var30 / var29;
            float var33 = this.field9273.field699 + this.field9273.field700 * var31 / var29;
            if (var32 < var8) {
               var8 = var32;
            }

            if (var32 > var9) {
               var9 = var32;
            }

            if (var33 < var10) {
               var10 = var33;
            }

            if (var33 > var11) {
               var11 = var33;
            }

            var7 = true;
         }
      }

      if (var7 && (float)var1 > var8 && (float)var1 < var9 && (float)var2 > var10 && (float)var2 < var11) {
         if (var4) {
            return true;
         }

         if (field9312.length < this.field9285) {
            field9312 = new int[this.field9285];
            field9308 = new int[this.field9285];
         }

         for(var24 = 0; var24 < this.field9279; ++var24) {
            var25 = (float)this.field9280[var24];
            var26 = (float)this.field9274[var24];
            var27 = (float)this.field9344[var24];
            var28 = var6.field325[2] * var25 + var6.field325[6] * var26 + var6.field325[10] * var27 + var6.field325[14];
            var29 = var6.field325[3] * var25 + var6.field325[7] * var26 + var6.field325[11] * var27 + var6.field325[15];
            int var38;
            int var39;
            if (var28 >= -var29) {
               var30 = var6.field325[0] * var25 + var6.field325[4] * var26 + var6.field325[8] * var27 + var6.field325[12];
               var31 = var6.field325[1] * var25 + var6.field325[5] * var26 + var6.field325[9] * var27 + var6.field325[13];
               var38 = this.field9326[var24];
               var39 = this.field9326[var24 + 1];

               for(int var34 = var38; var34 < var39; ++var34) {
                  int var35 = this.field9327[var34] - 1;
                  if (var35 == -1) {
                     break;
                  }

                  field9312[var35] = (int)(this.field9273.field697 + this.field9273.field773 * var30 / var29);
                  field9308[var35] = (int)(this.field9273.field699 + this.field9273.field700 * var31 / var29);
               }
            } else {
               int var36 = this.field9326[var24];
               int var37 = this.field9326[var24 + 1];

               for(var38 = var36; var38 < var37; ++var38) {
                  var39 = this.field9327[var38] - 1;
                  if (var39 == -1) {
                     break;
                  }

                  field9312[this.field9327[var38] - 1] = -999999;
               }
            }
         }

         for(var24 = 0; var24 < this.field9295; ++var24) {
            if (field9312[this.field9299[var24]] != -999999 && field9312[this.field9300[var24]] != -999999 && field9312[this.field9301[var24]] != -999999 && this.method5571(var1, var2, field9308[this.field9299[var24]], field9308[this.field9300[var24]], field9308[this.field9301[var24]], field9312[this.field9299[var24]], field9312[this.field9300[var24]], field9312[this.field9301[var24]])) {
               return true;
            }
         }
      }

      return false;
   }

   boolean method5571(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var2 < var3 && var2 < var4 && var2 < var5) {
         return false;
      } else if (var2 > var3 && var2 > var4 && var2 > var5) {
         return false;
      } else if (var1 < var6 && var1 < var7 && var1 < var8) {
         return false;
      } else {
         return var1 <= var6 || var1 <= var7 || var1 <= var8;
      }
   }

   void method5572(class306 var1) {
      if (field9312.length < this.field9285) {
         field9312 = new int[this.field9285];
         field9308 = new int[this.field9285];
      }

      int var2;
      int var6;
      int var7;
      int var8;
      for(var2 = 0; var2 < this.field9279; ++var2) {
         int var3 = (this.field9280[var2] - (this.field9274[var2] * this.field9273.field743 >> 8) >> this.field9273.field757) - var1.field390;
         int var4 = (this.field9344[var2] - (this.field9274[var2] * this.field9273.field761 >> 8) >> this.field9273.field757) - var1.field394;
         int var5 = this.field9326[var2];
         var6 = this.field9326[var2 + 1];

         for(var7 = var5; var7 < var6; ++var7) {
            var8 = this.field9327[var7] - 1;
            if (var8 == -1) {
               break;
            }

            field9312[var8] = var3;
            field9308[var8] = var4;
         }
      }

      for(var2 = 0; var2 < this.field9296; ++var2) {
         if (this.field9342 == null || this.field9342[var2] <= 128) {
            short var12 = this.field9299[var2];
            short var13 = this.field9300[var2];
            short var14 = this.field9301[var2];
            var6 = field9312[var12];
            var7 = field9312[var13];
            var8 = field9312[var14];
            int var9 = field9308[var12];
            int var10 = field9308[var13];
            int var11 = field9308[var14];
            if ((var6 - var7) * (var10 - var11) - (var10 - var9) * (var8 - var7) > 0) {
               var1.method370(var9, var10, var11, var6, var7, var8);
            }
         }
      }

   }

   public void method5965(class135 var1, class211 var2, int var3) {
      if (field9345 != null) {
         field9345.method3069();
      }

      if (this.field9285 != 0) {
         class344 var4 = this.field9273.field690;
         class344 var5 = this.field9273.field680;
         class344 var6 = this.field9273.field648;
         var5.method272(var1);
         var6.method269(var5);
         var6.method271(this.field9273.field649);
         if (!this.field9329) {
            this.method5562();
         }

         float[] var7 = this.field9273.field756;
         var5.method276(0.0F, (float)this.field9317, 0.0F, var7);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         var5.method276(0.0F, (float)this.field9318, 0.0F, var7);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = this.field9273.field696[var14];
            float var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float)this.field9315;
            float var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float)this.field9315;
            if (var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if (var2 != null) {
            boolean var33 = false;
            boolean var34 = true;
            int var35 = this.field9319 + this.field9320 >> 1;
            int var36 = this.field9321 + this.field9322 >> 1;
            int var19 = this.field9317;
            float var21 = var6.field325[0] * (float)var35 + var6.field325[4] * (float)var19 + var6.field325[8] * (float)var36 + var6.field325[12];
            float var22 = var6.field325[1] * (float)var35 + var6.field325[5] * (float)var19 + var6.field325[9] * (float)var36 + var6.field325[13];
            float var23 = var6.field325[2] * (float)var35 + var6.field325[6] * (float)var19 + var6.field325[10] * (float)var36 + var6.field325[14];
            float var24 = var6.field325[3] * (float)var35 + var6.field325[7] * (float)var19 + var6.field325[11] * (float)var36 + var6.field325[15];
            if (var23 >= -var24) {
               var2.field7246 = (int)(this.field9273.field697 + this.field9273.field773 * var21 / var24);
               var2.field7247 = (int)(this.field9273.field699 + this.field9273.field700 * var22 / var24);
            } else {
               var33 = true;
            }

            var19 = this.field9318;
            float var25 = var6.field325[0] * (float)var35 + var6.field325[4] * (float)var19 + var6.field325[8] * (float)var36 + var6.field325[12];
            float var26 = var6.field325[1] * (float)var35 + var6.field325[5] * (float)var19 + var6.field325[9] * (float)var36 + var6.field325[13];
            float var27 = var6.field325[2] * (float)var35 + var6.field325[6] * (float)var19 + var6.field325[10] * (float)var36 + var6.field325[14];
            float var28 = var6.field325[3] * (float)var35 + var6.field325[7] * (float)var19 + var6.field325[11] * (float)var36 + var6.field325[15];
            if (var27 >= -var28) {
               var2.field7248 = (int)(this.field9273.field697 + this.field9273.field773 * var25 / var28);
               var2.field7245 = (int)(this.field9273.field699 + this.field9273.field700 * var26 / var28);
            } else {
               var33 = true;
            }

            float var29;
            float var30;
            if (var33) {
               if (var23 < -var24 && var27 < -var28) {
                  var34 = false;
               } else {
                  float var31;
                  float var32;
                  if (var23 < -var24) {
                     var29 = (var23 + var24) / (var27 + var28) - 1.0F;
                     var30 = var21 + var29 * (var25 - var21);
                     var31 = var22 + var29 * (var26 - var22);
                     var32 = var24 + var29 * (var28 - var24);
                     var2.field7246 = (int)(this.field9273.field697 + this.field9273.field773 * var30 / var32);
                     var2.field7247 = (int)(this.field9273.field699 + this.field9273.field700 * var31 / var32);
                  } else if (var27 < -var28) {
                     var29 = (var27 + var28) / (var23 + var24) - 1.0F;
                     var30 = var25 + var29 * (var21 - var25);
                     var31 = var26 + var29 * (var22 - var26);
                     var32 = var28 + var29 * (var24 - var28);
                     var2.field7248 = (int)(this.field9273.field697 + this.field9273.field773 * var30 / var32);
                     var2.field7245 = (int)(this.field9273.field699 + this.field9273.field700 * var31 / var32);
                  }
               }
            }

            if (var34) {
               if (var23 / var24 > var27 / var28) {
                  var29 = var21 + var4.field325[0] * (float)this.field9315 + var4.field325[12];
                  var30 = var24 + var4.field325[3] * (float)this.field9315 + var4.field325[15];
                  var2.field7250 = (int)(this.field9273.field697 - (float)var2.field7246 + this.field9273.field773 * var29 / var30);
               } else {
                  var29 = var25 + var4.field325[0] * (float)this.field9315 + var4.field325[12];
                  var30 = var28 + var4.field325[3] * (float)this.field9315 + var4.field325[15];
                  var2.field7250 = (int)(this.field9273.field697 - (float)var2.field7248 + this.field9273.field773 * var29 / var30);
               }

               var2.field7249 = true;
            }
         }

         this.field9273.method653(var3);
         this.method5573(var1);
         this.field9273.method653(0);
         var5.method272(var1);
         var5.method271(this.field9273.field674);
         this.method5579(var5);
      }

   }

   void method5573(class135 var1) {
      if (this.field9296 != 0 && this.method5574() && this.method5565()) {
         this.field9273.method652();
         class605 var2 = this.field9273.field760;
         this.field9273.method642(0, this.field9306.field4210);
         this.field9273.method642(1, this.field9290.field4210);
         this.field9273.method642(2, this.field9309.field4210);
         this.field9273.method643(this.field9305.field3844);
         this.field9273.field680.method272(var1);
         var2.method5105(this.field9273.field680);
         var2.field8691.method299();
         if (this.field9273.field770) {
            class919 var3 = this.field9273.method632();
            var2.field8695.method4570(0.0F, 1.0F, 0.0F, (float)(-this.field9273.field772));
            var2.field8695.method4574(3.0F / (float)var3.field10425);
            var2.field8696.method3292((float)(var3.field10426 >> 16 & 255) / 255.0F, (float)(var3.field10426 >> 8 & 255) / 255.0F, (float)(var3.field10426 >> 0 & 255) / 255.0F);
         } else {
            var2.field8695.method4570(0.0F, 0.0F, 0.0F, 0.0F);
            var2.field8696.method3292(0.0F, 0.0F, 0.0F);
         }

         if (this.field9273.field677 > 0) {
            var2.field8697.method4570(0.0F, 0.0F, 1.0F, -this.field9273.field736);
            var2.field8694.method3292((float)(this.field9273.field776 >> 16 & 255) / 255.0F, (float)(this.field9273.field776 >> 8 & 255) / 255.0F, (float)(this.field9273.field776 >> 0 & 255) / 255.0F);
            this.field9273.field680.method272(var1);
            this.field9273.field680.method286();
            var2.field8695.method4573(this.field9273.field680);
            this.field9273.field680.method272(var1);
            this.field9273.field680.method271(this.field9273.field674);
            this.field9273.field680.method286();
            var2.field8697.method4573(this.field9273.field680);
            var2.field8697.method4574(1.0F / (this.field9273.field780 - this.field9273.field736));
         } else {
            var2.field8697.method4570(0.0F, 0.0F, 0.0F, 0.0F);
            var2.field8694.method3292(0.0F, 0.0F, 0.0F);
         }

         int var4;
         int var6;
         int var14;
         if ((this.field9275 & 55) == 0) {
            this.field9273.method714(this.field9273.field750);
            if (this.field9273.field658) {
               this.field9273.method676(false);
            }

            for(int var13 = 0; var13 < this.field9324.length; ++var13) {
               var4 = this.field9323[var13];
               var14 = this.field9323[var13 + 1];
               var6 = this.field9302[var4] & '\uffff';
               boolean var16 = false;
               if (var6 != 65535) {
                  var2.field8689 = this.field9273.field795.method4727(var6);
                  class414 var17 = this.field9273.field8581.method4625(var6, 2089802504);
                  var16 = !class355.method1414(var17.field9383, -1764580449);
                  var2.field8691.field325[12] = (float)(this.field9273.field786 % 128000) / 1000.0F * (float)var17.field9389 / 64.0F % 1.0F;
                  var2.field8691.field325[13] = (float)(this.field9273.field786 % 128000) / 1000.0F * (float)var17.field9363 / 64.0F % 1.0F;
               } else {
                  var2.field8689 = this.field9273.field754;
                  float[] var18 = var2.field8691.field325;
                  var2.field8691.field325[13] = 0.0F;
                  var18[12] = 0.0F;
               }

               var2.field8704 = this.field9324[var13];
               var2.field8705 = this.field9292[var13];
               var2.field8706 = var4 * 3;
               var2.field8686 = var14 - var4;
               var2.method5113(var16);
            }
         } else {
            this.field9273.method642(3, this.field9313.field4210);
            this.field9273.method714(this.field9273.field802);
            class135 var12 = this.field9273.field679;
            var12.method1024(var1);
            var12.method1012();
            var4 = 0;
            int var8;
            if (this.field9273.field658) {
               this.field9273.method676(true);
            } else {
               var2.field8699.method3292(this.field9273.field727[0], this.field9273.field727[1], this.field9273.field727[2]);
               var2.field8699.method3303(var12);
               var2.field8700.method3292(this.field9273.field808 * this.field9273.field806, this.field9273.field808 * this.field9273.field733, this.field9273.field808 * this.field9273.field734);
               var2.field8701.method3292(-this.field9273.field737 * this.field9273.field806, -this.field9273.field737 * this.field9273.field733, -this.field9273.field737 * this.field9273.field734);
               var2.field8687.method3292(this.field9273.field735 * this.field9273.field806, this.field9273.field735 * this.field9273.field733, this.field9273.field735 * this.field9273.field734);
               if (this.field9273.field739 > 0) {
                  var4 = this.field9273.field739;
                  class32 var5 = this.field9273.field682;

                  for(var6 = 0; var6 < var4; ++var6) {
                     class639 var7 = this.field9273.field730[var6];
                     var8 = var7.method5905(-1700557017);
                     var5.method3298(var7.field9812);
                     var5.method3301(var12);
                     var2.field8688[var6 * 4 + 0] = var5.field5296;
                     var2.field8688[var6 * 4 + 1] = var5.field5300;
                     var2.field8688[var6 * 4 + 2] = var5.field5299;
                     var2.field8688[var6 * 4 + 3] = (float)(var7.method5907(-516677016) * var7.method5907(-969209529));
                     float var9 = var7.method5908(608404512) / 255.0F;
                     var2.field8698[var6 * 4 + 0] = (float)(var8 >> 16 & 255) * var9;
                     var2.field8698[var6 * 4 + 1] = (float)(var8 >> 8 & 255) * var9;
                     var2.field8698[var6 * 4 + 2] = (float)(var8 & 255) * var9;
                     var2.field8698[var6 * 4 + 3] = 1.0F;
                  }
               }
            }

            for(var14 = 0; var14 < this.field9324.length; ++var14) {
               var6 = this.field9323[var14];
               int var15 = this.field9323[var14 + 1];
               var8 = this.field9302[var6] & '\uffff';
               byte var19 = 11;
               if (var8 != 65535) {
                  var2.field8689 = this.field9273.field795.method4727(var8);
                  class414 var10 = this.field9273.field8581.method4625(var8, 1828434127);
                  var19 = var10.field9383;
                  var2.method5108(var10);
                  var2.field8691.field325[12] = (float)(this.field9273.field786 % 128000) / 1000.0F * (float)var10.field9389 / 64.0F % 1.0F;
                  var2.field8691.field325[13] = (float)(this.field9273.field786 % 128000) / 1000.0F * (float)var10.field9363 / 64.0F % 1.0F;
               } else {
                  var2.field8689 = this.field9273.field754;
                  float[] var20 = var2.field8691.field325;
                  var2.field8691.field325[13] = 0.0F;
                  var20[12] = 0.0F;
               }

               var2.field8704 = this.field9324[var14];
               var2.field8705 = this.field9292[var14];
               var2.field8706 = var6 * 3;
               var2.field8686 = var15 - var6;
               switch(var19) {
               case 1:
                  var2.field8702.method3292(this.field9273.field675.field325[12], this.field9273.field675.field325[13], this.field9273.field675.field325[14]);
                  var2.field8702.method3301(var12);
                  var2.method5107(var4);
                  break;
               case 2:
               case 3:
               case 4:
               default:
                  var2.method5106(var4);
                  break;
               case 5:
                  if (!this.field9273.field658) {
                     class638 var21 = this.field9273.field710;
                     class414 var11 = this.field9273.field8581.method4625(var8, 1474848008);
                     var21.method5929(var11.field9390, var11.field9385, (byte)19);
                     var21.field9831.method272(var1);
                     var21.field9834.method272(var1);
                     var21.field9834.method271(this.field9273.field695);
                     var21.field9842 = this.field9324[var14];
                     var21.field9843 = this.field9292[var14];
                     var21.field9844 = var6;
                     var21.field9845 = var15 - var6;
                     var21.method5930(-1182747927);
                  } else {
                     var2.method5106(var4);
                  }
                  break;
               case 6:
                  var2.method5113(!class355.method1414(var19, -2085193350));
                  break;
               case 7:
                  var2.field8702.method3292(this.field9273.field675.field325[12], this.field9273.field675.field325[13], this.field9273.field675.field325[14]);
                  var2.field8702.method3301(var12);
                  var2.field8707.method272(var1);
                  var2.field8690 = this.field9273.method580();
                  var2.method5102(var4);
               }
            }
         }

         this.method5567();
      }

   }

   boolean method5574() {
      boolean var1 = !this.field9290.field4208;
      boolean var2 = (this.field9275 & 55) != 0 && !this.field9313.field4208;
      boolean var3 = !this.field9306.field4208;
      boolean var4 = !this.field9309.field4208;
      if (!var3 && !var1 && !var2 && !var4) {
         return true;
      } else {
         boolean var5 = true;
         class525 var6;
         Unsafe var7;
         ByteBuffer var8;
         long var9;
         int var11;
         short var12;
         int var13;
         int var34;
         if (var3 && this.field9286 != null) {
            if (this.field9306.field4211 == null) {
               this.field9306.field4211 = this.field9273.method641(this.field9310);
            }

            var6 = this.field9306.field4211;
            var6.method2237(this.field9285 * 12, 12);
            var7 = this.field9273.field663;
            if (var7 != null) {
               var34 = this.field9285 * 12;
               var9 = var6.method1976(0, var34);

               for(var11 = 0; var11 < this.field9285; ++var11) {
                  var12 = this.field9286[var11];
                  var7.putFloat(var9, (float)this.field9280[var12]);
                  var9 += 4L;
                  var7.putFloat(var9, (float)this.field9274[var12]);
                  var9 += 4L;
                  var7.putFloat(var9, (float)this.field9344[var12]);
                  var9 += 4L;
               }

               var6.method1983();
            } else {
               var8 = this.field9273.field660;
               var8.clear();

               for(var13 = 0; var13 < this.field9285; ++var13) {
                  var8.putFloat((float)this.field9280[this.field9286[var13]]);
                  var8.putFloat((float)this.field9274[this.field9286[var13]]);
                  var8.putFloat((float)this.field9344[this.field9286[var13]]);
               }

               var6.method1977(0, var8.position(), this.field9273.field661);
            }

            this.field9306.field4210 = var6;
            this.field9306.field4208 = true;
         }

         int var16;
         int var18;
         float var19;
         float var20;
         float var21;
         short[] var39;
         float var49;
         float var53;
         if (var1) {
            if (this.field9290.field4211 == null) {
               this.field9290.field4211 = this.field9273.method641(this.field9310);
            }

            var6 = this.field9290.field4211;
            var6.method2237(this.field9285 * 4, 4);
            var7 = this.field9273.field663;
            float var23;
            int var27;
            short[] var36;
            if (var7 != null) {
               var34 = this.field9285 * 4;
               var9 = var6.method1976(0, var34);
               if ((this.field9275 & 55) == 0) {
                  short[] var38;
                  short[] var40;
                  byte[] var43;
                  if (this.field9294 != null) {
                     var36 = this.field9294.field9773;
                     var38 = this.field9294.field9771;
                     var40 = this.field9294.field9770;
                     var43 = this.field9294.field9772;
                  } else {
                     var36 = this.field9288;
                     var38 = this.field9289;
                     var40 = this.field9298;
                     var43 = this.field9337;
                  }

                  float var47 = this.field9273.field808 * 768.0F / (float)this.field9277;
                  var49 = this.field9273.field737 * 768.0F / (float)this.field9277;

                  for(var18 = 0; var18 < this.field9285; ++var18) {
                     short var51 = this.field9287[var18];
                     int var52 = this.method5576(this.field9314[var51] & '\uffff', this.field9302[var51], this.field9276);
                     var21 = (float)(var52 >> 16 & 255) * this.field9273.field806;
                     var53 = (float)(var52 >> 8 & 255) * this.field9273.field733;
                     var23 = (float)(var52 & 255) * this.field9273.field734;
                     byte var54 = var43[var18];
                     float var55;
                     if (var54 == 0) {
                        var55 = (this.field9273.field727[0] * (float)var36[var18] + this.field9273.field727[1] * (float)var38[var18] + this.field9273.field727[2] * (float)var40[var18]) * 0.0026041667F;
                     } else {
                        var55 = (this.field9273.field727[0] * (float)var36[var18] + this.field9273.field727[1] * (float)var38[var18] + this.field9273.field727[2] * (float)var40[var18]) / ((float)var54 * 256.0F);
                     }

                     float var56 = this.field9273.field735 + var55 * (var55 < 0.0F ? var49 : var47);
                     var27 = (int)(var21 * var56);
                     if (var27 < 0) {
                        var27 = 0;
                     } else if (var27 > 255) {
                        var27 = 255;
                     }

                     int var28 = (int)(var53 * var56);
                     if (var28 < 0) {
                        var28 = 0;
                     } else if (var28 > 255) {
                        var28 = 255;
                     }

                     int var29 = (int)(var23 * var56);
                     if (var29 < 0) {
                        var29 = 0;
                     } else if (var29 > 255) {
                        var29 = 255;
                     }

                     var7.putInt(var9, 255 - this.field9342[var51] << 24 | var27 << 16 | var28 << 8 | var29);
                     var9 += 4L;
                  }
               } else {
                  for(var11 = 0; var11 < this.field9285; ++var11) {
                     var12 = this.field9287[var11];
                     int var44 = 255 - this.field9342[var12] << 24 | this.method5576(this.field9314[var12] & '\uffff', this.field9302[var12], this.field9276);
                     var7.putInt(var9, var44);
                     var9 += 4L;
                  }
               }

               var6.method1983();
            } else {
               var8 = this.field9273.field660;
               var8.clear();
               if ((this.field9275 & 55) == 0) {
                  short[] var30;
                  byte[] var37;
                  if (this.field9294 != null) {
                     var39 = this.field9294.field9773;
                     var30 = this.field9294.field9771;
                     var36 = this.field9294.field9770;
                     var37 = this.field9294.field9772;
                  } else {
                     var39 = this.field9288;
                     var30 = this.field9289;
                     var36 = this.field9298;
                     var37 = this.field9337;
                  }

                  float var14 = this.field9273.field808 * 768.0F / (float)this.field9277;
                  float var15 = this.field9273.field737 * 768.0F / (float)this.field9277;

                  for(var16 = 0; var16 < this.field9285; ++var16) {
                     short var17 = this.field9287[var16];
                     var18 = this.method5576(this.field9314[var17] & '\uffff', this.field9302[var17], this.field9276);
                     var19 = (float)(var18 >> 16 & 255) * this.field9273.field806;
                     var20 = (float)(var18 >> 8 & 255) * this.field9273.field733;
                     var21 = (float)(var18 & 255) * this.field9273.field734;
                     byte var22 = var37[var16];
                     if (var22 == 0) {
                        var23 = (this.field9273.field727[0] * (float)var39[var16] + this.field9273.field727[1] * (float)var30[var16] + this.field9273.field727[2] * (float)var36[var16]) * 0.0026041667F;
                     } else {
                        var23 = (this.field9273.field727[0] * (float)var39[var16] + this.field9273.field727[1] * (float)var30[var16] + this.field9273.field727[2] * (float)var36[var16]) / ((float)var22 * 256.0F);
                     }

                     float var24 = this.field9273.field735 + var23 * (var23 < 0.0F ? var15 : var14);
                     int var25 = (int)(var19 * var24);
                     if (var25 < 0) {
                        var25 = 0;
                     } else if (var25 > 255) {
                        var25 = 255;
                     }

                     int var26 = (int)(var20 * var24);
                     if (var26 < 0) {
                        var26 = 0;
                     } else if (var26 > 255) {
                        var26 = 255;
                     }

                     var27 = (int)(var21 * var24);
                     if (var27 < 0) {
                        var27 = 0;
                     } else if (var27 > 255) {
                        var27 = 255;
                     }

                     var8.putInt(255 - this.field9342[var17] << 24 | var25 << 16 | var26 << 8 | var27);
                  }
               } else {
                  for(var13 = 0; var13 < this.field9285; ++var13) {
                     short var57 = this.field9287[var13];
                     var11 = 255 - this.field9342[var57] << 24 | this.method5576(this.field9314[var57] & '\uffff', this.field9302[var57], this.field9276);
                     var8.putInt(var11);
                  }
               }

               var6.method1977(0, var8.position(), this.field9273.field661);
            }

            this.field9290.field4210 = var6;
            this.field9290.field4208 = true;
         }

         if (var2) {
            if (this.field9313.field4211 == null) {
               this.field9313.field4211 = this.field9273.method641(this.field9310);
            }

            var6 = this.field9313.field4211;
            var6.method2237(this.field9285 * 12, 12);
            short[] var33;
            short[] var35;
            byte[] var58;
            if (this.field9294 != null) {
               var33 = this.field9294.field9773;
               var35 = this.field9294.field9771;
               var39 = this.field9294.field9770;
               var58 = this.field9294.field9772;
            } else {
               var33 = this.field9288;
               var35 = this.field9289;
               var39 = this.field9298;
               var58 = this.field9337;
            }

            float var42 = 3.0F / (float)this.field9277;
            float var41 = 3.0F / (float)(this.field9277 + this.field9277 / 2);
            Unsafe var45 = this.field9273.field663;
            if (var45 != null) {
               int var48 = this.field9285 * 12;
               long var31 = var6.method1976(0, var48);

               for(var18 = 0; var18 < this.field9285; ++var18) {
                  var19 = var58[var18] == 0 ? var41 : var42 / (float)var58[var18];
                  var20 = (float)var33[var18] * var19;
                  var21 = (float)var35[var18] * var19;
                  var53 = (float)var39[var18] * var19;
                  var45.putFloat(var31, var20);
                  var31 += 4L;
                  var45.putFloat(var31, var21);
                  var31 += 4L;
                  var45.putFloat(var31, var53);
                  var31 += 4L;
               }

               var6.method1983();
            } else {
               ByteBuffer var46 = this.field9273.field660;
               var46.clear();

               for(var16 = 0; var16 < this.field9285; ++var16) {
                  var49 = var58[var16] == 0 ? var41 : var42 / (float)var58[var16];
                  float var50 = (float)var33[var16] * var49;
                  var19 = (float)var35[var16] * var49;
                  var20 = (float)var39[var16] * var49;
                  var46.putFloat(var50);
                  var46.putFloat(var19);
                  var46.putFloat(var20);
               }

               var6.method1977(0, var46.position(), this.field9273.field661);
            }

            this.field9313.field4210 = var6;
            this.field9313.field4208 = true;
         }

         if (var4) {
            if (this.field9309.field4211 == null) {
               this.field9309.field4211 = this.field9273.method641(this.field9310);
            }

            var6 = this.field9309.field4211;
            var6.method2237(this.field9285 * 8, 8);
            var7 = this.field9273.field663;
            if (var7 != null) {
               var34 = this.field9285 * 8;
               var9 = var6.method1976(0, var34);

               for(var11 = 0; var11 < this.field9285; ++var11) {
                  var7.putFloat(var9, this.field9332[var11]);
                  var9 += 4L;
                  var7.putFloat(var9, this.field9293[var11]);
                  var9 += 4L;
               }

               var6.method1983();
            } else {
               var8 = this.field9273.field660;
               var8.clear();

               for(var13 = 0; var13 < this.field9285; ++var13) {
                  var8.putFloat(this.field9332[var13]);
                  var8.putFloat(this.field9293[var13]);
               }

               var6.method1977(0, var8.position(), this.field9273.field661);
            }

            this.field9309.field4210 = var6;
            this.field9309.field4208 = true;
         }

         return var5;
      }
   }

   public int method5948() {
      return this.field9291;
   }

   int method5575(int var1, int var2) {
      var2 = var2 * (var1 & 127) >> 7;
      if (var2 < 2) {
         var2 = 2;
      } else if (var2 > 126) {
         var2 = 126;
      }

      return (var1 & 'ﾀ') + var2;
   }

   int method5576(int var1, short var2, int var3) {
      int var4 = this.field9273.field659[this.method5575(var1, var3)];
      if (var2 != -1) {
         class414 var5 = this.field9273.field8581.method4625(var2 & '\uffff', 655487432);
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
      }

      return var4 & 16777215;
   }

   public void method5985(byte var1, byte[] var2) {
      int var3;
      if (var2 == null) {
         for(var3 = 0; var3 < this.field9295; ++var3) {
            this.field9342[var3] = var1;
         }
      } else {
         for(var3 = 0; var3 < this.field9295; ++var3) {
            int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
            this.field9342[var3] = (byte)var4;
         }
      }

      this.method5568();
   }

   public int method5973() {
      if (!this.field9329) {
         this.method5562();
      }

      return this.field9307;
   }

   static float[] method5577(float[] var0, int var1) {
      float[] var2 = new float[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   short method5578(class25 var1, int var2, int var3, long var4, int var6, int var7, int var8, int var9, float var10, float var11) {
      int var12 = this.field9326[var2];
      int var13 = this.field9326[var2 + 1];
      int var14 = 0;

      for(int var15 = var12; var15 < var13; ++var15) {
         short var16 = this.field9327[var15];
         if (var16 == 0) {
            var14 = var15;
            break;
         }

         if (field9334[var15] == var4) {
            return (short)(var16 - 1);
         }
      }

      this.field9327[var14] = (short)(this.field9285 + 1);
      field9334[var14] = var4;
      this.field9287[this.field9285] = (short)var3;
      this.field9286[this.field9285] = (short)var2;
      this.field9288[this.field9285] = (short)var6;
      this.field9289[this.field9285] = (short)var7;
      this.field9298[this.field9285] = (short)var8;
      this.field9337[this.field9285] = (byte)var9;
      this.field9332[this.field9285] = var10;
      this.field9293[this.field9285] = var11;
      return (short)(this.field9285++);
   }

   void method5579(class344 var1) {
      if (this.field9331 != null) {
         this.field9273.method4869(!this.field9272);
         class135 var2 = this.field9273.field679;
         class834 var3 = this.field9273.field693;

         for(int var4 = 0; var4 < this.field9330; ++var4) {
            class300 var5 = this.field9331[var4];
            class664 var6 = this.field9271[var4];
            if (!var5.field3935 || !this.field9273.method4883()) {
               float var7 = (float)(this.field9280[var5.field3941] + this.field9280[var5.field3936] + this.field9280[var5.field3934]) * 0.3333333F;
               float var8 = (float)(this.field9274[var5.field3941] + this.field9274[var5.field3936] + this.field9274[var5.field3934]) * 0.3333333F;
               float var9 = (float)(this.field9344[var5.field3941] + this.field9344[var5.field3936] + this.field9344[var5.field3934]) * 0.3333333F;
               float var10 = var1.field325[0] * var7 + var1.field325[4] * var8 + var1.field325[8] * var9 + var1.field325[12];
               float var11 = var1.field325[1] * var7 + var1.field325[5] * var8 + var1.field325[9] * var9 + var1.field325[13];
               float var12 = var1.field325[2] * var7 + var1.field325[6] * var8 + var1.field325[10] * var9 + var1.field325[14];
               float var13 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11 + var12 * var12))) * (float)var5.field3942;
               var2.method1010(var6.field9610, var6.field9606 * var5.field3938 >> 7, var6.field9605 * var5.field3939 >> 7, var10 + (float)var6.field9608 - var10 * var13, var11 + (float)var6.field9609 - var11 * var13, var12 - var12 * var13);
               var2.method1027(this.field9273.field673);
               this.field9273.field648.method272(var2);
               var3.method5412(this.field9273.field648);
               var3.field9168.method299();
               var3.field9167 = var6.field9607;
               var3.field9166 = this.field9273.field795.method4727(var5.field3940);
               var3.method5411();
            }
         }

         this.field9273.method4869(true);
      }

   }

   boolean method5949() {
      if (this.field9297 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.field9278; ++var1) {
            this.field9280[var1] <<= 4;
            this.field9274[var1] <<= 4;
            this.field9344[var1] <<= 4;
         }

         field9281 = 0;
         field9316 = 0;
         field9335 = 0;
         return true;
      }
   }

   public int method5979() {
      if (!this.field9329) {
         this.method5562();
      }

      return this.field9322;
   }

   public int method6099() {
      if (!this.field9329) {
         this.method5562();
      }

      return this.field9319;
   }

   public void method5951(int var1) {
      int var2 = class703.field3413[var1];
      int var3 = class703.field3404[var1];

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field9279; ++var4) {
         var5 = this.field9344[var4] * var2 + this.field9280[var4] * var3 >> 14;
         this.field9344[var4] = this.field9344[var4] * var3 - this.field9280[var4] * var2 >> 14;
         this.field9280[var4] = var5;
      }

      for(var4 = 0; var4 < this.field9285; ++var4) {
         var5 = this.field9298[var4] * var2 + this.field9288[var4] * var3 >> 14;
         this.field9298[var4] = (short)(this.field9298[var4] * var3 - this.field9288[var4] * var2 >> 14);
         this.field9288[var4] = (short)var5;
      }

      this.method5581();
      this.method5569();
      this.field9329 = false;
   }

   public void method5947(int var1) {
      if (this.field9306 != null) {
         this.field9306.field4209 = class586.method327(var1, this.field9275);
      }

      if (this.field9309 != null) {
         this.field9309.field4209 = class586.method334(var1, this.field9275);
      }

      if (this.field9290 != null) {
         this.field9290.field4209 = class586.method322(var1, this.field9275);
      }

      if (this.field9313 != null) {
         this.field9313.field4209 = class586.method311(var1, this.field9275);
      }

      this.field9291 = var1;
      if (this.field9294 != null && (this.field9291 & 65536) == 0) {
         this.field9288 = this.field9294.field9773;
         this.field9289 = this.field9294.field9771;
         this.field9298 = this.field9294.field9770;
         this.field9337 = this.field9294.field9772;
         this.field9294 = null;
      }

      this.field9311 = true;
      this.method5567();
   }

   class412(class325 var1, class25 var2, int var3, int var4, int var5, int var6) {
      this(var1, var3, var6, true, false);
      class478 var7 = var1.field8581;
      int[] var8 = new int[var2.field6453];
      this.field9326 = new int[var2.field6458 + 1];

      for(int var9 = 0; var9 < var2.field6453; ++var9) {
         if (var2.field6457 == null || var2.field6457[var9] != 2) {
            if (var2.field6449 != null && var2.field6449[var9] != -1) {
               class414 var10 = var7.method4625(var2.field6449[var9] & '\uffff', 854670928);
               if (((this.field9275 & 64) == 0 || !var10.field9378) && var10.field9392) {
                  continue;
               }
            }

            var8[this.field9295++] = var9;
            ++this.field9326[var2.field6476[var9]];
            ++this.field9326[var2.field6478[var9]];
            ++this.field9326[var2.field6456[var9]];
         }
      }

      this.field9296 = this.field9295;
      long[] var67 = new long[this.field9295];
      boolean var68 = (this.field9291 & 256) != 0;

      int var12;
      int var14;
      int var19;
      class414 var22;
      int var72;
      short var79;
      for(int var11 = 0; var11 < this.field9295; ++var11) {
         var12 = var8[var11];
         class414 var13 = null;
         var14 = 0;
         byte var15 = 0;
         byte var16 = 0;
         byte var17 = 0;
         if (var2.field6481 != null) {
            boolean var18 = false;

            for(var19 = 0; var19 < var2.field6481.length; ++var19) {
               class606 var20 = var2.field6481[var19];
               if (var12 == var20.field8569) {
                  class526 var21 = class568.method550(var20.field8570, 1266955447);
                  if (var21.field3665) {
                     var18 = true;
                  }

                  if (var21.field3659 != -1) {
                     var22 = var7.method4625(var21.field3659, 991625180);
                     if (var22.field9382 == 2) {
                        this.field9272 = true;
                     }
                  }
               }
            }

            if (var18) {
               var67[var11] = Long.MAX_VALUE;
               --this.field9296;
               continue;
            }
         }

         var79 = -1;
         if (var2.field6449 != null) {
            var79 = var2.field6449[var12];
            if (var79 != -1) {
               var13 = var7.method4625(var79 & '\uffff', 1849620785);
               if ((this.field9275 & 64) != 0 && var13.field9378) {
                  var79 = -1;
                  var13 = null;
               } else {
                  var16 = var13.field9383;
                  var17 = var13.field9390;
               }
            }
         }

         boolean var80 = var2.field6459 != null && var2.field6459[var12] != 0 || var13 != null && var13.field9382 != 0;
         if ((var68 || var80) && var2.field6465 != null) {
            var14 += var2.field6465[var12] << 17;
         }

         if (var80) {
            var14 += 65536;
         }

         var14 += (var16 & 255) << 8;
         var14 += var17 & 255;
         var72 = var15 + ((var79 & '\uffff') << 16);
         var72 += var11 & '\uffff';
         var67[var11] = ((long)var14 << 32) + (long)var72;
         this.field9272 |= var80;
         this.field9282 |= var13 != null && (var13.field9389 != 0 || var13.field9363 != 0);
      }

      class544.method2368(var67, var8, (byte)8);
      this.field9278 = var2.field6446;
      this.field9279 = var2.field6458;
      this.field9280 = var2.field6448;
      this.field9274 = var2.field6474;
      this.field9344 = var2.field6450;
      this.field9343 = var2.field6452;
      class658[] var69 = new class658[this.field9279];
      this.field9328 = var2.field6479;
      this.field9283 = var2.field6445;
      int var74;
      if (var2.field6481 != null) {
         this.field9330 = var2.field6481.length;
         this.field9331 = new class300[this.field9330];
         this.field9271 = new class664[this.field9330];

         for(var12 = 0; var12 < this.field9330; ++var12) {
            class606 var70 = var2.field6481[var12];
            class526 var73 = class568.method550(var70.field8570, 1209275845);
            var72 = -1;

            for(var74 = 0; var74 < this.field9295; ++var74) {
               if (var8[var74] == var70.field8569) {
                  var72 = var74;
                  break;
               }
            }

            var74 = class134.field1398[var2.field6461[var70.field8569] & '\uffff'] & 16777215;
            var74 |= 255 - (var2.field6459 != null ? var2.field6459[var70.field8569] : 0) << 24;
            this.field9331[var12] = new class300(var72, var2.field6476[var70.field8569], var2.field6478[var70.field8569], var2.field6456[var70.field8569], var73.field3663, var73.field3661, var73.field3659, var73.field3660, var73.field3662, var73.field3665, var73.field3656, var70.field8571);
            this.field9271[var12] = new class664(var74);
         }
      }

      var12 = this.field9295 * 3;
      this.field9286 = new short[var12];
      this.field9287 = new short[var12];
      this.field9288 = new short[var12];
      this.field9289 = new short[var12];
      this.field9298 = new short[var12];
      this.field9337 = new byte[var12];
      this.field9332 = new float[var12];
      this.field9293 = new float[var12];
      this.field9314 = new short[this.field9295];
      this.field9342 = new byte[this.field9295];
      this.field9299 = new short[this.field9295];
      this.field9300 = new short[this.field9295];
      this.field9301 = new short[this.field9295];
      this.field9302 = new short[this.field9295];
      if (var2.field6447 != null) {
         this.field9304 = new short[this.field9295];
      }

      this.field9276 = (short)var4;
      this.field9277 = (short)var5;
      this.field9327 = new short[var12];
      field9334 = new long[var12];
      int var71 = 0;

      for(var14 = 0; var14 < var2.field6458; ++var14) {
         var72 = this.field9326[var14];
         this.field9326[var14] = var71;
         var71 += var72;
         var69[var14] = new class658();
      }

      this.field9326[var2.field6458] = var71;
      class251 var75 = this.method6095(var2, var8, this.field9295);
      class781[] var76 = new class781[var2.field6453];

      short var77;
      short var81;
      int var83;
      for(var74 = 0; var74 < var2.field6453; ++var74) {
         var77 = var2.field6476[var74];
         var79 = var2.field6478[var74];
         var81 = var2.field6456[var74];
         var83 = this.field9280[var79] - this.field9280[var77];
         int var85 = this.field9274[var79] - this.field9274[var77];
         int var87 = this.field9344[var79] - this.field9344[var77];
         int var23 = this.field9280[var81] - this.field9280[var77];
         int var24 = this.field9274[var81] - this.field9274[var77];
         int var25 = this.field9344[var81] - this.field9344[var77];
         int var26 = var85 * var25 - var24 * var87;
         int var27 = var87 * var23 - var25 * var83;

         int var28;
         for(var28 = var83 * var24 - var23 * var85; var26 > 8192 || var27 > 8192 || var28 > 8192 || var26 < -8192 || var27 < -8192 || var28 < -8192; var28 >>= 1) {
            var26 >>= 1;
            var27 >>= 1;
         }

         int var29 = (int)Math.sqrt((double)(var26 * var26 + var27 * var27 + var28 * var28));
         if (var29 <= 0) {
            var29 = 1;
         }

         var26 = var26 * 256 / var29;
         var27 = var27 * 256 / var29;
         var28 = var28 * 256 / var29;
         byte var30 = var2.field6457 == null ? 0 : var2.field6457[var74];
         if (var30 == 0) {
            class658 var31 = var69[var77];
            var31.field9540 += var26;
            var31.field9539 += var27;
            var31.field9538 += var28;
            ++var31.field9541;
            var31 = var69[var79];
            var31.field9540 += var26;
            var31.field9539 += var27;
            var31.field9538 += var28;
            ++var31.field9541;
            var31 = var69[var81];
            var31.field9540 += var26;
            var31.field9539 += var27;
            var31.field9538 += var28;
            ++var31.field9541;
         } else if (var30 == 1) {
            class781 var98 = var76[var74] = new class781();
            var98.field3932 = var26;
            var98.field3933 = var27;
            var98.field3931 = var28;
         }
      }

      int var84;
      short var86;
      for(var74 = 0; var74 < this.field9295; ++var74) {
         int var78 = var8[var74];
         var84 = var2.field6461[var78] & '\uffff';
         if (var2.field6467 == null) {
            var19 = -1;
         } else {
            var19 = var2.field6467[var78];
         }

         if (var2.field6459 == null) {
            var83 = 0;
         } else {
            var83 = var2.field6459[var78] & 255;
         }

         var86 = var2.field6449 == null ? -1 : var2.field6449[var78];
         if (var86 != -1 && (this.field9275 & 64) != 0) {
            var22 = var7.method4625(var86 & '\uffff', 1230249869);
            if (var22.field9378) {
               var86 = -1;
            }
         }

         float var88 = 0.0F;
         float var89 = 0.0F;
         float var90 = 0.0F;
         float var91 = 0.0F;
         float var93 = 0.0F;
         float var94 = 0.0F;
         byte var95 = 0;
         byte var96 = 0;
         int var97 = 0;
         short var34;
         short var35;
         short var36;
         byte var99;
         if (var86 != -1) {
            if (var19 == -1) {
               var88 = 0.0F;
               var89 = 1.0F;
               var90 = 1.0F;
               var91 = 1.0F;
               var95 = 1;
               var93 = 0.0F;
               var94 = 0.0F;
               var96 = 2;
            } else {
               var19 &= 255;
               var99 = var2.field6454[var19];
               short var32;
               short var33;
               float var40;
               float var41;
               float var42;
               float var52;
               float var53;
               float var54;
               float var55;
               float var56;
               float var57;
               if (var99 == 0) {
                  var32 = var2.field6476[var78];
                  var33 = var2.field6478[var78];
                  var34 = var2.field6456[var78];
                  var35 = var2.field6455[var19];
                  var36 = var2.field6468[var19];
                  short var37 = var2.field6470[var19];
                  float var38 = (float)var2.field6448[var35];
                  float var39 = (float)var2.field6474[var35];
                  var40 = (float)var2.field6450[var35];
                  var41 = (float)var2.field6448[var36] - var38;
                  var42 = (float)var2.field6474[var36] - var39;
                  float var43 = (float)var2.field6450[var36] - var40;
                  float var44 = (float)var2.field6448[var37] - var38;
                  float var45 = (float)var2.field6474[var37] - var39;
                  float var46 = (float)var2.field6450[var37] - var40;
                  float var47 = (float)var2.field6448[var32] - var38;
                  float var48 = (float)var2.field6474[var32] - var39;
                  float var49 = (float)var2.field6450[var32] - var40;
                  float var50 = (float)var2.field6448[var33] - var38;
                  float var51 = (float)var2.field6474[var33] - var39;
                  var52 = (float)var2.field6450[var33] - var40;
                  var53 = (float)var2.field6448[var34] - var38;
                  var54 = (float)var2.field6474[var34] - var39;
                  var55 = (float)var2.field6450[var34] - var40;
                  var56 = var42 * var46 - var43 * var45;
                  var57 = var43 * var44 - var41 * var46;
                  float var58 = var41 * var45 - var42 * var44;
                  float var59 = var45 * var58 - var46 * var57;
                  float var60 = var46 * var56 - var44 * var58;
                  float var61 = var44 * var57 - var45 * var56;
                  float var62 = 1.0F / (var59 * var41 + var60 * var42 + var61 * var43);
                  var88 = (var59 * var47 + var60 * var48 + var61 * var49) * var62;
                  var90 = (var59 * var50 + var60 * var51 + var61 * var52) * var62;
                  var93 = (var59 * var53 + var60 * var54 + var61 * var55) * var62;
                  var59 = var42 * var58 - var43 * var57;
                  var60 = var43 * var56 - var41 * var58;
                  var61 = var41 * var57 - var42 * var56;
                  var62 = 1.0F / (var59 * var44 + var60 * var45 + var61 * var46);
                  var89 = (var59 * var47 + var60 * var48 + var61 * var49) * var62;
                  var91 = (var59 * var50 + var60 * var51 + var61 * var52) * var62;
                  var94 = (var59 * var53 + var60 * var54 + var61 * var55) * var62;
               } else {
                  var32 = var2.field6476[var78];
                  var33 = var2.field6478[var78];
                  var34 = var2.field6456[var78];
                  int var101 = var75.field7851[var19];
                  int var102 = var75.field7848[var19];
                  int var103 = var75.field7847[var19];
                  float[] var105 = var75.field7849[var19];
                  byte var106 = var2.field6460[var19];
                  var40 = (float)var2.field6469[var19] / 256.0F;
                  if (var99 == 1) {
                     var41 = (float)var2.field6473[var19] / 1024.0F;
                     this.method5991(var2.field6448[var32], var2.field6474[var32], var2.field6450[var32], var101, var102, var103, var105, var41, var106, var40, field9341);
                     var88 = field9341[0];
                     var89 = field9341[1];
                     this.method5991(var2.field6448[var33], var2.field6474[var33], var2.field6450[var33], var101, var102, var103, var105, var41, var106, var40, field9341);
                     var90 = field9341[0];
                     var91 = field9341[1];
                     this.method5991(var2.field6448[var34], var2.field6474[var34], var2.field6450[var34], var101, var102, var103, var105, var41, var106, var40, field9341);
                     var93 = field9341[0];
                     var94 = field9341[1];
                     var42 = var41 / 2.0F;
                     if ((var106 & 1) == 0) {
                        if (var90 - var88 > var42) {
                           var90 -= var41;
                           var95 = 1;
                        } else if (var88 - var90 > var42) {
                           var90 += var41;
                           var95 = 2;
                        }

                        if (var93 - var88 > var42) {
                           var93 -= var41;
                           var96 = 1;
                        } else if (var88 - var93 > var42) {
                           var93 += var41;
                           var96 = 2;
                        }
                     } else {
                        if (var91 - var89 > var42) {
                           var91 -= var41;
                           var95 = 1;
                        } else if (var89 - var91 > var42) {
                           var91 += var41;
                           var95 = 2;
                        }

                        if (var94 - var89 > var42) {
                           var94 -= var41;
                           var96 = 1;
                        } else if (var89 - var94 > var42) {
                           var94 += var41;
                           var96 = 2;
                        }
                     }
                  } else if (var99 == 2) {
                     var41 = (float)var2.field6475[var19] / 256.0F;
                     var42 = (float)var2.field6480[var19] / 256.0F;
                     int var107 = var2.field6448[var33] - var2.field6448[var32];
                     int var108 = var2.field6474[var33] - var2.field6474[var32];
                     int var109 = var2.field6450[var33] - var2.field6450[var32];
                     int var110 = var2.field6448[var34] - var2.field6448[var32];
                     int var111 = var2.field6474[var34] - var2.field6474[var32];
                     int var112 = var2.field6450[var34] - var2.field6450[var32];
                     int var113 = var108 * var112 - var111 * var109;
                     int var114 = var109 * var110 - var112 * var107;
                     int var115 = var107 * var111 - var110 * var108;
                     var52 = 64.0F / (float)var2.field6471[var19];
                     var53 = 64.0F / (float)var2.field6472[var19];
                     var54 = 64.0F / (float)var2.field6473[var19];
                     var55 = ((float)var113 * var105[0] + (float)var114 * var105[1] + (float)var115 * var105[2]) / var52;
                     var56 = ((float)var113 * var105[3] + (float)var114 * var105[4] + (float)var115 * var105[5]) / var53;
                     var57 = ((float)var113 * var105[6] + (float)var114 * var105[7] + (float)var115 * var105[8]) / var54;
                     var97 = this.method5942(var55, var56, var57);
                     this.method5943(var2.field6448[var32], var2.field6474[var32], var2.field6450[var32], var101, var102, var103, var97, var105, var106, var40, var41, var42, field9341);
                     var88 = field9341[0];
                     var89 = field9341[1];
                     this.method5943(var2.field6448[var33], var2.field6474[var33], var2.field6450[var33], var101, var102, var103, var97, var105, var106, var40, var41, var42, field9341);
                     var90 = field9341[0];
                     var91 = field9341[1];
                     this.method5943(var2.field6448[var34], var2.field6474[var34], var2.field6450[var34], var101, var102, var103, var97, var105, var106, var40, var41, var42, field9341);
                     var93 = field9341[0];
                     var94 = field9341[1];
                  } else if (var99 == 3) {
                     this.method6087(var2.field6448[var32], var2.field6474[var32], var2.field6450[var32], var101, var102, var103, var105, var106, var40, field9341);
                     var88 = field9341[0];
                     var89 = field9341[1];
                     this.method6087(var2.field6448[var33], var2.field6474[var33], var2.field6450[var33], var101, var102, var103, var105, var106, var40, field9341);
                     var90 = field9341[0];
                     var91 = field9341[1];
                     this.method6087(var2.field6448[var34], var2.field6474[var34], var2.field6450[var34], var101, var102, var103, var105, var106, var40, field9341);
                     var93 = field9341[0];
                     var94 = field9341[1];
                     if ((var106 & 1) == 0) {
                        if (var90 - var88 > 0.5F) {
                           --var90;
                           var95 = 1;
                        } else if (var88 - var90 > 0.5F) {
                           ++var90;
                           var95 = 2;
                        }

                        if (var93 - var88 > 0.5F) {
                           --var93;
                           var96 = 1;
                        } else if (var88 - var93 > 0.5F) {
                           ++var93;
                           var96 = 2;
                        }
                     } else {
                        if (var91 - var89 > 0.5F) {
                           --var91;
                           var95 = 1;
                        } else if (var89 - var91 > 0.5F) {
                           ++var91;
                           var95 = 2;
                        }

                        if (var94 - var89 > 0.5F) {
                           --var94;
                           var96 = 1;
                        } else if (var89 - var94 > 0.5F) {
                           ++var94;
                           var96 = 2;
                        }
                     }
                  }
               }
            }
         }

         if (var2.field6457 == null) {
            var99 = 0;
         } else {
            var99 = var2.field6457[var78];
         }

         if (var99 == 0) {
            long var63 = (long)(var19 << 2) + ((long)(var97 << 24) + (long)(var84 << 8) + (long)var83 << 32);
            var34 = var2.field6476[var78];
            var35 = var2.field6478[var78];
            var36 = var2.field6456[var78];
            class658 var104 = var69[var34];
            this.field9299[var74] = this.method5578(var2, var34, var74, var63, var104.field9540, var104.field9539, var104.field9538, var104.field9541, var88, var89);
            var104 = var69[var35];
            this.field9300[var74] = this.method5578(var2, var35, var74, var63 + (long)var95, var104.field9540, var104.field9539, var104.field9538, var104.field9541, var90, var91);
            var104 = var69[var36];
            this.field9301[var74] = this.method5578(var2, var36, var74, var63 + (long)var96, var104.field9540, var104.field9539, var104.field9538, var104.field9541, var93, var94);
         } else if (var99 == 1) {
            class781 var100 = var76[var78];
            long var65 = (long)((var19 << 2) + (var100.field3932 > 0 ? 1024 : 2048) + (var100.field3933 + 256 << 12) + (var100.field3931 + 256 << 22)) + ((long)(var97 << 24) + (long)(var84 << 8) + (long)var83 << 32);
            this.field9299[var74] = this.method5578(var2, var2.field6476[var78], var74, var65, var100.field3932, var100.field3933, var100.field3931, 0, var88, var89);
            this.field9300[var74] = this.method5578(var2, var2.field6478[var78], var74, var65 + (long)var95, var100.field3932, var100.field3933, var100.field3931, 0, var90, var91);
            this.field9301[var74] = this.method5578(var2, var2.field6456[var78], var74, var65 + (long)var96, var100.field3932, var100.field3933, var100.field3931, 0, var93, var94);
         }

         if (var2.field6459 != null) {
            this.field9342[var74] = var2.field6459[var78];
         }

         if (var2.field6447 != null) {
            this.field9304[var74] = var2.field6447[var78];
         }

         this.field9314[var74] = var2.field6461[var78];
         this.field9302[var74] = var86;
      }

      if (this.field9296 > 0) {
         var74 = 1;
         var77 = this.field9302[0];

         for(var84 = 0; var84 < this.field9296; ++var84) {
            var81 = this.field9302[var84];
            if (var81 != var77) {
               ++var74;
               var77 = var81;
            }
         }

         this.field9324 = new int[var74];
         this.field9292 = new int[var74];
         this.field9323 = new int[var74 + 1];
         this.field9323[0] = 0;
         var84 = this.field9285;
         var81 = 0;
         var74 = 0;
         var77 = this.field9302[0];

         for(var83 = 0; var83 < this.field9296; ++var83) {
            var86 = this.field9302[var83];
            if (var86 != var77) {
               this.field9324[var74] = var84;
               this.field9292[var74] = var81 - var84 + 1;
               ++var74;
               this.field9323[var74] = var83;
               var84 = this.field9285;
               var81 = 0;
               var77 = var86;
            }

            short var92 = this.field9299[var83];
            if (var92 < var84) {
               var84 = var92;
            }

            if (var92 > var81) {
               var81 = var92;
            }

            var92 = this.field9300[var83];
            if (var92 < var84) {
               var84 = var92;
            }

            if (var92 > var81) {
               var81 = var92;
            }

            var92 = this.field9301[var83];
            if (var92 < var84) {
               var84 = var92;
            }

            if (var92 > var81) {
               var81 = var92;
            }
         }

         this.field9324[var74] = var84;
         this.field9292[var74] = var81 - var84 + 1;
         ++var74;
         this.field9323[var74] = this.field9296;
      }

      field9334 = null;
      this.field9286 = method5564(this.field9286, this.field9285);
      this.field9287 = method5564(this.field9287, this.field9285);
      this.field9288 = method5564(this.field9288, this.field9285);
      this.field9289 = method5564(this.field9289, this.field9285);
      this.field9298 = method5564(this.field9298, this.field9285);
      this.field9337 = method5563(this.field9337, this.field9285);
      this.field9332 = method5577(this.field9332, this.field9285);
      this.field9293 = method5577(this.field9293, this.field9285);
      if (var2.field6451 != null && class586.method320(var3, this.field9275)) {
         this.field9297 = var2.method3452(false);
      }

      if (var2.field6481 != null && class586.method321(var3, this.field9275)) {
         this.field9325 = var2.method3462();
      }

      if (var2.field6463 != null && class586.method319(var3, this.field9275)) {
         var74 = 0;
         int[] var82 = new int[256];

         for(var84 = 0; var84 < this.field9295; ++var84) {
            var19 = var2.field6463[var8[var84]];
            if (var19 >= 0) {
               ++var82[var19];
               if (var19 > var74) {
                  var74 = var19;
               }
            }
         }

         this.field9303 = new int[var74 + 1][];

         for(var84 = 0; var84 <= var74; ++var84) {
            this.field9303[var84] = new int[var82[var84]];
            var82[var84] = 0;
         }

         for(var84 = 0; var84 < this.field9295; ++var84) {
            var19 = var2.field6463[var8[var84]];
            if (var19 >= 0) {
               this.field9303[var19][var82[var19]++] = var84;
            }
         }
      }

   }

   public class770 method6102(class770 var1) {
      if (this.field9285 == 0) {
         return null;
      } else {
         if (!this.field9329) {
            this.method5562();
         }

         int var2;
         int var3;
         if (this.field9273.field743 > 0) {
            var2 = this.field9319 - (this.field9318 * this.field9273.field743 >> 8) >> this.field9273.field757;
            var3 = this.field9320 - (this.field9317 * this.field9273.field743 >> 8) >> this.field9273.field757;
         } else {
            var2 = this.field9319 - (this.field9317 * this.field9273.field743 >> 8) >> this.field9273.field757;
            var3 = this.field9320 - (this.field9318 * this.field9273.field743 >> 8) >> this.field9273.field757;
         }

         int var4;
         int var5;
         if (this.field9273.field761 > 0) {
            var4 = this.field9321 - (this.field9318 * this.field9273.field761 >> 8) >> this.field9273.field757;
            var5 = this.field9322 - (this.field9317 * this.field9273.field761 >> 8) >> this.field9273.field757;
         } else {
            var4 = this.field9321 - (this.field9317 * this.field9273.field761 >> 8) >> this.field9273.field757;
            var5 = this.field9322 - (this.field9318 * this.field9273.field761 >> 8) >> this.field9273.field757;
         }

         int var6 = var3 - var2 + 1;
         int var7 = var5 - var4 + 1;
         class306 var8 = (class306)var1;
         class306 var9;
         if (var8 != null && var8.method369(var6, var7)) {
            var9 = var8;
            var8.method367();
         } else {
            var9 = new class306(this.field9273, var6, var7);
         }

         var9.method366(var2, var4, var3, var5);
         this.method5572(var9);
         return var9;
      }
   }

   public int method5972() {
      if (!this.field9329) {
         this.method5562();
      }

      return this.field9315;
   }

   public void method5984(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.field9295; ++var3) {
         if (this.field9314[var3] == var1) {
            this.field9314[var3] = var2;
         }
      }

      if (this.field9331 != null) {
         for(var3 = 0; var3 < this.field9330; ++var3) {
            class300 var4 = this.field9331[var3];
            class664 var5 = this.field9271[var3];
            var5.field9607 = var5.field9607 & -16777216 | class134.field1398[this.field9314[var4.field3937] & '\uffff'] & 16777215;
         }
      }

      this.method5568();
   }

   void method5958() {
   }

   void method5580() {
      if (this.field9306 != null) {
         this.field9306.method2665();
      }

      if (this.field9309 != null) {
         this.field9309.method2665();
      }

      if (this.field9290 != null) {
         this.field9290.method2665();
      }

      if (this.field9313 != null) {
         this.field9313.method2665();
      }

      if (this.field9305 != null) {
         this.field9305.method2400();
      }

   }

   public void method5980(int var1) {
      this.field9276 = (short)var1;
      this.method5568();
   }

   public int method5977() {
      if (!this.field9329) {
         this.method5562();
      }

      return this.field9318;
   }

   void method5581() {
      if (this.field9306 != null) {
         this.field9306.field4208 = false;
      }

   }

   public void method5954() {
      int var1;
      for(var1 = 0; var1 < this.field9279; ++var1) {
         this.field9344[var1] = -this.field9344[var1];
      }

      for(var1 = 0; var1 < this.field9285; ++var1) {
         this.field9298[var1] = (short)(-this.field9298[var1]);
      }

      for(var1 = 0; var1 < this.field9295; ++var1) {
         short var2 = this.field9299[var1];
         this.field9299[var1] = this.field9301[var1];
         this.field9301[var1] = var2;
      }

      this.method5581();
      this.method5569();
      this.method5570();
      this.field9329 = false;
   }
}
