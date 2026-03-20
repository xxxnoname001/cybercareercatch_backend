package com.ccc.company.dao;

import org.apache.ibatis.session.SqlSession;

import com.ccc.common.config.MyBatisConfig;
import com.ccc.company.dto.CompanyDetailDTO;

public class CompanyDAO {

	public SqlSession sqlSession;

	public CompanyDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public CompanyDetailDTO selectCompanyDetail(int companyNumber) {
		System.out.println("기업 상세 조회 DAO");
		return sqlSession.selectOne("company.selectCompanyDetail", companyNumber);
	}
}