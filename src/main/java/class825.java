import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class825 extends class883 {
   OpenGL field9054;
   long field9055;
   int field9056;
   Canvas field9057;
   int field9058;

   public void method2489() {
      this.field9054.releaseSurface(this.field9057, this.field9055);
   }

   class825(class608 var1, Canvas var2, long var3) {
      super(var1);
      this.field9057 = var2;
      this.field9054 = var1.field8612;
      this.field9055 = var3;
      this.method5370();
   }

   boolean method2485() {
      return true;
   }

   static void method6181(int var0) {
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

   public int method2493() {
      return this.field9058;
   }

   public int method2520(int var1, int var2) {
      return 0;
   }

   void method5370() {
      Dimension var1 = this.field9057.getSize();
      this.field9058 = var1.height;
      this.field9056 = var1.width;
   }

   public int method2490() {
      return this.field9056;
   }

   public int method2517(int var1, int var2) {
      return 0;
   }

   boolean method2484() {
      return this.field9054.setSurface(this.field9055) && super.method2484();
   }

   boolean method2482() {
      return true;
   }

   public void method2488() {
      this.field9054.releaseSurface(this.field9057, this.field9055);
   }

   public int method2480() {
      return this.field9058;
   }

   void method2518(int var1, int var2) {
      this.field9054.surfaceResized(this.field9055);
      this.method5370();
      super.method2518(var1, var2);
   }

   public int method2523(int var1, int var2) {
      return 0;
   }

   public void method2487() {
      this.field9054.releaseSurface(this.field9057, this.field9055);
   }

   boolean method2486() {
      return this.field9054.setSurface(this.field9055) && super.method2484();
   }

   public int method2516() {
      this.field9054.swapBuffers(this.field9055);
      return 0;
   }

   public int method2481() {
      return this.field9056;
   }

   public int method2492() {
      return this.field9056;
   }

   public int method2483() {
      return this.field9056;
   }

   public int method2515() {
      this.field9054.swapBuffers(this.field9055);
      return 0;
   }

   class825(class608 var1, Canvas var2) {
      this(var1, var2, var1.field8612.prepareSurface(var2));
   }

   public int method2521(int var1, int var2) {
      return 0;
   }

   public int method2522(int var1, int var2) {
      return 0;
   }

   public int method2491() {
      return this.field9056;
   }

   void method2519(int var1, int var2) {
      this.field9054.surfaceResized(this.field9055);
      this.method5370();
      super.method2518(var1, var2);
   }
}
