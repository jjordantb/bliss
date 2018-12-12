import java.nio.ByteBuffer;

public class class790 {
   class801 field448;
   static int field449 = 128;
   int field450;
   class432 field451;
   int field452;
   static byte[] field453;
   boolean field454 = true;
   int field455 = -1;
   int field456;
   class920 field457;
   class325 field458;
   int field459;
   int field460;
   static int[] field461;
   static int field462 = 7;

   void method399(class605 var1) {
      this.method400(var1, this.field457, 0, this.field456);
   }

   void method400(class605 var1, class920 var2, int var3, int var4) {
      if (var4 > 0) {
         this.method401();
         this.field458.method643(var2);
         var1.field8689 = this.field448;
         var1.field8704 = this.field459;
         var1.field8705 = this.field460 - this.field459 + 1;
         var1.field8706 = var3;
         var1.field8686 = var4;
         var1.method5106(0);
      }

   }

   class790(class325 var1, class432 var2, class894 var3, int var4, int var5, int var6, int var7, int var8) {
      this.field458 = var1;
      this.field451 = var2;
      this.field452 = var7;
      this.field450 = var8;
      int var9 = 1 << var6;
      int var10 = 0;
      int var11 = var4 << var6;
      int var12 = var5 << var6;

      int var14;
      int var15;
      for(int var13 = 0; var13 < var9; ++var13) {
         var14 = (var12 + var13) * var3.field7226 + var11;

         for(var15 = 0; var15 < var9; ++var15) {
            short[] var16 = var3.field9474[var14++];
            if (var16 != null) {
               var10 += var16.length;
            }
         }
      }

      if (var10 > 0) {
         this.field460 = Integer.MIN_VALUE;
         this.field459 = Integer.MAX_VALUE;
         this.field457 = this.field458.method640(false);
         this.field457.method6489(var10);
         ByteBuffer var20 = this.field458.field660;
         var20.clear();

         for(var14 = 0; var14 < var9; ++var14) {
            var15 = (var12 + var14) * var3.field7226 + var11;

            for(int var21 = 0; var21 < var9; ++var21) {
               short[] var17 = var3.field9474[var15++];
               if (var17 != null) {
                  for(int var18 = 0; var18 < var17.length; ++var18) {
                     int var19 = var17[var18] & '\uffff';
                     if (var19 < this.field459) {
                        this.field459 = var19;
                     }

                     if (var19 > this.field460) {
                        this.field460 = var19;
                     }

                     var20.putShort((short)var19);
                  }
               }
            }
         }

         this.field457.method1977(0, var20.position(), this.field458.field661);
         this.field456 = var10 / 3;
      } else {
         this.field456 = 0;
         this.field448 = null;
      }

   }

   void method401() {
      if (this.field454) {
         this.field454 = false;
         byte[] var1 = this.field451.field7479;
         int var2 = 0;
         int var3 = this.field451.field7475;
         int var4 = this.field452 + this.field450 * this.field451.field7475;

         int var5;
         for(var5 = -128; var5 < 0; ++var5) {
            var2 = (var2 << 8) - var2;

            for(int var6 = -128; var6 < 0; ++var6) {
               if (var1[var4++] != 0) {
                  ++var2;
               }
            }

            var4 += var3 - 128;
         }

         if (this.field448 != null && this.field455 == var2) {
            this.field454 = false;
         } else {
            this.field455 = var2;
            var5 = 0;
            var4 = this.field452 + this.field450 * var3;
            int var7;
            int var8;
            int var9;
            if (this.field458.method607(class264.field8201, class482.field8399)) {
               if (field453 == null) {
                  field453 = new byte[16384];
               }

               byte[] var10 = field453;

               for(var7 = -128; var7 < 0; ++var7) {
                  for(var8 = -128; var8 < 0; ++var8) {
                     if (var1[var4] != 0) {
                        var10[var5++] = 68;
                     } else {
                        var9 = 0;
                        if (var1[var4 - 1] != 0) {
                           ++var9;
                        }

                        if (var1[var4 + 1] != 0) {
                           ++var9;
                        }

                        if (var1[var4 - var3] != 0) {
                           ++var9;
                        }

                        if (var1[var4 + var3] != 0) {
                           ++var9;
                        }

                        var10[var5++] = (byte)(17 * var9);
                     }

                     ++var4;
                  }

                  var4 += this.field451.field7475 - 128;
               }

               if (this.field448 == null) {
                  this.field448 = this.field458.method610(class264.field8201, 128, 128, false, field453);
                  this.field448.method2849(false, false);
               } else {
                  this.field448.method2851(0, 0, 128, 128, field453, class264.field8201, 0, 128);
               }
            } else {
               if (field461 == null) {
                  field461 = new int[16384];
               }

               int[] var11 = field461;

               for(var7 = -128; var7 < 0; ++var7) {
                  for(var8 = -128; var8 < 0; ++var8) {
                     if (var1[var4] != 0) {
                        var11[var5++] = 1140850688;
                     } else {
                        var9 = 0;
                        if (var1[var4 - 1] != 0) {
                           ++var9;
                        }

                        if (var1[var4 + 1] != 0) {
                           ++var9;
                        }

                        if (var1[var4 - var3] != 0) {
                           ++var9;
                        }

                        if (var1[var4 + var3] != 0) {
                           ++var9;
                        }

                        var11[var5++] = 17 * var9 << 24;
                     }

                     ++var4;
                  }

                  var4 += this.field451.field7475 - 128;
               }

               if (this.field448 == null) {
                  this.field448 = this.field458.method609(128, 128, false, field461);
                  this.field448.method2849(false, false);
               } else {
                  this.field448.method2850(0, 0, 128, 128, field461, 0, 128);
               }
            }
         }
      }

   }
}
