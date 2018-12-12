import java.util.Iterator;

public abstract class class14 {
   int field6688 = -1;
   class373 field6689 = new class373();
   long field6690 = -1L;
   long field6691 = -1L;
   int field6692 = -1;
   public static int[] field6693;

   void method3578(int var1) {
      try {
         this.field6689.method905((byte)1);
         this.field6691 = -1L;
         this.field6690 = -1L;
         this.field6688 = -1;
         this.field6692 = -1;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "po.f(" + ')');
      }
   }

   int method3579(class284 var1, int var2, byte var3) {
      try {
         long var4;
         if (-1L == this.field6691) {
            var4 = (long)var2;
         } else {
            var4 = var1.method6669((byte)97) - this.field6691;
            if (var4 > (long)var2) {
               var4 = (long)var2;
            }
         }

         this.field6691 = var1.method6669((byte)19);
         return (int)var4;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "po.p(" + ')');
      }
   }

   abstract int method3580(int var1);

   abstract void method3581(InputStream var1, class284 var2, byte var3);

   abstract void method3582(byte var1);

   abstract boolean method3583(int var1);

   void method3584(class284 var1, int var2) {
      try {
         this.field6689.method897(var1, 357494730);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "po.b(" + ')');
      }
   }

   void method3590(int var1) {
      try {
         if (this.method3583(-304373014)) {
            class701 var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            Iterator var6 = this.field6689.iterator();

            label107:
            while(true) {
               while(true) {
                  if (!var6.hasNext()) {
                     break label107;
                  }

                  class284 var7 = (class284)var6.next();
                  if (var2 != null && var2.field3364.field10376 - var3 >= 252 - (6 + this.method3580(-1861387813))) {
                     if (var1 <= 775068819) {
                        throw new IllegalStateException();
                     }
                     break label107;
                  }

                  var7.method545(-1460969981);
                  int var8 = var7.method6680(-1730629098);
                  if (var8 < -1) {
                     var8 = -1;
                  } else if (var8 > 65534) {
                     var8 = 65534;
                  }

                  int var9 = var7.method6667((byte)55);
                  if (var9 < -1) {
                     var9 = -1;
                  } else if (var9 > 65534) {
                     var9 = 65534;
                  }

                  if (var9 == this.field6688 && this.field6692 == var8) {
                     var7.method6670(2126248838);
                  } else {
                     if (var2 == null) {
                        var2 = this.method3597((byte)-59);
                        var2.field3364.method6361(0);
                        var3 = var2.field3364.field10376;
                        var2.field3364.field10376 += 2;
                        var4 = 0;
                        var5 = 0;
                     }

                     int var10;
                     int var11;
                     int var12;
                     if (-1L != this.field6690) {
                        var10 = var9 - this.field6688;
                        var11 = var8 - this.field6692;
                        var12 = (int)((var7.method6669((byte)19) - this.field6690) / 20L);
                        var4 = (int)((long)var4 + (var7.method6669((byte)70) - this.field6690) % 20L);
                     } else {
                        var10 = var9;
                        var11 = var8;
                        var12 = Integer.MAX_VALUE;
                     }

                     this.field6688 = var9;
                     this.field6692 = var8;
                     if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                        var10 += 32;
                        var11 += 32;
                        var2.field3364.method6362(var11 + (var10 << 6) + (var12 << 12), 16711935);
                     } else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
                        var10 += 128;
                        var11 += 128;
                        var2.field3364.method6361(128 + var12);
                        var2.field3364.method6362((var10 << 8) + var11, 16711935);
                     } else if (var12 < 32) {
                        var2.field3364.method6361(var12 + 192);
                        if (-1 != var9 && -1 != var8) {
                           var2.field3364.method6364(var9 | var8 << 16, -1192850117);
                        } else {
                           var2.field3364.method6364(Integer.MIN_VALUE, -1667030496);
                        }
                     } else {
                        var2.field3364.method6362((var12 & 8191) + '\ue000', 16711935);
                        if (var9 != -1 && var8 != -1) {
                           var2.field3364.method6364(var9 | var8 << 16, 84476800);
                        } else {
                           var2.field3364.method6364(Integer.MIN_VALUE, -1243424394);
                        }
                     }

                     ++var5;
                     this.method3581(var2.field3364, var7, (byte)0);
                     this.field6690 = var7.method6669((byte)123);
                     var7.method6670(1701654239);
                  }
               }
            }

            if (var2 != null) {
               var2.field3364.method6426(var2.field3364.field10376 - var3, (byte)-33);
               int var14 = var2.field3364.field10376;
               var2.field3364.field10376 = var3;
               var2.field3364.method6361(var4 / var5);
               var2.field3364.method6361(var4 % var5);
               var2.field3364.field10376 = var14;
               class730.field2692.method4380(var2, (byte)-85);
            }
         }

         this.method3582((byte)1);
      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "po.a(" + ')');
      }
   }

   abstract class701 method3597(byte var1);

   static final void method3600(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3161[++var0.field3156 - 1] = (int)(Math.random() * (double)var2);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "po.yq(" + ')');
      }
   }

   static final void method3601(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = var0.field3154.field1161;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "po.xq(" + ')');
      }
   }

   static final void method3602(class744 var0, short var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class569.method10(var3, var4, var0, -533196439);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "po.eg(" + ')');
      }
   }
}
