import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.util.Iterator;

public class class521 implements Iterator {
    NodeTable field4350;
    Node field4351;
    int field4352;
    Node field4353 = null;

    public class521(NodeTable var1) {
        this.field4350 = var1;
        this.method2748(-751580615);
    }

    static final void method2750(byte var0) {
        try {
            if (1 != class881.field10168 && 100 != class881.field10168) {
                try {
                    short var1;
                    if (class881.field10176 == 0) {
                        var1 = 250;
                    } else {
                        var1 = 2000;
                    }

                    if (class881.field10158 && class881.field10168 >= 62) {
                        var1 = 6000;
                    }

                    if (class881.field10140 != 264 || 203 != class881.field10168 && 42 != class881.field10143) {
                        ++class881.field10172;
                    }

                    if (class881.field10172 > var1) {
                        class881.field10177.method4374((byte) 57);
                        if (class881.field10176 >= 3) {
                            class881.field10168 = 1;
                            class919.method6486(-5, 1141860334);
                            return;
                        }

                        if (264 == class881.field10140) {
                            class601.field9203.method2743(-281677177);
                        } else {
                            class569.field24.method2743(-213625938);
                        }

                        class881.field10172 = 0;
                        ++class881.field10176;
                        class881.field10168 = 12;
                    }

                    class701 var2;
                    int var3;
                    int var5;
                    if (12 == class881.field10168) {
                        if (264 == class881.field10140) {
                            class881.field10177.method4379(class897.method5626(class601.field9203.method2740(295506052), 15000, -649048480), class601.field9203.field4343, (byte) 0);
                        } else {
                            class881.field10177.method4379(class897.method5626(class764.method2741(Loader.field6969, 43594), 15000, -649048480), class569.field24.field4343, (byte) 0);
                        }

                        class881.field10177.method4373((short) 8191);
                        var2 = class776.method2295(-1825045529);
                        if (class881.field10158) {
                            var2.field3364.method6361(class909.field10389.field10394);
                            var2.field3364.method6362(0, 16711935);
                            var3 = var2.field3364.field10376;
                            var2.field3364.method6364(718, -1354427278);
                            if (Loader.field6970 != -1) {
                                var2.field3364.method6364(Loader.field6970, 376398822);
                            }

                            if (class881.field10140 == 264) {
                                var2.field3364.method6361(5 == class730.field2733 ? 1 : 0);
                            }

                            InputStream var4 = IterableSceneEntity.method3541(-1454924768);
                            var4.method6361(class881.field10145);
                            var4.method6362((int) (Math.random() * 9.9999999E7D), 16711935);
                            var4.method6361(class321.field1066.method89(694163818));
                            var4.method6364(class730.field2646, -1393012818);

                            for (var5 = 0; var5 < 6; ++var5) {
                                var4.method6364((int) (Math.random() * 9.9999999E7D), 499420945);
                            }

                            var4.method6385(class730.field2656);
                            var4.method6361(class730.field2926.field7327);
                            var4.method6361((int) (Math.random() * 9.9999999E7D));
                            var4.method6412(class449.field7058, class449.field7062, 1533826109);
                            var2.field3364.method6425(var4.field10375, 0, var4.field10376, (short) -29754);
                            var2.field3364.method6369(var2.field3364.field10376 - var3, 1585504133);
                        } else {
                            var2.field3364.method6361(class909.field10392.field10394);
                        }

                        class881.field10177.method4380(var2, (byte) -57);
                        class881.field10177.method4376(-1781606732);
                        class881.field10168 = 30;
                    }

                    int var18;
                    if (class881.field10168 == 30) {
                        if (!class881.field10177.method4377(537308016).method175(1, (byte) -19)) {
                            return;
                        }

                        class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, 1, (byte) 75);
                        var18 = class881.field10177.field7768.field10375[0] & 255;
                        if (var18 != 0) {
                            class881.field10168 = 1;
                            class919.method6486(var18, 352942199);
                            class881.field10177.method4374((byte) 110);
                            class978.method1845(1976641602);
                            return;
                        }

                        if (class881.field10158) {
                            class881.field10168 = 44;
                        } else {
                            class881.field10168 = 82;
                        }
                    }

                    if (class881.field10168 == 44) {
                        if (!class881.field10177.method4377(537308016).method175(2, (byte) -17)) {
                            return;
                        }

                        class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, 2, (byte) -39);
                        class881.field10177.field7768.field10376 = 0;
                        class881.field10177.field7768.field10376 = class881.field10177.field7768.method6374();
                        class881.field10168 = 58;
                    }

                    if (class881.field10168 == 58) {
                        if (!class881.field10177.method4377(537308016).method175(class881.field10177.field7768.field10376, (byte) 6)) {
                            return;
                        }

                        class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, class881.field10177.field7768.field10376, (byte) 33);
                        class881.field10177.field7768.method6387(class881.field10161, 642509947);
                        class881.field10177.field7768.field10376 = 0;
                        String var19 = class881.field10177.field7768.method6413(681479919);
                        class881.field10177.field7768.field10376 = 0;
                        String var20 = class662.field9733.method5798(-1670386026);
                        if (!class730.field2616 || !class948.method1939(var19, 1, var20, -2049749087)) {
                            class529.method2213(var19, true, class615.field8903.field9137.method3689(-671601354) == 5, var20, class730.field2849, class730.field2632, -1487322449);
                        }

                        class881.field10168 = 62;
                    }

                    if (class881.field10168 == 62) {
                        if (!class881.field10177.method4377(537308016).method175(1, (byte) 73)) {
                            return;
                        }

                        class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, 1, (byte) 68);
                        if ((class881.field10177.field7768.field10375[0] & 255) == 1) {
                            class881.field10168 = 72;
                        }
                    }

                    if (class881.field10168 == 72) {
                        if (!class881.field10177.method4377(537308016).method175(16, (byte) -100)) {
                            return;
                        }

                        class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, 16, (byte) 59);
                        class881.field10177.field7768.field10376 = 16;
                        class881.field10177.field7768.method6387(class881.field10161, 642509947);
                        class881.field10177.field7768.field10376 = 0;
                        class881.field10146 = class881.field10177.field7768.method6375((short) 27770);
                        class881.field10183 = class881.field10177.field7768.method6375((short) 10381);
                        class881.field10168 = 82;
                    }

                    class513 var21;
                    if (class881.field10168 == 82) {
                        class881.field10177.field7768.field10376 = 0;
                        class881.field10177.method4373((short) 8191);
                        var2 = class776.method2295(-1133801446);
                        var21 = var2.field3364;
                        int var6;
                        InputStream var7;
                        class909 var22;
                        if (264 == class881.field10140) {
                            if (class881.field10158) {
                                var22 = class909.field10393;
                            } else {
                                var22 = class909.field10385;
                            }

                            var21.method6361(var22.field10394);
                            var21.method6362(0, 16711935);
                            var5 = var21.field10376;
                            var6 = var21.field10376;
                            if (!class881.field10158) {
                                var21.method6364(718, 711122101);
                                if (Loader.field6970 != -1) {
                                    var21.method6364(Loader.field6970, 98092954);
                                }

                                var21.method6361(class730.field2733 == 5 ? 1 : 0);
                                var6 = var21.field10376;
                                var7 = class924.method6254(-2133378997);
                                var21.method6425(var7.field10375, 0, var7.field10376, (short) -31677);
                                var6 = var21.field10376;
                                var21.method6361(class881.field10146 == -1L ? 1 : 0);
                                if (class881.field10146 == -1L) {
                                    var21.method6366(class881.field10170, 2140422151);
                                } else {
                                    var21.method6385(class881.field10146);
                                }
                            }

                            var21.method6361(class660.method5750((byte) -90));
                            var21.method6362(class759.field4331, 16711935);
                            var21.method6362(class97.field614, 16711935);
                            var21.method6361(class615.field8903.field9116.method1098(-217929740));
                            class498.method4491(var21, (byte) 1);
                            String[] var26 = class414.method5602();
                            var21.method6364(var26.length, -1);
                            String[] var8 = var26;
                            int var9 = var26.length;

                            for (int var10 = 0; var10 < var9; ++var10) {
                                String var11 = var8[var10];
                                var21.method6366(var11, -1);
                            }

                            String[] var32 = class414.method5601();
                            var21.method6364(var32.length, -1);
                            String[] var12 = var32;
                            int var27 = var32.length;

                            for (var9 = 0; var9 < var27; ++var9) {
                                String var29 = var12[var9];
                                var21.method6366(var29, -1);
                            }

                            var21.method6366(class730.field2909, 2114152304);
                            var21.method6364(class730.field2646, -1572632938);
                            InputStream var30 = class615.field8903.method5393(-611972750);
                            var21.method6361(var30.field10376);
                            var21.method6425(var30.field10375, 0, var30.field10376, (short) -20549);
                            class730.field2647 = true;
                            if (Loader.field6958) {
                                InputStream var28 = new InputStream(class86.field1134.method1819(-1431420237));
                                class86.field1134.method1818(var28, 652337983);
                                var21.method6425(var28.field10375, 0, var28.field10375.length, (short) -1355);
                            }

                            var21.method6364(class730.field2694, -1287558190);
                            var21.method6385(class730.field2626);
                            var21.method6361(class730.field2629 == null ? 0 : 1);
                            if (class730.field2629 != null) {
                                var21.method6366(class730.field2629, 2119355084);
                            }

                            var21.method6361(class606.field8572.method5401("jagtheora", 1302159774) ? 1 : 0);
                            var21.method6361(class730.field2616 ? 1 : 0);
                            var21.method6361(class730.field2940 ? 1 : 0);
                            var21.method6361(class507.field4016);
                            var21.method6364(class730.field2635, 576248494);
                            var21.method6366(class730.field2636, 2141094155);
                            var21.method6361(class890.field9270 != null && class601.field9203.field4347 == class890.field9270.field4347 ? 0 : 1);
                            class51.method1531(var21, -956052447);
                            var21.method6388(class881.field10161, var6, var21.field10376, 1729780581);
                            var21.method6369(var21.field10376 - var5, 1585504133);
                        } else {
                            if (class881.field10158) {
                                var22 = class909.field10393;
                            } else {
                                var22 = class909.field10387;
                            }

                            var21.method6361(var22.field10394);
                            var21.method6362(0, 16711935);
                            var5 = var21.field10376;
                            var6 = var21.field10376;
                            if (!class881.field10158) {
                                var21.method6364(718, -452164382);
                                if (Loader.field6970 != -1) {
                                    var21.method6364(Loader.field6970, 317411115);
                                }

                                var7 = class924.method6254(-1358767373);
                                var21.method6425(var7.field10375, 0, var7.field10376, (short) -22572);
                                var6 = var21.field10376;
                                var21.method6361(class881.field10146 == -1L ? 1 : 0);
                                if (-1L == class881.field10146) {
                                    var21.method6366(class881.field10170, 2126472832);
                                } else {
                                    var21.method6385(class881.field10146);
                                }
                            }

                            var21.method6361(class730.field2926.field7327);
                            var21.method6361(class321.field1066.method89(694163818));
                            class498.method4491(var21, (byte) 1);
                            var21.method6366(class730.field2909, 2107324025);
                            var7 = class615.field8903.method5393(-1517637513);
                            var21.method6361(var7.field10376);
                            var21.method6425(var7.field10375, 0, var7.field10376, (short) -4570);
                            InputStream var33 = new InputStream(class86.field1134.method1819(-1431420237));
                            class86.field1134.method1818(var33, 1834978848);
                            var21.method6425(var33.field10375, 0, var33.field10375.length, (short) -14969);
                            var21.method6364(class730.field2646, 142980326);
                            var21.method6364(class730.field2635, -840792899);
                            var21.method6366(class730.field2636, 2126130218);
                            class51.method1531(var21, -535015918);
                            byte[] var31 = NetworkInterface.getByInetAddress(InetAddress.getLocalHost()).getHardwareAddress();
                            var21.method6361(var31.length);
                            var21.method6425(var31, 0, var31.length, (short) -20549);
                            var21.method6388(class881.field10161, var6, var21.field10376, -1390268287);
                            var21.method6369(var21.field10376 - var5, 1585504133);
                        }

                        class881.field10177.method4380(var2, (byte) -65);
                        class881.field10177.method4376(-1062695636);
                        class881.field10177.field7765 = new class246(class881.field10161);

                        for (int var24 = 0; var24 < 4; ++var24) {
                            class881.field10161[var24] += 50;
                        }

                        class881.field10177.field7769 = new class246(class881.field10161);
                        new class246(class881.field10161);
                        class881.field10177.field7768.method2649(class881.field10177.field7769, (byte) 80);
                        class881.field10161 = null;
                        class881.field10168 = 94;
                    }

                    if (94 == class881.field10168) {
                        if (!class881.field10177.method4377(537308016).method175(1, (byte) -69)) {
                            return;
                        }

                        class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, 1, (byte) -72);
                        var18 = class881.field10177.field7768.field10375[0] & 255;
                        if (21 == var18) {
                            class881.field10168 = 125;
                        } else if (29 != var18 && 45 != var18) {
                            if (var18 == 1) {
                                class881.field10168 = 100;
                                class919.method6486(var18, 1486771183);
                                return;
                            }

                            if (var18 == 2) {
                                class881.field10168 = 137;
                            } else {
                                if (15 != var18) {
                                    if (var18 == 23 && class881.field10176 < 3) {
                                        class881.field10172 = 0;
                                        ++class881.field10176;
                                        class881.field10168 = 12;
                                        class881.field10177.method4374((byte) 93);
                                        return;
                                    } else if (var18 == 42) {
                                        class881.field10168 = 203;
                                        class919.method6486(var18, 1924139793);
                                        return;
                                    } else {
                                        if (class881.field10142 && !class881.field10158 && -1 != class881.field10145 && 35 == var18) {
                                            class881.field10158 = true;
                                            class881.field10172 = 0;
                                            class881.field10168 = 12;
                                            class881.field10177.method4374((byte) 93);
                                        } else {
                                            class881.field10168 = 1;
                                            class919.method6486(var18, 1778518954);
                                            class881.field10177.method4374((byte) 124);
                                            class978.method1845(1976641602);
                                        }

                                        return;
                                    }
                                }

                                class881.field10177.field7771 = -2;
                                class881.field10168 = 193;
                            }
                        } else {
                            class500.field3135 = var18;
                            class881.field10168 = 186;
                        }
                    }

                    if (class881.field10168 == 117) {
                        class881.field10177.method4373((short) 8191);
                        var2 = class776.method2295(-1106381844);
                        var21 = var2.field3364;
                        var21.method2649(class881.field10177.field7765, (byte) 41);
                        var21.method2651(class909.field10395.field10394, (byte) 1);
                        class881.field10177.method4380(var2, (byte) -122);
                        class881.field10177.method4376(-1208418920);
                        class881.field10168 = 94;
                    } else if (125 == class881.field10168) {
                        if (class881.field10177.method4377(537308016).method175(1, (byte) 48)) {
                            class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, 1, (byte) -14);
                            var18 = class881.field10177.field7768.field10375[0] & 255;
                            class881.field10180 = var18 * 50;
                            class881.field10168 = 1;
                            class919.method6486(21, 779029063);
                            class881.field10177.method4374((byte) 10);
                            class978.method1845(1976641602);
                        }
                    } else if (class881.field10168 == 203) {
                        if (class881.field10177.method4377(537308016).method175(2, (byte) 92)) {
                            class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, 2, (byte) 31);
                            class881.field10138 = ((class881.field10177.field7768.field10375[0] & 255) << 8) + (class881.field10177.field7768.field10375[1] & 255);
                            class881.field10168 = 94;
                        }
                    } else if (class881.field10168 == 186) {
                        if (29 == class500.field3135) {
                            if (!class881.field10177.method4377(537308016).method175(1, (byte) 78)) {
                                return;
                            }

                            class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, 1, (byte) -63);
                            class881.field10182 = class881.field10177.field7768.field10375[0] & 255;
                        } else {
                            if (class500.field3135 != 45) {
                                throw new IllegalStateException();
                            }

                            if (!class881.field10177.method4377(537308016).method175(3, (byte) -85)) {
                                return;
                            }

                            class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, 3, (byte) -63);
                            class881.field10182 = class881.field10177.field7768.field10375[0] & 255;
                            class881.field10181 = (class881.field10177.field7768.field10375[2] & 255) + ((class881.field10177.field7768.field10375[1] & 255) << 8);
                        }

                        class881.field10168 = 1;
                        class919.method6486(class500.field3135, -28417078);
                        class881.field10177.method4374((byte) 7);
                        class978.method1845(1976641602);
                    } else if (137 == class881.field10168) {
                        if (class881.field10177.method4377(537308016).method175(1, (byte) -1)) {
                            class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, 1, (byte) -34);
                            class881.field10174 = class881.field10177.field7768.field10375[0] & 255;
                            class881.field10168 = 148;
                        }
                    } else {
                        class513 var23;
                        if (class881.field10168 == 148) {
                            var23 = class881.field10177.field7768;
                            if (264 == class881.field10140) {
                                if (!class881.field10177.method4377(537308016).method175(class881.field10174, (byte) 68)) {
                                    return;
                                }

                                class881.field10177.method4377(537308016).method177(var23.field10375, 0, class881.field10174, (byte) 13);
                                var23.field10376 = 0;
                                class730.field2790 = var23.method6371();
                                class730.field2914 = var23.method6371();
                                class730.field2792 = var23.method6371() == 1;
                                class730.field2793 = var23.method6371() == 1;
                                class730.field2794 = var23.method6371() == 1;
                                class730.field2783 = var23.method6371() == 1;
                                class730.field2623 = var23.method6374();
                                class730.field2788 = var23.method6371() == 1;
                                class206.field7099 = var23.method6404((byte) -39);
                                class730.field2759 = var23.method6371() == 1;
                                class143.field1540 = var23.method6379(-796084606);
                                class730.field2697.getObjectDefinitionLoader().method4707(class730.field2759, 915103443);
                                class625.field9752.method463((short) 206).getObjectDefinitionLoader().method4707(class730.field2759, 915103443);
                                class85.field1121.method1577(class730.field2759, 798055588);
                                class258.field7913.method13(class730.field2759, (byte) -2);
                            } else {
                                if (!class881.field10177.method4377(537308016).method175(class881.field10174, (byte) -27)) {
                                    return;
                                }

                                class881.field10177.method4377(537308016).method177(var23.field10375, 0, class881.field10174, (byte) 29);
                                var23.field10376 = 0;
                                class730.field2790 = var23.method6371();
                                class730.field2914 = var23.method6371();
                                class730.field2792 = var23.method6371() == 1;
                                class206.field7099 = var23.method6404((byte) -98);
                                class923.local.field3399 = (byte) var23.method6371();
                                class730.field2793 = var23.method6371() == 1;
                                class730.field2794 = var23.method6371() == 1;
                                class341.field317 = var23.method6375((short) 9875);
                                class722.field3632 = class341.field317 - class27.resetTimer((byte) 1) - var23.method6378((byte) 74);
                                var3 = var23.method6371();
                                class730.field2788 = (var3 & 1) != 0;
                                class419.field9521 = (var3 & 2) != 0;
                                class379.field1140 = var23.method6420((byte) 99);
                                class904.field10357 = var23.method6371() == 1;
                                class495.field8097 = var23.method6420((byte) -9);
                                class621.field8926 = var23.method6374();
                                class643.field10036 = var23.method6374();
                                Node.field643 = var23.method6374();
                                Node.field644 = var23.method6420((byte) 39);
                                class285.field10627 = new class330(Node.field644);
                                (new Thread(class285.field10627)).start();
                                class811.field4653 = var23.method6371();
                                class931.field10299 = var23.method6374();
                                class749.field4018 = var23.method6374();
                                class4.field4946 = var23.method6371() == 1;
                                class923.local.field3374 = class923.local.field3379 = class862.field8932 = var23.method6413(681479919);
                                class811.field4654 = var23.method6371();
                                class82.field1110 = var23.method6420((byte) -28);
                                class730.field2621 = var23.method6371() == 1;
                                class890.field9270 = new class764();
                                class890.field9270.field4347 = var23.method6374();
                                if (65535 == class890.field9270.field4347) {
                                    class890.field9270.field4347 = -1;
                                }

                                class890.field9270.field4343 = var23.method6413(681479919);
                                if (class916.field10415 != class721.field3634) {
                                    class890.field9270.field4344 = class890.field9270.field4347 * 183093373 + 815680320;
                                    class890.field9270.field4345 = -52655920 + class890.field9270.field4347 * 1934452217;
                                }

                                if (class721.field3634 != class916.field10410 && (class721.field3634 != class916.field10412 || class730.field2790 < 2) && class601.field9203.method2742(class601.field9200, 2123928060)) {
                                    class590.method1219(-1667448332);
                                }
                            }

                            if ((!class730.field2792 || class730.field2794) && !class730.field2788) {
                                try {
                                    class872.method5894(class833.field9178, "unzap", (short) 10429);
                                } catch (Throwable var13) {
                                    ;
                                }
                            } else {
                                try {
                                    class872.method5894(class833.field9178, "zap", (short) 11786);
                                } catch (Throwable var15) {
                                    if (class730.field2620) {
                                        try {
                                            class833.field9178.getAppletContext().showDocument(new URL(class833.field9178.getCodeBase(), "blank.ws"), "tbi");
                                        } catch (Exception var14) {
                                            ;
                                        }
                                    }
                                }
                            }

                            if (class916.field10415 == class721.field3634) {
                                class662.field9725.method5799(-1392768715);
                            }

                            if (264 != class881.field10140) {
                                class881.field10168 = 1;
                                class919.method6486(2, 1533583535);
                                ObjectDefinition.method1499(-954161588);
                                class967.method1750(14, 1153867870);
                                class881.field10177.field7770 = null;
                                return;
                            }

                            class881.field10168 = 163;
                        }

                        if (class881.field10168 == 163) {
                            if (!class881.field10177.method4377(537308016).method175(3, (byte) 75)) {
                                return;
                            }

                            class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, 3, (byte) -16);
                            class881.field10168 = 176;
                        }

                        if (class881.field10168 == 176) {
                            var23 = class881.field10177.field7768;
                            var23.field10376 = 0;
                            if (var23.method2645((byte) -27)) {
                                if (!class881.field10177.method4377(537308016).method175(1, (byte) -10)) {
                                    return;
                                }

                                class881.field10177.method4377(537308016).method177(var23.field10375, 3, 1, (byte) -25);
                            }

                            class881.field10177.field7770 = class419.method5644(-1456212765)[var23.method6382(250607366)];
                            class881.field10177.field7771 = var23.method6374();
                            class881.field10168 = 158;
                        }

                        if (158 == class881.field10168) {
                            if (class881.field10177.method4377(537308016).method175(class881.field10177.field7771, (byte) -22)) {
                                class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, class881.field10177.field7771, (byte) 29);
                                class881.field10177.field7768.field10376 = 0;
                                var18 = class881.field10177.field7771;
                                class881.field10168 = 1;
                                class919.method6486(2, 1250429131);
                                class469.method4021(-2092028687);
                                class808.method2892(class881.field10177.field7768, 837096225);
                                var3 = var18 - class881.field10177.field7768.field10376;
                                class513 var25 = new class513(var3);
                                System.arraycopy(class881.field10177.field7768.field10375, class881.field10177.field7768.field10376, var25.field10375, 0, var3);
                                class881.field10177.field7768.field10376 += var3;
                                if (class881.field10177.field7770 == class807.field4558) {
                                    class730.field2697.method5292(new class406(class335.field52, var25), -1991819579);
                                } else {
                                    class730.field2697.method5292(new class406(class335.field45, var25), -1991819579);
                                }

                                if (var18 != class881.field10177.field7768.field10376) {
                                    throw new RuntimeException(class881.field10177.field7768.field10376 + " " + var18);
                                }

                                class881.field10177.field7770 = null;
                            }
                        } else if (193 == class881.field10168) {
                            if (-2 == class881.field10177.field7771) {
                                if (!class881.field10177.method4377(537308016).method175(2, (byte) 39)) {
                                    return;
                                }

                                class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, 2, (byte) 9);
                                class881.field10177.field7768.field10376 = 0;
                                class881.field10177.field7771 = class881.field10177.field7768.method6374();
                            }

                            if (class881.field10177.method4377(537308016).method175(class881.field10177.field7771, (byte) 77)) {
                                class881.field10177.method4377(537308016).method177(class881.field10177.field7768.field10375, 0, class881.field10177.field7771, (byte) -73);
                                class881.field10177.field7768.field10376 = 0;
                                var18 = class881.field10177.field7771;
                                class881.field10168 = 1;
                                class919.method6486(15, 380191322);
                                class488.method4738(144926411);
                                class808.method2892(class881.field10177.field7768, 822397380);
                                if (class881.field10177.field7768.field10376 != var18) {
                                    throw new RuntimeException(class881.field10177.field7768.field10376 + " " + var18);
                                }

                                class881.field10177.field7770 = null;
                            }
                        }
                    }
                } catch (IOException var16) {
                    class881.field10177.method4374((byte) 40);
                    if (class881.field10176 < 3) {
                        if (264 == class881.field10140) {
                            class601.field9203.method2743(-1442409390);
                        } else {
                            class569.field24.method2743(-734598763);
                        }

                        class881.field10172 = 0;
                        ++class881.field10176;
                        class881.field10168 = 12;
                    } else {
                        class881.field10168 = 1;
                        class919.method6486(-4, 500556519);
                        class978.method1845(1976641602);
                    }
                }
            }

        } catch (RuntimeException var17) {
            throw class158.method3445(var17, "sy.c(" + ')');
        }
    }

    static void method2751(boolean var0, boolean var1, String var2, String var3, long var4) {
        try {
            class881.field10158 = var0;
            if (!var1) {
                class881.field10145 = -1;
            }

            class881.field10142 = var1;
            class881.field10170 = var2;
            class881.field10171 = var3;
            class881.field10146 = var4;
            if (!class881.field10142 && (class881.field10170.equals("") || class881.field10171.equals(""))) {
                class919.method6486(3, 418769263);
            } else {
                if (class881.field10140 != 136) {
                    class881.field10180 = 0;
                    class881.field10182 = -1;
                    class881.field10181 = -1;
                }

                class881.field10177.field7782 = false;
                class919.method6486(-3, 1492625242);
                class881.field10168 = 12;
                class881.field10172 = 0;
                class881.field10176 = 0;
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "sy.e(" + ')');
        }
    }

    public boolean hasNext() {
        try {
            if (this.field4350.field4923[this.field4352 - 1] != this.field4351) {
                return true;
            } else {
                while (this.field4352 < this.field4350.field4926) {
                    if (this.field4350.field4923[++this.field4352 - 1].field640 != this.field4350.field4923[this.field4352 - 1]) {
                        this.field4351 = this.field4350.field4923[this.field4352 - 1].field640;
                        return true;
                    }

                    this.field4351 = this.field4350.field4923[this.field4352 - 1];
                }

                return false;
            }
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "sy.hasNext(" + ')');
        }
    }

    void method2748(int var1) {
        try {
            this.field4351 = this.field4350.field4923[0].field640;
            this.field4352 = 1;
            this.field4353 = null;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "sy.d(" + ')');
        }
    }

    public void remove() {
        try {
            if (this.field4353 == null) {
                throw new IllegalStateException();
            } else {
                this.field4353.method545(-1460969981);
                this.field4353 = null;
            }
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "sy.remove(" + ')');
        }
    }

    public Object next() {
        try {
            Node var1;
            if (this.field4350.field4923[this.field4352 - 1] != this.field4351) {
                var1 = this.field4351;
                this.field4351 = var1.field640;
                this.field4353 = var1;
                return var1;
            } else {
                while (this.field4352 < this.field4350.field4926) {
                    var1 = this.field4350.field4923[++this.field4352 - 1].field640;
                    if (var1 != this.field4350.field4923[this.field4352 - 1]) {
                        this.field4351 = var1.field640;
                        this.field4353 = var1;
                        return var1;
                    }
                }

                return null;
            }
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "sy.aSceneEntity(" + ')');
        }
    }

    public Node method2749(int var1) {
        try {
            this.method2748(-751580615);
            return (Node) this.next();
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "sy.u(" + ')');
        }
    }
}
