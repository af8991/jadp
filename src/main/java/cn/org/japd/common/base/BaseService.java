
package cn.org.japd.common.base;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
 
/**
 * Service基类
 * @author WuZhiFeng
 * @date 2016年7月30日
 * @param <D>
 * @param <T>
 */
public abstract class BaseService<T extends BaseEntity> implements JpaRepository<T, String> {

	
	/**
	 * 获取基础DAO
	 * @return BaseService
	 */
	protected abstract BaseDAO<T> getBaseDAO();
	
	 

	@Override
	public Page<T> findAll(Pageable pageable) {
		return getBaseDAO().findAll(pageable);
	}

	@Override
	public <S extends T> S save(S entity) {
		return getBaseDAO().save(entity);
	}

	@Override
	public T findOne(String id) {
		return getBaseDAO().findOne(id);
	}

	@Override
	public boolean exists(String id) {
		return getBaseDAO().exists(id);
	}

	@Override
	public long count() {
		return getBaseDAO().count();
	}

	@Override
	public void delete(String id) {
		getBaseDAO().delete(id);
	}

	@Override
	public void delete(T entity) {
		getBaseDAO().delete(entity);
	}

	@Override
	public void delete(Iterable<? extends T> entities) {
		getBaseDAO().delete(entities);
	}

	@Override
	public void deleteAll() {
		getBaseDAO().deleteAll();
	}

	@Override
	public List<T> findAll() {
		return getBaseDAO().findAll();
	}

	@Override
	public List<T> findAll(Sort sort) {
		return getBaseDAO().findAll(sort);
	}

	@Override
	public List<T> findAll(Iterable<String> ids) {
		return getBaseDAO().findAll(ids);
	}

	@Override
	public <S extends T> List<S> save(Iterable<S> entities) {
		return getBaseDAO().save(entities);
	}

	@Override
	public void flush() {
		getBaseDAO().flush();
	}

	@Override
	public <S extends T> S saveAndFlush(S entity) {
		return getBaseDAO().saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<T> entities) {
		getBaseDAO().deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		getBaseDAO().deleteAllInBatch();
	}

	@Override
	public T getOne(String id) {
		return getBaseDAO().getOne(id);
	}
}
