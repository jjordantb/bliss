public class class205 extends class345 {
    public char[] field7618;
    public String field7619;
    public char[] field7620;
    public int[] field7621;
    public int[] field7622;

    static final void method4313(class744 var0, byte var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1];
            if (var3 == -1) {
                var0.field3161[++var0.field3156 - 1] = -1;
            } else {
                var0.field3161[++var0.field3156 - 1] = class848.field8597.method3399(var2, -1823486068).method4311((char) var3, -446763636);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ain.adt(" + ')');
        }
    }

    void method4308(InputStream var1, int var2) {
        try {
            while (true) {
                int var3 = var1.method6371();
                if (var3 == 0) {
                    if (var2 == -1650604707) {
                        throw new IllegalStateException();
                    }

                    return;
                }

                this.method4312(var1, var3, -2004307261);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ain.a(" + ')');
        }
    }

    public int method4309(char var1, int var2) {
        try {
            if (this.field7622 == null) {
                return -1;
            } else {
                for (int var3 = 0; var3 < this.field7622.length; ++var3) {
                    if (this.field7618[var3] == var1) {
                        return this.field7622[var3];
                    }
                }

                return -1;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ain.b(" + ')');
        }
    }

    void method4310(int var1) {
        try {
            int var2;
            if (this.field7621 != null) {
                for (var2 = 0; var2 < this.field7621.length; ++var2) {
                    this.field7621[var2] |= 32768;
                }
            }

            if (this.field7622 != null) {
                for (var2 = 0; var2 < this.field7622.length; ++var2) {
                    this.field7622[var2] |= 32768;
                }
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ain.i(" + ')');
        }
    }

    public int method4311(char var1, int var2) {
        try {
            if (this.field7621 == null) {
                return -1;
            } else {
                for (int var3 = 0; var3 < this.field7621.length; ++var3) {
                    if (var1 == this.field7620[var3]) {
                        return this.field7621[var3];
                    }
                }

                return -1;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ain.p(" + ')');
        }
    }

    void method4312(InputStream var1, int var2, int var3) {
        try {
            if (1 == var2) {
                this.field7619 = var1.method6379(-1462506580);
            } else {
                int var4;
                int var5;
                byte var6;
                if (2 == var2) {
                    var4 = var1.method6371();
                    this.field7622 = new int[var4];
                    this.field7618 = new char[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.field7622[var5] = var1.method6374();
                        var6 = var1.method6372(-12558881);
                        this.field7618[var5] = var6 == 0 ? 0 : class954.method2092(var6, 1882768383);
                    }
                } else if (var2 == 3) {
                    var4 = var1.method6371();
                    this.field7621 = new int[var4];
                    this.field7620 = new char[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.field7621[var5] = var1.method6374();
                        var6 = var1.method6372(-12558881);
                        this.field7620[var5] = var6 == 0 ? 0 : class954.method2092(var6, 2133004777);
                    }
                } else if (var2 == 4) {
                    ;
                }
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "ain.f(" + ')');
        }
    }
}
