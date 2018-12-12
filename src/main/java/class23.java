public abstract class class23 {
   static final void method3426(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class615.field8903.field9115.method1098(-26344378);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ta.ajy(" + ')');
      }
   }

   static final void method3427(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = -407713023 * ((class60)var0.field3159).field1637.field9862;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ta.apx(" + ')');
      }
   }

   public static String method3428(Object[] var0, int var1, int var2, byte var3) {
      try {
         if (var2 == 0) {
            return "";
         } else if (1 == var2) {
            CharSequence var10 = (CharSequence)var0[var1];
            return var10 == null ? "null" : var10.toString();
         } else {
            int var4 = var2 + var1;
            int var5 = 0;

            for(int var6 = var1; var6 < var4; ++var6) {
               CharSequence var7 = (CharSequence)var0[var6];
               if (var7 == null) {
                  var5 += 4;
               } else {
                  var5 += var7.length();
               }
            }

            StringBuilder var11 = new StringBuilder(var5);

            for(int var12 = var1; var12 < var4; ++var12) {
               CharSequence var8 = (CharSequence)var0[var12];
               if (var8 == null) {
                  var11.append("null");
               } else {
                  var11.append(var8);
               }
            }

            return var11.toString();
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "ta.f(" + ')');
      }
   }

   public static void method3429(class180 var0, byte var1) {
      try {
         class526.field3664 = var0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ta.a(" + ')');
      }
   }

   public static void method3430(int var0) {
      try {
         for(int var1 = 0; var1 < 100; ++var1) {
            class503.field4100[var1] = null;
         }

         class503.field4098 = 0;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ta.u(" + ')');
      }
   }
}
