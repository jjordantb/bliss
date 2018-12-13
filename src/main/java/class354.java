public class class354 {
   public static int[] field2130 = new int[]{7, 8, 9, 10, 11, 12, 13, 15};
   class422 field2131;
   short[] field2132;
   short[] field2133;
   short[] field2134;
   short[] field2135;
   int[] field2136 = new int[]{-1, -1, -1, -1, -1};
   public static int[] field2137 = new int[]{0, 1, 2, 3, 4, 5, 6, 14};
   int[] field2138;
   static int field2139;

   void method1446(InputStream var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               return;
            }

            this.method1447(var1, var3, (byte)2);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "fi.a(" + ')');
      }
   }

   void method1447(InputStream var1, int var2, byte var3) {
      try {
         if (var2 == 1) {
            var1.method6371();
         } else {
            int var4;
            int var5;
            if (var2 == 2) {
               var4 = var1.method6371();
               this.field2138 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field2138[var5] = var1.method6423(1235052657);
               }
            } else if (3 == var2) {
               if (var3 != 2) {
                  return;
               }
            } else if (40 == var2) {
               var4 = var1.method6371();
               this.field2132 = new short[var4];
               this.field2133 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field2132[var5] = (short)var1.method6374();
                  this.field2133[var5] = (short)var1.method6374();
               }
            } else if (var2 == 41) {
               var4 = var1.method6371();
               this.field2134 = new short[var4];
               this.field2135 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field2134[var5] = (short)var1.method6374();
                  this.field2135[var5] = (short)var1.method6374();
               }
            } else if (var2 >= 60 && var2 < 70) {
               this.field2136[var2 - 60] = var1.method6423(1235052657);
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "fi.f(" + ')');
      }
   }

   public class25 method1448(byte var1) {
      try {
         if (this.field2138 == null) {
            return null;
         } else {
            class25[] var2 = new class25[this.field2138.length];
            class180 var3 = this.field2131.field9601;
            int var4;
            synchronized(this.field2131.field9601) {
               var4 = 0;

               while(true) {
                  if (var4 >= this.field2138.length) {
                     break;
                  }

                  var2[var4] = class25.method3454(this.field2131.field9601, this.field2138[var4], 0);
                  ++var4;
               }
            }

            for(int var7 = 0; var7 < this.field2138.length; ++var7) {
               if (var2[var7].field6462 < 13) {
                  var2[var7].method3458(2);
               }
            }

            class25 var8;
            if (1 == var2.length) {
               var8 = var2[0];
            } else {
               var8 = new class25(var2, var2.length);
            }

            if (var8 == null) {
               return null;
            } else {
               if (this.field2132 != null) {
                  for(var4 = 0; var4 < this.field2132.length; ++var4) {
                     var8.method3459(this.field2132[var4], this.field2133[var4]);
                  }
               }

               if (this.field2134 != null) {
                  for(var4 = 0; var4 < this.field2134.length; ++var4) {
                     var8.method3455(this.field2134[var4], this.field2135[var4]);
                  }
               }

               return var8;
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "fi.p(" + ')');
      }
   }

   public boolean method1449(int var1) {
      try {
         boolean var2 = true;
         class180 var3 = this.field2131.field9601;
         synchronized(this.field2131.field9601) {
            for(int var4 = 0; var4 < 5; ++var4) {
               if (-1 != this.field2136[var4] && !this.field2131.field9601.method3260(this.field2136[var4], 0, -1795823627)) {
                  var2 = false;
               }
            }

            return var2;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "fi.i(" + ')');
      }
   }

   public class25 method1450(int var1) {
      try {
         class25[] var2 = new class25[5];
         int var3 = 0;
         class180 var4 = this.field2131.field9601;
         int var5;
         synchronized(this.field2131.field9601) {
            var5 = 0;

            while(true) {
               if (var5 >= 5) {
                  break;
               }

               if (this.field2136[var5] != -1) {
                  var2[var3++] = class25.method3454(this.field2131.field9601, this.field2136[var5], 0);
               }

               ++var5;
            }
         }

         for(int var8 = 0; var8 < 5; ++var8) {
            if (var2[var8] != null && var2[var8].field6462 < 13) {
               var2[var8].method3458(2);
            }
         }

         class25 var9 = new class25(var2, var3);
         if (this.field2132 != null) {
            for(var5 = 0; var5 < this.field2132.length; ++var5) {
               var9.method3459(this.field2132[var5], this.field2133[var5]);
            }
         }

         if (this.field2134 != null) {
            for(var5 = 0; var5 < this.field2134.length; ++var5) {
               var9.method3455(this.field2134[var5], this.field2135[var5]);
            }
         }

         return var9;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "fi.k(" + ')');
      }
   }

   public boolean method1451(int var1) {
      try {
         if (this.field2138 == null) {
            return true;
         } else {
            boolean var2 = true;
            class180 var3 = this.field2131.field9601;
            synchronized(this.field2131.field9601) {
               for(int var4 = 0; var4 < this.field2138.length; ++var4) {
                  if (!this.field2131.field9601.method3260(this.field2138[var4], 0, -1755601406)) {
                     var2 = false;
                  }
               }

               return var2;
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "fi.b(" + ')');
      }
   }

   static final void method1452(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)36);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class362.method1506(var3, var4, var0, (byte)-37);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fi.nc(" + ')');
      }
   }

   static final void method1453(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (class382.widgetContainers[var2] == null) {
            var0.field3157[++var0.field3158 - 1] = "";
         } else {
            String var3 = class382.widgetContainers[var2].widgetsCopy[0].field984;
            if (var3 == null) {
               var0.field3157[++var0.field3158 - 1] = "";
            } else {
               var0.field3157[++var0.field3158 - 1] = var3.substring(0, var3.indexOf(58));
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "fi.aly(" + ')');
      }
   }

   static void method1454(byte var0) {
      try {
         class1 var1 = class759.field4330;
         synchronized(class759.field4330) {
            class759.field4330.method2979();
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fi.i(" + ')');
      }
   }

   public static void method1455(int var0) {
      try {
         class978.field3128.method3578(-1793011066);
         class978.field3124.method3578(-437755640);
         class978.field3126 = -1L;
         class978.field3125 = true;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "fi.b(" + ')');
      }
   }
}
