import jaggl.OpenGL;

public class class512 extends class9 {
    static char field4202 = 0;
    static char field4203 = '\u0001';
    static float[] field4204 = new float[4];
    class604 field4200;
    class41 field4201;

    class512(class13 var1, class604 var2) {
        super(var1);
        this.field4200 = var2;
        this.field4201 = new class41(var1, 2);
        this.field4201.method3056(0);
        super.field4965.method3638(1);
        if (this.field4200.field8716) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }

        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field4965.method3638(0);
        this.field4201.method3054();
        this.field4201.method3056(1);
        super.field4965.method3638(1);
        if (this.field4200.field8716) {
            OpenGL.glDisable(3170);
        }

        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field4965.method3638(0);
        this.field4201.method3054();
    }

    void method3001(boolean var1) {
        this.field4201.method3055('\u0000');
        if (this.field4200.field8716) {
            super.field4965.method3638(1);
            super.field4965.method3639(this.field4200.field8720);
            super.field4965.method3638(0);
        }

    }

    void method3014(boolean var1) {
    }

    void method2996(class203 var1, int var2) {
        super.field4965.method3639(var1);
        super.field4965.method3626(var2);
    }

    void method2999(int var1, int var2) {
        float var3 = -5.0E-4F * (float) ((var1 & 3) + 1);
        float var4 = 5.0E-4F * (float) ((var1 >> 3 & 3) + 1);
        float var5 = (var1 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (var1 & 128) != 0;
        super.field4965.method3638(1);
        if (var6) {
            field4204[0] = var5;
            field4204[1] = 0.0F;
            field4204[2] = 0.0F;
            field4204[3] = 0.0F;
        } else {
            field4204[0] = 0.0F;
            field4204[1] = 0.0F;
            field4204[2] = var5;
            field4204[3] = 0.0F;
        }

        OpenGL.glTexGenfv(8192, 9474, field4204, 0);
        field4204[0] = 0.0F;
        field4204[1] = var5;
        field4204[2] = 0.0F;
        field4204[3] = (float) super.field4965.field6749 * var3 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, field4204, 0);
        if (!this.field4200.field8716) {
            int var7 = (int) (var4 * (float) super.field4965.field6749 * 16.0F);
            super.field4965.method3639(this.field4200.field8719[var7 % 16]);
        } else {
            field4204[0] = 0.0F;
            field4204[1] = 0.0F;
            field4204[2] = 0.0F;
            field4204[3] = (float) super.field4965.field6749 * var4 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, field4204, 0);
        }

        super.field4965.method3638(0);
    }

    void method3000() {
        this.field4201.method3055('\u0001');
        super.field4965.method3638(1);
        super.field4965.method3639((class203) null);
        super.field4965.method3638(0);
    }

    boolean method2997() {
        return true;
    }
}
