package externals;


import com.externals.BlankCompatDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
@PropertySource("classpath:externals/app.properties")
public class EnvironmentConfig {
    @Autowired
    Environment env;

    @Bean
    public BlankCompatDisc blankCompatDisc() {
        return new BlankCompatDisc(
                env.getProperty("disc.title"),
                env.getProperty("disc.artist"));
    }
}
