package com.summerSchool.firstProject.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Review")
@Table(name="REVIEW")
public class ReviewEntity {
	
	@Id
	@Column(name="REVIEW_ID")
	private int reviewId;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="MARK")
	private int mark;
	
	@Column(name="VIEWS")
	private String views;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval = true)
	private List<ProductEntity> reviewProduct;

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getViews() {
		return views;
	}

	public void setViews(String views) {
		this.views = views;
	}
	
	

}
