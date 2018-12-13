public class class711 extends class345 {
   NodeTable field3446;

   void method2021(InputStream var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               return;
            }

            this.method2023(var1, var3, 1595820905);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aim.a(" + ')');
      }
   }

   public int method2022(int var1, int var2, short var3) {
      try {
         if (this.field3446 == null) {
            return var2;
         } else {
            class722 var4 = (class722)this.field3446.method2942((long)var1);
            return var4 == null ? var2 : var4.field3631;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aim.b(" + ')');
      }
   }

   void method2023(InputStream var1, int var2, int var3) {
      try {
         if (var2 == 249) {
            int var4 = var1.method6371();
            int var5;
            if (this.field3446 == null) {
               var5 = class18.method3687(var4, (byte)16);
               this.field3446 = new NodeTable(var5);
            }

            for(var5 = 0; var5 < var4; ++var5) {
               boolean var6 = var1.method6371() == 1;
               int var7 = var1.method6390((byte)-75);
               Object var8;
               if (var6) {
                  var8 = new class437(var1.method6379(281550837));
               } else {
                  var8 = new class722(var1.method6420((byte)-72));
               }

               this.field3446.method2947((Node)var8, (long)var7);
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "aim.f(" + ')');
      }
   }

   public String method2024(int var1, String var2, byte var3) {
      try {
         if (this.field3446 == null) {
            return var2;
         } else {
            class437 var4 = (class437)this.field3446.method2942((long)var1);
            return var4 == null ? var2 : (String)var4.field7515;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aim.p(" + ')');
      }
   }

   public static void method2025(Actor var0, int[] var1, int[] var2, int[] var3, int var4) {
      try {
         for(int var5 = 0; var5 < var1.length; ++var5) {
            int var6 = var1[var5];
            int var7 = var3[var5];
            int var8 = var2[var5];

            for(int var9 = 0; var7 != 0 && var9 < var0.field4076.length; var7 >>>= 1) {
               if ((var7 & 1) != 0) {
                  if (-1 == var6) {
                     var0.field4076[var9] = null;
                  } else {
                     Animation var10 = class936.field10313.method2256(var6, (byte)-80);
                     int var11 = var10.field6668;
                     class761 var12 = var0.field4076[var9];
                     if (var12 != null && var12.method2775((byte)-110)) {
                        if (var6 == var12.method2779(1502559146)) {
                           if (var11 == 0) {
                              var0.field4076[var9] = null;
                              var12 = null;
                           } else if (var11 == 1) {
                              var12.method2790(83585082);
                              var12.field4392 = var8;
                           } else if (2 == var11) {
                              var12.method2798(1476401100);
                           }
                        } else if (var10.field6662 >= var12.method2776(595695662).field6662) {
                           var0.field4076[var9] = null;
                           var12 = null;
                        }
                     }

                     if (var12 == null || !var12.method2775((byte)-3)) {
                        var12 = var0.field4076[var9] = new class761(var0);
                        var12.method2777(var6, -1608832147);
                        var12.field4392 = var8;
                     }
                  }
               }

               ++var9;
            }
         }

      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "aim.ix(" + ')');
      }
   }

   static final void method2026(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         int var3 = var0.field3161[--var0.field3156];
         var0.field3157[++var0.field3158 - 1] = var2 + class665.method5715(var3, true, (byte)8);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aim.zy(" + ')');
      }
   }
}
