import java.util.Iterator;

public final class NodeTable implements Iterable { // class 792

   Node[] field4923;
   Node field4924;
   long field4925;
   int field4926;
   Node field4927;
   int field4928 = 0;
   static int field4929;
   public static class969 field4930;
   public static class416 field4931;

   public void method2941(byte var1) {
      try {
         for(int var2 = 0; var2 < this.field4926; ++var2) {
            Node var3 = this.field4923[var2];

            while(true) {
               Node var4 = var3.field640;
               if (var3 == var4) {
                  break;
               }

               var4.method545(-1460969981);
            }
         }

         this.field4924 = null;
         this.field4927 = null;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sa.i(" + ')');
      }
   }

   public Node method2942(long var1) {
      try {
         this.field4925 = var1;
         Node var3 = this.field4923[(int)(var1 & (long)(this.field4926 - 1))];

         for(this.field4924 = var3.field640; this.field4924 != var3; this.field4924 = this.field4924.field640) {
            if (this.field4924.field641 == var1) {
               Node var4 = this.field4924;
               this.field4924 = this.field4924.field640;
               return var4;
            }
         }

         this.field4924 = null;
         return null;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sa.a(" + ')');
      }
   }

   public Node method2943(int var1) {
      try {
         if (this.field4924 == null) {
            return null;
         } else {
            for(Node var2 = this.field4923[(int)(this.field4925 & (long)(this.field4926 - 1))]; this.field4924 != var2; this.field4924 = this.field4924.field640) {
               if (this.field4925 == this.field4924.field641) {
                  Node var3 = this.field4924;
                  this.field4924 = this.field4924.field640;
                  return var3;
               }
            }

            this.field4924 = null;
            return null;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sa.f(" + ')');
      }
   }

   public int method2944(int var1) {
      try {
         int var2 = 0;

         for(int var3 = 0; var3 < this.field4926; ++var3) {
            Node var4 = this.field4923[var3];

            for(Node var5 = var4.field640; var4 != var5; var5 = var5.field640) {
               ++var2;
            }
         }

         return var2;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "sa.b(" + ')');
      }
   }

   public Node method2945(byte var1) {
      try {
         Node var2;
         if (this.field4928 > 0 && this.field4927 != this.field4923[this.field4928 - 1]) {
            var2 = this.field4927;
            this.field4927 = var2.field640;
            return var2;
         } else {
            while(this.field4928 < this.field4926) {
               var2 = this.field4923[++this.field4928 - 1].field640;
               if (var2 != this.field4923[this.field4928 - 1]) {
                  this.field4927 = var2.field640;
                  return var2;
               }
            }

            return null;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sa.d(" + ')');
      }
   }

   public Iterator iterator() {
      try {
         return new class521(this);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sa.iterator(" + ')');
      }
   }

   public Node method2946(int var1) {
      try {
         this.field4928 = 0;
         return this.method2945((byte)67);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sa.k(" + ')');
      }
   }

   public void method2947(Node var1, long var2) {
      try {
         if (var1.field642 != null) {
            var1.method545(-1460969981);
         }

         Node var4 = this.field4923[(int)(var2 & (long)(this.field4926 - 1))];
         var1.field642 = var4.field642;
         var1.field640 = var4;
         var1.field642.field640 = var1;
         var1.field640.field642 = var1;
         var1.field641 = var2;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sa.p(" + ')');
      }
   }

   public NodeTable(int var1) {
      this.field4926 = var1;
      this.field4923 = new Node[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         Node var3 = this.field4923[var2] = new Node();
         var3.field640 = var3;
         var3.field642 = var3;
      }

   }

   static void method2948(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, boolean var14, int var15) {
      try {
         if (var1 != 0 && -1 != var3) {
            Object var16 = null;
            int var17;
            if (var1 < 0) {
               var17 = -var1 - 1;
               if (var17 == class730.field2623) {
                  var16 = class923.local;
               } else {
                  var16 = class730.loaded[var17];
               }
            } else {
               var17 = var1 - 1;
               class437 var18 = (class437)class730.field2677.method2942((long)var17);
               if (var18 != null) {
                  var16 = (Actor)var18.field7515;
               }
            }

            if (var16 != null) {
               class507 var21 = ((Actor)var16).method2554(95049522);
               if (var21.field3968 != null && var21.field3968[var3] != null) {
                  var4 -= var21.field3968[var3][1];
               }

               if (var21.field4011 != null && var21.field4011[var3] != null) {
                  var4 -= var21.field4011[var3][1];
               }
            }
         }

         class214 var20 = new class214(class730.field2697.method5317(-1611682495), var0, class509.field4023, class509.field4023, var6, var7, var4, class730.field2866 + var10, class730.field2866 + var11, var12, var13, var1, var2, var5, var14, var3);
         var20.method3782(var8, var9, class679.method4271(var8, var9, class509.field4023, -968708982) - var5, class730.field2866 + var10, 1068285759);
         class730.field2805.method897(new class107(var20), 520361177);
      } catch (RuntimeException var19) {
         throw class158.method3445(var19, "sa.nu(" + ')');
      }
   }
}
