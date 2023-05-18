package semi.proj.PfF.product.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Product {
   private int productNo;
   private String productName;
   private int productPrice;
   private Date resisterationDate;
   private Integer discountRate;
   private String productInfo;
   private String productType;
   private String producType2;
   private String productMainPic;
   private String productDetailPic1;
   private String productDetailPic2;
   private String productDetailPic3;
   private char productStatus;
   
   public Product() {}

	public Product(int productNo, String productName, int productPrice, Date resisterationDate, Integer discountRate,
			String productInfo, String productType, String producType2, String productMainPic, String productDetailPic1,
			String productDetailPic2, String productDetailPic3, char productStatus) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.productPrice = productPrice;
		this.resisterationDate = resisterationDate;
		this.discountRate = discountRate;
		this.productInfo = productInfo;
		this.productType = productType;
		this.producType2 = producType2;
		this.productMainPic = productMainPic;
		this.productDetailPic1 = productDetailPic1;
		this.productDetailPic2 = productDetailPic2;
		this.productDetailPic3 = productDetailPic3;
		this.productStatus = productStatus;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public Date getResisterationDate() {
		return resisterationDate;
	}

	public void setResisterationDate(Date resisterationDate) {
		this.resisterationDate = resisterationDate;
	}

	public Integer getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(Integer discountRate) {
		this.discountRate = discountRate;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProducType2() {
		return producType2;
	}

	public void setProducType2(String producType2) {
		this.producType2 = producType2;
	}

	public String getProductMainPic() {
		return productMainPic;
	}

	public void setProductMainPic(String productMainPic) {
		this.productMainPic = productMainPic;
	}

	public String getProductDetailPic1() {
		return productDetailPic1;
	}

	public void setProductDetailPic1(String productDetailPic1) {
		this.productDetailPic1 = productDetailPic1;
	}

	public String getProductDetailPic2() {
		return productDetailPic2;
	}

	public void setProductDetailPic2(String productDetailPic2) {
		this.productDetailPic2 = productDetailPic2;
	}

	public String getProductDetailPic3() {
		return productDetailPic3;
	}

	public void setProductDetailPic3(String productDetailPic3) {
		this.productDetailPic3 = productDetailPic3;
	}

	public char getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(char productStatus) {
		this.productStatus = productStatus;
	}

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", resisterationDate=" + resisterationDate + ", discountRate=" + discountRate + ", productInfo="
				+ productInfo + ", productType=" + productType + ", producType2=" + producType2 + ", productMainPic="
				+ productMainPic + ", productDetailPic1=" + productDetailPic1 + ", productDetailPic2="
				+ productDetailPic2 + ", productDetailPic3=" + productDetailPic3 + ", productStatus=" + productStatus
				+ "]";
	}
   
}
