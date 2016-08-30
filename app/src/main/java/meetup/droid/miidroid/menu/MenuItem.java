package meetup.droid.miidroid.menu;

/**
 */
public class MenuItem {

    private Class<?> mClazz;

    private String mTitle;

    public MenuItem(Class<?> mClazz, String mTitle) {
        this.mClazz = mClazz;
        this.mTitle = mTitle;
    }

    public Class<?> getClazz() {
        return mClazz;
    }

    public String getTitle() {
        return mTitle;
    }
}
