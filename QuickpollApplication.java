package com.example.quickpoll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickpollApplication {

	public static void main(String[] args) {

		SpringApplication.run(QuickpollApplication.class, args);
	}

}
/*Resource Identification:
users that interact with polls. users vote on polls
Option another candidate for resource. Poll Option a resource requires a client to make two get requests.
First takes a poll representation the second request will intail an association options representation.
"id": 2,
"question": "How will win SuperBowl this year?",
"options": [{"id": 45, "value": "New England Patriots"}, {"id": 49,
"value": "Seattle Seahawks"}, {"id": 51, "value": "Green Bay Packers"},
{"id": 54, "value": "Denver Broncos"}]

 */
