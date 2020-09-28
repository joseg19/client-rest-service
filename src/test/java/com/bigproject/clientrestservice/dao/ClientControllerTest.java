package com.bigproject.clientrestservice.dao;

import com.bigproject.clientrestservice.controller.ClientController;
import com.bigproject.clientrestservice.entity.Client;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

//@SpringBootTest
public class ClientControllerTest {

void saveAndUpdate(){}
void delete(){}

//@Test
void getById(){
    ClientController clientController = new ClientController();
    Assert.isInstanceOf(Client.class,clientController.getClientById(1));
}

}
