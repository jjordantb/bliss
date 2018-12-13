import java.lang.reflect.Field;

public class CoalMining extends AbstractBot {

    @Override
    public void loop() {
        WidgetContainer[] containers = Widgets.getContainers();
        for (int i = 0; i < containers.length; i++) {
            WidgetContainer container = containers[i];
            if (container != null) {
                Widget[] widgetsCopy = container.widgetsCopy;
                for (int i1 = 0; i1 < widgetsCopy.length; i1++) {
                    Widget widget = widgetsCopy[i1];
                    if (widget != null) {
                        for (Field f : Widget.class.getFields()) {
                            if (f.getType().equals(Integer.TYPE)) {
                                try {
                                    int val = f.getInt(widget);
                                    if (val == 1522) {
                                        System.out.println("YEEEEEET " + i + ", " + i1 + " " + widget.text);
                                    }
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(" -- ");
    }

}
