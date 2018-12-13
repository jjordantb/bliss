public class Widgets {

    public static WidgetContainer[] getContainers() {
        return class382.widgetContainers;
    }

    public static Widget[] getWidgets(int container) {
        WidgetContainer c;
        if ((c = getContainers()[container]) != null) {
            return c.widgetsCopy;
        }
        return new Widget[]{};
    }

    public static Widget getWidget(int container, int index) {
        final Widget[] widgets;
        if ((widgets = getWidgets(container)).length > index) {
            return widgets[index];
        }
        return null;
    }

}
