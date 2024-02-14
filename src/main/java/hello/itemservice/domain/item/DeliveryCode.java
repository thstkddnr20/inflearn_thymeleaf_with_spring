package hello.itemservice.domain.item;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * FAST : 빠른배송
 * NORMAL : 일반배송
 * SLOW : 느린배송
 */
@Data
@RequiredArgsConstructor
public class DeliveryCode {

    private String code;
    private String displayName;
}
