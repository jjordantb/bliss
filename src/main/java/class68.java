public class class68 extends class568 {
   class639 field1874;
   class291 field1875;
   int field1876;
   int field1877;
   int field1878;
   class13 field1879;
   class387 field1880;
   int field1881;
   int field1882;
   int field1883;
   class269 field1884;
   class847 field1885;
   class847 field1886;
   float[][] field1887;
   float[][] field1888;
   float[][] field1889;
   class907 field1890;
   class782 field1891;
   class539 field1892;

   void method1347(short var1) {
      if (this.field1879.field6830) {
         this.field1890.method6362(var1, 16711935);
      } else {
         this.field1890.method6363(var1, 1368367793);
      }

   }

   void method1348(int var1, int var2, int var3, boolean[][] var4) {
      if (this.field1880 != null && this.field1877 <= var1 + var3 && this.field1878 >= var1 - var3 && this.field1883 <= var2 + var3 && this.field1876 >= var2 - var3) {
         for(int var5 = this.field1883; var5 <= this.field1876; ++var5) {
            for(int var6 = this.field1877; var6 <= this.field1878; ++var6) {
               int var7 = var6 - var1;
               int var8 = var5 - var2;
               if (var7 > -var3 && var7 < var3 && var8 > -var3 && var8 < var3 && var4[var7 + var3][var8 + var3]) {
                  this.field1879.method3656((int)(this.field1874.method5908(608404512) * 255.0F) << 24);
                  this.field1879.method3631(this.field1885, (class847)null, this.field1886, (class847)null);
                  this.field1879.method3637(this.field1880, 4, 0, this.field1882);
                  return;
               }
            }
         }
      }

   }

   void method1349(int var1, int var2, int var3, int var4, int var5, int var6) {
      long var7 = -1L;
      int var9 = var5 + (var3 << this.field1875.field7228 * -2137349879);
      int var10 = var6 + (var4 << this.field1875.field7228 * -2137349879);
      int var11 = this.field1875.method3887(var9, var10, -1731289320);
      if ((var5 & 127) == 0 || (var6 & 127) == 0) {
         var7 = ((long)var10 & 65535L) << 16 | (long)var9 & 65535L;
         class568 var12 = this.field1892.method2331(var7);
         if (var12 != null) {
            this.method1347(((class129)var12).field1084);
            return;
         }
      }

      short var29 = (short)(this.field1881++);
      if (var7 != -1L) {
         this.field1892.method2337(new class129(var29), var7);
      }

      float var13;
      float var14;
      float var15;
      float var16;
      float var17;
      float var18;
      float var19;
      float var20;
      float var21;
      float var22;
      float var23;
      if (var5 == 0 && var6 == 0) {
         var13 = this.field1887[var1][var2];
         var14 = this.field1888[var1][var2];
         var15 = this.field1889[var1][var2];
      } else if (var5 == this.field1875.field7227 * -1212653763 && var6 == 0) {
         var13 = this.field1887[var1 + 1][var2];
         var14 = this.field1888[var1 + 1][var2];
         var15 = this.field1889[var1 + 1][var2];
      } else if (var5 == this.field1875.field7227 * -1212653763 && var6 == this.field1875.field7227 * -1212653763) {
         var13 = this.field1887[var1 + 1][var2 + 1];
         var14 = this.field1888[var1 + 1][var2 + 1];
         var15 = this.field1889[var1 + 1][var2 + 1];
      } else if (var5 == 0 && var6 == this.field1875.field7227 * -1212653763) {
         var13 = this.field1887[var1][var2 + 1];
         var14 = this.field1888[var1][var2 + 1];
         var15 = this.field1889[var1][var2 + 1];
      } else {
         var16 = (float)var5 / (float)(this.field1875.field7227 * -1212653763);
         var17 = (float)var6 / (float)(this.field1875.field7227 * -1212653763);
         var18 = this.field1887[var1][var2];
         var19 = this.field1888[var1][var2];
         var20 = this.field1889[var1][var2];
         var21 = this.field1887[var1 + 1][var2];
         var22 = this.field1888[var1 + 1][var2];
         var23 = this.field1889[var1 + 1][var2];
         var18 += (this.field1887[var1][var2 + 1] - var18) * var16;
         var19 += (this.field1888[var1][var2 + 1] - var19) * var16;
         var20 += (this.field1889[var1][var2 + 1] - var20) * var16;
         var21 += (this.field1887[var1 + 1][var2 + 1] - var21) * var16;
         var22 += (this.field1888[var1 + 1][var2 + 1] - var22) * var16;
         var23 += (this.field1889[var1 + 1][var2 + 1] - var23) * var16;
         var13 = var18 + (var21 - var18) * var17;
         var14 = var19 + (var22 - var19) * var17;
         var15 = var20 + (var23 - var20) * var17;
      }

      var16 = (float)(this.field1874.method5902(823958259) - var9);
      var17 = (float)(this.field1874.method5901(820885236) - var11);
      var18 = (float)(this.field1874.method5904((byte)86) - var10);
      var19 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17 + var18 * var18));
      var20 = 1.0F / var19;
      var16 *= var20;
      var17 *= var20;
      var18 *= var20;
      var21 = var19 / (float)this.field1874.method5907(-1220224399);
      var22 = 1.0F - var21 * var21;
      if (var22 < 0.0F) {
         var22 = 0.0F;
      }

      var23 = var16 * var13 + var17 * var14 + var18 * var15;
      if (var23 < 0.0F) {
         var23 = 0.0F;
      }

      float var24 = var23 * var22 * 2.0F;
      if (var24 > 1.0F) {
         var24 = 1.0F;
      }

      int var25 = this.field1874.method5905(-2114796775);
      int var26 = (int)(var24 * (float)(var25 >> 16 & 255));
      if (var26 > 255) {
         var26 = 255;
      }

      int var27 = (int)(var24 * (float)(var25 >> 8 & 255));
      if (var27 > 255) {
         var27 = 255;
      }

      int var28 = (int)(var24 * (float)(var25 & 255));
      if (var28 > 255) {
         var28 = 255;
      }

      if (this.field1879.field6830) {
         this.field1891.method2468((float)var9);
         this.field1891.method2468((float)var11);
         this.field1891.method2468((float)var10);
      } else {
         this.field1891.method2469((float)var9);
         this.field1891.method2469((float)var11);
         this.field1891.method2469((float)var10);
      }

      this.field1891.method6361(var26);
      this.field1891.method6361(var27);
      this.field1891.method6361(var28);
      this.field1891.method6361(255);
      this.method1347(var29);
   }

   class68(class13 var1, class291 var2, class639 var3, int[] var4) {
      this.field1879 = var1;
      this.field1874 = var3;
      this.field1875 = var2;
      int var5 = this.field1874.method5907(-1472086638) - (var2.field7227 * -1212653763 >> 1);
      this.field1877 = this.field1874.method5902(823958259) - var5 >> var2.field7228 * -2137349879;
      this.field1878 = this.field1874.method5902(823958259) + var5 >> var2.field7228 * -2137349879;
      this.field1883 = this.field1874.method5904((byte)91) - var5 >> var2.field7228 * -2137349879;
      this.field1876 = this.field1874.method5904((byte)105) + var5 >> var2.field7228 * -2137349879;
      int var6 = this.field1878 - this.field1877 + 1;
      int var7 = this.field1876 - this.field1883 + 1;
      this.field1887 = new float[var6 + 1][var7 + 1];
      this.field1888 = new float[var6 + 1][var7 + 1];
      this.field1889 = new float[var6 + 1][var7 + 1];

      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var8 = 0; var8 <= var7; ++var8) {
         var9 = var8 + this.field1883;
         if (var9 > 0 && var9 < this.field1875.field7225 * -1148794921 - 1) {
            for(var10 = 0; var10 <= var6; ++var10) {
               var11 = var10 + this.field1877;
               if (var11 > 0 && var11 < this.field1875.field7226 * -506105871 - 1) {
                  var12 = var2.method3888(var11 + 1, var9, (byte)-68) - var2.method3888(var11 - 1, var9, (byte)-35);
                  var13 = var2.method3888(var11, var9 + 1, (byte)-82) - var2.method3888(var11, var9 - 1, (byte)-122);
                  float var14 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + 65536 + var13 * var13)));
                  this.field1887[var10][var8] = (float)var12 * var14;
                  this.field1888[var10][var8] = -256.0F * var14;
                  this.field1889[var10][var8] = (float)var13 * var14;
               }
            }
         }
      }

      var8 = 0;

      for(var9 = this.field1883; var9 <= this.field1876; ++var9) {
         if (var9 >= 0 && var9 < var2.field7225 * -1148794921) {
            for(var10 = this.field1877; var10 <= this.field1878; ++var10) {
               if (var10 >= 0 && var10 < var2.field7226 * -506105871) {
                  var11 = var4[var8];
                  int[] var18 = var2.field10495[var10][var9];
                  if (var18 != null && var11 != 0) {
                     if (var11 == 1) {
                        var13 = 0;

                        while(var13 < var18.length) {
                           if (var18[var13++] != -1 && var18[var13++] != -1 && var18[var13++] != -1) {
                              this.field1882 += 3;
                           }
                        }
                     } else {
                        this.field1882 += 3;
                     }
                  }
               }

               ++var8;
            }
         } else {
            var8 += this.field1878 - this.field1877;
         }
      }

      if (this.field1882 > 0) {
         this.field1890 = new class907(this.field1882 * 2);
         this.field1891 = new class782(this.field1882 * 16);
         this.field1892 = new class539(class18.method3687(this.field1882, (byte)16));
         var9 = 0;
         var8 = 0;

         for(var10 = this.field1883; var10 <= this.field1876; ++var10) {
            if (var10 >= 0 && var10 < var2.field7225 * -1148794921) {
               var11 = 0;

               for(var12 = this.field1877; var12 <= this.field1878; ++var12) {
                  if (var12 >= 0 && var12 < var2.field7226 * -506105871) {
                     var13 = var4[var8];
                     int[] var19 = var2.field10495[var12][var10];
                     if (var19 != null && var13 != 0) {
                        if (var13 != 1) {
                           if (var13 == 3) {
                              this.method1349(var11, var9, var12, var10, 0, 0);
                              this.method1349(var11, var9, var12, var10, var2.field7227 * -1212653763, 0);
                              this.method1349(var11, var9, var12, var10, 0, var2.field7227 * -1212653763);
                           } else if (var13 == 2) {
                              this.method1349(var11, var9, var12, var10, var2.field7227 * -1212653763, 0);
                              this.method1349(var11, var9, var12, var10, var2.field7227 * -1212653763, var2.field7227 * -1212653763);
                              this.method1349(var11, var9, var12, var10, 0, 0);
                           } else if (var13 == 5) {
                              this.method1349(var11, var9, var12, var10, var2.field7227 * -1212653763, var2.field7227 * -1212653763);
                              this.method1349(var11, var9, var12, var10, 0, var2.field7227 * -1212653763);
                              this.method1349(var11, var9, var12, var10, var2.field7227 * -1212653763, 0);
                           } else if (var13 == 4) {
                              this.method1349(var11, var9, var12, var10, 0, var2.field7227 * -1212653763);
                              this.method1349(var11, var9, var12, var10, 0, 0);
                              this.method1349(var11, var9, var12, var10, var2.field7227 * -1212653763, var2.field7227 * -1212653763);
                           }
                        } else {
                           int[] var15 = var2.field10504[var12][var10];
                           int[] var16 = var2.field10498[var12][var10];
                           int var17 = 0;

                           label108:
                           while(true) {
                              while(true) {
                                 if (var17 >= var19.length) {
                                    break label108;
                                 }

                                 if (var19[var17] != -1 && var19[var17 + 1] != -1 && var19[var17 + 2] != -1) {
                                    this.method1349(var11, var9, var12, var10, var15[var17], var16[var17]);
                                    ++var17;
                                    this.method1349(var11, var9, var12, var10, var15[var17], var16[var17]);
                                    ++var17;
                                    this.method1349(var11, var9, var12, var10, var15[var17], var16[var17]);
                                    ++var17;
                                 } else {
                                    var17 += 3;
                                 }
                              }
                           }
                        }
                     }
                  }

                  ++var8;
                  ++var11;
               }
            } else {
               var8 += this.field1878 - this.field1877;
            }

            ++var9;
         }

         this.field1880 = this.field1879.method3667(5123, this.field1890.field10375, this.field1890.field10376 * 385051775, false);
         this.field1884 = this.field1879.method3627(16, this.field1891.field10375, this.field1891.field10376 * 385051775, false);
         this.field1885 = new class847(this.field1884, 5126, 3, 0);
         this.field1886 = new class847(this.field1884, 5121, 4, 12);
      } else {
         this.field1880 = null;
         this.field1884 = null;
         this.field1885 = null;
         this.field1886 = null;
      }

      this.field1891 = null;
      this.field1890 = null;
      this.field1892 = null;
      this.field1889 = null;
      this.field1888 = null;
      this.field1887 = null;
   }
}
