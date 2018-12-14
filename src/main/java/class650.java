import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStream;

public class class650 implements class940 {
    Image field9424;
    boolean field9425;
    FontMetrics field9426;
    Color field9427;
    Image field9428;
    Image field9429;
    Image field9430;
    int field9431;
    int field9432;
    Image field9433;
    Font field9434;
    Image field9435;
    int field9436;
    Image field9437;
    boolean field9438;
    boolean field9439;
    int field9440;
    int field9441;
    int field9442;
    int field9443;
    int field9444;
    Image field9445;
    Image field9446;
    int field9447;
    Image field9448;

    static final void method5632(class744 var0, int var1) {
        try {
            int var2 = var0.field3161[--var0.field3156];
            if (class730.field2924 != 0 && var2 < class730.field2934) {
                var0.field3157[++var0.field3158 - 1] = class730.field2936[var2];
            } else {
                var0.field3157[++var0.field3158 - 1] = "";
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jm.ws(" + ')');
        }
    }

    static final void method5633(class744 var0, byte var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156];
            int var4 = class906.field10363.method2713(var2, (short) -3682).method6652(var3, -1821518698).field201;
            var0.field3161[++var0.field3156 - 1] = var4;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "jm.adr(" + ')');
        }
    }

    static final void method5634(class744 var0, int var1) {
        try {
            var0.field3156 -= 2;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[1 + var0.field3156];
            if (-1 != var2) {
                if (var3 > 255) {
                    var3 = 255;
                } else if (var3 < 0) {
                    var3 = 0;
                }

                class166.method3682(var2, var3, false, 2142965372);
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "jm.anc(" + ')');
        }
    }

    static final void method5635(int var0, int var1, int var2, int var3, int var4, int var5) {
        try {
            int var6 = var3 - var1;
            int var7 = var2 - var0;
            if (var7 == 0) {
                if (var6 != 0) {
                    class447.method4318(var0, var1, var3, var4, -1450466434);
                }
            } else if (var6 == 0) {
                class601.method5452(var0, var2, var1, var4, 458370276);
            } else {
                if (var6 < 0) {
                    var6 = -var6;
                }

                if (var7 < 0) {
                    var7 = -var7;
                }

                boolean var8 = var6 > var7;
                int var9;
                int var10;
                if (var8) {
                    var9 = var0;
                    var10 = var2;
                    var0 = var1;
                    var1 = var9;
                    var2 = var3;
                    var3 = var10;
                }

                if (var0 > var2) {
                    var9 = var0;
                    var10 = var1;
                    var0 = var2;
                    var2 = var9;
                    var1 = var3;
                    var3 = var10;
                }

                var9 = var1;
                var10 = var2 - var0;
                int var11 = var3 - var1;
                int var12 = -(var10 >> 1);
                int var13 = var1 < var3 ? 1 : -1;
                if (var11 < 0) {
                    var11 = -var11;
                }

                int var14;
                if (var8) {
                    for (var14 = var0; var14 <= var2; ++var14) {
                        class381.field1412[var14][var9] = var4;
                        var12 += var11;
                        if (var12 > 0) {
                            var9 += var13;
                            var12 -= var10;
                        }
                    }
                } else {
                    for (var14 = var0; var14 <= var2; ++var14) {
                        class381.field1412[var9][var14] = var4;
                        var12 += var11;
                        if (var12 > 0) {
                            var9 += var13;
                            var12 -= var10;
                        }
                    }
                }
            }

        } catch (RuntimeException var15) {
            throw class158.method3445(var15, "jm.s(" + ')');
        }
    }

    final int method5628(int var1, int var2) {
        try {
            return this.field9438 ? (class759.field4331 - var1) / 2 : 0;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "jm.a(" + ')');
        }
    }

    public void method6325(boolean var1, int var2) {
        try {
            if (!this.field9425 && this.field9434 == null) {
                try {
                    String[] var3 = class715.method2097(class730.field2630, ',', 1855531743);
                    if (var3.length != 23) {
                        this.field9425 = true;
                    }

                    this.field9438 = Boolean.parseBoolean(var3[0]);
                    this.field9439 = Boolean.parseBoolean(var3[1]);
                    this.field9440 = class82.method917(var3[2], (short) 13478);
                    this.field9441 = class82.method917(var3[3], (short) -3766);
                    this.field9442 = class82.method917(var3[4], (short) -31027);
                    this.field9443 = class82.method917(var3[5], (short) -4692);
                    this.field9444 = class82.method917(var3[6], (short) -24880);
                    this.field9431 = class82.method917(var3[7], (short) -11380);
                    this.field9432 = class82.method917(var3[8], (short) -28758);
                    this.field9447 = class82.method917(var3[9], (short) 9091);
                    String var4 = var3[10];
                    int var5 = class82.method917(var3[11], (short) 1058);
                    int var6 = class745.method2597(var3[12].substring(2), 16, (byte) -28);
                    this.field9434 = new Font(var4, 0, var5);
                    this.field9426 = class837.field9161.getFontMetrics(this.field9434);
                    this.field9427 = new Color(var6);
                    MediaTracker var7 = new MediaTracker(class837.field9161);
                    this.field9430 = this.method5631(var3[13], -822395030);
                    var7.addImage(this.field9430, 0);
                    this.field9429 = this.method5631(var3[14], -2141223361);
                    var7.addImage(this.field9429, 1);
                    this.field9424 = this.method5631(var3[15], -72969942);
                    var7.addImage(this.field9424, 2);
                    this.field9448 = this.method5631(var3[16], -1604693448);
                    var7.addImage(this.field9448, 3);
                    this.field9428 = this.method5631(var3[17], -526492417);
                    var7.addImage(this.field9428, 4);
                    this.field9433 = this.method5631(var3[18], -2098831749);
                    var7.addImage(this.field9433, 5);
                    this.field9446 = this.method5631(var3[19], -74846883);
                    var7.addImage(this.field9446, 6);
                    this.field9435 = this.method5631(var3[20], -1555968401);
                    var7.addImage(this.field9435, 7);
                    this.field9445 = this.method5631(var3[21], -1967538866);
                    var7.addImage(this.field9445, 8);
                    var7.waitForAll();
                    this.field9436 = class82.method917(var3[22], (short) 10256);
                } catch (Exception var34) {
                    this.field9425 = true;
                }
            }

            if (this.field9425) {
                this.method5629((byte) 21);
            } else {
                Graphics var37 = class837.field9161.getGraphics();
                if (var37 != null) {
                    try {
                        int var38 = class302.field3768.method118(-15916663);
                        String var39 = class302.field3768.method119((short) 19939);
                        if (class654.field9352 == null) {
                            class654.field9352 = class837.field9161.createImage(class759.field4331, class97.field614);
                        }

                        Graphics var40 = class654.field9352.getGraphics();
                        var40.setColor(Color.BLACK);
                        var40.fillRect(0, 0, class759.field4331, class97.field614);
                        int var41 = this.field9446.getWidth((ImageObserver) null);
                        int var8 = this.field9435.getWidth((ImageObserver) null);
                        int var9 = this.field9445.getWidth((ImageObserver) null);
                        int var10 = this.field9446.getHeight((ImageObserver) null);
                        int var11 = this.field9435.getHeight((ImageObserver) null);
                        int var12 = this.field9445.getHeight((ImageObserver) null);
                        var40.drawImage(this.field9446, this.method5628(var41, 1748147978) + this.field9444 - this.field9432 / 2, this.method5630(var10, -1405353702) + this.field9431, (ImageObserver) null);
                        int var13 = this.field9444 - this.field9432 / 2 + var41;
                        int var14 = this.field9432 / 2 + this.field9444;

                        int var15;
                        for (var15 = var13; var15 <= var14; var15 += var9) {
                            var40.drawImage(this.field9445, this.method5628(var41, 1551718275) + this.field9444 + var15, this.method5630(var12, -1405353702) + this.field9431, (ImageObserver) null);
                        }

                        var40.drawImage(this.field9435, this.method5628(var8, 1762202219) + this.field9444 + this.field9432 / 2, this.method5630(var11, -1405353702) + this.field9431, (ImageObserver) null);
                        var15 = this.field9424.getWidth((ImageObserver) null);
                        int var16 = this.field9424.getHeight((ImageObserver) null);
                        int var17 = this.field9448.getWidth((ImageObserver) null);
                        int var18 = this.field9448.getHeight((ImageObserver) null);
                        int var19 = this.field9433.getHeight((ImageObserver) null);
                        int var20 = this.field9428.getWidth((ImageObserver) null);
                        int var21 = this.field9428.getHeight((ImageObserver) null);
                        int var22 = this.field9433.getWidth((ImageObserver) null);
                        int var23 = this.field9430.getWidth((ImageObserver) null);
                        int var24 = this.field9429.getWidth((ImageObserver) null);
                        int var25 = this.method5628(this.field9442, 1743968400) + this.field9440;
                        int var26 = this.method5630(this.field9443, -1405353702) + this.field9441;
                        var40.drawImage(this.field9424, var25, (this.field9443 - var16) / 2 + var26, (ImageObserver) null);
                        var40.drawImage(this.field9448, var25 + this.field9442 - var17, var26 + (this.field9443 - var18) / 2, (ImageObserver) null);
                        if (this.field9437 == null) {
                            this.field9437 = class837.field9161.createImage(this.field9442 - var15 - var17, this.field9443);
                        }

                        Graphics var27 = this.field9437.getGraphics();

                        int var28;
                        for (var28 = 0; var28 < this.field9442 - var15 - var17; var28 += var20) {
                            var27.drawImage(this.field9428, var28, 0, (ImageObserver) null);
                        }

                        for (var28 = 0; var28 < this.field9442 - var15 - var17; var28 += var22) {
                            var27.drawImage(this.field9433, var28, this.field9443 - var19, (ImageObserver) null);
                        }

                        var28 = var38 * (this.field9442 - var15 - var17) / 100;
                        int var33;
                        if (var28 > 0) {
                            Image var29 = class837.field9161.createImage(var28, this.field9443 - var21 - var19);
                            int var30 = var29.getWidth((ImageObserver) null);
                            Graphics var31 = var29.getGraphics();
                            int var32 = this.field9436 * class295.method6513(1139144319) / 10 % var23;

                            for (var33 = var32 - var23; var33 < var30; var33 += var23) {
                                var31.drawImage(this.field9430, var33, 0, (ImageObserver) null);
                            }

                            var27.drawImage(var29, 0, var21, (ImageObserver) null);
                        }

                        int var42 = var28;
                        var28 = this.field9442 - var15 - var17 - var28;
                        if (var28 > 0) {
                            Image var43 = class837.field9161.createImage(var28, this.field9443 - var21 - var19);
                            int var44 = var43.getWidth((ImageObserver) null);
                            Graphics var45 = var43.getGraphics();

                            for (var33 = 0; var33 < var44; var33 += var24) {
                                var45.drawImage(this.field9429, var33, 0, (ImageObserver) null);
                            }

                            var27.drawImage(var43, var42, var21, (ImageObserver) null);
                        }

                        var40.drawImage(this.field9437, var25 + var15, var26, (ImageObserver) null);
                        var40.setFont(this.field9434);
                        var40.setColor(this.field9427);
                        var40.drawString(var39, var25 + (this.field9442 - this.field9426.stringWidth(var39)) / 2, 4 + var26 + this.field9443 / 2 + this.field9447);
                        var37.drawImage(class654.field9352, 0, 0, (ImageObserver) null);
                    } catch (Exception var35) {
                        this.field9425 = true;
                    }
                } else {
                    class837.field9161.repaint();
                }
            }

        } catch (RuntimeException var36) {
            throw class158.method3445(var36, "jm.b(" + ')');
        }
    }

    void method5629(byte var1) {
        try {
            class4.method2965(class302.field3768.method118(-15916663), class302.field3768.method119((short) 1984), class730.field2670[class730.field2953], class730.field2682[class730.field2953], class730.field2672[class730.field2953], (byte) -117);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jm.i(" + ')');
        }
    }

    public void method6314(short var1) {
        try {
            class575.method127(-1084979949);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "jm.k(" + ')');
        }
    }

    public void method6315(int var1) {
    }

    public int method6324(byte var1) {
        return 100;
    }

    public boolean method6318(long var1) {
        return true;
    }

    public int method6316(int var1) {
        return 0;
    }

    final int method5630(int var1, int var2) {
        try {
            return this.field9439 ? (class97.field614 - var1) / 2 : 0;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "jm.f(" + ')');
        }
    }

    Image method5631(String var1, int var2) throws IOException {
        try {
            try {
                InputStream var3 = class833.field9178.getClass().getClassLoader().getResourceAsStream(var1);
                byte[] var4 = new byte[4000];

                int var6;
                for (int var5 = 0; (var6 = var3.read()) != -1; var4[var5++] = (byte) var6) {
                    ;
                }

                Image var7 = Toolkit.getDefaultToolkit().createImage(var4);
                Image var8 = var7;
                return var8;
            } catch (Exception var9) {
                throw new IOException();
            }
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "jm.p(" + ')');
        }
    }
}
