public class class747 {
   public char field4143;
   public int field4144;
   public int field4145;
   public int field4146;
   public static int field4147;
   public static int field4148;

   void method2609(InputStream var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               return;
            }

            this.method2610(var1, var3, 2123525160);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pq.a(" + ')');
      }
   }

   void method2610(InputStream var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            this.field4143 = class954.method2092(var1.method6372(-12558881), 2024016549);
         } else if (var2 == 2) {
            this.field4144 = var1.method6374();
            this.field4145 = var1.method6371();
            this.field4146 = var1.method6371();
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pq.f(" + ')');
      }
   }

   static final void method2611(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class506 var3 = class395.method3397(var2, -1228274394);
         int var4 = -1;
         if (var3 != null) {
            var4 = var3.field4122;
         }

         var0.field3161[++var0.field3156 - 1] = var4;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pq.abv(" + ')');
      }
   }

   static final void method2612(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9113.method971(-460328639) == 1 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pq.ajg(" + ')');
      }
   }

   public static void method2613(int var0, int var1) {
      try {
         if (class878.method5922((byte)56)) {
            if (class881.field10145 != var0) {
               class881.field10146 = -1L;
            }

            class881.field10145 = var0;
            class730.field2674.method4374((byte)49);
            class967.method1750(4, 1551250847);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pq.q(" + ')');
      }
   }

   static final void method2614(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = (int)(class27.resetTimer((byte)1) / 60000L);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pq.akn(" + ')');
      }
   }
}
