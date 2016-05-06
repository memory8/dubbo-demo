package com.dubbo.demo.mapper;

import java.util.List;

import com.dubbo.demo.model.DemoModel;

public interface DemoMapper {
	
	/**
	 * 查询列表
	 */
	public List<DemoModel> query(DemoModel demoModel);
	
	/**
	 * 查询
	 * 
	 * @param id
	 * @return
	 */
	public DemoModel queryById(Integer id);
	
	/**
	 * 插入一条记录
	 */
	public int insert(DemoModel demoModel);
	
	/**
	 * 更新满足条件记录
	 */
	public void update(DemoModel demoModel);
	
	/**
	 * 删除满足条件的执行计划
	 */
	public int delete(DemoModel demoModel);
}