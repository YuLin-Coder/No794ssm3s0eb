package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AnquankechengxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AnquankechengxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AnquankechengxuexiView;


/**
 * 安全课程学习
 *
 * @author 
 * @email 
 * @date 2021-04-12 18:09:25
 */
public interface AnquankechengxuexiService extends IService<AnquankechengxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AnquankechengxuexiVO> selectListVO(Wrapper<AnquankechengxuexiEntity> wrapper);
   	
   	AnquankechengxuexiVO selectVO(@Param("ew") Wrapper<AnquankechengxuexiEntity> wrapper);
   	
   	List<AnquankechengxuexiView> selectListView(Wrapper<AnquankechengxuexiEntity> wrapper);
   	
   	AnquankechengxuexiView selectView(@Param("ew") Wrapper<AnquankechengxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AnquankechengxuexiEntity> wrapper);
   	
}

