import java.awt.Canvas;
import java.lang.reflect.Method;
import java.util.Random;

public class class977 extends class298 {
   boolean field3010;
   int field3011 = 256;
   static class962 field3012;
   class373 field3013 = new class373();
   int field3014 = 0;
   int field3015;
   int field3016;
   int field3017 = 256;
   boolean field3018;
   static int field3019;

   static {
      field3012 = new class962(64, class474.field8268);
      field3019 = 100;
   }

   public void method1804(int var1, byte var2) {
      try {
         this.field3017 = var1;
         this.field3011 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aii.av(" + ')');
      }
   }

   synchronized void method6533(int[] var1, int var2, int var3) {
      try {
         if (!this.field3010) {
            if (this.method1807(753213382) == null) {
               if (this.field3018) {
                  this.method545(-1460969981);
                  field3012.method2125(-600702180);
               }
            } else {
               int var4 = var2 + var3;
               if (class752.field4167) {
                  var4 <<= 1;
               }

               byte var5 = 0;
               byte var6 = 0;
               if (this.field3016 == 2) {
                  var6 = 1;
               }

               while(var2 < var4) {
                  class784 var7 = this.method1807(753213382);
                  if (var7 == null) {
                     break;
                  }

                  short[][] var8;
                  for(var8 = var7.field3953; var2 < var4 && this.field3015 < var8[0].length; ++this.field3015) {
                     if (class752.field4167) {
                        var1[var2++] = var8[var5][this.field3015] * this.field3017;
                        var1[var2++] = var8[var6][this.field3015] * this.field3011;
                     } else {
                        int var10001 = var2++;
                        var1[var10001] += var8[var6][this.field3015] * this.field3011 + var8[var5][this.field3015] * this.field3017;
                     }
                  }

                  if (this.field3015 >= var8[0].length) {
                     this.method1814((byte)1);
                  }
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "aii.k(" + ')');
      }
   }

   synchronized void method6534(int var1) {
      try {
         if (!this.field3010) {
            while(true) {
               class784 var2 = this.method1807(753213382);
               if (var2 == null) {
                  if (this.field3018) {
                     this.method545(-1460969981);
                     field3012.method2125(952112097);
                  }
                  break;
               }

               if (var2.field3953[0].length - this.field3015 > var1) {
                  this.field3015 += var1;
                  break;
               }

               var1 -= var2.field3953[0].length - this.field3015;
               this.method1814((byte)1);
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aii.d(" + ')');
      }
   }

   synchronized int method1805(int var1) {
      try {
         return this.field3014;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aii.at(" + ')');
      }
   }

   class784 method1806(int var1, double var2) {
      try {
         long var4 = (long)(this.field3016 << 32 | var1);
         class784 var6 = (class784)field3012.method2122(var4, (byte)-35);
         if (var6 != null) {
            var6.field3952 = var2;
            field3012.method2126(var4, 1695283057);
         } else {
            var6 = new class784(new short[this.field3016][var1], var2);
         }

         return var6;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "aii.al(" + ')');
      }
   }

   synchronized class784 method1807(int var1) {
      try {
         return (class784)this.field3013.method901(1766612795);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aii.ah(" + ')');
      }
   }

   synchronized void method1808(class784 var1, int var2) {
      try {
         while(this.field3014 >= 100) {
            this.field3013.method898(2084948407);
            --this.field3014;
         }

         this.field3013.method897(var1, -332995145);
         ++this.field3014;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aii.az(" + ')');
      }
   }

   synchronized void method1809(int var1) {
      try {
         this.field3018 = true;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aii.ap(" + ')');
      }
   }

   synchronized void method1810(boolean var1, int var2) {
      try {
         this.field3010 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aii.af(" + ')');
      }
   }

   int method6528() {
      return 1;
   }

   class298 method6530() {
      return null;
   }

   class298 method6529() {
      return null;
   }

   static final void method1811(int var0) {
      try {
         for(int var1 = 0; var1 < class730.field2684; ++var1) {
            int var2 = class730.field2680[var1];
            class437 var3 = (class437)class730.field2677.method2942((long)var2);
            if (var3 != null) {
               Npc var4 = (Npc)var3.field7515;
               class232.method4664(var4, false, -2088974966);
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aii.hj(" + ')');
      }
   }

   synchronized double method1812(int var1) {
      try {
         if (this.field3014 < 1) {
            return -1.0D;
         } else {
            class784 var2 = (class784)this.field3013.method901(1766612795);
            return var2 == null ? -1.0D : var2.field3952 - (double)((float)var2.field3953[0].length / (float)class752.field4179);
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aii.as(" + ')');
      }
   }

   public static int method1813(Random var0, int var1, byte var2) {
      try {
         if (var1 <= 0) {
            throw new IllegalArgumentException();
         } else if (class51.method1530(var1, 1882495908)) {
            return (int)(((long)var0.nextInt() & 4294967295L) * (long)var1 >> 32);
         } else {
            int var3 = Integer.MIN_VALUE - (int)(4294967296L % (long)var1);

            int var4;
            do {
               var4 = var0.nextInt();
            } while(var4 >= var3);

            if (var2 == 0) {
               throw new IllegalStateException();
            } else {
               return class138.method994(var4, var1, 1573613656);
            }
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aii.q(" + ')');
      }
   }

   synchronized void method1814(byte var1) {
      try {
         class784 var2 = this.method1807(753213382);
         if (var2 != null) {
            var2.method545(-1460969981);
            this.field3015 = 0;
            --this.field3014;
            field3012.method2120(var2.method2475(-1380728898), var2, (byte)98);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aii.ai(" + ')');
      }
   }

   class977(int var1) {
      this.field3016 = var1;
   }

   public static void method1815(Canvas var0, short var1) {
      try {
         try {
            Class var2 = Canvas.class;
            Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
            var3.invoke(var0, Boolean.TRUE);
         } catch (Exception var4) {
            ;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aii.ad(" + ')');
      }
   }

   static final void method1816(class744 var0, int var1) {
      try {
         if (var0.field3161[--var0.field3156] == 0) {
            var0.field3176 += var0.field3174[var0.field3176];
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aii.bk(" + ')');
      }
   }
}
