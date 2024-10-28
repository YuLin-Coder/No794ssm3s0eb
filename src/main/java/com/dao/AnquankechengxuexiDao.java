package com.dao;

import com.entity.AnquankechengxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AnquankechengxuexiVO;
import com.entity.view.AnquankechengxuexiView;


/**
 * 安全课程学习
 * 
 * @author 
 * @email 
 * @date 2021-04-12 18:09:25
 */
public interface AnquankechengxuexiDao extends BaseMapper<AnquankechengxuexiEntity> {
	
	List<AnquankechengxuexiVO> selectListVO(@Param("ew") Wrapper<AnquankechengxuexiEntity> wrapper);
	
	AnquankechengxuexiVO selectVO(@Param("ew") Wrapper<AnquankechengxuexiEntity> wrapper);
	
	List<AnquankechengxuexiView> selectListView(@Param("ew") Wrapper<AnquankechengxuexiEntity> wrapper);

	List<AnquankechengxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<AnquankechengxuexiEntity> wrapper);
	
	AnquankechengxuexiView selectView(@Param("ew") Wrapper<AnquankechengxuexiEntity> wrapper);
	
}
