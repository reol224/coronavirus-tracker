package main.java.io.jul.coronavirustracker;

import io.jul.coronavirustracker.config.DataUrlProperties;
import io.jul.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //for the cron thing to work
@EnableConfigurationProperties(DataUrlProperties.class)
public class CoronavirusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusTrackerApplication.class, args);
	}

}
