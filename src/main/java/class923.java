public class class923 {
   public int field10290;
   public int field10291;
   public int field10292;
   public int field10293;
   static class180 field10294;
   public static class946 field10295;

   class923(int var1, int var2, int var3, int var4) {
      this.field10290 = var1 * -236522629;
      this.field10291 = var2 * -831965479;
      this.field10292 = var3 * 1993464961;
      this.field10293 = -359546329 * var4;
   }

   class923() {
      this.field10290 = (32 + (int)(Math.random() * 4.0D)) * -236522629;
      this.field10291 = (3 + (int)(Math.random() * 2.0D)) * -831965479;
      this.field10292 = (16 + (int)(Math.random() * 3.0D)) * 1993464961;
      if (class615.field8903.field9123.method5845(2133264539) == 1) {
         this.field10293 = (int)(Math.random() * 6.0D) * -359546329;
      } else {
         this.field10293 = (int)(Math.random() * 12.0D) * -359546329;
      }

   }

   public static boolean method6258(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (var0 < var6 + var4 && var4 < var0 + var2) {
            return var1 < var5 + var7 && var5 < var3 + var1;
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "lx.t(" + ')');
      }
   }

   static final void method6259(class744 var0, byte var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 1914527151 * class206.field7099;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lx.amv(" + ')');
      }
   }

   public static boolean method6260(String var0, int var1) {
      try {
         if (var0 == null) {
            return false;
         } else {
            for(int var2 = 0; var2 < -548972447 * class730.field2934; ++var2) {
               if (var0.equalsIgnoreCase(class730.field2936[var2])) {
                  return true;
               }

               if (var0.equalsIgnoreCase(class730.field2754[var2])) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lx.mc(" + ')');
      }
   }

   static final void method6261(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class730.field2902[var2].field10624 * 1869840307;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lx.yd(" + ')');
      }
   }
}
