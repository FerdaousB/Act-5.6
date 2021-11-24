package com.thp.simplecontext.service;

import java.util.List;

import com.thp.simplecontext.entity.Announcement;


public interface AnnouncementService {
	
	
	 public List<Announcement> findAll();
	 public List<Announcement> findAnnouncementById(Long id);
	 public List<Announcement> findAnnouncementByNomAndPrice(String n, int p);
	 public Announcement findAnnouncementByPrice(String p);
	 public Announcement findAnnouncementByLocation(String l);
     public Announcement findAnnouncementByNombreView(int nb_V);
     public void insertAnnouncement(Announcement annonce);
	 public void updateAnnouncement(Announcement annonce,Long id);
	 public void deleteAnnouncement(Long id);


}
