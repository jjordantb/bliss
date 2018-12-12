public class class494 {
   int field7835;
   static int field7836 = 7;
   int field7837;
   class13 field7838;
   class243 field7839;
   static int field7840 = 128;
   boolean field7841 = true;
   int field7842 = -1;
   int field7843;
   class387 field7844;
   class424 field7845;
   class678 field7846;

   void method4423() {
      this.method4424(this.field7844, this.field7843);
   }

   void method4424(class387 var1, int var2) {
      if (var2 != 0) {
         this.method4425();
         this.field7838.method3639(this.field7846);
         this.field7838.method3637(var1, 4, 0, var2);
      }

   }

   void method4425() {
      if (this.field7841) {
         this.field7841 = false;
         byte[] var1 = this.field7839.field8505;
         byte[] var2 = this.field7838.field6888;
         int var3 = 0;
         int var4 = this.field7839.field8503;
         int var5 = this.field7835 + this.field7837 * this.field7839.field8503;

         int var6;
         int var7;
         for(var6 = -128; var6 < 0; ++var6) {
            var3 = (var3 << 8) - var3;

            for(var7 = -128; var7 < 0; ++var7) {
               if (var1[var5++] != 0) {
                  ++var3;
               }
            }

            var5 += var4 - 128;
         }

         if (this.field7846 != null && this.field7842 == var3) {
            this.field7841 = false;
         } else {
            this.field7842 = var3;
            var6 = 0;
            var5 = this.field7835 + this.field7837 * var4;

            for(var7 = -128; var7 < 0; ++var7) {
               for(int var8 = -128; var8 < 0; ++var8) {
                  if (var1[var5] != 0) {
                     var2[var6++] = 68;
                  } else {
                     int var9 = 0;
                     if (var1[var5 - 1] != 0) {
                        ++var9;
                     }

                     if (var1[var5 + 1] != 0) {
                        ++var9;
                     }

                     if (var1[var5 - var4] != 0) {
                        ++var9;
                     }

                     if (var1[var5 + var4] != 0) {
                        ++var9;
                     }

                     var2[var6++] = (byte)(17 * var9);
                  }

                  ++var5;
               }

               var5 += this.field7839.field8503 - 128;
            }

            if (this.field7846 == null) {
               this.field7846 = new class678(this.field7838, 3553, class264.field8201, class482.field8399, 128, 128, false, this.field7838.field6888, class264.field8201, false);
               this.field7846.method4212(false, false);
               this.field7846.method4289(true);
            } else {
               this.field7846.method4213(0, 0, 128, 128, this.field7838.field6888, class264.field8201, 0, 0, false);
            }
         }
      }

   }

   class494(class13 var1, class243 var2, class291 var3, int var4, int var5, int var6, int var7, int var8) {
      this.field7838 = var1;
      this.field7839 = var2;
      this.field7835 = var7;
      this.field7837 = var8;
      int var9 = 1 << var6;
      int var10 = 0;
      int var11 = var4 << var6;
      int var12 = var5 << var6;

      int var14;
      int var15;
      for(int var13 = 0; var13 < var9; ++var13) {
         var14 = (var12 + var13) * var3.field7226 + var11;

         for(var15 = 0; var15 < var9; ++var15) {
            short[] var16 = var3.field10517[var14++];
            if (var16 != null) {
               var10 += var16.length;
            }
         }
      }

      this.field7843 = var10;
      if (var10 > 0) {
         InputStream var19 = new InputStream(var10 * 2);
         short[] var17;
         int var18;
         int var20;
         if (this.field7838.field6830) {
            for(var14 = 0; var14 < var9; ++var14) {
               var15 = (var12 + var14) * var3.field7226 + var11;

               for(var20 = 0; var20 < var9; ++var20) {
                  var17 = var3.field10517[var15++];
                  if (var17 != null) {
                     for(var18 = 0; var18 < var17.length; ++var18) {
                        var19.method6362(var17[var18] & '\uffff', 16711935);
                     }
                  }
               }
            }
         } else {
            for(var14 = 0; var14 < var9; ++var14) {
               var15 = (var12 + var14) * var3.field7226 + var11;

               for(var20 = 0; var20 < var9; ++var20) {
                  var17 = var3.field10517[var15++];
                  if (var17 != null) {
                     for(var18 = 0; var18 < var17.length; ++var18) {
                        var19.method6363(var17[var18] & '\uffff', 1368367793);
                     }
                  }
               }
            }
         }

         this.field7844 = this.field7838.method3667(5123, var19.field10375, var19.field10376, false);
         this.field7845 = new class424(this.field7838, 5123, (byte[])null, 1);
      } else {
         this.field7846 = null;
      }

   }

   void method4426(byte[] var1, int var2) {
      this.field7845.method1190(5123, var1, var2 * 2);
      this.method4424(this.field7845, var2);
   }
}
