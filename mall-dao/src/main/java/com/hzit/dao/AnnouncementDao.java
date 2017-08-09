package com.hzit.dao;

import com.hzit.entity.Announcement;

import java.util.List;

/**
 * Created by THINK on 2017/8/9.
 */
public interface AnnouncementDao {
    public List<Announcement> findAll();
    public Announcement findAnnouncementById(int announcementId);
    public int insertAnnouncement(Announcement announcement);
    public int deleteAnnouncement(String announcementId);
}
