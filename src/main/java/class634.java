public class class634 extends class827 {
   public int field9788;
   public int field9789;
   static class48[] field9790;

   public class7 method6197(int var1) {
      try {
         return class7.field4908;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "zw.f(" + ')');
      }
   }

   class634(class971 var1, class49 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      this.field9788 = var10;
      this.field9789 = var11;
   }

   static final Object[] method5872(String var0, class744 var1, int var2) {
      try {
         Object[] var3 = new Object[var0.length() + 1];

         int var4;
         for(var4 = var3.length - 1; var4 >= 1; --var4) {
            if (var0.charAt(var4 - 1) == 's') {
               var3[var4] = var1.field3157[--var1.field3158];
            } else if (var0.charAt(var4 - 1) == '§') {
               var3[var4] = new Long(var1.field3168[--var1.field3162]);
            } else {
               var3[var4] = new Integer(var1.field3161[--var1.field3156]);
            }
         }

         var4 = var1.field3161[--var1.field3156];
         if (-1 != var4) {
            var3[0] = new Integer(var4);
         } else {
            var3 = null;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "zw.kt(" + ')');
      }
   }
}
