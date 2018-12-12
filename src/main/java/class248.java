import jaclib.memory.Stream;
import jaggl.OpenGL;

public class class248 extends class879 {
   static boolean field8426;
   static int field8427 = 7;
   static int field8428 = 1;
   class387 field8429;
   static int field8430 = 4;
   static int field8431 = 8;
   static int field8432 = 16;
   class13 field8433;
   class933[] field8434;
   int field8435;
   byte field8436;
   short field8437;
   short[] field8438;
   short[] field8439;
   class847 field8440;
   int field8441 = 0;
   int field8442 = 0;
   int[] field8443;
   int[] field8444;
   int[] field8445;
   int[][] field8446;
   short[] field8447;
   int field8448 = 0;
   boolean field8449 = false;
   short[] field8450;
   short[] field8451;
   boolean field8452 = false;
   class369 field8453;
   float[] field8454;
   float[] field8455;
   int field8456 = 0;
   static int[] field8457 = new int[8];
   short[] field8458;
   byte[] field8459;
   short[] field8460;
   short[] field8461;
   short[] field8462;
   int[] field8463;
   int[][] field8464;
   short[] field8465;
   class396[] field8466;
   class847 field8467;
   int[] field8468;
   class847 field8469;
   short[] field8470;
   boolean field8471 = false;
   int field8472;
   boolean field8473 = true;
   int field8474;
   static int field8475;
   static int[] field8476 = new int[8];
   short field8477;
   short field8478;
   short field8479;
   short field8480;
   short field8481;
   class269 field8482;
   short field8483;
   class96[] field8484;
   short field8485;
   int field8486;
   static int field8487 = 2;
   class372 field8488;
   class612[] field8489;
   static int field8490 = 4;
   int[][] field8491;
   static long[] field8492;
   static float[] field8493 = new float[2];
   int field8494 = 0;
   static int[] field8495 = new int[8];
   byte[] field8496;
   static int field8497;
   class847 field8498;
   static int field8499;
   int field8500;

   public void method5961(int var1, int var2, class454 var3, class454 var4, int var5, int var6, int var7) {
      if (!this.field8452) {
         this.method4755();
      }

      int var8 = var5 + this.field8479;
      int var9 = var5 + this.field8480;
      int var10 = var7 + this.field8481;
      int var11 = var7 + this.field8485;
      if (var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5 || var8 >= 0 && var9 + var3.field7227 >> var3.field7228 < var3.field7226 && var10 >= 0 && var11 + var3.field7227 >> var3.field7228 < var3.field7225) {
         if (var1 != 4 && var1 != 5) {
            var8 >>= var3.field7228;
            var9 = var9 + (var3.field7227 - 1) >> var3.field7228;
            var10 >>= var3.field7228;
            var11 = var11 + (var3.field7227 - 1) >> var3.field7228;
            if (var3.method3888(var8, var10, (byte)-6) == var6 && var3.method3888(var9, var10, (byte)-91) == var6 && var3.method3888(var8, var11, (byte)-30) == var6 && var3.method3888(var9, var11, (byte)-65) == var6) {
               return;
            }
         } else if (var4 == null || var8 < 0 || var9 + var4.field7227 >> var4.field7228 >= var4.field7226 || var10 < 0 || var11 + var4.field7227 >> var4.field7228 >= var4.field7225) {
            return;
         }

         int var12;
         if (var1 == 1) {
            for(var12 = 0; var12 < this.field8442; ++var12) {
               this.field8444[var12] = this.field8444[var12] + var3.method3887(this.field8443[var12] + var5, this.field8445[var12] + var7, -1779061199) - var6;
            }
         } else {
            int var13;
            int var14;
            if (var1 == 2) {
               short var19 = this.field8477;
               if (var19 == 0) {
                  return;
               }

               for(var13 = 0; var13 < this.field8442; ++var13) {
                  var14 = (this.field8444[var13] << 16) / var19;
                  if (var14 < var2) {
                     this.field8444[var13] += (var3.method3887(this.field8443[var13] + var5, this.field8445[var13] + var7, -1741700419) - var6) * (var2 - var14) / var2;
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
                  var12 = this.field8483 - this.field8477;

                  for(var13 = 0; var13 < this.field8442; ++var13) {
                     this.field8444[var13] = this.field8444[var13] + (var4.method3887(this.field8443[var13] + var5, this.field8445[var13] + var7, -1374072813) - var6) + var12;
                  }
               } else if (var1 == 5) {
                  var12 = this.field8483 - this.field8477;

                  for(var13 = 0; var13 < this.field8442; ++var13) {
                     var14 = this.field8443[var13] + var5;
                     var15 = this.field8445[var13] + var7;
                     int var16 = var3.method3887(var14, var15, -1873469750);
                     int var17 = var4.method3887(var14, var15, -1430938498);
                     int var18 = var16 - var17 - var2;
                     this.field8444[var13] = ((this.field8444[var13] << 8) / var12 * var18 >> 8) - (var6 - var16);
                  }
               }
            }
         }

         if (this.field8440 != null) {
            this.field8440.field8710 = null;
         }

         this.field8452 = false;
      }

   }

   public int method5978() {
      if (!this.field8452) {
         this.method4755();
      }

      return this.field8481;
   }

   static byte[] method4741(byte[] var0, int var1) {
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   static float[] method4742(float[] var0, int var1) {
      float[] var2 = new float[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   public int method5948() {
      return this.field8472;
   }

   public void method5947(int var1) {
      this.field8472 = var1;
      if (this.field8453 != null && (this.field8472 & 65536) == 0) {
         this.field8438 = this.field8453.field2369;
         this.field8450 = this.field8453.field2368;
         this.field8451 = this.field8453.field2367;
         this.field8496 = this.field8453.field2370;
         this.field8453 = null;
      }

      this.field8473 = true;
      this.method4744();
   }

   class879 method4743(class248 var1, class248 var2, int var3, boolean var4, boolean var5) {
      var1.field8436 = 0;
      var1.field8472 = var3;
      var1.field8435 = this.field8435;
      var1.field8437 = this.field8437;
      var1.field8478 = this.field8478;
      var1.field8441 = this.field8441;
      var1.field8442 = this.field8442;
      var1.field8448 = this.field8448;
      var1.field8456 = this.field8456;
      var1.field8494 = this.field8494;
      var1.field8486 = this.field8486;
      if ((var3 & 256) != 0) {
         var1.field8449 = true;
      } else {
         var1.field8449 = this.field8449;
      }

      var1.field8471 = this.field8471;
      boolean var6 = class857.method5226(var3, this.field8435);
      boolean var7 = class857.method5227(var3, this.field8435);
      boolean var8 = class857.method5228(var3, this.field8435);
      boolean var9 = var6 | var7 | var8;
      int var10;
      if (var9) {
         if (var6) {
            if (var2.field8443 != null && var2.field8443.length >= this.field8441) {
               var1.field8443 = var2.field8443;
            } else {
               var1.field8443 = var2.field8443 = new int[this.field8441];
            }
         } else {
            var1.field8443 = this.field8443;
         }

         if (var7) {
            if (var2.field8444 != null && var2.field8444.length >= this.field8441) {
               var1.field8444 = var2.field8444;
            } else {
               var1.field8444 = var2.field8444 = new int[this.field8441];
            }
         } else {
            var1.field8444 = this.field8444;
         }

         if (var8) {
            if (var2.field8445 != null && var2.field8445.length >= this.field8441) {
               var1.field8445 = var2.field8445;
            } else {
               var1.field8445 = var2.field8445 = new int[this.field8441];
            }
         } else {
            var1.field8445 = this.field8445;
         }

         for(var10 = 0; var10 < this.field8441; ++var10) {
            if (var6) {
               var1.field8443[var10] = this.field8443[var10];
            }

            if (var7) {
               var1.field8444[var10] = this.field8444[var10];
            }

            if (var8) {
               var1.field8445[var10] = this.field8445[var10];
            }
         }
      } else {
         var1.field8443 = this.field8443;
         var1.field8444 = this.field8444;
         var1.field8445 = this.field8445;
      }

      if (class857.method5240(var3, this.field8435)) {
         if (var4) {
            var1.field8436 = (byte)(var1.field8436 | 1);
         }

         var1.field8440 = var2.field8440;
         var1.field8440.field8711 = this.field8440.field8711;
         var1.field8440.field8710 = this.field8440.field8710;
      } else if (class857.method5254(var3, this.field8435)) {
         var1.field8440 = this.field8440;
      } else {
         var1.field8440 = null;
      }

      if (class857.method5231(var3, this.field8435)) {
         if (var2.field8458 != null && var2.field8458.length >= this.field8456) {
            var1.field8458 = var2.field8458;
         } else {
            var1.field8458 = var2.field8458 = new short[this.field8456];
         }

         for(var10 = 0; var10 < this.field8456; ++var10) {
            var1.field8458[var10] = this.field8458[var10];
         }
      } else {
         var1.field8458 = this.field8458;
      }

      if (class857.method5250(var3, this.field8435)) {
         if (var2.field8459 != null && var2.field8459.length >= this.field8456) {
            var1.field8459 = var2.field8459;
         } else {
            var1.field8459 = var2.field8459 = new byte[this.field8456];
         }

         for(var10 = 0; var10 < this.field8456; ++var10) {
            var1.field8459[var10] = this.field8459[var10];
         }
      } else {
         var1.field8459 = this.field8459;
      }

      if (class857.method5253(var3, this.field8435)) {
         if (var4) {
            var1.field8436 = (byte)(var1.field8436 | 2);
         }

         var1.field8467 = var2.field8467;
         var1.field8467.field8711 = this.field8467.field8711;
         var1.field8467.field8710 = this.field8467.field8710;
      } else if (class857.method5241(var3, this.field8435)) {
         var1.field8467 = this.field8467;
      } else {
         var1.field8467 = null;
      }

      int var11;
      if (class857.method5257(var3, this.field8435)) {
         if (var2.field8438 != null && var2.field8438.length >= this.field8448) {
            var1.field8438 = var2.field8438;
            var1.field8450 = var2.field8450;
            var1.field8451 = var2.field8451;
         } else {
            var10 = this.field8448;
            var1.field8438 = var2.field8438 = new short[var10];
            var1.field8450 = var2.field8450 = new short[var10];
            var1.field8451 = var2.field8451 = new short[var10];
         }

         if (this.field8453 != null) {
            if (var2.field8453 == null) {
               var2.field8453 = new class369();
            }

            class369 var12 = var1.field8453 = var2.field8453;
            if (var12.field2369 == null || var12.field2369.length < this.field8448) {
               var11 = this.field8448;
               var12.field2369 = new short[var11];
               var12.field2368 = new short[var11];
               var12.field2367 = new short[var11];
               var12.field2370 = new byte[var11];
            }

            for(var11 = 0; var11 < this.field8448; ++var11) {
               var1.field8438[var11] = this.field8438[var11];
               var1.field8450[var11] = this.field8450[var11];
               var1.field8451[var11] = this.field8451[var11];
               var12.field2369[var11] = this.field8453.field2369[var11];
               var12.field2368[var11] = this.field8453.field2368[var11];
               var12.field2367[var11] = this.field8453.field2367[var11];
               var12.field2370[var11] = this.field8453.field2370[var11];
            }
         } else {
            for(var10 = 0; var10 < this.field8448; ++var10) {
               var1.field8438[var10] = this.field8438[var10];
               var1.field8450[var10] = this.field8450[var10];
               var1.field8451[var10] = this.field8451[var10];
            }
         }

         var1.field8496 = this.field8496;
      } else {
         var1.field8453 = this.field8453;
         var1.field8438 = this.field8438;
         var1.field8450 = this.field8450;
         var1.field8451 = this.field8451;
         var1.field8496 = this.field8496;
      }

      if (class857.method5247(var3, this.field8435)) {
         if (var4) {
            var1.field8436 = (byte)(var1.field8436 | 4);
         }

         var1.field8498 = var2.field8498;
         var1.field8498.field8711 = this.field8498.field8711;
         var1.field8498.field8710 = this.field8498.field8710;
      } else if (class857.method5258(var3, this.field8435)) {
         var1.field8498 = this.field8498;
      } else {
         var1.field8498 = null;
      }

      if (class857.method5233(var3, this.field8435)) {
         if (var2.field8454 != null && var2.field8454.length >= this.field8456) {
            var1.field8454 = var2.field8454;
            var1.field8455 = var2.field8455;
         } else {
            var10 = this.field8448;
            var1.field8454 = var2.field8454 = new float[var10];
            var1.field8455 = var2.field8455 = new float[var10];
         }

         for(var10 = 0; var10 < this.field8448; ++var10) {
            var1.field8454[var10] = this.field8454[var10];
            var1.field8455[var10] = this.field8455[var10];
         }
      } else {
         var1.field8454 = this.field8454;
         var1.field8455 = this.field8455;
      }

      if (class857.method5259(var3, this.field8435)) {
         if (var4) {
            var1.field8436 = (byte)(var1.field8436 | 8);
         }

         var1.field8469 = var2.field8469;
         var1.field8469.field8711 = this.field8469.field8711;
         var1.field8469.field8710 = this.field8469.field8710;
      } else if (class857.method5238(var3, this.field8435)) {
         var1.field8469 = this.field8469;
      } else {
         var1.field8469 = null;
      }

      if (class857.method5251(var3, this.field8435)) {
         if (var2.field8460 != null && var2.field8460.length >= this.field8456) {
            var1.field8460 = var2.field8460;
            var1.field8461 = var2.field8461;
            var1.field8462 = var2.field8462;
         } else {
            var10 = this.field8456;
            var1.field8460 = var2.field8460 = new short[var10];
            var1.field8461 = var2.field8461 = new short[var10];
            var1.field8462 = var2.field8462 = new short[var10];
         }

         for(var10 = 0; var10 < this.field8456; ++var10) {
            var1.field8460[var10] = this.field8460[var10];
            var1.field8461[var10] = this.field8461[var10];
            var1.field8462[var10] = this.field8462[var10];
         }
      } else {
         var1.field8460 = this.field8460;
         var1.field8461 = this.field8461;
         var1.field8462 = this.field8462;
      }

      if (class857.method5230(var3, this.field8435)) {
         if (var4) {
            var1.field8436 = (byte)(var1.field8436 | 16);
         }

         var1.field8488 = var2.field8488;
         var1.field8488.field1119 = this.field8488.field1119;
      } else if (class857.method5239(var3, this.field8435)) {
         var1.field8488 = this.field8488;
      } else {
         var1.field8488 = null;
      }

      if (class857.method5234(var3, this.field8435)) {
         if (var2.field8470 != null && var2.field8470.length >= this.field8456) {
            var1.field8470 = var2.field8470;
         } else {
            var10 = this.field8456;
            var1.field8470 = var2.field8470 = new short[var10];
         }

         for(var10 = 0; var10 < this.field8456; ++var10) {
            var1.field8470[var10] = this.field8470[var10];
         }
      } else {
         var1.field8470 = this.field8470;
      }

      if (class857.method5235(var3, this.field8435)) {
         if (var2.field8484 != null && var2.field8484.length >= this.field8486) {
            var1.field8484 = var2.field8484;

            for(var10 = 0; var10 < this.field8486; ++var10) {
               var1.field8484[var10].method521(this.field8484[var10]);
            }
         } else {
            var10 = this.field8486;
            var1.field8484 = var2.field8484 = new class96[var10];

            for(var11 = 0; var11 < this.field8486; ++var11) {
               var1.field8484[var11] = this.field8484[var11].method522();
            }
         }
      } else {
         var1.field8484 = this.field8484;
      }

      var1.field8489 = this.field8489;
      if (this.field8452) {
         var1.field8474 = this.field8474;
         var1.field8500 = this.field8500;
         var1.field8479 = this.field8479;
         var1.field8480 = this.field8480;
         var1.field8477 = this.field8477;
         var1.field8483 = this.field8483;
         var1.field8481 = this.field8481;
         var1.field8485 = this.field8485;
         var1.field8452 = true;
      } else {
         var1.field8452 = false;
      }

      var1.field8446 = this.field8446;
      var1.field8464 = this.field8464;
      var1.field8491 = this.field8491;
      var1.field8439 = this.field8439;
      var1.field8463 = this.field8463;
      var1.field8447 = this.field8447;
      var1.field8465 = this.field8465;
      var1.field8468 = this.field8468;
      var1.field8434 = this.field8434;
      var1.field8466 = this.field8466;
      return var1;
   }

   void method4744() {
      if (this.field8473) {
         this.field8473 = false;
         if (this.field8434 == null && this.field8466 == null && this.field8489 == null && !class857.method5229(this.field8472, this.field8435)) {
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if (this.field8443 != null && !class857.method5252(this.field8472, this.field8435)) {
               if (this.field8440 != null && this.field8440.field8710 == null) {
                  this.field8473 = true;
               } else {
                  if (!this.field8452) {
                     this.method4755();
                  }

                  var1 = true;
               }
            }

            if (this.field8444 != null && !class857.method5243(this.field8472, this.field8435)) {
               if (this.field8440 != null && this.field8440.field8710 == null) {
                  this.field8473 = true;
               } else {
                  if (!this.field8452) {
                     this.method4755();
                  }

                  var2 = true;
               }
            }

            if (this.field8445 != null && !class857.method5256(this.field8472, this.field8435)) {
               if (this.field8440 != null && this.field8440.field8710 == null) {
                  this.field8473 = true;
               } else {
                  if (!this.field8452) {
                     this.method4755();
                  }

                  var3 = true;
               }
            }

            if (var1) {
               this.field8443 = null;
            }

            if (var2) {
               this.field8444 = null;
            }

            if (var3) {
               this.field8445 = null;
            }
         }

         if (this.field8439 != null && this.field8443 == null && this.field8444 == null && this.field8445 == null) {
            this.field8439 = null;
            this.field8463 = null;
         }

         if (this.field8496 != null && !class857.method5244(this.field8472, this.field8435)) {
            if (this.field8498 != null) {
               if (this.field8498.field8710 != null) {
                  this.field8451 = null;
                  this.field8450 = null;
                  this.field8438 = null;
                  this.field8496 = null;
               } else {
                  this.field8473 = true;
               }
            } else if (this.field8467 != null && this.field8467.field8710 == null) {
               this.field8473 = true;
            } else {
               this.field8451 = null;
               this.field8450 = null;
               this.field8438 = null;
               this.field8496 = null;
            }
         }

         if (this.field8458 != null && !class857.method5255(this.field8472, this.field8435)) {
            if (this.field8467 != null && this.field8467.field8710 == null) {
               this.field8473 = true;
            } else {
               this.field8458 = null;
            }
         }

         if (this.field8459 != null && !class857.method5236(this.field8472, this.field8435)) {
            if (this.field8467 != null && this.field8467.field8710 == null) {
               this.field8473 = true;
            } else {
               this.field8459 = null;
            }
         }

         if (this.field8454 != null && !class857.method5245(this.field8472, this.field8435)) {
            if (this.field8469 != null && this.field8469.field8710 == null) {
               this.field8473 = true;
            } else {
               this.field8455 = null;
               this.field8454 = null;
            }
         }

         if (this.field8470 != null && !class857.method5249(this.field8472, this.field8435)) {
            if (this.field8467 != null && this.field8467.field8710 == null) {
               this.field8473 = true;
            } else {
               this.field8470 = null;
            }
         }

         if (this.field8460 != null && !class857.method5232(this.field8472, this.field8435)) {
            if (this.field8488 != null && this.field8488.field1119 == null || this.field8467 != null && this.field8467.field8710 == null) {
               this.field8473 = true;
            } else {
               this.field8462 = null;
               this.field8461 = null;
               this.field8460 = null;
            }
         }

         if (this.field8464 != null && !class857.method5246(this.field8472, this.field8435)) {
            this.field8464 = null;
            this.field8465 = null;
         }

         if (this.field8446 != null && !class857.method5242(this.field8472, this.field8435)) {
            this.field8446 = null;
            this.field8447 = null;
         }

         if (this.field8491 != null && !class857.method5248(this.field8472, this.field8435)) {
            this.field8491 = null;
         }

         if (this.field8468 != null && (this.field8472 & 2048) == 0 && (this.field8472 & 262144) == 0) {
            this.field8468 = null;
         }
      }

   }

   public byte[] method5983() {
      return this.field8459;
   }

   public void method5951(int var1) {
      int var2 = class703.field3413[var1];
      int var3 = class703.field3404[var1];

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field8442; ++var4) {
         var5 = this.field8445[var4] * var2 + this.field8443[var4] * var3 >> 14;
         this.field8445[var4] = this.field8445[var4] * var3 - this.field8443[var4] * var2 >> 14;
         this.field8443[var4] = var5;
      }

      for(var4 = 0; var4 < this.field8448; ++var4) {
         var5 = this.field8451[var4] * var2 + this.field8438[var4] * var3 >> 14;
         this.field8451[var4] = (short)(this.field8451[var4] * var3 - this.field8438[var4] * var2 >> 14);
         this.field8438[var4] = (short)var5;
      }

      if (this.field8498 == null && this.field8467 != null) {
         this.field8467.field8710 = null;
      }

      if (this.field8498 != null) {
         this.field8498.field8710 = null;
      }

      if (this.field8440 != null) {
         this.field8440.field8710 = null;
      }

      this.field8452 = false;
   }

   public void method5965(class135 var1, class211 var2, int var3) {
      if ((var3 & 2) != 0) {
         OpenGL.glPolygonMode(1032, 6913);
      }

      if (this.field8448 != 0) {
         class344 var4 = this.field8433.field6728;
         class344 var5 = this.field8433.field6791;
         class344 var6 = this.field8433.field6871;
         var5.method272(var1);
         var6.method269(var5);
         var6.method271(this.field8433.field6756);
         if (!this.field8452) {
            this.method4755();
         }

         float[] var7 = this.field8433.field6781;
         var5.method276(0.0F, (float)this.field8477, 0.0F, var7);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         var5.method276(0.0F, (float)this.field8483, 0.0F, var7);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = this.field8433.field6764[var14];
            float var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float)this.field8500;
            float var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float)this.field8500;
            if (var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if (var2 != null) {
            boolean var33 = false;
            boolean var34 = true;
            int var35 = this.field8479 + this.field8480 >> 1;
            int var36 = this.field8481 + this.field8485 >> 1;
            short var19 = this.field8477;
            float var21 = var6.field325[0] * (float)var35 + var6.field325[4] * (float)var19 + var6.field325[8] * (float)var36 + var6.field325[12];
            float var22 = var6.field325[1] * (float)var35 + var6.field325[5] * (float)var19 + var6.field325[9] * (float)var36 + var6.field325[13];
            float var23 = var6.field325[2] * (float)var35 + var6.field325[6] * (float)var19 + var6.field325[10] * (float)var36 + var6.field325[14];
            float var24 = var6.field325[3] * (float)var35 + var6.field325[7] * (float)var19 + var6.field325[11] * (float)var36 + var6.field325[15];
            if (var23 >= -var24) {
               var2.field7246 = (int)(this.field8433.field6782 + this.field8433.field6783 * var21 / var24);
               var2.field7247 = (int)(this.field8433.field6784 + this.field8433.field6785 * var22 / var24);
            } else {
               var33 = true;
            }

            var19 = this.field8483;
            float var25 = var6.field325[0] * (float)var35 + var6.field325[4] * (float)var19 + var6.field325[8] * (float)var36 + var6.field325[12];
            float var26 = var6.field325[1] * (float)var35 + var6.field325[5] * (float)var19 + var6.field325[9] * (float)var36 + var6.field325[13];
            float var27 = var6.field325[2] * (float)var35 + var6.field325[6] * (float)var19 + var6.field325[10] * (float)var36 + var6.field325[14];
            float var28 = var6.field325[3] * (float)var35 + var6.field325[7] * (float)var19 + var6.field325[11] * (float)var36 + var6.field325[15];
            if (var27 >= -var28) {
               var2.field7248 = (int)(this.field8433.field6782 + this.field8433.field6783 * var25 / var28);
               var2.field7245 = (int)(this.field8433.field6784 + this.field8433.field6785 * var26 / var28);
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
                     var2.field7246 = (int)(this.field8433.field6782 + this.field8433.field6783 * var30 / var32);
                     var2.field7247 = (int)(this.field8433.field6784 + this.field8433.field6785 * var31 / var32);
                  } else if (var27 < -var28) {
                     var29 = (var27 + var28) / (var23 + var24) - 1.0F;
                     var30 = var25 + var29 * (var21 - var25);
                     var31 = var26 + var29 * (var22 - var26);
                     var32 = var28 + var29 * (var24 - var28);
                     var2.field7248 = (int)(this.field8433.field6782 + this.field8433.field6783 * var30 / var32);
                     var2.field7245 = (int)(this.field8433.field6784 + this.field8433.field6785 * var31 / var32);
                  }
               }
            }

            if (var34) {
               if (var23 / var24 > var27 / var28) {
                  var29 = var21 + var4.field325[0] * (float)this.field8500 + var4.field325[12];
                  var30 = var24 + var4.field325[3] * (float)this.field8500 + var4.field325[15];
                  var2.field7250 = (int)(this.field8433.field6782 - (float)var2.field7246 + this.field8433.field6783 * var29 / var30);
               } else {
                  var29 = var25 + var4.field325[0] * (float)this.field8500 + var4.field325[12];
                  var30 = var28 + var4.field325[3] * (float)this.field8500 + var4.field325[15];
                  var2.field7250 = (int)(this.field8433.field6782 - (float)var2.field7248 + this.field8433.field6783 * var29 / var30);
               }

               var2.field7249 = true;
            }
         }

         this.field8433.method3635();
         this.field8433.method3666(var5);
         this.method4747();
         this.field8433.method3670();
         var5.method271(this.field8433.field6797);
         this.method4748(var5);
         if ((var3 & 2) != 0) {
            OpenGL.glPolygonMode(1028, 6914);
         }
      }

   }

   public void method6041(int var1) {
      int var2 = class703.field3413[var1];
      int var3 = class703.field3404[var1];

      for(int var4 = 0; var4 < this.field8442; ++var4) {
         int var5 = this.field8444[var4] * var2 + this.field8443[var4] * var3 >> 14;
         this.field8444[var4] = this.field8444[var4] * var3 - this.field8443[var4] * var2 >> 14;
         this.field8443[var4] = var5;
      }

      if (this.field8440 != null) {
         this.field8440.field8710 = null;
      }

      this.field8452 = false;
   }

   public void method5987(int var1, int var2, int var3, int var4) {
      int var5;
      for(var5 = 0; var5 < this.field8456; ++var5) {
         int var6 = this.field8458[var5] & '\uffff';
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

         this.field8458[var5] = (short)(var7 << 10 | var8 << 7 | var9);
      }

      if (this.field8489 != null) {
         for(var5 = 0; var5 < this.field8486; ++var5) {
            class612 var10 = this.field8489[var5];
            class96 var11 = this.field8484[var5];
            var11.field592 = var11.field592 & -16777216 | class134.field1398[this.field8458[var10.field8735] & '\uffff'] & 16777215;
         }
      }

      if (this.field8467 != null) {
         this.field8467.field8710 = null;
      }

   }

   public int method5972() {
      if (!this.field8452) {
         this.method4755();
      }

      return this.field8500;
   }

   public int method6099() {
      if (!this.field8452) {
         this.method4755();
      }

      return this.field8479;
   }

   public int method6006() {
      if (!this.field8452) {
         this.method4755();
      }

      return this.field8480;
   }

   public int method5976() {
      if (!this.field8452) {
         this.method4755();
      }

      return this.field8477;
   }

   public int method5977() {
      if (!this.field8452) {
         this.method4755();
      }

      return this.field8483;
   }

   public void method5954() {
      int var1;
      for(var1 = 0; var1 < this.field8442; ++var1) {
         this.field8445[var1] = -this.field8445[var1];
      }

      for(var1 = 0; var1 < this.field8448; ++var1) {
         this.field8451[var1] = (short)(-this.field8451[var1]);
      }

      for(var1 = 0; var1 < this.field8456; ++var1) {
         short var2 = this.field8460[var1];
         this.field8460[var1] = this.field8462[var1];
         this.field8462[var1] = var2;
      }

      if (this.field8498 == null && this.field8467 != null) {
         this.field8467.field8710 = null;
      }

      if (this.field8498 != null) {
         this.field8498.field8710 = null;
      }

      if (this.field8440 != null) {
         this.field8440.field8710 = null;
      }

      if (this.field8488 != null) {
         this.field8488.field1119 = null;
      }

      this.field8452 = false;
   }

   public int method5979() {
      if (!this.field8452) {
         this.method4755();
      }

      return this.field8485;
   }

   public void method5994(class879 var1, int var2, int var3, int var4, boolean var5) {
      class248 var6 = (class248)var1;
      if (this.field8456 != 0 && var6.field8456 != 0) {
         int var7 = var6.field8442;
         int[] var8 = var6.field8443;
         int[] var9 = var6.field8444;
         int[] var10 = var6.field8445;
         short[] var11 = var6.field8438;
         short[] var12 = var6.field8450;
         short[] var13 = var6.field8451;
         byte[] var14 = var6.field8496;
         short[] var15;
         short[] var16;
         short[] var17;
         byte[] var18;
         if (this.field8453 != null) {
            var15 = this.field8453.field2369;
            var16 = this.field8453.field2368;
            var17 = this.field8453.field2367;
            var18 = this.field8453.field2370;
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
         if (var6.field8453 != null) {
            var19 = var6.field8453.field2369;
            var20 = var6.field8453.field2368;
            var21 = var6.field8453.field2367;
            var22 = var6.field8453.field2370;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.field8463;
         short[] var24 = var6.field8439;
         if (!var6.field8452) {
            var6.method4755();
         }

         short var25 = var6.field8477;
         short var26 = var6.field8483;
         short var27 = var6.field8479;
         short var28 = var6.field8480;
         short var29 = var6.field8481;
         short var30 = var6.field8485;

         for(int var31 = 0; var31 < this.field8442; ++var31) {
            int var32 = this.field8444[var31] - var3;
            if (var32 >= var25 && var32 <= var26) {
               int var33 = this.field8443[var31] - var2;
               if (var33 >= var27 && var33 <= var28) {
                  int var34 = this.field8445[var31] - var4;
                  if (var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.field8463[var31];
                     int var37 = this.field8463[var31 + 1];

                     int var38;
                     for(var38 = var36; var38 < var37; ++var38) {
                        var35 = this.field8439[var38] - 1;
                        if (var35 == -1 || this.field8496[var35] != 0) {
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
                                    this.field8453 = new class369();
                                    var15 = this.field8453.field2369 = class215.method3834(this.field8438, (byte)-19);
                                    var16 = this.field8453.field2368 = class215.method3834(this.field8450, (byte)-121);
                                    var17 = this.field8453.field2367 = class215.method3834(this.field8451, (byte)-76);
                                    var18 = this.field8453.field2370 = class614.method5193(this.field8496, 1194497584);
                                 }

                                 if (var19 == null) {
                                    class369 var46 = var6.field8453 = new class369();
                                    var19 = var46.field2369 = class215.method3834(var11, (byte)-74);
                                    var20 = var46.field2368 = class215.method3834(var12, (byte)-6);
                                    var21 = var46.field2367 = class215.method3834(var13, (byte)-5);
                                    var22 = var46.field2370 = class614.method5193(var14, 1194497584);
                                 }

                                 short var47 = this.field8438[var35];
                                 short var41 = this.field8450[var35];
                                 short var42 = this.field8451[var35];
                                 byte var43 = this.field8496[var35];
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
                                 var36 = this.field8463[var31];
                                 var37 = this.field8463[var31 + 1];

                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = this.field8439[var44] - 1;
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

                                 if (this.field8498 == null && this.field8467 != null) {
                                    this.field8467.field8710 = null;
                                 }

                                 if (this.field8498 != null) {
                                    this.field8498.field8710 = null;
                                 }

                                 if (var6.field8498 == null && var6.field8467 != null) {
                                    var6.field8467.field8710 = null;
                                 }

                                 if (var6.field8498 != null) {
                                    var6.field8498.field8710 = null;
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

   }

   public void method5980(int var1) {
      this.field8437 = (short)var1;
      if (this.field8467 != null) {
         this.field8467.field8710 = null;
      }

   }

   public void method5981(int var1) {
      this.field8478 = (short)var1;
      if (this.field8467 != null) {
         this.field8467.field8710 = null;
      }

      if (this.field8498 != null) {
         this.field8498.field8710 = null;
      }

   }

   public int method5982() {
      return this.field8437;
   }

   public int method5950() {
      return this.field8478;
   }

   public void method6093() {
      if (this.field8448 > 0 && this.field8494 > 0) {
         this.method4749(false);
         if ((this.field8436 & 16) == 0 && this.field8488.field1119 == null) {
            this.method4754(false);
         }

         this.method4744();
      }

   }

   boolean method5949() {
      if (this.field8446 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.field8441; ++var1) {
            this.field8443[var1] <<= 4;
            this.field8444[var1] <<= 4;
            this.field8445[var1] <<= 4;
         }

         field8497 = 0;
         field8475 = 0;
         field8499 = 0;
         return true;
      }
   }

   public void method5985(byte var1, byte[] var2) {
      int var3;
      if (var2 == null) {
         for(var3 = 0; var3 < this.field8456; ++var3) {
            this.field8459[var3] = var1;
         }
      } else {
         for(var3 = 0; var3 < this.field8456; ++var3) {
            int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
            this.field8459[var3] = (byte)var4;
         }
      }

      if (this.field8467 != null) {
         this.field8467.field8710 = null;
      }

   }

   public boolean method5988() {
      if (this.field8470 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.field8470.length; ++var1) {
            if (this.field8470[var1] != -1 && !this.field8433.field8581.method4621(this.field8470[var1], (short)29809)) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method5989() {
      return this.field8449;
   }

   public boolean method6036() {
      return this.field8471;
   }

   void method5959() {
   }

   void method5968(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      if (var1 == 0) {
         var5 = 0;
         field8497 = 0;
         field8475 = 0;
         field8499 = 0;

         for(var6 = 0; var6 < this.field8442; ++var6) {
            field8497 += this.field8443[var6];
            field8475 += this.field8444[var6];
            field8499 += this.field8445[var6];
            ++var5;
         }

         if (var5 > 0) {
            field8497 = field8497 / var5 + var2;
            field8475 = field8475 / var5 + var3;
            field8499 = field8499 / var5 + var4;
         } else {
            field8497 = var2;
            field8475 = var3;
            field8499 = var4;
         }
      } else if (var1 == 1) {
         for(var5 = 0; var5 < this.field8442; ++var5) {
            this.field8443[var5] += var2;
            this.field8444[var5] += var3;
            this.field8445[var5] += var4;
         }
      } else {
         int var7;
         int var8;
         if (var1 == 2) {
            for(var5 = 0; var5 < this.field8442; ++var5) {
               this.field8443[var5] -= field8497;
               this.field8444[var5] -= field8475;
               this.field8445[var5] -= field8499;
               if (var4 != 0) {
                  var6 = class703.field3413[var4];
                  var7 = class703.field3404[var4];
                  var8 = this.field8444[var5] * var6 + this.field8443[var5] * var7 + 16383 >> 14;
                  this.field8444[var5] = this.field8444[var5] * var7 - this.field8443[var5] * var6 + 16383 >> 14;
                  this.field8443[var5] = var8;
               }

               if (var2 != 0) {
                  var6 = class703.field3413[var2];
                  var7 = class703.field3404[var2];
                  var8 = this.field8444[var5] * var7 - this.field8445[var5] * var6 + 16383 >> 14;
                  this.field8445[var5] = this.field8444[var5] * var6 + this.field8445[var5] * var7 + 16383 >> 14;
                  this.field8444[var5] = var8;
               }

               if (var3 != 0) {
                  var6 = class703.field3413[var3];
                  var7 = class703.field3404[var3];
                  var8 = this.field8445[var5] * var6 + this.field8443[var5] * var7 + 16383 >> 14;
                  this.field8445[var5] = this.field8445[var5] * var7 - this.field8443[var5] * var6 + 16383 >> 14;
                  this.field8443[var5] = var8;
               }

               this.field8443[var5] += field8497;
               this.field8444[var5] += field8475;
               this.field8445[var5] += field8499;
            }
         } else if (var1 == 3) {
            for(var5 = 0; var5 < this.field8442; ++var5) {
               this.field8443[var5] -= field8497;
               this.field8444[var5] -= field8475;
               this.field8445[var5] -= field8499;
               this.field8443[var5] = this.field8443[var5] * var2 / 128;
               this.field8444[var5] = this.field8444[var5] * var3 / 128;
               this.field8445[var5] = this.field8445[var5] * var4 / 128;
               this.field8443[var5] += field8497;
               this.field8444[var5] += field8475;
               this.field8445[var5] += field8499;
            }
         } else {
            class96 var10;
            class612 var11;
            if (var1 == 5) {
               for(var5 = 0; var5 < this.field8456; ++var5) {
                  var6 = (this.field8459[var5] & 255) + var2 * 8;
                  if (var6 < 0) {
                     var6 = 0;
                  } else if (var6 > 255) {
                     var6 = 255;
                  }

                  this.field8459[var5] = (byte)var6;
               }

               if (this.field8467 != null) {
                  this.field8467.field8710 = null;
               }

               if (this.field8489 != null) {
                  for(var5 = 0; var5 < this.field8486; ++var5) {
                     var11 = this.field8489[var5];
                     var10 = this.field8484[var5];
                     var10.field592 = var10.field592 & 16777215 | 255 - (this.field8459[var11.field8735] & 255) << 24;
                  }
               }
            } else if (var1 == 7) {
               for(var5 = 0; var5 < this.field8456; ++var5) {
                  var6 = this.field8458[var5] & '\uffff';
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

                  this.field8458[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               if (this.field8467 != null) {
                  this.field8467.field8710 = null;
               }

               if (this.field8489 != null) {
                  for(var5 = 0; var5 < this.field8486; ++var5) {
                     var11 = this.field8489[var5];
                     var10 = this.field8484[var5];
                     var10.field592 = var10.field592 & -16777216 | class134.field1398[this.field8458[var11.field8735] & '\uffff'] & 16777215;
                  }
               }
            } else {
               class96 var12;
               if (var1 == 8) {
                  for(var5 = 0; var5 < this.field8486; ++var5) {
                     var12 = this.field8484[var5];
                     var12.field590 += var2;
                     var12.field587 += var3;
                  }
               } else if (var1 == 10) {
                  for(var5 = 0; var5 < this.field8486; ++var5) {
                     var12 = this.field8484[var5];
                     var12.field588 = var12.field588 * var2 >> 7;
                     var12.field589 = var12.field589 * var3 >> 7;
                  }
               } else if (var1 == 9) {
                  for(var5 = 0; var5 < this.field8486; ++var5) {
                     var12 = this.field8484[var5];
                     var12.field591 = var12.field591 + var2 & 16383;
                  }
               }
            }
         }
      }

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
         var9 = 0;
         field8497 = 0;
         field8475 = 0;
         field8499 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var11 = var2[var10];
            if (var11 < this.field8446.length) {
               int[] var12 = this.field8446[var11];

               for(var13 = 0; var13 < var12.length; ++var13) {
                  var14 = var12[var13];
                  field8497 += this.field8443[var14];
                  field8475 += this.field8444[var14];
                  field8499 += this.field8445[var14];
                  ++var9;
               }
            }
         }

         if (var9 > 0) {
            field8497 = field8497 / var9 + var3;
            field8475 = field8475 / var9 + var4;
            field8499 = field8499 / var9 + var5;
         } else {
            field8497 = var3;
            field8475 = var4;
            field8499 = var5;
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
               if (var10 < this.field8446.length) {
                  var21 = this.field8446[var10];

                  for(var22 = 0; var22 < var21.length; ++var22) {
                     var13 = var21[var22];
                     this.field8443[var13] += var3;
                     this.field8444[var13] += var4;
                     this.field8445[var13] += var5;
                  }
               }
            }
         } else {
            int var15;
            int var16;
            int var17;
            if (var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if (var10 < this.field8446.length) {
                     var21 = this.field8446[var10];
                     if ((var6 & 1) == 0) {
                        for(var22 = 0; var22 < var21.length; ++var22) {
                           var13 = var21[var22];
                           this.field8443[var13] -= field8497;
                           this.field8444[var13] -= field8475;
                           this.field8445[var13] -= field8499;
                           if (var5 != 0) {
                              var14 = class703.field3413[var5];
                              var15 = class703.field3404[var5];
                              var16 = this.field8444[var13] * var14 + this.field8443[var13] * var15 + 16383 >> 14;
                              this.field8444[var13] = this.field8444[var13] * var15 - this.field8443[var13] * var14 + 16383 >> 14;
                              this.field8443[var13] = var16;
                           }

                           if (var3 != 0) {
                              var14 = class703.field3413[var3];
                              var15 = class703.field3404[var3];
                              var16 = this.field8444[var13] * var15 - this.field8445[var13] * var14 + 16383 >> 14;
                              this.field8445[var13] = this.field8444[var13] * var14 + this.field8445[var13] * var15 + 16383 >> 14;
                              this.field8444[var13] = var16;
                           }

                           if (var4 != 0) {
                              var14 = class703.field3413[var4];
                              var15 = class703.field3404[var4];
                              var16 = this.field8445[var13] * var14 + this.field8443[var13] * var15 + 16383 >> 14;
                              this.field8445[var13] = this.field8445[var13] * var15 - this.field8443[var13] * var14 + 16383 >> 14;
                              this.field8443[var13] = var16;
                           }

                           this.field8443[var13] += field8497;
                           this.field8444[var13] += field8475;
                           this.field8445[var13] += field8499;
                        }
                     } else {
                        for(var22 = 0; var22 < var21.length; ++var22) {
                           var13 = var21[var22];
                           this.field8443[var13] -= field8497;
                           this.field8444[var13] -= field8475;
                           this.field8445[var13] -= field8499;
                           if (var3 != 0) {
                              var14 = class703.field3413[var3];
                              var15 = class703.field3404[var3];
                              var16 = this.field8444[var13] * var15 - this.field8445[var13] * var14 + 16383 >> 14;
                              this.field8445[var13] = this.field8444[var13] * var14 + this.field8445[var13] * var15 + 16383 >> 14;
                              this.field8444[var13] = var16;
                           }

                           if (var5 != 0) {
                              var14 = class703.field3413[var5];
                              var15 = class703.field3404[var5];
                              var16 = this.field8444[var13] * var14 + this.field8443[var13] * var15 + 16383 >> 14;
                              this.field8444[var13] = this.field8444[var13] * var15 - this.field8443[var13] * var14 + 16383 >> 14;
                              this.field8443[var13] = var16;
                           }

                           if (var4 != 0) {
                              var14 = class703.field3413[var4];
                              var15 = class703.field3404[var4];
                              var16 = this.field8445[var13] * var14 + this.field8443[var13] * var15 + 16383 >> 14;
                              this.field8445[var13] = this.field8445[var13] * var15 - this.field8443[var13] * var14 + 16383 >> 14;
                              this.field8443[var13] = var16;
                           }

                           this.field8443[var13] += field8497;
                           this.field8444[var13] += field8475;
                           this.field8445[var13] += field8499;
                        }
                     }
                  }
               }

               if (var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if (var10 < this.field8446.length) {
                        var21 = this.field8446[var10];

                        for(var22 = 0; var22 < var21.length; ++var22) {
                           var13 = var21[var22];
                           var14 = this.field8463[var13];
                           var15 = this.field8463[var13 + 1];

                           for(var16 = var14; var16 < var15; ++var16) {
                              var17 = this.field8439[var16] - 1;
                              if (var17 == -1) {
                                 break;
                              }

                              int var18;
                              int var19;
                              int var20;
                              if (var5 != 0) {
                                 var18 = class703.field3413[var5];
                                 var19 = class703.field3404[var5];
                                 var20 = this.field8450[var17] * var18 + this.field8438[var17] * var19 + 16383 >> 14;
                                 this.field8450[var17] = (short)(this.field8450[var17] * var19 - this.field8438[var17] * var18 + 16383 >> 14);
                                 this.field8438[var17] = (short)var20;
                              }

                              if (var3 != 0) {
                                 var18 = class703.field3413[var3];
                                 var19 = class703.field3404[var3];
                                 var20 = this.field8450[var17] * var19 - this.field8451[var17] * var18 + 16383 >> 14;
                                 this.field8451[var17] = (short)(this.field8450[var17] * var18 + this.field8451[var17] * var19 + 16383 >> 14);
                                 this.field8450[var17] = (short)var20;
                              }

                              if (var4 != 0) {
                                 var18 = class703.field3413[var4];
                                 var19 = class703.field3404[var4];
                                 var20 = this.field8451[var17] * var18 + this.field8438[var17] * var19 + 16383 >> 14;
                                 this.field8451[var17] = (short)(this.field8451[var17] * var19 - this.field8438[var17] * var18 + 16383 >> 14);
                                 this.field8438[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  if (this.field8498 == null && this.field8467 != null) {
                     this.field8467.field8710 = null;
                  }

                  if (this.field8498 != null) {
                     this.field8498.field8710 = null;
                  }
               }
            } else if (var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if (var10 < this.field8446.length) {
                     var21 = this.field8446[var10];

                     for(var22 = 0; var22 < var21.length; ++var22) {
                        var13 = var21[var22];
                        this.field8443[var13] -= field8497;
                        this.field8444[var13] -= field8475;
                        this.field8445[var13] -= field8499;
                        this.field8443[var13] = this.field8443[var13] * var3 >> 7;
                        this.field8444[var13] = this.field8444[var13] * var4 >> 7;
                        this.field8445[var13] = this.field8445[var13] * var5 >> 7;
                        this.field8443[var13] += field8497;
                        this.field8444[var13] += field8475;
                        this.field8445[var13] += field8499;
                     }
                  }
               }
            } else {
               class612 var23;
               class96 var24;
               if (var1 == 5) {
                  if (this.field8464 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if (var10 < this.field8464.length) {
                           var21 = this.field8464[var10];

                           for(var22 = 0; var22 < var21.length; ++var22) {
                              var13 = var21[var22];
                              var14 = (this.field8459[var13] & 255) + var3 * 8;
                              if (var14 < 0) {
                                 var14 = 0;
                              } else if (var14 > 255) {
                                 var14 = 255;
                              }

                              this.field8459[var13] = (byte)var14;
                           }

                           if (var21.length > 0 && this.field8467 != null) {
                              this.field8467.field8710 = null;
                           }
                        }
                     }

                     if (this.field8489 != null) {
                        for(var9 = 0; var9 < this.field8486; ++var9) {
                           var23 = this.field8489[var9];
                           var24 = this.field8484[var9];
                           var24.field592 = var24.field592 & 16777215 | 255 - (this.field8459[var23.field8735] & 255) << 24;
                        }
                     }
                  }
               } else if (var1 == 7) {
                  if (this.field8464 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if (var10 < this.field8464.length) {
                           var21 = this.field8464[var10];

                           for(var22 = 0; var22 < var21.length; ++var22) {
                              var13 = var21[var22];
                              var14 = this.field8458[var13] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4 / 4;
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

                              this.field8458[var13] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           if (var21.length > 0 && this.field8467 != null) {
                              this.field8467.field8710 = null;
                           }
                        }
                     }

                     if (this.field8489 != null) {
                        for(var9 = 0; var9 < this.field8486; ++var9) {
                           var23 = this.field8489[var9];
                           var24 = this.field8484[var9];
                           var24.field592 = var24.field592 & -16777216 | class134.field1398[this.field8458[var23.field8735] & '\uffff'] & 16777215;
                        }
                     }
                  }
               } else {
                  class96 var25;
                  if (var1 == 8) {
                     if (this.field8491 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if (var10 < this.field8491.length) {
                              var21 = this.field8491[var10];

                              for(var22 = 0; var22 < var21.length; ++var22) {
                                 var25 = this.field8484[var21[var22]];
                                 var25.field590 += var3;
                                 var25.field587 += var4;
                              }
                           }
                        }
                     }
                  } else if (var1 == 10) {
                     if (this.field8491 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if (var10 < this.field8491.length) {
                              var21 = this.field8491[var10];

                              for(var22 = 0; var22 < var21.length; ++var22) {
                                 var25 = this.field8484[var21[var22]];
                                 var25.field588 = var25.field588 * var3 >> 7;
                                 var25.field589 = var25.field589 * var4 >> 7;
                              }
                           }
                        }
                     }
                  } else if (var1 == 9 && this.field8491 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if (var10 < this.field8491.length) {
                           var21 = this.field8491[var10];

                           for(var22 = 0; var22 < var21.length; ++var22) {
                              var25 = this.field8484[var21[var22]];
                              var25.field591 = var25.field591 + var3 & 16383;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void method6084() {
      for(int var1 = 0; var1 < this.field8441; ++var1) {
         this.field8443[var1] = this.field8443[var1] + 7 >> 4;
         this.field8444[var1] = this.field8444[var1] + 7 >> 4;
         this.field8445[var1] = this.field8445[var1] + 7 >> 4;
      }

      if (this.field8440 != null) {
         this.field8440.field8710 = null;
      }

      this.field8452 = false;
   }

   public void method6016(int var1) {
      int var2 = class703.field3413[var1];
      int var3 = class703.field3404[var1];

      for(int var4 = 0; var4 < this.field8442; ++var4) {
         int var5 = this.field8445[var4] * var2 + this.field8443[var4] * var3 >> 14;
         this.field8445[var4] = this.field8445[var4] * var3 - this.field8443[var4] * var2 >> 14;
         this.field8443[var4] = var5;
      }

      if (this.field8440 != null) {
         this.field8440.field8710 = null;
      }

      this.field8452 = false;
   }

   public class396[] method5941() {
      return this.field8466;
   }

   public boolean method6097(int var1, int var2, class135 var3, boolean var4, int var5) {
      class344 var6 = this.field8433.field6791;
      var6.method272(var3);
      var6.method271(this.field8433.field6756);
      boolean var7 = false;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;
      int var10 = Integer.MAX_VALUE;
      int var11 = Integer.MIN_VALUE;
      if (!this.field8452) {
         this.method4755();
      }

      int var12 = this.field8480 - this.field8479 >> 1;
      int var13 = this.field8483 - this.field8477 >> 1;
      int var14 = this.field8485 - this.field8481 >> 1;
      int var15 = this.field8479 + var12;
      int var16 = this.field8477 + var13;
      int var17 = this.field8481 + var14;
      int var18 = var15 - (var12 << var5);
      int var19 = var16 - (var13 << var5);
      int var20 = var17 - (var14 << var5);
      int var21 = var15 + (var12 << var5);
      int var22 = var16 + (var13 << var5);
      int var23 = var17 + (var14 << var5);
      field8476[0] = var18;
      field8495[0] = var19;
      field8457[0] = var20;
      field8476[1] = var21;
      field8495[1] = var19;
      field8457[1] = var20;
      field8476[2] = var18;
      field8495[2] = var22;
      field8457[2] = var20;
      field8476[3] = var21;
      field8495[3] = var22;
      field8457[3] = var20;
      field8476[4] = var18;
      field8495[4] = var19;
      field8457[4] = var23;
      field8476[5] = var21;
      field8495[5] = var19;
      field8457[5] = var23;
      field8476[6] = var18;
      field8495[6] = var22;
      field8457[6] = var23;
      field8476[7] = var21;
      field8495[7] = var22;
      field8457[7] = var23;

      int var26;
      int var27;
      float var30;
      float var31;
      int var32;
      int var33;
      for(int var24 = 0; var24 < 8; ++var24) {
         int var25 = field8476[var24];
         var26 = field8495[var24];
         var27 = field8457[var24];
         float var28 = var6.field325[2] * (float)var25 + var6.field325[6] * (float)var26 + var6.field325[10] * (float)var27 + var6.field325[14];
         float var29 = var6.field325[3] * (float)var25 + var6.field325[7] * (float)var26 + var6.field325[11] * (float)var27 + var6.field325[15];
         if (var28 >= -var29) {
            var30 = var6.field325[0] * (float)var25 + var6.field325[4] * (float)var26 + var6.field325[8] * (float)var27 + var6.field325[12];
            var31 = var6.field325[1] * (float)var25 + var6.field325[5] * (float)var26 + var6.field325[9] * (float)var27 + var6.field325[13];
            var32 = (int)(this.field8433.field6782 + this.field8433.field6783 * var30 / var29);
            var33 = (int)(this.field8433.field6784 + this.field8433.field6785 * var31 / var29);
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

      if (var7 && var1 > var8 && var1 < var9 && var2 > var10 && var2 < var11) {
         if (var4) {
            return true;
         }

         if (this.field8433.field6885.length < this.field8448) {
            this.field8433.field6885 = new int[this.field8448];
            this.field8433.field6886 = new int[this.field8448];
         }

         int[] var38 = this.field8433.field6885;
         int[] var39 = this.field8433.field6886;

         for(var26 = 0; var26 < this.field8442; ++var26) {
            var27 = this.field8443[var26];
            int var40 = this.field8444[var26];
            int var41 = this.field8445[var26];
            var30 = var6.field325[2] * (float)var27 + var6.field325[6] * (float)var40 + var6.field325[10] * (float)var41 + var6.field325[14];
            var31 = var6.field325[3] * (float)var27 + var6.field325[7] * (float)var40 + var6.field325[11] * (float)var41 + var6.field325[15];
            int var34;
            int var35;
            if (var30 >= -var31) {
               float var42 = var6.field325[0] * (float)var27 + var6.field325[4] * (float)var40 + var6.field325[8] * (float)var41 + var6.field325[12];
               float var43 = var6.field325[1] * (float)var27 + var6.field325[5] * (float)var40 + var6.field325[9] * (float)var41 + var6.field325[13];
               var34 = this.field8463[var26];
               var35 = this.field8463[var26 + 1];

               for(int var36 = var34; var36 < var35; ++var36) {
                  int var37 = this.field8439[var36] - 1;
                  if (var37 == -1) {
                     break;
                  }

                  var38[var37] = (int)(this.field8433.field6782 + this.field8433.field6783 * var42 / var31);
                  var39[var37] = (int)(this.field8433.field6784 + this.field8433.field6785 * var43 / var31);
               }
            } else {
               var32 = this.field8463[var26];
               var33 = this.field8463[var26 + 1];

               for(var34 = var32; var34 < var33; ++var34) {
                  var35 = this.field8439[var34] - 1;
                  if (var35 == -1) {
                     break;
                  }

                  var38[this.field8439[var34] - 1] = -999999;
               }
            }
         }

         for(var26 = 0; var26 < this.field8456; ++var26) {
            if (var38[this.field8460[var26]] != -999999 && var38[this.field8461[var26]] != -999999 && var38[this.field8462[var26]] != -999999 && this.method4745(var1, var2, var39[this.field8460[var26]], var39[this.field8461[var26]], var39[this.field8462[var26]], var38[this.field8460[var26]], var38[this.field8461[var26]], var38[this.field8462[var26]])) {
               return true;
            }
         }
      }

      return false;
   }

   boolean method4745(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   public class770 method6102(class770 var1) {
      if (this.field8448 == 0) {
         return null;
      } else {
         if (!this.field8452) {
            this.method4755();
         }

         int var2;
         int var3;
         if (this.field8433.field6753 > 0) {
            var2 = this.field8479 - (this.field8483 * this.field8433.field6753 >> 8) >> this.field8433.field6751;
            var3 = this.field8480 - (this.field8477 * this.field8433.field6753 >> 8) >> this.field8433.field6751;
         } else {
            var2 = this.field8479 - (this.field8477 * this.field8433.field6753 >> 8) >> this.field8433.field6751;
            var3 = this.field8480 - (this.field8483 * this.field8433.field6753 >> 8) >> this.field8433.field6751;
         }

         int var4;
         int var5;
         if (this.field8433.field6713 > 0) {
            var4 = this.field8481 - (this.field8483 * this.field8433.field6713 >> 8) >> this.field8433.field6751;
            var5 = this.field8485 - (this.field8477 * this.field8433.field6713 >> 8) >> this.field8433.field6751;
         } else {
            var4 = this.field8481 - (this.field8477 * this.field8433.field6713 >> 8) >> this.field8433.field6751;
            var5 = this.field8485 - (this.field8483 * this.field8433.field6713 >> 8) >> this.field8433.field6751;
         }

         int var6 = var3 - var2 + 1;
         int var7 = var5 - var4 + 1;
         class464 var8 = (class464)var1;
         class464 var9;
         if (var8 != null && var8.method4110(var6, var7)) {
            var9 = var8;
            var8.method4111();
         } else {
            var9 = new class464(this.field8433, var6, var7);
         }

         var9.method4114(var2, var4, var3, var5);
         this.method4746(var9);
         return var9;
      }
   }

   void method4746(class464 var1) {
      if (this.field8433.field6885.length < this.field8448) {
         this.field8433.field6885 = new int[this.field8448];
         this.field8433.field6886 = new int[this.field8448];
      }

      int[] var2 = this.field8433.field6885;
      int[] var3 = this.field8433.field6886;

      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var4 = 0; var4 < this.field8442; ++var4) {
         var5 = (this.field8443[var4] - (this.field8444[var4] * this.field8433.field6753 >> 8) >> this.field8433.field6751) - var1.field7377;
         var6 = (this.field8445[var4] - (this.field8444[var4] * this.field8433.field6713 >> 8) >> this.field8433.field6751) - var1.field7381;
         var7 = this.field8463[var4];
         var8 = this.field8463[var4 + 1];

         for(var9 = var7; var9 < var8; ++var9) {
            var10 = (this.field8439[var9] & '\uffff') - 1;
            if (var10 == -1) {
               break;
            }

            var2[var10] = var5;
            var3[var10] = var6;
         }
      }

      for(var4 = 0; var4 < this.field8494; ++var4) {
         if (this.field8459 == null || this.field8459[var4] <= 128) {
            var5 = this.field8460[var4] & '\uffff';
            var6 = this.field8461[var4] & '\uffff';
            var7 = this.field8462[var4] & '\uffff';
            var8 = var2[var5];
            var9 = var2[var6];
            var10 = var2[var7];
            int var11 = var3[var5];
            int var12 = var3[var6];
            int var13 = var3[var7];
            if ((var8 - var9) * (var12 - var13) - (var12 - var11) * (var10 - var9) > 0) {
               var1.method4112(var11, var12, var13, var8, var9, var10);
            }
         }
      }

   }

   void method4747() {
      if (this.field8494 != 0) {
         if (this.field8436 != 0) {
            this.method4749(true);
         }

         this.method4749(false);
         if (this.field8488 != null) {
            if (this.field8488.field1119 == null) {
               this.method4754((this.field8436 & 16) != 0);
            }

            if (this.field8488.field1119 != null) {
               this.field8433.method3645(this.field8498 != null);
               this.field8433.method3631(this.field8440, this.field8498, this.field8467, this.field8469);
               int var1 = this.field8468.length - 1;

               for(int var2 = 0; var2 < var1; ++var2) {
                  int var3 = this.field8468[var2];
                  int var4 = this.field8468[var2 + 1];
                  int var5 = this.field8470[var3] & '\uffff';
                  if (var5 == 65535) {
                     var5 = -1;
                  }

                  this.field8433.method3636(var5, this.field8498 != null);
                  this.field8433.method3637(this.field8488.field1119, 4, var3 * 3, (var4 - var3) * 3);
               }
            }
         }

         this.method4744();
      }

   }

   void method4748(class344 var1) {
      if (this.field8489 != null) {
         class344 var2 = this.field8433.field6717;
         this.field8433.method3619();
         this.field8433.method4869(!this.field8449);
         this.field8433.method3645(false);
         this.field8433.method3631(this.field8433.field6779, (class847)null, (class847)null, this.field8433.field6880);

         for(int var3 = 0; var3 < this.field8486; ++var3) {
            class612 var4 = this.field8489[var3];
            class96 var5 = this.field8484[var3];
            if (!var4.field8740 || !this.field8433.method4883()) {
               float var6 = (float)(this.field8443[var4.field8741] + this.field8443[var4.field8733] + this.field8443[var4.field8734]) * 0.3333333F;
               float var7 = (float)(this.field8444[var4.field8741] + this.field8444[var4.field8733] + this.field8444[var4.field8734]) * 0.3333333F;
               float var8 = (float)(this.field8445[var4.field8741] + this.field8445[var4.field8733] + this.field8445[var4.field8734]) * 0.3333333F;
               float var9 = var1.field325[0] * var6 + var1.field325[4] * var7 + var1.field325[8] * var8 + var1.field325[12];
               float var10 = var1.field325[1] * var6 + var1.field325[5] * var7 + var1.field325[9] * var8 + var1.field325[13];
               float var11 = var1.field325[2] * var6 + var1.field325[6] * var7 + var1.field325[10] * var8 + var1.field325[14];
               float var12 = (float)(1.0D / Math.sqrt((double)(var9 * var9 + var10 * var10 + var11 * var11))) * (float)var4.field8732;
               var2.method291(var5.field591, var5.field588 * var4.field8736 >> 7, var5.field589 * var4.field8737 >> 7, var9 + (float)var5.field590 - var9 * var12, var10 + (float)var5.field587 - var10 * var12, var11 - var11 * var12);
               this.field8433.method3616(var2);
               int var13 = var5.field592;
               OpenGL.glColor4ub((byte)(var13 >> 16), (byte)(var13 >> 8), (byte)var13, (byte)(var13 >> 24));
               this.field8433.method3658(var4.field8738);
               this.field8433.method3649(var4.field8739);
               this.field8433.method3668(7, 0, 4);
            }
         }

         this.field8433.method4869(true);
         this.field8433.method3670();
      }

   }

   void method5958() {
   }

   void method4749(boolean var1) {
      boolean var2 = this.field8467 != null && this.field8467.field8710 == null;
      boolean var3 = this.field8498 != null && this.field8498.field8710 == null;
      boolean var4 = this.field8440 != null && this.field8440.field8710 == null;
      boolean var5 = this.field8469 != null && this.field8469.field8710 == null;
      if (var1) {
         var2 &= (this.field8436 & 2) != 0;
         var3 &= (this.field8436 & 4) != 0;
         var4 &= (this.field8436 & 1) != 0;
         var5 &= (this.field8436 & 8) != 0;
      }

      byte var6 = 0;
      byte var7 = 0;
      byte var8 = 0;
      byte var9 = 0;
      byte var10 = 0;
      if (var4) {
         var7 = var6;
         var6 = (byte)(var6 + 12);
      }

      if (var2) {
         var8 = var6;
         var6 = (byte)(var6 + 4);
      }

      if (var3) {
         var9 = var6;
         var6 = (byte)(var6 + 12);
      }

      if (var5) {
         var10 = var6;
         var6 = (byte)(var6 + 8);
      }

      if (var6 != 0) {
         if (this.field8433.field6884.field10375.length < this.field8448 * var6) {
            this.field8433.field6884 = new class782((this.field8448 + 100) * var6);
         } else {
            this.field8433.field6884.field10376 = 0;
         }

         class782 var11 = this.field8433.field6884;
         int var12;
         int var13;
         int var18;
         int var19;
         if (var4) {
            int var14;
            int var15;
            int var16;
            int var17;
            if (this.field8433.field6830) {
               for(var12 = 0; var12 < this.field8442; ++var12) {
                  var13 = Stream.floatToRawIntBits((float)this.field8443[var12]);
                  var14 = Stream.floatToRawIntBits((float)this.field8444[var12]);
                  var15 = Stream.floatToRawIntBits((float)this.field8445[var12]);
                  var16 = this.field8463[var12];
                  var17 = this.field8463[var12 + 1];

                  for(var18 = var16; var18 < var17; ++var18) {
                     var19 = this.field8439[var18] - 1;
                     if (var19 == -1) {
                        break;
                     }

                     var11.field10376 = var19 * var6;
                     var11.method6364(var13, 506762841);
                     var11.method6364(var14, 715809399);
                     var11.method6364(var15, 958087482);
                  }
               }
            } else {
               for(var12 = 0; var12 < this.field8442; ++var12) {
                  var13 = Stream.floatToRawIntBits((float)this.field8443[var12]);
                  var14 = Stream.floatToRawIntBits((float)this.field8444[var12]);
                  var15 = Stream.floatToRawIntBits((float)this.field8445[var12]);
                  var16 = this.field8463[var12];
                  var17 = this.field8463[var12 + 1];

                  for(var18 = var16; var18 < var17; ++var18) {
                     var19 = (this.field8439[var18] & '\uffff') - 1;
                     if (var19 == -1) {
                        break;
                     }

                     var11.field10376 = var19 * var6;
                     var11.method6365(var13, 1851348262);
                     var11.method6365(var14, 1495558444);
                     var11.method6365(var15, -1524571339);
                  }
               }
            }
         }

         float var20;
         short[] var34;
         short[] var35;
         short[] var36;
         byte[] var37;
         float var38;
         float var39;
         if (var2) {
            if (this.field8498 == null) {
               if (this.field8453 != null) {
                  var34 = this.field8453.field2369;
                  var35 = this.field8453.field2368;
                  var36 = this.field8453.field2367;
                  var37 = this.field8453.field2370;
               } else {
                  var34 = this.field8438;
                  var35 = this.field8450;
                  var36 = this.field8451;
                  var37 = this.field8496;
               }

               var38 = this.field8433.field6811[0];
               var39 = this.field8433.field6811[1];
               float var40 = this.field8433.field6811[2];
               float var41 = this.field8433.field6817;
               var20 = this.field8433.field6818 * 768.0F / (float)this.field8478;
               float var21 = this.field8433.field6819 * 768.0F / (float)this.field8478;

               for(int var22 = 0; var22 < this.field8456; ++var22) {
                  int var23 = this.method4750(this.field8458[var22], this.field8470[var22], this.field8437, this.field8459[var22]);
                  float var24 = (float)(var23 >>> 24) * this.field8433.field6812;
                  float var25 = (float)(var23 >> 16 & 255) * this.field8433.field6815;
                  float var26 = (float)(var23 >> 8 & 255) * this.field8433.field6878;
                  short var27 = this.field8460[var22];
                  short var28 = (short)var37[var27];
                  float var29;
                  if (var28 == 0) {
                     var29 = (var38 * (float)var34[var27] + var39 * (float)var35[var27] + var40 * (float)var36[var27]) * 0.0026041667F;
                  } else {
                     var29 = (var38 * (float)var34[var27] + var39 * (float)var35[var27] + var40 * (float)var36[var27]) / (float)(var28 * 256);
                  }

                  float var30 = var41 + var29 * (var29 < 0.0F ? var21 : var20);
                  int var31 = (int)(var24 * var30);
                  if (var31 < 0) {
                     var31 = 0;
                  } else if (var31 > 255) {
                     var31 = 255;
                  }

                  int var32 = (int)(var25 * var30);
                  if (var32 < 0) {
                     var32 = 0;
                  } else if (var32 > 255) {
                     var32 = 255;
                  }

                  int var33 = (int)(var26 * var30);
                  if (var33 < 0) {
                     var33 = 0;
                  } else if (var33 > 255) {
                     var33 = 255;
                  }

                  var11.field10376 = var8 + var27 * var6;
                  var11.method6361(var31);
                  var11.method6361(var32);
                  var11.method6361(var33);
                  var11.method6361(255 - (this.field8459[var22] & 255));
                  var27 = this.field8461[var22];
                  var28 = (short)var37[var27];
                  if (var28 == 0) {
                     var29 = (var38 * (float)var34[var27] + var39 * (float)var35[var27] + var40 * (float)var36[var27]) * 0.0026041667F;
                  } else {
                     var29 = (var38 * (float)var34[var27] + var39 * (float)var35[var27] + var40 * (float)var36[var27]) / (float)(var28 * 256);
                  }

                  var30 = var41 + var29 * (var29 < 0.0F ? var21 : var20);
                  var31 = (int)(var24 * var30);
                  if (var31 < 0) {
                     var31 = 0;
                  } else if (var31 > 255) {
                     var31 = 255;
                  }

                  var32 = (int)(var25 * var30);
                  if (var32 < 0) {
                     var32 = 0;
                  } else if (var32 > 255) {
                     var32 = 255;
                  }

                  var33 = (int)(var26 * var30);
                  if (var33 < 0) {
                     var33 = 0;
                  } else if (var33 > 255) {
                     var33 = 255;
                  }

                  var11.field10376 = var8 + var27 * var6;
                  var11.method6361(var31);
                  var11.method6361(var32);
                  var11.method6361(var33);
                  var11.method6361(255 - (this.field8459[var22] & 255));
                  var27 = this.field8462[var22];
                  var28 = (short)var37[var27];
                  if (var28 == 0) {
                     var29 = (var38 * (float)var34[var27] + var39 * (float)var35[var27] + var40 * (float)var36[var27]) * 0.0026041667F;
                  } else {
                     var29 = (var38 * (float)var34[var27] + var39 * (float)var35[var27] + var40 * (float)var36[var27]) / (float)(var28 * 256);
                  }

                  var30 = var41 + var29 * (var29 < 0.0F ? var21 : var20);
                  var31 = (int)(var24 * var30);
                  if (var31 < 0) {
                     var31 = 0;
                  } else if (var31 > 255) {
                     var31 = 255;
                  }

                  var32 = (int)(var25 * var30);
                  if (var32 < 0) {
                     var32 = 0;
                  } else if (var32 > 255) {
                     var32 = 255;
                  }

                  var33 = (int)(var26 * var30);
                  if (var33 < 0) {
                     var33 = 0;
                  } else if (var33 > 255) {
                     var33 = 255;
                  }

                  var11.field10376 = var8 + var27 * var6;
                  var11.method6361(var31);
                  var11.method6361(var32);
                  var11.method6361(var33);
                  var11.method6361(255 - (this.field8459[var22] & 255));
               }
            } else {
               for(var12 = 0; var12 < this.field8456; ++var12) {
                  var13 = this.method4750(this.field8458[var12], this.field8470[var12], this.field8437, this.field8459[var12]);
                  var11.field10376 = var8 + (this.field8460[var12] & '\uffff') * var6;
                  var11.method6364(var13, -2055604033);
                  var11.field10376 = var8 + (this.field8461[var12] & '\uffff') * var6;
                  var11.method6364(var13, -1511620106);
                  var11.field10376 = var8 + (this.field8462[var12] & '\uffff') * var6;
                  var11.method6364(var13, -1974134781);
               }
            }
         }

         if (var3) {
            if (this.field8453 != null) {
               var34 = this.field8453.field2369;
               var35 = this.field8453.field2368;
               var36 = this.field8453.field2367;
               var37 = this.field8453.field2370;
            } else {
               var34 = this.field8438;
               var35 = this.field8450;
               var36 = this.field8451;
               var37 = this.field8496;
            }

            var38 = 3.0F / (float)this.field8478;
            var39 = 3.0F / (float)(this.field8478 + this.field8478 / 2);
            var11.field10376 = var9;
            if (this.field8433.field6830) {
               for(var18 = 0; var18 < this.field8448; ++var18) {
                  var19 = var37[var18] & 255;
                  if (var19 == 0) {
                     var11.method2468((float)var34[var18] * var39);
                     var11.method2468((float)var35[var18] * var39);
                     var11.method2468((float)var36[var18] * var39);
                  } else {
                     var20 = var38 / (float)var19;
                     var11.method2468((float)var34[var18] * var20);
                     var11.method2468((float)var35[var18] * var20);
                     var11.method2468((float)var36[var18] * var20);
                  }

                  var11.field10376 += var6 - 12;
               }
            } else {
               for(var18 = 0; var18 < this.field8448; ++var18) {
                  var19 = var37[var18] & 255;
                  if (var19 == 0) {
                     var11.method2469((float)var34[var18] * var39);
                     var11.method2469((float)var35[var18] * var39);
                     var11.method2469((float)var36[var18] * var39);
                  } else {
                     var20 = var38 / (float)var19;
                     var11.method2469((float)var34[var18] * var20);
                     var11.method2469((float)var35[var18] * var20);
                     var11.method2469((float)var36[var18] * var20);
                  }

                  var11.field10376 += var6 - 12;
               }
            }
         }

         if (var5) {
            var11.field10376 = var10;
            if (this.field8433.field6830) {
               for(var12 = 0; var12 < this.field8448; ++var12) {
                  var11.method2468(this.field8454[var12]);
                  var11.method2468(this.field8455[var12]);
                  var11.field10376 += var6 - 8;
               }
            } else {
               for(var12 = 0; var12 < this.field8448; ++var12) {
                  var11.method2469(this.field8454[var12]);
                  var11.method2469(this.field8455[var12]);
                  var11.field10376 += var6 - 8;
               }
            }
         }

         var11.field10376 = var6 * this.field8448;
         class269 var42;
         if (var1) {
            if (this.field8482 == null) {
               this.field8482 = this.field8433.method3627(var6, var11.field10375, var11.field10376, true);
            } else {
               this.field8482.method4536(var6, var11.field10375, var11.field10376);
            }

            var42 = this.field8482;
            this.field8436 = 0;
         } else {
            var42 = this.field8433.method3627(var6, var11.field10375, var11.field10376, false);
            this.field8473 = true;
         }

         if (var4) {
            this.field8440.field8710 = var42;
            this.field8440.field8711 = var7;
         }

         if (var5) {
            this.field8469.field8710 = var42;
            this.field8469.field8711 = var10;
         }

         if (var2) {
            this.field8467.field8710 = var42;
            this.field8467.field8711 = var8;
         }

         if (var3) {
            this.field8498.field8710 = var42;
            this.field8498.field8711 = var9;
         }
      }

   }

   int method4750(int var1, short var2, int var3, byte var4) {
      int var5 = class134.field1398[method4751(var1, var3)];
      if (var2 != -1) {
         class414 var6 = this.field8433.field8581.method4625(var2 & '\uffff', 633788173);
         int var7 = var6.field9387 & 255;
         int var8;
         int var10;
         if (var7 != 0) {
            if (var3 < 0) {
               var8 = 0;
            } else if (var3 > 127) {
               var8 = 16777215;
            } else {
               var8 = 131586 * var3;
            }

            if (var7 == 256) {
               var5 = var8;
            } else {
               var10 = 256 - var7;
               var5 = ((var8 & 16711935) * var7 + (var5 & 16711935) * var10 & -16711936) + ((var8 & '\uff00') * var7 + (var5 & '\uff00') * var10 & 16711680) >> 8;
            }
         }

         var8 = var6.field9388 & 255;
         if (var8 != 0) {
            var8 += 256;
            int var9 = ((var5 & 16711680) >> 16) * var8;
            if (var9 > 65535) {
               var9 = 65535;
            }

            var10 = ((var5 & '\uff00') >> 8) * var8;
            if (var10 > 65535) {
               var10 = 65535;
            }

            int var11 = (var5 & 255) * var8;
            if (var11 > 65535) {
               var11 = 65535;
            }

            var5 = (var9 << 8 & 16711680) + (var10 & '\uff00') + (var11 >> 8);
         }
      }

      return var5 << 8 | 255 - (var4 & 255);
   }

   static final int method4751(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   public void method6096(class135 var1) {
      class344 var2 = this.field8433.field6791;
      var2.method272(var1);
      int var3;
      if (this.field8434 != null) {
         for(var3 = 0; var3 < this.field8434.length; ++var3) {
            class933 var4 = this.field8434[var3];
            class933 var5 = var4;
            if (var4.field10329 != null) {
               var5 = var4.field10329;
            }

            var5.field10330 = (int)(var2.field325[12] + var2.field325[0] * (float)this.field8443[var4.field10326] + var2.field325[4] * (float)this.field8444[var4.field10326] + var2.field325[8] * (float)this.field8445[var4.field10326]);
            var5.field10336 = (int)(var2.field325[13] + var2.field325[1] * (float)this.field8443[var4.field10326] + var2.field325[5] * (float)this.field8444[var4.field10326] + var2.field325[9] * (float)this.field8445[var4.field10326]);
            var5.field10332 = (int)(var2.field325[14] + var2.field325[2] * (float)this.field8443[var4.field10326] + var2.field325[6] * (float)this.field8444[var4.field10326] + var2.field325[10] * (float)this.field8445[var4.field10326]);
            var5.field10325 = (int)(var2.field325[12] + var2.field325[0] * (float)this.field8443[var4.field10327] + var2.field325[4] * (float)this.field8444[var4.field10327] + var2.field325[8] * (float)this.field8445[var4.field10327]);
            var5.field10334 = (int)(var2.field325[13] + var2.field325[1] * (float)this.field8443[var4.field10327] + var2.field325[5] * (float)this.field8444[var4.field10327] + var2.field325[9] * (float)this.field8445[var4.field10327]);
            var5.field10335 = (int)(var2.field325[14] + var2.field325[2] * (float)this.field8443[var4.field10327] + var2.field325[6] * (float)this.field8444[var4.field10327] + var2.field325[10] * (float)this.field8445[var4.field10327]);
            var5.field10324 = (int)(var2.field325[12] + var2.field325[0] * (float)this.field8443[var4.field10328] + var2.field325[4] * (float)this.field8444[var4.field10328] + var2.field325[8] * (float)this.field8445[var4.field10328]);
            var5.field10337 = (int)(var2.field325[13] + var2.field325[1] * (float)this.field8443[var4.field10328] + var2.field325[5] * (float)this.field8444[var4.field10328] + var2.field325[9] * (float)this.field8445[var4.field10328]);
            var5.field10338 = (int)(var2.field325[14] + var2.field325[2] * (float)this.field8443[var4.field10328] + var2.field325[6] * (float)this.field8444[var4.field10328] + var2.field325[10] * (float)this.field8445[var4.field10328]);
         }
      }

      if (this.field8466 != null) {
         for(var3 = 0; var3 < this.field8466.length; ++var3) {
            class396 var6 = this.field8466[var3];
            class396 var7 = var6;
            if (var6.field6509 != null) {
               var7 = var6.field6509;
            }

            if (var6.field6514 != null) {
               var6.field6514.method269(var2);
            } else {
               var6.field6514 = new class344(var2);
            }

            var7.field6508 = (int)(var2.field325[12] + var2.field325[0] * (float)this.field8443[var6.field6511] + var2.field325[4] * (float)this.field8444[var6.field6511] + var2.field325[8] * (float)this.field8445[var6.field6511]);
            var7.field6512 = (int)(var2.field325[13] + var2.field325[1] * (float)this.field8443[var6.field6511] + var2.field325[5] * (float)this.field8444[var6.field6511] + var2.field325[9] * (float)this.field8445[var6.field6511]);
            var7.field6513 = (int)(var2.field325[14] + var2.field325[2] * (float)this.field8443[var6.field6511] + var2.field325[6] * (float)this.field8444[var6.field6511] + var2.field325[10] * (float)this.field8445[var6.field6511]);
         }
      }

   }

   short method4752(class25 var1, int var2, long var3, int var5, int var6, int var7, int var8, float var9, float var10) {
      int var11 = this.field8463[var2];
      int var12 = this.field8463[var2 + 1];
      int var13 = 0;

      for(int var14 = var11; var14 < var12; ++var14) {
         short var15 = this.field8439[var14];
         if (var15 == 0) {
            var13 = var14;
            break;
         }

         if (field8492[var14] == var3) {
            return (short)(var15 - 1);
         }
      }

      this.field8439[var13] = (short)(this.field8448 + 1);
      field8492[var13] = var3;
      this.field8438[this.field8448] = (short)var5;
      this.field8450[this.field8448] = (short)var6;
      this.field8451[this.field8448] = (short)var7;
      this.field8496[this.field8448] = (byte)var8;
      this.field8454[this.field8448] = var9;
      this.field8455[this.field8448] = var10;
      return (short)(this.field8448++);
   }

   public void method5953(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field8442; ++var4) {
         if (var1 != 0) {
            this.field8443[var4] += var1;
         }

         if (var2 != 0) {
            this.field8444[var4] += var2;
         }

         if (var3 != 0) {
            this.field8445[var4] += var3;
         }
      }

      if (this.field8440 != null) {
         this.field8440.field8710 = null;
      }

      this.field8452 = false;
   }

   public class879 method6017(byte var1, int var2, boolean var3) {
      boolean var4 = false;
      class248 var5;
      class248 var6;
      if (var1 > 0 && var1 <= 7) {
         var5 = this.field8433.field6771[var1 - 1];
         var6 = this.field8433.field6876[var1 - 1];
         var4 = true;
      } else {
         var6 = var5 = new class248(this.field8433);
      }

      return this.method4743(var6, var5, var2, var4, var3);
   }

   static short[] method4753(short[] var0, int var1) {
      short[] var2 = new short[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   class248(class13 var1) {
      this.field8433 = var1;
      this.field8440 = new class847((class269)null, 5126, 3, 0);
      this.field8469 = new class847((class269)null, 5126, 2, 0);
      this.field8498 = new class847((class269)null, 5126, 3, 0);
      this.field8467 = new class847((class269)null, 5121, 4, 0);
      this.field8488 = new class372();
   }

   public void method5986(short var1, short var2) {
      class478 var3 = this.field8433.field8581;

      for(int var4 = 0; var4 < this.field8456; ++var4) {
         if (this.field8470[var4] == var1) {
            this.field8470[var4] = var2;
         }
      }

      byte var11 = 0;
      byte var5 = 0;
      if (var1 != -1) {
         class414 var6 = var3.method4625(var1 & '\uffff', 1939464338);
         var11 = var6.field9387;
         var5 = var6.field9388;
      }

      byte var12 = 0;
      byte var7 = 0;
      if (var2 != -1) {
         class414 var8 = var3.method4625(var2 & '\uffff', 1644683236);
         var12 = var8.field9387;
         var7 = var8.field9388;
         if (var8.field9389 != 0 || var8.field9363 != 0) {
            this.field8471 = true;
         }
      }

      if (var11 != var12 | var5 != var7) {
         if (this.field8489 != null) {
            for(int var13 = 0; var13 < this.field8486; ++var13) {
               class612 var9 = this.field8489[var13];
               class96 var10 = this.field8484[var13];
               var10.field592 = var10.field592 & -16777216 | class134.field1398[this.field8458[var9.field8735] & '\uffff'] & 16777215;
            }
         }

         if (this.field8467 != null) {
            this.field8467.field8710 = null;
         }
      }

   }

   public int method5973() {
      if (!this.field8452) {
         this.method4755();
      }

      return this.field8474;
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
         var10 = 0;
         field8497 = 0;
         field8475 = 0;
         field8499 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var12 = var2[var11];
            if (var12 < this.field8446.length) {
               int[] var13 = this.field8446[var12];

               for(var14 = 0; var14 < var13.length; ++var14) {
                  var15 = var13[var14];
                  if (this.field8447 == null || (var7 & this.field8447[var15]) != 0) {
                     field8497 += this.field8443[var15];
                     field8475 += this.field8444[var15];
                     field8499 += this.field8445[var15];
                     ++var10;
                  }
               }
            }
         }

         if (var10 > 0) {
            field8497 = field8497 / var10 + var3;
            field8475 = field8475 / var10 + var4;
            field8499 = field8499 / var10 + var5;
            field8426 = true;
         } else {
            field8497 = var3;
            field8475 = var4;
            field8499 = var5;
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
               if (var11 < this.field8446.length) {
                  var47 = this.field8446[var11];

                  for(var48 = 0; var48 < var47.length; ++var48) {
                     var14 = var47[var48];
                     if (this.field8447 == null || (var7 & this.field8447[var14]) != 0) {
                        this.field8443[var14] += var3;
                        this.field8444[var14] += var4;
                        this.field8445[var14] += var5;
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
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var12 = var8[11] << 4;
                  var48 = var8[12] << 4;
                  var14 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if (field8426) {
                     var16 = var8[0] * field8497 + var8[3] * field8475 + var8[6] * field8499 + 8192 >> 14;
                     var17 = var8[1] * field8497 + var8[4] * field8475 + var8[7] * field8499 + 8192 >> 14;
                     var18 = var8[2] * field8497 + var8[5] * field8475 + var8[8] * field8499 + 8192 >> 14;
                     var16 += var48;
                     var17 += var14;
                     var18 += var15;
                     field8497 = var16;
                     field8475 = var17;
                     field8499 = var18;
                     field8426 = false;
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
                  int var25 = var51[0] * -field8497 + var51[1] * -field8475 + var51[2] * -field8499 + 8192 >> 14;
                  var26 = var51[3] * -field8497 + var51[4] * -field8475 + var51[5] * -field8499 + 8192 >> 14;
                  var27 = var51[6] * -field8497 + var51[7] * -field8475 + var51[8] * -field8499 + 8192 >> 14;
                  var28 = var25 + field8497;
                  int var29 = var26 + field8475;
                  var30 = var27 + field8499;
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
                     if (var40 < this.field8446.length) {
                        int[] var41 = this.field8446[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if (this.field8447 == null || (var7 & this.field8447[var43]) != 0) {
                              int var44 = var56[0] * this.field8443[var43] + var56[1] * this.field8444[var43] + var56[2] * this.field8445[var43] + 8192 >> 14;
                              int var45 = var56[3] * this.field8443[var43] + var56[4] * this.field8444[var43] + var56[5] * this.field8445[var43] + 8192 >> 14;
                              int var46 = var56[6] * this.field8443[var43] + var56[7] * this.field8444[var43] + var56[8] * this.field8445[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.field8443[var43] = var44;
                              this.field8444[var43] = var45;
                              this.field8445[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if (var11 < this.field8446.length) {
                        var47 = this.field8446[var11];

                        for(var48 = 0; var48 < var47.length; ++var48) {
                           var14 = var47[var48];
                           if (this.field8447 == null || (var7 & this.field8447[var14]) != 0) {
                              this.field8443[var14] -= field8497;
                              this.field8444[var14] -= field8475;
                              this.field8445[var14] -= field8499;
                              if (var5 != 0) {
                                 var15 = class703.field3413[var5];
                                 var16 = class703.field3404[var5];
                                 var17 = this.field8444[var14] * var15 + this.field8443[var14] * var16 + 16383 >> 14;
                                 this.field8444[var14] = this.field8444[var14] * var16 - this.field8443[var14] * var15 + 16383 >> 14;
                                 this.field8443[var14] = var17;
                              }

                              if (var3 != 0) {
                                 var15 = class703.field3413[var3];
                                 var16 = class703.field3404[var3];
                                 var17 = this.field8444[var14] * var16 - this.field8445[var14] * var15 + 16383 >> 14;
                                 this.field8445[var14] = this.field8444[var14] * var15 + this.field8445[var14] * var16 + 16383 >> 14;
                                 this.field8444[var14] = var17;
                              }

                              if (var4 != 0) {
                                 var15 = class703.field3413[var4];
                                 var16 = class703.field3404[var4];
                                 var17 = this.field8445[var14] * var15 + this.field8443[var14] * var16 + 16383 >> 14;
                                 this.field8445[var14] = this.field8445[var14] * var16 - this.field8443[var14] * var15 + 16383 >> 14;
                                 this.field8443[var14] = var17;
                              }

                              this.field8443[var14] += field8497;
                              this.field8444[var14] += field8475;
                              this.field8445[var14] += field8499;
                           }
                        }
                     }
                  }

                  if (var6) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if (var11 < this.field8446.length) {
                           var47 = this.field8446[var11];

                           for(var48 = 0; var48 < var47.length; ++var48) {
                              var14 = var47[var48];
                              if (this.field8447 == null || (var7 & this.field8447[var14]) != 0) {
                                 var15 = this.field8463[var14];
                                 var16 = this.field8463[var14 + 1];

                                 for(var17 = var15; var17 < var16; ++var17) {
                                    var18 = this.field8439[var17] - 1;
                                    if (var18 == -1) {
                                       break;
                                    }

                                    if (var5 != 0) {
                                       var19 = class703.field3413[var5];
                                       var20 = class703.field3404[var5];
                                       var21 = this.field8450[var18] * var19 + this.field8438[var18] * var20 + 16383 >> 14;
                                       this.field8450[var18] = (short)(this.field8450[var18] * var20 - this.field8438[var18] * var19 + 16383 >> 14);
                                       this.field8438[var18] = (short)var21;
                                    }

                                    if (var3 != 0) {
                                       var19 = class703.field3413[var3];
                                       var20 = class703.field3404[var3];
                                       var21 = this.field8450[var18] * var20 - this.field8451[var18] * var19 + 16383 >> 14;
                                       this.field8451[var18] = (short)(this.field8450[var18] * var19 + this.field8451[var18] * var20 + 16383 >> 14);
                                       this.field8450[var18] = (short)var21;
                                    }

                                    if (var4 != 0) {
                                       var19 = class703.field3413[var4];
                                       var20 = class703.field3404[var4];
                                       var21 = this.field8451[var18] * var19 + this.field8438[var18] * var20 + 16383 >> 14;
                                       this.field8451[var18] = (short)(this.field8451[var18] * var20 - this.field8438[var18] * var19 + 16383 >> 14);
                                       this.field8438[var18] = (short)var21;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if (this.field8498 == null && this.field8467 != null) {
                        this.field8467.field8710 = null;
                     }

                     if (this.field8498 != null) {
                        this.field8498.field8710 = null;
                     }
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
                  if (field8426) {
                     var16 = var8[0] * field8497 + var8[3] * field8475 + var8[6] * field8499 + 8192 >> 14;
                     var17 = var8[1] * field8497 + var8[4] * field8475 + var8[7] * field8499 + 8192 >> 14;
                     var18 = var8[2] * field8497 + var8[5] * field8475 + var8[8] * field8499 + 8192 >> 14;
                     var16 += var48;
                     var17 += var14;
                     var18 += var15;
                     field8497 = var16;
                     field8475 = var17;
                     field8499 = var18;
                     field8426 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -field8497 + 8192 >> 14;
                  var20 = var17 * -field8475 + 8192 >> 14;
                  var21 = var18 * -field8499 + 8192 >> 14;
                  var22 = var19 + field8497;
                  var23 = var20 + field8475;
                  var24 = var21 + field8499;
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
                     if (var34 < this.field8446.length) {
                        var56 = this.field8446[var34];

                        for(var36 = 0; var36 < var56.length; ++var36) {
                           var37 = var56[var36];
                           if (this.field8447 == null || (var7 & this.field8447[var37]) != 0) {
                              var38 = var54[0] * this.field8443[var37] + var54[1] * this.field8444[var37] + var54[2] * this.field8445[var37] + 8192 >> 14;
                              var39 = var54[3] * this.field8443[var37] + var54[4] * this.field8444[var37] + var54[5] * this.field8445[var37] + 8192 >> 14;
                              var40 = var54[6] * this.field8443[var37] + var54[7] * this.field8444[var37] + var54[8] * this.field8445[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var55;
                              var40 += var32;
                              this.field8443[var37] = var38;
                              this.field8444[var37] = var39;
                              this.field8445[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if (var11 < this.field8446.length) {
                        var47 = this.field8446[var11];

                        for(var48 = 0; var48 < var47.length; ++var48) {
                           var14 = var47[var48];
                           if (this.field8447 == null || (var7 & this.field8447[var14]) != 0) {
                              this.field8443[var14] -= field8497;
                              this.field8444[var14] -= field8475;
                              this.field8445[var14] -= field8499;
                              this.field8443[var14] = this.field8443[var14] * var3 >> 7;
                              this.field8444[var14] = this.field8444[var14] * var4 >> 7;
                              this.field8445[var14] = this.field8445[var14] * var5 >> 7;
                              this.field8443[var14] += field8497;
                              this.field8444[var14] += field8475;
                              this.field8445[var14] += field8499;
                           }
                        }
                     }
                  }
               }
            } else {
               class612 var49;
               class96 var50;
               if (var1 == 5) {
                  if (this.field8464 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if (var11 < this.field8464.length) {
                           var47 = this.field8464[var11];

                           for(var48 = 0; var48 < var47.length; ++var48) {
                              var14 = var47[var48];
                              if (this.field8465 == null || (var7 & this.field8465[var14]) != 0) {
                                 var15 = (this.field8459[var14] & 255) + var3 * 8;
                                 if (var15 < 0) {
                                    var15 = 0;
                                 } else if (var15 > 255) {
                                    var15 = 255;
                                 }

                                 this.field8459[var14] = (byte)var15;
                                 if (this.field8467 != null) {
                                    this.field8467.field8710 = null;
                                 }
                              }
                           }
                        }
                     }

                     if (this.field8489 != null) {
                        for(var10 = 0; var10 < this.field8486; ++var10) {
                           var49 = this.field8489[var10];
                           var50 = this.field8484[var10];
                           var50.field592 = var50.field592 & 16777215 | 255 - (this.field8459[var49.field8735] & 255) << 24;
                        }
                     }
                  }
               } else if (var1 == 7) {
                  if (this.field8464 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if (var11 < this.field8464.length) {
                           var47 = this.field8464[var11];

                           for(var48 = 0; var48 < var47.length; ++var48) {
                              var14 = var47[var48];
                              if (this.field8465 == null || (var7 & this.field8465[var14]) != 0) {
                                 var15 = this.field8458[var14] & '\uffff';
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

                                 this.field8458[var14] = (short)(var16 << 10 | var17 << 7 | var18);
                                 if (this.field8467 != null) {
                                    this.field8467.field8710 = null;
                                 }
                              }
                           }
                        }
                     }

                     if (this.field8489 != null) {
                        for(var10 = 0; var10 < this.field8486; ++var10) {
                           var49 = this.field8489[var10];
                           var50 = this.field8484[var10];
                           var50.field592 = var50.field592 & -16777216 | class134.field1398[this.field8458[var49.field8735] & '\uffff'] & 16777215;
                        }
                     }
                  }
               } else {
                  class96 var52;
                  if (var1 == 8) {
                     if (this.field8491 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if (var11 < this.field8491.length) {
                              var47 = this.field8491[var11];

                              for(var48 = 0; var48 < var47.length; ++var48) {
                                 var52 = this.field8484[var47[var48]];
                                 var52.field590 += var3;
                                 var52.field587 += var4;
                              }
                           }
                        }
                     }
                  } else if (var1 == 10) {
                     if (this.field8491 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if (var11 < this.field8491.length) {
                              var47 = this.field8491[var11];

                              for(var48 = 0; var48 < var47.length; ++var48) {
                                 var52 = this.field8484[var47[var48]];
                                 var52.field588 = var52.field588 * var3 >> 7;
                                 var52.field589 = var52.field589 * var4 >> 7;
                              }
                           }
                        }
                     }
                  } else if (var1 == 9 && this.field8491 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if (var11 < this.field8491.length) {
                           var47 = this.field8491[var11];

                           for(var48 = 0; var48 < var47.length; ++var48) {
                              var52 = this.field8484[var47[var48]];
                              var52.field591 = var52.field591 + var3 & 16383;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public void method5984(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.field8456; ++var3) {
         if (this.field8458[var3] == var1) {
            this.field8458[var3] = var2;
         }
      }

      if (this.field8489 != null) {
         for(var3 = 0; var3 < this.field8486; ++var3) {
            class612 var4 = this.field8489[var3];
            class96 var5 = this.field8484[var3];
            var5.field592 = var5.field592 & -16777216 | class134.field1398[this.field8458[var4.field8735] & '\uffff'] & 16777215;
         }
      }

      if (this.field8467 != null) {
         this.field8467.field8710 = null;
      }

   }

   void method4754(boolean var1) {
      if (this.field8433.field6884.field10375.length < this.field8494 * 6) {
         this.field8433.field6884 = new class782((this.field8494 + 100) * 6);
      } else {
         this.field8433.field6884.field10376 = 0;
      }

      class782 var2 = this.field8433.field6884;
      int var3;
      if (this.field8433.field6830) {
         for(var3 = 0; var3 < this.field8494; ++var3) {
            var2.method6362(this.field8460[var3], 16711935);
            var2.method6362(this.field8461[var3], 16711935);
            var2.method6362(this.field8462[var3], 16711935);
         }
      } else {
         for(var3 = 0; var3 < this.field8494; ++var3) {
            var2.method6363(this.field8460[var3], 1368367793);
            var2.method6363(this.field8461[var3], 1368367793);
            var2.method6363(this.field8462[var3], 1368367793);
         }
      }

      if (var2.field10376 != 0) {
         if (var1) {
            if (this.field8429 == null) {
               this.field8429 = this.field8433.method3667(5123, var2.field10375, var2.field10376, true);
            } else {
               this.field8429.method1190(5123, var2.field10375, var2.field10376);
            }

            this.field8488.field1119 = this.field8429;
         } else {
            this.field8488.field1119 = this.field8433.method3667(5123, var2.field10375, var2.field10376, false);
         }

         if (!var1) {
            this.field8473 = true;
         }
      }

   }

   void method4755() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.field8442; ++var9) {
         int var10 = this.field8443[var9];
         int var11 = this.field8444[var9];
         int var12 = this.field8445[var9];
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

      this.field8479 = (short)var1;
      this.field8480 = (short)var4;
      this.field8477 = (short)var2;
      this.field8483 = (short)var5;
      this.field8481 = (short)var3;
      this.field8485 = (short)var6;
      this.field8500 = (int)(Math.sqrt((double)var7) + 0.99D);
      this.field8474 = (int)(Math.sqrt((double)var8) + 0.99D);
      this.field8452 = true;
   }

   public class933[] method6089() {
      return this.field8434;
   }

   public void method5952(int var1) {
      int var2 = class703.field3413[var1];
      int var3 = class703.field3404[var1];

      for(int var4 = 0; var4 < this.field8442; ++var4) {
         int var5 = this.field8444[var4] * var3 - this.field8445[var4] * var2 >> 14;
         this.field8445[var4] = this.field8444[var4] * var2 + this.field8445[var4] * var3 >> 14;
         this.field8444[var4] = var5;
      }

      if (this.field8440 != null) {
         this.field8440.field8710 = null;
      }

      this.field8452 = false;
   }

   public void method5955(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field8442; ++var4) {
         if (var1 != 128) {
            this.field8443[var4] = this.field8443[var4] * var1 >> 7;
         }

         if (var2 != 128) {
            this.field8444[var4] = this.field8444[var4] * var2 >> 7;
         }

         if (var3 != 128) {
            this.field8445[var4] = this.field8445[var4] * var3 >> 7;
         }
      }

      if (this.field8440 != null) {
         this.field8440.field8710 = null;
      }

      this.field8452 = false;
   }

   public void method5970(class135 var1, int var2, boolean var3) {
      if (this.field8447 != null) {
         class135 var4 = var1;
         if (var3) {
            var4 = this.field8433.field6790;
            var4.method1028(var1);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.field8442; ++var6) {
            if ((var2 & this.field8447[var6]) != 0) {
               var4.method1031((float)this.field8443[var6], (float)this.field8444[var6], (float)this.field8445[var6], var5);
               this.field8443[var6] = (int)var5[0];
               this.field8444[var6] = (int)var5[1];
               this.field8445[var6] = (int)var5[2];
            }
         }
      }

   }

   class248(class13 var1, class25 var2, int var3, int var4, int var5, int var6) {
      this.field8433 = var1;
      this.field8472 = var3;
      this.field8435 = var6;
      if (class857.method5254(var3, var6)) {
         this.field8440 = new class847((class269)null, 5126, 3, 0);
      }

      if (class857.method5238(var3, var6)) {
         this.field8469 = new class847((class269)null, 5126, 2, 0);
      }

      if (class857.method5258(var3, var6)) {
         this.field8498 = new class847((class269)null, 5126, 3, 0);
      }

      if (class857.method5241(var3, var6)) {
         this.field8467 = new class847((class269)null, 5121, 4, 0);
      }

      if (class857.method5239(var3, var6)) {
         this.field8488 = new class372();
      }

      class478 var7 = var1.field8581;
      int[] var8 = new int[var2.field6453];
      this.field8463 = new int[var2.field6458 + 1];

      for(int var9 = 0; var9 < var2.field6453; ++var9) {
         if (var2.field6457 == null || var2.field6457[var9] != 2) {
            if (var2.field6449 != null && var2.field6449[var9] != -1) {
               class414 var10 = var7.method4625(var2.field6449[var9] & '\uffff', 320662822);
               if (((this.field8435 & 64) == 0 || !var10.field9378) && var10.field9392) {
                  continue;
               }
            }

            var8[this.field8456++] = var9;
            ++this.field8463[var2.field6476[var9]];
            ++this.field8463[var2.field6478[var9]];
            ++this.field8463[var2.field6456[var9]];
         }
      }

      this.field8494 = this.field8456;
      long[] var67 = new long[this.field8456];
      boolean var68 = (this.field8472 & 256) != 0;

      int var12;
      int var14;
      int var19;
      class414 var22;
      int var72;
      short var79;
      for(int var11 = 0; var11 < this.field8456; ++var11) {
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
                  class526 var21 = class568.method550(var20.field8570, -380514966);
                  if (var21.field3665) {
                     var18 = true;
                  }

                  if (var21.field3659 != -1) {
                     var22 = var7.method4625(var21.field3659, 1849419988);
                     if (var22.field9382 == 2) {
                        this.field8449 = true;
                     }
                  }
               }
            }

            if (var18) {
               var67[var11] = Long.MAX_VALUE;
               --this.field8494;
               continue;
            }
         }

         var79 = -1;
         if (var2.field6449 != null) {
            var79 = var2.field6449[var12];
            if (var79 != -1) {
               var13 = var7.method4625(var79 & '\uffff', 437303062);
               if ((this.field8435 & 64) != 0 && var13.field9378) {
                  var79 = -1;
                  var13 = null;
               } else {
                  var16 = var13.field9383;
                  var17 = var13.field9390;
                  if (var13.field9389 != 0 || var13.field9363 != 0) {
                     this.field8471 = true;
                  }
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
         this.field8449 |= var80;
         this.field8471 |= var13 != null && (var13.field9389 != 0 || var13.field9363 != 0);
      }

      class544.method2368(var67, var8, (byte)2);
      this.field8441 = var2.field6446;
      this.field8442 = var2.field6458;
      this.field8443 = var2.field6448;
      this.field8444 = var2.field6474;
      this.field8445 = var2.field6450;
      this.field8447 = var2.field6452;
      class375[] var69 = new class375[this.field8442];
      this.field8434 = var2.field6479;
      this.field8466 = var2.field6445;
      int var74;
      if (var2.field6481 != null) {
         this.field8486 = var2.field6481.length;
         this.field8489 = new class612[this.field8486];
         this.field8484 = new class96[this.field8486];

         for(var12 = 0; var12 < this.field8486; ++var12) {
            class606 var70 = var2.field6481[var12];
            class526 var73 = class568.method550(var70.field8570, 1758863728);
            var72 = -1;

            for(var74 = 0; var74 < this.field8456; ++var74) {
               if (var8[var74] == var70.field8569) {
                  var72 = var74;
                  break;
               }
            }

            var74 = class134.field1398[var2.field6461[var70.field8569] & '\uffff'] & 16777215;
            var74 |= 255 - (var2.field6459 != null ? var2.field6459[var70.field8569] : 0) << 24;
            this.field8489[var12] = new class612(var72, var2.field6476[var70.field8569], var2.field6478[var70.field8569], var2.field6456[var70.field8569], var73.field3663, var73.field3661, var73.field3659, var73.field3660, var73.field3662, var73.field3665, var73.field3656, var70.field8571);
            this.field8484[var12] = new class96(var74);
         }
      }

      var12 = this.field8456 * 3;
      this.field8438 = new short[var12];
      this.field8450 = new short[var12];
      this.field8451 = new short[var12];
      this.field8496 = new byte[var12];
      this.field8454 = new float[var12];
      this.field8455 = new float[var12];
      this.field8458 = new short[this.field8456];
      this.field8459 = new byte[this.field8456];
      this.field8460 = new short[this.field8456];
      this.field8461 = new short[this.field8456];
      this.field8462 = new short[this.field8456];
      this.field8470 = new short[this.field8456];
      if (var2.field6447 != null) {
         this.field8465 = new short[this.field8456];
      }

      this.field8437 = (short)var4;
      this.field8478 = (short)var5;
      this.field8439 = new short[var12];
      field8492 = new long[var12];
      int var71 = 0;

      for(var14 = 0; var14 < var2.field6458; ++var14) {
         var72 = this.field8463[var14];
         this.field8463[var14] = var71;
         var71 += var72;
         var69[var14] = new class375();
      }

      this.field8463[var2.field6458] = var71;
      class251 var75 = this.method6095(var2, var8, this.field8456);
      class595[] var76 = new class595[var2.field6453];

      short var77;
      short var81;
      int var82;
      int var84;
      for(var74 = 0; var74 < var2.field6453; ++var74) {
         var77 = var2.field6476[var74];
         var79 = var2.field6478[var74];
         var81 = var2.field6456[var74];
         var82 = this.field8443[var79] - this.field8443[var77];
         var84 = this.field8444[var79] - this.field8444[var77];
         int var86 = this.field8445[var79] - this.field8445[var77];
         int var23 = this.field8443[var81] - this.field8443[var77];
         int var24 = this.field8444[var81] - this.field8444[var77];
         int var25 = this.field8445[var81] - this.field8445[var77];
         int var26 = var84 * var25 - var24 * var86;
         int var27 = var86 * var23 - var25 * var82;

         int var28;
         for(var28 = var82 * var24 - var23 * var84; var26 > 8192 || var27 > 8192 || var28 > 8192 || var26 < -8192 || var27 < -8192 || var28 < -8192; var28 >>= 1) {
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
            class375 var31 = var69[var77];
            var31.field1175 += var26;
            var31.field1174 += var27;
            var31.field1176 += var28;
            ++var31.field1177;
            var31 = var69[var79];
            var31.field1175 += var26;
            var31.field1174 += var27;
            var31.field1176 += var28;
            ++var31.field1177;
            var31 = var69[var81];
            var31.field1175 += var26;
            var31.field1174 += var27;
            var31.field1176 += var28;
            ++var31.field1177;
         } else if (var30 == 1) {
            class595 var97 = var76[var74] = new class595();
            var97.field1924 = var26;
            var97.field1923 = var27;
            var97.field1925 = var28;
         }
      }

      int var83;
      for(var74 = 0; var74 < this.field8456; ++var74) {
         int var78 = var8[var74];
         var83 = var2.field6461[var78] & '\uffff';
         if (var2.field6467 == null) {
            var19 = -1;
         } else {
            var19 = var2.field6467[var78];
         }

         if (var2.field6459 == null) {
            var82 = 0;
         } else {
            var82 = var2.field6459[var78] & 255;
         }

         short var85 = var2.field6449 == null ? -1 : var2.field6449[var78];
         if (var85 != -1 && (this.field8435 & 64) != 0) {
            var22 = var7.method4625(var85 & '\uffff', 1573425391);
            if (var22.field9378) {
               var85 = -1;
            }
         }

         float var87 = 0.0F;
         float var89 = 0.0F;
         float var90 = 0.0F;
         float var91 = 0.0F;
         float var92 = 0.0F;
         float var93 = 0.0F;
         byte var94 = 0;
         byte var95 = 0;
         int var96 = 0;
         short var34;
         short var35;
         short var36;
         byte var98;
         if (var85 != -1) {
            if (var19 == -1) {
               var87 = 0.0F;
               var89 = 1.0F;
               var90 = 1.0F;
               var91 = 1.0F;
               var94 = 1;
               var92 = 0.0F;
               var93 = 0.0F;
               var95 = 2;
            } else {
               var19 &= 255;
               var98 = var2.field6454[var19];
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
               if (var98 == 0) {
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
                  var87 = (var59 * var47 + var60 * var48 + var61 * var49) * var62;
                  var90 = (var59 * var50 + var60 * var51 + var61 * var52) * var62;
                  var92 = (var59 * var53 + var60 * var54 + var61 * var55) * var62;
                  var59 = var42 * var58 - var43 * var57;
                  var60 = var43 * var56 - var41 * var58;
                  var61 = var41 * var57 - var42 * var56;
                  var62 = 1.0F / (var59 * var44 + var60 * var45 + var61 * var46);
                  var89 = (var59 * var47 + var60 * var48 + var61 * var49) * var62;
                  var91 = (var59 * var50 + var60 * var51 + var61 * var52) * var62;
                  var93 = (var59 * var53 + var60 * var54 + var61 * var55) * var62;
               } else {
                  var32 = var2.field6476[var78];
                  var33 = var2.field6478[var78];
                  var34 = var2.field6456[var78];
                  int var100 = var75.field7851[var19];
                  int var101 = var75.field7848[var19];
                  int var102 = var75.field7847[var19];
                  float[] var104 = var75.field7849[var19];
                  byte var105 = var2.field6460[var19];
                  var40 = (float)var2.field6469[var19] / 256.0F;
                  if (var98 == 1) {
                     var41 = (float)var2.field6473[var19] / 1024.0F;
                     this.method5991(var2.field6448[var32], var2.field6474[var32], var2.field6450[var32], var100, var101, var102, var104, var41, var105, var40, field8493);
                     var87 = field8493[0];
                     var89 = field8493[1];
                     this.method5991(var2.field6448[var33], var2.field6474[var33], var2.field6450[var33], var100, var101, var102, var104, var41, var105, var40, field8493);
                     var90 = field8493[0];
                     var91 = field8493[1];
                     this.method5991(var2.field6448[var34], var2.field6474[var34], var2.field6450[var34], var100, var101, var102, var104, var41, var105, var40, field8493);
                     var92 = field8493[0];
                     var93 = field8493[1];
                     var42 = var41 / 2.0F;
                     if ((var105 & 1) == 0) {
                        if (var90 - var87 > var42) {
                           var90 -= var41;
                           var94 = 1;
                        } else if (var87 - var90 > var42) {
                           var90 += var41;
                           var94 = 2;
                        }

                        if (var92 - var87 > var42) {
                           var92 -= var41;
                           var95 = 1;
                        } else if (var87 - var92 > var42) {
                           var92 += var41;
                           var95 = 2;
                        }
                     } else {
                        if (var91 - var89 > var42) {
                           var91 -= var41;
                           var94 = 1;
                        } else if (var89 - var91 > var42) {
                           var91 += var41;
                           var94 = 2;
                        }

                        if (var93 - var89 > var42) {
                           var93 -= var41;
                           var95 = 1;
                        } else if (var89 - var93 > var42) {
                           var93 += var41;
                           var95 = 2;
                        }
                     }
                  } else if (var98 == 2) {
                     var41 = (float)var2.field6475[var19] / 256.0F;
                     var42 = (float)var2.field6480[var19] / 256.0F;
                     int var106 = var2.field6448[var33] - var2.field6448[var32];
                     int var107 = var2.field6474[var33] - var2.field6474[var32];
                     int var108 = var2.field6450[var33] - var2.field6450[var32];
                     int var109 = var2.field6448[var34] - var2.field6448[var32];
                     int var110 = var2.field6474[var34] - var2.field6474[var32];
                     int var111 = var2.field6450[var34] - var2.field6450[var32];
                     int var112 = var107 * var111 - var110 * var108;
                     int var113 = var108 * var109 - var111 * var106;
                     int var114 = var106 * var110 - var109 * var107;
                     var52 = 64.0F / (float)var2.field6471[var19];
                     var53 = 64.0F / (float)var2.field6472[var19];
                     var54 = 64.0F / (float)var2.field6473[var19];
                     var55 = ((float)var112 * var104[0] + (float)var113 * var104[1] + (float)var114 * var104[2]) / var52;
                     var56 = ((float)var112 * var104[3] + (float)var113 * var104[4] + (float)var114 * var104[5]) / var53;
                     var57 = ((float)var112 * var104[6] + (float)var113 * var104[7] + (float)var114 * var104[8]) / var54;
                     var96 = this.method5942(var55, var56, var57);
                     this.method5943(var2.field6448[var32], var2.field6474[var32], var2.field6450[var32], var100, var101, var102, var96, var104, var105, var40, var41, var42, field8493);
                     var87 = field8493[0];
                     var89 = field8493[1];
                     this.method5943(var2.field6448[var33], var2.field6474[var33], var2.field6450[var33], var100, var101, var102, var96, var104, var105, var40, var41, var42, field8493);
                     var90 = field8493[0];
                     var91 = field8493[1];
                     this.method5943(var2.field6448[var34], var2.field6474[var34], var2.field6450[var34], var100, var101, var102, var96, var104, var105, var40, var41, var42, field8493);
                     var92 = field8493[0];
                     var93 = field8493[1];
                  } else if (var98 == 3) {
                     this.method6087(var2.field6448[var32], var2.field6474[var32], var2.field6450[var32], var100, var101, var102, var104, var105, var40, field8493);
                     var87 = field8493[0];
                     var89 = field8493[1];
                     this.method6087(var2.field6448[var33], var2.field6474[var33], var2.field6450[var33], var100, var101, var102, var104, var105, var40, field8493);
                     var90 = field8493[0];
                     var91 = field8493[1];
                     this.method6087(var2.field6448[var34], var2.field6474[var34], var2.field6450[var34], var100, var101, var102, var104, var105, var40, field8493);
                     var92 = field8493[0];
                     var93 = field8493[1];
                     if ((var105 & 1) == 0) {
                        if (var90 - var87 > 0.5F) {
                           --var90;
                           var94 = 1;
                        } else if (var87 - var90 > 0.5F) {
                           ++var90;
                           var94 = 2;
                        }

                        if (var92 - var87 > 0.5F) {
                           --var92;
                           var95 = 1;
                        } else if (var87 - var92 > 0.5F) {
                           ++var92;
                           var95 = 2;
                        }
                     } else {
                        if (var91 - var89 > 0.5F) {
                           --var91;
                           var94 = 1;
                        } else if (var89 - var91 > 0.5F) {
                           ++var91;
                           var94 = 2;
                        }

                        if (var93 - var89 > 0.5F) {
                           --var93;
                           var95 = 1;
                        } else if (var89 - var93 > 0.5F) {
                           ++var93;
                           var95 = 2;
                        }
                     }
                  }
               }
            }
         }

         if (var2.field6457 == null) {
            var98 = 0;
         } else {
            var98 = var2.field6457[var78];
         }

         if (var98 == 0) {
            long var63 = (long)(var19 << 2) + ((long)(var96 << 24) + (long)(var83 << 8) + (long)var82 << 32);
            var34 = var2.field6476[var78];
            var35 = var2.field6478[var78];
            var36 = var2.field6456[var78];
            class375 var103 = var69[var34];
            this.field8460[var74] = this.method4752(var2, var34, var63, var103.field1175, var103.field1174, var103.field1176, var103.field1177, var87, var89);
            var103 = var69[var35];
            this.field8461[var74] = this.method4752(var2, var35, var63 + (long)var94, var103.field1175, var103.field1174, var103.field1176, var103.field1177, var90, var91);
            var103 = var69[var36];
            this.field8462[var74] = this.method4752(var2, var36, var63 + (long)var95, var103.field1175, var103.field1174, var103.field1176, var103.field1177, var92, var93);
         } else if (var98 == 1) {
            class595 var99 = var76[var78];
            long var65 = (long)((var19 << 2) + (var99.field1924 > 0 ? 1024 : 2048) + (var99.field1923 + 256 << 12) + (var99.field1925 + 256 << 22)) + ((long)(var96 << 24) + (long)(var83 << 8) + (long)var82 << 32);
            this.field8460[var74] = this.method4752(var2, var2.field6476[var78], var65, var99.field1924, var99.field1923, var99.field1925, 0, var87, var89);
            this.field8461[var74] = this.method4752(var2, var2.field6478[var78], var65 + (long)var94, var99.field1924, var99.field1923, var99.field1925, 0, var90, var91);
            this.field8462[var74] = this.method4752(var2, var2.field6456[var78], var65 + (long)var95, var99.field1924, var99.field1923, var99.field1925, 0, var92, var93);
         }

         if (var2.field6459 != null) {
            this.field8459[var74] = var2.field6459[var78];
         }

         if (var2.field6447 != null) {
            this.field8465[var74] = var2.field6447[var78];
         }

         this.field8458[var74] = var2.field6461[var78];
         this.field8470[var74] = var85;
      }

      var74 = 0;
      var77 = -10000;

      for(var83 = 0; var83 < this.field8494; ++var83) {
         var81 = this.field8470[var83];
         if (var81 != var77) {
            ++var74;
            var77 = var81;
         }
      }

      this.field8468 = new int[var74 + 1];
      var74 = 0;
      var77 = -10000;

      for(var83 = 0; var83 < this.field8494; ++var83) {
         var81 = this.field8470[var83];
         if (var81 != var77) {
            this.field8468[var74++] = var83;
            var77 = var81;
         }
      }

      this.field8468[var74] = this.field8494;
      field8492 = null;
      this.field8438 = method4753(this.field8438, this.field8448);
      this.field8450 = method4753(this.field8450, this.field8448);
      this.field8451 = method4753(this.field8451, this.field8448);
      this.field8496 = method4741(this.field8496, this.field8448);
      this.field8454 = method4742(this.field8454, this.field8448);
      this.field8455 = method4742(this.field8455, this.field8448);
      if (var2.field6451 != null && class857.method5242(var3, this.field8435)) {
         this.field8446 = var2.method3452(false);
      }

      if (var2.field6481 != null && class857.method5248(var3, this.field8435)) {
         this.field8491 = var2.method3462();
      }

      if (var2.field6463 != null && class857.method5246(var3, this.field8435)) {
         var83 = 0;
         int[] var88 = new int[256];

         for(var82 = 0; var82 < this.field8456; ++var82) {
            var84 = var2.field6463[var8[var82]];
            if (var84 >= 0) {
               ++var88[var84];
               if (var84 > var83) {
                  var83 = var84;
               }
            }
         }

         this.field8464 = new int[var83 + 1][];

         for(var82 = 0; var82 <= var83; ++var82) {
            this.field8464[var82] = new int[var88[var82]];
            var88[var82] = 0;
         }

         for(var82 = 0; var82 < this.field8456; ++var82) {
            var84 = var2.field6463[var8[var82]];
            if (var84 >= 0) {
               this.field8464[var84][var88[var84]++] = var82;
            }
         }
      }

   }
}
