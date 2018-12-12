public class class754 {
   class1 field4205 = new class1(64);
   class180 field4206;
   public static class180 field4207;

   public class754(class469 var1, class423 var2, class180 var3) {
      this.field4206 = var3;
      this.field4206.method3286(class981.field3247.field3271, 236791533);
   }

   public void method2656(byte var1) {
      try {
         class1 var2 = this.field4205;
         synchronized(this.field4205) {
            this.field4205.method2977();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "uq.f(" + ')');
      }
   }

   public void method2657(int var1) {
      try {
         class1 var2 = this.field4205;
         synchronized(this.field4205) {
            this.field4205.method2979();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "uq.p(" + ')');
      }
   }

   public class954 method2658(int var1, int var2) {
      try {
         class1 var3 = this.field4205;
         class954 var4;
         synchronized(this.field4205) {
            var4 = (class954)this.field4205.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field4206;
            byte[] var10;
            synchronized(this.field4206) {
               var10 = this.field4206.method3285(class981.field3247.field3271, var1, (byte)-70);
            }

            var4 = new class954();
            if (var10 != null) {
               var4.method2088(new InputStream(var10), -420636240);
            }

            class1 var11 = this.field4205;
            synchronized(this.field4205) {
               this.field4205.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "uq.a(" + ')');
      }
   }

   public void method2659(int var1, int var2) {
      try {
         class1 var3 = this.field4205;
         synchronized(this.field4205) {
            this.field4205.method2976(var1, -862651401);
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "uq.b(" + ')');
      }
   }

   static class469[] method2660(byte var0) {
      try {
         return new class469[]{class469.field7322, class469.field7324, class469.field7320, class469.field7323, class469.field7325};
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "uq.a(" + ')');
      }
   }

   static final void method2661(class744 var0, int var1) {
      try {
         class888.method5533((byte)11);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "uq.wg(" + ')');
      }
   }

   static final void method2662(class564 var0, class131 var1, class744 var2, byte var3) {
      try {
         String var4 = (String)var2.field3157[--var2.field3158];
         if (class960.method2212(var4, var2, -1825255771) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field989 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "uq.lu(" + ')');
      }
   }
}
