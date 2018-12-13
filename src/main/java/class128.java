public class class128 implements class54 {
   class48 field2345;
   class562 field2346;
   class180 field2347;
   public static int[] field2348;

   public void method1538(int var1) {
      try {
         this.field2345 = class611.method5156(this.field2347, this.field2346.field824, (byte)-10);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fm.a(" + ')');
      }
   }

   public void method1543(boolean var1, byte var2) {
      try {
         if (var1) {
            int var3 = this.field2346.field823.method1786(this.field2345.method5594(), class730.field2775, -2059315000) + this.field2346.field825;
            int var4 = this.field2346.field826.method3090(this.field2345.method3109(), class730.field2784, -1363619703) + this.field2346.field822;
            this.field2345.method3128(var3, var4);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fm.f(" + ')');
      }
   }

   public boolean method1537(int var1) {
      try {
         return this.field2347.method3280(this.field2346.field824, -457216440);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fm.b(" + ')');
      }
   }

   class128(class180 var1, class562 var2) {
      this.field2347 = var1;
      this.field2346 = var2;
   }

   public static void method1582(int var0, int var1, int var2, int var3) {
      try {
         var2 = var2 * class615.field8903.field9150.method2717(-2142096131) >> 8;
         if (var2 != 0 && var0 != -1) {
            if (!class540.field3921 && class540.field3920 != -1 && class396.method3499(87442639) && !class26.method3481((byte)9)) {
               class508.field3967 = class526.method2224(34386078);
               class880.method6176((short)1644);
               class272 var4 = class342.method220(class508.field3967, -1213425929);
               class396.method3495(true, var4, 1899476415);
            }

            class58.method1581(class972.field2964, var0, 0, var2, false, -1993911100);
            class956.method2113(-1, 255, -1975547626);
            class540.field3921 = true;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fm.c(" + ')');
      }
   }

   static final void method1583(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class896.method5589(var3, var4, var0, 2141482523);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fm.in(" + ')');
      }
   }

   static final void method1584(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class730.field2910;
         var0.field3161[++var0.field3156 - 1] = class730.field2911;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fm.akc(" + ')');
      }
   }

   static Class method1585(String var0, byte var1) throws ClassNotFoundException {
      try {
         if (var0.equals("B")) {
            return Byte.TYPE;
         } else if (var0.equals("I")) {
            return Integer.TYPE;
         } else if (var0.equals("S")) {
            return Short.TYPE;
         } else if (var0.equals("J")) {
            return Long.TYPE;
         } else if (var0.equals("Z")) {
            return Boolean.TYPE;
         } else if (var0.equals("F")) {
            return Float.TYPE;
         } else if (var0.equals("D")) {
            return Double.TYPE;
         } else if (var0.equals("C")) {
            return Character.TYPE;
         } else {
            return var0.equals("void") ? Void.TYPE : var0.getClass();
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fm.i(" + ')');
      }
   }

   public static final void method1586(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if (var0 >= class381.field1416 && var1 <= class381.field1413 && var2 >= class381.field1414 && var3 <= class381.field1415) {
            if (1 == var5) {
               class729.method1704(var0, var1, var2, var3, var4, -616636288);
            } else {
               class199.method3749(var0, var1, var2, var3, var4, var5, 1228342009);
            }
         } else if (1 == var5) {
            class673.method4259(var0, var1, var2, var3, var4, (byte)16);
         } else {
            class792.method442(var0, var1, var2, var3, var4, var5, 630835292);
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "fm.r(" + ')');
      }
   }

   static final void method1587(class744 var0, int var1) {
      try {
         boolean var2 = var0.field3161[--var0.field3156] != 0;
         if (class923.local.field3388 != null) {
            class923.local.field3388.method1638(var2, -635669328);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fm.cw(" + ')');
      }
   }

   static final void method1588(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = ItemDefinition.method2689(class615.field8903.field9137.method3689(-1033655497), 200, -564822941);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fm.akd(" + ')');
      }
   }
}
