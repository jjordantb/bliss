public class class388 extends class727 {
   int[] field1552;
   int[] field1553;
   int[] field1554;
   int[] field1555;
   class257 field1556;
   byte[][] field1557;
   int[] field1558;

   void method1184(byte[] var1, int[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);
      boolean var11 = false;

      for(int var12 = -var7; var12 < 0; ++var12) {
         int var13;
         byte var14;
         for(var13 = var10; var13 < 0; ++var13) {
            if ((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }

            if ((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }

            if ((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }

            if ((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }
         }

         for(var13 = var6; var13 < 0; ++var13) {
            if ((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   void method1185(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for(int var11 = -var7; var11 < 0; ++var11) {
         int var12;
         for(var12 = var10; var12 < 0; ++var12) {
            if (var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if (var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if (var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if (var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         for(var12 = var6; var12 < 0; ++var12) {
            if (var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   class388(class257 var1, class230 var2, class922[] var3, int[] var4, int[] var5) {
      super(var1, var2);
      this.field1556 = var1;
      this.field1556 = var1;
      this.field1555 = var4;
      this.field1553 = var5;
      this.field1557 = new byte[var3.length][];
      this.field1552 = new int[var3.length];
      this.field1558 = new int[var3.length];

      for(int var6 = 0; var6 < var3.length; ++var6) {
         this.field1557[var6] = var3[var6].field10275;
         this.field1552[var6] = var3[var6].field10268;
         this.field1558[var6] = var3[var6].field10272;
      }

      this.field1554 = var3[0].field10274;
   }

   void method1186(byte[] var1, int[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, class23 var14, int var15, int var16) {
      class924 var17 = (class924)var14;
      int[] var18 = var17.field10289;
      int[] var19 = var17.field10288;
      int var20 = var11 - this.field1556.field7921 * -912871679;
      int var21 = var12;
      if (var16 > var12) {
         var21 = var16;
         var6 += (var16 - var12) * 692106883 * this.field1556.field7918;
         var5 += var13 * (var16 - var12);
      }

      int var22 = var16 + var18.length < var8 + var12 ? var18.length + var16 : var8 + var12;
      boolean var23 = false;

      for(int var24 = var21; var24 < var22; ++var24) {
         int var25 = var15 + var18[var24 - var16];
         int var26 = var19[var24 - var16];
         int var27 = var7;
         int var28;
         if (var20 > var25) {
            var28 = var20 - var25;
            if (var28 >= var26) {
               var5 += var10 + var7;
               var6 += var7 + var9;
               continue;
            }

            var26 -= var28;
         } else {
            var28 = var25 - var20;
            if (var28 >= var7) {
               var5 += var10 + var7;
               var6 += var7 + var9;
               continue;
            }

            var5 += var28;
            var27 = var7 - var28;
            var6 += var28;
         }

         var28 = 0;
         if (var27 < var26) {
            var26 = var27;
         } else {
            var28 = var27 - var26;
         }

         for(int var29 = -var26; var29 < 0; ++var29) {
            byte var30;
            if ((var30 = var1[var5++]) != 0) {
               var2[var6++] = var3[var30 & 255];
            } else {
               ++var6;
            }
         }

         var5 += var10 + var28;
         var6 += var9 + var28;
      }

   }

   void method1187(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class23 var13, int var14, int var15) {
      class924 var16 = (class924)var13;
      int[] var17 = var16.field10289;
      int[] var18 = var16.field10288;
      int var19 = var10 - this.field1556.field7921 * -912871679;
      int var20 = var11;
      if (var15 > var11) {
         var20 = var15;
         var5 += this.field1556.field7918 * 692106883 * (var15 - var11);
         var4 += var12 * (var15 - var11);
      }

      int var21 = var15 + var17.length < var11 + var7 ? var17.length + var15 : var11 + var7;

      for(int var22 = var20; var22 < var21; ++var22) {
         int var23 = var17[var22 - var15] + var14;
         int var24 = var18[var22 - var15];
         int var25 = var6;
         int var26;
         if (var19 > var23) {
            var26 = var19 - var23;
            if (var26 >= var24) {
               var4 += var6 + var9;
               var5 += var8 + var6;
               continue;
            }

            var24 -= var26;
         } else {
            var26 = var23 - var19;
            if (var26 >= var6) {
               var4 += var9 + var6;
               var5 += var8 + var6;
               continue;
            }

            var4 += var26;
            var25 = var6 - var26;
            var5 += var26;
         }

         var26 = 0;
         if (var25 < var24) {
            var24 = var25;
         } else {
            var26 = var25 - var24;
         }

         for(int var27 = -var24; var27 < 0; ++var27) {
            if (var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         var4 += var26 + var4;
         var5 += var26 + var8;
      }

   }

   void method1675(char var1, int var2, int var3, int var4, boolean var5) {
      if (this.field1556.field7914 != null) {
         var2 += this.field1558[var1];
         var3 += this.field1552[var1];
         int var6 = this.field1555[var1];
         int var7 = this.field1553[var1];
         int var8 = this.field1556.field7918 * 692106883;
         int var9 = var3 * var8 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if (var3 < this.field1556.field7923 * -1278653805) {
            var13 = this.field1556.field7923 * -1278653805 - var3;
            var7 -= var13;
            var3 = this.field1556.field7923 * -1278653805;
            var12 += var13 * var6;
            var9 += var8 * var13;
         }

         if (var7 + var3 > this.field1556.field7924 * 63686679) {
            var7 -= var3 + var7 - 63686679 * this.field1556.field7924;
         }

         if (var2 < this.field1556.field7921 * -912871679) {
            var13 = -912871679 * this.field1556.field7921 - var2;
            var6 -= var13;
            var2 = this.field1556.field7921 * -912871679;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if (var2 + var6 > -1416794725 * this.field1556.field7938) {
            var13 = var2 + var6 - this.field1556.field7938 * -1416794725;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if (var6 > 0 && var7 > 0) {
            if (var5) {
               this.method1185(this.field1557[var1], this.field1556.field7914, var4, var12, var9, var6, var7, var10, var11);
            } else {
               this.method1184(this.field1557[var1], this.field1556.field7914, this.field1554, var12, var9, var6, var7, var10, var11);
            }
         }
      }

   }

   void method1676(char var1, int var2, int var3, int var4, boolean var5) {
      if (this.field1556.field7914 != null) {
         var2 += this.field1558[var1];
         var3 += this.field1552[var1];
         int var6 = this.field1555[var1];
         int var7 = this.field1553[var1];
         int var8 = this.field1556.field7918 * 692106883;
         int var9 = var3 * var8 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if (var3 < this.field1556.field7923 * -1278653805) {
            var13 = this.field1556.field7923 * -1278653805 - var3;
            var7 -= var13;
            var3 = this.field1556.field7923 * -1278653805;
            var12 += var13 * var6;
            var9 += var8 * var13;
         }

         if (var7 + var3 > this.field1556.field7924 * 63686679) {
            var7 -= var3 + var7 - 63686679 * this.field1556.field7924;
         }

         if (var2 < this.field1556.field7921 * -912871679) {
            var13 = -912871679 * this.field1556.field7921 - var2;
            var6 -= var13;
            var2 = this.field1556.field7921 * -912871679;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if (var2 + var6 > -1416794725 * this.field1556.field7938) {
            var13 = var2 + var6 - this.field1556.field7938 * -1416794725;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if (var6 > 0 && var7 > 0) {
            if (var5) {
               this.method1185(this.field1557[var1], this.field1556.field7914, var4, var12, var9, var6, var7, var10, var11);
            } else {
               this.method1184(this.field1557[var1], this.field1556.field7914, this.field1554, var12, var9, var6, var7, var10, var11);
            }
         }
      }

   }

   void method1674(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8) {
      if (this.field1556.field7914 != null) {
         if (var6 == null) {
            this.method1680(var1, var2, var3, var4, var5);
         } else {
            var2 += this.field1558[var1];
            var3 += this.field1552[var1];
            int var9 = this.field1555[var1];
            int var10 = this.field1553[var1];
            int var11 = this.field1556.field7918 * 692106883;
            int var12 = var3 * var11 + var2;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if (var3 < this.field1556.field7923 * -1278653805) {
               var16 = this.field1556.field7923 * -1278653805 - var3;
               var10 -= var16;
               var3 = -1278653805 * this.field1556.field7923;
               var15 += var9 * var16;
               var12 += var11 * var16;
            }

            if (var10 + var3 > this.field1556.field7924 * 63686679) {
               var10 -= var10 + var3 - this.field1556.field7924 * 63686679;
            }

            if (var2 < -912871679 * this.field1556.field7921) {
               var16 = -912871679 * this.field1556.field7921 - var2;
               var9 -= var16;
               var2 = this.field1556.field7921 * -912871679;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if (var9 + var2 > -1416794725 * this.field1556.field7938) {
               var16 = var2 + var9 - this.field1556.field7938 * -1416794725;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if (var9 > 0 && var10 > 0) {
               if (var5) {
                  this.method1187(this.field1557[var1], this.field1556.field7914, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.field1555[var1], var6, var7, var8);
               } else {
                  this.method1186(this.field1557[var1], this.field1556.field7914, this.field1554, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.field1555[var1], var6, var7, var8);
               }
            }
         }
      }

   }

   void method1679(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8) {
      if (this.field1556.field7914 != null) {
         if (var6 == null) {
            this.method1680(var1, var2, var3, var4, var5);
         } else {
            var2 += this.field1558[var1];
            var3 += this.field1552[var1];
            int var9 = this.field1555[var1];
            int var10 = this.field1553[var1];
            int var11 = this.field1556.field7918 * 692106883;
            int var12 = var3 * var11 + var2;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if (var3 < this.field1556.field7923 * -1278653805) {
               var16 = this.field1556.field7923 * -1278653805 - var3;
               var10 -= var16;
               var3 = -1278653805 * this.field1556.field7923;
               var15 += var9 * var16;
               var12 += var11 * var16;
            }

            if (var10 + var3 > this.field1556.field7924 * 63686679) {
               var10 -= var10 + var3 - this.field1556.field7924 * 63686679;
            }

            if (var2 < -912871679 * this.field1556.field7921) {
               var16 = -912871679 * this.field1556.field7921 - var2;
               var9 -= var16;
               var2 = this.field1556.field7921 * -912871679;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if (var9 + var2 > -1416794725 * this.field1556.field7938) {
               var16 = var2 + var9 - this.field1556.field7938 * -1416794725;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if (var9 > 0 && var10 > 0) {
               if (var5) {
                  this.method1187(this.field1557[var1], this.field1556.field7914, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.field1555[var1], var6, var7, var8);
               } else {
                  this.method1186(this.field1557[var1], this.field1556.field7914, this.field1554, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.field1555[var1], var6, var7, var8);
               }
            }
         }
      }

   }

   void method1680(char var1, int var2, int var3, int var4, boolean var5) {
      if (this.field1556.field7914 != null) {
         var2 += this.field1558[var1];
         var3 += this.field1552[var1];
         int var6 = this.field1555[var1];
         int var7 = this.field1553[var1];
         int var8 = this.field1556.field7918 * 692106883;
         int var9 = var3 * var8 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if (var3 < this.field1556.field7923 * -1278653805) {
            var13 = this.field1556.field7923 * -1278653805 - var3;
            var7 -= var13;
            var3 = this.field1556.field7923 * -1278653805;
            var12 += var13 * var6;
            var9 += var8 * var13;
         }

         if (var7 + var3 > this.field1556.field7924 * 63686679) {
            var7 -= var3 + var7 - 63686679 * this.field1556.field7924;
         }

         if (var2 < this.field1556.field7921 * -912871679) {
            var13 = -912871679 * this.field1556.field7921 - var2;
            var6 -= var13;
            var2 = this.field1556.field7921 * -912871679;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if (var2 + var6 > -1416794725 * this.field1556.field7938) {
            var13 = var2 + var6 - this.field1556.field7938 * -1416794725;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if (var6 > 0 && var7 > 0) {
            if (var5) {
               this.method1185(this.field1557[var1], this.field1556.field7914, var4, var12, var9, var6, var7, var10, var11);
            } else {
               this.method1184(this.field1557[var1], this.field1556.field7914, this.field1554, var12, var9, var6, var7, var10, var11);
            }
         }
      }

   }

   public static final void method1188(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = var2 - var0;
         int var7 = var3 - var1;
         if (var6 == 0) {
            if (var7 != 0) {
               class647.method5487(var0, var1, var3, var4, -65962515);
            }
         } else if (var7 == 0) {
            class321.method858(var0, var2, var1, var4, 1547095223);
         } else {
            int var8 = (var7 << 12) / var6;
            int var9 = var1 - (var8 * var0 >> 12);
            int var10;
            int var11;
            if (var0 < class216.field1416 * -1424479739) {
               var10 = var9 + (var8 * class216.field1416 * -1424479739 >> 12);
               var11 = -1424479739 * class216.field1416;
            } else if (var0 > 1135094847 * class216.field1413) {
               var10 = (var8 * 1135094847 * class216.field1413 >> 12) + var9;
               var11 = class216.field1413 * 1135094847;
            } else {
               var10 = var1;
               var11 = var0;
            }

            int var12;
            int var13;
            if (var2 < class216.field1416 * -1424479739) {
               var12 = (var8 * class216.field1416 * -1424479739 >> 12) + var9;
               var13 = -1424479739 * class216.field1416;
            } else if (var2 > 1135094847 * class216.field1413) {
               var12 = (class216.field1413 * 1135094847 * var8 >> 12) + var9;
               var13 = 1135094847 * class216.field1413;
            } else {
               var12 = var3;
               var13 = var2;
            }

            if (var10 < 1155384281 * class216.field1414) {
               var10 = 1155384281 * class216.field1414;
               var11 = (class216.field1414 * 1155384281 - var9 << 12) / var8;
            } else if (var10 > class216.field1415 * -1062447355) {
               var10 = -1062447355 * class216.field1415;
               var11 = (class216.field1415 * -1062447355 - var9 << 12) / var8;
            }

            if (var12 < class216.field1414 * 1155384281) {
               var12 = 1155384281 * class216.field1414;
               var13 = (class216.field1414 * 1155384281 - var9 << 12) / var8;
            } else if (var12 > class216.field1415 * -1062447355) {
               var12 = class216.field1415 * -1062447355;
               var13 = (class216.field1415 * -1062447355 - var9 << 12) / var8;
            }

            class650.method5635(var11, var10, var13, var12, var4, -207106920);
         }

      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "xg.u(" + ')');
      }
   }
}
