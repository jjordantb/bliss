public class class591 {
   class180 field1573;
   class180 field1574;
   class1 field1575 = new class1(20);
   class1 field1576 = new class1(64);

   public class399 method1211(int var1, int var2) {
      try {
         class1 var3 = this.field1576;
         class399 var4;
         synchronized(this.field1576) {
            var4 = (class399)this.field1576.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field1573;
            byte[] var10;
            synchronized(this.field1573) {
               var10 = this.field1573.method3285(class981.field3262.field3271, var1, (byte)-66);
            }

            var4 = new class399();
            var4.field6569 = this;
            if (var10 != null) {
               var4.method3519(new InputStream(var10), -1860141420);
            }

            class1 var11 = this.field1576;
            synchronized(this.field1576) {
               this.field1576.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "om.a(" + ')');
      }
   }

   public void method1212(short var1) {
      try {
         class1 var2 = this.field1576;
         synchronized(this.field1576) {
            this.field1576.method2977();
         }

         var2 = this.field1575;
         synchronized(this.field1575) {
            this.field1575.method2977();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "om.f(" + ')');
      }
   }

   public void method1213(int var1, int var2) {
      try {
         class1 var3 = this.field1576;
         synchronized(this.field1576) {
            this.field1576.method2976(var1, -1794430367);
         }

         var3 = this.field1575;
         synchronized(this.field1575) {
            this.field1575.method2976(var1, -1227911326);
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "om.b(" + ')');
      }
   }

   public void method1214(int var1) {
      try {
         class1 var2 = this.field1576;
         synchronized(this.field1576) {
            this.field1576.method2979();
         }

         var2 = this.field1575;
         synchronized(this.field1575) {
            this.field1575.method2979();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "om.p(" + ')');
      }
   }

   public class591(class469 var1, class423 var2, class180 var3, class180 var4) {
      this.field1574 = var4;
      this.field1573 = var3;
      this.field1573.method3286(class981.field3262.field3271, -790264977);
   }

   static final void method1215(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class51.method1535(var3, var4, var0, (byte)55);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "om.fp(" + ')');
      }
   }

   static final void method1216(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-22);
         class200.method4351(var3, var0, (byte)0);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "om.qu(" + ')');
      }
   }
}
