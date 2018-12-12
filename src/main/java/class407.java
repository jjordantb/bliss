public class class407 extends class304 {
   long field9258;
   int field9259;
   public static class48 field9260;
   public static String field9261;

   public void method2383(int var1) {
      try {
         class722 var2 = (class722)class949.field3321.method2942(this.field9258);
         if (var2 != null) {
            var2.field3631 = this.field9259;
         } else {
            class949.field3321.method2947(new class722(this.field9259), this.field9258);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xq.f(" + ')');
      }
   }

   class407(InputStream var1, boolean var2) {
      super(var1);
      int var3 = var1.method6374();
      if (var2) {
         this.field9258 = 4294967296L | (long)var3;
      } else {
         this.field9258 = (long)var3;
      }

      this.field9259 = var1.method6420((byte)-88);
   }

   static final void method5535(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-30);
         class587.method166(var3, var0, (byte)24);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "xq.qw(" + ')');
      }
   }

   public static void method5536(int var0, int var1) {
      try {
         class866.field9767[var0] = false;
         class554.method429(var0, -175879726);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xq.u(" + ')');
      }
   }

   static final void method5537(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9136.method2273(var2, 1352882135);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xq.aoh(" + ')');
      }
   }

   static void method5538(int var0, int var1, int var2) {
      try {
         class682 var3 = class370.method881(6, (long)var0);
         var3.method4340((byte)15);
         var3.field7687 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "xq.as(" + ')');
      }
   }

   static void method5539(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      boolean var14 = false;

      try {
         long var6 = (long)(var0 | (var4 ? Integer.MIN_VALUE : 0));
         class163 var8 = (class163)class163.field6617.method2942(var6);
         if (var8 == null) {
            var8 = new class163();
            class163.field6617.method2947(var8, var6);
         }

         if (var8.field6619.length <= var1) {
            int[] var9 = new int[var1 + 1];
            int[] var10 = new int[var1 + 1];

            int var11;
            for(var11 = 0; var11 < var8.field6619.length; ++var11) {
               var9[var11] = var8.field6619[var11];
               var10[var11] = var8.field6620[var11];
            }

            for(var11 = var8.field6619.length; var11 < var1; ++var11) {
               var9[var11] = -1;
               var10[var11] = 0;
            }

            var8.field6619 = var9;
            var8.field6620 = var10;
         }

         var8.field6619[var1] = var2;
         var8.field6620[var1] = var3;
      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "xq.d(" + ')');
      }
   }

   static final void method5540(class744 var0, byte var1) {
      try {
         if (class730.field2733 == 14 && !class673.method4261((byte)9)) {
            if (class601.field9198) {
               var0.field3161[++var0.field3156 - 1] = 0;
            } else if (class191.field7004 > class27.method3468((byte)1) - 1000L) {
               var0.field3161[++var0.field3156 - 1] = 1;
            } else {
               class601.field9198 = true;
               class701 var2 = class637.method5936(class643.field10008, class730.field2674.field7765, (byte)42);
               var2.field3364.method6364(class118.field2158, -933492277);
               class730.field2674.method4380(var2, (byte)-36);
               var0.field3161[++var0.field3156 - 1] = 0;
            }
         } else {
            var0.field3161[++var0.field3156 - 1] = 1;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xq.alo(" + ')');
      }
   }
}
