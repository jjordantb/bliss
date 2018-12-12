public class class800 extends class345 {
   public int[] field4576;
   static class811 field4577;
   public int[] field4578;
   public int field4579 = 0;
   public int field4580 = 0;

   void method2881(InputStream var1, int var2, byte var3) {
      try {
         if (2 == var2) {
            this.field4579 = var1.method6374();
         } else if (4 == var2) {
            this.field4580 = var1.method6371();
            this.field4576 = new int[this.field4580];
            this.field4578 = new int[this.field4580];

            for(int var4 = 0; var4 < this.field4580; ++var4) {
               this.field4576[var4] = var1.method6374();
               this.field4578[var4] = var1.method6374();
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aiq.f(" + ')');
      }
   }

   void method2882(InputStream var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               return;
            }

            this.method2881(var1, var3, (byte)-87);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aiq.a(" + ')');
      }
   }
}
