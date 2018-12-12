public class class324 extends class834 {
   class655 field616;
   class655 field617;
   class344 field618 = new class344();
   class655 field619;
   class655 field620;
   public static class48[] field621;
   class223 field622;

   boolean method531(int var1) throws class934 {
      try {
         this.field622 = super.field9169.method556("Particle");
         this.field619 = this.field622.method4086("WVPMatrix", -1445644688);
         this.field617 = this.field622.method4086("DiffuseSampler", -471804579);
         this.field620 = this.field622.method4086("TexCoordMatrix", 1156990928);
         this.field616 = this.field622.method4086("DiffuseColour", -16804392);
         this.field622.method4057(this.field622.method4056(-1437671487));
         return true;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "yx.t(" + ')');
      }
   }

   public void method5412(class344 var1) {
      try {
         this.field618.method269(var1);
         this.field618.method271(super.field9169.field695);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "yx.a(" + ')');
      }
   }

   public void method5411() {
      try {
         this.method532(-351671930);
         super.field9169.method648();
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "yx.b(" + ')');
      }
   }

   void method532(int var1) {
      try {
         this.field622.method4057(this.field622.method4056(-1437671487));
         this.field622.method4066();
         this.field622.method4067(this.field617, 0, super.field9166, -1031634630);
         this.field622.method4094(this.field619, this.field618, 600012267);
         this.field622.method4063(this.field620, super.field9168, (byte)67);
         this.field622.method4089(this.field616, super.field9167, 1962930050);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "yx.h(" + ')');
      }
   }

   public class324(class325 var1) throws class934 {
      super(var1);
      this.method531(34022465);
   }

   public void method5410(int var1) {
      try {
         this.method532(33439591);
         super.field9169.method651(class427.field7386, 0, 4 * var1, 0, 2 * var1);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "yx.f(" + ')');
      }
   }
}
