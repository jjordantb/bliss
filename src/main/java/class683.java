public class class683 extends Node {
   byte[] field7643 = new byte[128];
   class656[] field7644 = new class656[128];
   byte[] field7645 = new byte[128];
   int field7646;
   short[] field7647 = new short[128];
   class154[] field7648 = new class154[128];
   byte[] field7649 = new byte[128];
   int[] field7650 = new int[128];

   boolean method4330(class111 var1, byte[] var2, int[] var3, int var4) {
      try {
         boolean var5 = true;
         int var6 = 0;
         class656 var7 = null;

         for(int var8 = 0; var8 < 128; ++var8) {
            if (var2 == null || var2[var8] != 0) {
               int var9 = this.field7650[var8];
               if (var9 != 0) {
                  if (var9 != var6) {
                     var6 = var9--;
                     if ((var9 & 1) == 0) {
                        var7 = var1.method1354(var9 >> 2, var3, -1617127101);
                     } else {
                        var7 = var1.method1355(var9 >> 2, var3, (byte)92);
                     }

                     if (var7 == null) {
                        var5 = false;
                     }
                  }

                  if (var7 != null) {
                     this.field7644[var8] = var7;
                     this.field7650[var8] = 0;
                  }
               }
            }
         }

         return var5;
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "abs.f(" + ')');
      }
   }

   class683(byte[] var1) {
      InputStream var2 = new InputStream(var1);

      int var3;
      for(var3 = 0; var2.field10375[var3 + var2.field10376] != 0; ++var3) {
         ;
      }

      byte[] var4 = new byte[var3];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2.method6372(-12558881);
      }

      ++var2.field10376;
      ++var3;
      var5 = var2.field10376;
      var2.field10376 += var3;

      int var6;
      for(var6 = 0; var2.field10375[var2.field10376 + var6] != 0; ++var6) {
         ;
      }

      byte[] var7 = new byte[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var2.method6372(-12558881);
      }

      ++var2.field10376;
      ++var6;
      var8 = var2.field10376;
      var2.field10376 += var6;

      int var9;
      for(var9 = 0; var2.field10375[var2.field10376 + var9] != 0; ++var9) {
         ;
      }

      byte[] var10 = new byte[var9];

      for(int var11 = 0; var11 < var9; ++var11) {
         var10[var11] = var2.method6372(-12558881);
      }

      ++var2.field10376;
      ++var9;
      byte[] var36 = new byte[var9];
      int var13;
      int var14;
      if (var9 > 1) {
         var36[1] = 1;
         int var12 = 1;
         var13 = 2;

         for(var14 = 2; var14 < var9; ++var14) {
            int var15 = var2.method6371();
            if (var15 == 0) {
               var12 = var13++;
            } else {
               if (var15 <= var12) {
                  --var15;
               }

               var12 = var15;
            }

            var36[var14] = (byte)var12;
         }
      } else {
         var13 = var9;
      }

      class154[] var37 = new class154[var13];

      for(var14 = 0; var14 < var37.length; ++var14) {
         class154 var38 = var37[var14] = new class154();
         int var16 = var2.method6371();
         if (var16 > 0) {
            var38.field6504 = new byte[var16 * 2];
         }

         var16 = var2.method6371();
         if (var16 > 0) {
            var38.field6500 = new byte[2 + 2 * var16];
            var38.field6500[1] = 64;
         }
      }

      var14 = var2.method6371();
      byte[] var39 = var14 > 0 ? new byte[var14 * 2] : null;
      var14 = var2.method6371();
      byte[] var40 = var14 > 0 ? new byte[var14 * 2] : null;

      int var17;
      for(var17 = 0; var2.field10375[var17 + var2.field10376] != 0; ++var17) {
         ;
      }

      byte[] var18 = new byte[var17];

      int var19;
      for(var19 = 0; var19 < var17; ++var19) {
         var18[var19] = var2.method6372(-12558881);
      }

      ++var2.field10376;
      ++var17;
      var19 = 0;

      int var20;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.method6371();
         this.field7647[var20] = (short)var19;
      }

      var19 = 0;

      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.method6371();
         this.field7647[var20] = (short)(this.field7647[var20] + (var19 << 8));
      }

      var20 = 0;
      int var21 = 0;
      int var22 = 0;

      int var23;
      for(var23 = 0; var23 < 128; ++var23) {
         if (var20 == 0) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            var22 = var2.method6386(1692297361);
         }

         this.field7647[var23] = (short)(this.field7647[var23] + ((var22 - 1 & 2) << 14));
         this.field7650[var23] = var22;
         --var20;
      }

      var20 = 0;
      var21 = 0;
      var23 = 0;

      int var24;
      for(var24 = 0; var24 < 128; ++var24) {
         if (this.field7650[var24] != 0) {
            if (var20 == 0) {
               if (var21 < var4.length) {
                  var20 = var4[var21++];
               } else {
                  var20 = -1;
               }

               var23 = var2.field10375[var5++] - 1;
            }

            this.field7643[var24] = (byte)var23;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var24 = 0;

      for(int var25 = 0; var25 < 128; ++var25) {
         if (this.field7650[var25] != 0) {
            if (var20 == 0) {
               if (var21 < var7.length) {
                  var20 = var7[var21++];
               } else {
                  var20 = -1;
               }

               var24 = var2.field10375[var8++] + 16 << 2;
            }

            this.field7649[var25] = (byte)var24;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      class154 var41 = null;

      int var26;
      for(var26 = 0; var26 < 128; ++var26) {
         if (this.field7650[var26] != 0) {
            if (var20 == 0) {
               var41 = var37[var36[var21]];
               if (var21 < var10.length) {
                  var20 = var10[var21++];
               } else {
                  var20 = -1;
               }
            }

            this.field7648[var26] = var41;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var26 = 0;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if (var20 == 0) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            if (this.field7650[var27] > 0) {
               var26 = var2.method6371() + 1;
            }
         }

         this.field7645[var27] = (byte)var26;
         --var20;
      }

      this.field7646 = var2.method6371() + 1;

      class154 var28;
      int var29;
      for(var27 = 0; var27 < var13; ++var27) {
         var28 = var37[var27];
         if (var28.field6504 != null) {
            for(var29 = 1; var29 < var28.field6504.length; var29 += 2) {
               var28.field6504[var29] = var2.method6372(-12558881);
            }
         }

         if (var28.field6500 != null) {
            for(var29 = 3; var29 < var28.field6500.length - 2; var29 += 2) {
               var28.field6500[var29] = var2.method6372(-12558881);
            }
         }
      }

      if (var39 != null) {
         for(var27 = 1; var27 < var39.length; var27 += 2) {
            var39[var27] = var2.method6372(-12558881);
         }
      }

      if (var40 != null) {
         for(var27 = 1; var27 < var40.length; var27 += 2) {
            var40[var27] = var2.method6372(-12558881);
         }
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var28 = var37[var27];
         if (var28.field6500 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field6500.length; var29 += 2) {
               var19 = 1 + var19 + var2.method6371();
               var28.field6500[var29] = (byte)var19;
            }
         }
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var28 = var37[var27];
         if (var28.field6504 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field6504.length; var29 += 2) {
               var19 = var19 + 1 + var2.method6371();
               var28.field6504[var29] = (byte)var19;
            }
         }
      }

      byte var30;
      int var32;
      int var33;
      int var34;
      byte var46;
      Object var47;
      if (var39 != null) {
         var19 = var2.method6371();
         var39[0] = (byte)var19;

         for(var27 = 2; var27 < var39.length; var27 += 2) {
            var19 = var19 + 1 + var2.method6371();
            var39[var27] = (byte)var19;
         }

         var46 = var39[0];
         byte var42 = var39[1];

         for(var29 = 0; var29 < var46; ++var29) {
            this.field7645[var29] = (byte)(var42 * this.field7645[var29] + 32 >> 6);
         }

         for(var29 = 2; var29 < var39.length; var29 += 2) {
            var30 = var39[var29];
            byte var31 = var39[var29 + 1];
            var32 = (var30 - var46) * var42 + (var30 - var46) / 2;

            for(var33 = var46; var33 < var30; ++var33) {
               var34 = class882.method6194(var32, var30 - var46, -498753873);
               this.field7645[var33] = (byte)(this.field7645[var33] * var34 + 32 >> 6);
               var32 += var31 - var42;
            }

            var46 = var30;
            var42 = var31;
         }

         for(var29 = var46; var29 < 128; ++var29) {
            this.field7645[var29] = (byte)(this.field7645[var29] * var42 + 32 >> 6);
         }

         var47 = null;
      }

      if (var40 != null) {
         var19 = var2.method6371();
         var40[0] = (byte)var19;

         for(var27 = 2; var27 < var40.length; var27 += 2) {
            var19 = 1 + var19 + var2.method6371();
            var40[var27] = (byte)var19;
         }

         var46 = var40[0];
         int var43 = var40[1] << 1;

         int var44;
         for(var29 = 0; var29 < var46; ++var29) {
            var44 = (this.field7649[var29] & 255) + var43;
            if (var44 < 0) {
               var44 = 0;
            }

            if (var44 > 128) {
               var44 = 128;
            }

            this.field7649[var29] = (byte)var44;
         }

         for(var29 = 2; var29 < var40.length; var29 += 2) {
            var30 = var40[var29];
            int var45 = var40[var29 + 1] << 1;
            var32 = (var30 - var46) / 2 + (var30 - var46) * var43;

            for(var33 = var46; var33 < var30; ++var33) {
               var34 = class882.method6194(var32, var30 - var46, -1209989239);
               int var35 = var34 + (this.field7649[var33] & 255);
               if (var35 < 0) {
                  var35 = 0;
               }

               if (var35 > 128) {
                  var35 = 128;
               }

               this.field7649[var33] = (byte)var35;
               var32 += var45 - var43;
            }

            var46 = var30;
            var43 = var45;
         }

         for(var29 = var46; var29 < 128; ++var29) {
            var44 = var43 + (this.field7649[var29] & 255);
            if (var44 < 0) {
               var44 = 0;
            }

            if (var44 > 128) {
               var44 = 128;
            }

            this.field7649[var29] = (byte)var44;
         }

         var47 = null;
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var37[var27].field6501 = var2.method6371();
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var28 = var37[var27];
         if (var28.field6504 != null) {
            var28.field6502 = var2.method6371();
         }

         if (var28.field6500 != null) {
            var28.field6503 = var2.method6371();
         }

         if (var28.field6501 > 0) {
            var28.field6499 = var2.method6371();
         }
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var37[var27].field6506 = var2.method6371();
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var28 = var37[var27];
         if (var28.field6506 > 0) {
            var28.field6505 = var2.method6371();
         }
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var28 = var37[var27];
         if (var28.field6505 > 0) {
            var28.field6507 = var2.method6371();
         }
      }

   }

   void method4331(byte var1) {
      try {
         this.field7650 = null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abs.b(" + ')');
      }
   }
}
