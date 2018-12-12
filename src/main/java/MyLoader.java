import java.applet.Applet;

public class MyLoader extends Applet {

    public static final String MAIN_CLASS = "XEI";

//    public void launch() throws IOException, ClassNotFoundException, IllegalAccessException,
//            InstantiationException, NoSuchMethodException, InvocationTargetException {
//        final InputStream inputStream = MyLoader.class.getResourceAsStream("/BlissStrings.jar");
//        final HashMap<String, ClassNode> nodeMap = Util.load(inputStream);
//        final ClassNodeLoader loader = new ClassNodeLoader(nodeMap);
//        final Object client = loader.loadClass(MAIN_CLASS).newInstance();
//        final Method method = client.getClass().getMethod("supplyApplet", Applet.class);
//        method.invoke(client, this);
//    }
//
//    public static void main(String[] args) {
//        try {
//            new MyLoader().launch();
//        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        Loader localMyLoader = Loader.instance = new Loader();
        localMyLoader.doFrame();
        while (true) {
            try {
//                System.out.println(OU.);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
