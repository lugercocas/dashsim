package com.lugercocas.dashsim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lugercocas.dashsim.bean.MyBeanLogin;

@SpringBootApplication
public class DashsimApplication implements CommandLineRunner{
	@Autowired
	private MyBeanLogin myBeanLogin;


	public static void main(String[] args) {
		SpringApplication.run(DashsimApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(myBeanLogin.functionLogin());
	}
	

}
