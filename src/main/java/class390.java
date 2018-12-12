import java.util.Queue;

final class class390 implements class477 {
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

   public static void method3421(int[][] var0, byte var1) {
      try {
         class381.field1412 = var0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pw.a(" + ')');
      }
   }

   static final long method3422(int var0) {
      try {
         return (long)(++class384.field1424 - 1) << 32 | 4294967295L;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "pw.qb(" + ')');
      }
   }

   static final void method3423(class744 var0, int var1) {
      try {
         var0.field3156 -= 12;
         class979.method1835(2025307040);
         class199.method3747(313309588);
         class764.field4348 = var0.field3161[var0.field3156];
         class124.field2412 = var0.field3161[var0.field3156 + 1];
         class166.field6895 = var0.field3161[2 + var0.field3156];
         class602.field8651 = var0.field3161[3 + var0.field3156];
         class677.field7465 = var0.field3161[4 + var0.field3156];
         class17.field6936 = var0.field3161[5 + var0.field3156];
         class420.field9723 = var0.field3161[6 + var0.field3156];
         class861.field9025 = var0.field3161[var0.field3156 + 7];
         class553.field519 = var0.field3161[var0.field3156 + 8];
         class958.field3480 = var0.field3161[9 + var0.field3156];
         class350.field1644 = var0.field3161[var0.field3156 + 10];
         class721.field3636 = var0.field3161[11 + var0.field3156];
         class562.field827.method3280(class677.field7465, -457216440);
         class562.field827.method3280(class17.field6936, -457216440);
         class562.field827.method3280(class420.field9723, -457216440);
         class562.field827.method3280(class861.field9025, -457216440);
         class562.field827.method3280(class553.field519, -457216440);
         class562.field827.method3280(class721.field3636, -457216440);
         class526.field3666.method3280(class721.field3636, -457216440);
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
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[var0.field3156 + 1];
         var0.field3161[++var0.field3156 - 1] = var2 > var3 ? var2 : var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pw.zw(" + ')');
      }
   }

   static final void method3425(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         int var3 = var0.field3161[--var0.field3156];
         var0.field3157[++var0.field3158 - 1] = var2 + var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pw.zi(" + ')');
      }
   }
}
