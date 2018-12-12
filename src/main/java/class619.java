public class class619 extends class535 {
   public static int field8865 = 2;
   public static int field8866 = 0;
   public static int field8867 = 1;
   public static class368 field8868;
   public static boolean field8869;

   public class619(int var1, class838 var2) {
      super(var1, var2);
   }

   public int method2273(int var1, int var2) {
      try {
         return super.field3704.field9123.method5845(1970105760) == 0 ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "adh.f(" + ')');
      }
   }

   int method2272(int var1) {
      return 2;
   }

   public boolean method5180(int var1) {
      try {
         return super.field3704.field9123.method5845(1897479169) != 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adh.z(" + ')');
      }
   }

   public void method5181(int var1) {
      try {
         if (super.field3704.field9123.method5845(1884189410) == 0) {
            super.field3708 = 0;
         }

         if (super.field3708 < 0 || super.field3708 > 2) {
            super.field3708 = this.method2272(1169939305);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adh.s(" + ')');
      }
   }

   void method2275(int var1, int var2) {
      try {
         super.field3708 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "adh.p(" + ')');
      }
   }

   public class619(class838 var1) {
      super(var1);
   }

   public int method5182(int var1) {
      try {
         return super.field3708;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adh.y(" + ')');
      }
   }

   public static class858 method5183(InputStream var0, byte var1) {
      try {
         int var2 = var0.method6371();
         int[] var3 = new int[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = var0.method6371();
         }

         return new class858(var3);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "adh.p(" + ')');
      }
   }
}
