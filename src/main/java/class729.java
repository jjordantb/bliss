import java.io.File;

public class class729 extends class676 implements class265 {
   static int[] field2497 = new int[]{1, 2, 4, 8};
   static int[] field2498 = new int[]{16, 32, 64, 128};
   boolean field2499;
   class879 field2500;
   class770 field2501;
   class719 field2502;
   int field2503;
   byte field2504;
   class240 field2505;
   byte field2506;
   boolean field2507;
   boolean field2508;
   boolean field2509;

   boolean method2191() {
      return this.field2499;
   }

   boolean method2206(byte var1) {
      try {
         if (this.field2500 != null) {
            return !this.field2500.method6036();
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wg.bf(" + ')');
      }
   }

   boolean method2183(short var1) {
      try {
         return this.field2500 != null ? this.field2500.method5989() : false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wg.be(" + ')');
      }
   }

   public int method2168(int var1) {
      try {
         return this.field2500 != null ? this.field2500.method5976() : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wg.bm(" + ')');
      }
   }

   class879 method1698(class848 var1, int var2, int var3) {
      try {
         if (this.field2500 != null && var1.method4836(this.field2500.method5948(), var2) == 0) {
            return this.field2500;
         } else {
            class486 var4 = this.method1699(var1, var2, false, (byte)-90);
            return var4 != null ? (class879)var4.field8554 : null;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "wg.bl(" + ')');
      }
   }

   class486 method1699(class848 var1, int var2, boolean var3, byte var4) {
      try {
         class50 var5 = this.field2505.method4713(1940788231 * this.field2503);
         class454 var6;
         class454 var7;
         if (this.field2508) {
            var6 = this.field3638.field3866[this.field3640];
            var7 = this.field3638.field3864[0];
         } else {
            var6 = this.field3638.field3864[this.field3640];
            if (this.field3640 < 3) {
               var7 = this.field3638.field3864[this.field3640 + 1];
            } else {
               var7 = null;
            }
         }

         class32 var8 = this.method1511().field7637;
         return var5.method1495(var1, var2, this.field2506, this.field2504, var6, var7, (int)var8.field5296, (int)var8.field5300, (int)var8.field5299, var3, (class552)null, 566759128);
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "wg.br(" + ')');
      }
   }

   public boolean method4558(int var1) {
      try {
         return this.field2509;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wg.i(" + ')');
      }
   }

   class192 method2201(class848 var1, int var2) {
      try {
         if (this.field2500 == null) {
            return null;
         } else {
            class135 var3 = this.method1521();
            class192 var4 = class221.method4033(this.field2507, 1739349745);
            this.field2500.method5965(var3, this.field3642[0], 0);
            return var4;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "wg.bo(" + ')');
      }
   }

   boolean method2189() {
      return this.field2500 != null ? this.field2500.method5989() : false;
   }

   boolean method2173(int var1) {
      try {
         return this.field2499;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wg.bw(" + ')');
      }
   }

   void method2162(class848 var1, class963 var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         if (var2 instanceof class729) {
            class729 var8 = (class729)var2;
            if (this.field2500 != null && var8.field2500 != null) {
               this.field2500.method5994(var8.field2500, var3, var4, var5, var6);
            }
         } else if (var2 instanceof class0) {
            class0 var10 = (class0)var2;
            if (this.field2500 != null && var10.field4953 != null) {
               this.field2500.method5994(var10.field4953, var3, var4, var5, var6);
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "wg.bk(" + ')');
      }
   }

   void method2205(byte var1) {
      try {
         this.field2499 = false;
         if (this.field2500 != null) {
            this.field2500.method5947(this.field2500.method5948() & -65537);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wg.bq(" + ')');
      }
   }

   public int method4554() {
      return this.field2506;
   }

   public int method4548(int var1) {
      try {
         return this.field2506;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wg.f(" + ')');
      }
   }

   public int method4549(short var1) {
      try {
         return this.field2504;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wg.b(" + ')');
      }
   }

   boolean method2158() {
      return this.field2500 != null ? this.field2500.method5989() : false;
   }

   class192 method2177(class848 var1) {
      if (this.field2500 == null) {
         return null;
      } else {
         class135 var2 = this.method1521();
         class192 var3 = class221.method4033(this.field2507, 1174280404);
         this.field2500.method5965(var2, this.field3642[0], 0);
         return var3;
      }
   }

   boolean method2190() {
      return this.field2500 != null ? this.field2500.method5989() : false;
   }

   void method2184() {
      this.field2499 = false;
      if (this.field2500 != null) {
         this.field2500.method5947(this.field2500.method5948() & -65537);
      }

   }

   public int method4564() {
      return 1940788231 * this.field2503;
   }

   public int method4555() {
      return this.field2506;
   }

   public void method4559(class848 var1) {
      Object var2 = null;
      class770 var4;
      if (this.field2501 == null && this.field2509) {
         class486 var3 = this.method1699(var1, 262144, true, (byte)-75);
         var4 = (class770)(var3 != null ? var3.field8555 : null);
      } else {
         var4 = this.field2501;
         this.field2501 = null;
      }

      class32 var5 = this.method1511().field7637;
      if (var4 != null) {
         this.field3638.method2441(var4, this.field3640, (int)var5.field5296, (int)var5.field5299, (boolean[])null, 1555439691);
      }

   }

   public int method4561() {
      return this.field2504;
   }

   boolean method2157(class848 var1, int var2, int var3, byte var4) {
      try {
         class879 var5 = this.method1698(var1, 131072, -546231639);
         if (var5 != null) {
            class135 var6 = this.method1521();
            return var5.method6097(var2, var3, var6, false, 0);
         } else {
            return false;
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "wg.bu(" + ')');
      }
   }

   public void method4553() {
      if (this.field2500 != null) {
         this.field2500.method6093();
      }

   }

   public class719 method2174(class848 var1) {
      class32 var2 = this.method1511().field7637;
      if (this.field2502 == null) {
         this.field2502 = class905.method6344((int)var2.field5296, (int)var2.field5300, (int)var2.field5299, this.method1698(var1, 0, -541574626), 2030586614);
      }

      return this.field2502;
   }

   public void method4547(class848 var1) {
      Object var2 = null;
      class770 var4;
      if (this.field2501 == null && this.field2509) {
         class486 var3 = this.method1699(var1, 262144, true, (byte)-35);
         var4 = (class770)(var3 != null ? var3.field8555 : null);
      } else {
         var4 = this.field2501;
         this.field2501 = null;
      }

      class32 var5 = this.method1511().field7637;
      if (var4 != null) {
         this.field3638.method2449(var4, this.field3640, (int)var5.field5296, (int)var5.field5299, (boolean[])null, 932138106);
      }

   }

   public int method4551(byte var1) {
      try {
         return 1940788231 * this.field2503;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wg.a(" + ')');
      }
   }

   public void method4563(class848 var1) {
      Object var2 = null;
      class770 var4;
      if (this.field2501 == null && this.field2509) {
         class486 var3 = this.method1699(var1, 262144, true, (byte)-118);
         var4 = (class770)(var3 != null ? var3.field8555 : null);
      } else {
         var4 = this.field2501;
         this.field2501 = null;
      }

      class32 var5 = this.method1511().field7637;
      if (var4 != null) {
         this.field3638.method2441(var4, this.field3640, (int)var5.field5296, (int)var5.field5299, (boolean[])null, 1480402841);
      }

   }

   public class719 method2175(class848 var1) {
      class32 var2 = this.method1511().field7637;
      if (this.field2502 == null) {
         this.field2502 = class905.method6344((int)var2.field5296, (int)var2.field5300, (int)var2.field5299, this.method1698(var1, 0, -2141517966), 2144329713);
      }

      return this.field2502;
   }

   boolean method2160() {
      if (this.field2500 != null) {
         return !this.field2500.method6036();
      } else {
         return true;
      }
   }

   public class729(class545 var1, class848 var2, class240 var3, class50 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, boolean var13) {
      super(var1, var7, var8, var9, var5, var6, class606.method4793(var11, var12, 800544861));
      this.field2505 = var3;
      this.field2503 = var4.field2197 * 584655573;
      this.field2508 = var10;
      this.field2506 = (byte)var11;
      this.field2504 = (byte)var12;
      this.field2507 = 1532834983 * var4.field2214 != 0 && !var10;
      this.field2499 = var13;
      this.field2509 = var2.method4916() && var4.field2265 && !this.field2508 && class615.field8903.field9147.method5182(57385915) != 0;
      int var14 = 2048;
      if (this.field2499) {
         var14 |= 65536;
      }

      if (var4.field2273) {
         var14 |= 524288;
      }

      class486 var15 = this.method1699(var2, var14, this.field2509, (byte)-72);
      if (var15 != null) {
         this.field2500 = (class879)var15.field8554;
         this.field2501 = (class770)var15.field8555;
         if (this.field2499 || var4.field2273) {
            this.field2500 = this.field2500.method6017((byte)0, var14, false);
            if (var4.field2273) {
               class923 var16 = Client.field2697.method5274(-2131923625);
               this.field2500.method5987(var16.field10290 * 1599271859, 1630923113 * var16.field10291, var16.field10292 * -1560648831, var16.field10293 * -57569897);
            }
         }
      }

      this.method2169(1, -1008898449);
   }

   boolean method2181() {
      if (this.field2500 != null) {
         return !this.field2500.method6036();
      } else {
         return true;
      }
   }

   public void method4556(class848 var1, int var2) {
      try {
         Object var3 = null;
         class770 var5;
         if (this.field2501 == null && this.field2509) {
            class486 var4 = this.method1699(var1, 262144, true, (byte)-99);
            var5 = (class770)(var4 != null ? var4.field8555 : null);
         } else {
            var5 = this.field2501;
            this.field2501 = null;
         }

         class32 var7 = this.method1511().field7637;
         if (var5 != null) {
            this.field3638.method2441(var5, this.field3640, (int)var7.field5296, (int)var7.field5299, (boolean[])null, 580390895);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "wg.d(" + ')');
      }
   }

   boolean method2172() {
      if (this.field2500 != null) {
         return !this.field2500.method6036();
      } else {
         return true;
      }
   }

   void method2195(class848 var1, class963 var2, int var3, int var4, int var5, boolean var6) {
      if (var2 instanceof class729) {
         class729 var7 = (class729)var2;
         if (this.field2500 != null && var7.field2500 != null) {
            this.field2500.method5994(var7.field2500, var3, var4, var5, var6);
         }
      } else if (var2 instanceof class0) {
         class0 var8 = (class0)var2;
         if (this.field2500 != null && var8.field4953 != null) {
            this.field2500.method5994(var8.field4953, var3, var4, var5, var6);
         }
      }

   }

   void method2178(class848 var1) {
   }

   void method2180(class848 var1) {
   }

   boolean method2179(class848 var1, int var2, int var3) {
      class879 var4 = this.method1698(var1, 131072, -1405605049);
      if (var4 != null) {
         class135 var5 = this.method1521();
         return var4.method6097(var2, var3, var5, false, 0);
      } else {
         return false;
      }
   }

   boolean method2192(class848 var1, int var2, int var3) {
      class879 var4 = this.method1698(var1, 131072, -189727936);
      if (var4 != null) {
         class135 var5 = this.method1521();
         return var4.method6097(var2, var3, var5, false, 0);
      } else {
         return false;
      }
   }

   boolean method2159(class848 var1, int var2, int var3) {
      class879 var4 = this.method1698(var1, 131072, -673650245);
      if (var4 != null) {
         class135 var5 = this.method1521();
         return var4.method6097(var2, var3, var5, false, 0);
      } else {
         return false;
      }
   }

   void method2182(class848 var1, class963 var2, int var3, int var4, int var5, boolean var6) {
      if (var2 instanceof class729) {
         class729 var7 = (class729)var2;
         if (this.field2500 != null && var7.field2500 != null) {
            this.field2500.method5994(var7.field2500, var3, var4, var5, var6);
         }
      } else if (var2 instanceof class0) {
         class0 var8 = (class0)var2;
         if (this.field2500 != null && var8.field4953 != null) {
            this.field2500.method5994(var8.field4953, var3, var4, var5, var6);
         }
      }

   }

   public void method4552(class848 var1, int var2) {
      try {
         Object var3 = null;
         class770 var5;
         if (this.field2501 == null && this.field2509) {
            class486 var4 = this.method1699(var1, 262144, true, (byte)2);
            var5 = (class770)(var4 != null ? var4.field8555 : null);
         } else {
            var5 = this.field2501;
            this.field2501 = null;
         }

         class32 var7 = this.method1511().field7637;
         if (var5 != null) {
            this.field3638.method2449(var5, this.field3640, (int)var7.field5296, (int)var7.field5299, (boolean[])null, 2001227588);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "wg.k(" + ')');
      }
   }

   boolean method2194() {
      return this.field2499;
   }

   void method2185() {
      this.field2499 = false;
      if (this.field2500 != null) {
         this.field2500.method5947(this.field2500.method5948() & -65537);
      }

   }

   public class719 method2165(class848 var1, byte var2) {
      try {
         class32 var3 = this.method1511().field7637;
         if (this.field2502 == null) {
            this.field2502 = class905.method6344((int)var3.field5296, (int)var3.field5300, (int)var3.field5299, this.method1698(var1, 0, -187426704), 2051250714);
         }

         return this.field2502;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "wg.bc(" + ')');
      }
   }

   void method2164(class848 var1, int var2) {
   }

   public int method2188() {
      return this.field2500 != null ? this.field2500.method5976() : 0;
   }

   boolean method2176() {
      return this.field2500 != null ? this.field2500.method5989() : false;
   }

   boolean method2207() {
      return this.field2499;
   }

   boolean method2156() {
      return this.field2500 != null ? this.field2500.method5989() : false;
   }

   public void method4562(class848 var1) {
      Object var2 = null;
      class770 var4;
      if (this.field2501 == null && this.field2509) {
         class486 var3 = this.method1699(var1, 262144, true, (byte)-118);
         var4 = (class770)(var3 != null ? var3.field8555 : null);
      } else {
         var4 = this.field2501;
         this.field2501 = null;
      }

      class32 var5 = this.method1511().field7637;
      if (var4 != null) {
         this.field3638.method2441(var4, this.field3640, (int)var5.field5296, (int)var5.field5299, (boolean[])null, 310306064);
      }

   }

   public boolean method4560() {
      return this.field2509;
   }

   public void method4550(byte var1) {
      try {
         if (this.field2500 != null) {
            this.field2500.method6093();
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wg.p(" + ')');
      }
   }

   public int method2187() {
      return this.field2500 != null ? this.field2500.method5976() : 0;
   }

   boolean method2193() {
      return this.field2499;
   }

   public int method4557() {
      return this.field2504;
   }

   public int method2186() {
      return this.field2500 != null ? this.field2500.method5976() : 0;
   }

   public static boolean method1700(boolean var0, int var1) {
      try {
         boolean var2 = class593.field1623.method4883();
         if (var0 != var2) {
            if (var0) {
               if (!class593.field1623.method4881()) {
                  var0 = false;
               }
            } else {
               class593.field1623.method4882();
            }

            if (var0 != var2) {
               class615.field8903.method5391(class615.field8903.field9117, var0 ? 1 : 0, -1863602535);
               class95.method523(656179282);
               return true;
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wg.gg(" + ')');
      }
   }

   static final void method1701(class744 var0, int var1) {
      try {
         int var2 = var0.field3174[var0.field3176 * 1883543357];
         String var3 = (String)class166.field6896[var2];
         if (var3 == null) {
            var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = "";
         } else {
            var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = var3;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "wg.bp(" + ')');
      }
   }

   static final void method1702(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class718 var3 = class333.field139.method5091(var2, -1520948528);
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var3.field3498 * 1023000389;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "wg.amx(" + ')');
      }
   }

   static void method1703(File var0, byte var1) {
      try {
         class882.field10202 = var0;
         if (!class882.field10202.exists()) {
            throw new RuntimeException("");
         } else {
            class882.field10203 = true;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wg.a(" + ')');
      }
   }

   static void method1704(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         class484.method4769(class534.field1412[var2++], var0, var1, var4, 718097597);
         class484.method4769(class534.field1412[var3--], var0, var1, var4, 1200953445);

         for(int var6 = var2; var6 <= var3; ++var6) {
            int[] var7 = class534.field1412[var6];
            var7[var0] = var7[var1] = var4;
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "wg.v(" + ')');
      }
   }
}
