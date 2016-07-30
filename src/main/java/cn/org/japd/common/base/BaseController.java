package cn.org.japd.common.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 基础控制类
 * @author WuZhiFeng
 * @date 2016年7月29日
 * @param <T>
 */
public abstract class BaseController<T extends BaseEntity> {
	
	/**
	 * 获取业务逻辑
	 * @return BaseService
	 */
	protected abstract BaseService<T> getBaseService();
	
	@RequestMapping(value="save")
	@ResponseBody
	public T save(T entity){
		return  getBaseService().save(entity);
	}
	
	@RequestMapping(value="update")
	@ResponseBody
	public T update(T entity){
		return  getBaseService().save(entity);
	}
	

	@RequestMapping("list")
	@ResponseBody
	public List<T> list(){
		List<T> list=new ArrayList<>();
		list= getBaseService().findAll();
		return list;
	}
}
