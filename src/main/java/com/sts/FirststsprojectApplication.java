package com.sts;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sts.dao.UserRepository;
import com.sts.entities.User;

@SpringBootApplication
public class FirststsprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  context = SpringApplication.run(FirststsprojectApplication.class, args);
		
		UserRepository userRepositiory = context.getBean(UserRepository.class);
		
		User user =new User();
		user.setName("Akshay Shelke");
		user.setCity("Thane");
		user.setStatus("software engg");
		
		//saving single user
//		User userSaved = userRepositiory.save(user);
//		System.out.println(userSaved);
////		
//		User user1 =new User();
//		user1.setName("sachin");
//		user1.setCity("Thane");
//		user1.setStatus("mechanical engg");
//		
//		User user2 =new User();
//		user2.setName("pratik");
//		user2.setCity("Thane");
//		user2.setStatus("design engg");
//		
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result = userRepositiory.saveAll(users);
////		
//		result.forEach(u->{
//			System.out.println(u);
//		});
//		
		
		//update
//		Optional<User> optional = userRepositiory.findById(3);
//		User user = optional.get();
//		user.setName("prateek bansal");
//		userRepositiory.save(user);
//		System.out.println(user);
//	
		
		//get all elements
//		Iterable<User> itr = userRepositiory.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext())
//		{
//			User user1 =iterator.next();
//			System.out.println(user1);	
//		}
//		itr.forEach(user->{System.out.println(user);});
		
		
		
		//deleting user element
//		userRepositiory.deleteById(3); //deleteing one user
		
//		Iterable<User> allusers = userRepositiory.findAll();
//		allusers.forEach(user->System.out.println(user));
//		userRepositiory.deleteAll(allusers);
//		
		
		
//		List<User> byCity = userRepositiory.findByCity("Thane");
//		byCity.forEach(usr->System.out.println(usr));
//		
//		List<User> byNameAndCity = userRepositiory.findByNameAndCity("Akshay Shelke", "Thane");
//		
//		byNameAndCity.forEach(byNameAndCity_->System.out.println(byNameAndCity_));
//		
//		
//		List<User> allUsers = userRepositiory.getAllUsers();
//		allUsers.forEach(allUsers_->System.out.println(allUsers_));
//		
//		List<User> byname = userRepositiory.getUserByName("sachin");
//		byname.forEach(byname_->System.out.println(byname_));
//		
//		List<User> bynameandcity = userRepositiory.getUserByNameAndCity("pratik","Thane");
//		bynameandcity.forEach(byname_->System.out.println(byname_));
		
		List<User> users = userRepositiory.getUsers();
		users.forEach(e->System.out.println(e));
		
		
		
		
	}

}
