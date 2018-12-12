public class class240 {
   class25[] field8382 = new class25[4];
   class423 field8383;
   boolean field8384;
   class180 field8385;
   class180 field8386;
   public static int field8387 = 256;
   class1 field8388 = new class1(256);
   class1 field8389 = new class1(500);
   class1 field8390 = new class1(50);
   class1 field8391 = new class1(30);
   int field8392;
   String[] field8393;
   class469 field8394;
   class486 field8395 = new class486((Object)null, (Object)null);

   public void method4707(boolean var1, int var2) {
      try {
         if (this.field8384 != var1) {
            this.field8384 = var1;
            this.method4710(1159892995);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "rx.f(" + ')');
      }
   }

   public void method4708(int var1, int var2) {
      try {
         this.field8392 = var1;
         class1 var3 = this.field8389;
         synchronized(this.field8389) {
            this.field8389.method2977();
         }

         var3 = this.field8391;
         synchronized(this.field8391) {
            this.field8391.method2977();
         }

         var3 = this.field8390;
         synchronized(this.field8390) {
            this.field8390.method2977();
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "rx.b(" + ')');
      }
   }

   public void method4709(int var1, byte var2) {
      try {
         this.field8388 = new class1(var1);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "rx.p(" + ')');
      }
   }

   public void method4710(int var1) {
      try {
         class1 var2 = this.field8388;
         synchronized(this.field8388) {
            this.field8388.method2977();
         }

         var2 = this.field8389;
         synchronized(this.field8389) {
            this.field8389.method2977();
         }

         var2 = this.field8391;
         synchronized(this.field8391) {
            this.field8391.method2977();
         }

         var2 = this.field8390;
         synchronized(this.field8390) {
            this.field8390.method2977();
         }

         this.field8382 = new class25[4];
         this.field8395 = new class486((Object)null, (Object)null);
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "rx.i(" + ')');
      }
   }

   public void method4711(int var1, byte var2) {
      try {
         class1 var3 = this.field8388;
         synchronized(this.field8388) {
            this.field8388.method2976(var1, -798729587);
         }

         var3 = this.field8389;
         synchronized(this.field8389) {
            this.field8389.method2976(var1, -1754602717);
         }

         var3 = this.field8391;
         synchronized(this.field8391) {
            this.field8391.method2976(var1, 466618917);
         }

         var3 = this.field8390;
         synchronized(this.field8390) {
            this.field8390.method2976(var1, -855180536);
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "rx.k(" + ')');
      }
   }

   public void method4712(int var1) {
      try {
         class1 var2 = this.field8388;
         synchronized(this.field8388) {
            this.field8388.method2979();
         }

         var2 = this.field8389;
         synchronized(this.field8389) {
            this.field8389.method2979();
         }

         var2 = this.field8391;
         synchronized(this.field8391) {
            this.field8391.method2979();
         }

         var2 = this.field8390;
         synchronized(this.field8390) {
            this.field8390.method2979();
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "rx.d(" + ')');
      }
   }

   public class240(class469 var1, class423 var2, boolean var3, class180 var4, class180 var5) {
      this.field8394 = var1;
      this.field8383 = var2;
      this.field8384 = var3;
      this.field8385 = var4;
      this.field8386 = var5;
      if (this.field8385 != null) {
         int var6 = this.field8385.method3266(1680210708) - 1;
         class981.field3254.method1926((short)23751);
         this.field8385.method3286(var6, -1017296855);
      }

      if (this.field8394 == class469.field7324) {
         this.field8393 = new String[]{null, null, null, null, null, class814.field4779.method2927(this.field8383, -875414210)};
      } else {
         this.field8393 = new String[6];
      }

   }

   public ObjectDefinition method4713(int var1) {
      try {
         class1 var2 = this.field8388;
         ObjectDefinition var3;
         synchronized(this.field8388) {
            var3 = (ObjectDefinition)this.field8388.method2974((long)var1);
         }

         if (var3 != null) {
            return var3;
         } else {
            class180 var4 = this.field8385;
            byte[] var9;
            synchronized(this.field8385) {
               var9 = this.field8385.method3285(class981.field3254.method1927(var1, -1875026798), class981.field3254.method1925(var1, -1955117131), (byte)-69);
            }

            var3 = new ObjectDefinition();
            var3.field2197 = var1;
            var3.field2235 = this;
            var3.field2226 = (String[])this.field8393.clone();
            if (var9 != null) {
               var3.method1493(new InputStream(var9), -1780393822);
            }

            var3.method1488(-231037911);
            if (var3.field2248) {
               var3.field2212 = 0;
               var3.field2256 = false;
            }

            if (!this.field8384 && var3.field2266) {
               var3.field2226 = null;
               var3.field2202 = null;
            }

            class1 var10 = this.field8388;
            synchronized(this.field8388) {
               this.field8388.method2984(var3, (long)var1);
            }

            return var3;
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "rx.a(" + ')');
      }
   }

   static final void method4714(int var0, int var1, int var2, int var3, int var4) {
      try {
         int var5 = 0;
         int var6 = var2;
         int var7 = -var2;
         int var8 = -1;
         class484.method4769(class381.field1412[var1], var0 - var2, var0 + var2, var3, 198591816);

         while(var6 > var5) {
            var8 += 2;
            var7 += var8;
            ++var5;
            if (var7 >= 0) {
               --var6;
               var7 -= var6 << 1;
               int[] var9 = class381.field1412[var6 + var1];
               int[] var10 = class381.field1412[var1 - var6];
               int var11 = var5 + var0;
               int var12 = var0 - var5;
               class484.method4769(var9, var12, var11, var3, 1681024850);
               class484.method4769(var10, var12, var11, var3, -1116732446);
            }

            int var14 = var6 + var0;
            int var15 = var0 - var6;
            int[] var16 = class381.field1412[var1 + var5];
            int[] var17 = class381.field1412[var1 - var5];
            class484.method4769(var16, var15, var14, var3, -143852292);
            class484.method4769(var17, var15, var14, var3, 358013733);
         }

      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "rx.s(" + ')');
      }
   }

   static final void method4715(class744 var0, short var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-1);
         class131 var4 = class382.field1410[var2 >> 16];
         class713.method2076(var3, var4, var0, (byte)-45);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "rx.dc(" + ')');
      }
   }

   static class495[] method4716(int var0) {
      try {
         return new class495[]{class495.field7993, class495.field7972, class495.field8094, class495.field7974, class495.field7975, class495.field7976, class495.field7977, class495.field8051, class495.field7979, class495.field8060, class495.field8046, class495.field7982, class495.field8087, class495.field7984, class495.field8002, class495.field7986, class495.field7987, class495.field7988, class495.field7989, class495.field8012, class495.field8076, class495.field7985, class495.field8091, class495.field7994, class495.field7995, class495.field8067, class495.field8013, class495.field8019, class495.field7991, class495.field7978, class495.field8001, class495.field8049, class495.field8003, class495.field8004, class495.field8005, class495.field8006, class495.field8007, class495.field8008, class495.field8009, class495.field8010, class495.field8069, class495.field7981, class495.field8096, class495.field8014, class495.field8015, class495.field8016, class495.field8017, class495.field8018, class495.field7983, class495.field8020, class495.field8021, class495.field8022, class495.field8023, class495.field8068, class495.field8025, class495.field8026, class495.field8027, class495.field8028, class495.field8058, class495.field8030, class495.field8031, class495.field8032, class495.field8033, class495.field7999, class495.field8036, class495.field8043, class495.field8037, class495.field8038, class495.field8039, class495.field8040, class495.field8041, class495.field8042, class495.field8059, class495.field8044, class495.field8045, class495.field7996, class495.field8047, class495.field7971, class495.field8093, class495.field8050, class495.field7998, class495.field8052, class495.field8057, class495.field8054, class495.field8055, class495.field8048, class495.field8082, class495.field8053, class495.field8079, class495.field8024, class495.field8061, class495.field8062, class495.field8056, class495.field8064, class495.field7973, class495.field8066, class495.field8095, class495.field7992, class495.field7980, class495.field8070, class495.field8011, class495.field8072, class495.field8034, class495.field8074, class495.field8075, class495.field7990, class495.field8077, class495.field8078, class495.field8065, class495.field8080, class495.field8081, class495.field8063, class495.field8083, class495.field8084, class495.field8085, class495.field8086, class495.field8073, class495.field8088, class495.field8089, class495.field8000, class495.field8071, class495.field8092, class495.field7997, class495.field8035, class495.field8029};
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "rx.a(" + ')');
      }
   }
}
