public class class771 extends class14 {
   public static class180 field3732;

   boolean method3583(int var1) {
      try {
         return this.method2299((short)10071) != null || super.field6690 < class27.method3468((byte)1) - 2000L;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adi.u(" + ')');
      }
   }

   class284 method2299(short var1) {
      try {
         return (class284)class730.field2808.method901(1766612795);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adi.az(" + ')');
      }
   }

   class701 method3597(byte var1) {
      try {
         return class637.method5936(class643.field9932, class730.field2692.field7765, (byte)89);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adi.x(" + ')');
      }
   }

   void method3581(InputStream var1, class284 var2, byte var3) {
   }

   void method3582(byte var1) {
      try {
         class284 var2 = this.method2299((short)12232);
         if (var2 != null) {
            int var3 = this.method3579(var2, 32767, (byte)9);
            int var4 = var2.method6680(-1870529488);
            if (var4 < 0) {
               var4 = 0;
            } else if (var4 > 65535) {
               var4 = 65535;
            }

            int var5 = var2.method6667((byte)-26);
            if (var5 < 0) {
               var5 = 0;
            } else if (var5 > 65535) {
               var5 = 65535;
            }

            byte var6 = 0;
            if (var2.method6666(-1372966703) == 2) {
               var6 = 1;
            }

            class701 var7 = class637.method5936(class643.field9945, class730.field2692.field7765, (byte)8);
            var7.field3364.method6364(var5 | var4 << 16, 121434419);
            var7.field3364.method6419(var3 | var6 << 15);
            class730.field2692.method4380(var7, (byte)-44);
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "adi.d(" + ')');
      }
   }

   int method3580(int var1) {
      return 0;
   }

   public static void method2300(boolean var0, boolean var1, int var2) {
      try {
         if (var0) {
            ++class543.field3818;
            class190.method3726(-1915881134);
         }

         if (var1) {
            ++class543.field3816;
            class675.method4165((byte)1);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "adi.a(" + ')');
      }
   }

   static final void method2301(class744 var0, byte var1) {
      try {
         var0.field3156 -= 2;
         class730.field2813 = var0.field3161[var0.field3156];
         class730.field2671 = var0.field3161[1 + var0.field3156];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adi.afv(" + ')');
      }
   }
}
