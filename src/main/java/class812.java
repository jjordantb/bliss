public class class812 {
   class180 field4639;
   class180 field4640;
   class1 field4641 = new class1(2);
   class1 field4642 = new class1(64);
   public static class180 field4643;

   public void method2910(byte var1) {
      try {
         class1 var2 = this.field4642;
         synchronized(this.field4642) {
            this.field4642.method2977();
         }

         var2 = this.field4641;
         synchronized(this.field4641) {
            this.field4641.method2977();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "uf.f(" + ')');
      }
   }

   public class447 method2911(int var1, int var2) {
      try {
         class1 var3 = this.field4642;
         class447 var4;
         synchronized(this.field4642) {
            var4 = (class447)this.field4642.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field4639;
            byte[] var10;
            synchronized(this.field4639) {
               var10 = this.field4639.method3285(-1006924897 * class981.field3249.field3271, var1, (byte)-68);
            }

            var4 = new class447();
            var4.field7624 = this;
            if (var10 != null) {
               var4.method4315(new class907(var10), 1638036980);
            }

            class1 var11 = this.field4642;
            synchronized(this.field4642) {
               this.field4642.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "uf.a(" + ')');
      }
   }

   public void method2912(short var1) {
      try {
         class1 var2 = this.field4642;
         synchronized(this.field4642) {
            this.field4642.method2979();
         }

         var2 = this.field4641;
         synchronized(this.field4641) {
            this.field4641.method2979();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "uf.p(" + ')');
      }
   }

   public void method2913(int var1, byte var2) {
      try {
         class1 var3 = this.field4642;
         synchronized(this.field4642) {
            this.field4642.method2976(var1, 677676972);
         }

         var3 = this.field4641;
         synchronized(this.field4641) {
            this.field4641.method2976(var1, -452140449);
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "uf.b(" + ')');
      }
   }

   public class812(class469 var1, class423 var2, class180 var3, class180 var4) {
      this.field4639 = var3;
      this.field4640 = var4;
      this.field4639.method3286(class981.field3249.field3271 * -1006924897, -1015661848);
   }

   static final void method2914(long var0) {
      try {
         class32 var2 = class923.field10295.method1511().field7637;
         int var3 = 1734240325 * Client.field2798 + (int)var2.field5296;
         int var4 = Client.field2723 * 1874511679 + (int)var2.field5299;
         if (class456.field7163 * 1103750049 - var3 < -2000 || class456.field7163 * 1103750049 - var3 > 2000 || class530.field3741 * 1346160791 - var4 < -2000 || class530.field3741 * 1346160791 - var4 > 2000) {
            class456.field7163 = var3 * -1832337311;
            class530.field3741 = 1831024423 * var4;
         }

         int var5;
         int var6;
         if (class456.field7163 * 1103750049 != var3) {
            var5 = var3 - class456.field7163 * 1103750049;
            var6 = (int)((long)var5 * var0 / 320L);
            if (var5 > 0) {
               if (var6 == 0) {
                  var6 = 1;
               } else if (var6 > var5) {
                  var6 = var5;
               }
            } else if (var6 == 0) {
               var6 = -1;
            } else if (var6 < var5) {
               var6 = var5;
            }

            class456.field7163 += var6 * -1832337311;
         }

         if (1346160791 * class530.field3741 != var4) {
            var5 = var4 - class530.field3741 * 1346160791;
            var6 = (int)(var0 * (long)var5 / 320L);
            if (var5 > 0) {
               if (var6 == 0) {
                  var6 = 1;
               } else if (var6 > var5) {
                  var6 = var5;
               }
            } else if (var6 == 0) {
               var6 = -1;
            } else if (var6 < var5) {
               var6 = var5;
            }

            class530.field3741 += 1831024423 * var6;
         }

         Client.field2931 += (float)var0 * Client.field2740 / 6.0F;
         Client.field2738 += Client.field2741 * (float)var0 / 6.0F;
         class819.method2938((byte)116);
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "uf.hx(" + ')');
      }
   }

   public static class971[] method2915(byte var0) {
      try {
         return new class971[]{class971.field2986, class971.field2985, class971.field2984};
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "uf.a(" + ')');
      }
   }

   static final void method2916(class564 var0, class744 var1, int var2) {
      try {
         int var3 = var1.field3161[(var1.field3156 -= -391880689) * 681479919];
         int var4 = var1.field3161[(var1.field3156 -= -391880689) * 681479919] - 1;
         if (6 != 1548853569 * var0.field909 && var0.field909 * 1548853569 != 2) {
            throw new RuntimeException("");
         } else {
            class401 var5 = class258.field7913.method12(var0.field876 * 572201537, -834875221);
            if (var0.field1032 == null) {
               var0.field1032 = new class692(var5, 6 == 1548853569 * var0.field909);
            }

            var0.field1032.field7133 = class390.method3422(1998848813) * 3177550440302969639L;
            if (var5.field9890 != null && var4 >= 0 && var4 < var5.field9890.length) {
               var0.field1032.field7130[var4] = (short)var3;
               class814.method2932(var0, -548507081);
            } else {
               throw new RuntimeException("");
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "uf.ql(" + ')');
      }
   }

   static void method2917(int var0, int var1, int var2) {
      try {
         class682 var3 = class370.method881(7, (long)var0);
         var3.method4340((byte)50);
         var3.field7687 = var1 * 1274450087;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "uf.ap(" + ')');
      }
   }
}
