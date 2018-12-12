public class class513 extends class907 {
   int field4194;
   class246 field4195;
   static int[] field4196 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};

   public int method2644(int var1, byte var2) {
      try {
         return var1 * 8 - 1560311085 * this.field4194;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ajm.hy(" + ')');
      }
   }

   public boolean method2645(byte var1) {
      try {
         int var2 = this.field10375[this.field10376 * 385051775] - this.field4195.method4730((byte)1) & 255;
         return var2 >= 128;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajm.hb(" + ')');
      }
   }

   public void method2646(byte[] var1, int var2, int var3, byte var4) {
      try {
         for(int var5 = 0; var5 < var3; ++var5) {
            var1[var2 + var5] = (byte)(this.field10375[(this.field10376 += 116413311) * 385051775 - 1] - this.field4195.method4728(223815758));
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ajm.hj(" + ')');
      }
   }

   public int method2647(int var1) {
      try {
         int var2 = 1560311085 * this.field4194 >> 3;
         int var3 = 8 - (this.field4194 * 1560311085 & 7);
         int var4 = 0;

         for(this.field4194 += var1 * -1954110811; var1 > var3; var3 = 8) {
            var4 += (this.field10375[var2++] & field4196[var3]) << var1 - var3;
            var1 -= var3;
         }

         if (var1 == var3) {
            var4 += this.field10375[var2] & field4196[var3];
         } else {
            var4 += this.field10375[var2] >> var3 - var1 & field4196[var1];
         }

         return var4;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ajm.he(" + ')');
      }
   }

   public void method2648(byte var1) {
      try {
         this.field10376 = (this.field4194 * 1560311085 + 7) / 8 * 116413311;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajm.hp(" + ')');
      }
   }

   public class513(int var1) {
      super(var1);
   }

   public void method2649(class246 var1, byte var2) {
      try {
         this.field4195 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ajm.hs(" + ')');
      }
   }

   public int method6382(int var1) {
      try {
         int var2 = this.field10375[(this.field10376 += 116413311) * 385051775 - 1] - this.field4195.method4728(223815758) & 255;
         return var2 < 128 ? var2 : (var2 - 128 << 8) + (this.field10375[(this.field10376 += 116413311) * 385051775 - 1] - this.field4195.method4728(223815758) & 255);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajm.hv(" + ')');
      }
   }

   public void method2650(int var1) {
      try {
         this.field4194 = this.field10376 * -1472569640;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajm.hn(" + ')');
      }
   }

   public void method2651(int var1, byte var2) {
      try {
         this.field10375[(this.field10376 += 116413311) * 385051775 - 1] = (byte)(var1 + this.field4195.method4728(223815758));
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ajm.hg(" + ')');
      }
   }
}
