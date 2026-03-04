package apicontractdesign.repository;

import org.springframework.stereotype.Repository;

import apicontractdesign.domain.User;

/*
  Repository 계층
  - 데이터 저장소(DB) 접근 책임
 */
@Repository
public class UserRepository {

    public User save(User user) {
        // 실제로는 DB에 저장된다고 가정
        return user;
    }
}
