import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class class186 extends class184 {
    static float[] field5253 = new float[16];
    static int field5261 = 0;
    static int field5262 = 1;
    long field5254;
    class927 field5255;
    boolean[] field5256;
    byte[] field5257;
    boolean field5258;
    long field5259;
    byte[] field5260;
    float[][] field5263;
    class132 field5264;

    class186(class927 var1, class220 var2) {
        this.field5258 = false;
        this.field5263 = new float[2][];
        this.field5256 = new boolean[2];
        super.field5229 = var2.field7353;
        if (var2.field7352 != null) {
            super.field5227 = var2.field7352;
            this.field5257 = var1.method6215(super.field5227);
        }

        if (var2.field7354 != null) {
            super.field5228 = var2.field7354;
            this.field5260 = var1.method6215(super.field5228);
        }

        var1.method582(this);
    }

    class186(class927 var1, class132 var2, class220 var3) {
        this(var1, var3);
        this.field5255 = var1;
        this.field5264 = var2;
    }

    void method3192(class655 var1, float var2) {
        int var3 = ((class266) var1).method4578();
        int var4 = ((class266) var1).method4577();
        if (var1.method5613(-1090776718) != class495.field7995 && var1.method5613(956470989) != class495.field8041) {
            throw new class286(var1, "");
        } else {
            if (var3 >= 0) {
                var3 *= 4;
                this.field5263[0][var3] = var2;
                this.field5256[0] = true;
            }

            if (var4 >= 0) {
                var4 *= 4;
                this.field5263[1][var4] = var2;
                this.field5256[1] = true;
            }

        }
    }

    void method3177(class655 var1, float var2, float var3) {
        int var4 = ((class266) var1).method4578();
        int var5 = ((class266) var1).method4577();
        if (var1.method5613(-1803935344) != class495.field8067) {
            throw new class286(var1, "");
        } else {
            if (var4 >= 0) {
                var4 *= 4;
                this.field5263[0][var4 + 0] = var2;
                this.field5263[0][var4 + 1] = var3;
                this.field5256[0] = true;
            }

            if (var5 >= 0) {
                var5 *= 4;
                this.field5263[1][var5 + 0] = var2;
                this.field5263[1][var5 + 1] = var3;
                this.field5256[1] = true;
            }

        }
    }

    void method3208(class655 var1, class344 var2) {
        int var3 = ((class266) var1).method4578();
        int var4 = ((class266) var1).method4577();
        if (var1.method5613(1027907149) != class495.field7981) {
            throw new class286(var1, "");
        } else {
            if (var3 >= 0) {
                this.method3251(var3, var2.method277(field5253), 8);
            }

            if (var4 >= 0) {
                this.method3250(var4, var2.method277(field5253), 8);
            }

        }
    }

    void method3190(int var1, int var2, class659 var3) {
        this.field5255.method616(var2);
        this.field5255.method617(var3);
    }

    void method3182(class655 var1, class344 var2) {
        int var3 = ((class266) var1).method4578();
        int var4 = ((class266) var1).method4577();
        if (var1.method5613(974168980) != class495.field8014) {
            throw new class286(var1, "");
        } else {
            if (var3 >= 0) {
                this.method3251(var3, var2.method288(field5253), 16);
            }

            if (var4 >= 0) {
                this.method3250(var4, var2.method288(field5253), 16);
            }

        }
    }

    void method3180(class655 var1, float[] var2, int var3) {
        int var4 = ((class266) var1).method4578();
        int var5 = ((class266) var1).method4577();
        if (var1.method5613(-603785931) != class495.field8094) {
            throw new class286(var1, "");
        } else {
            if (var4 >= 0) {
                this.method3251(var4, var2, var3);
            }

            if (var5 >= 0) {
                this.method3250(var5, var2, var3);
            }

        }
    }

    void method3183(class655 var1, int var2, class659 var3) {
        this.field5255.method616(var2);
        this.field5255.method617(var3);
    }

    void method3184(int var1, float var2, float var3, float var4) {
        int var5 = var1 >> 16;
        int var6 = (var1 & '\uffff') * 4;
        this.field5263[var5][var6] = var2;
        this.field5263[var5][var6 + 1] = var3;
        this.field5263[var5][var6 + 2] = var4;
        this.field5256[var5] = true;
    }

    void method3185(int var1, float var2, float var3, float var4, float var5) {
        int var6 = var1 >> 16;
        int var7 = (var1 & '\uffff') * 4;
        this.field5263[var6][var7] = var2;
        this.field5263[var6][var7 + 1] = var3;
        this.field5263[var6][var7 + 2] = var4;
        this.field5263[var6][var7 + 3] = var5;
        this.field5256[var6] = true;
    }

    void method3175(int var1, class344 var2) {
        int var3 = var1 >> 16;
        int var4 = (var1 & '\uffff') * 4;
        System.arraycopy(var2.method277(field5253), 0, this.field5263[var3], var4, 8);
        this.field5256[var3] = true;
    }

    void method3189(int var1, class344 var2) {
        int var3 = var1 >> 16;
        int var4 = (var1 & '\uffff') * 4;
        System.arraycopy(var2.method288(field5253), 0, this.field5263[var3], var4, 16);
        this.field5256[var3] = true;
    }

    void method3249() {
        int var1;
        if (this.field5256[0]) {
            for (var1 = 0; var1 < this.field5263[0].length; ++var1) {
                this.field5255.field663.putFloat(this.field5255.field661 + (long) (var1 * 4), this.field5263[0][var1]);
            }

            IDirect3DDevice.SetVertexShaderConstantF(this.field5255.field10241, 0, this.field5255.field661, this.field5263[0].length / 4);
            this.field5256[0] = false;
        }

        if (this.field5256[1]) {
            for (var1 = 0; var1 < this.field5263[1].length; ++var1) {
                this.field5255.field663.putFloat(this.field5255.field661 + (long) (var1 * 4), this.field5263[1][var1]);
            }

            IDirect3DDevice.SetPixelShaderConstantF(this.field5255.field10241, 0, this.field5255.field661, this.field5263[1].length / 4);
            this.field5256[1] = false;
        }

    }

    final void method3250(int var1, float[] var2, int var3) {
        class901.method6353(var2, 0, this.field5263[1], var1 * 4, var3);
        this.field5256[1] = true;
    }

    public void method2755() {
        if (this.field5259 != 0L) {
            IUnknown.Release(this.field5259);
            this.field5259 = 0L;
        }

        if (this.field5254 != 0L) {
            IUnknown.Release(this.field5254);
            this.field5254 = 0L;
        }

        this.field5255.method552(this);
    }

    void method3186(int var1, float[] var2, int var3) {
        int var4 = var1 >> 16;
        int var5 = (var1 & '\uffff') * 4;
        System.arraycopy(var2, 0, this.field5263[var4], var5, var3);
        this.field5256[var4] = true;
    }

    void method3178(class655 var1, float var2, float var3, float var4) {
        int var5 = ((class266) var1).method4578();
        int var6 = ((class266) var1).method4577();
        if (var1.method5613(-1928021635) != class495.field8013) {
            throw new class286(var1, "");
        } else {
            if (var5 >= 0) {
                var5 *= 4;
                this.field5263[0][var5 + 0] = var2;
                this.field5263[0][var5 + 1] = var3;
                this.field5263[0][var5 + 2] = var4;
                this.field5256[0] = true;
            }

            if (var6 >= 0) {
                var6 *= 4;
                this.field5263[1][var6 + 0] = var2;
                this.field5263[1][var6 + 1] = var3;
                this.field5263[1][var6 + 2] = var4;
                this.field5256[1] = true;
            }

        }
    }

    void method3187(int var1, class344 var2) {
        int var3 = var1 >> 16;
        int var4 = (var1 & '\uffff') * 4;
        System.arraycopy(var2.method288(field5253), 0, this.field5263[var3], var4, 12);
        this.field5256[var3] = true;
    }

    final void method3251(int var1, float[] var2, int var3) {
        class901.method6353(var2, 0, this.field5263[0], var1 * 4, var3);
        this.field5256[0] = true;
    }

    public boolean method3237() {
        if (this.field5258) {
            return true;
        } else {
            this.field5259 = this.field5257 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.field5255.field10241, this.field5257);
            this.field5254 = this.field5260 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.field5255.field10241, this.field5260);
            if (this.field5259 == 0L && this.field5254 == 0L) {
                return false;
            } else {
                int var1 = -1;

                int var2;
                for (var2 = 0; var2 < this.field5264.method4054(-1467018991); ++var2) {
                    if (this.field5264.method4095(var2, 1470064186) == this) {
                        var1 = var2;
                        break;
                    }
                }

                var2 = this.field5264.method4049(718541068);
                int var3 = this.field5264.method4076((byte) -77);

                int var4;
                class655 var5;
                for (var4 = 0; var4 < var2; ++var4) {
                    var5 = this.field5264.method4078(var4, 444661617);
                    var5.method5619(var1);
                }

                for (var4 = 0; var4 < var3; ++var4) {
                    var5 = this.field5264.method4096(var4, 1888215794);
                    var5.method5619(var1);
                }

                var4 = 0;
                int var12 = 0;
                int var6 = this.field5264.method4055(this, -180449856);

                for (int var7 = 0; var7 < var2 + var3; ++var7) {
                    class266 var8 = (class266) (var7 < var2 ? this.field5264.method4078(var7, 444661617) : this.field5264.method4096(var7 - var2, 1888215794));
                    class495 var9 = var8.method5613(-1943776793);
                    int var10 = 1;
                    if (var9 == class495.field8094) {
                        var9 = var8.method5617(-682657979);
                        var10 = var8.method5615(67648031);
                    }

                    switch (var9.field8090) {
                        case 1:
                        case 80:
                        case 82:
                        case 104:
                            break;
                        case 2:
                        case 13:
                        case 111:
                        case 122:
                            var10 *= 2;
                            break;
                        case 15:
                        case 31:
                        case 77:
                        case 91:
                            var10 *= 4;
                            break;
                        case 25:
                        case 28:
                        case 29:
                        case 87:
                            var10 *= 3;
                            break;
                        default:
                            var10 = 0;
                    }

                    int var11;
                    if (var8.field8206[var6] >= 0) {
                        var11 = var8.field8206[var6] + var10;
                        if (var4 < var11) {
                            var4 = var11;
                        }
                    }

                    if (var8.field8208[var6] >= 0) {
                        var11 = var8.field8208[var6] + var10;
                        if (var12 < var11) {
                            var12 = var11;
                        }
                    }
                }

                this.field5263[0] = new float[var4 * 4];
                this.field5263[1] = new float[var12 * 4];
                this.field5258 = true;
                return true;
            }
        }
    }

    void method3179(class655 var1, float var2, float var3, float var4, float var5) {
        int var6 = ((class266) var1).method4578();
        int var7 = ((class266) var1).method4577();
        if (var1.method5613(-895076841) != class495.field8019) {
            throw new class286(var1, "");
        } else {
            if (var6 >= 0) {
                var6 *= 4;
                this.field5263[0][var6 + 0] = var2;
                this.field5263[0][var6 + 1] = var3;
                this.field5263[0][var6 + 2] = var4;
                this.field5263[0][var6 + 3] = var5;
                this.field5256[0] = true;
            }

            if (var7 >= 0) {
                var7 *= 4;
                this.field5263[1][var7 + 0] = var2;
                this.field5263[1][var7 + 1] = var3;
                this.field5263[1][var7 + 2] = var4;
                this.field5263[1][var7 + 3] = var5;
                this.field5256[1] = true;
            }

        }
    }
}
