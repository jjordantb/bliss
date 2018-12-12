public class class207 extends class461 {
   long field7052 = 0L;
   long field7053 = 0L;
   long[] field7054 = new long[10];
   int field7055 = 0;
   long field7056 = 0L;
   int field7057 = -1505940925;

   long method3980() {
      return this.field7053 * 4255909063329169833L;
   }

   class207() {
      this.field7053 = System.nanoTime() * -5945124749373967719L;
      this.field7056 = System.nanoTime() * 1084187842630379629L;
   }

   int method3981(long var1) {
      try {
         if (this.field7056 * 3383889029778923877L > this.field7053 * 4255909063329169833L) {
            this.field7052 += this.field7056 * -1779823502204740161L - this.field7053 * 1974423410268347339L;
            this.field7053 += -8946266981622927523L * this.field7056 - this.field7053 * 1L;
            this.field7056 += 1084187842630379629L * var1;
            return 1;
         } else {
            int var3 = 0;

            do {
               ++var3;
               this.field7056 += 1084187842630379629L * var1;
            } while(var3 < 10 && 3383889029778923877L * this.field7056 < 4255909063329169833L * this.field7053);

            if (this.field7056 * 3383889029778923877L < this.field7053 * 4255909063329169833L) {
               this.field7056 = this.field7053 * 923002373878029557L;
            }

            return var3;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aaf.i(" + ')');
      }
   }

   long method3984(int var1) {
      try {
         return this.field7053 * 4255909063329169833L;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aaf.k(" + ')');
      }
   }

   long method3986() {
      this.field7053 += this.method3753(-1990505491) * -5945124749373967719L;
      return this.field7056 * 3383889029778923877L > this.field7053 * 4255909063329169833L ? (3383889029778923877L * this.field7056 - 4255909063329169833L * this.field7053) / 1000000L : 0L;
   }

   void method3988() {
      this.field7052 = 0L;
      if (this.field7056 * 3383889029778923877L > 4255909063329169833L * this.field7053) {
         this.field7053 += -8946266981622927523L * this.field7056 - 1L * this.field7053;
      }

   }

   void method3982() {
      this.field7052 = 0L;
      if (this.field7056 * 3383889029778923877L > 4255909063329169833L * this.field7053) {
         this.field7053 += -8946266981622927523L * this.field7056 - 1L * this.field7053;
      }

   }

   void method3983() {
      this.field7052 = 0L;
      if (this.field7056 * 3383889029778923877L > 4255909063329169833L * this.field7053) {
         this.field7053 += -8946266981622927523L * this.field7056 - 1L * this.field7053;
      }

   }

   long method3987() {
      this.field7053 += this.method3753(847126204) * -5945124749373967719L;
      return this.field7056 * 3383889029778923877L > this.field7053 * 4255909063329169833L ? (3383889029778923877L * this.field7056 - 4255909063329169833L * this.field7053) / 1000000L : 0L;
   }

   int method3989(long var1) {
      if (this.field7056 * 3383889029778923877L > this.field7053 * 4255909063329169833L) {
         this.field7052 += this.field7056 * -1779823502204740161L - this.field7053 * 1974423410268347339L;
         this.field7053 += -8946266981622927523L * this.field7056 - this.field7053 * 1L;
         this.field7056 += 1084187842630379629L * var1;
         return 1;
      } else {
         int var3 = 0;

         do {
            ++var3;
            this.field7056 += 1084187842630379629L * var1;
         } while(var3 < 10 && 3383889029778923877L * this.field7056 < 4255909063329169833L * this.field7053);

         if (this.field7056 * 3383889029778923877L < this.field7053 * 4255909063329169833L) {
            this.field7056 = this.field7053 * 923002373878029557L;
         }

         return var3;
      }
   }

   long method3985() {
      this.field7053 += this.method3753(195670472) * -5945124749373967719L;
      return this.field7056 * 3383889029778923877L > this.field7053 * 4255909063329169833L ? (3383889029778923877L * this.field7056 - 4255909063329169833L * this.field7053) / 1000000L : 0L;
   }

   long method3753(int var1) {
      try {
         long var2 = System.nanoTime();
         long var4 = var2 - -5561332595849817637L * this.field7052;
         this.field7052 = -5853783290180697517L * var2;
         if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7054[578168601 * this.field7055] = var4;
            this.field7055 = 974800169 * ((1 + 578168601 * this.field7055) % 10);
            if (this.field7057 * -774573461 < 1) {
               this.field7057 += -1505940925;
            }
         }

         long var6 = 0L;

         for(int var8 = 1; var8 <= -774573461 * this.field7057; ++var8) {
            var6 += this.field7054[(578168601 * this.field7055 - var8 + 10) % 10];
         }

         return var6 / (long)(-774573461 * this.field7057);
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "aaf.e(" + ')');
      }
   }

   void method3978(int var1) {
      try {
         this.field7052 = 0L;
         if (this.field7056 * 3383889029778923877L > 4255909063329169833L * this.field7053) {
            this.field7053 += -8946266981622927523L * this.field7056 - 1L * this.field7053;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aaf.b(" + ')');
      }
   }

   long method3979(int var1) {
      try {
         this.field7053 += this.method3753(-99997412) * -5945124749373967719L;
         return this.field7056 * 3383889029778923877L > this.field7053 * 4255909063329169833L ? (3383889029778923877L * this.field7056 - 4255909063329169833L * this.field7053) / 1000000L : 0L;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aaf.p(" + ')');
      }
   }

   static final void method3754(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)-30);
         class131 var4 = class382.field1410[var2 >> 16];
         class86.method948(var3, var4, var0, (byte)24);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aaf.dm(" + ')');
      }
   }

   public static class307[] method3755(byte var0) {
      try {
         return new class307[]{class307.field425, class307.field421, class307.field422, class307.field423, class307.field424, class307.field430, class307.field433, class307.field434, class307.field428, class307.field429, class307.field435, class307.field431, class307.field432, class307.field420, class307.field426};
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "aaf.a(" + ')');
      }
   }
}
