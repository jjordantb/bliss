public class ObjectDefinition {
    public static short[] field2255 = new short[256];
    static int field2274 = 127007;
    public int field2196 = -1;
    public int field2197;
    public int[] field2198;
    public short[] field2199;
    public String name = "null";
    public int[] field2202;
    public short[] field2205;
    public int[][] field2206;
    public int field2208 = -1;
    public int field2212 = 2;
    public boolean field2213 = false;
    public int field2214 = -1;
    public int field2215 = 1;
    public boolean field2217 = false;
    public int field2218 = 1;
    public int field2219 = 960;
    public int field2220 = 0;
    public boolean field2221 = false;
    public int field2223 = 64;
    public String[] actions;
    public boolean field2227 = false;
    public int field2229 = -1;
    public int field2230 = -1;
    public int field2231 = -1;
    public int field2232 = -1;
    public boolean field2233 = false;
    public int field2234 = 0;
    public boolean field2236 = false;
    public boolean field2237 = true;
    public int field2240 = 0;
    public int field2241 = -1;
    public boolean field2242 = false;
    public boolean field2248 = false;
    public int field2250 = 0;
    public int field2254 = -1;
    public boolean field2256 = true;
    public int field2257 = 255;
    public boolean field2258 = false;
    public int field2259 = 0;
    public int field2260 = 0;
    public int[] field2261;
    public byte[] field2262;
    public boolean field2263 = true;
    public boolean field2264 = false;
    public boolean field2265 = true;
    public boolean field2266 = false;
    public int field2268 = -1;
    public int field2269 = 0;
    public int field2270 = 256;
    public int field2271 = 256;
    public boolean field2272 = false;
    public boolean field2273 = false;
    byte field2195 = 0;
    short[] field2201;
    byte[] field2203;
    short[] field2204;
    byte field2207;
    byte field2209 = 0;
    int[] field2210 = null;
    int field2211 = 0;
    int field2216 = -1;
    int[] field2222 = null;
    int field2224 = 0;
    int field2225 = 0;
    int field2228 = 0;
    class240 field2235;
    int field2238 = 128;
    int field2239 = 128;
    int field2243 = 0;
    int field2244 = 0;
    int field2245 = 0;
    int field2246 = 128;
    byte field2247;
    byte field2249;
    int field2251 = 0;
    int field2252 = -1;
    int field2253 = -1;
    NodeTable field2267;

    public static class70 method1496(InputStream var0, byte var1) {
        try {
            class98 var2 = class69.method1339(var0.method6371(), (byte) -73);
            if (class98.field611 == var2) {
                return class141.method1094(var0, -1749563274);
            } else if (var2 == class98.field609) {
                return class229.method4582(var0, (byte) 1);
            } else {
                return var2 == class98.field608 ? class619.method5183(var0, (byte) -67) : null;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "rw.a(" + ')');
        }
    }

    static final void method1497(class744 var0, int var1) {
        try {
            if (class730.field2825 != null) {
                var0.field3161[++var0.field3156 - 1] = 1;
            } else {
                var0.field3161[++var0.field3156 - 1] = 0;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "rw.ahp(" + ')');
        }
    }

    public static boolean method1498(char var0, short var1) {
        try {
            return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "rw.y(" + ')');
        }
    }

    static void method1499(int var0) {
        try {
            class839.method5405((byte) 127);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "rw.aa(" + ')');
        }
    }

    void getObjectDefinition(InputStream var1, int var2, int var3) {
        try {
            int var4;
            int var5;
            int var6;
            int var7;
            if (1 == var2) {
                var4 = var1.method6371();
                this.field2262 = new byte[var4];
                this.field2206 = new int[var4][];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field2262[var5] = var1.method6372(-12558881);
                    var6 = var1.method6371();
                    this.field2206[var5] = new int[var6];

                    for (var7 = 0; var7 < var6; ++var7) {
                        this.field2206[var5][var7] = var1.method6423(1235052657);
                    }
                }
            } else if (var2 == 2) {
                this.name = var1.method6379(-1849485656);
            } else if (14 == var2) {
                this.field2218 = var1.method6371();
            } else if (var2 == 15) {
                this.field2215 = var1.method6371();
            } else if (var2 == 17) {
                this.field2212 = 0;
                this.field2256 = false;
            } else if (var2 == 18) {
                this.field2256 = false;
            } else if (19 == var2) {
                this.field2214 = var1.method6371();
            } else if (21 == var2) {
                this.field2195 = 1;
            } else if (var2 == 22) {
                this.field2217 = true;
            } else if (var2 == 23) {
                this.field2208 = 1;
            } else if (24 == var2) {
                var4 = var1.method6423(1235052657);
                if (var4 != -1) {
                    this.field2210 = new int[]{var4};
                }
            } else if (var2 == 27) {
                this.field2212 = 1;
            } else if (28 == var2) {
                this.field2223 = var1.method6371() << 2;
            } else if (var2 == 29) {
                this.field2224 = var1.method6372(-12558881);
            } else if (39 == var2) {
                this.field2225 = var1.method6372(-12558881);
            } else if (var2 >= 30 && var2 < 35) {
                this.actions[var2 - 30] = var1.method6379(2140843487);
            } else if (var2 == 40) {
                var4 = var1.method6371();
                this.field2201 = new short[var4];
                this.field2199 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field2201[var5] = (short) var1.method6374();
                    this.field2199[var5] = (short) var1.method6374();
                }
            } else if (var2 == 41) {
                var4 = var1.method6371();
                this.field2204 = new short[var4];
                this.field2205 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field2204[var5] = (short) var1.method6374();
                    this.field2205[var5] = (short) var1.method6374();
                }
            } else if (var2 == 42) {
                var4 = var1.method6371();
                this.field2203 = new byte[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field2203[var5] = var1.method6372(-12558881);
                }
            } else if (var2 == 62) {
                this.field2236 = true;
            } else if (64 == var2) {
                this.field2237 = false;
            } else if (65 == var2) {
                this.field2238 = var1.method6374();
            } else if (66 == var2) {
                this.field2239 = var1.method6374();
            } else if (var2 == 67) {
                this.field2246 = var1.method6374();
            } else if (var2 == 69) {
                var1.method6371();
            } else if (var2 == 70) {
                this.field2211 = var1.method6367(1954619354) << 2;
            } else if (var2 == 71) {
                this.field2228 = var1.method6367(1981333343) << 2;
            } else if (var2 == 72) {
                this.field2243 = var1.method6367(2079097901) << 2;
            } else if (var2 == 73) {
                this.field2242 = true;
            } else if (var2 == 74) {
                this.field2248 = true;
            } else if (var2 == 75) {
                this.field2241 = var1.method6371();
            } else if (77 != var2 && 92 != var2) {
                if (var2 == 78) {
                    this.field2254 = var1.method6374();
                    this.field2240 = var1.method6371();
                } else if (var2 == 79) {
                    this.field2259 = var1.method6374();
                    this.field2260 = var1.method6374();
                    this.field2240 = var1.method6371();
                    var4 = var1.method6371();
                    this.field2261 = new int[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.field2261[var5] = var1.method6374();
                    }
                } else if (81 == var2) {
                    this.field2195 = 2;
                    this.field2216 = var1.method6371() * 256;
                } else if (var2 == 82) {
                    this.field2264 = true;
                } else if (88 == var2) {
                    this.field2265 = false;
                } else if (var2 == 89) {
                    this.field2263 = false;
                } else if (91 == var2) {
                    this.field2266 = true;
                } else if (var2 == 93) {
                    this.field2195 = 3;
                    this.field2216 = var1.method6374();
                } else if (var2 == 94) {
                    this.field2195 = 4;
                } else if (95 == var2) {
                    this.field2195 = 5;
                    this.field2216 = var1.method6367(2013201622);
                } else if (97 == var2) {
                    this.field2233 = true;
                } else if (98 == var2) {
                    this.field2213 = true;
                } else if (99 == var2) {
                    this.field2229 = var1.method6371();
                    this.field2268 = var1.method6374();
                } else if (100 == var2) {
                    this.field2230 = var1.method6371();
                    this.field2196 = var1.method6374();
                } else if (101 == var2) {
                    this.field2234 = var1.method6371();
                } else if (var2 == 102) {
                    this.field2232 = var1.method6374();
                } else if (103 == var2) {
                    this.field2208 = 0;
                } else if (104 == var2) {
                    this.field2257 = var1.method6371();
                } else if (var2 == 105) {
                    this.field2272 = true;
                } else if (106 == var2) {
                    var4 = var1.method6371();
                    var5 = 0;
                    this.field2210 = new int[var4];
                    this.field2222 = new int[var4];

                    for (var6 = 0; var6 < var4; ++var6) {
                        this.field2210[var6] = var1.method6423(1235052657);
                        var5 += this.field2222[var6] = var1.method6371();
                    }

                    for (var6 = 0; var6 < var4; ++var6) {
                        this.field2222[var6] = '\uffff' * this.field2222[var6] / var5;
                    }
                } else if (var2 == 107) {
                    this.field2231 = var1.method6374();
                } else if (var2 >= 150 && var2 < 155) {
                    this.actions[var2 - 150] = var1.method6379(67859332);
                    if (!this.field2235.field8384) {
                        this.actions[var2 - 150] = null;
                    }
                } else if (160 == var2) {
                    var4 = var1.method6371();
                    this.field2202 = new int[var4];

                    for (var5 = 0; var5 < var4; ++var5) {
                        this.field2202[var5] = var1.method6374();
                    }
                } else if (var2 == 162) {
                    this.field2195 = 3;
                    this.field2216 = var1.method6420((byte) 30);
                } else if (var2 == 163) {
                    this.field2249 = var1.method6372(-12558881);
                    this.field2207 = var1.method6372(-12558881);
                    this.field2247 = var1.method6372(-12558881);
                    this.field2209 = var1.method6372(-12558881);
                } else if (var2 == 164) {
                    this.field2244 = var1.method6367(2119621102);
                } else if (165 == var2) {
                    this.field2245 = var1.method6367(1762145274);
                } else if (166 == var2) {
                    this.field2251 = var1.method6367(1892618723);
                } else if (var2 == 167) {
                    this.field2250 = var1.method6374();
                } else if (168 == var2) {
                    this.field2258 = true;
                } else if (169 == var2) {
                    this.field2227 = true;
                } else if (170 == var2) {
                    this.field2219 = var1.method6382(1723054621);
                } else if (171 == var2) {
                    this.field2220 = var1.method6382(1723054621);
                } else if (var2 == 173) {
                    this.field2270 = var1.method6374();
                    this.field2271 = var1.method6374();
                } else if (var2 == 177) {
                    this.field2221 = true;
                } else if (178 == var2) {
                    this.field2269 = var1.method6371();
                } else if (var2 == 189) {
                    this.field2273 = true;
                } else if (var2 == 249) {
                    var4 = var1.method6371();
                    if (this.field2267 == null) {
                        var5 = class18.method3687(var4, (byte) 16);
                        this.field2267 = new NodeTable(var5);
                    }

                    for (var5 = 0; var5 < var4; ++var5) {
                        boolean var10 = var1.method6371() == 1;
                        var7 = var1.method6390((byte) 44);
                        Object var8;
                        if (var10) {
                            var8 = new class437(var1.method6379(-2143557829));
                        } else {
                            var8 = new class722(var1.method6420((byte) -68));
                        }

                        this.field2267.method2947((Node) var8, (long) var7);
                    }
                }
            } else {
                this.field2252 = var1.method6374();
                if (65535 == this.field2252) {
                    this.field2252 = -1;
                }

                this.field2253 = var1.method6374();
                if (65535 == this.field2253) {
                    this.field2253 = -1;
                }

                var4 = -1;
                if (92 == var2) {
                    var4 = var1.method6423(1235052657);
                }

                var5 = var1.method6371();
                this.field2198 = new int[2 + var5];

                for (var6 = 0; var6 <= var5; ++var6) {
                    this.field2198[var6] = var1.method6423(1235052657);
                }

                this.field2198[var5 + 1] = var4;
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "rw.f(" + ')');
        }
    }

    public String method1480(int var1, String var2, int var3) {
        try {
            if (this.field2267 == null) {
                return var2;
            } else {
                class437 var4 = (class437) this.field2267.method2942((long) var1);
                return var4 == null ? var2 : (String) var4.field7515;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "rw.q(" + ')');
        }
    }

    public final boolean method1481(int var1, byte var2) {
        try {
            if (this.field2206 == null) {
                return true;
            } else {
                boolean var3 = true;
                class180 var4 = this.field2235.field8386;
                synchronized (this.field2235.field8386) {
                    for (int var5 = 0; var5 < this.field2262.length; ++var5) {
                        if (this.field2262[var5] == var1) {
                            for (int var6 = 0; var6 < this.field2206[var5].length; ++var6) {
                                if (!this.field2235.field8386.method3260(this.field2206[var5][var6], 0, -1404450418)) {
                                    var3 = false;
                                }
                            }
                        }
                    }

                    return var3;
                }
            }
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "rw.p(" + ')');
        }
    }

    public final boolean method1482(int var1) {
        try {
            if (this.field2206 == null) {
                return true;
            } else {
                boolean var2 = true;
                class180 var3 = this.field2235.field8386;
                synchronized (this.field2235.field8386) {
                    for (int var4 = 0; var4 < this.field2206.length; ++var4) {
                        for (int var5 = 0; var5 < this.field2206[var4].length; ++var5) {
                            var2 &= this.field2235.field8386.method3260(this.field2206[var4][var5], 0, -1427920512);
                        }
                    }

                    return var2;
                }
            }
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "rw.i(" + ')');
        }
    }

    public boolean method1483(int var1, int var2) {
        try {
            if (this.field2210 != null && -1 != var1) {
                for (int var3 = 0; var3 < this.field2210.length; ++var3) {
                    if (this.field2210[var3] == var1) {
                        return true;
                    }
                }
            }

            return false;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "rw.h(" + ')');
        }
    }

    public final synchronized class879 method1484(class848 var1, int var2, int var3, int var4, SceneGraphLevel var5, SceneGraphLevel var6, int var7, int var8, int var9, Animator var10, class552 var11, byte var12) {
        try {
            if (class858.method5219(var3, 1883717056)) {
                var3 = class15.field6904.field6921;
            }

            long var13 = (long) (var4 + (var3 << 3) + (this.field2197 << 10));
            var13 |= (long) (var1.field8580 << 29);
            if (var11 != null) {
                var13 |= var11.field534 << 32;
            }

            if (var10 != null) {
                var2 |= var10.method2785(-1790708337);
            }

            if (this.field2195 == 3) {
                var2 |= 7;
            } else {
                if (this.field2195 != 0 || this.field2245 != 0) {
                    var2 |= 2;
                }

                if (this.field2244 != 0) {
                    var2 |= 1;
                }

                if (this.field2251 != 0) {
                    var2 |= 4;
                }
            }

            if (class15.field6919.field6921 == var3 && var4 > 3) {
                var2 |= 5;
            }

            class1 var16 = this.field2235.field8390;
            class879 var17;
            synchronized (this.field2235.field8390) {
                var17 = (class879) this.field2235.field8390.method2974(var13);
            }

            if (var17 == null || var1.method4836(var17.method5948(), var2) != 0) {
                if (var17 != null) {
                    var2 = var1.method4817(var2, var17.method5948());
                }

                var17 = this.method1485(var1, var2, var3, var4, var11, 1981902641);
                if (var17 == null) {
                    return null;
                }

                var16 = this.field2235.field8390;
                synchronized (this.field2235.field8390) {
                    this.field2235.field8390.method2984(var17, var13);
                }
            }

            boolean var22 = false;
            if (var10 != null) {
                var17 = var17.method6017((byte) 1, var2, true);
                var22 = true;
                var10.method2795(var17, var4 & 3, 1865606525);
            }

            if (var3 == class15.field6919.field6921 && var4 > 3) {
                if (!var22) {
                    var17 = var17.method6017((byte) 3, var2, true);
                    var22 = true;
                }

                var17.method6016(2048);
            }

            if (this.field2195 != 0) {
                if (!var22) {
                    var17 = var17.method6017((byte) 3, var2, true);
                    var22 = true;
                }

                var17.method5961(this.field2195, this.field2216, var5, var6, var7, var8, var9);
            }

            if (this.field2244 != 0 || this.field2245 != 0 || this.field2251 != 0) {
                if (!var22) {
                    var17 = var17.method6017((byte) 3, var2, true);
                    var22 = true;
                }

                var17.method5953(this.field2244, this.field2245, this.field2251);
            }

            if (var22) {
                var17.method5947(var2);
            }

            return var17;
        } catch (RuntimeException var21) {
            throw class158.method3445(var21, "rw.d(" + ')');
        }
    }

    class879 method1485(class848 var1, int var2, int var3, int var4, class552 var5, int var6) {
        try {
            int var7 = this.field2224 + 64;
            int var8 = this.field2225 * 5 + 850;
            int var9 = var2;
            boolean var10 = this.field2236 || var3 == class15.field6901.field6921 && var4 > 3;
            if (var10) {
                var2 |= 16;
            }

            if (var4 == 0) {
                if (this.field2238 != 128 || this.field2211 != 0) {
                    var2 |= 1;
                }

                if (128 != this.field2246 || this.field2243 != 0) {
                    var2 |= 4;
                }
            } else {
                var2 |= 13;
            }

            if (128 != this.field2239 || this.field2228 != 0) {
                var2 |= 2;
            }

            if (this.field2201 != null) {
                var2 |= 16384;
            }

            if (this.field2204 != null) {
                var2 |= 32768;
            }

            if (this.field2209 != 0) {
                var2 |= 524288;
            }

            class879 var11 = null;
            int var14;
            if (this.field2262 != null) {
                int var12 = -1;

                for (int var13 = 0; var13 < this.field2262.length; ++var13) {
                    if (var3 == this.field2262[var13]) {
                        var12 = var13;
                        break;
                    }
                }

                if (var12 == -1) {
                    return null;
                }

                int[] var28 = var5 != null && var5.field537 != null ? var5.field537 : this.field2206[var12];
                var14 = var28.length;
                if (var14 > 0) {
                    long var15 = (long) var1.field8580;

                    int var17;
                    for (var17 = 0; var17 < var14; ++var17) {
                        var15 = (long) var28[var17] + 67783L * var15;
                    }

                    class1 var30 = this.field2235.field8389;
                    synchronized (this.field2235.field8389) {
                        var11 = (class879) this.field2235.field8389.method2974(var15);
                    }

                    if (var11 != null) {
                        if (var7 != var11.method5982()) {
                            var2 |= 4096;
                        }

                        if (var8 != var11.method5950()) {
                            var2 |= 8192;
                        }
                    }

                    if (var11 == null || var1.method4836(var11.method5948(), var2) != 0) {
                        var17 = var2 | 127007;
                        if (var11 != null) {
                            var17 = var1.method4817(var17, var11.method5948());
                        }

                        class25 var18 = null;
                        class25[] var19 = this.field2235.field8382;
                        synchronized (this.field2235.field8382) {
                            int var20 = 0;

                            while (true) {
                                if (var20 >= var14) {
                                    if (var14 > 1) {
                                        var18 = new class25(this.field2235.field8382, var14);
                                    }
                                    break;
                                }

                                class180 var21 = this.field2235.field8386;
                                synchronized (this.field2235.field8386) {
                                    var18 = class25.method3454(this.field2235.field8386, var28[var20], 0);
                                }

                                if (var18 == null) {
                                    return null;
                                }

                                if (var18.field6462 < 13) {
                                    var18.method3458(2);
                                }

                                if (var14 > 1) {
                                    this.field2235.field8382[var20] = var18;
                                }

                                ++var20;
                            }
                        }

                        var11 = var1.method4861(var18, var17, this.field2235.field8392, var7, var8);
                        class1 var31 = this.field2235.field8389;
                        synchronized (this.field2235.field8389) {
                            this.field2235.field8389.method2984(var11, var15);
                        }
                    }
                }
            }

            if (var11 == null) {
                return null;
            } else {
                class879 var27 = var11.method6017((byte) 0, var2, true);
                if (var7 != var11.method5982()) {
                    var27.method5980(var7);
                }

                if (var8 != var11.method5950()) {
                    var27.method5981(var8);
                }

                if (var10) {
                    var27.method5954();
                }

                if (var3 == class15.field6904.field6921 && var4 > 3) {
                    var27.method5951(2048);
                    var27.method5953(180, 0, -180);
                }

                var4 &= 3;
                if (1 == var4) {
                    var27.method5951(4096);
                } else if (2 == var4) {
                    var27.method5951(8192);
                } else if (var4 == 3) {
                    var27.method5951(12288);
                }

                short[] var29;
                if (this.field2201 != null) {
                    if (var5 != null && var5.field536 != null) {
                        var29 = var5.field536;
                    } else {
                        var29 = this.field2199;
                    }

                    for (var14 = 0; var14 < this.field2201.length; ++var14) {
                        if (this.field2203 != null && var14 < this.field2203.length) {
                            var27.method5984(this.field2201[var14], field2255[this.field2203[var14] & 255]);
                        } else {
                            var27.method5984(this.field2201[var14], var29[var14]);
                        }
                    }
                }

                if (this.field2204 != null) {
                    if (var5 != null && var5.field535 != null) {
                        var29 = var5.field535;
                    } else {
                        var29 = this.field2205;
                    }

                    for (var14 = 0; var14 < this.field2204.length; ++var14) {
                        var27.method5986(this.field2204[var14], var29[var14]);
                    }
                }

                if (this.field2209 != 0) {
                    var27.method5987(this.field2249, this.field2207, this.field2247, this.field2209 & 255);
                }

                if (this.field2238 != 128 || this.field2239 != 128 || 128 != this.field2246) {
                    var27.method5955(this.field2238, this.field2239, this.field2246);
                }

                if (this.field2211 != 0 || this.field2228 != 0 || this.field2243 != 0) {
                    var27.method5953(this.field2211, this.field2228, this.field2243);
                }

                var27.method5947(var9);
                return var27;
            }
        } catch (RuntimeException var26) {
            throw class158.method3445(var26, "rw.u(" + ')');
        }
    }

    public int method1486(int var1, int var2, byte var3) {
        try {
            if (this.field2267 == null) {
                return var2;
            } else {
                class722 var4 = (class722) this.field2267.method2942((long) var1);
                return var4 == null ? var2 : var4.field3631;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "rw.r(" + ')');
        }
    }

    public final ObjectDefinition method1487(class415 var1, int var2) {
        try {
            int var3 = -1;
            if (this.field2252 != -1) {
                var3 = var1.method5653(this.field2252, (byte) 36);
            } else if (this.field2253 != -1) {
                var3 = var1.method5655(this.field2253, (byte) 99);
            }

            if (var3 >= 0 && var3 < this.field2198.length - 1 && -1 != this.field2198[var3]) {
                return this.field2235.method4713(this.field2198[var3]);
            } else {
                int var4 = this.field2198[this.field2198.length - 1];
                return -1 != var4 ? this.field2235.method4713(var4) : null;
            }
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "rw.x(" + ')');
        }
    }

    void method1488(int var1) {
        try {
            if (this.field2214 == -1) {
                this.field2214 = 0;
                if (this.field2262 != null && 1 == this.field2262.length && this.field2262[0] == class15.field6919.field6921) {
                    this.field2214 = 1;
                }

                for (int var2 = 0; var2 < 5; ++var2) {
                    if (this.actions[var2] != null) {
                        this.field2214 = 1;
                        break;
                    }
                }
            }

            if (this.field2241 == -1) {
                this.field2241 = this.field2212 != 0 ? 1 : 0;
            }

            if (this.method1489(934270378) || this.field2213 || this.field2198 != null) {
                this.field2221 = true;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "rw.b(" + ')');
        }
    }

    public boolean method1489(int var1) {
        try {
            return this.field2210 != null;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "rw.s(" + ')');
        }
    }

    public boolean method1490(int var1) {
        try {
            return this.field2210 != null && this.field2210.length > 1;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "rw.z(" + ')');
        }
    }

    public int method1491(byte var1) {
        try {
            if (this.field2210 != null) {
                if (this.field2210.length <= 1) {
                    return this.field2210[0];
                }

                int var2 = (int) (Math.random() * 65535.0D);

                for (int var3 = 0; var3 < this.field2210.length; ++var3) {
                    if (var2 <= this.field2222[var3]) {
                        return this.field2210[var3];
                    }

                    var2 -= this.field2222[var3];
                }
            }

            return -1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "rw.y(" + ')');
        }
    }

    public int[] method1492(int var1) {
        try {
            return this.field2210;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "rw.t(" + ')');
        }
    }

    void method1493(InputStream var1, int var2) {
        try {
            while (true) {
                int var3 = var1.method6371();
                if (var3 == 0) {
                    return;
                }

                this.getObjectDefinition(var1, var3, -537941504);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "rw.a(" + ')');
        }
    }

    public boolean method1494(int var1) {
        try {
            if (this.field2198 == null) {
                return this.field2254 != -1 || this.field2261 != null;
            } else {
                for (int var2 = 0; var2 < this.field2198.length; ++var2) {
                    if (this.field2198[var2] != -1) {
                        ObjectDefinition var3 = this.field2235.method4713(this.field2198[var2]);
                        if (-1 != var3.field2254 || var3.field2261 != null) {
                            return true;
                        }
                    }
                }

                return false;
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "rw.n(" + ')');
        }
    }

    public final synchronized class486 method1495(class848 var1, int var2, int var3, int var4, SceneGraphLevel var5, SceneGraphLevel var6, int var7, int var8, int var9, boolean var10, class552 var11, int var12) {
        try {
            if (class858.method5219(var3, -1998635010)) {
                var3 = class15.field6904.field6921;
            }

            long var13 = (long) ((this.field2197 << 10) + (var3 << 3) + var4);
            var13 |= (long) (var1.field8580 << 29);
            if (var11 != null) {
                var13 |= var11.field534 << 32;
            }

            int var15 = var2;
            if (3 == this.field2195) {
                var15 = var2 | 7;
            } else {
                if (this.field2195 != 0 || this.field2245 != 0) {
                    var15 = var2 | 2;
                }

                if (this.field2244 != 0) {
                    var15 |= 1;
                }

                if (this.field2251 != 0) {
                    var15 |= 4;
                }
            }

            if (var10) {
                var15 |= 262144;
            }

            class1 var16 = this.field2235.field8391;
            class486 var17;
            synchronized (this.field2235.field8391) {
                var17 = (class486) this.field2235.field8391.method2974(var13);
            }

            class879 var25 = (class879) (var17 != null ? var17.field8554 : null);
            class770 var18 = null;
            if (var25 != null && var1.method4836(var25.method5948(), var15) == 0) {
                var18 = (class770) var17.field8555;
                if (var10 && var18 == null) {
                    var18 = (class770) (var17.field8555 = var25.method6102((class770) null));
                }
            } else {
                if (var25 != null) {
                    var15 = var1.method4817(var15, var25.method5948());
                }

                int var19 = var15;
                if (var3 == class15.field6919.field6921 && var4 > 3) {
                    var19 = var15 | 5;
                }

                var25 = this.method1485(var1, var19, var3, var4, var11, 1553510063);
                if (var25 == null) {
                    return null;
                }

                if (var3 == class15.field6919.field6921 && var4 > 3) {
                    var25.method6016(2048);
                }

                if (var10) {
                    var18 = var25.method6102((class770) null);
                }

                var25.method5947(var15);
                var17 = new class486(var25, var18);
                class1 var20 = this.field2235.field8391;
                synchronized (this.field2235.field8391) {
                    this.field2235.field8391.method2984(var17, var13);
                }
            }

            boolean var26 = this.field2195 != 0 && (var5 != null || var6 != null);
            boolean var27 = this.field2244 != 0 || this.field2245 != 0 || this.field2251 != 0;
            if (!var26 && !var27) {
                var25 = var25.method6017((byte) 0, var2, true);
            } else {
                var25 = var25.method6017((byte) 0, var15, true);
                if (var26) {
                    var25.method5961(this.field2195, this.field2216, var5, var6, var7, var8, var9);
                }

                if (var27) {
                    var25.method5953(this.field2244, this.field2245, this.field2251);
                }

                var25.method5947(var2);
            }

            this.field2235.field8395.field8554 = var25;
            this.field2235.field8395.field8555 = var18;
            return this.field2235.field8395;
        } catch (RuntimeException var24) {
            throw class158.method3445(var24, "rw.k(" + ')');
        }
    }
}
