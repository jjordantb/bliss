public class class864 extends class168 {
   public int field9011 = 0;
   public int field9012;
   boolean field9013 = false;
   public int field9014;
   public int field9015 = -1;
   public int field9016;
   int field9017;
   int field9018 = 0;
   public int field9019 = -1;
   int field9020;
   public int field9021;
   int field9022;
   int field9023;

   class192 method2201(class848 var1, int var2) {
      try {
         class32 var3 = class32.method3290(this.method1511().field7637);
         class398 var4 = super.field3638.method2430(super.field3639, (int)var3.field5296 >> 9, (int)var3.field5299 >> 9, -583169676);
         class824 var5 = super.field3638.method2452(super.field3639, (int)var3.field5296 >> 9, (int)var3.field5299 >> 9, (byte)55);
         int var6 = 0;
         if (var4 != null && var4.field6585.field8300) {
            var6 = var4.field6585.method2168(1951240662);
         }

         if (var5 != null && var5.field9059 > -var6) {
            var6 = -var5.field9059;
         }

         if (this.field9011 != var6) {
            var3.field5300 += (float)(var6 - this.field9011);
            this.method1514(var3);
            this.field9011 = var6;
         }

         class135 var7 = var1.method5048();
         var7.method1009();
         if (this.field9011 == 0) {
            boolean var8 = false;
            boolean var9 = false;
            boolean var10 = false;
            class454 var11 = super.field3638.field3862[super.field3640];
            int var12 = this.field9018 << 1;
            int var14 = -var12 / 2;
            int var15 = -var12 / 2;
            int var16 = var11.method3887(var14 + (int)var3.field5296, (int)var3.field5299 + var15, -1982900642);
            int var17 = var12 / 2;
            int var18 = -var12 / 2;
            int var19 = var11.method3887((int)var3.field5296 + var17, var18 + (int)var3.field5299, -1725399320);
            int var20 = -var12 / 2;
            int var21 = var12 / 2;
            int var22 = var11.method3887((int)var3.field5296 + var20, (int)var3.field5299 + var21, -1471266970);
            int var23 = var12 / 2;
            int var24 = var12 / 2;
            int var25 = var11.method3887(var23 + (int)var3.field5296, var24 + (int)var3.field5299, -1424760570);
            int var26 = var16 < var19 ? var16 : var19;
            int var27 = var22 < var25 ? var22 : var25;
            int var28 = var19 < var25 ? var19 : var25;
            int var29 = var16 < var22 ? var16 : var22;
            int var30;
            if (var12 != 0) {
               var30 = (int)(Math.atan2((double)(var26 - var27), (double)var12) * 2607.5945876176133D) & 16383;
               if (var30 != 0) {
                  var7.method1025(1.0F, 0.0F, 0.0F, class703.method2002(var30));
               }
            }

            if (var12 != 0) {
               var30 = (int)(Math.atan2((double)(var29 - var28), (double)var12) * 2607.5945876176133D) & 16383;
               if (var30 != 0) {
                  var7.method1025(0.0F, 0.0F, 1.0F, class703.method2002(-var30));
               }
            }

            var30 = var16 + var25;
            if (var19 + var22 < var30) {
               var30 = var22 + var19;
            }

            var30 = (var30 >> 1) - (int)var3.field5300;
            if (var30 != 0) {
               var7.method1018(0.0F, (float)var30, 0.0F);
            }
         }

         var3.method3291();
         class32 var32 = this.method1511().field7637;
         var7.method1018(var32.field5296, var32.field5300 - 10.0F, var32.field5299);
         class192 var33 = class221.method4033(true, 2098850781);
         this.field9013 = false;
         this.field9018 = 0;
         class879 var34;
         if (this.field9015 != -1) {
            var34 = class85.field1121.method1566(this.field9015).method2675(var1, 526336, this.field9016, (class365)null, (Animator)null, this.field9020, this.field9017, this.field9022, this.field9023, 1919430109);
            if (var34 != null) {
               var34.method5965(var7, super.field3642[2], 0);
               this.field9013 |= var34.method5989();
               this.field9018 = var34.method5973();
            }
         }

         if (-1 != this.field9019) {
            var34 = class85.field1121.method1566(this.field9019).method2675(var1, 526336, this.field9014, (class365)null, (Animator)null, this.field9020, this.field9017, this.field9022, this.field9023, 1944203535);
            if (var34 != null) {
               var34.method5965(var7, super.field3642[1], 0);
               this.field9013 |= var34.method5989();
               if (var34.method5973() > this.field9018) {
                  this.field9018 = var34.method5973();
               }
            }
         }

         var34 = class85.field1121.method1566(this.field9021).method2675(var1, 526336, this.field9012, (class365)null, (Animator)null, this.field9020, this.field9017, this.field9022, this.field9023, 1623001467);
         if (var34 != null) {
            var34.method5965(var7, super.field3642[0], 0);
            this.field9013 |= var34.method5989();
            if (var34.method5973() > this.field9018) {
               this.field9018 = var34.method5973();
            }
         }

         return var33;
      } catch (RuntimeException var31) {
         throw class158.method3445(var31, "akc.bo(" + ')');
      }
   }

    @Override
    void method2205(byte var1) {

    }

    void method5343(int var1) {
      try {
         this.field9020 = 32 + (int)(Math.random() * 4.0D);
         this.field9017 = 3 + (int)(Math.random() * 2.0D);
         this.field9022 = 16 + (int)(Math.random() * 3.0D);
         if (class615.field8903.field9123.method5845(1941334276) == 1) {
            this.field9023 = (int)(Math.random() * 10.0D);
         } else {
            this.field9023 = (int)(Math.random() * 20.0D);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akc.a(" + ')');
      }
   }

   boolean method2183(short var1) {
      try {
         return this.field9013;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akc.be(" + ')');
      }
   }

   void method2164(class848 var1, int var2) {
   }

    @Override
    public class719 method2165(class848 var1, byte var2) {
        return null;
    }

    boolean method2157(class848 var1, int var2, int var3, byte var4) {
      try {
         class135 var5 = var1.method5048();
         var5.method1008(this.method1511());
         var5.method1018(0.0F, -10.0F, 0.0F);
         class879 var6 = class85.field1121.method1566(this.field9021).method2675(var1, 131072, this.field9012, (class365)null, (Animator)null, 0, 0, 0, 0, 1524116625);
         if (var6 != null && var6.method6097(var2, var3, var5, true, 0)) {
            return true;
         } else {
            if (-1 != this.field9019) {
               var6 = class85.field1121.method1566(this.field9019).method2675(var1, 131072, this.field9014, (class365)null, (Animator)null, 0, 0, 0, 0, 1865340976);
               if (var6 != null && var6.method6097(var2, var3, var5, true, 0)) {
                  return true;
               }
            }

            if (this.field9015 != -1) {
               var6 = class85.field1121.method1566(this.field9015).method2675(var1, 131072, this.field9016, (class365)null, (Animator)null, 0, 0, 0, 0, 1786172187);
               if (var6 != null && var6.method6097(var2, var3, var5, true, 0)) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "akc.bu(" + ')');
      }
   }

   public int method2170(byte var1) {
      try {
         return this.field9011 - this.method2168(1951240662);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "akc.bx(" + ')');
      }
   }

    @Override
    boolean method2173(int var1) {
        return false;
    }

    public int method2168(int var1) {
      return -10;
   }

   boolean method2206(byte var1) {
      return false;
   }

   int method2163(byte var1) {
      try {
         ItemDefinition var2 = class85.field1121.method1566(this.field9021);
         int var3 = var2.field4286;
         ItemDefinition var4;
         if (this.field9019 != -1) {
            var4 = class85.field1121.method1566(this.field9019);
            if (var4.field4286 > var3) {
               var3 = var4.field4286;
            }
         }

         if (-1 != this.field9015) {
            var4 = class85.field1121.method1566(this.field9015);
            if (var4.field4286 > var3) {
               var3 = var4.field4286;
            }
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "akc.dh(" + ')');
      }
   }

   public class864(class545 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method2169(3, -2110276499);
      this.method5343(-1068420966);
   }
}
