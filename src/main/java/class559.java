public final class class559 {
   static short field542;
   volatile String field543;
   public volatile int field544 = -1;
   static boolean field545;

   class559(String var1) {
      this.field543 = var1;
   }

   static void method475(String var0, int var1) {
      try {
         class730.field2909 = var0;
         if (class382.method1061((byte)-104) != class99.field625) {
            try {
               String var2 = class833.field9178.getParameter(class440.field7666.field7683);
               String var3 = class833.field9178.getParameter(class440.field7670.field7683);
               String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
               if (var0.length() == 0) {
                  var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
               } else {
                  var4 = var4 + "; Expires=" + class882.method6196(class27.resetTimer((byte)1) + 94608000000L) + "; Max-Age=" + 94608000L;
               }

               class872.method5893(class833.field9178, "document.cookie=\"" + var4 + "\"", -1926451476);
            } catch (Throwable var5) {
               ;
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "qk.nf(" + ')');
      }
   }

   static final void method476(class744 var0, int var1) {
      try {
         if (class823.field9045 != null) {
            var0.field3161[++var0.field3156 - 1] = 1;
            var0.field3169 = class823.field9045;
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qk.wk(" + ')');
      }
   }

   public static final boolean method477(String var0, String var1, String var2, String var3, int var4) {
      try {
         if (var0 != null && var2 != null) {
            return !var0.startsWith("#") && !var2.startsWith("#") ? var1.equals(var3) : var0.equals(var2);
         } else {
            return false;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "qk.a(" + ')');
      }
   }
}
