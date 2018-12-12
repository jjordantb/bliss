import jaggl.OpenGL;

public class class953 extends class9 {
   static char field3447 = '\u0001';
   boolean field3448 = false;
   class41 field3449;
   static char field3450 = 0;

   void method3004(boolean var1) {
      this.field4965.method3641(8448, 7681);
   }

   boolean method2997() {
      return true;
   }

   void method3001(boolean var1) {
      class169 var2 = this.field4965.method3663();
      if (this.field3449 != null && var2 != null && var1) {
         this.field3449.method3055('\u0000');
         this.field4965.method3638(1);
         this.field4965.method3639(var2);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadMatrixf(this.field4965.field6776.method287(this.field4965.field6793), 0);
         OpenGL.glMatrixMode(5888);
         this.field4965.method3638(0);
         this.field3448 = true;
      } else {
         this.field4965.method3669(0, 34168, 770);
      }

   }

   void method3014(boolean var1) {
      this.field4965.method3641(8448, 7681);
   }

   void method3005(boolean var1) {
      this.field4965.method3641(8448, 7681);
   }

   void method2999(int var1, int var2) {
   }

   void method2996(class203 var1, int var2) {
      this.field4965.method3639(var1);
      this.field4965.method3626(var2);
   }

   void method3002(boolean var1) {
      class169 var2 = this.field4965.method3663();
      if (this.field3449 != null && var2 != null && var1) {
         this.field3449.method3055('\u0000');
         this.field4965.method3638(1);
         this.field4965.method3639(var2);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadMatrixf(this.field4965.field6776.method287(this.field4965.field6793), 0);
         OpenGL.glMatrixMode(5888);
         this.field4965.method3638(0);
         this.field3448 = true;
      } else {
         this.field4965.method3669(0, 34168, 770);
      }

   }

   void method3006(boolean var1) {
      this.field4965.method3641(8448, 7681);
   }

   void method3012(int var1, int var2) {
   }

   void method3003(boolean var1) {
      class169 var2 = this.field4965.method3663();
      if (this.field3449 != null && var2 != null && var1) {
         this.field3449.method3055('\u0000');
         this.field4965.method3638(1);
         this.field4965.method3639(var2);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadMatrixf(this.field4965.field6776.method287(this.field4965.field6793), 0);
         OpenGL.glMatrixMode(5888);
         this.field4965.method3638(0);
         this.field3448 = true;
      } else {
         this.field4965.method3669(0, 34168, 770);
      }

   }

   class953(class13 var1) {
      super(var1);
      if (var1.field6865) {
         this.field3449 = new class41(var1, 2);
         this.field3449.method3056(0);
         this.field4965.method3638(1);
         this.field4965.method3641(34165, 7681);
         this.field4965.method3642(2, 34168, 770);
         this.field4965.method3669(0, 34167, 770);
         OpenGL.glTexGeni(8192, 9472, 34066);
         OpenGL.glTexGeni(8193, 9472, 34066);
         OpenGL.glTexGeni(8194, 9472, 34066);
         OpenGL.glEnable(3168);
         OpenGL.glEnable(3169);
         OpenGL.glEnable(3170);
         this.field4965.method3638(0);
         this.field3449.method3054();
         this.field3449.method3056(1);
         this.field4965.method3638(1);
         this.field4965.method3641(8448, 8448);
         this.field4965.method3642(2, 34166, 770);
         this.field4965.method3669(0, 5890, 770);
         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         OpenGL.glDisable(3170);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         this.field4965.method3638(0);
         this.field3449.method3054();
      }

   }

   void method3007() {
      if (this.field3448) {
         this.field3449.method3055('\u0001');
         this.field4965.method3638(1);
         this.field4965.method3639((class203)null);
         this.field4965.method3638(0);
      } else {
         this.field4965.method3669(0, 5890, 770);
      }

      this.field4965.method3641(8448, 8448);
      this.field3448 = false;
   }

   void method3008() {
      if (this.field3448) {
         this.field3449.method3055('\u0001');
         this.field4965.method3638(1);
         this.field4965.method3639((class203)null);
         this.field4965.method3638(0);
      } else {
         this.field4965.method3669(0, 5890, 770);
      }

      this.field4965.method3641(8448, 8448);
      this.field3448 = false;
   }

   void method3009(int var1, int var2) {
   }

   void method3000() {
      if (this.field3448) {
         this.field3449.method3055('\u0001');
         this.field4965.method3638(1);
         this.field4965.method3639((class203)null);
         this.field4965.method3638(0);
      } else {
         this.field4965.method3669(0, 5890, 770);
      }

      this.field4965.method3641(8448, 8448);
      this.field3448 = false;
   }

   void method3011(int var1, int var2) {
   }

   void method2998(int var1, int var2) {
   }

   void method3013(int var1, int var2) {
   }

   void method3010(class203 var1, int var2) {
      this.field4965.method3639(var1);
      this.field4965.method3626(var2);
   }

   void method3015(class203 var1, int var2) {
      this.field4965.method3639(var1);
      this.field4965.method3626(var2);
   }

   boolean method3016() {
      return true;
   }
}
