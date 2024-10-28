package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AnquankechengfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AnquankechengfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AnquankechengfenleiView;


/**
 * 安全课程分类
 *
 * @author 
 * @email 
 * @date 2021-04-12 18:09:25
 */
public interface AnquankechengfenleiService extends IService<AnquankechengfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AnquankechengfenleiVO> selectListVO(Wrapper<AnquankechengfenleiEntity> wrapper);
   	
   	AnquankechengfenleiVO selectVO(@Param("ew") Wrapper<AnquankechengfenleiEntity> wrapper);
   	
   	List<AnquankechengfenleiView> selectListView(Wrapper<AnquankechengfenleiEntity> wrapper);
   	
   	AnquankechengfenleiView selectView(@Param("ew") Wrapper<AnquankechengfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AnquankechengfenleiEntity> wrapper);
   	
}

