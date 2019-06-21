package webpj.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webpj.demo.ENTITY.UsersEntity;
import webpj.demo.repository.UsersRepository;
import webpj.demo.service.UsersService;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersRepository usersRepository;
    @Override
    public List<UsersEntity> getALL(){
        return usersRepository.findAll();
    };
    @Override
    public UsersEntity getonebyUID(int UID){
        return usersRepository.getUsersEntityByUid(UID);
    };
    @Override
    public boolean addUsers(int UID,String username,String pass){
        UsersEntity usersEntity=new UsersEntity();
        usersEntity.setUid(UID);
        usersEntity.setUserName(username);
        usersEntity.setPass(pass);
        usersRepository.save(usersEntity);
        return true;
    };
}
