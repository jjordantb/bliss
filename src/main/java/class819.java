public class class819 {
   public static int field4826 = 1;
   public static int field4827 = 2;
   public static int field4828 = 4;
   public static int field4829 = 16;
   public static int field4830 = 15;
   public static int field4831 = 64;
   public static int field4832 = 1;
   public static int field4833 = 2;
   public static int field4834 = 2;
   public static int field4835 = 7;
   public static int field4836 = 8;
   public static int field4837 = 16;
   public static int field4838 = 32;
   public static int field4839 = 128;
   public static int field4840 = 256;
   public static int field4841 = 512;
   public static int field4842 = 1024;
   public static int field4843 = 32;
   public static int field4844 = 4096;
   public static int field4845 = 8192;
   public static int field4846 = 16384;
   public static int field4847 = 32768;
   static float field4848 = 0.0F;
   public static int field4849 = 7;
   public static int field4850 = 262144;
   public static int field4851 = 524288;
   public static int field4852 = 3;
   public static int field4853 = 1;
   public static int field4854 = 2;
   public static int field4855 = 4;
   public static int field4856 = 0;
   public static int field4857 = 1;
   public static int field4858 = 2;
   public static int field4859 = 0;
   public static int field4860 = 8;
   public static int field4861 = 3;
   public static int field4862 = 65536;
   public static int field4863 = 1;
   public static int field4864 = 4;
   public static int field4865 = 1;
   public static int field4866 = 1;
   public static int field4867 = 2;
   public static int field4868 = 2;
   public static int field4869 = 4;
   public static int field4870 = 0;
   public static int field4871 = 1;
   public static int field4872 = 2;
   public static int field4873 = 4;
   public static int field4874 = 0;
   public static int field4875 = 2;
   public static int field4876 = 4;
   public static int field4877 = 1;
   public static int field4878 = 2;
   public static int field4879 = 3;
   public static int field4880 = 2;
   public static int field4881 = 1;
   public static int field4882 = 2;
   public static int field4883 = 3;
   public static float field4884 = 1.0F;
   public static int field4885 = 5;
   public static int field4886 = 0;
   public static int field4887 = 1;
   public static int field4888 = 4;
   public static float field4889 = 1.0F;
   public static int field4890 = 32;
   public static int field4891 = 5;
   public static int field4892 = 131072;
   public static float field4893 = 0.25F;
   public static float field4894 = 1.0F;
   public static int field4895 = 2048;
   static float field4896 = 1.0F;
   public static int field4897 = 1;
   public static int field4898 = 1;
   public static int field4899 = 16;
   public static int field4900 = 4;
   public static int field4901 = 1048576;
   public static int field4902 = 0;
   public static int field4903 = 4;
   public static int field4904 = 8;
   public static int field4905 = 2;
   public static int field4906 = 1;

   class819() throws Throwable {
      throw new Error();
   }

   static final void method2934(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class779.method2324(var3, var4, var0, 783841228);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ds.fa(" + ')');
      }
   }

   static final void method2935(class744 var0, byte var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         var0.field3161[++var0.field3156 - 1] = var2 & var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ds.zx(" + ')');
      }
   }

   static final void method2936(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-34);
         class131 var4 = class382.field1410[var2 >> 16];
         class370.method880(var3, var4, var0, (byte)7);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ds.ox(" + ')');
      }
   }

   static void method2937(Actor var0, byte var1) {
      try {
         if (var0 instanceof Npc) {
            Npc var2 = (Npc)var0;
            if (var2.field1637 != null) {
               class554.method424(var2, var2.field3639 != class923.local.field3639, (byte)-64);
            }
         } else if (var0 instanceof Player) {
            Player var4 = (Player)var0;
            class149.method1159(var4, class923.local.field3639 != var4.field3639, 1531362210);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ds.g(" + ')');
      }
   }

   static final void method2938(byte var0) {
      try {
         if (class730.field2738 < 1104.0F) {
            class730.field2738 = 1104.0F;
         }

         if (class730.field2738 > 2874.0F) {
            class730.field2738 = 2874.0F;
         }

         while(class730.field2931 >= 16384.0F) {
            class730.field2931 -= 16384.0F;
         }

         while(class730.field2931 < 0.0F) {
            class730.field2931 += 16384.0F;
         }

         class153 var1 = class730.field2697.method5296(1252790814);
         class545 var2 = class730.field2697.method5317(-1611682495);
         int var3 = class456.field7163 >> 9;
         int var4 = class530.field3741 >> 9;
         int var5 = class679.method4271(class456.field7163, class530.field3741, class899.field9552, -737895541);
         int var6 = 0;
         int var7;
         if (var3 > 3 && var4 > 3 && var3 < class730.field2697.method5271(-1981660153) - 4 && var4 < class730.field2697.method5272(1904630701) - 4) {
            for(var7 = var3 - 4; var7 <= 4 + var3; ++var7) {
               for(int var8 = var4 - 4; var8 <= 4 + var4; ++var8) {
                  int var9 = class899.field9552;
                  if (var9 < 3 && var1.method3386(var7, var8, -316177210)) {
                     ++var9;
                  }

                  int var10 = 0;
                  byte[][] var11 = class730.field2697.method5279(var9, 300700071);
                  if (var11 != null) {
                     var10 = (var11[var7][var8] & 255) * 8 << 2;
                  }

                  if (var2.field3862 != null && var2.field3862[var9] != null) {
                     int var12 = var5 - (var2.field3862[var9].method3888(var7, var8, (byte)-39) - var10);
                     if (var12 > var6) {
                        var6 = var12;
                     }
                  }
               }
            }
         }

         var7 = (var6 >> 2) * 1536;
         if (var7 > 786432) {
            var7 = 786432;
         }

         if (var7 < 262144) {
            var7 = 262144;
         }

         if (var7 > class730.field2745) {
            class730.field2745 += (var7 - class730.field2745) / 24;
         } else if (var7 < class730.field2745) {
            class730.field2745 += (var7 - class730.field2745) / 80;
         }

      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "ds.hl(" + ')');
      }
   }
}
