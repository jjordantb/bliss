public class class131 {
   public boolean field1101;
   class564[] field1102;
   public class564[] field1103;

   public class564[] method887(byte var1) {
      try {
         return this.field1102 == null ? this.field1103 : this.field1102;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ev.a(" + ')');
      }
   }

   public class564[] method888(byte var1) {
      try {
         if (this.field1102 == null) {
            int var2 = this.field1103.length;
            this.field1102 = new class564[var2];
            System.arraycopy(this.field1103, 0, this.field1102, 0, this.field1103.length);
         }

         return this.field1102;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ev.f(" + ')');
      }
   }

   public class564 method889(int var1, short var2) {
      try {
         if (this.field1103[0].field867 >>> 16 != var1 >>> 16) {
            throw new IllegalArgumentException();
         } else {
            return this.field1103[var1 & '\uffff'];
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ev.b(" + ')');
      }
   }

   class131(boolean var1, class564[] var2) {
      this.field1103 = var2;
      this.field1101 = var1;
   }

   static final void method890(class564 var0, class131 var1, class744 var2, byte var3) {
      try {
         var0.field909 = 5;
         var0.field876 = class730.field2623;
         var0.field865 = 0;
         if (-1 == var0.field879 && !var1.field1101) {
            class535.method2284(var0.field867, 1429753437);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ev.iz(" + ')');
      }
   }

   static final void method891(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9132.method2605(-1747444886);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ev.akh(" + ')');
      }
   }

   public static void method892(int var0, int var1) {
      try {
         class689 var2 = (class689)class371.field1088.method2942((long)var0);
         if (var2 != null) {
            var2.field7631 = !var2.field7631;
            var2.field7630.method1375(var2.field7631, -480568150);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ev.f(" + ')');
      }
   }

   static long method893(class265 var0, int var1, int var2, int var3) {
      try {
         long var4 = 4194304L;
         long var6 = Long.MIN_VALUE;
         ObjectDefinition var8 = class730.field2697.method5283(-1623210152).method4713(var0.method4551((byte)18));
         long var9 = (long)(var1 | var2 << 7 | var0.method4548(726839210) << 14 | var0.method4549((short)11182) << 20 | 1073741824);
         if (var8.field2214 == 0) {
            var9 |= var6;
         }

         if (var8.field2241 == 1) {
            var9 |= var4;
         }

         var9 |= (long)var0.method4551((byte)34) << 32;
         return var9;
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "ev.c(" + ')');
      }
   }

   static final void method894(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)0);
         class131 var4 = class382.field1410[var2 >> 16];
         class370.method877(var3, var4, var0, (byte)-31);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ev.dl(" + ')');
      }
   }

   static void method895(class744 var0, int var1) {
      try {
         var0.field3161[var0.field3156 - 2] = class735.field3009.method4224(var0.field3161[var0.field3156 - 2], 245040087).field8993[var0.field3161[var0.field3156 - 1]];
         --var0.field3156;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ev.u(" + ')');
      }
   }

   static final void method896(int var0) {
      try {
         class730.field2852 = -1;
         class730.field2705 = 3;
         class345.field210 = null;
         class665.field9597 = null;
         class59.method1617(416919128);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ev.gj(" + ')');
      }
   }
}
