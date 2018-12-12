public class class247 {
   class180 field8407;
   class1 field8408 = new class1(128);

   public class247(class469 var1, class423 var2, class180 var3) {
      this.field8407 = var3;
      if (this.field8407 != null) {
         int var4 = this.field8407.method3266(1572683796) - 1;
         class981.field3224.method1926((short)19923);
         this.field8407.method3286(var4, 146505674);
      }

   }

   public class833 method4721(int var1, int var2) {
      try {
         class1 var3 = this.field8408;
         class833 var4;
         synchronized(this.field8408) {
            var4 = (class833)this.field8408.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            byte[] var9 = this.field8407.method3285(class981.field3224.method1927(var1, -1240874866), class981.field3224.method1925(var1, -2003896976), (byte)-65);
            var4 = new class833();
            if (var9 != null) {
               var4.method5424(new class907(var9), 592135620);
            }

            class1 var5 = this.field8408;
            synchronized(this.field8408) {
               this.field8408.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "to.a(" + ')');
      }
   }

   public static final void method4722(short var0) {
      try {
         int var1 = class615.field8903.field9131.method5267(-2013953489);
         if (var1 == 0) {
            class730.field2697.method5285((byte[][][])null, 1496940593);
            class558.method481(0, (byte)0);
         } else if (var1 == 1) {
            class296.method6510((byte)0, 1452497701);
            class558.method481(512, (byte)0);
            if (class730.field2697.method5317(-1611682495) != null) {
               class543.method2376(-1148794921);
            }
         } else {
            class296.method6510((byte)(class730.field2758 * -1953789277 - 4 & 255), 1394791892);
            class558.method481(2, (byte)0);
         }

         class730.field2773 = class899.field9552 * 832032973;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "to.it(" + ')');
      }
   }

   static final void method4723(class744 var0, int var1) {
      try {
         var0.field3156 -= -1175642067;
         int var2 = var0.field3161[681479919 * var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156 * 681479919];
         int var4 = var0.field3161[681479919 * var0.field3156 + 2];
         class740.method1920(3, var2 << 16 | var3, var4, "", 226105576);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "to.alf(" + ')');
      }
   }
}
