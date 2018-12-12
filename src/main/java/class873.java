public final class class873 {
   static int field9785;
   class846 field9786;
   public class846 field9787 = new class846();

   public void method5865(int var1) {
      try {
         while(true) {
            class846 var2 = this.field9787.field8726;
            if (var2 == this.field9787) {
               this.field9786 = null;
               return;
            }

            var2.method5122(-850214067);
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sm.p(" + ')');
      }
   }

   public void method5866(class846 var1, byte var2) {
      try {
         if (var1.field8725 != null) {
            var1.method5122(-850214067);
         }

         var1.field8725 = this.field9787.field8725;
         var1.field8726 = this.field9787;
         var1.field8725.field8726 = var1;
         var1.field8726.field8725 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sm.a(" + ')');
      }
   }

   public class846 method5867(int var1) {
      try {
         class846 var2 = this.field9786;
         if (var2 == this.field9787) {
            this.field9786 = null;
            return null;
         } else {
            this.field9786 = var2.field8726;
            return var2;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sm.b(" + ')');
      }
   }

   public int method5868(short var1) {
      try {
         int var2 = 0;

         for(class846 var3 = this.field9787.field8726; this.field9787 != var3; var3 = var3.field8726) {
            ++var2;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sm.i(" + ')');
      }
   }

   public class846 method5869(int var1) {
      try {
         class846 var2 = this.field9787.field8726;
         if (this.field9787 == var2) {
            this.field9786 = null;
            return null;
         } else {
            this.field9786 = var2.field8726;
            return var2;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sm.f(" + ')');
      }
   }

   public class873() {
      this.field9787.field8726 = this.field9787;
      this.field9787.field8725 = this.field9787;
   }

   static final void method5870(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (!class215.method3835(var0, (int[])null, -1216775650)) {
            if (-1 != var7) {
               Client.field2882[var7] = true;
            } else {
               for(int var9 = 0; var9 < 113; ++var9) {
                  Client.field2882[var9] = true;
               }
            }
         } else {
            class536.method2328(class382.field1410[var0].method887((byte)-87), -1, var1, var2, var3, var4, var5, var6, var7, var7 < 0, (byte)0);
         }

      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "sm.kt(" + ')');
      }
   }

   static final void method5871(class744 var0, int var1) {
      try {
         var0.field3162 -= -682569305;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sm.be(" + ')');
      }
   }
}
