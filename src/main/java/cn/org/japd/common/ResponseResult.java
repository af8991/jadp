package cn.org.japd.common;

/**
 * AJAX返回结果
 * @author WuZhiFeng
 * @date 2016年7月30日
 */
public class ResponseResult {
	
	/**
	 * 状态
	 */
	private Integer status;
	
	/**
	 * 消息
	 */
	private String msg;
	
	/**
	 * 返回数据
	 */
	private Object data;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
