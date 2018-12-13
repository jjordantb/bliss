public class class115 {
   class829[] field1694;
   class648 field1695;
   NodeTable field1696;

   public class829 method1267(String var1, int var2) {
      try {
         long var3 = this.field1695.method5549(var1, (byte)93);

         for(class829 var5 = (class829)this.field1696.method2942(var3); var5 != null; var5 = (class829)this.field1696.method2943(-1712985598)) {
            if (var5.field9041.equals(var1)) {
               return var5;
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "es.f(" + ')');
      }
   }

   void method1268(int var1, int var2) {
      try {
         class829 var3 = this.method1270(var1, (byte)-123);
         if (var3 != null) {
            var3.method545(-1460969981);
            this.field1694[var3.field9040] = null;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "es.b(" + ')');
      }
   }

   public void method1269(int var1, String var2, class829 var3, int var4) {
      try {
         class829 var5 = this.method1267(var2, -1827449503);
         if (var5 != null && var1 != var5.field9040) {
            throw new IllegalArgumentException(var2);
         } else {
            this.method1268(var1, -1882252920);
            if (var1 >= this.field1694.length) {
               int var6;
               for(var6 = this.field1694.length; var1 >= var6; var6 += var6) {
                  ;
               }

               this.field1696 = new NodeTable(var6);

               for(int var7 = 0; var7 < this.field1694.length; ++var7) {
                  class829 var8 = this.field1694[var7];
                  if (var8 != null) {
                     this.field1696.method2947(var8, var8.field641);
                  }
               }

               class829[] var10 = new class829[var6];

               for(int var11 = 0; var11 < this.field1694.length; ++var11) {
                  var10[var11] = this.field1694[var11];
               }

               this.field1694 = var10;
            }

            var3.field9040 = var1;
            var3.field9041 = var2;
            this.field1696.method2947(var3, this.field1695.method5549(var2, (byte)-48));
            this.field1694[var1] = var3;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "es.p(" + ')');
      }
   }

   public class115(int var1, class648 var2) {
      int var3;
      for(var3 = 1; var3 < var1; var3 += var3) {
         ;
      }

      this.field1696 = new NodeTable(var3);
      this.field1694 = new class829[var3];
      this.field1695 = var2;
   }

   public class829 method1270(int var1, byte var2) {
      try {
         return var1 >= this.field1694.length ? null : this.field1694[var1];
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "es.a(" + ')');
      }
   }

   public static void method1271(int var0) {
      try {
         class481.method4694();
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "es.f(" + ')');
      }
   }

   public static void method1272(class811 var0, int var1, byte var2) {
      try {
         var1 = var1 * class615.field8903.field9150.method2717(-2144031703) >> 8;
         if (var0 == null) {
            class809.method2888((byte)-122);
         } else {
            class457.method3841(var0, var1, -391880689);
            class880.method6176((short)-1817);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "es.e(" + ')');
      }
   }

   static final void method1273(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         var0.field3157[++var0.field3158 - 1] = var3.text;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "es.pf(" + ')');
      }
   }

   static final void method1274(Actor var0, int var1) {
      try {
         if (var0.field4056 != null || var0.field4049 != null) {
            boolean var2 = true;
            class389 var3 = class730.field2697.method5270(681479919);

            for(int var4 = 0; var4 < var0.field4056.length; ++var4) {
               int var5 = -1;
               if (var0.field4056 != null) {
                  var5 = var0.field4056[var4];
               }

               if (-1 == var5) {
                  if (!var0.method2545(var4, -1, (byte)65)) {
                     var2 = false;
                  }
               } else {
                  var2 = false;
                  boolean var6 = false;
                  boolean var7 = false;
                  class32 var8 = var0.method1511().field7637;
                  int var9;
                  int var12;
                  int var13;
                  if (-1073741824 == (var5 & -1073741824)) {
                     var9 = var5 & 268435455;
                     int var10 = var9 >> 14;
                     int var11 = var9 & 16383;
                     var12 = (int)var8.field5296 - (256 + 512 * (var10 - var3.field1521));
                     var13 = (int)var8.field5299 - (256 + (var11 - var3.field1522) * 512);
                  } else {
                     class32 var18;
                     if ((var5 & '耀') != 0) {
                        var9 = var5 & 32767;
                        Player var16 = class730.loaded[var9];
                        if (var16 == null) {
                           var0.method2545(var4, -1, (byte)16);
                           continue;
                        }

                        var18 = var16.method1511().field7637;
                        var12 = (int)var8.field5296 - (int)var18.field5296;
                        var13 = (int)var8.field5299 - (int)var18.field5299;
                     } else {
                        class437 var15 = (class437)class730.field2677.method2942((long)var5);
                        if (var15 == null) {
                           var0.method2545(var4, -1, (byte)65);
                           continue;
                        }

                        Npc var17 = (Npc)var15.field7515;
                        var18 = var17.method1511().field7637;
                        var12 = (int)var8.field5296 - (int)var18.field5296;
                        var13 = (int)var8.field5299 - (int)var18.field5299;
                     }
                  }

                  if (var12 != 0 || var13 != 0) {
                     var0.method2545(var4, (int)(Math.atan2((double)var12, (double)var13) * 2607.5945876176133D) & 16383, (byte)21);
                  }
               }
            }

            if (var2) {
               var0.field4056 = null;
               var0.field4049 = null;
            }
         }

      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "es.hw(" + ')');
      }
   }

   static final void method1275(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
      try {
         var2.field3156 -= 4;
         var0.field1011 = var2.field3161[var2.field3156];
         var0.field884 = var2.field3161[1 + var2.field3156];
         int var4 = var2.field3161[var2.field3156 + 2];
         if (var4 < 0) {
            var4 = 0;
         } else if (var4 > 5) {
            var4 = 5;
         }

         int var5 = var2.field3161[var2.field3156 + 3];
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 5) {
            var5 = 5;
         }

         var0.field871 = (byte)var4;
         var0.field872 = (byte)var5;
         class814.method2932(var0, -1806072234);
         Animator.method2801(var1, var0, -1959938301);
         if (var0.field869 == 0) {
            class948.method1938(var1, var0, false, 112223880);
         }

         if (var0.field879 == -1 && !var1.closed) {
            class649.method5546(var0.field867, 1058352947);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "es.cy(" + ')');
      }
   }

   public static void method1276(int var0) {
      try {
         class615.field8903.method5391(class615.field8903.field9130, 2, 1364189431);
         class615.field8903.method5391(class615.field8903.field9131, 2, 1428932926);
         class615.field8903.method5391(class615.field8903.field9113, 1, -398332874);
         class615.field8903.method5391(class615.field8903.field9139, 1, 401268670);
         class615.field8903.method5391(class615.field8903.field9135, 1, -225463890);
         class615.field8903.method5391(class615.field8903.field9121, 1, -1836206886);
         class615.field8903.method5391(class615.field8903.field9127, 1, 370627212);
         class615.field8903.method5391(class615.field8903.field9123, 1, -408534755);
         class615.field8903.method5391(class615.field8903.field9147, 2, 902985868);
         class615.field8903.method5391(class615.field8903.field9126, 1, -598361107);
         class615.field8903.method5391(class615.field8903.field9138, 2, -1383392801);
         class615.field8903.method5391(class615.field8903.field9122, 1, -906948807);
         class615.field8903.method5391(class615.field8903.field9115, 0, -33681458);
         class615.field8903.method5391(class615.field8903.field9116, 0, 1421186288);
         class615.field8903.method5391(class615.field8903.field9129, 2, 540542372);
         class615.field8903.method5391(class615.field8903.field9124, class157.field6552.field6556, -1761179616);
         class615.field8903.method5391(class615.field8903.field9117, 0, -224292435);
         class615.field8903.method5391(class615.field8903.field9133, 1, -1095753213);
         class308.method382(1113089752);
         class615.field8903.method5391(class615.field8903.field9132, 0, -255450456);
         class615.field8903.method5391(class615.field8903.field9142, 4, -1503000193);
         class362.method1508(1109876610);
         class730.field2697.method5282((byte)54).method5673(286817156);
         class730.field2657 = true;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "es.d(" + ')');
      }
   }

   static final void method1277(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class679.method4270(var3, var4, var0, 377927410);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "es.lq(" + ')');
      }
   }
}
