import java.awt.Rectangle;

public class class431 {
   static class431 field7482;
   static class431 field7483;
   static class431 field7484;
   static class431 field7485;
   static class431 field7486;
   static class431 field7487;
   static class431 field7488;
   static class431 field7489;
   static class431 field7490;
   static class431 field7491;
   static class431 field7492;
   static class431 field7493;
   static class431 field7494;
   class814 field7495;
   static class431 field7496;
   static class431 field7497;
   static class431 field7498;
   static class431 field7499;
   public int field7500;
   class814 field7501;
   boolean field7502;
   int field7503;
   int field7504;
   boolean field7505;
   static class431 field7506;

   static {
      field7490 = new class431(0, class814.field4752, 2);
      field7483 = new class431(1, class814.field4752, class814.field4752, 2, 3);
      field7484 = new class431(2, class814.field4752, 3);
      field7485 = new class431(3, class814.field4752, class814.field4752, 3, 4);
      field7486 = new class431(4, class814.field4752, 4);
      field7487 = new class431(5, class814.field4752, class814.field4752, 4, 5);
      field7488 = new class431(6, class814.field4752, class814.field4752, 5, 98, true, true);
      field7491 = new class431(7, class814.field4752, 99);
      field7493 = new class431(8, class814.field4752, 100);
      field7482 = new class431(9, class814.field4708, class814.field4708, 0, 92, true, true);
      field7489 = new class431(10, class814.field4708, class814.field4708, 92, 93);
      field7492 = new class431(11, class814.field4708, class814.field4708, 94, 95);
      field7494 = new class431(12, class814.field4708, class814.field4708, 96, 97);
      field7506 = new class431(13, class814.field4708, 97);
      field7496 = new class431(14, class814.field4708, 97);
      field7497 = new class431(15, class814.field4708, 100);
      field7498 = new class431(16, class814.field4708, 100);
      field7499 = new class431(17, class814.field4708, 100);
   }

   class431(int var1, class814 var2, int var3) {
      this(var1, var2, var2, var3, var3, true, false);
   }

   static class431[] method4251(int var0) {
      try {
         return new class431[]{field7490, field7483, field7484, field7485, field7486, field7487, field7488, field7491, field7493, field7482, field7489, field7492, field7494, field7506, field7496, field7497, field7498, field7499};
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "jp.a(" + ')');
      }
   }

   class431(int var1, class814 var2, class814 var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, true, false);
   }

   class431(int var1, class814 var2, class814 var3, int var4, int var5, boolean var6, boolean var7) {
      this.field7500 = var1;
      this.field7501 = var2;
      this.field7495 = var3;
      this.field7503 = var4;
      this.field7504 = var5;
      this.field7505 = var6;
      this.field7502 = var7;
   }

   static final void method4252(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class79.method1156(var3, var4, var0, 924787839);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "jp.ie(" + ')');
      }
   }

   static final void method4253(class744 var0, int var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         var0.field3161[++var0.field3156 - 1] = class563.method861(var2, var3, true, false, 1482071907);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "jp.ub(" + ')');
      }
   }

   static final void method4254(int var0, int var1, int var2, int var3, byte var4) {
      try {
         for(int var5 = 0; var5 < class730.field2667; ++var5) {
            Rectangle var6 = class730.field2884[var5];
            if (var6.x + var6.width > var0 && var6.x < var0 + var2 && var6.height + var6.y > var1 && var6.y < var3 + var1) {
               class730.field2882[var5] = true;
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "jp.kr(" + ')');
      }
   }

   static final void method4255(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (class730.field2924 == 2 && var2 < class730.field2923) {
            var0.field3157[++var0.field3158 - 1] = class730.field2929[var2];
         } else {
            var0.field3157[++var0.field3158 - 1] = "";
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jp.wn(" + ')');
      }
   }

   public static String method4256(CharSequence var0, int var1) {
      try {
         String var2 = class405.method5478(class848.method5068(var0, (byte)-97));
         if (var2 == null) {
            var2 = "";
         }

         return var2;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jp.p(" + ')');
      }
   }
}
