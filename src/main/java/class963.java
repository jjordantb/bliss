public abstract class class963 extends class361 {
   class963 field3637;
   public class545 field3638;
   public byte field3639;
   public byte field3640;
   int field3641;
   public class211[] field3642;

   abstract boolean method2156();

   abstract boolean method2157(class848 var1, int var2, int var3, byte var4);

   abstract boolean method2158();

   abstract boolean method2159(class848 var1, int var2, int var3);

   abstract boolean method2160();

   abstract int method2161(class639[] var1, int var2);

   abstract void method2162(class848 var1, class963 var2, int var3, int var4, int var5, boolean var6, int var7);

   int method2163(byte var1) {
      return 0;
   }

   abstract void method2164(class848 var1, int var2);

   public abstract class719 method2165(class848 var1, byte var2);

   abstract boolean method2166(class848 var1);

   abstract boolean method2167(int var1);

   public abstract int method2168(int var1);

   void method2169(int var1, int var2) {
      try {
         this.field3642 = new class211[var1];

         for(int var3 = 0; var3 < this.field3642.length; ++var3) {
            this.field3642[var3] = new class211();
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "adp.dx(" + ')');
      }
   }

   public int method2170(byte var1) {
      try {
         return -this.method2168(1951240662);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adp.bx(" + ')');
      }
   }

   abstract boolean method2171(class848 var1, byte var2);

   abstract boolean method2172();

   abstract boolean method2173(int var1);

   public abstract class719 method2174(class848 var1);

   public abstract class719 method2175(class848 var1);

   abstract boolean method2176();

   abstract class192 method2177(class848 var1);

   abstract void method2178(class848 var1);

   abstract boolean method2179(class848 var1, int var2, int var3);

   abstract void method2180(class848 var1);

   abstract boolean method2181();

   abstract void method2182(class848 var1, class963 var2, int var3, int var4, int var5, boolean var6);

   abstract boolean method2183(short var1);

   abstract void method2184();

   abstract void method2185();

   public abstract int method2186();

   public abstract int method2187();

   public abstract int method2188();

   abstract boolean method2189();

   abstract boolean method2190();

   class963(class545 var1) {
      this.field3638 = var1;
   }

   abstract boolean method2191();

   abstract boolean method2192(class848 var1, int var2, int var3);

   abstract boolean method2193();

   abstract boolean method2194();

   abstract void method2195(class848 var1, class963 var2, int var3, int var4, int var5, boolean var6);

   abstract boolean method2196(class848 var1);

   abstract int method2197(class639[] var1);

   abstract boolean method2198(class848 var1);

   int method2199(int var1, int var2, class639[] var3, int var4) {
      try {
         long var5 = this.field3638.field3899[this.field3639][var1][var2];
         long var7 = 0L;

         int var9;
         int var10;
         for(var9 = 0; var7 <= 48L; var7 += 16L) {
            var10 = (int)(var5 >> (int)var7 & 65535L);
            if (var10 <= 0) {
               break;
            }

            var3[var9++] = this.field3638.field3903[var10 - 1].field1046;
         }

         for(var10 = var9; var10 < 4; ++var10) {
            var3[var10] = null;
         }

         return var9;
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "adp.ds(" + ')');
      }
   }

   abstract boolean method2200(class848 var1);

   abstract class192 method2201(class848 var1, int var2);

   abstract boolean method2202();

   abstract boolean method2203();

   abstract boolean method2204();

   abstract void method2205(byte var1);

   abstract boolean method2206(byte var1);

   abstract boolean method2207();

   static final void method2208(class564 var0, class131 var1, class744 var2, byte var3) {
      try {
         int var4 = var2.field3161[(var2.field3156 -= -391880689) * 681479919] - 1;
         if (var4 >= 0 && var4 <= 9) {
            var0.method825(var4, (String)var2.field3157[(var2.field3158 -= 969361751) * -203050393], 1110385787);
         } else {
            var2.field3158 -= 969361751;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "adp.is(" + ')');
      }
   }

   static final void method2209(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)-7);
         class131 var4 = class382.field1410[var2 >> 16];
         class153.method3389(var3, var4, var0, 1982682635);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "adp.fx(" + ')');
      }
   }

   static void method2210(byte var0) {
      try {
         if (class615.field8903.field9146.method3999((byte)-114) == 1) {
            class625.field9752.method464(new class406(class335.field50, (class513)null), -1108671657);
         } else {
            Client.field2697.method5309(1601177628);
            class410.method5637(-119452364);
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "adp.v(" + ')');
      }
   }
}
