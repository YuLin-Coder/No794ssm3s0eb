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


import com.dao.DiscussanquankechengxuexiDao;
import com.entity.DiscussanquankechengxuexiEntity;
import com.service.DiscussanquankechengxuexiService;
import com.entity.vo.DiscussanquankechengxuexiVO;
import com.entity.view.DiscussanquankechengxuexiView;

@Service("discussanquankechengxuexiService")
public class DiscussanquankechengxuexiServiceImpl extends ServiceImpl<DiscussanquankechengxuexiDao, DiscussanquankechengxuexiEntity> implements DiscussanquankechengxuexiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussanquankechengxuexiEntity> page = this.selectPage(
                new Query<DiscussanquankechengxuexiEntity>(params).getPage(),
                new EntityWrapper<DiscussanquankechengxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussanquankechengxuexiEntity> wrapper) {
		  Page<DiscussanquankechengxuexiView> page =new Query<DiscussanquankechengxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussanquankechengxuexiVO> selectListVO(Wrapper<DiscussanquankechengxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussanquankechengxuexiVO selectVO(Wrapper<DiscussanquankechengxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussanquankechengxuexiView> selectListView(Wrapper<DiscussanquankechengxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussanquankechengxuexiView selectView(Wrapper<DiscussanquankechengxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
