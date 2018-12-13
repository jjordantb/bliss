import java.awt.Point;

public class class587 {
   public boolean field211 = false;
   int field212;
   int field213;
   int[][][] field214;
   class630[] field215;
   int field216 = 0;
   int field217 = -1;
   class599 field218 = new class599();
   static class630 field219 = new class630(0, 0);

   final void method160(int var1) {
      try {
         for(int var2 = 0; var2 < this.field213; ++var2) {
            this.field214[var2][0] = null;
            this.field214[var2][1] = null;
            this.field214[var2][2] = null;
            this.field214[var2] = null;
         }

         this.field215 = null;
         this.field214 = null;
         this.field218.method1286(-1888417482);
         this.field218 = null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ka.a(" + ')');
      }
   }

   class587(int var1, int var2, int var3) {
      this.field212 = var2;
      this.field213 = var1;
      this.field214 = new int[this.field213][3][var3];
      this.field215 = new class630[this.field212];
   }

   public final int[][][] method161(byte var1) {
      try {
         if (this.field213 != this.field212) {
            throw new RuntimeException();
         } else {
            for(int var2 = 0; var2 < this.field213; ++var2) {
               this.field215[var2] = field219;
            }

            return this.field214;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ka.b(" + ')');
      }
   }

   public final int[][] method162(int var1, byte var2) {
      try {
         if (this.field212 != this.field213) {
            if (this.field213 != 1) {
               class630 var3 = this.field215[var1];
               if (var3 == null) {
                  this.field211 = true;
                  if (this.field216 >= this.field213) {
                     class630 var4 = (class630)this.field218.method1278(-1469951766);
                     var3 = new class630(var1, var4.field9805);
                     this.field215[var4.field9804] = null;
                     var4.method545(-1460969981);
                  } else {
                     var3 = new class630(var1, this.field216);
                     ++this.field216;
                  }

                  this.field215[var1] = var3;
               } else {
                  this.field211 = false;
               }

               this.field218.method1279(var3, -726505062);
               return this.field214[var3.field9805];
            } else {
               this.field211 = var1 != this.field217;
               this.field217 = var1;
               return this.field214[0];
            }
         } else {
            this.field211 = this.field215[var1] == null;
            this.field215[var1] = field219;
            return this.field214[var1];
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ka.f(" + ')');
      }
   }

   static void method163(class744 var0, int var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         class785 var4 = class452.field7216.method5148(var3, 1588900320);
         if (var4.method2380(1883696427)) {
            String var5 = var4.field3823;
            if (-1 == var2) {
               var0.field3157[++var0.field3158 - 1] = var5;
            } else {
               var0.field3157[++var0.field3158 - 1] = class735.field3009.method4224(var2, 245040087).method5333(var3, var5, 1005518410);
            }
         } else {
            int var7 = var4.field3822;
            if (var2 == -1) {
               var0.field3161[++var0.field3156 - 1] = var7;
            } else {
               var0.field3161[++var0.field3156 - 1] = class735.field3009.method4224(var2, 245040087).method5331(var3, var7, (byte)-64);
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ka.o(" + ')');
      }
   }

   public static void method164(int var0, int var1, byte var2) {
      try {
         class956.method2113(var0, var1, -1278555731);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ka.l(" + ')');
      }
   }

   public static void method165(int var0, int var1) {
      try {
         if (var0 == 37) {
            class491.field7809 = 3.0F;
         } else if (50 == var0) {
            class491.field7809 = 4.0F;
         } else if (var0 == 75) {
            class491.field7809 = 6.0F;
         } else if (100 == var0) {
            class491.field7809 = 8.0F;
         } else if (200 == var0) {
            class491.field7809 = 16.0F;
         }

         class740.field3201 = -1;
         class740.field3201 = -1;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ka.cw(" + ')');
      }
   }

   static final void method166(Widget var0, class744 var1, byte var2) {
      try {
         class230 var3 = var0.method823(class785.field3827, class730.field2681, (byte)-46);
         int var4 = var1.field3161[--var1.field3156];
         Point var5 = var3.method4604(var0.text, var0.field881, var0.field916, var4, class324.field621, 946663112);
         var1.field3161[++var1.field3156 - 1] = var5.x * 2113899933;
         var1.field3161[++var1.field3156 - 1] = var5.y * -1537929791;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ka.qr(" + ')');
      }
   }

   public static class45 method167(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         if (class615.field8903.field9119.method2717(-2141800162) != 0 && var1 != 0 && class540.field3926 < 50 && -1 != var0) {
            class45 var6 = new class45((byte)1, var0, var1, var2, var3, 0, var4, (Interactable)null);
            class540.field3927[++class540.field3926 - 1] = var6;
            return var6;
         } else {
            return null;
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "ka.n(" + ')');
      }
   }
}
