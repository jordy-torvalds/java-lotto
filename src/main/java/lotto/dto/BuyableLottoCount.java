package lotto.dto;

import static lotto.domain.LottoPrice.LOTTO_PRICE;

public class BuyableLottoCount {

    private int value;


    private BuyableLottoCount(int value) {
        this.value = value;
    }

    public boolean isHigher(int comparingValue) {
        return value > comparingValue;
    }

    public static BuyableLottoCount calculateBuyableCount(PurchaseMoney purchaseMoney) {
        int result = purchaseMoney.getValue() / LOTTO_PRICE;
        return new BuyableLottoCount(result);
    }
}
