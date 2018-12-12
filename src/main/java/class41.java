import jaggl.OpenGL;

public class class41 {
   int field5082;

   void method3054() {
      OpenGL.glEndList();
   }

   void method3055(char var1) {
      OpenGL.glCallList(this.field5082 + var1);
   }

   void method3056(int var1) {
      OpenGL.glNewList(this.field5082 + var1, 4864);
   }

   class41(class13 var1, int var2) {
      this.field5082 = OpenGL.glGenLists(var2);
   }
}
