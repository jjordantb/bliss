import jaggl.OpenGL;

public class class441 {
    static int[] field7642 = new int[2];
    int field7640;
    class13 field7641;

    class441(class13 var1, int var2, class487[] var3) {
        this.field7641 = var1;
        this.field7640 = var2;
    }

    static class441 method4329(class13 var0, class487[] var1) {
        int var2;
        for (var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] == null || var1[var2].field8541 <= 0) {
                return null;
            }
        }

        var2 = OpenGL.glCreateProgram();

        int var3;
        for (var3 = 0; var3 < var1.length; ++var3) {
            OpenGL.glAttachShader(var2, var1[var3].field8541);
        }

        OpenGL.glLinkProgram(var2);
        OpenGL.glGetProgramiv(var2, 35714, field7642, 0);
        if (field7642[0] == 0) {
            OpenGL.glGetProgramiv(var2, 35716, field7642, 1);
            if (field7642[1] > 1) {
                byte[] var4 = new byte[field7642[1]];
                OpenGL.glGetProgramInfoLog(var2, field7642[1], field7642, 0, var4, 0);
            }

            if (field7642[0] == 0) {
                for (var3 = 0; var3 < var1.length; ++var3) {
                    OpenGL.glDetachShader(var2, var1[var3].field8541);
                }

                OpenGL.glDeleteProgram(var2);
                return null;
            }
        }

        return new class441(var0, var2, var1);
    }
}
