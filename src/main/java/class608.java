import jaclib.memory.Stream;
import jaggl.I;
import jaggl.OpenGL;
import java.awt.Canvas;

public final class class608 extends class325 {
   class599 field8601 = new class599();
   class599 field8602 = new class599();
   class599 field8603 = new class599();
   class599 field8604 = new class599();
   class599 field8605 = new class599();
   class599 field8606 = new class599();
   class599 field8607 = new class599();
   float[] field8608;
   long field8609;
   int[] field8610 = new int[1000];
   boolean field8611;
   OpenGL field8612;
   class632 field8613;
   int field8614;
   class708[] field8615 = new class708[16];
   boolean field8616;
   int[] field8617;
   class194 field8618;
   String field8619;
   String field8620;
   int field8621;
   boolean field8622;
   boolean field8623;
   boolean field8624;
   boolean field8625;
   boolean field8626;
   int field8627;
   boolean field8628;
   float[] field8629;

   void method765(boolean var1) {
      if (var1) {
         OpenGL.glEnable(32925);
      } else {
         OpenGL.glDisable(32925);
      }

   }

   public class223 method556(String var1) {
      byte[] var2 = this.method5079(var1);
      if (var2 == null) {
         return null;
      } else {
         class222 var3 = this.method558(var2);
         return new class588(this, var3);
      }
   }

   public boolean method554() {
      return this.field8625;
   }

   public boolean method742() {
      return this.field8626;
   }

   class608(OpenGL var1, Canvas var2, long var3, class478 var5, class180 var6, int var7) {
      super(var5, var6, var7, 1);
      new I();
      new I();
      this.field8608 = new float[4];
      this.field8629 = new float[16];
      int[] var8 = new int[1];

      try {
         this.field8612 = var1;
         this.field8612.f();
         this.field8619 = OpenGL.glGetString(7936).toLowerCase();
         this.field8620 = OpenGL.glGetString(7937).toLowerCase();
         if (this.field8619.indexOf("microsoft") == -1 && this.field8619.indexOf("brian paul") == -1 && this.field8619.indexOf("mesa") == -1) {
            String var9 = OpenGL.glGetString(7938);
            String[] var10 = class715.method2097(var9.replace('.', ' '), ' ', 596361763);
            if (var10.length >= 2) {
               int var11;
               try {
                  var11 = class82.method917(var10[0], (short)-8751);
                  int var12 = class82.method917(var10[1], (short)-22429);
                  this.field8621 = var11 * 10 + var12;
               } catch (NumberFormatException var19) {
                  throw new RuntimeException("");
               }

               if (this.field8621 < 12) {
                  throw new RuntimeException("");
               } else {
                  OpenGL.glGetIntegerv(34018, var8, 0);
                  this.field791 = var8[0];
                  if (this.field791 < 2) {
                     throw new RuntimeException("");
                  } else {
                     this.field792 = 8;
                     this.field8611 = this.field8612.a("GL_ARB_vertex_buffer_object");
                     this.field794 = this.field8612.a("GL_ARB_multisample");
                     this.field8623 = this.field8612.a("GL_ARB_texture_rectangle");
                     this.field8612.a("GL_ARB_texture_cube_map");
                     this.field8624 = this.field8612.a("GL_ARB_texture_non_power_of_two");
                     this.field809 = this.field8612.a("GL_EXT_texture3D");
                     this.field8625 = this.field8612.a("GL_ARB_vertex_shader");
                     this.field8612.a("GL_ARB_vertex_program");
                     this.field8626 = this.field8612.a("GL_ARB_fragment_shader");
                     this.field8612.a("GL_ARB_fragment_program");
                     this.field8612.a("GL_EXT_framebuffer_object");
                     this.field8617 = new int[this.field791];
                     this.field793 = this.field8612.a("GL_EXT_framebuffer_object");
                     this.field8612.a("GL_EXT_framebuffer_blit");
                     this.field8612.a("GL_EXT_framebuffer_multisample");
                     if (!this.method554() || !this.method742()) {
                        if (!this.field8612.a("GL_ARB_multitexture")) {
                           throw new RuntimeException("");
                        }

                        if (!this.field8612.a("GL_ARB_texture_env_combine")) {
                           throw new RuntimeException("");
                        }
                     }

                     this.field8627 = Stream.r() ? '荧' : 5121;
                     if (this.field8620.indexOf("radeon") != -1) {
                        var11 = 0;
                        boolean var22 = false;
                        boolean var13 = false;
                        String[] var14 = class715.method2097(this.field8620.replace('/', ' '), ' ', 1460614940);

                        for(int var15 = 0; var15 < var14.length; ++var15) {
                           String var16 = var14[var15];

                           try {
                              if (var16.length() > 0) {
                                 if (var16.charAt(0) == 'x' && var16.length() >= 3 && class808.method2894(var16.substring(1, 3), 2144198876)) {
                                    var16 = var16.substring(1);
                                    var13 = true;
                                 }

                                 if (var16.equals("hd")) {
                                    var22 = true;
                                 } else {
                                    if (var16.startsWith("hd")) {
                                       var16 = var16.substring(2);
                                       var22 = true;
                                    }

                                    if (var16.length() >= 4 && class808.method2894(var16.substring(0, 4), 1769588700)) {
                                       var11 = class82.method917(var16.substring(0, 4), (short)5801);
                                       break;
                                    }
                                 }
                              }
                           } catch (Exception var20) {
                              ;
                           }
                        }

                        if (!var13 && !var22) {
                           if (var11 >= 7000 && var11 <= 7999) {
                              this.field8611 = false;
                           }

                           if (var11 >= 7000 && var11 <= 9250) {
                              this.field809 = false;
                           }
                        }

                        this.field8623 &= this.field8612.a("GL_ARB_half_float_pixel");
                     }

                     this.field8619.indexOf("intel");
                     if (this.field8611) {
                        try {
                           int[] var23 = new int[1];
                           OpenGL.glGenBuffersARB(1, var23, 0);
                        } catch (Throwable var18) {
                           throw new RuntimeException("");
                        }
                     }

                     this.method5017(var2, new class825(this, var2, var3), (byte)-28);
                     this.method4816(var2, (byte)-71);
                     this.method776(32768, false);
                     this.method776(32768, false);
                  }
               }
            } else {
               throw new RuntimeException("");
            }
         } else {
            throw new RuntimeException("");
         }
      } catch (Throwable var21) {
         var21.printStackTrace();
         this.method4996(763787815);
         if (var21 instanceof OutOfMemoryError) {
            throw (OutOfMemoryError)var21;
         } else {
            throw new RuntimeException("");
         }
      }
   }

   public void method779(class344 var1, class344 var2, class344 var3) {
      OpenGL.glMatrixMode(5888);
      this.field680.method270(var1, var2);
      OpenGL.glLoadMatrixf(this.field680.field325, 0);
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadMatrixf(var3.field325, 0);
   }

   void method671() {
      if (this.field775 && this.field722 && this.field677 >= 0) {
         OpenGL.glEnable(2912);
      } else {
         OpenGL.glDisable(2912);
      }

   }

   public boolean method685() {
      return this.field8626;
   }

   public void method4909() {
      OpenGL.glFinish();
   }

   void method4846() {
      super.method4846();
      if (this.field8612 != null) {
         this.field8612.b();
         this.field8612.release();
         this.field8612 = null;
      }

   }

   public float method574() {
      return 0.0F;
   }

   class749 method4819(Canvas var1, int var2, int var3) {
      return new class825(this, var1);
   }

   public class806 method4942() {
      return new class939(this);
   }

   public class893 method5058(int var1, int var2) {
      return new class731(this, class264.field8195, class482.field8401, var1, var2);
   }

   public int[] method5051(int var1, int var2, int var3, int var4) {
      int[] var5 = new int[var3 * var4];
      int var6 = this.field8574.method2493();

      for(int var7 = 0; var7 < var4; ++var7) {
         OpenGL.glReadPixelsi(var1, var6 - var2 - var7 - 1, var3, 1, 32993, this.field8627, var5, var7 * var3);
      }

      return var5;
   }

   void method4797(int var1, int var2) throws class937 {
      this.field8594.method2516();
      if (this.field8581 != null) {
         this.field8581.method4627(1673401622);
      }

   }

   void method668(class920 var1) {
      this.field8613 = (class632)var1;
      this.field8613.method5736();
   }

   public void method4831(int var1, int var2) {
      int var3 = 0;
      if ((var1 & 1) != 0) {
         OpenGL.glClearColor((float)(var2 & 16711680) / 1.671168E7F, (float)(var2 & '\uff00') / 65280.0F, (float)(var2 & 255) / 255.0F, (float)(var2 >>> 24) / 255.0F);
         var3 = 16384;
      }

      if ((var1 & 2) != 0) {
         this.method658(true);
         var3 |= 256;
      }

      if ((var1 & 4) != 0) {
         var3 |= 1024;
      }

      OpenGL.glClear(var3);
   }

   void method584() {
      if (this.field8574 != null) {
         OpenGL.glViewport(this.field719 + this.field783, this.field720 + this.field8574.method2493() - this.field716 - this.field683, this.field717, this.field683);
      }

      OpenGL.glDepthRange(this.field779, this.field702);
   }

   void method585() {
      if (this.field8574 != null) {
         int var1 = this.field719 + this.field709;
         int var2 = this.field720 + this.field8574.method2493() - this.field685;
         int var3 = this.field678 - this.field709;
         int var4 = this.field685 - this.field707;
         if (var3 < 0) {
            var3 = 0;
         }

         if (var4 < 0) {
            var4 = 0;
         }

         OpenGL.glScissor(var1, var2, var3, var4);
      }

   }

   void method586() {
      if (this.field698) {
         OpenGL.glEnable(3089);
      } else {
         OpenGL.glDisable(3089);
      }

   }

   public void method559(class344 var1, class344 var2, class344 var3) {
      OpenGL.glMatrixMode(5888);
      this.field680.method270(var1, var2);
      OpenGL.glLoadMatrixf(this.field680.field325, 0);
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadMatrixf(var3.field325, 0);
   }

   public class621 method5008(class621 var1, class621 var2, float var3, class621 var4) {
      return var3 < 0.5F ? var1 : var2;
   }

   void method599() {
      if (this.field723) {
         OpenGL.glEnable(2929);
      } else {
         OpenGL.glDisable(2929);
      }

   }

   void method681() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.field674.field325, 0);
      OpenGL.glLightfv(16384, 4611, this.field727, 0);
      OpenGL.glLightfv(16385, 4611, this.field692, 0);
   }

   void method710() {
      if (this.field723) {
         OpenGL.glEnable(2929);
      } else {
         OpenGL.glDisable(2929);
      }

   }

   void method688() {
      if (this.field698) {
         OpenGL.glEnable(3089);
      } else {
         OpenGL.glDisable(3089);
      }

   }

   public final void method772(class427 var1, int var2, int var3) {
      byte var4;
      int var5;
      if (var1 == class427.field7387) {
         var4 = 1;
         var5 = var3 * 2;
      } else if (var1 == class427.field7384) {
         var4 = 3;
         var5 = var3 + 1;
      } else if (var1 == class427.field7386) {
         var4 = 4;
         var5 = var3 * 3;
      } else if (var1 == class427.field7385) {
         var4 = 6;
         var5 = var3 + 2;
      } else if (var1 == class427.field7383) {
         var4 = 5;
         var5 = var3 + 2;
      } else {
         var4 = 0;
         var5 = var3;
      }

      OpenGL.glDrawArrays(var4, var2, var5);
   }

   void method579() {
   }

   void method606() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.field674.field325, 0);

      int var1;
      for(var1 = 0; var1 < this.field740; ++var1) {
         class639 var2 = this.field730[var1];
         int var3 = var2.method5905(-1132212405);
         int var4 = 16386 + var1;
         float var5 = var2.method5908(608404512) / 255.0F;
         this.field8608[0] = (float)var2.method5902(823958259);
         this.field8608[1] = (float)var2.method5901(32231990);
         this.field8608[2] = (float)var2.method5904((byte)56);
         this.field8608[3] = 1.0F;
         OpenGL.glLightfv(var4, 4611, this.field8608, 0);
         this.field8608[0] = (float)(var3 >> 16 & 255) * var5;
         this.field8608[1] = (float)(var3 >> 8 & 255) * var5;
         this.field8608[2] = (float)(var3 & 255) * var5;
         this.field8608[3] = 1.0F;
         OpenGL.glLightfv(var4, 4609, this.field8608, 0);
         OpenGL.glLightf(var4, 4617, 1.0F / (float)(var2.method5907(-1643829054) * var2.method5907(-1735214490)));
         OpenGL.glEnable(var4);
      }

      while(var1 < this.field739) {
         OpenGL.glDisable(16386 + var1);
         ++var1;
      }

   }

   boolean method607(class264 var1, class482 var2) {
      return true;
   }

   boolean method608(class264 var1, class482 var2) {
      return this.field809;
   }

   class801 method614(int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      if (!this.field8624 && (!class51.method1530(var1, 1989757601) || !class51.method1530(var2, 2122498233))) {
         if (this.field8623) {
            return new class592(this, var1, var2, var4, var5, var6);
         } else {
            class196 var7 = new class196(this, class264.field8191, class482.field8399, class18.method3687(var1, (byte)16), class18.method3687(var2, (byte)16));
            var7.method2850(0, 0, var1, var2, var4, var5, var6);
            return var7;
         }
      } else {
         return new class196(this, var1, var2, var3, var4, var5, var6);
      }
   }

   class801 method698(class264 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      if (!this.field8624 && (!class51.method1530(var2, 1826170596) || !class51.method1530(var3, 2001166662))) {
         if (this.field8623) {
            return new class592(this, var1, var2, var3, var5, var6, var7);
         } else {
            class196 var8 = new class196(this, var1, class482.field8399, class18.method3687(var2, (byte)16), class18.method3687(var3, (byte)16));
            var8.method2851(0, 0, var2, var3, var5, var1, var6, var7);
            return var8;
         }
      } else {
         return new class196(this, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   class92 method706(class39[] var1) {
      return new class496(var1);
   }

   class33 method615(class264 var1, class482 var2, int var3, int var4) {
      if (!this.field8624 && (!class51.method1530(var3, 2107127417) || !class51.method1530(var4, 2084635583))) {
         return (class33)(this.field8623 ? new class592(this, var1, var2, var3, var4) : new class196(this, var1, var2, class18.method3687(var3, (byte)16), class18.method3687(var4, (byte)16)));
      } else {
         return new class196(this, var1, var2, var3, var4);
      }
   }

   class891 method674(int var1, boolean var2, int[][] var3) {
      return new class863(this, var1, var2, var3);
   }

   class332 method675(class264 var1, int var2, int var3, int var4, boolean var5, byte[] var6) {
      return new class159(this, var1, var2, var3, var4, var5, var6);
   }

   public void method618() {
      int var1 = this.field8617[this.field769];
      if (var1 != 0) {
         this.field8617[this.field769] = 0;
         OpenGL.glBindTexture(var1, 0);
         OpenGL.glDisable(var1);
      }

   }

   void method745() {
      OpenGL.glMatrixMode(5890);
      if (this.field749[this.field769] != class90.field551) {
         OpenGL.glLoadMatrixf(this.field748[this.field769].method300(this.field8629), 0);
      } else {
         OpenGL.glLoadIdentity();
      }

      OpenGL.glMatrixMode(5888);
   }

   void method630() {
      OpenGL.glActiveTexture('蓀' + this.field769);
   }

   void method631() {
      OpenGL.glTexEnvi(8960, 34161, method5070(this.field738[this.field769]));
   }

   void method703() {
      OpenGL.glTexEnvi(8960, 34162, method5070(this.field751[this.field769]));
   }

   final void method686(int var1, class557 var2, boolean var3, boolean var4) {
      OpenGL.glTexEnvi(8960, '薀' + var1, method5071(var2));
      if (var3) {
         OpenGL.glTexEnvi(8960, '薐' + var1, var4 ? 771 : 770);
      } else {
         OpenGL.glTexEnvi(8960, '薐' + var1, var4 ? 769 : 768);
      }

   }

   final void method623(int var1, class557 var2, boolean var3) {
      OpenGL.glTexEnvi(8960, '薈' + var1, method5071(var2));
      OpenGL.glTexEnvi(8960, '薘' + var1, var3 ? 771 : 770);
   }

   void method777(int var1) {
      OpenGL.glPolygonMode(1028, (var1 & 2) != 0 ? 6913 : 6914);
   }

   static final int method5070(class584 var0) {
      if (var0 == class584.field300) {
         return 7681;
      } else if (var0 == class584.field295) {
         return 8448;
      } else if (var0 == class584.field299) {
         return 34165;
      } else if (var0 == class584.field297) {
         return 260;
      } else if (var0 == class584.field298) {
         return 34023;
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final int method5071(class557 var0) {
      if (var0 == class557.field496) {
         return 5890;
      } else if (var0 == class557.field497) {
         return 34167;
      } else if (var0 == class557.field495) {
         return 34168;
      } else if (var0 == class557.field498) {
         return 34166;
      } else {
         throw new IllegalArgumentException();
      }
   }

   void method551(int var1) {
      OpenGL.glColorMask((var1 & 1) != 0, (var1 & 2) != 0, (var1 & 4) != 0, (var1 & 8) != 0);
   }

   public void method4937(int var1, int var2) {
      int var3 = 0;
      if ((var1 & 1) != 0) {
         OpenGL.glClearColor((float)(var2 & 16711680) / 1.671168E7F, (float)(var2 & '\uff00') / 65280.0F, (float)(var2 & 255) / 255.0F, (float)(var2 >>> 24) / 255.0F);
         var3 = 16384;
      }

      if ((var1 & 2) != 0) {
         this.method658(true);
         var3 |= 256;
      }

      if ((var1 & 4) != 0) {
         var3 |= 1024;
      }

      OpenGL.glClear(var3);
   }

   public void method739() {
      int var1 = this.field8617[this.field769];
      if (var1 != 0) {
         this.field8617[this.field769] = 0;
         OpenGL.glBindTexture(var1, 0);
         OpenGL.glDisable(var1);
      }

   }

   void method638() {
      if (this.field775 && this.field722 && this.field677 >= 0) {
         OpenGL.glEnable(2912);
      } else {
         OpenGL.glDisable(2912);
      }

   }

   public class621 method5049(class621 var1, class621 var2, float var3, class621 var4) {
      return var3 < 0.5F ? var1 : var2;
   }

   void method639(boolean var1) {
      if (var1) {
         OpenGL.glEnable(32925);
      } else {
         OpenGL.glDisable(32925);
      }

   }

   final class525 method641(boolean var1) {
      return new class708(this, var1);
   }

   public boolean method684() {
      return this.field8626;
   }

   public void method642(int var1, class525 var2) {
      this.field8615[var1] = (class708)var2;
   }

   void method643(class920 var1) {
      this.field8613 = (class632)var1;
      this.field8613.method5736();
   }

   boolean method724(class264 var1, class482 var2) {
      return this.field809;
   }

   final synchronized void method5072(int var1) {
      class722 var2 = new class722(var1);
      this.field8605.method1282(var2, 1815318204);
   }

   public final void method651(class427 var1, int var2, int var3, int var4, int var5) {
      byte var6;
      int var7;
      if (var1 == class427.field7387) {
         var6 = 1;
         var7 = var5 * 2;
      } else if (var1 == class427.field7384) {
         var6 = 3;
         var7 = var5 + 1;
      } else if (var1 == class427.field7386) {
         var6 = 4;
         var7 = var5 * 3;
      } else if (var1 == class427.field7385) {
         var6 = 6;
         var7 = var5 + 2;
      } else if (var1 == class427.field7383) {
         var6 = 5;
         var7 = var5 + 2;
      } else {
         var6 = 0;
         var7 = var5;
      }

      class482 var8 = this.field8613.method5849();
      OpenGL.glDrawElements(var6, var7, method5081(var8), this.field8613.method5734() + (long)(var4 * var8.field8406 * 685647847));
   }

   void method753() {
      OpenGL.glTexEnvi(8960, 34161, method5070(this.field738[this.field769]));
   }

   public class621 method4794(class621 var1, class621 var2, float var3, class621 var4) {
      return var3 < 0.5F ? var1 : var2;
   }

   final synchronized void method5073(int var1, int var2) {
      class722 var3 = new class722(var2);
      var3.field641 = (long)var1 * 4191220306876042991L;
      this.field8604.method1282(var3, 454001625);
   }

   public int[] method4813(int var1, int var2, int var3, int var4) {
      int[] var5 = new int[var3 * var4];
      int var6 = this.field8574.method2493();

      for(int var7 = 0; var7 < var4; ++var7) {
         OpenGL.glReadPixelsi(var1, var6 - var2 - var7 - 1, var3, 1, 32993, this.field8627, var5, var7 * var3);
      }

      return var5;
   }

   final synchronized void method5074(int var1, int var2) {
      class722 var3 = new class722(var2);
      var3.field641 = (long)var1 * 4191220306876042991L;
      this.field8606.method1282(var3, 228363819);
   }

   final synchronized void method5075(long var1) {
      class568 var3 = new class568();
      var3.field641 = var1 * 4191220306876042991L;
      this.field8601.method1282(var3, 270678246);
   }

   public void method714(class92 var1) {
      class39[] var2 = var1.field555;
      int var3 = 0;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;

      int var7;
      for(var7 = 0; var7 < var2.length; ++var7) {
         class39 var8 = var2[var7];
         class708 var9 = this.field8615[var7];
         int var10 = 0;
         int var11 = var9.method1943();
         long var12 = var9.method5734();
         var9.method5736();

         for(int var14 = 0; var14 < var8.method3359(); ++var14) {
            class61 var15 = var8.method3356(var14);
            switch(var15.field1595) {
            case 0:
               OpenGL.glVertexPointer(3, 5126, var11, var12 + (long)var10);
               var6 = true;
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
            default:
               break;
            case 3:
               OpenGL.glColorPointer(4, 5121, var11, var12 + (long)var10);
               var4 = true;
               break;
            case 5:
               OpenGL.glClientActiveTexture('蓀' + var3++);
               OpenGL.glTexCoordPointer(3, 5126, var11, var12 + (long)var10);
               break;
            case 8:
               OpenGL.glClientActiveTexture('蓀' + var3++);
               OpenGL.glTexCoordPointer(4, 5126, var11, var12 + (long)var10);
               break;
            case 9:
               OpenGL.glClientActiveTexture('蓀' + var3++);
               OpenGL.glTexCoordPointer(1, 5126, var11, var12 + (long)var10);
               break;
            case 10:
               OpenGL.glClientActiveTexture('蓀' + var3++);
               OpenGL.glTexCoordPointer(2, 5126, var11, var12 + (long)var10);
               break;
            case 11:
               OpenGL.glNormalPointer(5126, var11, var12 + (long)var10);
               var5 = true;
            }

            var10 += var15.field1602;
         }
      }

      if (this.field8622 != var6) {
         if (var6) {
            OpenGL.glEnableClientState(32884);
         } else {
            OpenGL.glDisableClientState(32884);
         }

         this.field8622 = var6;
      }

      if (this.field8628 != var5) {
         if (var5) {
            OpenGL.glEnableClientState(32885);
         } else {
            OpenGL.glDisableClientState(32885);
         }

         this.field8628 = var5;
      }

      if (this.field8616 != var4) {
         if (var4) {
            OpenGL.glEnableClientState(32886);
         } else {
            OpenGL.glDisableClientState(32886);
         }

         this.field8616 = var4;
      }

      if (this.field8614 < var3) {
         for(var7 = this.field8614; var7 < var3; ++var7) {
            OpenGL.glClientActiveTexture('蓀' + var7);
            OpenGL.glEnableClientState(32888);
         }

         this.field8614 = var3;
      } else if (this.field8614 > var3) {
         for(var7 = var3; var7 < this.field8614; ++var7) {
            OpenGL.glClientActiveTexture('蓀' + var7);
            OpenGL.glDisableClientState(32888);
         }

         this.field8614 = var3;
      }

   }

   final class920 method640(boolean var1) {
      return new class632(this, class482.field8400, var1);
   }

   static int method5076(class264 var0) {
      switch(var0.field8200 * -976336893) {
      case 1:
         return 6409;
      case 2:
         return 6402;
      case 3:
         return 6410;
      case 4:
      case 6:
      case 8:
      default:
         throw new IllegalStateException();
      case 5:
         return 6407;
      case 7:
         return 6406;
      case 9:
         return 6408;
      }
   }

   static int method5077(class264 var0, class482 var1) {
      if (var1 == class482.field8399) {
         switch(var0.field8200 * -976336893) {
         case 0:
            return 33779;
         case 1:
            return 6409;
         case 2:
         case 4:
         case 6:
         default:
            throw new IllegalArgumentException();
         case 3:
            return 6410;
         case 5:
            return 6407;
         case 7:
            return 6406;
         case 8:
            return 33777;
         case 9:
            return 6408;
         }
      } else if (var1 == class482.field8400) {
         switch(var0.field8200 * -976336893) {
         case 1:
            return 32834;
         case 2:
            return 33189;
         case 3:
            return 36219;
         case 4:
         case 6:
         case 8:
         default:
            throw new IllegalArgumentException();
         case 5:
            return 32852;
         case 7:
            return 32830;
         case 9:
            return 32859;
         }
      } else if (var1 == class482.field8401) {
         switch(var0.field8200 * -976336893) {
         case 2:
            return 33190;
         default:
            throw new IllegalArgumentException();
         }
      } else if (var1 == class482.field8396) {
         switch(var0.field8200 * -976336893) {
         case 1:
            return 34846;
         case 2:
         case 4:
         case 6:
         case 8:
         default:
            throw new IllegalArgumentException();
         case 3:
            return 34847;
         case 5:
            return 34843;
         case 7:
            return 34844;
         case 9:
            return 34842;
         }
      } else if (var1 == class482.field8403) {
         switch(var0.field8200 * -976336893) {
         case 1:
            return 34840;
         case 2:
         case 4:
         case 6:
         case 8:
         default:
            throw new IllegalArgumentException();
         case 3:
            return 34841;
         case 5:
            return 34837;
         case 7:
            return 34838;
         case 9:
            return 34836;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method4891(boolean var1) {
   }

   void method653(int var1) {
      OpenGL.glPolygonMode(1028, (var1 & 2) != 0 ? 6913 : 6914);
   }

   public final void method657(class427 var1, int var2, int var3) {
      byte var4;
      int var5;
      if (var1 == class427.field7387) {
         var4 = 1;
         var5 = var3 * 2;
      } else if (var1 == class427.field7384) {
         var4 = 3;
         var5 = var3 + 1;
      } else if (var1 == class427.field7386) {
         var4 = 4;
         var5 = var3 * 3;
      } else if (var1 == class427.field7385) {
         var4 = 6;
         var5 = var3 + 2;
      } else if (var1 == class427.field7383) {
         var4 = 5;
         var5 = var3 + 2;
      } else {
         var4 = 0;
         var5 = var3;
      }

      OpenGL.glDrawArrays(var4, var2, var5);
   }

   void method669() {
      OpenGL.glDepthMask(this.field721 && this.field681);
   }

   void method670() {
      this.field8608[0] = this.field735 * this.field806;
      this.field8608[1] = this.field735 * this.field733;
      this.field8608[2] = this.field735 * this.field734;
      this.field8608[3] = 1.0F;
      OpenGL.glLightModelfv(2899, this.field8608, 0);
   }

   class92 method663(class39[] var1) {
      return new class496(var1);
   }

   void method604() {
      if (this.field725) {
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
      } else {
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
      }

   }

   public void method4897() {
      OpenGL.glFinish();
   }

   void method4822() {
      super.method4846();
      if (this.field8612 != null) {
         this.field8612.b();
         this.field8612.release();
         this.field8612 = null;
      }

   }

   void method5007() {
      super.method4846();
      if (this.field8612 != null) {
         this.field8612.b();
         this.field8612.release();
         this.field8612 = null;
      }

   }

   void method4899() {
      super.method4846();
      if (this.field8612 != null) {
         this.field8612.b();
         this.field8612.release();
         this.field8612 = null;
      }

   }

   void method4900() {
      super.method4846();
      if (this.field8612 != null) {
         this.field8612.b();
         this.field8612.release();
         this.field8612 = null;
      }

   }

   public final synchronized void method5044(int var1) {
      int var2 = 0;
      var1 &= Integer.MAX_VALUE;

      class722 var3;
      while(!this.field8603.method1284((byte)43)) {
         var3 = (class722)this.field8603.method1285(1808910647);
         this.field8610[var2++] = (int)(var3.field641 * 7051297995265073167L);
         this.field668 -= var3.field3631 * -774922497;
         if (var2 == 1000) {
            OpenGL.glDeleteBuffersARB(var2, this.field8610, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteBuffersARB(var2, this.field8610, 0);
         var2 = 0;
      }

      while(!this.field8604.method1284((byte)46)) {
         var3 = (class722)this.field8604.method1285(1720149730);
         this.field8610[var2++] = (int)(var3.field641 * 7051297995265073167L);
         this.field667 -= var3.field3631 * -774922497;
         if (var2 == 1000) {
            OpenGL.glDeleteTextures(var2, this.field8610, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteTextures(var2, this.field8610, 0);
         var2 = 0;
      }

      while(!this.field8605.method1284((byte)60)) {
         var3 = (class722)this.field8605.method1285(1586924584);
         this.field8610[var2++] = var3.field3631 * -774922497;
         if (var2 == 1000) {
            OpenGL.glDeleteFramebuffersEXT(var2, this.field8610, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteFramebuffersEXT(var2, this.field8610, 0);
         var2 = 0;
      }

      while(!this.field8606.method1284((byte)42)) {
         var3 = (class722)this.field8606.method1285(1650317601);
         this.field8610[var2++] = (int)(var3.field641 * 7051297995265073167L);
         this.field762 -= var3.field3631 * -774922497;
         if (var2 == 1000) {
            OpenGL.glDeleteRenderbuffersEXT(var2, this.field8610, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteRenderbuffersEXT(var2, this.field8610, 0);
         boolean var4 = false;
      }

      while(!this.field8602.method1284((byte)86)) {
         var3 = (class722)this.field8602.method1285(1832837170);
         OpenGL.glDeleteLists((int)(var3.field641 * 7051297995265073167L), var3.field3631 * -774922497);
      }

      class568 var5;
      while(!this.field8607.method1284((byte)48)) {
         var5 = this.field8607.method1285(1814788261);
         OpenGL.glDeleteProgram((int)(var5.field641 * 7051297995265073167L));
      }

      while(!this.field8601.method1284((byte)126)) {
         var5 = this.field8601.method1285(1792328753);
         OpenGL.glDeleteShader((int)(var5.field641 * 7051297995265073167L));
      }

      while(!this.field8602.method1284((byte)79)) {
         var3 = (class722)this.field8602.method1285(1714583295);
         OpenGL.glDeleteLists((int)(var3.field641 * 7051297995265073167L), var3.field3631 * -774922497);
      }

      if (this.method4802() > 100663296 && class27.method3468((byte)1) > this.field8609 + 60000L) {
         System.gc();
         this.field8609 = class27.method3468((byte)1);
      }

      super.method4801(var1);
   }

   public void method4825(boolean var1) {
   }

   void method759() {
      if (this.field753) {
         OpenGL.glEnable(3008);
      } else {
         OpenGL.glDisable(3008);
      }

   }

   class749 method4974(Canvas var1, int var2, int var3) {
      return new class825(this, var1);
   }

   void method722() {
      OpenGL.glDepthFunc(515);
      OpenGL.glEnable(2884);
      OpenGL.glCullFace(1029);
      OpenGL.glClearDepth(1.0F);
      OpenGL.glAlphaFunc(516, 0.0F);
      OpenGL.glPolygonMode(1028, 6914);

      for(int var1 = this.field791 - 1; var1 >= 0; --var1) {
         OpenGL.glActiveTexture('蓀' + var1);
         OpenGL.glTexEnvi(8960, 8704, 34160);
         OpenGL.glTexEnvi(8960, 34161, 8448);
         OpenGL.glTexEnvi(8960, 34178, 34166);
         OpenGL.glTexEnvi(8960, 34162, 8448);
         OpenGL.glTexEnvi(8960, 34186, 34166);
      }

      OpenGL.glTexEnvi(8960, 34186, 34168);
      OpenGL.glShadeModel(7425);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glColorMaterial(1028, 5634);
      OpenGL.glEnable(2903);
      float[] var4 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};

      for(int var2 = 0; var2 < 8; ++var2) {
         int var3 = 16384 + var2;
         OpenGL.glLightfv(var3, 4608, var4, 0);
         OpenGL.glLightf(var3, 4615, 0.0F);
         OpenGL.glLightf(var3, 4616, 0.0F);
      }

      OpenGL.glFogf(2914, 0.95F);
      OpenGL.glFogi(2917, 9729);
      OpenGL.glHint(3156, 4353);
      this.field8612.setSwapInterval(0);
      super.method722();
   }

   public int[] method4918(int var1, int var2, int var3, int var4) {
      int[] var5 = new int[var3 * var4];
      int var6 = this.field8574.method2493();

      for(int var7 = 0; var7 < var4; ++var7) {
         OpenGL.glReadPixelsi(var1, var6 - var2 - var7 - 1, var3, 1, 32993, this.field8627, var5, var7 * var3);
      }

      return var5;
   }

   public void method4914() {
      if (this.field8574 != null) {
         int var1 = this.field8574.method2481();
         int var2 = this.field8574.method2493();
         if (var1 > 0 || var2 > 0) {
            int var3 = this.field783;
            int var4 = this.field716;
            int var5 = this.field717;
            int var6 = this.field683;
            this.method4824();
            int var7 = this.field709;
            int var8 = this.field678;
            int var9 = this.field707;
            int var10 = this.field685;
            this.method4827();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method595();
            this.method589(false);
            this.method676(false);
            this.method598(false);
            this.method658(false);
            this.method617((class659)null);
            this.method619(1);
            this.method633(0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, var1, var2, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method4986(var7, var9, var8, var10);
            this.method5059(var3, var4, var5, var6);
         }
      }

   }

   public void method4935(int var1, int var2) {
      int var3 = 0;
      if ((var1 & 1) != 0) {
         OpenGL.glClearColor((float)(var2 & 16711680) / 1.671168E7F, (float)(var2 & '\uff00') / 65280.0F, (float)(var2 & 255) / 255.0F, (float)(var2 >>> 24) / 255.0F);
         var3 = 16384;
      }

      if ((var1 & 2) != 0) {
         this.method658(true);
         var3 |= 256;
      }

      if ((var1 & 4) != 0) {
         var3 |= 1024;
      }

      OpenGL.glClear(var3);
   }

   public void method5023(int var1, int var2) {
      int var3 = 0;
      if ((var1 & 1) != 0) {
         OpenGL.glClearColor((float)(var2 & 16711680) / 1.671168E7F, (float)(var2 & '\uff00') / 65280.0F, (float)(var2 & 255) / 255.0F, (float)(var2 >>> 24) / 255.0F);
         var3 = 16384;
      }

      if ((var1 & 2) != 0) {
         this.method658(true);
         var3 |= 256;
      }

      if ((var1 & 4) != 0) {
         var3 |= 1024;
      }

      OpenGL.glClear(var3);
   }

   class801 method712(class264 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7) {
      if (!this.field8624 && (!class51.method1530(var2, 2083560637) || !class51.method1530(var3, 1982249624))) {
         if (this.field8623) {
            return new class592(this, var1, var2, var3, var5, var6, var7);
         } else {
            class196 var8 = new class196(this, var1, class482.field8403, class18.method3687(var2, (byte)16), class18.method3687(var3, (byte)16));
            var8.method3718(0, 0, var2, var3, var5, var1, var6, var7);
            return var8;
         }
      } else {
         return new class196(this, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   public void method4938(int var1, int var2) {
      int var3 = 0;
      if ((var1 & 1) != 0) {
         OpenGL.glClearColor((float)(var2 & 16711680) / 1.671168E7F, (float)(var2 & '\uff00') / 65280.0F, (float)(var2 & 255) / 255.0F, (float)(var2 >>> 24) / 255.0F);
         var3 = 16384;
      }

      if ((var1 & 2) != 0) {
         this.method658(true);
         var3 |= 256;
      }

      if ((var1 & 4) != 0) {
         var3 |= 1024;
      }

      OpenGL.glClear(var3);
   }

   public class305 method4892() {
      int var1 = -1;
      if (this.field8619.indexOf("nvidia") != -1) {
         var1 = 4318;
      } else if (this.field8619.indexOf("intel") != -1) {
         var1 = 32902;
      } else if (this.field8619.indexOf("ati") != -1) {
         var1 = 4098;
      }

      return new class305(var1, "OpenGL", this.field8621, this.field8620, 0L);
   }

   class801 method774(class264 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      if (!this.field8624 && (!class51.method1530(var2, 2068913262) || !class51.method1530(var3, 1962445088))) {
         if (this.field8623) {
            return new class592(this, var1, var2, var3, var5, var6, var7);
         } else {
            class196 var8 = new class196(this, var1, class482.field8399, class18.method3687(var2, (byte)16), class18.method3687(var3, (byte)16));
            var8.method2851(0, 0, var2, var3, var5, var1, var6, var7);
            return var8;
         }
      } else {
         return new class196(this, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   public class806 method5004() {
      return new class939(this);
   }

   class801 method727(class264 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      if (!this.field8624 && (!class51.method1530(var2, 1902374633) || !class51.method1530(var3, 1834416496))) {
         if (this.field8623) {
            return new class592(this, var1, var2, var3, var5, var6, var7);
         } else {
            class196 var8 = new class196(this, var1, class482.field8399, class18.method3687(var2, (byte)16), class18.method3687(var3, (byte)16));
            var8.method2851(0, 0, var2, var3, var5, var1, var6, var7);
            return var8;
         }
      } else {
         return new class196(this, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   public boolean method644() {
      return this.field8625;
   }

   public boolean method682() {
      return this.field8626;
   }

   public boolean method683() {
      return this.field8626;
   }

   public class893 method5034(int var1, int var2) {
      return new class731(this, class264.field8195, class482.field8401, var1, var2);
   }

   public float method655() {
      return 0.0F;
   }

   void method5078() {
      OpenGL.glDepthFunc(515);
      OpenGL.glEnable(2884);
      OpenGL.glCullFace(1029);
      OpenGL.glClearDepth(1.0F);
      OpenGL.glAlphaFunc(516, 0.0F);
      OpenGL.glPolygonMode(1028, 6914);

      for(int var1 = this.field791 - 1; var1 >= 0; --var1) {
         OpenGL.glActiveTexture('蓀' + var1);
         OpenGL.glTexEnvi(8960, 8704, 34160);
         OpenGL.glTexEnvi(8960, 34161, 8448);
         OpenGL.glTexEnvi(8960, 34178, 34166);
         OpenGL.glTexEnvi(8960, 34162, 8448);
         OpenGL.glTexEnvi(8960, 34186, 34166);
      }

      OpenGL.glTexEnvi(8960, 34186, 34168);
      OpenGL.glShadeModel(7425);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glColorMaterial(1028, 5634);
      OpenGL.glEnable(2903);
      float[] var4 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};

      for(int var2 = 0; var2 < 8; ++var2) {
         int var3 = 16384 + var2;
         OpenGL.glLightfv(var3, 4608, var4, 0);
         OpenGL.glLightf(var3, 4615, 0.0F);
         OpenGL.glLightf(var3, 4616, 0.0F);
      }

      OpenGL.glFogf(2914, 0.95F);
      OpenGL.glFogi(2917, 9729);
      OpenGL.glHint(3156, 4353);
      this.field8612.setSwapInterval(0);
      super.method722();
   }

   public float method693() {
      return 0.0F;
   }

   public float method694() {
      return 0.0F;
   }

   byte[] method5079(String var1) {
      return this.method557("gl", var1);
   }

   public void method5046() {
      if (this.field8574 != null) {
         int var1 = this.field8574.method2481();
         int var2 = this.field8574.method2493();
         if (var1 > 0 || var2 > 0) {
            int var3 = this.field783;
            int var4 = this.field716;
            int var5 = this.field717;
            int var6 = this.field683;
            this.method4824();
            int var7 = this.field709;
            int var8 = this.field678;
            int var9 = this.field707;
            int var10 = this.field685;
            this.method4827();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method595();
            this.method589(false);
            this.method676(false);
            this.method598(false);
            this.method658(false);
            this.method617((class659)null);
            this.method619(1);
            this.method633(0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, var1, var2, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method4986(var7, var9, var8, var10);
            this.method5059(var3, var4, var5, var6);
         }
      }

   }

   void method634() {
      if (this.field753) {
         OpenGL.glEnable(3008);
      } else {
         OpenGL.glDisable(3008);
      }

   }

   final synchronized void method5080(int var1, int var2) {
      class722 var3 = new class722(var2);
      var3.field641 = (long)var1 * 4191220306876042991L;
      this.field8603.method1282(var3, 789899827);
   }

   void method699() {
      if (this.field698) {
         OpenGL.glEnable(3089);
      } else {
         OpenGL.glDisable(3089);
      }

   }

   void method689() {
      if (this.field775 && this.field722 && this.field677 >= 0) {
         OpenGL.glEnable(2912);
      } else {
         OpenGL.glDisable(2912);
      }

   }

   void method4894(int var1, int var2) throws class937 {
      this.field8594.method2516();
      if (this.field8581 != null) {
         this.field8581.method4627(1141997012);
      }

   }

   void method701() {
      if (this.field698) {
         OpenGL.glEnable(3089);
      } else {
         OpenGL.glDisable(3089);
      }

   }

   public void method705(class344 var1) {
      float[] var2 = var1.field325;
      var2[1] = -var2[1];
      var2[5] = -var2[5];
      var2[9] = -var2[9];
      var2[13] = -var2[13];
   }

   void method696() {
      this.field8608[0] = this.field735 * this.field806;
      this.field8608[1] = this.field735 * this.field733;
      this.field8608[2] = this.field735 * this.field734;
      this.field8608[3] = 1.0F;
      OpenGL.glLightModelfv(2899, this.field8608, 0);
   }

   void method711() {
      OpenGL.glDepthMask(this.field721 && this.field681);
   }

   void method700() {
      OpenGL.glDepthMask(this.field721 && this.field681);
   }

   class801 method731(class264 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7) {
      if (!this.field8624 && (!class51.method1530(var2, 1987260483) || !class51.method1530(var3, 2045072187))) {
         if (this.field8623) {
            return new class592(this, var1, var2, var3, var5, var6, var7);
         } else {
            class196 var8 = new class196(this, var1, class482.field8403, class18.method3687(var2, (byte)16), class18.method3687(var3, (byte)16));
            var8.method3718(0, 0, var2, var3, var5, var1, var6, var7);
            return var8;
         }
      } else {
         return new class196(this, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   public class305 method4893() {
      int var1 = -1;
      if (this.field8619.indexOf("nvidia") != -1) {
         var1 = 4318;
      } else if (this.field8619.indexOf("intel") != -1) {
         var1 = 32902;
      } else if (this.field8619.indexOf("ati") != -1) {
         var1 = 4098;
      }

      return new class305(var1, "OpenGL", this.field8621, this.field8620, 0L);
   }

   void method691() {
      this.field8608[0] = this.field735 * this.field806;
      this.field8608[1] = this.field735 * this.field733;
      this.field8608[2] = this.field735 * this.field734;
      this.field8608[3] = 1.0F;
      OpenGL.glLightModelfv(2899, this.field8608, 0);
   }

   void method707() {
      if (this.field708 && !this.field726) {
         OpenGL.glEnable(2896);
      } else {
         OpenGL.glDisable(2896);
      }

   }

   void method715() {
      this.field8608[0] = this.field735 * this.field806;
      this.field8608[1] = this.field735 * this.field733;
      this.field8608[2] = this.field735 * this.field734;
      this.field8608[3] = 1.0F;
      OpenGL.glLightModelfv(2899, this.field8608, 0);
   }

   void method716() {
      this.field8608[0] = this.field808 * this.field806;
      this.field8608[1] = this.field808 * this.field733;
      this.field8608[2] = this.field808 * this.field734;
      this.field8608[3] = 1.0F;
      OpenGL.glLightfv(16384, 4609, this.field8608, 0);
      this.field8608[0] = -this.field737 * this.field806;
      this.field8608[1] = -this.field737 * this.field733;
      this.field8608[2] = -this.field737 * this.field734;
      this.field8608[3] = 1.0F;
      OpenGL.glLightfv(16385, 4609, this.field8608, 0);
   }

   void method664() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.field674.field325, 0);
      OpenGL.glLightfv(16384, 4611, this.field727, 0);
      OpenGL.glLightfv(16385, 4611, this.field692, 0);
   }

   void method717() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.field674.field325, 0);
      OpenGL.glLightfv(16384, 4611, this.field727, 0);
      OpenGL.glLightfv(16385, 4611, this.field692, 0);
   }

   void method718() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.field674.field325, 0);
      OpenGL.glLightfv(16384, 4611, this.field727, 0);
      OpenGL.glLightfv(16385, 4611, this.field692, 0);
   }

   void method601() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.field674.field325, 0);
      OpenGL.glLightfv(16384, 4611, this.field727, 0);
      OpenGL.glLightfv(16385, 4611, this.field692, 0);
   }

   class891 method734(int var1, boolean var2, int[][] var3) {
      return new class863(this, var1, var2, var3);
   }

   void method750() {
      OpenGL.glActiveTexture('蓀' + this.field769);
   }

   void method659() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.field674.field325, 0);

      int var1;
      for(var1 = 0; var1 < this.field740; ++var1) {
         class639 var2 = this.field730[var1];
         int var3 = var2.method5905(-2040590792);
         int var4 = 16386 + var1;
         float var5 = var2.method5908(608404512) / 255.0F;
         this.field8608[0] = (float)var2.method5902(823958259);
         this.field8608[1] = (float)var2.method5901(-630869458);
         this.field8608[2] = (float)var2.method5904((byte)86);
         this.field8608[3] = 1.0F;
         OpenGL.glLightfv(var4, 4611, this.field8608, 0);
         this.field8608[0] = (float)(var3 >> 16 & 255) * var5;
         this.field8608[1] = (float)(var3 >> 8 & 255) * var5;
         this.field8608[2] = (float)(var3 & 255) * var5;
         this.field8608[3] = 1.0F;
         OpenGL.glLightfv(var4, 4609, this.field8608, 0);
         OpenGL.glLightf(var4, 4617, 1.0F / (float)(var2.method5907(-1089052693) * var2.method5907(-2044712108)));
         OpenGL.glEnable(var4);
      }

      while(var1 < this.field739) {
         OpenGL.glDisable(16386 + var1);
         ++var1;
      }

   }

   boolean method720(class264 var1, class482 var2) {
      return true;
   }

   boolean method721(class264 var1, class482 var2) {
      return true;
   }

   boolean method569(class264 var1, class482 var2) {
      return this.field809;
   }

   boolean method723(class264 var1, class482 var2) {
      return this.field809;
   }

   void method757(int var1) {
      OpenGL.glColorMask((var1 & 1) != 0, (var1 & 2) != 0, (var1 & 4) != 0, (var1 & 8) != 0);
   }

   boolean method665(class264 var1, class482 var2) {
      return this.field809;
   }

   boolean method725(class264 var1, class482 var2) {
      return this.field809;
   }

   class801 method692(class264 var1, class482 var2, int var3, int var4) {
      return this.method615(var1, var2, var3, var4);
   }

   public void method4920(boolean var1) {
   }

   class801 method629(class264 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      if (!this.field8624 && (!class51.method1530(var2, 1853172983) || !class51.method1530(var3, 1827151414))) {
         if (this.field8623) {
            return new class592(this, var1, var2, var3, var5, var6, var7);
         } else {
            class196 var8 = new class196(this, var1, class482.field8399, class18.method3687(var2, (byte)16), class18.method3687(var3, (byte)16));
            var8.method2851(0, 0, var2, var3, var5, var1, var6, var7);
            return var8;
         }
      } else {
         return new class196(this, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   final class525 method667(boolean var1) {
      return new class708(this, var1);
   }

   void method4895(int var1, int var2) throws class937 {
      this.field8594.method2516();
      if (this.field8581 != null) {
         this.field8581.method4627(-85834145);
      }

   }

   class801 method730(class264 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7) {
      if (!this.field8624 && (!class51.method1530(var2, 1898417444) || !class51.method1530(var3, 2072931351))) {
         if (this.field8623) {
            return new class592(this, var1, var2, var3, var5, var6, var7);
         } else {
            class196 var8 = new class196(this, var1, class482.field8403, class18.method3687(var2, (byte)16), class18.method3687(var3, (byte)16));
            var8.method3718(0, 0, var2, var3, var5, var1, var6, var7);
            return var8;
         }
      } else {
         return new class196(this, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   public final synchronized void method4801(int var1) {
      int var2 = 0;
      var1 &= Integer.MAX_VALUE;

      class722 var3;
      while(!this.field8603.method1284((byte)48)) {
         var3 = (class722)this.field8603.method1285(1595707002);
         this.field8610[var2++] = (int)(var3.field641 * 7051297995265073167L);
         this.field668 -= var3.field3631 * -774922497;
         if (var2 == 1000) {
            OpenGL.glDeleteBuffersARB(var2, this.field8610, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteBuffersARB(var2, this.field8610, 0);
         var2 = 0;
      }

      while(!this.field8604.method1284((byte)112)) {
         var3 = (class722)this.field8604.method1285(1563710334);
         this.field8610[var2++] = (int)(var3.field641 * 7051297995265073167L);
         this.field667 -= var3.field3631 * -774922497;
         if (var2 == 1000) {
            OpenGL.glDeleteTextures(var2, this.field8610, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteTextures(var2, this.field8610, 0);
         var2 = 0;
      }

      while(!this.field8605.method1284((byte)78)) {
         var3 = (class722)this.field8605.method1285(1735812614);
         this.field8610[var2++] = var3.field3631 * -774922497;
         if (var2 == 1000) {
            OpenGL.glDeleteFramebuffersEXT(var2, this.field8610, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteFramebuffersEXT(var2, this.field8610, 0);
         var2 = 0;
      }

      while(!this.field8606.method1284((byte)88)) {
         var3 = (class722)this.field8606.method1285(2070970334);
         this.field8610[var2++] = (int)(var3.field641 * 7051297995265073167L);
         this.field762 -= var3.field3631 * -774922497;
         if (var2 == 1000) {
            OpenGL.glDeleteRenderbuffersEXT(var2, this.field8610, 0);
            var2 = 0;
         }
      }

      if (var2 > 0) {
         OpenGL.glDeleteRenderbuffersEXT(var2, this.field8610, 0);
         boolean var4 = false;
      }

      while(!this.field8602.method1284((byte)72)) {
         var3 = (class722)this.field8602.method1285(1996234534);
         OpenGL.glDeleteLists((int)(var3.field641 * 7051297995265073167L), var3.field3631 * -774922497);
      }

      class568 var5;
      while(!this.field8607.method1284((byte)121)) {
         var5 = this.field8607.method1285(1584885862);
         OpenGL.glDeleteProgram((int)(var5.field641 * 7051297995265073167L));
      }

      while(!this.field8601.method1284((byte)47)) {
         var5 = this.field8601.method1285(1940978688);
         OpenGL.glDeleteShader((int)(var5.field641 * 7051297995265073167L));
      }

      while(!this.field8602.method1284((byte)39)) {
         var3 = (class722)this.field8602.method1285(1755537674);
         OpenGL.glDeleteLists((int)(var3.field641 * 7051297995265073167L), var3.field3631 * -774922497);
      }

      if (this.method4802() > 100663296 && class27.method3468((byte)1) > this.field8609 + 60000L) {
         System.gc();
         this.field8609 = class27.method3468((byte)1);
      }

      super.method4801(var1);
   }

   class801 method662(class264 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7) {
      if (!this.field8624 && (!class51.method1530(var2, 2060582659) || !class51.method1530(var3, 1956447406))) {
         if (this.field8623) {
            return new class592(this, var1, var2, var3, var5, var6, var7);
         } else {
            class196 var8 = new class196(this, var1, class482.field8403, class18.method3687(var2, (byte)16), class18.method3687(var3, (byte)16));
            var8.method3718(0, 0, var2, var3, var5, var1, var6, var7);
            return var8;
         }
      } else {
         return new class196(this, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   class801 method732(int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      if (!this.field8624 && (!class51.method1530(var1, 1897882026) || !class51.method1530(var2, 1916430478))) {
         if (this.field8623) {
            return new class592(this, var1, var2, var4, var5, var6);
         } else {
            class196 var7 = new class196(this, class264.field8191, class482.field8399, class18.method3687(var1, (byte)16), class18.method3687(var2, (byte)16));
            var7.method2850(0, 0, var1, var2, var4, var5, var6);
            return var7;
         }
      } else {
         return new class196(this, var1, var2, var3, var4, var5, var6);
      }
   }

   class801 method733(int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      if (!this.field8624 && (!class51.method1530(var1, 1872676773) || !class51.method1530(var2, 1860279386))) {
         if (this.field8623) {
            return new class592(this, var1, var2, var4, var5, var6);
         } else {
            class196 var7 = new class196(this, class264.field8191, class482.field8399, class18.method3687(var1, (byte)16), class18.method3687(var2, (byte)16));
            var7.method2850(0, 0, var1, var2, var4, var5, var6);
            return var7;
         }
      } else {
         return new class196(this, var1, var2, var3, var4, var5, var6);
      }
   }

   void method635() {
      byte var1 = 0;
      byte var2 = 0;
      if (this.field810 == 0) {
         var1 = 0;
         var2 = 0;
      } else if (this.field810 == 1) {
         var1 = 1;
         var2 = 0;
      } else if (this.field810 == 2) {
         var1 = 1;
         var2 = 1;
      }

      if (this.field712 == class119.field2149) {
         OpenGL.glBlendFuncSeparate(770, 771, var1, var2);
      } else if (this.field712 == class119.field2147) {
         OpenGL.glBlendFuncSeparate(1, 1, var1, var2);
      } else if (this.field712 == class119.field2148) {
         OpenGL.glBlendFuncSeparate(774, 1, var1, var2);
      }

   }

   public class305 method4795() {
      int var1 = -1;
      if (this.field8619.indexOf("nvidia") != -1) {
         var1 = 4318;
      } else if (this.field8619.indexOf("intel") != -1) {
         var1 = 32902;
      } else if (this.field8619.indexOf("ati") != -1) {
         var1 = 4098;
      }

      return new class305(var1, "OpenGL", this.field8621, this.field8620, 0L);
   }

   class332 method603(class264 var1, int var2, int var3, int var4, boolean var5, byte[] var6) {
      return new class159(this, var1, var2, var3, var4, var5, var6);
   }

   void method728() {
      if (this.field753) {
         OpenGL.glEnable(3008);
      } else {
         OpenGL.glDisable(3008);
      }

   }

   class33 method738(class264 var1, class482 var2, int var3, int var4) {
      if (!this.field8624 && (!class51.method1530(var3, 2050497405) || !class51.method1530(var4, 1840822084))) {
         return (class33)(this.field8623 ? new class592(this, var1, var2, var3, var4) : new class196(this, var1, var2, class18.method3687(var3, (byte)16), class18.method3687(var4, (byte)16)));
      } else {
         return new class196(this, var1, var2, var3, var4);
      }
   }

   class33 method650(class264 var1, class482 var2, int var3, int var4) {
      if (!this.field8624 && (!class51.method1530(var3, 2027556559) || !class51.method1530(var4, 2075532110))) {
         return (class33)(this.field8623 ? new class592(this, var1, var2, var3, var4) : new class196(this, var1, var2, class18.method3687(var3, (byte)16), class18.method3687(var4, (byte)16)));
      } else {
         return new class196(this, var1, var2, var3, var4);
      }
   }

   class33 method672(class264 var1, class482 var2, int var3, int var4) {
      if (!this.field8624 && (!class51.method1530(var3, 2073016154) || !class51.method1530(var4, 2096946547))) {
         return (class33)(this.field8623 ? new class592(this, var1, var2, var3, var4) : new class196(this, var1, var2, class18.method3687(var3, (byte)16), class18.method3687(var4, (byte)16)));
      } else {
         return new class196(this, var1, var2, var3, var4);
      }
   }

   void method756() {
      OpenGL.glTexEnvi(8960, 34162, method5070(this.field751[this.field769]));
   }

   final void method741(int var1, class557 var2, boolean var3, boolean var4) {
      OpenGL.glTexEnvi(8960, '薀' + var1, method5071(var2));
      if (var3) {
         OpenGL.glTexEnvi(8960, '薐' + var1, var4 ? 771 : 770);
      } else {
         OpenGL.glTexEnvi(8960, '薐' + var1, var4 ? 769 : 768);
      }

   }

   final void method578(int var1, class557 var2, boolean var3, boolean var4) {
      OpenGL.glTexEnvi(8960, '薀' + var1, method5071(var2));
      if (var3) {
         OpenGL.glTexEnvi(8960, '薐' + var1, var4 ? 771 : 770);
      } else {
         OpenGL.glTexEnvi(8960, '薐' + var1, var4 ? 769 : 768);
      }

   }

   final void method743(int var1, class557 var2, boolean var3) {
      OpenGL.glTexEnvi(8960, '薈' + var1, method5071(var2));
      OpenGL.glTexEnvi(8960, '薘' + var1, var3 ? 771 : 770);
   }

   final void method744(int var1, class557 var2, boolean var3) {
      OpenGL.glTexEnvi(8960, '薈' + var1, method5071(var2));
      OpenGL.glTexEnvi(8960, '薘' + var1, var3 ? 771 : 770);
   }

   final void method747() {
      this.field8608[0] = (float)(this.field718 & 16711680) / 1.671168E7F;
      this.field8608[1] = (float)(this.field718 & '\uff00') / 65280.0F;
      this.field8608[2] = (float)(this.field718 & 255) / 255.0F;
      this.field8608[3] = (float)(this.field718 >>> 24) / 255.0F;
      OpenGL.glTexEnvfv(8960, 8705, this.field8608, 0);
   }

   final void method748() {
      this.field8608[0] = (float)(this.field718 & 16711680) / 1.671168E7F;
      this.field8608[1] = (float)(this.field718 & '\uff00') / 65280.0F;
      this.field8608[2] = (float)(this.field718 & 255) / 255.0F;
      this.field8608[3] = (float)(this.field718 >>> 24) / 255.0F;
      OpenGL.glTexEnvfv(8960, 8705, this.field8608, 0);
   }

   void method749() {
      OpenGL.glMatrixMode(5890);
      if (this.field749[this.field769] != class90.field551) {
         OpenGL.glLoadMatrixf(this.field748[this.field769].method300(this.field8629), 0);
      } else {
         OpenGL.glLoadIdentity();
      }

      OpenGL.glMatrixMode(5888);
   }

   public void method704(class344 var1) {
      float[] var2 = var1.field325;
      var2[1] = -var2[1];
      var2[5] = -var2[5];
      var2[9] = -var2[9];
      var2[13] = -var2[13];
   }

   void method751() {
      OpenGL.glActiveTexture('蓀' + this.field769);
   }

   public void method4896() {
      OpenGL.glFinish();
   }

   void method752() {
      OpenGL.glActiveTexture('蓀' + this.field769);
   }

   void method754() {
      OpenGL.glTexEnvi(8960, 34161, method5070(this.field738[this.field769]));
   }

   void method755() {
      OpenGL.glTexEnvi(8960, 34162, method5070(this.field751[this.field769]));
   }

   void method687() {
      OpenGL.glTexEnvi(8960, 34162, method5070(this.field751[this.field769]));
   }

   public float method695() {
      return 0.0F;
   }

   void method592(int var1) {
      OpenGL.glColorMask((var1 & 1) != 0, (var1 & 2) != 0, (var1 & 4) != 0, (var1 & 8) != 0);
   }

   void method719() {
   }

   void method602() {
      this.field8608[0] = this.field808 * this.field806;
      this.field8608[1] = this.field808 * this.field733;
      this.field8608[2] = this.field808 * this.field734;
      this.field8608[3] = 1.0F;
      OpenGL.glLightfv(16384, 4609, this.field8608, 0);
      this.field8608[0] = -this.field737 * this.field806;
      this.field8608[1] = -this.field737 * this.field733;
      this.field8608[2] = -this.field737 * this.field734;
      this.field8608[3] = 1.0F;
      OpenGL.glLightfv(16385, 4609, this.field8608, 0);
   }

   void method740() {
      if (this.field8574 != null) {
         OpenGL.glViewport(this.field719 + this.field783, this.field720 + this.field8574.method2493() - this.field716 - this.field683, this.field717, this.field683);
      }

      OpenGL.glDepthRange(this.field779, this.field702);
   }

   class332 method737(class264 var1, int var2, int var3, int var4, boolean var5, byte[] var6) {
      return new class159(this, var1, var2, var3, var4, var5, var6);
   }

   class801 method612(class264 var1, class482 var2, int var3, int var4) {
      return this.method615(var1, var2, var3, var4);
   }

   void method761() {
      byte var1 = 0;
      byte var2 = 0;
      if (this.field810 == 0) {
         var1 = 0;
         var2 = 0;
      } else if (this.field810 == 1) {
         var1 = 1;
         var2 = 0;
      } else if (this.field810 == 2) {
         var1 = 1;
         var2 = 1;
      }

      if (this.field712 == class119.field2149) {
         OpenGL.glBlendFuncSeparate(770, 771, var1, var2);
      } else if (this.field712 == class119.field2147) {
         OpenGL.glBlendFuncSeparate(1, 1, var1, var2);
      } else if (this.field712 == class119.field2148) {
         OpenGL.glBlendFuncSeparate(774, 1, var1, var2);
      }

   }

   void method654() {
      if (this.field689) {
         OpenGL.glEnable(3042);
      } else {
         OpenGL.glDisable(3042);
      }

   }

   void method677() {
      this.field780 = this.field752 - (float)this.field778;
      this.field736 = this.field780 - (float)this.field677;
      if (this.field736 < this.field705) {
         this.field736 = this.field705;
      }

      if (this.field658) {
         OpenGL.glFogf(2915, this.field736);
         OpenGL.glFogf(2916, this.field780);
         this.field8608[0] = (float)(this.field776 & 16711680) / 1.671168E7F;
         this.field8608[1] = (float)(this.field776 & '\uff00') / 65280.0F;
         this.field8608[2] = (float)(this.field776 & 255) / 255.0F;
         OpenGL.glFogfv(2918, this.field8608, 0);
      }

   }

   class801 method729(class264 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7) {
      if (!this.field8624 && (!class51.method1530(var2, 2130200323) || !class51.method1530(var3, 2059129528))) {
         if (this.field8623) {
            return new class592(this, var1, var2, var3, var5, var6, var7);
         } else {
            class196 var8 = new class196(this, var1, class482.field8403, class18.method3687(var2, (byte)16), class18.method3687(var3, (byte)16));
            var8.method3718(0, 0, var2, var3, var5, var1, var6, var7);
            return var8;
         }
      } else {
         return new class196(this, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   void method763() {
      if (this.field775 && this.field722 && this.field677 >= 0) {
         OpenGL.glEnable(2912);
      } else {
         OpenGL.glDisable(2912);
      }

   }

   void method637() {
      this.field780 = this.field752 - (float)this.field778;
      this.field736 = this.field780 - (float)this.field677;
      if (this.field736 < this.field705) {
         this.field736 = this.field705;
      }

      if (this.field658) {
         OpenGL.glFogf(2915, this.field736);
         OpenGL.glFogf(2916, this.field780);
         this.field8608[0] = (float)(this.field776 & 16711680) / 1.671168E7F;
         this.field8608[1] = (float)(this.field776 & '\uff00') / 65280.0F;
         this.field8608[2] = (float)(this.field776 & 255) / 255.0F;
         OpenGL.glFogfv(2918, this.field8608, 0);
      }

   }

   void method764(boolean var1) {
      if (var1) {
         OpenGL.glEnable(32925);
      } else {
         OpenGL.glDisable(32925);
      }

   }

   void method713() {
      OpenGL.glDepthMask(this.field721 && this.field681);
   }

   final class920 method766(boolean var1) {
      return new class632(this, class482.field8400, var1);
   }

   final class525 method767(boolean var1) {
      return new class708(this, var1);
   }

   final class525 method768(boolean var1) {
      return new class708(this, var1);
   }

   void method760() {
      if (this.field753) {
         OpenGL.glEnable(3008);
      } else {
         OpenGL.glDisable(3008);
      }

   }

   class92 method769(class39[] var1) {
      return new class496(var1);
   }

   void method746() {
      if (this.field725) {
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
      } else {
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
      }

   }

   class92 method660(class39[] var1) {
      return new class496(var1);
   }

   void method770(class920 var1) {
      this.field8613 = (class632)var1;
      this.field8613.method5736();
   }

   void method771(class920 var1) {
      this.field8613 = (class632)var1;
      this.field8613.method5736();
   }

   public void method778(class344 var1, class344 var2, class344 var3) {
      OpenGL.glMatrixMode(5888);
      this.field680.method270(var1, var2);
      OpenGL.glLoadMatrixf(this.field680.field325, 0);
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadMatrixf(var3.field325, 0);
   }

   public final void method773(class427 var1, int var2, int var3) {
      byte var4;
      int var5;
      if (var1 == class427.field7387) {
         var4 = 1;
         var5 = var3 * 2;
      } else if (var1 == class427.field7384) {
         var4 = 3;
         var5 = var3 + 1;
      } else if (var1 == class427.field7386) {
         var4 = 4;
         var5 = var3 * 3;
      } else if (var1 == class427.field7385) {
         var4 = 6;
         var5 = var3 + 2;
      } else if (var1 == class427.field7383) {
         var4 = 5;
         var5 = var3 + 2;
      } else {
         var4 = 0;
         var5 = var3;
      }

      OpenGL.glDrawArrays(var4, var2, var5);
   }

   public final void method613(class427 var1, int var2, int var3, int var4, int var5) {
      byte var6;
      int var7;
      if (var1 == class427.field7387) {
         var6 = 1;
         var7 = var5 * 2;
      } else if (var1 == class427.field7384) {
         var6 = 3;
         var7 = var5 + 1;
      } else if (var1 == class427.field7386) {
         var6 = 4;
         var7 = var5 * 3;
      } else if (var1 == class427.field7385) {
         var6 = 6;
         var7 = var5 + 2;
      } else if (var1 == class427.field7383) {
         var6 = 5;
         var7 = var5 + 2;
      } else {
         var6 = 0;
         var7 = var5;
      }

      class482 var8 = this.field8613.method5849();
      OpenGL.glDrawElements(var6, var7, method5081(var8), this.field8613.method5734() + (long)(var4 * var8.field8406 * 685647847));
   }

   public final void method708(class427 var1, int var2, int var3, int var4, int var5) {
      byte var6;
      int var7;
      if (var1 == class427.field7387) {
         var6 = 1;
         var7 = var5 * 2;
      } else if (var1 == class427.field7384) {
         var6 = 3;
         var7 = var5 + 1;
      } else if (var1 == class427.field7386) {
         var6 = 4;
         var7 = var5 * 3;
      } else if (var1 == class427.field7385) {
         var6 = 6;
         var7 = var5 + 2;
      } else if (var1 == class427.field7383) {
         var6 = 5;
         var7 = var5 + 2;
      } else {
         var6 = 0;
         var7 = var5;
      }

      class482 var8 = this.field8613.method5849();
      OpenGL.glDrawElements(var6, var7, method5081(var8), this.field8613.method5734() + (long)(var4 * var8.field8406 * 685647847));
   }

   public final void method621(class427 var1, int var2, int var3, int var4, int var5) {
      byte var6;
      int var7;
      if (var1 == class427.field7387) {
         var6 = 1;
         var7 = var5 * 2;
      } else if (var1 == class427.field7384) {
         var6 = 3;
         var7 = var5 + 1;
      } else if (var1 == class427.field7386) {
         var6 = 4;
         var7 = var5 * 3;
      } else if (var1 == class427.field7385) {
         var6 = 6;
         var7 = var5 + 2;
      } else if (var1 == class427.field7383) {
         var6 = 5;
         var7 = var5 + 2;
      } else {
         var6 = 0;
         var7 = var5;
      }

      class482 var8 = this.field8613.method5849();
      OpenGL.glDrawElements(var6, var7, method5081(var8), this.field8613.method5734() + (long)(var4 * var8.field8406 * 685647847));
   }

   public final void method775(class427 var1, int var2, int var3, int var4, int var5) {
      byte var6;
      int var7;
      if (var1 == class427.field7387) {
         var6 = 1;
         var7 = var5 * 2;
      } else if (var1 == class427.field7384) {
         var6 = 3;
         var7 = var5 + 1;
      } else if (var1 == class427.field7386) {
         var6 = 4;
         var7 = var5 * 3;
      } else if (var1 == class427.field7385) {
         var6 = 6;
         var7 = var5 + 2;
      } else if (var1 == class427.field7383) {
         var6 = 5;
         var7 = var5 + 2;
      } else {
         var6 = 0;
         var7 = var5;
      }

      class482 var8 = this.field8613.method5849();
      OpenGL.glDrawElements(var6, var7, method5081(var8), this.field8613.method5734() + (long)(var4 * var8.field8406 * 685647847));
   }

   void method562() {
      if (this.field8574 != null) {
         int var1 = this.field719 + this.field709;
         int var2 = this.field720 + this.field8574.method2493() - this.field685;
         int var3 = this.field678 - this.field709;
         int var4 = this.field685 - this.field707;
         if (var3 < 0) {
            var3 = 0;
         }

         if (var4 < 0) {
            var4 = 0;
         }

         OpenGL.glScissor(var1, var2, var3, var4);
      }

   }

   void method600() {
      if (this.field708 && !this.field726) {
         OpenGL.glEnable(2896);
      } else {
         OpenGL.glDisable(2896);
      }

   }

   public void method780(int var1, class525 var2) {
      this.field8615[var1] = (class708)var2;
   }

   public void method572(class92 var1) {
      class39[] var2 = var1.field555;
      int var3 = 0;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;

      int var7;
      for(var7 = 0; var7 < var2.length; ++var7) {
         class39 var8 = var2[var7];
         class708 var9 = this.field8615[var7];
         int var10 = 0;
         int var11 = var9.method1943();
         long var12 = var9.method5734();
         var9.method5736();

         for(int var14 = 0; var14 < var8.method3359(); ++var14) {
            class61 var15 = var8.method3356(var14);
            switch(var15.field1595) {
            case 0:
               OpenGL.glVertexPointer(3, 5126, var11, var12 + (long)var10);
               var6 = true;
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
            default:
               break;
            case 3:
               OpenGL.glColorPointer(4, 5121, var11, var12 + (long)var10);
               var4 = true;
               break;
            case 5:
               OpenGL.glClientActiveTexture('蓀' + var3++);
               OpenGL.glTexCoordPointer(3, 5126, var11, var12 + (long)var10);
               break;
            case 8:
               OpenGL.glClientActiveTexture('蓀' + var3++);
               OpenGL.glTexCoordPointer(4, 5126, var11, var12 + (long)var10);
               break;
            case 9:
               OpenGL.glClientActiveTexture('蓀' + var3++);
               OpenGL.glTexCoordPointer(1, 5126, var11, var12 + (long)var10);
               break;
            case 10:
               OpenGL.glClientActiveTexture('蓀' + var3++);
               OpenGL.glTexCoordPointer(2, 5126, var11, var12 + (long)var10);
               break;
            case 11:
               OpenGL.glNormalPointer(5126, var11, var12 + (long)var10);
               var5 = true;
            }

            var10 += var15.field1602;
         }
      }

      if (this.field8622 != var6) {
         if (var6) {
            OpenGL.glEnableClientState(32884);
         } else {
            OpenGL.glDisableClientState(32884);
         }

         this.field8622 = var6;
      }

      if (this.field8628 != var5) {
         if (var5) {
            OpenGL.glEnableClientState(32885);
         } else {
            OpenGL.glDisableClientState(32885);
         }

         this.field8628 = var5;
      }

      if (this.field8616 != var4) {
         if (var4) {
            OpenGL.glEnableClientState(32886);
         } else {
            OpenGL.glDisableClientState(32886);
         }

         this.field8616 = var4;
      }

      if (this.field8614 < var3) {
         for(var7 = this.field8614; var7 < var3; ++var7) {
            OpenGL.glClientActiveTexture('蓀' + var7);
            OpenGL.glEnableClientState(32888);
         }

         this.field8614 = var3;
      } else if (this.field8614 > var3) {
         for(var7 = var3; var7 < this.field8614; ++var7) {
            OpenGL.glClientActiveTexture('蓀' + var7);
            OpenGL.glDisableClientState(32888);
         }

         this.field8614 = var3;
      }

   }

   void method758(int var1) {
      OpenGL.glColorMask((var1 & 1) != 0, (var1 & 2) != 0, (var1 & 4) != 0, (var1 & 8) != 0);
   }

   public class223 method781(String var1) {
      byte[] var2 = this.method5079(var1);
      if (var2 == null) {
         return null;
      } else {
         class222 var3 = this.method558(var2);
         return new class588(this, var3);
      }
   }

   public class223 method782(String var1) {
      byte[] var2 = this.method5079(var1);
      if (var2 == null) {
         return null;
      } else {
         class222 var3 = this.method558(var2);
         return new class588(this, var3);
      }
   }

   public class223 method783(String var1) {
      byte[] var2 = this.method5079(var1);
      if (var2 == null) {
         return null;
      } else {
         class222 var3 = this.method558(var2);
         return new class588(this, var3);
      }
   }

   public class223 method784(String var1) {
      byte[] var2 = this.method5079(var1);
      if (var2 == null) {
         return null;
      } else {
         class222 var3 = this.method558(var2);
         return new class588(this, var3);
      }
   }

   public void method594(class344 var1) {
      float[] var2 = var1.field325;
      var2[1] = -var2[1];
      var2[5] = -var2[5];
      var2[9] = -var2[9];
      var2[13] = -var2[13];
   }

   void method564() {
      if (this.field689) {
         OpenGL.glEnable(3042);
      } else {
         OpenGL.glDisable(3042);
      }

   }

   class891 method735(int var1, boolean var2, int[][] var3) {
      return new class863(this, var1, var2, var3);
   }

   static final int method5081(class482 var0) {
      switch(var0.field8405 * -1857088243) {
      case 0:
         return 5125;
      case 1:
         return 5121;
      case 2:
         return 5120;
      case 3:
         return 5126;
      case 4:
         return 5131;
      case 5:
         return 5122;
      case 6:
         return 5123;
      case 7:
      default:
         return 5121;
      case 8:
         return 5124;
      }
   }

   final synchronized void method5082(int var1) {
      class568 var2 = new class568();
      var2.field641 = (long)var1 * 4191220306876042991L;
      this.field8607.method1282(var2, 1460654582);
   }

   final void method628() {
      this.field8608[0] = (float)(this.field718 & 16711680) / 1.671168E7F;
      this.field8608[1] = (float)(this.field718 & '\uff00') / 65280.0F;
      this.field8608[2] = (float)(this.field718 & 255) / 255.0F;
      this.field8608[3] = (float)(this.field718 >>> 24) / 255.0F;
      OpenGL.glTexEnvfv(8960, 8705, this.field8608, 0);
   }
}
