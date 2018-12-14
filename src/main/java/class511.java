public class class511 extends Animator {
    Interactable field4149;

    class511(Interactable var1, boolean var2) {
        super(var2);
        this.field4149 = var1;
    }

    static boolean method2616(class265 var0, byte var1) {
        try {
            ObjectDefinition var2 = class730.field2697.method5283(1998541007).method4713(var0.method4551((byte) 21));
            if (-1 == var2.field2232) {
                return true;
            } else {
                class279 var3 = class981.field3274.method2003(var2.field2232, -2130110173);
                return -1 == var3.field10587 ? true : var3.method6610((byte) 7);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "aew.d(" + ')');
        }
    }

    void method2793(Animation var1, int var2, byte var3) {
        try {
            class440.method4332(var1, var2, this.field4149, -1175411035);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "aew.l(" + ')');
        }
    }
}
