package com.thp.simplecontext.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thp.simplecontext.entity.Announcement;
import com.thp.simplecontext.service.AnnouncementService;


@Controller
public class AnnouncementController {
	
	@Autowired
	private AnnouncementService service; 
	
	@RequestMapping(value = "/addAnnouncement", method = RequestMethod.POST)
	public void insertAnnouncement(@RequestBody Announcement announcement) {
		service.insertAnnouncement(announcement);
		
	}

}
