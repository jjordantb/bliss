public class class810 extends class304 {
   int field4599;
   int field4600;
   int field4601;
   int field4602;
   int field4603;
   int field4604;

   public void method2383(int var1) {
      try {
         class949.field3333[this.field4600].method3790(0, -1291875097);
         class949.field3333[this.field4603].method3790(1, -853378806);
         class730.field2749 = 0;
         class730.field2751 = this.field4601;
         class730.field2839 = 0;
         class730.field2834 = this.field4604;
         class730.field2755 = this.field4602;
         class730.field2750 = 1;
         class730.field2752 = this.field4599;
         class563.field1083 = 1;
         class515.method2694((byte)66);
         class730.field2706 = true;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xp.f(" + ')');
      }
   }

   class810(InputStream var1) {
      super(var1);
      this.field4600 = var1.method6374();
      this.field4603 = var1.method6374();
      this.field4601 = var1.method6374();
      this.field4599 = var1.method6374();
      this.field4604 = var1.method6374();
      this.field4602 = var1.method6374();
   }

   static void method2895(class344 var0, boolean var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8) {
      try {
         int var9 = class730.field2697.method5277(-115794055);
         int var10 = class730.field2697.method5276((byte)-118);
         var0.method279(var2, var3, var4, var5, (float)var10, (float)var9, (float)var6, (float)var7);
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "xp.fj(" + ')');
      }
   }

   static final void method2896(class513 var0, int var1) {
      try {
         for(int var2 = 0; var2 < class498.field8112; ++var2) {
            int var3 = class498.field8113[var2];
            Player var4 = class730.loaded[var3];
            int var5 = var0.method6371();
            if ((var5 & 2) != 0) {
               var5 += var0.method6371() << 8;
            }

            if ((var5 & 1024) != 0) {
               var5 += var0.method6371() << 16;
            }

            class45.method3080(var0, var3, var4, var5);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "xp.d(" + ')');
      }
   }

   static final void method2897(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class881.field10182;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xp.ahn(" + ')');
      }
   }
}
