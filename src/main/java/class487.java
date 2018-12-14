import jaggl.OpenGL;

public class class487 {
    static int field8542 = 35632;
    static int field8543 = 35633;
    static int[] field8545 = new int[2];
    int field8541;
    class13 field8544;

    class487(class13 var1, int var2, int var3) {
        this.field8544 = var1;
        this.field8541 = var2;
    }

    static class487 method4771(class13 var0, int var1, String var2) {
        int var3 = OpenGL.glCreateShader(var1);
        OpenGL.glShaderSource(var3, var2);
        OpenGL.glCompileShader(var3);
        OpenGL.glGetShaderiv(var3, 35713, field8545, 0);
        if (field8545[0] == 0) {
            if (field8545[0] == 0) {
                OpenGL.glGetShaderiv(var3, 35716, field8545, 1);
            }

            if (field8545[1] > 1) {
                byte[] var4 = new byte[field8545[1]];
                OpenGL.glGetShaderInfoLog(var3, field8545[1], field8545, 0, var4, 0);
            }

            if (field8545[0] == 0) {
                OpenGL.glDeleteShader(var3);
                return null;
            }
        }

        return new class487(var0, var3, var1);
    }
}
