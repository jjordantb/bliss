import java.applet.Applet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class class833 {
   int field9170 = 0;
   public char field9171;
   int field9172;
   HashMap field9173;
   Map field9174;
   Object[] field9175;
   public char field9176;
   String field9177 = "null";
   public static Applet field9178;

   public String method5423(int var1, byte var2) {
      try {
         Object var3 = this.method5427(var1, (short)5996);
         return var3 == null ? this.field9177 : (String)var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "tx.p(" + ')');
      }
   }

   void method5424(class907 var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               return;
            }

            this.method5425(var1, var3, 950174382);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "tx.a(" + ')');
      }
   }

   void method5425(class907 var1, int var2, int var3) {
      try {
         if (1 == var2) {
            this.field9176 = class954.method2092(var1.method6372(-12558881), 2015897871);
         } else if (var2 == 2) {
            this.field9171 = class954.method2092(var1.method6372(-12558881), 1877656812);
         } else if (3 == var2) {
            this.field9177 = var1.method6379(1756453424);
         } else if (4 == var2) {
            this.field9172 = var1.method6420((byte)94) * -1961153765;
         } else {
            int var4;
            int var5;
            if (var2 != 5 && var2 != 6) {
               if (7 == var2 || 8 == var2) {
                  var4 = var1.method6374();
                  this.field9170 = var1.method6374() * -1158380671;
                  this.field9175 = new Object[var4];

                  for(var5 = 0; var5 < -1179140991 * this.field9170; ++var5) {
                     int var8 = var1.method6374();
                     if (var2 == 7) {
                        this.field9175[var8] = var1.method6379(1730348772);
                     } else {
                        this.field9175[var8] = new Integer(var1.method6420((byte)-14));
                     }
                  }
               }
            } else {
               this.field9170 = var1.method6374() * -1158380671;
               this.field9174 = new HashMap(-1179140991 * this.field9170);

               for(var4 = 0; var4 < this.field9170 * -1179140991; ++var4) {
                  var5 = var1.method6420((byte)-59);
                  Object var6;
                  if (var2 == 5) {
                     var6 = var1.method6379(-968722088);
                  } else {
                     var6 = new Integer(var1.method6420((byte)-67));
                  }

                  this.field9174.put(new Integer(var5), var6);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "tx.f(" + ')');
      }
   }

   public int method5426(int var1, int var2) {
      try {
         Object var3 = this.method5427(var1, (short)31709);
         return var3 == null ? this.field9172 * -1363462381 : ((Integer)var3).intValue();
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "tx.b(" + ')');
      }
   }

   Object method5427(int var1, short var2) {
      try {
         if (this.field9175 != null) {
            return var1 >= 0 && var1 < this.field9175.length ? this.field9175[var1] : null;
         } else {
            return this.field9174 != null ? this.field9174.get(new Integer(var1)) : null;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "tx.i(" + ')');
      }
   }

   public boolean method5428(Object var1, byte var2) {
      try {
         if (this.field9170 * -1179140991 == 0) {
            return false;
         } else {
            if (this.field9173 == null) {
               this.method5431(671224629);
            }

            return this.field9173.containsKey(var1);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "tx.k(" + ')');
      }
   }

   public int[] method5429(Object var1, short var2) {
      try {
         if (this.field9170 * -1179140991 == 0) {
            return null;
         } else {
            if (this.field9173 == null) {
               this.method5431(817562642);
            }

            return (int[])this.field9173.get(var1);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "tx.d(" + ')');
      }
   }

   public int method5430(byte var1) {
      try {
         return this.field9170 * -1179140991;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "tx.u(" + ')');
      }
   }

   void method5431(int var1) {
      try {
         HashMap var2 = new HashMap();
         Object var5;
         Iterator var11;
         Entry var12;
         if (this.field9175 != null) {
            for(int var3 = 0; var3 < this.field9175.length; ++var3) {
               if (this.field9175[var3] != null) {
                  Object var4 = this.field9175[var3];
                  var5 = (List)var2.get(var4);
                  if (var5 == null) {
                     var5 = new LinkedList();
                     var2.put(var4, var5);
                  }

                  ((List)var5).add(new Integer(var3));
               }
            }
         } else {
            if (this.field9174 == null) {
               throw new IllegalStateException();
            }

            Object var6;
            for(var11 = this.field9174.entrySet().iterator(); var11.hasNext(); ((List)var6).add(var12.getKey())) {
               var12 = (Entry)var11.next();
               var5 = var12.getValue();
               var6 = (List)var2.get(var5);
               if (var6 == null) {
                  var6 = new LinkedList();
                  var2.put(var5, var6);
               }
            }
         }

         this.field9173 = new HashMap();
         var11 = var2.entrySet().iterator();

         while(var11.hasNext()) {
            var12 = (Entry)var11.next();
            List var13 = (List)var12.getValue();
            int[] var14 = new int[var13.size()];
            int var7 = 0;

            Integer var9;
            for(Iterator var8 = var13.iterator(); var8.hasNext(); var14[var7++] = var9.intValue()) {
               var9 = (Integer)var8.next();
            }

            this.field9173.put(var12.getKey(), var14);
         }

      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "tx.x(" + ')');
      }
   }

   public static String method5432(byte var0) {
      try {
         String var1 = "www";
         if (class916.field10413 == class721.field3634) {
            var1 = "www-wtrc";
         } else if (class721.field3634 == class916.field10412) {
            var1 = "www-wtqa";
         } else if (class916.field10418 == class721.field3634) {
            var1 = "www-wtwip";
         } else if (class916.field10411 == class721.field3634) {
            var1 = "www-wti";
         }

         String var2 = "";
         if (class730.field2909 != null) {
            var2 = "/p=" + class730.field2909;
         }

         String var3 = class730.field2926.field7321 + ".com";
         return "http://" + var1 + "." + var3 + "/l=" + class321.field1066 + "/a=" + class730.field2646 * -1154804873 + var2 + "/";
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "tx.nn(" + ')');
      }
   }

   static void method5433(int var0, int var1, int var2, byte var3) {
      try {
         class682 var4 = class370.method881(11, (long)var0);
         var4.method4340((byte)23);
         var4.field7687 = 1274450087 * var1;
         var4.field7685 = var2 * 293101103;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "tx.aj(" + ')');
      }
   }
}
