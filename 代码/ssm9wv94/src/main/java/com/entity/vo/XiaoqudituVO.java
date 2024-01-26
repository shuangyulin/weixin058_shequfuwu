package com.entity.vo;

import com.entity.XiaoqudituEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 小区地图
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-20 20:14:45
 */
public class XiaoqudituVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 建筑名称
	 */
	
	private String jianzhumingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 简述
	 */
	
	private String jianshu;
				
	
	/**
	 * 设置：建筑名称
	 */
	 
	public void setJianzhumingcheng(String jianzhumingcheng) {
		this.jianzhumingcheng = jianzhumingcheng;
	}
	
	/**
	 * 获取：建筑名称
	 */
	public String getJianzhumingcheng() {
		return jianzhumingcheng;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：位置
	 */
	 
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
				
	
	/**
	 * 设置：简述
	 */
	 
	public void setJianshu(String jianshu) {
		this.jianshu = jianshu;
	}
	
	/**
	 * 获取：简述
	 */
	public String getJianshu() {
		return jianshu;
	}
			
}
