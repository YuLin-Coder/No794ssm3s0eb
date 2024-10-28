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


import com.dao.AnquankechengfenleiDao;
import com.entity.AnquankechengfenleiEntity;
import com.service.AnquankechengfenleiService;
import com.entity.vo.AnquankechengfenleiVO;
import com.entity.view.AnquankechengfenleiView;

@Service("anquankechengfenleiService")
public class AnquankechengfenleiServiceImpl extends ServiceImpl<AnquankechengfenleiDao, AnquankechengfenleiEntity> implements AnquankechengfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AnquankechengfenleiEntity> page = this.selectPage(
                new Query<AnquankechengfenleiEntity>(params).getPage(),
                new EntityWrapper<AnquankechengfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AnquankechengfenleiEntity> wrapper) {
		  Page<AnquankechengfenleiView> page =new Query<AnquankechengfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AnquankechengfenleiVO> selectListVO(Wrapper<AnquankechengfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AnquankechengfenleiVO selectVO(Wrapper<AnquankechengfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AnquankechengfenleiView> selectListView(Wrapper<AnquankechengfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AnquankechengfenleiView selectView(Wrapper<AnquankechengfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
