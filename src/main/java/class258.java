public class class258 {
   int[] field7867;
   Runnable field7868;
   static float field7869 = 255.0F;
   float[] field7870;
   class257 field7871;
   float field7872;
   int field7873;
   int field7874;
   boolean field7875;
   class597[] field7876;
   float[] field7877;
   class135 field7878;
   class344 field7879;
   float field7880;
   class585 field7881;
   float field7882;
   class344 field7883;
   class344 field7884;
   int field7885;
   float[] field7886;
   float[] field7887;
   float[] field7888;
   float[] field7889;
   int[] field7890;
   int[] field7891;
   int[] field7892;
   int[] field7893;
   float field7894 = 0.85F;
   int[] field7895;
   boolean field7896;
   float field7897;
   float field7898;
   float[] field7899;
   float field7900;
   float field7901;
   int[] field7902;
   int field7903;
   int field7904;
   boolean field7905;
   class597[] field7906;
   float[] field7907;
   class135 field7908;
   float field7909;
   float[] field7910;
   float[] field7911;
   float[] field7912;
   public static class329 field7913;

   class258(class257 var1) {
      this.field7872 = 1.0F - this.field7894;
      this.field7873 = 0;
      this.field7874 = 0;
      this.field7875 = false;
      this.field7885 = 0;
      this.field7904 = 0;
      this.field7896 = true;
      this.field7879 = new class344();
      this.field7908 = new class135();
      this.field7878 = new class135();
      this.field7883 = new class344();
      this.field7884 = new class344();
      this.field7902 = new int[class597.field2102];
      this.field7886 = new float[class597.field2102];
      this.field7877 = new float[class597.field2102];
      this.field7888 = new float[class597.field2102];
      this.field7889 = new float[class597.field2102];
      this.field7890 = new int[8];
      this.field7891 = new int[8];
      this.field7892 = new int[8];
      this.field7893 = new int[10000];
      this.field7867 = new int[10000];
      this.field7900 = 1.0F;
      this.field7901 = 0.0F;
      this.field7880 = 1.0F;
      this.field7899 = new float[2];
      this.field7876 = new class597[7];
      this.field7906 = new class597[7];
      this.field7907 = new float[64];
      this.field7870 = new float[64];
      this.field7912 = new float[64];
      this.field7910 = new float[64];
      this.field7911 = new float[64];
      this.field7887 = new float[3];
      this.field7871 = var1;
      this.field7881 = new class585(var1, this);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         this.field7876[var2] = new class597(this.field7871);
         this.field7906[var2] = new class597(this.field7871);
      }

      this.field7895 = new int[class597.field2079];

      for(var2 = 0; var2 < class597.field2079; ++var2) {
         this.field7895[var2] = -1;
      }

   }

   void method4439(Runnable var1, byte var2) {
      try {
         this.field7868 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ap.f(" + ')');
      }
   }

   void method4440(int var1) {
      try {
         this.field7881 = new class585(this.field7871, this);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ap.a(" + ')');
      }
   }

   static final void method4441(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         ItemDefinition var3 = class85.field1121.method1566(var2);
         if (var3.field4273 == -1 && var3.field4226 >= 0) {
            var0.field3161[++var0.field3156 - 1] = var3.field4226;
         } else {
            var0.field3161[++var0.field3156 - 1] = var2;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ap.aal(" + ')');
      }
   }

   static final void method4442(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3161[++var0.field3156 - 1] = class543.field3817[class526.method2228(var2, (byte)0) & '\uffff'];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ap.zl(" + ')');
      }
   }

   static final void method4443(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class75.method1118(var3, var4, false, 1, var0, 1620962996);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ap.hp(" + ')');
      }
   }
}
