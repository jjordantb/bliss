import jaggl.OpenGL;

public class class169 extends class203 {
    static int field6681 = 34074;
    static int field6682 = 34069;
    static int field6683 = 34071;
    static int field6684 = 34072;
    static int field6685 = 34073;
    static int field6686 = 34070;
    int field6687;

    class169(class13 var1, class264 var2, class482 var3, int var4) {
        super(var1, 34067, var2, var3, var4 * var4 * 6, false);
        this.field6687 = var4;
        super.field7571.method3639(this);

        for (int var5 = 0; var5 < 6; ++var5) {
            OpenGL.glTexImage2Dub('蔕' + var5, 0, class13.method3657(super.field7567, super.field7568), var4, var4, 0, class13.method3611(super.field7567), 5121, (byte[]) null, 0);
        }

        this.method4289(true);
    }

    class169(class13 var1, class264 var2, class482 var3, int var4, boolean var5, byte[][] var6, class264 var7) {
        super(var1, 34067, var2, var3, var4 * var4 * 6, var5);
        this.field6687 = var4;
        super.field7571.method3639(this);

        for (int var8 = 0; var8 < 6; ++var8) {
            OpenGL.glTexImage2Dub('蔕' + var8, 0, class13.method3657(super.field7567, super.field7568), var4, var4, 0, class13.method3611(var7), 5121, var6[var8], 0);
        }

        this.method4289(true);
    }

    class169(class13 var1, class264 var2, class482 var3, int var4, boolean var5, int[][] var6) {
        super(var1, 34067, var2, var3, var4 * var4 * 6, var5);
        this.field6687 = var4;
        super.field7571.method3639(this);
        int var7;
        if (var5) {
            for (var7 = 0; var7 < 6; ++var7) {
                method4290('蔕' + var7, class13.method3657(super.field7567, super.field7568), var4, var4, 32993, super.field7571.field6873, var6[var7]);
            }
        } else {
            for (var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di('蔕' + var7, 0, class13.method3657(super.field7567, super.field7568), var4, var4, 0, 32993, super.field7571.field6873, var6[var7], 0);
            }
        }

        this.method4289(true);
    }

    class813 method3575(int var1, int var2) {
        return new class100(this, var1, var2);
    }
}
