package com.hzit.dao;

import com.hzit.entity.GameInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/8/9.
 */
public interface GameInfoDao {
    public int insertGame(String name,String area);
    public int deleteGame(int id);
    public List<GameInfo> findGame();

}
