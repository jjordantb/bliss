public class class25 {
   public class396[] field6445;
   public int field6446 = 0;
   public short[] field6447;
   public int[] field6448;
   public short[] field6449;
   public int[] field6450;
   public int[] field6451;
   public short[] field6452;
   public int field6453 = 0;
   public byte[] field6454;
   public short[] field6455;
   public short[] field6456;
   public byte[] field6457;
   public int field6458 = 0;
   public byte[] field6459;
   public byte[] field6460;
   public short[] field6461;
   public int field6462 = 12;
   public int[] field6463;
   public byte field6464 = 0;
   public byte[] field6465;
   public int field6466 = 0;
   public byte[] field6467;
   public short[] field6468;
   public int[] field6469;
   public short[] field6470;
   public int[] field6471;
   public int[] field6472;
   public int[] field6473;
   public int[] field6474;
   public int[] field6475;
   public short[] field6476;
   public byte[] field6477;
   public short[] field6478;
   public class933[] field6479;
   public int[] field6480;
   public class606[] field6481;

   class25(byte[] var1) {
      if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method3461(var1);
      } else {
         this.method3449(var1);
      }

   }

   public class25(int var1, int var2, int var3) {
      this.field6448 = new int[var1];
      this.field6474 = new int[var1];
      this.field6450 = new int[var1];
      this.field6451 = new int[var1];
      this.field6476 = new short[var2];
      this.field6478 = new short[var2];
      this.field6456 = new short[var2];
      this.field6457 = new byte[var2];
      this.field6465 = new byte[var2];
      this.field6459 = new byte[var2];
      this.field6467 = new byte[var2];
      this.field6461 = new short[var2];
      this.field6449 = new short[var2];
      this.field6463 = new int[var2];
      if (var3 > 0) {
         this.field6454 = new byte[var3];
         this.field6455 = new short[var3];
         this.field6468 = new short[var3];
         this.field6470 = new short[var3];
         this.field6471 = new int[var3];
         this.field6472 = new int[var3];
         this.field6473 = new int[var3];
         this.field6477 = new byte[var3];
         this.field6460 = new byte[var3];
         this.field6469 = new int[var3];
         this.field6475 = new int[var3];
         this.field6480 = new int[var3];
      }

   }

   public class25(class25[] var1, int var2) {
      this.field6446 = 0;
      this.field6453 = 0;
      this.field6466 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      this.field6464 = -1;

      int var12;
      for(var12 = 0; var12 < var2; ++var12) {
         class25 var13 = var1[var12];
         if (var13 != null) {
            this.field6446 += var13.field6446;
            this.field6453 += var13.field6453;
            this.field6466 += var13.field6466;
            if (var13.field6479 != null) {
               var3 += var13.field6479.length;
            }

            if (var13.field6445 != null) {
               var4 += var13.field6445.length;
            }

            if (var13.field6481 != null) {
               var5 += var13.field6481.length;
            }

            var6 |= var13.field6457 != null;
            if (var13.field6465 != null) {
               var7 = true;
            } else {
               if (this.field6464 == -1) {
                  this.field6464 = var13.field6464;
               }

               if (this.field6464 != var13.field6464) {
                  var7 = true;
               }
            }

            var8 |= var13.field6459 != null;
            var9 |= var13.field6467 != null;
            var10 |= var13.field6449 != null;
            var11 |= var13.field6463 != null;
         }
      }

      this.field6448 = new int[this.field6446];
      this.field6474 = new int[this.field6446];
      this.field6450 = new int[this.field6446];
      this.field6451 = new int[this.field6446];
      this.field6452 = new short[this.field6446];
      this.field6476 = new short[this.field6453];
      this.field6478 = new short[this.field6453];
      this.field6456 = new short[this.field6453];
      if (var6) {
         this.field6457 = new byte[this.field6453];
      }

      if (var7) {
         this.field6465 = new byte[this.field6453];
      }

      if (var8) {
         this.field6459 = new byte[this.field6453];
      }

      if (var9) {
         this.field6467 = new byte[this.field6453];
      }

      this.field6461 = new short[this.field6453];
      if (var10) {
         this.field6449 = new short[this.field6453];
      }

      if (var11) {
         this.field6463 = new int[this.field6453];
      }

      this.field6447 = new short[this.field6453];
      if (this.field6466 > 0) {
         this.field6454 = new byte[this.field6466];
         this.field6455 = new short[this.field6466];
         this.field6468 = new short[this.field6466];
         this.field6470 = new short[this.field6466];
         this.field6471 = new int[this.field6466];
         this.field6472 = new int[this.field6466];
         this.field6473 = new int[this.field6466];
         this.field6477 = new byte[this.field6466];
         this.field6460 = new byte[this.field6466];
         this.field6469 = new int[this.field6466];
         this.field6475 = new int[this.field6466];
         this.field6480 = new int[this.field6466];
      }

      if (var5 > 0) {
         this.field6481 = new class606[var5];
      }

      if (var3 > 0) {
         this.field6479 = new class933[var3];
      }

      if (var4 > 0) {
         this.field6445 = new class396[var4];
      }

      this.field6446 = 0;
      this.field6453 = 0;
      this.field6466 = 0;
      var3 = 0;
      var4 = 0;
      var5 = 0;

      int var22;
      for(var12 = 0; var12 < var2; ++var12) {
         short var19 = (short)(1 << var12);
         class25 var14 = var1[var12];
         if (var14 != null) {
            int var15;
            if (var14.field6481 != null) {
               for(var15 = 0; var15 < var14.field6481.length; ++var15) {
                  class606 var16 = var14.field6481[var15];
                  this.field6481[var5++] = var16.method4786(var16.field8569 + this.field6453, 214949543);
               }
            }

            for(var15 = 0; var15 < var14.field6453; ++var15) {
               if (var6 && var14.field6457 != null) {
                  this.field6457[this.field6453] = var14.field6457[var15];
               }

               if (var7) {
                  if (var14.field6465 != null) {
                     this.field6465[this.field6453] = var14.field6465[var15];
                  } else {
                     this.field6465[this.field6453] = var14.field6464;
                  }
               }

               if (var8 && var14.field6459 != null) {
                  this.field6459[this.field6453] = var14.field6459[var15];
               }

               if (var10) {
                  if (var14.field6449 != null) {
                     this.field6449[this.field6453] = var14.field6449[var15];
                  } else {
                     this.field6449[this.field6453] = -1;
                  }
               }

               if (var11) {
                  if (var14.field6463 != null) {
                     this.field6463[this.field6453] = var14.field6463[var15];
                  } else {
                     this.field6463[this.field6453] = -1;
                  }
               }

               this.field6476[this.field6453] = (short)this.method3446(var14, var14.field6476[var15], var19);
               this.field6478[this.field6453] = (short)this.method3446(var14, var14.field6478[var15], var19);
               this.field6456[this.field6453] = (short)this.method3446(var14, var14.field6456[var15], var19);
               this.field6447[this.field6453] = var19;
               this.field6461[this.field6453] = var14.field6461[var15];
               ++this.field6453;
            }

            if (var14.field6479 != null) {
               for(var15 = 0; var15 < var14.field6479.length; ++var15) {
                  var22 = this.method3446(var14, var14.field6479[var15].field10326, var19);
                  int var17 = this.method3446(var14, var14.field6479[var15].field10327, var19);
                  int var18 = this.method3446(var14, var14.field6479[var15].field10328, var19);
                  this.field6479[var3] = var14.field6479[var15].method6285(var22, var17, var18, -1991744488);
                  ++var3;
               }
            }

            if (var14.field6445 != null) {
               for(var15 = 0; var15 < var14.field6445.length; ++var15) {
                  var22 = this.method3446(var14, var14.field6445[var15].field6511, var19);
                  this.field6445[var4] = var14.field6445[var15].method3494(var22, (byte)0);
                  ++var4;
               }
            }
         }
      }

      var12 = 0;
      this.field6458 = this.field6446;

      for(int var20 = 0; var20 < var2; ++var20) {
         short var21 = (short)(1 << var20);
         class25 var24 = var1[var20];
         if (var24 != null) {
            for(var22 = 0; var22 < var24.field6453; ++var22) {
               if (var9) {
                  this.field6467[var12++] = (byte)(var24.field6467 != null && var24.field6467[var22] != -1 ? var24.field6467[var22] + this.field6466 : -1);
               }
            }

            for(var22 = 0; var22 < var24.field6466; ++var22) {
               byte var23 = this.field6454[this.field6466] = var24.field6454[var22];
               if (var23 == 0) {
                  this.field6455[this.field6466] = (short)this.method3446(var24, var24.field6455[var22], var21);
                  this.field6468[this.field6466] = (short)this.method3446(var24, var24.field6468[var22], var21);
                  this.field6470[this.field6466] = (short)this.method3446(var24, var24.field6470[var22], var21);
               }

               if (var23 >= 1 && var23 <= 3) {
                  this.field6455[this.field6466] = var24.field6455[var22];
                  this.field6468[this.field6466] = var24.field6468[var22];
                  this.field6470[this.field6466] = var24.field6470[var22];
                  this.field6471[this.field6466] = var24.field6471[var22];
                  this.field6472[this.field6466] = var24.field6472[var22];
                  this.field6473[this.field6466] = var24.field6473[var22];
                  this.field6477[this.field6466] = var24.field6477[var22];
                  this.field6460[this.field6466] = var24.field6460[var22];
                  this.field6469[this.field6466] = var24.field6469[var22];
               }

               if (var23 == 2) {
                  this.field6475[this.field6466] = var24.field6475[var22];
                  this.field6480[this.field6466] = var24.field6480[var22];
               }

               ++this.field6466;
            }
         }
      }

   }

   final int method3446(class25 var1, int var2, short var3) {
      int var4 = var1.field6448[var2];
      int var5 = var1.field6474[var2];
      int var6 = var1.field6450[var2];

      for(int var7 = 0; var7 < this.field6446; ++var7) {
         if (var4 == this.field6448[var7] && var5 == this.field6474[var7] && var6 == this.field6450[var7]) {
            this.field6452[var7] |= var3;
            return var7;
         }
      }

      this.field6448[this.field6446] = var4;
      this.field6474[this.field6446] = var5;
      this.field6450[this.field6446] = var6;
      this.field6452[this.field6446] = var3;
      this.field6451[this.field6446] = var1.field6451 != null ? var1.field6451[var2] : -1;
      return this.field6446++;
   }

   void method3447(InputStream var1, InputStream var2) {
      short var3 = 0;
      short var4 = 0;
      short var5 = 0;
      short var6 = 0;

      for(int var7 = 0; var7 < this.field6453; ++var7) {
         int var8 = var2.method6371();
         if (var8 == 1) {
            var3 = (short)(var1.method6422(590991010) + var6);
            var4 = (short)(var1.method6422(590991010) + var3);
            var5 = (short)(var1.method6422(590991010) + var4);
            var6 = var5;
            this.field6476[var7] = var3;
            this.field6478[var7] = var4;
            this.field6456[var7] = var5;
            if (var3 > this.field6458) {
               this.field6458 = var3;
            }

            if (var4 > this.field6458) {
               this.field6458 = var4;
            }

            if (var5 > this.field6458) {
               this.field6458 = var5;
            }
         }

         if (var8 == 2) {
            var4 = var5;
            var5 = (short)(var1.method6422(590991010) + var6);
            var6 = var5;
            this.field6476[var7] = var3;
            this.field6478[var7] = var4;
            this.field6456[var7] = var5;
            if (var5 > this.field6458) {
               this.field6458 = var5;
            }
         }

         if (var8 == 3) {
            var3 = var5;
            var5 = (short)(var1.method6422(590991010) + var6);
            var6 = var5;
            this.field6476[var7] = var3;
            this.field6478[var7] = var4;
            this.field6456[var7] = var5;
            if (var5 > this.field6458) {
               this.field6458 = var5;
            }
         }

         if (var8 == 4) {
            short var9 = var3;
            var3 = var4;
            var4 = var9;
            var5 = (short)(var1.method6422(590991010) + var6);
            var6 = var5;
            this.field6476[var7] = var3;
            this.field6478[var7] = var9;
            this.field6456[var7] = var5;
            if (var5 > this.field6458) {
               this.field6458 = var5;
            }
         }
      }

      ++this.field6458;
   }

   void method3448(InputStream var1, InputStream var2, InputStream var3, InputStream var4, InputStream var5, InputStream var6) {
      for(int var7 = 0; var7 < this.field6466; ++var7) {
         int var8 = this.field6454[var7] & 255;
         if (var8 == 0) {
            this.field6455[var7] = (short)var1.method6374();
            this.field6468[var7] = (short)var1.method6374();
            this.field6470[var7] = (short)var1.method6374();
         }

         if (var8 == 1) {
            this.field6455[var7] = (short)var2.method6374();
            this.field6468[var7] = (short)var2.method6374();
            this.field6470[var7] = (short)var2.method6374();
            if (this.field6462 < 15) {
               this.field6471[var7] = var3.method6374();
               if (this.field6462 < 14) {
                  this.field6472[var7] = var3.method6374();
               } else {
                  this.field6472[var7] = var3.method6390((byte)-55);
               }

               this.field6473[var7] = var3.method6374();
            } else {
               this.field6471[var7] = var3.method6390((byte)73);
               this.field6472[var7] = var3.method6390((byte)-3);
               this.field6473[var7] = var3.method6390((byte)48);
            }

            this.field6477[var7] = var4.method6372(-12558881);
            this.field6460[var7] = var5.method6372(-12558881);
            this.field6469[var7] = var6.method6372(-12558881);
         }

         if (var8 == 2) {
            this.field6455[var7] = (short)var2.method6374();
            this.field6468[var7] = (short)var2.method6374();
            this.field6470[var7] = (short)var2.method6374();
            if (this.field6462 < 15) {
               this.field6471[var7] = var3.method6374();
               if (this.field6462 < 14) {
                  this.field6472[var7] = var3.method6374();
               } else {
                  this.field6472[var7] = var3.method6390((byte)-37);
               }

               this.field6473[var7] = var3.method6374();
            } else {
               this.field6471[var7] = var3.method6390((byte)-91);
               this.field6472[var7] = var3.method6390((byte)78);
               this.field6473[var7] = var3.method6390((byte)37);
            }

            this.field6477[var7] = var4.method6372(-12558881);
            this.field6460[var7] = var5.method6372(-12558881);
            this.field6469[var7] = var6.method6372(-12558881);
            this.field6475[var7] = var6.method6372(-12558881);
            this.field6480[var7] = var6.method6372(-12558881);
         }

         if (var8 == 3) {
            this.field6455[var7] = (short)var2.method6374();
            this.field6468[var7] = (short)var2.method6374();
            this.field6470[var7] = (short)var2.method6374();
            if (this.field6462 < 15) {
               this.field6471[var7] = var3.method6374();
               if (this.field6462 < 14) {
                  this.field6472[var7] = var3.method6374();
               } else {
                  this.field6472[var7] = var3.method6390((byte)6);
               }

               this.field6473[var7] = var3.method6374();
            } else {
               this.field6471[var7] = var3.method6390((byte)-35);
               this.field6472[var7] = var3.method6390((byte)-11);
               this.field6473[var7] = var3.method6390((byte)-24);
            }

            this.field6477[var7] = var4.method6372(-12558881);
            this.field6460[var7] = var5.method6372(-12558881);
            this.field6469[var7] = var6.method6372(-12558881);
         }
      }

   }

   void method3449(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      InputStream var4 = new InputStream(var1);
      InputStream var5 = new InputStream(var1);
      InputStream var6 = new InputStream(var1);
      InputStream var7 = new InputStream(var1);
      InputStream var8 = new InputStream(var1);
      var4.field10376 = var1.length - 18;
      this.field6446 = var4.method6374();
      this.field6453 = var4.method6374();
      this.field6466 = var4.method6371();
      int var9 = var4.method6371();
      int var10 = var4.method6371();
      int var11 = var4.method6371();
      int var12 = var4.method6371();
      int var13 = var4.method6371();
      int var14 = var4.method6374();
      int var15 = var4.method6374();
      int var16 = var4.method6374();
      int var17 = var4.method6374();
      byte var18 = 0;
      int var42 = var18 + this.field6446;
      int var20 = var42;
      var42 += this.field6453;
      int var21 = var42;
      if (var10 == 255) {
         var42 += this.field6453;
      }

      int var22 = var42;
      if (var12 == 1) {
         var42 += this.field6453;
      }

      int var23 = var42;
      if (var9 == 1) {
         var42 += this.field6453;
      }

      int var24 = var42;
      if (var13 == 1) {
         var42 += this.field6446;
      }

      int var25 = var42;
      if (var11 == 1) {
         var42 += this.field6453;
      }

      int var26 = var42;
      var42 += var17;
      int var27 = var42;
      var42 += this.field6453 * 2;
      int var28 = var42;
      var42 += this.field6466 * 6;
      int var29 = var42;
      var42 += var14;
      int var30 = var42;
      var42 += var15;
      int var10000 = var42 + var16;
      this.field6448 = new int[this.field6446];
      this.field6474 = new int[this.field6446];
      this.field6450 = new int[this.field6446];
      this.field6476 = new short[this.field6453];
      this.field6478 = new short[this.field6453];
      this.field6456 = new short[this.field6453];
      if (this.field6466 > 0) {
         this.field6454 = new byte[this.field6466];
         this.field6455 = new short[this.field6466];
         this.field6468 = new short[this.field6466];
         this.field6470 = new short[this.field6466];
      }

      if (var13 == 1) {
         this.field6451 = new int[this.field6446];
      }

      if (var9 == 1) {
         this.field6457 = new byte[this.field6453];
         this.field6467 = new byte[this.field6453];
         this.field6449 = new short[this.field6453];
      }

      if (var10 == 255) {
         this.field6465 = new byte[this.field6453];
      } else {
         this.field6464 = (byte)var10;
      }

      if (var11 == 1) {
         this.field6459 = new byte[this.field6453];
      }

      if (var12 == 1) {
         this.field6463 = new int[this.field6453];
      }

      this.field6461 = new short[this.field6453];
      var4.field10376 = var18;
      var5.field10376 = var29;
      var6.field10376 = var30;
      var7.field10376 = var42;
      var8.field10376 = var24;
      int var32 = 0;
      int var33 = 0;
      int var34 = 0;

      int var35;
      int var36;
      int var39;
      for(var35 = 0; var35 < this.field6446; ++var35) {
         var36 = var4.method6371();
         int var37 = 0;
         if ((var36 & 1) != 0) {
            var37 = var5.method6422(590991010);
         }

         int var38 = 0;
         if ((var36 & 2) != 0) {
            var38 = var6.method6422(590991010);
         }

         var39 = 0;
         if ((var36 & 4) != 0) {
            var39 = var7.method6422(590991010);
         }

         this.field6448[var35] = var32 + var37;
         this.field6474[var35] = var33 + var38;
         this.field6450[var35] = var34 + var39;
         var32 = this.field6448[var35];
         var33 = this.field6474[var35];
         var34 = this.field6450[var35];
         if (var13 == 1) {
            this.field6451[var35] = var8.method6371();
         }
      }

      var4.field10376 = var27;
      var5.field10376 = var23;
      var6.field10376 = var21;
      var7.field10376 = var25;
      var8.field10376 = var22;

      for(var35 = 0; var35 < this.field6453; ++var35) {
         this.field6461[var35] = (short)var4.method6374();
         if (var9 == 1) {
            var36 = var5.method6371();
            if ((var36 & 1) == 1) {
               this.field6457[var35] = 1;
               var2 = true;
            } else {
               this.field6457[var35] = 0;
            }

            if ((var36 & 2) == 2) {
               this.field6467[var35] = (byte)(var36 >> 2);
               this.field6449[var35] = this.field6461[var35];
               this.field6461[var35] = 127;
               if (this.field6449[var35] != -1) {
                  var3 = true;
               }
            } else {
               this.field6467[var35] = -1;
               this.field6449[var35] = -1;
            }
         }

         if (var10 == 255) {
            this.field6465[var35] = var6.method6372(-12558881);
         }

         if (var11 == 1) {
            this.field6459[var35] = var7.method6372(-12558881);
         }

         if (var12 == 1) {
            this.field6463[var35] = var8.method6371();
         }
      }

      this.field6458 = -1;
      var4.field10376 = var26;
      var5.field10376 = var20;
      short var43 = 0;
      short var44 = 0;
      short var45 = 0;
      short var46 = 0;

      int var40;
      for(var39 = 0; var39 < this.field6453; ++var39) {
         var40 = var5.method6371();
         if (var40 == 1) {
            var43 = (short)(var4.method6422(590991010) + var46);
            var44 = (short)(var4.method6422(590991010) + var43);
            var45 = (short)(var4.method6422(590991010) + var44);
            var46 = var45;
            this.field6476[var39] = var43;
            this.field6478[var39] = var44;
            this.field6456[var39] = var45;
            if (var43 > this.field6458) {
               this.field6458 = var43;
            }

            if (var44 > this.field6458) {
               this.field6458 = var44;
            }

            if (var45 > this.field6458) {
               this.field6458 = var45;
            }
         }

         if (var40 == 2) {
            var44 = var45;
            var45 = (short)(var4.method6422(590991010) + var46);
            var46 = var45;
            this.field6476[var39] = var43;
            this.field6478[var39] = var44;
            this.field6456[var39] = var45;
            if (var45 > this.field6458) {
               this.field6458 = var45;
            }
         }

         if (var40 == 3) {
            var43 = var45;
            var45 = (short)(var4.method6422(590991010) + var46);
            var46 = var45;
            this.field6476[var39] = var43;
            this.field6478[var39] = var44;
            this.field6456[var39] = var45;
            if (var45 > this.field6458) {
               this.field6458 = var45;
            }
         }

         if (var40 == 4) {
            short var41 = var43;
            var43 = var44;
            var44 = var41;
            var45 = (short)(var4.method6422(590991010) + var46);
            var46 = var45;
            this.field6476[var39] = var43;
            this.field6478[var39] = var41;
            this.field6456[var39] = var45;
            if (var45 > this.field6458) {
               this.field6458 = var45;
            }
         }
      }

      ++this.field6458;
      var4.field10376 = var28;

      for(var39 = 0; var39 < this.field6466; ++var39) {
         this.field6454[var39] = 0;
         this.field6455[var39] = (short)var4.method6374();
         this.field6468[var39] = (short)var4.method6374();
         this.field6470[var39] = (short)var4.method6374();
      }

      if (this.field6467 != null) {
         boolean var47 = false;

         for(var40 = 0; var40 < this.field6453; ++var40) {
            int var48 = this.field6467[var40] & 255;
            if (var48 != 255) {
               if ((this.field6455[var48] & '\uffff') == this.field6476[var40] && (this.field6468[var48] & '\uffff') == this.field6478[var40] && (this.field6470[var48] & '\uffff') == this.field6456[var40]) {
                  this.field6467[var40] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if (!var47) {
            this.field6467 = null;
         }
      }

      if (!var3) {
         this.field6449 = null;
      }

      if (!var2) {
         this.field6457 = null;
      }

   }

   public int method3450(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field6446; ++var4) {
         if (this.field6448[var4] == var1 && this.field6474[var4] == var2 && this.field6450[var4] == var3) {
            return var4;
         }
      }

      this.field6448[this.field6446] = var1;
      this.field6474[this.field6446] = var2;
      this.field6450[this.field6446] = var3;
      this.field6458 = this.field6446 + 1;
      return this.field6446++;
   }

   public int method3451(int var1, int var2, int var3, byte var4, byte var5, short var6, byte var7, short var8) {
      this.field6476[this.field6453] = (short)var1;
      this.field6478[this.field6453] = (short)var2;
      this.field6456[this.field6453] = (short)var3;
      this.field6457[this.field6453] = var4;
      this.field6467[this.field6453] = var5;
      this.field6461[this.field6453] = var6;
      this.field6459[this.field6453] = var7;
      this.field6449[this.field6453] = var8;
      return this.field6453++;
   }

   public int[][] method3452(boolean var1) {
      int[] var2 = new int[256];
      int var3 = 0;
      int var4 = var1 ? this.field6446 : this.field6458;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.field6451[var5];
         if (var6 >= 0) {
            ++var2[var6];
            if (var6 > var3) {
               var3 = var6;
            }
         }
      }

      int[][] var8 = new int[var3 + 1][];

      for(var6 = 0; var6 <= var3; ++var6) {
         var8[var6] = new int[var2[var6]];
         var2[var6] = 0;
      }

      for(var6 = 0; var6 < var4; ++var6) {
         int var7 = this.field6451[var6];
         if (var7 >= 0) {
            var8[var7][var2[var7]++] = var6;
         }
      }

      return var8;
   }

   public int[][] method3453() {
      int[] var1 = new int[256];
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < this.field6453; ++var3) {
         var4 = this.field6463[var3];
         if (var4 >= 0) {
            ++var1[var4];
            if (var4 > var2) {
               var2 = var4;
            }
         }
      }

      int[][] var6 = new int[var2 + 1][];

      for(var4 = 0; var4 <= var2; ++var4) {
         var6[var4] = new int[var1[var4]];
         var1[var4] = 0;
      }

      for(var4 = 0; var4 < this.field6453; ++var4) {
         int var5 = this.field6463[var4];
         if (var5 >= 0) {
            var6[var5][var1[var5]++] = var4;
         }
      }

      return var6;
   }

   public static class25 method3454(class180 var0, int var1, int var2) {
      byte[] var3 = var0.method3285(var1, var2, (byte)-97);
      return var3 == null ? null : new class25(var3);
   }

   public void method3455(short var1, short var2) {
      if (this.field6449 != null) {
         for(int var3 = 0; var3 < this.field6453; ++var3) {
            if (this.field6449[var3] == var1) {
               this.field6449[var3] = var2;
            }
         }
      }

   }

   public void method3456(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field6446; ++var4) {
         this.field6448[var4] += var1;
         this.field6474[var4] += var2;
         this.field6450[var4] += var3;
      }

   }

   public void method3457(int var1, int var2, int var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      if (var3 != 0) {
         var4 = class703.field3413[var3];
         var5 = class703.field3404[var3];

         for(var6 = 0; var6 < this.field6446; ++var6) {
            var7 = this.field6474[var6] * var4 + this.field6448[var6] * var5 >> 14;
            this.field6474[var6] = this.field6474[var6] * var5 - this.field6448[var6] * var4 >> 14;
            this.field6448[var6] = var7;
         }
      }

      if (var1 != 0) {
         var4 = class703.field3413[var1];
         var5 = class703.field3404[var1];

         for(var6 = 0; var6 < this.field6446; ++var6) {
            var7 = this.field6474[var6] * var5 - this.field6450[var6] * var4 >> 14;
            this.field6450[var6] = this.field6474[var6] * var4 + this.field6450[var6] * var5 >> 14;
            this.field6474[var6] = var7;
         }
      }

      if (var2 != 0) {
         var4 = class703.field3413[var2];
         var5 = class703.field3404[var2];

         for(var6 = 0; var6 < this.field6446; ++var6) {
            var7 = this.field6450[var6] * var4 + this.field6448[var6] * var5 >> 14;
            this.field6450[var6] = this.field6450[var6] * var5 - this.field6448[var6] * var4 >> 14;
            this.field6448[var6] = var7;
         }
      }

   }

   public void method3458(int var1) {
      int var2;
      for(var2 = 0; var2 < this.field6446; ++var2) {
         this.field6448[var2] <<= var1;
         this.field6474[var2] <<= var1;
         this.field6450[var2] <<= var1;
      }

      if (this.field6466 > 0 && this.field6471 != null) {
         for(var2 = 0; var2 < this.field6471.length; ++var2) {
            this.field6471[var2] <<= var1;
            this.field6472[var2] <<= var1;
            if (this.field6454[var2] != 1) {
               this.field6473[var2] <<= var1;
            }
         }
      }

   }

   public void method3459(short var1, short var2) {
      for(int var3 = 0; var3 < this.field6453; ++var3) {
         if (this.field6461[var3] == var1) {
            this.field6461[var3] = var2;
         }
      }

   }

   public byte method3460(short var1, short var2, short var3, short var4, short var5, short var6, byte var7, byte var8, byte var9) {
      if (this.field6466 >= 255) {
         throw new IllegalStateException();
      } else {
         this.field6454[this.field6466] = 3;
         this.field6455[this.field6466] = var1;
         this.field6468[this.field6466] = var2;
         this.field6470[this.field6466] = var3;
         this.field6471[this.field6466] = var4;
         this.field6472[this.field6466] = var5;
         this.field6473[this.field6466] = var6;
         this.field6477[this.field6466] = var7;
         this.field6460[this.field6466] = var8;
         this.field6469[this.field6466] = var9;
         return (byte)(this.field6466++);
      }
   }

   void method3461(byte[] var1) {
      InputStream var2 = new InputStream(var1);
      InputStream var3 = new InputStream(var1);
      InputStream var4 = new InputStream(var1);
      InputStream var5 = new InputStream(var1);
      InputStream var6 = new InputStream(var1);
      InputStream var7 = new InputStream(var1);
      InputStream var8 = new InputStream(var1);
      var2.field10376 = var1.length - 23;
      this.field6446 = var2.method6374();
      this.field6453 = var2.method6374();
      this.field6466 = var2.method6371();
      int var9 = var2.method6371();
      boolean var10 = (var9 & 1) == 1;
      boolean var11 = (var9 & 2) == 2;
      boolean var12 = (var9 & 4) == 4;
      boolean var13 = (var9 & 8) == 8;
      if (var13) {
         var2.field10376 -= 7;
         this.field6462 = var2.method6371();
         var2.field10376 += 6;
      }

      int var14 = var2.method6371();
      int var15 = var2.method6371();
      int var16 = var2.method6371();
      int var17 = var2.method6371();
      int var18 = var2.method6371();
      int var19 = var2.method6374();
      int var20 = var2.method6374();
      int var21 = var2.method6374();
      int var22 = var2.method6374();
      int var23 = var2.method6374();
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27;
      if (this.field6466 > 0) {
         this.field6454 = new byte[this.field6466];
         var2.field10376 = 0;

         for(var27 = 0; var27 < this.field6466; ++var27) {
            byte var28 = this.field6454[var27] = var2.method6372(-12558881);
            if (var28 == 0) {
               ++var24;
            }

            if (var28 >= 1 && var28 <= 3) {
               ++var25;
            }

            if (var28 == 2) {
               ++var26;
            }
         }
      }

      var27 = this.field6466;
      int var59 = var27;
      var27 += this.field6446;
      int var29 = var27;
      if (var10) {
         var27 += this.field6453;
      }

      int var30 = var27;
      var27 += this.field6453;
      int var31 = var27;
      if (var14 == 255) {
         var27 += this.field6453;
      }

      int var32 = var27;
      if (var16 == 1) {
         var27 += this.field6453;
      }

      int var33 = var27;
      if (var18 == 1) {
         var27 += this.field6446;
      }

      int var34 = var27;
      if (var15 == 1) {
         var27 += this.field6453;
      }

      int var35 = var27;
      var27 += var22;
      int var36 = var27;
      if (var17 == 1) {
         var27 += this.field6453 * 2;
      }

      int var37 = var27;
      var27 += var23;
      int var38 = var27;
      var27 += this.field6453 * 2;
      int var39 = var27;
      var27 += var19;
      int var40 = var27;
      var27 += var20;
      int var41 = var27;
      var27 += var21;
      int var42 = var27;
      var27 += var24 * 6;
      int var43 = var27;
      var27 += var25 * 6;
      byte var44 = 6;
      if (this.field6462 == 14) {
         var44 = 7;
      } else if (this.field6462 >= 15) {
         var44 = 9;
      }

      int var45 = var27;
      var27 += var25 * var44;
      int var46 = var27;
      var27 += var25;
      int var47 = var27;
      var27 += var25;
      int var48 = var27;
      var27 += var25 + var26 * 2;
      this.field6448 = new int[this.field6446];
      this.field6474 = new int[this.field6446];
      this.field6450 = new int[this.field6446];
      this.field6476 = new short[this.field6453];
      this.field6478 = new short[this.field6453];
      this.field6456 = new short[this.field6453];
      if (var18 == 1) {
         this.field6451 = new int[this.field6446];
      }

      if (var10) {
         this.field6457 = new byte[this.field6453];
      }

      if (var14 == 255) {
         this.field6465 = new byte[this.field6453];
      } else {
         this.field6464 = (byte)var14;
      }

      if (var15 == 1) {
         this.field6459 = new byte[this.field6453];
      }

      if (var16 == 1) {
         this.field6463 = new int[this.field6453];
      }

      if (var17 == 1) {
         this.field6449 = new short[this.field6453];
      }

      if (var17 == 1 && this.field6466 > 0) {
         this.field6467 = new byte[this.field6453];
      }

      this.field6461 = new short[this.field6453];
      if (this.field6466 > 0) {
         this.field6455 = new short[this.field6466];
         this.field6468 = new short[this.field6466];
         this.field6470 = new short[this.field6466];
         if (var25 > 0) {
            this.field6471 = new int[var25];
            this.field6472 = new int[var25];
            this.field6473 = new int[var25];
            this.field6477 = new byte[var25];
            this.field6460 = new byte[var25];
            this.field6469 = new int[var25];
         }

         if (var26 > 0) {
            this.field6475 = new int[var26];
            this.field6480 = new int[var26];
         }
      }

      var2.field10376 = var59;
      var3.field10376 = var39;
      var4.field10376 = var40;
      var5.field10376 = var41;
      var6.field10376 = var33;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < this.field6446; ++var53) {
         var54 = var2.method6371();
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.method6422(590991010);
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.method6422(590991010);
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.method6422(590991010);
         }

         this.field6448[var53] = var50 + var55;
         this.field6474[var53] = var51 + var56;
         this.field6450[var53] = var52 + var57;
         var50 = this.field6448[var53];
         var51 = this.field6474[var53];
         var52 = this.field6450[var53];
         if (var18 == 1) {
            this.field6451[var53] = var6.method6371();
         }
      }

      var2.field10376 = var38;
      var3.field10376 = var29;
      var4.field10376 = var31;
      var5.field10376 = var34;
      var6.field10376 = var32;
      var7.field10376 = var36;
      var8.field10376 = var37;

      for(var53 = 0; var53 < this.field6453; ++var53) {
         this.field6461[var53] = (short)var2.method6374();
         if (var10) {
            this.field6457[var53] = var3.method6372(-12558881);
         }

         if (var14 == 255) {
            this.field6465[var53] = var4.method6372(-12558881);
         }

         if (var15 == 1) {
            this.field6459[var53] = var5.method6372(-12558881);
         }

         if (var16 == 1) {
            this.field6463[var53] = var6.method6371();
         }

         if (var17 == 1) {
            this.field6449[var53] = (short)(var7.method6374() - 1);
         }

         if (this.field6467 != null) {
            if (this.field6449[var53] != -1) {
               this.field6467[var53] = (byte)(var8.method6371() - 1);
            } else {
               this.field6467[var53] = -1;
            }
         }
      }

      this.field6458 = -1;
      var2.field10376 = var35;
      var3.field10376 = var30;
      this.method3447(var2, var3);
      var2.field10376 = var42;
      var3.field10376 = var43;
      var4.field10376 = var45;
      var5.field10376 = var46;
      var6.field10376 = var47;
      var7.field10376 = var48;
      this.method3448(var2, var3, var4, var5, var6, var7);
      var2.field10376 = var27;
      if (var11) {
         var53 = var2.method6371();
         if (var53 > 0) {
            this.field6479 = new class933[var53];

            for(var54 = 0; var54 < var53; ++var54) {
               var55 = var2.method6374();
               var56 = var2.method6374();
               byte var60;
               if (var14 == 255) {
                  var60 = this.field6465[var56];
               } else {
                  var60 = (byte)var14;
               }

               this.field6479[var54] = new class933(var55, this.field6476[var56], this.field6478[var56], this.field6456[var56], var60);
            }
         }

         var54 = var2.method6371();
         if (var54 > 0) {
            this.field6445 = new class396[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               var56 = var2.method6374();
               var57 = var2.method6374();
               this.field6445[var55] = new class396(var56, var57);
            }
         }
      }

      if (var12) {
         var53 = var2.method6371();
         if (var53 > 0) {
            this.field6481 = new class606[var53];

            for(var54 = 0; var54 < var53; ++var54) {
               var55 = var2.method6374();
               var56 = var2.method6374();
               var57 = var2.method6371();
               byte var58 = var2.method6372(-12558881);
               this.field6481[var54] = new class606(var55, var56, var57, var58);
            }
         }
      }

   }

   public int[][] method3462() {
      int[] var1 = new int[256];
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < this.field6481.length; ++var3) {
         var4 = this.field6481[var3].field8568;
         if (var4 >= 0) {
            ++var1[var4];
            if (var4 > var2) {
               var2 = var4;
            }
         }
      }

      int[][] var6 = new int[var2 + 1][];

      for(var4 = 0; var4 <= var2; ++var4) {
         var6[var4] = new int[var1[var4]];
         var1[var4] = 0;
      }

      for(var4 = 0; var4 < this.field6481.length; ++var4) {
         int var5 = this.field6481[var4].field8568;
         if (var5 >= 0) {
            var6[var5][var1[var5]++] = var4;
         }
      }

      return var6;
   }
}
