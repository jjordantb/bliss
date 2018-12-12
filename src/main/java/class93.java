import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class93 implements class297 {
   Runnable field581;
   class955 field582;
   long field583;
   class171[] field584 = new class171[7];
   class171[] field585 = new class171[7];
   class344 field586;

   public void method6550(boolean var1) {
      this.R(this.field583, var1);
   }

   static void method509(int var0) {
      try {
         Class var1 = ClassLoader.class;
         Field var2 = var1.getDeclaredField("nativeLibraries");
         Class var3 = AccessibleObject.class;
         Method var4 = var3.getDeclaredMethod("setAccessible", Boolean.TYPE);
         var4.invoke(var2, Boolean.TRUE);
      } catch (Throwable var5) {
         ;
      }

   }

   native void i(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, boolean[][] var12);

   native void bv(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, boolean[][] var12);

   native void ha(long var1, class848 var3, int var4, int var5);

   class879 method510(class171 var1, byte var2, int var3, boolean var4) {
      boolean var5 = false;
      class171 var6;
      class171 var7;
      if (var2 > 0 && var2 <= 7) {
         var6 = this.field585[var2 - 1];
         var7 = this.field584[var2 - 1];
         var5 = true;
      } else {
         var7 = var6 = new class171(this.field582);
      }

      var1.BA(var7, var6, var3, var5, var4);
      var7.field5098 = var1.field5098;
      var7.field5097 = var1.field5097;
      return var7;
   }

   void method511() {
      this.JA(this.field583);
   }

   void method512(class848 var1, int[] var2, int[] var3, int[] var4, short[] var5, int var6) {
      this.b(this.field583, var1, var2, var3, var4, var5, var6);
   }

   native void b(long var1, class848 var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

   native void P(long var1, long var3, long var5, int var7, int var8, int var9, boolean var10);

   void method513(class879 var1, class135 var2, int[] var3, int var4) {
      this.field586.method272(var2);
      this.wa(this.field583, ((class171)var1).field5094, this.field586.field325, var3, var4);
   }

   native boolean ya(long var1, long var3, int var5, int var6, float[] var7, boolean var8);

   void method514(class879 var1, int[] var2, class135 var3) {
      this.field586.method272(var3);
      this.J(this.field583, ((class171)var1).field5094, var2, this.field586.field325);
   }

   native void JA(long var1);

   void method515(class454 var1, int var2, int var3) {
      this.v(this.field583, ((class204)var1).field7635, var2, var3);
   }

   native void v(long var1, long var3, int var5, int var6);

   void method516(class454 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean[][] var9) {
      this.i(this.field583, ((class204)var1).field7635, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   native void K(long var1, class848 var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

   native void c(long var1, class848 var3, int var4, int var5);

   native void m(long var1, class848 var3, int var4, int var5);

   native void w(long var1, class848 var3, int var4, int var5);

   native void j(long var1, boolean var3);

   void method517() {
      this.field581 = Thread.currentThread();
      this.method511();
   }

   native void ak(long var1);

   native void wa(long var1, long var3, float[] var5, int[] var6, int var7);

   native void ao(long var1, class848 var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

   native void ad(long var1, class848 var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

   native void av(long var1, class848 var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

   native void at(long var1, class848 var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

   native void ah(long var1, class848 var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

   native void bp(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, boolean[][] var12);

   native void ap(long var1, class848 var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

   class93(class955 var1, int var2, int var3) {
      this.field582 = var1;

      for(int var4 = 0; var4 < 7; ++var4) {
         this.field584[var4] = new class171(this.field582);
         this.field585[var4] = new class171(this.field582);
      }

      this.field586 = new class344();
      this.ha(this.field583, var1, var2, var3);
   }

   native void ab(long var1, long var3, long var5, int var7, int var8, int var9, boolean var10);

   native void aj(long var1, long var3, long var5, int var7, int var8, int var9, boolean var10);

   boolean method518(class879 var1, int var2, int var3, class135 var4, boolean var5) {
      this.field586.method272(var4);
      return this.ya(this.field583, ((class171)var1).field5094, var2, var3, this.field586.field325, var5);
   }

   native void au(long var1, long var3, float[] var5, int[] var6, int var7);

   native void ar(long var1, long var3, float[] var5, int[] var6, int var7);

   native void ac(long var1, long var3, float[] var5, int[] var6, int var7);

   native void J(long var1, long var3, int[] var5, float[] var6);

   void method519(class879 var1, class879 var2, int var3, int var4, int var5, boolean var6) {
      this.P(this.field583, ((class171)var1).field5094, ((class171)var2).field5094, var3, var4, var5, var6);
   }

   native void as(long var1, class848 var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

   native void o(long var1, boolean var3);

   native void bo(long var1, long var3, int[] var5, float[] var6);

   native void bb(long var1, long var3, int[] var5, float[] var6);

   native boolean bf(long var1, long var3, int var5, int var6, float[] var7, boolean var8);

   native boolean bd(long var1, long var3, int var5, int var6, float[] var7, boolean var8);

   native void R(long var1, boolean var3);

   void method520(class848 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.K(this.field583, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void method6551(boolean var1) {
      this.R(this.field583, var1);
   }

   native void bh(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, boolean[][] var12);
}
