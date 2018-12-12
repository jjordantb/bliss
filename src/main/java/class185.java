import jaclib.nanotime.QueryPerformanceCounter;

public class class185 extends class461 {
   int field5265 = 149830037;
   long field5266 = 0L;
   int field5267 = 0;
   long[] field5268 = new long[10];
   long field5269 = 0L;
   long field5270 = 0L;

   long method3980() {
      return this.field5269 * 7092803054136495365L;
   }

   long method3984(int var1) {
      try {
         return this.field5269 * 7092803054136495365L;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aau.k(" + ')');
      }
   }

   long method3985() {
      this.field5269 += this.method3252(970605565) * 805490578470680525L;
      return this.field5266 * 2528788777947664827L > this.field5269 * 7092803054136495365L ? (this.field5266 * 2528788777947664827L - this.field5269 * 7092803054136495365L) / 1000000L : 0L;
   }

   void method3983() {
      this.field5270 = 0L;
      if (2528788777947664827L * this.field5266 > this.field5269 * 7092803054136495365L) {
         this.field5269 += this.field5266 * -1445719683822198849L - 1L * this.field5269;
      }

   }

   int method3981(long var1) {
      try {
         if (2528788777947664827L * this.field5266 > 7092803054136495365L * this.field5269) {
            this.field5270 += -266790697308425433L * this.field5266 - this.field5269 * -8298770624837138791L;
            this.field5269 += -1445719683822198849L * this.field5266 - 1L * this.field5269;
            this.field5266 += var1 * -8587934381355922573L;
            return 1;
         } else {
            int var3 = 0;

            do {
               ++var3;
               this.field5266 += -8587934381355922573L * var1;
            } while(var3 < 10 && this.field5266 * 2528788777947664827L < 7092803054136495365L * this.field5269);

            if (this.field5266 * 2528788777947664827L < this.field5269 * 7092803054136495365L) {
               this.field5266 = this.field5269 * -3947023160226410433L;
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
         if (2528788777947664827L * this.field5266 > this.field5269 * 7092803054136495365L) {
            this.field5269 += this.field5266 * -1445719683822198849L - 1L * this.field5269;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aau.b(" + ')');
      }
   }

   void method3988() {
      this.field5270 = 0L;
      if (2528788777947664827L * this.field5266 > this.field5269 * 7092803054136495365L) {
         this.field5269 += this.field5266 * -1445719683822198849L - 1L * this.field5269;
      }

   }

   void method3982() {
      this.field5270 = 0L;
      if (2528788777947664827L * this.field5266 > this.field5269 * 7092803054136495365L) {
         this.field5269 += this.field5266 * -1445719683822198849L - 1L * this.field5269;
      }

   }

   long method3979(int var1) {
      try {
         this.field5269 += this.method3252(970605565) * 805490578470680525L;
         return this.field5266 * 2528788777947664827L > this.field5269 * 7092803054136495365L ? (this.field5266 * 2528788777947664827L - this.field5269 * 7092803054136495365L) / 1000000L : 0L;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aau.p(" + ')');
      }
   }

   long method3987() {
      this.field5269 += this.method3252(970605565) * 805490578470680525L;
      return this.field5266 * 2528788777947664827L > this.field5269 * 7092803054136495365L ? (this.field5266 * 2528788777947664827L - this.field5269 * 7092803054136495365L) / 1000000L : 0L;
   }

   long method3252(int var1) {
      try {
         long var2 = QueryPerformanceCounter.nanoTime();
         long var4 = var2 - this.field5270 * -749596307049612979L;
         this.field5270 = var2 * -809283569091942523L;
         if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5268[this.field5267 * -683538483] = var4;
            this.field5267 = 1094860037 * ((1 + this.field5267 * -683538483) % 10);
            if (this.field5265 * 769935805 < 1) {
               this.field5265 += 149830037;
            }
         }

         long var6 = 0L;

         for(int var8 = 1; var8 <= this.field5265 * 769935805; ++var8) {
            var6 += this.field5268[(10 + (this.field5267 * -683538483 - var8)) % 10];
         }

         return var6 / (long)(this.field5265 * 769935805);
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "aau.e(" + ')');
      }
   }

   long method3986() {
      this.field5269 += this.method3252(970605565) * 805490578470680525L;
      return this.field5266 * 2528788777947664827L > this.field5269 * 7092803054136495365L ? (this.field5266 * 2528788777947664827L - this.field5269 * 7092803054136495365L) / 1000000L : 0L;
   }

   int method3989(long var1) {
      if (2528788777947664827L * this.field5266 > 7092803054136495365L * this.field5269) {
         this.field5270 += -266790697308425433L * this.field5266 - this.field5269 * -8298770624837138791L;
         this.field5269 += -1445719683822198849L * this.field5266 - 1L * this.field5269;
         this.field5266 += var1 * -8587934381355922573L;
         return 1;
      } else {
         int var3 = 0;

         do {
            ++var3;
            this.field5266 += -8587934381355922573L * var1;
         } while(var3 < 10 && this.field5266 * 2528788777947664827L < 7092803054136495365L * this.field5269);

         if (this.field5266 * 2528788777947664827L < this.field5269 * 7092803054136495365L) {
            this.field5266 = this.field5269 * -3947023160226410433L;
         }

         return var3;
      }
   }

   class185() {
      this.field5266 = (this.field5269 = QueryPerformanceCounter.nanoTime() * 805490578470680525L) * -3947023160226410433L;
      if (this.field5269 * 7092803054136495365L == 0L) {
         throw new RuntimeException();
      }
   }
}
