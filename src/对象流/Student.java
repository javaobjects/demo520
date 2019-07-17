package 对象流;

import java.io.Serializable;

public class Student implements Serializable{//关键点只要在网上传输就一定要实现这个序列接口

	/** 
	 * 此处自动生成的序列号不可更改，
	 * 若更改则会报错序列号不一致
	* serialVersionUID
	*/  
	private static final long serialVersionUID = -5571074817084289161L;
	private Integer id;
	private String name;
	//transient瞬时 不需要序列化的属性前面加上这个关键字则不会写入
//	private transient String name;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Student() {
		super();
	}
	public Student(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
