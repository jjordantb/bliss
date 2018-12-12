public abstract class class476 extends class963 {
   public short field8296;
   public short field8297;
   public short field8298;
   public short field8299;
   public boolean field8300;
   byte field8301;

   class476(class545 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, byte var12) {
      super(var1);
      this.field3639 = (byte)var2;
      this.field3640 = (byte)var3;
      this.method1514(new class32((float)var4, (float)var5, (float)var6));
      this.field8299 = (short)var7;
      this.field8297 = (short)var8;
      this.field8296 = (short)var9;
      this.field8298 = (short)var10;
      this.field8300 = var11;
      this.field8301 = var12;
   }

   void method4691(int var1) {
   }

   int method2161(class639[] var1, int var2) {
      try {
         int var3 = 0;

         int var4;
         int var5;
         int var10;
         label120:
         for(var4 = this.field8299; var4 <= this.field8297; ++var4) {
            label118:
            for(var5 = this.field8296; var5 <= this.field8298; ++var5) {
               long var6 = this.field3638.field3899[this.field3639][var4][var5];
               long var8 = 0L;

               while(true) {
                  label113:
                  while(true) {
                     if (var8 > 48L) {
                        continue label118;
                     }

                     var10 = (int)(var6 >>> (int)var8 & 65535L);
                     if (var10 <= 0) {
                        continue label118;
                     }

                     class321 var11 = this.field3638.field3903[var10 - 1];

                     for(int var12 = 0; var12 < var3; ++var12) {
                        if (var11.field1046 == var1[var12]) {
                           var8 += 16L;
                           continue label113;
                        }
                     }

                     var1[var3++] = var11.field1046;
                     if (var3 == 4) {
                        break label120;
                     }

                     var8 += 16L;
                  }
               }
            }
         }

         for(var4 = var3; var4 < 4; ++var4) {
            var1[var4] = null;
         }

         if (this.field8301 != 0) {
            var4 = this.field8299 - -804213305 * this.field3638.field3898;
            var5 = this.field8296 - this.field3638.field3858 * 465603579;
            short var13;
            int var14;
            int var15;
            short var16;
            if (1 == this.field8301) {
               if (var5 > var4) {
                  var13 = this.field8299;
                  var14 = this.field8296 - 1;
                  var15 = 1 + this.field8299;
                  var16 = this.field8296;
               } else {
                  var13 = this.field8299;
                  var14 = 1 + this.field8296;
                  var15 = this.field8299 - 1;
                  var16 = this.field8296;
               }
            } else if (var5 > -var4) {
               var13 = this.field8299;
               var14 = this.field8296 - 1;
               var15 = this.field8299 - 1;
               var16 = this.field8296;
            } else {
               var13 = this.field8299;
               var14 = this.field8296 + 1;
               var15 = this.field8299 + 1;
               var16 = this.field8296;
            }

            label84:
            for(var10 = 0; var10 < var3; ++var10) {
               long var17 = this.field3638.field3899[this.field3639][var13][var14];

               class321 var19;
               while(0L != var17) {
                  var19 = this.field3638.field3903[(int)((var17 & 65535L) - 1L)];
                  var17 >>>= 16;
                  if (var19.field1046 == var1[var10]) {
                     continue label84;
                  }
               }

               var17 = this.field3638.field3899[this.field3639][var15][var16];

               while(0L != var17) {
                  var19 = this.field3638.field3903[(int)((var17 & 65535L) - 1L)];
                  var17 >>>= 16;
                  if (var19.field1046 == var1[var10]) {
                     continue label84;
                  }
               }

               for(int var21 = var10; var21 < var3 - 1; ++var21) {
                  var1[var21] = var1[var21 + 1];
               }

               --var3;
            }
         }

         return var3;
      } catch (RuntimeException var20) {
         throw class158.method3445(var20, "ajf.dg(" + ')');
      }
   }

   boolean method2167(int var1) {
      try {
         for(int var2 = this.field8299; var2 <= this.field8297; ++var2) {
            for(int var3 = this.field8296; var3 <= this.field8298; ++var3) {
               int var4 = this.field3638.field3883 * 583010427 + (var2 - this.field3638.field3898 * -804213305);
               if (var4 >= 0 && var4 < this.field3638.field3908.length) {
                  int var5 = var3 - 465603579 * this.field3638.field3858 + this.field3638.field3883 * 583010427;
                  if (var5 >= 0 && var5 < this.field3638.field3908.length && this.field3638.field3908[var4][var5]) {
                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ajf.dq(" + ')');
      }
   }

   boolean method2166(class848 var1) {
      return this.field3638.field3857.method1654(this.field3640, this.field8299, this.field8297, this.field8296, this.field8298, this.method2165(var1, (byte)93));
   }

   int method2197(class639[] var1) {
      int var2 = 0;

      int var3;
      int var4;
      int var9;
      label116:
      for(var3 = this.field8299; var3 <= this.field8297; ++var3) {
         label114:
         for(var4 = this.field8296; var4 <= this.field8298; ++var4) {
            long var5 = this.field3638.field3899[this.field3639][var3][var4];
            long var7 = 0L;

            while(true) {
               label109:
               while(true) {
                  if (var7 > 48L) {
                     continue label114;
                  }

                  var9 = (int)(var5 >>> (int)var7 & 65535L);
                  if (var9 <= 0) {
                     continue label114;
                  }

                  class321 var10 = this.field3638.field3903[var9 - 1];

                  for(int var11 = 0; var11 < var2; ++var11) {
                     if (var10.field1046 == var1[var11]) {
                        var7 += 16L;
                        continue label109;
                     }
                  }

                  var1[var2++] = var10.field1046;
                  if (var2 == 4) {
                     break label116;
                  }

                  var7 += 16L;
               }
            }
         }
      }

      for(var3 = var2; var3 < 4; ++var3) {
         var1[var3] = null;
      }

      if (this.field8301 != 0) {
         var3 = this.field8299 - -804213305 * this.field3638.field3898;
         var4 = this.field8296 - this.field3638.field3858 * 465603579;
         short var12;
         int var13;
         int var14;
         short var15;
         if (1 == this.field8301) {
            if (var4 > var3) {
               var12 = this.field8299;
               var13 = this.field8296 - 1;
               var14 = 1 + this.field8299;
               var15 = this.field8296;
            } else {
               var12 = this.field8299;
               var13 = 1 + this.field8296;
               var14 = this.field8299 - 1;
               var15 = this.field8296;
            }
         } else if (var4 > -var3) {
            var12 = this.field8299;
            var13 = this.field8296 - 1;
            var14 = this.field8299 - 1;
            var15 = this.field8296;
         } else {
            var12 = this.field8299;
            var13 = this.field8296 + 1;
            var14 = this.field8299 + 1;
            var15 = this.field8296;
         }

         label80:
         for(var9 = 0; var9 < var2; ++var9) {
            long var16 = this.field3638.field3899[this.field3639][var12][var13];

            class321 var18;
            while(0L != var16) {
               var18 = this.field3638.field3903[(int)((var16 & 65535L) - 1L)];
               var16 >>>= 16;
               if (var18.field1046 == var1[var9]) {
                  continue label80;
               }
            }

            var16 = this.field3638.field3899[this.field3639][var14][var15];

            while(0L != var16) {
               var18 = this.field3638.field3903[(int)((var16 & 65535L) - 1L)];
               var16 >>>= 16;
               if (var18.field1046 == var1[var9]) {
                  continue label80;
               }
            }

            for(int var19 = var9; var19 < var2 - 1; ++var19) {
               var1[var19] = var1[var19 + 1];
            }

            --var2;
         }
      }

      return var2;
   }

   boolean method2198(class848 var1) {
      return this.field3638.field3857.method1654(this.field3640, this.field8299, this.field8297, this.field8296, this.field8298, this.method2165(var1, (byte)-38));
   }

   boolean method2196(class848 var1) {
      return this.field3638.field3857.method1654(this.field3640, this.field8299, this.field8297, this.field8296, this.field8298, this.method2165(var1, (byte)43));
   }

   boolean method2200(class848 var1) {
      return this.field3638.field3857.method1654(this.field3640, this.field8299, this.field8297, this.field8296, this.field8298, this.method2165(var1, (byte)-4));
   }

   boolean method2171(class848 var1, byte var2) {
      try {
         return this.field3638.field3857.method1654(this.field3640, this.field8299, this.field8297, this.field8296, this.field8298, this.method2165(var1, (byte)-61));
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ajf.dl(" + ')');
      }
   }

   boolean method2202() {
      for(int var1 = this.field8299; var1 <= this.field8297; ++var1) {
         for(int var2 = this.field8296; var2 <= this.field8298; ++var2) {
            int var3 = this.field3638.field3883 * 583010427 + (var1 - this.field3638.field3898 * -804213305);
            if (var3 >= 0 && var3 < this.field3638.field3908.length) {
               int var4 = var2 - 465603579 * this.field3638.field3858 + this.field3638.field3883 * 583010427;
               if (var4 >= 0 && var4 < this.field3638.field3908.length && this.field3638.field3908[var3][var4]) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   boolean method2203() {
      for(int var1 = this.field8299; var1 <= this.field8297; ++var1) {
         for(int var2 = this.field8296; var2 <= this.field8298; ++var2) {
            int var3 = this.field3638.field3883 * 583010427 + (var1 - this.field3638.field3898 * -804213305);
            if (var3 >= 0 && var3 < this.field3638.field3908.length) {
               int var4 = var2 - 465603579 * this.field3638.field3858 + this.field3638.field3883 * 583010427;
               if (var4 >= 0 && var4 < this.field3638.field3908.length && this.field3638.field3908[var3][var4]) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   boolean method2204() {
      for(int var1 = this.field8299; var1 <= this.field8297; ++var1) {
         for(int var2 = this.field8296; var2 <= this.field8298; ++var2) {
            int var3 = this.field3638.field3883 * 583010427 + (var1 - this.field3638.field3898 * -804213305);
            if (var3 >= 0 && var3 < this.field3638.field3908.length) {
               int var4 = var2 - 465603579 * this.field3638.field3858 + this.field3638.field3883 * 583010427;
               if (var4 >= 0 && var4 < this.field3638.field3908.length && this.field3638.field3908[var3][var4]) {
                  return true;
               }
            }
         }
      }

      return false;
   }
}
