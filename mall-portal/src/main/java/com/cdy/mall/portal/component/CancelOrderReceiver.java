package com.cdy.mall.portal.component;

import com.cdy.mall.portal.domian.QueueEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author CDY
 */
@Component
@RabbitListener(queues ="mall.order.cancel")
@Slf4j
public class CancelOrderReceiver {

}
