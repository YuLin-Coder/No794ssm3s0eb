package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussanquankechengxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussanquankechengxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussanquankechengxuexiView;


/**
 * 安全课程学习评论表
 *
 * @author 
 * @email 
 * @date 2021-04-12 18:09:26
 */
public interface DiscussanquankechengxuexiService extends IService<DiscussanquankechengxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussanquankechengxuexiVO> selectListVO(Wrapper<DiscussanquankechengxuexiEntity> wrapper);
   	
   	DiscussanquankechengxuexiVO selectVO(@Param("ew") Wrapper<DiscussanquankechengxuexiEntity> wrapper);
   	
   	List<DiscussanquankechengxuexiView> selectListView(Wrapper<DiscussanquankechengxuexiEntity> wrapper);
   	
   	DiscussanquankechengxuexiView selectView(@Param("ew") Wrapper<DiscussanquankechengxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussanquankechengxuexiEntity> wrapper);
   	
}

