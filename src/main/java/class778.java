import jaggl.OpenGL;

public class class778 {
   class13 field3753;
   class441 field3754;
   static String field3755 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";

   boolean method2329(class546 var1, class546 var2, float var3) {
      if (!this.method2330()) {
         return false;
      } else {
         class275 var4 = this.field3753.field6835;
         class239 var5 = new class239(this.field3753, class264.field8191, class482.field8399, var1.field3831, var1.field3832);
         boolean var6 = false;
         this.field3753.method5009(var4, (byte)27);
         var4.method2839(0, var5);
         if (var4.method2836()) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, var1.field3831, var1.field3832);
            OpenGL.glUseProgram(this.field3754.field7640);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.field3754.field7640, "heightMap"), 0);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.field3754.field7640, "rcpRelief"), 1.0F / var3);
            OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.field3754.field7640, "sampleSize"), 1.0F / (float)var2.field3831, 1.0F / (float)var2.field3832);

            for(int var7 = 0; var7 < var1.field3830; ++var7) {
               float var8 = (float)var7 / (float)var1.field3830;
               this.field3753.method3639(var2);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord3f(0.0F, 0.0F, var8);
               OpenGL.glVertex2f(0.0F, 0.0F);
               OpenGL.glTexCoord3f(1.0F, 0.0F, var8);
               OpenGL.glVertex2f(1.0F, 0.0F);
               OpenGL.glTexCoord3f(1.0F, 1.0F, var8);
               OpenGL.glVertex2f(1.0F, 1.0F);
               OpenGL.glTexCoord3f(0.0F, 1.0F, var8);
               OpenGL.glVertex2f(0.0F, 1.0F);
               OpenGL.glEnd();
               var1.method2394(0, 0, var7, var1.field3831, var1.field3832, 0, 0);
            }

            OpenGL.glUseProgram(0);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var6 = true;
         }

         var4.method2839(0, (class813)null);
         this.field3753.method4818(var4, (byte)7);
         return var6;
      }
   }

   boolean method2330() {
      if (this.field3753.field6857 && this.field3753.field6780 && this.field3754 == null) {
         class487 var1 = class487.method4771(this.field3753, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
         if (var1 != null) {
            this.field3754 = class441.method4329(this.field3753, new class487[]{var1});
         }
      }

      return this.field3754 != null;
   }

   class778(class13 var1) {
      this.field3753 = var1;
   }
}
