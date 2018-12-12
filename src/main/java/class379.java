public class class379 {
   static class48 field1139;
   public static int field1140;

   class379() throws Throwable {
      throw new Error();
   }

   static final void method960(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-36);
         class131 var4 = class382.field1410[var2 >> 16];
         class51.method1535(var3, var4, var0, (byte)1);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "py.fj(" + ')');
      }
   }

   static final void method961(class744 var0, int var1) {
      try {
         var0.field3156 -= 4;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         int var4 = var0.field3161[var0.field3156 + 2];
         int var5 = var0.field3161[3 + var0.field3156];
         class833 var6 = class808.field4598.method4721(var4, 1528209569);
         if (var6.field9176 == var2 && var6.field9171 == var3) {
            if (var3 == 115) {
               var0.field3157[++var0.field3158 - 1] = var6.method5423(var5, (byte)60);
            } else {
               var0.field3161[++var0.field3156 - 1] = var6.method5426(var5, 2053522267);
            }

         } else {
            throw new RuntimeException(var4 + " " + var5);
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "py.vz(" + ')');
      }
   }

   static final void method962(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9109.method6159((byte)45);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "py.afi(" + ')');
      }
   }

   static final void method963(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9124.method2273(var2, 1352882135);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "py.aoj(" + ')');
      }
   }

   static void method964(String var0, boolean var1, int var2, int var3, String var4, boolean var5, short var6) {
      try {
         var0 = var0.toLowerCase();
         short[] var7 = new short[16];
         int var8 = -1;
         String var9 = null;
         if (-1 != var2) {
            class785 var10 = class452.field7216.method5148(var2, -871094304);
            if (var10 == null || var10.method2380(1883696427) != var5) {
               return;
            }

            if (var10.method2380(1883696427)) {
               var9 = var10.field3823;
            } else {
               var8 = var10.field3822;
            }
         }

         int var16 = 0;

         for(int var11 = 0; var11 < class85.field1121.field2328; ++var11) {
            ItemDefinition var12 = class85.field1121.method1569(var11, true);
            if ((!var1 || var12.field4252) && -1 == var12.field4273 && -1 == var12.field4236 && var12.field4288 == -1) {
               if (var12.field4283 != 0) {
                  if (var6 == 8221) {
                     return;
                  }
               } else if (var12.name.toLowerCase().indexOf(var0) == -1) {
                  if (var6 == 8221) {
                     throw new IllegalStateException();
                  }
               } else {
                  if (var2 != -1) {
                     if (var5) {
                        if (!var4.equals(var12.method2687(var2, var9, (short)24753))) {
                           if (var6 == 8221) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }
                     } else if (var3 != var12.method2683(var2, var8, -2091980999)) {
                        continue;
                     }
                  }

                  if (var16 >= 250) {
                     class198.field7051 = -1;
                     class396.field6515 = null;
                     return;
                  }

                  if (var16 >= var7.length) {
                     short[] var13 = new short[2 * var7.length];

                     for(int var14 = 0; var14 < var16; ++var14) {
                        var13[var14] = var7[var14];
                     }

                     var7 = var13;
                  }

                  var7[var16++] = (short)var11;
               }
            }
         }

         class396.field6515 = var7;
         class721.field3635 = 0;
         class198.field7051 = var16;
         String[] var17 = new String[class198.field7051];

         for(int var18 = 0; var18 < class198.field7051; ++var18) {
            var17[var18] = class85.field1121.method1566(var7[var18]).name;
         }

         class830.method5378(var17, class396.field6515, -1747372319);
      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "py.nh(" + ')');
      }
   }

   static final void method965(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class602.method5085(var3, var4, var0, -2016583860);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "py.ms(" + ')');
      }
   }

   static final void method966(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class673.method4261((byte)-27) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "py.ahe(" + ')');
      }
   }

   static final void method967(class744 var0, int var1) {
      try {
         class327 var2 = class459.method3965(-598938437);
         if (var2 != null) {
            boolean var3 = var2.method5(class491.field7820 + class896.field9358, class747.field4148 + class491.field7813, class384.field1429, -1054516511);
            if (var3) {
               var0.field3161[++var0.field3156 - 1] = class384.field1429[1];
               var0.field3161[++var0.field3156 - 1] = class384.field1429[2];
            } else {
               var0.field3161[++var0.field3156 - 1] = -1;
               var0.field3161[++var0.field3156 - 1] = -1;
            }
         } else {
            var0.field3161[++var0.field3156 - 1] = -1;
            var0.field3161[++var0.field3156 - 1] = -1;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "py.aeg(" + ')');
      }
   }

   public static void method968(int var0, byte var1) {
      try {
         class682 var2 = class370.method881(1, (long)var0);
         var2.method4336(-1820151665);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "py.p(" + ')');
      }
   }
}
