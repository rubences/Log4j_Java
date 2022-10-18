import org.apache.logging.log4j.message.Message;

public class SimpleProductMessage implements Message {

    private Product product;

    public SimpleProductMessage(Product product) {
        this.product = product;
    }

  
    public String getFormat() {
        return "Product(%d, %s)";
    }


    public Object[] getParameters() {
        return new Object[] { product.getId(), product.getName() };
    }


    public String getFormattedMessage() {
        return String.format(getFormat(), getParameters());
    }


    public Throwable getThrowable() {
        return null;
    }
}
