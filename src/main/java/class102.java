public class class102 extends class678 {
   boolean field319;
   int field320;
   int field321;
   float field322;
   boolean field323;
   float field324;

   static class102 method264(class13 var0, int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      if (!var0.field6718 && (!class51.method1530(var1, 1860235026) || !class51.method1530(var2, 2077876811))) {
         return var0.field6866 ? new class102(var0, 34037, var1, var2, var3, var4, var5, var6) : new class102(var0, var1, var2, class18.method3687(var1, (byte)16), class18.method3687(var2, (byte)16), var4);
      } else {
         return new class102(var0, 3553, var1, var2, var3, var4, var5, var6);
      }
   }

   static class102 method265(class13 var0, class264 var1, class482 var2, int var3, int var4) {
      if (!var0.field6718 && (!class51.method1530(var3, 2054031633) || !class51.method1530(var4, 1814052546))) {
         return var0.field6866 ? new class102(var0, 34037, var1, var2, var3, var4) : new class102(var0, var1, var2, var3, var4, class18.method3687(var3, (byte)16), class18.method3687(var4, (byte)16));
      } else {
         return new class102(var0, 3553, var1, var2, var3, var4);
      }
   }

   static class102 method266(class13 var0, int var1, int var2, int var3, int var4) {
      if (!var0.field6718 && (!class51.method1530(var3, 1814986255) || !class51.method1530(var4, 2130033438))) {
         return var0.field6866 ? new class102(var0, 34037, var1, var2, var3, var4, true) : new class102(var0, var1, var2, var3, var4, class18.method3687(var3, (byte)16), class18.method3687(var4, (byte)16), true);
      } else {
         return new class102(var0, 3553, var1, var2, var3, var4, true);
      }
   }

   class102(class13 var1, int var2, int var3, int var4, boolean var5, int[] var6, int var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, true);
      this.field321 = var3;
      this.field320 = var4;
      if (this.field7562 == 34037) {
         this.field324 = (float)var4;
         this.field322 = (float)var3;
         this.field323 = false;
      } else {
         this.field324 = 1.0F;
         this.field322 = 1.0F;
         this.field323 = true;
      }

      this.field319 = false;
   }

   class102(class13 var1, int var2, class264 var3, class482 var4, int var5, int var6, boolean var7, byte[] var8, class264 var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, true);
      this.field321 = var5;
      this.field320 = var6;
      if (this.field7562 == 34037) {
         this.field324 = (float)var6;
         this.field322 = (float)var5;
         this.field323 = false;
      } else {
         this.field324 = 1.0F;
         this.field322 = 1.0F;
         this.field323 = true;
      }

      this.field319 = false;
   }

   class102(class13 var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field321 = var5;
      this.field320 = var6;
      if (this.field7562 == 34037) {
         this.field324 = (float)var6;
         this.field322 = (float)var5;
         this.field323 = false;
      } else {
         this.field324 = 1.0F;
         this.field322 = 1.0F;
         this.field323 = true;
      }

      this.field319 = false;
   }

   class102(class13 var1, int var2, int var3, int var4, int var5, int[] var6) {
      super(var1, 3553, class264.field8191, class482.field8399, var4, var5);
      this.field321 = var2;
      this.field320 = var3;
      this.method4214(0, var5 - var3, var2, var3, var6, 0, 0, true);
      this.field324 = (float)var3 / (float)var5;
      this.field322 = (float)var2 / (float)var4;
      this.field323 = false;
      this.field319 = true;
      this.method4212(false, false);
   }

   class102(class13 var1, class264 var2, class482 var3, int var4, int var5, int var6, int var7, byte[] var8, class264 var9) {
      super(var1, 3553, var2, var3, var6, var7);
      this.field321 = var4;
      this.field320 = var5;
      this.method4213(0, var7 - var5, var4, var5, var8, var9, 0, 0, true);
      this.field324 = (float)var5 / (float)var7;
      this.field322 = (float)var4 / (float)var6;
      this.field323 = false;
      this.field319 = true;
      this.method4212(false, false);
   }

   class102(class13 var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      super(var1, 3553, var2, var3, var6, var7);
      this.field321 = var4;
      this.field320 = var5;
      this.field324 = (float)var5 / (float)var7;
      this.field322 = (float)var4 / (float)var6;
      this.field323 = false;
      this.field319 = true;
      this.method4212(false, false);
   }

   void method4289(boolean var1) {
      super.method4289(var1 && !this.field319);
   }

   class102(class13 var1, class264 var2, class482 var3, int var4, int var5, int var6, int var7) {
      super(var1, 3553, var2, var3, var6, var7);
      this.field321 = var4;
      this.field320 = var5;
      this.field324 = (float)var5 / (float)var7;
      this.field322 = (float)var4 / (float)var6;
      this.field323 = false;
      this.field319 = true;
      this.method4212(false, false);
   }

   static class102 method267(class13 var0, class264 var1, class482 var2, int var3, int var4, boolean var5, byte[] var6, class264 var7) {
      if (!var0.field6718 && (!class51.method1530(var3, 2005734954) || !class51.method1530(var4, 1816892397))) {
         return var0.field6866 ? new class102(var0, 34037, var1, var2, var3, var4, var5, var6, var7) : new class102(var0, var1, var2, var3, var4, class18.method3687(var3, (byte)16), class18.method3687(var4, (byte)16), var6, var7);
      } else {
         return new class102(var0, 3553, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   class102(class13 var1, int var2, class264 var3, class482 var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.field321 = var5;
      this.field320 = var6;
      if (this.field7562 == 34037) {
         this.field324 = (float)var6;
         this.field322 = (float)var5;
         this.field323 = false;
      } else {
         this.field324 = 1.0F;
         this.field322 = 1.0F;
         this.field323 = true;
      }

      this.field319 = false;
   }

   void method268(boolean var1) {
      super.method4289(var1 && !this.field319);
   }
}
