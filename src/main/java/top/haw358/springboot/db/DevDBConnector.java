package top.haw358.springboot.db;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by haw on 17-8-28.
 */
@Component
@Profile("devdb")
public class DevDBConnector implements DBConnector {
    @Override
    public String configure() {
        return "devdb";
    }
}
