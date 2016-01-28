package com.sci.servicehub;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.DataIntegrityViolationException;

import com.sci.servicehub.model.User;
import com.sci.servicehub.repository.UserRepository;

@SpringBootApplication
public class Application implements CommandLineRunner
{
   
    @Autowired
    UserRepository userRepository;
 
    public static void main(String[] args) throws IOException 
    {
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebEnvironment(true);
        application.run(args);
    }

    @Override
    public void run(String... strings) throws Exception 
    {
        initDatabase();
        
        System.out.println("Lookup user by userName...");
        System.out.println("\t" + userRepository.findByUserName("ENatis"));
    }
    
    private void initDatabase()
    {
        
        User enatis = new User();
        enatis.setUserName("ENatis");
        enatis.setPassword("123");
        enatis.setName("Edgardo Natis");
        enatis.setActive("1");
        enatis.setStatus(User.STATUS_OPEN);
        enatis.setServerId("1081EFAA375B683B01378991228E39CB");

        try
        {
            userRepository.save(enatis);
            
        }
        catch(DataIntegrityViolationException dive)
        {
            System.out.println("\nDatabase Error: " + dive.getMessage() + "\n");
        }

    }
    
}
