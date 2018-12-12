public abstract class class676 extends class963 {
   public static int field7424 = 2;
   public static int field7425 = 1;
   public static int field7426 = 4;
   static int[] field7427 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   public static int field7428 = 16;
   public static int field7429 = 32;
   public static int field7430 = 64;
   public static int field7431 = 128;
   public static int field7432 = 8;
   public short field7433;

   boolean method2202() {
      class32 var1 = this.method1511().field7637;
      return this.field3638.field3908[583010427 * this.field3638.field3883 + (((int)var1.field5296 >> -1688804109 * this.field3638.field3849) - -804213305 * this.field3638.field3898)][this.field3638.field3883 * 583010427 + (((int)var1.field5299 >> -1688804109 * this.field3638.field3849) - this.field3638.field3858 * 465603579)];
   }

   int method2161(class639[] var1, int var2) {
      try {
         class32 var3 = this.method1511().field7637;
         int var4 = (int)var3.field5296 >> -1688804109 * this.field3638.field3849;
         int var5 = (int)var3.field5299 >> -1688804109 * this.field3638.field3849;
         int var6 = 0;
         if (this.field3638.field3898 * -804213305 == var4) {
            ++var6;
         } else if (-804213305 * this.field3638.field3898 < var4) {
            var6 += 2;
         }

         if (465603579 * this.field3638.field3858 == var5) {
            var6 += 3;
         } else if (465603579 * this.field3638.field3858 > var5) {
            var6 += 6;
         }

         int var7 = field7427[var6];
         if ((this.field7433 & var7) != 0) {
            return this.method2199(var4, var5, var1, 1946245102);
         } else if (1 == this.field7433 && var4 > 0) {
            return this.method2199(var4 - 1, var5, var1, 2007434084);
         } else if (4 == this.field7433 && var4 <= 1988988347 * this.field3638.field3859) {
            return this.method2199(var4 + 1, var5, var1, 1817424902);
         } else if (this.field7433 == 8 && var5 > 0) {
            return this.method2199(var4, var5 - 1, var1, 1898230573);
         } else if (2 == this.field7433 && var5 <= this.field3638.field3894 * 1340714547) {
            return this.method2199(var4, var5 + 1, var1, 1978874084);
         } else if (16 == this.field7433 && var4 > 0 && var5 <= 1340714547 * this.field3638.field3894) {
            return this.method2199(var4 - 1, 1 + var5, var1, 1964784017);
         } else if (32 == this.field7433 && var4 <= this.field3638.field3859 * 1988988347 && var5 <= this.field3638.field3894 * 1340714547) {
            return this.method2199(var4 + 1, var5 + 1, var1, 2147063245);
         } else if (this.field7433 == 128 && var4 > 0 && var5 > 0) {
            return this.method2199(var4 - 1, var5 - 1, var1, 1999662511);
         } else if (this.field7433 == 64 && var4 <= this.field3638.field3859 * 1988988347 && var5 > 0) {
            return this.method2199(var4 + 1, var5 - 1, var1, 1956258872);
         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "ajz.dg(" + ')');
      }
   }

   boolean method2171(class848 var1, byte var2) {
      try {
         class32 var3 = this.method1511().field7637;
         return this.field3638.field3857.method1652(this, this.field3640, (int)var3.field5296 >> this.field3638.field3849 * -1688804109, (int)var3.field5299 >> -1688804109 * this.field3638.field3849);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ajz.dl(" + ')');
      }
   }

   boolean method2167(int var1) {
      try {
         class32 var2 = this.method1511().field7637;
         return this.field3638.field3908[583010427 * this.field3638.field3883 + (((int)var2.field5296 >> -1688804109 * this.field3638.field3849) - -804213305 * this.field3638.field3898)][this.field3638.field3883 * 583010427 + (((int)var2.field5299 >> -1688804109 * this.field3638.field3849) - this.field3638.field3858 * 465603579)];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajz.dq(" + ')');
      }
   }

   int method2197(class639[] var1) {
      class32 var2 = this.method1511().field7637;
      int var3 = (int)var2.field5296 >> -1688804109 * this.field3638.field3849;
      int var4 = (int)var2.field5299 >> -1688804109 * this.field3638.field3849;
      int var5 = 0;
      if (this.field3638.field3898 * -804213305 == var3) {
         ++var5;
      } else if (-804213305 * this.field3638.field3898 < var3) {
         var5 += 2;
      }

      if (465603579 * this.field3638.field3858 == var4) {
         var5 += 3;
      } else if (465603579 * this.field3638.field3858 > var4) {
         var5 += 6;
      }

      int var6 = field7427[var5];
      if ((this.field7433 & var6) != 0) {
         return this.method2199(var3, var4, var1, 1959908119);
      } else if (1 == this.field7433 && var3 > 0) {
         return this.method2199(var3 - 1, var4, var1, 1844921124);
      } else if (4 == this.field7433 && var3 <= 1988988347 * this.field3638.field3859) {
         return this.method2199(var3 + 1, var4, var1, 1983881528);
      } else if (this.field7433 == 8 && var4 > 0) {
         return this.method2199(var3, var4 - 1, var1, 1778158049);
      } else if (2 == this.field7433 && var4 <= this.field3638.field3894 * 1340714547) {
         return this.method2199(var3, var4 + 1, var1, 2009547165);
      } else if (16 == this.field7433 && var3 > 0 && var4 <= 1340714547 * this.field3638.field3894) {
         return this.method2199(var3 - 1, 1 + var4, var1, 2048116357);
      } else if (32 == this.field7433 && var3 <= this.field3638.field3859 * 1988988347 && var4 <= this.field3638.field3894 * 1340714547) {
         return this.method2199(var3 + 1, var4 + 1, var1, 1874630351);
      } else if (this.field7433 == 128 && var3 > 0 && var4 > 0) {
         return this.method2199(var3 - 1, var4 - 1, var1, 1974289845);
      } else if (this.field7433 == 64 && var3 <= this.field3638.field3859 * 1988988347 && var4 > 0) {
         return this.method2199(var3 + 1, var4 - 1, var1, 1884839671);
      } else {
         throw new RuntimeException("");
      }
   }

   boolean method2198(class848 var1) {
      class32 var2 = this.method1511().field7637;
      return this.field3638.field3857.method1652(this, this.field3640, (int)var2.field5296 >> this.field3638.field3849 * -1688804109, (int)var2.field5299 >> -1688804109 * this.field3638.field3849);
   }

   boolean method2203() {
      class32 var1 = this.method1511().field7637;
      return this.field3638.field3908[583010427 * this.field3638.field3883 + (((int)var1.field5296 >> -1688804109 * this.field3638.field3849) - -804213305 * this.field3638.field3898)][this.field3638.field3883 * 583010427 + (((int)var1.field5299 >> -1688804109 * this.field3638.field3849) - this.field3638.field3858 * 465603579)];
   }

   boolean method2200(class848 var1) {
      class32 var2 = this.method1511().field7637;
      return this.field3638.field3857.method1652(this, this.field3640, (int)var2.field5296 >> this.field3638.field3849 * -1688804109, (int)var2.field5299 >> -1688804109 * this.field3638.field3849);
   }

   boolean method2166(class848 var1) {
      class32 var2 = this.method1511().field7637;
      return this.field3638.field3857.method1652(this, this.field3640, (int)var2.field5296 >> this.field3638.field3849 * -1688804109, (int)var2.field5299 >> -1688804109 * this.field3638.field3849);
   }

   class676(class545 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1);
      this.field3639 = (byte)var5;
      this.field3640 = (byte)var6;
      this.field7433 = (short)var7;
      this.method1514(new class32((float)var2, (float)var3, (float)var4));
   }

   boolean method2196(class848 var1) {
      class32 var2 = this.method1511().field7637;
      return this.field3638.field3857.method1652(this, this.field3640, (int)var2.field5296 >> this.field3638.field3849 * -1688804109, (int)var2.field5299 >> -1688804109 * this.field3638.field3849);
   }

   boolean method2204() {
      class32 var1 = this.method1511().field7637;
      return this.field3638.field3908[583010427 * this.field3638.field3883 + (((int)var1.field5296 >> -1688804109 * this.field3638.field3849) - -804213305 * this.field3638.field3898)][this.field3638.field3883 * 583010427 + (((int)var1.field5299 >> -1688804109 * this.field3638.field3849) - this.field3638.field3858 * 465603579)];
   }

   static final void method4161(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class327 var3 = class491.method4412(var2);
         if (var3 == null) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = -1973484731 * var3.field17 >> 14 & 16383;
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var3.field17 * -1973484731 & 16383;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ajz.adm(" + ')');
      }
   }
}
