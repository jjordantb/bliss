public class class154 {
   int field6499;
   byte[] field6500;
   int field6501;
   int field6502;
   int field6503;
   byte[] field6504;
   int field6505;
   int field6506;
   int field6507;

   static final void method3485(class744 var0, int var1) {
      try {
         var0.field3156 -= 3;
         long var2 = (long)var0.field3161[var0.field3156];
         long var4 = (long)var0.field3161[var0.field3156 + 1];
         long var6 = (long)var0.field3161[2 + var0.field3156];
         var0.field3161[++var0.field3156 - 1] = (int)(var6 * var2 / var4);
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "ef.zk(" + ')');
      }
   }

   static final void method3486(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3157[++var0.field3158 - 1] = class56.method1545(var2, -1648336964);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ef.zv(" + ')');
      }
   }

   static final void method3487(Actor var0, int var1) {
      try {
         Animator var2 = var0.activeAnimator;
         if (class730.field2866 == var0.field4067 || !var2.method2775((byte)-78) || var2.method2792(1, 2027501470)) {
            int var3 = var0.field4067 - var0.field4059;
            int var4 = class730.field2866 - var0.field4059;
            int var5 = var0.field4062 * 512 + var0.method2550() * 256;
            int var6 = var0.field4064 * 512 + var0.method2550() * 256;
            int var7 = var0.field4063 * 512 + var0.method2550() * 256;
            int var8 = var0.field4065 * 512 + var0.method2550() * 256;
            class32 var9 = var0.method1511().field7637;
            var0.method1515((float)((var5 * (var3 - var4) + var4 * var7) / var3), (float)((int)var9.field5300), (float)((var4 * var8 + (var3 - var4) * var6) / var3));
         }

         var0.field4088 = 0;
         var0.method2543(var0.field4068, false, 943014126);
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "ef.hp(" + ')');
      }
   }

   static final void method3488(int var0) {
      try {
         class323.widgets = null;
         class873.method5870(class730.field2822, 0, 0, class759.field4331, class97.field614, 0, 0, -1, 421170136);
         if (class323.widgets != null) {
            class536.method2328(class323.widgets, -1412584499, 0, 0, class759.field4331, class97.field614, class82.field1111, NodeTable.field4929, class263.field8132 == class730.field2693 ? -1 : class730.field2693.field1028 * 1339690151 * 91937559, true, (byte)0);
            class323.widgets = null;
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ef.kl(" + ')');
      }
   }

   static final void method3489(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)-19);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class456.method3792(var3, var4, var0, (byte)-113);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ef.jj(" + ')');
      }
   }

   static final void method3490(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = var0.field3165[var0.field3174[var0.field3176]];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ef.az(" + ')');
      }
   }

   public static String method3491(MenuItem var0, byte var1) {
      try {
         if (!class602.field8645 && var0 != null) {
            return (var0.name == null || var0.name.length() == 0) && var0.field1709 != null && var0.field1709.length() > 0 ? var0.field1709 : var0.name;
         } else {
            return "";
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ef.as(" + ')');
      }
   }

   public static void method3492(int var0, int var1) {
      try {
         class818.field4611 = 1;
         class818.field4621 = null;
         class818.field4622 = -1;
         class818.field4623 = -1;
         class818.field4625 = null;
         class818.field4616 = 0;
         class342.field294 = false;
         class573.field105 = var0;
         class166.field6898 = null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ef.q(" + ')');
      }
   }
}
