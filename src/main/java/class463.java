import jaggl.OpenGL;

public class class463 {
   static int[] field7348 = new int[1];
   class13 field7349;
   int field7350;
   static int field7351 = 34336;

   static class463 method4038(class13 var0, int var1, String var2) {
      int var3 = OpenGL.glGenProgramARB();
      OpenGL.glBindProgramARB(var1, var3);
      OpenGL.glProgramStringARB(var1, 34933, var2);
      OpenGL.glGetIntegerv(34379, field7348, 0);
      if (field7348[0] != -1) {
         OpenGL.glBindProgramARB(var1, 0);
         return null;
      } else {
         OpenGL.glBindProgramARB(var1, 0);
         return new class463(var0, var1, var3);
      }
   }

   class463(class13 var1, int var2, int var3) {
      this.field7349 = var1;
      this.field7350 = var3;
   }
}
