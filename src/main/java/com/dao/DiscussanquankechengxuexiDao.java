package com.dao;

import com.entity.DiscussanquankechengxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussanquankechengxuexiVO;
import com.entity.view.DiscussanquankechengxuexiView;


/**
 * 安全课程学习评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-12 18:09:26
 */
public interface DiscussanquankechengxuexiDao extends BaseMapper<DiscussanquankechengxuexiEntity> {
	
	List<DiscussanquankechengxuexiVO> selectListVO(@Param("ew") Wrapper<DiscussanquankechengxuexiEntity> wrapper);
	
	DiscussanquankechengxuexiVO selectVO(@Param("ew") Wrapper<DiscussanquankechengxuexiEntity> wrapper);
	
	List<DiscussanquankechengxuexiView> selectListView(@Param("ew") Wrapper<DiscussanquankechengxuexiEntity> wrapper);

	List<DiscussanquankechengxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussanquankechengxuexiEntity> wrapper);
	
	DiscussanquankechengxuexiView selectView(@Param("ew") Wrapper<DiscussanquankechengxuexiEntity> wrapper);
	
}
