public class class0 extends Animable implements class265 {
   class879 field4953;
   byte field4954;
   class770 field4955;
   class719 field4956;
   int field4957;
   class240 field4958;
   byte field4959;
   boolean field4960;
   boolean field4961;
   boolean field4962;
   boolean field4963;

   public int method2168(int var1) {
      try {
         return this.field4953 != null ? this.field4953.method5976() : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wf.bm(" + ')');
      }
   }

   class879 method2989(class848 var1, int var2, int var3) {
      try {
         if (this.field4953 != null && var1.method4836(this.field4953.method5948(), var2) == 0) {
            return this.field4953;
         } else {
            class486 var4 = this.method2990(var1, var2, false, -1828314772);
            return var4 != null ? (class879)var4.field8554 : null;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "wf.bl(" + ')');
      }
   }

   public class719 method2165(class848 var1, byte var2) {
      try {
         class32 var3 = this.method1511().field7637;
         if (this.field4956 == null) {
            this.field4956 = class905.method6344((int)var3.field5296, (int)var3.field5300, (int)var3.field5299, this.method2989(var1, 0, 720922451), 2111696382);
         }

         return this.field4956;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "wf.bc(" + ')');
      }
   }

   public int method4548(int var1) {
      try {
         return this.field4954;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wf.f(" + ')');
      }
   }

   boolean method2157(class848 var1, int var2, int var3, byte var4) {
      try {
         class879 var5 = this.method2989(var1, 131072, -114494856);
         if (var5 != null) {
            class135 var6 = this.method1521();
            return var5.method6097(var2, var3, var6, false, 0);
         } else {
            return false;
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "wf.bu(" + ')');
      }
   }

   boolean method2173(int var1) {
      try {
         return this.field4963;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wf.bw(" + ')');
      }
   }

   void method2162(class848 var1, Interactable var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         if (var2 instanceof class729) {
            class729 var8 = (class729)var2;
            if (this.field4953 != null && var8.field2500 != null) {
               this.field4953.method5994(var8.field2500, var3, var4, var5, var6);
            }
         } else if (var2 instanceof class0) {
            class0 var10 = (class0)var2;
            if (this.field4953 != null && var10.field4953 != null) {
               this.field4953.method5994(var10.field4953, var3, var4, var5, var6);
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "wf.bk(" + ')');
      }
   }

   void method2205(byte var1) {
      try {
         this.field4963 = false;
         if (this.field4953 != null) {
            this.field4953.method5947(this.field4953.method5948() & -65537);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wf.bq(" + ')');
      }
   }

   public int method4549(short var1) {
      try {
         return this.field4959;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wf.b(" + ')');
      }
   }

   public void method4550(byte var1) {
      try {
         if (this.field4953 != null) {
            this.field4953.method6093();
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wf.p(" + ')');
      }
   }

   public boolean method4558(int var1) {
      try {
         return this.field4961;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wf.i(" + ')');
      }
   }

   void method2164(class848 var1, int var2) {
   }

   class192 method2201(class848 var1, int var2) {
      try {
         if (this.field4953 == null) {
            return null;
         } else {
            class135 var3 = this.method1521();
            class192 var4 = class221.method4033(this.field4962, 1956566103);
            this.field4953.method5965(var3, super.field3642[0], 0);
            return var4;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "wf.bo(" + ')');
      }
   }

   public class0(class545 var1, class848 var2, class240 var3, ObjectDefinition var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14, int var15, int var16, boolean var17) {
      super(var1, var5, var6, var7, var8, var9, var11, var12, var13, var14, var4.field2241 == 1, class818.method2901(var15, var16, (byte)27));
      this.field4958 = var3;
      this.field4957 = var4.field2197;
      super.field3640 = (byte)var6;
      this.field4960 = var10;
      this.field4954 = (byte)var15;
      this.field4959 = (byte)var16;
      this.field4962 = var4.field2214 != 0 && !var10;
      this.field4963 = var17;
      this.field4961 = var2.method4916() && var4.field2265 && !this.field4960 && class615.field8903.field9147.method5182(3122198) != 0;
      int var18 = 2048;
      if (this.field4963) {
         var18 |= 65536;
      }

      if (var4.field2273) {
         var18 |= 524288;
      }

      class486 var19 = this.method2990(var2, var18, this.field4961, -1835687018);
      if (var19 != null) {
         this.field4953 = (class879)var19.field8554;
         this.field4955 = (class770)var19.field8555;
         if (this.field4963 || var4.field2273) {
            this.field4953 = this.field4953.method6017((byte)0, var18, false);
            if (var4.field2273) {
               class923 var20 = class730.field2697.method5274(-1997873817);
               this.field4953.method5987(var20.field10290, var20.field10291, var20.field10292, var20.field10293);
            }
         }
      }

      this.method2169(1, 1215264227);
   }

   class486 method2990(class848 var1, int var2, boolean var3, int var4) {
      try {
         ObjectDefinition var5 = this.field4958.method4713(this.field4957);
         class454 var6;
         class454 var7;
         if (this.field4960) {
            var6 = super.field3638.field3866[super.field3640];
            var7 = super.field3638.field3864[0];
         } else {
            var6 = super.field3638.field3864[super.field3640];
            if (super.field3640 < 3) {
               var7 = super.field3638.field3864[1 + super.field3640];
            } else {
               var7 = null;
            }
         }

         class32 var8 = this.method1511().field7637;
         return var5.method1495(var1, var2, this.field4954 != class15.field6912.field6921 ? this.field4954 : class15.field6919.field6921 * -1456740875 * -1976050083, class15.field6912.field6921 == this.field4954 ? this.field4959 + 4 : this.field4959, var6, var7, (int)var8.field5296, (int)var8.field5300, (int)var8.field5299, var3, (class552)null, -920698887);
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "wf.br(" + ')');
      }
   }

   public int method2991(short var1) {
      try {
         return this.field4953 != null ? this.field4953.method5972() / 4 : 15;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wf.bz(" + ')');
      }
   }

   public void method4556(class848 var1, int var2) {
      try {
         Object var3 = null;
         class770 var5;
         if (this.field4955 == null && this.field4961) {
            class486 var4 = this.method2990(var1, 262144, true, -2139710295);
            var5 = (class770)(var4 != null ? var4.field8555 : null);
         } else {
            var5 = this.field4955;
            this.field4955 = null;
         }

         class32 var7 = this.method1511().field7637;
         if (var5 != null) {
            super.field3638.method2441(var5, super.field3640, (int)var7.field5296, (int)var7.field5299, (boolean[])null, 1871597287);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "wf.d(" + ')');
      }
   }

   boolean method2206(byte var1) {
      try {
         if (this.field4953 != null) {
            return !this.field4953.method6036();
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wf.bf(" + ')');
      }
   }

   boolean method2183(short var1) {
      try {
         return this.field4953 != null ? this.field4953.method5989() : false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wf.be(" + ')');
      }
   }

   public void method4552(class848 var1, int var2) {
      try {
         Object var3 = null;
         class770 var5;
         if (this.field4955 == null && this.field4961) {
            class486 var4 = this.method2990(var1, 262144, true, -1616676956);
            var5 = (class770)(var4 != null ? var4.field8555 : null);
         } else {
            var5 = this.field4955;
            this.field4955 = null;
         }

         class32 var7 = this.method1511().field7637;
         if (var5 != null) {
            super.field3638.method2449(var5, super.field3640, (int)var7.field5296, (int)var7.field5299, (boolean[])null, -808327981);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "wf.k(" + ')');
      }
   }

   public int method4551(byte var1) {
      try {
         return this.field4957;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wf.a(" + ')');
      }
   }

   static void method2992(class848 var0, int var1) {
      try {
         if (class923.local.field3639 != class95.field596 && class730.field2697.method5317(-1611682495) != null) {
            class27.resetTimer((byte)1);
            if (class374.method1007(var0, class923.local.field3639, 1177065502)) {
               class95.field596 = class923.local.field3639;
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "wf.p(" + ')');
      }
   }
}
