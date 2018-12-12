import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Iterator;

public class class507 {
   public int[][] field3968;
   public int field3969 = 512849763;
   public int[] field3970 = null;
   public int[] field3971 = null;
   int field3972 = 0;
   public int field3973 = -241536037;
   public int field3974 = 928434405;
   public int field3975 = 1216995793;
   class135[] field3976;
   public int field3977 = 1440097851;
   public int field3978 = 0;
   public int field3979 = 1261244237;
   public int field3980 = -1316025001;
   public int field3981 = -1270333873;
   public int field3982 = -1566713043;
   class193 field3983;
   public int field3984 = 0;
   public int field3985 = 1511636755;
   public int field3986 = -1034489103;
   public int field3987 = -537960313;
   public int field3988 = 1236000399;
   public int field3989 = 1402060193;
   public int[] field3990;
   public int field3991 = 1442268255;
   public int field3992 = 0;
   public int field3993 = 0;
   public int field3994 = 0;
   public int field3995 = 71356649;
   public int field3996 = -697230329;
   public int field3997 = 549936551;
   public int field3998 = 0;
   public int field3999 = -564296781;
   public int[] field4000;
   public int field4001 = -1019547381;
   public int field4002 = 0;
   public int field4003 = 0;
   public int field4004 = 1593946535;
   public int field4005 = 0;
   public int field4006 = 0;
   public int field4007 = 1711775317;
   public int field4008 = 0;
   public int field4009 = 0;
   public int field4010 = -1083720273;
   public int[][] field4011;
   public int field4012 = 853635893;
   public int field4013 = 1201368129;
   public boolean field4014 = true;
   public static class139 field4015;
   static int field4016;
   public static String field4017;

   void method2502(class907 var1, int var2, int var3) {
      try {
         if (1 == var2) {
            this.field3969 = var1.method6423(1235052657) * -512849763;
            this.field3975 = var1.method6423(1235052657) * -1216995793;
         } else if (2 == var2) {
            this.field4013 = var1.method6423(1235052657) * -1201368129;
         } else if (var2 == 3) {
            this.field3980 = var1.method6423(1235052657) * 1316025001;
         } else if (4 == var2) {
            this.field3985 = var1.method6423(1235052657) * -1511636755;
         } else if (5 == var2) {
            this.field3986 = var1.method6423(1235052657) * 1034489103;
         } else if (var2 == 6) {
            this.field3979 = var1.method6423(1235052657) * -1261244237;
         } else if (var2 == 7) {
            this.field4007 = var1.method6423(1235052657) * -1711775317;
         } else if (var2 == 8) {
            this.field4004 = var1.method6423(1235052657) * -1593946535;
         } else if (9 == var2) {
            this.field3982 = var1.method6423(1235052657) * 1566713043;
         } else if (26 == var2) {
            this.field3993 = (short)(var1.method6371() * 4) * 1013056483;
            this.field3994 = (short)(var1.method6371() * 4) * -1453025501;
         } else {
            int var4;
            int var5;
            if (var2 == 27) {
               if (this.field3968 == null) {
                  this.field3968 = new int[this.field3983.field7019.field1542.length][];
               }

               var4 = var1.method6371();
               this.field3968[var4] = new int[6];

               for(var5 = 0; var5 < 6; ++var5) {
                  this.field3968[var4][var5] = var1.method6367(2080193946);
               }
            } else if (var2 == 28) {
               var4 = var1.method6371();
               this.field3990 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field3990[var5] = var1.method6371();
                  if (this.field3990[var5] == 255) {
                     this.field3990[var5] = -1;
                  }
               }
            } else if (var2 == 29) {
               this.field4002 = var1.method6371() * 115903875;
            } else if (var2 == 30) {
               this.field4003 = var1.method6374() * 719028937;
            } else if (31 == var2) {
               this.field3984 = var1.method6371() * -369164975;
            } else if (32 == var2) {
               this.field4005 = var1.method6374() * 1012239243;
            } else if (33 == var2) {
               this.field4006 = var1.method6367(1712856653) * 92325015;
            } else if (34 == var2) {
               this.field3978 = var1.method6371() * 477826083;
            } else if (var2 == 35) {
               this.field4008 = var1.method6374() * -1803824059;
            } else if (36 == var2) {
               this.field4009 = var1.method6367(1850319623) * 1175766897;
            } else if (37 == var2) {
               this.field4010 = var1.method6371() * 1083720273;
            } else if (38 == var2) {
               this.field3973 = var1.method6423(1235052657) * 241536037;
            } else if (39 == var2) {
               this.field3991 = var1.method6423(1235052657) * -1442268255;
            } else if (var2 == 40) {
               this.field3999 = var1.method6423(1235052657) * 564296781;
            } else if (var2 == 41) {
               this.field3977 = var1.method6423(1235052657) * -1440097851;
            } else if (42 == var2) {
               this.field3981 = var1.method6423(1235052657) * 1270333873;
            } else if (var2 == 43) {
               this.field3996 = var1.method6423(1235052657) * 697230329;
            } else if (44 == var2) {
               this.field4012 = var1.method6423(1235052657) * -853635893;
            } else if (var2 == 45) {
               this.field3974 = var1.method6374() * -928434405;
            } else if (46 == var2) {
               this.field3987 = var1.method6423(1235052657) * 537960313;
            } else if (var2 == 47) {
               this.field4001 = var1.method6423(1235052657) * 1019547381;
            } else if (48 == var2) {
               this.field3989 = var1.method6423(1235052657) * -1402060193;
            } else if (var2 == 49) {
               this.field3997 = var1.method6423(1235052657) * -549936551;
            } else if (50 == var2) {
               this.field3995 = var1.method6423(1235052657) * -71356649;
            } else if (var2 == 51) {
               this.field3988 = var1.method6423(1235052657) * -1236000399;
            } else if (52 == var2) {
               var4 = var1.method6371();
               this.field3970 = new int[var4];
               this.field3971 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field3970[var5] = var1.method6423(1235052657);
                  int var6 = var1.method6371();
                  this.field3971[var5] = var6;
                  this.field3972 += var6 * 81529747;
               }
            } else if (var2 == 53) {
               this.field4014 = false;
            } else if (var2 == 54) {
               this.field3992 = (var1.method6371() << 6) * 989376361;
               this.field3998 = (var1.method6371() << 6) * -1343302987;
            } else if (55 == var2) {
               if (this.field4000 == null) {
                  this.field4000 = new int[this.field3983.field7019.field1542.length];
               }

               var4 = var1.method6371();
               this.field4000[var4] = var1.method6374();
            } else if (var2 == 56) {
               if (this.field4011 == null) {
                  this.field4011 = new int[this.field3983.field7019.field1542.length][];
               }

               var4 = var1.method6371();
               this.field4011[var4] = new int[3];

               for(var5 = 0; var5 < 3; ++var5) {
                  this.field4011[var4][var5] = var1.method6367(1788063911);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "op.f(" + ')');
      }
   }

   public class135[] method2503(byte var1) {
      try {
         if (this.field3976 != null) {
            return this.field3976;
         } else if (this.field3968 == null) {
            return null;
         } else {
            this.field3976 = new class135[this.field3968.length];

            for(int var2 = 0; var2 < this.field3968.length; ++var2) {
               int var3 = 0;
               int var4 = 0;
               int var5 = 0;
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               if (this.field3968[var2] != null) {
                  var3 = this.field3968[var2][0];
                  var4 = this.field3968[var2][1];
                  var5 = this.field3968[var2][2];
                  var6 = this.field3968[var2][3] << 3;
                  var7 = this.field3968[var2][4] << 3;
                  var8 = this.field3968[var2][5] << 3;
               }

               if (var3 == 0 && var4 == 0 && var5 == 0 && var6 == 0 && var7 == 0 && var8 == 0) {
                  if (var1 <= 12) {
                     throw new IllegalStateException();
                  }
               } else {
                  class135 var9 = this.field3976[var2] = new class135();
                  if (var8 != 0) {
                     var9.method1025(0.0F, 0.0F, 1.0F, class703.method2002(var8));
                  }

                  if (var6 != 0) {
                     var9.method1025(1.0F, 0.0F, 0.0F, class703.method2002(var6));
                  }

                  if (var7 != 0) {
                     var9.method1025(0.0F, 1.0F, 0.0F, class703.method2002(var7));
                  }

                  var9.method1018((float)var3, (float)var4, (float)var5);
               }
            }

            return this.field3976;
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "op.i(" + ')');
      }
   }

   public int method2504(int var1) {
      try {
         if (this.field3969 * -809747019 != -1) {
            return this.field3969 * -809747019;
         } else if (this.field3970 == null) {
            return -1;
         } else {
            int var2 = (int)(Math.random() * (double)(-5125477 * this.field3972));

            int var3;
            for(var3 = 0; var2 >= this.field3971[var3]; ++var3) {
               var2 -= this.field3971[var3];
            }

            return this.field3970[var3];
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "op.b(" + ')');
      }
   }

   public boolean method2505(int var1, byte var2) {
      try {
         if (-1 == var1) {
            return false;
         } else if (var1 == -809747019 * this.field3969) {
            return true;
         } else {
            if (this.field3970 != null) {
               for(int var3 = 0; var3 < this.field3970.length; ++var3) {
                  if (var1 == this.field3970[var3]) {
                     return true;
                  }
               }
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "op.p(" + ')');
      }
   }

   public int[] method2506(int var1) {
      try {
         class6 var2 = new class6(16);
         class735.method1803(-809747019 * this.field3969, var2, -518506092);
         int[] var3;
         int var4;
         if (this.field3970 != null) {
            var3 = this.field3970;

            for(var4 = 0; var4 < var3.length; ++var4) {
               int var5 = var3[var4];
               class735.method1803(var5, var2, -996745872);
            }
         }

         class735.method1803(844607405 * this.field3973, var2, -1466126807);
         class735.method1803(1061677153 * this.field3991, var2, -537938152);
         class735.method1803(-129111857 * this.field3975, var2, -1080833419);
         class735.method1803(this.field3999 * -277799803, var2, -1770644447);
         class735.method1803(315374861 * this.field3977, var2, -1518977416);
         class735.method1803(this.field3981 * -1532631215, var2, -674677793);
         class735.method1803(230243963 * this.field3979, var2, -1811756409);
         class735.method1803(491753731 * this.field4007, var2, -1070117202);
         class735.method1803(-2054940183 * this.field4004, var2, -891093089);
         class735.method1803(-783166629 * this.field3982, var2, -2016176230);
         class735.method1803(this.field4013 * 328817727, var2, -1375066780);
         class735.method1803(this.field3980 * -1238642279, var2, -1493937450);
         class735.method1803(this.field3985 * -907666203, var2, -1237374124);
         class735.method1803(124010991 * this.field3986, var2, -707153443);
         class735.method1803(this.field3987 * 371497673, var2, -455707757);
         class735.method1803(this.field4001 * -279532195, var2, -455027567);
         class735.method1803(this.field3989 * 1885772191, var2, -507782637);
         class735.method1803(this.field3997 * 914130409, var2, -997447340);
         class735.method1803(this.field3995 * 250017959, var2, -1792088224);
         class735.method1803(this.field3988 * -119373935, var2, -909523000);
         var3 = new int[var2.method2944(1901508554)];
         var4 = 0;

         class568 var6;
         for(Iterator var8 = var2.iterator(); var8.hasNext(); var3[var4++] = (int)(var6.field641 * 7051297995265073167L)) {
            var6 = (class568)var8.next();
         }

         return var3;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "op.k(" + ')');
      }
   }

   void method2507(class907 var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               if (var2 != 162499609) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method2502(var1, var3, -247907698);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "op.a(" + ')');
      }
   }

   static final void method2508(class744 var0, short var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3158 -= 1938723502;
         String var3 = (String)var0.field3157[var0.field3158 * -203050393];
         String var4 = (String)var0.field3157[1 + var0.field3158 * -203050393];
         if (var3.length() <= 500 && var4.length() <= 500) {
            class69.method1341(var2, var3, var4, 600657777);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "op.aps(" + ')');
      }
   }

   static final void method2509(class744 var0, int var1) {
      try {
         class721.field3635 = 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "op.abp(" + ')');
      }
   }

   public static class312 method2510(int var0, int var1, short var2) {
      try {
         class673.field7510.field476 = var0 * -760677635;
         class673.field7510.field475 = var1 * 167105303;
         class673.field7510.field477 = -1544157451;
         class673.field7510.field478 = -1468199503;
         return class673.field7510;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "op.a(" + ')');
      }
   }

   public static int method2511(int var0, int var1, float var2, int var3) {
      try {
         return class109.method1210(var0, var1, (int)var2, 1963059640);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "op.x(" + ')');
      }
   }

   static final void method2512(class744 var0, int var1) {
      try {
         class615.field8903.method5391(class615.field8903.field9142, 0, -1906997591);
         class95.method523(656179282);
         class730.field2647 = false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "op.anv(" + ')');
      }
   }

   static final void method2513(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class615.field8903.field9113.method2273(var2, 1352882135);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "op.aoc(" + ')');
      }
   }

   static void method2514(int var0) {
      try {
         if (class342.field278 * 256666041 < 102) {
            class342.field278 += 879545142;
         }

         int var1;
         if (-917301319 * class342.field284 != -1 && 3224865510845692061L * class7.field4919 < class27.method3468((byte)1)) {
            for(var1 = class342.field284 * -917301319; var1 < class342.field289.length; ++var1) {
               if (class342.field289[var1].startsWith("pause")) {
                  int var2 = 5;

                  try {
                     var2 = Integer.parseInt(class342.field289[var1].substring(6));
                  } catch (Exception var9) {
                     ;
                  }

                  class213.method3810("Pausing for " + var2 + " seconds...", 270683370);
                  class342.field284 = (var1 + 1) * -1428832631;
                  class7.field4919 = (class27.method3468((byte)1) + (long)(1000 * var2)) * 6717445677357895093L;
                  return;
               }

               class342.field281 = class342.field289[var1];
               class600.method5464(false, 1496417723);
            }

            class342.field284 = 1428832631;
         }

         if (1170859143 * class730.field2663 != 0) {
            class342.field283 -= class730.field2663 * 1787831191;
            if (class342.field283 * -1731316011 >= class342.field282 * -2035787443) {
               class342.field283 = class342.field282 * -1477098343 - 205738621;
            }

            if (-1731316011 * class342.field283 < 0) {
               class342.field283 = 0;
            }

            class730.field2663 = 0;
         }

         for(var1 = 0; var1 < 1351936279 * class730.field2876; ++var1) {
            class742 var12 = class730.field2691[var1];
            int var3 = var12.method1865((byte)-29);
            char var4 = var12.method1864((byte)-110);
            int var5 = var12.method1867((byte)0);
            if (84 == var3) {
               class600.method5464(false, 1496417723);
            }

            if (var3 == 80) {
               class600.method5464(true, 1496417723);
            } else if (var3 == 66 && (var5 & 4) != 0) {
               if (class397.field6496 != null) {
                  String var13 = "";

                  for(int var14 = class342.field287.length - 1; var14 >= 0; --var14) {
                     if (class342.field287[var14] != null && class342.field287[var14].length() > 0) {
                        var13 = var13 + class342.field287[var14] + '\n';
                     }
                  }

                  class397.field6496.setContents(new StringSelection(var13), (ClipboardOwner)null);
               }
            } else if (67 == var3 && (var5 & 4) != 0) {
               if (class397.field6496 != null) {
                  try {
                     Transferable var6 = class397.field6496.getContents((Object)null);
                     if (var6 != null) {
                        String var7 = (String)var6.getTransferData(DataFlavor.stringFlavor);
                        if (var7 != null) {
                           String[] var8 = class715.method2097(var7, '\n', 1017779885);
                           class264.method4568(var8, 399274522);
                        }
                     }
                  } catch (Exception var10) {
                     ;
                  }
               }
            } else if (var3 == 85 && -1182747927 * class342.field279 > 0) {
               class342.field281 = class342.field281.substring(0, -1182747927 * class342.field279 - 1) + class342.field281.substring(class342.field279 * -1182747927);
               class342.field279 -= 1914783065;
            } else if (101 == var3 && -1182747927 * class342.field279 < class342.field281.length()) {
               class342.field281 = class342.field281.substring(0, -1182747927 * class342.field279) + class342.field281.substring(1 + class342.field279 * -1182747927);
            } else if (var3 == 96 && class342.field279 * -1182747927 > 0) {
               class342.field279 -= 1914783065;
            } else if (var3 == 97 && -1182747927 * class342.field279 < class342.field281.length()) {
               class342.field279 += 1914783065;
            } else if (102 == var3) {
               class342.field279 = 0;
            } else if (103 == var3) {
               class342.field279 = class342.field281.length() * 1914783065;
            } else if (104 == var3 && -1217082313 * class342.field285 < class342.field287.length) {
               class342.field285 += -1305958009;
               class264.method4569(-214283222);
               class342.field279 = class342.field281.length() * 1914783065;
            } else if (105 == var3 && -1217082313 * class342.field285 > 0) {
               class342.field285 -= -1305958009;
               class264.method4569(1763987987);
               class342.field279 = class342.field281.length() * 1914783065;
            } else if (class50.method1498(var4, (short)160) || "\\/.:, _-+[]~@".indexOf(var4) != -1) {
               class342.field281 = class342.field281.substring(0, -1182747927 * class342.field279) + class730.field2691[var1].method1864((byte)9) + class342.field281.substring(class342.field279 * -1182747927);
               class342.field279 += 1914783065;
            }
         }

         class730.field2876 = 0;
         class730.field2668 = 0;
         class881.method6172(2005471811);
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "op.u(" + ')');
      }
   }
}
