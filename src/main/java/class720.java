import jaggl.OpenGL;

public class class720 extends class9 {
    static String field3615 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
    static String field3619 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
    boolean field3616 = false;
    class441 field3617;
    boolean field3618 = false;
    class604 field3620;

    class720(class13 var1, class604 var2) {
        super(var1);
        this.field3620 = var2;
        if (this.field3620.field8721 != null && super.field4965.field6870 && super.field4965.field6780) {
            class487 var3 = class487.method4771(super.field4965, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            class487 var4 = class487.method4771(super.field4965, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.field3617 = class441.method4329(super.field4965, new class487[]{var3, var4});
            this.field3616 = this.field3617 != null;
        }

    }

    void method3001(boolean var1) {
        class169 var2 = super.field4965.method3663();
        if (this.field3616 && var2 != null) {
            float var3 = 1.0F + (1.0F - Math.abs(super.field4965.field6811[1])) * 2.0F;
            super.field4965.method3638(1);
            super.field4965.method3639(var2);
            super.field4965.method3638(0);
            super.field4965.method3639(this.field3620.field8721);
            int var4 = this.field3617.field7640;
            OpenGL.glUseProgram(var4);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "normalSampler"), 0);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "envMapSampler"), 1);
            OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "sunDir"), -super.field4965.field6811[0], -super.field4965.field6811[1], -super.field4965.field6811[2]);
            OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var4, "sunColour"), super.field4965.field6812 * var3, super.field4965.field6815 * var3, super.field4965.field6878 * var3, 1.0F);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var4, "sunExponent"), 64.0F + Math.abs(super.field4965.field6811[1]) * 928.0F);
            this.field3618 = true;
        }

    }

    boolean method2997() {
        return this.field3616;
    }

    void method2999(int var1, int var2) {
        if (this.field3618) {
            int var3 = 1 << (var1 & 3);
            float var4 = (float) (1 << (var1 >> 3 & 7)) / 32.0F;
            int var5 = var2 & '\uffff';
            float var6 = (float) (var2 >> 16 & 3) / 8.0F;
            float var7 = (float) (var2 >> 19 & 15) / 16.0F;
            float var8 = (float) (var2 >> 23 & 15) / 16.0F;
            int var9 = var2 >> 27 & 15;
            int var10 = this.field3617.field7640;
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "time"), (float) (var3 * super.field4965.field6749 % '鱀') / 40000.0F);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "scale"), var4);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterDepth"), (float) var5);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterOffset"), var6);
            OpenGL.glUniform2f(OpenGL.glGetUniformLocation(var10, "waveIntensity"), var8, var7);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "waveExponent"), (float) var9);
        }

    }

    void method2996(class203 var1, int var2) {
        if (!this.field3618) {
            super.field4965.method3639(var1);
            super.field4965.method3626(var2);
        }

    }

    void method3000() {
        if (this.field3618) {
            super.field4965.method3638(1);
            super.field4965.method3639((class203) null);
            super.field4965.method3638(0);
            super.field4965.method3639((class203) null);
            OpenGL.glUseProgram(0);
            this.field3618 = false;
        }

    }

    void method3014(boolean var1) {
    }
}
