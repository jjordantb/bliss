public class class878 {
   class389 field9817;
   int field9818;
   static int field9819;
   static class219 field9820;
   public static int field9821;

   public class878(class389 var1, int var2) {
      this.field9817 = var1;
      this.field9818 = -2062685815 * var2;
   }

   public class864 method5918(byte var1) {
      try {
         class508 var2 = (class508) Client.field2666.method2942((long)(this.field9817.field1523 * 1008331379 << 28 | 283514611 * this.field9817.field1522 << 14 | -1760580017 * this.field9817.field1521));
         if (var2 == null) {
            return null;
         } else {
            class389 var3 = Client.field2697.method5270(681479919);
            int var4 = -1760580017 * this.field9817.field1521 - var3.field1521 * -1760580017;
            int var5 = 283514611 * this.field9817.field1522 - 283514611 * var3.field1522;
            if (var4 >= 0 && var5 >= 0 && var4 < Client.field2697.method5271(-2079172057) && var5 < Client.field2697.method5272(-583720048)) {
               for(class31 var6 = (class31)var2.field3966.method901(1766612795); var6 != null; var6 = (class31)var2.field3966.method906(49146)) {
                  if (-1600299847 * this.field9818 == var6.field5319 * 1768239597) {
                     return (class864) Client.field2697.method5317(-1611682495).method2428(this.field9817.field1523 * 1008331379, var4, var5, -1919026118);
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "qp.a(" + ')');
      }
   }

   public static class235[] method5919(short var0) {
      try {
         return new class235[]{class235.field8247, class235.field8245, class235.field8250, class235.field8243, class235.field8244, class235.field8249, class235.field8248, class235.field8246, class235.field8242, class235.field8251};
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "qp.a(" + ')');
      }
   }

   public static final void method5920(class879 var0, class765 var1, class765 var2, int var3) {
      try {
         if (var1.method2794((short)225) && var2.method2794((short)225)) {
            class160 var4 = var1.field4373;
            class160 var5 = var2.field4373;
            var0.method5962(var1.field4383.field9760, var1.field4383.field9761 * 806878007, var1.field4383.field9764, -643912397 * var1.field4383.field9763, var1.field4374 * 458730501, var4.field6653[-8792169 * var1.field4372], var2.field4383.field9760, 806878007 * var2.field4383.field9761, var2.field4383.field9764, -643912397 * var2.field4383.field9763, 458730501 * var2.field4374, var5.field6653[var2.field4372 * -8792169], var4.field6661, var4.field6669 | var5.field6669);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "qp.g(" + ')');
      }
   }

   static final void method5921(class744 var0, byte var1) {
      try {
         var0.field3156 -= -1175642067;
         int var2 = var0.field3161[var0.field3156 * 681479919];
         int var3 = var0.field3161[681479919 * var0.field3156 + 1];
         int var4 = var0.field3161[var0.field3156 * 681479919 + 2];
         class282 var5 = class906.field10363.method2713(var2, (short)-10858);
         if (var5.method6652(var3, -827579127).field201 * -1682932563 != 0) {
            throw new RuntimeException("");
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var5.method6650(var3, var4, 2025629699);
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "qp.adp(" + ')');
      }
   }

   static boolean method5922(byte var0) {
      try {
         if (19 != -1233866115 * Client.field2733) {
            return false;
         } else {
            return !class673.method4261((byte)-29) && !class556.method431(-391880689);
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "qp.ao(" + ')');
      }
   }
}
