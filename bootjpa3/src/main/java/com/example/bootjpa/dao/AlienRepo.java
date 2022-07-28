package com.example.bootjpa.dao;

import com.example.bootjpa.model.Alien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{

}
