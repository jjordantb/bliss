import jaggl.OpenGL;

public class class301 extends class9 {
    static char field3811 = '\u0001';
    static char field3812 = 0;
    static float[] field3815 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
    class212 field3810;
    class41 field3813;
    class604 field3814;

    class301(class13 var1, class604 var2) {
        super(var1);
        this.field3814 = var2;
        this.method2373();
        this.field3810 = new class212(super.field4965, class264.field8201, class482.field8399, 2, new byte[]{0, -1}, class264.field8201);
        this.field3810.method3879(false);
    }

    boolean method2997() {
        return true;
    }

    void method3014(boolean var1) {
        super.field4965.method3641(260, 8448);
    }

    void method2999(int var1, int var2) {
        if ((var1 & 1) == 1) {
            if (this.field3814.field8716) {
                super.field4965.method3639(this.field3814.field8718);
                field3815[0] = 0.0F;
                field3815[1] = 0.0F;
                field3815[2] = 0.0F;
                field3815[3] = (float) (super.field4965.field6749 % 4000) / 4000.0F;
                OpenGL.glTexGenfv(8194, 9473, field3815, 0);
            } else {
                int var3 = super.field4965.field6749 % 4000 * 16 / 4000;
                super.field4965.method3639(this.field3814.field8723[var3]);
            }
        } else if (this.field3814.field8716) {
            super.field4965.method3639(this.field3814.field8718);
            field3815[0] = 0.0F;
            field3815[1] = 0.0F;
            field3815[2] = 0.0F;
            field3815[3] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, field3815, 0);
        } else {
            super.field4965.method3639(this.field3814.field8723[0]);
        }

    }

    void method2996(class203 var1, int var2) {
    }

    void method2373() {
        this.field3813 = new class41(super.field4965, 2);
        this.field3813.method3056(0);
        super.field4965.method3638(1);
        super.field4965.method3641(7681, 260);
        super.field4965.method3642(0, 34168, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field4965.method3638(0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field3814.field8716) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }

        this.field3813.method3054();
        this.field3813.method3056(1);
        super.field4965.method3638(1);
        super.field4965.method3641(8448, 8448);
        super.field4965.method3642(0, 5890, 768);
        OpenGL.glDisable(3168);
        super.field4965.method3638(0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field3814.field8716) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }

        this.field3813.method3054();
    }

    void method3000() {
        this.field3813.method3055('\u0001');
        if (super.field4965.field6694 > 0) {
            super.field4965.method3638(1);
            super.field4965.method3639((class203) null);
            super.field4965.method3621(1.0F, 0.0F);
            super.field4965.method3638(0);
        }

        super.field4965.method3641(8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    void method3001(boolean var1) {
        if (super.field4965.field6694 > 0) {
            float var2 = -0.5F / (float) super.field4965.field6694;
            super.field4965.method3638(1);
            field3815[0] = 0.0F;
            field3815[1] = 0.0F;
            field3815[2] = var2;
            field3815[3] = super.field4965.field6829 * var2 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, field3815, 0);
            OpenGL.glPopMatrix();
            super.field4965.method3621(0.5F, (float) super.field4965.field6694);
            super.field4965.method3639(this.field3810);
            super.field4965.method3638(0);
        }

        this.field3813.method3055('\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }
}
