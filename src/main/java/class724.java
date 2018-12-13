import jaclib.memory.Stream;
import jaclib.memory.heap.I;
import jaggl.OpenGL;

public class class724 extends Node {
   class847 field2510;
   class291 field2511;
   I field2512;
   float field2513;
   class13 field2514;
   class919 field2515;
   int field2516;
   int[] field2517;
   class424 field2518;
   Stream field2519;

   void method1705(int var1, int var2, int var3) {
      this.field2517[var2 * this.field2511.field7226 + var1] |= 1 << var3;
   }

   void method1706(int var1, int var2, int var3, float var4) {
      int var6;
      int var7;
      if (this.field2516 != -1) {
         class414 var5 = this.field2514.field8581.method4625(this.field2516, 1908731420);
         var6 = var5.field9387 & 255;
         int var9;
         if (var6 != 0 && var5.field9383 != 4) {
            if (var3 < 0) {
               var7 = 0;
            } else if (var3 > 127) {
               var7 = 16777215;
            } else {
               var7 = 131586 * var3;
            }

            if (var6 == 256) {
               var2 = var7;
            } else {
               var9 = 256 - var6;
               var2 = ((var7 & 16711935) * var6 + (var2 & 16711935) * var9 & -16711936) + ((var7 & '\uff00') * var6 + (var2 & '\uff00') * var9 & 16711680) >> 8;
            }
         }

         var7 = var5.field9388 & 255;
         if (var7 != 0) {
            var7 += 256;
            int var8 = ((var2 & 16711680) >> 16) * var7;
            if (var8 > 65535) {
               var8 = 65535;
            }

            var9 = ((var2 & '\uff00') >> 8) * var7;
            if (var9 > 65535) {
               var9 = 65535;
            }

            int var10 = (var2 & 255) * var7;
            if (var10 > 65535) {
               var10 = 65535;
            }

            var2 = (var8 << 8 & 16711680) + (var9 & '\uff00') + (var10 >> 8);
         }
      }

      if (var4 != 1.0F) {
         int var11 = var2 >> 16 & 255;
         var6 = var2 >> 8 & 255;
         var7 = var2 & 255;
         var11 = (int)((float)var11 * var4);
         if (var11 < 0) {
            var11 = 0;
         } else if (var11 > 255) {
            var11 = 255;
         }

         var6 = (int)((float)var6 * var4);
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         var7 = (int)((float)var7 * var4);
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         var2 = var11 << 16 | var6 << 8 | var7;
      }

      this.field2519.b(var1 * 4);
      this.field2519.p((byte)(var2 >> 16));
      this.field2519.p((byte)(var2 >> 8));
      this.field2519.p((byte)var2);
   }

   void method1707(int var1) {
      this.field2519.b(var1 * 4 + 3);
      this.field2519.p(-1);
   }

   void method1708(int var1) {
      this.field2512 = this.field2514.field6868.f(var1 * 4, true);
      this.field2519 = new Stream(this.field2512);
   }

   void method1709(int var1) {
      this.field2519.x();
      class269 var2 = this.field2514.method3628(4, this.field2512, var1 * 4, false);
      if (var2 instanceof class409) {
         this.field2512.t();
      }

      this.field2510 = new class847(var2, 5121, 4, 0);
      this.field2512 = null;
      this.field2519 = null;
   }

   class724(class291 var1, int var2, int var3, class919 var4) {
      this.field2511 = var1;
      this.field2514 = this.field2511.field10502;
      this.field2516 = var2;
      this.field2513 = (float)var3;
      this.field2515 = var4;
      this.field2517 = new int[this.field2511.field7226 * this.field2511.field7225];
      this.field2518 = new class424(this.field2514, 5123, (byte[])null, 1);
   }

   void method1710(int[] var1, int var2) {
      int var3 = 0;
      class782 var4 = this.field2514.field6884;
      var4.field10376 = 0;
      int var5;
      int var6;
      short[] var7;
      int var8;
      int var9;
      int var10;
      if (this.field2514.field6830) {
         for(var5 = 0; var5 < var2; ++var5) {
            var6 = var1[var5];
            var7 = this.field2511.field10517[var6];
            var8 = this.field2517[var6];
            if (var8 != 0 && var7 != null) {
               var9 = 0;
               var10 = 0;

               while(var10 < var7.length) {
                  if ((var8 & 1 << var9++) != 0) {
                     var4.method6362(var7[var10++] & '\uffff', 16711935);
                     ++var3;
                     var4.method6362(var7[var10++] & '\uffff', 16711935);
                     ++var3;
                     var4.method6362(var7[var10++] & '\uffff', 16711935);
                     ++var3;
                  } else {
                     var10 += 3;
                  }
               }
            }
         }
      } else {
         for(var5 = 0; var5 < var2; ++var5) {
            var6 = var1[var5];
            var7 = this.field2511.field10517[var6];
            var8 = this.field2517[var6];
            if (var8 != 0 && var7 != null) {
               var9 = 0;
               var10 = 0;

               while(var10 < var7.length) {
                  if ((var8 & 1 << var9++) != 0) {
                     var4.method6363(var7[var10++] & '\uffff', 1368367793);
                     ++var3;
                     var4.method6363(var7[var10++] & '\uffff', 1368367793);
                     ++var3;
                     var4.method6363(var7[var10++] & '\uffff', 1368367793);
                     ++var3;
                  } else {
                     var10 += 3;
                  }
               }
            }
         }
      }

      if (var3 > 0) {
         this.field2518.method1190(5123, var4.field10375, var4.field10376);
         this.field2514.method3631(this.field2511.field10506, this.field2511.field10486, this.field2510, this.field2511.field10484);
         this.field2514.method3661(this.field2516, (this.field2511.field10490 & 7) != 0, (this.field2511.field10490 & 8) != 0);
         if (this.field2514.field6833) {
            this.field2514.method4887(Integer.MAX_VALUE, this.field2515);
         }

         OpenGL.glMatrixMode(5890);
         OpenGL.glPushMatrix();
         OpenGL.glScalef(1.0F / this.field2513, 1.0F / this.field2513, 1.0F);
         OpenGL.glMatrixMode(5888);
         this.field2514.method3631(this.field2511.field10506, this.field2511.field10486, this.field2510, this.field2511.field10484);
         this.field2514.method3637(this.field2518, 4, 0, var3);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         OpenGL.glMatrixMode(5888);
      }

   }
}
