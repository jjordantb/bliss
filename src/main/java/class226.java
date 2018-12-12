import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class226 extends AbstractQueue {
   Map field7330;
   class71[] field7331;
   int field7332;
   Comparator field7333;
   int field7334;

   static void method4023(int var0) {
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

   void method4024(int var1, int var2) {
      try {
         class71 var3 = this.field7331[var1];

         int var9;
         for(int var4 = this.field7332 * -400292665 >>> 1; var1 < var4; var1 = var9) {
            int var5 = 1 + (var1 << 1);
            class71 var6 = this.field7331[var5];
            int var7 = 2 + (var1 << 1);
            class71 var8 = this.field7331[var7];
            if (this.field7333 != null) {
               if (var7 < this.field7332 * -400292665 && this.field7333.compare(var6.field1433, var8.field1433) > 0) {
                  var9 = var7;
               } else {
                  var9 = var5;
               }
            } else if (var7 < this.field7332 * -400292665 && ((Comparable)var6.field1433).compareTo(var8.field1433) > 0) {
               var9 = var7;
            } else {
               var9 = var5;
            }

            if (this.field7333 != null) {
               if (this.field7333.compare(var3.field1433, this.field7331[var9].field1433) <= 0) {
                  if (var2 <= -2010017327) {
                     throw new IllegalStateException();
                  }
                  break;
               }
            } else if (((Comparable)var3.field1433).compareTo(this.field7331[var9].field1433) <= 0) {
               if (var2 <= -2010017327) {
                  throw new IllegalStateException();
               }
               break;
            }

            this.field7331[var1] = this.field7331[var9];
            this.field7331[var1].field1432 = var1 * 533229453;
         }

         this.field7331[var1] = var3;
         this.field7331[var1].field1432 = var1 * 533229453;
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "ajy.b(" + ')');
      }
   }

   class226(int var1, Comparator var2) {
      this.field7334 = 0;
      this.field7331 = new class71[var1];
      this.field7330 = new HashMap();
      this.field7333 = var2;
   }

   void method4025(int var1) {
      try {
         int var2 = 1 + (this.field7331.length << 1);
         this.field7331 = (class71[])Arrays.copyOf(this.field7331, var2);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajy.a(" + ')');
      }
   }

   public int size() {
      try {
         return -400292665 * this.field7332;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ajy.size(" + ')');
      }
   }

   public boolean contains(Object var1) {
      try {
         return this.field7330.containsKey(var1);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajy.contains(" + ')');
      }
   }

   public Object poll() {
      try {
         if (-400292665 * this.field7332 == 0) {
            return null;
         } else {
            this.field7334 += 1445240763;
            Object var1 = this.field7331[0].field1433;
            this.field7330.remove(var1);
            this.field7332 -= -2003206921;
            if (-400292665 * this.field7332 == 0) {
               this.field7331[-400292665 * this.field7332] = null;
            } else {
               this.field7331[0] = this.field7331[this.field7332 * -400292665];
               this.field7331[0].field1432 = 0;
               this.field7331[this.field7332 * -400292665] = null;
               this.method4024(0, 280830604);
            }

            return var1;
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ajy.poll(" + ')');
      }
   }

   void method4026(int var1, int var2) {
      try {
         class71 var3;
         int var4;
         for(var3 = this.field7331[var1]; var1 > 0; var1 = var4) {
            var4 = var1 - 1 >>> 1;
            class71 var5 = this.field7331[var4];
            if (this.field7333 != null) {
               if (this.field7333.compare(var3.field1433, var5.field1433) >= 0) {
                  if (var2 >= 802255489) {
                     return;
                  }
                  break;
               }
            } else if (((Comparable)var3.field1433).compareTo(var5.field1433) >= 0) {
               if (var2 >= 802255489) {
                  throw new IllegalStateException();
               }
               break;
            }

            this.field7331[var1] = var5;
            this.field7331[var1].field1432 = 533229453 * var1;
         }

         this.field7331[var1] = var3;
         this.field7331[var1].field1432 = 533229453 * var1;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ajy.f(" + ')');
      }
   }

   public Object[] toArray() {
      try {
         Object[] var1 = super.toArray();
         if (this.field7333 != null) {
            Arrays.sort(var1, this.field7333);
         } else {
            Arrays.sort(var1);
         }

         return var1;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ajy.toArray(" + ')');
      }
   }

   public Iterator iterator() {
      try {
         return new class72(this);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ajy.iterator(" + ')');
      }
   }

   public Object peek() {
      try {
         return this.field7332 * -400292665 == 0 ? null : this.field7331[0].field1433;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ajy.peek(" + ')');
      }
   }

   public class226(int var1) {
      this(var1, (Comparator)null);
   }

   public boolean offer(Object var1) {
      try {
         if (this.field7330.containsKey(var1)) {
            throw new IllegalArgumentException("");
         } else {
            this.field7334 += 1445240763;
            int var2 = -400292665 * this.field7332;
            if (var2 >= this.field7331.length) {
               this.method4025(-1001796105);
            }

            this.field7332 += -2003206921;
            if (var2 == 0) {
               this.field7331[0] = new class71(var1, 0);
               this.field7330.put(var1, this.field7331[0]);
            } else {
               this.field7331[var2] = new class71(var1, var2);
               this.field7330.put(var1, this.field7331[var2]);
               this.method4026(var2, -2059212806);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajy.offer(" + ')');
      }
   }

   public boolean remove(Object var1) {
      try {
         class71 var2 = (class71)this.field7330.remove(var1);
         if (var2 == null) {
            return false;
         } else {
            this.field7334 += 1445240763;
            this.field7332 -= -2003206921;
            if (-29201595 * var2.field1432 == -400292665 * this.field7332) {
               this.field7331[this.field7332 * -400292665] = null;
               return true;
            } else {
               class71 var3 = this.field7331[this.field7332 * -400292665];
               this.field7331[-400292665 * this.field7332] = null;
               this.field7331[var2.field1432 * -29201595] = var3;
               this.field7331[-29201595 * var2.field1432].field1432 = var2.field1432 * 1;
               this.method4024(-29201595 * var2.field1432, 1851130853);
               if (this.field7331[-29201595 * var2.field1432] == var3) {
                  this.method4026(-29201595 * var2.field1432, -1459206324);
               }

               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ajy.remove(" + ')');
      }
   }

   static final void method4027(class744 var0, byte var1) {
      try {
         class519.method2669((String)var0.field3157[(var0.field3158 -= 969361751) * -203050393], false, false, 945299991);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajy.afx(" + ')');
      }
   }
}
