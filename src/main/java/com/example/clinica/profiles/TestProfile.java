package com.example.clinica.profiles;

import com.example.clinica.services.DBServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestProfile {
    @Autowired
    private DBServices dbServices;


    public void instanciaDB(){
    this.dbServices.instaciaDB();
}

}
