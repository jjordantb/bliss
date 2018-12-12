public class class385 {
   public int field1541 = -1;
   public int[] field1542;
   public static int field1543 = 0;
   static int field1544 = 2;
   public int field1545 = -1;
   public static int field1546 = 1;
   public int[] field1547;
   public int[] field1548;

   public class385(class180 var1) {
      byte[] var2 = var1.method3264(class590.field1582.field1585, (byte)105);
      this.method1178(new InputStream(var2), 1286712749);
      if (this.field1542 == null) {
         throw new RuntimeException("");
      }
   }

   void method1178(InputStream var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               if (var2 == 773233530) {
                  throw new IllegalStateException();
               }

               return;
            }

            int var4;
            if (1 == var3) {
               var4 = var1.method6371();
               this.field1542 = new int[var4];

               for(int var5 = 0; var5 < this.field1542.length; ++var5) {
                  this.field1542[var5] = var1.method6371();
                  if (this.field1542[var5] == 0) {
                     if (var2 == 773233530) {
                        return;
                     }
                  } else if (2 == this.field1542[var5]) {
                     ;
                  }
               }
            } else if (3 == var3) {
               this.field1541 = var1.method6371();
            } else if (4 == var3) {
               this.field1545 = var1.method6371();
            } else if (5 == var3) {
               this.field1547 = new int[var1.method6371()];

               for(var4 = 0; var4 < this.field1547.length; ++var4) {
                  this.field1547[var4] = var1.method6371();
               }
            } else if (6 == var3) {
               this.field1548 = new int[var1.method6371()];

               for(var4 = 0; var4 < this.field1548.length; ++var4) {
                  this.field1548[var4] = var1.method6371();
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "qv.a(" + ')');
      }
   }

   static final void method1179(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class730.field2783 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qv.uq(" + ')');
      }
   }

   public static void method1180(class45 var0, short var1) {
      try {
         if (var0.field5118 != null) {
            class56.field2321.method3875(var0.field5118);
         } else {
            var0.field5111 = Integer.MIN_VALUE;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qv.j(" + ')');
      }
   }

   static final void method1181(int var0) {
      try {
         class76.method1109(class593.field1623, (long)class730.field2866);
         if (class730.field2822 != -1) {
            class758.method2735(class730.field2822, 186134073);
         }

         int var1;
         for(var1 = 0; var1 < class730.field2667; ++var1) {
            class730.field2883[var1] = class730.field2882[var1];
            class730.field2882[var1] = false;
         }

         class730.field2814 = class730.field2866;
         if (-1 != class730.field2822) {
            class730.field2667 = 0;
            class154.method3488(-710389872);
         }

         class593.field1623.method4827();
         class972.method1777(class593.field1623, (byte)74);
         var1 = class915.method6441(-185727929);
         if (-1 == var1) {
            var1 = class730.field2919;
         }

         if (-1 == var1) {
            var1 = class730.field2813;
         }

         class779.method2323(var1, 614001892);
         class730.field2943 = 0;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "qv.ig(" + ')');
      }
   }

   static void method1182(class744 var0, int var1) {
      try {
         var0.field3161[var0.field3156 - 1] = class735.field3009.method4224(var0.field3161[var0.field3156 - 1], 245040087).field8983;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qv.r(" + ')');
      }
   }
}
