public class class282 extends class345 {
    public int[] field10617;
    public boolean field10619 = true;
    class756 field10615;
    String[] field10616;
    int[][] field10618;
    int[] field10620;

    void method6648(int var1) {
        try {
            if (this.field10617 != null) {
                for (int var2 = 0; var2 < this.field10617.length; ++var2) {
                    this.field10617[var2] |= 32768;
                }
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "aiv.x(" + ')');
        }
    }

    void method6649(InputStream var1, int var2) {
        try {
            while (true) {
                int var3 = var1.method6371();
                if (var3 == 0) {
                    return;
                }

                this.method6655(var1, var3, 1762846725);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "aiv.a(" + ')');
        }
    }

    public int method6650(int var1, int var2, int var3) {
        try {
            if (this.field10620 != null && var1 >= 0 && var1 <= this.field10620.length) {
                return this.field10618[var1] != null && var2 >= 0 && var2 <= this.field10618[var1].length ? this.field10618[var1][var2] : -1;
            } else {
                return -1;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "aiv.u(" + ')');
        }
    }

    public String method6651(InputStream var1, int var2) {
        try {
            StringBuilder var3 = new StringBuilder(80);
            if (this.field10620 != null) {
                for (int var4 = 0; var4 < this.field10620.length; ++var4) {
                    var3.append(this.field10616[var4]);
                    var3.append(this.field10615.method2712(this.method6652(var4, -237770641), this.field10618[var4], var1.method6424(class822.method5368(this.field10620[var4], -818645984).field203, (byte) 67)));
                }
            }

            var3.append(this.field10616[this.field10616.length - 1]);
            return var3.toString();
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "aiv.p(" + ')');
        }
    }

    public class103 method6652(int var1, int var2) {
        try {
            return this.field10620 != null && var1 >= 0 && var1 <= this.field10620.length ? class822.method5368(this.field10620[var1], -1627067354) : null;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "aiv.d(" + ')');
        }
    }

    public int method6653(short var1) {
        try {
            return this.field10620 == null ? 0 : this.field10620.length;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "aiv.k(" + ')');
        }
    }

    public String method6654(byte var1) {
        try {
            StringBuilder var2 = new StringBuilder(80);
            if (this.field10616 == null) {
                return "";
            } else {
                var2.append(this.field10616[0]);

                for (int var3 = 1; var3 < this.field10616.length; ++var3) {
                    for (int var4 = 0; var4 < 3; ++var4) {
                        var2.append('.');
                    }

                    var2.append(this.field10616[var3]);
                }

                return var2.toString();
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "aiv.i(" + ')');
        }
    }

    void method6655(InputStream var1, int var2, int var3) {
        try {
            if (1 == var2) {
                this.field10616 = class715.method2097(var1.method6379(1602597054), '<', 1942688210);
            } else {
                int var4;
                int var5;
                if (var2 == 2) {
                    var4 = var1.method6371();
                    this.field10617 = new int[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.field10617[var5] = var1.method6374();
                    }
                } else if (3 == var2) {
                    var4 = var1.method6371();
                    this.field10620 = new int[var4];
                    this.field10618 = new int[var4][];

                    for (var5 = 0; var5 < var4; ++var5) {
                        int var6 = var1.method6374();
                        class103 var7 = class822.method5368(var6, -1170894592);
                        if (var7 != null) {
                            this.field10620[var5] = var6;
                            this.field10618[var5] = new int[var7.field190];

                            for (int var8 = 0; var8 < var7.field190; ++var8) {
                                this.field10618[var5][var8] = var1.method6374();
                            }
                        }
                    }
                } else if (4 == var2) {
                    this.field10619 = false;
                }
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "aiv.f(" + ')');
        }
    }

    public void method6656(InputStream var1, int[] var2, int var3) {
        try {
            if (this.field10620 != null) {
                for (int var4 = 0; var4 < this.field10620.length && var4 < var2.length; ++var4) {
                    int var5 = this.method6652(var4, -1152183855).field191;
                    if (var5 > 0) {
                        var1.method6380((long) var2[var4], var5, -211202833);
                    }
                }
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "aiv.b(" + ')');
        }
    }
}
