public class class602 {
   static class1 field8631 = new class1(30);
   static int field8632 = 410;
   static MenuItem field8633;
   static int field8634 = 16;
   static int field8635 = 0;
   static int field8636 = 31;
   static NodeTable field8637 = new NodeTable(16);
   static boolean field8638 = false;
   static class497 field8639 = null;
   static int field8640 = 0;
   static int field8641 = 1;
   static float[] field8642 = new float[4];
   static int field8643 = 0;
   static MenuItem field8644;
   public static boolean field8645 = false;
   public static int field8646 = 0;
   static class373 field8647 = new class373();
   static int field8648 = 521;
   static class514 field8649 = new class514();
   static int field8650 = 3;
   public static int field8651;
   static int field8652 = 31;
   static Widget field8653 = null;
   static int field8654 = -1;
   static int field8655 = 2;
   static int field8656 = -1;
   static int field8657 = -1;
   static int field8658 = 0;
   static int field8659 = 0;
   static class344 field8660 = null;
   static class344 field8661 = new class344();
   static class135 field8662 = new class135();
   public static boolean field8663 = false;
   static int field8664 = 2;
   static int field8665 = 0;
   public static int field8666 = -1;
   static class1 field8667 = new class1(8);
   static class48[] field8668;
   static int field8669 = -1;
   static int field8670 = 8;
   static int field8671 = 1;
   static class373 field8672 = new class373();
   public static int field8673 = 0;
   static int field8674 = 4;
   static int field8675 = 5;
   static int field8676 = 6;
   static int field8677 = 7;
   static class373 field8678 = new class373();

   class602() throws Throwable {
      throw new Error();
   }

   static final void method5085(Widget var0, WidgetContainer var1, class744 var2, int var3) {
      try {
         String var4 = (String)var2.field3157[--var2.field3158];
         if (class960.method2212(var4, var2, -1382665661) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field974 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "s.mk(" + ')');
      }
   }

   static final void method5086(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = var0.field3154.method976((String)var0.field3157[--var0.field3158], (byte)-7);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "s.yv(" + ')');
      }
   }

   static final void method5087(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (var2 > 255 || var2 < 0) {
            var2 = 0;
         }

         if (var2 != class615.field8903.field9144.method1564(-1514807660)) {
            class615.field8903.method5391(class615.field8903.field9144, var2, -1997480653);
            class95.method523(656179282);
            class730.field2647 = false;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "s.ajv(" + ')');
      }
   }

   static String method5088(InputStream var0, int var1, int var2) {
      try {
         String var6;
         try {
            int var3 = var0.method6382(1723054621);
            if (var3 > var1) {
               var3 = var1;
            }

            byte[] var4 = new byte[var3];
            var0.field10376 += class530.field3740.method1136(var0.field10375, var0.field10376, var4, 0, var3, 200493148);
            String var5 = class783.method2497(var4, 0, var3, -295341968);
            var6 = var5;
         } catch (Exception var7) {
            return "Cabbage";
         }

         return var6;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "s.p(" + ')');
      }
   }

   static final void method5089(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class730.field2788 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "s.uw(" + ')');
      }
   }

   public static int method5090(int var0) {
      try {
         return class890.field9269;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "s.z(" + ')');
      }
   }
}
