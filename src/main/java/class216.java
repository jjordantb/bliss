public class class216 extends class381 {
    static int field7200 = 4096;
    static int field7201 = 12;

    class216() throws Throwable {
        throw new Error();
    }

    static final void method3827(class744 var0, int var1) {
        try {
            var0.field3156 -= 4;
            class730.field2821 = (short) var0.field3161[var0.field3156];
            if (class730.field2821 <= 0) {
                class730.field2821 = 1;
            }

            class730.field2724 = (short) var0.field3161[1 + var0.field3156];
            if (class730.field2724 <= 0) {
                class730.field2724 = 32767;
            } else if (class730.field2724 < class730.field2821) {
                class730.field2724 = class730.field2821;
            }

            class730.field2916 = (short) var0.field3161[var0.field3156 + 2];
            if (class730.field2916 <= 0) {
                class730.field2916 = 1;
            }

            class730.field2917 = (short) var0.field3161[3 + var0.field3156];
            if (class730.field2917 <= 0) {
                class730.field2917 = 32767;
            } else if (class730.field2917 < class730.field2916) {
                class730.field2917 = class730.field2916;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "adr.aki(" + ')');
        }
    }
}
