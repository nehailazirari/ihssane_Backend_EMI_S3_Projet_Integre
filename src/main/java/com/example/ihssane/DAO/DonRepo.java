package com.example.ihssane.DAO;

import com.example.ihssane.model.Don;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonRepo extends JpaRepository<Don, Long> {

}
