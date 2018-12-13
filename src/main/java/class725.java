public final class class725 extends Node {
   public static int field2555 = 16;
   public static int field2556 = 2;
   public int field2557;
   public static int field2558 = 64;
   public static int field2559 = 4;
   public static int field2560 = 32;
   public static int field2561 = 8;
   static class725 field2562 = new class725(0, -1);
   public int field2563;
   public static int field2564 = 1;

   public final boolean method1737(byte var1) {
      try {
         return (this.field2563 & 1) != 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abw.a(" + ')');
      }
   }

   public final int method1738(byte var1) {
      try {
         return this.field2563 >> 18 & 7;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abw.i(" + ')');
      }
   }

   public final boolean method1739(int var1) {
      try {
         return (this.field2563 >> 21 & 1) != 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abw.k(" + ')');
      }
   }

   public final boolean method1740(int var1) {
      try {
         return (this.field2563 >> 22 & 1) != 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abw.d(" + ')');
      }
   }

   public final boolean method1741(int var1) {
      try {
         return (this.field2563 >> 23 & 1) != 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abw.u(" + ')');
      }
   }

   public final int method1742(byte var1) {
      try {
         return class396.method3502(this.field2563, (byte)105);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abw.b(" + ')');
      }
   }

   public final boolean method1743(int var1, byte var2) {
      try {
         return (this.field2563 >> var1 + 1 & 1) != 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "abw.f(" + ')');
      }
   }

   public class725(int var1, int var2) {
      this.field2563 = var1;
      this.field2557 = var2;
   }

   static final void method1744(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class740.field3198 == 100 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abw.aei(" + ')');
      }
   }

   public static void method1745(int var0, int var1) {
      try {
         class105.method199(var0, (byte)-33);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abw.f(" + ')');
      }
   }

   static void method1746(class744 var0, short var1) {
      try {
         var0.field3161[var0.field3156 - 2] = class735.field3009.method4224(var0.field3161[var0.field3156 - 2], 245040087).method5329(class827.field9037, var0.field3161[var0.field3156 - 1], 910416159) ? 1 : 0;
         --var0.field3156;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abw.x(" + ')');
      }
   }

   public static final void method1747(String var0, int var1, int var2) {
      try {
         class684 var3 = class423.method5712((short)512);
         class701 var4 = class637.method5936(class643.field9952, var3.field7765, (byte)82);
         var4.field3364.method6361(1 + class305.method372(var0, 986937694));
         var4.field3364.method6366(var0, 2107789256);
         var4.field3364.method6393(var1, 1999137832);
         var3.method4380(var4, (byte)-112);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "abw.mg(" + ')');
      }
   }

   public static final void method1748(int var0) {
      try {
         class881.field10168 = 1;
         class881.field10143 = -2;
         class881.field10164 = -2;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "abw.b(" + ')');
      }
   }
}
