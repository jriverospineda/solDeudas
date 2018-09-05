package cl.afphabitat.cuentas.solDeudas.web.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesFile {

	  private final Properties configProp = new Properties();

	  private PropertiesFile()
	  {
	    InputStream in = super.getClass().getClassLoader().getResourceAsStream("config.properties");
	    try {
	      this.configProp.load(in);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }

	  public static PropertiesFile getInstance()
	  {
	    return PropiedadesOn.INSTANCE;
	  }

	  public String getProperty(String key)
	  {
	    return this.configProp.getProperty(key);
	  }

	  public Set<String> getAllPropertyNames()
	  {
	    return this.configProp.stringPropertyNames();
	  }

	  public boolean containsKey(String key)
	  {
	    return this.configProp.containsKey(key);
	  }

	  private static class PropiedadesOn
	  {
	    private static final PropertiesFile INSTANCE = new PropertiesFile();
	  }

}
