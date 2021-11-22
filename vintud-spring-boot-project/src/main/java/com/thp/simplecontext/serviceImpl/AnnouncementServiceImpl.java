package com.thp.simplecontext.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thp.simplecontext.entity.Announcement;
import com.thp.simplecontext.service.AnnouncementService;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

	@Override
	public List<Announcement> findAll() {
		return null;
	}

	@Override
	public List<Announcement> findAnnouncementById(Long id) {
		return null;
	}

	@Override
	public List<Announcement> findAnnouncementByNomAndPrice(String n, int p) {
		return null;
	}

	@Override
	public Announcement findAnnouncementByPrice(String p) {
		return null;
	}

	@Override
	public Announcement findAnnouncementByLocation(String l) {
		return null;
	}

	@Override
	public Announcement findAnnouncementByNombreView(int nb_V) {
		return null;
	}

	@Override
	public void insertAnnouncement(Announcement annonce) {
		
	}

	@Override
	public void updateAnnouncement(Announcement annonce, Long id) {
		
	}

	@Override
	public void deleteAnnouncement(Long id) {
		
	}

}
