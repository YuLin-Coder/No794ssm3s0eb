package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.AnquankechengxuexiDao;
import com.entity.AnquankechengxuexiEntity;
import com.service.AnquankechengxuexiService;
import com.entity.vo.AnquankechengxuexiVO;
import com.entity.view.AnquankechengxuexiView;

@Service("anquankechengxuexiService")
public class AnquankechengxuexiServiceImpl extends ServiceImpl<AnquankechengxuexiDao, AnquankechengxuexiEntity> implements AnquankechengxuexiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AnquankechengxuexiEntity> page = this.selectPage(
                new Query<AnquankechengxuexiEntity>(params).getPage(),
                new EntityWrapper<AnquankechengxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AnquankechengxuexiEntity> wrapper) {
		  Page<AnquankechengxuexiView> page =new Query<AnquankechengxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AnquankechengxuexiVO> selectListVO(Wrapper<AnquankechengxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AnquankechengxuexiVO selectVO(Wrapper<AnquankechengxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AnquankechengxuexiView> selectListView(Wrapper<AnquankechengxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AnquankechengxuexiView selectView(Wrapper<AnquankechengxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
