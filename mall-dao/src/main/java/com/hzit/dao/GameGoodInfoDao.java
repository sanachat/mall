package com.hzit.dao;

import com.hzit.entity.GamegoodInfo;

import java.util.List;

/**
 * Created by Tracy McGrady on 2017/8/9.
 */
public interface GameGoodInfoDao
{
    public GamegoodInfo findOneGood(int gameGoodId);

    public List<GamegoodInfo> findAllGood();

    public int insertGood(GamegoodInfo gamegoodInfo);

    public int updateGood(GamegoodInfo gamegoodInfo);

    public int deleteGood(int gameGoodId);

    public List<GamegoodInfo> list();

    public List<GamegoodInfo> findAllByName(String name);

}
