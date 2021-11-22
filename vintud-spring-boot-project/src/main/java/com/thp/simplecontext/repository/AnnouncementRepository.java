package com.thp.simplecontext.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.simplecontext.entity.Announcement;


@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Long>{

}
