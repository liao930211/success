package com.succ.entity;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author hao.liao
 * @since 2018-08-19
 */
@TableName("base_info")
public class BaseInfo extends Model<BaseInfo> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer five;
	private Integer four;
	private Integer three;
	private Integer two;
	private Integer one;
    /**
     * 注释
     */
	private String remark;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getId() {
		return id;
	}

	public BaseInfo setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getFive() {
		return five;
	}

	public BaseInfo setFive(Integer five) {
		this.five = five;
		return this;
	}

	public Integer getFour() {
		return four;
	}

	public BaseInfo setFour(Integer four) {
		this.four = four;
		return this;
	}

	public Integer getThree() {
		return three;
	}

	public BaseInfo setThree(Integer three) {
		this.three = three;
		return this;
	}

	public Integer getTwo() {
		return two;
	}

	public BaseInfo setTwo(Integer two) {
		this.two = two;
		return this;
	}

	public Integer getOne() {
		return one;
	}

	public BaseInfo setOne(Integer one) {
		this.one = one;
		return this;
	}

	public String getRemark() {
		return remark;
	}

	public BaseInfo setRemark(String remark) {
		this.remark = remark;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "BaseInfo{" +
			"id=" + id +
			", five=" + five +
			", four=" + four +
			", three=" + three +
			", two=" + two +
			", one=" + one +
			", remark=" + remark +
			"}";
	}
}
