package com.hzit.dao;

import com.hzit.entity.GamegoodInfo;

import java.util.List;

/**
 * Created by Tracy McGrady on 2017/8/9.
 */
public interface GameGoodInfoDao
{
    public GamegoodInfo FindOneGood(int gameGoodId);

    public List<GamegoodInfo> FindAllGood();

    public int InsertGood(GamegoodInfo gamegoodInfo);

    public int UpdateGood(GamegoodInfo gamegoodInfo);

    public int DeleteGood(int gameGoodId);
}
