import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import java.nio.ByteBuffer;

public class class116 extends class92 {
   long field1893 = 0L;
   class927 field1894;

   void method1350(ByteBuffer var1, short var2, short var3, byte var4, byte var5, byte var6, byte var7) {
      var1.putShort(var2);
      var1.putShort(var3);
      var1.put(var4);
      var1.put(var5);
      var1.put(var6);
      var1.put(var7);
   }

   public void method2755() {
      if (this.field1893 != 0L) {
         IUnknown.Release(this.field1893);
         this.field1893 = 0L;
      }

      this.field1894.method552(this);
   }

   void method1351() {
      if (this.field1893 != 0L) {
         this.field1894.method6218(this.field1893);
         this.field1893 = 0L;
      }

   }

   public void method2754() {
      if (this.field1893 != 0L) {
         IUnknown.Release(this.field1893);
         this.field1893 = 0L;
      }

      this.field1894.method552(this);
   }

   public void method2756() {
      if (this.field1893 != 0L) {
         IUnknown.Release(this.field1893);
         this.field1893 = 0L;
      }

      this.field1894.method552(this);
   }

   public void method2753() {
      if (this.field1893 != 0L) {
         IUnknown.Release(this.field1893);
         this.field1893 = 0L;
      }

      this.field1894.method552(this);
   }

   class116(class927 var1, class39[] var2) {
      super(var2);
      this.field1894 = var1;
      byte var3 = 0;
      ByteBuffer var4 = this.field1894.field660;
      var4.clear();

      for(short var5 = 0; var5 < this.field555.length; ++var5) {
         short var6 = 0;
         class39 var7 = this.field555[var5];

         for(int var8 = 0; var8 < var7.method3359(); ++var8) {
            class61 var9 = var7.method3356(var8);
            if (var9 == class61.field1601) {
               this.method1350(var4, var5, var6, (byte)2, (byte)0, (byte)0, (byte)0);
            } else if (var9 == class61.field1587) {
               this.method1350(var4, var5, var6, (byte)2, (byte)0, (byte)3, (byte)0);
            } else if (var9 == class61.field1588) {
               this.method1350(var4, var5, var6, (byte)4, (byte)0, (byte)10, (byte)0);
            } else {
               byte var14;
               byte var15;
               byte var16;
               byte var17;
               if (var9 == class61.field1592) {
                  var14 = 0;
                  var15 = 0;
                  var16 = 5;
                  var17 = var3++;
                  this.method1350(var4, var5, var6, var14, var15, var16, var17);
               } else if (var9 == class61.field1590) {
                  var14 = 1;
                  var15 = 0;
                  var16 = 5;
                  var17 = var3++;
                  this.method1350(var4, var5, var6, var14, var15, var16, var17);
               } else if (var9 == class61.field1591) {
                  var14 = 2;
                  var15 = 0;
                  var16 = 5;
                  var17 = var3++;
                  this.method1350(var4, var5, var6, var14, var15, var16, var17);
               } else if (var9 == class61.field1589) {
                  var14 = 3;
                  var15 = 0;
                  var16 = 5;
                  var17 = var3++;
                  this.method1350(var4, var5, var6, var14, var15, var16, var17);
               }
            }

            var6 = (short)(var6 + var9.field1602);
         }
      }

      this.method1350(var4, (short)255, (short)0, (byte)17, (byte)0, (byte)0, (byte)0);
      this.field1893 = IDirect3DDevice.CreateVertexDeclaration(this.field1894.field10241, this.field1894.field661);
      this.field1894.method582(this);
   }
}
