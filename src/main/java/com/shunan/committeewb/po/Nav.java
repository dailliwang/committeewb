package com.shunan.committeewb.po;
/**
 * 导航栏
 * @author 李琳茹
 *
 */
public class Nav {
	private int id;
	private String name;//标题名称
	private String jumpLink;//跳转链接
	private int sort;//显示顺序
	public Nav() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumpLink() {
		return jumpLink;
	}
	public void setJumpLink(String jumpLink) {
		this.jumpLink = jumpLink;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	@Override
	public String toString() {
		return "Nav [id=" + id + ", name=" + name + ", jumpLink=" + jumpLink + ", sort=" + sort + "]";
	}
}
