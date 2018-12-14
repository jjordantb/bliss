import java.io.FileOutputStream;

public class class919 {
    protected static int field10433;
    static FileOutputStream field10431;
    public int field10425;
    public int field10426;
    public int field10427;
    public int field10429;
    public int field10430;
    public int field10432;
    int field10428;

    public class919(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.field10426 = var1;
        this.field10425 = var2;
        this.field10427 = var3;
        this.field10428 = var4;
        this.field10429 = var5;
        this.field10430 = var6;
        this.field10432 = var7;
    }

    public class919() {
    }

    static boolean method6485(byte var0) {
        try {
            boolean var3;
            try {
                class2 var1 = new class2();
                byte[] var2 = var1.method2969(class791.field445, (short) 23578);
                class830.method5374(var2, -161656424);
                var3 = true;
            } catch (Exception var4) {
                return false;
            }

            return var3;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "dd.p(" + ')');
        }
    }

    static void method6486(int var0, int var1) {
        try {
            if (Loader.field6962 && 136 != class881.field10140) {
                if (Loader.field6962 && 264 == class881.field10140) {
                    class881.field10143 = var0;
                }
            } else {
                class881.field10164 = var0;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "dd.j(" + ')');
        }
    }

    static final void method6487(class744 var0, short var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            var0.field3161[++var0.field3156 - 1] = class730.field2810[var2];
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "dd.tr(" + ')');
        }
    }

    public boolean method6484(class919 var1, byte var2) {
        try {
            return var1.field10426 == this.field10426 && var1.field10425 == this.field10425 && this.field10427 == var1.field10427 && this.field10428 == var1.field10428 && this.field10429 == var1.field10429 && this.field10430 == var1.field10430 && var1.field10432 == this.field10432;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "dd.a(" + ')');
        }
    }
}
