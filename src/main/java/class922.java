public class class922 {
   public int field10268;
   public int field10269;
   public int field10270;
   public int field10271;
   public int field10272;
   public int field10273;
   public int[] field10274;
   public byte[] field10275;
   public byte[] field10276;

   public static class922 method6234(class180 var0, int var1) {
      byte[] var2 = var0.method3264(var1, (byte)17);
      return var2 == null ? null : method6237(var2)[0];
   }

   public void method6235() {
      byte[] var1 = this.field10275;
      int var2;
      int var3;
      int var4;
      int var5;
      if (this.field10276 == null) {
         for(var2 = (this.field10273 >> 1) - 1; var2 >= 0; --var2) {
            var3 = var2 * this.field10269;
            var4 = (this.field10273 - var2 - 1) * this.field10269;

            for(var5 = -this.field10269; var5 < 0; ++var5) {
               byte var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var8 = this.field10276;

         for(var3 = (this.field10273 >> 1) - 1; var3 >= 0; --var3) {
            var4 = var3 * this.field10269;
            var5 = (this.field10273 - var3 - 1) * this.field10269;

            for(int var9 = -this.field10269; var9 < 0; ++var9) {
               byte var7 = var1[var4];
               var1[var4] = var1[var5];
               var1[var5] = var7;
               var7 = var8[var4];
               var8[var4] = var8[var5];
               var8[var5] = var7;
               ++var4;
               ++var5;
            }
         }
      }

      var2 = this.field10268;
      this.field10268 = this.field10270;
      this.field10270 = var2;
   }

   public static class922[] method6236(class180 var0, int var1) {
      byte[] var2 = var0.method3264(var1, (byte)80);
      return var2 == null ? null : method6237(var2);
   }

   public static class922[] method6237(byte[] var0) {
      class907 var1 = new class907(var0);
      var1.field10376 = (var0.length - 2) * 116413311;
      int var2 = var1.method6374();
      class922[] var3 = new class922[var2];

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var3[var4] = new class922();
      }

      var1.field10376 = (var0.length - 7 - var2 * 8) * 116413311;
      var4 = var1.method6374();
      int var5 = var1.method6374();
      int var6 = (var1.method6371() & 255) + 1;

      int var7;
      for(var7 = 0; var7 < var2; ++var7) {
         var3[var7].field10272 = var1.method6374();
      }

      for(var7 = 0; var7 < var2; ++var7) {
         var3[var7].field10268 = var1.method6374();
      }

      for(var7 = 0; var7 < var2; ++var7) {
         var3[var7].field10269 = var1.method6374();
      }

      for(var7 = 0; var7 < var2; ++var7) {
         var3[var7].field10273 = var1.method6374();
      }

      for(var7 = 0; var7 < var2; ++var7) {
         class922 var8 = var3[var7];
         var8.field10271 = var4 - var8.field10269 - var8.field10272;
         var8.field10270 = var5 - var8.field10273 - var8.field10268;
      }

      var1.field10376 = (var0.length - 7 - var2 * 8 - (var6 - 1) * 3) * 116413311;
      int[] var17 = new int[var6];

      int var16;
      for(var16 = 1; var16 < var6; ++var16) {
         var17[var16] = var1.method6390((byte)-47);
         if (var17[var16] == 0) {
            var17[var16] = 1;
         }
      }

      for(var16 = 0; var16 < var2; ++var16) {
         var3[var16].field10274 = var17;
      }

      var1.field10376 = 0;

      for(var16 = 0; var16 < var2; ++var16) {
         class922 var9 = var3[var16];
         int var10 = var9.field10269 * var9.field10273;
         var9.field10275 = new byte[var10];
         int var11 = var1.method6371();
         int var13;
         if ((var11 & 2) == 0) {
            int var18;
            if ((var11 & 1) == 0) {
               for(var18 = 0; var18 < var10; ++var18) {
                  var9.field10275[var18] = var1.method6372(-12558881);
               }
            } else {
               for(var18 = 0; var18 < var9.field10269; ++var18) {
                  for(var13 = 0; var13 < var9.field10273; ++var13) {
                     var9.field10275[var18 + var13 * var9.field10269] = var1.method6372(-12558881);
                  }
               }
            }
         } else {
            boolean var12 = false;
            var9.field10276 = new byte[var10];
            if ((var11 & 1) == 0) {
               for(var13 = 0; var13 < var10; ++var13) {
                  var9.field10275[var13] = var1.method6372(-12558881);
               }

               for(var13 = 0; var13 < var10; ++var13) {
                  byte var14 = var9.field10276[var13] = var1.method6372(-12558881);
                  var12 |= var14 != -1;
               }
            } else {
               int var19;
               for(var13 = 0; var13 < var9.field10269; ++var13) {
                  for(var19 = 0; var19 < var9.field10273; ++var19) {
                     var9.field10275[var13 + var19 * var9.field10269] = var1.method6372(-12558881);
                  }
               }

               for(var13 = 0; var13 < var9.field10269; ++var13) {
                  for(var19 = 0; var19 < var9.field10273; ++var19) {
                     byte var15 = var9.field10276[var13 + var19 * var9.field10269] = var1.method6372(-12558881);
                     var12 |= var15 != -1;
                  }
               }
            }

            if (!var12) {
               var9.field10276 = null;
            }
         }
      }

      return var3;
   }

   public int method6238() {
      return this.field10269 + this.field10272 + this.field10271;
   }

   public void method6239() {
      int var1 = this.method6238();
      int var2 = this.method6249();
      if (this.field10269 != var1 || this.field10273 != var2) {
         byte[] var3 = new byte[var1 * var2];
         int var5;
         int var6;
         int var7;
         if (this.field10276 != null) {
            byte[] var9 = new byte[var1 * var2];
            var5 = 0;

            while(true) {
               if (var5 >= this.field10273) {
                  this.field10276 = var9;
                  break;
               }

               var6 = var5 * this.field10269;
               var7 = (var5 + this.field10268) * var1 + this.field10272;

               for(int var8 = 0; var8 < this.field10269; ++var8) {
                  var3[var7] = this.field10275[var6];
                  var9[var7++] = this.field10276[var6++];
               }

               ++var5;
            }
         } else {
            for(int var4 = 0; var4 < this.field10273; ++var4) {
               var5 = var4 * this.field10269;
               var6 = (var4 + this.field10268) * var1 + this.field10272;

               for(var7 = 0; var7 < this.field10269; ++var7) {
                  var3[var6++] = this.field10275[var5++];
               }
            }
         }

         this.field10270 = 0;
         this.field10268 = 0;
         this.field10271 = 0;
         this.field10272 = 0;
         this.field10269 = var1;
         this.field10273 = var2;
         this.field10275 = var3;
      }

   }

   public void method6240(int var1) {
      int var2 = this.method6238();
      int var3 = this.method6249();
      if (this.field10269 != var2 || this.field10273 != var3) {
         int var4 = var1;
         if (var1 > this.field10272) {
            var4 = this.field10272;
         }

         int var5 = var1;
         if (var1 + this.field10272 + this.field10269 > var2) {
            var5 = var2 - this.field10272 - this.field10269;
         }

         int var6 = var1;
         if (var1 > this.field10268) {
            var6 = this.field10268;
         }

         int var7 = var1;
         if (var1 + this.field10268 + this.field10273 > var3) {
            var7 = var3 - this.field10268 - this.field10273;
         }

         int var8 = this.field10269 + var4 + var5;
         int var9 = this.field10273 + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         int var12;
         int var13;
         int var14;
         if (this.field10276 == null) {
            for(int var16 = 0; var16 < this.field10273; ++var16) {
               var12 = var16 * this.field10269;
               var13 = (var16 + var6) * var8 + var4;

               for(var14 = 0; var14 < this.field10269; ++var14) {
                  var10[var13++] = this.field10275[var12++];
               }
            }
         } else {
            byte[] var11 = new byte[var8 * var9];
            var12 = 0;

            while(true) {
               if (var12 >= this.field10273) {
                  this.field10276 = var11;
                  break;
               }

               var13 = var12 * this.field10269;
               var14 = (var12 + var6) * var8 + var4;

               for(int var15 = 0; var15 < this.field10269; ++var15) {
                  var11[var14] = this.field10276[var13];
                  var10[var14++] = this.field10275[var13++];
               }

               ++var12;
            }
         }

         this.field10272 -= var4;
         this.field10268 -= var6;
         this.field10271 -= var5;
         this.field10270 -= var7;
         this.field10269 = var8;
         this.field10273 = var9;
         this.field10275 = var10;
      }

   }

   public void method6241(int var1) {
      int var2 = -1;
      int var3;
      int var5;
      int var6;
      int var7;
      if (this.field10274.length < 255) {
         for(var3 = 0; var3 < this.field10274.length; ++var3) {
            if (this.field10274[var3] == var1) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field10274.length;
            int[] var16 = new int[this.field10274.length + 1];
            class901.method6355(this.field10274, 0, var16, 0, this.field10274.length);
            this.field10274 = var16;
            var16[var2] = var1;
         }
      } else {
         var3 = Integer.MAX_VALUE;
         int var4 = var1 >> 16 & 255;
         var5 = var1 >> 8 & 255;
         var6 = var1 & 255;

         for(var7 = 0; var7 < this.field10274.length; ++var7) {
            int var8 = this.field10274[var7];
            int var9 = var8 >> 16 & 255;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            int var12 = var4 - var9;
            if (var12 < 0) {
               var12 = -var12;
            }

            int var13 = var5 - var10;
            if (var13 < 0) {
               var13 = -var13;
            }

            int var14 = var6 - var11;
            if (var14 < 0) {
               var14 = -var14;
            }

            int var15 = var12 + var13 + var14;
            if (var15 < var3) {
               var3 = var15;
               var2 = var7;
            }
         }
      }

      var3 = 0;
      byte[] var17 = new byte[this.field10269 * this.field10273];

      for(var5 = 0; var5 < this.field10273; ++var5) {
         for(var6 = 0; var6 < this.field10269; ++var6) {
            var7 = this.field10275[var3] & 255;
            if (this.field10274[var7] == 0) {
               if (var6 > 0 && this.field10274[this.field10275[var3 - 1] & 255] != 0) {
                  var7 = var2;
               } else if (var5 > 0 && this.field10274[this.field10275[var3 - this.field10269] & 255] != 0) {
                  var7 = var2;
               } else if (var6 < this.field10269 - 1 && this.field10274[this.field10275[var3 + 1] & 255] != 0) {
                  var7 = var2;
               } else if (var5 < this.field10273 - 1 && this.field10274[this.field10275[var3 + this.field10269] & 255] != 0) {
                  var7 = var2;
               }
            }

            var17[var3++] = (byte)var7;
         }
      }

      this.field10275 = var17;
   }

   public static class922 method6242(class180 var0, int var1, int var2) {
      byte[] var3 = var0.method3285(var1, var2, (byte)-43);
      return var3 == null ? null : method6237(var3)[0];
   }

   public void method6243(int var1) {
      int var2 = -1;
      int var3;
      int var4;
      int var5;
      if (this.field10274.length < 255) {
         for(var3 = 0; var3 < this.field10274.length; ++var3) {
            if (this.field10274[var3] == var1) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field10274.length;
            int[] var16 = new int[this.field10274.length + 1];
            class901.method6355(this.field10274, 0, var16, 0, this.field10274.length);
            this.field10274 = var16;
            var16[var2] = var1;
         }
      } else {
         var3 = Integer.MAX_VALUE;
         var4 = var1 >> 16 & 255;
         var5 = var1 >> 8 & 255;
         int var6 = var1 & 255;

         for(int var7 = 0; var7 < this.field10274.length; ++var7) {
            int var8 = this.field10274[var7];
            int var9 = var8 >> 16 & 255;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            int var12 = var4 - var9;
            if (var12 < 0) {
               var12 = -var12;
            }

            int var13 = var5 - var10;
            if (var13 < 0) {
               var13 = -var13;
            }

            int var14 = var6 - var11;
            if (var14 < 0) {
               var14 = -var14;
            }

            int var15 = var12 + var13 + var14;
            if (var15 < var3) {
               var3 = var15;
               var2 = var7;
            }
         }
      }

      for(var3 = this.field10273 - 1; var3 > 0; --var3) {
         var4 = var3 * this.field10269;

         for(var5 = this.field10269 - 1; var5 > 0; --var5) {
            if (this.field10274[this.field10275[var5 + var4] & 255] == 0 && this.field10274[this.field10275[var5 + var4 - 1 - this.field10269] & 255] != 0) {
               this.field10275[var5 + var4] = (byte)var2;
            }
         }
      }

   }

   public void method6244() {
      byte[] var1 = new byte[this.field10269 * this.field10273];
      int var2 = 0;
      int var3;
      int var4;
      if (this.field10276 == null) {
         for(var3 = 0; var3 < this.field10269; ++var3) {
            for(var4 = this.field10273 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.field10275[var3 + var4 * this.field10269];
            }
         }

         this.field10275 = var1;
      } else {
         byte[] var6 = new byte[this.field10269 * this.field10273];

         for(var4 = 0; var4 < this.field10269; ++var4) {
            for(int var5 = this.field10273 - 1; var5 >= 0; --var5) {
               var1[var2] = this.field10275[var4 + var5 * this.field10269];
               var6[var2++] = this.field10276[var4 + var5 * this.field10269];
            }
         }

         this.field10275 = var1;
         this.field10276 = var6;
      }

      var3 = this.field10268;
      this.field10268 = this.field10272;
      this.field10272 = this.field10270;
      this.field10270 = this.field10271;
      this.field10271 = this.field10268;
      var3 = this.field10273;
      this.field10273 = this.field10269;
      this.field10269 = var3;
   }

   public int[] method6245() {
      int var1 = this.method6238();
      int[] var2 = new int[var1 * this.method6249()];
      int var3;
      int var4;
      int var5;
      int var6;
      if (this.field10276 != null) {
         for(var3 = 0; var3 < this.field10273; ++var3) {
            var4 = var3 * this.field10269;
            var5 = this.field10272 + (var3 + this.field10268) * var1;

            for(var6 = 0; var6 < this.field10269; ++var6) {
               var2[var5++] = this.field10276[var4] << 24 | this.field10274[this.field10275[var4] & 255];
               ++var4;
            }
         }
      } else {
         for(var3 = 0; var3 < this.field10273; ++var3) {
            var4 = var3 * this.field10269;
            var5 = this.field10272 + (var3 + this.field10268) * var1;

            for(var6 = 0; var6 < this.field10269; ++var6) {
               int var7 = this.field10274[this.field10275[var4++] & 255];
               if (var7 != 0) {
                  var2[var5++] = -16777216 | var7;
               } else {
                  var2[var5++] = 0;
               }
            }
         }
      }

      return var2;
   }

   public void method6246(int var1, int var2, int var3) {
      for(int var4 = 1; var4 < this.field10274.length; ++var4) {
         if (this.field10274[var4] != 1 && this.field10274[var4] != 16711935) {
            int var5 = this.field10274[var4] >> 16 & 255;
            var5 += var1;
            if (var5 < 0) {
               var5 = 0;
            } else if (var5 > 255) {
               var5 = 255;
            }

            int var6 = this.field10274[var4] >> 8 & 255;
            var6 += var2;
            if (var6 < 0) {
               var6 = 0;
            } else if (var6 > 255) {
               var6 = 255;
            }

            int var7 = this.field10274[var4] >> 0 & 255;
            var7 += var3;
            if (var7 < 0) {
               var7 = 0;
            } else if (var7 > 255) {
               var7 = 255;
            }

            this.field10274[var4] = var5 << 16 | var6 << 8 | var7;
         }
      }

   }

   public void method6247() {
      byte[] var1 = this.field10275;
      int var2;
      int var3;
      int var4;
      if (this.field10276 == null) {
         for(var2 = this.field10273 - 1; var2 >= 0; --var2) {
            var3 = var2 * this.field10269;

            for(var4 = (var2 + 1) * this.field10269; var3 < var4; ++var3) {
               --var4;
               byte var5 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var5;
            }
         }
      } else {
         byte[] var7 = this.field10276;

         for(var3 = this.field10273 - 1; var3 >= 0; --var3) {
            var4 = var3 * this.field10269;

            for(int var8 = (var3 + 1) * this.field10269; var4 < var8; ++var4) {
               --var8;
               byte var6 = var1[var4];
               var1[var4] = var1[var8];
               var1[var8] = var6;
               var6 = var7[var4];
               var7[var4] = var7[var8];
               var7[var8] = var6;
            }
         }
      }

      var2 = this.field10272;
      this.field10272 = this.field10271;
      this.field10271 = var2;
   }

   public static class922[] method6248(class180 var0, int var1, int var2) {
      byte[] var3 = var0.method3285(var1, var2, (byte)4);
      return var3 == null ? null : method6237(var3);
   }

   public int method6249() {
      return this.field10273 + this.field10268 + this.field10270;
   }
}
