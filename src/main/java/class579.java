public class class579 {
    public int field75;
    public int field76;
    public char field77;
    public int field78;

    void method79(InputStream var1, int var2, int var3) {
        try {
            if (var2 == 1) {
                this.field77 = class954.method2092(var1.method6372(-12558881), 1830993802);
            } else if (3 == var2) {
                this.field76 = var1.method6374();
                this.field75 = var1.method6371();
                this.field78 = var1.method6371();
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "vy.f(" + ')');
        }
    }

    void method80(InputStream var1, int var2) {
        try {
            while (true) {
                int var3 = var1.method6371();
                if (var3 == 0) {
                    if (var2 == -1099657695) {
                        ;
                    }

                    return;
                }

                this.method79(var1, var3, 1972113647);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "vy.a(" + ')');
        }
    }
}
