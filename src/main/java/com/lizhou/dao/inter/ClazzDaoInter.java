package com.lizhou.dao.inter;

import com.lizhou.bean.Clazz;
import com.lizhou.bean.Page;

import java.util.List;

/**
 * 班级数据层接口
 * @author bojiangzhou
 *
 */
public interface ClazzDaoInter extends BaseDaoInter {
	
	/**
	 * 获取班级详细信息
	 * @param gradeid 年级ID
	 * @param page 分页参数
	 * @return
	 */
	public List<Clazz> getClazzDetailList(String gradeid, Page page);
	
}
