package com.myspring.eium.hm.hm_p0007.dao;


import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.myspring.eium.hm.hm_p0007.vo.HM_P0007_05VO;


public interface HM_P0007_05DAO {
	 public List<HM_P0007_05VO> searchList(Map<String, Object> searchMap) throws DataAccessException;
	 

	
}
