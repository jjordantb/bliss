import jaggl.OpenGL;

public class class795 extends class9 {
   float field520;
   int field521;
   static char field522 = '\u0001';
   static String field523 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
   class463 field524;
   float[] field525;
   static char field526 = 0;
   class41 field527;
   class604 field528;
   static float[] field529 = new float[4];

   boolean method2997() {
      return true;
   }

   void method454() {
      this.field527 = new class41(super.field4965, 2);
      this.field527.method3056(0);
      super.field4965.method3638(1);
      super.field4965.method3656(-16777216);
      super.field4965.method3641(260, 7681);
      super.field4965.method3669(0, 34166, 770);
      super.field4965.method3638(0);
      OpenGL.glBindProgramARB(34336, this.field524.field7350);
      OpenGL.glEnable(34336);
      this.field527.method3054();
      this.field527.method3056(1);
      super.field4965.method3638(1);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      super.field4965.method3626(0);
      super.field4965.method3669(0, 5890, 770);
      super.field4965.method3638(0);
      OpenGL.glBindProgramARB(34336, 0);
      OpenGL.glDisable(34336);
      OpenGL.glDisable(34820);
      this.field527.method3054();
   }

   void method3001(boolean var1) {
      if (this.field527 != null) {
         this.field527.method3055('\u0000');
         super.field4965.method3638(1);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadMatrixf(super.field4965.field6776.field325, 0);
         OpenGL.glMatrixMode(5888);
         super.field4965.method3638(0);
         if (this.field521 != super.field4965.field6749) {
            int var2 = super.field4965.field6749 % 5000 * 128 / 5000;

            for(int var3 = 0; var3 < 64; ++var3) {
               OpenGL.glProgramLocalParameter4fvARB(34336, var3, this.field525, var2);
               var2 += 2;
            }

            if (this.field528.field8716) {
               this.field520 = (float)(super.field4965.field6749 % 4000) / 4000.0F;
            } else {
               OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }

            this.field521 = super.field4965.field6749;
         }
      }

   }

   void method3000() {
      if (this.field527 != null) {
         this.field527.method3055('\u0001');
         super.field4965.method3638(1);
         super.field4965.method3639((class203)null);
         super.field4965.method3638(0);
      }

   }

   void method2999(int var1, int var2) {
      if (this.field527 != null) {
         super.field4965.method3638(1);
         int var3;
         if ((var1 & 128) == 0) {
            if ((var2 & 1) == 1) {
               if (!this.field528.field8716) {
                  var3 = super.field4965.field6749 % 4000 * 16 / 4000;
                  super.field4965.method3639(this.field528.field8723[var3]);
                  OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
               } else {
                  super.field4965.method3639(this.field528.field8718);
                  OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field520, 0.0F, 0.0F, 1.0F);
               }
            } else {
               if (this.field528.field8716) {
                  super.field4965.method3639(this.field528.field8718);
               } else {
                  super.field4965.method3639(this.field528.field8723[0]);
               }

               OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            super.field4965.method3639((class203)null);
         }

         super.field4965.method3638(0);
         if ((var1 & 64) == 0) {
            field529[0] = super.field4965.field6817 * super.field4965.field6812;
            field529[1] = super.field4965.field6817 * super.field4965.field6815;
            field529[2] = super.field4965.field6817 * super.field4965.field6878;
            OpenGL.glProgramLocalParameter4fvARB(34336, 66, field529, 0);
         } else {
            OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
         }

         var3 = var1 & 3;
         if (var3 == 2) {
            OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
         } else if (var3 == 3) {
            OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
         } else {
            OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
         }
      }

   }

   void method3014(boolean var1) {
   }

   void method2996(class203 var1, int var2) {
      super.field4965.method3639(var1);
      super.field4965.method3626(var2);
   }

   class795(class13 var1, class604 var2) {
      super(var1);
      this.field528 = var2;
      if (super.field4965.field6726 && super.field4965.field6852 >= 2) {
         this.field524 = class463.method4038(super.field4965, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
         if (this.field524 != null) {
            int[][] var3 = class733.method1780(64, 256, 0, 4, 4, 3, 0.4F, false, (byte)25);
            int[][] var4 = class733.method1780(64, 256, 8, 4, 4, 3, 0.4F, false, (byte)80);
            int var5 = 0;
            this.field525 = new float['耀'];

            for(int var6 = 0; var6 < 256; ++var6) {
               int[] var7 = var3[var6];
               int[] var8 = var4[var6];

               for(int var9 = 0; var9 < 64; ++var9) {
                  this.field525[var5++] = (float)var7[var9] / 4096.0F;
                  this.field525[var5++] = (float)var8[var9] / 4096.0F;
               }
            }

            this.method454();
         }
      }

   }
}
