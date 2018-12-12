public class class457 extends class347 {
   int field7207;
   int field7208;
   int field7209;

   class457(int var1) {
      super(0, false);
      this.method3837(var1, 208799873);
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = super.field266.method162(var1, (byte)58);
         if (super.field266.field211) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];

            for(int var7 = 0; var7 < class322.field831; ++var7) {
               var4[var7] = this.field7209;
               var5[var7] = this.field7208;
               var6[var7] = this.field7207;
            }
         }

         return var3;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "agx.k(" + ')');
      }
   }

   void method209(int var1, InputStream var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.method3837(var2.method6390((byte)-79), -1376773689);
         default:
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "agx.r(" + ')');
      }
   }

   void method3837(int var1, int var2) {
      try {
         this.field7207 = (var1 & 255) << 4;
         this.field7208 = (var1 & '\uff00') >> 4;
         this.field7209 = (var1 & 16711680) >> 12;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agx.ac(" + ')');
      }
   }

   public class457() {
      this(0);
   }

   public static void method3841(class811 var0, int var1, int var2) {
      try {
         class818.field4614.method6566((byte)62);
         class272 var3 = var0.method2919(47610786);
         if (var3 != null) {
            class818.field4615.method2635(1423546726);
            class818.field4614 = var3;
            class818.field4614.method6565(var0.method2918(-1730334000), false, (byte)90);
            class818.field4614.method6568(var1, 1926330524);
            if (class818.field4615 != null) {
               class818.field4615.method2625(class818.field4614, 1556269790);
            }

            class182.method3307(-659623615);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agx.h(" + ')');
      }
   }
}
