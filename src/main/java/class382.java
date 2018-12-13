public class class382 {
   class180 field1404;
   class180 field1405;
   class1 field1406 = new class1(64);
   class1 field1407 = new class1(60);
   int field1408;
   protected static class549 field1409;
   public static WidgetContainer[] widgetContainers;
   static int field1411;

   public void method1052(int var1) {
      try {
         class1 var2 = this.field1406;
         synchronized(this.field1406) {
            this.field1406.method2979();
         }

         var2 = this.field1407;
         synchronized(this.field1407) {
            this.field1407.method2979();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qc.i(" + ')');
      }
   }

   public class745 method1053(int var1, int var2) {
      try {
         class1 var3 = this.field1406;
         class745 var4;
         synchronized(this.field1406) {
            var4 = (class745)this.field1406.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field1404;
            byte[] var10;
            synchronized(this.field1404) {
               var10 = this.field1404.method3285(class981.field3260.method1927(var1, -880627246), class981.field3260.method1925(var1, -2138953670), (byte)-76);
            }

            var4 = new class745();
            var4.field4112 = this;
            var4.field4104 = var1;
            if (var10 != null) {
               var4.method2588(new InputStream(var10), (byte)-38);
            }

            class1 var11 = this.field1406;
            synchronized(this.field1406) {
               this.field1406.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "qc.a(" + ')');
      }
   }

   public void method1054(int var1) {
      try {
         class1 var2 = this.field1406;
         synchronized(this.field1406) {
            this.field1406.method2977();
         }

         var2 = this.field1407;
         synchronized(this.field1407) {
            this.field1407.method2977();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qc.b(" + ')');
      }
   }

   public void method1055(int var1, int var2) {
      try {
         class1 var3 = this.field1406;
         synchronized(this.field1406) {
            this.field1406.method2976(var1, -465863614);
         }

         var3 = this.field1407;
         synchronized(this.field1407) {
            this.field1407.method2976(var1, -1017728103);
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "qc.p(" + ')');
      }
   }

   public void method1056(int var1, int var2) {
      try {
         this.field1408 = var1;
         class1 var3 = this.field1407;
         synchronized(this.field1407) {
            this.field1407.method2977();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qc.f(" + ')');
      }
   }

   public class382(class469 var1, class423 var2, class180 var3, class180 var4) {
      this.field1404 = var3;
      this.field1405 = var4;
      int var5 = this.field1404.method3266(1921321046) - 1;
      class981.field3260.method1926((short)3745);
      this.field1404.method3286(var5, -1103317672);
   }

   static final void method1057(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class562.method809(var3, var4, var0, (byte)-85);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qc.ly(" + ')');
      }
   }

   static final void method1058(Widget var0, WidgetContainer var1, class744 var2, int var3) {
      try {
         var0.field890 = var2.field3161[--var2.field3156] == 1;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qc.cr(" + ')');
      }
   }

   static final void method1059(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9124.method1910(-369768513);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qc.ajk(" + ')');
      }
   }

   static final void method1060(class744 var0, int var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         var0.field3161[++var0.field3156 - 1] = class848.field8597.method3399(var2, 2021332528).field7620[var3];
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qc.acp(" + ')');
      }
   }

   public static class99 method1061(byte var0) {
      try {
         return class69.field1806;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "qc.as(" + ')');
      }
   }
}
