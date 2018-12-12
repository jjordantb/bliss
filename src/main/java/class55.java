import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class55 {
   static void method1560(int var0) {
      try {
         Class var1 = ClassLoader.class;
         Field var2 = var1.getDeclaredField("nativeLibraries");
         Class var3 = AccessibleObject.class;
         Method var4 = var3.getDeclaredMethod("setAccessible", Boolean.TYPE);
         var4.invoke(var2, Boolean.TRUE);
      } catch (Throwable var5) {
         ;
      }

   }

   static final boolean method1561(class684 var0, int var1) throws IOException {
      try {
         class348 var2 = var0.method4377(537308016);
         class513 var3 = var0.field7768;
         if (var2 == null) {
            return false;
         } else {
            int var5;
            if (var0.field7770 == null) {
               if (var0.field7772) {
                  if (!var2.method175(1, (byte)-44)) {
                     return false;
                  }

                  var2.method177(var0.field7768.field10375, 0, 1, (byte)1);
                  var0.field7776 += 655103753;
                  var0.field7773 = 0;
                  var0.field7772 = false;
               }

               var3.field10376 = 0;
               if (var3.method2645((byte)-78)) {
                  if (!var2.method175(1, (byte)-13)) {
                     return false;
                  }

                  var2.method177(var0.field7768.field10375, 1, 1, (byte)4);
                  var0.field7776 += 655103753;
                  var0.field7773 = 0;
               }

               var0.field7772 = true;
               class807[] var4 = class419.method5644(-1456212765);
               var5 = var3.method6382(250607366);
               if (var5 < 0 || var5 >= var4.length) {
                  throw new IOException(var5 + " " + 385051775 * var3.field10376);
               }

               var0.field7770 = var4[var5];
               var0.field7771 = var0.field7770.field4428 * -80186869;
            }

            if (-1 == -866602563 * var0.field7771) {
               if (!var2.method175(1, (byte)-5)) {
                  return false;
               }

               var2.method177(var3.field10375, 0, 1, (byte)48);
               var0.field7771 = (var3.field10375[0] & 255) * -1265692267;
               var0.field7776 += 655103753;
               var0.field7773 = 0;
            }

            if (-2 == -866602563 * var0.field7771) {
               if (!var2.method175(2, (byte)9)) {
                  return false;
               }

               var2.method177(var3.field10375, 0, 2, (byte)-84);
               var3.field10376 = 0;
               var0.field7771 = var3.method6374() * -1265692267;
               var0.field7776 += 1310207506;
               var0.field7773 = 0;
            }

            if (-866602563 * var0.field7771 > 0) {
               if (!var2.method175(-866602563 * var0.field7771, (byte)-53)) {
                  return false;
               }

               var3.field10376 = 0;
               var2.method177(var3.field10375, 0, -866602563 * var0.field7771, (byte)117);
               var0.field7776 += 1190279845 * var0.field7771;
               var0.field7773 = 0;
            }

            var0.field7783 = var0.field7780;
            var0.field7780 = var0.field7779;
            var0.field7779 = var0.field7770;
            if (var0.field7770 == class807.field4425) {
               Client.field2941 = var3.method6398(281504196);
               if (Client.field2941 == 0 || Client.field2941 == 1) {
                  Client.field2621 = true;
               }

               var0.field7770 = null;
               return true;
            } else {
               boolean var46;
               if (var0.field7770 == class807.field4525) {
                  Client.field2867 = 887090299 * Client.field2915;
                  var46 = var3.method6371() == 1;
                  class120 var136 = new class120(var3);
                  class420 var134;
                  if (var46) {
                     var134 = class640.field10201;
                  } else {
                     var134 = class823.field9045;
                  }

                  var136.method1500(var134, (byte)-89);
                  var0.field7770 = null;
                  return true;
               } else {
                  int var45;
                  if (var0.field7770 == class807.field4519) {
                     var45 = var3.method6374();
                     class321.method860(var45, (byte)1);
                     var0.field7770 = null;
                     return true;
                  } else {
                     String var7;
                     String var8;
                     String var9;
                     int var50;
                     if (class807.field4550 == var0.field7770) {
                        var45 = var3.method6382(1723054621);
                        var5 = var3.method6420((byte)32);
                        var50 = var3.method6371();
                        var7 = "";
                        var8 = var7;
                        if ((var50 & 1) != 0) {
                           var7 = var3.method6379(-803257696);
                           if ((var50 & 2) != 0) {
                              var8 = var3.method6379(1955180504);
                           } else {
                              var8 = var7;
                           }
                        }

                        var9 = var3.method6379(-149899401);
                        if (var45 == 99) {
                           class213.method3810(var9, 1055145979);
                        } else if (var45 == 98) {
                           class252.method4422(var9, 893713138);
                        } else {
                           if (!var8.equals("") && class923.method6260(var8, -1821123802)) {
                              var0.field7770 = null;
                              return true;
                           }

                           class702.method1969(var45, var5, var7, var8, var7, var9, -1468983571);
                        }

                        var0.field7770 = null;
                        return true;
                     } else if (var0.field7770 == class807.field4573) {
                        Client.field2827 = var3.method6367(2135181158) * 2043410797;
                        Client.field2870 = Client.field2915 * 1991119277;
                        var0.field7770 = null;
                        return true;
                     } else if (var0.field7770 == class807.field4567) {
                        var0.field7770 = null;
                        return false;
                     } else if (var0.field7770 == class807.field4444) {
                        var45 = var3.method6420((byte)40);
                        var5 = var3.method6420((byte)-19);
                        class958.method2057(1737716957);
                        class307.method388(var5, 2, var45, -1, 262144);
                        var0.field7770 = null;
                        return true;
                     } else if (class807.field4541 == var0.field7770) {
                        var45 = var3.method6420((byte)86);
                        var5 = var3.method6374();
                        var50 = var3.method6420((byte)9);
                        class958.method2057(1819553678);
                        class307.method388(var45, 3, var5, var50, 262144);
                        var0.field7770 = null;
                        return true;
                     } else if (var0.field7770 == class807.field4473) {
                        var45 = var3.method6420((byte)-41);
                        class285.field10627 = new class330(var45);
                        Thread var135 = new Thread(class285.field10627);
                        var135.setPriority(1);
                        var135.start();
                        var0.field7770 = null;
                        return true;
                     } else if (class807.field4534 == var0.field7770) {
                        var45 = var3.method6374();
                        var5 = var3.method6414(1375072280);
                        class958.method2057(1593058351);
                        class516.method2729(var5, var45, -683645841);
                        var0.field7770 = null;
                        return true;
                     } else if (var0.field7770 == class807.field4468) {
                        class166.field6896 = null;
                        var0.field7770 = null;
                        return true;
                     } else {
                        int var10;
                        int var11;
                        int var13;
                        int var15;
                        boolean var16;
                        int var17;
                        int var18;
                        int var20;
                        int var51;
                        int var54;
                        int var60;
                        class389 var77;
                        int var85;
                        int var91;
                        boolean var103;
                        if (var0.field7770 == class807.field4504) {
                           var45 = var3.method6374();
                           if (65535 == var45) {
                              var45 = -1;
                           }

                           var5 = var3.method6395(-1014855659);
                           var50 = var3.method6374();
                           var51 = var3.method6395(-1014855659);
                           var54 = var3.method6374();
                           var60 = var3.method6409(-1780969146);
                           var10 = var51 & 7;
                           var11 = var51 >> 3 & 15;
                           if (15 == var11) {
                              var11 = -1;
                           }

                           boolean var99 = (var51 >> 7 & 1) == 1;
                           int var100;
                           if (var60 >> 30 != 0) {
                              var77 = Client.field2697.method5270(681479919);
                              var85 = var60 >> 28 & 3;
                              var15 = (var60 >> 14 & 16383) - -1760580017 * var77.field1521;
                              var91 = (var60 & 16383) - 283514611 * var77.field1522;
                              if (var15 >= 0 && var91 >= 0 && var15 < Client.field2697.method5271(-1990296889) && var91 < Client.field2697.method5272(-1604198619)) {
                                 if (var45 == -1) {
                                    class178 var115 = (class178) Client.field2806.method2942((long)(var15 << 16 | var91));
                                    if (var115 != null) {
                                       var115.field5225.method3377((byte)12);
                                       var115.method545(-1460969981);
                                    }
                                 } else {
                                    var17 = 256 + var15 * 512;
                                    var18 = 256 + 512 * var91;
                                    var100 = var85;
                                    if (var85 < 3 && Client.field2697.method5296(651162634).method3386(var15, var91, -2025869337)) {
                                       var100 = var85 + 1;
                                    }

                                    class150 var104 = new class150(Client.field2697.method5317(-1611682495), var45, var50, var85, var100, var17, class679.method4271(var17, var18, var85, -1215922012) - var54, var18, var15, var15, var91, var91, var10, var99);
                                    Client.field2806.method2947(new class178(var104), (long)(var15 << 16 | var91));
                                 }
                              }
                           } else {
                              class745 var105;
                              class160 var111;
                              class160 var113;
                              if (var60 >> 29 != 0) {
                                 var13 = var60 & '\uffff';
                                 class437 var112 = (class437) Client.field2677.method2942((long)var13);
                                 if (var112 != null) {
                                    class60 var94 = (class60)var112.field7515;
                                    class932 var109 = var94.field4040[var5];
                                    if (var45 == 65535) {
                                       var45 = -1;
                                    }

                                    var103 = true;
                                    var18 = -967533709 * var109.field10341;
                                    if (-1 != var45 && var18 != -1) {
                                       if (var45 == var18) {
                                          var105 = class635.field9823.method1053(var45, -2138799623);
                                          if (var105.field4117 && -1 != var105.field4107 * 1505778629) {
                                             var111 = class936.field10313.method2256(var105.field4107 * 1505778629, (byte)-71);
                                             int var114 = var111.field6668 * -1117238071;
                                             if (var114 != 0 && 2 != var114) {
                                                if (var114 == 1) {
                                                   var103 = true;
                                                }
                                             } else {
                                                var103 = false;
                                             }
                                          }
                                       } else {
                                          var105 = class635.field9823.method1053(var45, -1997923010);
                                          class745 var110 = class635.field9823.method1053(var18, -1881939747);
                                          if (var105.field4107 * 1505778629 != -1 && var110.field4107 * 1505778629 != -1) {
                                             var113 = class936.field10313.method2256(var105.field4107 * 1505778629, (byte)83);
                                             class160 var120 = class936.field10313.method2256(1505778629 * var110.field4107, (byte)-25);
                                             if (-1445588039 * var113.field6662 < -1445588039 * var120.field6662) {
                                                var103 = false;
                                             }
                                          }
                                       }
                                    }

                                    if (var103) {
                                       var109.field10341 = 1313669563 * var45;
                                       var109.field10343 = var54 * 1755371497;
                                       var109.field10339 = var11 * 1533439965;
                                       if (-1 != var45) {
                                          var105 = class635.field9823.method1053(var45, -1696520605);
                                          var20 = var105.field4117 ? 0 : 2;
                                          if (var99) {
                                             var20 = 1;
                                          }

                                          var109.field10340.method2780(1505778629 * var105.field4107, var50, var20, false, (byte)0);
                                       } else {
                                          var109.field10340.method2777(-1, -1461567794);
                                       }
                                    }
                                 }
                              } else if (var60 >> 28 != 0) {
                                 var13 = var60 & '\uffff';
                                 class946 var116;
                                 if (var13 == -442628795 * Client.field2623) {
                                    var116 = class923.field10295;
                                 } else {
                                    var116 = Client.field2786[var13];
                                 }

                                 if (var116 != null) {
                                    class932 var101 = var116.field4040[var5];
                                    if (65535 == var45) {
                                       var45 = -1;
                                    }

                                    var16 = true;
                                    var17 = -967533709 * var101.field10341;
                                    class745 var106;
                                    if (var45 != -1 && -1 != var17) {
                                       if (var45 == var17) {
                                          var106 = class635.field9823.method1053(var45, -1990411818);
                                          if (var106.field4117 && var106.field4107 * 1505778629 != -1) {
                                             class160 var117 = class936.field10313.method2256(var106.field4107 * 1505778629, (byte)-15);
                                             var20 = -1117238071 * var117.field6668;
                                             if (var20 != 0 && 2 != var20) {
                                                if (var20 == 1) {
                                                   var16 = true;
                                                }
                                             } else {
                                                var16 = false;
                                             }
                                          }
                                       } else {
                                          var106 = class635.field9823.method1053(var45, -1975194771);
                                          var105 = class635.field9823.method1053(var17, -1893234855);
                                          if (-1 != var106.field4107 * 1505778629 && -1 != 1505778629 * var105.field4107) {
                                             var111 = class936.field10313.method2256(1505778629 * var106.field4107, (byte)-1);
                                             var113 = class936.field10313.method2256(var105.field4107 * 1505778629, (byte)-13);
                                             if (var111.field6662 * -1445588039 < -1445588039 * var113.field6662) {
                                                var16 = false;
                                             }
                                          }
                                       }
                                    }

                                    if (var16) {
                                       var101.field10341 = var45 * 1313669563;
                                       var101.field10343 = var54 * 1755371497;
                                       var101.field10339 = var11 * 1533439965;
                                       var101.field10342 = 1949040559 * var10;
                                       if (var45 != -1) {
                                          var106 = class635.field9823.method1053(var45, -2053481236);
                                          var100 = var106.field4117 ? 0 : 2;
                                          if (var99) {
                                             var100 = 1;
                                          }

                                          var101.field10340.method2780(1505778629 * var106.field4107, var50, var100, false, (byte)0);
                                       } else {
                                          var101.field10340.method2777(-1, -1498678101);
                                       }
                                    }
                                 }
                              }
                           }

                           var0.field7770 = null;
                           return true;
                        } else {
                           int var66;
                           if (class807.field4537 == var0.field7770) {
                              var45 = var3.method6410((byte)74);
                              var5 = var3.method6371();
                              var50 = var3.method6409(-1943559024);
                              var51 = var3.method6414(40948873);
                              var54 = var3.method6395(-1014855659);
                              var60 = var54 >> 2;
                              var10 = var54 & 3;
                              class389 var108 = new class389(var3.method6420((byte)-80));
                              var66 = var3.method6410((byte)67);
                              var13 = var3.method6374();
                              var85 = var3.method6420((byte)111);
                              var15 = var3.method6420((byte)20);
                              class958.method2057(1565654917);
                              class147.method1145(var66, new class687(var13, var5, new class614(var108, var60, var10, var51)), new int[]{var15, var45, var50, var85}, false, 1266119011);
                              var0.field7770 = null;
                              return true;
                           } else if (class807.field4449 == var0.field7770) {
                              var45 = var3.method6403(1478539457);
                              class958.method2057(1731780028);
                              class131.method892(var45, 8113847);
                              var0.field7770 = null;
                              return true;
                           } else if (var0.field7770 == class807.field4489) {
                              class184.field5231 = class11.method3572(var3.method6371(), 413652738);
                              var0.field7770 = null;
                              return true;
                           } else {
                              String var86;
                              if (class807.field4474 == var0.field7770) {
                                 var86 = var3.method6379(-1190925173);
                                 var5 = var3.method6374();
                                 class958.method2057(1879133917);
                                 class936.method6279(var5, var86, -1961104888);
                                 var0.field7770 = null;
                                 return true;
                              } else if (class807.field4445 == var0.field7770) {
                                 class673.method4258(class307.field425, (short)-69);
                                 var0.field7770 = null;
                                 return true;
                              } else {
                                 byte var123;
                                 if (class807.field4524 == var0.field7770) {
                                    var45 = var3.method6403(1478539457);
                                    var123 = var3.method6407((byte)-42);
                                    class827.field9037.method5495(var45, var123, (byte)120);
                                    var0.field7770 = null;
                                    return true;
                                 } else if (var0.field7770 == class807.field4429) {
                                    class827.field9037.method5493(-1701505848);
                                    Client.field2764 += -612656928;
                                    var0.field7770 = null;
                                    return true;
                                 } else {
                                    String var6;
                                    boolean var47;
                                    boolean var62;
                                    String var68;
                                    if (class807.field4463 == var0.field7770) {
                                       var86 = var3.method6379(1959588541);
                                       var47 = var3.method6371() == 1;
                                       if (var47) {
                                          var6 = var3.method6379(1305622298);
                                       } else {
                                          var6 = var86;
                                       }

                                       var51 = var3.method6374();
                                       byte var119 = var3.method6372(-12558881);
                                       var62 = false;
                                       if (var119 == -128) {
                                          var62 = true;
                                       }

                                       if (var62) {
                                          if (-1801543887 * class556.field503 == 0) {
                                             var0.field7770 = null;
                                             return true;
                                          }

                                          boolean var102 = false;

                                          for(var11 = 0; var11 < class556.field503 * -1801543887; ++var11) {
                                             if (class776.field3731[var11].field8115.equals(var6) && class776.field3731[var11].field8117 * -1071570519 == var51) {
                                                if (var1 <= -1128197512) {
                                                   throw new IllegalStateException();
                                                }
                                                break;
                                             }
                                          }

                                          if (var11 < -1801543887 * class556.field503) {
                                             while(var11 < -1801543887 * class556.field503 - 1) {
                                                class776.field3731[var11] = class776.field3731[1 + var11];
                                                ++var11;
                                             }

                                             class556.field503 -= -1649911343;
                                             class776.field3731[class556.field503 * -1801543887] = null;
                                          }
                                       } else {
                                          var68 = var3.method6379(-1357066804);
                                          class255 var107 = new class255();
                                          var107.field8114 = var86;
                                          var107.field8115 = var6;
                                          var107.field8116 = class526.method2229(var107.field8115, -514633017);
                                          var107.field8117 = var51 * -129166695;
                                          var107.field8119 = var119;
                                          var107.field8118 = var68;

                                          for(var66 = -1801543887 * class556.field503 - 1; var66 >= 0; --var66) {
                                             var13 = class776.field3731[var66].field8116.compareTo(var107.field8116);
                                             if (var13 == 0) {
                                                class776.field3731[var66].field8117 = -129166695 * var51;
                                                class776.field3731[var66].field8119 = var119;
                                                class776.field3731[var66].field8118 = var68;
                                                if (var6.equals(class923.field10295.field3374)) {
                                                   class526.field3667 = var119;
                                                }

                                                Client.field2894 = Client.field2915 * 1348241137;
                                                var0.field7770 = null;
                                                return true;
                                             }

                                             if (var13 < 0) {
                                                if (var1 <= -1128197512) {
                                                   throw new IllegalStateException();
                                                }
                                                break;
                                             }
                                          }

                                          if (-1801543887 * class556.field503 >= class776.field3731.length) {
                                             var0.field7770 = null;
                                             return true;
                                          }

                                          for(var13 = -1801543887 * class556.field503 - 1; var13 > var66; --var13) {
                                             class776.field3731[var13 + 1] = class776.field3731[var13];
                                          }

                                          if (class556.field503 * -1801543887 == 0) {
                                             class776.field3731 = new class255[100];
                                          }

                                          class776.field3731[1 + var66] = var107;
                                          class556.field503 += -1649911343;
                                          if (var6.equals(class923.field10295.field3374)) {
                                             class526.field3667 = var119;
                                          }
                                       }

                                       Client.field2894 = Client.field2915 * 1348241137;
                                       var0.field7770 = null;
                                       return true;
                                    } else if (class807.field4555 == var0.field7770) {
                                       Client.field2650 = var3.method6374();
                                       if (Client.field2650 == 65535) {
                                          Client.field2650 = -1;
                                       }

                                       Client.field2870 = Client.field2915 * 1991119277;
                                       var0.field7770 = null;
                                       return true;
                                    } else if (var0.field7770 == class807.field4509) {
                                       Client.field2868 = -1469951735 * Client.field2915;
                                       var46 = var3.method6371() == 1;
                                       if (var0.field7771 * -866602563 == 1) {
                                          if (var46) {
                                             class507.field4015 = null;
                                          } else {
                                             class509.field4024 = null;
                                          }

                                          var0.field7770 = null;
                                          return true;
                                       } else {
                                          if (var46) {
                                             class507.field4015 = new class139(var3);
                                          } else {
                                             class509.field4024 = new class139(var3);
                                          }

                                          var0.field7770 = null;
                                          return true;
                                       }
                                    } else if (class807.field4501 == var0.field7770) {
                                       var45 = var3.method6395(-1014855659);
                                       var5 = var3.method6374();
                                       class958.method2057(1741117485);
                                       class166.method3682(var5, var45, true, 2135177684);
                                       var0.field7770 = null;
                                       return true;
                                    } else if (class807.field4447 == var0.field7770) {
                                       var45 = var3.method6374();
                                       if (65535 == var45) {
                                          var45 = -1;
                                       }

                                       var5 = var3.method6371();
                                       var50 = var3.method6374();
                                       var51 = var3.method6371();
                                       var54 = var3.method6374();
                                       class671.method4237(var45, var5, var50, var51, false, var54, 1571464629);
                                       var0.field7770 = null;
                                       return true;
                                    } else if (class807.field4571 == var0.field7770) {
                                       var45 = var3.method6410((byte)25);
                                       var47 = var3.method6395(-1014855659) == 1;
                                       if (var47 != class904.field10357 || var45 != class495.field8097 * -1537941929) {
                                          class904.field10357 = var47;
                                          class495.field8097 = var45 * -442700441;
                                          class574.method131(class112.field2120, -1, -1, -387034642);
                                       }

                                       var0.field7770 = null;
                                       return true;
                                    } else if (class807.field4528 == var0.field7770) {
                                       var45 = var3.method6414(1989852233);
                                       var5 = var3.method6414(1846064867);
                                       class958.method2057(1511078955);
                                       class307.method388(var5, 1, var45, -1, 262144);
                                       var0.field7770 = null;
                                       return true;
                                    } else if (var0.field7770 == class807.field4500) {
                                       var45 = var3.method6371();
                                       var5 = var3.method6423(1235052657);
                                       if (Client.field2652[var45] != null) {
                                          Client.field2652[var45].method4116(Client.field2697.method5317(-1611682495), -1127737066);
                                          Client.field2652[var45] = null;
                                       }

                                       if (var5 != -1) {
                                          Client.field2652[var45] = new class669(class593.field1623, var3, var5);
                                          Client.field2652[var45].method4115(Client.field2697.method5317(-1611682495), 2021897283);
                                       }

                                       var0.field7770 = null;
                                       return true;
                                    } else if (var0.field7770 == class807.field4440) {
                                       var3.field10376 += -1035394588;
                                       if (var3.method6392((byte)83)) {
                                          class849.method4782(var3, 385051775 * var3.field10376 - 28, (byte)2);
                                       }

                                       var0.field7770 = null;
                                       return true;
                                    } else if (var0.field7770 == class807.field4469) {
                                       class776.field3730 = -866602563 * var0.field7771 > 2 ? var3.method6379(-1124509361) : class814.field4728.method2927(class321.field1066, -875414210);
                                       Client.field2803 = (var0.field7771 * -866602563 > 0 ? var3.method6374() : -1) * 812630591;
                                       if (Client.field2803 * -1471730241 == 65535) {
                                          Client.field2803 = -812630591;
                                       }

                                       var0.field7770 = null;
                                       return true;
                                    } else if (class807.field4423 == var0.field7770) {
                                       var45 = var3.method6397((byte)93);
                                       var5 = var3.method6410((byte)110);
                                       var50 = var3.method6409(-1787792569);
                                       var51 = var3.method6414(-3791656);
                                       var54 = var3.method6374();
                                       var60 = var3.method6414(293159659);
                                       var10 = var3.method6420((byte)52);
                                       var11 = var3.method6401((byte)-85);
                                       class389 var90 = new class389(var3.method6420((byte)122));
                                       class958.method2057(1648370068);
                                       class147.method1145(var50, new class318(var11, var45, new class878(var90, var54)), new int[]{var51, var5, var10, var60}, false, 518456835);
                                       var0.field7770 = null;
                                       return true;
                                    } else {
                                       long var23;
                                       long var25;
                                       long var27;
                                       String var48;
                                       boolean var72;
                                       String var95;
                                       class146 var96;
                                       if (class807.field4416 == var0.field7770) {
                                          var46 = var3.method6371() == 1;
                                          var48 = var3.method6379(1064239302);
                                          var23 = (long)var3.method6374();
                                          var25 = (long)var3.method6390((byte)-89);
                                          var10 = var3.method6371();
                                          var27 = (var23 << 32) + var25;
                                          var72 = false;
                                          var96 = null;
                                          class139 var89 = var46 ? class507.field4015 : class509.field4024;
                                          if (var89 == null) {
                                             var72 = true;
                                          } else {
                                             label2700: {
                                                for(var91 = 0; var91 < 100; ++var91) {
                                                   if (Client.field2897[var91] == var27) {
                                                      var72 = true;
                                                      break label2700;
                                                   }
                                                }

                                                if (var10 <= 1) {
                                                   if ((!Client.field2792 || Client.field2793) && !Client.field2783) {
                                                      if (class923.method6260(var48, -1430081758)) {
                                                         var72 = true;
                                                      }
                                                   } else {
                                                      var72 = true;
                                                   }
                                                }
                                             }
                                          }

                                          if (!var72) {
                                             Client.field2897[1594173071 * Client.field2898] = var27;
                                             Client.field2898 = (1 + 1594173071 * Client.field2898) % 100 * 1356544111;
                                             var95 = class794.method467(class631.method5862(var3, 406823150), 298199531);
                                             var17 = var46 ? 41 : 44;
                                             if (2 != var10 && var10 != 3) {
                                                if (var10 == 1) {
                                                   class684.method4383(var17, 0, class341.method255(0, -278777595) + var48, class341.method255(0, -278777595) + var48, var48, var95, var89.field1164, -1, 1446000206);
                                                } else {
                                                   class684.method4383(var17, 0, var48, var48, var48, var95, var89.field1164, -1, 1446000206);
                                                }
                                             } else {
                                                class684.method4383(var17, 0, class341.method255(1, -278777595) + var48, class341.method255(1, -278777595) + var48, var48, var95, var89.field1164, -1, 1446000206);
                                             }
                                          }

                                          var0.field7770 = null;
                                          return true;
                                       } else {
                                          long var29;
                                          class725 var71;
                                          class725 var82;
                                          if (class807.field4453 == var0.field7770) {
                                             var45 = var3.method6410((byte)86);
                                             var5 = var3.method6420((byte)-5);
                                             var50 = var3.method6402(62274819);
                                             if (65535 == var50) {
                                                var50 = -1;
                                             }

                                             var51 = var3.method6401((byte)37);
                                             if (var51 == 65535) {
                                                var51 = -1;
                                             }

                                             class958.method2057(1722846425);

                                             for(var54 = var50; var54 <= var51; ++var54) {
                                                var29 = (long)var54 + ((long)var5 << 32);
                                                var82 = (class725) Client.field2878.method2942(var29);
                                                if (var82 == null) {
                                                   if (-1 == var54) {
                                                      var71 = new class725(var45, class449.method3756(var5, (byte)-34).field944.field2557 * -1133219011);
                                                   } else {
                                                      var71 = new class725(var45, -1);
                                                   }
                                                } else {
                                                   var71 = new class725(var45, -1133219011 * var82.field2557);
                                                   var82.method545(-1460969981);
                                                }

                                                Client.field2878.method2947(var71, var29);
                                             }

                                             var0.field7770 = null;
                                             return true;
                                          } else if (var0.field7770 == class807.field4443) {
                                             var86 = var3.method6379(1989805088);
                                             var5 = var3.method6374();
                                             var6 = class906.field10363.method2713(var5, (short)-5033).method6651(var3, -734708119);
                                             class684.method4383(19, 0, var86, var86, var86, var6, (String)null, var5, 1446000206);
                                             var0.field7770 = null;
                                             return true;
                                          } else if (class807.field4487 == var0.field7770) {
                                             var45 = var3.method6414(-337455761);
                                             class958.method2057(1843920927);
                                             if (var45 == -1) {
                                                class495.field8099 = 178575833;
                                                class516.field4332 = -1001372047;
                                             } else {
                                                class389 var133 = Client.field2697.method5270(681479919);
                                                var50 = var45 >> 14 & 16383;
                                                var51 = var45 & 16383;
                                                var50 -= -1760580017 * var133.field1521;
                                                if (var50 < 0) {
                                                   var50 = 0;
                                                } else if (var50 >= Client.field2697.method5271(-2076483330)) {
                                                   var50 = Client.field2697.method5271(-1922242399);
                                                }

                                                var51 -= 283514611 * var133.field1522;
                                                if (var51 < 0) {
                                                   var51 = 0;
                                                } else if (var51 >= Client.field2697.method5272(-1784447321)) {
                                                   var51 = Client.field2697.method5272(232319200);
                                                }

                                                class495.field8099 = -178575833 * ((var50 << 9) + 256);
                                                class516.field4332 = 1001372047 * (256 + (var51 << 9));
                                             }

                                             var0.field7770 = null;
                                             return true;
                                          } else if (var0.field7770 == class807.field4499) {
                                             var45 = var3.method6414(731981095);
                                             var5 = var3.method6402(692000052);
                                             class827.field9037.method5492(var5, var45, 1330896239);
                                             var0.field7770 = null;
                                             return true;
                                          } else if (var0.field7770 == class807.field4538) {
                                             var45 = var3.method6414(-148644153);
                                             var5 = var3.method6401((byte)-123);
                                             var50 = var3.method6403(1478539457);
                                             class958.method2057(2059368260);
                                             class721.method2155(var45, var5 + (var50 << 16), -1655835904);
                                             var0.field7770 = null;
                                             return true;
                                          } else if (var0.field7770 == class807.field4456) {
                                             class673.method4258(class307.field432, (short)16643);
                                             var0.field7770 = null;
                                             return true;
                                          } else if (var0.field7770 == class807.field4490) {
                                             var45 = var3.method6420((byte)57);
                                             var5 = var3.method6396((short)-14009);
                                             var50 = var5 >> 2;
                                             var51 = var5 & 3;
                                             var54 = Client.field2720[var50];
                                             var60 = var3.method6409(-1783512122);
                                             var10 = var60 >> 28 & 3;
                                             var11 = var60 >> 14 & 16383;
                                             var66 = var60 & 16383;
                                             var77 = Client.field2697.method5270(681479919);
                                             var11 -= -1760580017 * var77.field1521;
                                             var66 -= 283514611 * var77.field1522;
                                             class814.method2933(var10, var11, var66, var54, var50, var51, var45, -1216383524);
                                             var0.field7770 = null;
                                             return true;
                                          } else {
                                             boolean var65;
                                             String var81;
                                             if (class807.field4520 == var0.field7770) {
                                                var45 = var3.method6374();
                                                class946 var132;
                                                if (-442628795 * Client.field2623 == var45) {
                                                   var132 = class923.field10295;
                                                } else {
                                                   var132 = Client.field2786[var45];
                                                }

                                                if (var132 == null) {
                                                   var0.field7770 = null;
                                                   return true;
                                                } else {
                                                   var50 = var3.method6374();
                                                   var51 = var3.method6371();
                                                   var65 = (var50 & '耀') != 0;
                                                   if (var132.field3374 != null && var132.field3388 != null) {
                                                      var62 = false;
                                                      if (var51 != 2) {
                                                         if (var65 || (!Client.field2792 || Client.field2793) && !Client.field2783) {
                                                            if (class923.method6260(var132.field3374, -1965589466)) {
                                                               var62 = true;
                                                            }
                                                         } else {
                                                            var62 = true;
                                                         }
                                                      }

                                                      if (!var62) {
                                                         var10 = -1;
                                                         if (var65) {
                                                            var50 &= 32767;
                                                            class24 var78 = class692.method3776(var3, (byte)25);
                                                            var10 = -2034569943 * var78.field6482;
                                                            var81 = var78.field6483.method6651(var3, -734708119);
                                                         } else {
                                                            var81 = class794.method467(class631.method5862(var3, -1331458039), -446542687);
                                                         }

                                                         var132.method1997(var81.trim(), var50 >> 8, var50 & 255, 1232670584);
                                                         var66 = var65 ? 17 : 2;
                                                         class684.method4383(var66, 0, var132.method1993(true, -1755073777), var132.method1998(false, (byte)-103), var132.field3379, var81, (String)null, var10, 1446000206);
                                                      }
                                                   }

                                                   var0.field7770 = null;
                                                   return true;
                                                }
                                             } else {
                                                byte[] var52;
                                                if (var0.field7770 == class807.field4562) {
                                                   if (class53.field2311 && class296.field10468 != null) {
                                                      class739.method1795(class615.field8903.field9109.method6159((byte)92), -1, -1, false, 1686359227);
                                                   }

                                                   var52 = new byte[var0.field7771 * -866602563];
                                                   var3.method2646(var52, 0, -866602563 * var0.field7771, (byte)1);
                                                   var48 = class783.method2497(var52, 0, var0.field7771 * -866602563, 1174912789);
                                                   var6 = "opensn";
                                                   if (!Client.field2616 || !class948.method1939(var48, 1, var6, -2024310199)) {
                                                      class529.method2213(var48, true, class615.field8903.field9137.method3689(-446024577) == 5, var6, Client.field2849, Client.field2632, -1865929375);
                                                   }

                                                   var0.field7770 = null;
                                                   return true;
                                                } else if (var0.field7770 == class807.field4517) {
                                                   var45 = var3.method6410((byte)94);
                                                   var5 = var3.method6420((byte)-79);
                                                   class958.method2057(1691449694);
                                                   class563.method862(var5, var45, (byte)-84);
                                                   var0.field7770 = null;
                                                   return true;
                                                } else if (class807.field4441 == var0.field7770) {
                                                   class559.method475(var3.method6379(-1156862569), 2117221193);
                                                   var0.field7770 = null;
                                                   return true;
                                                } else if (var0.field7770 == class807.field4526) {
                                                   var45 = var3.method6410((byte)86);
                                                   var5 = var3.method6371();
                                                   class958.method2057(1919173680);
                                                   class812.method2917(var45, var5, -109953213);
                                                   var0.field7770 = null;
                                                   return true;
                                                } else if (var0.field7770 == class807.field4424) {
                                                   var46 = var3.method6371() == 1;
                                                   byte[] var131 = new byte[-866602563 * var0.field7771 - 1];
                                                   var3.method6381(var131, 0, -866602563 * var0.field7771 - 1, -953523806);
                                                   class490.method4433(var46, var131, 1637029392);
                                                   var0.field7770 = null;
                                                   return true;
                                                } else if (var0.field7770 == class807.field4427) {
                                                   var45 = var3.method6374();
                                                   var5 = var3.method6420((byte)-24);
                                                   var50 = var3.method6410((byte)113);
                                                   var51 = var3.method6414(1955887955);
                                                   var54 = var3.method6371();
                                                   var60 = var3.method6414(1660153737);
                                                   var10 = var3.method6410((byte)4);
                                                   class958.method2057(1799178442);
                                                   class147.method1145(var51, new class256(var45, var54), new int[]{var5, var50, var10, var60}, false, -37609880);
                                                   var0.field7770 = null;
                                                   return true;
                                                } else if (var0.field7770 == class807.field4533) {
                                                   var86 = var3.method6379(1468234041);
                                                   Object[] var130 = new Object[var86.length() + 1];

                                                   for(var50 = var86.length() - 1; var50 >= 0; --var50) {
                                                      if (var86.charAt(var50) == 's') {
                                                         var130[var50 + 1] = var3.method6379(1977322513);
                                                      } else {
                                                         var130[var50 + 1] = new Integer(var3.method6420((byte)-5));
                                                      }
                                                   }

                                                   var130[0] = new Integer(var3.method6420((byte)18));
                                                   class958.method2057(1722404314);
                                                   class202 var127 = new class202();
                                                   var127.field7583 = var130;
                                                   class346 var122 = class82.method915(((Integer)var130[0]).intValue(), (byte)1);
                                                   class408.method5470(var127, (byte)58);
                                                   var0.field7770 = null;
                                                   return true;
                                                } else {
                                                   class513 var55;
                                                   if (class807.field4455 == var0.field7770) {
                                                      var55 = new class513(var0.field7771 * -866602563);
                                                      System.arraycopy(var0.field7768.field10375, 385051775 * var0.field7768.field10376, var55.field10375, 0, -866602563 * var0.field7771);
                                                      class131.method896(1536628978);
                                                      if (class615.field8903.field9146.method3999((byte)-123) == 1) {
                                                         class625.field9752.method464(new class406(class335.field45, var55), 1122139565);
                                                      } else {
                                                         Client.field2697.method5292(new class406(class335.field45, var55), -1991819579);
                                                      }

                                                      var0.field7770 = null;
                                                      return false;
                                                   } else if (var0.field7770 == class807.field4498) {
                                                      Client.field2868 = Client.field2915 * -1469951735;
                                                      var46 = var3.method6371() == 1;
                                                      class76 var128 = new class76(var3);
                                                      class139 var125;
                                                      if (var46) {
                                                         var125 = class507.field4015;
                                                      } else {
                                                         var125 = class509.field4024;
                                                      }

                                                      var128.method1108(var125, (byte)-33);
                                                      var0.field7770 = null;
                                                      return true;
                                                   } else if (class807.field4507 == var0.field7770) {
                                                      class82.method920(class881.field10184, (byte)110);
                                                      var0.field7770 = null;
                                                      return false;
                                                   } else if (var0.field7770 == class807.field4476) {
                                                      var45 = var3.method6409(-1822549301);
                                                      var47 = var3.method6397((byte)98) == 1;
                                                      class958.method2057(1548348256);
                                                      class811.method2925(var45, var47, -928914135);
                                                      var0.field7770 = null;
                                                      return true;
                                                   } else if (class807.field4438 == var0.field7770) {
                                                      Client.field2826 = var3.method6371() * -1985989501;
                                                      Client.field2870 = Client.field2915 * 1991119277;
                                                      var0.field7770 = null;
                                                      return true;
                                                   } else if (var0.field7770 == class807.field4532) {
                                                      var45 = var3.method6395(-1014855659);
                                                      var48 = var3.method6379(446512531);
                                                      var50 = var3.method6403(1478539457);
                                                      if (65535 == var50) {
                                                         var50 = -1;
                                                      }

                                                      var51 = var3.method6396((short)-24766);
                                                      if (var45 >= 1 && var45 <= 8) {
                                                         if (var48.equalsIgnoreCase("null")) {
                                                            var48 = null;
                                                         }

                                                         Client.field2801[var45 - 1] = var48;
                                                         Client.field2886[var45 - 1] = var50;
                                                         Client.field2802[var45 - 1] = var51 == 0;
                                                      }

                                                      var0.field7770 = null;
                                                      return true;
                                                   } else {
                                                      boolean var59;
                                                      if (var0.field7770 == class807.field4480) {
                                                         var45 = var3.method6374();
                                                         var5 = var3.method6371();
                                                         var59 = (var5 & 1) == 1;
                                                         class502.method1899(var45, var59, (byte)106);
                                                         var51 = var3.method6374();

                                                         for(var54 = 0; var54 < var51; ++var54) {
                                                            var60 = var3.method6403(1478539457);
                                                            var10 = var3.method6395(-1014855659);
                                                            if (var10 == 255) {
                                                               var10 = var3.method6414(-228125522);
                                                            }

                                                            class407.method5539(var45, var54, var60 - 1, var10, var59, 1471693915);
                                                         }

                                                         var54 = var3.method6374();
                                                         if (var54 != 0) {
                                                            class518.field4215 = new int[var54];
                                                            class518.field4216 = new int[var54];

                                                            for(var60 = 0; var60 < var54; ++var60) {
                                                               class518.field4215[var60] = var3.method6414(-228125522);
                                                               class518.field4216[var60] = var3.method6414(-228125522);
                                                            }
                                                         }

                                                         Client.field2804[(Client.field2855 += 1524000797) * 1610062389 - 1 & 31] = var45;
                                                         var0.field7770 = null;
                                                         return true;
                                                      } else if (class807.field4481 == var0.field7770) {
                                                         class166.field6896 = new Object[2143828057 * class899.field9551.field6890];
                                                         var0.field7770 = null;
                                                         return true;
                                                      } else if (var0.field7770 == class807.field4413) {
                                                         var45 = var3.method6395(-1014855659);
                                                         var5 = var3.method6371();
                                                         var50 = var3.method6396((short)-4149);
                                                         var51 = var3.method6371();
                                                         var54 = var3.method6402(-638464143) << 2;
                                                         class958.method2057(1712816736);
                                                         class526.method2227(var50, var45, var54, var5, var51, (byte)92);
                                                         var0.field7770 = null;
                                                         return true;
                                                      } else {
                                                         long var31;
                                                         if (class807.field4518 == var0.field7770) {
                                                            var46 = var3.method6371() == 1;
                                                            var48 = var3.method6379(1572587252);
                                                            var6 = var48;
                                                            if (var46) {
                                                               var6 = var3.method6379(-1158716165);
                                                            }

                                                            var31 = (long)var3.method6374();
                                                            var29 = (long)var3.method6390((byte)-47);
                                                            var11 = var3.method6371();
                                                            var66 = var3.method6374();
                                                            long var33 = var29 + (var31 << 32);
                                                            boolean var83 = false;
                                                            var91 = 0;

                                                            while(true) {
                                                               if (var91 >= 100) {
                                                                  if (var11 != 2 && class923.method6260(var6, -1912331316)) {
                                                                     var83 = true;
                                                                  }
                                                                  break;
                                                               }

                                                               if (Client.field2897[var91] == var33) {
                                                                  var83 = true;
                                                                  break;
                                                               }

                                                               ++var91;
                                                            }

                                                            if (!var83) {
                                                               Client.field2897[Client.field2898 * 1594173071] = var33;
                                                               Client.field2898 = 1356544111 * ((1594173071 * Client.field2898 + 1) % 100);
                                                               var95 = class906.field10363.method2713(var66, (short)-8978).method6651(var3, -734708119);
                                                               class684.method4383(18, 0, var48, var6, var48, var95, (String)null, var66, 1446000206);
                                                            }

                                                            var0.field7770 = null;
                                                            return true;
                                                         } else if (class807.field4523 == var0.field7770) {
                                                            var45 = var3.method6410((byte)45);
                                                            if (-821031539 * class379.field1140 != var45) {
                                                               class379.field1140 = -1704395451 * var45;
                                                               class574.method131(class112.field2118, -1, -1, 459954784);
                                                            }

                                                            var0.field7770 = null;
                                                            return true;
                                                         } else if (var0.field7770 == class807.field4557) {
                                                            var45 = var3.method6374();
                                                            var123 = var3.method6372(-12558881);
                                                            if (class166.field6896 == null) {
                                                               class166.field6896 = new Object[2143828057 * class899.field9551.field6890];
                                                            }

                                                            class166.field6896[var45] = new Integer(var123);
                                                            Client.field2862[(Client.field2863 += -1965237945) * -1653538697 - 1 & 31] = var45;
                                                            var0.field7770 = null;
                                                            return true;
                                                         } else if (class807.field4513 == var0.field7770) {
                                                            var45 = var3.method6402(1746070906);
                                                            if (65535 == var45) {
                                                               var45 = -1;
                                                            }

                                                            var5 = var3.method6402(351532240);
                                                            var50 = var3.method6409(-1871651695);
                                                            var51 = var3.method6402(866146486);
                                                            if (65535 == var51) {
                                                               var51 = -1;
                                                            }

                                                            class958.method2057(2138875176);

                                                            for(var54 = var45; var54 <= var51; ++var54) {
                                                               var29 = (long)var54 + ((long)var50 << 32);
                                                               var82 = (class725) Client.field2878.method2942(var29);
                                                               if (var82 == null) {
                                                                  if (var54 == -1) {
                                                                     var71 = new class725(class449.method3756(var50, (byte)-9).field944.field2563 * -1266165749, var5);
                                                                  } else {
                                                                     var71 = new class725(0, var5);
                                                                  }
                                                               } else {
                                                                  var71 = new class725(-1266165749 * var82.field2563, var5);
                                                                  var82.method545(-1460969981);
                                                               }

                                                               Client.field2878.method2947(var71, var29);
                                                            }

                                                            var0.field7770 = null;
                                                            return true;
                                                         } else if (class807.field4540 == var0.field7770) {
                                                            class420.field9722 = (var3.method6398(169252362) << 3) * 1536927433;
                                                            class509.field4023 = var3.method6371() * -1217120325;
                                                            class82.field1109 = (var3.method6398(-136295651) << 3) * 2091861441;

                                                            while(385051775 * var3.field10376 < var0.field7771 * -866602563) {
                                                               class307 var129 = class207.method3755((byte)-52)[var3.method6371()];
                                                               class673.method4258(var129, (short)-6953);
                                                            }

                                                            var0.field7770 = null;
                                                            return true;
                                                         } else if (var0.field7770 == class807.field4512) {
                                                            var45 = var3.method6371();
                                                            class245 var126 = (class245)class367.method1565(class539.method2340(-810032943), var45, (byte)2);
                                                            if (var126 == null) {
                                                               var126 = class245.field8536;
                                                            }

                                                            class890.method5555(var126, (byte)-10);
                                                            var0.field7770 = null;
                                                            return true;
                                                         } else if (class807.field4543 == var0.field7770) {
                                                            var45 = var3.method6371();
                                                            var5 = var3.method6403(1478539457);
                                                            if (var5 == 65535) {
                                                               var5 = -1;
                                                            }

                                                            var50 = var3.method6395(-1014855659);
                                                            class22.method3439(var5, var50, var45, 1756237267);
                                                            var0.field7770 = null;
                                                            return true;
                                                         } else if (class807.field4434 == var0.field7770) {
                                                            var45 = var3.method6395(-1014855659);
                                                            var5 = var3.method6395(-1014855659);
                                                            var50 = var3.method6395(-1014855659);
                                                            var51 = var3.method6395(-1014855659);
                                                            var54 = var3.method6401((byte)49);
                                                            class958.method2057(1754985057);
                                                            Client.field2665[var5] = true;
                                                            Client.field2842[var5] = var51;
                                                            Client.field2907[var5] = var50;
                                                            Client.field2908[var5] = var45;
                                                            Client.field2771[var5] = var54;
                                                            var0.field7770 = null;
                                                            return true;
                                                         } else if (class807.field4458 == var0.field7770) {
                                                            var45 = var3.method6371();
                                                            class162 var124 = (class162)class367.method1565(class1.method2986(-424264250), var45, (byte)2);
                                                            if (var124 == null) {
                                                               var124 = class162.field6600;
                                                            }

                                                            class784.method2476(var124, (byte)-102);
                                                            var0.field7770 = null;
                                                            return true;
                                                         } else if (class807.field4483 == var0.field7770) {
                                                            var46 = var3.method6371() == 1;
                                                            var48 = var3.method6379(416848386);
                                                            var6 = var48;
                                                            if (var46) {
                                                               var6 = var3.method6379(-151386453);
                                                            }

                                                            var31 = var3.method6375((short)2948);
                                                            var29 = (long)var3.method6374();
                                                            var27 = (long)var3.method6390((byte)50);
                                                            var13 = var3.method6371();
                                                            var85 = var3.method6374();
                                                            long var35 = (var29 << 32) + var27;
                                                            var103 = false;
                                                            var18 = 0;

                                                            while(true) {
                                                               if (var18 >= 100) {
                                                                  if (var13 != 2 && class923.method6260(var6, -1463632350)) {
                                                                     var103 = true;
                                                                  }
                                                                  break;
                                                               }

                                                               if (var35 == Client.field2897[var18]) {
                                                                  var103 = true;
                                                                  break;
                                                               }

                                                               ++var18;
                                                            }

                                                            if (!var103) {
                                                               Client.field2897[1594173071 * Client.field2898] = var35;
                                                               Client.field2898 = (Client.field2898 * 1594173071 + 1) % 100 * 1356544111;
                                                               String var98 = class906.field10363.method2713(var85, (short)-10826).method6651(var3, -734708119);
                                                               class684.method4383(20, 0, var48, var6, var48, var98, class405.method5478(var31), var85, 1446000206);
                                                            }

                                                            var0.field7770 = null;
                                                            return true;
                                                         } else if (var0.field7770 == class807.field4506) {
                                                            var46 = var3.method6371() == 1;
                                                            class958.method2057(1490036813);
                                                            class559.field545 = var46;
                                                            var0.field7770 = null;
                                                            return true;
                                                         } else {
                                                            boolean var14;
                                                            if (var0.field7770 == class807.field4415) {
                                                               while(var3.field10376 * 385051775 < var0.field7771 * -866602563) {
                                                                  var46 = var3.method6371() == 1;
                                                                  var48 = var3.method6379(1159315726);
                                                                  var6 = var3.method6379(1988455124);
                                                                  var51 = var3.method6374();
                                                                  var54 = var3.method6371();
                                                                  var62 = var3.method6371() == 1;
                                                                  var68 = "";
                                                                  boolean var75 = false;
                                                                  if (var51 > 0) {
                                                                     var68 = var3.method6379(1917634572);
                                                                     var75 = var3.method6371() == 1;
                                                                  }

                                                                  for(var66 = 0; var66 < Client.field2923 * -1054937867; ++var66) {
                                                                     if (!var46) {
                                                                        if (var48.equals(Client.field2685[var66])) {
                                                                           if (Client.field2928[var66] != var51) {
                                                                              var72 = true;

                                                                              for(var96 = (class146) Client.field2933.method5207(-16777216); var96 != null; var96 = (class146) Client.field2933.method5211(269965941)) {
                                                                                 if (var96.field1551.equals(var48)) {
                                                                                    if (var51 != 0 && var96.field1549 == 0) {
                                                                                       var96.method2028(185516853);
                                                                                       var72 = false;
                                                                                    } else if (var51 == 0 && var96.field1549 != 0) {
                                                                                       var96.method2028(1336201155);
                                                                                       var72 = false;
                                                                                    }
                                                                                 }
                                                                              }

                                                                              if (var72) {
                                                                                 Client.field2933.method5209(new class146(var48, var51), 1940667363);
                                                                              }

                                                                              Client.field2928[var66] = var51;
                                                                           }

                                                                           Client.field2927[var66] = var6;
                                                                           Client.field2929[var66] = var68;
                                                                           Client.field2686[var66] = var54;
                                                                           Client.field2703[var66] = var75;
                                                                           Client.field2932[var66] = var62;
                                                                           var48 = null;
                                                                           break;
                                                                        }
                                                                     } else if (var6.equals(Client.field2685[var66])) {
                                                                        Client.field2685[var66] = var48;
                                                                        Client.field2927[var66] = var6;
                                                                        var48 = null;
                                                                        break;
                                                                     }
                                                                  }

                                                                  if (var48 != null && Client.field2923 * -1054937867 < 200) {
                                                                     Client.field2685[-1054937867 * Client.field2923] = var48;
                                                                     Client.field2927[-1054937867 * Client.field2923] = var6;
                                                                     Client.field2928[-1054937867 * Client.field2923] = var51;
                                                                     Client.field2929[Client.field2923 * -1054937867] = var68;
                                                                     Client.field2686[-1054937867 * Client.field2923] = var54;
                                                                     Client.field2703[-1054937867 * Client.field2923] = var75;
                                                                     Client.field2932[Client.field2923 * -1054937867] = var62;
                                                                     Client.field2923 += 560029533;
                                                                  }
                                                               }

                                                               Client.field2924 = 1353701786;
                                                               Client.field2865 = 754377557 * Client.field2915;
                                                               var46 = false;
                                                               var5 = -1054937867 * Client.field2923;

                                                               while(var5 > 0) {
                                                                  var46 = true;
                                                                  --var5;

                                                                  for(var50 = 0; var50 < var5; ++var50) {
                                                                     boolean var93 = false;
                                                                     if (class601.field9203.field4347 * 1606920449 != Client.field2928[var50] && 1606920449 * class601.field9203.field4347 == Client.field2928[var50 + 1]) {
                                                                        var93 = true;
                                                                     }

                                                                     if (!var93 && Client.field2928[var50] == 0 && Client.field2928[var50 + 1] != 0) {
                                                                        var93 = true;
                                                                     }

                                                                     if (!var93 && !Client.field2932[var50] && Client.field2932[1 + var50]) {
                                                                        var93 = true;
                                                                     }

                                                                     if (var93) {
                                                                        var54 = Client.field2928[var50];
                                                                        Client.field2928[var50] = Client.field2928[var50 + 1];
                                                                        Client.field2928[1 + var50] = var54;
                                                                        var9 = Client.field2929[var50];
                                                                        Client.field2929[var50] = Client.field2929[var50 + 1];
                                                                        Client.field2929[1 + var50] = var9;
                                                                        var68 = Client.field2685[var50];
                                                                        Client.field2685[var50] = Client.field2685[var50 + 1];
                                                                        Client.field2685[1 + var50] = var68;
                                                                        var81 = Client.field2927[var50];
                                                                        Client.field2927[var50] = Client.field2927[1 + var50];
                                                                        Client.field2927[1 + var50] = var81;
                                                                        var66 = Client.field2686[var50];
                                                                        Client.field2686[var50] = Client.field2686[var50 + 1];
                                                                        Client.field2686[1 + var50] = var66;
                                                                        var72 = Client.field2703[var50];
                                                                        Client.field2703[var50] = Client.field2703[var50 + 1];
                                                                        Client.field2703[1 + var50] = var72;
                                                                        var14 = Client.field2932[var50];
                                                                        Client.field2932[var50] = Client.field2932[1 + var50];
                                                                        Client.field2932[1 + var50] = var14;
                                                                        var46 = false;
                                                                     }
                                                                  }

                                                                  if (var46) {
                                                                     if (var1 <= -1128197512) {
                                                                        throw new IllegalStateException();
                                                                     }
                                                                     break;
                                                                  }
                                                               }

                                                               var0.field7770 = null;
                                                               return true;
                                                            } else if (var0.field7770 == class807.field4547) {
                                                               Client.field2867 = 887090299 * Client.field2915;
                                                               var46 = var3.method6371() == 1;
                                                               if (-866602563 * var0.field7771 == 1) {
                                                                  if (var46) {
                                                                     class640.field10201 = null;
                                                                  } else {
                                                                     class823.field9045 = null;
                                                                  }

                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else {
                                                                  if (var46) {
                                                                     class640.field10201 = new class420(var3);
                                                                  } else {
                                                                     class823.field9045 = new class420(var3);
                                                                  }

                                                                  var0.field7770 = null;
                                                                  return true;
                                                               }
                                                            } else if (class807.field4466 == var0.field7770) {
                                                               class673.method4258(class307.field428, (short)-2213);
                                                               var0.field7770 = null;
                                                               return true;
                                                            } else if (var0.field7770 == class807.field4488) {
                                                               var45 = var3.method6395(-1014855659);
                                                               var5 = var3.method6395(-1014855659);
                                                               var50 = var3.method6371();
                                                               var51 = var3.method6374() << 2;
                                                               var54 = var3.method6371();
                                                               class958.method2057(1925493110);
                                                               class700.method6329(var54, var50, var51, var45, var5, true);
                                                               var0.field7770 = null;
                                                               return true;
                                                            } else if (class807.field4492 == var0.field7770) {
                                                               if (-1 != Client.field2822 * -257444687) {
                                                                  class929.method6262(Client.field2822 * -257444687, 0, 390245730);
                                                               }

                                                               var0.field7770 = null;
                                                               return true;
                                                            } else {
                                                               long var37;
                                                               if (class807.field4462 == var0.field7770) {
                                                                  var45 = var3.method6374();
                                                                  var37 = var3.method6375((short)19761);
                                                                  if (class166.field6896 == null) {
                                                                     class166.field6896 = new Object[class899.field9551.field6890 * 2143828057];
                                                                  }

                                                                  class166.field6896[var45] = new Long(var37);
                                                                  Client.field2862[(Client.field2863 += -1965237945) * -1653538697 - 1 & 31] = var45;
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4471 == var0.field7770) {
                                                                  var45 = var3.method6410((byte)20);
                                                                  var5 = var3.method6403(1478539457);
                                                                  var50 = var3.method6395(-1014855659);
                                                                  var51 = var3.method6420((byte)94);
                                                                  var54 = var3.method6403(1478539457);
                                                                  var60 = var3.method6409(-2033138780);
                                                                  var10 = var3.method6410((byte)114);
                                                                  var11 = var3.method6414(922208794);
                                                                  class958.method2057(1810781923);
                                                                  class147.method1145(var11, new class841(var54, var50, var5), new int[]{var45, var10, var60, var51}, false, 1697416272);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4503) {
                                                                  Client.field2895 = var3.method6397((byte)101) * -1777248765;
                                                                  Client.field2819 = var3.method6371() * 1583527743;
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4531 == var0.field7770) {
                                                                  var45 = var3.method6401((byte)10);
                                                                  var5 = var3.method6414(-104926142);
                                                                  var50 = var3.method6420((byte)74);
                                                                  class958.method2057(2137201192);
                                                                  class307.method388(var5, 5, var45, var50, 262144);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4505 == var0.field7770) {
                                                                  var45 = var3.method6374();
                                                                  var5 = var3.method6401((byte)-3);
                                                                  class958.method2057(2073286157);
                                                                  class198.method3752(var5, var45, 0, -1627127168);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4516) {
                                                                  var86 = var3.method6379(1394442545);
                                                                  var48 = class794.method467(class631.method5862(var3, 1133530682), 882285799);
                                                                  class702.method1969(6, 0, var86, var86, var86, var48, -109686251);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4563 == var0.field7770) {
                                                                  var45 = var3.method6395(-1014855659);
                                                                  var123 = var3.method6398(1558025285);
                                                                  class958.method2057(1545754039);
                                                                  class587.method164(var123, var45, (byte)59);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4477) {
                                                                  var45 = var3.method6402(-534917966);
                                                                  var5 = var3.method6420((byte)11);
                                                                  class958.method2057(2060055041);
                                                                  class839.method5406(var45, var5, 644551429);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4465 == var0.field7770) {
                                                                  var45 = var3.method6402(615970463);
                                                                  class958.method2057(2136468444);
                                                                  class56.method1546(var45, (byte)50);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4574 == var0.field7770) {
                                                                  var45 = var3.method6402(-1866261395);
                                                                  var5 = var3.method6396((short)-13502);
                                                                  class827.field9037.method5492(var45, var5, -580939812);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4448) {
                                                                  for(var45 = 0; var45 < Client.field2786.length; ++var45) {
                                                                     if (Client.field2786[var45] != null) {
                                                                        Client.field2786[var45].field4057 = null;
                                                                        Client.field2786[var45].field4042.method2777(-1, -1564622591);
                                                                     }
                                                                  }

                                                                  for(var45 = 0; var45 < Client.field2753 * 1962237353; ++var45) {
                                                                     ((class746) Client.field2797[var45].field7515).field4057 = null;
                                                                     ((class746) Client.field2797[var45].field7515).field4042.method2777(-1, -2064932982);
                                                                  }

                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4515) {
                                                                  var45 = var3.method6420((byte)69);
                                                                  var5 = var3.method6420((byte)-11);
                                                                  class958.method2057(1838306305);
                                                                  class256 var118 = (class256) Client.field2823.method2942((long)var45);
                                                                  class256 var84 = (class256) Client.field2823.method2942((long)var5);
                                                                  if (var84 != null) {
                                                                     class526.method2226(var84, var118 == null || var84.field8101 * -1617025021 != -1617025021 * var118.field8101, false, -113822480);
                                                                  }

                                                                  if (var118 != null) {
                                                                     var118.method545(-1460969981);
                                                                     Client.field2823.method2947(var118, (long)var5);
                                                                  }

                                                                  class564 var79 = class449.method3756(var45, (byte)-52);
                                                                  if (var79 != null) {
                                                                     class814.method2932(var79, 1086965599);
                                                                  }

                                                                  var79 = class449.method3756(var5, (byte)51);
                                                                  if (var79 != null) {
                                                                     class814.method2932(var79, -904794130);
                                                                     class948.method1938(class382.field1410[-440872681 * var79.field867 >>> 16], var79, true, 112223880);
                                                                  }

                                                                  if (Client.field2822 * -257444687 != -1) {
                                                                     class929.method6262(Client.field2822 * -257444687, 1, -167409895);
                                                                  }

                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4521) {
                                                                  class673.method4258(class307.field430, (short)15563);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4422 == var0.field7770) {
                                                                  var45 = var3.method6397((byte)61);
                                                                  var5 = var3.method6405((byte)8);
                                                                  var50 = var3.method6374();
                                                                  if (var50 == 65535) {
                                                                     var50 = -1;
                                                                  }

                                                                  class128.method1582(var50, var5, var45, -649427988);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4452) {
                                                                  var45 = var3.method6397((byte)107);
                                                                  var5 = var3.method6402(822482622);
                                                                  var50 = var3.method6409(-1743023788);
                                                                  var51 = var3.method6410((byte)50);
                                                                  var54 = var3.method6420((byte)-102);
                                                                  var60 = var3.method6420((byte)-25);
                                                                  class958.method2057(1900966840);
                                                                  if (2 == var45) {
                                                                     class547.method379((byte)84);
                                                                  }

                                                                  int[] var74 = new int[]{var51, var50, var60, var54};
                                                                  Client.field2822 = 1785861201 * var5;
                                                                  class342.method223(var5, var74, 1073572568);
                                                                  class161.method3551(false, (byte)8);
                                                                  class228.method4586(Client.field2822 * -257444687, var74, 278724032);

                                                                  for(var11 = 0; var11 < 113; ++var11) {
                                                                     Client.field2882[var11] = true;
                                                                  }

                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4439) {
                                                                  var45 = var3.method6374();
                                                                  if (65535 == var45) {
                                                                     var45 = -1;
                                                                  }

                                                                  var5 = var3.method6371();
                                                                  var50 = var3.method6374();
                                                                  var51 = var3.method6371();
                                                                  var54 = var3.method6374();
                                                                  class587.method167(var45, var5, var50, var51, var54, 1530382732);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4552) {
                                                                  var45 = var3.method6374();
                                                                  var5 = var3.method6371();

                                                                  for(var59 = (var5 & 1) == 1; 385051775 * var3.field10376 < var0.field7771 * -866602563; class407.method5539(var45, var51, var54 - 1, var60, var59, -540593777)) {
                                                                     var51 = var3.method6382(1723054621);
                                                                     var54 = var3.method6374();
                                                                     var60 = 0;
                                                                     if (var54 != 0) {
                                                                        var60 = var3.method6371();
                                                                        if (255 == var60) {
                                                                           var60 = var3.method6420((byte)3);
                                                                        }
                                                                     }
                                                                  }

                                                                  Client.field2804[(Client.field2855 += 1524000797) * 1610062389 - 1 & 31] = var45;
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4494) {
                                                                  var45 = var3.method6402(1639237229);
                                                                  var5 = var3.method6410((byte)111);
                                                                  class958.method2057(1587998629);
                                                                  class407.method5538(var5, var45, 1883543357);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4568 == var0.field7770) {
                                                                  byte var121 = var3.method6398(-112492447);
                                                                  var5 = var3.method6402(-40843211);
                                                                  class958.method2057(1542442248);
                                                                  class839.method5406(var5, var121, 644551429);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4514 == var0.field7770) {
                                                                  var45 = var3.method6420((byte)-66);
                                                                  class958.method2057(1629324419);
                                                                  class307.method388(var45, 5, Client.field2623 * -442628795, 0, 262144);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4419) {
                                                                  var45 = var3.method6396((short)-2884);
                                                                  class958.method2057(1810891735);
                                                                  Client.field2885 = var45 * -1149402483;
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4435) {
                                                                  var45 = var3.method6409(-1698291810);
                                                                  var5 = var3.method6402(-75929984);
                                                                  var50 = var3.method6402(-771680618);
                                                                  var51 = var3.method6401((byte)-100);
                                                                  class958.method2057(1819509217);
                                                                  class858.method5223(var45, var51, var5, var50, -1411433618);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4554 == var0.field7770) {
                                                                  var45 = var3.method6403(1478539457);
                                                                  var5 = var3.method6367(1694615298);
                                                                  var50 = var3.method6402(-1882102994);
                                                                  byte var76 = var3.method6398(1399907326);
                                                                  var54 = var3.method6395(-1014855659);
                                                                  if (var54 == 255) {
                                                                     var54 = -1;
                                                                  }

                                                                  var60 = var3.method6428(-1839915924);
                                                                  var10 = var3.method6374();
                                                                  var11 = var3.method6397((byte)14) * 4;
                                                                  var66 = var3.method6371();
                                                                  var13 = var3.method6402(-931118162);
                                                                  var85 = var3.method6397((byte)17);
                                                                  var15 = var3.method6402(-643251199);
                                                                  var91 = var3.method6374();
                                                                  byte var97 = var3.method6398(263654343);
                                                                  boolean var92 = (var66 & 1) != 0;
                                                                  boolean var19 = (var66 & 2) != 0;
                                                                  var20 = var19 ? var66 >> 2 : -1;
                                                                  if (var19) {
                                                                     var85 = (byte)var85;
                                                                  } else {
                                                                     var85 *= 4;
                                                                  }

                                                                  class389 var21 = Client.field2697.method5270(681479919);
                                                                  int var22 = var10 - var21.field1521 * 773807262;
                                                                  int var39 = var13 - 567029222 * var21.field1522;
                                                                  var51 = var76 + var22;
                                                                  var17 = var97 + var39;
                                                                  if (var22 >= 0 && var39 >= 0 && var22 < Client.field2697.method5271(-1911669738) * 2 && var39 < Client.field2697.method5271(-1992464171) * 2 && var51 >= 0 && var17 >= 0 && var51 < Client.field2697.method5272(-2022476058) * 2 && var17 < Client.field2697.method5272(1563119067) * 2 && 65535 != var45) {
                                                                     var22 *= 256;
                                                                     var39 *= 256;
                                                                     var51 *= 256;
                                                                     var17 *= 256;
                                                                     var85 <<= 2;
                                                                     var11 <<= 2;
                                                                     var50 <<= 2;
                                                                     class6.method2948(var45, var5, var60, var20, var85, var11, var22, var39, var51, var17, var91, var15, var54, var50, var92, 2141342802);
                                                                  }

                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4559 == var0.field7770) {
                                                                  class535.method2278((byte)-98);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4446 == var0.field7770) {
                                                                  var46 = var3.method6371() == 1;
                                                                  var48 = var3.method6379(-1519760350);
                                                                  var6 = var48;
                                                                  if (var46) {
                                                                     var6 = var3.method6379(1241788566);
                                                                  }

                                                                  var51 = var3.method6371();
                                                                  var65 = false;
                                                                  if (var51 != 2) {
                                                                     if ((!Client.field2792 || Client.field2793) && !Client.field2783) {
                                                                        if (var51 != 2 && class923.method6260(var6, -1379408074)) {
                                                                           var65 = true;
                                                                        }
                                                                     } else {
                                                                        var65 = true;
                                                                     }
                                                                  }

                                                                  if (!var65) {
                                                                     var9 = class794.method467(class631.method5862(var3, 1427185881), 1705296480);
                                                                     class684.method4383(24, 0, var48, var6, var48, var9, (String)null, -1, 1446000206);
                                                                  }

                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4464 == var0.field7770) {
                                                                  class4.method2964(false, -1542019143);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4536) {
                                                                  var45 = var3.method6410((byte)74);
                                                                  var5 = var3.method6414(-453095803);
                                                                  class958.method2057(1793904328);
                                                                  class942.method6334(var5, var45, -1060655592);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4431) {
                                                                  Client.field2924 = -1470632755;
                                                                  Client.field2865 = Client.field2915 * 754377557;
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4572) {
                                                                  class82.method920(false, (byte)107);
                                                                  var0.field7770 = null;
                                                                  return false;
                                                               } else if (class807.field4442 == var0.field7770) {
                                                                  var45 = var3.method6401((byte)-26);
                                                                  var5 = var3.method6414(716816642);
                                                                  var50 = var3.method6403(1478539457);
                                                                  var51 = var3.method6371();
                                                                  class958.method2057(1544492012);
                                                                  class229.method4585(var5, var51, var45, var50, (short)-8450);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4561 == var0.field7770) {
                                                                  Client.field2796 = var3.method6396((short)-6905) == 1;
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4485 == var0.field7770) {
                                                                  var45 = var3.method6374();
                                                                  var5 = var3.method6410((byte)112);
                                                                  var50 = var3.method6401((byte)-41);
                                                                  var51 = var3.method6395(-1014855659);
                                                                  class958.method2057(1863986418);
                                                                  class898.method5608(var5, var51, var50, var45, 1382023549);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4539 == var0.field7770) {
                                                                  class673.method4258(class307.field429, (short)18993);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4497 == var0.field7770) {
                                                                  var45 = var3.method6374();
                                                                  Client.field2707 = 733205975;
                                                                  Client.field2852 = 221729505 * var45;
                                                                  Client.field2705 = 986798515;
                                                                  class966.field2522.method3280(577335585 * Client.field2852, -457216440);
                                                                  class979.method1835(2025307040);
                                                                  class417.method5691((byte)74);
                                                                  var5 = var3.method6374();
                                                                  class345.field210 = new int[var5][4];

                                                                  for(var50 = 0; var50 < var5; ++var50) {
                                                                     for(var51 = 0; var51 < 4; ++var51) {
                                                                        class345.field210[var50][var51] = var3.method6420((byte)32);
                                                                     }
                                                                  }

                                                                  var50 = var3.method6371();
                                                                  class665.field9597 = new class907(var50);
                                                                  class665.field9597.method6425(var3.field10375, 385051775 * var3.field10376, var50, (short)-25177);
                                                                  var3.field10376 += var50 * 116413311;
                                                                  var0.field7770 = null;
                                                                  return false;
                                                               } else if (var0.field7770 == class807.field4544) {
                                                                  class673.method4258(class307.field423, (short)-19172);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4467 == var0.field7770) {
                                                                  var45 = var3.method6371();
                                                                  if (var3.method6371() == 0) {
                                                                     Client.field2902[var45] = new class285();
                                                                  } else {
                                                                     var3.field10376 -= 116413311;
                                                                     Client.field2902[var45] = new class285(var3);
                                                                  }

                                                                  Client.field2777 = Client.field2915 * 1729482221;
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4566) {
                                                                  var45 = var3.method6402(-666448295);
                                                                  if (65535 == var45) {
                                                                     var45 = -1;
                                                                  }

                                                                  var5 = var3.method6414(-731950816);
                                                                  var50 = var3.method6410((byte)47);
                                                                  class958.method2057(1742484303);
                                                                  class907.method6433(var50, var45, var5, (short)1020);
                                                                  class518 var67 = class85.field1121.method1566(var45);
                                                                  class858.method5223(var50, 330519029 * var67.field4231, -3355859 * var67.field4232, var67.field4230 * 1396167403, -1121225747);
                                                                  class962.method2131(var50, 252709809 * var67.field4234, -1811316489 * var67.field4235, var67.field4233 * -1368639199, 499708204);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4454 == var0.field7770) {
                                                                  var45 = var3.method6409(-2128346216);
                                                                  var5 = var3.method6403(1478539457);
                                                                  class958.method2057(2079015348);
                                                                  class143.method1177(var45, var5, (byte)-47);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4495 == var0.field7770) {
                                                                  class673.method4258(class307.field424, (short)9490);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4548 == var0.field7770) {
                                                                  class673.method4258(class307.field435, (short)18359);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4535) {
                                                                  var45 = var3.method6420((byte)-35);
                                                                  var5 = var3.method6410((byte)14);
                                                                  class958.method2057(1466518715);
                                                                  class220.method4046(var5, var45, -314450920);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4565) {
                                                                  var86 = var3.method6379(1645493685);
                                                                  class519.method2669(var86, false, false, 1722466628);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4432 == var0.field7770) {
                                                                  var86 = var3.method6379(-1785786498);
                                                                  var5 = var3.method6420((byte)115);
                                                                  class958.method2057(1866229286);
                                                                  class138.method995(var5, var86, (byte)66);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else {
                                                                  long var40;
                                                                  String var80;
                                                                  String var87;
                                                                  if (var0.field7770 == class807.field4530) {
                                                                     var46 = var3.method6371() == 1;
                                                                     var48 = var3.method6379(-247712899);
                                                                     var23 = (long)var3.method6374();
                                                                     var25 = (long)var3.method6390((byte)-13);
                                                                     var10 = var3.method6371();
                                                                     var11 = var3.method6374();
                                                                     var40 = (var23 << 32) + var25;
                                                                     var14 = false;
                                                                     var80 = null;
                                                                     class139 var88 = var46 ? class507.field4015 : class509.field4024;
                                                                     if (var88 == null) {
                                                                        var14 = true;
                                                                     } else {
                                                                        label2743: {
                                                                           for(var17 = 0; var17 < 100; ++var17) {
                                                                              if (var40 == Client.field2897[var17]) {
                                                                                 var14 = true;
                                                                                 break label2743;
                                                                              }
                                                                           }

                                                                           if (var10 != 2 && class923.method6260(var48, -1151281576)) {
                                                                              var14 = true;
                                                                           }
                                                                        }
                                                                     }

                                                                     if (!var14) {
                                                                        Client.field2897[1594173071 * Client.field2898] = var40;
                                                                        Client.field2898 = (1594173071 * Client.field2898 + 1) % 100 * 1356544111;
                                                                        var87 = class906.field10363.method2713(var11, (short)-926).method6651(var3, -734708119);
                                                                        var18 = var46 ? 42 : 45;
                                                                        class684.method4383(var18, 0, var48, var48, var48, var87, var88.field1164, var11, 1446000206);
                                                                     }

                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4437 == var0.field7770) {
                                                                     var46 = var3.method6371() == 1;
                                                                     var48 = var3.method6379(-862055008);
                                                                     var6 = var48;
                                                                     if (var46) {
                                                                        var6 = var3.method6379(-2118001006);
                                                                     }

                                                                     var51 = var3.method6371();
                                                                     var54 = var3.method6374();
                                                                     var62 = false;
                                                                     if (var51 <= 1 && class923.method6260(var6, -1454768672)) {
                                                                        var62 = true;
                                                                     }

                                                                     if (!var62) {
                                                                        var68 = class906.field10363.method2713(var54, (short)-11547).method6651(var3, -734708119);
                                                                        if (2 == var51) {
                                                                           class684.method4383(25, 0, class341.method255(1, -278777595) + var48, class341.method255(1, -278777595) + var6, var48, var68, (String)null, var54, 1446000206);
                                                                        } else if (1 == var51) {
                                                                           class684.method4383(25, 0, class341.method255(0, -278777595) + var48, class341.method255(0, -278777595) + var6, var48, var68, (String)null, var54, 1446000206);
                                                                        } else {
                                                                           class684.method4383(25, 0, var48, var6, var48, var68, (String)null, var54, 1446000206);
                                                                        }
                                                                     }

                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4493) {
                                                                     var45 = var3.method6374();
                                                                     if (var45 == 65535) {
                                                                        var45 = -1;
                                                                     }

                                                                     var5 = var3.method6371();
                                                                     var50 = var3.method6374();
                                                                     var51 = var3.method6371();
                                                                     class671.method4237(var45, var5, var50, var51, true, 256, 2006173434);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4569 == var0.field7770) {
                                                                     class673.method4258(class307.field434, (short)-5340);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4426) {
                                                                     var45 = var3.method6395(-1014855659);
                                                                     var5 = var3.method6395(-1014855659);
                                                                     if (var5 == 255) {
                                                                        var5 = -1;
                                                                        var45 = -1;
                                                                     }

                                                                     class964.method2133(var5, var45, 1367458334);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4522) {
                                                                     class673.method4258(class307.field422, (short)8251);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4496) {
                                                                     var45 = var3.method6420((byte)-19);
                                                                     var5 = var3.method6420((byte)-1);
                                                                     class701 var69 = class637.method5936(class643.field9935, var0.field7765, (byte)120);
                                                                     var69.field3364.method6415(914379507 * Client.field1807, (byte)1);
                                                                     var69.field3364.method6364(var45, 390381879);
                                                                     var69.field3364.method6368(var5, (byte)-42);
                                                                     var0.method4380(var69, (byte)-114);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4527 == var0.field7770) {
                                                                     var45 = var3.method6402(-529654569);
                                                                     var5 = var3.method6420((byte)18);
                                                                     var50 = var3.method6402(-680257970);
                                                                     var51 = var3.method6414(2002579136);
                                                                     var54 = var3.method6410((byte)1);
                                                                     var60 = var3.method6397((byte)98);
                                                                     var10 = var3.method6410((byte)63);
                                                                     var11 = var3.method6414(200309251);
                                                                     class958.method2057(1675842876);
                                                                     class147.method1145(var54, new class884(var50, var60, var45), new int[]{var5, var10, var51, var11}, false, -983354204);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4546 == var0.field7770) {
                                                                     class529.method2220(var3, var0.field7771 * -866602563, (byte)-111);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4417) {
                                                                     int[] var73 = new int[class458.method3829((byte)-31).length];

                                                                     for(var5 = 0; var5 < class458.method3829((byte)-48).length; ++var5) {
                                                                        var73[var5] = var3.method6420((byte)-69);
                                                                     }

                                                                     var5 = var3.method6371();
                                                                     var50 = var3.method6374();
                                                                     class437 var63 = (class437) Client.field2677.method2942((long)var50);
                                                                     if (var63 != null) {
                                                                        class488.method4740((class746)var63.field7515, var73, var5, true, (byte)-7);
                                                                     }

                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4484 == var0.field7770) {
                                                                     class82.field1109 = (var3.method6399(1269677513) << 3) * 2091861441;
                                                                     class509.field4023 = var3.method6397((byte)40) * -1217120325;
                                                                     class420.field9722 = (var3.method6398(188175247) << 3) * 1536927433;
                                                                     class389 var70 = Client.field2697.method5270(681479919);

                                                                     for(class508 var61 = (class508) Client.field2666.method2946(1564654282); var61 != null; var61 = (class508) Client.field2666.method2945((byte)10)) {
                                                                        var50 = (int)(var61.field641 * 7051297995265073167L >> 28 & 3L);
                                                                        var51 = (int)(7051297995265073167L * var61.field641 & 16383L);
                                                                        var54 = var51 - -1760580017 * var70.field1521;
                                                                        var60 = (int)(7051297995265073167L * var61.field641 >> 14 & 16383L);
                                                                        var10 = var60 - 283514611 * var70.field1522;
                                                                        if (var50 == class509.field4023 * -191892109 && var54 >= 134435705 * class420.field9722 && var54 < 8 + 134435705 * class420.field9722 && var10 >= -105526719 * class82.field1109 && var10 < 8 + class82.field1109 * -105526719) {
                                                                           var61.method545(-1460969981);
                                                                           if (var54 >= 0 && var10 >= 0 && var54 < Client.field2697.method5271(-2088487368) && var10 < Client.field2697.method5272(1377874440)) {
                                                                              class526.method2225(class509.field4023 * -191892109, var54, var10, 1641680263);
                                                                           }
                                                                        }
                                                                     }

                                                                     class563 var64;
                                                                     for(var64 = (class563)class563.field1071.method901(1766612795); var64 != null; var64 = (class563)class563.field1071.method906(49146)) {
                                                                        if (var64.field1069 * 634196087 >= 134435705 * class420.field9722 && 634196087 * var64.field1069 < 8 + 134435705 * class420.field9722 && -2146829167 * var64.field1074 >= -105526719 * class82.field1109 && -2146829167 * var64.field1074 < class82.field1109 * -105526719 + 8 && var64.field1070 * 2108312995 == -191892109 * class509.field4023) {
                                                                           var64.field1079 = true;
                                                                        }
                                                                     }

                                                                     for(var64 = (class563)class563.field1081.method901(1766612795); var64 != null; var64 = (class563)class563.field1081.method906(49146)) {
                                                                        if (634196087 * var64.field1069 >= 134435705 * class420.field9722 && 634196087 * var64.field1069 < class420.field9722 * 134435705 + 8 && var64.field1074 * -2146829167 >= -105526719 * class82.field1109 && var64.field1074 * -2146829167 < -105526719 * class82.field1109 + 8 && 2108312995 * var64.field1070 == -191892109 * class509.field4023) {
                                                                           var64.field1079 = true;
                                                                        }
                                                                     }

                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4486 == var0.field7770) {
                                                                     var45 = var3.method6374();
                                                                     var48 = var3.method6379(975296122);
                                                                     class958.method2057(1777124419);
                                                                     class936.method6279(var45, var48, -2125607456);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4545) {
                                                                     class958.method2057(1929183255);
                                                                     class974.method1783(-1060675118);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4491) {
                                                                     var45 = var3.method6374();
                                                                     var5 = var3.method6374();
                                                                     var50 = var3.method6374();
                                                                     class958.method2057(1555900413);
                                                                     if (class382.field1410[var45] != null) {
                                                                        for(var51 = var5; var51 < var50; ++var51) {
                                                                           var54 = var3.method6390((byte)-1);
                                                                           if (var51 < class382.field1410[var45].field1103.length && class382.field1410[var45].field1103[var51] != null) {
                                                                              class382.field1410[var45].field1103[var51].field866 = var54 * -177949397;
                                                                           }
                                                                        }
                                                                     }

                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4461 == var0.field7770) {
                                                                     class58.method1567(var3.method6371() == 1);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4460 == var0.field7770) {
                                                                     class82.field1109 = (var3.method6407((byte)-8) << 3) * 2091861441;
                                                                     class509.field4023 = var3.method6396((short)-28965) * -1217120325;
                                                                     class420.field9722 = (var3.method6399(-1150117384) << 3) * 1536927433;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4451) {
                                                                     var45 = var3.method6374();
                                                                     var5 = var3.method6420((byte)-116);
                                                                     if (class166.field6896 == null) {
                                                                        class166.field6896 = new Object[class899.field9551.field6890 * 2143828057];
                                                                     }

                                                                     class166.field6896[var45] = new Integer(var5);
                                                                     Client.field2862[(Client.field2863 += -1965237945) * -1653538697 - 1 & 31] = var45;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4421 == var0.field7770) {
                                                                     var45 = var3.method6374();
                                                                     var48 = var3.method6379(-2100646019);
                                                                     var59 = var3.method6371() == 1;
                                                                     class601.field9196 = class601.field9203;
                                                                     class601.field9197 = var59;
                                                                     class381.method1064(var45, var48, 955770805);
                                                                     var7 = null;
                                                                     class967.method1750(13, 1140359625);
                                                                     var0.field7770 = null;
                                                                     return false;
                                                                  } else if (var0.field7770 == class807.field4560) {
                                                                     var45 = var3.method6397((byte)17);
                                                                     var5 = var3.method6420((byte)78);
                                                                     var50 = var5;
                                                                     var51 = var3.method6395(-1014855659);

                                                                     for(var54 = 0; var50 > 200000000; var50 -= 200000000) {
                                                                        ++var54;
                                                                     }

                                                                     Client.field2810[var45] = var50;
                                                                     Client.field2906[var45] = var51;
                                                                     Client.field2811[var45] = var54;
                                                                     Client.field2809[var45] = 1;
                                                                     var60 = class880.field10185[var45] - 1;

                                                                     for(var10 = 0; var10 < var60; ++var10) {
                                                                        if (var50 >= class880.field10186[var10]) {
                                                                           Client.field2809[var45] = 2 + var10;
                                                                        }
                                                                     }

                                                                     Client.field2815[(Client.field2857 += 1972492301) * -1048955195 - 1 & 31] = var45;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4508) {
                                                                     Client.field2894 = 1348241137 * Client.field2915;
                                                                     if (var0.field7771 * -866602563 == 0) {
                                                                        Client.field2785 = null;
                                                                        Client.field2901 = null;
                                                                        class556.field503 = 0;
                                                                        class776.field3731 = null;
                                                                        var0.field7770 = null;
                                                                        return true;
                                                                     } else {
                                                                        Client.field2901 = var3.method6379(2105595106);
                                                                        var46 = var3.method6371() == 1;
                                                                        if (var46) {
                                                                           var3.method6379(-124470201);
                                                                        }

                                                                        var37 = var3.method6375((short)6221);
                                                                        Client.field2785 = class969.method1693(var37);
                                                                        class314.field501 = var3.method6372(-12558881);
                                                                        var51 = var3.method6371();
                                                                        if (255 == var51) {
                                                                           var0.field7770 = null;
                                                                           return true;
                                                                        } else {
                                                                           class556.field503 = -1649911343 * var51;
                                                                           class255[] var58 = new class255[100];

                                                                           for(var60 = 0; var60 < class556.field503 * -1801543887; ++var60) {
                                                                              var58[var60] = new class255();
                                                                              var58[var60].field8114 = var3.method6379(403996572);
                                                                              var46 = var3.method6371() == 1;
                                                                              if (var46) {
                                                                                 var58[var60].field8115 = var3.method6379(1553463180);
                                                                              } else {
                                                                                 var58[var60].field8115 = var58[var60].field8114;
                                                                              }

                                                                              var58[var60].field8116 = class526.method2229(var58[var60].field8115, 445649895);
                                                                              var58[var60].field8117 = var3.method6374() * -129166695;
                                                                              var58[var60].field8119 = var3.method6372(-12558881);
                                                                              var58[var60].field8118 = var3.method6379(-1930467617);
                                                                              if (var58[var60].field8115.equals(class923.field10295.field3374)) {
                                                                                 class526.field3667 = var58[var60].field8119;
                                                                              }
                                                                           }

                                                                           var62 = false;
                                                                           var10 = class556.field503 * -1801543887;

                                                                           while(var10 > 0) {
                                                                              var62 = true;
                                                                              --var10;

                                                                              for(var11 = 0; var11 < var10; ++var11) {
                                                                                 if (var58[var11].field8116.compareTo(var58[1 + var11].field8116) > 0) {
                                                                                    class255 var12 = var58[var11];
                                                                                    var58[var11] = var58[1 + var11];
                                                                                    var58[1 + var11] = var12;
                                                                                    var62 = false;
                                                                                 }
                                                                              }

                                                                              if (var62) {
                                                                                 if (var1 <= -1128197512) {
                                                                                    throw new IllegalStateException();
                                                                                 }
                                                                                 break;
                                                                              }
                                                                           }

                                                                           class776.field3731 = var58;
                                                                           var0.field7770 = null;
                                                                           return true;
                                                                        }
                                                                     }
                                                                  } else if (var0.field7770 == class807.field4478) {
                                                                     class4.method2964(true, -1463103982);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4459) {
                                                                     class958.method2057(1464854077);
                                                                     class770.method2304(-2144902476);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4564) {
                                                                     var45 = var3.method6371();
                                                                     var5 = var45 >> 5;
                                                                     var50 = var45 & 31;
                                                                     if (var50 == 0) {
                                                                        Client.field2851[var5] = null;
                                                                        var0.field7770 = null;
                                                                        return true;
                                                                     } else {
                                                                        class921 var53 = new class921();
                                                                        var53.field10287 = 1231457277 * var50;
                                                                        var53.field10279 = var3.method6371() * -1078964265;
                                                                        if (var53.field10279 * -92466201 >= 0 && var53.field10279 * -92466201 < class634.field9790.length) {
                                                                           if (var53.field10287 * 958933333 != 1 && 10 != var53.field10287 * 958933333) {
                                                                              if (var53.field10287 * 958933333 >= 2 && var53.field10287 * 958933333 <= 6) {
                                                                                 if (958933333 * var53.field10287 == 2) {
                                                                                    var53.field10281 = 1513435904;
                                                                                    var53.field10282 = -1303452928;
                                                                                 }

                                                                                 if (3 == 958933333 * var53.field10287) {
                                                                                    var53.field10281 = 0;
                                                                                    var53.field10282 = -1303452928;
                                                                                 }

                                                                                 if (958933333 * var53.field10287 == 4) {
                                                                                    var53.field10281 = -1268095488;
                                                                                    var53.field10282 = -1303452928;
                                                                                 }

                                                                                 if (5 == 958933333 * var53.field10287) {
                                                                                    var53.field10281 = 1513435904;
                                                                                    var53.field10282 = 0;
                                                                                 }

                                                                                 if (var53.field10287 * 958933333 == 6) {
                                                                                    var53.field10281 = 1513435904;
                                                                                    var53.field10282 = 1688061440;
                                                                                 }

                                                                                 var53.field10287 = -1832052742;
                                                                                 var53.field10280 = var3.method6371() * -1962848411;
                                                                                 class389 var56 = Client.field2697.method5270(681479919);
                                                                                 var53.field10281 += (var3.method6374() - -1760580017 * var56.field1521 << 9) * 962213171;
                                                                                 var53.field10282 += (var3.method6374() - var56.field1522 * 283514611 << 9) * 313675491;
                                                                                 var53.field10283 = (var3.method6371() << 2) * -2098711205;
                                                                                 var53.field10278 = var3.method6374() * -1670140163;
                                                                              }
                                                                           } else {
                                                                              var53.field10277 = var3.method6374() * 1626935871;
                                                                              var53.field10286 = var3.method6374() * -571637617;
                                                                              var3.field10376 += 465653244;
                                                                           }

                                                                           var53.field10284 = var3.method6420((byte)-34) * -698073157;
                                                                           Client.field2851[var5] = var53;
                                                                        }

                                                                        var0.field7770 = null;
                                                                        return true;
                                                                     }
                                                                  } else if (class807.field4436 == var0.field7770) {
                                                                     var45 = var3.method6410((byte)99);
                                                                     class958.method2057(1945510464);
                                                                     class307.method388(var45, 3, Client.field2623 * -442628795, 0, 262144);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4549) {
                                                                     class95.field595 = var3.method6371() * -986054733;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4511 == var0.field7770) {
                                                                     var45 = var3.method6374();
                                                                     var48 = var3.method6379(-1175861112);
                                                                     if (class166.field6896 == null) {
                                                                        class166.field6896 = new Object[2143828057 * class899.field9551.field6890];
                                                                     }

                                                                     class166.field6896[var45] = var48;
                                                                     Client.field2862[(Client.field2863 += -1965237945) * -1653538697 - 1 & 31] = var45;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4558) {
                                                                     var55 = new class513(var0.field7771 * -866602563);
                                                                     System.arraycopy(var0.field7768.field10375, var0.field7768.field10376 * 385051775, var55.field10375, 0, var0.field7771 * -866602563);
                                                                     class131.method896(1849823335);
                                                                     if (class615.field8903.field9146.method3999((byte)-70) == 1) {
                                                                        class625.field9752.method464(new class406(class335.field52, var55), 1563574437);
                                                                     } else {
                                                                        Client.field2697.method5292(new class406(class335.field52, var55), -1991819579);
                                                                     }

                                                                     var0.field7770 = null;
                                                                     return false;
                                                                  } else if (var0.field7770 == class807.field4570) {
                                                                     var45 = var3.method6402(-739582411);
                                                                     var5 = var3.method6397((byte)91);
                                                                     var59 = (var5 & 1) == 1;
                                                                     class500.method1862(var45, var59, 1659854875);
                                                                     Client.field2804[(Client.field2855 += 1524000797) * 1610062389 - 1 & 31] = var45;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4457 == var0.field7770) {
                                                                     var45 = var3.method6420((byte)30);
                                                                     var5 = var3.method6395(-1014855659);
                                                                     var50 = var3.method6420((byte)38);
                                                                     var51 = var3.method6371();
                                                                     var54 = var3.method6396((short)-2008);
                                                                     var60 = var50 >> 28;
                                                                     var10 = var50 >> 14 & 16383;
                                                                     var11 = var50 & 16383;
                                                                     class867.method5832(var60, var10, var11, var5, var54, var45, var51, 2105013784);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4479 == var0.field7770) {
                                                                     class673.method4258(class307.field421, (short)17513);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4551 == var0.field7770) {
                                                                     class673.method4258(class307.field426, (short)10101);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4430) {
                                                                     if (class53.field2311 && class296.field10468 != null) {
                                                                        class739.method1795(class615.field8903.field9109.method6159((byte)42), -1, -1, false, -1432148158);
                                                                     }

                                                                     var52 = new byte[var0.field7771 * -866602563 - 1];
                                                                     var47 = var3.method6371() == 1;
                                                                     var3.method2646(var52, 0, var0.field7771 * -866602563 - 1, (byte)1);
                                                                     class907 var57 = new class907(var52);
                                                                     var7 = var57.method6379(799488751);
                                                                     if (var47) {
                                                                        var8 = var57.method6379(403182631);
                                                                        if (var8.length() == 0) {
                                                                           var8 = var7;
                                                                        }

                                                                        if (!Client.field2616 || class407.field9261.startsWith("mac") || !class948.method1939(var7, 1, class662.field9727.method5798(-1209858466), -1999887910)) {
                                                                           class158.method3442(var8, true, class615.field8903.field9137.method3689(-2008340671) == 5, Client.field2849, Client.field2632, (byte)13);
                                                                        }
                                                                     } else {
                                                                        class158.method3442(var7, true, class615.field8903.field9137.method3689(-389602471) == 5, Client.field2849, Client.field2632, (byte)54);
                                                                     }

                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4470) {
                                                                     var45 = var3.method6402(2011852017);
                                                                     var5 = var3.method6409(-1991182834);
                                                                     class827.field9037.method5495(var45, var5, (byte)35);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4502 == var0.field7770) {
                                                                     var45 = var3.method6401((byte)-12);
                                                                     var5 = var3.method6402(-382838124);
                                                                     var50 = var3.method6414(1708571253);
                                                                     var51 = var3.method6374();
                                                                     class958.method2057(1927580267);
                                                                     class307.method388(var50, 7, var5 << 16 | var45, var51, 262144);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4510 == var0.field7770) {
                                                                     class341.method249(var3, var0.field7771 * -866602563, 1110385787);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4433 == var0.field7770) {
                                                                     class673.method4258(class307.field433, (short)-13236);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4553 == var0.field7770) {
                                                                     var46 = var3.method6371() == 1;
                                                                     var48 = var3.method6379(-2047466585);
                                                                     var6 = var48;
                                                                     if (var46) {
                                                                        var6 = var3.method6379(-378419431);
                                                                     }

                                                                     var31 = var3.method6375((short)19447);
                                                                     var29 = (long)var3.method6374();
                                                                     var27 = (long)var3.method6390((byte)5);
                                                                     var13 = var3.method6371();
                                                                     long var42 = var27 + (var29 << 32);
                                                                     var16 = false;
                                                                     var17 = 0;

                                                                     while(true) {
                                                                        if (var17 >= 100) {
                                                                           if (var13 != 2) {
                                                                              if ((!Client.field2792 || Client.field2793) && !Client.field2783) {
                                                                                 if (class923.method6260(var6, -991136791)) {
                                                                                    var16 = true;
                                                                                 }
                                                                              } else {
                                                                                 var16 = true;
                                                                              }
                                                                           }
                                                                           break;
                                                                        }

                                                                        if (var42 == Client.field2897[var17]) {
                                                                           var16 = true;
                                                                           break;
                                                                        }

                                                                        ++var17;
                                                                     }

                                                                     if (!var16) {
                                                                        Client.field2897[1594173071 * Client.field2898] = var42;
                                                                        Client.field2898 = 1356544111 * ((1 + 1594173071 * Client.field2898) % 100);
                                                                        var87 = class794.method467(class631.method5862(var3, 130122413), -1233870536);
                                                                        class684.method4383(9, 0, var48, var6, var48, var87, class405.method5478(var31), -1, 1446000206);
                                                                     }

                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4418) {
                                                                     var45 = var3.method6409(-2020536115);
                                                                     class958.method2057(1762312694);
                                                                     class256 var49 = (class256) Client.field2823.method2942((long)var45);
                                                                     if (var49 != null) {
                                                                        class526.method2226(var49, true, false, -113822480);
                                                                     }

                                                                     if (Client.field2633 != null) {
                                                                        class814.method2932(Client.field2633, -760560936);
                                                                        Client.field2633 = null;
                                                                     }

                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4472) {
                                                                     var45 = var3.method6402(1340695333);
                                                                     if (var45 == 65535) {
                                                                        var45 = -1;
                                                                     }

                                                                     class449.method3757(var45, -111895522);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4475 == var0.field7770) {
                                                                     Client.field2934 = var3.method6371() * -765637727;

                                                                     for(var45 = 0; var45 < Client.field2934 * -548972447; ++var45) {
                                                                        Client.field2841[var45] = var3.method6379(-1615855350);
                                                                        Client.field2936[var45] = var3.method6379(700707036);
                                                                        if (Client.field2936[var45].equals("")) {
                                                                           Client.field2936[var45] = Client.field2841[var45];
                                                                        }

                                                                        Client.field2937[var45] = var3.method6379(-104782632);
                                                                        Client.field2754[var45] = var3.method6379(1098088401);
                                                                        if (Client.field2754[var45].equals("")) {
                                                                           Client.field2754[var45] = Client.field2937[var45];
                                                                        }

                                                                        Client.field2939[var45] = false;
                                                                     }

                                                                     Client.field2865 = 754377557 * Client.field2915;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4420 == var0.field7770) {
                                                                     class206.field7099 = var3.method6404((byte)-43) * 777394511;
                                                                     Client.field2792 = var3.method6371() == 1;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4414 == var0.field7770) {
                                                                     class673.method4258(class307.field431, (short)-14002);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4529 == var0.field7770) {
                                                                     var45 = var3.method6410((byte)77);
                                                                     var47 = var3.method6397((byte)32) == 1;
                                                                     class958.method2057(2147134789);
                                                                     class823.method5365(var45, var47, -1778713719);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4482) {
                                                                     var45 = var3.method6367(1670794281);
                                                                     var5 = var3.method6367(1614686039);
                                                                     var50 = var3.method6409(-2073398222);
                                                                     class958.method2057(1771373308);
                                                                     class833.method5433(var50, var5, var45, (byte)45);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4556 == var0.field7770) {
                                                                     var46 = var3.method6371() == 1;
                                                                     var48 = var3.method6379(-323676906);
                                                                     var6 = var48;
                                                                     if (var46) {
                                                                        var6 = var3.method6379(-726880698);
                                                                     }

                                                                     var31 = (long)var3.method6374();
                                                                     var29 = (long)var3.method6390((byte)-115);
                                                                     var11 = var3.method6371();
                                                                     var40 = var29 + (var31 << 32);
                                                                     var14 = false;
                                                                     var15 = 0;

                                                                     while(true) {
                                                                        if (var15 >= 100) {
                                                                           if (var11 != 2) {
                                                                              if ((!Client.field2792 || Client.field2793) && !Client.field2783) {
                                                                                 if (class923.method6260(var6, -2116888507)) {
                                                                                    var14 = true;
                                                                                 }
                                                                              } else {
                                                                                 var14 = true;
                                                                              }
                                                                           }
                                                                           break;
                                                                        }

                                                                        if (var40 == Client.field2897[var15]) {
                                                                           var14 = true;
                                                                           break;
                                                                        }

                                                                        ++var15;
                                                                     }

                                                                     if (!var14) {
                                                                        Client.field2897[Client.field2898 * 1594173071] = var40;
                                                                        Client.field2898 = 1356544111 * ((1 + Client.field2898 * 1594173071) % 100);
                                                                        var80 = class794.method467(class631.method5862(var3, -1313378115), 19429593);
                                                                        class684.method4383(3, 0, var48, var6, var48, var80, (String)null, -1, 1446000206);
                                                                     }

                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4542) {
                                                                     var45 = var3.method6371();
                                                                     var47 = (var45 & 1) == 1;
                                                                     var6 = var3.method6379(1721558949);
                                                                     var7 = var3.method6379(-1738395503);
                                                                     if (var7.equals("")) {
                                                                        var7 = var6;
                                                                     }

                                                                     var8 = var3.method6379(1813366475);
                                                                     var9 = var3.method6379(1965503507);
                                                                     if (var9.equals("")) {
                                                                        var9 = var8;
                                                                     }

                                                                     if (!var47) {
                                                                        Client.field2841[Client.field2934 * -548972447] = var6;
                                                                        Client.field2936[Client.field2934 * -548972447] = var7;
                                                                        Client.field2937[Client.field2934 * -548972447] = var8;
                                                                        Client.field2754[-548972447 * Client.field2934] = var9;
                                                                        Client.field2939[-548972447 * Client.field2934] = 2 == (var45 & 2);
                                                                        Client.field2934 += -765637727;
                                                                     } else {
                                                                        for(var10 = 0; var10 < Client.field2934 * -548972447; ++var10) {
                                                                           if (Client.field2936[var10].equals(var9)) {
                                                                              Client.field2841[var10] = var6;
                                                                              Client.field2936[var10] = var7;
                                                                              Client.field2937[var10] = var8;
                                                                              Client.field2754[var10] = var9;
                                                                              break;
                                                                           }
                                                                        }
                                                                     }

                                                                     Client.field2865 = Client.field2915 * 754377557;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else {
                                                                     class764.method2747((var0.field7770 != null ? 2075990793 * var0.field7770.field4450 : -1) + class822.field9050 + (var0.field7780 != null ? var0.field7780.field4450 * 2075990793 : -1) + class822.field9050 + (var0.field7783 != null ? var0.field7783.field4450 * 2075990793 : -1) + " " + var0.field7771 * -866602563, new RuntimeException(), (short)-18255);
                                                                     class82.method920(false, (byte)69);
                                                                     return true;
                                                                  }
                                                               }
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var44) {
         throw class158.method3445(var44, "pf.jw(" + ')');
      }
   }
}
