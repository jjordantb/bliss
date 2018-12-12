import jaclib.nanotime.QueryPerformanceCounter;

public class class185 extends class461 {
   int field5265 = 1;
   long field5266 = 0L;
   int field5267 = 0;
   long[] field5268 = new long[10];
   long field5269 = 0L;
   long field5270 = 0L;

   long method3984(int var1) {
      try {
         return this.field5269;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aau.k(" + ')');
      }
   }

   int method3981(long var1) {
      try {
         if (this.field5266 > this.field5269) {
            this.field5270 = (this.field5270 * -809283569091942523L + (this.field5266 * -809283569091942523L - this.field5269 * -809283569091942523L)) * -749596307049612979L;
            this.field5269 = (this.field5269 * 805490578470680525L + (this.field5266 * 805490578470680525L - this.field5269 * 805490578470680525L)) * 7092803054136495365L;
            this.field5266 += var1;
            return 1;
         } else {
            int var3 = 0;

            do {
               ++var3;
               this.field5266 += var1;
            } while(var3 < 10 && this.field5266 < this.field5269);

            if (this.field5266 < this.field5269) {
               this.field5266 = this.field5269;
            }

            return var3;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aau.i(" + ')');
      }
   }

   void method3978(int var1) {
      try {
         this.field5270 = 0L;
         if (this.field5266 > this.field5269) {
            this.field5269 = (this.field5269 * 805490578470680525L + (this.field5266 * 805490578470680525L - this.field5269 * 805490578470680525L)) * 7092803054136495365L;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aau.b(" + ')');
      }
   }

   long method3979(int var1) {
      try {
         this.field5269 += this.method3252(970605565);
         return this.field5266 > this.field5269 ? (this.field5266 - this.field5269) / 1000000L : 0L;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aau.p(" + ')');
      }
   }

   long method3252(int var1) {
      try {
         long var2 = QueryPerformanceCounter.nanoTime();
         long var4 = var2 - this.field5270;
         this.field5270 = var2;
         if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5268[this.field5267] = var4;
            this.field5267 = (1 + this.field5267) % 10;
            if (this.field5265 < 1) {
               ++this.field5265;
            }
         }

         long var6 = 0L;

         for(int var8 = 1; var8 <= this.field5265; ++var8) {
            var6 += this.field5268[(10 + (this.field5267 - var8)) % 10];
         }

         return var6 / (long)this.field5265;
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "aau.e(" + ')');
      }
   }

   class185() {
      this.field5266 = this.field5269 = QueryPerformanceCounter.nanoTime();
      if (this.field5269 == 0L) {
         throw new RuntimeException();
      }
   }
}
