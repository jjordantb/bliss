public class class568 {
   public class568 field640;
   public long field641;
   public class568 field642;
   public static int field643;
   static int field644;
   static int field645;

   public void method545(int var1) {
      try {
         if (this.field642 != null) {
            this.field642.field640 = this.field640;
            this.field640.field642 = this.field642;
            this.field640 = null;
            this.field642 = null;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mk.t(" + ')');
      }
   }

   public boolean method546(int var1) {
      try {
         return this.field642 != null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mk.h(" + ')');
      }
   }

   static final void method547(class744 var0, int var1) {
      try {
         var0.field3156 -= 2;
         class800 var2 = class540.field3930.method2319(var0.field3161[var0.field3156], 894186762);
         int var3 = var0.field3161[var0.field3156 + 1];
         int var4 = -1;

         for(int var5 = 0; var5 < var2.field4580; ++var5) {
            if (var3 == var2.field4576[var5]) {
               var4 = var2.field4578[var5];
               break;
            }
         }

         var0.field3161[++var0.field3156 - 1] = var4;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "mk.tu(" + ')');
      }
   }

   static final void method548(class744 var0, int var1) {
   }

   static final void method549(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9135.method5225((byte)23);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mk.ajm(" + ')');
      }
   }

   public static class526 method550(int var0, int var1) {
      try {
         class526 var2 = (class526)class526.field3657.method2974((long)var0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class526.field3664.method3285(0, var0, (byte)-64);
            var2 = new class526();
            if (var3 != null) {
               var2.method2222(new InputStream(var3), var0, (byte)-27);
            }

            class526.field3657.method2984(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mk.f(" + ')');
      }
   }
}
