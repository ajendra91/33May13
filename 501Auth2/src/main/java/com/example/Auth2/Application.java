package com.example.Auth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


//Hits POST Request=> http://localhost:9090/oauth/token
//grant_type : "password"
//"username : "admin"
//password :  "admin"
//scope : read

//and Basic Auth
//username=ci
//password=sc

//Hits GET Request http://localhost:9090/oauth/check_token?token=563b70b8-8464-4cea-94be-2783d9080256
//and Basic Auth
//username=ci
//password=sc


//1.All Configuration in properties file

//remeber =>we can use=>
//extends WebSecurityConfigurerAdapter
//        implements AuthorizationServerConfigurer

//2.extends AuthorizationServerConfigurerAdapter
		//A.extens GlobalAuthenticationConfigurerAdapter
						//or
		//B.extends WebSecurityConfigurerAdapter or implements WebSecurityConfigurer
//3.implements AuthorizationServerConfigurerAdapter
		//A.extens GlobalAuthenticationConfigurerAdapter
						//or
		//B.extends WebSecurityConfigurerAdapter or implements WebSecurityConfigurer
//4. extends WebSecurityConfigurerAdapter or implements WebSecurityConfigurer
		//and auth config in properties file
		//you can't user extends or implements AuthorizationServerConfigurerAdapter
		//bcoz need configure bean authorizationManager
        //AuthorizationServerEndpointsConfigurer..authenticationManager(authenticationManager);

//5.Role Beased Security app
//revise oauth2 role


//6.client and server app

//7.extends WebSecurityConfigurerAdapter and implements AuthorizationServerConfigurer
        //apply authorizationManagerBuilder
				//A.extends GlobalAuthenticationConfigurerAdapter
						//or
				//B.or above file extends WebSecurityConfigurerAdapter

//7.Resource Server

//8.