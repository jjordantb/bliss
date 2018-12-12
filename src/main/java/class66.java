public class class66 extends class293 {
   int field1712;
   byte[] field1713;
   int field1714;
   int field1715;
   int field1716;
   int field1717;
   int field1718;
   int field1719;
   int field1720;

   void method6496(int var1, int var2) {
      if (var1 != 0) {
         this.field1714 = this.field1715 * this.field1716 >> 12;
         if (this.field1714 < 0) {
            this.field1714 = 0;
         } else if (this.field1714 > 4096) {
            this.field1714 = 4096;
         }

         this.field1715 = this.field1719 - (var2 < 0 ? -var2 : var2);
         this.field1715 = this.field1715 * this.field1715 >> 12;
         this.field1715 = this.field1715 * this.field1714 >> 12;
         this.field1717 += this.field1715 * this.field1718 >> 12;
         this.field1718 = this.field1718 * this.field1712 >> 12;
      } else {
         this.field1715 = this.field1719 - (var2 < 0 ? -var2 : var2);
         this.field1715 = this.field1715 * this.field1715 >> 12;
         this.field1714 = 4096;
         this.field1717 = this.field1715;
      }

   }

   class66(int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      super(var1, var2, var3, var4, var5);
      this.field1716 = (int)(var8 * 4096.0F);
      this.field1719 = (int)(var7 * 4096.0F);
      this.field1718 = this.field1712 = (int)(Math.pow(0.5D, (double)(-var6)) * 4096.0D);
   }

   void method6505() {
      this.field1718 = this.field1712;
      this.field1717 >>= 4;
      if (this.field1717 < 0) {
         this.field1717 = 0;
      } else if (this.field1717 > 255) {
         this.field1717 = 255;
      }

      this.method1291(this.field1720++, (byte)this.field1717);
      this.field1717 = 0;
   }

   void method1291(int var1, byte var2) {
      this.field1713[var1] = var2;
   }

   void method6494() {
      this.field1720 = 0;
      this.field1717 = 0;
   }

   void method6501() {
      this.field1720 = 0;
      this.field1717 = 0;
   }

   void method6502() {
      this.field1718 = this.field1712;
      this.field1717 >>= 4;
      if (this.field1717 < 0) {
         this.field1717 = 0;
      } else if (this.field1717 > 255) {
         this.field1717 = 255;
      }

      this.method1291(this.field1720++, (byte)this.field1717);
      this.field1717 = 0;
   }

   void method6495(int var1, int var2) {
      if (var1 != 0) {
         this.field1714 = this.field1715 * this.field1716 >> 12;
         if (this.field1714 < 0) {
            this.field1714 = 0;
         } else if (this.field1714 > 4096) {
            this.field1714 = 4096;
         }

         this.field1715 = this.field1719 - (var2 < 0 ? -var2 : var2);
         this.field1715 = this.field1715 * this.field1715 >> 12;
         this.field1715 = this.field1715 * this.field1714 >> 12;
         this.field1717 += this.field1715 * this.field1718 >> 12;
         this.field1718 = this.field1718 * this.field1712 >> 12;
      } else {
         this.field1715 = this.field1719 - (var2 < 0 ? -var2 : var2);
         this.field1715 = this.field1715 * this.field1715 >> 12;
         this.field1714 = 4096;
         this.field1717 = this.field1715;
      }

   }

   void method6503(int var1, int var2) {
      if (var1 != 0) {
         this.field1714 = this.field1715 * this.field1716 >> 12;
         if (this.field1714 < 0) {
            this.field1714 = 0;
         } else if (this.field1714 > 4096) {
            this.field1714 = 4096;
         }

         this.field1715 = this.field1719 - (var2 < 0 ? -var2 : var2);
         this.field1715 = this.field1715 * this.field1715 >> 12;
         this.field1715 = this.field1715 * this.field1714 >> 12;
         this.field1717 += this.field1715 * this.field1718 >> 12;
         this.field1718 = this.field1718 * this.field1712 >> 12;
      } else {
         this.field1715 = this.field1719 - (var2 < 0 ? -var2 : var2);
         this.field1715 = this.field1715 * this.field1715 >> 12;
         this.field1714 = 4096;
         this.field1717 = this.field1715;
      }

   }

   void method6504(int var1, int var2) {
      if (var1 != 0) {
         this.field1714 = this.field1715 * this.field1716 >> 12;
         if (this.field1714 < 0) {
            this.field1714 = 0;
         } else if (this.field1714 > 4096) {
            this.field1714 = 4096;
         }

         this.field1715 = this.field1719 - (var2 < 0 ? -var2 : var2);
         this.field1715 = this.field1715 * this.field1715 >> 12;
         this.field1715 = this.field1715 * this.field1714 >> 12;
         this.field1717 += this.field1715 * this.field1718 >> 12;
         this.field1718 = this.field1718 * this.field1712 >> 12;
      } else {
         this.field1715 = this.field1719 - (var2 < 0 ? -var2 : var2);
         this.field1715 = this.field1715 * this.field1715 >> 12;
         this.field1714 = 4096;
         this.field1717 = this.field1715;
      }

   }
}
