public class Settings {

    private Settings () {};
    private static Settings settings = null;

    public static Settings getSettings () {
        if(settings == null) {
            settings = new Settings();
        } return settings;
    }

    private boolean darkMode = false;
    private int fontSize = 13;

    public int getFontSize() {
        return fontSize;
    }

    public boolean getDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
