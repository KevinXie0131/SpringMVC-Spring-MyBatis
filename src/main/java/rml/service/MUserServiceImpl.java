package rml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rml.dao.MUserMapper;
import rml.model.MUser;

@Service("muserService")
public class MUserServiceImpl implements MUserServiceI{

	@Autowired
	private MUserMapper muserMapper;
		
	public MUserMapper getMuserMapper() {
		return muserMapper;
	}

	@Override
	public List<MUser> getAll() {
		
		return getMuserMapper().getAll();
	}

	@Override
	public int insert(MUser muser) {
		
		return getMuserMapper().insert(muser);
	}

	@Override
	public int update(MUser muser) {
		
		return getMuserMapper().updateByPrimaryKey(muser);
	}

	@Override
	public int delete(String id) {
	
		return getMuserMapper().deleteByPrimaryKey(id);
	}

	@Override
	public MUser selectByPrimaryKey(String id) {
		
		return getMuserMapper().selectByPrimaryKey(id);
	}

}
