import jaggl.OpenGL;

public class class183 extends class210 {
   class275 field5232;
   static float field5233 = 0.25F;
   static float field5234 = 1.0F;
   static float field5235 = 1.0F;
   static String field5236 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
   class441 field5237;
   static String field5238 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
   static int field5239 = 256;
   static String field5240 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n";
   class275 field5241;
   class678 field5242;
   class678 field5243;
   static String field5244 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
   class441 field5245;
   int field5246;
   int field5247;
   int field5248;
   class441 field5249;
   int field5250;
   class441 field5251;
   class678[] field5252;

   boolean method3846() {
      if (this.field7211.field6857 && this.field7211.field6780 && this.field7211.field6820) {
         this.field5241 = new class275(this.field7211);
         this.field5242 = new class678(this.field7211, 3553, class264.field8191, class482.field8396, 256, 256);
         this.field5242.method4212(false, false);
         this.field5243 = new class678(this.field7211, 3553, class264.field8191, class482.field8396, 256, 256);
         this.field5243.method4212(false, false);
         this.field7211.method5009(this.field5241, (byte)112);
         this.field5241.method2839(0, this.field5242.method4215(0));
         this.field5241.method2839(1, this.field5243.method4215(0));
         this.field5241.method6624(0);
         if (!this.field5241.method2836()) {
            this.field7211.method4818(this.field5241, (byte)-107);
            return false;
         } else {
            this.field7211.method4818(this.field5241, (byte)-15);
            this.field5237 = class441.method4329(this.field7211, new class487[]{class487.method4771(this.field7211, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.field5251 = class441.method4329(this.field7211, new class487[]{class487.method4771(this.field7211, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.field5245 = class441.method4329(this.field7211, new class487[]{class487.method4771(this.field7211, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")});
            this.field5249 = class441.method4329(this.field7211, new class487[]{class487.method4771(this.field7211, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
            return this.field5251 != null && this.field5237 != null && this.field5245 != null && this.field5249 != null;
         }
      } else {
         return false;
      }
   }

   class482 method3244() {
      return class482.field8396;
   }

   boolean method3845() {
      return this.field5241 != null;
   }

   boolean method3861() {
      return this.field5241 != null;
   }

   class482 method3245() {
      return class482.field8396;
   }

   void method3847() {
      this.field5248 = -1;
      this.field5250 = -1;
      this.field5232 = null;
      this.field5252 = null;
      this.field5241 = null;
      this.field5242 = null;
      this.field5243 = null;
      this.field5237 = null;
      this.field5251 = null;
      this.field5245 = null;
      this.field5249 = null;
   }

   void method3848(int var1, int var2) {
      this.field5247 = var1;
      this.field5246 = var2;
      int var3 = class236.method4619(this.field5247, 1918937807);
      int var4 = class236.method4619(this.field5246, 1314388027);
      if (this.field5250 != var3 || this.field5248 != var4) {
         int var5;
         if (this.field5252 != null) {
            for(var5 = 0; var5 < this.field5252.length; ++var5) {
               this.field5252[var5].method4287();
            }

            this.field5252 = null;
         }

         if (var3 <= 256 && var4 <= 256) {
            this.field5232 = null;
         } else {
            var5 = var3;
            int var6 = var4;
            int var7 = 0;

            label59:
            while(true) {
               if (var5 <= 256 && var6 <= 256) {
                  if (this.field5232 == null) {
                     this.field5232 = new class275(this.field7211);
                  }

                  this.field5252 = new class678[var7];
                  var5 = var3;
                  var6 = var4;
                  var7 = 0;

                  while(true) {
                     if (var5 <= 256 && var6 <= 256) {
                        break label59;
                     }

                     this.field5252[var7++] = new class678(this.field7211, 3553, class264.field8191, class482.field8396, var5, var6);
                     if (var5 > 256) {
                        var5 >>= 1;
                     }

                     if (var6 > 256) {
                        var6 >>= 1;
                     }
                  }
               }

               if (var5 > 256) {
                  var5 >>= 1;
               }

               if (var6 > 256) {
                  var6 >>= 1;
               }

               ++var7;
            }
         }

         this.field5250 = var3;
         this.field5248 = var4;
      }

   }

   void method3850(int var1) {
      OpenGL.glUseProgram(0);
      this.field7211.method3638(1);
      this.field7211.method3639((class203)null);
      this.field7211.method3638(0);
   }

   class482 method3852() {
      return class482.field8396;
   }

   void method3860(int var1, int var2) {
      this.field5247 = var1;
      this.field5246 = var2;
      int var3 = class236.method4619(this.field5247, 1360936610);
      int var4 = class236.method4619(this.field5246, 1074782076);
      if (this.field5250 != var3 || this.field5248 != var4) {
         int var5;
         if (this.field5252 != null) {
            for(var5 = 0; var5 < this.field5252.length; ++var5) {
               this.field5252[var5].method4287();
            }

            this.field5252 = null;
         }

         if (var3 <= 256 && var4 <= 256) {
            this.field5232 = null;
         } else {
            var5 = var3;
            int var6 = var4;
            int var7 = 0;

            label59:
            while(true) {
               if (var5 <= 256 && var6 <= 256) {
                  if (this.field5232 == null) {
                     this.field5232 = new class275(this.field7211);
                  }

                  this.field5252 = new class678[var7];
                  var5 = var3;
                  var6 = var4;
                  var7 = 0;

                  while(true) {
                     if (var5 <= 256 && var6 <= 256) {
                        break label59;
                     }

                     this.field5252[var7++] = new class678(this.field7211, 3553, class264.field8191, class482.field8396, var5, var6);
                     if (var5 > 256) {
                        var5 >>= 1;
                     }

                     if (var6 > 256) {
                        var6 >>= 1;
                     }
                  }
               }

               if (var5 > 256) {
                  var5 >>= 1;
               }

               if (var6 > 256) {
                  var6 >>= 1;
               }

               ++var7;
            }
         }

         this.field5250 = var3;
         this.field5248 = var4;
      }

   }

   void method3855(int var1, class678 var2, class678 var3) {
      OpenGL.glPushAttrib(2048);
      OpenGL.glMatrixMode(5889);
      OpenGL.glPushMatrix();
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      int var4;
      int var5;
      if (this.field5252 != null) {
         this.field7211.method5009(this.field5232, (byte)9);
         var4 = class236.method4619(this.field5247, 2071757561);
         var5 = class236.method4619(this.field5246, 1398420241);

         int var6;
         for(var6 = 0; var4 > 256 || var5 > 256; ++var6) {
            OpenGL.glViewport(0, 0, var4, var5);
            this.field5232.method2839(0, this.field5252[var6].method4215(0));
            if (var6 == 0) {
               this.field7211.method3639(var2);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f((float)this.field5247, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f((float)this.field5247, (float)this.field5246);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, (float)this.field5246);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            } else {
               this.field7211.method3639(this.field5252[var6 - 1]);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f(1.0F, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f(1.0F, 1.0F);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, 1.0F);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            }

            if (var4 > 256) {
               var4 >>= 1;
            }

            if (var5 > 256) {
               var5 >>= 1;
            }
         }

         this.field7211.method4818(this.field5232, (byte)-59);
         this.field7211.method3639(this.field5252[var6 - 1]);
         this.field7211.method5009(this.field5241, (byte)-3);
         this.field5241.method6624(0);
         OpenGL.glViewport(0, 0, 256, 256);
         int var7 = this.field5251.field7640;
         OpenGL.glUseProgram(var7);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var7, "params"), field5235, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f(1.0F, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f(1.0F, 1.0F);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, 1.0F);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      } else {
         this.field7211.method3639(var2);
         this.field7211.method5009(this.field5241, (byte)-8);
         this.field5241.method6624(0);
         OpenGL.glViewport(0, 0, 256, 256);
         var4 = this.field5237.field7640;
         OpenGL.glUseProgram(var4);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "params"), field5235, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f((float)this.field5247, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f((float)this.field5247, (float)this.field5246);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, (float)this.field5246);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      }

      this.field5241.method6624(1);
      this.field7211.method3639(this.field5242);
      var4 = this.field5249.field7640;
      OpenGL.glUseProgram(var4);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "baseTex"), 0);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "step"), 0.00390625F, 0.0F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      this.field5241.method6624(0);
      this.field7211.method3639(this.field5243);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "step"), 0.0F, 0.00390625F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      OpenGL.glPopAttrib();
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
      this.field7211.method4818(this.field5241, (byte)2);
      var5 = this.field5245.field7640;
      OpenGL.glUseProgram(var5);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var5, "sceneTex"), 0);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var5, "bloomTex"), 1);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var5, "params"), field5233, field5234, 0.0F);
      this.field7211.method3638(1);
      this.field7211.method3639(this.field5242);
      this.field7211.method3638(0);
      this.field7211.method3639(var2);
   }

   boolean method3859() {
      if (this.field7211.field6857 && this.field7211.field6780 && this.field7211.field6820) {
         this.field5241 = new class275(this.field7211);
         this.field5242 = new class678(this.field7211, 3553, class264.field8191, class482.field8396, 256, 256);
         this.field5242.method4212(false, false);
         this.field5243 = new class678(this.field7211, 3553, class264.field8191, class482.field8396, 256, 256);
         this.field5243.method4212(false, false);
         this.field7211.method5009(this.field5241, (byte)-80);
         this.field5241.method2839(0, this.field5242.method4215(0));
         this.field5241.method2839(1, this.field5243.method4215(0));
         this.field5241.method6624(0);
         if (!this.field5241.method2836()) {
            this.field7211.method4818(this.field5241, (byte)15);
            return false;
         } else {
            this.field7211.method4818(this.field5241, (byte)-37);
            this.field5237 = class441.method4329(this.field7211, new class487[]{class487.method4771(this.field7211, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.field5251 = class441.method4329(this.field7211, new class487[]{class487.method4771(this.field7211, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.field5245 = class441.method4329(this.field7211, new class487[]{class487.method4771(this.field7211, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")});
            this.field5249 = class441.method4329(this.field7211, new class487[]{class487.method4771(this.field7211, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
            return this.field5251 != null && this.field5237 != null && this.field5245 != null && this.field5249 != null;
         }
      } else {
         return false;
      }
   }

   void method3844() {
      this.field5248 = -1;
      this.field5250 = -1;
      this.field5232 = null;
      this.field5252 = null;
      this.field5241 = null;
      this.field5242 = null;
      this.field5243 = null;
      this.field5237 = null;
      this.field5251 = null;
      this.field5245 = null;
      this.field5249 = null;
   }

   void method3854(int var1, class678 var2, class678 var3) {
      OpenGL.glPushAttrib(2048);
      OpenGL.glMatrixMode(5889);
      OpenGL.glPushMatrix();
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      int var4;
      int var5;
      if (this.field5252 != null) {
         this.field7211.method5009(this.field5232, (byte)-3);
         var4 = class236.method4619(this.field5247, 1462499323);
         var5 = class236.method4619(this.field5246, 1465383629);

         int var6;
         for(var6 = 0; var4 > 256 || var5 > 256; ++var6) {
            OpenGL.glViewport(0, 0, var4, var5);
            this.field5232.method2839(0, this.field5252[var6].method4215(0));
            if (var6 == 0) {
               this.field7211.method3639(var2);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f((float)this.field5247, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f((float)this.field5247, (float)this.field5246);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, (float)this.field5246);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            } else {
               this.field7211.method3639(this.field5252[var6 - 1]);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f(1.0F, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f(1.0F, 1.0F);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, 1.0F);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            }

            if (var4 > 256) {
               var4 >>= 1;
            }

            if (var5 > 256) {
               var5 >>= 1;
            }
         }

         this.field7211.method4818(this.field5232, (byte)-15);
         this.field7211.method3639(this.field5252[var6 - 1]);
         this.field7211.method5009(this.field5241, (byte)-7);
         this.field5241.method6624(0);
         OpenGL.glViewport(0, 0, 256, 256);
         int var7 = this.field5251.field7640;
         OpenGL.glUseProgram(var7);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var7, "params"), field5235, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f(1.0F, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f(1.0F, 1.0F);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, 1.0F);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      } else {
         this.field7211.method3639(var2);
         this.field7211.method5009(this.field5241, (byte)-16);
         this.field5241.method6624(0);
         OpenGL.glViewport(0, 0, 256, 256);
         var4 = this.field5237.field7640;
         OpenGL.glUseProgram(var4);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "params"), field5235, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f((float)this.field5247, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f((float)this.field5247, (float)this.field5246);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, (float)this.field5246);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      }

      this.field5241.method6624(1);
      this.field7211.method3639(this.field5242);
      var4 = this.field5249.field7640;
      OpenGL.glUseProgram(var4);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "baseTex"), 0);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "step"), 0.00390625F, 0.0F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      this.field5241.method6624(0);
      this.field7211.method3639(this.field5243);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "step"), 0.0F, 0.00390625F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      OpenGL.glPopAttrib();
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
      this.field7211.method4818(this.field5241, (byte)-14);
      var5 = this.field5245.field7640;
      OpenGL.glUseProgram(var5);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var5, "sceneTex"), 0);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var5, "bloomTex"), 1);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var5, "params"), field5233, field5234, 0.0F);
      this.field7211.method3638(1);
      this.field7211.method3639(this.field5242);
      this.field7211.method3638(0);
      this.field7211.method3639(var2);
   }

   void method3849(int var1, class678 var2, class678 var3) {
      OpenGL.glPushAttrib(2048);
      OpenGL.glMatrixMode(5889);
      OpenGL.glPushMatrix();
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      int var4;
      int var5;
      if (this.field5252 != null) {
         this.field7211.method5009(this.field5232, (byte)61);
         var4 = class236.method4619(this.field5247, 1385804775);
         var5 = class236.method4619(this.field5246, 1199238042);

         int var6;
         for(var6 = 0; var4 > 256 || var5 > 256; ++var6) {
            OpenGL.glViewport(0, 0, var4, var5);
            this.field5232.method2839(0, this.field5252[var6].method4215(0));
            if (var6 == 0) {
               this.field7211.method3639(var2);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f((float)this.field5247, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f((float)this.field5247, (float)this.field5246);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, (float)this.field5246);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            } else {
               this.field7211.method3639(this.field5252[var6 - 1]);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f(1.0F, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f(1.0F, 1.0F);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, 1.0F);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            }

            if (var4 > 256) {
               var4 >>= 1;
            }

            if (var5 > 256) {
               var5 >>= 1;
            }
         }

         this.field7211.method4818(this.field5232, (byte)83);
         this.field7211.method3639(this.field5252[var6 - 1]);
         this.field7211.method5009(this.field5241, (byte)17);
         this.field5241.method6624(0);
         OpenGL.glViewport(0, 0, 256, 256);
         int var7 = this.field5251.field7640;
         OpenGL.glUseProgram(var7);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var7, "params"), field5235, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f(1.0F, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f(1.0F, 1.0F);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, 1.0F);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      } else {
         this.field7211.method3639(var2);
         this.field7211.method5009(this.field5241, (byte)-6);
         this.field5241.method6624(0);
         OpenGL.glViewport(0, 0, 256, 256);
         var4 = this.field5237.field7640;
         OpenGL.glUseProgram(var4);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "params"), field5235, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f((float)this.field5247, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f((float)this.field5247, (float)this.field5246);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, (float)this.field5246);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      }

      this.field5241.method6624(1);
      this.field7211.method3639(this.field5242);
      var4 = this.field5249.field7640;
      OpenGL.glUseProgram(var4);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "baseTex"), 0);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "step"), 0.00390625F, 0.0F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      this.field5241.method6624(0);
      this.field7211.method3639(this.field5243);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "step"), 0.0F, 0.00390625F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      OpenGL.glPopAttrib();
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
      this.field7211.method4818(this.field5241, (byte)-116);
      var5 = this.field5245.field7640;
      OpenGL.glUseProgram(var5);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var5, "sceneTex"), 0);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var5, "bloomTex"), 1);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var5, "params"), field5233, field5234, 0.0F);
      this.field7211.method3638(1);
      this.field7211.method3639(this.field5242);
      this.field7211.method3638(0);
      this.field7211.method3639(var2);
   }

   void method3856(int var1) {
      OpenGL.glUseProgram(0);
      this.field7211.method3638(1);
      this.field7211.method3639((class203)null);
      this.field7211.method3638(0);
   }

   void method3857(int var1) {
      OpenGL.glUseProgram(0);
      this.field7211.method3638(1);
      this.field7211.method3639((class203)null);
      this.field7211.method3638(0);
   }

   boolean method3853() {
      if (this.field7211.field6857 && this.field7211.field6780 && this.field7211.field6820) {
         this.field5241 = new class275(this.field7211);
         this.field5242 = new class678(this.field7211, 3553, class264.field8191, class482.field8396, 256, 256);
         this.field5242.method4212(false, false);
         this.field5243 = new class678(this.field7211, 3553, class264.field8191, class482.field8396, 256, 256);
         this.field5243.method4212(false, false);
         this.field7211.method5009(this.field5241, (byte)8);
         this.field5241.method2839(0, this.field5242.method4215(0));
         this.field5241.method2839(1, this.field5243.method4215(0));
         this.field5241.method6624(0);
         if (!this.field5241.method2836()) {
            this.field7211.method4818(this.field5241, (byte)-42);
            return false;
         } else {
            this.field7211.method4818(this.field5241, (byte)12);
            this.field5237 = class441.method4329(this.field7211, new class487[]{class487.method4771(this.field7211, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.field5251 = class441.method4329(this.field7211, new class487[]{class487.method4771(this.field7211, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.field5245 = class441.method4329(this.field7211, new class487[]{class487.method4771(this.field7211, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")});
            this.field5249 = class441.method4329(this.field7211, new class487[]{class487.method4771(this.field7211, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
            return this.field5251 != null && this.field5237 != null && this.field5245 != null && this.field5249 != null;
         }
      } else {
         return false;
      }
   }

   class482 method3246() {
      return class482.field8396;
   }

   class183(class13 var1) {
      super(var1);
   }

   void method3862(int var1, int var2) {
      this.field5247 = var1;
      this.field5246 = var2;
      int var3 = class236.method4619(this.field5247, 1657798261);
      int var4 = class236.method4619(this.field5246, 1091426304);
      if (this.field5250 != var3 || this.field5248 != var4) {
         int var5;
         if (this.field5252 != null) {
            for(var5 = 0; var5 < this.field5252.length; ++var5) {
               this.field5252[var5].method4287();
            }

            this.field5252 = null;
         }

         if (var3 <= 256 && var4 <= 256) {
            this.field5232 = null;
         } else {
            var5 = var3;
            int var6 = var4;
            int var7 = 0;

            label59:
            while(true) {
               if (var5 <= 256 && var6 <= 256) {
                  if (this.field5232 == null) {
                     this.field5232 = new class275(this.field7211);
                  }

                  this.field5252 = new class678[var7];
                  var5 = var3;
                  var6 = var4;
                  var7 = 0;

                  while(true) {
                     if (var5 <= 256 && var6 <= 256) {
                        break label59;
                     }

                     this.field5252[var7++] = new class678(this.field7211, 3553, class264.field8191, class482.field8396, var5, var6);
                     if (var5 > 256) {
                        var5 >>= 1;
                     }

                     if (var6 > 256) {
                        var6 >>= 1;
                     }
                  }
               }

               if (var5 > 256) {
                  var5 >>= 1;
               }

               if (var6 > 256) {
                  var6 >>= 1;
               }

               ++var7;
            }
         }

         this.field5250 = var3;
         this.field5248 = var4;
      }

   }

   boolean method3247() {
      return this.field7211.field6857 && this.field7211.field6780 && this.field7211.field6820;
   }
}
