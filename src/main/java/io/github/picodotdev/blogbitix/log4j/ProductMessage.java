import org.apache.logging.log4j.message.Message;

public class ProductMessage implements Message {

    private Product product;

    public ProductMessage(Product product) {
        this.product = product;
    }

    public String getFormat() {
        return "Product(%d, %s, %s)";
    }


    public Object[] getParameters() {
        return new Object[] { product.getId(), product.getName(), product.getColor() };
    }


    public String getFormattedMessage() { return String.format(getFormat(), getParameters()); }


    public Throwable getThrowable() {
        return null;
    }
}
