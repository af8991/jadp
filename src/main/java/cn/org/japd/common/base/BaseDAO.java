package cn.org.japd.common.base;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BaseDAO<T extends BaseEntity> extends JpaRepository<T, String>{

}
