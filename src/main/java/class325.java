import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.I;
import jaclib.memory.heap.NativeHeap;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import sun.misc.Unsafe;

public abstract class class325 extends class848 {
   class525 field646;
   class936 field647 = new class936();
   class344 field648 = new class344();
   class344 field649;
   static int field650 = -1;
   static int field651 = 2;
   static int field652 = 4;
   class344 field653;
   static int field654 = 55;
   static int field655 = 7;
   protected static int field656 = 100663296;
   class919 field657;
   protected boolean field658;
   int[] field659;
   public ByteBuffer field660;
   public long field661;
   int field662 = 4194304;
   public Unsafe field663;
   class696 field664;
   NativeHeap field665;
   class599 field666 = new class599();
   public int field667;
   public int field668;
   static class344 field669 = new class344();
   class135 field670 = new class135();
   class344 field671 = new class344();
   class135 field672 = new class135();
   class135 field673 = new class135();
   public class344 field674 = new class344();
   class344 field675 = new class344();
   class135 field676 = new class135();
   protected int field677;
   protected int field678;
   class135 field679 = new class135();
   protected class344 field680 = new class344();
   protected boolean field681;
   class32 field682 = new class32();
   protected int field683;
   boolean field684 = false;
   protected int field685;
   boolean field686;
   class344 field687;
   class344 field688;
   protected boolean field689;
   class344 field690;
   class344 field691;
   protected float[] field692;
   class834 field693;
   class135 field694;
   public class344 field695;
   float[][] field696;
   float field697;
   protected boolean field698;
   float field699;
   float field700;
   class523 field701;
   protected float field702;
   float field703;
   float field704;
   protected float field705;
   class941 field706;
   protected int field707;
   protected boolean field708;
   protected int field709;
   class638 field710;
   class412[] field711;
   protected class119 field712;
   int field713;
   int field714;
   int field715;
   protected int field716;
   protected int field717;
   protected int field718;
   protected int field719;
   protected int field720;
   protected boolean field721;
   protected boolean field722;
   protected boolean field723;
   class404 field724;
   protected boolean field725;
   protected boolean field726;
   public float[] field727;
   class816 field728;
   float[] field729;
   protected class639[] field730;
   int field731;
   class412[] field732;
   public float field733;
   public float field734;
   protected float field735;
   protected float field736;
   protected float field737;
   protected class584[] field738;
   protected int field739;
   protected int field740;
   int field741;
   int field742;
   int field743;
   static Object field744 = new Object();
   class801 field745;
   static int field746 = 8;
   class659[] field747;
   protected class344[] field748;
   protected class90[] field749;
   class92 field750;
   protected class584[] field751;
   protected float field752;
   protected boolean field753;
   public class801 field754;
   int field755;
   float[] field756 = new float[4];
   int field757;
   class911 field758;
   class911[] field759;
   class605 field760;
   int field761;
   protected int field762;
   class698 field763;
   class404 field764;
   class270 field765;
   static int field766 = 1;
   static int field767 = 2;
   class442[] field768;
   protected int field769;
   boolean field770;
   boolean field771;
   int field772;
   float field773;
   boolean field774;
   protected boolean field775;
   protected int field776;
   public class344 field777;
   protected int field778;
   protected float field779;
   protected float field780;
   class92 field781;
   class344 field782 = new class344();
   protected int field783;
   float[] field784;
   public int field785;
   public int field786;
   class525 field787;
   boolean field788;
   class74 field789;
   int field790;
   public int field791;
   protected int field792;
   public boolean field793;
   protected boolean field794;
   class489 field795;
   static int field796 = 1;
   int field797;
   class525 field798;
   static int field799 = 128;
   class92 field800;
   int field801;
   class92 field802;
   class92 field803;
   class920 field804;
   class180 field805;
   public float field806;
   class344 field807;
   public float field808;
   protected boolean field809;
   protected int field810;

   abstract void method551(int var1);

   public void method552(class524 var1) {
      this.field647.method6274(var1, -1339142220);
   }

   void method553() {
      ArrayList var1 = this.field647.method6273(500882138);
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class524 var3 = (class524)var2.next();
         var3.method2755();
      }

   }

   public abstract boolean method554();

   public final void method555(int var1, class557 var2) {
      this.method686(var1, var2, false, false);
   }

   public abstract class223 method556(String var1);

   byte[] method557(String var1, String var2) {
      return this.field805.method3271(var1, var2, -2042628011);
   }

   class222 method558(byte[] var1) {
      if (var1 == null) {
         return null;
      } else {
         try {
            class222 var2 = new class222(var1);
            return var2;
         } catch (Exception var4) {
            return null;
         }
      }
   }

   public abstract void method559(class344 var1, class344 var2, class344 var3);

   final class344 method560() {
      return this.field777;
   }

   public final void method561() {
      this.field747 = new class659[this.field791];
      this.field748 = new class344[this.field791];
      this.field749 = new class90[this.field791];
      this.field738 = new class584[this.field791];
      this.field751 = new class584[this.field791];

      for(int var1 = 0; var1 < this.field791; ++var1) {
         this.field751[var1] = class584.field295;
         this.field738[var1] = class584.field295;
         this.field749[var1] = class90.field551;
         this.field748[var1] = new class344();
      }

      this.field730 = new class639[this.field792 - 2];
      int[] var3 = new int[]{-1};
      this.field754 = this.method614(1, 1, false, var3, 0, 0);
      var3[0] = -16777216;
      this.field745 = this.method614(1, 1, false, var3, 0, 0);
      this.method4850(new class820(262144));
      this.field803 = this.method663(new class39[]{new class39(new class61[]{class61.field1601, class61.field1590})});
      this.method663(new class39[]{new class39(new class61[]{class61.field1601, class61.field1588})});
      this.field802 = this.method663(new class39[]{new class39(class61.field1601), new class39(class61.field1588), new class39(class61.field1590), new class39(class61.field1587)});
      this.field750 = this.method663(new class39[]{new class39(class61.field1601), new class39(class61.field1588), new class39(class61.field1590)});

      for(int var2 = 0; var2 < 7; ++var2) {
         this.field732[var2] = new class412(this, 0, 0, false, false);
         this.field711[var2] = new class412(this, 0, 0, true, true);
      }

      this.method661();
      this.field804 = this.method640(true);
      this.method722();
      this.method4942();
      this.method4827();
      this.method5046();
      this.field764 = new class404(this, this.field754);
      this.field724 = new class404(this, this.field745);
      this.method4831(3, 0);
   }

   class911 method563(int var1) {
      return this.field759[var1];
   }

   abstract void method564();

   void method565() {
      this.field765.method6606();
      this.field646.method2755();
      this.field787.method2755();
      this.field798.method2755();

      for(int var1 = 0; var1 < 7; ++var1) {
         this.field711[var1].method5580();
      }

      this.field789.method1101();
      this.field804.method2755();
   }

   void method566() {
      this.field765.method6601();

      for(int var1 = 0; var1 < this.field768.length; ++var1) {
         if (this.field768[var1] != null && this.field768[var1].method4364()) {
            this.field768[var1].method4357();
         }
      }

      this.field789 = new class74(this);
      this.method567();
      this.method568();
      this.method679();
      this.field789.method1100(this);
   }

   final void method567() {
      this.field646 = this.method641(false);
      short var1 = 160;
      this.field646.method2237(var1, 32);
      this.field660.clear();
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field660.putInt(-1);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(1.0F);
      this.field660.putFloat(0.0F);
      this.field660.putInt(-1);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(1.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(1.0F);
      this.field660.putFloat(1.0F);
      this.field660.putFloat(1.0F);
      this.field660.putFloat(0.0F);
      this.field660.putInt(-1);
      this.field660.putFloat(1.0F);
      this.field660.putFloat(1.0F);
      this.field660.putFloat(1.0F);
      this.field660.putFloat(1.0F);
      this.field660.putFloat(1.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field660.putInt(-1);
      this.field660.putFloat(1.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(1.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field660.putInt(-1);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field646.method1977(0, this.field660.position(), this.field661);
      this.field800 = this.method663(new class39[]{new class39(new class61[]{class61.field1601, class61.field1588, class61.field1590, class61.field1590})});
   }

   final void method568() {
      this.field787 = this.method641(true);
      this.field787.method2237(24, 12);
      this.field781 = this.method663(new class39[]{new class39(class61.field1601)});
   }

   boolean method570(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field660.clear();
      this.field660.putFloat(var1);
      this.field660.putFloat(var2);
      this.field660.putFloat(var3);
      this.field660.putFloat(var4);
      this.field660.putFloat(var5);
      this.field660.putFloat(var6);
      return this.field787.method1977(0, this.field660.position(), this.field661);
   }

   void method4846() {
      if (!this.field788) {
         this.method565();
         this.field795.method4726();

         for(class568 var1 = this.field666.method1281(1389781376); var1 != null; var1 = this.field666.method1283((byte)-7)) {
            ((class820)var1).method2995();
         }

         class82.method919(false, true, (short)2786);

         int var2;
         for(var2 = 0; var2 < this.field759.length; ++var2) {
            if (this.field759[var2] != null) {
               this.field759[var2].method6465();
               this.field759[var2] = null;
            }
         }

         for(var2 = 0; var2 < this.field768.length; ++var2) {
            if (this.field768[var2] != null) {
               this.field768[var2].method4365();
               this.field768[var2] = null;
            }
         }

         this.method553();
         this.method4801(0);
         this.field788 = true;
      }

   }

   public final boolean method4814() {
      return true;
   }

   public final boolean method4908() {
      return true;
   }

   final class920 method571(int var1) {
      if (this.field804.method1974() < var1 * 2) {
         this.field804.method6489(var1);
      }

      return this.field804;
   }

   public final boolean method4878() {
      return this.field768[1] != null;
   }

   public final boolean method4807() {
      return true;
   }

   public final boolean method5028() {
      return true;
   }

   final void method573() {
      this.field777.method269(this.field653);
      this.method594(this.field777);
      this.field752 = (this.field777.field325[14] - this.field777.field325[15]) / (this.field777.field325[11] - this.field777.field325[10]);
      this.field705 = -this.field777.field325[14] / this.field777.field325[10];
      this.method636();
   }

   public final boolean method4879() {
      return false;
   }

   public final boolean method4855() {
      return this.field794;
   }

   public abstract float method574();

   public void method4801(int var1) {
      if (this.field795 != null) {
         this.field795.method4725();
      }

      this.field786 = var1 & Integer.MAX_VALUE;
   }

   final class344 method575() {
      return this.field748[this.field769];
   }

   void method576() {
      this.method678();
      this.method577();
      this.method595();
      this.method4824();
      this.method4827();
   }

   public final boolean method4881() {
      if (this.field768[1] != null && !this.field768[1].method4364()) {
         boolean var1 = this.field765.method6602(this.field768[1]);
         if (var1) {
            this.field795.method4726();
         }

         return var1;
      } else {
         return false;
      }
   }

   public final void method4882() {
      if (this.field768[1] != null && this.field768[1].method4364()) {
         this.field765.method6605(this.field768[1]);
         this.field795.method4726();
      }

   }

   public final boolean method4883() {
      return this.field768[1] != null && this.field768[1].method4364();
   }

   final void method5060(float var1, float var2, float var3, float var4, float var5, float var6) {
      class57.field2349 = var1;
      class57.field2351 = var2;
      class57.field2350 = var3;
      class57.field2353 = var6;
   }

   public final void method4885(int var1, int var2, int var3, int var4) {
      this.field765.method6608(var1, var2, var3, var4);
   }

   public final void method4968() {
      this.field765.method6604();
   }

   public final class792 method4849(int var1) {
      class820 var2 = new class820(var1);
      this.field666.method1282(var2, 864912510);
      return var2;
   }

   final void method577() {
      this.field774 = false;
      this.method666();
      if (this.field706 == class941.field10351) {
         this.method573();
      }

   }

   public final int method4802() {
      return this.field668 + this.field667 + this.field762;
   }

   public final class48 method4852(int var1, int var2, boolean var3, boolean var4) {
      return new class404(this, var1, var2, var3, var4);
   }

   public final class48 method4982(class922 var1, boolean var2) {
      class48 var9;
      if (var1.field10269 != 0 && var1.field10273 != 0) {
         int[] var3 = new int[var1.field10269 * var1.field10273];
         int var4 = 0;
         int var5 = 0;
         int var6;
         int var7;
         if (var1.field10276 != null) {
            for(var6 = 0; var6 < var1.field10273; ++var6) {
               for(var7 = 0; var7 < var1.field10269; ++var7) {
                  var3[var5++] = var1.field10276[var4] << 24 | var1.field10274[var1.field10275[var4] & 255];
                  ++var4;
               }
            }
         } else {
            for(var6 = 0; var6 < var1.field10273; ++var6) {
               for(var7 = 0; var7 < var1.field10269; ++var7) {
                  int var8 = var1.field10274[var1.field10275[var4++] & 255];
                  var3[var5++] = var8 != 0 ? -16777216 | var8 : 0;
               }
            }
         }

         var9 = this.method4854(var3, 0, var1.field10269, var1.field10269, var1.field10273, -268200852);
      } else {
         var9 = this.method4854(new int[1], 0, 1, 1, 1, -938706176);
      }

      var9.method3104(var1.field10272, var1.field10268, var1.field10271, var1.field10270);
      return var9;
   }

   public final class48 method4853(int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      return new class404(this, var4, var5, var1, var2, var3);
   }

   public final class23 method4857(int var1, int var2, int[] var3, int[] var4) {
      return class121.method1622(this, var1, var2, var3, var4);
   }

   public final void method5038(int var1) {
   }

   abstract void method579();

   public final class454 method4864(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
      return new class894(this, var6, var7, var1, var2, var3, var4, var5);
   }

   public final class344 method4860() {
      return this.field807;
   }

   public final class135 method5048() {
      return this.field694;
   }

   public final class621 method4851(int var1, int var2, int var3, int var4, int var5, int var6) {
      return new class450(this, var1, var2, var3, var4, var5, var6);
   }

   public final class891 method580() {
      return this.field728 != null ? this.field728.method2898() : null;
   }

   public void method4824() {
      this.field742 = 0;
      this.field801 = 0;
      this.field713 = super.field8574.method2481();
      this.field714 = super.field8574.method2493();
      this.method581();
   }

   final void method581() {
      if (this.field706 == class941.field10351) {
         this.field783 = this.field742;
         this.field716 = this.field801;
         this.field717 = this.field713;
         this.field683 = this.field714;
         this.field779 = this.field703;
         this.field702 = this.field704;
      } else {
         this.field783 = 0;
         this.field716 = 0;
         this.field717 = super.field8574.method2481();
         this.field683 = super.field8574.method2493();
         this.field779 = 0.0F;
         this.field702 = 1.0F;
      }

      this.method584();
      this.field773 = (float)this.field713 / 2.0F;
      this.field700 = (float)this.field714 / 2.0F;
      this.field697 = (float)this.field742 + this.field773;
      this.field699 = (float)this.field801 + this.field700;
   }

   public void method582(class524 var1) {
      this.field647.method6271(var1, field744, -391880689);
   }

   final void method583(int var1, int var2) {
      this.field719 = var1;
      this.field720 = var2;
      this.method584();
      this.method585();
   }

   abstract void method584();

   abstract void method585();

   abstract void method586();

   final class344 method587() {
      return this.field706 == class941.field10351 ? this.field674 : field669;
   }

   final class344 method588() {
      return this.field706 == class941.field10351 ? this.field675 : field669;
   }

   public final void method4867(class135 var1) {
      this.field672 = var1;
      this.field674.method272(this.field672);
      this.field673.method1024(var1);
      this.field673.method1012();
      this.field675.method272(this.field673);
      this.method762();
      if (this.field706 == class941.field10351) {
         this.method590();
      }

   }

   public final void method5054(class344 var1) {
      this.field690.method269(var1);
      this.method762();
      if (this.field706 == class941.field10351) {
         this.method573();
      }

   }

   final void method589(boolean var1) {
      if (var1 != this.field722) {
         this.field722 = var1;
         this.method638();
         this.field755 &= -16;
      }

   }

   public final class344 method4870() {
      return this.field690;
   }

   final void method590() {
      this.field684 = false;
   }

   void method591() {
      this.method576();
   }

   final class344 method593() {
      return this.field695;
   }

   public abstract void method594(class344 var1);

   final void method595() {
      if (this.field706 != class941.field10349) {
         class941 var1 = this.field706;
         this.field706 = class941.field10349;
         if (var1 == class941.field10351) {
            this.method590();
         }

         this.field653 = this.field691;
         this.method573();
         this.method581();
         this.field755 &= -16;
      }

   }

   final void method596() {
      if (this.field706 != class941.field10350) {
         class941 var1 = this.field706;
         this.field706 = class941.field10350;
         if (var1 == class941.field10351) {
            this.method590();
         }

         this.method702();
         this.field653 = this.field687;
         this.method573();
         this.method581();
         this.field755 &= -9;
      }

   }

   final void method597() {
      if (this.field706 != class941.field10351) {
         this.field706 = class941.field10351;
         this.method590();
         this.method666();
         this.field653 = this.field690;
         this.method573();
         this.method581();
         this.field755 &= -8;
      }

   }

   public final class727 method4936(class230 var1, class922[] var2, boolean var3) {
      return new class875(this, var1, var2, var3);
   }

   public final void method4869(boolean var1) {
      this.field721 = var1;
      this.method669();
   }

   final void method598(boolean var1) {
      if (var1 != this.field723) {
         this.field723 = var1;
         this.method599();
         this.field755 &= -16;
      }

   }

   abstract void method599();

   public void method4890(float var1, float var2, float var3, float[] var4) {
      float var5 = this.field649.field325[15] + this.field649.field325[3] * var1 + this.field649.field325[7] * var2 + this.field649.field325[11] * var3;
      float var6 = this.field649.field325[12] + this.field649.field325[0] * var1 + this.field649.field325[4] * var2 + this.field649.field325[8] * var3;
      float var7 = this.field649.field325[13] + this.field649.field325[1] * var1 + this.field649.field325[5] * var2 + this.field649.field325[9] * var3;
      float var8 = this.field674.field325[14] + this.field674.field325[2] * var1 + this.field674.field325[6] * var2 + this.field674.field325[10] * var3;
      var4[0] = this.field697 + this.field773 * var6 / var5;
      var4[1] = this.field699 + this.field700 * var7 / var5;
      var4[2] = var8;
   }

   public int method4848(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      float var8 = this.field649.field325[14] + this.field649.field325[2] * (float)var1 + this.field649.field325[6] * (float)var2 + this.field649.field325[10] * (float)var3;
      float var9 = this.field649.field325[14] + this.field649.field325[2] * (float)var4 + this.field649.field325[6] * (float)var5 + this.field649.field325[10] * (float)var6;
      float var10 = this.field649.field325[15] + this.field649.field325[3] * (float)var1 + this.field649.field325[7] * (float)var2 + this.field649.field325[11] * (float)var3;
      float var11 = this.field649.field325[15] + this.field649.field325[3] * (float)var4 + this.field649.field325[7] * (float)var5 + this.field649.field325[11] * (float)var6;
      if (var8 < -var10 && var9 < -var11) {
         var7 |= 16;
      } else if (var8 > var10 && var9 > var11) {
         var7 |= 32;
      }

      float var12 = this.field649.field325[12] + this.field649.field325[0] * (float)var1 + this.field649.field325[4] * (float)var2 + this.field649.field325[8] * (float)var3;
      float var13 = this.field649.field325[12] + this.field649.field325[0] * (float)var4 + this.field649.field325[4] * (float)var5 + this.field649.field325[8] * (float)var6;
      if (var12 < -var10 && var13 < -var11) {
         var7 |= 1;
      }

      if (var12 > var10 && var13 > var11) {
         var7 |= 2;
      }

      float var14 = this.field649.field325[13] + this.field649.field325[1] * (float)var1 + this.field649.field325[5] * (float)var2 + this.field649.field325[9] * (float)var3;
      float var15 = this.field649.field325[13] + this.field649.field325[1] * (float)var4 + this.field649.field325[5] * (float)var5 + this.field649.field325[9] * (float)var6;
      if (var14 < -var10 && var15 < -var11) {
         var7 |= 4;
      }

      if (var14 > var10 && var15 > var11) {
         var7 |= 8;
      }

      return var7;
   }

   public final int method4876() {
      return this.field792 - 2;
   }

   public final void method4829(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      if (super.field8574 != null) {
         var5 = super.field8574.method2481();
         var6 = super.field8574.method2493();
      } else {
         var6 = 0;
         var5 = 0;
      }

      var1 = var1 >= 0 ? var1 : 0;
      var3 = var3 <= var5 ? var3 : var5;
      var2 = var2 >= 0 ? var2 : 0;
      var4 = var4 <= var6 ? var4 : var6;
      boolean var7 = false;
      if (this.field709 < var1) {
         this.field709 = var1;
         var7 = true;
      }

      if (this.field678 > var3) {
         this.field678 = var3;
         var7 = true;
      }

      if (this.field707 < var2) {
         this.field707 = var2;
         var7 = true;
      }

      if (this.field685 > var4) {
         this.field685 = var4;
         var7 = true;
      }

      if (var7) {
         if (!this.field698) {
            this.field698 = true;
            this.method586();
         }

         this.method585();
      }

   }

   public final void method4844(int var1, class639[] var2) {
      for(int var3 = 0; var3 < var1; ++var3) {
         this.field730[var3] = var2[var3];
      }

      this.field740 = var1;
      if (this.field706 == class941.field10351) {
         this.method605();
      }

   }

   public final void method5063(float var1) {
      if (this.field735 != var1) {
         this.field735 = var1;
         this.method670();
         this.method579();
      }

   }

   public final void method4872(int var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var7 = this.field731 != var1;
      if (var7 || this.field808 != var2 || this.field737 != var3) {
         this.field731 = var1;
         this.field808 = var2;
         this.field737 = var3;
         if (var7) {
            this.field806 = (float)(this.field731 & 16711680) / 1.671168E7F;
            this.field733 = (float)(this.field731 & '\uff00') / 65280.0F;
            this.field734 = (float)(this.field731 & 255) / 255.0F;
            this.method670();
         }

         this.method602();
      }

      if (this.field729[0] != var4 || this.field729[1] != var5 || this.field729[2] != var6) {
         this.field729[0] = var4;
         this.field729[1] = var5;
         this.field729[2] = var6;
         this.field784[0] = -var4;
         this.field784[1] = -var5;
         this.field784[2] = -var6;
         float var8 = (float)(1.0D / Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6)));
         this.field727[0] = var4 * var8;
         this.field727[1] = var5 * var8;
         this.field727[2] = var6 * var8;
         this.field692[0] = -this.field727[0];
         this.field692[1] = -this.field727[1];
         this.field692[2] = -this.field727[2];
         this.method681();
         this.field743 = (int)(var4 * 256.0F / var5);
         this.field761 = (int)(var6 * 256.0F / var5);
      }

      this.method579();
   }

   public final void method4835(int var1) {
      for(this.field757 = 0; var1 > 1; var1 >>= 1) {
         ++this.field757;
      }

      this.field741 = 1 << this.field757;
   }

   abstract void method600();

   abstract void method602();

   abstract void method604();

   final void method605() {
      if (this.method697()) {
         this.method606();
      }

      this.field739 = this.field740;
      this.field740 = 0;
   }

   abstract void method606();

   abstract boolean method607(class264 var1, class482 var2);

   abstract boolean method608(class264 var1, class482 var2);

   final class801 method609(int var1, int var2, boolean var3, int[] var4) {
      return this.method614(var1, var2, var3, var4, 0, 0);
   }

   final class801 method610(class264 var1, int var2, int var3, boolean var4, byte[] var5) {
      return this.method698(var1, var2, var3, var4, var5, 0, 0);
   }

   final class801 method611(class264 var1, int var2, int var3, boolean var4, float[] var5) {
      return this.method712(var1, var2, var3, var4, var5, 0, 0);
   }

   abstract class801 method612(class264 var1, class482 var2, int var3, int var4);

   abstract class801 method614(int var1, int var2, boolean var3, int[] var4, int var5, int var6);

   abstract class33 method615(class264 var1, class482 var2, int var3, int var4);

   public final void method4875(boolean var1) {
   }

   public final void method616(int var1) {
      if (this.field769 != var1) {
         this.field769 = var1;
         this.method630();
      }

   }

   public final void method617(class659 var1) {
      if (this.field747[this.field769] != var1) {
         this.field747[this.field769] = var1;
         if (var1 != null) {
            var1.method5703();
         } else {
            this.field754.method5703();
         }

         this.field755 &= -2;
      }

   }

   public abstract void method618();

   public final void method619(int var1) {
      switch(var1) {
      case 0:
         this.method620(class584.field295, class584.field295);
         break;
      case 1:
         this.method620(class584.field300, class584.field300);
         break;
      case 2:
         this.method620(class584.field299, class584.field300);
         break;
      case 3:
         this.method620(class584.field297, class584.field295);
         break;
      case 4:
         this.method620(class584.field298, class584.field298);
      }

   }

   public final void method620(class584 var1, class584 var2) {
      boolean var3 = false;
      if (this.field738[this.field769] != var1) {
         this.field738[this.field769] = var1;
         this.method631();
         var3 = true;
      }

      if (this.field751[this.field769] != var2) {
         this.field751[this.field769] = var2;
         this.method703();
         var3 = true;
      }

      if (var3) {
         this.field755 &= -14;
      }

   }

   public final void method622(int var1, class557 var2) {
      this.method623(var1, var2, false);
   }

   abstract void method623(int var1, class557 var2, boolean var3);

   public final class344 method624() {
      return this.field748[this.field769];
   }

   public final void method625(class90 var1) {
      this.field749[this.field769] = var1;
      this.method627();
   }

   final void method626() {
      if (this.field749[this.field769] != class90.field551) {
         this.field749[this.field769] = class90.field551;
         this.field748[this.field769].method299();
         this.method627();
      }

   }

   final void method627() {
      this.method745();
   }

   abstract void method628();

   abstract void method630();

   abstract void method631();

   public final int method4817(int var1, int var2) {
      return var1 | var2;
   }

   class919 method632() {
      return this.field657;
   }

   public final void method4888() {
      this.field770 = false;
   }

   final void method633(int var1) {
      if (this.field797 != var1) {
         class119 var2;
         boolean var3;
         boolean var4;
         if (var1 == 1) {
            var2 = class119.field2149;
            var3 = true;
            var4 = true;
         } else if (var1 == 2) {
            var2 = class119.field2147;
            var3 = false;
            var4 = true;
         } else if (var1 == 128) {
            var2 = class119.field2148;
            var3 = true;
            var4 = true;
         } else {
            var2 = class119.field2150;
            var3 = false;
            var4 = false;
         }

         if (var3 != this.field753) {
            this.field753 = var3;
            this.method634();
         }

         if (var4 != this.field689) {
            this.field689 = var4;
            this.method564();
         }

         if (var2 != this.field712) {
            this.field712 = var2;
            this.method635();
         }

         this.field797 = var1;
         this.field755 &= -13;
      }

   }

   abstract void method634();

   abstract void method635();

   public final void method4874(int var1, int var2, int var3) {
      if (this.field776 != var1 || this.field677 != var2 || this.field778 != var3) {
         this.field776 = var1;
         this.field677 = var2;
         this.field778 = var3;
         this.method636();
         this.method638();
      }

   }

   final void method636() {
      if (this.field758 != null) {
         this.field758.method6476();
      }

      this.method637();
   }

   abstract void method637();

   abstract void method638();

   abstract void method639(boolean var1);

   abstract class920 method640(boolean var1);

   abstract class525 method641(boolean var1);

   public abstract void method642(int var1, class525 var2);

   abstract void method643(class920 var1);

   public final void method4838(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method4934(var1, var2, var1 + var3, var2, var5, var6);
      this.method4934(var1, var2 + var4, var1 + var3, var2 + var4, var5, var6);
      this.method4934(var1, var2, var1, var2 + var4, var5, var6);
      this.method4934(var1 + var3, var2, var1 + var3, var2 + var4, var5, var6);
   }

   public final void method4809(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9) {
   }

   public final void method4840(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {
   }

   public final int method645() {
      return this.field769;
   }

   public final void method4839(int var1, int var2, int var3, int var4, int var5) {
      this.method4934(var1, var2, var1 + var3, var2, var4, var5);
   }

   public final void method4843(int var1, int var2, int var3, int var4, int var5) {
      this.method4934(var1, var2, var1, var2 + var3, var4, var5);
   }

   public final void method4934(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method4811(var1, var2, var3, var4, var5, 1, var6);
   }

   public void method4863(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      float var10 = (float)var3 - (float)var1;
      float var11 = (float)var4 - (float)var2;
      if (var10 == 0.0F && var11 == 0.0F) {
         var10 = 1.0F;
      } else {
         float var12 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11)));
         var10 *= var12;
         var11 *= var12;
      }

      this.method596();
      class911 var23 = this.field759[13];
      var23.method6466();
      var23.method6468(var5);
      this.method633(var6);
      var23.method6471();
      this.method639(false);
      var9 %= var8 + var7;
      float var13 = var10 * (float)var7;
      float var14 = var11 * (float)var7;
      float var15 = 0.0F;
      float var16 = 0.0F;
      float var17 = var13;
      float var18 = var14;
      if (var9 > var7) {
         var15 = var10 * (float)(var7 + var8 - var9);
         var16 = var11 * (float)(var7 + var8 - var9);
      } else {
         var17 = var10 * (float)(var7 - var9);
         var18 = var11 * (float)(var7 - var9);
      }

      float var19 = (float)var1 + var15;
      float var20 = (float)var2 + var16;
      float var21 = var10 * (float)var8;
      float var22 = var11 * (float)var8;

      while(true) {
         if (var3 > var1) {
            if (var19 > (float)var3) {
               break;
            }

            if (var19 + var17 > (float)var3) {
               var17 = (float)var3 - var19;
            }
         } else {
            if (var19 < (float)var3) {
               break;
            }

            if (var19 + var17 < (float)var3) {
               var17 = (float)var3 - var19;
            }
         }

         if (var4 > var2) {
            if (var20 > (float)var4) {
               break;
            }

            if (var20 + var18 > (float)var4) {
               var18 = (float)var4 - var20;
            }
         } else {
            if (var20 < (float)var4) {
               break;
            }

            if (var20 + var18 < (float)var4) {
               var18 = (float)var4 - var20;
            }
         }

         if (!this.method570(var19, var20, 0.0F, var19 + var17, var20 + var18, 0.0F)) {
            return;
         }

         this.method647();
         var19 += var21 + var17;
         var20 += var22 + var18;
         var17 = var13;
         var18 = var14;
      }

      this.method639(true);
      var23.method6467();
   }

   public void method4820(int var1, int var2, int var3, int var4, int var5, int var6, class23 var7, int var8, int var9, int var10, int var11, int var12) {
   }

   public final void method4845(int var1, int var2, int var3, int var4, int var5, int var6, class23 var7, int var8, int var9) {
   }

   class344 method646() {
      if (this.field706 == class941.field10351) {
         if (!this.field684) {
            this.method736();
         }

         return this.field782;
      } else {
         return this.field671;
      }
   }

   public final void method4866(class874 var1) {
      this.field789.method1102(this, var1);
   }

   final void method647() {
      this.method642(0, this.field787);
      this.method714(this.field781);
      this.method657(class427.field7387, 0, 1);
   }

   public final void method648() {
      this.method649(class427.field7385, 2);
   }

   final void method649(class427 var1, int var2) {
      this.method642(0, this.field646);
      this.method714(this.field800);
      this.method657(var1, 0, var2);
   }

   public abstract void method651(class427 var1, int var2, int var3, int var4, int var5);

   final void method652() {
      if (this.field755 != 8) {
         this.method597();
         this.method589(true);
         this.method598(true);
         this.method658(true);
         this.method633(1);
         this.field755 = 8;
      }

   }

   abstract void method653(int var1);

   public final boolean method4804() {
      return true;
   }

   public final void method4830(int[] var1) {
      var1[0] = this.field709;
      var1[1] = this.field707;
      var1[2] = this.field678;
      var1[3] = this.field685;
   }

   final void method656(int var1) {
      if (this.field810 != var1) {
         this.field810 = var1;
         this.method635();
      }

   }

   public abstract void method657(class427 var1, int var2, int var3);

   final void method658(boolean var1) {
      if (var1 != this.field681) {
         this.field681 = var1;
         this.method669();
         this.field755 &= -16;
      }

   }

   final void method661() {
      this.field664 = new class696(this);
      this.field658 = false;

      try {
         this.field760 = new class10(this);
         this.field701 = new class527(this);
         this.field693 = new class324(this);
         this.field763 = new class698(this, this.field664, true);
         this.field710 = new class638(this, this.field664);
      } catch (Exception var3) {
         var3.printStackTrace();
         this.field760 = new class767(this);
         this.field701 = new class751(this);
         this.field693 = new class667(this);
         this.field763 = null;
         this.field710 = null;
         this.field658 = true;
      }

      int var1;
      int var2;
      if (super.field8574 != null) {
         var2 = super.field8574.method2481();
         var1 = super.field8574.method2493();
      } else {
         var1 = 0;
         var2 = 0;
      }

      this.field765 = new class270(this, var2, var1);
      if (!this.field658) {
         this.field768[1] = new class57(this);
         this.field765.method6602(this.field768[1]);
      }

      if (this.field758 != null) {
         this.field758.method6467();
         this.field758 = null;
      }

      this.method566();
   }

   abstract class92 method663(class39[] var1);

   final void method4841(int var1, int var2, int var3, int var4, int var5) {
   }

   public void method4826(float var1, float var2) {
      this.field703 = var1;
      this.field704 = var2;
      this.method581();
   }

   final void method666() {
      if (!this.field774) {
         this.field774 = true;
      }

   }

   public void method4889(float var1, float var2, float var3, float[] var4) {
      float var5 = this.field649.field325[14] + this.field649.field325[2] * var1 + this.field649.field325[6] * var2 + this.field649.field325[10] * var3;
      float var6 = this.field649.field325[15] + this.field649.field325[3] * var1 + this.field649.field325[7] * var2 + this.field649.field325[11] * var3;
      if (var5 >= -var6 && var5 <= var6) {
         float var7 = this.field649.field325[12] + this.field649.field325[0] * var1 + this.field649.field325[4] * var2 + this.field649.field325[8] * var3;
         if (var7 >= -var6 && var7 <= var6) {
            float var8 = this.field649.field325[13] + this.field649.field325[1] * var1 + this.field649.field325[5] * var2 + this.field649.field325[9] * var3;
            if (var8 >= -var6 && var8 <= var6) {
               float var9 = this.field674.field325[14] + this.field674.field325[2] * var1 + this.field674.field325[6] * var2 + this.field674.field325[10] * var3;
               var4[0] = this.field697 + this.field773 * var7 / var6;
               var4[1] = this.field699 + this.field700 * var8 / var6;
               var4[2] = var9;
            } else {
               var4[2] = Float.NaN;
               var4[1] = Float.NaN;
               var4[0] = Float.NaN;
            }
         } else {
            var4[2] = Float.NaN;
            var4[1] = Float.NaN;
            var4[0] = Float.NaN;
         }
      } else {
         var4[2] = Float.NaN;
         var4[1] = Float.NaN;
         var4[0] = Float.NaN;
      }

   }

   public class135 method4868() {
      return this.field672;
   }

   abstract void method669();

   abstract void method670();

   public final void method4986(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      if (super.field8574 != null) {
         var5 = super.field8574.method2481();
         var6 = super.field8574.method2493();
      } else {
         var6 = 0;
         var5 = 0;
      }

      if (var1 <= 0 && var3 >= var5 - 1 && var2 <= 0 && var4 >= var6 - 1) {
         this.method4827();
      } else {
         this.field709 = var1 >= 0 ? var1 : 0;
         this.field678 = var3 <= var5 ? var3 : var5;
         this.field707 = var2 >= 0 ? var2 : 0;
         this.field685 = var4 <= var6 ? var4 : var6;
         if (!this.field698) {
            this.field698 = true;
            this.method586();
         }

         this.method585();
      }

   }

   public void method673(int var1) {
      if (var1 != this.field718) {
         this.field718 = var1;
         this.method628();
      }

   }

   abstract class891 method674(int var1, boolean var2, int[][] var3);

   abstract class332 method675(class264 var1, int var2, int var3, int var4, boolean var5, byte[] var6);

   public final boolean method4916() {
      return true;
   }

   public final void method4850(class792 var1) {
      this.field665 = ((class820)var1).field4964;
   }

   final void method676(boolean var1) {
      if (var1 != this.field708) {
         this.field708 = var1;
         this.method600();
         this.field755 &= -8;
      }

   }

   final void method678() {
      this.field686 = false;
      if (this.field706 == class941.field10350) {
         this.method702();
         this.method573();
      }

   }

   final void method679() {
      this.field798 = this.method641(false);
      this.field798.method2237(3096, 12);
      this.field660.clear();
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);
      this.field660.putFloat(0.0F);

      for(int var1 = 0; var1 <= 256; ++var1) {
         double var2 = (double)(var1 * 2) * 3.141592653589793D / 256.0D;
         float var4 = (float)Math.cos(var2);
         float var5 = (float)Math.sin(var2);
         this.field660.putFloat(var5);
         this.field660.putFloat(var4);
         this.field660.putFloat(0.0F);
      }

      this.field798.method1977(0, this.field660.position(), this.field661);
   }

   public static boolean method680() {
      return class933.method6286(-1541888660).method3930("jaclib", 377960072);
   }

   abstract void method681();

   public final int method4836(int var1, int var2) {
      return var1 & var2 ^ var2;
   }

   abstract void method686(int var1, class557 var2, boolean var3, boolean var4);

   public final void method4827() {
      if (super.field8574 != null) {
         this.field707 = 0;
         this.field709 = 0;
         this.field678 = super.field8574.method2481();
         this.field685 = super.field8574.method2493();
      } else {
         this.field685 = 0;
         this.field678 = 0;
         this.field707 = 0;
         this.field709 = 0;
      }

      if (this.field698) {
         this.field698 = false;
         this.method586();
      }

   }

   class344 method690() {
      return this.field671;
   }

   final boolean method697() {
      return this.field658;
   }

   abstract class801 method698(class264 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7);

   public final void method4887(int var1, class919 var2) {
      if (!this.field770) {
         throw new RuntimeException("");
      } else {
         this.field772 = var1;
         this.field657 = var2;
         if (this.field771) {
            this.field759[3].method6469();
            this.field759[3].method6476();
         }

      }
   }

   final void method702() {
      if (!this.field686) {
         int var1;
         int var2;
         if (super.field8574 != null) {
            var1 = super.field8574.method2481();
            var2 = super.field8574.method2493();
         } else {
            var2 = 0;
            var1 = 0;
         }

         class344 var3 = this.field687;
         if (var1 != 0 && var2 != 0) {
            var3.method278(0.0F, (float)var1, 0.0F, (float)var2, -1.0F, 1.0F);
         } else {
            var3.method299();
         }

         this.field688.method269(var3);
         this.method594(this.field688);
         this.field686 = true;
      }

   }

   abstract void method703();

   public final void method4984(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field721) {
         this.method4869(false);
         this.field764.method3117(var1, var2, var3, var4, 0, var5, var6);
         this.method4869(true);
      } else {
         this.field764.method3117(var1, var2, var3, var4, 0, var5, var6);
      }

   }

   public void method5059(int var1, int var2, int var3, int var4) {
      this.field742 = var1;
      this.field801 = var2;
      this.field713 = var3;
      this.field714 = var4;
      this.method581();
   }

   public final class48 method4856(int var1, int var2, int var3, int var4, boolean var5) {
      class404 var6 = new class404(this, var3, var4, var5, false);
      var6.method3158(0, 0, var3, var4, var1, var2);
      return var6;
   }

   final void method709() {
      this.method670();
      this.method602();
      this.method600();
      this.method605();
      this.method681();
      this.method579();
      this.method604();
      this.method599();
      this.method669();
      this.method638();
      this.method637();
      this.method564();
      this.method635();
      this.method634();

      for(int var1 = this.field791 - 1; var1 >= 0; --var1) {
         this.method616(var1);
         this.method631();
         this.method703();
         this.method626();
      }

      this.method628();
      this.method584();
   }

   abstract class801 method712(class264 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7);

   public abstract void method714(class92 var1);

   class325(class478 var1, class180 var2, int var3, int var4) {
      super(var1);
      this.field706 = class941.field10349;
      this.field686 = false;
      this.field687 = new class344();
      this.field688 = new class344();
      this.field774 = false;
      this.field690 = new class344();
      this.field691 = new class344();
      this.field653 = this.field691;
      this.field777 = new class344();
      this.field649 = new class344();
      this.field695 = new class344();
      this.field696 = new float[6][4];
      this.field779 = 0.0F;
      this.field702 = 1.0F;
      this.field703 = 0.0F;
      this.field704 = 1.0F;
      this.field705 = 50.0F;
      this.field752 = 3584.0F;
      this.field707 = 0;
      this.field685 = 0;
      this.field709 = 0;
      this.field678 = 0;
      this.field742 = 0;
      this.field801 = 0;
      this.field713 = 0;
      this.field714 = 0;
      this.field783 = 0;
      this.field716 = 0;
      this.field717 = 0;
      this.field683 = 0;
      this.field719 = 0;
      this.field720 = 0;
      this.field721 = true;
      this.field681 = false;
      this.field723 = false;
      this.field708 = false;
      this.field725 = true;
      this.field726 = false;
      this.field727 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field692 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
      this.field729 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field784 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.field731 = 16777215;
      this.field806 = 1.0F;
      this.field733 = 1.0F;
      this.field734 = 1.0F;
      this.field735 = 1.0F;
      this.field808 = -1.0F;
      this.field737 = -1.0F;
      this.field741 = 8;
      this.field757 = 3;
      this.field715 = 128;
      this.field769 = 0;
      this.field759 = new class911[16];
      this.field768 = new class442[2];
      this.field771 = false;
      this.field775 = true;
      this.field776 = -1;
      this.field677 = -1;
      this.field778 = 0;
      this.field797 = 1;
      this.field712 = class119.field2149;
      this.field689 = true;
      this.field753 = true;
      this.field788 = false;
      new Stream();
      this.field732 = new class412[7];
      this.field711 = new class412[7];
      this.field807 = new class344();
      this.field694 = new class135();
      this.field810 = -1;

      try {
         this.field805 = var2;
         this.field785 = var3;
         this.field790 = var4;
         class771.method2300(false, true, -162450455);
         if (super.field8581 != null) {
            this.field795 = new class489(this, super.field8581);
         } else {
            this.field795 = null;
         }

         if (this.field790 == 0) {
            this.field659 = class134.field1398;
         } else {
            this.field659 = class543.field3819;
         }

         try {
            Field var5 = Unsafe.class.getDeclaredField("theUnsafe");
            var5.setAccessible(true);
            this.field663 = (Unsafe)var5.get((Object)null);
         } catch (Exception var6) {
            ;
         }

         this.field660 = ByteBuffer.allocateDirect(4194304);
         this.field660.order(ByteOrder.nativeOrder());
         this.field661 = DirectBufferHelper.getDirectBufferAddress(this.field660);
      } catch (Throwable var7) {
         var7.printStackTrace();
         this.method4996(887833658);
         if (var7 instanceof OutOfMemoryError) {
            throw (OutOfMemoryError)var7;
         }

         throw new RuntimeException("");
      }

      this.method4850(this.method4849(131072));
   }

   public final void method4811(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      var1 = (int)((float)var1 + 1.0F);
      var2 = (int)((float)var2 + 1.0F);
      var3 = (int)((float)var3 + 1.0F);
      var4 = (int)((float)var4 + 1.0F);
      float var8 = (float)(var3 - var1);
      float var9 = (float)(var4 - var2);
      float var10 = 1.0F / (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
      var8 *= var10;
      var9 *= var10;
      var1 = (int)((float)var1 - var8);
      var2 = (int)((float)var2 - var9);
      float var11 = -var9;
      var11 *= 0.5F * (float)var6;
      float var12 = var8 * 0.5F * (float)var6;
      this.field764.method3124((float)var1 - var11, (float)var2 - var12, (float)var3 - var11, (float)var4 - var12, (float)var1 + var11, (float)var2 + var12, 0, var5, var7);
   }

   void method722() {
      this.method551(7);
      this.method709();
   }

   public final void method726() {
      if (this.field755 != 2) {
         this.method596();
         this.method589(false);
         this.method676(false);
         this.method598(false);
         this.method658(false);
         this.field755 = 2;
      }

   }

   public final boolean method4810() {
      return true;
   }

   class135 method736() {
      if (this.field706 == class941.field10351) {
         if (!this.field684) {
            this.field676.method1024(this.field670);
            this.field676.method1027(this.field672);
            this.field782.method272(this.field676);
            this.field684 = true;
         }

         return this.field676;
      } else {
         return this.field670;
      }
   }

   public abstract boolean method742();

   abstract void method745();

   final void method762() {
      this.field649.method269(this.field674);
      this.field649.method271(this.field690);
      this.field649.method284(this.field696[0]);
      this.field649.method285(this.field696[1]);
      this.field649.method283(this.field696[2]);
      this.field649.method297(this.field696[3]);
      this.field649.method298(this.field696[4]);
      this.field649.method290(this.field696[5]);
      this.field695.method269(this.field649);
      this.method594(this.field695);
   }

   public final void method4886(int var1, class919 var2) {
      this.field772 = var1;
      this.field657 = var2;
      this.field770 = true;
   }

   public final void method4880(int var1, class23 var2, int var3, int var4) {
      this.method4869(false);
      this.field724.method3127(0.0F, 0.0F, (float)this.method4800((short)-25673).method2481(), 0.0F, 0.0F, (float)this.method4800((short)20678).method2493(), 0, var2, var3, var4);
      this.method4869(true);
   }

   public final void method4950(class621 var1) {
      this.field728 = (class816)var1;
   }

   public final class879 method4861(class25 var1, int var2, int var3, int var4, int var5) {
      return new class412(this, var1, var2, var4, var5, var3);
   }

   public final I method776(int var1, boolean var2) {
      return this.field665.f(var1, var2);
   }
}
