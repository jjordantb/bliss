import jaggl.OpenGL;

public class class757 {
    class275 field4296;
    boolean field4297 = true;
    boolean field4298 = true;
    class275 field4299;
    int field4300 = 0;
    int field4301 = 0;
    class678[] field4302 = new class678[2];
    int field4303 = 1;
    boolean field4304;
    class599 field4305 = new class599();
    class678 field4306;
    boolean field4307 = true;
    class13 field4308;
    boolean field4309 = true;
    int field4310 = 1;
    class239 field4311;
    boolean field4312 = false;
    class239 field4313;
    class275 field4314;
    int field4315 = 0;
    class482 field4316;

    class757(class13 var1) {
        this.field4316 = class482.field8399;
        this.field4308 = var1;
        if (this.field4308.field6857 && this.field4308.field6866) {
            this.field4299 = this.field4296 = new class275(this.field4308);
            if (this.field4308.field6738 > 1 && this.field4308.field6858 && this.field4308.field6824) {
                this.field4299 = this.field4314 = new class275(this.field4308);
            }
        }

    }

    boolean method2696(int var1, int var2, int var3, int var4) {
        if (this.field4299 != null && !this.field4305.method1284((byte) 63)) {
            if (this.field4310 != var3 || this.field4303 != var4) {
                this.field4310 = var3;
                this.field4303 = var4;

                for (Node var5 = this.field4305.method1281(1528300499); var5 != this.field4305.field1710; var5 = var5.field640) {
                    ((class210) var5).method3848(this.field4310, this.field4303);
                }

                this.field4297 = true;
                this.field4307 = true;
                this.field4298 = true;
            }

            if (this.method2703()) {
                this.field4300 = var1;
                this.field4301 = var2;
                this.field4304 = true;
                this.field4308.method3672(-this.field4300, this.field4303 + this.field4301 - this.field4308.method4800((short) 16970).method2493());
                this.field4308.method5009(this.field4299, (byte) -31);
                this.field4308.method4831(3, 0);
                this.field4299.method6624(0);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    boolean method2697() {
        return this.field4299 != null;
    }

    void method2698() {
        if (this.field4304) {
            if (this.field4314 != null) {
                this.field4308.method4818(this.field4314, (byte) -72);
                this.field4308.method5009(this.field4296, (byte) -36);
                this.field4296.method6624(0);
                this.field4314.method6622(0, 0, this.field4310, this.field4303, 0, 0, true, this.field4312);
            }

            this.field4308.method3634();
            this.field4308.method3649(0);
            this.field4308.method3626(1);
            this.field4308.method4827();
            int var1 = 0;
            int var2 = 1;

            class210 var4;
            for (class210 var3 = (class210) this.field4305.method1281(1607067175); var3 != null; var3 = var4) {
                var4 = (class210) this.field4305.method1283((byte) -76);
                int var5 = var3.method3851();

                for (int var6 = 0; var6 < var5; ++var6) {
                    var3.method3849(var6, this.field4302[var1], this.field4306);
                    if (var4 == null && var6 == var5 - 1) {
                        this.field4308.method4818(this.field4296, (byte) 40);
                        this.field4308.method3672(0, 0);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float) this.field4303);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(this.field4300, this.field4301);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(this.field4300, this.field4301 + this.field4303);
                        OpenGL.glTexCoord2f((float) this.field4310, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(this.field4300 + this.field4310, this.field4301 + this.field4303);
                        OpenGL.glTexCoord2f((float) this.field4310, (float) this.field4303);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(this.field4300 + this.field4310, this.field4301);
                        OpenGL.glEnd();
                    } else {
                        this.field4296.method6624(var2);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float) this.field4303);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(0, this.field4303);
                        OpenGL.glTexCoord2f((float) this.field4310, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(this.field4310, this.field4303);
                        OpenGL.glTexCoord2f((float) this.field4310, (float) this.field4303);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(this.field4310, 0);
                        OpenGL.glEnd();
                    }

                    var3.method3850(var6);
                    var2 = var2 + 1 & 1;
                    var1 = var1 + 1 & 1;
                }
            }

            this.field4304 = false;
        }

    }

    boolean method2699(class210 var1) {
        if (this.field4299 != null) {
            if (var1.method3845() || var1.method3846()) {
                this.field4305.method1282(var1, 1179569939);
                this.method2702();
                if (this.method2703()) {
                    if (this.field4310 != -1 && this.field4303 != -1) {
                        var1.method3848(this.field4310, this.field4303);
                    }

                    var1.field7210 = true;
                    return true;
                }
            }

            this.method2700(var1);
        }

        return false;
    }

    void method2700(class210 var1) {
        var1.field7210 = false;
        var1.method3847();
        var1.method545(-1460969981);
        this.method2702();
    }

    void method2701() {
        this.field4296 = null;
        this.field4314 = null;
        this.field4299 = null;
        this.field4313 = null;
        this.field4306 = null;
        this.field4302 = null;
        this.field4311 = null;
        if (!this.field4305.method1284((byte) 106)) {
            for (Node var1 = this.field4305.method1281(1803490493); var1 != this.field4305.field1710; var1 = var1.field640) {
                ((class210) var1).method3847();
            }
        }

        this.field4303 = 1;
        this.field4310 = 1;
    }

    void method2702() {
        int var1 = 0;
        boolean var2 = false;
        class482 var3 = class482.field8399;

        for (class210 var4 = (class210) this.field4305.method1281(1419681613); var4 != null; var4 = (class210) this.field4305.method1283((byte) -84)) {
            class482 var5 = var4.method3852();
            if (var5.field8406 > var3.field8406) {
                var3 = var5;
            }

            var2 |= var4.method3858();
            var1 += var4.method3851();
        }

        if (var3 != this.field4316) {
            this.field4316 = var3;
            this.field4297 = true;
        }

        int var6 = this.field4315 > 2 ? 2 : this.field4315;
        int var7 = var1 > 2 ? 2 : var1;
        if (var6 != var7) {
            this.field4297 = true;
            this.field4298 = true;
        }

        if (var2 != this.field4312) {
            this.field4312 = var2;
            this.field4307 = true;
        }

        this.field4315 = var1;
    }

    boolean method2703() {
        if (this.field4307) {
            if (this.field4313 != null) {
                this.field4313.method2755();
                this.field4313 = null;
            }

            if (this.field4306 != null) {
                this.field4306.method4287();
                this.field4306 = null;
            }
        }

        if (this.field4297) {
            if (this.field4311 != null) {
                this.field4311.method2755();
                this.field4311 = null;
            }

            if (this.field4302[0] != null) {
                this.field4302[0].method4287();
                this.field4302[0] = null;
            }

            if (this.field4302[1] != null) {
                this.field4302[1].method4287();
                this.field4302[1] = null;
            }
        }

        if (this.field4307) {
            if (this.field4314 != null) {
                this.field4313 = new class239(this.field4308, class264.field8195, class482.field8401, this.field4310, this.field4303, this.field4308.field6738);
            }

            if (this.field4312) {
                this.field4306 = new class678(this.field4308, 34037, class264.field8195, class482.field8401, this.field4310, this.field4303);
            } else if (this.field4313 == null) {
                this.field4313 = new class239(this.field4308, class264.field8195, class482.field8401, this.field4310, this.field4303);
            }

            this.field4307 = false;
            this.field4298 = true;
            this.field4309 = true;
        }

        if (this.field4297) {
            if (this.field4314 != null) {
                this.field4311 = new class239(this.field4308, class264.field8191, this.field4316, this.field4310, this.field4303, this.field4308.field6738);
            }

            this.field4302[0] = new class678(this.field4308, 34037, class264.field8191, this.field4316, this.field4310, this.field4303);
            this.field4302[1] = this.field4315 > 1 ? new class678(this.field4308, 34037, class264.field8191, this.field4316, this.field4310, this.field4303) : null;
            this.field4297 = false;
            this.field4298 = true;
            this.field4309 = true;
        }

        if (this.field4298) {
            if (this.field4314 != null) {
                this.field4308.method5009(this.field4296, (byte) -20);
                this.field4296.method2834((class893) null);
                this.field4296.method2839(0, (class813) null);
                this.field4296.method2839(1, (class813) null);
                this.field4296.method2839(0, this.field4302[0].method4215(0));
                this.field4296.method2839(1, this.field4315 > 1 ? this.field4302[1].method4215(0) : null);
                if (this.field4312) {
                    this.field4296.method2834(this.field4306.method4216(0));
                }

                this.field4308.method4818(this.field4296, (byte) -22);
                this.field4308.method5009(this.field4314, (byte) 12);
                this.field4314.method2834((class893) null);
                this.field4314.method2839(0, (class813) null);
                this.field4314.method2839(0, this.field4311);
                this.field4314.method2834(this.field4313);
                this.field4308.method4818(this.field4314, (byte) 18);
            } else {
                this.field4308.method5009(this.field4296, (byte) -69);
                this.field4296.method2834((class893) null);
                this.field4296.method2839(0, (class813) null);
                this.field4296.method2839(1, (class813) null);
                this.field4296.method2839(0, this.field4302[0].method4215(0));
                this.field4296.method2839(1, this.field4315 > 1 ? this.field4302[1].method4215(0) : null);
                if (this.field4312) {
                    this.field4296.method2834(this.field4306.method4216(0));
                } else {
                    this.field4296.method2834(this.field4313);
                }

                this.field4308.method4818(this.field4296, (byte) 1);
            }

            this.field4298 = false;
            this.field4309 = true;
        }

        if (this.field4309) {
            this.field4308.method5009(this.field4299, (byte) -31);
            this.field4309 = !this.field4299.method2836();
            this.field4308.method4818(this.field4299, (byte) 15);
        }

        return !this.field4309;
    }
}
