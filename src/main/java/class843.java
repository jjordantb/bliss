public class class843 {
   public static int field9205 = 64;
   class180 field9206;
   class1 field9207 = new class1(64);

   public void method5454(int var1) {
      try {
         class1 var2 = this.field9207;
         synchronized(this.field9207) {
            this.field9207.method2977();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "nb.f(" + ')');
      }
   }

   public void method5455(int var1) {
      try {
         class1 var2 = this.field9207;
         synchronized(this.field9207) {
            this.field9207.method2979();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "nb.p(" + ')');
      }
   }

   public void method5456(int var1, byte var2) {
      try {
         class1 var3 = this.field9207;
         synchronized(this.field9207) {
            this.field9207.method2977();
            this.field9207 = new class1(var1);
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nb.i(" + ')');
      }
   }

   public void method5457(int var1, byte var2) {
      try {
         class1 var3 = this.field9207;
         synchronized(this.field9207) {
            this.field9207.method2976(var1, 204865938);
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nb.b(" + ')');
      }
   }

   public class843(class469 var1, class423 var2, class180 var3) {
      this.field9206 = var3;
      if (this.field9206 != null) {
         int var4 = this.field9206.method3266(2088108840) - 1;
         class981.field3217.method1926((short)7909);
         this.field9206.method3286(var4, 967571472);
      }

   }

   public class490 method5458(int var1, int var2) {
      try {
         class1 var3 = this.field9207;
         class490 var4;
         synchronized(this.field9207) {
            var4 = (class490)this.field9207.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field9206;
            byte[] var10;
            synchronized(this.field9206) {
               var10 = this.field9206.method3285(class981.field3217.method1927(var1, -1343831720), class981.field3217.method1925(var1, 39933071), (byte)14);
            }

            var4 = new class490();
            if (var10 != null) {
               var4.method4429(new InputStream(var10), 16711680);
            }

            class1 var11 = this.field9207;
            synchronized(this.field9207) {
               this.field9207.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "nb.a(" + ')');
      }
   }

   static final void method5459(class744 var0, byte var1) {
      try {
         var0.field3162 -= 2;
         if (var0.field3168[var0.field3162] <= var0.field3168[var0.field3162 + 1]) {
            var0.field3176 += var0.field3174[var0.field3176];
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nb.bl(" + ')');
      }
   }

   static final void method5460(class744 var0, short var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-48);
         class131 var4 = class382.field1410[var2 >> 16];
         class131.method890(var3, var4, var0, (byte)39);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nb.ib(" + ')');
      }
   }

   static final void method5461(class744 var0, int var1) {
      try {
         class684 var2 = class423.method5712((short)512);
         class701 var3 = class637.method5936(class643.field10016, var2.field7765, (byte)109);
         var3.field3364.method6361(0);
         int var4 = var3.field3364.field10376;
         var3.field3364.method6361(1);
         var3.field3364.method6362(var0.field3160.field6482, 16711935);
         var0.field3160.field6483.method6656(var3.field3364, var0.field3160.field6484, 373327263);
         var3.field3364.method6426(var3.field3364.field10376 - var4, (byte)-102);
         var2.method4380(var3, (byte)-38);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nb.ack(" + ')');
      }
   }

   static int method5462(CharSequence var0, char var1, int var2) {
      try {
         int var3 = 0;
         int var4 = var0.length();

         for(int var5 = 0; var5 < var4; ++var5) {
            if (var0.charAt(var5) == var1) {
               ++var3;
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "nb.a(" + ')');
      }
   }

   static final void method5463(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-74);
         class131 var4 = class382.field1410[var2 >> 16];
         class715.method2098(var3, var4, var0, (byte)-34);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nb.ka(" + ')');
      }
   }
}
