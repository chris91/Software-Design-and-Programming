package adapter;

public class XpayToPayDAdapter implements PayD {
    private XpayImpl xpay;

    public XpayToPayDAdapter(Xpay xpay) {
        this.xpay = (XpayImpl) xpay;
    }

    @Override
    public String getCustCardNo() {
        return xpay.getCreditCardNo();
    }

    @Override
    public String getCardOwnerName() {
        return xpay.getCustomerName();
    }

    @Override
    public String getCardExpMonthDate() {
        return xpay.getCardExpMonth();
    }

    @Override
    public Integer getCVVNo() {
        return Integer.valueOf(xpay.getCardCVVNo());
    }

    @Override
    public Double getTotalAmount() {
        return xpay.getAmount();
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        this.xpay.setCardCVVNo(Short.valueOf(custCardNo));
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.xpay.setCustomerName(cardOwnerName);

    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.xpay.setCardExpMonth(cardExpMonthDate);
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        this.xpay.setCardCVVNo(Short.valueOf(String.valueOf(cVVNo)));
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.xpay.setAmount(totalAmount);
    }
}
