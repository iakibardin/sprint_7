package model.courier;

import lombok.*;
import model.courier.Courier;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class CourierForAuthWithoutPassword {
    private String login;

    public CourierForAuthWithoutPassword(Courier courier) {
        this.login = courier.getLogin();
    }
}