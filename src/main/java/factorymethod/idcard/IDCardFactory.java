package factorymethod.idcard;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "를 등록했습니다.");
    }
}
