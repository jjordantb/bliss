import java.util.Calendar;
import java.util.TimeZone;

public class class308 {
   public static long field415 = 1000L;
   static Calendar field416 = Calendar.getInstance();
   static String[][] field417 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "M�r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "f�v", "mars", "avr", "mai", "juin", "juil", "ao�t", "sept", "oct", "nov", "d�c"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}};
   static Calendar field418 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   static int field419 = -1;

   class308() throws Throwable {
      throw new Error();
   }

   static boolean method381(int var0, int var1) {
      try {
         return var0 == 59 || var0 == 2 || var0 == 8 || var0 == 17 || 15 == var0 || 16 == var0 || 58 == var0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ue.bh(" + ')');
      }
   }

   static void method382(int var0) {
      try {
         if (class69.field1810 > 1) {
            class615.field8903.method5391(class615.field8903.field9143, 4, 102316213);
         } else {
            class615.field8903.method5391(class615.field8903.field9143, 2, -437930362);
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ue.q(" + ')');
      }
   }
}
