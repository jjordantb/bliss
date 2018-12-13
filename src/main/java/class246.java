import java.awt.Canvas;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class class246 {
   int field8412;
   static int field8413 = 8;
   static int field8414 = 1020;
   int field8415;
   static int field8416 = 256;
   int[] field8417 = new int[256];
   int field8418;
   int[] field8419 = new int[256];
   int field8420;

   public final int method4728(int var1) {
      try {
         if (this.field8415 == 0) {
            this.method4731((byte)84);
            this.field8415 = 256;
         }

         return !Loader.field6959 ? 0 : this.field8419[--this.field8415];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sn.a(" + ')');
      }
   }

   final void method4729(int var1) {
      try {
         int var2 = -1640531527;
         int var3 = -1640531527;
         int var4 = -1640531527;
         int var5 = -1640531527;
         int var6 = -1640531527;
         int var7 = -1640531527;
         int var8 = -1640531527;
         int var9 = -1640531527;

         int var10;
         for(var10 = 0; var10 < 4; ++var10) {
            var9 ^= var8 << 11;
            var6 += var9;
            var8 += var7;
            var8 ^= var7 >>> 2;
            var5 += var8;
            var7 += var6;
            var7 ^= var6 << 8;
            var4 += var7;
            var6 += var5;
            var6 ^= var5 >>> 16;
            var3 += var6;
            var5 += var4;
            var5 ^= var4 << 10;
            var2 += var5;
            var4 += var3;
            var4 ^= var3 >>> 4;
            var9 += var4;
            var3 += var2;
            var3 ^= var2 << 8;
            var8 += var3;
            var2 += var9;
            var2 ^= var9 >>> 9;
            var7 += var2;
            var9 += var8;
         }

         for(var10 = 0; var10 < 256; var10 += 8) {
            var9 += this.field8419[var10];
            var8 += this.field8419[var10 + 1];
            var7 += this.field8419[2 + var10];
            var6 += this.field8419[3 + var10];
            var5 += this.field8419[4 + var10];
            var4 += this.field8419[5 + var10];
            var3 += this.field8419[6 + var10];
            var2 += this.field8419[7 + var10];
            var9 ^= var8 << 11;
            var6 += var9;
            var8 += var7;
            var8 ^= var7 >>> 2;
            var5 += var8;
            var7 += var6;
            var7 ^= var6 << 8;
            var4 += var7;
            var6 += var5;
            var6 ^= var5 >>> 16;
            var3 += var6;
            var5 += var4;
            var5 ^= var4 << 10;
            var2 += var5;
            var4 += var3;
            var4 ^= var3 >>> 4;
            var9 += var4;
            var3 += var2;
            var3 ^= var2 << 8;
            var8 += var3;
            var2 += var9;
            var2 ^= var9 >>> 9;
            var7 += var2;
            var9 += var8;
            this.field8417[var10] = var9;
            this.field8417[1 + var10] = var8;
            this.field8417[var10 + 2] = var7;
            this.field8417[var10 + 3] = var6;
            this.field8417[var10 + 4] = var5;
            this.field8417[var10 + 5] = var4;
            this.field8417[var10 + 6] = var3;
            this.field8417[var10 + 7] = var2;
         }

         for(var10 = 0; var10 < 256; var10 += 8) {
            var9 += this.field8417[var10];
            var8 += this.field8417[var10 + 1];
            var7 += this.field8417[var10 + 2];
            var6 += this.field8417[var10 + 3];
            var5 += this.field8417[var10 + 4];
            var4 += this.field8417[5 + var10];
            var3 += this.field8417[var10 + 6];
            var2 += this.field8417[7 + var10];
            var9 ^= var8 << 11;
            var6 += var9;
            var8 += var7;
            var8 ^= var7 >>> 2;
            var5 += var8;
            var7 += var6;
            var7 ^= var6 << 8;
            var4 += var7;
            var6 += var5;
            var6 ^= var5 >>> 16;
            var3 += var6;
            var5 += var4;
            var5 ^= var4 << 10;
            var2 += var5;
            var4 += var3;
            var4 ^= var3 >>> 4;
            var9 += var4;
            var3 += var2;
            var3 ^= var2 << 8;
            var8 += var3;
            var2 += var9;
            var2 ^= var9 >>> 9;
            var7 += var2;
            var9 += var8;
            this.field8417[var10] = var9;
            this.field8417[var10 + 1] = var8;
            this.field8417[var10 + 2] = var7;
            this.field8417[var10 + 3] = var6;
            this.field8417[var10 + 4] = var5;
            this.field8417[5 + var10] = var4;
            this.field8417[6 + var10] = var3;
            this.field8417[var10 + 7] = var2;
         }

         this.method4731((byte)-3);
         this.field8415 = 256;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "sn.p(" + ')');
      }
   }

   public final int method4730(byte var1) {
      try {
         if (this.field8415 == 0) {
            this.method4731((byte)-13);
            this.field8415 = 256;
         }

         return !Loader.field6959 ? 0 : this.field8419[this.field8415 - 1];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sn.f(" + ')');
      }
   }

   final void method4731(byte var1) {
      try {
         this.field8412 += (this.field8420 += 634094203) * 149032115;

         for(int var2 = 0; var2 < 256; ++var2) {
            int var3 = this.field8417[var2];
            if ((var2 & 2) == 0) {
               if ((var2 & 1) == 0) {
                  this.field8418 ^= this.field8418 << 13;
               } else {
                  this.field8418 ^= this.field8418 >>> 6;
               }
            } else if ((var2 & 1) == 0) {
               this.field8418 ^= this.field8418 << 2;
            } else {
               this.field8418 ^= this.field8418 >>> 16;
            }

            this.field8418 += this.field8417[128 + var2 & 255];
            int var4;
            this.field8417[var2] = var4 = this.field8412 + this.field8418 + this.field8417[(var3 & 1020) >> 2];
            this.field8419[var2] = this.field8412 = this.field8417[(var4 >> 8 & 1020) >> 2] + var3;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sn.b(" + ')');
      }
   }

   public class246(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field8419[var2] = var1[var2];
      }

      this.method4729(-1926269976);
   }

   static final void method4732(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class544.method2364(var3, var4, var0, 304191670);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sn.df(" + ')');
      }
   }

   static class837 method4733(class257 var0, Canvas var1, int var2, int var3, int var4) {
      try {
         class224 var5 = new class224(var0, var1, var2, var3);
         return var5;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "sn.n(" + ')');
      }
   }

   static void method4734(int var0) {
      try {
         try {
            File var1 = new File(class323.field631, "random.dat");
            int var3;
            if (var1.exists()) {
               class69.field1839 = new class645(new class439(var1, "rw", 25L), 24, 0);
            } else {
               label37:
               for(int var2 = 0; var2 < class396.field6516.length; ++var2) {
                  for(var3 = 0; var3 < class82.field1108.length; ++var3) {
                     File var4 = new File(class82.field1108[var3] + class396.field6516[var2] + File.separatorChar + "random.dat");
                     if (var4.exists()) {
                        class69.field1839 = new class645(new class439(var4, "rw", 25L), 24, 0);
                        break label37;
                     }
                  }
               }
            }

            if (class69.field1839 == null) {
               RandomAccessFile var7 = new RandomAccessFile(var1, "rw");
               var3 = var7.read();
               var7.seek(0L);
               var7.write(var3);
               var7.seek(0L);
               var7.close();
               class69.field1839 = new class645(new class439(var1, "rw", 25L), 24, 0);
            }
         } catch (IOException var5) {
            ;
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "sn.x(" + ')');
      }
   }
}
