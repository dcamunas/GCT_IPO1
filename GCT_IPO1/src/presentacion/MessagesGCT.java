package presentacion;

import java.beans.Beans;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class MessagesGCT {
	////////////////////////////////////////////////////////////////////////////
	//
	// Constructor
	//
	////////////////////////////////////////////////////////////////////////////
	private MessagesGCT() {
		// do not instantiate
	}

	////////////////////////////////////////////////////////////////////////////
	//
	// Bundle access
	//
	////////////////////////////////////////////////////////////////////////////
	private static String BUNDLE_NAME = "presentacion.messagesgct"; //$NON-NLS-1$
	private static ResourceBundle RESOURCE_BUNDLE = loadBundle();
	private static Locale Localelocale;
	private static Locale locale;

	private static ResourceBundle loadBundle() {
		return ResourceBundle.getBundle(BUNDLE_NAME);
	}

	////////////////////////////////////////////////////////////////////////////
	//
	// Strings access
	//
	////////////////////////////////////////////////////////////////////////////
	public static String getString(String key) {
		try {
			ResourceBundle bundle = Beans.isDesignTime() ? loadBundle() : RESOURCE_BUNDLE;
			return bundle.getString(key);
		} catch (MissingResourceException e) {
			return "!" + key + "!";
		}
	}

	private static Locale getLocale(String appIdioma) {
		Localelocale = new Locale("es");
		if (appIdioma.equals("inglés"))
			locale = new Locale("en");
		return locale;
	}

	public static void setIdioma(String idioma) {
		RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, getLocale(idioma));
	}
}
