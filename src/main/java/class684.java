import java.io.IOException;

public class class684 {
   int field7762;
   class348 field7763;
   class373 field7764 = new class373();
   public class246 field7765;
   InputStream field7766 = new InputStream(1500);
   static int field7767 = 15000;
   class513 field7768 = new class513(15000);
   class246 field7769;
   class807 field7770 = null;
   int field7771 = 0;
   boolean field7772 = true;
   int field7773 = 0;
   public int field7774 = 0;
   class84 field7775 = new class84();
   int field7776;
   int field7777;
   int field7778;
   class807 field7779;
   class807 field7780;
   int field7781 = 0;
   public boolean field7782 = false;
   class807 field7783;

   final void method4373(short var1) {
      try {
         this.field7764.method905((byte)1);
         this.field7781 = 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "az.a(" + ')');
      }
   }

   void method4374(byte var1) {
      try {
         if (this.field7763 != null) {
            this.field7763.method179(-2071805238);
            this.field7763 = null;
         }

         this.field7775.method934((String)null, -2060987245);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "az.k(" + ')');
      }
   }

   class684() {
      Thread var1 = new Thread(this.field7775);
      var1.setPriority(1);
      var1.start();
   }

   void method4375(int var1) {
      try {
         this.field7763 = null;
         this.field7775.method934((String)null, -2119645240);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "az.d(" + ')');
      }
   }

   public final void method4376(int var1) throws IOException {
      try {
         if (this.field7763 != null && this.field7781 > 0) {
            this.field7766.field10376 = 0;

            while(true) {
               class701 var2 = (class701)this.field7764.method901(1766612795);
               if (var2 == null) {
                  if (var1 >= -876809530) {
                     return;
                  }
                  break;
               }

               if (var2.field3367 > this.field7766.field10375.length - this.field7766.field10376) {
                  if (var1 >= -876809530) {
                     return;
                  }
                  break;
               }

               this.field7766.method6425(var2.field3364.field10375, 0, var2.field3367, (short)-5547);
               this.field7781 -= var2.field3367;
               var2.method545(-1460969981);
               var2.field3364.method6427(-2079366553);
               var2.method1972(939112928);
            }

            this.field7763.method187(this.field7766.field10375, 0, this.field7766.field10376, 1953252448);
            this.field7777 += this.field7766.field10376;
            this.field7774 = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "az.f(" + ')');
      }
   }

   public class348 method4377(int var1) {
      try {
         return this.field7763;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "az.u(" + ')');
      }
   }

   void method4378(byte var1) {
      try {
         if (class730.field2866 % 50 == 0) {
            this.field7762 = this.field7777;
            this.field7777 = 0;
            this.field7778 = this.field7776;
            this.field7776 = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "az.p(" + ')');
      }
   }

   void method4379(class348 var1, String var2, byte var3) {
      try {
         this.field7763 = var1;
         this.field7775.method934(var2, -2024607091);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "az.i(" + ')');
      }
   }

   public final void method4380(class701 var1, byte var2) {
      try {
         this.field7764.method897(var1, 1630737890);
         var1.field3367 = var1.field3364.field10376;
         var1.field3364.field10376 = 0;
         this.field7781 += var1.field3367;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "az.b(" + ')');
      }
   }

   static final void method4381(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-78);
         class131 var4 = class382.field1410[var2 >> 16];
         class569.method10(var3, var4, var0, -915458909);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "az.ev(" + ')');
      }
   }

   static int method4382(byte[][] var0, byte[][] var1, int[] var2, byte[] var3, int[] var4, int var5, int var6, int var7) {
      try {
         int var8 = var2[var5];
         int var9 = var4[var5] + var8;
         int var10 = var2[var6];
         int var11 = var10 + var4[var6];
         int var12 = var8;
         if (var10 > var8) {
            var12 = var10;
         }

         int var13 = var9;
         if (var11 < var9) {
            var13 = var11;
         }

         int var14 = var3[var5] & 255;
         if ((var3[var6] & 255) < var14) {
            var14 = var3[var6] & 255;
         }

         byte[] var15 = var1[var5];
         byte[] var16 = var0[var6];
         int var17 = var12 - var8;
         int var18 = var12 - var10;

         for(int var19 = var12; var19 < var13; ++var19) {
            int var20 = var15[var17++] + var16[var18++];
            if (var20 < var14) {
               var14 = var20;
            }
         }

         return -var14;
      } catch (RuntimeException var21) {
         throw class158.method3445(var21, "az.b(" + ')');
      }
   }

   public static void method4383(int var0, int var1, String var2, String var3, String var4, String var5, String var6, int var7, int var8) {
      try {
         class506 var9 = class503.field4100[99];

         for(int var10 = 99; var10 > 0; --var10) {
            class503.field4100[var10] = class503.field4100[var10 - 1];
         }

         if (var9 == null) {
            var9 = new class506(var0, var1, var2, var3, var4, var6, var7, var5);
         } else {
            var9.method2599(var0, var1, var2, var3, var4, var6, var7, var5, (short)8448);
         }

         class503.field4100[0] = var9;
         ++class503.field4098;
         class730.field2864 = class730.field2915;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "az.i(" + ')');
      }
   }

   static final void method4384(class744 var0, int var1) {
      try {
         class237.method4657(class111.method1360(-2133581125), var0, (byte)0);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "az.ut(" + ')');
      }
   }

   static final void method4385(class744 var0, int var1) {
      try {
         int var2 = var0.field3174[var0.field3176];
         class827.field9037.method5494(var2, var0.field3161[--var0.field3156], 681479919);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "az.m(" + ')');
      }
   }
}
