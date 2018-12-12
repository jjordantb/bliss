import java.util.BitSet;

public class class139 extends class568 {
   boolean field1159;
   boolean field1160 = true;
   public byte field1161;
   public int field1162 = 0;
   int[] field1163;
   public String field1164 = null;
   public class78[] field1165;
   public byte field1166;
   long field1167;

   static {
      new BitSet(65536);
   }

   public class139(class907 var1) {
      this.method977(var1, (byte)-94);
   }

   public int[] method974(int var1) {
      try {
         if (this.field1163 == null) {
            String[] var2 = new String[this.field1162 * 649879491];
            this.field1163 = new int[649879491 * this.field1162];

            for(int var3 = 0; var3 < this.field1162 * 649879491; this.field1163[var3] = var3++) {
               var2[var3] = this.field1165[var3].field1497;
            }

            class983.method1893(var2, this.field1163, 715814355);
         }

         return this.field1163;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "abj.f(" + ')');
      }
   }

   void method975(class78 var1, int var2) {
      try {
         if (this.field1165 == null || 649879491 * this.field1162 >= this.field1165.length) {
            this.method978(5 + 649879491 * this.field1162, (byte)26);
         }

         this.field1165[(this.field1162 += 506595563) * 649879491 - 1] = var1;
         this.field1163 = null;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "abj.b(" + ')');
      }
   }

   public int method976(String var1, byte var2) {
      try {
         for(int var3 = 0; var3 < 649879491 * this.field1162; ++var3) {
            if (this.field1165[var3].field1497.equalsIgnoreCase(var1)) {
               return var3;
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "abj.i(" + ')');
      }
   }

   void method977(class907 var1, byte var2) {
      try {
         int var3 = var1.method6371();
         if ((var3 & 1) != 0) {
            this.field1159 = true;
         }

         if ((var3 & 2) != 0) {
            this.field1160 = true;
         }

         this.field641 = var1.method6375((short)1568) * 4191220306876042991L;
         this.field1167 = var1.method6375((short)25426) * 8816161044679006451L;
         this.field1164 = var1.method6379(1262859658);
         var1.method6371();
         this.field1161 = var1.method6372(-12558881);
         this.field1166 = var1.method6372(-12558881);
         this.field1162 = var1.method6374() * 506595563;
         if (this.field1162 * 649879491 > 0) {
            this.field1165 = new class78[649879491 * this.field1162];

            for(int var4 = 0; var4 < this.field1162 * 649879491; ++var4) {
               class78 var5 = new class78();
               if (this.field1159) {
                  var1.method6375((short)26032);
               }

               if (this.field1160) {
                  var5.field1497 = var1.method6379(254031265);
               }

               var5.field1499 = var1.method6372(-12558881);
               var5.field1498 = var1.method6374() * -62810701;
               this.field1165[var4] = var5;
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "abj.k(" + ')');
      }
   }

   void method978(int var1, byte var2) {
      try {
         if (this.field1165 != null) {
            class901.method6351(this.field1165, 0, this.field1165 = new class78[var1], 0, this.field1162 * 649879491);
         } else {
            this.field1165 = new class78[var1];
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "abj.a(" + ')');
      }
   }

   void method979(int var1, int var2) {
      try {
         this.field1162 -= 506595563;
         if (this.field1162 * 649879491 == 0) {
            this.field1165 = null;
         } else {
            class901.method6351(this.field1165, 1 + var1, this.field1165, var1, this.field1162 * 649879491 - var1);
         }

         this.field1163 = null;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "abj.p(" + ')');
      }
   }

   static final void method980(class744 var0, int var1) {
      try {
         class503.method2581(var0, -807637826);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abj.si(" + ')');
      }
   }

   static final void method981(class744 var0, int var1) {
      try {
         class327 var2 = class491.method4412(var0.field3161[(var0.field3156 -= -391880689) * 681479919]);
         if (var2 != null && var2.field14 != null) {
            var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = var2.field14;
         } else {
            var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = "";
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abj.adf(" + ')');
      }
   }

   static final void method982(class744 var0, int var1) {
      try {
         int var2 = var0.field3174[1883543357 * var0.field3176];
         Long var3 = (Long)class166.field6896[var2];
         if (var3 == null) {
            var0.field3168[(var0.field3162 += -682569305) * 1685767703 - 1] = -1L;
         } else {
            var0.field3168[(var0.field3162 += -682569305) * 1685767703 - 1] = var3.longValue();
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "abj.bs(" + ')');
      }
   }
}
