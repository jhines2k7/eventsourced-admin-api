package com.hines.james.eventsourcedadminapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RepositoryRestController
public class EventsourcedAdminApiApplication {
    @Autowired
    UserRepository userRepository;

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

    @RequestMapping(value = "users/{email}", method = RequestMethod.GET)
    public User getUser(@PathVariable String email) {
        return userRepository.findByEmail(email);
    }

    @PostConstruct
    public void init() {
        List<User> users = new ArrayList<>();

        users.add(new User("Lupita Nyong'o",
                "Administrator",
                "Columbus, OH",
                "profile-black-woman.jpg",
                "lupita@gmail.com"));
        users.add(new User("Idris Elba",
                "Administrator",
                "Columbus, OH",
                "profile-idris.jpg",
                "idris@gmail.com"));
        users.add(new User("Denzel Washington",
                "Administrator",
                "Hollywood, California",
                "profile-denzel.jpg",
                "denzel@gmail.com"));

        userRepository.save(users);
    }

}
