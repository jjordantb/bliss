public class class199 extends class732 implements class265 {
   class719 field7026;
   class240 field7027;
   class770 field7028;
   class879 field7029;
   int field7030;
   byte field7031;
   byte field7032;
   boolean field7033;
   boolean field7034;
   boolean field7035;
   static String field7036;
   static class675 field7037;

   boolean method2206(byte var1) {
      try {
         if (this.field7029 != null) {
            return !this.field7029.method6036();
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wq.bf(" + ')');
      }
   }

   boolean method2183(short var1) {
      try {
         return this.field7029 != null ? this.field7029.method5989() : false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wq.be(" + ')');
      }
   }

   public int method2168(int var1) {
      try {
         return this.field7029 != null ? this.field7029.method5976() : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wq.bm(" + ')');
      }
   }

    @Override
    boolean method2173(int var1) {
        return false;
    }

    class879 method3745(class848 var1, int var2, int var3) {
      try {
         if (this.field7029 != null && var1.method4836(this.field7029.method5948(), var2) == 0) {
            return this.field7029;
         } else {
            class486 var4 = this.method3746(var1, var2, false, -1045378786);
            return var4 != null ? (class879)var4.field8554 : null;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "wq.by(" + ')');
      }
   }

   public void method4556(class848 var1, int var2) {
      try {
         Object var3 = null;
         class770 var5;
         if (this.field7028 == null && this.field7035) {
            class486 var4 = this.method3746(var1, 262144, true, -1658395754);
            var5 = (class770)(var4 != null ? var4.field8555 : null);
         } else {
            var5 = this.field7028;
            this.field7028 = null;
         }

         class32 var7 = this.method1511().field7637;
         if (var5 != null) {
            super.field3638.method2441(var5, super.field3640, (int)var7.field5296, (int)var7.field5299, (boolean[])null, 1462465403);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "wq.d(" + ')');
      }
   }

   class192 method2201(class848 var1, int var2) {
      try {
         if (this.field7029 == null) {
            return null;
         } else {
            class135 var3 = var1.method5048();
            var3.method1024(this.method1521());
            var3.method1018((float)super.field2978, 0.0F, (float)super.field2979);
            class192 var4 = class221.method4033(this.field7034, 1295089573);
            this.field7029.method5965(var3, super.field3642[0], 0);
            return var4;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "wq.bo(" + ')');
      }
   }

    @Override
    void method2205(byte var1) {

    }

    public int method4549(short var1) {
      try {
         return this.field7032;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wq.b(" + ')');
      }
   }

   boolean method2157(class848 var1, int var2, int var3, byte var4) {
      try {
         class879 var5 = this.method3745(var1, 131072, 1991691041);
         if (var5 != null) {
            class135 var6 = this.method1521();
            return var5.method6097(var2, var3, var6, false, 0);
         } else {
            return false;
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "wq.bu(" + ')');
      }
   }

   public int method4551(byte var1) {
      try {
         return this.field7030;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wq.a(" + ')');
      }
   }

   public void method4550(byte var1) {
      try {
         if (this.field7029 != null) {
            this.field7029.method6093();
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wq.p(" + ')');
      }
   }

   public boolean method4558(int var1) {
      try {
         return this.field7035;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wq.i(" + ')');
      }
   }

   public void method4552(class848 var1, int var2) {
      try {
         Object var3 = null;
         class770 var5;
         if (this.field7028 == null && this.field7035) {
            class486 var4 = this.method3746(var1, 262144, true, 443427270);
            var5 = (class770)(var4 != null ? var4.field8555 : null);
         } else {
            var5 = this.field7028;
            this.field7028 = null;
         }

         class32 var7 = this.method1511().field7637;
         if (var5 != null) {
            super.field3638.method2449(var5, super.field3640, (int)var7.field5296, (int)var7.field5299, (boolean[])null, -1121841328);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "wq.k(" + ')');
      }
   }

   public int method4548(int var1) {
      try {
         return this.field7031;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wq.f(" + ')');
      }
   }

   public class199(class545 var1, class848 var2, class240 var3, ObjectDefinition var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14) {
      super(var1, var7, var8, var9, var5, var6, var11, var12);
      this.field7027 = var3;
      this.field7030 = var4.field2197;
      this.field7033 = var10;
      this.field7032 = (byte)var14;
      this.field7031 = (byte)var13;
      this.field7034 = var4.field2214 != 0 && !var10;
      this.field7035 = var2.method4916() && var4.field2265 && !this.field7033 && class615.field8903.field9147.method5182(-208809184) != 0;
      int var15 = 2048;
      if (var4.field2273) {
         var15 |= 524288;
      }

      class486 var16 = this.method3746(var2, var15, this.field7035, -772904584);
      if (var16 != null) {
         this.field7029 = (class879)var16.field8554;
         this.field7028 = (class770)var16.field8555;
         if (var4.field2273) {
            this.field7029 = this.field7029.method6017((byte)0, var15, false);
            if (var4.field2273) {
               class923 var17 = class730.field2697.method5274(-2114342399);
               this.field7029.method5987(var17.field10290, var17.field10291, var17.field10292, var17.field10293);
            }
         }
      }

      this.method2169(1, -1063190052);
   }

   class486 method3746(class848 var1, int var2, boolean var3, int var4) {
      try {
         ObjectDefinition var5 = this.field7027.method4713(this.field7030);
         class454 var6;
         class454 var7;
         if (this.field7033) {
            var6 = super.field3638.field3866[super.field3640];
            var7 = super.field3638.field3864[0];
         } else {
            var6 = super.field3638.field3864[super.field3640];
            if (super.field3640 < 3) {
               var7 = super.field3638.field3864[super.field3640 + 1];
            } else {
               var7 = null;
            }
         }

         class32 var8 = this.method1511().field7637;
         return var5.method1495(var1, var2, this.field7031, this.field7032, var6, var7, (int)var8.field5296, (int)var8.field5300, (int)var8.field5299, var3, (class552)null, -911505460);
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "wq.bl(" + ')');
      }
   }

   void method2164(class848 var1, int var2) {
   }

    @Override
    public class719 method2165(class848 var1, byte var2) {
        return null;
    }

    public static void method3747(int var0) {
      try {
         class371.field1090 = null;
         class295.field10479 = null;
         class166.field6897 = null;
         class936.field10314 = null;
         class407.field9260 = null;
         class51.field2309 = null;
         class103.field206 = null;
         class593.field1622 = null;
         class948.field3290 = null;
         class909.field10396 = null;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "wq.ak(" + ')');
      }
   }

   public static int[] method3748(int var0, int var1, int var2, int var3, int var4, float var5, boolean var6, int var7) {
      try {
         int[] var8 = new int[var0];
         class172 var9 = new class172();
         var9.field4980 = var1;
         var9.field4985 = var6;
         var9.field4983 = var2;
         var9.field4982 = var3;
         var9.field4984 = var4;
         var9.field4981 = (int)(4096.0F * var5);
         var9.method205(-369839691);
         class322.method815(var0, 1, (byte)24);
         var9.method3022(0, var8, -2040071008);
         return var8;
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "wq.bf(" + ')');
      }
   }

   static void method3749(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int var7 = var5 + var2;
         int var8 = var3 - var5;

         int var9;
         for(var9 = var2; var9 < var7; ++var9) {
            class484.method4769(class381.field1412[var9], var0, var1, var4, 1081395615);
         }

         for(var9 = var3; var9 > var8; --var9) {
            class484.method4769(class381.field1412[var9], var0, var1, var4, -1329971917);
         }

         var9 = var0 + var5;
         int var10 = var1 - var5;

         for(int var11 = var7; var11 <= var8; ++var11) {
            int[] var12 = class381.field1412[var11];
            class484.method4769(var12, var0, var9, var4, -1691383948);
            class484.method4769(var12, var10, var1, var4, -1133427569);
         }

      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "wq.y(" + ')');
      }
   }

   static void method3750(int var0, byte var1) {
      try {
         class519.field4213 = var0;
         class1 var2 = class759.field4330;
         synchronized(class759.field4330) {
            class759.field4330.method2977();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "wq.f(" + ')');
      }
   }
}
