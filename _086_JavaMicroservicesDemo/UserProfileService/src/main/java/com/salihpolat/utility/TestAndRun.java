package com.salihpolat.utility;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

// Bu Kısım Eğer Kullanılacak İse Kullanıldıktan Sonra Bu Kısımı Yorum Satırına Almak Mantıklı Olacaktır.
@Component
@RequiredArgsConstructor
public class TestAndRun {
/*
    private final UserProfileService userProfileService;

    private final IElasticServiceManager elasticServiceManager;

    @PostConstruct
    // Constructor Metod Çalıştıktan Sonra Çalışması İstenen Kodlar Bu Anotation İle İşaretlenmiş Metodun İçine Yazılır.
    public void init() { // initialize (Başlatma)

        new Thread(() -> {
            getUserProfileInfo();
        }).start();

        // new Thread(this::getUserProfileInfo).start();
    }

    private void getUserProfileInfo() {

        List<UserProfile> userProfileList = userProfileService.findAll(); // Tüm userprofile datalarını Bir Liste Aktardık.

        userProfileList.forEach(elasticServiceManager::addUser); // Eski Verileri Postgre’den Elastic’e Teker Teker Aktarma

//        userProfileList.forEach(x->{
//                      elasticServiceManager.addUser(x);
//        });
    }
*/
}