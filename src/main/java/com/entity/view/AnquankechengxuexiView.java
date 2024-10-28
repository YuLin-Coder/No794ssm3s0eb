package com.entity.view;

import com.entity.AnquankechengxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 安全课程学习
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 18:09:25
 */
@TableName("anquankechengxuexi")
public class AnquankechengxuexiView  extends AnquankechengxuexiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public AnquankechengxuexiView(){
	}
 
 	public AnquankechengxuexiView(AnquankechengxuexiEntity anquankechengxuexiEntity){
 	try {
			BeanUtils.copyProperties(this, anquankechengxuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
