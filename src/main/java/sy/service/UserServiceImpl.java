package sy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.UserMapper;
import sy.model.User;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public User getUserById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> getAll() {
		return userMapper.getAll();
	}

	@Override
	public List<User> getAll2() {
		return userMapper.getAll2();
	}

	@Override
	public List<User> getAll3() {
		return userMapper.getAll3();
	}

}
