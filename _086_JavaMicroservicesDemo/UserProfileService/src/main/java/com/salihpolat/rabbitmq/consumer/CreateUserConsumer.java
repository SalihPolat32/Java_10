package com.salihpolat.rabbitmq.consumer;

import com.salihpolat.rabbitmq.model.SaveAuthModel;
import com.salihpolat.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserConsumer {

    private final UserProfileService userProfileService;

    @RabbitListener(queues = "queue-auth")
    public void createFromQueue(SaveAuthModel model) {

        userProfileService.saveRabbit(model);

/*
        userProfileService.save(
                UserProfile.builder()
                        .authid(model.getAuthid())
                        .username(model.getUsername())
                        .email(model.getEmail())
                        .build()
        );
*/
    }
}