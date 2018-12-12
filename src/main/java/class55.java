import java.io.IOException;

public class class55 {
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
                  ++var0.field7776;
                  var0.field7773 = 0;
                  var0.field7772 = false;
               }

               var3.field10376 = 0;
               if (var3.method2645((byte)-78)) {
                  if (!var2.method175(1, (byte)-13)) {
                     return false;
                  }

                  var2.method177(var0.field7768.field10375, 1, 1, (byte)4);
                  ++var0.field7776;
                  var0.field7773 = 0;
               }

               var0.field7772 = true;
               class807[] var4 = class419.method5644(-1456212765);
               var5 = var3.method6382(250607366);
               if (var5 < 0 || var5 >= var4.length) {
                  throw new IOException(var5 + " " + var3.field10376);
               }

               var0.field7770 = var4[var5];
               var0.field7771 = var0.field7770.field4428;
            }

            if (-1 == var0.field7771) {
               if (!var2.method175(1, (byte)-5)) {
                  return false;
               }

               var2.method177(var3.field10375, 0, 1, (byte)48);
               var0.field7771 = var3.field10375[0] & 255;
               ++var0.field7776;
               var0.field7773 = 0;
            }

            if (-2 == var0.field7771) {
               if (!var2.method175(2, (byte)9)) {
                  return false;
               }

               var2.method177(var3.field10375, 0, 2, (byte)-84);
               var3.field10376 = 0;
               var0.field7771 = var3.method6374();
               var0.field7776 += 2;
               var0.field7773 = 0;
            }

            if (var0.field7771 > 0) {
               if (!var2.method175(var0.field7771, (byte)-53)) {
                  return false;
               }

               var3.field10376 = 0;
               var2.method177(var3.field10375, 0, var0.field7771, (byte)117);
               var0.field7776 += var0.field7771;
               var0.field7773 = 0;
            }

            var0.field7783 = var0.field7780;
            var0.field7780 = var0.field7779;
            var0.field7779 = var0.field7770;
            if (var0.field7770 == class807.field4425) {
               class730.field2941 = var3.method6398(281504196);
               if (class730.field2941 == 0 || class730.field2941 == 1) {
                  class730.field2621 = true;
               }

               var0.field7770 = null;
               return true;
            } else {
               boolean var46;
               if (var0.field7770 == class807.field4525) {
                  class730.field2867 = class730.field2915;
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
                        class730.field2827 = var3.method6367(2135181158);
                        class730.field2870 = class730.field2915;
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

                           boolean var98 = (var51 >> 7 & 1) == 1;
                           int var99;
                           if (var60 >> 30 != 0) {
                              var77 = class730.field2697.method5270(681479919);
                              var85 = var60 >> 28 & 3;
                              var15 = (var60 >> 14 & 16383) - var77.field1521;
                              var91 = (var60 & 16383) - var77.field1522;
                              if (var15 >= 0 && var91 >= 0 && var15 < class730.field2697.method5271(-1990296889) && var91 < class730.field2697.method5272(-1604198619)) {
                                 if (var45 == -1) {
                                    class178 var114 = (class178)class730.field2806.method2942((long)(var15 << 16 | var91));
                                    if (var114 != null) {
                                       var114.field5225.method3377((byte)12);
                                       var114.method545(-1460969981);
                                    }
                                 } else {
                                    var17 = 256 + var15 * 512;
                                    var18 = 256 + 512 * var91;
                                    var99 = var85;
                                    if (var85 < 3 && class730.field2697.method5296(651162634).method3386(var15, var91, -2025869337)) {
                                       var99 = var85 + 1;
                                    }

                                    class150 var105 = new class150(class730.field2697.method5317(-1611682495), var45, var50, var85, var99, var17, class679.method4271(var17, var18, var85, -1215922012) - var54, var18, var15, var15, var91, var91, var10, var98);
                                    class730.field2806.method2947(new class178(var105), (long)(var15 << 16 | var91));
                                 }
                              }
                           } else {
                              class745 var106;
                              Animation var111;
                              Animation var113;
                              if (var60 >> 29 != 0) {
                                 var13 = var60 & '\uffff';
                                 class437 var112 = (class437)class730.field2677.method2942((long)var13);
                                 if (var112 != null) {
                                    Npc var95 = (Npc)var112.field7515;
                                    class932 var109 = var95.field4040[var5];
                                    if (var45 == 65535) {
                                       var45 = -1;
                                    }

                                    var103 = true;
                                    var18 = var109.field10341;
                                    if (-1 != var45 && var18 != -1) {
                                       if (var45 == var18) {
                                          var106 = class635.field9823.method1053(var45, -2138799623);
                                          if (var106.field4117 && -1 != var106.field4107) {
                                             var111 = class936.field10313.method2256(var106.field4107, (byte)-71);
                                             int var116 = var111.field6668;
                                             if (var116 != 0 && 2 != var116) {
                                                if (var116 == 1) {
                                                   var103 = true;
                                                }
                                             } else {
                                                var103 = false;
                                             }
                                          }
                                       } else {
                                          var106 = class635.field9823.method1053(var45, -1997923010);
                                          class745 var108 = class635.field9823.method1053(var18, -1881939747);
                                          if (var106.field4107 != -1 && var108.field4107 != -1) {
                                             var113 = class936.field10313.method2256(var106.field4107, (byte)83);
                                             Animation var120 = class936.field10313.method2256(var108.field4107, (byte)-25);
                                             if (var113.field6662 < var120.field6662) {
                                                var103 = false;
                                             }
                                          }
                                       }
                                    }

                                    if (var103) {
                                       var109.field10341 = var45;
                                       var109.field10343 = var54;
                                       var109.field10339 = var11;
                                       if (-1 != var45) {
                                          var106 = class635.field9823.method1053(var45, -1696520605);
                                          var20 = var106.field4117 ? 0 : 2;
                                          if (var98) {
                                             var20 = 1;
                                          }

                                          var109.field10340.method2780(var106.field4107, var50, var20, false, (byte)0);
                                       } else {
                                          var109.field10340.method2777(-1, -1461567794);
                                       }
                                    }
                                 }
                              } else if (var60 >> 28 != 0) {
                                 var13 = var60 & '\uffff';
                                 Player var115;
                                 if (var13 == class730.field2623) {
                                    var115 = class923.local;
                                 } else {
                                    var115 = class730.loaded[var13];
                                 }

                                 if (var115 != null) {
                                    class932 var100 = var115.field4040[var5];
                                    if (65535 == var45) {
                                       var45 = -1;
                                    }

                                    var16 = true;
                                    var17 = var100.field10341;
                                    class745 var104;
                                    if (var45 != -1 && -1 != var17) {
                                       if (var45 == var17) {
                                          var104 = class635.field9823.method1053(var45, -1990411818);
                                          if (var104.field4117 && var104.field4107 != -1) {
                                             Animation var117 = class936.field10313.method2256(var104.field4107, (byte)-15);
                                             var20 = var117.field6668;
                                             if (var20 != 0 && 2 != var20) {
                                                if (var20 == 1) {
                                                   var16 = true;
                                                }
                                             } else {
                                                var16 = false;
                                             }
                                          }
                                       } else {
                                          var104 = class635.field9823.method1053(var45, -1975194771);
                                          var106 = class635.field9823.method1053(var17, -1893234855);
                                          if (-1 != var104.field4107 && -1 != var106.field4107) {
                                             var111 = class936.field10313.method2256(var104.field4107, (byte)-1);
                                             var113 = class936.field10313.method2256(var106.field4107, (byte)-13);
                                             if (var111.field6662 < var113.field6662) {
                                                var16 = false;
                                             }
                                          }
                                       }
                                    }

                                    if (var16) {
                                       var100.field10341 = var45;
                                       var100.field10343 = var54;
                                       var100.field10339 = var11;
                                       var100.field10342 = var10;
                                       if (var45 != -1) {
                                          var104 = class635.field9823.method1053(var45, -2053481236);
                                          var99 = var104.field4117 ? 0 : 2;
                                          if (var98) {
                                             var99 = 1;
                                          }

                                          var100.field10340.method2780(var104.field4107, var50, var99, false, (byte)0);
                                       } else {
                                          var100.field10340.method2777(-1, -1498678101);
                                       }
                                    }
                                 }
                              }
                           }

                           var0.field7770 = null;
                           return true;
                        } else {
                           int var65;
                           if (class807.field4537 == var0.field7770) {
                              var45 = var3.method6410((byte)74);
                              var5 = var3.method6371();
                              var50 = var3.method6409(-1943559024);
                              var51 = var3.method6414(40948873);
                              var54 = var3.method6395(-1014855659);
                              var60 = var54 >> 2;
                              var10 = var54 & 3;
                              class389 var110 = new class389(var3.method6420((byte)-80));
                              var65 = var3.method6410((byte)67);
                              var13 = var3.method6374();
                              var85 = var3.method6420((byte)111);
                              var15 = var3.method6420((byte)20);
                              class958.method2057(1565654917);
                              class147.method1145(var65, new class687(var13, var5, new class614(var110, var60, var10, var51)), new int[]{var15, var45, var50, var85}, false, 1266119011);
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
                                    class730.field2764 += 32;
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
                                       byte var118 = var3.method6372(-12558881);
                                       var62 = false;
                                       if (var118 == -128) {
                                          var62 = true;
                                       }

                                       if (var62) {
                                          if (class556.field503 == 0) {
                                             var0.field7770 = null;
                                             return true;
                                          }

                                          boolean var102 = false;

                                          for(var11 = 0; var11 < class556.field503; ++var11) {
                                             if (class776.field3731[var11].field8115.equals(var6) && class776.field3731[var11].field8117 == var51) {
                                                if (var1 <= -1128197512) {
                                                   throw new IllegalStateException();
                                                }
                                                break;
                                             }
                                          }

                                          if (var11 < class556.field503) {
                                             while(var11 < class556.field503 - 1) {
                                                class776.field3731[var11] = class776.field3731[1 + var11];
                                                ++var11;
                                             }

                                             --class556.field503;
                                             class776.field3731[class556.field503] = null;
                                          }
                                       } else {
                                          var68 = var3.method6379(-1357066804);
                                          class255 var107 = new class255();
                                          var107.field8114 = var86;
                                          var107.field8115 = var6;
                                          var107.field8116 = class526.method2229(var107.field8115, -514633017);
                                          var107.field8117 = var51;
                                          var107.field8119 = var118;
                                          var107.field8118 = var68;

                                          for(var65 = class556.field503 - 1; var65 >= 0; --var65) {
                                             var13 = class776.field3731[var65].field8116.compareTo(var107.field8116);
                                             if (var13 == 0) {
                                                class776.field3731[var65].field8117 = var51;
                                                class776.field3731[var65].field8119 = var118;
                                                class776.field3731[var65].field8118 = var68;
                                                if (var6.equals(class923.local.field3374)) {
                                                   class526.field3667 = var118;
                                                }

                                                class730.field2894 = class730.field2915;
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

                                          if (class556.field503 >= class776.field3731.length) {
                                             var0.field7770 = null;
                                             return true;
                                          }

                                          for(var13 = class556.field503 - 1; var13 > var65; --var13) {
                                             class776.field3731[var13 + 1] = class776.field3731[var13];
                                          }

                                          if (class556.field503 == 0) {
                                             class776.field3731 = new class255[100];
                                          }

                                          class776.field3731[1 + var65] = var107;
                                          ++class556.field503;
                                          if (var6.equals(class923.local.field3374)) {
                                             class526.field3667 = var118;
                                          }
                                       }

                                       class730.field2894 = class730.field2915;
                                       var0.field7770 = null;
                                       return true;
                                    } else if (class807.field4555 == var0.field7770) {
                                       class730.field2650 = var3.method6374();
                                       if (class730.field2650 == 65535) {
                                          class730.field2650 = -1;
                                       }

                                       class730.field2870 = class730.field2915;
                                       var0.field7770 = null;
                                       return true;
                                    } else if (var0.field7770 == class807.field4509) {
                                       class730.field2868 = class730.field2915;
                                       var46 = var3.method6371() == 1;
                                       if (var0.field7771 == 1) {
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
                                       if (var47 != class904.field10357 || var45 != class495.field8097) {
                                          class904.field10357 = var47;
                                          class495.field8097 = var45;
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
                                       if (class730.field2652[var45] != null) {
                                          class730.field2652[var45].method4116(class730.field2697.method5317(-1611682495), -1127737066);
                                          class730.field2652[var45] = null;
                                       }

                                       if (var5 != -1) {
                                          class730.field2652[var45] = new class669(class593.field1623, var3, var5);
                                          class730.field2652[var45].method4115(class730.field2697.method5317(-1611682495), 2021897283);
                                       }

                                       var0.field7770 = null;
                                       return true;
                                    } else if (var0.field7770 == class807.field4440) {
                                       var3.field10376 += 28;
                                       if (var3.method6392((byte)83)) {
                                          class849.method4782(var3, var3.field10376 - 28, (byte)2);
                                       }

                                       var0.field7770 = null;
                                       return true;
                                    } else if (var0.field7770 == class807.field4469) {
                                       class776.field3730 = var0.field7771 > 2 ? var3.method6379(-1124509361) : class814.field4728.method2927(class321.field1066, -875414210);
                                       class730.field2803 = var0.field7771 > 0 ? var3.method6374() : -1;
                                       if (class730.field2803 == 65535) {
                                          class730.field2803 = -1;
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
                                       class389 var89 = new class389(var3.method6420((byte)122));
                                       class958.method2057(1648370068);
                                       class147.method1145(var50, new class318(var11, var45, new class878(var89, var54)), new int[]{var51, var5, var10, var60}, false, 518456835);
                                       var0.field7770 = null;
                                       return true;
                                    } else {
                                       long var23;
                                       long var25;
                                       long var27;
                                       String var48;
                                       boolean var72;
                                       String var96;
                                       class146 var97;
                                       if (class807.field4416 == var0.field7770) {
                                          var46 = var3.method6371() == 1;
                                          var48 = var3.method6379(1064239302);
                                          var23 = (long)var3.method6374();
                                          var25 = (long)var3.method6390((byte)-89);
                                          var10 = var3.method6371();
                                          var27 = (var23 << 32) + var25;
                                          var72 = false;
                                          var97 = null;
                                          class139 var90 = var46 ? class507.field4015 : class509.field4024;
                                          if (var90 == null) {
                                             var72 = true;
                                          } else {
                                             label2700: {
                                                for(var91 = 0; var91 < 100; ++var91) {
                                                   if (class730.field2897[var91] == var27) {
                                                      var72 = true;
                                                      break label2700;
                                                   }
                                                }

                                                if (var10 <= 1) {
                                                   if ((!class730.field2792 || class730.field2793) && !class730.field2783) {
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
                                             class730.field2897[class730.field2898] = var27;
                                             class730.field2898 = (1 + class730.field2898) % 100;
                                             var96 = class794.method467(class631.method5862(var3, 406823150), 298199531);
                                             var17 = var46 ? 41 : 44;
                                             if (2 != var10 && var10 != 3) {
                                                if (var10 == 1) {
                                                   class684.method4383(var17, 0, class341.method255(0, -278777595) + var48, class341.method255(0, -278777595) + var48, var48, var96, var90.field1164, -1, 1446000206);
                                                } else {
                                                   class684.method4383(var17, 0, var48, var48, var48, var96, var90.field1164, -1, 1446000206);
                                                }
                                             } else {
                                                class684.method4383(var17, 0, class341.method255(1, -278777595) + var48, class341.method255(1, -278777595) + var48, var48, var96, var90.field1164, -1, 1446000206);
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
                                                var82 = (class725)class730.field2878.method2942(var29);
                                                if (var82 == null) {
                                                   if (-1 == var54) {
                                                      var71 = new class725(var45, class449.method3756(var5, (byte)-34).field944.field2557);
                                                   } else {
                                                      var71 = new class725(var45, -1);
                                                   }
                                                } else {
                                                   var71 = new class725(var45, var82.field2557);
                                                   var82.method545(-1460969981);
                                                }

                                                class730.field2878.method2947(var71, var29);
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
                                                class495.field8099 = -1;
                                                class516.field4332 = -1;
                                             } else {
                                                class389 var133 = class730.field2697.method5270(681479919);
                                                var50 = var45 >> 14 & 16383;
                                                var51 = var45 & 16383;
                                                var50 -= var133.field1521;
                                                if (var50 < 0) {
                                                   var50 = 0;
                                                } else if (var50 >= class730.field2697.method5271(-2076483330)) {
                                                   var50 = class730.field2697.method5271(-1922242399);
                                                }

                                                var51 -= var133.field1522;
                                                if (var51 < 0) {
                                                   var51 = 0;
                                                } else if (var51 >= class730.field2697.method5272(-1784447321)) {
                                                   var51 = class730.field2697.method5272(232319200);
                                                }

                                                class495.field8099 = (var50 << 9) + 256;
                                                class516.field4332 = 256 + (var51 << 9);
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
                                             var54 = class730.field2720[var50];
                                             var60 = var3.method6409(-1783512122);
                                             var10 = var60 >> 28 & 3;
                                             var11 = var60 >> 14 & 16383;
                                             var65 = var60 & 16383;
                                             var77 = class730.field2697.method5270(681479919);
                                             var11 -= var77.field1521;
                                             var65 -= var77.field1522;
                                             class814.method2933(var10, var11, var65, var54, var50, var51, var45, -1216383524);
                                             var0.field7770 = null;
                                             return true;
                                          } else {
                                             boolean var66;
                                             String var81;
                                             if (class807.field4520 == var0.field7770) {
                                                var45 = var3.method6374();
                                                Player var132;
                                                if (class730.field2623 == var45) {
                                                   var132 = class923.local;
                                                } else {
                                                   var132 = class730.loaded[var45];
                                                }

                                                if (var132 == null) {
                                                   var0.field7770 = null;
                                                   return true;
                                                } else {
                                                   var50 = var3.method6374();
                                                   var51 = var3.method6371();
                                                   var66 = (var50 & '耀') != 0;
                                                   if (var132.field3374 != null && var132.field3388 != null) {
                                                      var62 = false;
                                                      if (var51 != 2) {
                                                         if (var66 || (!class730.field2792 || class730.field2793) && !class730.field2783) {
                                                            if (class923.method6260(var132.field3374, -1965589466)) {
                                                               var62 = true;
                                                            }
                                                         } else {
                                                            var62 = true;
                                                         }
                                                      }

                                                      if (!var62) {
                                                         var10 = -1;
                                                         if (var66) {
                                                            var50 &= 32767;
                                                            class24 var78 = class692.method3776(var3, (byte)25);
                                                            var10 = var78.field6482;
                                                            var81 = var78.field6483.method6651(var3, -734708119);
                                                         } else {
                                                            var81 = class794.method467(class631.method5862(var3, -1331458039), -446542687);
                                                         }

                                                         var132.method1997(var81.trim(), var50 >> 8, var50 & 255, 1232670584);
                                                         var65 = var66 ? 17 : 2;
                                                         class684.method4383(var65, 0, var132.method1993(true, -1755073777), var132.method1998(false, (byte)-103), var132.field3379, var81, (String)null, var10, 1446000206);
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

                                                   var52 = new byte[var0.field7771];
                                                   var3.method2646(var52, 0, var0.field7771, (byte)1);
                                                   var48 = class783.method2497(var52, 0, var0.field7771, 1174912789);
                                                   var6 = "opensn";
                                                   if (!class730.field2616 || !class948.method1939(var48, 1, var6, -2024310199)) {
                                                      class529.method2213(var48, true, class615.field8903.field9137.method3689(-446024577) == 5, var6, class730.field2849, class730.field2632, -1865929375);
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
                                                   byte[] var131 = new byte[var0.field7771 - 1];
                                                   var3.method6381(var131, 0, var0.field7771 - 1, -953523806);
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
                                                      var55 = new class513(var0.field7771);
                                                      System.arraycopy(var0.field7768.field10375, var0.field7768.field10376, var55.field10375, 0, var0.field7771);
                                                      class131.method896(1536628978);
                                                      if (class615.field8903.field9146.method3999((byte)-123) == 1) {
                                                         class625.field9752.method464(new class406(class335.field45, var55), 1122139565);
                                                      } else {
                                                         class730.field2697.method5292(new class406(class335.field45, var55), -1991819579);
                                                      }

                                                      var0.field7770 = null;
                                                      return false;
                                                   } else if (var0.field7770 == class807.field4498) {
                                                      class730.field2868 = class730.field2915;
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
                                                      class730.field2826 = var3.method6371();
                                                      class730.field2870 = class730.field2915;
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

                                                         class730.field2801[var45 - 1] = var48;
                                                         class730.field2886[var45 - 1] = var50;
                                                         class730.field2802[var45 - 1] = var51 == 0;
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
                                                            ItemDefinition.field4215 = new int[var54];
                                                            ItemDefinition.field4216 = new int[var54];

                                                            for(var60 = 0; var60 < var54; ++var60) {
                                                               ItemDefinition.field4215[var60] = var3.method6414(-228125522);
                                                               ItemDefinition.field4216[var60] = var3.method6414(-228125522);
                                                            }
                                                         }

                                                         class730.field2804[++class730.field2855 - 1 & 31] = var45;
                                                         var0.field7770 = null;
                                                         return true;
                                                      } else if (class807.field4481 == var0.field7770) {
                                                         class166.field6896 = new Object[class899.field9551.field6890];
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
                                                            var65 = var3.method6374();
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

                                                               if (class730.field2897[var91] == var33) {
                                                                  var83 = true;
                                                                  break;
                                                               }

                                                               ++var91;
                                                            }

                                                            if (!var83) {
                                                               class730.field2897[class730.field2898] = var33;
                                                               class730.field2898 = (class730.field2898 + 1) % 100;
                                                               var96 = class906.field10363.method2713(var65, (short)-8978).method6651(var3, -734708119);
                                                               class684.method4383(18, 0, var48, var6, var48, var96, (String)null, var65, 1446000206);
                                                            }

                                                            var0.field7770 = null;
                                                            return true;
                                                         } else if (class807.field4523 == var0.field7770) {
                                                            var45 = var3.method6410((byte)45);
                                                            if (class379.field1140 != var45) {
                                                               class379.field1140 = var45;
                                                               class574.method131(class112.field2118, -1, -1, 459954784);
                                                            }

                                                            var0.field7770 = null;
                                                            return true;
                                                         } else if (var0.field7770 == class807.field4557) {
                                                            var45 = var3.method6374();
                                                            var123 = var3.method6372(-12558881);
                                                            if (class166.field6896 == null) {
                                                               class166.field6896 = new Object[class899.field9551.field6890];
                                                            }

                                                            class166.field6896[var45] = new Integer(var123);
                                                            class730.field2862[++class730.field2863 - 1 & 31] = var45;
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
                                                               var82 = (class725)class730.field2878.method2942(var29);
                                                               if (var82 == null) {
                                                                  if (var54 == -1) {
                                                                     var71 = new class725(class449.method3756(var50, (byte)-9).field944.field2563, var5);
                                                                  } else {
                                                                     var71 = new class725(0, var5);
                                                                  }
                                                               } else {
                                                                  var71 = new class725(var82.field2563, var5);
                                                                  var82.method545(-1460969981);
                                                               }

                                                               class730.field2878.method2947(var71, var29);
                                                            }

                                                            var0.field7770 = null;
                                                            return true;
                                                         } else if (class807.field4540 == var0.field7770) {
                                                            class420.field9722 = var3.method6398(169252362) << 3;
                                                            class509.field4023 = var3.method6371();
                                                            class82.field1109 = var3.method6398(-136295651) << 3;

                                                            while(var3.field10376 < var0.field7771) {
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
                                                            class730.field2665[var5] = true;
                                                            class730.field2842[var5] = var51;
                                                            class730.field2907[var5] = var50;
                                                            class730.field2908[var5] = var45;
                                                            class730.field2771[var5] = var54;
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

                                                               if (var35 == class730.field2897[var18]) {
                                                                  var103 = true;
                                                                  break;
                                                               }

                                                               ++var18;
                                                            }

                                                            if (!var103) {
                                                               class730.field2897[class730.field2898] = var35;
                                                               class730.field2898 = (class730.field2898 + 1) % 100;
                                                               String var101 = class906.field10363.method2713(var85, (short)-10826).method6651(var3, -734708119);
                                                               class684.method4383(20, 0, var48, var6, var48, var101, class405.method5478(var31), var85, 1446000206);
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
                                                               while(var3.field10376 < var0.field7771) {
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

                                                                  for(var65 = 0; var65 < class730.field2923; ++var65) {
                                                                     if (!var46) {
                                                                        if (var48.equals(class730.field2685[var65])) {
                                                                           if (class730.field2928[var65] != var51) {
                                                                              var72 = true;

                                                                              for(var97 = (class146)class730.field2933.method5207(-16777216); var97 != null; var97 = (class146)class730.field2933.method5211(269965941)) {
                                                                                 if (var97.field1551.equals(var48)) {
                                                                                    if (var51 != 0 && var97.field1549 == 0) {
                                                                                       var97.method2028(185516853);
                                                                                       var72 = false;
                                                                                    } else if (var51 == 0 && var97.field1549 != 0) {
                                                                                       var97.method2028(1336201155);
                                                                                       var72 = false;
                                                                                    }
                                                                                 }
                                                                              }

                                                                              if (var72) {
                                                                                 class730.field2933.method5209(new class146(var48, var51), 1940667363);
                                                                              }

                                                                              class730.field2928[var65] = var51;
                                                                           }

                                                                           class730.field2927[var65] = var6;
                                                                           class730.field2929[var65] = var68;
                                                                           class730.field2686[var65] = var54;
                                                                           class730.field2703[var65] = var75;
                                                                           class730.field2932[var65] = var62;
                                                                           var48 = null;
                                                                           break;
                                                                        }
                                                                     } else if (var6.equals(class730.field2685[var65])) {
                                                                        class730.field2685[var65] = var48;
                                                                        class730.field2927[var65] = var6;
                                                                        var48 = null;
                                                                        break;
                                                                     }
                                                                  }

                                                                  if (var48 != null && class730.field2923 < 200) {
                                                                     class730.field2685[class730.field2923] = var48;
                                                                     class730.field2927[class730.field2923] = var6;
                                                                     class730.field2928[class730.field2923] = var51;
                                                                     class730.field2929[class730.field2923] = var68;
                                                                     class730.field2686[class730.field2923] = var54;
                                                                     class730.field2703[class730.field2923] = var75;
                                                                     class730.field2932[class730.field2923] = var62;
                                                                     ++class730.field2923;
                                                                  }
                                                               }

                                                               class730.field2924 = 2;
                                                               class730.field2865 = class730.field2915;
                                                               var46 = false;
                                                               var5 = class730.field2923;

                                                               while(var5 > 0) {
                                                                  var46 = true;
                                                                  --var5;

                                                                  for(var50 = 0; var50 < var5; ++var50) {
                                                                     boolean var93 = false;
                                                                     if (class601.field9203.field4347 != class730.field2928[var50] && class601.field9203.field4347 == class730.field2928[var50 + 1]) {
                                                                        var93 = true;
                                                                     }

                                                                     if (!var93 && class730.field2928[var50] == 0 && class730.field2928[var50 + 1] != 0) {
                                                                        var93 = true;
                                                                     }

                                                                     if (!var93 && !class730.field2932[var50] && class730.field2932[1 + var50]) {
                                                                        var93 = true;
                                                                     }

                                                                     if (var93) {
                                                                        var54 = class730.field2928[var50];
                                                                        class730.field2928[var50] = class730.field2928[var50 + 1];
                                                                        class730.field2928[1 + var50] = var54;
                                                                        var9 = class730.field2929[var50];
                                                                        class730.field2929[var50] = class730.field2929[var50 + 1];
                                                                        class730.field2929[1 + var50] = var9;
                                                                        var68 = class730.field2685[var50];
                                                                        class730.field2685[var50] = class730.field2685[var50 + 1];
                                                                        class730.field2685[1 + var50] = var68;
                                                                        var81 = class730.field2927[var50];
                                                                        class730.field2927[var50] = class730.field2927[1 + var50];
                                                                        class730.field2927[1 + var50] = var81;
                                                                        var65 = class730.field2686[var50];
                                                                        class730.field2686[var50] = class730.field2686[var50 + 1];
                                                                        class730.field2686[1 + var50] = var65;
                                                                        var72 = class730.field2703[var50];
                                                                        class730.field2703[var50] = class730.field2703[var50 + 1];
                                                                        class730.field2703[1 + var50] = var72;
                                                                        var14 = class730.field2932[var50];
                                                                        class730.field2932[var50] = class730.field2932[1 + var50];
                                                                        class730.field2932[1 + var50] = var14;
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
                                                               class730.field2867 = class730.field2915;
                                                               var46 = var3.method6371() == 1;
                                                               if (var0.field7771 == 1) {
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
                                                               if (-1 != class730.field2822) {
                                                                  class929.method6262(class730.field2822, 0, 390245730);
                                                               }

                                                               var0.field7770 = null;
                                                               return true;
                                                            } else {
                                                               long var37;
                                                               if (class807.field4462 == var0.field7770) {
                                                                  var45 = var3.method6374();
                                                                  var37 = var3.method6375((short)19761);
                                                                  if (class166.field6896 == null) {
                                                                     class166.field6896 = new Object[class899.field9551.field6890];
                                                                  }

                                                                  class166.field6896[var45] = new Long(var37);
                                                                  class730.field2862[++class730.field2863 - 1 & 31] = var45;
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
                                                                  class730.field2895 = var3.method6397((byte)101);
                                                                  class730.field2819 = var3.method6371();
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
                                                                  for(var45 = 0; var45 < class730.loaded.length; ++var45) {
                                                                     if (class730.loaded[var45] != null) {
                                                                        class730.loaded[var45].field4057 = null;
                                                                        class730.loaded[var45].activeAnimator.method2777(-1, -1564622591);
                                                                     }
                                                                  }

                                                                  for(var45 = 0; var45 < class730.field2753; ++var45) {
                                                                     ((Actor)class730.field2797[var45].field7515).field4057 = null;
                                                                     ((Actor)class730.field2797[var45].field7515).activeAnimator.method2777(-1, -2064932982);
                                                                  }

                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4515) {
                                                                  var45 = var3.method6420((byte)69);
                                                                  var5 = var3.method6420((byte)-11);
                                                                  class958.method2057(1838306305);
                                                                  class256 var119 = (class256)class730.field2823.method2942((long)var45);
                                                                  class256 var84 = (class256)class730.field2823.method2942((long)var5);
                                                                  if (var84 != null) {
                                                                     class526.method2226(var84, var119 == null || var84.field8101 != var119.field8101, false, -113822480);
                                                                  }

                                                                  if (var119 != null) {
                                                                     var119.method545(-1460969981);
                                                                     class730.field2823.method2947(var119, (long)var5);
                                                                  }

                                                                  class564 var79 = class449.method3756(var45, (byte)-52);
                                                                  if (var79 != null) {
                                                                     class814.method2932(var79, 1086965599);
                                                                  }

                                                                  var79 = class449.method3756(var5, (byte)51);
                                                                  if (var79 != null) {
                                                                     class814.method2932(var79, -904794130);
                                                                     class948.method1938(class382.field1410[var79.field867 >>> 16], var79, true, 112223880);
                                                                  }

                                                                  if (class730.field2822 != -1) {
                                                                     class929.method6262(class730.field2822, 1, -167409895);
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
                                                                  class730.field2822 = var5;
                                                                  class342.method223(var5, var74, 1073572568);
                                                                  class161.method3551(false, (byte)8);
                                                                  class228.method4586(class730.field2822, var74, 278724032);

                                                                  for(var11 = 0; var11 < 113; ++var11) {
                                                                     class730.field2882[var11] = true;
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

                                                                  for(var59 = (var5 & 1) == 1; var3.field10376 < var0.field7771; class407.method5539(var45, var51, var54 - 1, var60, var59, -540593777)) {
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

                                                                  class730.field2804[++class730.field2855 - 1 & 31] = var45;
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
                                                                  class307.method388(var45, 5, class730.field2623, 0, 262144);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (var0.field7770 == class807.field4419) {
                                                                  var45 = var3.method6396((short)-2884);
                                                                  class958.method2057(1810891735);
                                                                  class730.field2885 = var45;
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
                                                                  var65 = var3.method6371();
                                                                  var13 = var3.method6402(-931118162);
                                                                  var85 = var3.method6397((byte)17);
                                                                  var15 = var3.method6402(-643251199);
                                                                  var91 = var3.method6374();
                                                                  byte var94 = var3.method6398(263654343);
                                                                  boolean var92 = (var65 & 1) != 0;
                                                                  boolean var19 = (var65 & 2) != 0;
                                                                  var20 = var19 ? var65 >> 2 : -1;
                                                                  if (var19) {
                                                                     var85 = (byte)var85;
                                                                  } else {
                                                                     var85 *= 4;
                                                                  }

                                                                  class389 var21 = class730.field2697.method5270(681479919);
                                                                  int var22 = var10 - var21.field1521 * 2;
                                                                  int var39 = var13 - var21.field1522 * 2;
                                                                  var51 = var76 + var22;
                                                                  var17 = var94 + var39;
                                                                  if (var22 >= 0 && var39 >= 0 && var22 < class730.field2697.method5271(-1911669738) * 2 && var39 < class730.field2697.method5271(-1992464171) * 2 && var51 >= 0 && var17 >= 0 && var51 < class730.field2697.method5272(-2022476058) * 2 && var17 < class730.field2697.method5272(1563119067) * 2 && 65535 != var45) {
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
                                                                  var66 = false;
                                                                  if (var51 != 2) {
                                                                     if ((!class730.field2792 || class730.field2793) && !class730.field2783) {
                                                                        if (var51 != 2 && class923.method6260(var6, -1379408074)) {
                                                                           var66 = true;
                                                                        }
                                                                     } else {
                                                                        var66 = true;
                                                                     }
                                                                  }

                                                                  if (!var66) {
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
                                                                  class730.field2924 = 1;
                                                                  class730.field2865 = class730.field2915;
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
                                                                  class730.field2796 = var3.method6396((short)-6905) == 1;
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
                                                                  class730.field2707 = -1;
                                                                  class730.field2852 = var45;
                                                                  class730.field2705 = 1;
                                                                  class966.field2522.method3280(class730.field2852, -457216440);
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
                                                                  class665.field9597 = new InputStream(var50);
                                                                  class665.field9597.method6425(var3.field10375, var3.field10376, var50, (short)-25177);
                                                                  var3.field10376 += var50;
                                                                  var0.field7770 = null;
                                                                  return false;
                                                               } else if (var0.field7770 == class807.field4544) {
                                                                  class673.method4258(class307.field423, (short)-19172);
                                                                  var0.field7770 = null;
                                                                  return true;
                                                               } else if (class807.field4467 == var0.field7770) {
                                                                  var45 = var3.method6371();
                                                                  if (var3.method6371() == 0) {
                                                                     class730.field2902[var45] = new class285();
                                                                  } else {
                                                                     --var3.field10376;
                                                                     class730.field2902[var45] = new class285(var3);
                                                                  }

                                                                  class730.field2777 = class730.field2915;
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
                                                                  InputStream.method6433(var50, var45, var5, (short)1020);
                                                                  ItemDefinition var67 = class85.field1121.method1566(var45);
                                                                  class858.method5223(var50, var67.field4231, var67.field4232, var67.field4230, -1121225747);
                                                                  class962.method2131(var50, var67.field4234, var67.field4235, var67.field4233, 499708204);
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
                                                                              if (var40 == class730.field2897[var17]) {
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
                                                                        class730.field2897[class730.field2898] = var40;
                                                                        class730.field2898 = (class730.field2898 + 1) % 100;
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
                                                                     var69.field3364.method6415(class69.field1807, (byte)1);
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
                                                                     class529.method2220(var3, var0.field7771, (byte)-111);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4417) {
                                                                     int[] var73 = new int[class458.method3829((byte)-31).length];

                                                                     for(var5 = 0; var5 < class458.method3829((byte)-48).length; ++var5) {
                                                                        var73[var5] = var3.method6420((byte)-69);
                                                                     }

                                                                     var5 = var3.method6371();
                                                                     var50 = var3.method6374();
                                                                     class437 var63 = (class437)class730.field2677.method2942((long)var50);
                                                                     if (var63 != null) {
                                                                        class488.method4740((Actor)var63.field7515, var73, var5, true, (byte)-7);
                                                                     }

                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4484 == var0.field7770) {
                                                                     class82.field1109 = var3.method6399(1269677513) << 3;
                                                                     class509.field4023 = var3.method6397((byte)40);
                                                                     class420.field9722 = var3.method6398(188175247) << 3;
                                                                     class389 var70 = class730.field2697.method5270(681479919);

                                                                     for(class508 var61 = (class508)class730.field2666.method2946(1564654282); var61 != null; var61 = (class508)class730.field2666.method2945((byte)10)) {
                                                                        var50 = (int)(var61.field641 >> 28 & 3L);
                                                                        var51 = (int)(var61.field641 & 16383L);
                                                                        var54 = var51 - var70.field1521;
                                                                        var60 = (int)(var61.field641 >> 14 & 16383L);
                                                                        var10 = var60 - var70.field1522;
                                                                        if (var50 == class509.field4023 && var54 >= class420.field9722 && var54 < 8 + class420.field9722 && var10 >= class82.field1109 && var10 < 8 + class82.field1109) {
                                                                           var61.method545(-1460969981);
                                                                           if (var54 >= 0 && var10 >= 0 && var54 < class730.field2697.method5271(-2088487368) && var10 < class730.field2697.method5272(1377874440)) {
                                                                              class526.method2225(class509.field4023, var54, var10, 1641680263);
                                                                           }
                                                                        }
                                                                     }

                                                                     class563 var64;
                                                                     for(var64 = (class563)class563.field1071.method901(1766612795); var64 != null; var64 = (class563)class563.field1071.method906(49146)) {
                                                                        if (var64.field1069 >= class420.field9722 && var64.field1069 < 8 + class420.field9722 && var64.field1074 >= class82.field1109 && var64.field1074 < class82.field1109 + 8 && var64.field1070 == class509.field4023) {
                                                                           var64.field1079 = true;
                                                                        }
                                                                     }

                                                                     for(var64 = (class563)class563.field1081.method901(1766612795); var64 != null; var64 = (class563)class563.field1081.method906(49146)) {
                                                                        if (var64.field1069 >= class420.field9722 && var64.field1069 < class420.field9722 + 8 && var64.field1074 >= class82.field1109 && var64.field1074 < class82.field1109 + 8 && var64.field1070 == class509.field4023) {
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
                                                                              class382.field1410[var45].field1103[var51].field866 = var54;
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
                                                                     class82.field1109 = var3.method6407((byte)-8) << 3;
                                                                     class509.field4023 = var3.method6396((short)-28965);
                                                                     class420.field9722 = var3.method6399(-1150117384) << 3;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4451) {
                                                                     var45 = var3.method6374();
                                                                     var5 = var3.method6420((byte)-116);
                                                                     if (class166.field6896 == null) {
                                                                        class166.field6896 = new Object[class899.field9551.field6890];
                                                                     }

                                                                     class166.field6896[var45] = new Integer(var5);
                                                                     class730.field2862[++class730.field2863 - 1 & 31] = var45;
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

                                                                     class730.field2810[var45] = var50;
                                                                     class730.field2906[var45] = var51;
                                                                     class730.field2811[var45] = var54;
                                                                     class730.field2809[var45] = 1;
                                                                     var60 = class880.field10185[var45] - 1;

                                                                     for(var10 = 0; var10 < var60; ++var10) {
                                                                        if (var50 >= class880.field10186[var10]) {
                                                                           class730.field2809[var45] = 2 + var10;
                                                                        }
                                                                     }

                                                                     class730.field2815[++class730.field2857 - 1 & 31] = var45;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4508) {
                                                                     class730.field2894 = class730.field2915;
                                                                     if (var0.field7771 == 0) {
                                                                        class730.field2785 = null;
                                                                        class730.field2901 = null;
                                                                        class556.field503 = 0;
                                                                        class776.field3731 = null;
                                                                        var0.field7770 = null;
                                                                        return true;
                                                                     } else {
                                                                        class730.field2901 = var3.method6379(2105595106);
                                                                        var46 = var3.method6371() == 1;
                                                                        if (var46) {
                                                                           var3.method6379(-124470201);
                                                                        }

                                                                        var37 = var3.method6375((short)6221);
                                                                        class730.field2785 = class969.method1693(var37);
                                                                        class314.field501 = var3.method6372(-12558881);
                                                                        var51 = var3.method6371();
                                                                        if (255 == var51) {
                                                                           var0.field7770 = null;
                                                                           return true;
                                                                        } else {
                                                                           class556.field503 = var51;
                                                                           class255[] var58 = new class255[100];

                                                                           for(var60 = 0; var60 < class556.field503; ++var60) {
                                                                              var58[var60] = new class255();
                                                                              var58[var60].field8114 = var3.method6379(403996572);
                                                                              var46 = var3.method6371() == 1;
                                                                              if (var46) {
                                                                                 var58[var60].field8115 = var3.method6379(1553463180);
                                                                              } else {
                                                                                 var58[var60].field8115 = var58[var60].field8114;
                                                                              }

                                                                              var58[var60].field8116 = class526.method2229(var58[var60].field8115, 445649895);
                                                                              var58[var60].field8117 = var3.method6374();
                                                                              var58[var60].field8119 = var3.method6372(-12558881);
                                                                              var58[var60].field8118 = var3.method6379(-1930467617);
                                                                              if (var58[var60].field8115.equals(class923.local.field3374)) {
                                                                                 class526.field3667 = var58[var60].field8119;
                                                                              }
                                                                           }

                                                                           var62 = false;
                                                                           var10 = class556.field503;

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
                                                                        class730.field2851[var5] = null;
                                                                        var0.field7770 = null;
                                                                        return true;
                                                                     } else {
                                                                        class921 var53 = new class921();
                                                                        var53.field10287 = var50;
                                                                        var53.field10279 = var3.method6371();
                                                                        if (var53.field10279 >= 0 && var53.field10279 < class634.field9790.length) {
                                                                           if (var53.field10287 != 1 && 10 != var53.field10287) {
                                                                              if (var53.field10287 >= 2 && var53.field10287 <= 6) {
                                                                                 if (var53.field10287 == 2) {
                                                                                    var53.field10281 = 256;
                                                                                    var53.field10282 = 256;
                                                                                 }

                                                                                 if (3 == var53.field10287) {
                                                                                    var53.field10281 = 0;
                                                                                    var53.field10282 = 256;
                                                                                 }

                                                                                 if (var53.field10287 == 4) {
                                                                                    var53.field10281 = 512;
                                                                                    var53.field10282 = 256;
                                                                                 }

                                                                                 if (5 == var53.field10287) {
                                                                                    var53.field10281 = 256;
                                                                                    var53.field10282 = 0;
                                                                                 }

                                                                                 if (var53.field10287 == 6) {
                                                                                    var53.field10281 = 256;
                                                                                    var53.field10282 = 512;
                                                                                 }

                                                                                 var53.field10287 = 2;
                                                                                 var53.field10280 = var3.method6371();
                                                                                 class389 var56 = class730.field2697.method5270(681479919);
                                                                                 var53.field10281 += var3.method6374() - var56.field1521 << 9;
                                                                                 var53.field10282 += var3.method6374() - var56.field1522 << 9;
                                                                                 var53.field10283 = var3.method6371() << 2;
                                                                                 var53.field10278 = var3.method6374();
                                                                              }
                                                                           } else {
                                                                              var53.field10277 = var3.method6374();
                                                                              var53.field10286 = var3.method6374();
                                                                              var3.field10376 += 4;
                                                                           }

                                                                           var53.field10284 = var3.method6420((byte)-34);
                                                                           class730.field2851[var5] = var53;
                                                                        }

                                                                        var0.field7770 = null;
                                                                        return true;
                                                                     }
                                                                  } else if (class807.field4436 == var0.field7770) {
                                                                     var45 = var3.method6410((byte)99);
                                                                     class958.method2057(1945510464);
                                                                     class307.method388(var45, 3, class730.field2623, 0, 262144);
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4549) {
                                                                     class95.field595 = var3.method6371();
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4511 == var0.field7770) {
                                                                     var45 = var3.method6374();
                                                                     var48 = var3.method6379(-1175861112);
                                                                     if (class166.field6896 == null) {
                                                                        class166.field6896 = new Object[class899.field9551.field6890];
                                                                     }

                                                                     class166.field6896[var45] = var48;
                                                                     class730.field2862[++class730.field2863 - 1 & 31] = var45;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4558) {
                                                                     var55 = new class513(var0.field7771);
                                                                     System.arraycopy(var0.field7768.field10375, var0.field7768.field10376, var55.field10375, 0, var0.field7771);
                                                                     class131.method896(1849823335);
                                                                     if (class615.field8903.field9146.method3999((byte)-70) == 1) {
                                                                        class625.field9752.method464(new class406(class335.field52, var55), 1563574437);
                                                                     } else {
                                                                        class730.field2697.method5292(new class406(class335.field52, var55), -1991819579);
                                                                     }

                                                                     var0.field7770 = null;
                                                                     return false;
                                                                  } else if (var0.field7770 == class807.field4570) {
                                                                     var45 = var3.method6402(-739582411);
                                                                     var5 = var3.method6397((byte)91);
                                                                     var59 = (var5 & 1) == 1;
                                                                     class500.method1862(var45, var59, 1659854875);
                                                                     class730.field2804[++class730.field2855 - 1 & 31] = var45;
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

                                                                     var52 = new byte[var0.field7771 - 1];
                                                                     var47 = var3.method6371() == 1;
                                                                     var3.method2646(var52, 0, var0.field7771 - 1, (byte)1);
                                                                     InputStream var57 = new InputStream(var52);
                                                                     var7 = var57.method6379(799488751);
                                                                     if (var47) {
                                                                        var8 = var57.method6379(403182631);
                                                                        if (var8.length() == 0) {
                                                                           var8 = var7;
                                                                        }

                                                                        if (!class730.field2616 || class407.field9261.startsWith("mac") || !class948.method1939(var7, 1, class662.field9727.method5798(-1209858466), -1999887910)) {
                                                                           class158.method3442(var8, true, class615.field8903.field9137.method3689(-2008340671) == 5, class730.field2849, class730.field2632, (byte)13);
                                                                        }
                                                                     } else {
                                                                        class158.method3442(var7, true, class615.field8903.field9137.method3689(-389602471) == 5, class730.field2849, class730.field2632, (byte)54);
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
                                                                     class341.method249(var3, var0.field7771, 1110385787);
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
                                                                              if ((!class730.field2792 || class730.field2793) && !class730.field2783) {
                                                                                 if (class923.method6260(var6, -991136791)) {
                                                                                    var16 = true;
                                                                                 }
                                                                              } else {
                                                                                 var16 = true;
                                                                              }
                                                                           }
                                                                           break;
                                                                        }

                                                                        if (var42 == class730.field2897[var17]) {
                                                                           var16 = true;
                                                                           break;
                                                                        }

                                                                        ++var17;
                                                                     }

                                                                     if (!var16) {
                                                                        class730.field2897[class730.field2898] = var42;
                                                                        class730.field2898 = (1 + class730.field2898) % 100;
                                                                        var87 = class794.method467(class631.method5862(var3, 130122413), -1233870536);
                                                                        class684.method4383(9, 0, var48, var6, var48, var87, class405.method5478(var31), -1, 1446000206);
                                                                     }

                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (var0.field7770 == class807.field4418) {
                                                                     var45 = var3.method6409(-2020536115);
                                                                     class958.method2057(1762312694);
                                                                     class256 var49 = (class256)class730.field2823.method2942((long)var45);
                                                                     if (var49 != null) {
                                                                        class526.method2226(var49, true, false, -113822480);
                                                                     }

                                                                     if (class730.field2633 != null) {
                                                                        class814.method2932(class730.field2633, -760560936);
                                                                        class730.field2633 = null;
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
                                                                     class730.field2934 = var3.method6371();

                                                                     for(var45 = 0; var45 < class730.field2934; ++var45) {
                                                                        class730.field2841[var45] = var3.method6379(-1615855350);
                                                                        class730.field2936[var45] = var3.method6379(700707036);
                                                                        if (class730.field2936[var45].equals("")) {
                                                                           class730.field2936[var45] = class730.field2841[var45];
                                                                        }

                                                                        class730.field2937[var45] = var3.method6379(-104782632);
                                                                        class730.field2754[var45] = var3.method6379(1098088401);
                                                                        if (class730.field2754[var45].equals("")) {
                                                                           class730.field2754[var45] = class730.field2937[var45];
                                                                        }

                                                                        class730.field2939[var45] = false;
                                                                     }

                                                                     class730.field2865 = class730.field2915;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else if (class807.field4420 == var0.field7770) {
                                                                     class206.field7099 = var3.method6404((byte)-43);
                                                                     class730.field2792 = var3.method6371() == 1;
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
                                                                              if ((!class730.field2792 || class730.field2793) && !class730.field2783) {
                                                                                 if (class923.method6260(var6, -2116888507)) {
                                                                                    var14 = true;
                                                                                 }
                                                                              } else {
                                                                                 var14 = true;
                                                                              }
                                                                           }
                                                                           break;
                                                                        }

                                                                        if (var40 == class730.field2897[var15]) {
                                                                           var14 = true;
                                                                           break;
                                                                        }

                                                                        ++var15;
                                                                     }

                                                                     if (!var14) {
                                                                        class730.field2897[class730.field2898] = var40;
                                                                        class730.field2898 = (1 + class730.field2898) % 100;
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
                                                                        class730.field2841[class730.field2934] = var6;
                                                                        class730.field2936[class730.field2934] = var7;
                                                                        class730.field2937[class730.field2934] = var8;
                                                                        class730.field2754[class730.field2934] = var9;
                                                                        class730.field2939[class730.field2934] = 2 == (var45 & 2);
                                                                        ++class730.field2934;
                                                                     } else {
                                                                        for(var10 = 0; var10 < class730.field2934; ++var10) {
                                                                           if (class730.field2936[var10].equals(var9)) {
                                                                              class730.field2841[var10] = var6;
                                                                              class730.field2936[var10] = var7;
                                                                              class730.field2937[var10] = var8;
                                                                              class730.field2754[var10] = var9;
                                                                              break;
                                                                           }
                                                                        }
                                                                     }

                                                                     class730.field2865 = class730.field2915;
                                                                     var0.field7770 = null;
                                                                     return true;
                                                                  } else {
                                                                     class764.method2747((var0.field7770 != null ? 2075990793 * var0.field7770.field4450 * -477306055 : -1) + class822.field9050 + (var0.field7780 != null ? var0.field7780.field4450 * -477306055 * 2075990793 : -1) + class822.field9050 + (var0.field7783 != null ? var0.field7783.field4450 * -477306055 * 2075990793 : -1) + " " + var0.field7771, new RuntimeException(), (short)-18255);
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
