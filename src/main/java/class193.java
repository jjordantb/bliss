public class class193 {
   class1 field7018 = new class1(64);
   class385 field7019;
   public static class507 field7020 = new class507();
   class180 field7021;

   public void method3733(int var1) {
      try {
         class1 var2 = this.field7018;
         synchronized(this.field7018) {
            this.field7018.method2977();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "oo.f(" + ')');
      }
   }

   public void method3734(int var1, byte var2) {
      try {
         class1 var3 = this.field7018;
         synchronized(this.field7018) {
            this.field7018.method2976(var1, 88605032);
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "oo.b(" + ')');
      }
   }

   public void method3735(byte var1) {
      try {
         class1 var2 = this.field7018;
         synchronized(this.field7018) {
            this.field7018.method2979();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "oo.p(" + ')');
      }
   }

   public class507 method3736(int var1, byte var2) {
      try {
         class1 var3 = this.field7018;
         class507 var4;
         synchronized(this.field7018) {
            var4 = (class507)this.field7018.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field7021;
            byte[] var10;
            synchronized(this.field7021) {
               var10 = this.field7021.method3285(-1006924897 * class981.field3248.field3271, var1, (byte)-42);
            }

            var4 = new class507();
            var4.field3983 = this;
            if (var10 != null) {
               var4.method2507(new class907(var10), 162499609);
            }

            class1 var11 = this.field7018;
            synchronized(this.field7018) {
               this.field7018.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "oo.a(" + ')');
      }
   }

   public class193(class469 var1, class423 var2, class180 var3, class385 var4) {
      this.field7021 = var3;
      this.field7021.method3286(-1006924897 * class981.field3248.field3271, -994427694);
      this.field7019 = var4;
   }

   static final void method3737(class744 var0, byte var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var0.field3154.field1162 * 649879491;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "oo.xp(" + ')');
      }
   }

   static final void method3738(class744 var0, byte var1) {
      try {
         class615.field8903.method5391(class615.field8903.field9149, var0.field3161[(var0.field3156 -= -391880689) * 681479919], 951880368);
         class95.method523(656179282);
         Client.field2647 = false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "oo.aiy(" + ')');
      }
   }

   static final void method3739(class744 var0, short var1) {
      try {
         var0.field3156 -= -783761378;
         int var2 = var0.field3161[681479919 * var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156 * 681479919];
         if (class53.field2311) {
            class739.method1795(3, var2, var3, false, -1076746695);
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class296.field10468 != null ? 1 : 0;
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "oo.aed(" + ')');
      }
   }
}
