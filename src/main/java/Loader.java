import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Loader extends Applet {
   private static final long field6954 = 7639088664641445302L;
   public static Properties field6955 = new Properties();
   public JFrame field6956;
   public JPanel field6957 = new JPanel();
   public static boolean field6958 = false;
   public static boolean field6959 = false;
   public static String field6960 = "vps100031.vps.ovh.ca";
   public static int field6961 = 43594;
   public static boolean field6962 = false;
   public static boolean field6963 = true;
   public static boolean field6964 = true;
   public static boolean field6965 = false;
   public static boolean field6966 = true;
   public static final int field6967 = 718;
   public static final int field6968 = 43594;
   public static String field6969 = "";
   public static int field6970 = 27;
   public static Loader field6971;
   public static int[] field6972 = new int[256];
   public static boolean field6973;

   public static void main(String[] var0) {
      Loader var1 = field6971 = new Loader();
      var1.method3702();
   }

   public void init() {
      field6971 = this;
      this.method3701();
   }

   void method3701() {
      this.method3703();
      this.method3705();
   }

   public void method3702() {
      this.method3703();
      this.method3704();
      this.method3705();
   }

   void method3703() {
      field6955.put("separate_jvm", "true");
      field6955.put("boxbgcolor", "black");
      field6955.put("image", "http://www.runescape.com/img/game/splash2.gif");
      field6955.put("centerimage", "true");
      field6955.put("boxborder", "false");
      field6955.put("java_arguments", "-Xmx256m -Xss1m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
      field6955.put("27", "0");
      field6955.put("1", "0");
      field6955.put("16", "false");
      field6955.put("17", "false");
      field6955.put("21", field6958 ? "11" : "1");
      field6955.put("30", "false");
      field6955.put("20", field6958 ? "lobby17.runescape.com" : field6969);
      field6955.put("29", "");
      field6955.put("11", "true");
      field6955.put("25", "1378752098");
      field6955.put("28", "0");
      field6955.put("8", ".runescape.com");
      field6955.put("23", "false");
      field6955.put("32", "0");
      field6955.put("15", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk");
      field6955.put("0", "IjGJjn4L3q5lRpOR9ClzZQ");
      field6955.put("2", "");
      field6955.put("4", "3594");
      field6955.put("14", "");
      field6955.put("5", "8194");
      field6955.put("-1", "QlwePyRU5GcnAn1lr035ag");
      field6955.put("6", "0");
      field6955.put("24", "true,false,0,43,200,18,0,21,354,-15,Verdana,11,0xF4ECE9,candy_bar_middle.gif,candy_bar_back.gif,candy_bar_outline_left.gif,candy_bar_outline_right.gif,candy_bar_outline_top.gif,candy_bar_outline_bottom.gif,loadbar_body_left.gif,loadbar_body_right.gif,loadbar_body_fill.gif,6");
      field6955.put("3", "hAJWGrsPqaETglRjuwxMwnlA/d5W6EgYWx");
      field6955.put("12", "false");
      field6955.put("13", "0");
      field6955.put("26", "0");
      field6955.put("9", "77");
      field6955.put("22", "false");
      field6955.put("18", "false");
      field6955.put("33", "");
      field6955.put("haveie6", "false");
   }

   void method3704() {
      this.field6956 = new JFrame("BlissScape Client");

      try {
         this.field6956.setIconImage(ImageIO.read(Thread.currentThread().getContextClassLoader().getResourceAsStream("Client/bin/images/favicon.png")));
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      this.field6956.setLayout(new BorderLayout());
      this.field6957.setLayout(new BorderLayout());
      this.field6957.add(this);
      this.field6957.setPreferredSize(new Dimension(765, 503));
      this.field6956.getContentPane().add(this.field6957, "Center");
      this.field6956.setDefaultCloseOperation(3);
      this.field6956.pack();
      this.field6956.setLocationRelativeTo((Component)null);
      this.field6956.setVisible(true);
   }

   void method3705() {
      try {
         class730 var1 = new class730();
         var1.method3943(this);
         var1.method3941();
         var1.method3956();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public String getParameter(String var1) {
      return (String)field6955.get(var1);
   }

   public URL getDocumentBase() {
      return this.getCodeBase();
   }

   public URL getCodeBase() {
      try {
         return field6958 ? new URL("http://world11.runescape.com") : new URL("http://" + field6960);
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   void method3706() throws IOException {
      String var1 = "";
      int[] var2 = field6972;
      int var3 = field6972.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var2[var4];
         var1 = var1 + var5 + ", ";
      }

   }
}
