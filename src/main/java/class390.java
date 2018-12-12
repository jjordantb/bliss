import java.util.Queue;

final class class390 implements class477 {
   public void method4646(boolean var1) {
   }

   public void method4645(boolean var1, byte var2) {
   }

   public void method4643(int var1, int var2, int var3, short var4) {
      try {
         int var5 = var1 >> 16;
         int var6 = var1 & '\uffff';
         Queue var7 = class978.field3127;
         synchronized(class978.field3127) {
            class978.field3127.add(class396.method3503(var5, var6, var2, var3, (byte)15));
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "pw.f(" + ')');
      }
   }

   public void method4644(int var1, int var2, int var3) {
      int var4 = var1 >> 16;
      int var5 = var1 & '\uffff';
      Queue var6 = class978.field3127;
      synchronized(class978.field3127) {
         class978.field3127.add(class396.method3503(var4, var5, var2, var3, (byte)15));
      }
   }

   public static void method3421(int[][] var0, byte var1) {
      try {
         class381.field1412 = var0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pw.a(" + ')');
      }
   }

   static final long method3422(int var0) {
      try {
         return (long)((class384.field1424 += -1596186261) * 1924989763 - 1) << 32 | 4294967295L;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "pw.qb(" + ')');
      }
   }

   static final void method3423(class744 var0, int var1) {
      try {
         var0.field3156 -= -407600972;
         class979.method1835(2025307040);
         class199.method3747(313309588);
         class764.field4348 = 1806117321 * var0.field3161[var0.field3156 * 681479919];
         class124.field2412 = -1838335691 * var0.field3161[681479919 * var0.field3156 + 1];
         class166.field6895 = 389597853 * var0.field3161[2 + 681479919 * var0.field3156];
         class602.field8651 = var0.field3161[3 + 681479919 * var0.field3156] * -1589801219;
         class677.field7465 = -666665017 * var0.field3161[4 + var0.field3156 * 681479919];
         class17.field6936 = var0.field3161[5 + var0.field3156 * 681479919] * 207797751;
         class420.field9723 = var0.field3161[6 + 681479919 * var0.field3156] * -741526353;
         class861.field9025 = var0.field3161[681479919 * var0.field3156 + 7] * -221610643;
         class553.field519 = var0.field3161[681479919 * var0.field3156 + 8] * 1226151685;
         class958.field3480 = -994575607 * var0.field3161[9 + var0.field3156 * 681479919];
         class350.field1644 = -1941123577 * var0.field3161[681479919 * var0.field3156 + 10];
         class721.field3636 = var0.field3161[11 + var0.field3156 * 681479919] * -1418353209;
         class562.field827.method3280(class677.field7465 * 142643703, -457216440);
         class562.field827.method3280(class17.field6936 * 1757615047, -457216440);
         class562.field827.method3280(1049272911 * class420.field9723, -457216440);
         class562.field827.method3280(-745532315 * class861.field9025, -457216440);
         class562.field827.method3280(class553.field519 * -684155443, -457216440);
         class562.field827.method3280(class721.field3636 * -2085188617, -457216440);
         class526.field3666.method3280(-2085188617 * class721.field3636, -457216440);
         class51.field2309 = null;
         class593.field1622 = null;
         class103.field206 = null;
         class295.field10479 = null;
         class371.field1090 = null;
         class166.field6897 = null;
         class407.field9260 = null;
         class936.field10314 = null;
         class602.field8663 = true;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pw.afr(" + ')');
      }
   }

   static final void method3424(class744 var0, int var1) {
      try {
         var0.field3156 -= -783761378;
         int var2 = var0.field3161[681479919 * var0.field3156];
         int var3 = var0.field3161[681479919 * var0.field3156 + 1];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var2 > var3 ? var2 : var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pw.zw(" + ')');
      }
   }

   static final void method3425(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[(var0.field3158 -= 969361751) * -203050393];
         int var3 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = var2 + var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pw.zi(" + ')');
      }
   }
}
