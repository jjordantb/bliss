public final class class510 implements Comparable {
   long field4161;
   Object field4162;
   long field4163;
   Object field4164;
   static int field4165;

   int method2621(class510 var1, int var2) {
      try {
         if (-547428082756159857L * this.field4161 < -547428082756159857L * var1.field4161) {
            return -1;
         } else {
            return -547428082756159857L * this.field4161 > -547428082756159857L * var1.field4161 ? 1 : 0;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "kx.a(" + ')');
      }
   }

   public int compareTo(Object var1) {
      try {
         return this.method2621((class510)var1, -1964859807);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "kx.compareTo(" + ')');
      }
   }

   class510(Object var1, Object var2) {
      this.field4162 = var1;
      this.field4164 = var2;
   }

   public boolean equals(Object var1) {
      try {
         if (var1 instanceof class510) {
            return this.field4164.equals(((class510)var1).field4164);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "kx.equals(" + ')');
      }
   }

   static final void method2622(class564 var0, class131 var1, class744 var2, byte var3) {
      try {
         String var4 = (String)var2.field3157[(var2.field3158 -= 969361751) * -203050393];
         if (class960.method2212(var4, var2, -209664788) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field845 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "kx.lv(" + ')');
      }
   }

   static final void method2623(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)52);
         class131 var4 = class382.field1410[var2 >> 16];
         class122.method1603(var3, var4, var0, -1603621953);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "kx.km(" + ')');
      }
   }

   public static boolean method2624(int var0, int var1) {
      try {
         return var0 == 1 || var0 == 3 || var0 == 5;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "kx.b(" + ')');
      }
   }
}
