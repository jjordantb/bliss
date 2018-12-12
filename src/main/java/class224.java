import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Hashtable;

public final class class224 extends class837 {
   Image field7302;
   static class188[] field7303;

   void method4002() {
      super.method5396(251162115);
      DataBufferInt var1 = new DataBufferInt(this.field9158, this.field9158.length);
      DirectColorModel var2 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var3 = Raster.createWritableRaster(var2.createCompatibleSampleModel(this.field9156 * 1038713159, 2061776189 * this.field9157), var1, (Point)null);
      this.field7302 = new BufferedImage(var2, var3, false, new Hashtable());
   }

   static void method4003(int var0) {
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

   public final int method2522(int var1, int var2) {
      Graphics var3 = this.field9154.getGraphics();
      var3.drawImage(this.field7302, var1, var2, this.field9154);
      return 0;
   }

   class224(class257 var1, Canvas var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      new Rectangle();
      this.method5396(251162115);
   }

   public int method2516() {
      try {
         return this.method2517(0, 0);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "akh.v(" + ')');
      }
   }

   public void method2488() {
   }

   public void method2487() {
   }

   void method5396(int var1) {
      try {
         super.method5396(251162115);
         DataBufferInt var2 = new DataBufferInt(this.field9158, this.field9158.length);
         DirectColorModel var3 = new DirectColorModel(32, 16711680, 65280, 255);
         WritableRaster var4 = Raster.createWritableRaster(var3.createCompatibleSampleModel(this.field9156 * 1038713159, 2061776189 * this.field9157), var2, (Point)null);
         this.field7302 = new BufferedImage(var3, var4, false, new Hashtable());
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "akh.z(" + ')');
      }
   }

   void method4004() {
      super.method5396(251162115);
      DataBufferInt var1 = new DataBufferInt(this.field9158, this.field9158.length);
      DirectColorModel var2 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var3 = Raster.createWritableRaster(var2.createCompatibleSampleModel(this.field9156 * 1038713159, 2061776189 * this.field9157), var1, (Point)null);
      this.field7302 = new BufferedImage(var2, var3, false, new Hashtable());
   }

   void method4005() {
      super.method5396(251162115);
      DataBufferInt var1 = new DataBufferInt(this.field9158, this.field9158.length);
      DirectColorModel var2 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var3 = Raster.createWritableRaster(var2.createCompatibleSampleModel(this.field9156 * 1038713159, 2061776189 * this.field9157), var1, (Point)null);
      this.field7302 = new BufferedImage(var2, var3, false, new Hashtable());
   }

   public void method2489() {
   }

   public int method2515() {
      return this.method2517(0, 0);
   }

   public final int method2520(int var1, int var2) {
      Graphics var3 = this.field9154.getGraphics();
      var3.drawImage(this.field7302, var1, var2, this.field9154);
      return 0;
   }

   public final int method2521(int var1, int var2) {
      Graphics var3 = this.field9154.getGraphics();
      var3.drawImage(this.field7302, var1, var2, this.field9154);
      return 0;
   }

   public final int method2517(int var1, int var2) {
      try {
         Graphics var3 = this.field9154.getGraphics();
         var3.drawImage(this.field7302, var1, var2, this.field9154);
         return 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "akh.g(" + ')');
      }
   }

   public final int method2523(int var1, int var2) {
      Graphics var3 = this.field9154.getGraphics();
      var3.drawImage(this.field7302, var1, var2, this.field9154);
      return 0;
   }
}
