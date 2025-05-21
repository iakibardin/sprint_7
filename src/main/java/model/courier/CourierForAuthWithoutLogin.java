package model.courier;

import lombok.*;
import model.courier.Courier;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class CourierForAuthWithoutLogin {
    private String password;

    public CourierForAuthWithoutLogin(Courier courier) {
        this.password = courier.getPassword();
    }
}