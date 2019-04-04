package com.PYG.pojo;

import javax.persistence.*;

/**
 * Brand 实体类
 * @date 2019-04-04 16:27:56
 * @version 1.0
 */
@Table(name = "tb_brand")
@Entity
public class Brand implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	//生成     值      策略        生成类型
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "first_char")
	private String firstChar;

	/** setter and getter method */
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setFirstChar(String firstChar){
		this.firstChar = firstChar;
	}
	public String getFirstChar(){
		return this.firstChar;
	}

}