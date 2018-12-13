import java.util.Collection;
import java.util.Iterator;

public class class373 implements Iterable, Collection {
   public Node field1104 = new Node();
   Node field1105;

   public void method897(Node var1, int var2) {
      try {
         if (var1.field642 != null) {
            var1.method545(-1460969981);
         }

         var1.field642 = this.field1104.field642;
         var1.field640 = this.field1104;
         var1.field642.field640 = var1;
         var1.field640.field642 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sr.f(" + ')');
      }
   }

   public Node method898(int var1) {
      try {
         Node var2 = this.field1104.field640;
         if (var2 == this.field1104) {
            return null;
         } else {
            var2.method545(-1460969981);
            return var2;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.p(" + ')');
      }
   }

   void method899(class373 var1, Node var2, byte var3) {
      try {
         Node var4 = this.field1104.field642;
         this.field1104.field642 = var2.field642;
         var2.field642.field640 = this.field1104;
         if (this.field1104 != var2) {
            var2.field642 = var1.field1104.field642;
            var2.field642.field640 = var2;
            var4.field640 = var1.field1104;
            var1.field1104.field642 = var4;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sr.i(" + ')');
      }
   }

   public void method900(class373 var1, int var2) {
      try {
         if (this.field1104 != this.field1104.field640) {
            this.method899(var1, this.field1104.field640, (byte)-5);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sr.k(" + ')');
      }
   }

   public Node method901(int var1) {
      try {
         return this.method907((Node)null, 65280);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.d(" + ')');
      }
   }

   Node method902(Node var1, byte var2) {
      try {
         Node var3;
         if (var1 == null) {
            var3 = this.field1104.field642;
         } else {
            var3 = var1;
         }

         if (this.field1104 == var3) {
            this.field1105 = null;
            return null;
         } else {
            this.field1105 = var3.field642;
            return var3;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sr.r(" + ')');
      }
   }

   Node[] method903(byte var1) {
      try {
         Node[] var2 = new Node[this.method910(1828905535)];
         int var3 = 0;

         for(Node var4 = this.field1104.field640; var4 != this.field1104; var4 = var4.field640) {
            var2[var3++] = var4;
         }

         return var2;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sr.y(" + ')');
      }
   }

   public Iterator iterator() {
      try {
         return new class19(this);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sr.iterator(" + ')');
      }
   }

   public boolean isEmpty() {
      try {
         return this.method908(1085448128);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sr.isEmpty(" + ')');
      }
   }

   public boolean contains(Object var1) {
      try {
         throw new RuntimeException();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.contains(" + ')');
      }
   }

   public Object[] toArray() {
      try {
         return this.method903((byte)7);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sr.toArray(" + ')');
      }
   }

   public Node method904(int var1) {
      try {
         return this.method902((Node)null, (byte)4);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.x(" + ')');
      }
   }

   public boolean remove(Object var1) {
      try {
         throw new RuntimeException();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.remove(" + ')');
      }
   }

   public boolean containsAll(Collection var1) {
      try {
         throw new RuntimeException();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.containsAll(" + ')');
      }
   }

   public boolean addAll(Collection var1) {
      try {
         throw new RuntimeException();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.addAll(" + ')');
      }
   }

   public boolean removeAll(Collection var1) {
      try {
         throw new RuntimeException();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.removeAll(" + ')');
      }
   }

   public boolean retainAll(Collection var1) {
      try {
         throw new RuntimeException();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.retainAll(" + ')');
      }
   }

   public void clear() {
      try {
         this.method905((byte)1);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sr.clear(" + ')');
      }
   }

   public boolean add(Object var1) {
      try {
         return this.method911((Node)var1, (byte)-121);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.add(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.equals(" + ')');
      }
   }

   public int hashCode() {
      try {
         return super.hashCode();
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sr.hashCode(" + ')');
      }
   }

   public void method905(byte var1) {
      try {
         while(this.field1104.field640 != this.field1104) {
            this.field1104.field640.method545(-1460969981);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.a(" + ')');
      }
   }

   public Object[] toArray(Object[] var1) {
      try {
         int var2 = 0;

         for(Node var3 = this.field1104.field640; this.field1104 != var3; var3 = var3.field640) {
            var1[var2++] = var3;
         }

         return var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sr.toArray(" + ')');
      }
   }

   public Node method906(int var1) {
      try {
         Node var2 = this.field1105;
         if (this.field1104 == var2) {
            this.field1105 = null;
            return null;
         } else {
            this.field1105 = var2.field640;
            return var2;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.q(" + ')');
      }
   }

   Node method907(Node var1, int var2) {
      try {
         Node var3;
         if (var1 == null) {
            var3 = this.field1104.field640;
         } else {
            var3 = var1;
         }

         if (this.field1104 == var3) {
            this.field1105 = null;
            return null;
         } else {
            this.field1105 = var3.field640;
            return var3;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sr.u(" + ')');
      }
   }

   public class373() {
      this.field1104.field640 = this.field1104;
      this.field1104.field642 = this.field1104;
   }

   public int size() {
      try {
         return this.method910(1828905535);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "sr.size(" + ')');
      }
   }

   public boolean method908(int var1) {
      try {
         return this.field1104 == this.field1104.field640;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.z(" + ')');
      }
   }

   public Node method909(int var1) {
      try {
         Node var2 = this.field1105;
         if (var2 == this.field1104) {
            this.field1105 = null;
            return null;
         } else {
            this.field1105 = var2.field642;
            return var2;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.n(" + ')');
      }
   }

   public int method910(int var1) {
      try {
         int var2 = 0;

         for(Node var3 = this.field1104.field640; this.field1104 != var3; var3 = var3.field640) {
            ++var2;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sr.s(" + ')');
      }
   }

   boolean method911(Node var1, byte var2) {
      try {
         this.method897(var1, 289942482);
         return true;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sr.t(" + ')');
      }
   }

   static final void method912(class744 var0, byte var1) {
      try {
         if (class730.field2914 >= 5 && class730.field2914 <= 9) {
            var0.field3161[++var0.field3156 - 1] = 1;
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sr.ur(" + ')');
      }
   }

   public static void method913(int var0, int var1, int var2, ObjectDefinition var3, int var4) {
      try {
         for(class206 var5 = (class206)class206.field7064.method901(1766612795); var5 != null; var5 = (class206)class206.field7064.method906(49146)) {
            if (var0 == var5.field7067 && var5.field7068 == var1 << 9 && var5.field7066 == var2 << 9 && var3.field2197 == var5.field7078.field2197) {
               if (var5.field7090 != null) {
                  class56.field2321.method3875(var5.field7090);
                  var5.field7090 = null;
               }

               if (var5.field7069 != null) {
                  class56.field2321.method3875(var5.field7069);
                  var5.field7069 = null;
               }

               var5.method545(-1460969981);
               break;
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "sr.i(" + ')');
      }
   }

   static final void method914(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class416.method5647(var3, var4, var0, -638652080);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sr.lc(" + ')');
      }
   }
}
