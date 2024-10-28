package com.dao;

import com.entity.AnquankechengfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AnquankechengfenleiVO;
import com.entity.view.AnquankechengfenleiView;


/**
 * 安全课程分类
 * 
 * @author 
 * @email 
 * @date 2021-04-12 18:09:25
 */
public interface AnquankechengfenleiDao extends BaseMapper<AnquankechengfenleiEntity> {
	
	List<AnquankechengfenleiVO> selectListVO(@Param("ew") Wrapper<AnquankechengfenleiEntity> wrapper);
	
	AnquankechengfenleiVO selectVO(@Param("ew") Wrapper<AnquankechengfenleiEntity> wrapper);
	
	List<AnquankechengfenleiView> selectListView(@Param("ew") Wrapper<AnquankechengfenleiEntity> wrapper);

	List<AnquankechengfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<AnquankechengfenleiEntity> wrapper);
	
	AnquankechengfenleiView selectView(@Param("ew") Wrapper<AnquankechengfenleiEntity> wrapper);
	
}
