public class class482 {
   public static class482 field8396 = new class482(4, 2);
   static class482 field8397 = new class482(0, 4);
   static class482 field8398 = new class482(8, 4);
   public static class482 field8399 = new class482(1, 1);
   public static class482 field8400 = new class482(6, 2);
   public static class482 field8401 = new class482(7, 3);
   static class482 field8402 = new class482(2, 1);
   public static class482 field8403 = new class482(3, 4);
   static class482 field8404 = new class482(5, 2);
   public int field8405;
   public int field8406;

   class482(int var1, int var2) {
      this.field8405 = var1;
      this.field8406 = var2;
   }

   static final void method4717(class744 var0, int var1) {
      try {
         String var2;
         if (class923.local != null && class923.local.field3379 != null) {
            var2 = class923.local.method1998(false, (byte)-122);
         } else {
            var2 = "";
         }

         var0.field3157[++var0.field3158 - 1] = var2;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "dc.acq(" + ')');
      }
   }

   public static byte[] method4718(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            char var5 = var0.charAt(var4);
            if (var5 > 0 && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
               var3[var4] = (byte)var5;
            } else if ('€' == var5) {
               var3[var4] = -128;
            } else if ('‚' == var5) {
               var3[var4] = -126;
            } else if ('ƒ' == var5) {
               var3[var4] = -125;
            } else if (var5 == '„') {
               var3[var4] = -124;
            } else if ('…' == var5) {
               var3[var4] = -123;
            } else if ('†' == var5) {
               var3[var4] = -122;
            } else if ('‡' == var5) {
               var3[var4] = -121;
            } else if ('ˆ' == var5) {
               var3[var4] = -120;
            } else if ('‰' == var5) {
               var3[var4] = -119;
            } else if ('Š' == var5) {
               var3[var4] = -118;
            } else if (var5 == '‹') {
               var3[var4] = -117;
            } else if ('Œ' == var5) {
               var3[var4] = -116;
            } else if (var5 == 'Ž') {
               var3[var4] = -114;
            } else if ('‘' == var5) {
               var3[var4] = -111;
            } else if ('’' == var5) {
               var3[var4] = -110;
            } else if (var5 == '“') {
               var3[var4] = -109;
            } else if ('”' == var5) {
               var3[var4] = -108;
            } else if (var5 == '•') {
               var3[var4] = -107;
            } else if ('–' == var5) {
               var3[var4] = -106;
            } else if ('—' == var5) {
               var3[var4] = -105;
            } else if ('˜' == var5) {
               var3[var4] = -104;
            } else if ('™' == var5) {
               var3[var4] = -103;
            } else if ('š' == var5) {
               var3[var4] = -102;
            } else if (var5 == '›') {
               var3[var4] = -101;
            } else if (var5 == 'œ') {
               var3[var4] = -100;
            } else if ('ž' == var5) {
               var3[var4] = -98;
            } else if ('Ÿ' == var5) {
               var3[var4] = -97;
            } else {
               var3[var4] = 63;
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "dc.i(" + ')');
      }
   }

   public static boolean method4719(int var0, int var1, byte var2) {
      try {
         if (!class602.field8645) {
            return false;
         } else {
            int var3 = var0 >> 16;
            int var4 = var0 & '\uffff';
            if (class382.field1410[var3] != null && class382.field1410[var3].field1103[var4] != null) {
               class564 var5 = class382.field1410[var3].field1103[var4];
               class357 var6;
               if (var1 == -1 && var5.field869 == 0) {
                  for(var6 = (class357)class602.field8647.method901(1766612795); var6 != null; var6 = (class357)class602.field8647.method906(49146)) {
                     if (58 == var6.field1702 || 1007 == var6.field1702 || var6.field1702 == 25 || var6.field1702 == 57 || 30 == var6.field1702) {
                        for(class564 var7 = class449.method3756(var6.field1703, (byte)-39); var7 != null; var7 = class317.method471(class382.field1410[var7.field867 >> 16], var7, -1653818376)) {
                           if (var7.field867 == var5.field867) {
                              return true;
                           }
                        }
                     }
                  }
               } else {
                  for(var6 = (class357)class602.field8647.method901(1766612795); var6 != null; var6 = (class357)class602.field8647.method906(49146)) {
                     if (var6.field1698 == var1 && var5.field867 == var6.field1703 && (var6.field1702 == 58 || var6.field1702 == 1007 || var6.field1702 == 25 || 57 == var6.field1702 || var6.field1702 == 30)) {
                        return true;
                     }
                  }
               }

               return false;
            } else {
               return false;
            }
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "dc.ah(" + ')');
      }
   }

   static void method4720(int var0, short var1) {
      try {
         class896.field9358 = var0;
         class740.field3206 = -1;
         class740.field3201 = -1;
         class640.method6191(65536);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "dc.cj(" + ')');
      }
   }
}
