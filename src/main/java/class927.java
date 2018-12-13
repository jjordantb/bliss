import jagdx.A;
import jagdx.B;
import jagdx.C;
import jagdx.D3DLIGHT;
import jagdx.I;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.S;
import jagdx.Z;
import jagdx.u;
import java.awt.Canvas;

public class class927 extends class325 {
   int field10238;
   boolean[] field10239;
   boolean field10240;
   long field10241 = 0L;
   B field10242;
   long field10243;
   int field10244 = 0;
   class599 field10245 = new class599();
   long field10246 = 0L;
   long field10247 = 0L;
   boolean field10248 = false;
   long[] field10249;
   boolean[] field10250;
   boolean field10251;
   boolean[] field10252;
   class566[] field10253;
   class186 field10254;
   class344 field10255;
   boolean[] field10256;
   long field10257 = 0L;
   Z field10258;
   boolean field10259;
   int[] field10260;
   long field10261 = 0L;
   float[] field10262 = new float[16];
   int field10263 = 128;
   int field10264 = 0;
   int field10265;
   static int[] field10266 = new int[]{77, 80};
   static int[] field10267 = new int[]{22, 23};

   class801 method698(class264 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      return new class641(this, var1, var2, var3, var4, var5, var6, var7);
   }

   public boolean method742() {
      return (this.field10258.LI & '\uffff') >= 257;
   }

   class927(int var1, int var2, long var3, long var5, B var7, Z var8, class478 var9, class180 var10, int var11) {
      super(var9, var10, var11, 0);
      this.field10249 = new long[this.field10263];

      try {
         this.field10238 = var1;
         this.field10265 = var2;
         this.field10246 = var3;
         this.field10241 = var5;
         this.field10242 = var7;
         this.field10258 = var8;
         this.field10247 = D3DLIGHT.Create();
         this.field10261 = D3DLIGHT.Create();
         this.field10257 = D3DLIGHT.Create();
         super.field791 = this.field10258.II;
         super.field792 = this.field10258.CI > 0 ? this.field10258.CI : 8;
         this.field10259 = (this.field10258.N & 2) == 0;
         super.field809 = (this.field10258.N & 8192) != 0;
         this.field10251 = (this.field10258.N & 65536) != 0;
         this.field10240 = (this.field10258.N & 16384) != 0;
         super.field793 = true;
         super.field794 = super.field785 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.field10246, this.field10238, this.field10265, this.field10242.C, true, 2) == 0;
         this.field10256 = new boolean[super.field791];
         this.field10250 = new boolean[super.field791];
         this.field10239 = new boolean[super.field791];
         this.field10253 = new class566[super.field791];
         this.field10252 = new boolean[super.field791];
         this.field10260 = new int[super.field791];
         class135 var12 = new class135();
         var12.method1019(1.0F, -1.0F, 0.5F);
         var12.method1018(0.0F, 0.0F, 0.5F);
         this.field10255 = new class344();
         this.field10255.method272(var12);
         IDirect3DDevice.BeginScene(this.field10241);
      } catch (Throwable var13) {
         var13.printStackTrace();
         this.method4996(1630490401);
         throw new RuntimeException("");
      }
   }

   void method566() {
      for(Node var1 = this.field10245.method1281(1904772578); var1 != null; var1 = this.field10245.method1283((byte)-5)) {
         class583 var2 = (class583)var1;
         class319 var3 = var2.field318;
         var3.method482();
         if (var3 == super.field8574) {
            var3.method485();
         }
      }

      super.method566();
   }

   boolean method6205() {
      int var1 = IDirect3DDevice.TestCooperativeLevel(this.field10241);
      if (var1 == 0 || var1 == -2005530519) {
         IDirect3DDevice.SetDepthStencilSurface(this.field10241, 0L);

         int var2;
         for(var2 = 0; var2 < 4; ++var2) {
            IDirect3DDevice.SetRenderTarget(this.field10241, var2, 0L);
         }

         for(var2 = 0; var2 < 4; ++var2) {
            IDirect3DDevice.SetStreamSource(this.field10241, var2, 0L, 0, 0);
         }

         for(var2 = 0; var2 < 4; ++var2) {
            IDirect3DDevice.SetTexture(this.field10241, var2, 0L);
         }

         IDirect3DDevice.SetIndices(this.field10241, 0L);
         this.method565();
         this.field10242.I = 0;
         this.field10242.Z = 0;
         if (method6217(this.field10238, this.field10265, this.field10246, super.field785, this.field10242)) {
            var2 = IDirect3DDevice.Reset(this.field10241, this.field10242);
            if (S.f(var2)) {
               this.method566();
               this.method722();
               return true;
            }

            System.exit(0);
         }
      }

      return false;
   }

   public class305 method4795() {
      I var1 = new I();
      IDirect3D.GetAdapterIdentifier(this.field10246, this.field10238, 0, var1);
      return new class305(var1.D, "Direct3D", 9, var1.Z, var1.B);
   }

   public void method4909() {
      long var1 = IDirect3DDevice.CreateEventQuery(this.field10241);
      if (S.f(IDirect3DEventQuery.Issue(var1))) {
         while(true) {
            int var3 = IDirect3DEventQuery.IsSignaled(var1);
            if (var3 != 1) {
               break;
            }

            Thread.yield();
         }
      }

      IUnknown.Release(var1);
   }

   void method4846() {
      super.method4846();
      if (this.field10247 != 0L) {
         D3DLIGHT.Destroy(this.field10247);
         this.field10247 = 0L;
      }

      if (this.field10261 != 0L) {
         D3DLIGHT.Destroy(this.field10261);
         this.field10261 = 0L;
      }

      if (this.field10257 != 0L) {
         D3DLIGHT.Destroy(this.field10257);
         this.field10257 = 0L;
      }

      if (this.field10241 != 0L) {
         IDirect3DDevice.Destroy(this.field10241);
         this.field10241 = 0L;
      }

      if (this.field10246 != 0L) {
         IUnknown.Release(this.field10246);
         this.field10246 = 0L;
      }

   }

   public float method574() {
      return -0.5F;
   }

   class749 method4819(Canvas var1, int var2, int var3) {
      return new class468(this, var1, var2, var3, false);
   }

   void method602() {
      if (super.field658) {
         float var1 = super.field725 ? super.field808 : 0.0F;
         float var2 = super.field725 ? -super.field737 : 0.0F;
         D3DLIGHT.SetDiffuse(this.field10247, var1 * super.field806, var1 * super.field733, var1 * super.field734, 0.0F);
         D3DLIGHT.SetDiffuse(this.field10261, var2 * super.field806, var2 * super.field733, var2 * super.field734, 0.0F);
         this.field10248 = false;
      }

   }

   class583 method6207(class319 var1) {
      for(Node var2 = this.field10245.method1281(1679619359); var2 != null; var2 = this.field10245.method1283((byte)-106)) {
         class583 var3 = (class583)var2;
         if (var3.field318 == var1) {
            return var3;
         }
      }

      return null;
   }

   void method6208(class319 var1) {
      if (this.method6207(var1) == null) {
         this.field10245.method1282(new class583(var1), 364496408);
      }

   }

   void method606() {
      int var1;
      for(var1 = 0; var1 < super.field740; ++var1) {
         class639 var2 = super.field730[var1];
         int var3 = var1 + 2;
         int var4 = var2.method5905(-1167524098);
         float var5 = var2.method5908(608404512) / 255.0F;
         D3DLIGHT.SetPosition(this.field10257, (float)var2.method5902(823958259), (float)var2.method5901(-1488448874), (float)var2.method5904((byte)58));
         D3DLIGHT.SetDiffuse(this.field10257, (float)(var4 >> 16 & 255) * var5, (float)(var4 >> 8 & 255) * var5, (float)(var4 & 255) * var5, 0.0F);
         D3DLIGHT.SetAttenuation(this.field10257, 0.0F, 0.0F, 1.0F / (float)(var2.method5907(-426177774) * var2.method5907(-311447466)));
         D3DLIGHT.SetRange(this.field10257, (float)var2.method5907(-949255616));
         IDirect3DDevice.SetLight(this.field10241, var3, this.field10257);
         IDirect3DDevice.LightEnable(this.field10241, var3, true);
      }

      while(var1 < super.field739) {
         IDirect3DDevice.LightEnable(this.field10241, var1 + 2, false);
         ++var1;
      }

   }

   public int[] method5051(int var1, int var2, int var3, int var4) {
      int[] var5 = null;
      long var6 = IDirect3DDevice.GetRenderTarget(this.field10241, 0);
      long var8 = IDirect3DDevice.CreateRenderTarget(this.field10241, var3, var4, 21, 0, 0, true);
      if (S.f(IDirect3DDevice.StretchRect(this.field10241, var6, var1, var2, var3, var4, var8, 0, 0, var3, var4, 1))) {
         var5 = new int[var3 * var4];
         IDirect3DSurface.Download(var8, 0, 0, var3, var4, var3 * 4, 16, super.field661);
         super.field660.clear();
         super.field660.asIntBuffer().get(var5);
      }

      IUnknown.Release(var6);
      IUnknown.Release(var8);
      return var5;
   }

   public void method5046() {
   }

   public void method4831(int var1, int var2) {
      IDirect3DDevice.Clear(this.field10241, var1, var2, 1.0F, 0);
   }

   void method584() {
      if (super.field8574 != null) {
         IDirect3DDevice.SetViewport(this.field10241, super.field719 + super.field783, super.field720 + super.field716, super.field717, super.field683, super.field779, super.field702);
      }

   }

   void method585() {
      IDirect3DDevice.SetScissorRect(this.field10241, super.field719 + super.field709, super.field720 + super.field707, super.field678, super.field685);
   }

   void method586() {
      IDirect3DDevice.f(this.field10241, 174, super.field698);
   }

   public void method559(class344 var1, class344 var2, class344 var3) {
      IDirect3DDevice.SetTransform(this.field10241, 256, var1.field325);
      IDirect3DDevice.SetTransform(this.field10241, 2, var2.field325);
      IDirect3DDevice.SetTransform(this.field10241, 3, var3.field325);
   }

   void method599() {
      IDirect3DDevice.f(this.field10241, 7, super.field723);
   }

   void method600() {
      if (super.field658) {
         IDirect3DDevice.f(this.field10241, 137, super.field708 && !super.field726);
      }

   }

   void method670() {
      if (super.field658) {
         D3DLIGHT.SetAmbient(this.field10247, super.field806 * super.field735, super.field733 * super.field735, super.field734 * super.field735, 0.0F);
         this.field10248 = false;
      }

   }

   class891 method674(int var1, boolean var2, int[][] var3) {
      return new class561(this, var1, var2, var3);
   }

   void method604() {
      this.method602();
      this.method579();
   }

   void method579() {
      if (super.field658 && !this.field10248) {
         IDirect3DDevice.LightEnable(this.field10241, 0, false);
         IDirect3DDevice.LightEnable(this.field10241, 1, false);
         IDirect3DDevice.SetLight(this.field10241, 0, this.field10247);
         IDirect3DDevice.SetLight(this.field10241, 1, this.field10261);
         IDirect3DDevice.LightEnable(this.field10241, 0, true);
         IDirect3DDevice.LightEnable(this.field10241, 1, true);
         this.field10248 = true;
      }

   }

   boolean method607(class264 var1, class482 var2) {
      C var3 = new C();
      return S.f(IDirect3D.GetAdapterDisplayMode(this.field10246, this.field10238, var3)) && S.f(IDirect3D.CheckDeviceFormat(this.field10246, this.field10238, this.field10265, var3.B, 0, 3, method6212(var1, var2)));
   }

   boolean method608(class264 var1, class482 var2) {
      C var3 = new C();
      return S.f(IDirect3D.GetAdapterDisplayMode(this.field10246, this.field10238, var3)) && S.f(IDirect3D.CheckDeviceFormat(this.field10246, this.field10238, this.field10265, var3.B, 0, 4, method6212(var1, var2)));
   }

   class801 method612(class264 var1, class482 var2, int var3, int var4) {
      return new class641(this, var1, var2, var3, var4);
   }

   class801 method614(int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      return new class641(this, var1, var2, var3, var4, var5, var6);
   }

   class801 method712(class264 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7) {
      return new class641(this, var1, var2, var3, var4, var5, var6, var7);
   }

   class33 method615(class264 var1, class482 var2, int var3, int var4) {
      return new class694(this, var1, var2, var3, var4);
   }

   final void method6209(long var1) {
      this.field10243 = var1;
      IDirect3DDevice.SetVertexShader(this.field10241, var1);
   }

   final void method6210(class40 var1) {
      IDirect3DDevice.SetTexture(this.field10241, super.field769, var1.method3058());
      if (super.field658 && !this.field10239[super.field769]) {
         this.field10239[super.field769] = true;
         this.method703();
         this.method631();
      }

   }

   public void method714(class92 var1) {
      class116 var2 = (class116)var1;
      IDirect3DDevice.SetVertexDeclaration(this.field10241, var2.field1893);
   }

   static class848 method6211(Canvas var0, class478 var1, class180 var2, Integer var3) {
      class927 var4 = null;

      try {
         byte var5 = 0;
         byte var6 = 1;
         long var7 = IDirect3D.Direct3DCreate();
         Z var9 = new Z();
         IDirect3D.GetDeviceCaps(var7, var5, var6, var9);
         if ((var9.E & 16777216) == 0) {
            throw new RuntimeException("");
         } else if (var9.II < 2) {
            throw new RuntimeException("");
         } else if ((var9.w & 2) == 0) {
            throw new RuntimeException("");
         } else if ((var9.w & 8) == 0) {
            throw new RuntimeException("");
         } else if ((var9.w & 64) == 0) {
            throw new RuntimeException("");
         } else if ((var9.w & 512) == 0) {
            throw new RuntimeException("");
         } else if ((var9.w & 33554432) == 0) {
            throw new RuntimeException("");
         } else if ((var9.H & var9.K & 16) == 0) {
            throw new RuntimeException("");
         } else if ((var9.H & var9.K & 32) == 0) {
            throw new RuntimeException("");
         } else if ((var9.H & var9.K & 2) == 0) {
            throw new RuntimeException("");
         } else if (var9.CI > 0 && var9.CI < 2) {
            throw new RuntimeException("");
         } else if (var9.EI < 5) {
            throw new RuntimeException("");
         } else {
            B var10 = new B(var0);
            var10.A = true;
            var10.E = true;
            var10.I = var0.getWidth();
            var10.Z = var0.getHeight();
            var10.B = 1;
            var10.L = Integer.MIN_VALUE;
            if (!method6217(var5, var6, var7, var3.intValue(), var10)) {
               throw new RuntimeException("");
            } else {
               int var11 = 0;
               if ((var9.S & 1048576) != 0) {
                  var11 |= 16;
               }

               long var12 = 0L;

               try {
                  var12 = IDirect3D.CreateDeviceContext(var7, var5, var6, var0, var11 | 64, var10);
               } catch (u var16) {
                  var12 = IDirect3D.CreateDeviceContext(var7, var5, var6, var0, var11 & -1048577 | 32, var10);
               }

               var4 = new class927(var5, var6, var7, var12, var10, var9, var1, var2, var3.intValue());
               if (!var4.field8595.containsKey(var0)) {
                  class977.method1815(var0, (short)3524);
                  var4.method5017(var0, new class468(var4, var0, var0.getWidth(), var0.getHeight(), true), (byte)-32);
               }

               var4.method4816(var0, (byte)-102);
               var4.method561();
               return var4;
            }
         }
      } catch (RuntimeException var17) {
         if (var4 != null) {
            var4.method4846();
         }

         throw var17;
      }
   }

   void method681() {
      if (super.field658) {
         D3DLIGHT.SetDirection(this.field10247, -super.field727[0], -super.field727[1], -super.field727[2]);
         D3DLIGHT.SetDirection(this.field10261, -super.field692[0], -super.field692[1], -super.field692[2]);
         this.field10248 = false;
      }

   }

   void method745() {
      if (this.field10243 == 0L && super.field749[super.field769] != class90.field551) {
         if (super.field749[super.field769] == class90.field550) {
            IDirect3DDevice.SetTransform(this.field10241, 16 + super.field769, super.field748[super.field769].method293(this.field10262));
         } else {
            IDirect3DDevice.SetTransform(this.field10241, 16 + super.field769, super.field748[super.field769].method300(this.field10262));
         }

         int var1 = method6214(super.field749[super.field769]);
         if (var1 != this.field10260[super.field769]) {
            IDirect3DDevice.SetTextureStageState(this.field10241, super.field769, 24, var1);
            this.field10260[super.field769] = var1;
         }
      } else {
         IDirect3DDevice.SetTextureStageState(this.field10241, super.field769, 24, 0);
         this.field10260[super.field769] = 0;
      }

   }

   void method630() {
   }

   public class621 method5049(class621 var1, class621 var2, float var3, class621 var4) {
      return var3 < 0.5F ? var1 : var2;
   }

   void method703() {
      if (super.field658) {
         int var1 = this.field10239[super.field769] ? method6227(super.field751[super.field769]) : 1;
         IDirect3DDevice.SetTextureStageState(this.field10241, super.field769, 4, var1);
      }

   }

   final void method686(int var1, class557 var2, boolean var3, boolean var4) {
      if (super.field658) {
         int var5 = 0;
         byte var6;
         switch(var1) {
         case 1:
            var6 = 3;
            break;
         case 2:
            var6 = 26;
            break;
         default:
            var6 = 2;
         }

         if (var3) {
            var5 |= 32;
         }

         if (var4) {
            var5 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(this.field10241, super.field769, var6, method6213(var2) | var5);
      }

   }

   final void method623(int var1, class557 var2, boolean var3) {
      if (super.field658) {
         int var4 = 0;
         byte var5;
         switch(var1) {
         case 1:
            var5 = 6;
            break;
         case 2:
            var5 = 27;
            break;
         default:
            var5 = 5;
         }

         if (var3) {
            var4 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(this.field10241, super.field769, var5, method6213(var2) | var4);
      }

   }

   final void method628() {
      if (super.field658) {
         IDirect3DDevice.SetRenderState(this.field10241, 60, super.field718);
      }

   }

   static final int method6212(class264 var0, class482 var1) {
      switch(var1.field8405) {
      case 1:
         switch(var0.field8200) {
         case 0:
            return A.y;
         case 1:
            return 50;
         case 2:
            return 77;
         case 3:
            return 51;
         case 4:
         case 6:
         default:
            break;
         case 5:
            return 22;
         case 7:
            return 28;
         case 8:
            return A.z;
         case 9:
            return 21;
         }
      case 2:
      default:
         break;
      case 3:
         if (var0 == class264.field8191) {
            return 116;
         }
         break;
      case 4:
         if (var0 == class264.field8191) {
            return 113;
         }
      }

      throw new IllegalArgumentException("");
   }

   static final int method6213(class557 var0) {
      switch(var0.field499) {
      case 0:
         return 1;
      case 1:
         return 3;
      case 2:
         return 2;
      case 3:
         return 0;
      default:
         throw new IllegalArgumentException();
      }
   }

   static final int method6214(class90 var0) {
      switch(var0.field554) {
      case 0:
         return 2;
      case 1:
         return 1;
      case 2:
      default:
         return 0;
      case 3:
         return 256;
      case 4:
         return 3;
      case 5:
         return 4;
      }
   }

   void method551(int var1) {
      IDirect3DDevice.SetRenderState(this.field10241, 168, var1);
   }

   void method634() {
      IDirect3DDevice.f(this.field10241, 15, super.field753);
   }

   void method635() {
      switch(super.field712.field2151) {
      case 0:
         IDirect3DDevice.SetRenderState(this.field10241, 19, 5);
         IDirect3DDevice.SetRenderState(this.field10241, 20, 6);
         break;
      case 1:
         IDirect3DDevice.SetRenderState(this.field10241, 19, 2);
         IDirect3DDevice.SetRenderState(this.field10241, 20, 2);
         break;
      case 2:
         IDirect3DDevice.SetRenderState(this.field10241, 19, 9);
         IDirect3DDevice.SetRenderState(this.field10241, 20, 2);
         break;
      case 3:
         IDirect3DDevice.SetRenderState(this.field10241, 19, 2);
         IDirect3DDevice.SetRenderState(this.field10241, 20, 1);
      }

      switch(super.field810) {
      case 0:
         IDirect3DDevice.SetRenderState(this.field10241, 207, 1);
         IDirect3DDevice.SetRenderState(this.field10241, 208, 1);
         break;
      case 1:
         IDirect3DDevice.SetRenderState(this.field10241, 207, 2);
         IDirect3DDevice.SetRenderState(this.field10241, 208, 1);
         break;
      case 2:
         IDirect3DDevice.SetRenderState(this.field10241, 207, 2);
         IDirect3DDevice.SetRenderState(this.field10241, 208, 2);
      }

   }

   void method564() {
      IDirect3DDevice.f(this.field10241, 27, super.field689);
   }

   void method638() {
      if (super.field658) {
         IDirect3DDevice.f(this.field10241, 28, super.field775 && super.field722 && super.field677 >= 0);
      }

   }

   void method637() {
      super.field780 = super.field752 - (float)super.field778;
      super.field736 = super.field780 - (float)super.field677;
      if (super.field736 < super.field705) {
         super.field736 = super.field705;
      }

      if (super.field658) {
         IDirect3DDevice.a(this.field10241, 36, super.field736);
         IDirect3DDevice.a(this.field10241, 37, super.field780);
         IDirect3DDevice.SetRenderState(this.field10241, 34, super.field776);
      }

   }

   void method639(boolean var1) {
      IDirect3DDevice.f(this.field10241, 161, var1);
   }

   final class920 method640(boolean var1) {
      return new class94(this, class482.field8400, var1);
   }

   final class525 method641(boolean var1) {
      return new class434(this, var1);
   }

   class92 method663(class39[] var1) {
      return new class116(this, var1);
   }

   public void method642(int var1, class525 var2) {
      class434 var3 = (class434)var2;
      IDirect3DDevice.SetStreamSource(this.field10241, var1, var3.field7423, 0, var3.method4159());
   }

   void method643(class920 var1) {
      IDirect3DDevice.SetIndices(this.field10241, ((class94)var1).field568);
   }

   public final void method657(class427 var1, int var2, int var3) {
      if (this.field10254 != null) {
         this.field10254.method3249();
      }

      IDirect3DDevice.DrawPrimitive(this.field10241, method6233(var1), var2, var3);
   }

   public final void method651(class427 var1, int var2, int var3, int var4, int var5) {
      if (this.field10254 != null) {
         this.field10254.method3249();
      }

      IDirect3DDevice.DrawIndexedPrimitive(this.field10241, method6233(var1), 0, var2, var3, var4, var5);
   }

   byte[] method6215(String var1) {
      return this.method557("dx", var1);
   }

   public class223 method556(String var1) {
      byte[] var2 = this.method6215(var1);
      if (var2 == null) {
         return null;
      } else {
         class222 var3 = this.method558(var2);
         return new class132(this, var3);
      }
   }

   public final synchronized void method4801(int var1) {
      for(int var2 = 0; var2 < this.field10264; ++var2) {
         IUnknown.Release(this.field10249[var2]);
      }

      this.field10264 = 0;
      super.method4801(var1);
   }

   void method4797(int var1, int var2) throws class937 {
      IDirect3DDevice.EndScene(this.field10241);
      int var3 = super.field8594.method2516();
      if (S.a(var3)) {
         if (var3 != -2005530520) {
            if (++this.field10244 > 50) {
               throw new class937();
            }
         } else {
            super.field8594.method2488();
            this.method6205();
            ((class468)super.field8594).method482();
         }
      } else {
         this.field10244 = 0;
      }

      IDirect3DDevice.BeginScene(this.field10241);
      if (super.field8581 != null) {
         super.field8581.method4627(1832776927);
      }

   }

   static final int method6216(class482 var0) {
      if (var0 == class482.field8400) {
         return 80;
      } else if (var0 == class482.field8401) {
         return 77;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   void method653(int var1) {
      int var2 = (var1 & 2) != 0 ? 2 : 3;
      IDirect3DDevice.SetRenderState(this.field10241, 8, var2);
   }

   static boolean method6217(int var0, int var1, long var2, int var4, B var5) {
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      try {
         C var9 = new C();
         if (S.a(IDirect3D.GetAdapterDisplayMode(var2, var0, var9))) {
            return false;
         } else {
            label74:
            for(; var4 >= 0; --var4) {
               if (var4 != 1) {
                  var8 = 0 + var4;

                  for(int var10 = 0; var10 < field10267.length; ++var10) {
                     if (IDirect3D.CheckDeviceType(var2, var0, var1, var9.B, field10267[var10], true) == 0 && IDirect3D.CheckDeviceFormat(var2, var0, var1, var9.B, 1, 1, field10267[var10]) == 0 && (var4 == 0 || IDirect3D.CheckDeviceMultiSampleType(var2, var0, var1, field10267[var10], true, var8) == 0)) {
                        for(int var11 = 0; var11 < field10266.length; ++var11) {
                           if (IDirect3D.CheckDeviceFormat(var2, var0, var1, var9.B, 2, 1, field10266[var11]) == 0 && IDirect3D.CheckDepthStencilMatch(var2, var0, var1, var9.B, field10267[var10], field10266[var11]) == 0 && (var4 == 0 || IDirect3D.CheckDeviceMultiSampleType(var2, var0, var1, field10266[var10], true, var8) == 0)) {
                              var7 = field10267[var10];
                              var6 = field10266[var11];
                              break label74;
                           }
                        }
                     }
                  }
               }
            }

            if (var4 >= 0 && var7 != 0 && var6 != 0) {
               var5.C = var7;
               var5.G = var6;
               var5.D = var8;
               var5.F = 0;
               boolean var12 = true;
               return var12;
            } else {
               return false;
            }
         }
      } catch (Throwable var13) {
         return false;
      }
   }

   synchronized void method6218(long var1) {
      if (this.field10264 == this.field10263) {
         this.field10263 *= 2;
         long[] var3 = new long[this.field10263];
         System.arraycopy(this.field10249, 0, var3, 0, this.field10264);
         this.field10249 = var3;
      }

      this.field10249[this.field10264] = var1;
      ++this.field10264;
   }

   void method631() {
      if (super.field658) {
         int var1 = this.field10239[super.field769] ? method6227(super.field738[super.field769]) : 1;
         IDirect3DDevice.SetTextureStageState(this.field10241, super.field769, 1, var1);
      }

   }

   public class806 method4942() {
      return new class225(this);
   }

   void method669() {
      IDirect3DDevice.f(this.field10241, 14, super.field721 && super.field681);
   }

   public boolean method554() {
      return (this.field10258.HI & '\uffff') >= 257;
   }

   protected void finalize() {
      super.finalize();
   }

   static final int method6227(class584 var0) {
      switch(var0.field296) {
      case 0:
         return 26;
      case 1:
         return 4;
      case 2:
         return 10;
      case 3:
         return 2;
      case 4:
         return 7;
      default:
         throw new IllegalArgumentException();
      }
   }

   void method565() {
      for(Node var1 = this.field10245.method1281(1665102883); var1 != null; var1 = this.field10245.method1283((byte)-18)) {
         class583 var2 = (class583)var1;
         class319 var3 = var2.field318;
         var3.method484();
      }

      super.method565();
   }

   final void method6228(class641 var1) {
      this.method6210(var1);
      if (this.field10256[super.field769] != var1.field10191) {
         IDirect3DDevice.SetSamplerState(this.field10241, super.field769, 1, var1.field10191 ? 1 : 3);
         this.field10256[super.field769] = var1.field10191;
      }

      if (this.field10250[super.field769] != var1.field10192) {
         IDirect3DDevice.SetSamplerState(this.field10241, super.field769, 2, var1.field10192 ? 1 : 3);
         this.field10250[super.field769] = var1.field10192;
      }

   }

   void method722() {
      for(int var1 = 0; var1 < super.field791; ++var1) {
         IDirect3DDevice.SetSamplerState(this.field10241, var1, 7, 2);
         IDirect3DDevice.SetSamplerState(this.field10241, var1, 6, 2);
         IDirect3DDevice.SetSamplerState(this.field10241, var1, 5, 2);
         IDirect3DDevice.SetSamplerState(this.field10241, var1, 1, 1);
         IDirect3DDevice.SetSamplerState(this.field10241, var1, 2, 1);
         this.field10253[var1] = class566.field624;
         boolean[] var2 = this.field10256;
         this.field10250[var1] = true;
         var2[var1] = true;
         this.field10252[var1] = false;
         this.field10260[var1] = 0;
      }

      IDirect3DDevice.SetTextureStageState(this.field10241, 0, 6, 1);
      IDirect3DDevice.SetRenderState(this.field10241, 9, 2);
      IDirect3DDevice.SetRenderState(this.field10241, 23, 4);
      IDirect3DDevice.SetRenderState(this.field10241, 25, 5);
      IDirect3DDevice.SetRenderState(this.field10241, 24, 0);
      IDirect3DDevice.SetRenderState(this.field10241, 22, 2);
      IDirect3DDevice.SetRenderState(this.field10241, 147, 1);
      IDirect3DDevice.SetRenderState(this.field10241, 145, 1);
      IDirect3DDevice.a(this.field10241, 38, 0.95F);
      IDirect3DDevice.SetRenderState(this.field10241, 35, 3);
      IDirect3DDevice.a(this.field10241, 154, 1.0F);
      D3DLIGHT.SetType(this.field10247, 3);
      D3DLIGHT.SetType(this.field10261, 3);
      D3DLIGHT.SetType(this.field10257, 1);
      IDirect3DDevice.SetRenderState(this.field10241, 206, 1);
      this.field10248 = false;
      super.method722();
   }

   public void method4891(boolean var1) {
   }

   class332 method675(class264 var1, int var2, int var3, int var4, boolean var5, byte[] var6) {
      return new class565(this, var1, var2, var3, var4, var5, var6);
   }

   final void method6230(class565 var1) {
      this.method6210(var1);
      if (!this.field10256[super.field769]) {
         IDirect3DDevice.SetSamplerState(this.field10241, super.field769, 1, 1);
         this.field10256[super.field769] = true;
      }

      if (!this.field10250[super.field769]) {
         IDirect3DDevice.SetSamplerState(this.field10241, super.field769, 2, 1);
         this.field10250[super.field769] = true;
      }

   }

   void method6231(class319 var1) {
      class583 var2 = this.method6207(var1);
      if (var2 != null) {
         var2.method545(-1460969981);
      }

   }

   public void method594(class344 var1) {
      var1.method271(this.field10255);
   }

   public void method618() {
      if (this.field10239[super.field769]) {
         this.field10239[super.field769] = false;
         IDirect3DDevice.SetTexture(this.field10241, super.field769, 0L);
         this.method703();
         this.method631();
      }

   }

   public class893 method5058(int var1, int var2) {
      return new class136(this, class482.field8401, var1, var2);
   }

   final void method6232(long var1) {
      IDirect3DDevice.SetPixelShader(this.field10241, var1);
   }

   static final int method6233(class427 var0) {
      switch(var0.field7388) {
      case 0:
         return 1;
      case 1:
         return 6;
      case 2:
         return 2;
      case 3:
         return 5;
      case 4:
         return 3;
      case 5:
         return 4;
      default:
         throw new IllegalArgumentException("");
      }
   }
}
