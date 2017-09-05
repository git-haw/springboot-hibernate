package top.haw358.springboot.config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by haw on 17-8-28.
 */
@ConfigurationProperties(prefix = "top.haw358")
public class ConfigBean {
    private String name;
    private String want;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }
}
