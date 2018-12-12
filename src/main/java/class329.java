public class class329 {
   class1 field27 = new class1(50);
   class469 field28;
   class1 field29 = new class1(64);
   class180 field30;
   class180 field31;
   boolean field32;
   int field33;
   class1 field34 = new class1(5);
   class423 field35;
   String[] field36;

   public class401 method12(int var1, int var2) {
      try {
         class1 var3 = this.field29;
         class401 var4;
         synchronized(this.field29) {
            var4 = (class401)this.field29.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field30;
            byte[] var10;
            synchronized(this.field30) {
               var10 = this.field30.method3285(class981.field3221.method1927(var1, -790155853), class981.field3221.method1925(var1, -576275965), (byte)-76);
            }

            var4 = new class401();
            var4.field9862 = -1840892671 * var1;
            var4.field9861 = this;
            var4.field9878 = (String[])this.field36.clone();
            if (var10 != null) {
               var4.method6105(new class907(var10), -975728899);
            }

            var4.method6113(1323410423);
            class1 var11 = this.field29;
            synchronized(this.field29) {
               this.field29.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "uy.a(" + ')');
      }
   }

   public void method13(boolean var1, byte var2) {
      try {
         if (this.field32 != var1) {
            this.field32 = var1;
            this.method15(-1071306617);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "uy.f(" + ')');
      }
   }

   public void method14(int var1, int var2) {
      try {
         this.field33 = var1 * -1576689997;
         class1 var3 = this.field27;
         synchronized(this.field27) {
            this.field27.method2977();
         }

         var3 = this.field34;
         synchronized(this.field34) {
            this.field34.method2977();
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "uy.b(" + ')');
      }
   }

   public void method15(int var1) {
      try {
         class1 var2 = this.field29;
         synchronized(this.field29) {
            this.field29.method2977();
         }

         var2 = this.field27;
         synchronized(this.field27) {
            this.field27.method2977();
         }

         var2 = this.field34;
         synchronized(this.field34) {
            this.field34.method2977();
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "uy.p(" + ')');
      }
   }

   public void method16(byte var1) {
      try {
         class1 var2 = this.field27;
         synchronized(this.field27) {
            this.field27.method2977();
         }

         var2 = this.field34;
         synchronized(this.field34) {
            this.field34.method2977();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "uy.i(" + ')');
      }
   }

   public void method17(int var1) {
      try {
         class1 var2 = this.field29;
         synchronized(this.field29) {
            this.field29.method2979();
         }

         var2 = this.field27;
         synchronized(this.field27) {
            this.field27.method2979();
         }

         var2 = this.field34;
         synchronized(this.field34) {
            this.field34.method2979();
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "uy.d(" + ')');
      }
   }

   public void method18(int var1, int var2) {
      try {
         class1 var3 = this.field29;
         synchronized(this.field29) {
            this.field29.method2976(var1, 612752798);
         }

         var3 = this.field27;
         synchronized(this.field27) {
            this.field27.method2976(var1, -709168280);
         }

         var3 = this.field34;
         synchronized(this.field34) {
            this.field34.method2976(var1, -1808092959);
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "uy.k(" + ')');
      }
   }

   public class329(class469 var1, class423 var2, boolean var3, class180 var4, class180 var5) {
      this.field28 = var1;
      this.field35 = var2;
      this.field32 = var3;
      this.field30 = var4;
      this.field31 = var5;
      if (this.field30 != null) {
         int var6 = this.field30.method3266(2037724352) - 1;
         class981.field3221.method1926((short)12429);
         this.field30.method3286(var6, 678420951);
      }

      if (class469.field7324 == this.field28) {
         this.field36 = new String[]{null, null, null, null, null, class814.field4779.method2927(this.field35, -875414210)};
      } else {
         this.field36 = new String[6];
      }

   }

   static void method19(int var0) {
      try {
         class791.field440.method2977();
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "uy.a(" + ')');
      }
   }

   static final void method20(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)-51);
         class131 var4 = class382.field1410[var2 >> 16];
         class818.method2902(var3, var4, var0, 1226850164);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "uy.jp(" + ')');
      }
   }
}
