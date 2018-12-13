public class class86 implements class893 {
   int field1131;
   int field1132;
   float[] field1133;
   public static class734 field1134;

   public void method2755() {
   }

   public int method2344() {
      try {
         return this.field1132;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "am.f(" + ')');
      }
   }

   public int method2343() {
      try {
         return this.field1131;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "am.a(" + ')');
      }
   }

   class86(int var1, int var2) {
      this.field1131 = var1;
      this.field1132 = var2;
      this.field1133 = new float[this.field1132 * this.field1131];
   }

   static void method943(class848 var0, int var1, int var2, Widget var3, int var4) {
      try {
         byte var5 = 63;
         byte var6 = 7;

         for(int var7 = 63; var7 >= 0; --var7) {
            int var8 = (var7 & 63) << 10 | (var6 & 7) << 7 | var5 & 127;
            class771.method2300(false, true, -162450455);
            int var9 = class134.field1398[var8];
            class82.method919(false, true, (short)10143);
            var0.method4984(var1, ((63 - var7) * var3.field887 >> 6) + var2, var3.field881, 1 + (var3.field887 >> 6), var9, 0);
         }

      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "am.a(" + ')');
      }
   }

   static final void method944(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         class587.method166(var3, var0, (byte)24);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "am.qz(" + ')');
      }
   }

   static final void method945(class744 var0, int var1) {
      try {
         class684 var2 = class423.method5712((short)512);
         class701 var3 = class637.method5936(class643.field10016, var2.field7765, (byte)21);
         var3.field3364.method6361(0);
         int var4 = var3.field3364.field10376;
         var3.field3364.method6361(3);
         var3.field3364.method6362(var0.field3160.field6482, 16711935);
         var0.field3160.field6483.method6656(var3.field3364, var0.field3160.field6484, 1205733536);
         var3.field3364.method6426(var3.field3364.field10376 - var4, (byte)-42);
         var2.method4380(var3, (byte)-84);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "am.adu(" + ')');
      }
   }

   static final void method946(class744 var0, int var1) {
      try {
         String var2 = null;
         if (class285.field10627 != null) {
            var2 = class285.field10627.method95(-161430345);
         }

         if (var2 == null) {
            var2 = "";
         }

         var0.field3157[++var0.field3158 - 1] = var2;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "am.amr(" + ')');
      }
   }

   static final void method947(class744 var0, int var1) {
      try {
         class846.method5123((short)31086);
         class730.field2697.method5309(1321707085);
         class95.method523(656179282);
         class730.field2647 = false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "am.amb(" + ')');
      }
   }

   static final void method948(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
      try {
         int var4 = var2.field3161[--var2.field3156];
         if (var4 != var0.field900) {
            var0.field900 = var4;
            class814.method2932(var0, -668406254);
         }

         if (var0.field879 == -1 && !var1.closed) {
            class191.method3724(var0.field867, 1038434674);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "am.da(" + ')');
      }
   }

   public static final void method949(String var0, boolean var1, short var2) {
      try {
         if (var0 != null) {
            if (class730.field2934 >= 100) {
               class727.method1683(4, class814.field4798.method2927(class321.field1066, -875414210), (byte)-66);
            } else {
               String var3 = class526.method2229(var0, 150647374);
               if (var3 != null) {
                  int var4;
                  String var5;
                  String var6;
                  for(var4 = 0; var4 < class730.field2934; ++var4) {
                     var5 = class526.method2229(class730.field2841[var4], 1138876802);
                     if (var5 != null && var5.equals(var3)) {
                        class727.method1683(4, var0 + class814.field4799.method2927(class321.field1066, -875414210), (byte)-117);
                        return;
                     }

                     if (class730.field2937[var4] != null) {
                        var6 = class526.method2229(class730.field2937[var4], 1588040861);
                        if (var6 != null && var6.equals(var3)) {
                           class727.method1683(4, var0 + class814.field4799.method2927(class321.field1066, -875414210), (byte)-12);
                           return;
                        }
                     }
                  }

                  for(var4 = 0; var4 < class730.field2923; ++var4) {
                     var5 = class526.method2229(class730.field2685[var4], -916859931);
                     if (var5 != null && var5.equals(var3)) {
                        class727.method1683(4, class814.field4805.method2927(class321.field1066, -875414210) + var0 + class814.field4806.method2927(class321.field1066, -875414210), (byte)-7);
                        return;
                     }

                     if (class730.field2927[var4] != null) {
                        var6 = class526.method2229(class730.field2927[var4], 671636487);
                        if (var6 != null && var6.equals(var3)) {
                           class727.method1683(4, class814.field4805.method2927(class321.field1066, -875414210) + var0 + class814.field4806.method2927(class321.field1066, -875414210), (byte)-26);
                           return;
                        }
                     }
                  }

                  if (class526.method2229(class923.local.field3374, 675816100).equals(var3)) {
                     class727.method1683(4, class814.field4711.method2927(class321.field1066, -875414210), (byte)-86);
                  } else {
                     class684 var8 = class423.method5712((short)512);
                     class701 var9 = class637.method5936(class643.field9934, var8.field7765, (byte)110);
                     var9.field3364.method6361(class305.method372(var0, 1022662846) + 1);
                     var9.field3364.method6366(var0, 2142299789);
                     var9.field3364.method6361(var1 ? 1 : 0);
                     var8.method4380(var9, (byte)-1);
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "am.mt(" + ')');
      }
   }

   static final void method950(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class905.method6346(var3, var4, var0, -653692022);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "am.nz(" + ')');
      }
   }

   static final void method951(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class730.field2817 ? 1 : 0;
         var0.field3157[++var0.field3158 - 1] = class730.field2735 == null ? "" : class730.field2735;
         var0.field3157[++var0.field3158 - 1] = class730.field2820 == null ? "" : class730.field2820;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "am.vt(" + ')');
      }
   }
}
