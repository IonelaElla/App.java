package ro.siit.gad.session8;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.UUID;

public class UserInfo implements Serializable {
    private static final long serialVersionUID = 2733751412263376293L;

    private UUID userId;
    private String username;
    private transient String password;
    private String cardNumber;
    private transient String cvv;
    private transient String pin;

    public UserInfo(String username, String password, String cardNumber, String cvv, String pin) {
        this.userId = UUID.randomUUID();
        this.username = username;
        this.password = password;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("userId", userId)
                .append("username", username)
                .append("password", password)
                .append("cardNumber", cardNumber)
                .append("cvv", cvv)
                .append("pin", pin)
                .toString();
    }
}
