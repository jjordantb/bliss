import java.util.HashMap;
import java.util.Map;

public class class500 {
   class180 field3130;
   class180 field3131;
   class1 field3132 = new class1(20);
   Map field3133 = null;
   int[] field3134;
   static int field3135;

   public int method1849(boolean var1, int var2) {
      try {
         if (this.field3134 == null) {
            return 0;
         } else if (!var1 && this.field3133 != null) {
            return this.field3134.length * 2;
         } else {
            int var3 = 0;

            for(int var4 = 0; var4 < this.field3134.length; ++var4) {
               int var5 = this.field3134[var4];
               if (this.field3130.method3280(var5, -457216440)) {
                  ++var3;
               }

               if (this.field3131.method3280(var5, -457216440)) {
                  ++var3;
               }
            }

            return var3;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ii.p(" + ')');
      }
   }

   public void method1850(int var1) {
      try {
         this.field3133 = null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ii.f(" + ')');
      }
   }

   public int method1851(int var1) {
      try {
         return this.method1849(false, -249350940);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ii.b(" + ')');
      }
   }

   public int method1852(int var1) {
      try {
         return this.field3134 == null ? 0 : this.field3134.length * 2;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ii.i(" + ')');
      }
   }

   public class230 method1853(class768 var1, int var2, int var3) {
      try {
         class486 var4 = this.method1859(var1, var2, true, true, -160012913);
         return var4 == null ? null : (class230)var4.field8555;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ii.d(" + ')');
      }
   }

   public void method1854(int var1) {
      try {
         this.field3132.method2977();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ii.x(" + ')');
      }
   }

   public void method1855(int var1, int var2) {
      try {
         this.field3132.method2976(var1, -19915416);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ii.r(" + ')');
      }
   }

   public void method1856(class768 var1, byte var2) {
      try {
         this.field3133 = new HashMap(this.field3134.length);

         for(int var3 = 0; var3 < this.field3134.length; ++var3) {
            int var4 = this.field3134[var3];
            class230 var5 = class213.method3814(this.field3131, var4, -227622319);
            byte[] var6 = this.field3130.method3264(var4, (byte)82);
            Object var7 = var1.method2233(var6, var5, true, -2012626904);
            this.field3133.put(var3, new class486(var7, var5));
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "ii.a(" + ')');
      }
   }

   public Object method1857(class768 var1, int var2, boolean var3, boolean var4, int var5) {
      try {
         class486 var6 = this.method1859(var1, var2, var3, var4, 229227815);
         return var6 == null ? null : var6.field8554;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "ii.k(" + ')');
      }
   }

   public void method1858(int var1) {
      try {
         this.field3132.method2979();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ii.q(" + ')');
      }
   }

   class486 method1859(class768 var1, int var2, boolean var3, boolean var4, int var5) {
      try {
         if (-1 == var2) {
            return null;
         } else {
            if (this.field3134 != null) {
               for(int var6 = 0; var6 < this.field3134.length; ++var6) {
                  if (var2 == this.field3134[var6]) {
                     return (class486)this.field3133.get(var6);
                  }
               }
            }

            class486 var10 = (class486)this.field3132.method2974((long)(var2 << 1 | (var4 ? 1 : 0)));
            if (var10 != null) {
               if (var3 && var10.field8555 == null) {
                  class230 var11 = class213.method3814(this.field3131, var2, -221293891);
                  if (var11 == null) {
                     return null;
                  }

                  var10.field8555 = var11;
               }

               return var10;
            } else {
               byte[] var7 = this.field3130.method3264(var2, (byte)54);
               if (var7 == null) {
                  return null;
               } else {
                  class230 var8 = class213.method3814(this.field3131, var2, 1718390038);
                  if (var8 == null) {
                     return null;
                  } else {
                     if (var3) {
                        var10 = new class486(var1.method2233(var7, var8, var4, -1761009560), var8);
                     } else {
                        var10 = new class486(var1.method2233(var7, var8, var4, -2090037397), (Object)null);
                     }

                     this.field3132.method2984(var10, (long)(var2 << 1 | (var4 ? 1 : 0)));
                     return var10;
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "ii.u(" + ')');
      }
   }

   public class500(class180 var1, class180 var2, int[] var3) {
      this.field3130 = var1;
      this.field3131 = var2;
      if (var3 != null) {
         this.field3134 = var3;
      } else {
         this.field3134 = null;
      }

   }

   static final void method1860(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = -1086526073 * var3.field987;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ii.px(" + ')');
      }
   }

   static final void method1861(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)71);
         class131 var4 = class382.field1410[var2 >> 16];
         class255.method4495(var3, var4, var0, (byte)102);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ii.od(" + ')');
      }
   }

   static void method1862(int var0, boolean var1, int var2) {
      try {
         class163 var3 = class213.method3812(var0, var1, 1277483186);
         if (var3 != null) {
            var3.method545(-1460969981);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ii.x(" + ')');
      }
   }
}
