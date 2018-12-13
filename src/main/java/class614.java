import java.awt.Frame;

public class class614 {
   int field8885;
   int field8886;
   class389 field8887;
   static int field8888;

   public class614(class389 var1, int var2, int var3, int var4) {
      this.field8887 = var1;
      this.field8885 = var2;
      this.field8886 = var4;
   }

   int method5185(int var1) {
      try {
         return class730.field2720[this.field8885];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qz.a(" + ')');
      }
   }

   public class265 method5186(int var1) {
      try {
         class265 var2 = this.method5187(804311649);
         if (var2 == null) {
            return null;
         } else {
            return var2.method4551((byte)42) != this.field8886 ? null : var2;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qz.f(" + ')');
      }
   }

   class265 method5187(int var1) {
      try {
         int var2 = this.field8887.field1523;
         class389 var3 = class730.field2697.method5270(681479919);
         int var4 = this.field8887.field1521 - var3.field1521;
         int var5 = this.field8887.field1522 - var3.field1522;
         if (var4 >= 0 && var5 >= 0 && var4 < class730.field2697.method5271(-1998327105) && var5 < class730.field2697.method5272(539294898)) {
            switch(this.method5185(-2091768912)) {
            case 0:
               return (class265)class730.field2697.method5317(-1611682495).method2425(var2, var4, var5, 1566382166);
            case 1:
               return (class265)class730.field2697.method5317(-1611682495).method2427(var2, var4, var5, 1080081135);
            case 2:
               return (class265)class730.field2697.method5317(-1611682495).method2429(var2, var4, var5, class730.field2942, -1306218271);
            case 3:
               return (class265)class730.field2697.method5317(-1611682495).method2452(var2, var4, var5, (byte)72);
            default:
               return null;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "qz.b(" + ')');
      }
   }

   static final void method5188(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
      try {
         var2.field3156 -= 2;
         var0.field883 = var2.field3161[var2.field3156];
         var0.field967 = var2.field3161[1 + var2.field3156];
         class814.method2932(var0, 909224475);
         Animator.method2801(var1, var0, -1959938301);
         if (var0.field869 == 0) {
            class948.method1938(var1, var0, false, 112223880);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qz.ci(" + ')');
      }
   }

   static final void method5189(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class740.field3209 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qz.aem(" + ')');
      }
   }

   static final void method5190(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9147.method5182(-192114923);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qz.aje(" + ')');
      }
   }

   public static Frame method5191(class549 var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         if (var3 == 0) {
            class125[] var6 = class200.method4354(var0, (short)486);
            if (var6 == null) {
               return null;
            }

            boolean var7 = false;

            for(int var8 = 0; var8 < var6.length; ++var8) {
               if (var1 == var6[var8].field2325 && var6[var8].field2327 == var2 && (var4 == 0 || var6[var8].field2324 == var4) && (!var7 || var6[var8].field2326 > var3)) {
                  var3 = var6[var8].field2326;
                  var7 = true;
               }
            }

            if (!var7) {
               return null;
            }
         }

         Frame var10 = new Frame("Jagex Full Screen");
         var10.setResizable(false);
         var0.method393(var10, var1, var2, var3, var4);
         return var10;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "qz.f(" + ')');
      }
   }

   static final void method5192(class744 var0, int var1) {
      try {
         class615.field8903.method5391(class615.field8903.field9124, var0.field3161[--var0.field3156], 417121289);
         class95.method523(656179282);
         class730.field2647 = false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qz.ain(" + ')');
      }
   }

   public static byte[] method5193(byte[] var0, int var1) {
      try {
         if (var0 == null) {
            return null;
         } else {
            byte[] var2 = new byte[var0.length];
            System.arraycopy(var0, 0, var2, 0, var0.length);
            return var2;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qz.a(" + ')');
      }
   }

   static final void method5194(class744 var0, int var1) {
      try {
         boolean var2 = var0.field3161[--var0.field3156] != 0;
         int var3 = var0.field3161[--var0.field3156];
         var0.field3157[++var0.field3158 - 1] = class540.method2464((long)var3, 0, var2, class321.field1066, (short)25477);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qz.aac(" + ')');
      }
   }
}
