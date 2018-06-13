package com.zero.jimu.service.space.impl;

import com.zero.jimu.service.space.SpaceService;
import com.zero.jimu.entity.Space;
import com.zero.jimu.dao.SpaceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "spaceService")
public class SpaceServiceImpl implements SpaceService{

    @Autowired SpaceDao spaceDao;

    @Override
    public int insertSpace(Space space){
       if(1==spaceDao.insertSpace(space)){
        return space.id;
       }else {
           return 0;
       }
    }
    //查询所有新空间
    @Override
    public List<Space> selectAll(){
        return spaceDao.selectAll();
    }
    //根据id查询对应的空间详情
    public Space selectSpaceById(int id){
        return spaceDao.selectSpaceById(id);
    }
}