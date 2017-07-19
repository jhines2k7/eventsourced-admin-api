package com.hines.james.eventsourcedadminapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EventsourcedAdminApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventsourcedAdminApiApplication.class, args);
	}

	@CrossOrigin
	@RequestMapping("/home")
    public HomeViewData home() {
	    HomeViewData homeViewData = new HomeViewData();

	    homeViewData.setBounceRate(72);
	    homeViewData.setProductsSold(1121);
	    homeViewData.setLocation(30);
	    homeViewData.setComments(134);
	    homeViewData.setVisitors(12501);

	    return homeViewData;
    }

}
