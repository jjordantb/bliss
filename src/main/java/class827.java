public class class827 implements class925 {
   public class971 field9028;
   public class49 field9029;
   public int field9030;
   public int field9031;
   public int field9032;
   public int field9033;
   public int field9034;
   public int field9035;
   public int field9036;
   public static class646 field9037;

   public class7 method6197(int var1) {
      return null;
   }

   class827(class971 var1, class49 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.field9028 = var1;
      this.field9029 = var2;
      this.field9033 = var3;
      this.field9031 = var4;
      this.field9032 = var5;
      this.field9036 = var6;
      this.field9034 = var7;
      this.field9035 = var8;
      this.field9030 = var9;
   }

   static final void method5355(boolean var0, class744 var1, int var2) {
      try {
         int var3 = var1.field3161[--var1.field3156];
         Widget var4 = class449.method3756(var3, (byte)53);
         WidgetContainer var5 = class382.widgetContainers[var3 >> 16];
         if (var0) {
            class277.method6634(var5, var4, -1270501871);
         } else {
            class414.method5597(var5, var4, (byte)-21);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "fe.cm(" + ')');
      }
   }

   static final void method5356(Widget var0, WidgetContainer var1, class744 var2, int var3) {
      try {
         var0.field908 = var2.field3161[--var2.field3156] == 1;
         class814.method2932(var0, 100999784);
         if (-1 == var0.field879 && !var1.closed) {
            class392.method3383(var0.field867, -285766228);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fe.hi(" + ')');
      }
   }

   public static boolean method5357(int var0, int var1) {
      try {
         return var0 == 0 || 1 == var0 || var0 == 2;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fe.k(" + ')');
      }
   }

   static final void method5358(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         int var3 = class730.field2902[var2].method6657(-574288948);
         var0.field3161[++var0.field3156 - 1] = var3 == 2 ? 1 : 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "fe.yy(" + ')');
      }
   }
}
