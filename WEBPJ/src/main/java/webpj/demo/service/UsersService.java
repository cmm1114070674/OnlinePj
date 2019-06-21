package webpj.demo.service;

import webpj.demo.ENTITY.UsersEntity;
import webpj.demo.repository.UsersRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public interface UsersService  {

	//@Resource
	//private UsersRepository rep;
	public List<UsersEntity> getALL();
	public UsersEntity getonebyUID(int UID);
	public boolean addUsers(int UID,String username,String pass);
}
