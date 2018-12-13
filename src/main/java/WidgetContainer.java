public class WidgetContainer {

   public boolean closed;
   Widget[] widgets;
   public Widget[] widgetsCopy;

   public Widget[] method887(byte var1) {
      try {
         return this.widgets == null ? this.widgetsCopy : this.widgets;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ev.a(" + ')');
      }
   }

   public Widget[] method888(byte var1) {
      try {
         if (this.widgets == null) {
            int var2 = this.widgetsCopy.length;
            this.widgets = new Widget[var2];
            System.arraycopy(this.widgetsCopy, 0, this.widgets, 0, this.widgetsCopy.length);
         }

         return this.widgets;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ev.f(" + ')');
      }
   }

   public Widget method889(int var1, short var2) {
      try {
         if (this.widgetsCopy[0].field867 >>> 16 != var1 >>> 16) {
            throw new IllegalArgumentException();
         } else {
            return this.widgetsCopy[var1 & '\uffff'];
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ev.b(" + ')');
      }
   }

   WidgetContainer(boolean var1, Widget[] var2) {
      this.widgetsCopy = var2;
      this.closed = var1;
   }

   static final void method890(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
      try {
         var0.field909 = 5;
         var0.field876 = class730.field2623;
         var0.field865 = 0;
         if (-1 == var0.field879 && !var1.closed) {
            class535.method2284(var0.field867, 1429753437);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ev.iz(" + ')');
      }
   }

   static final void method891(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9132.method2605(-1747444886);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ev.akh(" + ')');
      }
   }

   public static void method892(int var0, int var1) {
      try {
         class689 var2 = (class689)class371.field1088.method2942((long)var0);
         if (var2 != null) {
            var2.field7631 = !var2.field7631;
            var2.field7630.method1375(var2.field7631, -480568150);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ev.f(" + ')');
      }
   }

   static long method893(class265 var0, int var1, int var2, int var3) {
      try {
         long var4 = 4194304L;
         long var6 = Long.MIN_VALUE;
         ObjectDefinition var8 = class730.field2697.method5283(-1623210152).method4713(var0.method4551((byte)18));
         long var9 = (long)(var1 | var2 << 7 | var0.method4548(726839210) << 14 | var0.method4549((short)11182) << 20 | 1073741824);
         if (var8.field2214 == 0) {
            var9 |= var6;
         }

         if (var8.field2241 == 1) {
            var9 |= var4;
         }

         var9 |= (long)var0.method4551((byte)34) << 32;
         return var9;
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "ev.c(" + ')');
      }
   }

   static final void method894(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)0);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class370.method877(var3, var4, var0, (byte)-31);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ev.dl(" + ')');
      }
   }

   static void method895(class744 var0, int var1) {
      try {
         var0.field3161[var0.field3156 - 2] = class735.field3009.method4224(var0.field3161[var0.field3156 - 2], 245040087).field8993[var0.field3161[var0.field3156 - 1]];
         --var0.field3156;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ev.u(" + ')');
      }
   }

   static final void method896(int var0) {
      try {
         class730.field2852 = -1;
         class730.field2705 = 3;
         class345.field210 = null;
         class665.field9597 = null;
         class59.method1617(416919128);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ev.gj(" + ')');
      }
   }
}
