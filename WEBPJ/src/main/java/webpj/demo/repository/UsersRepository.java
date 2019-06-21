package webpj.demo.repository;

import webpj.demo.ENTITY.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity, Integer>, UsersRepositoryCustom {
public UsersEntity getUsersEntityByUid(int id);
}
