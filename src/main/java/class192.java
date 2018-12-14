import java.awt.*;
import java.util.Stack;

public class class192 {
    static Stack field7025 = new Stack();
    public Interactable field7022;
    boolean field7023;
    class472 field7024;

    static final void method3741(class744 var0, short var1) {
        try {
            class530.method2314(1451563513);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ny.agj(" + ')');
        }
    }

    static void method3742(int var0) {
        try {
            if (class593.field1623.method4879()) {
                class593.field1623.method4815(class837.field9161, 1231237984);
                class406.method5547(600492820);
                Dimension var1 = class837.field9161.getSize();
                class593.field1623.method5032(class837.field9161, var1.width, var1.height, 900330778);
                class593.field1623.method4816(class837.field9161, (byte) -92);
            } else {
                class337.method77(class615.field8903.field9137.method3689(-644336063), false, 622850291);
            }

            class881.method6172(-103765582);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "ny.fx(" + ')');
        }
    }

    static final void method3743(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            var0.field3161[++var0.field3156 - 1] = Character.toUpperCase((char) var2);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ny.aan(" + ')');
        }
    }

    static final void method3744(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            class205 var3 = class848.field8597.method3399(var2, -1382788353);
            if (var3.field7622 == null) {
                var0.field3161[++var0.field3156 - 1] = 0;
            } else {
                var0.field3161[++var0.field3156 - 1] = var3.field7622.length;
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ny.acj(" + ')');
        }
    }

    public boolean method3740(class848 var1, int var2, int var3, int var4) {
        try {
            int var5 = this.field7022.method2163((byte) 34);
            if (this.field7022.field3642 != null) {
                for (int var6 = 0; var6 < this.field7022.field3642.length; ++var6) {
                    this.field7022.field3642[var6].field7250 <<= var5;
                    if (this.field7022.field3642[var6].method3926(this.field7024.field8233 + var2, this.field7024.field8231 + var3) && this.field7022.method2157(var1, var2, var3, (byte) 1)) {
                        this.field7022.field3642[var6].field7250 >>= var5;
                        return true;
                    }

                    this.field7022.field3642[var6].field7250 >>= var5;
                }
            }

            return false;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "ny.p(" + ')');
        }
    }
}
