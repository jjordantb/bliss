public class class182 {
   static int field5302 = 20074;
   static int field5303 = 5030;
   static int field5304 = 503;
   static long field5305 = 64425238954L;
   static int field5306 = 12010;
   static int field5307 = 5033;
   static int field5308 = 2018;
   static float field5309 = 1.1F;
   static int field5310 = 10033;
   static int field5311 = 1003;
   static int field5312 = 101;
   static long field5313 = 60129613779L;
   public static boolean field5314 = false;
   public static boolean field5315 = false;
   public static boolean field5316 = false;
   public static int field5317;

   class182() throws Throwable {
      throw new Error();
   }

   static final void method3304(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)-80);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class646.method5506(var3, var4, var0, -2017048321);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "al.fw(" + ')');
      }
   }

   static final void method3305(class744 var0, short var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         class785 var4 = class452.field7216.method5148(var3, 831421944);
         if (var4.method2380(1883696427)) {
            var0.field3157[++var0.field3158 - 1] = class333.field139.method5091(var2, -1801093114).method2065(var3, var4.field3823, (byte)-38);
         } else {
            var0.field3161[++var0.field3156 - 1] = class333.field139.method5091(var2, -183647434).method2067(var3, var4.field3822, 1379930702);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "al.amg(" + ')');
      }
   }

   static int method3306(byte[] var0, int var1, int var2, int var3) {
      try {
         int var4 = -1;

         for(int var5 = var1; var5 < var2; ++var5) {
            var4 = var4 >>> 8 ^ InputStream.field10377[(var4 ^ var0[var5]) & 255];
         }

         var4 = ~var4;
         return var4;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "al.a(" + ')');
      }
   }

   static void method3307(int var0) {
      try {
         class818.field4611 = 0;
         class775.field3700 = null;
         class654.field9350 = null;
         class818.field4621 = null;
         class818.field4625 = null;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "al.v(" + ')');
      }
   }

   static final void method3308(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class491.field7793 != null ? -947282109 * class491.field7793.field16 * -1929943701 : -1;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "al.aea(" + ')');
      }
   }

   static final void method3309(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = (int)(class341.field317 / 60000L);
         var0.field3161[++var0.field3156 - 1] = (int)((class341.field317 - class27.resetTimer((byte)1) - class722.field3632) / 60000L);
         var0.field3161[++var0.field3156 - 1] = class419.field9521 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "al.amh(" + ')');
      }
   }
}
