public class class327 extends class345 {
   int field12 = -1;
   public String field13;
   public String field14;
   class373 field15;
   public int field16;
   public int field17;
   public int field18 = -1;
   public int field19 = 0;
   public int field20 = 0;
   boolean field21 = true;
   public int field22 = 12800;
   public int field23 = 12800;

   boolean method4(int var1, int var2, byte var3) {
      try {
         for(class542 var4 = (class542)this.field15.method901(1766612795); var4 != null; var4 = (class542)this.field15.method906(49146)) {
            if (var4.method2471(var1, var2, 2010350354)) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aiu.a(" + ')');
      }
   }

   public boolean method5(int var1, int var2, int[] var3, int var4) {
      try {
         for(class542 var5 = (class542)this.field15.method901(1766612795); var5 != null; var5 = (class542)this.field15.method906(49146)) {
            if (var5.method2472(var1, var2, (byte)-59)) {
               var5.method2473(var1, var2, var3, 798889931);
               return true;
            }
         }

         return false;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aiu.f(" + ')');
      }
   }

   public boolean method6(int var1, int var2, int[] var3, int var4) {
      try {
         for(class542 var5 = (class542)this.field15.method901(1766612795); var5 != null; var5 = (class542)this.field15.method906(49146)) {
            if (var5.method2471(var1, var2, 1017053502)) {
               var5.method2474(var1, var2, var3, -1549696053);
               return true;
            }
         }

         return false;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aiu.b(" + ')');
      }
   }

   public boolean method7(int var1, int var2, int var3, int[] var4, int var5) {
      try {
         for(class542 var6 = (class542)this.field15.method901(1766612795); var6 != null; var6 = (class542)this.field15.method906(49146)) {
            if (var6.method2470(var1, var2, var3, 985092463)) {
               var6.method2474(var2, var3, var4, -2077374034);
               return true;
            }
         }

         return false;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "aiu.p(" + ')');
      }
   }

   void method8(int var1) {
      try {
         this.field23 = 12800;
         this.field20 = 0;
         this.field22 = 12800;
         this.field19 = 0;

         for(class542 var2 = (class542)this.field15.method901(1766612795); var2 != null; var2 = (class542)this.field15.method906(49146)) {
            if (var2.field3943 < this.field23) {
               this.field23 = var2.field3943;
            }

            if (var2.field3947 > this.field20) {
               this.field20 = var2.field3947;
            }

            if (var2.field3949 < this.field22) {
               this.field22 = var2.field3949;
            }

            if (var2.field3951 > this.field19) {
               this.field19 = var2.field3951;
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aiu.i(" + ')');
      }
   }

   class327(int var1, String var2, String var3, int var4, int var5, boolean var6, int var7, int var8) {
      this.field16 = var1;
      this.field13 = var2;
      this.field14 = var3;
      this.field17 = var4;
      this.field12 = var5;
      this.field21 = var6;
      this.field18 = var7;
      if (this.field18 == 255) {
         this.field18 = 0;
      }

      class283.method6641(var8, 1337257918);
      this.field15 = new class373();
   }

   public static final void method9(int var0, int var1) {
      try {
         if (class507.field4015 != null && var0 >= 0 && var0 < class507.field4015.field1162) {
            class78 var2 = class507.field4015.field1165[var0];
            if (-1 == var2.field1499) {
               class684 var3 = class423.method5712((short)512);
               class701 var4 = class637.method5936(class643.field9982, var3.field7765, (byte)120);
               var4.field3364.method6361(2 + class305.method372(var2.field1497, 1064865624));
               var4.field3364.method6362(var0, 16711935);
               var4.field3364.method6366(var2.field1497, 2115033353);
               var3.method4380(var4, (byte)-90);
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aiu.mo(" + ')');
      }
   }
}
