package config;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;
import java.util.Set;

public class YamlPropertiesReader {

    public Settings getSettingsFromYaml() {
        Yaml yaml = new Yaml(new Constructor(Settings.class));
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("testProperties.yaml");
        Settings settings = yaml.load(inputStream);
        return settings;
    }

}
