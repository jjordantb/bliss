import jaggl.OpenGL;

public class class243 {
   int field8501;
   int field8502;
   int field8503;
   class291 field8504;
   byte[] field8505;
   class13 field8506;
   int field8507;
   int field8508;
   class494[][] field8509;

   void method4756() {
      this.field8509 = new class494[this.field8502][this.field8507];

      for(int var1 = 0; var1 < this.field8507; ++var1) {
         for(int var2 = 0; var2 < this.field8502; ++var2) {
            this.field8509[var2][var1] = new class494(this.field8506, this, this.field8504, var2, var1, this.field8508, var2 * 128 + 1, var1 * 128 + 1);
         }
      }

   }

   void method4757(int var1, int var2, int var3, boolean[][] var4, boolean var5) {
      this.field8506.method3645(false);
      this.field8506.method3664(false);
      this.field8506.method3658(-2);
      this.field8506.method3626(1);
      this.field8506.method3649(1);
      float var6 = 1.0F / (float)(this.field8506.field6750 * 128);
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      if (var5) {
         for(var7 = 0; var7 < this.field8507; ++var7) {
            var8 = var7 << this.field8508;
            var9 = var7 + 1 << this.field8508;

            label128:
            for(var10 = 0; var10 < this.field8502; ++var10) {
               var11 = var10 << this.field8508;
               var12 = var10 + 1 << this.field8508;

               for(var13 = var11; var13 < var12; ++var13) {
                  if (var13 - var1 >= -var3 && var13 - var1 <= var3) {
                     for(int var14 = var8; var14 < var9; ++var14) {
                        if (var14 - var2 >= -var3 && var14 - var2 <= var3 && var4[var13 - var1 + var3][var14 - var2 + var3]) {
                           OpenGL.glMatrixMode(5890);
                           OpenGL.glLoadIdentity();
                           OpenGL.glScalef(var6, var6, 1.0F);
                           OpenGL.glTranslatef((float)(-var10) / var6, (float)(-var7) / var6, 1.0F);
                           OpenGL.glMatrixMode(5888);
                           this.field8509[var10][var7].method4423();
                           continue label128;
                        }
                     }
                  }
               }
            }
         }
      } else {
         for(var7 = 0; var7 < this.field8507; ++var7) {
            var8 = var7 << this.field8508;
            var9 = var7 + 1 << this.field8508;

            for(var10 = 0; var10 < this.field8502; ++var10) {
               var11 = 0;
               var12 = var10 << this.field8508;
               var13 = var10 + 1 << this.field8508;
               class782 var20 = this.field8506.field6884;
               var20.field10376 = 0;

               for(int var15 = var8; var15 < var9; ++var15) {
                  if (var15 - var2 >= -var3 && var15 - var2 <= var3) {
                     int var16 = var15 * this.field8504.field7226 * -506105871 + var12;

                     for(int var17 = var12; var17 < var13; ++var17) {
                        if (var17 - var1 >= -var3 && var17 - var1 <= var3 && var4[var17 - var1 + var3][var15 - var2 + var3]) {
                           short[] var18 = this.field8504.field10517[var16];
                           if (var18 != null) {
                              int var19;
                              if (this.field8506.field6830) {
                                 for(var19 = 0; var19 < var18.length; ++var19) {
                                    var20.method6362(var18[var19] & '\uffff', 16711935);
                                    ++var11;
                                 }
                              } else {
                                 for(var19 = 0; var19 < var18.length; ++var19) {
                                    var20.method6363(var18[var19] & '\uffff', 1368367793);
                                    ++var11;
                                 }
                              }
                           }
                        }

                        ++var16;
                     }
                  }
               }

               if (var11 > 0) {
                  OpenGL.glMatrixMode(5890);
                  OpenGL.glLoadIdentity();
                  OpenGL.glScalef(var6, var6, 1.0F);
                  OpenGL.glTranslatef((float)(-var10) / var6, (float)(-var7) / var6, 1.0F);
                  OpenGL.glMatrixMode(5888);
                  this.field8509[var10][var7].method4426(var20.field10375, var11);
               }
            }
         }
      }

      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
   }

   void method4758(class770 var1, int var2, int var3) {
      class464 var4 = (class464)var1;
      var2 += var4.field7377 + 1;
      var3 += var4.field7381 + 1;
      int var5 = var2 + var3 * this.field8503;
      int var6 = 0;
      int var7 = var4.field7379;
      int var8 = var4.field7378;
      int var9 = this.field8503 - var8;
      int var10 = 0;
      int var11;
      if (var3 <= 0) {
         var11 = 1 - var3;
         var7 -= var11;
         var6 += var11 * var8;
         var5 += var11 * this.field8503;
         var3 = 1;
      }

      if (var3 + var7 >= this.field8501) {
         var11 = var3 + var7 + 1 - this.field8501;
         var7 -= var11;
      }

      if (var2 <= 0) {
         var11 = 1 - var2;
         var8 -= var11;
         var6 += var11;
         var5 += var11;
         var10 += var11;
         var9 += var11;
         var2 = 1;
      }

      if (var2 + var8 >= this.field8503) {
         var11 = var2 + var8 + 1 - this.field8503;
         var8 -= var11;
         var10 += var11;
         var9 += var11;
      }

      if (var8 > 0 && var7 > 0) {
         method4761(this.field8505, var4.field7382, var6, var5, var8, var7, var9, var10);
         this.method4764(var2, var3, var8, var7);
      }

   }

   boolean method4759(class770 var1, int var2, int var3) {
      class464 var4 = (class464)var1;
      var2 += var4.field7377 + 1;
      var3 += var4.field7381 + 1;
      int var5 = var2 + var3 * this.field8503;
      int var6 = var4.field7379;
      int var7 = var4.field7378;
      int var8 = this.field8503 - var7;
      int var9;
      if (var3 <= 0) {
         var9 = 1 - var3;
         var6 -= var9;
         var5 += var9 * this.field8503;
         var3 = 1;
      }

      if (var3 + var6 >= this.field8501) {
         var9 = var3 + var6 + 1 - this.field8501;
         var6 -= var9;
      }

      if (var2 <= 0) {
         var9 = 1 - var2;
         var7 -= var9;
         var5 += var9;
         var8 += var9;
         var2 = 1;
      }

      if (var2 + var7 >= this.field8503) {
         var9 = var2 + var7 + 1 - this.field8503;
         var7 -= var9;
         var8 += var9;
      }

      if (var7 > 0 && var6 > 0) {
         byte var10 = 8;
         var8 += (var10 - 1) * this.field8503;
         return method4762(this.field8505, var5, var7, var6, var8, var10);
      } else {
         return false;
      }
   }

   class243(class13 var1, class291 var2) {
      this.field8506 = var1;
      this.field8504 = var2;
      this.field8503 = 2 + (this.field8504.field7226 * -506105871 * this.field8504.field7227 * -1212653763 >> this.field8506.field6751);
      this.field8501 = 2 + (this.field8504.field7225 * -1148794921 * this.field8504.field7227 * -1212653763 >> this.field8506.field6751);
      this.field8505 = new byte[this.field8503 * this.field8501];
      this.field8508 = 7 + this.field8506.field6751 - this.field8504.field7228 * -2137349879;
      this.field8502 = this.field8504.field7226 * -506105871 >> this.field8508;
      this.field8507 = this.field8504.field7225 * -1148794921 >> this.field8508;
   }

   static final void method4760(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10001;
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
         }

         for(var10 = var4; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] += var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }

   }

   static final void method4761(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10001;
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
         }

         for(var10 = var4; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }

   }

   static final boolean method4762(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 % var5;
      int var7;
      if (var6 != 0) {
         var7 = var5 - var6;
      } else {
         var7 = 0;
      }

      int var8 = -((var3 + var5 - 1) / var5);
      int var9 = -((var2 + var5 - 1) / var5);

      for(int var10 = var8; var10 < 0; ++var10) {
         for(int var11 = var9; var11 < 0; ++var11) {
            if (var0[var1] == 0) {
               return true;
            }

            var1 += var5;
         }

         var1 -= var7;
         if (var0[var1 - 1] == 0) {
            return true;
         }

         var1 += var4;
      }

      return false;
   }

   void method4763(class770 var1, int var2, int var3) {
      class464 var4 = (class464)var1;
      var2 += var4.field7377 + 1;
      var3 += var4.field7381 + 1;
      int var5 = var2 + var3 * this.field8503;
      int var6 = 0;
      int var7 = var4.field7379;
      int var8 = var4.field7378;
      int var9 = this.field8503 - var8;
      int var10 = 0;
      int var11;
      if (var3 <= 0) {
         var11 = 1 - var3;
         var7 -= var11;
         var6 += var11 * var8;
         var5 += var11 * this.field8503;
         var3 = 1;
      }

      if (var3 + var7 >= this.field8501) {
         var11 = var3 + var7 + 1 - this.field8501;
         var7 -= var11;
      }

      if (var2 <= 0) {
         var11 = 1 - var2;
         var8 -= var11;
         var6 += var11;
         var5 += var11;
         var10 += var11;
         var9 += var11;
         var2 = 1;
      }

      if (var2 + var8 >= this.field8503) {
         var11 = var2 + var8 + 1 - this.field8503;
         var8 -= var11;
         var10 += var11;
         var9 += var11;
      }

      if (var8 > 0 && var7 > 0) {
         method4760(this.field8505, var4.field7382, var6, var5, var8, var7, var9, var10);
         this.method4764(var2, var3, var8, var7);
      }

   }

   void method4764(int var1, int var2, int var3, int var4) {
      if (this.field8509 != null) {
         int var5 = var1 - 1 >> 7;
         int var6 = var1 - 1 + var3 - 1 >> 7;
         int var7 = var2 - 1 >> 7;
         int var8 = var2 - 1 + var4 - 1 >> 7;

         for(int var9 = var5; var9 <= var6; ++var9) {
            class494[] var10 = this.field8509[var9];

            for(int var11 = var7; var11 <= var8; ++var11) {
               var10[var11].field7841 = true;
            }
         }
      }

   }
}
