package semi.proj.PfF.product.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
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
}
