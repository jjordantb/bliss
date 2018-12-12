public class class753 {
   int field4150;
   int[] field4151 = new int[2];
   int[] field4152 = new int[2];
   int field4153;
   int field4154;
   int field4155;
   int field4156;
   int field4157;
   int field4158;
   int field4159 = 2;
   int field4160;

   final int method2617(int var1) {
      if (this.field4160 >= this.field4156) {
         this.field4150 = this.field4152[this.field4157++] << 15;
         if (this.field4157 >= this.field4159) {
            this.field4157 = this.field4159 - 1;
         }

         this.field4156 = (int)((double)this.field4151[this.field4157] / 65536.0D * (double)var1);
         if (this.field4156 > this.field4160) {
            this.field4158 = ((this.field4152[this.field4157] << 15) - this.field4150) / (this.field4156 - this.field4160);
         }
      }

      this.field4150 += this.field4158;
      ++this.field4160;
      return this.field4150 - this.field4158 >> 15;
   }

   final void method2618(InputStream var1) {
      this.field4155 = var1.method6371();
      this.field4153 = var1.method6420((byte)10);
      this.field4154 = var1.method6420((byte)-71);
      this.method2619(var1);
   }

   final void method2619(InputStream var1) {
      this.field4159 = var1.method6371();
      this.field4151 = new int[this.field4159];
      this.field4152 = new int[this.field4159];

      for(int var2 = 0; var2 < this.field4159; ++var2) {
         this.field4151[var2] = var1.method6374();
         this.field4152[var2] = var1.method6374();
      }

   }

   final void method2620() {
      this.field4156 = 0;
      this.field4157 = 0;
      this.field4158 = 0;
      this.field4150 = 0;
      this.field4160 = 0;
   }

   class753() {
      this.field4151[0] = 0;
      this.field4151[1] = 65535;
      this.field4152[0] = 0;
      this.field4152[1] = 65535;
   }
}
