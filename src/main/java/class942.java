public class class942 {
   class1 field10345 = new class1(64);
   public int field10346;
   class180 field10347;
   static int field10348;

   public class942(class469 var1, class423 var2, class180 var3) {
      this.field10347 = var3;
      this.field10346 = this.field10347.method3286(-1006924897 * class981.field3235.field3271, -1214131434) * 1832969825;
   }

   public class871 method6332(int var1, byte var2) {
      try {
         class1 var3 = this.field10345;
         class871 var4;
         synchronized(this.field10345) {
            var4 = (class871)this.field10345.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field10347;
            byte[] var10;
            synchronized(this.field10347) {
               var10 = this.field10347.method3285(class981.field3235.field3271 * -1006924897, var1, (byte)-73);
            }

            var4 = new class871();
            if (var10 != null) {
               var4.method5897(new class907(var10), 1327711716);
            }

            class1 var11 = this.field10345;
            synchronized(this.field10345) {
               this.field10345.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "uj.a(" + ')');
      }
   }

   public static boolean method6333(String var0, int var1) {
      try {
         if (var0 == null) {
            return false;
         } else {
            for(int var2 = 0; var2 < class730.field2923 * -1054937867; ++var2) {
               if (var0.equalsIgnoreCase(class730.field2685[var2])) {
                  return true;
               }
            }

            return var0.equalsIgnoreCase(class923.field10295.field3374);
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "uj.md(" + ')');
      }
   }

   static void method6334(int var0, int var1, int var2) {
      try {
         class682 var3 = class370.method881(16, (long)var0);
         var3.method4340((byte)109);
         var3.field7687 = 1274450087 * var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "uj.an(" + ')');
      }
   }
}
