package com.bigproject.clientrestservice.dao;

import com.bigproject.clientrestservice.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
    public Client findById(long id);
    public List<Client> findByName(String name);
    public List<Client> findByEmail(String email);
}
