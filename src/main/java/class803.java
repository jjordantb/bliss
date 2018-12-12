import jaggl.OpenGL;

public class class803 extends class913 {
   static int[] field4581 = new int[4];
   class169 field4582;
   class13 field4583;

   int method2883() {
      return this.field4582.field6687;
   }

   class169 method6478() {
      return this.field4582;
   }

   boolean method2884(class169 var1, class169 var2, float var3) {
      boolean var4 = true;
      class275 var5 = this.field4583.field6835;
      this.field4583.method4830(field4581);
      this.field4583.method4827();
      this.field4583.method3674();
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glPushAttrib(2048);
      OpenGL.glViewport(0, 0, this.field4582.field6687, this.field4582.field6687);
      this.field4583.method3609(false);
      this.field4583.method3645(false);
      this.field4583.method3647(false);
      this.field4583.method3664(false);
      this.field4583.method3658(-2);
      this.field4583.method3638(1);
      this.field4583.method3643(0.0F, 0.0F, 0.0F, var3);
      this.field4583.method3641(34165, 34165);
      this.field4583.method3639(var2);
      this.field4583.method3638(0);
      this.field4583.method3626(1);
      this.field4583.method3639(var1);
      this.field4583.method5009(var5, (byte)35);

      for(int var6 = 0; var6 < 6; ++var6) {
         int var7 = '蔕' + var6;
         var5.method2839(0, this.field4582.method3575(var7, 0));
         var5.method6624(0);
         if (!var5.method2836()) {
            var4 = false;
            break;
         }

         OpenGL.glBegin(7);
         switch(var7) {
         case 34069:
            OpenGL.glTexCoord3i(65535, 65534, 65534);
            OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(65535, 65534, -65534);
            OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(65535, -65534, -65534);
            OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(65535, -65534, 65534);
            OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34070:
            OpenGL.glTexCoord3i(-65535, 65534, -65534);
            OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(-65535, 65534, 65534);
            OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(-65535, -65534, 65534);
            OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65535, -65534, -65534);
            OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34071:
            OpenGL.glTexCoord3i(-65534, 65535, -65534);
            OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(65534, 65535, -65534);
            OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(65534, 65535, 65534);
            OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, 65535, 65534);
            OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34072:
            OpenGL.glTexCoord3i(-65534, -65535, 65534);
            OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(65534, -65535, 65534);
            OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(65534, -65535, -65534);
            OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, -65535, -65534);
            OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34073:
            OpenGL.glTexCoord3i(-65534, 65534, 65535);
            OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(65534, 65534, 65535);
            OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(65534, -65534, 65535);
            OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, -65534, 65535);
            OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34074:
            OpenGL.glTexCoord3i(65534, 65534, -65535);
            OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(-65534, 65534, -65535);
            OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(-65534, -65534, -65535);
            OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(65534, -65534, -65535);
            OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
            OpenGL.glVertex2f(0.0F, 1.0F);
         }

         OpenGL.glEnd();
      }

      var5.method2839(0, (class813)null);
      this.field4583.method4818(var5, (byte)34);
      this.field4583.method3638(1);
      this.field4583.method3639((class203)null);
      this.field4583.method3641(8448, 8448);
      this.field4583.method3638(0);
      this.field4583.method3639((class203)null);
      OpenGL.glPopAttrib();
      this.field4583.method4986(field4581[0], field4581[1], field4581[2], field4581[3]);
      if (var4 && !this.field4583.field6859) {
         this.field4582.method4292();
      }

      return var4;
   }

   class169 method6479() {
      return this.field4582;
   }

   class803(class13 var1, int var2) {
      this.field4583 = var1;
      this.field4582 = new class169(var1, class264.field8191, class482.field8399, var2);
   }
}
