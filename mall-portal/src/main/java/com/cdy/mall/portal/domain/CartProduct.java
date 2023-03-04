package com.cdy.mall.portal.domain;

import com.cdy.mall.model.PmsProduct;
import com.cdy.mall.model.PmsProductAttribute;
import com.cdy.mall.model.PmsSkuStock;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 购物车中选择规格的商品信息
 *
 * @author CDY
 */
@Getter
@Setter
public class CartProduct extends PmsProduct {
    private List<PmsProductAttribute> productAttributeList;

    private List<PmsSkuStock> skuStockList;
}
