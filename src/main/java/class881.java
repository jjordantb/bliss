import java.awt.Point;
import java.util.Queue;

public class class881 {
   public static int field10138 = 0;
   static int field10139 = 264;
   static int field10140;
   static int field10141 = 186;
   static boolean field10142 = false;
   public static int field10143 = -2;
   static int field10144 = 176;
   static int field10145 = -1;
   static long field10146 = -1L;
   static int field10147 = 193;
   static int field10148 = 1;
   static int field10149 = 12;
   static int field10150 = 30;
   static int field10151 = 44;
   static int field10152 = 58;
   static int field10153 = 62;
   static int field10154 = 72;
   static int field10155 = 82;
   static int field10156 = 94;
   static int field10157 = 100;
   static boolean field10158 = false;
   static int field10159 = 125;
   public static int field10160 = -1;
   static int[] field10161;
   static int field10162 = 158;
   static int field10163 = 163;
   public static int field10164 = -2;
   static int field10165 = 117;
   public static int field10166 = -2;
   static int field10167 = 203;
   static int field10168 = 1;
   static int field10169 = 137;
   static String field10170 = "";
   static String field10171 = "";
   static int field10172 = 0;
   static int field10173 = 136;
   static int field10174;
   static int field10175 = 4;
   static int field10176 = 0;
   static class684 field10177;
   public static int field10178 = -1;
   static int field10179 = 148;
   public static int field10180 = 0;
   public static int field10181 = -1;
   public static int field10182 = -1;
   static long field10183 = 0L;
   static boolean field10184 = false;

   class881() throws Throwable {
      throw new Error();
   }

   static final void method6168(class744 var0, int var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         class237 var4;
         if (var0.field3178) {
            var4 = var0.field3164;
         } else {
            var4 = var0.field3163;
         }

         var0.field3161[++var0.field3156 - 1] = var3 != -1 && var4.method4649(var2, var3, -574024132) ? 1 : 0;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "p.br(" + ')');
      }
   }

   static final void method6169(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)52);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class75.method1118(var3, var4, false, 2, var0, -1533080700);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "p.hl(" + ')');
      }
   }

   static final void method6170(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class276.method6620(var3, var4, var0, -2106555824);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "p.mc(" + ')');
      }
   }

   static void method6171(int var0) {
      try {
         Queue var1 = class978.field3127;
         synchronized(class978.field3127) {
            Point var2;
            if (class837.field9161.isShowing()) {
               var2 = class837.field9161.getLocationOnScreen();
            } else {
               var2 = null;
            }

            while(true) {
               while(true) {
                  class105 var3 = (class105)class978.field3127.poll();
                  if (var3 == null) {
                     return;
                  }

                  if (var2 != null && class837.field9161.isShowing() && class619.field8869) {
                     var3.method198(var2, 1682820280);
                     if (!var3.method197(725072729) && var3.method6667((byte)16) < class759.field4331 && var3.method6680(-1530423246) < class97.field614 && var3.method6667((byte)15) >= 0 && var3.method6680(-1205687296) >= 0) {
                        int var4 = var3.method6666(-1372966703);
                        if (var3.method6666(-1372966703) == -1) {
                           class978.field3124.method3584(var3, 2114184639);
                        } else if (class827.method5357(var4, 763111254)) {
                           class978.field3124.method436(var3, (byte)13);
                        }
                     }
                  } else {
                     var3.method6670(-1850885996);
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "p.i(" + ')');
      }
   }

   public static void method6172(int var0) {
      try {
         for(int var1 = 0; var1 < 113; ++var1) {
            class730.field2882[var1] = true;
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "p.lq(" + ')');
      }
   }

   public static class461 method6173(int var0) {
      try {
         class185 var1;
         try {
            var1 = new class185();
         } catch (Throwable var3) {
            return new class207();
         }

         return var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "p.a(" + ')');
      }
   }
}
