public abstract class class806 extends class783 {
   protected static int field4575 = 4;

   public abstract void method2834(class893 var1);

   public abstract boolean method2836();

   public abstract void method2839(int var1, class813 var2);

   public static void method2842(byte var0) {
      try {
         if (class382.method1061((byte)1) != class99.field625) {
            try {
               String var1 = class833.field9178.getParameter(class440.field7670.field7683);
               int var2 = (int)(class27.method3468((byte)1) / 86400000L) - 11745;
               String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
               class872.method5893(class833.field9178, "document.cookie=\"" + var3 + "\"", -1921482054);
            } catch (Throwable var4) {
               ;
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "we.ni(" + ')');
      }
   }

   public static class392 method2843(int var0) {
      try {
         if (class491.field7811 != null && class740.field3208 != null) {
            for(class392 var1 = (class392)class740.field3208.next(); var1 != null; var1 = (class392)class740.field3208.next()) {
               class718 var2 = class491.field7826.method5091(var1.field5396, -616779677);
               if (var2 != null && var2.field3531 && var2.method2063(class491.field7798, 1789313805)) {
                  return var1;
               }
            }

            return null;
         } else {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "we.ch(" + ')');
      }
   }
}
