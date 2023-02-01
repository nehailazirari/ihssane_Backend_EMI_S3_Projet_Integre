/*package com.example.ihssane.dao;

import com.example.ihssane.model.Message;

import com.example.ihssane.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    //@Query("select Message from Message where toUser.id in (?1, ?2) and fromUser.id in (?1, ?2) order by createdDate asc")
    @Query("SELECT m FROM Message m WHERE m.toUser.id in (:fromUserId, :toUserId) and m.fromUser.id in (:fromUserId, :toUserId) ORDER BY m.createdDate ASC")
    List<Message> findByFromUserIdOrToUserId(@Param("fromUserId") Long fromUserId, @Param("toUserId") Long toUserId);


    @Query("SELECT u FROM Utilisateur u JOIN Message m ON (u.id = m.fromUser.id OR u.id = m.toUser.id) WHERE (m.fromUser.id = :userId OR m.toUser.id = :userId) AND u.id NOT IN  (:userId) ORDER BY m.createdDate ASC")
    List<Utilisateur> findUsersByFromUserIdOrToUserId(@Param("userId") Long userId);
}*/
